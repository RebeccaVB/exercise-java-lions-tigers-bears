package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	private String[] elements;
	private int curIndex;

	public OhMyIterator(String[] elements) {
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
	return curIndex<elements.length;
	}
	
	

	@Override
	public String next() {
		if(!hasNext()){
			throw new NoSuchElementException();
	}
		String currentVal = elements[curIndex];
		curIndex++;
		return currentVal;
	}
}
