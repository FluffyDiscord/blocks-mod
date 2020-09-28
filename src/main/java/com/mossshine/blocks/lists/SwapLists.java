package com.mossshine.blocks.lists;

import com.mossshine.blocks.init.BlocksList;
import net.minecraft.item.Item;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;

public class SwapLists {
    public static ArrayList<ArrayList<Item>> swapLists = new ArrayList<>();

    public static void register(ArrayList<Item> list)
    {
        swapLists.add(list);
    }

    public static ArrayList<ArrayList<Item>> get()
    {
        return swapLists;
    }

    public static void init(final FMLClientSetupEvent event)
    {


        // LIST_0 - 14 items
        ArrayList<Item> LIST_0 = new ArrayList<>();
        LIST_0.add(BlocksList.DEATHCAP_MUSHROOMS.get().asItem());
        LIST_0.add(BlocksList.BEIGE_MUSHROOMS.get().asItem());
        LIST_0.add(BlocksList.AUTUMN_MUSHROOMS.get().asItem());
        LIST_0.add(BlocksList.POISON_BLUE_MUSHROOMS.get().asItem());
        LIST_0.add(BlocksList.GILLED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.SPOTTED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.BEIGE_GILLED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.BEIGE_SPOTTED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.CREAM_GILLED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.CREAM_SPOTTED_MUSHROOM_UNDERBELLIES.get().asItem());
        LIST_0.add(BlocksList.GIANT_MUSHROOM_STEM.get().asItem());
        LIST_0.add(BlocksList.PALM_MUSHROOM_STEM.get().asItem());
        LIST_0.add(BlocksList.SMOOTH_MUSHROOM_STEM.get().asItem());
        LIST_0.add(BlocksList.GIANT_RED_MUSHROOMS.get().asItem());
        register(LIST_0);

        // LIST_1 - 29 items
        ArrayList<Item> LIST_2 = new ArrayList<>();
        LIST_2.add(BlocksList.DEATHCAP_SHROOM.get().asItem());
        LIST_2.add(BlocksList.DEATHCAP_SHROOM_CLUSTERS.get().asItem());
        LIST_2.add(BlocksList.TALL_DEATHCAP_SHROOMS.get().asItem());
        LIST_2.add(BlocksList.AUTUMN_SHROOMS.get().asItem());
        LIST_2.add(BlocksList.TALL_AUTUMN_SHROOMS.get().asItem());
        LIST_2.add(BlocksList.LARGE_BUTTOM_MUSHROOMS.get().asItem());
        LIST_2.add(BlocksList.LARGE_TOADSTOOLS.get().asItem());
        LIST_2.add(BlocksList.ROAMIN_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.TALL_DEATHCAPS.get().asItem());
        LIST_2.add(BlocksList.SMALL_RED_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.SMALL__RED_TOADSTOOLS.get().asItem());
        LIST_2.add(BlocksList.RED_TOADSTOOLS_MINI_CAPS.get().asItem());
        LIST_2.add(BlocksList.TALL_TOADSTOOLS.get().asItem());
        LIST_2.add(BlocksList.SMALL_MIXED_TOADSTOOLS.get().asItem());
        LIST_2.add(BlocksList.SMALL_MIXED_TOADSTOOLS_AND_BEIGE_CAPS.get().asItem());
        LIST_2.add(BlocksList.SMALL_RED_BUTTON_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.SMALL_GOLDEN_TOADSTOOL.get().asItem());
        LIST_2.add(BlocksList.SMALL_GOLDEN_BUTTON_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.SMALL_DEATHCAPS.get().asItem());
        LIST_2.add(BlocksList.SMALL_DEATHCAP_CLUSTERS.get().asItem());
        LIST_2.add(BlocksList.SMALL_BEIGE_BUTTON_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.TOADSTOOLSTYLE_BEIGE_CAPS.get().asItem());
        LIST_2.add(BlocksList.ALL_BEIGE_CAPS.get().asItem());
        LIST_2.add(BlocksList.MIXED_BEIGE_CAPS.get().asItem());
        LIST_2.add(BlocksList.MIXED_BEIGE_CAPS_AND_TOADSTOOLS.get().asItem());
        LIST_2.add(BlocksList.BUTTON_MUSHROOM_CLUSTER.get().asItem());
        LIST_2.add(BlocksList.SMALL_AUTUMN_MUSHROOM.get().asItem());
        LIST_2.add(BlocksList.TALL_AUTUMN_MUSHROOMS.get().asItem());
        LIST_2.add(BlocksList.POISONOUS_MUSHROOM.get().asItem());
        register(LIST_2);

        // LIST_2 - 4 items
        ArrayList<Item> LIST_4 = new ArrayList<>();
        LIST_4.add(BlocksList.SLIME_EGGS.get().asItem());
        LIST_4.add(BlocksList.MEAT_BLOCK.get().asItem());
        LIST_4.add(BlocksList.MODERNSTYLE_SHINGLES.get().asItem());
        LIST_4.add(BlocksList.MODERNSTYLE_WHITEWASHED_SIDING.get().asItem());
        register(LIST_4);

        // LIST_3 - 27 items
        ArrayList<Item> LIST_6 = new ArrayList<>();
        LIST_6.add(BlocksList.WASTELAND_DIRT_CRACKED_EARTH_CHAMOISEE.get().asItem());
        LIST_6.add(BlocksList.DIRT_BASIC_BEIGE.get().asItem());
        LIST_6.add(BlocksList.DIRT_VARIANT_2.get().asItem());
        LIST_6.add(BlocksList.DIRT_VARIANT_3.get().asItem());
        LIST_6.add(BlocksList.FOREST_DIRT.get().asItem());
        LIST_6.add(BlocksList.OKLAHOMA_DIRT.get().asItem());
        LIST_6.add(BlocksList.DRY_COARSE_DIRT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_DRY.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_BRICK.get().asItem());
        LIST_6.add(BlocksList.STONE_COARSE_DIRT_LIGHT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_BRICK_LIGHT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PATH.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PEBBLE.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_DARK.get().asItem());
        LIST_6.add(BlocksList.BRICK_STONE_COARSE_DIRT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_STONED_LIGHT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PATH_2.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PATH_3.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PATH_4.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PATH_5.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PEBBLE_2.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PEBBLE_3.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PEBBLE_4.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_PEBBLE_5.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_RED_TILE_DARK.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_RED_TILE_LIGHT.get().asItem());
        LIST_6.add(BlocksList.COARSE_DIRT_BRICK_RED.get().asItem());
        register(LIST_6);

        // LIST_4 - 20 items
        ArrayList<Item> LIST_8 = new ArrayList<>();
        LIST_8.add(BlocksList.ORANGE_CACTUS.get().asItem());
        LIST_8.add(BlocksList.GREEN_CACTUS.get().asItem());
        LIST_8.add(BlocksList.GREEN_CACTUS_NO_FLOWER.get().asItem());
        LIST_8.add(BlocksList.OLIVE_CACTUS.get().asItem());
        LIST_8.add(BlocksList.OLIVE_CACTUS_NO_FLOWER.get().asItem());
        LIST_8.add(BlocksList.BROWN_CACTUS.get().asItem());
        LIST_8.add(BlocksList.BROWN_CACTUS_NO_FLOWER.get().asItem());
        LIST_8.add(BlocksList.SANDWORM_CACTUS.get().asItem());
        LIST_8.add(BlocksList.SNOWMAN_CACTUS.get().asItem());
        LIST_8.add(BlocksList.GRASS_CACTI.get().asItem());
        LIST_8.add(BlocksList.BRANCHING_GRASS_CACTI.get().asItem());
        LIST_8.add(BlocksList.FAT_CACTUS.get().asItem());
        LIST_8.add(BlocksList.OLIVE_CACTI.get().asItem());
        LIST_8.add(BlocksList.BRANCHING_OLIVE_CACTI.get().asItem());
        LIST_8.add(BlocksList.BROWN_CACTI.get().asItem());
        LIST_8.add(BlocksList.BRANCHING_BROWN_CACTI.get().asItem());
        LIST_8.add(BlocksList.FAT_BROWN_CACTUS.get().asItem());
        LIST_8.add(BlocksList.TALL_BROWN_CACTI.get().asItem());
        LIST_8.add(BlocksList.TALL_GREEN_CACTI.get().asItem());
        LIST_8.add(BlocksList.TALL_OLIVE_CACTI.get().asItem());
        register(LIST_8);

        // LIST_5 - 56 items
        ArrayList<Item> LIST_10 = new ArrayList<>();
        LIST_10.add(BlocksList.LEAVES_VARIANT_2.get().asItem());
        LIST_10.add(BlocksList.LEAVES_PINE_NEEDLES.get().asItem());
        LIST_10.add(BlocksList.LEAVES_POPCORN_GARLAND_NEEDLES.get().asItem());
        LIST_10.add(BlocksList.DECORATED_PINE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_GREEN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.GREEN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.OLIVE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.MOSSY_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_MOSSY_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DEEP_GREEN_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_GREEN_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.GREEN_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.LIGHT_GREEN_BROAD_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_YELLOW_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_ORANGE_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_DARK_ORANGE_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_BROWN_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_RED_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.VIBRANT_PINK_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DYING_LEAVES.get().asItem());
        LIST_10.add(BlocksList.YELLOW_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.ORANGE_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.RED_AUTUMN_LEAVES.get().asItem());
        LIST_10.add(BlocksList.PINK_CHERRY_BLOSSOM_PETALS.get().asItem());
        LIST_10.add(BlocksList.WHITE_CHERRY_BOSSOM_PETALS.get().asItem());
        LIST_10.add(BlocksList.SILVERY_SWAMP_TREE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.SILVERMARCH_SWAMP_TREE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_MANGROVE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_MANGROVE_LEAVES_WITH_FRUIT.get().asItem());
        LIST_10.add(BlocksList.DARK_MANGROVE_LEAVES_WITH_COCOA_PODS.get().asItem());
        LIST_10.add(BlocksList.LIGHT_MANGROVE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.LIGHT_MANGROVE_LEAVES_WITH_FRUIT.get().asItem());
        LIST_10.add(BlocksList.LIGHT_MANGROVE_LEAVES_WITH_COCOA_PODS.get().asItem());
        LIST_10.add(BlocksList.DARK_JUNGLE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_JUNGLE_LEAVES_WITH_FRUIT.get().asItem());
        LIST_10.add(BlocksList.DARK_JUNGLE_LEAVES_WITH_COCOA_PODS.get().asItem());
        LIST_10.add(BlocksList.LIGHT_JUNGLE_LEAVES.get().asItem());
        LIST_10.add(BlocksList.LIGHT_JUNGLE_LEAVES_WITH_FRUIT.get().asItem());
        LIST_10.add(BlocksList.LIGHT_JUNGLE_LEAVES_WITH_COCOA_PODS.get().asItem());
        LIST_10.add(BlocksList.BLOOMING_WHITE_FLOWERS_LEAVES.get().asItem());
        LIST_10.add(BlocksList.DARK_GREEN_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.GREEN_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.LIGHT_GREEN_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.OLIVE_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.YELLOW_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.AUTUMN_YELLOW_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.ORANGE_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.DARK_ORANGE_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.BROWN_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.RED_AUTUMN_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.RED_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.PINK_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.PINK_PETAL_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.WHITE_PETAL_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.SILVER_LEAVES_CLASSIC.get().asItem());
        LIST_10.add(BlocksList.SILVERMARCHES_LEAVES_CLASSIC.get().asItem());
        register(LIST_10);

        // LIST_6 - 10 items
        ArrayList<Item> LIST_12 = new ArrayList<>();
        LIST_12.add(BlocksList.TILLED_SOIL_DRY.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_WET.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_FLOWER.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_PLANT.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_DARK_WET.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_DARK.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_DIRT.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_DIRT_WET.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_RED_WET.get().asItem());
        LIST_12.add(BlocksList.TILLED_SOIL_RED.get().asItem());
        register(LIST_12);

        // LIST_7 - 95 items
        ArrayList<Item> LIST_14 = new ArrayList<>();
        LIST_14.add(BlocksList.ALLIUM_FLOWER.get().asItem());
        LIST_14.add(BlocksList.RED_ROSES.get().asItem());
        LIST_14.add(BlocksList.CLASSIC_ROSE.get().asItem());
        LIST_14.add(BlocksList.CLUSTER_OF_ROSES.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_ROSES.get().asItem());
        LIST_14.add(BlocksList.RED_POPPY_PATCHES.get().asItem());
        LIST_14.add(BlocksList.RED_LONESOME_POPPIES.get().asItem());
        LIST_14.add(BlocksList.WINTER_POINSETTIAS.get().asItem());
        LIST_14.add(BlocksList.BRILLIANT_RED_GINGER.get().asItem());
        LIST_14.add(BlocksList.BRILLIANT_GINGER_PATCHES.get().asItem());
        LIST_14.add(BlocksList.FIERY_TULIPS.get().asItem());
        LIST_14.add(BlocksList.VIBRANT_MARIGOLDS.get().asItem());
        LIST_14.add(BlocksList.ORANGE_WILD_POPPIES.get().asItem());
        LIST_14.add(BlocksList.CLUSTER_OF_ECHINACEA.get().asItem());
        LIST_14.add(BlocksList.ECHINACEA_FIELD_FLOWERS.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_ECHINACEA.get().asItem());
        LIST_14.add(BlocksList.DEEP_YELLOW_BELLFLOWERS.get().asItem());
        LIST_14.add(BlocksList.YELLOW_NASTURTIUMS.get().asItem());
        LIST_14.add(BlocksList.SINGLE_NASTURTIUM.get().asItem());
        LIST_14.add(BlocksList.CLUSTER_OF_NASTURTIUMS.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_NASTURTIUMS.get().asItem());
        LIST_14.add(BlocksList.DARKLEAF_WILD_GOLDEN_ROSES.get().asItem());
        LIST_14.add(BlocksList.WILD_GOLDEN_ROSES.get().asItem());
        LIST_14.add(BlocksList.CREAMYWHITE_PEONIES.get().asItem());
        LIST_14.add(BlocksList.FANCIFUL_NETHER_LEAVES.get().asItem());
        LIST_14.add(BlocksList.LARGE_NETHER_LEAVES.get().asItem());
        LIST_14.add(BlocksList.CREAMY_OXEYE_DAISIES.get().asItem());
        LIST_14.add(BlocksList.WHITE_ROSES.get().asItem());
        LIST_14.add(BlocksList.WHITE_ANENOME.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_ANENOMES.get().asItem());
        LIST_14.add(BlocksList.WILD_PARSLEY_BLOOMS.get().asItem());
        LIST_14.add(BlocksList.BABYS_BREATH.get().asItem());
        LIST_14.add(BlocksList.PALE_HOUSTONIAS.get().asItem());
        LIST_14.add(BlocksList.CLUSTERED_MORNING_GLORIES.get().asItem());
        LIST_14.add(BlocksList.MORNING_FIELD_GLORIES.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_MORNING_GLORIES.get().asItem());
        LIST_14.add(BlocksList.BLUE_CHRYSANTHEMUMS.get().asItem());
        LIST_14.add(BlocksList.BLUE_FLAX.get().asItem());
        LIST_14.add(BlocksList.BLUE_ORCHIDS.get().asItem());
        LIST_14.add(BlocksList.BLUE_HYDRANGEAS.get().asItem());
        LIST_14.add(BlocksList.WILDFLOWERS.get().asItem());
        LIST_14.add(BlocksList.WILDFLOWER_SHRUBBERIES.get().asItem());
        LIST_14.add(BlocksList.SMALL_CLUSTERED_WILDFLOWERS.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_WILDFLOWERS.get().asItem());
        LIST_14.add(BlocksList.PINK_HIBISCUS.get().asItem());
        LIST_14.add(BlocksList.PINK_DASIES.get().asItem());
        LIST_14.add(BlocksList.LIGHT_PURPLE_PAEONIAS.get().asItem());
        LIST_14.add(BlocksList.WILD_PAEONIAS.get().asItem());
        LIST_14.add(BlocksList.SPROUTING_SYRINGA.get().asItem());
        LIST_14.add(BlocksList.ALLIUMS.get().asItem());
        LIST_14.add(BlocksList.PURPLE_VIOLETS.get().asItem());
        LIST_14.add(BlocksList.PURPLE_FIELD_VIOLETS.get().asItem());
        LIST_14.add(BlocksList.GROUND_COVER_VIOLETS.get().asItem());
        LIST_14.add(BlocksList.CATTAILS.get().asItem());
        LIST_14.add(BlocksList.CATTAIL_PATCHES.get().asItem());
        LIST_14.add(BlocksList.SWAMPY_ROOTS.get().asItem());
        LIST_14.add(BlocksList.LEAFY_SPROUTS.get().asItem());
        LIST_14.add(BlocksList.BAOMBOO_SHOOTS.get().asItem());
        LIST_14.add(BlocksList.YELLOWBLUE_HYBRID.get().asItem());
        LIST_14.add(BlocksList.YELLOWRED_HYBRID.get().asItem());
        LIST_14.add(BlocksList.BLUERED_HYBRID.get().asItem());
        LIST_14.add(BlocksList.SMALL_MULTICOLOUR_HYBRID.get().asItem());
        LIST_14.add(BlocksList.MEDIUM_MULTICOLOUR_HYBRID.get().asItem());
        LIST_14.add(BlocksList.LARGE_MULTICOLOUR_HYBRID.get().asItem());
        LIST_14.add(BlocksList.GRAND_MULTICOLOUR_HYBRID.get().asItem());
        LIST_14.add(BlocksList.YELLOW_TULIPS.get().asItem());
        LIST_14.add(BlocksList.YELLOW_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.ORANGE_TULIPS.get().asItem());
        LIST_14.add(BlocksList.ORANGE_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.RED_TULIPS.get().asItem());
        LIST_14.add(BlocksList.RED_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.PURPLE_TULIPS.get().asItem());
        LIST_14.add(BlocksList.PURPLE_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.PINK_TULIPS.get().asItem());
        LIST_14.add(BlocksList.PINK_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.WHITE_TULIPS.get().asItem());
        LIST_14.add(BlocksList.WHITE_TULIP_PATCHES.get().asItem());
        LIST_14.add(BlocksList.SCORCHING_FIRE.get().asItem());
        LIST_14.add(BlocksList.BRILLIANT_STAR.get().asItem());
        LIST_14.add(BlocksList.MONONOKE_SPIRITS.get().asItem());
        LIST_14.add(BlocksList.MARUXS_CAT_FLOWER.get().asItem());
        LIST_14.add(BlocksList.TALL_ROSES.get().asItem());
        LIST_14.add(BlocksList.LEAFY_TALL_ROSES.get().asItem());
        LIST_14.add(BlocksList.GOLDEN_TALL_ROSES.get().asItem());
        LIST_14.add(BlocksList.TALL_PAEONIAS.get().asItem());
        LIST_14.add(BlocksList.TALL_LAVENDER.get().asItem());
        LIST_14.add(BlocksList.PURPLE_TALL_FLAX.get().asItem());
        LIST_14.add(BlocksList.BLUE_TALL_FLAX.get().asItem());
        LIST_14.add(BlocksList.TALL_CATTAILS.get().asItem());
        LIST_14.add(BlocksList.BAMBOO_THICKETS.get().asItem());
        LIST_14.add(BlocksList.CORNSTALKS.get().asItem());
        LIST_14.add(BlocksList.GOLD_SUNFLOWERS.get().asItem());
        LIST_14.add(BlocksList.WHITE_SUNFLOWERS.get().asItem());
        LIST_14.add(BlocksList.RED_SUNFLOWERS.get().asItem());
        LIST_14.add(BlocksList.MIXED_SUNFLOWERS.get().asItem());
        register(LIST_14);

        // LIST_8 - 28 items
        ArrayList<Item> LIST_16 = new ArrayList<>();
        LIST_16.add(BlocksList.BLUE_PINE_SHRUB.get().asItem());
        LIST_16.add(BlocksList.GREEN_PINE_SHRUB.get().asItem());
        LIST_16.add(BlocksList.SHORT_WOODY_SHRUB.get().asItem());
        LIST_16.add(BlocksList.GREEN_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.DARK_GREEN_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.DYING_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.AUTUMN_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.DARK_AUTUMN_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.BLUE_PINE_BUSHES.get().asItem());
        LIST_16.add(BlocksList.GREEN_PINE_BUSHES.get().asItem());
        LIST_16.add(BlocksList.SQUAT_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.MARUXS_CAT_BUSHES.get().asItem());
        LIST_16.add(BlocksList.DARK_GREEN_BUSHES.get().asItem());
        LIST_16.add(BlocksList.GREEN_BUSHES.get().asItem());
        LIST_16.add(BlocksList.DEAD_BUSHES.get().asItem());
        LIST_16.add(BlocksList.AUTUMN_BUSHES.get().asItem());
        LIST_16.add(BlocksList.RED_BUSHES.get().asItem());
        LIST_16.add(BlocksList.DARK_GREEN_JUNGLE_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.GREEN_JUNGLE_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.WHITE_FLOWERED_JUNGLE_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.RED_FLOWER_JUNGLE_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.RED_JUNGLE_SHRUBS.get().asItem());
        LIST_16.add(BlocksList.TROPICAL_FRUITS_BUSHES.get().asItem());
        LIST_16.add(BlocksList.PINEAPPLE_BUSHES.get().asItem());
        LIST_16.add(BlocksList.PINEAPPLE_BUSH.get().asItem());
        LIST_16.add(BlocksList.THIN_TOPIARY_BUSHES.get().asItem());
        LIST_16.add(BlocksList.LARGE_TOPIARY_BUSHES.get().asItem());
        LIST_16.add(BlocksList.SHORT_TOPIARY_BUSHES.get().asItem());
        register(LIST_16);

        // LIST_9 - 15 items
        ArrayList<Item> LIST_18 = new ArrayList<>();
        LIST_18.add(BlocksList.CLASSIC_OAK_LOG.get().asItem());
        LIST_18.add(BlocksList.AGED_LOG.get().asItem());
        LIST_18.add(BlocksList.PECAN_LOG.get().asItem());
        LIST_18.add(BlocksList.REDWOOD_LOG.get().asItem());
        LIST_18.add(BlocksList.WHITE_OAK_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_AGED_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_PECAN_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_REDWOOD_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_WHITE_LOG.get().asItem());
        LIST_18.add(BlocksList.CHERRYWOOD_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_CHERRYWOOD_LOG.get().asItem());
        LIST_18.add(BlocksList.MYSTIC_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_MYSTIC_LOG.get().asItem());
        LIST_18.add(BlocksList.RUSTIC_ACACIA_LOG.get().asItem());
        LIST_18.add(BlocksList.SCREAMING_LOG.get().asItem());
        register(LIST_18);

        // LIST_10 - 50 items
        ArrayList<Item> LIST_20 = new ArrayList<>();
        LIST_20.add(BlocksList.BONSAI_TREE.get().asItem());
        LIST_20.add(BlocksList.CEDAR_BONSAI_TREE.get().asItem());
        LIST_20.add(BlocksList.ROBUST_OAK_TREE.get().asItem());
        LIST_20.add(BlocksList.PALM_TREE.get().asItem());
        LIST_20.add(BlocksList.JUNGLE_TREE.get().asItem());
        LIST_20.add(BlocksList.JUNGLE_FRUIT_SAPLING.get().asItem());
        LIST_20.add(BlocksList.JUNGLE_POD_SAPLING.get().asItem());
        LIST_20.add(BlocksList.LEAFY_SHRUB_SAPLING.get().asItem());
        LIST_20.add(BlocksList.WOODY_SHRUB_SAPLING.get().asItem());
        LIST_20.add(BlocksList.TRADITIONAL_DARK_GREEN_SAPLING.get().asItem());
        LIST_20.add(BlocksList.TRADITIONAL_GREEN_SAPLING.get().asItem());
        LIST_20.add(BlocksList.TRADITIONAL_OLIVE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.YELLOW_TWIG.get().asItem());
        LIST_20.add(BlocksList.RED_TWIG.get().asItem());
        LIST_20.add(BlocksList.PINK_TWIG.get().asItem());
        LIST_20.add(BlocksList.ORANGE_TWIG.get().asItem());
        LIST_20.add(BlocksList.DARK_ORANGE_TWIG.get().asItem());
        LIST_20.add(BlocksList.BROWN_TWIG.get().asItem());
        LIST_20.add(BlocksList.AUTUMN_TWIG.get().asItem());
        LIST_20.add(BlocksList.DEAD_TWIG.get().asItem());
        LIST_20.add(BlocksList.WILDLEAFED_SAPLING.get().asItem());
        LIST_20.add(BlocksList.PINE_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.FIR_SAPLING.get().asItem());
        LIST_20.add(BlocksList.REDWOOD_SAPLING.get().asItem());
        LIST_20.add(BlocksList.TALL_REDWOOD_SAPLING.get().asItem());
        LIST_20.add(BlocksList.DARK_PINE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.SPRUCE_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.CEDAR_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.BROAD_BIRCH_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.DARK_BROAD_BIRCH_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.BIRCH_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.DARK_BIRCH_TREE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.AUTUMN_BIRCH_SAPLING.get().asItem());
        LIST_20.add(BlocksList.DARK_AUTUMN_BIRCH_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_AUTUMN_BROWN_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_DARK_AUTUMN_ORANGE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_AUTUMN_ORANGE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_AUTUMN_PINK_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_AUTUMN_RED_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_AUTUMN_YELLOW_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_DEAD_LEAF_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_ORANGE_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_PINK_PETAL_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_RED_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_SILVERLEAF_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_SILVERMARCHES_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_WHITE_PETAL_SAPLING.get().asItem());
        LIST_20.add(BlocksList.ROBUST_YELLOW_SAPLING.get().asItem());
        LIST_20.add(BlocksList.GREEN_ACACIA_SAPLING.get().asItem());
        LIST_20.add(BlocksList.YELLOW_ACACIA_SAPLING.get().asItem());
        register(LIST_20);

        // LIST_11 - 8 items
        ArrayList<Item> LIST_22 = new ArrayList<>();
        LIST_22.add(BlocksList.BORDERED_CLASSIC_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.SIMPLE_STYLE_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.BORDERED_SIMPLE_STYLE_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.CORN_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.GREEN_GRAPES_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.RED_GRAPES_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.LEAFY_HAY_BALE.get().asItem());
        LIST_22.add(BlocksList.BAMBOO_LEAFY_HAY_BALE.get().asItem());
        register(LIST_22);

        // LIST_12 - 3 items
        ArrayList<Item> LIST_24 = new ArrayList<>();
        LIST_24.add(BlocksList.GREEN_TUFT.get().asItem());
        LIST_24.add(BlocksList.DEAD_TUFT.get().asItem());
        LIST_24.add(BlocksList.AUTUMN_TUFT.get().asItem());
        register(LIST_24);

        // LIST_13 - 9 items
        ArrayList<Item> LIST_26 = new ArrayList<>();
        LIST_26.add(BlocksList.GREEN_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.GREEN_CLASSIC_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.GREEN_DEMI_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.DARK_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.DARK_CLASSIC_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.DARK_DEMI_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.LIGHT_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.LIGHT_CLASSIC_CREEPER_STATUES.get().asItem());
        LIST_26.add(BlocksList.LIGHT_DEMI_CREEPER_STATUES.get().asItem());
        register(LIST_26);

        // LIST_14 - 10 items
        ArrayList<Item> LIST_28 = new ArrayList<>();
        LIST_28.add(BlocksList.SMALL_MAHOGANY_SLATS.get().asItem());
        LIST_28.add(BlocksList.CLASSICSTYLE_MAHOGANY_SLATS.get().asItem());
        LIST_28.add(BlocksList.MAHOGANY_PLANKS.get().asItem());
        LIST_28.add(BlocksList.MAHOGANY_CRATES.get().asItem());
        LIST_28.add(BlocksList.FANCY_MAHOGANY_CRATES.get().asItem());
        LIST_28.add(BlocksList.FANCY_MAHOGANY_PLANKS.get().asItem());
        LIST_28.add(BlocksList.LARGE_MAHOGANY_SLATS.get().asItem());
        LIST_28.add(BlocksList.NAILED_MAHOGANY_SLATS.get().asItem());
        LIST_28.add(BlocksList.LARGE_DARK_WOOD_PANELS.get().asItem());
        LIST_28.add(BlocksList.SMOOTH_SOLID_DARK_WOOD.get().asItem());
        register(LIST_28);

        // LIST_15 - 10 items
        ArrayList<Item> LIST_30 = new ArrayList<>();
        LIST_30.add(BlocksList.SMALL_LIGHT_WOOD_SLATS.get().asItem());
        LIST_30.add(BlocksList.CLASSICSTYLE_LIGHT_WOOD_SLATS.get().asItem());
        LIST_30.add(BlocksList.LIGHT_WOOD_PLANKS.get().asItem());
        LIST_30.add(BlocksList.LIGHT_WOOD_CRATES.get().asItem());
        LIST_30.add(BlocksList.FANCY_LIGHT_WOOD_CRATES.get().asItem());
        LIST_30.add(BlocksList.FANCY_LIGHT_WOOD_PLANKS.get().asItem());
        LIST_30.add(BlocksList.LARGE_LIGHT_WOOD_SLATS.get().asItem());
        LIST_30.add(BlocksList.NAILED_LIGHT_WOOD_SLATS.get().asItem());
        LIST_30.add(BlocksList.LARGE_LIGHT_WOOD_PANELS.get().asItem());
        LIST_30.add(BlocksList.SMOOTH_SOLID_LIGHT_WOOD.get().asItem());
        register(LIST_30);

        // LIST_16 - 10 items
        ArrayList<Item> LIST_32 = new ArrayList<>();
        LIST_32.add(BlocksList.SMALL_UNFINISHED_WOOD_SLATS.get().asItem());
        LIST_32.add(BlocksList.CLASSICSTYLE_UNFINISHED_WOOD_SLATS.get().asItem());
        LIST_32.add(BlocksList.UNFINISHED_WOOD_PLANKS.get().asItem());
        LIST_32.add(BlocksList.UNFINISHED_WOOD_CRATES.get().asItem());
        LIST_32.add(BlocksList.FANCY_UNFINISHED_WOOD_CRATES.get().asItem());
        LIST_32.add(BlocksList.FANCY_UNFINISHED_WOOD_PLANKS.get().asItem());
        LIST_32.add(BlocksList.LARGE_UNFINISHED_WOOD_SLATS.get().asItem());
        LIST_32.add(BlocksList.NAILED_UNFINISHED_WOOD_SLATS.get().asItem());
        LIST_32.add(BlocksList.LARGE_RAW_WOOD_PANELS.get().asItem());
        LIST_32.add(BlocksList.SMOOTH_SOLID_RAW_WOOD.get().asItem());
        register(LIST_32);

        // LIST_17 - 10 items
        ArrayList<Item> LIST_34 = new ArrayList<>();
        LIST_34.add(BlocksList.SMALL_AGED_SLATS.get().asItem());
        LIST_34.add(BlocksList.CLASSICSTYLE_AGED_SLATS.get().asItem());
        LIST_34.add(BlocksList.AGED_PLANKS.get().asItem());
        LIST_34.add(BlocksList.AGED_CRATES.get().asItem());
        LIST_34.add(BlocksList.FANCY_AGED_CRATES.get().asItem());
        LIST_34.add(BlocksList.FANCY_AGED_PLANKS.get().asItem());
        LIST_34.add(BlocksList.LARGE_AGED_SLATS.get().asItem());
        LIST_34.add(BlocksList.NAILED_AGED_SLATS.get().asItem());
        LIST_34.add(BlocksList.LARGE_AGED_WOOD_PANELS.get().asItem());
        LIST_34.add(BlocksList.SMOOTH_SOLID_AGED_WOOD.get().asItem());
        register(LIST_34);

        // LIST_18 - 10 items
        ArrayList<Item> LIST_36 = new ArrayList<>();
        LIST_36.add(BlocksList.SMALL_CHESTNUT_SLATS.get().asItem());
        LIST_36.add(BlocksList.CLASSICSTYLE_CHESTNUT_SLATS.get().asItem());
        LIST_36.add(BlocksList.CHESTNUT_PLANKS.get().asItem());
        LIST_36.add(BlocksList.CHESTNUT_CRATES.get().asItem());
        LIST_36.add(BlocksList.FANCY_CHESTNUT_CRATES.get().asItem());
        LIST_36.add(BlocksList.FANCY_CHESTNUT_PLANKS.get().asItem());
        LIST_36.add(BlocksList.LARGE_CHESTNUT_SLATS.get().asItem());
        LIST_36.add(BlocksList.NAILED_CHESTNUT_SLATS.get().asItem());
        LIST_36.add(BlocksList.LARGE_CHESTNUT_PANELS.get().asItem());
        LIST_36.add(BlocksList.SMOOTH_SOLID_CHESTNUT.get().asItem());
        register(LIST_36);

        // LIST_19 - 10 items
        ArrayList<Item> LIST_38 = new ArrayList<>();
        LIST_38.add(BlocksList.SMALL_PECAN_SLATS.get().asItem());
        LIST_38.add(BlocksList.CLASSICSTYLE_PECAN_SLATS.get().asItem());
        LIST_38.add(BlocksList.PECAN_PLANKS.get().asItem());
        LIST_38.add(BlocksList.PECAN_CRATES.get().asItem());
        LIST_38.add(BlocksList.FANCY_PECAN_CRATES.get().asItem());
        LIST_38.add(BlocksList.FANCY_PECAN_PLANKS.get().asItem());
        LIST_38.add(BlocksList.LARGE_PECAN_SLATS.get().asItem());
        LIST_38.add(BlocksList.NAILED_PECAN_SLATS.get().asItem());
        LIST_38.add(BlocksList.LARGE_PECAN_PANELS.get().asItem());
        LIST_38.add(BlocksList.SMOOTH_SOLID_PECAN.get().asItem());
        register(LIST_38);

        // LIST_20 - 10 items
        ArrayList<Item> LIST_40 = new ArrayList<>();
        LIST_40.add(BlocksList.SMALL_WHITE_SLATS.get().asItem());
        LIST_40.add(BlocksList.CLASSICSTYLE_WHITE_SLATS.get().asItem());
        LIST_40.add(BlocksList.WHITE_PLANKS.get().asItem());
        LIST_40.add(BlocksList.WHITE_CRATES.get().asItem());
        LIST_40.add(BlocksList.FANCY_WHITE_CRATES.get().asItem());
        LIST_40.add(BlocksList.FANCY_WHITE_PLANKS.get().asItem());
        LIST_40.add(BlocksList.LARGE_WHITE_SLATS.get().asItem());
        LIST_40.add(BlocksList.NAILED_WHITE_SLATS.get().asItem());
        LIST_40.add(BlocksList.LARGE_WHITE_PANELS.get().asItem());
        LIST_40.add(BlocksList.SMOOTH_SOLID_WHITE.get().asItem());
        register(LIST_40);

        // LIST_21 - 10 items
        ArrayList<Item> LIST_42 = new ArrayList<>();
        LIST_42.add(BlocksList.SMALL_HAZELNUT_SLATS.get().asItem());
        LIST_42.add(BlocksList.CLASSICSTYLE_HAZELNUT_SLATS.get().asItem());
        LIST_42.add(BlocksList.HAZELNUT_PLANKS.get().asItem());
        LIST_42.add(BlocksList.HAZELNUT_CRATES.get().asItem());
        LIST_42.add(BlocksList.FANCY_HAZELNUT_CRATES.get().asItem());
        LIST_42.add(BlocksList.FANCY_HAZELNUT_PLANKS.get().asItem());
        LIST_42.add(BlocksList.LARGE_HAZELNUT_SLATS.get().asItem());
        LIST_42.add(BlocksList.NAILED_HAZELNUT_SLATS.get().asItem());
        LIST_42.add(BlocksList.LARGE_HAZELNUT_PANELS.get().asItem());
        LIST_42.add(BlocksList.SMOOTH_SOLID_HAZELNUT.get().asItem());
        register(LIST_42);

        // LIST_22 - 10 items
        ArrayList<Item> LIST_44 = new ArrayList<>();
        LIST_44.add(BlocksList.SMALL_ORANGE_SLATS.get().asItem());
        LIST_44.add(BlocksList.CLASSICSTYLE_ORANGE_SLATS.get().asItem());
        LIST_44.add(BlocksList.ORANGE_PLANKS.get().asItem());
        LIST_44.add(BlocksList.ORANGE_CRATES.get().asItem());
        LIST_44.add(BlocksList.FANCY_ORANGE_CRATES.get().asItem());
        LIST_44.add(BlocksList.FANCY_ORANGE_PLANKS.get().asItem());
        LIST_44.add(BlocksList.LARGE_ORANGE_SLATS.get().asItem());
        LIST_44.add(BlocksList.NAILED_ORANGE_SLATS.get().asItem());
        LIST_44.add(BlocksList.LARGE_ORANGE_PANELS.get().asItem());
        LIST_44.add(BlocksList.SMOOTH_SOLID_ORANGE.get().asItem());
        register(LIST_44);

        // LIST_23 - 10 items
        ArrayList<Item> LIST_46 = new ArrayList<>();
        LIST_46.add(BlocksList.SMALL_DARK_STAINED_SLATS.get().asItem());
        LIST_46.add(BlocksList.CLASSICSTYLE_DARK_STAINED_SLATS.get().asItem());
        LIST_46.add(BlocksList.DARK_STAINED_PLANKS.get().asItem());
        LIST_46.add(BlocksList.DARK_STAINED_CRATES.get().asItem());
        LIST_46.add(BlocksList.FANCY_DARK_STAINED_CRATES.get().asItem());
        LIST_46.add(BlocksList.FANCY_DARK_STAINED_PLANKS.get().asItem());
        LIST_46.add(BlocksList.LARGE_DARK_STAINED_SLATS.get().asItem());
        LIST_46.add(BlocksList.NAILED_DARK_STAINED_SLATS.get().asItem());
        LIST_46.add(BlocksList.LARGE_DARK_STAINED_PANELS.get().asItem());
        LIST_46.add(BlocksList.SMOOTH_SOLID_DARK_STAINED.get().asItem());
        register(LIST_46);

        // LIST_24 - 2 items
        ArrayList<Item> LIST_48 = new ArrayList<>();
        LIST_48.add(BlocksList.MYSTIC_WOOD_PLANKS.get().asItem());
        LIST_48.add(BlocksList.FLAT_MYSTIC_WOOD_PANELS.get().asItem());
        register(LIST_48);

    }
}
