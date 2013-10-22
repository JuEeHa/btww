package nortti.btww;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public class SharpenedStick extends Item {
	public float damageVsEntity;
	
	public SharpenedStick(int id) {
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("sharpenedstick");
		setTextureName("btww:sharpenedstick");
		setMaxDamage(4);
		this.damageVsEntity=2.0F;
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
