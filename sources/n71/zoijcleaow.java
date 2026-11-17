package n71;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.echecks.impl.dialog.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 1, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), false, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
