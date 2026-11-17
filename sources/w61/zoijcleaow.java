package w61;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.update.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (!(msg instanceof gxszxtbevo.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
        return state.zoijcleaow(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
