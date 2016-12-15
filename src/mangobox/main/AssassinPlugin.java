package mangobox.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class AssassinPlugin extends JavaPlugin implements Listener {

	public AssassinPlugin() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onEnable() {
		getLogger().info("AssassinPlugin v0.1 by MangoBox has been loaded!");
	}

}
