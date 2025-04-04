/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Thiwanka-Gaming
 */
public class Sender{
    public Message createMessage(String msg){
        Message message=new Message(msg);
        System.out.println("[Sender]-Message was Created");
        return  message;
    }
}