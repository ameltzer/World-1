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
public class chracterClass {
    private String className;
    
    private String mana;
    private String itemCap;
    private List<String> proficientWeapons;

    public chracterClass(String className, String mana, String itemCap, List<String> proficientWeapons) {
        this.className = className;
        this.mana = mana;
        this.itemCap = itemCap;
        this.proficientWeapons = proficientWeapons;
    }

    /**
     * @return the classType
     */
    public String getClassName() {
        return className;
    }

    /**
     * @return the mana
     */
    public String getMana() {
        return mana;
    }

    /**
     * @return the itemCap
     */
    public String getItemCap() {
        return itemCap;
    }

    /**
     * @return the proficientWeapons
     */
    public List<String> getProficientWeapons() {
        return proficientWeapons;
    }
    
    
}