package com.youyisky.dto;

import java.io.Serializable;

public class ResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5649200273944192802L;
	private String code;
	private boolean result;

	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
