package com.kenny.mcsm;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcsm")
public class MinecraftStoryMode 
{
	/**Name of this mod.*/
	public static final String NAME = "Story Mode";
	/**This is id of our mod.*/
	public static final String ID   = "mcsm";
	/**Reference to logger in this class.*/
	private static final Logger LOGGER = LogManager.getLogger();
	/**Register for events and post events.*/
	private IEventBus eventBus;
	/**Contains all blocks from this addon.*/
	protected StoryModeBlocks mcsmBlocks;
	/**Contains all items and itemBlocks from this addon.*/
	protected StoryModeItems  mcsmItems;
	
	public MinecraftStoryMode() 
	{
		LOGGER.info("Starting load Minecraft Story Mode addon...");
		this.eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		this.eventBus.addListener(this::preInit);
		this.eventBus.addListener(this::init);
		this.mcsmBlocks = new StoryModeBlocks();
		this.mcsmItems = new StoryModeItems();
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	/**
	 * Pre-initialize some modification stuff, like settings or something like
	 * this.
	 */
	private void preInit(final FMLCommonSetupEvent event)
	{
		
	}
	
	/**
	 * Initialize some modification stuff, like settings or something like
	 * this only on client side.
	 */
	private void init(final FMLClientSetupEvent event)
	{
			
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class StoryModeRegistry
	{	
		/**
		 * Registry all items in story mode for forge.
		 */
		@SubscribeEvent
		public static void registryItems(final RegistryEvent.Register<Item> e)
		{
			LOGGER.info("Registry items...");
			{
				for (Item item : StoryModeItems.ITEMS) 
				{
					e.getRegistry().register(item);
				}
			}
		}
		
		/**
		 * Registry all block in story mode for forge.
		 */
		@SubscribeEvent
		public static void registryBlocks(final RegistryEvent.Register<Block> e)
		{
			LOGGER.info("Registry blocks...");
			{
				for (Block block : StoryModeBlocks.BLOCKS) 
				{
					e.getRegistry().register(block);
				}
			}
		}
	}
	
	/**
	 * This class contains all items from minecraft story mode.
	 */
	public static class StoryModeItems
	{
		public static final List<Item> ITEMS = new ArrayList<Item>();
	
		public StoryModeItems() 
		{
			this.addItem("order_amulet", new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(1));
		
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONE_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONE_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONE_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONE_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONE_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_GRAVEL_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_GRAVEL_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_GRAVEL_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_COBBLESTONE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONED_COAL_ORE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONED_IRON_ORE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_STONED_EMERALD_ORE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.WINDOW_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.WINDOW_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.WINDOW_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_6, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ICE_WINDOW_7, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_6, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SMOOTH_STONE_7, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_6, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DOUBLE_SMOOTH_STONE_7, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_STONE_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_STONE_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_STONE_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_STONE_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_SMOOTH_STONE_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_SMOOTH_STONE_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_SMOOTH_STONE_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.ROAD_SMOOTH_STONE_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DARK_SMOOTH_STONE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DARK_DARKER_SMOOTH_STONE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.DARK_LIGHTER_SMOOTH_STONE, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SAND_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SAND_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SAND_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SAND_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.SAND_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_1, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_2, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_3, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_4, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_5, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_6, addProperties().group(ItemGroup.BUILDING_BLOCKS));
			this.addItemBlock(StoryModeBlocks.PURPLE_WINDOW_7, addProperties().group(ItemGroup.BUILDING_BLOCKS));
		}
		
		/**
		 * Create and add new minecraft item to fc array list and return it with basic
		 * parameters.
		 * 
		 * @name - this is registry name of this item.
		 * @groupIn - category when be stored item in creative mode bar.
		 */
		public Item addItem(String name, Item.Properties itemPropIn)
		{
			Item item = new Item(itemPropIn);
			
			if(item.getGroup() == null)
			{
				itemPropIn.group(ItemGroup.MISC);
			}
			
			item.setRegistryName(new ResourceLocation(ID, name));
			ITEMS.add(item);
			
			return item;
		}
		
		/**
		 * Create and add new minecraft item to fc array list and return it with basic
		 * parameters.
		 * 
		 * @name - this is registry name of this item.
		 */
		public Item addItem(String name)
		{
			return this.addItem(name, null);
		}
		
		/** 
		 * Combine block object with item and create new itemblock object. Basically is itemblock
		 * to player hold in hand.
		 */
		public BlockItem addItemBlock(Block blockToItemIn, Item.Properties itemPropIn)
		{
			BlockItem itemBlock = new BlockItem(blockToItemIn, itemPropIn);
			
			if(itemBlock.getGroup() == null)
			{
				itemPropIn.group(ItemGroup.BUILDING_BLOCKS);
			}
			itemBlock.setRegistryName(blockToItemIn.getRegistryName());
			ITEMS.add(itemBlock);
			
			return itemBlock;
		}
		
		/**
		 * Create instance of Item.Properties class.
		 */
		public Item.Properties addProperties()
		{
			return new Item.Properties();
		}
	}
	
	/**
	 * This class contains all blocks from minecraft story mode.
	 */
	public static class StoryModeBlocks
	{
		public static class MCSMBlock
		{
			//public MCSMBlock(Block block, String name) 
			//{
			//	if(block != null)
			//	{
			//		block.setRegistryName(name);
			//	}
			//}
		}
		
		public static final List<Block> BLOCKS = new ArrayList<Block>();
		
		/**Easy access to basic material.*/
		public static final Material 
			MAT_ROCK = Material.ROCK,
			MAT_SAND = Material.SAND,
			MAT_GLASS = Material.GLASS,
			MAT_ICE = Material.ICE,
			MAT_ICE_2 = Material.PACKED_ICE;
		
		public static Block ASPHALT_STONE_1;
		public static Block ASPHALT_STONE_2;
		public static Block ASPHALT_STONE_3;
		public static Block ASPHALT_STONE_4;
		public static Block ASPHALT_STONE_5;
		public static Block ASPHALT_GRAVEL_1;
		public static Block ASPHALT_GRAVEL_2;
		public static Block ASPHALT_GRAVEL_3;
		public static Block ASPHALT_COBBLESTONE;
		public static Block ASPHALT_STONED_COAL_ORE;
		public static Block ASPHALT_STONED_IRON_ORE;
		public static Block ASPHALT_STONED_EMERALD_ORE;
		public static Block ASPHALT_CRACKED_STONE_BRICKS_1;
		public static Block ASPHALT_CRACKED_STONE_BRICKS_2;
		public static Block ASPHALT_CRACKED_STONE_BRICKS_3;
		public static Block ASPHALT_CRACKED_STONE_BRICKS_4;
		public static Block WINDOW_1, WINDOW_2, WINDOW_3;
		public static Block ICE_WINDOW_1;
		public static Block ICE_WINDOW_2;
		public static Block ICE_WINDOW_3;
		public static Block ICE_WINDOW_4;
		public static Block ICE_WINDOW_5;
		public static Block ICE_WINDOW_6;
		public static Block ICE_WINDOW_7;
		public static Block SMOOTH_STONE_1;
		public static Block SMOOTH_STONE_2;
		public static Block SMOOTH_STONE_3;
		public static Block SMOOTH_STONE_4;
		public static Block SMOOTH_STONE_5;
		public static Block SMOOTH_STONE_6;
		public static Block SMOOTH_STONE_7;
		public static Block DOUBLE_SMOOTH_STONE_1;
		public static Block DOUBLE_SMOOTH_STONE_2;
		public static Block DOUBLE_SMOOTH_STONE_3;
		public static Block DOUBLE_SMOOTH_STONE_4;
		public static Block DOUBLE_SMOOTH_STONE_5;
		public static Block DOUBLE_SMOOTH_STONE_6;
		public static Block DOUBLE_SMOOTH_STONE_7;
		public static Block ROAD_STONE_1;
		public static Block ROAD_STONE_3;
		public static Block ROAD_STONE_2;
		public static Block ROAD_STONE_4;
		public static Block ROAD_SMOOTH_STONE_1;
		public static Block ROAD_SMOOTH_STONE_2;
		public static Block ROAD_SMOOTH_STONE_3;
		public static Block ROAD_SMOOTH_STONE_4;
		public static Block DARK_SMOOTH_STONE;
		public static Block DARK_DARKER_SMOOTH_STONE;
		public static Block DARK_LIGHTER_SMOOTH_STONE;
		public static Block SAND_1, SAND_2, SAND_3, SAND_4, SAND_5;
		public static Block PURPLE_WINDOW_1;
		public static Block PURPLE_WINDOW_2;
		public static Block PURPLE_WINDOW_3;
		public static Block PURPLE_WINDOW_4;
		public static Block PURPLE_WINDOW_5;
		public static Block PURPLE_WINDOW_6;
		public static Block PURPLE_WINDOW_7;
		
		public StoryModeBlocks() 
		{
			StoryModeBlocks.ASPHALT_STONE_1 = this.addBlock("asphalt_stone_1", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONE_2 = this.addBlock("asphalt_stone_2", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONE_3 = this.addBlock("asphalt_stone_3", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONE_4 = this.addBlock("asphalt_stone_4", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONE_5 = this.addBlock("asphalt_stone_5", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_GRAVEL_1 = this.addBlock("asphalt_gravel_1", addProperties(MAT_SAND).sound(SoundType.GROUND));
			StoryModeBlocks.ASPHALT_GRAVEL_2 = this.addBlock("asphalt_gravel_2", addProperties(MAT_SAND).sound(SoundType.GROUND));
			StoryModeBlocks.ASPHALT_GRAVEL_3 = this.addBlock("asphalt_gravel_3", addProperties(MAT_SAND).sound(SoundType.GROUND));
			StoryModeBlocks.ASPHALT_COBBLESTONE = this.addBlock("asphalt_cobblestone", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONED_COAL_ORE = this.addBlock("asphalt_stoned_coal_ore", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONED_IRON_ORE = this.addBlock("asphalt_stoned_iron_ore", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_STONED_EMERALD_ORE = this.addBlock("asphalt_stoned_emerald_ore", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_1 = this.addBlock("asphalt_cracked_stone_bricks_1", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_2 = this.addBlock("asphalt_cracked_stone_bricks_2", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_3 = this.addBlock("asphalt_cracked_stone_bricks_3", addProperties(MAT_ROCK));
			StoryModeBlocks.ASPHALT_CRACKED_STONE_BRICKS_4 = this.addBlock("asphalt_cracked_stone_bricks_4", addProperties(MAT_ROCK));
			StoryModeBlocks.WINDOW_1 = this.addBlock("window_1", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.WINDOW_2 = this.addBlock("window_2", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.WINDOW_3 = this.addBlock("window_3", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_1 = this.addBlock("ice_window_1", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_2 = this.addBlock("ice_window_2", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_3 = this.addBlock("ice_window_3", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_4 = this.addBlock("ice_window_4", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_5 = this.addBlock("ice_window_5", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_6 = this.addBlock("ice_window_6", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.ICE_WINDOW_7 = this.addBlock("ice_window_7", addProperties(MAT_ICE_2).sound(SoundType.GLASS));
			StoryModeBlocks.SMOOTH_STONE_1 = this.addBlock("smooth_stone_1", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_2 = this.addBlock("smooth_stone_2", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_3 = this.addBlock("smooth_stone_3", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_4 = this.addBlock("smooth_stone_4", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_5 = this.addBlock("smooth_stone_5", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_6 = this.addBlock("smooth_stone_6", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SMOOTH_STONE_7 = this.addBlock("smooth_stone_7", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_1 = this.addBlock("double_smooth_stone_1", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_2 = this.addBlock("double_smooth_stone_2", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_3 = this.addBlock("double_smooth_stone_3", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_4 = this.addBlock("double_smooth_stone_4", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_5 = this.addBlock("double_smooth_stone_5", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_6 = this.addBlock("double_smooth_stone_6", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DOUBLE_SMOOTH_STONE_7 = this.addBlock("double_smooth_stone_7", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_STONE_1 = this.addBlock("road_stone_1", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_STONE_2 = this.addBlock("road_stone_2", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_STONE_3 = this.addBlock("road_stone_3", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_STONE_4 = this.addBlock("road_stone_4", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_SMOOTH_STONE_1 = this.addBlock("road_smooth_stone_1", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_SMOOTH_STONE_2 = this.addBlock("road_smooth_stone_2", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_SMOOTH_STONE_3 = this.addBlock("road_smooth_stone_3", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.ROAD_SMOOTH_STONE_4 = this.addBlock("road_smooth_stone_4", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DARK_SMOOTH_STONE = this.addBlock("dark_smooth_stone", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DARK_DARKER_SMOOTH_STONE = this.addBlock("dark_darker_smooth_stone", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.DARK_LIGHTER_SMOOTH_STONE = this.addBlock("dark_lighter_smooth_stone", addProperties(MAT_ROCK).sound(SoundType.STONE));
			StoryModeBlocks.SAND_1 = this.addBlock("sand_1", addProperties(MAT_SAND).sound(SoundType.SAND));
			StoryModeBlocks.SAND_2 = this.addBlock("sand_2", addProperties(MAT_SAND).sound(SoundType.SAND));
			StoryModeBlocks.SAND_3 = this.addBlock("sand_3", addProperties(MAT_SAND).sound(SoundType.SAND));
			StoryModeBlocks.SAND_4 = this.addBlock("sand_4", addProperties(MAT_SAND).sound(SoundType.SAND));
			StoryModeBlocks.SAND_5 = this.addBlock("sand_5", addProperties(MAT_SAND).sound(SoundType.SAND));
			StoryModeBlocks.PURPLE_WINDOW_1 = this.addBlock("purple_window_1", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_2 = this.addBlock("purple_window_2", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_3 = this.addBlock("purple_window_3", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_4 = this.addBlock("purple_window_4", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_5 = this.addBlock("purple_window_5", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_6 = this.addBlock("purple_window_6", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			StoryModeBlocks.PURPLE_WINDOW_7 = this.addBlock("purple_window_7", addProperties(MAT_GLASS).sound(SoundType.GLASS));
			
		}
		
		/**
		 * Create hole group of blocks with one type. For example maybe block A has multiply
		 * different types / textures, and with this method blocks be named like this: [A_1, A_2 ... A_n]
		 * 
		 * @param groupName - name of hole group of blocks.
		 * @param groupProperties - props of hole group of blocks.
		 */
		public void addBlockGroup(String groupName, Block.Properties groupProperties, Block... blockRefs)
		{	
			int i = 1;
			for (Block block : blockRefs) 
			{
				block = this.addBlock(groupName + "_" + i, groupProperties);
				i++;
			}
		}
		
		/**
		 * Create and add new minecraft block to array list and return it with basic
		 * parameters.
		 * 
		 * @name - this is registry name of this block.
		 * @material - this is material of this block.
		 */
		public Block addBlock(String name, Block.Properties properties)
		{
			Block block = new Block(properties);
			block.setRegistryName(new ResourceLocation(ID, name));
			BLOCKS.add(block);
			
			return block;
		}
		
		/**
		 * Create and add new minecraft block to fc array list and return it with basic
		 * parameters.
		 * 
		 * @name - this is registry name of this block.
		 * @material - this is material of this block.
		 * @groupIn - category when be stored block in creative mode bar.
		 */
		public Block addBlock(String name, Material materialIn)
		{
			Block.Properties prop = this.addProperties(materialIn);
			return this.addBlock(name, prop);
		}
				
		/**
		 * Create instance of Block.Properties and add basic property is
		 * material to this block.
		 * 
		 * @param materialIn - material of this block.
		 */
		public Block.Properties addProperties(Material materialIn)
		{
			return Block.Properties.create(materialIn != null ? materialIn : null);
		}
	}	
}
