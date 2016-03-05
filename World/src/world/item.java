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
public class item {
    private String itemName; //name of item. i.e. Health Potion
    private boolean consumable; //consumable items can only be used once. 
    private String ability;
    private String itemSlotCount; //used to determine how many slots an item takes up. 

    public item(String n, boolean c, String a, String isc){
        this.itemName = n;
        this.consumable = c;
        this.ability = a;
        this.itemSlotCount = isc;
    }
    
    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return the consumable
     */
    public boolean isConsumable() {
        return consumable;
    }

    /**
     * @return the ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * @return the itemSlotCount
     */
    public String getItemSlotCount() {
        return itemSlotCount;
    }
    
    
}
