package ni1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.promo_collection.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, false, null, null, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, 47, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, null, null, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 31, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), null, null, null, null, null, 62, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
