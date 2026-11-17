package ru.myspar.domain.feature.review.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (!(msg instanceof eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) msg;
        return State.ppxfxbqfkf(state, iobyxmoadgVar.zoijcleaow(), null, iobyxmoadgVar.iobyxmoadg(), 2, null);
    }
}
