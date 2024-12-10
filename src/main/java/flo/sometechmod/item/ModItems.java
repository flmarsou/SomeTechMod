package flo.sometechmod.item;

import flo.sometechmod.SomeTechMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
	public static final Item COPPER_DUST = register("raw_tin", new Item(new Item.Settings()));

	public static Item register(String name, Item item)
	{
		// Creates the identifier for the item.
		Identifier itemID = Identifier.of(SomeTechMod.MOD_ID, name);

		// Registers the item.
		Item registerItem = Registry.register(Registries.ITEM, itemID, item);

		return (registerItem);
	}

	public static void initialize()
	{

	}
}
