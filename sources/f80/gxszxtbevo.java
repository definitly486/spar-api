package f80;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.shopdetails.store.ShopDetailsDialogArgs;
import ru.myspar.domain.feature.shopdetails.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f33114ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f33115zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f33115zoijcleaow = storeFactory;
        this.f33114ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        int dialogTitle = ((ShopDetailsDialogArgs) gxszxtbevo()).getDialogTitle();
        String shopType = ((ShopDetailsDialogArgs) gxszxtbevo()).getShopType();
        if (shopType == null) {
            shopType = "";
        }
        return new State(dialogTitle, shopType, ((ShopDetailsDialogArgs) gxszxtbevo()).getShopAddress(), ((ShopDetailsDialogArgs) gxszxtbevo()).getShopOpeningHours(), ((ShopDetailsDialogArgs) gxszxtbevo()).getBtnAcceptText());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f33115zoijcleaow, state, null, this.f33114ppxfxbqfkf, new zoijcleaow());
    }
}
