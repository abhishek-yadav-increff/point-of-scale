package com.increff.pos.controller;

import com.increff.pos.model.UserData;
import com.increff.pos.model.UserForm;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ApiController
 */
@Api
@RestController
public class ApiController {
    @ApiOperation(value = "say hello")
    @RequestMapping(path = "/api/say-hello", method = RequestMethod.GET)
    public String sayHello() {
        return "hellow world";
    }

    @ApiOperation(value = "sayhello")
    @RequestMapping(path = "/api/form-hello", method = RequestMethod.POST)
    public UserData form(@RequestBody UserForm userform) {
        UserData data = new UserData();
        data.setName(userform.getName());
        data.setMessage("hello world");
        return data;
    }

}
