/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyBuilder;

/**
 *
 * @author veese
 */
public class Monster { 
    //Constructor
    public Monster(String race, String desc, String atk){
        this.race = race;
        this.desc = desc;
        this.atk = atk;
    }
    
    //setters and getters
    public void setRace(String race){
        this.race = race;
    }
    
    public String getRace(){
        return this.race;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    //setters and getters
    public void setAtk(String atk){
        this.atk = atk;
    }
    
    public String getAtk(){
        return this.atk;
    }
    
    //Overiding the to string, for easy printing
    @Override
    public String toString(){
        return "Race: " + this.getRace() + "\n" + "Description: " + this.getDesc() + "\n" + "Attack Power: " + this.getAtk();
    }
    
    //Attributes of class
    private String race;
    private String desc;
    private String atk;
   
}

