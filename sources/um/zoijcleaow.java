package um;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.address.impl.address_search.domain.State;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof eablkybsjg.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, ((eablkybsjg.zoijcleaow) msg).iobyxmoadg(), null, null, null, 29, null);
        }
        if (msg instanceof eablkybsjg.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, false, null, null, ((eablkybsjg.iobyxmoadg) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof eablkybsjg.ppxfxbqfkf) {
            eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) msg;
            return State.ppxfxbqfkf(state, null, false, ppxfxbqfkfVar.iobyxmoadg(), null, kcexrzcfyt.zfvoamnweg(ppxfxbqfkfVar.iobyxmoadg().draadjrbmk()) ? rn.eablkybsjg.INPUT_EMPTY : state.getInputWarning(), 11, null);
        }
        if (!(msg instanceof eablkybsjg.wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) msg;
        return State.ppxfxbqfkf(state, null, false, null, wkgbmnqykcVar.iobyxmoadg(), (!wkgbmnqykcVar.iobyxmoadg().isEmpty() || kcexrzcfyt.zfvoamnweg(state.getSearchInput().draadjrbmk())) ? state.getInputWarning() : rn.eablkybsjg.NOT_FOUND, 7, null);
    }
}
