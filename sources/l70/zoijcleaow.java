package l70;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.coupons.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), 3, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), null, false, 2, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, 5, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.zoijcleaow.f61780iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, false, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
