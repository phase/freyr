package eagle.nest.freyr;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import eagle.nest.freyr.listeners.HubListener;

public class Hub extends JavaPlugin {
	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new HubListener(), this);
	}
	
	@Override
	public void onDisable() {
	
	}
	
}
