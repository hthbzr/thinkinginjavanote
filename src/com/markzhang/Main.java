package com.markzhang;

/**
 * true
 * false
 * true
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
 *
 *     ==可以比较基础类型，引用类型，
 *     对于基础类型比较的是值是否相等
 *     对于引用类型比较是引用的内存地址是否相等
 *     equals只用用于引用类型比较，内容是否相同
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
      Integer a = 127,b = 127;
      Integer x = 128,y = 128;
        System.out.println(a == b);
        System.out.println(x == y);
        System.out.println(a.equals(b));
    }
}
