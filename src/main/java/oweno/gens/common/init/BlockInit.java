package oweno.gens.common.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;
import oweno.gens.Gens;
import oweno.gens.common.block.IronGenBlock;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gens.MODID);

    private static final RegistryObject<Block> IRON_GEN_BLOCK = register("iron_gen_block",
            () -> new IronGenBlock(BlockBehaviour.Properties.of(Material.METAL).strength(-1.0f, 20f).noLootTable()),
            new Item.Properties().tab(Gens.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
