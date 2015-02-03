package me.msanders.dankweed;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public DrugItemDeclaration did = new DrugItemDeclaration();
	public ItemRecipes ir = new ItemRecipes();
	
	public void onEnable(){
		new DrugItemDeclaration();
		new ItemRecipes();
		ShapedRecipe craftW = ir.craftW();
		Bukkit.addRecipe(craftW);
	}
	public void onDisable(){
		Bukkit.getServer().clearRecipes();
	}

}
