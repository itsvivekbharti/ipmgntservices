package com.ip.management.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * Service class for ip management
 * @author Vivek
 *
 */
@Service
public class IPService {
	
	//TODO: This should be synchronized as it will be accessed by different requests
	static Set<String> blackListIPAddressSet = new HashSet<String>();

	/**
	 * Checks if the ip provided is black listed or not
	 * @param ipAddress
	 * @return
	 */
	public boolean checkIP(String ipAddress) {
		if(blackListIPAddressSet.contains(ipAddress)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Adds the ip to the black list set
	 * @param ipAddress
	 */
	public boolean addIPToBlackList(String ipAddress) {
		 return blackListIPAddressSet.add(ipAddress);
	}
	
	/**
	 * Removes Ip from black list
	 * @param ipAddress
	 */
	public boolean removeIPFromBlackList(String ipAddress) {
		 return blackListIPAddressSet.remove(ipAddress);
	}
	
	public Set<String> getBlackList() {
		return blackListIPAddressSet;
	}
}
