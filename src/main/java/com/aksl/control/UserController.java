package com.aksl.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aksl.entity.system.User;

@Controller
@RequestMapping("api/user")
public class UserController {
	@RequestMapping(value="/add",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public User addUser(@RequestBody User user){
		return user;
	}
	@RequestMapping(value="/get/{id:\\d+}",method=RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public User getById(@PathVariable("id") Integer userId){
		return new User();
	}

	@RequestMapping(value = "/list", method = RequestMethod.PATCH)
	public @ResponseBody List<User> listPerson() {
		return new ArrayList<User>();
	}
}
