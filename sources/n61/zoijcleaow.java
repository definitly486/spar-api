package n61;

import hg.jyumaefscl;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.savedcards.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State zoijcleaow(State state, g01.iobyxmoadg iobyxmoadgVar) {
        Set setQ = jyumaefscl.q(state.getExpandedQuestions());
        g01.iobyxmoadg iobyxmoadgVar2 = setQ.contains(iobyxmoadgVar) ? iobyxmoadgVar : null;
        if (iobyxmoadgVar2 != null) {
            setQ.remove(iobyxmoadgVar2);
        } else {
            setQ.add(iobyxmoadgVar);
        }
        return State.ppxfxbqfkf(state, false, null, setQ, 3, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, null, 6, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), null, 5, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return zoijcleaow(state, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
