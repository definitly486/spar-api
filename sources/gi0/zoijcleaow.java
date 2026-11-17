package gi0;

import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;
import ru.myspar.networkpanel.impl.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.C0847gxszxtbevo) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.C0847gxszxtbevo) msg).iobyxmoadg(), null, null, 13, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), null, null, null, 14, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            Set setQ = jyumaefscl.q(state.getSelectedGroupItems());
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) msg;
            if (setQ.contains(ppxfxbqfkfVar.iobyxmoadg())) {
                setQ.remove(ppxfxbqfkfVar.iobyxmoadg());
            } else {
                setQ.add(ppxfxbqfkfVar.iobyxmoadg());
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            return State.ppxfxbqfkf(state, null, null, setQ, null, 11, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.iobyxmoadg.f37502iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, null, ikoacuggdj.eablkybsjg(), null, 3, null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return State.ppxfxbqfkf(state, null, null, null, ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), 7, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            PayloadHolder networkPayload = state.getNetworkPayload();
            return State.ppxfxbqfkf(state, null, null, null, networkPayload != null ? PayloadHolder.ppxfxbqfkf(networkPayload, null, null, null, false, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), 15, null) : null, 7, null);
        }
        if (!(msg instanceof gxszxtbevo.wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        PayloadHolder networkPayload2 = state.getNetworkPayload();
        return State.ppxfxbqfkf(state, null, null, null, networkPayload2 != null ? PayloadHolder.ppxfxbqfkf(networkPayload2, null, null, null, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, 23, null) : null, 7, null);
    }
}
