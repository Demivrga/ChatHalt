package chathalt.Demonly.me.guis;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import chathalt.Demonly.me.main;
import chathalt.Demonly.me.items.ChatItems;

public class ChatManagement {
	
	public main pl;
	public ChatItems ii;

	public ChatManagement(main instance, ChatItems iinstance) {
		pl = instance;
		ii = iinstance;
	}
	
	public Inventory ChatManage() {
		
		
		Inventory inv = Bukkit.createInventory(null, 54, "Chat Management");
			
		inv.setItem(21, ii.getTest1());
		inv.setItem(23, ii.getTest2());
		
		return inv;
	}

}
