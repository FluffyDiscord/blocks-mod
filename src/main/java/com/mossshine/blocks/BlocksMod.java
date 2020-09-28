package com.mossshine.blocks;

import com.mossshine.blocks.blocks.DynamicBlockModel;
import com.mossshine.blocks.init.BlocksList;
import com.mossshine.blocks.init.Registration;
import com.mossshine.blocks.lists.SwapLists;
import com.mossshine.blocks.network.PacketManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.inventory.CreativeScreen;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod(BlocksMod.MOD_ID)
public class BlocksMod
{
    public static final String MOD_ID = "blocks";
    public static final PacketManager packetManager = new PacketManager();
    public static final ItemGroup itemGroup = new ItemGroup(MOD_ID + "_mod_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlocksList.MARUXS_CAT_FLOWER.get());
        }
    };

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public BlocksMod() {
        Registration.register();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlocksList::setCutoutRenderLayers);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SwapLists::init);
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlocksMod::onModelBakeEvent);

        packetManager.initialize();

    }

    // Called after all the other baked block models have been added to the modelRegistry
    // Allows us to manipulate the modelRegistry before BlockModelShapes caches them.
//    @SubscribeEvent
//    public static void onModelBakeEvent(ModelBakeEvent event)
//    {
//        event.getModelRegistry().put("")
//        // Find the existing mappings for CamouflageBakedModel - they will have been added automatically because
//        //  of our blockstates file for the BlockCamouflage.
//        // Replace the mapping with our CamouflageBakedModel.
//        // we only have one BlockState variant but I've shown code that loops through all of them, in case you have more than one.
//
//        for (BlockState blockState : BlocksList.BLOCK_CAMOUFLAGE.get().getStateContainer().getValidStates()) {
//            ModelResourceLocation variantMRL = BlockModelShapes.getModelLocation(blockState);
//            IBakedModel existingModel = event.getModelRegistry().get(variantMRL);
//            if (existingModel == null) {
//                LOGGER.warn("Did not find the expected vanilla baked model(s) for blockCamouflage in registry");
//            } else if (existingModel instanceof DynamicBlockModel) {
//                LOGGER.warn("Tried to replace CamouflagedBakedModel twice");
//            } else {
//                DynamicBlockModel customModel = new DynamicBlockModel(existingModel);
//                event.getModelRegistry().put(variantMRL, customModel.getBakedModel());
//            }
//        }
//    }
}
