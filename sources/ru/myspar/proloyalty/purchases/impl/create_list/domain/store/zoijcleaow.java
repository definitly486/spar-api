package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof eablkybsjg.iobyxmoadg) {
            return State.ppxfxbqfkf(state, ((eablkybsjg.iobyxmoadg) msg).iobyxmoadg(), null, null, 6, null);
        }
        if (msg instanceof eablkybsjg.zoijcleaow) {
            return State.ppxfxbqfkf(state, false, null, ((eablkybsjg.zoijcleaow) msg).iobyxmoadg(), 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
