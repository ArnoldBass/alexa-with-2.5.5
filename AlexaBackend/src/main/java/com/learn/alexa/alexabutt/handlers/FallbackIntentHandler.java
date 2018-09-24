package com.learn.alexa.alexabutt.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class FallbackIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.FallBackIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText ="Sorry, I don't know that. You can try saying Help!";
		return input.getResponseBuilder().
				withSpeech(speechText).withReprompt(speechText).
				build();
	}

}
