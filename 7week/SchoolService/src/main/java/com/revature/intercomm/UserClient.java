package com.revature.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.models.User;


@FeignClient(name = "user-service", fallback = UserClientFallback.class)
public interface UserClient {
	//method names need to mirror the endpoints in the other service's controller
	@GetMapping("users")
	public User getUser();

}
