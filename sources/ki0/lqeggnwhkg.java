package ki0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55693iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f55694zoijcleaow;

        static {
            int[] iArr = new int[gxszxtbevo.values().length];
            try {
                iArr[gxszxtbevo.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gxszxtbevo.COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gxszxtbevo.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55693iobyxmoadg = iArr;
            int[] iArr2 = new int[ei0.iobyxmoadg.values().length];
            try {
                iArr2[ei0.iobyxmoadg.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ei0.iobyxmoadg.GROUP_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ei0.iobyxmoadg.GROUP_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f55694zoijcleaow = iArr2;
        }
    }

    public static final ei0.iobyxmoadg iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        int i13 = iobyxmoadg.f55693iobyxmoadg[gxszxtbevoVar.ordinal()];
        if (i13 == 1) {
            return ei0.iobyxmoadg.SIMPLE;
        }
        if (i13 == 2) {
            return ei0.iobyxmoadg.GROUP_URL;
        }
        if (i13 == 3) {
            return ei0.iobyxmoadg.GROUP_TIME;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final gxszxtbevo zoijcleaow(ei0.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f55694zoijcleaow[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return gxszxtbevo.ALL;
        }
        if (i13 == 2) {
            return gxszxtbevo.COUNTER;
        }
        if (i13 == 3) {
            return gxszxtbevo.GROUP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
