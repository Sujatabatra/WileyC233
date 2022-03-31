package com.sujata.waitandnotify;

public class MainChatClass {

	public static void main(String[] args) {
		Chat chat=new Chat();
		
		Thread sriHari=new Thread(new QuestionJob(chat),"SriHari");
		Thread harshit=new Thread(new AnswerJob(chat),"Harshit");
		
		sriHari.start();
		harshit.start();

	}

}
