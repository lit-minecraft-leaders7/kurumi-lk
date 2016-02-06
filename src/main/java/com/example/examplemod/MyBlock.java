package com.example.examplemod;

/**
 * Created by miku on 2016/02/06.
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MyBlock extends Block{
    public MyBlock(){
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName(ExampleMod.MODID+"_"+"myblock");
        setBlockTextureName(ExampleMod.MODID+":"+"myblock");
        setHardness(10.0f);
        setResistance(30.0f);
    }
}
