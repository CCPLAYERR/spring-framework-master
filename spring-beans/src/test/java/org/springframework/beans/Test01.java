package org.springframework.beans;

import org.springframework.stereotype.Component;

@Component("test01")
public class Test01 {
	private String name = "lailiangfeng";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
