package eagle.nest.hub.messages;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class MessageManager {
	
	public static void sendMessage(Player p, Prefix pre, String text){
		p.sendMessage(pre.toString() + "§8>§r " + text);
	}
	
	public static void broadcast(Prefix p, String text){
		Bukkit.broadcastMessage(p.toString() + "§8>§r " + text);
	}
	
}
