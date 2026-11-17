package ii1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.profile.impl.profile_screen.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), null, null, false, false, false, 62, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return State.ppxfxbqfkf(state, false, null, null, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), 7, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), null, false, false, false, 61, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), false, false, false, 59, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
