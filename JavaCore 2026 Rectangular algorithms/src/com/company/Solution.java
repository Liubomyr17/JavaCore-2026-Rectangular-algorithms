package com.company;

/*

2026 Rectangular algorithms
1. Given a two-dimensional array N * N, which contains several rectangles.
2. Different rectangles do not touch or overlap.
3. Inside, the rectangle is filled with 1.
4. In the array:
4.1) a [i, j] = 1 if element (i, j) belongs to any rectangle
4.2) a [i, j] = 0, otherwise
5. getRectangleCount must return the number of rectangles.
6. The main method does not participate in testing

Requirements:
1. In the Solution class, there must be a getRectangleCount method with one parameter of type byte [] [].
2. The getRectangleCount method must be public.
3. The getRectangleCount method must be static.
4. The getRectangleCount method must return the number of rectangles (according to the job) found in the resulting array.



 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;




public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
        a = new byte[][] {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 1}
        };
        count = getRectangleCount(a);
        System.out.println("Count = "+count+". Должно быть 3");
        a = new byte[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0}
        };
        count = getRectangleCount(a);
        System.out.println("Count = " + count + ". Должно быть 1");
        a = new byte[][] {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 0, 1}
        };
        count = getRectangleCount(a);
        System.out.println("Count = " + count + ". Должно быть 3");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if ((a[i][j] == 1) && (i == 0 || (i > 0 && a[i-1][j] == 0))
                && (j == 0 || (j > 0 && a[i][j-1] == 0))) {
                    count++;
                }
            }
        }
        return count;
    }
}

