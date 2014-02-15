package me.skyGeneral.signs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	public void onPlayerPlaceSign(SignChangeEvent e){
		if(e.getPlayer().hasPermission("mw.ranksign")){
			if(e.getLine(0) == "[ranksign]"){
				Player target = Bukkit.getServer().getPlayer(e.getLine(2));
				String l0 = e.getLine(0);
				String l1 = e.getLine(1);
				String l2 = e.getLine(2);
				String l3 = e.getLine(3);
				e.setLine(0, l1);
				e.setLine(1, l2);
				if(target.isOnline()){
					e.setLine(2, ChatColor.GREEN + "Online");
				}else{
					e.setLine(2, ChatColor.RED + "Offline");
				}
			}
		}
	}
}
