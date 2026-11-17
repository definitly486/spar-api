package zi0;

import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.orders.impl.screens.orders.domain.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f130223iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private final State zoijcleaow(State state, gxszxtbevo.zoijcleaow zoijcleaowVar) {
        return State.ppxfxbqfkf(state, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.iobyxmoadg() == 1 ? zoijcleaowVar.zoijcleaow().iobyxmoadg() : jyumaefscl.ixidwrxhsl(state.getOrders(), zoijcleaowVar.zoijcleaow().iobyxmoadg()), zoijcleaowVar.zoijcleaow().zoijcleaow(), null, false, 8, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, 0, null, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return zoijcleaow(state, (gxszxtbevo.zoijcleaow) msg);
        }
        throw new NoWhenBranchMatchedException();
    }
}
