package me.blueb8h.bluecore;

import org.bukkit.plugin.java.JavaPlugin;

public class BlueCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BlueCore enabled successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BlueCore disabled.");
    }
}
