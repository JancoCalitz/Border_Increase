package com.violetsmc.borderincrease;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class IncreaseBorderCommand implements CommandExecutor {

    private final JavaPlugin plugin; // ✅ This is the field that stores your plugin instance

    // ✅ This constructor passes the plugin instance from the main class
    public IncreaseBorderCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!sender.hasPermission("borderincrease.use")) {
            sender.sendMessage("§cYou do not have permission to use this command.");
            return true;
        }

        // Read increase amount from config.yml
        int increaseAmount = plugin.getConfig().getInt("border-increase-amount", 50); // default fallback = 50

        String worldName = plugin.getConfig().getString("world-name", "world"); // default fallback = "world"
        World world = Bukkit.getWorld(worldName);
        if (world == null) {
            sender.sendMessage("§cWorld '" + worldName + "' not found.");
            return true;
        }

        double currentSize = world.getWorldBorder().getSize();
        double newSize = currentSize + increaseAmount;
        world.getWorldBorder().setSize(newSize);

        sender.sendMessage("§aWorld border increased by " + increaseAmount + " blocks.");
        return true;
    }
}
