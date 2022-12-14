package oweno.gens.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oweno.gens.Gens;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gens.MODID);

    public static final RegistryObject<Item> GLASSES_ITEM = ITEMS.register("glasses_item",
            () -> new Item(props()));

    public static final RegistryObject<Item> KIWI_FOOD = ITEMS.register("kiwi_food",
            () -> new Item(props().food(Foods.KIWI_FOOD)));

    public static final RegistryObject<PickaxeItem> SUPERGHAST1_PICKAXE = ITEMS.register("superghast1_pickaxe",
            () -> new PickaxeItem(Tiers.MAGMA, 2, 1.2f, props()));

    private static Item.Properties props() {
        return new Item.Properties().tab(Gens.TAB);
    }

    public static class Foods {
        public static final FoodProperties KIWI_FOOD = new FoodProperties.Builder()
                .nutrition(2)
                .saturationMod(0.3f)
                .fast()
                .build();
    }

    public static class Tiers {
        public static final Tier MAGMA = new ForgeTier(
                5,
                3000,
                12f,
                4f,
                17,
                null,
                () -> Ingredient.of(Items.MAGMA_CREAM));
    }
}
