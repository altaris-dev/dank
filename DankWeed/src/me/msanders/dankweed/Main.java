package me.msanders.dankweed;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public DrugItemDeclaration did = new DrugItemDeclaration();
	public ItemRecipes ir = new ItemRecipes();
	
	public void onEnable(){
		try {
			did.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ir.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ShapedRecipe craftW = ir.craftW();
		Bukkit.addRecipe(craftW);
	}
	public void onDisable(){
		Bukkit.getServer().clearRecipes();
	}

}
