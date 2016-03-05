/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

/**
 *
 * @author quantumDrop
 */
public class stats {
    private String Strength;
    private String Dexterity;
    private String Constitution;
    private String Intelligence;
    private String Speed;

    public stats(String Strength, String Dexterity, String Constitution, String Intelligence, String Speed) {
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Constitution = Constitution;
        this.Intelligence = Intelligence;
        this.Speed = Speed;
    }

    /**
     * @return the Strength
     */
    public String getStrength() {
        return Strength;
    }

    /**
     * @return the Dexterity
     */
    public String getDexterity() {
        return Dexterity;
    }

    /**
     * @return the Constitution
     */
    public String getConstitution() {
        return Constitution;
    }

    /**
     * @return the Intelligence
     */
    public String getIntelligence() {
        return Intelligence;
    }

    /**
     * @return the Speed
     */
    public String getSpeed() {
        return Speed;
    }
    
    
}
