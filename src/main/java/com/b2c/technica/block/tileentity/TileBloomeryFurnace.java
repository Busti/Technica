package com.b2c.technica.block.tileentity;

    import net.minecraft.client.Minecraft;
    import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.tileentity.TileEntity;
    import net.minecraft.util.text.TextComponentString;

public class TileBloomeryFurnace extends TileEntity implements ITickable {
    @Override
        public void tick() {
            if (worldObj.isRemote) {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new TextComponentString("Test"));
            }
    }
}
