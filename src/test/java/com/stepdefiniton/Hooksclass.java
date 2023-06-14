package com.stepdefiniton;

import java.io.IOException;

import Base.com.Baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends Baseclass {
	@Before(order=1)
     private void precondition() {
		launchBrowser();
	}@Before(order=2)
     private void precondition1() {
 		windowMacimize();
 	}@Before(order=3)
     private void precondition2() throws InterruptedException {
 		Thread.sleep(1000);
 	}@After(order=3)
     private void postcondition() throws InterruptedException {
    	 Thread.sleep(1000);
 	}@After(order=2)
     private void postcondition1() throws IOException {
 		screenShot("ash");
 	}@After(order=1)
     private void postcondition2() {
 		closeEntireBrowser();
 	}
}
