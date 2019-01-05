package com.colablikje12.oh;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OverheidCommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m---------------------------------------"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&lOverheid lijst"));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Gemeente: " + ChatColor.WHITE + Main.gemeente.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
       		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Inkoop: " + ChatColor.WHITE + Main.inkoop.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
       	 	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Bouwbedrijf: " + ChatColor.WHITE + Main.bouwbedrijf.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Politie: " + ChatColor.WHITE + Main.politie.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Tech: " + ChatColor.WHITE + Main.tech.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Bouwbedrijf TP: " + ChatColor.WHITE + Main.tpbouwbedrijf.toString().replaceAll("\\[", "").replaceAll("\\]", "")));
        	sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m---------------------------------------"));	
		
		return true;
	}

}
