package o61;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.sharepromo.store.State;
import ru.myspar.proloyalty.user.domain.model.UserSharePromo;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, UserSharePromo userSharePromo) {
        return state.zoijcleaow(userSharePromo.getImage(), userSharePromo.getText(), userSharePromo.getPromoCode(), userSharePromo.getShareMsg(), userSharePromo.getIsPromoAvailable(), false);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, null, null, null, false, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 31, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return ppxfxbqfkf(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
