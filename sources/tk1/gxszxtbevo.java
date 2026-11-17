package tk1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f111007iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f111008zoijcleaow;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            try {
                iArr[eablkybsjg.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eablkybsjg.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111007iobyxmoadg = iArr;
            int[] iArr2 = new int[xk1.iobyxmoadg.values().length];
            try {
                iArr2[xk1.iobyxmoadg.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[xk1.iobyxmoadg.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f111008zoijcleaow = iArr2;
        }
    }

    public static final xk1.iobyxmoadg iobyxmoadg(eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        int i13 = iobyxmoadg.f111007iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return xk1.iobyxmoadg.ACTIVATED;
        }
        if (i13 == 2) {
            return xk1.iobyxmoadg.ARCHIVED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final eablkybsjg zoijcleaow(xk1.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f111008zoijcleaow[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return eablkybsjg.ACTIVATED;
        }
        if (i13 == 2) {
            return eablkybsjg.ARCHIVED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
