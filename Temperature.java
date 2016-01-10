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
public class Temperature implements ITemperature {

	// Member to store temperature in Kelvins
	protected double kelvins;

	/**
	 * Constructor
	 * 
	 * @param degrees
	 *            in Kelvins
	 */
	public Temperature(double degrees) {
		kelvins = degrees;
	}

	public Temperature() {
		kelvins = 0.0;
	}

	public double getKelvins() {
		return kelvins;
	}

	public boolean isValidTemperature() {
		if (kelvins < 0.0)
			return false;
		return true;
	}

	/**
	 * Manually set the Kelvins value
	 * 
	 * @param value
	 */
	protected void setTemperature(double value) {
		kelvins = value;
	}

	/**
	 * Get name of temperature scale. Example: Celsius
	 * 
	 * @param index
	 * @return Temperature scale name
	 */
	public static String getName(int index) {
		return TEMPERATURE_SCALE_NAME[index];
	}

	/**
	 * Get unit of temperatur scale
	 * 
	 * @param index
	 * @return Temperature scale unit
	 */
	public static String getUnit(int index) {
		return TEMPERATURE_UNIT_NAME[index];
	}

	/**
	 * Create new Temperature object
	 * 
	 * @param index
	 *            - The input temperature scale (see ITemperature IDX list)
	 * @param degrees
	 *            - The degree value
	 * @return New Temperature object
	 */
	public static Temperature createFromIndex(int index, double degrees) {

		switch (index) {
		case IDX_AMONTON:
			return fromAmonton(degrees);
		case IDX_BARNSDORF:
			return fromBarnsdorf(degrees);
		case IDX_BEAUMUIR:
			return fromBeaumuir(degrees);
		case IDX_BERGEN:
			return fromBergen(degrees);
		case IDX_BRISSON:
			return fromBrisson(degrees);
		case IDX_CELSIUS:
			return fromCelsius(degrees);
		case IDX_CIMENTO:
			return fromCimento(degrees);
		case IDX_CRUQUIUS:
			return fromCruquius(degrees);
		case IDX_DALENCE:
			return fromDalence(degrees);
		case IDX_DALTONS:
			return fromDaltons(degrees);
		case IDX_DE_LUC:
			return fromDe_Luc(degrees);
		case IDX_DE_LYON:
			return fromDe_Lyon(degrees);
		case IDX_DE_LA_HIRE:
			return fromDe_la_Hire(degrees);
		case IDX_DELISLE:
			return fromDelisle(degrees);
		case IDX_DU_CREST:
			return fromDu_Crest(degrees);
		case IDX_EDINBURGH:
			return fromEdinburgh(degrees);
		case IDX_ELECTRON_VOLTS:
			return fromElectron_Volts(degrees);
		case IDX_FAHRENHEIT:
			return fromFahrenheit(degrees);
		case IDX_FLORENCE_MAGNUM:
			return fromFlorence_Magnum(degrees);
		case IDX_FLORENTINE_I:
			return fromFlorentine_I(degrees);
		case IDX_FLORENTINE_II:
			return fromFlorentine_II(degrees);
		case IDX_FOWLER:
			return fromFowler(degrees);
		case IDX_GAS_MARK:
			return fromGas_Mark(degrees);
		case IDX_HALES:
			return fromHales(degrees);
		case IDX_HANOW:
			return fromHanow(degrees);
		case IDX_HAUKSBEE:
			return fromHauksbee(degrees);
		case IDX_JACOBS_HOLBORN:
			return fromJacobs_Holborn(degrees);
		case IDX_KELVIN:
			return fromKelvin(degrees);
		case IDX_KIRCH:
			return fromKirch(degrees);
		case IDX_LA_COURT:
			return fromLa_Court(degrees);
		case IDX_LAMBERT:
			return fromLambert(degrees);
		case IDX_LANGE:
			return fromLange(degrees);
		case IDX_LEIDEN:
			return fromLeiden(degrees);
		case IDX_LUDOLF:
			return fromLudolf(degrees);
		case IDX_MARIOTTE:
			return fromMariotte(degrees);
		case IDX_MAGNUM:
			return fromMagnum(degrees);
		case IDX_MILES:
			return fromMiles(degrees);
		case IDX_MURRAY:
			return fromMurray(degrees);
		case IDX_NEWTON:
			return fromNewton(degrees);
		case IDX_PARIS:
			return fromParis(degrees);
		case IDX_PLANCKS:
			return fromPlancks(degrees);
		case IDX_POLENI:
			return fromPoleni(degrees);
		case IDX_REAUMUR:
			return fromReaumur(degrees);
		case IDX_ROMER:
			return fromRomer(degrees);
		case IDX_RANKINE:
			return fromRankine(degrees);
		case IDX_RICHTER:
			return fromRichter(degrees);
		case IDX_ROYAL_SOCIETY_OF_LONDON:
			return fromRoyal_Society_of_London(degrees);
		case IDX_SAGREDO:
			return fromSagredo(degrees);
		case IDX_STUFE:
			return fromStufe(degrees);
		case IDX_SULZER:
			return fromSulzer(degrees);
		case IDX_THERMOSTAT:
			return fromThermostat(degrees);
		case IDX_WEDGWOOD:
			return fromWedgwood(degrees);
		}

		return new Temperature(degrees); // Should never get here
	}

	/**
	 * Returns the converted temperature value as a double
	 * 
	 * @param index
	 *            - Use the IDX's
	 * @return Converted value as a double
	 */
	public double toIndex(int index) {

		switch (index) {

		case IDX_AMONTON:
			return toAmonton();
		case IDX_BARNSDORF:
			return toBarnsdorf();
		case IDX_BEAUMUIR:
			return toBeaumuir();
		case IDX_BERGEN:
			return toBergen();
		case IDX_BRISSON:
			return toBrisson();
		case IDX_CELSIUS:
			return toCelsius();
		case IDX_CIMENTO:
			return toCimento();
		case IDX_CRUQUIUS:
			return toCruquius();
		case IDX_DALENCE:
			return toDalence();
		case IDX_DALTONS:
			return toDaltons();
		case IDX_DE_LUC:
			return toDe_Luc();
		case IDX_DE_LYON:
			return toDe_Lyon();
		case IDX_DE_LA_HIRE:
			return toDe_la_Hire();
		case IDX_DELISLE:
			return toDelisle();
		case IDX_DU_CREST:
			return toDu_Crest();
		case IDX_EDINBURGH:
			return toEdinburgh();
		case IDX_ELECTRON_VOLTS:
			return toElectron_Volts();
		case IDX_FAHRENHEIT:
			return toFahrenheit();
		case IDX_FLORENCE_MAGNUM:
			return toFlorence_Magnum();
		case IDX_FLORENTINE_I:
			return toFlorentine_I();
		case IDX_FLORENTINE_II:
			return toFlorentine_II();
		case IDX_FOWLER:
			return toFowler();
		case IDX_GAS_MARK:
			return toGas_Mark();
		case IDX_HALES:
			return toHales();
		case IDX_HANOW:
			return toHanow();
		case IDX_HAUKSBEE:
			return toHauksbee();
		case IDX_JACOBS_HOLBORN:
			return toJacobs_Holborn();
		case IDX_KELVIN:
			return toKelvin();
		case IDX_KIRCH:
			return toKirch();
		case IDX_LA_COURT:
			return toLa_Court();
		case IDX_LAMBERT:
			return toLambert();
		case IDX_LANGE:
			return toLange();
		case IDX_LEIDEN:
			return toLeiden();
		case IDX_LUDOLF:
			return toLudolf();
		case IDX_MARIOTTE:
			return toMariotte();
		case IDX_MAGNUM:
			return toMagnum();
		case IDX_MILES:
			return toMiles();
		case IDX_MURRAY:
			return toMurray();
		case IDX_NEWTON:
			return toNewton();
		case IDX_PARIS:
			return toParis();
		case IDX_PLANCKS:
			return toPlancks();
		case IDX_POLENI:
			return toPoleni();
		case IDX_REAUMUR:
			return toReaumur();
		case IDX_ROMER:
			return toRomer();
		case IDX_RANKINE:
			return toRankine();
		case IDX_RICHTER:
			return toRichter();
		case IDX_ROYAL_SOCIETY_OF_LONDON:
			return toRoyal_Society_of_London();
		case IDX_SAGREDO:
			return toSagredo();
		case IDX_STUFE:
			return toStufe();
		case IDX_SULZER:
			return toSulzer();
		case IDX_THERMOSTAT:
			return toThermostat();
		case IDX_WEDGWOOD:
			return toWedgwood();
		}
		return 0.0;
	}

	/**
	 * Returns the converted temperature value as a String
	 * 
	 * @param index
	 *            - Use the IDX's
	 * @return Converted value as a String
	 */
	public String toStringIndex(int index) {

		if (kelvins < 0.0)
			return TEMPERATURE_OUT_OF_RANGE;

		switch (index) {

		case IDX_AMONTON:
			return String.valueOf(toAmonton());
		case IDX_BARNSDORF:
			return String.valueOf(toBarnsdorf());
		case IDX_BEAUMUIR:
			return String.valueOf(toBeaumuir());
		case IDX_BERGEN:
			return String.valueOf(toBergen());
		case IDX_BRISSON:
			return String.valueOf(toBrisson());
		case IDX_CELSIUS:
			return String.valueOf(toCelsius());
		case IDX_CIMENTO:
			return String.valueOf(toCimento());
		case IDX_CRUQUIUS:
			return String.valueOf(toCruquius());
		case IDX_DALENCE:
			return String.valueOf(toDalence());
		case IDX_DALTONS:
			if (kelvins == 0.0)
				return "-âˆž";
			return String.valueOf(toDaltons());
		case IDX_DE_LUC:
			return String.valueOf(toDe_Luc());
		case IDX_DE_LYON:
			return String.valueOf(toDe_Lyon());
		case IDX_DE_LA_HIRE:
			return String.valueOf(toDe_la_Hire());
		case IDX_DELISLE:
			return String.valueOf(toDelisle());
		case IDX_DU_CREST:
			return String.valueOf(toDu_Crest());
		case IDX_EDINBURGH:
			return String.valueOf(toEdinburgh());
		case IDX_ELECTRON_VOLTS:
			return String.valueOf(toElectron_Volts());
		case IDX_FAHRENHEIT:
			return String.valueOf(toFahrenheit());
		case IDX_FLORENCE_MAGNUM:
			return String.valueOf(toFlorence_Magnum());
		case IDX_FLORENTINE_I:
			return String.valueOf(toFlorentine_I());
		case IDX_FLORENTINE_II:
			return String.valueOf(toFlorentine_II());
		case IDX_FOWLER:
			return String.valueOf(toFowler());
		case IDX_GAS_MARK:
			return String.valueOf(toGas_Mark());
		case IDX_HALES:
			return String.valueOf(toHales());
		case IDX_HANOW:
			return String.valueOf(toHanow());
		case IDX_HAUKSBEE:
			return String.valueOf(toHauksbee());
		case IDX_JACOBS_HOLBORN:
			return String.valueOf(toJacobs_Holborn());
		case IDX_KELVIN:
			return String.valueOf(toKelvin());
		case IDX_KIRCH:
			return String.valueOf(toKirch());
		case IDX_LA_COURT:
			return String.valueOf(toLa_Court());
		case IDX_LAMBERT:
			return String.valueOf(toLambert());
		case IDX_LANGE:
			return String.valueOf(toLange());
		case IDX_LEIDEN:
			return String.valueOf(toLeiden());
		case IDX_LUDOLF:
			return String.valueOf(toLudolf());
		case IDX_MARIOTTE:
			return String.valueOf(toMariotte());
		case IDX_MAGNUM:
			return String.valueOf(toMagnum());
		case IDX_MILES:
			return String.valueOf(toMiles());
		case IDX_MURRAY:
			return String.valueOf(toMurray());
		case IDX_NEWTON:
			return String.valueOf(toNewton());
		case IDX_PARIS:
			return String.valueOf(toParis());
		case IDX_PLANCKS:
			return String.valueOf(toPlancks());
		case IDX_POLENI:
			return String.valueOf(toPoleni());
		case IDX_REAUMUR:
			return String.valueOf(toReaumur());
		case IDX_ROMER:
			return String.valueOf(toRomer());
		case IDX_RANKINE:
			return String.valueOf(toRankine());
		case IDX_RICHTER:
			return String.valueOf(toRichter());
		case IDX_ROYAL_SOCIETY_OF_LONDON:
			return String.valueOf(toRoyal_Society_of_London());
		case IDX_SAGREDO:
			return String.valueOf(toSagredo());
		case IDX_STUFE:
			return String.valueOf(toStufe());
		case IDX_SULZER:
			return String.valueOf(toSulzer());
		case IDX_THERMOSTAT:
			return String.valueOf(toThermostat());
		case IDX_WEDGWOOD:
			return String.valueOf(toWedgwood());
		}
		return "";
	}

	/**
	 * Returns the converted temperature value as a String
	 * 
	 * @param index
	 *            - Use the IDX's
	 * @param precision
	 *            Decimals
	 * @return Converted value as a String, in some cases "Infinity sign"
	 */
	public String toStringIndex(int index, int precision) {

		if (kelvins < 0.0)
			return TEMPERATURE_OUT_OF_RANGE;

		switch (index) {

		case IDX_AMONTON:
			return String.valueOf(round(toAmonton(), precision));
		case IDX_BARNSDORF:
			return String.valueOf(round(toBarnsdorf(), precision));
		case IDX_BEAUMUIR:
			return String.valueOf(round(toBeaumuir(), precision));
		case IDX_BERGEN:
			return String.valueOf(round(toBergen(), precision));
		case IDX_BRISSON:
			return String.valueOf(round(toBrisson(), precision));
		case IDX_CELSIUS:
			return String.valueOf(round(toCelsius(), precision));
		case IDX_CIMENTO:
			return String.valueOf(round(toCimento(), precision));
		case IDX_CRUQUIUS:
			return String.valueOf(round(toCruquius(), precision));
		case IDX_DALENCE:
			return String.valueOf(round(toDalence(), precision));
		case IDX_DALTONS:
			if (kelvins == 0.0)
				return "-âˆž";
			return String.valueOf(round(toDaltons(), precision));
		case IDX_DE_LUC:
			return String.valueOf(round(toDe_Luc(), precision));
		case IDX_DE_LYON:
			return String.valueOf(round(toDe_Lyon(), precision));
		case IDX_DE_LA_HIRE:
			return String.valueOf(round(toDe_la_Hire(), precision));
		case IDX_DELISLE:
			return String.valueOf(round(toDelisle(), precision));
		case IDX_DU_CREST:
			return String.valueOf(round(toDu_Crest(), precision));
		case IDX_EDINBURGH:
			return String.valueOf(round(toEdinburgh(), precision));
		case IDX_ELECTRON_VOLTS:
			return String.valueOf(round(toElectron_Volts(), precision));
		case IDX_FAHRENHEIT:
			return String.valueOf(round(toFahrenheit(), precision));
		case IDX_FLORENCE_MAGNUM:
			return String.valueOf(round(toFlorence_Magnum(), precision));
		case IDX_FLORENTINE_I:
			return String.valueOf(round(toFlorentine_I(), precision));
		case IDX_FLORENTINE_II:
			return String.valueOf(round(toFlorentine_II(), precision));
		case IDX_FOWLER:
			return String.valueOf(round(toFowler(), precision));
		case IDX_GAS_MARK:
			return String.valueOf(round(toGas_Mark(), precision));
		case IDX_HALES:
			return String.valueOf(round(toHales(), precision));
		case IDX_HANOW:
			return String.valueOf(round(toHanow(), precision));
		case IDX_HAUKSBEE:
			return String.valueOf(round(toHauksbee(), precision));
		case IDX_JACOBS_HOLBORN:
			return String.valueOf(round(toJacobs_Holborn(), precision));
		case IDX_KELVIN:
			return String.valueOf(round(toKelvin(), precision));
		case IDX_KIRCH:
			return String.valueOf(round(toKirch(), precision));
		case IDX_LA_COURT:
			return String.valueOf(round(toLa_Court(), precision));
		case IDX_LAMBERT:
			return String.valueOf(round(toLambert(), precision));
		case IDX_LANGE:
			return String.valueOf(round(toLange(), precision));
		case IDX_LEIDEN:
			return String.valueOf(round(toLeiden(), precision));
		case IDX_LUDOLF:
			return String.valueOf(round(toLudolf(), precision));
		case IDX_MARIOTTE:
			return String.valueOf(round(toMariotte(), precision));
		case IDX_MAGNUM:
			return String.valueOf(round(toMagnum(), precision));
		case IDX_MILES:
			return String.valueOf(round(toMiles(), precision));
		case IDX_MURRAY:
			return String.valueOf(round(toMurray(), precision));
		case IDX_NEWTON:
			return String.valueOf(round(toNewton(), precision));
		case IDX_PARIS:
			return String.valueOf(round(toParis(), precision));
		case IDX_PLANCKS:
			return String.valueOf(round(toPlancks(), precision)) + "E-32";
		case IDX_POLENI:
			return String.valueOf(round(toPoleni(), precision));
		case IDX_REAUMUR:
			return String.valueOf(round(toReaumur(), precision));
		case IDX_ROMER:
			return String.valueOf(round(toRomer(), precision));
		case IDX_RANKINE:
			return String.valueOf(round(toRankine(), precision));
		case IDX_RICHTER:
			return String.valueOf(round(toRichter(), precision));
		case IDX_ROYAL_SOCIETY_OF_LONDON:
			return String.valueOf(round(toRoyal_Society_of_London(), precision));
		case IDX_SAGREDO:
			return String.valueOf(round(toSagredo(), precision));
		case IDX_STUFE:
			return String.valueOf(round(toStufe(), precision));
		case IDX_SULZER:
			return String.valueOf(round(toSulzer(), precision));
		case IDX_THERMOSTAT:
			return String.valueOf(round(toThermostat(), precision));
		case IDX_WEDGWOOD:
			return String.valueOf(round(toWedgwood(), precision));
		}
		return "";
	}

	public static Temperature fromAmonton(double degrees) {
		return new Temperature(4.65116 * degrees + 33.6151);
	}

	public double toAmonton() {
		return (kelvins - 33.6151) / 4.65116;
	}

	public static Temperature fromBarnsdorf(double degrees) {
		return new Temperature(3.80952 * degrees + 259.182);
	}

	public double toBarnsdorf() {
		return (kelvins - 259.182) / 3.80952;
	}

	public static Temperature fromBeaumuir(double degrees) {
		return new Temperature(1.23862 * degrees + KELVIN_CONSTANT);
	}

	public double toBeaumuir() {
		return (kelvins - KELVIN_CONSTANT) / 1.23862;
	}

	public static Temperature fromBergen(double degrees) {
		return new Temperature(0.595238 * degrees + 269.579);
	}

	public double toBergen() {
		return (kelvins - 269.579) / 0.595238;
	}

	public static Temperature fromBrisson(double degrees) {
		return new Temperature(1.18519 * degrees + KELVIN_CONSTANT);
	}

	public double toBrisson() {
		return (kelvins - KELVIN_CONSTANT) / 1.18519;
	}

	public static Temperature fromCelsius(double degrees) {
		return new Temperature(degrees + KELVIN_CONSTANT);
	}

	public double toCelsius() {
		return kelvins - KELVIN_CONSTANT;
	}

	public static Temperature fromCimento(double degrees) {
		return new Temperature(1.50376 * degrees + 252.849);
	}

	public double toCimento() {
		return (kelvins - 252.849) / 1.50376;
	}

	public static Temperature fromCruquius(double degrees) {
		return new Temperature(0.22737 * degrees + 29.821);
	}

	public double toCruquius() {
		return (kelvins - 29.821) / 0.22737;
	}

	public static Temperature fromDalence(double degrees) {
		return new Temperature(1.5 * degrees + 288.15);
	}

	public double toDalence() {
		return (kelvins - 288.15) / 1.5;
	}

	public static Temperature fromDaltons(double degrees) {
		// (Daltons/100)
		// Kelvins = 273.15 * (373.15/273.15)
		return new Temperature(KELVIN_CONSTANT * Math.pow(373.15 / KELVIN_CONSTANT, degrees / 100.0));
	}

	public double toDaltons() {
		// Daltons = 100 * ln(Kelvins/273.15)/ln(373.15/273.15)
		return 100.0 * Math.log(kelvins / KELVIN_CONSTANT) / Math.log(373.15 / KELVIN_CONSTANT);
	}

	public static Temperature fromDelisle(double degrees) {
		return new Temperature(373.15 - degrees * 2.0 / 3.0);
	}

	public double toDelisle() {
		return (373.15 - kelvins) * 1.5;
	}

	public static Temperature fromDe_Luc(double degrees) {
		return new Temperature(1.26984 * degrees + KELVIN_CONSTANT);
	}

	public double toDe_Luc() {
		return (kelvins - KELVIN_CONSTANT) / 1.26984;
	}

	public static Temperature fromDe_Lyon(double degrees) {
		return new Temperature(1.01587 * degrees + KELVIN_CONSTANT);
	}

	public double toDe_Lyon() {
		return (kelvins - KELVIN_CONSTANT) / 1.01587;
	}

	public static Temperature fromDe_la_Hire(double degrees) {
		return new Temperature(1.01184 * degrees + 252.337);
	}

	public double toDe_la_Hire() {
		return (kelvins - 252.337) / 1.01184;
	}

	public static Temperature fromDu_Crest(double degrees) {
		return new Temperature(0.853839 * degrees + 287.75);
	}

	public double toDu_Crest() {
		return (kelvins - 287.75) / 0.853839;
	}

	public static Temperature fromEdinburgh(double degrees) {
		return new Temperature(2.57732 * degrees + 252.016);
	}

	public double toEdinburgh() {
		return (kelvins - 252.016) / 2.57732;
	}

	public static Temperature fromElectron_Volts(double degrees) {
		return new Temperature(11604.5 * degrees);
	}

	public double toElectron_Volts() {
		return kelvins / 11604.5;
	}

	public static Temperature fromFahrenheit(double degrees) {
		return new Temperature((degrees + 459.67) * 5.0 / 9.0);
	}

	public double toFahrenheit() {
		return kelvins * 1.8 - 459.67;
	}

	public static Temperature fromFlorence_Magnum(double degrees) {
		return new Temperature(0.299145 * degrees + 282.124);
	}

	public double toFlorence_Magnum() {
		return (kelvins - 282.124) / 0.299145;
	}

	public static Temperature fromFlorentine_I(double degrees) {
		return new Temperature(1.94444 * degrees + 234.261);
	}

	public double toFlorentine_I() {
		return (kelvins - 234.261) / 1.94444;
	}

	public static Temperature fromFlorentine_II(double degrees) {
		return new Temperature(0.584795 * degrees + 265.255);
	}

	public double toFlorentine_II() {
		return (kelvins - 265.255) / 0.584795;
	}

	public static Temperature fromFowler(double degrees) {
		return new Temperature(0.498333 * degrees + 289.2);
	}

	public double toFowler() {
		return (kelvins - 289.2) / 0.498333;
	}

	public static Temperature fromGas_Mark(double degrees) {
		return new Temperature(13.8889 * degrees + 394.261);
	}

	public double toGas_Mark() {
		return (kelvins - 394.261) / 13.8889;
	}

	public static Temperature fromHales(double degrees) {
		return new Temperature(degrees * 2.0 / 3.0 + KELVIN_CONSTANT);
	}

	public double toHales() {
		return 2.0 * (kelvins - KELVIN_CONSTANT) / 3.0;
	}

	public static Temperature fromHanow(double degrees) {
		return new Temperature(0.592593 * degrees + 255.372);
	}

	public double toHanow() {
		return (kelvins - 255.372) / 0.592593;
	}

	public static Temperature fromHauksbee(double degrees) {
		return new Temperature(-0.4 * degrees + 304.35);
	}

	public double toHauksbee() {
		return (kelvins - 304.35) / -0.4;
	}

	public static Temperature fromJacobs_Holborn(double degrees) {
		return new Temperature(0.140845 * degrees + 225.685);
	}

	public double toJacobs_Holborn() {
		return (kelvins - 225.685) / 0.140845;
	}

	public static Temperature fromKelvin(double degrees) {
		return new Temperature(degrees);
	}

	public double toKelvin() {
		return kelvins;
	}

	public static Temperature fromKirch(double degrees) {
		return new Temperature(2.96296 * degrees + 252.409);
	}

	public double toKirch() {
		return (kelvins - 252.409) / 2.96296;
	}

	public static Temperature fromLa_Court(double degrees) {
		return new Temperature(1.31687 * degrees + 253.397);
	}

	public double toLa_Court() {
		return (kelvins - 253.397) / 1.31687;
	}

	public static Temperature fromLambert(double degrees) {
		return new Temperature(0.27027 * degrees + 2.87973);
	}

	public double toLambert() {
		return (kelvins - 2.87973) / 0.27027;
	}

	public static Temperature fromLange(double degrees) {
		return new Temperature(2.07523 * degrees + 258.9);
	}

	public double toLange() {
		return (kelvins - 258.9) / 2.07523;
	}

	public static Temperature fromLeiden(double degrees) {
		return new Temperature(degrees + 20.15);
	}

	public double toLeiden() {
		return kelvins - 20.15;
	}

	public static Temperature fromLudolf(double degrees) {
		return new Temperature(0.623782 * degrees + 253.189);
	}

	public double toLudolf() {
		return (kelvins - 253.189) / 0.623782;
	}

	public static Temperature fromMariotte(double degrees) {
		return new Temperature(0.389 * degrees + 263.65);
	}

	public double toMariotte() {
		return (kelvins - 263.65) / 0.389;
	}

	public static Temperature fromMagnum(double degrees) {
		return new Temperature(0.3125 * degrees + 282.15);
	}

	public double toMagnum() {
		return (kelvins - 282.15) / 0.3125;
	}

	public static Temperature fromMiles(double degrees) {
		return new Temperature(5.0 * degrees / 9.0 + KELVIN_CONSTANT);
	}

	public double toMiles() {
		return kelvins;
	}

	public static Temperature fromMurray(double degrees) {
		return new Temperature(0.403226 * degrees + 233.231);
	}

	public double toMurray() {
		return (kelvins - 233.231) / 0.403226;
	}

	public static Temperature fromNewton(double degrees) {
		return new Temperature(100.0 * degrees / 33.0 + KELVIN_CONSTANT);
	}

	public double toNewton() {
		return 33.0 * (kelvins - KELVIN_CONSTANT) / 100.0;
	}

	public static Temperature fromParis(double degrees) {
		return new Temperature(0.583333 * degrees + 256.817);
	}

	public double toParis() {
		return (kelvins - 256.817) / 0.583333;
	}

	public static Temperature fromPlancks(double degrees) {
		// return new Temperature(1.416785 * Math.pow(10, 32) * degrees);
		return new Temperature(1.416785 * degrees);
	}

	public double toPlancks() {
		// return kelvins / (1.416785 * Math.pow(10, 32));
		return kelvins / 1.416785;
	}

	public static Temperature fromPoleni(double degrees) {
		return new Temperature(6.58915 * degrees - 38.8655);
	}

	public double toPoleni() {
		return (kelvins + 38.8655) / 6.58915;
	}

	public static Temperature fromRankine(double degrees) {
		return new Temperature(5.0 * degrees / 9.0);
	}

	public double toRankine() {
		return kelvins * 1.8;
	}

	public static Temperature fromReaumur(double degrees) {
		return new Temperature(5.0 * degrees / 4.0 + KELVIN_CONSTANT);
	}

	public double toReaumur() {
		return (kelvins - KELVIN_CONSTANT) * 0.8;
	}

	public static Temperature fromRichter(double degrees) {
		return new Temperature(1.21766 * degrees + 251.232);
	}

	public double toRichter() {
		return (kelvins - 251.232) / 1.21766;
	}

	public static Temperature fromRomer(double degrees) {
		return new Temperature(40 * (degrees - ROMER_CONSTANT) / 21.0 + KELVIN_CONSTANT);
	}

	public double toRomer() {
		return 21.0 * (kelvins - KELVIN_CONSTANT) / 40.0 + ROMER_CONSTANT;
	}

	public static Temperature fromRoyal_Society_of_London(double degrees) {
		return new Temperature(-0.402576 * degrees + 304.817);
	}

	public double toRoyal_Society_of_London() {
		return (kelvins - 304.817) / -0.402576;
	}

	public static Temperature fromSagredo(double degrees) {
		return new Temperature(0.211 * degrees + 252.05);
	}

	public double toSagredo() {
		return (kelvins - 252.05) / 0.211;
	}

	public static Temperature fromStufe(double degrees) {
		return new Temperature(25.0 * degrees + 398.15);
	}

	public double toStufe() {
		return (kelvins - 398.15) / 25.0;
	}

	public static Temperature fromSulzer(double degrees) {
		return new Temperature(0.636637 * degrees + 273.835);
	}

	public double toSulzer() {
		return (kelvins - 273.835) / 0.636637;
	}

	public static Temperature fromThermostat(double degrees) {
		return new Temperature(30.0 * degrees + KELVIN_CONSTANT);
	}

	public double toThermostat() {
		return kelvins / 30.0 - 9.105;
	}

	public static Temperature fromWedgwood(double degrees) {
		return new Temperature(34.7222 * degrees + 542.594);
	}

	public double toWedgwood() {
		return (kelvins - 542.594) / 34.7222;
	}

	public static double round(double unrounded, int precision) {
		double pow = Math.pow(10, precision);
		return Math.round(unrounded * pow) / pow;
	}

	public static double round(double unrounded) {
		double pow = Math.pow(10, 2);
		return Math.round(unrounded * pow) / pow;
	}

	private static boolean isDouble(String string_value) {
		try {
			double tmp_value = Double.parseDouble(string_value);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	/**
	 * Retrieve a textstring with info about a temperature close to the one
	 * given in param
	 * 
	 * @param Degrees
	 *            in kelvins
	 * @return A textstring with info
	 */
	public static String getFunFacts(double kelvins) {

		if (kelvins < 0.0) {
			return "Impossible temperature. Below 0 Kelvins";
		} else if (kelvins <= 0.011) {
			return "Tungsten superconducts (0.011 K)";
		} else if (kelvins <= 0.95) {
			return "Helium melts (0.95 K)";
		} else if (kelvins <= 4.22) {
			return "Helium boils (4.22 K)";
		} else if (kelvins <= 9.26) {
			return "Niobium superconducts (9.26 K)";
		} else if (kelvins <= 14.009985) {
			return "Hydrogen melts (14.01 K)";
		} else if (kelvins <= 20.28) {
			return "Hydrogen boils (20.28 K)";
		} else if (kelvins <= 24.56) {
			return "Neon melts (24.56 K)";
		} else if (kelvins <= 27.07) {
			return "Neon boils (27.07 K)";
		} else if (kelvins <= 53.53) {
			return "Fluorine melts (53.53 K)";
		} else if (kelvins <= 54.36) {
			return "Oxygen melts (54.36 K)";
		} else if (kelvins <= 63.15) {
			return "Nitrogen melts (63.15 K)";
		} else if (kelvins <= 77.36) {
			return "Nitrogen boils (77.36 K)";
		} else if (kelvins <= 83.8) {
			return "Argon melts (83.80 K)";
		} else if (kelvins <= 85.03) {
			return "Fluorine boils (85.03 K)";
		} else if (kelvins <= 87.3) {
			return "Argon boils (87.30 K)";
		} else if (kelvins <= 90.2) {
			return "Oxygen boils (90.20 K)";
		} else if (kelvins <= 115.79) {
			return "Krypton melts (115.79 K)";
		} else if (kelvins <= 119.93) {
			return "Krypton boils (119.93 K)";
		} else if (kelvins <= 161.4) {
			return "Xenon melts (161.4 K)";
		} else if (kelvins <= 165.03) {
			return "Xenon boils (165.03 K)";
		} else if (kelvins <= 171.65) {
			return "Chlorine melts (171.65 K)";
		} else if (kelvins <= 194.65) {
			return "Carbon Dioxide freezes (dry ice) (194.65 K)";
		} else if (kelvins <= 202) {
			return "Radon melts (202 K)";
		} else if (kelvins <= 211.3) {
			return "Radon boils (211.3 K)";
		} else if (kelvins <= 234.32) {
			return "Mercury melts (234.32 K)";
		} else if (kelvins <= 239.11) {
			return "Chlorine boils (239.11 K)";
		} else if (kelvins <= 265.95) {
			return "Bromine melts (265.95 K)";
		} else if (kelvins <= 273.15) {
			return "Water freezes (273.15 K/0Â°C/32Â°F)";
		} else if (kelvins <= 301.59) {
			return "Cesium melts (301.59 K)";
		} else if (kelvins <= 302.9146) {
			return "Gallium melts (302.915 K)";
		} else if (kelvins <= 310) {
			return "Human body temperature (310 K)";
		} else if (kelvins <= 312.46) {
			return "Rubidium melts (312.46 K)";
		} else if (kelvins <= 317.3) {
			return "Phosphorus melts (317.3 K)";
		} else if (kelvins <= 324.817) {
			return "Meat: Rare (125Â°F)";
		} else if (kelvins <= 330.372) {
			return "Meat: Medium Rare (135Â°F)";
		} else if (kelvins <= 331.95) {
			return "Bromine boils (331.95 K)";
		} else if (kelvins <= 335.928) {
			return "Meat: Medium (145Â°F)";
		} else if (kelvins <= 336.53) {
			return "Potassium (Kalium) melts (336.53 K)";
		} else if (kelvins <= 341.483) {
			return "Meat: Medium Well (155Â°F)";
		} else if (kelvins <= 347.039) {
			return "Meat: Well done (165Â°F)";
		} else if (kelvins <= 370.95) {
			return "Sodium (Natrium) melts (370.95 K)";
		} else if (kelvins <= 373.15) {
			return "Water boils (373.15 K/100Â°C/212Â°F)";
		} else if (kelvins <= 374.55) {
			return "Heavy water boils (374.55 K)";
		} else if (kelvins <= 374.66) {
			return "Tritiated water boils (374.66 K)";
		} else if (kelvins <= 383.15) {
			return "Finish sauna (110Â°C)";
		} else if (kelvins <= 386.85) {
			return "Iodine melts (386.85 K)";
		} else if (kelvins <= 388.36) {
			return "Sulfur melts (388.36 K)";
		} else if (kelvins <= 429.75) {
			return "Indium melts (429.75 K)";
		} else if (kelvins <= 453.65) {
			return "Lithium melts (453.65 K)";
		} else if (kelvins <= 457.4) {
			return "Iodine boils (457.4 K)";
		} else if (kelvins <= 494) {
			return "Selenium melts (494 K)";
		} else if (kelvins <= 505.08) {
			return "Tin (Stannum) melts (505.08 K)";
		} else if (kelvins <= 527) {
			return "Polonium melts (527 K)";
		} else if (kelvins <= 544.55) {
			return "Bismuth melts (544.55 K)";
		} else if (kelvins <= 550) {
			return "Phosphorus boils (550 K)";
		} else if (kelvins <= 575) {
			return "Astatine melts (575 K)";
		} else if (kelvins <= 577) {
			return "Thallium melts (577 K)";
		} else if (kelvins <= 594.22) {
			return "Cadmium melts (594.22 K)";
		} else if (kelvins <= 600.61) {
			return "Lead melts (600.61 K)";
		} else if (kelvins <= 629.88) {
			return "Mercury boils (629.88 K)";
		} else if (kelvins <= 692.68) {
			return "Zinc melts (692.68 K)";
		} else if (kelvins <= 717.8) {
			return "Sulfur boils (717.8 K)";
		} else if (kelvins <= 722.66) {
			return "Tellurium melts (722.66 K)";
		} else if (kelvins <= 903.78) {
			return "Antimony melts (903.78 K)";
		} else if (kelvins <= 912.5) {
			return "Plutonium melts (912.5 K)";
		} else if (kelvins <= 923) {
			return "Magnesium melts (923 K)";
		} else if (kelvins <= 933.437) {
			return "Aluminum melts (933.437 K)";
		} else if (kelvins <= 944) {
			return "Cesium boils (944 K)";
		} else if (kelvins <= 958) {
			return "Selenium boils (958 K)";
		} else if (kelvins <= 961) {
			return "Rubidium boils (961 K)";
		} else if (kelvins <= 973) {
			return "Radium melts (973 K)";
		} else if (kelvins <= 1000) {
			return "Barium melts (1000 K)";
		} else if (kelvins <= 1032) {
			return "Potassium (Kalium) boils (1032 K)";
		} else if (kelvins <= 1040) {
			return "Cadmium boils (1040 K)";
		} else if (kelvins <= 1050) {
			return "Strontium melts (1050 K)";
		} else if (kelvins <= 1071) {
			return "Cerium melts (1071 K)";
		} else if (kelvins <= 1090) {
			return "Arsenic melts (1090 K)";
		} else if (kelvins <= 1095) {
			return "Europium melts (1095 K)";
		} else if (kelvins <= 1097) {
			return "Ytterbium melts (1097 K)";
		} else if (kelvins <= 1100) {
			return "Nobelium and Mendelevium melts (1100 K)";
		} else if (kelvins <= 1115) {
			return "Calcium melts (1115 K)";
		} else if (kelvins <= 1133) {
			return "Einsteinium melts (1133 K)";
		} else if (kelvins <= 1156) {
			return "Sodium (Natrium) boils (1156 K)";
		} else if (kelvins <= 1173) {
			return "Californium melts (1173 K)";
		} else if (kelvins <= 1180) {
			return "Zinc boils (1180 K)";
		} else if (kelvins <= 1193) {
			return "Lanthanum melts (1193 K)";
		} else if (kelvins <= 1208) {
			return "Praseodymium melts (1208 K)";
		} else if (kelvins <= 1211.4) {
			return "Germanium melts (1211.40 K)";
		} else if (kelvins <= 1234.93) {
			return "Silver (Argentum) melts (1234.93 K)";
		} else if (kelvins <= 1235) {
			return "Polonium boils (1235 K)";
		} else if (kelvins <= 1261) {
			return "Tellurium boils (1261 K)";
		} else if (kelvins <= 1297) {
			return "Neodymium melts (1297 K)";
		} else if (kelvins <= 1315) {
			return "Promethium melts (1315 K)";
		} else if (kelvins <= 1323) {
			return "Actinium melts (1323 K)";
		} else if (kelvins <= 1323) {
			return "Berkelium melts (1323 K)";
		} else if (kelvins <= 1337.33) {
			return "Gold melts (1337.33 K)";
		} else if (kelvins <= 1345) {
			return "Samarium melts (1345 K)";
		} else if (kelvins <= 1357.77) {
			return "Copper melts (1357.77 K)";
		} else if (kelvins <= 1363) {
			return "Magnesium boils (1363 K)";
		} else if (kelvins <= 1405.3) {
			return "Uranium melts (1405.3 K)";
		} else if (kelvins <= 1449) {
			return "Americium melts (1449 K)";
		} else if (kelvins <= 1469) {
			return "Ytterbium boils (1469 K)";
		} else if (kelvins <= 1519) {
			return "Manganese melts (1519 K)";
		} else if (kelvins <= 1560) {
			return "Beryllium melts (1560 K)";
		} else if (kelvins <= 1585) {
			return "Gadolinium melts (1585 K)";
		} else if (kelvins <= 1613) {
			return "Curium melts (1613 K)";
		} else if (kelvins <= 1615) {
			return "Lithium boils (1615 K)";
		} else if (kelvins <= 1629) {
			return "Terbium melts (1629 K)";
		} else if (kelvins <= 1655) {
			return "Strontium boils (1655 K)";
		} else if (kelvins <= 1685) {
			return "Dysprosium melts (1685 K)";
		} else if (kelvins <= 1687) {
			return "Silicon melts (1687 K)";
		} else if (kelvins <= 1728) {
			return "Nickel melts (1728 K)";
		} else if (kelvins <= 1734) {
			return "Holmium melts (1734 K)";
		} else if (kelvins <= 1746) {
			return "Thallium boils (1746 K)";
		} else if (kelvins <= 1757) {
			return "Calcium boils (1757 K)";
		} else if (kelvins <= 1768) {
			return "Cobalt melts (1768 K)";
		} else if (kelvins <= 1799) {
			return "Yttrium melts (1799 K)";
		} else if (kelvins <= 1800) {
			return "Fermium melts (1800 K)";
		} else if (kelvins <= 1802) {
			return "Erbium melts. Europium boils (1802 K)";
		} else if (kelvins <= 1811) {
			return "Iron melts (1811 K)";
		} else if (kelvins <= 1814) {
			return "Scandium melts (1814 K)";
		} else if (kelvins <= 1818) {
			return "Thulium melts (1818 K)";
		} else if (kelvins <= 1828.05) {
			return "Palladium melts (1828.05 K)";
		} else if (kelvins <= 1837) {
			return "Bismuth boils (1837 K)";
		} else if (kelvins <= 1841) {
			return "Protactinium melts (1841 K)";
		} else if (kelvins <= 1860) {
			return "Antimony boils (1860 K)";
		} else if (kelvins <= 1900) {
			return "Lawrencium melts (1900 K)";
		} else if (kelvins <= 1936) {
			return "Lutetium melts (1936 K)";
		} else if (kelvins <= 1941) {
			return "Titanium melts (1941 K)";
		} else if (kelvins <= 2010) {
			return "Radium boils (2010 K)";
		} else if (kelvins <= 2022) {
			return "Lead (Plumbum) boils (2022 K)";
		} else if (kelvins <= 2041.4) {
			return "Platinum melts (2041.4 K)";
		} else if (kelvins <= 2067) {
			return "Samarium boils (2067 K)";
		} else if (kelvins <= 2115) {
			return "Thorium melts (2115 K)";
		} else if (kelvins <= 2128) {
			return "Zirconium melts (2128 K)";
		} else if (kelvins <= 2170) {
			return "Barium boils (2170 K)";
		} else if (kelvins <= 2180) {
			return "Chromium melts (2180 K)";
		} else if (kelvins <= 2183) {
			return "Vanadium melts (2183 K)";
		} else if (kelvins <= 2223) {
			return "Thulium boils (2223 K)";
		} else if (kelvins <= 2237) {
			return "Rhodium melts (2237 K)";
		} else if (kelvins <= 2284) {
			return "Americium boils (2284 K)";
		} else if (kelvins <= 2334) {
			return "Manganese boils (2334 K)";
		} else if (kelvins <= 2345) {
			return "Indium boils (2345 K)";
		} else if (kelvins <= 2348) {
			return "Boron melts (2348 K)";
		} else if (kelvins <= 2430) {
			return "Technetium melts (2430 K)";
		} else if (kelvins <= 2435) {
			return "Silver boils (2435 K)";
		} else if (kelvins <= 2477) {
			return "Gallium boils (2477 K)";
		} else if (kelvins <= 2506) {
			return "Hafnium melts (2506 K)";
		} else if (kelvins <= 2607) {
			return "Ruthenium melts (2607 K)";
		} else if (kelvins <= 2719) {
			return "Iridium melts (2719 K)";
		} else if (kelvins <= 2744) {
			return "Beryllium boils (2744 K)";
		} else if (kelvins <= 2750) {
			return "Niobium melts (2750 K)";
		} else if (kelvins <= 2792) {
			return "Aluminum boils (2792 K)";
		} else if (kelvins <= 2835) {
			return "Copper boils (2835 K)";
		} else if (kelvins <= 2840) {
			return "Dysprosium boils (2840 K)";
		} else if (kelvins <= 2875) {
			return "Tin boils (2875 K)";
		} else if (kelvins <= 2896) {
			return "Molybdenum melts (2896 K)";
		} else if (kelvins <= 2944) {
			return "Chromium boils (2944 K)";
		} else if (kelvins <= 2993) {
			return "Holmium boils (2993 K)";
		} else if (kelvins <= 3106) {
			return "Germanium boils (3106 K)";
		} else if (kelvins <= 3109) {
			return "Scandium boils (3109 K)";
		} else if (kelvins <= 3129) {
			return "Gold boils (3129 K)";
		} else if (kelvins <= 3134) {
			return "Iron boils (3134 K)";
		} else if (kelvins <= 3141) {
			return "Erbium boils (3141 K)";
		} else if (kelvins <= 3186) {
			return "Nickel boils (3186 K)";
		} else if (kelvins <= 3200) {
			return "Cobalt boils (3200 K)";
		} else if (kelvins <= 3236) {
			return "Palladium boils (3236 K)";
		} else if (kelvins <= 3273) {
			return "Promethium boils (3273 K)";
		} else if (kelvins <= 3290) {
			return "Tantalum melts (3290 K)";
		} else if (kelvins <= 3306) {
			return "Osmium melts (3306 K)";
		} else if (kelvins <= 3347) {
			return "Neodymium boils (3347 K)";
		} else if (kelvins <= 3383) {
			return "Curium boils (3383 K)";
		} else if (kelvins <= 3459) {
			return "Rhenium melts (3459 K)";
		} else if (kelvins <= 3471) {
			return "Actinium boils (3471 K)";
		} else if (kelvins <= 3503) {
			return "Terbium boils (3503 K)";
		} else if (kelvins <= 3505) {
			return "Plutonium boils (3505 K)";
		} else if (kelvins <= 3538) {
			return "Silicon boils (3538 K)";
		} else if (kelvins <= 3546) {
			return "Gadolinium boils (3546 K)";
		} else if (kelvins <= 3550) {
			return "Diamond melts (3550 K)";
		} else if (kelvins <= 3560) {
			return "Titanium boils (3560 K)";
		} else if (kelvins <= 3609) {
			return "Yttrium boils (3609 K)";
		} else if (kelvins <= 3675) {
			return "Lutetium boils (3675 K)";
		} else if (kelvins <= 3680) {
			return "Vanadium boils (3680 K)";
		} else if (kelvins <= 3695) {
			return "Tungsten (Wolfram) melts (3695 K)";
		} else if (kelvins <= 3697) {
			return "Cerium boils (3697 K)";
		} else if (kelvins <= 3737) {
			return "Lanthanum boils (3737 K)";
		} else if (kelvins <= 3793) {
			return "Praseodymium boils (3793 K)";
		} else if (kelvins <= 3823) {
			return "Carbon melts (3823 K)";
		} else if (kelvins <= 3968) {
			return "Rhodium boils (3968 K)";
		} else if (kelvins <= 4098) {
			return "Carbon and Platinum boils (4098 K)";
		} else if (kelvins <= 4273) {
			return "Boron boils (4273 K)";
		} else if (kelvins <= 4404) {
			return "Uranium boils (4404 K)";
		} else if (kelvins <= 4423) {
			return "Ruthenium boils (4423 K)";
		} else if (kelvins <= 4538) {
			return "Technetium boils (4538 K)";
		} else if (kelvins <= 4682) {
			return "Zirconium boils (4682 K)";
		} else if (kelvins <= 4701) {
			return "Iridium boils (4701 K)";
		} else if (kelvins <= 4876) {
			return "Hafnium boils (4876 K)";
		} else if (kelvins <= 4912) {
			return "Molybdenum boils (4912 K)";
		} else if (kelvins <= 5017) {
			return "Niobium boils (5017 K)";
		} else if (kelvins <= 5061) {
			return "Thorium boils (5061 K)";
		} else if (kelvins <= 5100) {
			return "Diamond boils (5100 K)";
		} else if (kelvins <= 5285) {
			return "Osmium boils (5285 K)";
		} else if (kelvins <= 5731) {
			return "Tantalum boils (5731 K)";
		} else if (kelvins <= 5800) {
			return "Surface of the sun (5800 K)";
		} else if (kelvins <= 5828) {
			return "Tungsten (Wolfram) boils (5828 K)";
		} else if (kelvins <= 5869) {
			return "Rhenium boils (5869 K)";
		} else if (kelvins <= 28000) {
			return "Lightning bolt's (28000 K)";
		} else if (kelvins <= 16000000) {
			return "Sun's core (16 MK)";
		} else if (kelvins <= 350000000) {
			return "Thermonuclear weapon (350 MK)";
			// Easter egg
		} else if (kelvins <= 1000000000) {
			return "Hotter than hell!";
		} else {
			return "";
		}

	}
}
