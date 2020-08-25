package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.Obelisk;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OBLItemGroups {
    public static final ItemGroup INTERIOR_DECO = FabricItemGroupBuilder.create(
        new Identifier(Obelisk.modid, "interiordeco"))
            .icon(() -> new ItemStack(OBLItemList.EARTHENWARE_SET))
            .build();
}
