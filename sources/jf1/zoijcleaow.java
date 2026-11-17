package jf1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f51209iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f51210zoijcleaow;

        static {
            int[] iArr = new int[b01.iobyxmoadg.values().length];
            try {
                iArr[b01.iobyxmoadg.ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b01.iobyxmoadg.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51209iobyxmoadg = iArr;
            int[] iArr2 = new int[jf1.iobyxmoadg.values().length];
            try {
                iArr2[jf1.iobyxmoadg.ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[jf1.iobyxmoadg.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f51210zoijcleaow = iArr2;
        }
    }

    public static final b01.iobyxmoadg iobyxmoadg(jf1.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f51210zoijcleaow[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return b01.iobyxmoadg.ORDERS;
        }
        if (i13 == 2) {
            return b01.iobyxmoadg.PROMO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final jf1.iobyxmoadg zoijcleaow(b01.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f51209iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return jf1.iobyxmoadg.ORDERS;
        }
        if (i13 == 2) {
            return jf1.iobyxmoadg.PROMO;
        }
        throw new NoWhenBranchMatchedException();
    }
}
