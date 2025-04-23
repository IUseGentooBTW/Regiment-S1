import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class WideBlock extends Block {
    public static final EnumProperty<Part> PART = EnumProperty.of("part", Part.class);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public WideBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(PART, Part.FOOT));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, PART);
    }

    public enum Part implements StringIdentifiable {
        HEAD, FOOT;

        @Override
        public String asString() {
            return name().toLowerCase();
        }
    }
}
