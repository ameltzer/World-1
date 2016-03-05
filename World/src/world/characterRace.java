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
public class characterRace {
    private String raceName;
    private List<String> passiveAbilities;
    private List<String> daily;

    public characterRace(String raceName, List<String> passiveAbilities, List<String> daily) {
        this.raceName = raceName;
        this.passiveAbilities = passiveAbilities;
        this.daily = daily;
    }
    
    public String getRaceName() {
        return raceName;
    }

    public List<String> getPassiveAbilities() {
        return passiveAbilities;
    }

    public List<String> getDaily() {
        return daily;
    }

}
