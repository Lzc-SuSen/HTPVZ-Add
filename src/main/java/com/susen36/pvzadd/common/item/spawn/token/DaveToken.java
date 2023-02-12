package com.susen36.pvzadd.common.item.spawn.token;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.npc.CrazyDaveEntity;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.boss.dragon.phase.PhaseType;
import net.minecraft.entity.monster.VexEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class DaveToken extends Item {
    public DaveToken() {
        super(new Properties().tab(PVZItemGroups.PVZ_MISC).stacksTo(1));

    }

    private int TickCount;

    private int tick=0;
    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        ItemStack itemstack = context.getItemInHand();
        if (!world.isClientSide && !player.getCooldowns().isOnCooldown(this) && context.getClickedFace() == Direction.UP) {

            CrazyDaveEntity dave = EntityRegister.CRAZY_DAVE.get().create(world);

            EntityUtil.onEntitySpawn(world, dave, pos.above());
            itemstack.shrink(1);
        }


        return ActionResultType.CONSUME;
    }






    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.startUsingItem(handIn);
        return ActionResult.success(playerIn.getItemInHand(handIn));
    }

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.pvzadd.token.use").withStyle(TextFormatting.GRAY));
    }

}
