package com.simplon.java;

class Outil {
	private String name;
	private String description;
	private String useCase;
	private String storage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUseCase() {
		return useCase;
	}
	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	Outil(String name, String description, String useCase, String storage) {
		this.name = name;
		this.description = description;
		this.useCase = useCase;
		this.storage = storage;
	}
	
	Outil(Outil a) {
		name = a.name;
		description = a.description;
		useCase = a.useCase;
		storage = a.storage;
	}
	
}