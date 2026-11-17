package ug1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.impl.methods.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof eablkybsjg.zoijcleaow) {
            return State.ppxfxbqfkf(state, false, null, null, null, false, null, ((eablkybsjg.zoijcleaow) msg).iobyxmoadg(), 63, null);
        }
        if (msg instanceof eablkybsjg.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, null, null, null, false, ((eablkybsjg.ppxfxbqfkf) msg).iobyxmoadg(), null, 95, null);
        }
        if (msg instanceof eablkybsjg.iobyxmoadg) {
            return State.ppxfxbqfkf(state, ((eablkybsjg.iobyxmoadg) msg).iobyxmoadg(), null, null, null, false, null, null, 126, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
