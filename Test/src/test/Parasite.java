/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author chintan
 */
 

import java.io.IOException;

public class Parasite {
    public static void move()
    {
     System.out.println("YO from PARASITE");   
    }
    public static void checkpoint(String methodname) throws IOException {
        System.out.println("I want a CHKPT after ");
        String command = "./chkptplugin";
        Process process = Runtime.getRuntime().exec(command);
    }
}