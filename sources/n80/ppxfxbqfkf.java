package n80;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.update.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, lqeggnwhkg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (!(msg instanceof lqeggnwhkg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        lqeggnwhkg.iobyxmoadg iobyxmoadgVar = (lqeggnwhkg.iobyxmoadg) msg;
        return state.zoijcleaow(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
