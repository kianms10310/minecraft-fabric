package net.fabricmc.tutorial.item.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.tutorial.TutorialMod;
import net.fabricmc.tutorial.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

	public static ItemGroup ab;

	public static void registerItemGroups() {
		ab = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "abc"))
			//.displayName(Text.literal("ABC Group")) 지정
			.displayName(Text.translatable("itemgroup.abc")) // 언어별
			.icon(() -> new ItemStack(ModItems.RAW))
			.build();
	}
}
