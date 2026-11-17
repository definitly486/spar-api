package l61;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.RestaurantDescriptionDialogArgs;
import ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f61702ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f61703wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f61702ppxfxbqfkf = storeFactory;
        this.f61703wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f61702ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f61704iobyxmoadg), this.f61703wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((RestaurantDescriptionDialogArgs) gxszxtbevo()).getDeliveryPrice(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getDeliveryTime(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getWorkingHours(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getAddress(), false, 16, null);
    }
}
