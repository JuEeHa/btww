package nortti.btww;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public class SharpenedPole extends Item {
	public float damageVsEntity;
	
	public SharpenedPole(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("sharpenedpole");
		setTextureName("btww:sharpenedpole");
		setMaxDamage(64);
		this.damageVsEntity=3.0F;
	}
	
	/* Damage against entities */
	public float getDamageVsEntity(Entity i, ItemStack j) {
		return this.damageVsEntity;
	}
	
	public boolean hitEntity(ItemStack i, EntityLivingBase j, EntityLivingBase k) {
		i.damageItem(1,k);
		return true;
	}
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.damageVsEntity, 0));
		return multimap;
	}
}
