package vo0;

import kotlin.NoWhenBranchMatchedException;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq implements tg.vdvldrhtss {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117602iobyxmoadg;

        static {
            int[] iArr = new int[pt0.btonecajqb.values().length];
            try {
                iArr[pt0.btonecajqb.NOT_ENTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pt0.btonecajqb.APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pt0.btonecajqb.NOT_APPLIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117602iobyxmoadg = iArr;
        }
    }

    @Override // tg.vdvldrhtss
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wo0.dxjokdxxww invoke(tzroggbefp promoCode, pt0.btonecajqb promoState, String statusText) {
        pt0.iobyxmoadg ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoState, "promoState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statusText, "statusText");
        int i13 = iobyxmoadg.f117602iobyxmoadg[promoState.ordinal()];
        if (i13 == 1) {
            ppxfxbqfkfVar = new pt0.iobyxmoadg.ppxfxbqfkf(promoCode);
        } else if (i13 == 2) {
            ppxfxbqfkfVar = new pt0.iobyxmoadg.C1715iobyxmoadg(promoCode, statusText);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new pt0.iobyxmoadg.zoijcleaow(promoCode, statusText);
        }
        return new wo0.dxjokdxxww(ppxfxbqfkfVar);
    }
}
