package d61;

import hg.ikoacuggdj;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.filtersall.store.State;

/* JADX INFO: loaded from: classes5.dex */
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
        Set setWflxmlrfwp = iobyxmoadgVar.zoijcleaow() ? ikoacuggdj.wflxmlrfwp(state.getCheckedFilterIds(), iobyxmoadgVar.iobyxmoadg()) : ikoacuggdj.gtknphoqwx(state.getCheckedFilterIds(), iobyxmoadgVar.iobyxmoadg());
        return State.ppxfxbqfkf(state, null, null, !setWflxmlrfwp.isEmpty(), null, setWflxmlrfwp, null, 43, null);
    }
}
