package um;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressSearchArgs;
import ru.myspar.address.impl.address_search.domain.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f113935ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f113936zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f113936zoijcleaow = storeFactory;
        this.f113935ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar.f113935ppxfxbqfkf;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((AddressSearchArgs) gxszxtbevo()).getUserLocation(), false, null, null, null, 30, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f113936zoijcleaow, lqeggnwhkg.class.getName(), false, state, null, new tg.iobyxmoadg() { // from class: um.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.wflxmlrfwp(this.f113929zdlpuopuiu);
            }
        }, new zoijcleaow(), 10, null);
    }
}
