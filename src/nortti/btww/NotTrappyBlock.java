package nortti.btww;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class NotTrappyBlock extends Block {
	public NotTrappyBlock(int id) {
		super(id, Material.wood);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.5F);
		setUnlocalizedName("nottrappyblock");
		setTextureName("dirt"); /* TEMP */
	}
	
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity) {
		entity.attackEntityFrom(DamageSource.generic, 1.0F);
	}
}
