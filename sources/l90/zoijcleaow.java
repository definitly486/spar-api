package l90;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.echecks.impl.screen.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, gxszxtbevo.zoijcleaow zoijcleaowVar) {
        return state.zoijcleaow(zoijcleaowVar.zoijcleaow(), false, true, zoijcleaowVar.iobyxmoadg());
    }

    private final State wkgbmnqykc(State state, gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar) {
        return State.ppxfxbqfkf(state, null, ppxfxbqfkfVar.iobyxmoadg(), !ppxfxbqfkfVar.iobyxmoadg(), false, 9, null);
    }

    private final State zoijcleaow(State state, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        return State.ppxfxbqfkf(state, iobyxmoadgVar.iobyxmoadg(), false, false, iobyxmoadgVar.zoijcleaow(), 6, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return wkgbmnqykc(state, (gxszxtbevo.ppxfxbqfkf) msg);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return zoijcleaow(state, (gxszxtbevo.iobyxmoadg) msg);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return ppxfxbqfkf(state, (gxszxtbevo.zoijcleaow) msg);
        }
        throw new NoWhenBranchMatchedException();
    }
}
