package eagle.nest.hub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import eagle.nest.hub.messages.MessageManager;
import eagle.nest.hub.messages.Prefix;
import eagle.nest.hub.util.skIP.SkIP;

public class HubListener implements Listener {
	
	
	@EventHandler
	public void join(PlayerJoinEvent e){
		Player p = e.getPlayer();
		SkIP.SkIPData s = SkIP.getIPData(SkIP.getPlayerIP(p));
		MessageManager.broadcast(Prefix.Join, p.getName() + " joined from " +
		s.getRegion() + ", " + 
		s.getCountryName());
	}
	
}
