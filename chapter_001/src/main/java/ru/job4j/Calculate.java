package ru.job4j;

/**
 * My first steps in Java.
 *
 * @author Kirill Kiryanov (kirill_kiryanov@internet.ru)
 * @version 0.1
 * @since 15.04.22
 */
public class Calculate {
    /**
     * 
     * @param main – description: главный метод, стартовый вход в класс;
     */
    public static void main(String[] args) {
        System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		System.out.println(String.format("%s + %s = %s", first, second, add(first, second)));
		System.out.println(String.format("%s - %s = %s", first, second, substract(first, second)));
		System.out.println(String.format("%s * %s = %s", first, second, multiple(first, second)));
		System.out.println(String.format("%s / %s = %s", first, second, div(first, second)));
		System.out.println(String.format("%s ^ %s = %s", first, second, expand(first, (int) second)));
    }
	/**
     * Сложение
     * @param first первый аргумент;
	 * @param second второй аргумент;
	 * @param return сумма;
     */
	public static double add(double first, double second) {
		return first + second;
	}
	/**
     * Вычитание
     * @param first первый аргумент;
	 * @param second второй аргумент;
	 * @param return разность;
     */
	public static double substract(double first, double second) {
		return first - second;
	}
	/**
     * Умножение
     * @param first первый аргумент;
	 * @param second второй аргумент;
	 * @param return произведение;
     */
	public static double multiple(double first, double second) {
		return first * second;
	}
	/**
     * Деление
     * @param first первый аргумент;
	 * @param second второй аргумент;
	 * @param return частное;
     */
	public static double div(double first, double second) {
		return first / second;
	}
	/**
     * Степень
     * @param first первый аргумент;
	 * @param second второй аргумент;
	 * @param return степень;
     */
	public static double expand(double first, double second) {
		return first ^ second;
	}
	
}
