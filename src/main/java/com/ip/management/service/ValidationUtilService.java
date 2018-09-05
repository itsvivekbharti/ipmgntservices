package com.ip.management.service;

import java.util.regex.Pattern;

/**
 * Validation Utility class
 * @author Vivek
 *
 */
public class ValidationUtilService {
	
	private static final Pattern PATTERN = Pattern.compile(
	        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

	public static boolean validateIP(final String ip) {
	    return PATTERN.matcher(ip).matches();
	}
}
