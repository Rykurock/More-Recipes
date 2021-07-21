package dansplugins.recipesystem.objects;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import dansplugins.recipesystem.MoreRecipes;

import static org.bukkit.Material.TOTEM_OF_UNDYING;

public class TotemOfUndying {

    MoreRecipes moreRecipes = null;

    public TotemOfUndying(MoreRecipes plugin) {
        moreRecipes = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return moreRecipes.itemstacks.createItemStack(amount, TOTEM_OF_UNDYING, "Totem of Undying", "Used for a second chance at life.");
    }

    public void registerRecipe() {
        NamespacedKey key = new NamespacedKey(moreRecipes, "more_recipes_totem_of_undying");
        ShapedRecipe recipe = new ShapedRecipe(key, getItemStack(1));
        recipe.shape("0D0", "BBB", "EBE");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('B', Material.DIAMOND_BLOCK);
        recipe.setIngredient('E', Material.EMERALD);
        Bukkit.addRecipe(recipe);
    }

}