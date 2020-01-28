package com.revature.infra.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // can specify name in annotation argument
@Scope("prototype")
public class ComponentCabin extends Residence {
	
	//@Inject from JSR 330 
	//@Qualifier lets us specify bean name if there are multiple beans of class Well
	//@Inject is the framework-agnostic options; @Autowired is Spring-specific
	@Autowired
	private Well well;

	public Well getWell() {
		return well;
	}
	
	public void setWell(Well well) {
		this.well = well;
	}

	public void checkStatus() {
		System.out.println("Here's the state of things in: " + this.getName());
		if (this.well == null) {
			System.out.println("No well is associated with this Residence");
		} else if (this.well.hasResource()) {
			System.out.println("This Residence is receiving " + this.well.getResource());
		} else {
			System.out.println("A well exists but doesn't contain water");
		}
	}

}
