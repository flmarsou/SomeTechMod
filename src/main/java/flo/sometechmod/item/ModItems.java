package flo.sometechmod.item;

import flo.sometechmod.SomeTechMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
	public static final Item COPPER_DUST = register(new Item(new Item.Settings()), "copper_dust");

	public static Item register(Item item, String id)
	{
		Identifier itemID = Identifier.of(SomeTechMod.MOD_ID, id);
		Item registerItem = Registry.register(Registries.ITEM, itemID, item);
		return (registerItem);
	}

	public static void initialize()
	{

	}
}
