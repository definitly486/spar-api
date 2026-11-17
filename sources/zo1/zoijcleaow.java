package zo1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.onboarding.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (zdlpuopuiu.eablkybsjg(msg, eablkybsjg.iobyxmoadg.f130634iobyxmoadg)) {
            return state.zoijcleaow(state.getCurrentPage() - 1);
        }
        if (zdlpuopuiu.eablkybsjg(msg, eablkybsjg.zoijcleaow.f130635iobyxmoadg)) {
            return state.zoijcleaow(state.getCurrentPage() + 1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
