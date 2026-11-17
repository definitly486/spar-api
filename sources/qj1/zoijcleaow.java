package qj1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.list_shared_with_you.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.zoijcleaow.f78941iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, 0, false, false, true, 31, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.iobyxmoadg.f78940iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, 0, false, false, false, 31, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
