package ap;

import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.impl.domain.authorization.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f14053ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f14054zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f14054zoijcleaow = storeFactory;
        this.f14053ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, false, null, false, ((AuthorizationArgs) gxszxtbevo()).getResult(), ((AuthorizationArgs) gxszxtbevo()).getErrorType(), false, false, OrderServiceErrorHandlerImpl.ORDER_LOCKED, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f14054zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f14055iobyxmoadg), this.f14053ppxfxbqfkf, new zoijcleaow());
    }
}
