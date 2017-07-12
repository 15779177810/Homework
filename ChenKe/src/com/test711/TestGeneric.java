package com.test711;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
public class TestGeneric {
	public static void main (String[]args){
		Person p=new Person();
		p.show();	
		}
	}

@Target({METHOD})
@Retention(RetentionPolicy.SOURCE)
	@interface MyTiger{
		String value();
	}


	class Person{
		@MyTiger(value="¹þ¹þ")
		public void show(){
	}
	}


