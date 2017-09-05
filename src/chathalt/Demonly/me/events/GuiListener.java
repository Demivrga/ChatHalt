package chathalt.Demonly.me.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

import chathalt.Demonly.me.main;

public class GuiListener implements Listener {

	public main pl;

	public GuiListener(main instance) {
		pl = instance;
	}

	@EventHandler
	public void InvClick(InventoryClickEvent ev) {

		if (ev.getInventory().getName().equals("Chat Management")) {
			ev.setCancelled(true);
		}

	}

	@EventHandler
	public void InvDrag(InventoryDragEvent ev) {

		if (ev.getInventory().getName().equals("Chat Management")) {
			ev.setCancelled(true);
		}

	}

}
