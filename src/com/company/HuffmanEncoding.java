package com.company;
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/11/2018
 *Time: 8:11 PM
 *Contact: nmgaultney@gmail.com
 */

import javafx.collections.transformation.SortedList;

import java.util.*;

public class HuffmanEncoding {
    StringBuilder message = new StringBuilder("");
    StringBuilder tempMessage = message;
    List<Node> list = new ArrayList<>();

    public HuffmanEncoding(String message){this.message.append(message);}

    public void buildEncodingTree(){// Could pass message here...? TODO <--
        char letter;
        while (tempMessage.length() > 0){
            letter = tempMessage.charAt(0);
            tempMessage.deleteCharAt(0);

            int count = 1;
            int i = 0;
            while(tempMessage.length() > i){
                if (letter == tempMessage.charAt(i)) {
                    tempMessage.deleteCharAt(i);
                    count++;
                    i--;
                }
                i++;
            }
            list.add(new Node(count, letter));
        }

    }



}
