package dm0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.impl.shop_search.domain.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, null, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, 23, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, null, null, false, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), null, false, null, 29, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, null, 27, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
