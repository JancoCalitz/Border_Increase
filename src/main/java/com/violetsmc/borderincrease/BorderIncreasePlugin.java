package com.violetsmc.borderincrease;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BorderIncreasePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BorderIncreasePlugin has been enabled!");

        // Save default config if it doesn't exist
        this.saveDefaultConfig();

        getCommand("increaseborder").setExecutor(new IncreaseBorderCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("BorderIncreasePlugin has been disabled.");
    }
}
