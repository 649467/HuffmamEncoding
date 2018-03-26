package com.company;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HuffmanEncoding hf = new HuffmanEncoding("Hello");

        hf.buildEncodingTree();

    }
}
