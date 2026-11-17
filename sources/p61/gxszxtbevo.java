package p61;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.shopdetails.store.ShopDetailsDialogArgs;
import ru.myspar.proloyalty.domain.feature.shopdetails.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f75831ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f75832wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f75831ppxfxbqfkf = storeFactory;
        this.f75832wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f75831ppxfxbqfkf, state, null, this.f75832wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        int dialogTitle = ((ShopDetailsDialogArgs) gxszxtbevo()).getDialogTitle();
        String shopType = ((ShopDetailsDialogArgs) gxszxtbevo()).getShopType();
        if (shopType == null) {
            shopType = "";
        }
        return new State(dialogTitle, shopType, ((ShopDetailsDialogArgs) gxszxtbevo()).getShopAddress(), ((ShopDetailsDialogArgs) gxszxtbevo()).getShopOpeningHours(), ((ShopDetailsDialogArgs) gxszxtbevo()).getBtnAcceptText());
    }
}
