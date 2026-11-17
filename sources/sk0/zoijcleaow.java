package sk0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.profile.impl.profile_screen.domain.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), null, false, false, false, 30, null);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        return state.zoijcleaow(false, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.ppxfxbqfkf());
    }
}
