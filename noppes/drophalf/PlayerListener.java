package noppes.drophalf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {

	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
		if(event.getDrops().size() <= 1 || !event.getEntity().hasPermission("noppes.drophalf"))
			return;
		Player player = event.getEntity();
		List<ItemStack> list = new ArrayList<ItemStack>(event.getDrops());
		Collections.shuffle(list);
		
		
		list = list.subList(0, list.size() / 2);
		for(ItemStack item : list){
			event.getDrops().remove(item);
		}
		Bukkit.getScheduler().scheduleSyncDelayedTask(DropHalf.instance, new PlayerGiveBack(player, list));
	}

}
