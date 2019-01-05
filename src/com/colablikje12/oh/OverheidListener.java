package com.colablikje12.oh;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OverheidListener implements Listener {
	public OverheidListener() {
		
	}
	
	@EventHandler
	public void Login(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		
		if (player.hasPermission("cv.overheid.gemeente")) {
			Main.gemeente.add(name);
		}
		
		if (player.hasPermission("cv.overheid.inkoop")) {
			Main.inkoop.add(name);
		}

		if (player.hasPermission("cv.overheid.bouwbedrijf")) {
			Main.bouwbedrijf.add(name);
		}
		
		if (player.hasPermission("cv.overheid.tech")) {
			Main.tech.add(name);
		}
		
		if (player.hasPermission("cv.overheid.politie")) {
			Main.politie.add(name);
		}
		
		if (player.hasPermission("cv.overheid.tpbouwbedrijf")) {
			Main.tpbouwbedrijf.add(name);
		}
		
	}
	
	@EventHandler
	public void leave (PlayerQuitEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		
		if (player.hasPermission("cv.overheid.gemeente")) {
			Main.gemeente.remove(name);
		}
		
		if (player.hasPermission("cv.overheid.inkoop")) {
			Main.inkoop.remove(name);
		}

		if (player.hasPermission("cv.overheid.bouwbedrijf")) {
			Main.bouwbedrijf.remove(name);
		}
		
		if (player.hasPermission("cv.overheid.tech")) {
			Main.tech.remove(name);
		}
		
		if (player.hasPermission("cv.overheid.politie")) {
			Main.politie.remove(name);
		}
		
		if (player.hasPermission("cv.overheid.tpbouwbedrijf")) {
			Main.tpbouwbedrijf.remove(name);
		}
		
	}
}

