package jq;

import kotlin.NoWhenBranchMatchedException;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq implements tg.vdvldrhtss {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f52086iobyxmoadg;

        static {
            int[] iArr = new int[vu.btonecajqb.values().length];
            try {
                iArr[vu.btonecajqb.NOT_ENTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vu.btonecajqb.APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vu.btonecajqb.NOT_APPLIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52086iobyxmoadg = iArr;
        }
    }

    @Override // tg.vdvldrhtss
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public kq.nufgyqmvbu invoke(tzroggbefp promoCode, vu.btonecajqb promoState, String statusText) {
        vu.iobyxmoadg ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoState, "promoState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statusText, "statusText");
        int i13 = iobyxmoadg.f52086iobyxmoadg[promoState.ordinal()];
        if (i13 == 1) {
            ppxfxbqfkfVar = new vu.iobyxmoadg.ppxfxbqfkf(promoCode);
        } else if (i13 == 2) {
            ppxfxbqfkfVar = new vu.iobyxmoadg.C2930iobyxmoadg(promoCode, statusText);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new vu.iobyxmoadg.zoijcleaow(promoCode, statusText);
        }
        return new kq.nufgyqmvbu(ppxfxbqfkfVar);
    }
}
