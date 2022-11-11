package software.bernie.geckolib3.model.data;

/**
 * Container class for various pieces of data relating to a model's current state.
 */
public record EntityModelData(boolean isSitting, boolean isChild, float netHeadYaw, float headPitch) {}
