package com.susen36.pvzadd.common.item.sapling;

import com.hungteen.pvz.common.capability.CapabilityHandler;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class XpSaplingItem extends Item {




	public XpSaplingItem() {
		super(new Properties().tab(PVZItemGroups.PVZ_USEFUL).stacksTo(1));

	}



	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.startUsingItem(handIn);
	    return ActionResult.success(playerIn.getItemInHand(handIn));
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		if(entityLiving instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) entityLiving;
			if(! worldIn.isClientSide) {
				player.getCapability(CapabilityHandler.PLAYER_DATA_CAPABILITY).ifPresent((l) -> {
					int amount = 100;
					 {
					l.getPlayerData().addResource(Resources.TREE_XP, amount);
					PlayerUtil.playClientSound(player, SoundEvents.EXPERIENCE_BOTTLE_THROW);
					stack.shrink(1);}
					}
				);}}
		return stack;
	}
	




	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.pvzadd.xp_sapling.use").withStyle(TextFormatting.GREEN));

      }
	


	
	@Override
	public UseAction getUseAnimation(ItemStack stack) {
		return UseAction.EAT;
	}
	
	@Override
	public int getUseDuration(ItemStack stack) {
		return 50;
	}
	



}
