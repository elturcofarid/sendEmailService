package com.util.email.postmark.dto;


public class Metadata{
    public String tag;
    public String value;
	
    public Metadata() {
		super();
	}
    
    public Metadata(String tag, String value) {
		super();
		this.tag = tag;
		this.value = value;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


}