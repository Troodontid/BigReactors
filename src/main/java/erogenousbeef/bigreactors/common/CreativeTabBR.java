package erogenousbeef.bigreactors.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBR extends CreativeTabs {

	public CreativeTabBR(String par2Str)
	{
		super(par2Str);
	}

	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(BigReactors.blockYelloriumFuelRod);
	}
}
