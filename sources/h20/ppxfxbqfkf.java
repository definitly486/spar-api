package h20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {
    static /* synthetic */ void dsvhmnatus(ppxfxbqfkf ppxfxbqfkfVar, ChangeProductParams changeProductParams, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChangeProductParams");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        ppxfxbqfkfVar.hkdspvbjdz(changeProductParams, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static wwaezpbzkn lmojexxdyd(ppxfxbqfkf ppxfxbqfkfVar, ChangeProductParams changeProductParams) {
        dsvhmnatus(ppxfxbqfkfVar, changeProductParams, false, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    c20.eablkybsjg eablkybsjg();

    void gxszxtbevo();

    default void hkdspvbjdz(ChangeProductParams params, boolean z13) {
        zdlpuopuiu.btonecajqb(params, "params");
        if (!((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            zoijcleaow();
            return;
        }
        if (!params.getIsProductAvailableToBuy()) {
            tzroggbefp(params);
            return;
        }
        if (z13) {
            wwaezpbzkn(params);
            return;
        }
        if (params.getChangeType() == m00.zoijcleaow.ADD && params.getAvailableOnlyForPickup()) {
            y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
            if ((iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null) != DeliveryCode.PICKUP) {
                iozdgvuglv(params, null);
                return;
            }
        }
        ppxfxbqfkf(null);
        wwaezpbzkn(params);
    }

    void iozdgvuglv(ChangeProductParams changeProductParams, String str);

    y00.iobyxmoadg kcexrzcfyt();

    void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar);

    void tzroggbefp(ChangeProductParams changeProductParams);

    void wwaezpbzkn(ChangeProductParams changeProductParams);

    default void ylkuphrtab(final ChangeProductParams params) {
        zdlpuopuiu.btonecajqb(params, "params");
        ppxfxbqfkf(new tg.iobyxmoadg() { // from class: h20.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.lmojexxdyd(this.f39221zdlpuopuiu, params);
            }
        });
        gxszxtbevo();
    }

    void zoijcleaow();
}
