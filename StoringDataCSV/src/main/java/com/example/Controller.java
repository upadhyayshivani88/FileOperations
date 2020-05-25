package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CovidService;

@RestController
public class Controller {
	
	
@Autowired
private CovidService cs ;

@PostMapping(path="/feedCovidData")
public void setDatainDB() {
	cs.saveCovidData();
}



}
