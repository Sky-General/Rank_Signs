package me.skyGeneral.signs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	@EventHandler
	public void onPlayerPlaceSign(SignChangeEvent e){
		Player player = (Player) Bukkit.getOfflinePlayer(e.getLine(3));
		if(player.hasPlayedBefore()){
			if(player.isOnline()){
				Bukkit.broadcastMessage(ChatColor.GREEN + "Online!");
				}
			else{
				Bukkit.broadcastMessage(ChatColor.RED + "Offline");
			}
		
			
		}
	}
}
