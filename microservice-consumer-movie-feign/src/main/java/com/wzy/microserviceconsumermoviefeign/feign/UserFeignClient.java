package com.wzy.microserviceconsumermoviefeign.feign;

import com.wzy.microserviceconsumermoviefeign.Configuration.configuration1;
import com.wzy.microserviceconsumermoviefeign.Entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="microservice-provider-user" ,configuration = configuration1.class)
public interface UserFeignClient {

    @RequestMapping(value = "simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id")Long id);

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User postUser(@RequestBody User user);
}
