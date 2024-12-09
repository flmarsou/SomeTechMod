package flo.sometechmod.block;

import flo.sometechmod.SomeTechMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
	public static final Block TIN_ORE = register("tin_ore", new Block(AbstractBlock.Settings.create()
		.mapColor(MapColor.STONE_GRAY)
		.instrument(NoteBlockInstrument.BASEDRUM)
		.requiresTool()
		.strength(3.0F, 4.0F)),
		true
	);

	public static Block register(String name, Block block, boolean shouldRegisterItem)
	{
		// Creates the identifier for the block and its item.
		Identifier blockID = Identifier.of(SomeTechMod.MOD_ID, name);

		// Registers the block item.
		if (shouldRegisterItem)
		{
			BlockItem registerBlockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, blockID, registerBlockItem);
		}

		// Registers the block.
		Block registerBlock = Registry.register(Registries.BLOCK, blockID, block);

		return (registerBlock);
	}

	public static void initialize()
	{

	}
}
