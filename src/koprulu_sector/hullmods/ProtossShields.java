package koprulu_sector.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
//import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class ProtossShields extends BaseHullMod{
    
    private static final float SHIELD_UPKEEP_MULTIPLIER = 0f;

    private static final int SHIELD_ARC_BONUS = 360;
    
    @Override
    public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
        stats.getShieldUpkeepMult().modifyMult(id, SHIELD_UPKEEP_MULTIPLIER);
        stats.getShieldArcBonus().modifyFlat(id, SHIELD_ARC_BONUS);
    }

    
    // @Override
    // public String getDescriptionParam(int index, HullSize hullSize) {
    //     switch(index){
    //         case 0: return "" + (int) SHIELD_UPKEEP_MULTIPLIER + "";
    //         case 1: return "" + SHIELD_ARC_BONUS + "";
    //         default: return null;
    //     }
    // }

}
