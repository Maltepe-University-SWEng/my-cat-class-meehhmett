package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {

    int age;
    int legCount;
    String name;

    //Constructor
    public Cat(int age,int legCount ){
        this.age = age;
        this.legCount = legCount;
    }
    //Setter and Getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getLegCount(){
        return this.legCount;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLegCount(int legCount){
        this.legCount = legCount;
    }
    public void printCatName(){
        System.out.print(this.name);
    }

    public void Meow(){
        try {
            File soundFile = new File("C:\\Users\\Mehmet\\Downloads\\catsound.wav"); // Kedi sesi dosyanın yolu
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}



