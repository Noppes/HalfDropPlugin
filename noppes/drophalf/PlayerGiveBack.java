package noppes.drophalf;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerGiveBack implements Runnable {
	private List<ItemStack> list;
	private Player player;
	
	public PlayerGiveBack(Player player, List<ItemStack> list){
		this.list = list;
		this.player = player;
	}

	@Override
	public void run() {
		for(ItemStack item : list){
			player.getInventory().addItem(item);
		}
	}

}
