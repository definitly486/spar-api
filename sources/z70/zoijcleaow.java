package z70;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.rateorder.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, 0, null, null, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 63, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, null, null, null, false, 125, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
