package ol0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final pl0.zoijcleaow.iobyxmoadg ppxfxbqfkf(UserAddress.Delivery delivery, String str) {
        return new pl0.zoijcleaow.iobyxmoadg(delivery.getShopId(), zdlpuopuiu.eablkybsjg(delivery.getShopId(), str), true, delivery.getCustomName(), delivery.getShortAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl0.zoijcleaow.C1702zoijcleaow wkgbmnqykc(UserAddress.PickUp pickUp, String str) {
        return new pl0.zoijcleaow.C1702zoijcleaow(pickUp.getShopId(), zdlpuopuiu.eablkybsjg(pickUp.getShopId(), str), true, pickUp.getFullAddress(), pickUp.getAdditionalInfo());
    }
}
