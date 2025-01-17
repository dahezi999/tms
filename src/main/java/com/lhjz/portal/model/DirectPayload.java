package com.lhjz.portal.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DirectPayload {
	
	private String uuid;

	private Cmd cmd;

	private Long id;

	private String username;

	public enum Cmd {
		R, C, U, D;
	}
}
