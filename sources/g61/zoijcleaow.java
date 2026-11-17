package g61;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.promocatalog.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 3, null);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        return State.ppxfxbqfkf(state, zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg(), false, 4, null);
    }
}
