/*
 * Copyright (C) 2012 Robert Andersson <http://www.ernell.se>
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

import java.util.Arrays;

import android.os.Environment;

public class WordUtilities {

	/**
	 * Anagram/Subanagram checker for char[] Find out if the dictionary word is
	 * writable with the supplied letters + blanks
	 * 
	 * @author rob@ernell.se
	 * 
	 * @param char[]
	 *            dictionaryWord : The word from a dictionary to compare to
	 * @param int
	 *            dwlen : The length of the dictionary word
	 * @param char[]
	 *            letters : array containing the letters in the rack
	 * @param int
	 *            blanks : the number of blanks in the rack
	 */
	public static boolean isAnagram(char[] dictionaryWord, int dwlen, char[] letters, int blanks) {

		// If the dictionary word is shorter than the number of blanks = match
		if (dwlen <= blanks)
			return true;
		// If dictionaryword length > letters total length = no match
		int len = letters.length;
		int wlen = len + blanks;
		if (dwlen > wlen)
			return false;

		int i = 0;// for loops
		int j = 0;// for loops
		char d; // char from dictionary word
		char l; // char from letters

		// copy of dictionary word
		char[] dict = new char[dwlen];
		for (; i < dwlen; i++)
			dict[i] = dictionaryWord[i];

		// tlen : letters remaining in dict[]
		int tlen = dwlen;// set initial length to tlen
		tlen -= blanks; // remove the number of blanks from length (could be
		// negative value)

		// Subtract letters to find anagram (tlen <= 0)
		for (i = 0; i < len; i++) { // letters[i]

			if (tlen <= 0)// match. all letters from dictword are matched
				return true;

			dictloop: for (j = 0; j < dwlen; j++) { // dict[i]

				l = letters[i]; // pick char from letters
				d = dict[j]; // pick char from dictionary word

				if (l == d) {
					dict[j] = '\u0020'; // 'clear' the found character with a
					// space
					tlen--; // one less character in dict[0]
					break dictloop; // quit this loop
				}

			}

		}

		if (tlen == 0)
			return true;
		if (blanks == 0)
			return false;

		return false;

	}

	/**
	 * Anagram/Subanagram checker for StringBuilder/String
	 * 
	 * @param dictionaryWord
	 * @param letters
	 * @param blanks
	 * @return
	 * 
	 * @author rob@ernell.se
	 */
	public static boolean isAnagram(StringBuilder dictionaryWord, String letters, int blanks) {

		int pos;
		int ilen;
		char c;
		char r;

		// If the dictionary word is shorter than the number of blanks, then we
		// have a (sub)anagram
		int dlen = dictionaryWord.length();
		if (dlen <= blanks)
			return true;
		// If dictionaryword is too long, then we do not have a (sub)anagram
		int len = letters.length();
		int wlen = len + blanks;
		if (wlen < dlen)
			return false;

		StringBuilder tmp = new StringBuilder(dictionaryWord);

		int tlen = 0;
		// Subtract letters to find anagram
		for (int i = 0; i < len; i++) {
			tlen = tmp.length();
			if (tlen == 0) {
				return true;// we have an (sub)anagram
			} else {
				pos = 0;
				for (; pos < tlen; pos++) {
					c = tmp.charAt(pos);
					r = letters.charAt(i);
					if (r == c) {
						tmp.replace(pos, pos + 1, "");
						break;
					}

				}

			}

		}

		tlen = tmp.length();
		if (tlen == 0)
			return true;
		if (tlen == blanks)
			return true;
		if (blanks == 0)
			return false;

		return false;

	}

	/**
	 * Read last line of file
	 * 
	 * @param fileName
	 * @return Last line as String or null
	 * 
	 */
	public String readLastLine(String fileName) {

		try {
			java.io.File file = new java.io.File(fileName);
			java.io.RandomAccessFile fileHandler = new java.io.RandomAccessFile(file, "r");
			long fileLength = file.length() - 1;
			StringBuilder sb = new StringBuilder();

			for (long filePointer = fileLength; filePointer != -1; filePointer--) {
				fileHandler.seek(filePointer);
				int readByte = fileHandler.readByte();

				if (readByte == 0xA) {
					if (filePointer == fileLength) {
						continue;
					} else {
						break;
					}
				} else if (readByte == 0xD) {
					if (filePointer == fileLength - 1) {
						continue;
					} else {
						break;
					}
				}

				sb.append((char) readByte);
			}

			String lastLine = sb.reverse().toString();
			return lastLine;
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (java.io.IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static int countChar(String sourceString, char lookFor) {
		if (sourceString == null) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < sourceString.length(); i++) {
			final char c = sourceString.charAt(i);
			if (c == lookFor) {
				count++;
			}
		}
		return count;
	}

	public static String quickSort(String input) {
		char[] chars = input.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	/**
	 * Compares two char arrays for alphabetic ordering
	 * 
	 * >>> Experimental version <<<
	 * 
	 * @param lhs
	 *            char[]
	 * @param rhs
	 *            char[]
	 * @return integer -1 if lhs is less than rhs 0 if equal 1 if lhs is greater
	 *         than rhs
	 */
	public static int compare(char[] lhs, char[] rhs) {

		int lhsl = lhs.length;
		int rhsl = rhs.length;
		int pos = -1;

		int max = lhsl;
		if (lhsl > rhsl)
			max = rhsl;
		if (lhsl < rhsl)
			max = lhsl;

		char lhsc;
		char rhsc;

		for (; ++pos < max;) {
			lhsc = lhs[pos];
			rhsc = rhs[pos];
			if (lhsc < rhsc)
				return -1;
			if (lhsc > rhsc)
				return 1;

		} // end for
		if (pos == max) {
			if (lhsl < rhsl)
				return -1;
			if (lhsl > rhsl)
				return 1;
		}
		return 0;
	}// end compare(...)

	/**
	 * Replace character in String at index
	 * 
	 * @param in
	 * @param index
	 * @param findChar
	 * @param replaceChar
	 * @return
	 * 
	 * @author rob@ernell.se
	 */
	public static String replaceAtIndex(String in, int index, char findChar, CharSequence replaceChar) {

		StringBuilder input = new StringBuilder(in);

		// Find character
		int pos = 0;
		int len = input.length();
		char c;
		for (; pos < len; pos++) {
			c = input.charAt(pos);
			if (findChar == c) {
				input.replace(pos, pos + 1, (String) replaceChar);
				break;
			}
		}
		return input.toString();
	}

	/**
	 * Replace first character
	 * 
	 * @param in
	 * @param findChar
	 * @param replaceChar
	 * @return
	 * 
	 * @author rob@ernell.se
	 */
	public static String replaceFirst(String in, char findChar, CharSequence replaceChar) {

		StringBuilder input = new StringBuilder(in);
		char c = input.charAt(0);
		if (findChar == c)
			input.replace(0, 1, (String) replaceChar);
		return input.toString();

	}

	/**
	 * Replace last character
	 * 
	 * @param in
	 * @param findChar
	 * @param replaceChar
	 * @return
	 * 
	 * @author rob@ernell.se
	 */
	public static String replaceLast(String in, char findChar, CharSequence replaceChar) {

		StringBuilder input = new StringBuilder(in);
		int len = input.length();
		int pos = len - 1;
		char c = input.charAt(pos);
		if (findChar == c)
			input.replace(pos, pos + 1, (String) replaceChar);
		return input.toString();

	}

	public static StringBuilder removeFirst(StringBuilder input, char removeChar) {

		int pos = 0;
		int len = input.length();
		char c;
		for (; pos < len; pos++) {
			c = input.charAt(pos);
			if (removeChar == c) {
				input.replace(pos, pos + 1, "");
				break;
			}
		}
		return input;

	}

	public static String removeHTMLTags(String in) {
		in = in.replaceAll("<(?:\"[^\"]*\"[\'\"]*|\'[^\']*\'[\'\"]*|[^\'\">])+>", "");
		return in;
	}

	/**
	 * Optimized byte2char converter
	 * 
	 * @param input
	 * @param byteStart
	 * @param byteEnd
	 * @param output
	 * @param charStart
	 * @param charEnd
	 * @return
	 * 
	 * @author [unknown]
	 */
	public static int convert(byte input[], int byteStart, int byteEnd, char output[], int charStart, int charEnd) {// throws
																													// Exception{

		// Set the maximum index of the input array to wind to
		int max = byteEnd;
		// boolean throwException = false;
		if (byteEnd - byteStart > charEnd - charStart) {
			// If the byte arry length is larger than the char array length
			// then we will throw an exception when we get to the adjusted max
			max = byteStart + charEnd - charStart;
		}

		// charOff is the 'current' index into 'output'
		int charOff = charStart;

		// Check that we have at least 16 elements for our
		// unrolled part of the loop
		if (max - byteStart > 16) {
			// shift max down by 16 so that we have some elements
			// left over before we run out of groups of 16
			max -= 16;
			int byteOff = byteStart;
			// The loop test only tests every 16th test compared
			// to the normal loop. All the increments are done in
			// the loop body. Each line increments the byteoff by 1
			// until it's incremented by 16 after 16 lines. Then the test
			// checks that we are still under max - if so then loop again.
			for (; byteOff < max;) {
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);

				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
			}

			// We exited the loop because the byteoff went over the max.
			// Fortunately we kept back 16 elements so that we didn't go
			// too far past max. Now add the 16 back, and go into the
			// normal loop for the last few elements.
			max += 16;
			for (; byteOff < max;) {
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
			}
		} else {
			// If we're in this conditional, then there aren't even
			// 10 elements to process, so obviously we don't want to
			// do the unrolled part of the method.
			for (int byteOff = byteStart; byteOff < max;) {
				output[charOff++] = (char) (input[byteOff++] & 0xFF);
			}
		}
		// Finally if we indicated that the method needed an exception
		// thrown, we do it now.
		// if(throwException)
		// throw new Exception( );

		return charOff - charStart;

	}

}
