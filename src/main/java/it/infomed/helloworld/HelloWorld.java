/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.infomed.helloworld;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author mario
 * commento aggiunto
 * ne aggiungo un altro da github
 * ancora un altro da qui
 */
public class HelloWorld {
    
    protected static final String HELLO_WORLD = "hello world.";
    
    public static void main(String[] args) {
        System.out.println("Ciao Mondo");
        
        for (int i = 5; i < HELLO_WORLD.length(); i++) {
            String sa = StringUtils.abbreviate(HELLO_WORLD, i);
            System.out.println(i + " - " + sa);
        }
    }
}
