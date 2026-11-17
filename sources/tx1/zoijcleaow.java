package tx1;

import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.Purchases;
import ru.myspar.purchases.impl.history.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f111797iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        Purchases purchasesPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, null, 0, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, 23, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, null, 0, false, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), 15, null);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        if (zoijcleaowVar.iobyxmoadg() == 1) {
            purchasesPpxfxbqfkf = zoijcleaowVar.zoijcleaow();
        } else {
            Purchases purchaseInfo = state.getPurchaseInfo();
            purchasesPpxfxbqfkf = purchaseInfo != null ? Purchases.ppxfxbqfkf(purchaseInfo, jyumaefscl.ixidwrxhsl(state.getPurchaseInfo().getPurchases(), zoijcleaowVar.zoijcleaow().getPurchases()), null, null, false, 14, null) : null;
        }
        return State.ppxfxbqfkf(state, null, purchasesPpxfxbqfkf, zoijcleaowVar.iobyxmoadg(), false, false, 9, null);
    }
}
