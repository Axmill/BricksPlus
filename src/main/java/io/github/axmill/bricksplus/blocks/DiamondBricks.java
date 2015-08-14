package io.github.axmill.bricksplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DiamondBricks extends Block
{
	public DiamondBricks(Material material)
	{
		super(material);
		this.setResistance(15F); // Resists some explosions
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 2); // 3 is diamond
		this.setLightLevel(0F);
		this.setStepSound(this.soundTypeStone);
	}
}
