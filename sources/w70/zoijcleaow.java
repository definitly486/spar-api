package w70;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.promotion.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, false, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return State.ppxfxbqfkf(state, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf(), null, zoijcleaowVar.zoijcleaow(), false, 20, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, false, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), false, 23, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
