package com.helloworld.tutorial;
import com.tutorial.linktopage.*;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage{
	public HomePage() {
        add(new Label("message", "Hello Wicket!"));
        
        add(new Link<Void>("anotherPage"){

			@Override
			public void onClick() {
				setResponsePage(AnotherPage.class);
			}
			
		});
    }
}
