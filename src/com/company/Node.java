package com.company;
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/26/2018
 *Time: 11:21 AM
 *Contact: nmgaultney@gmail.com
 */

public class Node {
    int frequency;
    char character;

    public Node(int freq, char letter){
        frequency = freq;
        character = letter;
    }



    public void setFrequency(int num){ frequency = num;}
    public int getFrequency(){return frequency;}

    public void setCharacter(char letter) {character = letter;}
    public char getCharacter() {return character;}
}
