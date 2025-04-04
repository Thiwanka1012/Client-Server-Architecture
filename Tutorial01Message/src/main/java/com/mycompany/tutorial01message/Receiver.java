/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Thiwanka-Gaming
 */
public class Receiver {
    public void recieveMessage(Message msg){
        
        System.out.println("[RECIEVER]-Message Recieved");
        System.out.println("Recieved Message - "+msg.getContent());
    }
    
}
