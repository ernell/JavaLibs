/*
 * Copyright (C) 2016 Robert Andersson <http://www.ernell.se>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.ernell.utils;

/**
 * Manipulation of byte array
 * 
 * @author rob@ernell.se
 * @version 2015.12
 * 
 */
public class ByteArrayUtils {

	/**
	 * Clean a byte array from a specific char. The array is resized and
	 * returned.
	 * 
	 */
	public static byte[] cleanChar(byte[] pArray, char pChar) {
		byte[] result_array;
		int charCounter = 0;

		// first count occurences of pChar
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i] == pChar) {
				charCounter++;
			}
		}

		// if no hits were found, there is nothing more to do, return original
		// array
		if (charCounter == 0) {
			return pArray;
		}

		// create new array (resized)
		result_array = new byte[pArray.length - charCounter];

		// copy the array (except for the found pChar's), store into result
		// array
		int k = 0;
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i] != pChar) {
				result_array[k++] = pArray[i];
			}
		}

		return result_array;
	}

	/** Byte array left shift */
	public static byte[] shl(byte[] pArray, int pShifts) {

		// error checks
		if (pShifts <= 0)
			return pArray;
		if (pArray.length < pShifts)
			return pArray;

		// new size of array, the tail of the array is cut off
		byte[] result_array = new byte[pArray.length - pShifts];

		// shift data to the left
		System.arraycopy(pArray, pShifts, result_array, 0, result_array.length);

		return result_array;
	}

}
