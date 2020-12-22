package team.chisel.ctm.api.texture;

import org.jetbrains.annotations.NotNull;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

/**
 * Provides texture offsets for {@link team.chisel.ctm.client.texture.TextureMap}.
 */
public interface OffsetProvider {
	@NotNull
	Vec3i getOffset(@NotNull World world, @NotNull BlockPos pos);
}
