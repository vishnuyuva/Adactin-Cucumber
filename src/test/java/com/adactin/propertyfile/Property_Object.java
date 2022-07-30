package com.adactin.propertyfile;

public class Property_Object {
	private Property_Object() {
		}
	public static Property_Object InstancePO() {
		Property_Object data=new Property_Object();
		return data;
	}
	public Property_Class InstancePC() throws Throwable {
		Property_Class pc=new Property_Class();
		return pc;
	}

}
