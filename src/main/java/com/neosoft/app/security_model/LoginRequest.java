package com.neosoft.app.security_model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest implements Serializable {
	private String username;
	private String password;

	public String getUsername() {
		return username;

	}
}