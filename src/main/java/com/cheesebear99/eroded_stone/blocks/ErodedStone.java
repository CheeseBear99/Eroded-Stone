package com.cheesebear99.eroded_stone.blocks;
;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ErodedStone extends Block {
    public ErodedStone() {
        super(AbstractBlock.Properties.of(Material.STONE)
                .strength(1.5f, 6.0f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }
}
