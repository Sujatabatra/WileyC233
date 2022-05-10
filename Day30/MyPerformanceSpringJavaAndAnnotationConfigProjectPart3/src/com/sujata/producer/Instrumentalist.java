package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Himanshu")
public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	
	public Instrumentalist(@Autowired @Qualifier("drum") Instrument instrument) {
		super();
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
