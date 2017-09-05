package chathalt.Demonly.me.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import chathalt.Demonly.me.main;
import chathalt.Demonly.me.guis.ChatManagement;
import chathalt.Demonly.me.items.ChatItems;

public class ItemActions implements Listener {

	public main pl;
	public ChatManagement chatgui;
	public ChatItems ii;

	public ItemActions(main instance, ChatItems iinstance) {
		pl = instance;
		ii = iinstance;
	}

	@EventHandler
	public void onAction(InventoryClickEvent ev) {

		if (ev.getInventory().getTitle().equals("Chat Management")) {
			if (ev.getCurrentItem().equals(ii.getTest1())) {
				// do stuff

				Bukkit.broadcastMessage("Item 1 usage");
			}
		}

		if (ev.getInventory().getTitle().equals("Chat Management")) {
			if (ev.getCurrentItem().equals(ii.getTest2())) {
				// do stuff

				Bukkit.broadcastMessage("Item 2 usage");
			}
		}

	}

}
