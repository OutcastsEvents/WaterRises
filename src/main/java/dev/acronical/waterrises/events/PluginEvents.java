package dev.acronical.waterrises.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PluginEvents implements Listener {

    @EventHandler
    public void onPlayerSwim(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        World world = player.getWorld();
        Location loc = player.getLocation();
        if (loc.getBlock().isLiquid() && loc.getBlock().getType() == Material.WATER) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 1, true, false, true));
        }
    }
}