package zf1;

import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.orders.impl.screens.orders.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, 0, null, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 15, null);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        return State.ppxfxbqfkf(state, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf() ? zoijcleaowVar.zoijcleaow().iobyxmoadg() : jyumaefscl.ixidwrxhsl(state.getOrders(), zoijcleaowVar.zoijcleaow().iobyxmoadg()), zoijcleaowVar.zoijcleaow().zoijcleaow(), null, false, 24, null);
    }
}
