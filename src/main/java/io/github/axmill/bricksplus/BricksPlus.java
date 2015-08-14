package io.github.axmill.bricksplus;

import io.github.axmill.bricksplus.blocks.DiamondBricks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import io.github.axmill.bricksplus.blocks.*;

@Mod(modid="bricksplus", name="Bricks Plus", version="1.0.0")
public class BricksPlus
{
	private Block diamondBricks = null;

	void preInit(FMLPreInitializationEvent event)
	{
		diamondBricks = new DiamondBricks(Material.rock).setBlockName("DiamondBricks").setCreativeTab(tabBricksPlus);//.setBlockTextureName("bricksplus:diamondbricks");
		GameRegistry.registerBlock(diamondBricks, diamondBricks.getUnlocalizedName().substring(5));
	}

	void init(FMLInitializationEvent event)
	{
		
	}

	void postInit(FMLPostInitializationEvent event)
	{
		
	}

	CreativeTabs tabBricksPlus = new CreativeTabs("tabBricksPlus")
	{
		@Override
		public Item getTabIconItem()
		{
			return new ItemStack(diamondBricks).getItem();
		}
	};
}
