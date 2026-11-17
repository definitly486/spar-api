package ru.myspar.support_service.impl.domain.store;

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
            return state.zoijcleaow(((eablkybsjg.iobyxmoadg) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
