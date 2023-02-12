package com.susen36.pvzadd.common.item.sapling;

import com.hungteen.pvz.common.capability.CapabilityHandler;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class WisdomSaplingItem extends XpSaplingItem {
    public WisdomSaplingItem() {
        super();
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if(entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            if(! worldIn.isClientSide) {
                player.getCapability(CapabilityHandler.PLAYER_DATA_CAPABILITY).ifPresent((l) -> {
                            int amount = 300;
                             {
                                l.getPlayerData().addResource(Resources.TREE_XP, amount);
                                PlayerUtil.playClientSound(player, SoundEvents.EXPERIENCE_BOTTLE_THROW);
                                 stack.shrink(1); }
                        }
                );}}
        return stack;
    }
}
