package com.interfell.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interfell.models.Period;
import com.interfell.requests.TimeRequest;

@RestController
@RequestMapping("/period")
public class TimeController {
	@PostMapping("/calculate")
	ResponseEntity<JsonNode> student(@RequestBody TimeRequest timeRequest) throws JsonMappingException, JsonProcessingException {

		int hours = timeRequest.getHours();
		int minutes = timeRequest.getMinutes();
		int seconds = timeRequest.getSeconds();
		Period period = new Period(hours, minutes, seconds);

		int aditionalHours = timeRequest.dato2;
		period.addHours(aditionalHours);
		
		String time = period.toString(); 
		String timezone = "utc";
		
		ObjectMapper mapper = new ObjectMapper();
	    JsonNode json = mapper.readTree("{\"response\": {\"time\": \""+time+"\", \"timezone\": \""+timezone+"\"}}");

		return ResponseEntity.ok(json);
	}
}