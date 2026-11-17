package jj1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.list_add_product.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.zoijcleaow.f51606iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, true, 3, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.iobyxmoadg.f51605iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, false, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
