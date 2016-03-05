/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.List;

/**
 *
 * @author quantumDrop
 */
public class weapons {
    private String weaponName;
    private List<String> weaponType;
    private String weaponSubType;
    private String attack;
    private String damage;
    private List<String> ability;
    
    public weapons(String w, List<String> wt, String wst, String a, List<String> ab){
        this.weaponName = w;
        this.weaponType = wt;
        this.weaponSubType = wst;
        this.attack = a;
        this.ability = ab;
    }

    /**
     * @return the weaponName
     */
    public String getWeaponName() {
        return weaponName;
    }

    /**
     * @return the weaponType
     */
    public List<String> getWeaponType() {
        return weaponType;
    }

    /**
     * @return the weaponSubType
     */
    public String getWeaponSubType() {
        return weaponSubType;
    }

    /**
     * @return the attack
     */
    public String getAttack() {
        return attack;
    }

    /**
     * @return the damage
     */
    public String getDamage() {
        return damage;
    }

    /**
     * @return the ability
     */
    public List<String> getAbility() {
        return ability;
    }
    
    
}
