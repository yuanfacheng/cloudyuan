package com.yuan.nightrain.entities;

import java.io.Serializable;

import lombok.Data;

/**
 * @auther yuan
 * @create 2023-02-18 17:22
 */
@Data
public class Payment implements Serializable {
	private Long id;

	private String serial;

	public Payment(Long id, String serial) {
		this.id = id;
		this.serial = serial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
}
