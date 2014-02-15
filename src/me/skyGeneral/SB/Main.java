package me.skyGeneral.SB;

import me.TheInfoBug.MWL.API.Colorize;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
	public void onDisable(){
		
	}
	
	@EventHandler
	public void onSignPlace(SignChangeEvent e) {
		if(e.getPlayer().hasPermission("mw.signbroadcast")){
			if (e.getLine(0).equalsIgnoreCase("[Broadcast]")) {
	     
	      Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.GRAY + "Broadcast" + ChatColor.RED + "] " + e.getLine(1) + " " + e.getLine(2) + " " + e.getLine(3));
	      }
	    }
	}

}
