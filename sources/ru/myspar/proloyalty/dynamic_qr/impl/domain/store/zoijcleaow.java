package ru.myspar.proloyalty.dynamic_qr.impl.domain.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), null, false, 13, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, null, false, 14, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, false, null, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, 11, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 7, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
