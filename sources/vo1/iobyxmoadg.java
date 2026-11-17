package vo1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.cart.domain.State;
import ru.myspar.proloyalty.scango.impl.screens.cart.presentation.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: vo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2925iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117618iobyxmoadg;

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
            f117618iobyxmoadg = iArr;
        }
    }

    public static final wkgbmnqykc iobyxmoadg(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new wkgbmnqykc(state.getIsLoadingVisible(), state.getTotalPriceInt(), state.getTotalPriceFractional(), state.getIsCheckoutBtnEnabled(), state.getContent(), zoijcleaow(state.getCartState()), state.getIsReturnProductFlatEnabled(), state.getTimerValue(), state.getStartText());
    }

    public static final wkgbmnqykc.iobyxmoadg zoijcleaow(State.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = C2925iobyxmoadg.f117618iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return wkgbmnqykc.iobyxmoadg.EMPTY;
        }
        if (i13 == 2) {
            return wkgbmnqykc.iobyxmoadg.FILL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
