package com.product.demo.model;

import org.springframework.http.HttpStatus;

public class Response {

	public HttpStatus status;

	public Object body;

	public Response(HttpStatus status, Object body) {
		super();
		this.status = status;
		this.body = body;
	}

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * @return the body
	 */
	public Object getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(Object body) {
		this.body = body;
	}

}
