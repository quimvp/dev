package com.java.components.util;

import java.util.*;

import com.java.components.lang.CompilerTaskException;

public class Array<T> {
	private T[] values;
	private int max;
	private int min;

	@SafeVarargs
	public Array(int minmax, boolean is, T... values) {
		if(is) {
			this.max = minmax;
			if(values.length > max) 
				throw new CompilerTaskException("The dimensions are axceeding the established limi of the maximum");
		} else {
			this.min = minmax;
			if(values.length < min) 
				throw new CompilerTaskException("The dimensions are axceeding the established limi of the manimum");
		}
		this.values = values;
	}

	@SafeVarargs
	public Array(int min, int max, T... values) {
		this.min = min;
		this.max = max;
		if(max != -1 && values.length > max) 
			throw new CompilerTaskException("The dimensions are axceeding the established limi of the maximum");
		else if(min != -1 && values.length < min) 
			throw new CompilerTaskException("The dimensions are axceeding the established limi of the manimum");
		this.values = values;
	}

	@SafeVarargs
	public Array(T... values) { this(-1, -1, values); }

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Array<?> other = (Array<?>) obj;
		if(length() != other.length())
			return false;
		for(int i = 0; i < length(); i++)
			if(!values[i].equals(other.values[i]))
				return false;
		return true;
	}

	public boolean contains(T value) {
		for(int i = 0; i < length(); i++)
			if(values[i].equals(value))
				return true;
		return false;
	}

	public T get(int index) {
		return values[index];
	}

	public Array<T> replace(int index, T newValue) {
		values[index] = newValue;
		return this;
	}

	public Array<T> popLast() {
		return delete(length() - 1);
	}

	public Array<T> popFirst() {
		return delete(0);
	}

	public Array<T> delete(int index) {
		if(values.length < min && min != -1) 
			throw new CompilerTaskException("The dimensions are axceeding the established limi of the manimum");
		Object[] newValues = new Object[length() - 1];
		for(int i = 0; i < index; i++)
			newValues[i] = values[i];
		for(int i = index + 1; i < length(); i++)
			newValues[i - 1] = values[i];
		values = (T[]) newValues;
		return this;
	}

	public Array<T> addLast(T value) {
		return insert(length(), value);
	}

	public Array<T> addFirst(T value) {
		return insert(0, value);
	}

	public Array<T> insert(int index, T value) {
		if(values.length > max && max != -1)
			throw new CompilerTaskException("The dimensions are axceeding the established limi of the maximum");
		Object[] newValues = new Object[length() + 1];
		for(int i = 0; i < index; i++)
			newValues[i] = values[i];
		newValues[index] = value;
		for(int i = index; i < length(); i++)
			newValues[i + 1] = values[i];
		values = (T[]) newValues;
		return this;
	}

	public ArrayList<T> toList() {
		ArrayList<T> result = new ArrayList<>();
		for(T value : values)
			result.add(value);
		return result;
	}

	public HashMap<Integer, T> toHashMap() {
		HashMap<Integer, T> map = new HashMap<>();
		for(int i = 0; i < length(); i++)
			map.put(i, values[i]);
		return map;
	}

	public T[] getArray() { return values; }

	public int length() { return values.length; }

	public int size() { return length(); }
}
