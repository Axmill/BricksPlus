package io.github.axmill.bricksplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DirtBricks extends Block
{

	protected DirtBricks(Material material)
	{
		super(material);
		this.setResistance(0F);
		this.setHardness(1F);
	}

}
