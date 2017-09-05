package chathalt.Demonly.me.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import chathalt.Demonly.me.main;
import chathalt.Demonly.me.guis.ChatManagement;
import chathalt.Demonly.me.items.ChatItems;

public class Chat implements CommandExecutor {

	public main pl;
	public ChatManagement chatgui;
	public ChatItems ii;

	public Chat(main instance, ChatManagement guiinstance, ChatItems iinstance) {
		pl = instance;
		chatgui = guiinstance;
		ii = iinstance;
	}

	public boolean onCommand(CommandSender cs, Command cms, String lbl, String[] args) {
		if (lbl.equalsIgnoreCase("Chat")) {

			Player p = (Player) cs;

			p.openInventory(chatgui.ChatManage());
			p.sendMessage("ChatManage - Loaded");

		}
		return false;

	}
}
