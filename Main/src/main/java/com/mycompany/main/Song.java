/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author kopisto
 */
public class Song {
    
    String title;
    double duration;
    
    public Song (String title, Double duration){
    this.duration=duration;
    this.title=title;
    }
    public Song(){
    
    }
    public String getTitle (){
    return title;
    }
    public double getDuration(){
    return duration;
    }
    @Override
    public String toString(){
    return "Song{"+
            "tittle='"+title+'\''+
            ",duration="+duration+
            '}';
    }
}
