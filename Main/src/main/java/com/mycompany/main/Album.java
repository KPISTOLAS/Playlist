/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author kopisto
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
 
    public Album (String name, String artist){
    this.name=name;
    this.artist=artist;
    this.songs=new ArrayList<>();
    }
    public Album(){
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
        songs.add(new Song(title,duration));
        System.out.println(title+"Successfully added");
        return true;
        }
        else {
            System.out.println("Song already exist");
        return false;
        }
    }
    public Song findSong(String title){
    for(Song checkedSong : songs){
    if(checkedSong.getTitle().equals(title)) {
        return checkedSong;
    
    }
    
    }
    return null;
    }
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index= trackNumber -1;
        if (index>0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
       System.out.println("This album does not have this song");
       return false;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
      for(Song checkedSong : this.songs){
        if(checkedSong.getTitle().equalsIgnoreCase(title)){
            PlayList.add(checkedSong);
            return true;
        }
      }   
      System.out.println("There is no such song");
      return false;
    
    }
    
}
