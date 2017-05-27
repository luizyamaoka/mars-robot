package br.com.contaazul.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RobotController.class)
@WebAppConfiguration
public class RobotControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void sendCommandMMRMMRMM() throws Exception {
		mockMvc.perform(post("/rest/mars/MMRMMRMM"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", is("(2, 0, S)")));
	}
	
	@Test
	public void sendCommandMML() throws Exception {
		mockMvc.perform(post("/rest/mars/MML"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", is("(0, 2, W)")));
	}
	
	@Test
	public void sendCommandMMLTwice() throws Exception {
		mockMvc.perform(post("/rest/mars/MML"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", is("(0, 2, W)")));
		
		mockMvc.perform(post("/rest/mars/MML"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", is("(0, 2, W)")));
	}
	
	@Test
	public void sendInvalidCommand() throws Exception {
		mockMvc.perform(post("/rest/mars/AAA"))
		.andExpect(status().isBadRequest());
	}
	
	@Test
	public void sendRobotOutOfBounds() throws Exception {
		mockMvc.perform(post("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM"))
		.andExpect(status().isBadRequest());
	}
	
}
