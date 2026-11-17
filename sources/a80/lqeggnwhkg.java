package a80;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.restaurantdescriptiondialog.store.RestaurantDescriptionDialogArgs;
import ru.myspar.domain.feature.restaurantdescriptiondialog.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f1114ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f1115zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f1115zoijcleaow = storeFactory;
        this.f1114ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((RestaurantDescriptionDialogArgs) gxszxtbevo()).getDeliveryPrice(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getDeliveryTime(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getWorkingHours(), ((RestaurantDescriptionDialogArgs) gxszxtbevo()).getAddress(), false, 16, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f1115zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f1116iobyxmoadg), this.f1114ppxfxbqfkf, new zoijcleaow());
    }
}
