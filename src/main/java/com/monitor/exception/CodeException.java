package com.monitor.exception;

/**
 * 
 * @Description 自定义异常
 * @Author clsu
 * @Date 2014-2-26 上午10:26:50 
 * @CodeReviewer zwwang
 */
public class CodeException extends Exception {
	private static final long serialVersionUID = 8724252889850188629L;


	private String code;

	public CodeException(String code) {
		super();
		this.code = code;
	}

	public CodeException(String code, String message) {
		super(message);
		this.code = code;
	}

	public CodeException(String code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public CodeException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.code = errorCode;
	}

	public String getCode() {
		return code;
	}

}
