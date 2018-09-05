package com.ip.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ip.management.service.IPService;
import com.ip.management.service.ValidationUtilService;

@RestController
public class IPController {
	
	@Autowired
	IPService ipService;
	
	@PostMapping("checkIP")
	public boolean checkIP(@RequestBody(required = true) final String ipAddress) {
		if(!ValidationUtilService.validateIP(ipAddress))
			return false;
		return ipService.checkIP(ipAddress);
	}
	
	@PutMapping("addIPToBlackList")
	public boolean addIPToBlackList(@RequestBody(required = true) final String ipAddress) {
		if(!ValidationUtilService.validateIP(ipAddress))
			return false;
		 return ipService.addIPToBlackList(ipAddress);
	}
	
	@DeleteMapping("removeIPFromBlackList")
	public boolean removeIPFromBlackList(@RequestBody(required = true) final String ipAddress) {
		if(!ValidationUtilService.validateIP(ipAddress))
			return false;
		 return ipService.removeIPFromBlackList(ipAddress);
	}
	
	@GetMapping("getBlackList")
	public Object getBlackList() {
		
		return ipService.getBlackList();
	}
	
	
}
