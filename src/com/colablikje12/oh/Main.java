package com.colablikje12.oh;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static ArrayList<String> gemeente = new ArrayList<String>();
	public static ArrayList<String> bouwbedrijf = new ArrayList<String>();
	public static ArrayList<String> inkoop = new ArrayList<String>();
	public static ArrayList<String> tech = new ArrayList<String>();
	public static ArrayList<String> politie = new ArrayList<String>();
	public static ArrayList<String> tpbouwbedrijf = new ArrayList<String>();
	
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new OverheidListener(), this);
		this.getCommand("overheid").setExecutor(new OverheidCommands());
	}
	
}
	
