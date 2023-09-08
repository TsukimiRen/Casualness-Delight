package com.va11halla.casualness_delight.registry;

import com.nhoryzon.mc.farmersdelight.item.ConsumableItem;
import com.va11halla.casualness_delight.CasualnessDelightFabric;
import com.va11halla.casualness_delight.item.FoodList;
import com.va11halla.casualness_delight.item.TooltipItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum ItemRegistry {
    FishAndChips("fish_and_chips",
            () -> new ConsumableItem(new FabricItemSettings().food(FoodList.FishAndChips).maxCount(16).recipeRemainder(Items.BOWL), true)),
    YorkshirePudding("yorkshire_pudding",
            () -> new Item(new FabricItemSettings().food(FoodList.YorkshirePudding))),
    BeefNoodles("beef_noodles",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.BeefNoodles).maxCount(16).recipeRemainder(Items.BOWL), true)),
    //Pie
    QuicheLorraine("quiche_lorraine",
            () -> new BlockItem(BlockRegistry.QuicheLorraine, new FabricItemSettings())),
    QuicheLorraineSlice("quiche_lorraine_slice",
            ()-> new TooltipItem(new FabricItemSettings().food(FoodList.QuicheLorraineSlice), true)),
    StargazyPie("stargazy_pie",
            () -> new BlockItem(BlockRegistry.StargazyPie, new FabricItemSettings())),
    StargazyPieSlice("stargazy_pie_slice",
            ()-> new TooltipItem(new FabricItemSettings().food(FoodList.StargazyPieSlice), false,true)),
    RawCheeseWheel("raw_cheese_wheel",
            () -> new BlockItem(BlockRegistry.RawCheeseWheel, new FabricItemSettings())),
    CheeseWheel("cheese_wheel",
            () -> new BlockItem(BlockRegistry.CheeseWheel, new FabricItemSettings())),
    CheeseWheelSlice("cheese_wheel_slice",
            ()-> new TooltipItem(new FabricItemSettings().food(FoodList.CheeseWheelSlice))),
    PhantomDumplings("phantom_dumplings",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.PhantomDumplings),true)),
    PhantomPuff("phantom_puff",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.PhantomPuff),true)),
    SpicyStrips("spicy_strips",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.SpicyStrips),true)),
    GreenTongue("green_tongue",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.GreenTongue),true)),
    //Gluten
    RawGluten("raw_gluten",
            ()-> new ConsumableItem(new FabricItemSettings())),
    Gluten("gluten",
            ()-> new ConsumableItem(new FabricItemSettings())),
    GlutenSkewer("gluten_skewer",
            ()-> new ConsumableItem(new FabricItemSettings())),
    RoastGluten("roast_gluten",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.RoastGluten).recipeRemainder(Items.STICK))),
    RawDonkeyMeat("raw_donkey_meat",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.RawDonkeyMeat))),
    CookedDonkeyMeat("cooked_donkey_meat",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.CookedDonkeyMeat))),
    DonkeyBurger("donkey_burger",
            ()-> new ConsumableItem(new FabricItemSettings().food(FoodList.DonkeyBurger))),
    ;
    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private final Integer burnTime;
    private Item item;

    private ItemRegistry(String pathName, Supplier itemSupplier) {
        this(pathName, itemSupplier, (Integer)null);
    }

    private ItemRegistry(String pathName, Supplier itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
        this.burnTime = burnTime;
    }

    public static void register() {
        ItemRegistry[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            ItemRegistry value = var0[var2];
            Registry.register(Registries.ITEM, new Identifier(CasualnessDelightFabric.MODID, value.pathName), value.get());
            if (value.burnTime != null && value.burnTime > 0) {
                FuelRegistry.INSTANCE.add(value.get(), value.burnTime);
            }
        }
    }

    public Item get() {
        if (this.item == null) {
            this.item = (Item)this.itemSupplier.get();
        }

        return this.item;
    }

    public String getId() {
        return Registries.ITEM.getId(this.get()).toString();
    }
}