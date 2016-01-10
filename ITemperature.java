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

/** Temperature Converter Library */
public interface ITemperature {

	// Array holding all the names/units
	public static final String[] TEMPERATURE_UNIT_NAME = { "°Amonton", "°Barnsdorf", "°Beaumuir", "°Bergen", "°Brisson",
			"°Celsius", "°Cimento", "°Cruquius", "°Dalencë", "°Daltons", "°De Luc", "°De Lyon", "°De la Hire",
			"°Delisle", "°Du Crest", "°Edinburgh", "electron volts", "°Fahrenheit", "°Florence Magnum", "°Florentine I",
			"°Florentine II", "°Fowler", "°Gas Mark", "°Hales", "°Hanow", "°Hauksbee", "°Jacobs-Holborn", "Kelvins",
			"°Kirch", "°La Court", "°Lambert", "°Lange", "°Leiden", "°Ludolf", "°Mariotte", "°Magnum", "°Miles",
			"°Murray", "°Newton", "°Paris", "Plancks", "°Poleni", "°Rëaumur", "°Rømer", "°Rankine", "°Richter",
			"°Royal Society of London", "°Sagredo", "°Stufe", "°Sulzer", "°Thermostat", "°Wedgwood"

	};
	// Array holding all the names/units
	public static final String[] TEMPERATURE_SCALE_NAME = { "Amonton", "Barnsdorf", "Beaumuir", "Bergen", "Brisson",
			"Celsius", "Cimento", "Cruquius", "Dalencë", "Daltons", "De Luc", "De Lyon", "De la Hire", "Delisle",
			"Du Crest", "Edinburgh", "electron volts", "Fahrenheit", "Florence Magnum", "Florentine I", "Florentine II",
			"Fowler", "Gas Mark", "Hales", "Hanow", "Hauksbee", "Jacobs-Holborn", "Kelvins", "Kirch", "La Court",
			"Lambert", "Lange", "Leiden", "Ludolf", "Mariotte", "Magnum", "Miles", "Murray", "Newton", "Paris",
			"Plancks", "Poleni", "Rëaumur", "Rømer", "Rankine", "Richter", "Royal Society of London", "Sagredo",
			"Stufe", "Sulzer", "Thermostat", "Wedgwood"

	};

	public static final int IDX_AMONTON = 0;
	public static final int IDX_BARNSDORF = 1;
	public static final int IDX_BEAUMUIR = 2;
	public static final int IDX_BERGEN = 3;
	public static final int IDX_BRISSON = 4;
	public static final int IDX_CELSIUS = 5;
	public static final int IDX_CIMENTO = 6;
	public static final int IDX_CRUQUIUS = 7;
	public static final int IDX_DALENCE = 8;
	public static final int IDX_DALTONS = 9;
	public static final int IDX_DE_LUC = 10;
	public static final int IDX_DE_LYON = 11;
	public static final int IDX_DE_LA_HIRE = 12;
	public static final int IDX_DELISLE = 13;
	public static final int IDX_DU_CREST = 14;
	public static final int IDX_EDINBURGH = 15;
	public static final int IDX_ELECTRON_VOLTS = 16;
	public static final int IDX_FAHRENHEIT = 17;
	public static final int IDX_FLORENCE_MAGNUM = 18;
	public static final int IDX_FLORENTINE_I = 19;
	public static final int IDX_FLORENTINE_II = 20;
	public static final int IDX_FOWLER = 21;
	public static final int IDX_GAS_MARK = 22;
	public static final int IDX_HALES = 23;
	public static final int IDX_HANOW = 24;
	public static final int IDX_HAUKSBEE = 25;
	public static final int IDX_JACOBS_HOLBORN = 26;
	public static final int IDX_KELVIN = 27;
	public static final int IDX_KIRCH = 28;
	public static final int IDX_LA_COURT = 29;
	public static final int IDX_LAMBERT = 30;
	public static final int IDX_LANGE = 31;
	public static final int IDX_LEIDEN = 32;
	public static final int IDX_LUDOLF = 33;
	public static final int IDX_MARIOTTE = 34;
	public static final int IDX_MAGNUM = 35;
	public static final int IDX_MILES = 36;
	public static final int IDX_MURRAY = 37;
	public static final int IDX_NEWTON = 38;
	public static final int IDX_PARIS = 39;
	public static final int IDX_PLANCKS = 40;
	public static final int IDX_POLENI = 41;
	public static final int IDX_REAUMUR = 42;
	public static final int IDX_ROMER = 43;
	public static final int IDX_RANKINE = 44;
	public static final int IDX_RICHTER = 45;
	public static final int IDX_ROYAL_SOCIETY_OF_LONDON = 46;
	public static final int IDX_SAGREDO = 47;
	public static final int IDX_STUFE = 48;
	public static final int IDX_SULZER = 49;
	public static final int IDX_THERMOSTAT = 50;
	public static final int IDX_WEDGWOOD = 51;

	// Constants used in calculations
	public static final double ROMER_CONSTANT = 7.5;
	public static final double KELVIN_CONSTANT = 273.15;

	public static final String TEMPERATURE_OUT_OF_RANGE = "out of range";
}
