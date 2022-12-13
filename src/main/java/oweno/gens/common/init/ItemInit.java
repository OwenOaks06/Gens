package oweno.gens.common.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oweno.gens.Gens;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gens.MODID);

    public static final RegistryObject<Item> GLASSES_ITEM = ITEMS.register("glasses_item", () -> new Item(props()));

    private static Item.Properties props() {
        return new Item.Properties().tab(Gens.TAB);
    }
}
