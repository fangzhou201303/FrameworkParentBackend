package com.msclub.base.exception;

import org.springframework.http.HttpStatus;

import com.msclub.base.model.ErrorCode;

public class DataNotFoundException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1572547230485615488L;


	public DataNotFoundException(ErrorCode errorCode){
		super(errorCode.getCode(), errorCode.getMessage(), errorCode.getHttpStatus(), errorCode.getIssueType(), null);
	}

	public DataNotFoundException(ErrorCode errorCode, Throwable cause){
		super(errorCode.getCode(), errorCode.getMessage(), errorCode.getHttpStatus(), errorCode.getIssueType(), cause);
	}

	@Override
	public HttpStatus getDefaultHttpStatus() {
		return HttpStatus.NOT_FOUND;
	}

}
