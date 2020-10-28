package com.github.thebuildteam.obelisk.lists;

import com.github.thebuildteam.obelisk.properties.OBLMerchantSignType;
import net.minecraft.state.property.EnumProperty;

public class OBLProperties {
    public static final EnumProperty<OBLMerchantSignType> MERCHANT_SIGN_TYPE = EnumProperty.of("signtype", OBLMerchantSignType.class);
}
