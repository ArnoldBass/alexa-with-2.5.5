package com.learn.alexa.alexabutt.servlet;

import java.util.ArrayList;
import java.util.List;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.servlet.SkillServlet;
import com.learn.alexa.alexabutt.handlers.CancelandStopIntentHandler;
import com.learn.alexa.alexabutt.handlers.FallbackIntentHandler;
import com.learn.alexa.alexabutt.handlers.HelpIntentHandler;
import com.learn.alexa.alexabutt.handlers.LaunchRequestHandler;
import com.learn.alexa.alexabutt.handlers.SessionEndedRequest;


public class AlexaServlet extends SkillServlet{

	private static final long serialVersionUID = 1L;
	public AlexaServlet() {
		super(getSkill());
	}
	private static Skill getSkill() {
		List<RequestHandler> handlers = new ArrayList<RequestHandler>();
		handlers.add(new CancelandStopIntentHandler());
		handlers.add(new FallbackIntentHandler());
		handlers.add(new HelpIntentHandler());
		handlers.add(new LaunchRequestHandler());
		handlers.add(new SessionEndedRequest());
		return Skills.standard().addRequestHandlers(handlers).build();
	}
	
	

}
