package com.sudhir.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer_SgtPeppers implements CompactDisc {

	private CompactDisc cd;
	
	@Autowired
	public CdPlayer_SgtPeppers(CompactDisc cd) {
		this.cd = cd;
	}


	@Override
	public void play() {
		System.out.println("Playin a song...");
	}

}
