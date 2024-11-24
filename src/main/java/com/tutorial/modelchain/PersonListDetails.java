package com.tutorial.modelchain;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;

public class PersonListDetails extends WebPage {
	private Form form;
	private DropDownChoice<Person> personsList;
	
	public PersonListDetails(){
		Model<Person> listModel = new Model<Person>();
		ChoiceRenderer<Person> personRender = new ChoiceRenderer<Person>(){
			@Override
			public Object getDisplayValue(Person person) {
				return person.getName() + " " + person.getSurname();
			}
		};
		
		personsList = new DropDownChoice<Person>("persons", listModel, personsPojo(),personRender);
		personsList.add(new FormComponentUpdatingBehavior());
				
		add(personsList);		
		
		form = new Form("form", new CompoundPropertyModel<Person>(listModel));		
		form.add(new TextField("name"));
		form.add(new TextField("surname"));
		form.add(new TextField("address"));
		form.add(new TextField("email"));
		
		add(form);
	}
	
	private static List<Person> personsPojo() {
		List<Person> persons = new ArrayList<Person>();
		Person person = new Person("John", "Smith");
		
		person.setAddress("Corner street");
		person.setEmail("john.smith@gmail.com");
		persons.add(person);
		
		person = new Person("Jill", "Smith");
		
		person.setAddress("Main street");
		person.setEmail("jill.smith@gmail.com");
		
		persons.add(person);
		
		person = new Person("Tim", "Spencer");
		
		person.setAddress("Second street");
		person.setEmail("tim.spencer@gmail.com");
		
		persons.add(person);
		
		return persons;
	}
}
