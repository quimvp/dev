package com.example.code;

import java.util.*;

import com.java.components.util.Array;

import static com.java.components.Prints.*;

public class App {
	public static void main(String[] args) {
		Array<String> array = new Array<>(0, -1, new String[] {"1", "2", "4"});
		array.insert(2, "3");
		println(Arrays.toString(array.getArray()));
		println(array.toHashMap());
	}
}
