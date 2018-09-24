package com.learn.alexa.alexabutt.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(com.amazon.ask.model.LaunchRequest.class));
	}

	public Optional<Response> handle(HandlerInput input) {
		return input.getResponseBuilder().build();
	}

}
