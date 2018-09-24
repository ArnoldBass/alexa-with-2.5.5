package com.learn.alexa.alexabutt.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class HelpIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.HelpIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "You can say hello to me!";
		return input.getResponseBuilder()
				.withSpeech(speechText).withReprompt(speechText)
				.build();
	}

}
