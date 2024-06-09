package me.penguin.wunbreakable;

import me.penguin.wunbreakable.API.MessageManager;
import me.penguin.wunbreakable.Listeners.PlayerItemDamageListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WUnbreakable extends JavaPlugin {

    private MessageManager messageManager;

    @Override
    public void onEnable() {
        messageManager = new MessageManager(this);
        messageManager.sendLog("info", "WUnbreakable enabled!");

        PlayerItemDamageListener playerItemDamageListener = new PlayerItemDamageListener();
        Bukkit.getPluginManager().registerEvents(playerItemDamageListener, this);

    }

    @Override
    public void onDisable() {
        messageManager.sendLog("info", "WUnbreakable disabled!");
    }
}
