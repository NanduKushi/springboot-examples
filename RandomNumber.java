package com.lti;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random =new Random();
random.ints(0, 100).limit(10).sorted().forEach(System.out::println);
	}

}
