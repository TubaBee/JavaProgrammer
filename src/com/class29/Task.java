package com.class29;
/*Create a class File that will have the following behaviors: 
 * open, edit, close. Edit and close are implemented method 
 * while open is an abstract. Create 3 subclasses: JavaFile, WordFile,
 *  PDFFile that will provide specific implementation of open behaviour: 
 *  Example: to open .java file we need notepad++ or sublime text, 
 *  to open .doc file we need Microsoft word to be installed etc  */

public abstract class Task {

	abstract void open();
	
	void edit() {
		System.out.println("Edit the program");
	}
	void close() {
		System.out.println("Close the program");
	}
	
	
}

class JavaFile extends Task{

	@Override
	void open() {
		System.out.println("We need notepad++ or sublime text");
		
	}
	
}

class WordFile extends Task{

	@Override
	void open() {
		System.out.println("We need Microsoft word");
	}
	
}

class PDFFile extends Task{

	@Override
	void open() {
		System.out.println("We need to Adobe Acrobat reader for .pdf ");
		
	}
	
}
