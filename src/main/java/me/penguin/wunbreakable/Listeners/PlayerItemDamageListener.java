package me.penguin.wunbreakable.Listeners;

import me.penguin.wunbreakable.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerItemDamageListener implements Listener {

    @EventHandler
    private void playerItemDamageEvent(PlayerItemDamageEvent event){
        ItemStack item = event.getItem();
        if (Utils.isArmor(item.getType()) ||
            Utils.isWeapon(item.getType()) ||
            Utils.isTool(item.getType()) ||
            Utils.isOther(item.getType()) ){

            event.setDamage(0);

        }

    }
}
