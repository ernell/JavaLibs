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
 * Static methods for printing messages to console, error, whatever.
 * 
 * @author rob@ernell.se
 * @version 2016.01.08
 */
public class SysMsg {

	/**
	 * Print error message
	 */
	public static void error(String message){
		System.err.println(message);
	}

	/**
	 * Print console message
	 */
	public static void console(String message){
		System.out.println(message);
	}

}
