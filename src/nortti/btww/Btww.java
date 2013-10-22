package nortti.btww;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="btww", name="Better Than Were-Wolves", version="0.4")
@NetworkMod(clientSideRequired=true)
public class Btww {
	@Instance(value="btww")
	public static Btww instance;
	
	@SidedProxy(clientSide="nortti.btww.CommonProxy", serverSide="nortti.btww.CommonProxy")
	public static CommonProxy proxy;
	
	/* Items */
	public final static Item knife=new Knife(5000);
	
	/* Blocks */
	public final static Block nottrappyblock=new NotTrappyBlock(500);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		LanguageRegistry.addName(knife,"Iron Knife");
		GameRegistry.addRecipe(new ItemStack(knife),
		                       "/",
		                       "I",
		                       '/',new ItemStack(Item.ingotIron),'I',new ItemStack(Item.stick));
		LanguageRegistry.addName(nottrappyblock, "Not Trappy Block");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
