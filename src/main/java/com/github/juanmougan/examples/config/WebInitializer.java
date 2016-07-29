/**
 * 
 */
package com.github.juanmougan.examples.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.github.juanmougan.examples.Application;

/**
 * @author juanma
 *
 */
public class WebInitializer extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
