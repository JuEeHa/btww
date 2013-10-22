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
		setTextureName("minecraft:planks_oak"); /* TEMP */
		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 0.6F, 0.8F);
	}
	
	public boolean renderAsNormalBlock() { return false; }
	public boolean isOpaqueCube() { return false; }
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		entity.attackEntityFrom(DamageSource.generic, 1.0F);
	}
}
