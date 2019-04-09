package com.test.inventory.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryResource {

	
	@RequestMapping(value="hello")
	public String getmessage() {
		return "Hello";
	}
}
