package com.sudhir.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerConfig.class)
public class CdPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	
	public CdPlayerTest(CompactDisc cd) {
		this.cd = cd;
	}


	@Test
	public void CdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
}
