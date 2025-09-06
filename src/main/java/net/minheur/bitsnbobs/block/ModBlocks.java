package net.minheur.bitsnbobs.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import net.minheur.bitsnbobs.BitsNBobs;
import net.minheur.bitsnbobs.item.ModItems;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BitsNBobs.MOD_ID);

    public static ToIntFunction<BlockState> lightLevel = BlockState2 -> 15;


    public static final RegistryObject<Block> WHITE_LIGHT_BLOCK = ModBlocks.registerBlock("white_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> LIGHT_GRAY_LIGHT_BLOCK = ModBlocks.registerBlock("light_gray_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> GRAY_LIGHT_BLOCK = ModBlocks.registerBlock("gray_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> BLACK_LIGHT_BLOCK = ModBlocks.registerBlock("black_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> RED_LIGHT_BLOCK = ModBlocks.registerBlock("red_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> ORANGE_LIGHT_BLOCK = ModBlocks.registerBlock("orange_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> YELLOW_LIGHT_BLOCK = ModBlocks.registerBlock("yellow_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> LIME_LIGHT_BLOCK = ModBlocks.registerBlock("lime_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> GREEN_LIGHT_BLOCK = ModBlocks.registerBlock("green_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> CYAN_LIGHT_BLOCK = ModBlocks.registerBlock("cyan_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> LIGHT_BLUE_LIGHT_BLOCK = ModBlocks.registerBlock("light_blue_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> BLUE_LIGHT_BLOCK = ModBlocks.registerBlock("blue_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> PURPLE_LIGHT_BLOCK = ModBlocks.registerBlock("purple_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> MAGENTA_LIGHT_BLOCK = ModBlocks.registerBlock("magenta_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> PINK_LIGHT_BLOCK = ModBlocks.registerBlock("pink_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));
    public static final RegistryObject<Block> BROWN_LIGHT_BLOCK = ModBlocks.registerBlock("brown_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel)));

    public static final RegistryObject<Block> WHITE_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("white_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> LIGHT_GRAY_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("light_gray_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> GRAY_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("gray_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> BLACK_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("black_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> RED_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("red_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> ORANGE_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("orange_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("yellow_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> LIME_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("lime_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> GREEN_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("green_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> CYAN_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("cyan_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> LIGHT_BLUE_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("light_blue_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> BLUE_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("blue_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("purple_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("magenta_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> PINK_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("pink_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));
    public static final RegistryObject<Block> BROWN_GLASS_LIGHT_BLOCK = ModBlocks.registerBlock("brown_glass_light_block",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GLASS).lightLevel(lightLevel).noOcclusion()));

    public static final RegistryObject<Block> IRON_PLATING_BLOCK = ModBlocks.registerBlock("iron_plating_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHAIN)));

    public static final RegistryObject<Block> IRON_GRATE_BLOCK = ModBlocks.registerBlock("iron_grate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> INDUSTRIAL_IRON_GRATE_BLOCK = ModBlocks.registerBlock("industrial_iron_grate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> ANDESITE_GRATE_BLOCK = ModBlocks.registerBlock("andesite_grate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));

    public static final RegistryObject<Block> MULCH_BLOCK = ModBlocks.registerBlock("mulch_block",
            () -> new PlantableBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> COMPRESSED_MULCH_BLOCK = ModBlocks.registerBlock("compressed_mulch_block",
            () -> new PlantableBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> AGED_COMPRESSED_MULCH_BLOCK = ModBlocks.registerBlock("aged_compressed_mulch_block",
            () -> new PlantableBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> HOT_AGED_COMPRESSED_MULCH_BLOCK = ModBlocks.registerBlock("hot_aged_compressed_mulch_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> HOT_COAL_BLOCK = ModBlocks.registerBlock("hot_coal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK = ModBlocks.registerBlock("compressed_coal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> HOT_COMPRESSED_COAL_BLOCK = ModBlocks.registerBlock("hot_compressed_coal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));

    public static final RegistryObject<Block> THATCH_BLOCK = ModBlocks.registerBlock("thatch_block",
            () -> new ThatchBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).ignitedByLava()));
    public static final RegistryObject<Block> WAXED_THATCH_BLOCK = ModBlocks.registerBlock("waxed_thatch_block",
            () -> new WaxedThatchBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> AGED_THATCH_BLOCK = ModBlocks.registerBlock("aged_thatch_block",
            () -> new AgedThatchBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).m_60977_()));
    public static final RegistryObject<Block> WAXED_AGED_THATCH_BLOCK = ModBlocks.registerBlock("waxed_aged_thatch_block",
            () -> new WaxedAgedThatchBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> OLD_THATCH_BLOCK = ModBlocks.registerBlock("old_thatch_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<Block> DIRT_LAYERS_BLOCK = ModBlocks.registerBlock("dirt_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> COARSE_DIRT_LAYERS_BLOCK = ModBlocks.registerBlock("coarse_dirt_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYERS_BLOCK = ModBlocks.registerBlock("rooted_dirt_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> MUD_LAYERS_BLOCK = ModBlocks.registerBlock("mud_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> MUDDY_MANGROVE_ROOTS_LAYERS_BLOCK = ModBlocks.registerBlock("muddy_mangrove_roots_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> MULCH_LAYERS_BLOCK = ModBlocks.registerBlock("mulch_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> GRAVEL_LAYERS_BLOCK = ModBlocks.registerBlock("gravel_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> SAND_LAYERS_BLOCK = ModBlocks.registerBlock("sand_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> GRASS_LAYERS_BLOCK = ModBlocks.registerBlock("grass_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> GRAVEL_SLAB = ModBlocks.registerBlock("gravel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> GRASS_SLAB = ModBlocks.registerBlock("grass_slab",
            () -> new PlantableSlab(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> DIRT_SLAB = ModBlocks.registerBlock("dirt_slab",
            () -> new PlantableSlab(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> COARSE_DIRT_SLAB = ModBlocks.registerBlock("coarse_dirt_slab",
            () -> new PlantableSlab(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> SAND_SLAB = ModBlocks.registerBlock("sand_slab",
            () -> new PlantableSlab(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> COBBLESTONE_LAYERS_BLOCK = ModBlocks.registerBlock("cobblestone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_LAYERS_BLOCK = ModBlocks.registerBlock("mossy_cobblestone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> STONE_LAYERS_BLOCK = ModBlocks.registerBlock("stone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> STONE_BRICKS_LAYERS_BLOCK = ModBlocks.registerBlock("stone_bricks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_LAYERS_BLOCK = ModBlocks.registerBlock("mossy_stone_bricks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_LAYERS_BLOCK = ModBlocks.registerBlock("smooth_sandstone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_LAYERS_BLOCK = ModBlocks.registerBlock("smooth_red_sandstone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> ANDESITE_LAYERS_BLOCK = ModBlocks.registerBlock("andesite_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> DIORITE_LAYERS_BLOCK = ModBlocks.registerBlock("diorite_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> GRANITE_LAYERS_BLOCK = ModBlocks.registerBlock("granite_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> TUFF_LAYERS_BLOCK = ModBlocks.registerBlock("tuff_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> CALCITE_LAYERS_BLOCK = ModBlocks.registerBlock("calcite_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> DEEPSLATE_LAYERS_BLOCK = ModBlocks.registerBlock("deepslate_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_LAYERS_BLOCK = ModBlocks.registerBlock("cobbled_deepslate_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> BLACKSTONE_LAYERS_BLOCK = ModBlocks.registerBlock("blackstone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> NETHERRACK_LAYERS_BLOCK = ModBlocks.registerBlock("netherrack_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> END_STONE_LAYERS_BLOCK = ModBlocks.registerBlock("end_stone_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> PODZOL_LAYERS_BLOCK = ModBlocks.registerBlock("podzol_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> CLAY_LAYERS_BLOCK = ModBlocks.registerBlock("clay_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> RED_SAND_LAYERS_BLOCK = ModBlocks.registerBlock("red_sand_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYERS_BLOCK = ModBlocks.registerBlock("crimson_nylium_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYERS_BLOCK = ModBlocks.registerBlock("warped_nylium_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> PRISMARINE_LAYERS_BLOCK = ModBlocks.registerBlock("prismarine_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> OAK_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("oak_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50705_)));
    public static final RegistryObject<Block> SPRUCE_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("spruce_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50741_)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("dark_oak_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50745_)));
    public static final RegistryObject<Block> BIRCH_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("birch_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50742_)));
    public static final RegistryObject<Block> JUNGLE_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("jungle_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50743_)));
    public static final RegistryObject<Block> ACACIA_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("acacia_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50744_)));
    public static final RegistryObject<Block> MANGROVE_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("mangrove_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_220865_)));
    public static final RegistryObject<Block> CHERRY_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("cherry_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_271304_)));
    public static final RegistryObject<Block> BAMBOO_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("bamboo_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_244477_)));
    public static final RegistryObject<Block> CRIMSON_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("crimson_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50655_)));
    public static final RegistryObject<Block> WARPED_PLANKS_LAYERS_BLOCK = ModBlocks.registerBlock("warped_planks_layers_block",
            () -> new LayersBlock(BlockBehaviour.Properties.copy((BlockBehaviour)Blocks.f_50656_)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject toReturn = BLOCKS.register(name, block);
        ModBlocks.registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
