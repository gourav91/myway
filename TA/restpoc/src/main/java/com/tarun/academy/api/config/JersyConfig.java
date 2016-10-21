package com.tarun.academy.api.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.tarun.academy.rest.StudentRS;

/**
 * register jax-rs classes
 * 
 * 
 * @author e01155
 *
 */
@Configuration
public class JersyConfig extends ResourceConfig {
	/**
	 * 
	 */
	public JersyConfig() {
		register(StudentRS.class);
	}
}