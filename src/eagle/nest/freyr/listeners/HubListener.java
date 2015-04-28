package eagle.nest.freyr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import eagle.nest.freyr.messages.Prefix;
import eagle.nest.iputils.IPInfo;

public class HubListener implements Listener {

	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		IPInfo.IPData s = IPInfo.getIPData(IPInfo.getPlayerIP(p));
		e.setJoinMessage(Prefix.Join.toString() + "§8>§r " + p.getName() + " joined from " + s.getRegion() + ", " + s.getCountryName());
	}

}
