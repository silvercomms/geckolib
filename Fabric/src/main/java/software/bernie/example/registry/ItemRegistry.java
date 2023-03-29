package software.bernie.example.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.example.item.PistolItem;
import software.bernie.example.item.WolfArmorItem;
import software.bernie.geckolib.GeckoLib;

public class ItemRegistry {

    public static final JackInTheBoxItem JACK_IN_THE_BOX = registerItem("jack_in_the_box", new JackInTheBoxItem(new Item.Properties()));
    public static final PistolItem PISTOL = registerItem("pistol", new PistolItem());

    public static final GeckoArmorItem GECKO_ARMOR_HELMET = registerItem("gecko_armor_helmet", new GeckoArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final GeckoArmorItem GECKO_ARMOR_CHESTPLATE = registerItem("gecko_armor_chestplate", new GeckoArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final GeckoArmorItem GECKO_ARMOR_LEGGINGS = registerItem("gecko_armor_leggings", new GeckoArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final GeckoArmorItem GECKO_ARMOR_BOOTS = registerItem("gecko_armor_boots", new GeckoArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties()));

    public static final WolfArmorItem WOLF_ARMOR_HELMET = registerItem("wolf_armor_helmet", new WolfArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties()));
    public static final WolfArmorItem WOLF_ARMOR_CHESTPLATE = registerItem("wolf_armor_chestplate", new WolfArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties()));
    public static final WolfArmorItem WOLF_ARMOR_LEGGINGS = registerItem("wolf_armor_leggings", new WolfArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties()));
    public static final WolfArmorItem WOLF_ARMOR_BOOTS = registerItem("wolf_armor_boots", new WolfArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties()));
    
    public static final SpawnEggItem BAT_SPAWN_EGG = registerItem("bat_spawn_egg", new SpawnEggItem(EntityRegistry.BAT, 0x1F1F1F, 0x0D0D0D, new Item.Properties()));
    public static final SpawnEggItem BIKE_SPAWN_EGG = registerItem("bike_spawn_egg", new SpawnEggItem(EntityRegistry.BIKE, 0xD3E3E6, 0xE9F1F5, new Item.Properties()));
    public static final SpawnEggItem RACE_CAR_SPAWN_EGG = registerItem("race_car_spawn_egg", new SpawnEggItem(EntityRegistry.RACE_CAR, 0x9E1616, 0x595959, new Item.Properties()));
    public static final SpawnEggItem PARASITE_SPAWN_EGG = registerItem("parasite_spawn_egg", new SpawnEggItem(EntityRegistry.PARASITE, 0x302219, 0xACACAC, new Item.Properties()));
    public static final SpawnEggItem MUTANT_ZOMBIE_SPAWN_EGG = registerItem("mutant_zombie_spawn_egg", new SpawnEggItem(EntityRegistry.MUTANT_ZOMBIE, 0x3C6236, 0x579989, new Item.Properties()));
    public static final SpawnEggItem FAKE_GLASS_SPAWN_EGG = registerItem("fake_glass_spawn_egg", new SpawnEggItem(EntityRegistry.FAKE_GLASS, 0xDD0000, 0xD8FFF7, new Item.Properties()));
    public static final SpawnEggItem COOL_KID_SPAWN_EGG = registerItem("cool_kid_spawn_egg", new SpawnEggItem(EntityRegistry.COOL_KID, 0x5F2A31, 0x6F363E, new Item.Properties()));
    public static final SpawnEggItem GREMLIN_SPAWN_EGG = registerItem("gremlin_spawn_egg", new SpawnEggItem(EntityRegistry.GREMLIN, 0x505050, 0x606060, new Item.Properties()));
    
    public static final CreativeModeTab ITEM_GROUP = FabricItemGroupBuilder
            .create(new ResourceLocation(GeckoLib.MOD_ID, "geckolib_examples"))
            .icon(() -> new ItemStack(ItemRegistry.JACK_IN_THE_BOX))
            .appendItems((entries, tab) -> {
                entries.add(ItemRegistry.JACK_IN_THE_BOX.getDefaultInstance());
                entries.add(ItemRegistry.PISTOL.getDefaultInstance());
                entries.add(ItemRegistry.GECKO_ARMOR_HELMET.getDefaultInstance());
                entries.add(ItemRegistry.GECKO_ARMOR_CHESTPLATE.getDefaultInstance());
                entries.add(ItemRegistry.GECKO_ARMOR_LEGGINGS.getDefaultInstance());
                entries.add(ItemRegistry.GECKO_ARMOR_BOOTS.getDefaultInstance());
                entries.add(ItemRegistry.WOLF_ARMOR_HELMET.getDefaultInstance());
                entries.add(ItemRegistry.WOLF_ARMOR_CHESTPLATE.getDefaultInstance());
                entries.add(ItemRegistry.WOLF_ARMOR_LEGGINGS.getDefaultInstance());
                entries.add(ItemRegistry.WOLF_ARMOR_BOOTS.getDefaultInstance());
                entries.add(BlockRegistry.GECKO_HABITAT_BLOCK.asItem().getDefaultInstance());
                entries.add(BlockRegistry.FERTILIZER_BLOCK.asItem().getDefaultInstance());
                entries.add(ItemRegistry.BAT_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.BIKE_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.RACE_CAR_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.PARASITE_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.MUTANT_ZOMBIE_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.GREMLIN_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.FAKE_GLASS_SPAWN_EGG.getDefaultInstance());
                entries.add(ItemRegistry.COOL_KID_SPAWN_EGG.getDefaultInstance());
            }).build();

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(GeckoLib.MOD_ID, name), item);
    }
}
