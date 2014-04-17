package noppes.death;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Death extends JavaPlugin {
	public static Death instance; 
	
	
	@Override
    public void onEnable(){ 
		instance = this;
//		FileConfiguration config = getConfig();
//		config.addDefault("ChatBubbleEventsEnabled", true);
//		config.options().copyDefaults(true);
//		this.saveConfig();
		
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerListener(), this);
        
	    this.getLogger().info("Death plugin has been enabled");
	    
	    
    }
	
	@Override
    public void onDisable(){ 
	    this.getLogger().info("Death plugin has been disabled");
    }
	



}
