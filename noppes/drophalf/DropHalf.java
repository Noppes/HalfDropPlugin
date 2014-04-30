package noppes.drophalf;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DropHalf extends JavaPlugin {
	public static DropHalf instance; 
	
	
	@Override
    public void onEnable(){ 
		instance = this;		
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerListener(), this);
        
	    this.getLogger().info("DropHalf plugin has been enabled");
	    
	    
    }
	
	@Override
    public void onDisable(){ 
	    this.getLogger().info("DropHalf plugin has been disabled");
    }
	



}
