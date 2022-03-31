package com.sujata.waitandnotify;

public class AnswerJob implements Runnable {

	private Chat chat;
	private String answers[]= {"Hi","I am Doing Good","Thanks!"};
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}
	
	@Override
	public void run() {
		for(String answer:answers) {
			chat.answer(answer);
		}

	}

}
