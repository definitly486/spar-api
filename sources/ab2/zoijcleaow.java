package ab2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.webview_screen.impl.chatorder.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo.iobyxmoadg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg.zoijcleaow) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.iobyxmoadg.zoijcleaow) msg).iobyxmoadg(), false, 2, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg.C0025iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.iobyxmoadg.C0025iobyxmoadg) msg).iobyxmoadg(), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
