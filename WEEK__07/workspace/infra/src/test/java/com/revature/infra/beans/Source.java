package com.revature.infra.beans;

public abstract class Source {

	/**
	 * A resource provided by this source, i.e. water
	 */
	private String resource;
	
	public Boolean hasResource() {
		if (resource != null) {
			return (resource.length() > 0);
		} else {
			return false;
		}
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

}
