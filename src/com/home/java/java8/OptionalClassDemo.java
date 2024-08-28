/**
 * 
 */
package com.home.java.java8;

import java.util.Optional;

/**
 * @author admin
 *
 */
public class OptionalClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// case 1: Optional is having null as underlying value
	      Optional<Integer> valueOptional = Optional.ofNullable(null);

	      // case 2:  Optional is having not null as underlying value
	      Optional<Integer> valueOptional1 = Optional.ofNullable(Integer.valueOf(10));

	      // orElse will return -1 being default value
	      Integer value = valueOptional.orElse(Integer.valueOf(-1));

	      System.out.println(value);

	      //  orElse will return the underlying value
	      Integer value1 = valueOptional1.orElse(Integer.valueOf(-1));

	      System.out.println(value1);

	}

}
