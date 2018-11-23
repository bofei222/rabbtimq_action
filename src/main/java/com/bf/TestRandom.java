package com.bf;

import java.util.Random;

/**
 * @author bofei
 * @date 2018/11/16 16:52
 */
public class TestRandom {
    public static void main(String[] args) {
        int i = new Random().nextInt(3);
        System.out.println(i);
    }
}
