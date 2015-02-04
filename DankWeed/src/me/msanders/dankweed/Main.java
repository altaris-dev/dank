package me.msanders.dankweed;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static DrugItemDeclaration did = new DrugItemDeclaration();
	public static ItemRecipes ir = new ItemRecipes();
	
	public void onEnable(){
		try {
			this.getClass().getClassLoader().loadClass(did.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.getClass().getClassLoader().loadClass(ir.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ShapedRecipe craftW = ir.craftW();
		Bukkit.addRecipe(craftW);
	}
	public void onDisable(){
		Bukkit.getServer().clearRecipes();
	}

}
