package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	@GetMapping("/artman")
	public String artman(@RequestParam(value="name", defaultValue="ARTMAN") String name ) {
		return String.format("Hi~~ %s", name);
	}
}
