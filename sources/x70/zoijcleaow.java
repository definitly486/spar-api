package x70;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;
import ru.myspar.domain.feature.promotiononboarding.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f121412iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private final State zoijcleaow(State state, Promotion promotion) {
        return state.zoijcleaow(promotion.getOnboardings(), 0, false);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, 5, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return zoijcleaow(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, 0, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
