package me.msanders.dankweed;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Dye;

public class DrugItemDeclaration {
	
	public ItemStack cactusGreen(){
		Dye gDye = new Dye();
		gDye.setColor(DyeColor.GREEN);
		ItemStack dye = new ItemStack(Material.INK_SACK);
		dye.setData(gDye);
		return dye;
	}
	
	public ItemStack weed(){
		ItemStack weed = cactusGreen();
		ItemMeta weedMeta = weed.getItemMeta();
		List<String> wLore = new ArrayList<String>();
		wLore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Lvl 69 Cannabis");
		weedMeta.setLore(wLore);
		weedMeta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.ITALIC +  "Weed");
		weed.setItemMeta(weedMeta);
		return weed;
	}
	
	public ItemStack dankWeed(){
		ItemStack dankWeed = weed();
		ItemMeta dwMeta = dankWeed.getItemMeta();
		List<String> dwLore = new ArrayList<String>();
		dwLore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "The dankest of weed");
		dwMeta.setLore(dwLore);
		dwMeta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD +  "Dank Weed");
		dankWeed.setItemMeta(dwMeta);
		return dankWeed;
	}

}
