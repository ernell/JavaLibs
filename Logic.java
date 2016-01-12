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

/** Logic operations
 * @author rob@ernell.se
 * @version 2016.01.12
 */
public enum Logic {
	NONE, AND, OR, XOR, NOT;

	/** Logic operation: AND
	 * @param op1 Operand 1
	 * @param op2 Operand 2
	 * @return Result from AND operation
	 */
	public static boolean and(boolean op1,boolean op2){
		return (op1 && op2);
	}

	/** Logic operation: OR
	 * @param op1 Operand 1
	 * @param op2 Operand 2
	 * @return Result from OR operation
	 */
	public static boolean or(boolean op1,boolean op2){
		return (op1 || op2);
	}

	/** Logic operation: XOR
	 * @param op1 Operand 1
	 * @param op2 Operand 2
	 * @return Result from XOR operation
	 */
	public static boolean xor(boolean op1,boolean op2){
		return ((op1 && !op2) || (!op1 && op2));
	}

	/** Logic operation: NOT
	 * @param op Operand
	 * @return The operand inverted
	 */
	public static boolean not(boolean op){
		return !op;
	}

}
