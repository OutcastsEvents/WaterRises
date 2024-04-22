package dev.acronical.waterrises;

import dev.acronical.waterrises.commands.PluginCommands;
import dev.acronical.waterrises.events.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class WaterRises extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PluginEvents(), this);
        PluginCommands commands = new PluginCommands();
        getCommand("waterrise").setExecutor(commands);
        getCommand("waterinit").setExecutor(commands);
        getServer().getConsoleSender().sendMessage("[WaterRises by Acronical] - Plugin Enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[WaterRises by Acronical] - Plugin Disabled");
    }
}
