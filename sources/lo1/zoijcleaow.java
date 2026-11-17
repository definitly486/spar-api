package lo1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), 0, null, false, null, null, 62, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, 0, null, false, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 31, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, false, 0, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, null, 55, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, 0, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), false, null, null, 59, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
