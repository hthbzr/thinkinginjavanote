package com.markzhang;

/**
 * true
 * false
 *   *
 *      * This method will always cache values in the range -128 to 127,
 *      * inclusive, and may cache other values outside of this range.
 *      *
 *      * @param  i an {@code int} value.
 *      * @return an {@code Integer} instance representing {@code i}.
 *      * @since  1.5
 *       public static Integer valueOf(int i) {
 *         if (i >= IntegerCache.low && i <= IntegerCache.high)
 *             return IntegerCache.cache[i + (-IntegerCache.low)];
 *         return new Integer(i);
 *     }
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
      Integer a = 127,b = 127;
      Integer x = 128,y = 128;
        System.out.println(a == b);
        System.out.println(x == y);
    }
}
