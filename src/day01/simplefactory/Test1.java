package day01.simplefactory;

import java.text.DateFormat;

import jdbc.JdbcUtil;

public class Test1 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		JdbcUtil.getConn();
		
		//Apple apple = new Apple();//控制不反转
		//Fruit fruit = FruitFactory.getInstance("apple");
		Fruit fruit = FruitFactory.getInstance();
		fruit.grow();
		
	}

}
