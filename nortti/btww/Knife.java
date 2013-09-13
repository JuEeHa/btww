package nortti.btww;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Knife extends Item {
	public Knife(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("knife");
		func_111206_d("btww:knife");
	}
}
