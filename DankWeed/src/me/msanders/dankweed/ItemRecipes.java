package me.msanders.dankweed;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class ItemRecipes {
	
	private static DrugItemDeclaration did = (DrugItemDeclaration)Bukkit.getPluginManager().getPlugin("DrugItemDeclaration");
	
	@SuppressWarnings("deprecation")
	public ShapedRecipe craftW(){
		ShapedRecipe wRecipe = new ShapedRecipe(did.weed());
		wRecipe.shape(new String[]{"GGG","CCC","GGG"}).setIngredient('G', Material.GRASS).setIngredient('C', Material.INK_SACK, 2);
		return wRecipe;
	}
}
