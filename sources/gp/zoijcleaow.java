package gp;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.impl.domain.registrationverification.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, null, false, null, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), 31, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, null, null, false, 61, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, null, false, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, false, 55, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), null, false, null, null, false, 62, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, null, null, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), null, null, false, 59, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
