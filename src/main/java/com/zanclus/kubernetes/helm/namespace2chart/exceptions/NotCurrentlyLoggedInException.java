package com.zanclus.kubernetes.helm.namespace2chart.exceptions;

public class NotCurrentlyLoggedInException extends Throwable {

	public NotCurrentlyLoggedInException(String message) {
		super(message);
	}

	public NotCurrentlyLoggedInException(String message, Throwable t) {
		super(message, t);
	}
}
