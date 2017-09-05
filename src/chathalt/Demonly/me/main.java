package chathalt.Demonly.me;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import chathalt.Demonly.me.commands.Chat;
import chathalt.Demonly.me.events.ItemActions;
import chathalt.Demonly.me.events.GuiListener;
import chathalt.Demonly.me.guis.ChatManagement;
import chathalt.Demonly.me.items.ChatItems;


	public class main extends JavaPlugin {
		

		public PluginManager pm;
		public FileConfiguration config = this.getConfig();

		public void onEnable() {

	        pm = Bukkit.getPluginManager();
	        //this.saveDefaultConfig();
	        
	        pm.registerEvents(new GuiListener(this), this);
	        this.getCommand("Chat").setExecutor(new Chat(this, new ChatManagement(this, new ChatItems(this)), new ChatItems(this)));
	        pm.registerEvents(new ItemActions(this, new ChatItems(this)), this);
	        
	        
	        System.out.println("[ChatHalt]: Has been enabled!");
	    	
		}

		public void onDisable() {

			System.out.println("[ChatHalt]: Has been disabled!");
			getConfig().options().copyHeader(true);

		}

	}
	
