package com.Static;/*
 * @author : Felicity
 * @date : 9:29 PM 10/5/2021
 */

import org.w3c.dom.css.Counter;

import javax.sound.midi.MidiChannel;

public class Demo01Static {



    private int age ;
    private int id ;
    private String name ;
    private static int idConter=0;  //idCounter ++
    static int room=122  ;
    public Demo01Static() {
       this.id=++idConter;

    }

    public Demo01Static(String name , int age  ){
        this.name=name;
        this.age=age;
        this.id=++idConter;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        this.id=id;
        return id;
    }


}
