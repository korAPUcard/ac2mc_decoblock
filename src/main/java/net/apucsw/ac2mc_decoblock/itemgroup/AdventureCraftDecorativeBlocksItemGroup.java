
package net.apucsw.ac2mc_decoblock.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.apucsw.ac2mc_decoblock.block.MetalPillars14Block;
import net.apucsw.ac2mc_decoblock.Ac2mcDecoblockModElements;

@Ac2mcDecoblockModElements.ModElement.Tag
public class AdventureCraftDecorativeBlocksItemGroup extends Ac2mcDecoblockModElements.ModElement {
	public AdventureCraftDecorativeBlocksItemGroup(Ac2mcDecoblockModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabadventure_craft_decorative_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MetalPillars14Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
