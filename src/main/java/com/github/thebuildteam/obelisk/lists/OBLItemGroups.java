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

    public static final ItemGroup OBELISK_BLOCKS = FabricItemGroupBuilder.create(
        new Identifier(Obelisk.modid, "obeliskblocks"))
            .icon(() -> new ItemStack(OBLItemList.EARTH_OBELISK_BLOCK))
            .build();

    public static final ItemGroup MISCELLANEOUS = FabricItemGroupBuilder.create(
        new Identifier(Obelisk.modid, "obeliscmisc"))
            .icon(() -> new ItemStack(OBLItemList.COPPER_COIN))
            .build();
}
