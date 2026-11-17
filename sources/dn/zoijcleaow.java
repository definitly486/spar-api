package dn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final en.zoijcleaow.iobyxmoadg ppxfxbqfkf(UserAddress.Delivery delivery, String str) {
        return new en.zoijcleaow.iobyxmoadg(delivery.getShopId(), zdlpuopuiu.eablkybsjg(delivery.getShopId(), str), true, delivery.getCustomName(), delivery.getShortAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final en.zoijcleaow.C0676zoijcleaow wkgbmnqykc(UserAddress.PickUp pickUp, String str) {
        return new en.zoijcleaow.C0676zoijcleaow(pickUp.getShopId(), zdlpuopuiu.eablkybsjg(pickUp.getShopId(), str), true, pickUp.getFullAddress(), pickUp.getAdditionalInfo());
    }
}
