package doProject;

import java.util.stream.IntStream;

public class jvFile {
	
	/**
	 * Don't forget to push to GitLab
	 */
	
	public static void main(String[] args) {
		System.out.println("Hi everyone !!!");
		
		IntStream
		  .range(1, 10)
		  .skip(3)
		  .forEach(System.out::println);
		
	}

}
