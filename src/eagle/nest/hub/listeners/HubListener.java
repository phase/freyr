package eagle.nest.hub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import eagle.nest.hub.messages.MessageManager;
import eagle.nest.hub.messages.Prefix;
import eagle.nest.iputils.IPInfo;

public class HubListener implements Listener {
	
	
	@EventHandler
	public void join(PlayerJoinEvent e){
		Player p = e.getPlayer();
		IPInfo.IPData s = IPInfo.getIPData(IPInfo.getPlayerIP(p));
		MessageManager.broadcast(Prefix.Join, p.getName() + " joined from " +
				s.getCity() + ", " + 
				s.getRegion() + ", " + 
				s.getCountryName());
	}
	
}
