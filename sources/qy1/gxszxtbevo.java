package qy1;

import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.specific.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, btonecajqb msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof btonecajqb.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, null, null, null, ((btonecajqb.ppxfxbqfkf) msg).iobyxmoadg(), null, 47, null);
        }
        if (msg instanceof btonecajqb.zoijcleaow) {
            btonecajqb.zoijcleaow zoijcleaowVar = (btonecajqb.zoijcleaow) msg;
            List basket = zoijcleaowVar.iobyxmoadg().getBasket();
            if (basket == null) {
                basket = jyumaefscl.wflxmlrfwp();
            }
            return State.ppxfxbqfkf(state, null, basket, null, null, false, zoijcleaowVar.iobyxmoadg().getPartnerCode(), 29, null);
        }
        if (msg instanceof btonecajqb.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, jyumaefscl.wflxmlrfwp(), null, null, false, null, 29, null);
        }
        if (msg instanceof btonecajqb.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, null, ((btonecajqb.wkgbmnqykc) msg).iobyxmoadg(), null, false, null, 59, null);
        }
        if (msg instanceof btonecajqb.eablkybsjg) {
            return State.ppxfxbqfkf(state, null, null, null, ((btonecajqb.eablkybsjg) msg).iobyxmoadg(), false, null, 55, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
