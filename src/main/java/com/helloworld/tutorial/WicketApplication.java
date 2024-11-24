package com.helloworld.tutorial;

import org.apache.wicket.protocol.http.WebApplication;

import com.tutorial.modelchain.*;

public class WicketApplication extends WebApplication{
	@Override
    public Class<PersonListDetails> getHomePage() {
       // return HomePage.class; // Set the home page
		 return PersonListDetails.class;
    }

    @Override
    public void init() {
        super.init();
        // Additional initialization if required
    }
}
