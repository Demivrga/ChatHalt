package chathalt.Demonly.me.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import chathalt.Demonly.me.main;

public class ChatItems {
	

	public main pl;

	public ChatItems(main instance) {
		pl = instance;
	}

	public ItemStack getTest1() {
		ItemStack Stone = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta StoneMeta = Stone.getItemMeta();
		
		Stone.setDurability((short)14);

		StoneMeta.setDisplayName("Slow Chat");

		Stone.setItemMeta(StoneMeta);
		return Stone;
	}
	
	public ItemStack getTest2() {
		ItemStack Stone = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta StoneMeta = Stone.getItemMeta();

		StoneMeta.setDisplayName("Mute Chat");

		Stone.setItemMeta(StoneMeta);
		return Stone;
	}

}
