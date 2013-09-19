package nortti.btww;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public class Knife extends Item {
	public float damageVsEntity;
	
	public Knife(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("knife");
		func_111206_d("btww:knife");
		setMaxDamage(128);
		this.damageVsEntity=5.0F;
	}
	
	/* Damage against entities */
	public float getDamageVsEntity(Entity i, ItemStack j) {
		return this.damageVsEntity;
	}
	
	public boolean hitEntity(ItemStack i, EntityLivingBase j, EntityLivingBase k) {
		i.damageItem(1,k);
		return true;
	}
	public Multimap func_111205_h() {
		Multimap multimap = super.func_111205_h();
		multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.damageVsEntity, 0));
		return multimap;
	}
}
