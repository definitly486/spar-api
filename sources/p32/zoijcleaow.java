package p32;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.scan.shop.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, false, false, false, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), false, false, false, false, 30, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), false, false, false, 29, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, false, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), false, false, 27, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, false, false, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, 23, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
