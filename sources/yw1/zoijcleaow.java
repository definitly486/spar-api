package yw1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo.iobyxmoadg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg.zoijcleaow) {
            gxszxtbevo.iobyxmoadg.zoijcleaow zoijcleaowVar = (gxszxtbevo.iobyxmoadg.zoijcleaow) msg;
            return State.ppxfxbqfkf(state, zoijcleaowVar.zoijcleaow(), false, zoijcleaowVar.iobyxmoadg(), 2, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg.C3241iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.iobyxmoadg.C3241iobyxmoadg) msg).iobyxmoadg(), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
