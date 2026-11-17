package z22;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.cart.domain.State;
import ru.myspar.scango.impl.screens.cart.presentation.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: z22.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3261iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f127715iobyxmoadg;

        static {
            int[] iArr = new int[State.iobyxmoadg.values().length];
            try {
                iArr[State.iobyxmoadg.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.iobyxmoadg.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127715iobyxmoadg = iArr;
        }
    }

    public static final wkgbmnqykc iobyxmoadg(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new wkgbmnqykc(state.getIsLoadingVisible(), state.getTotalPriceInt(), state.getTotalPriceFractional(), state.getIsCheckoutBtnEnabled(), state.getContent(), zoijcleaow(state.getCartState()), state.getIsReturnProductFlatEnabled(), state.getTimerValue(), state.getStartText());
    }

    public static final wkgbmnqykc.iobyxmoadg zoijcleaow(State.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = C3261iobyxmoadg.f127715iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return wkgbmnqykc.iobyxmoadg.EMPTY;
        }
        if (i13 == 2) {
            return wkgbmnqykc.iobyxmoadg.FILL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
