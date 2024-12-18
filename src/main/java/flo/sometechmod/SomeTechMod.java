package flo.sometechmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flo.sometechmod.block.ModBlocks;
import flo.sometechmod.item.ModItems;

public class SomeTechMod implements ModInitializer
{
	public static final String MOD_ID = "sometechmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.initialize();
		ModBlocks.initialize();
	}
}
