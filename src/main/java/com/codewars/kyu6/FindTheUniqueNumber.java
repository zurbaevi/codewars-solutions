package com.codewars.kyu6;

import java.util.Arrays;

/**
 * @author Zurbaevi Nika
 */
public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
