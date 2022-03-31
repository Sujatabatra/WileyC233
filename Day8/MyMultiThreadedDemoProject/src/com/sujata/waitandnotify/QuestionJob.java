package com.sujata.waitandnotify;

public class QuestionJob implements Runnable {

	private Chat chat;
	private String questions[]= {"Hello","How are you?","Sounds Great!"};
	
	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}
	
	@Override
	public void run() {
		for(String question:questions) {
			chat.question(question);
		}

	}

}
