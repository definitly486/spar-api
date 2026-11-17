package th0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import s40.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f110530iobyxmoadg;

        static {
            int[] iArr = new int[xg0.lqeggnwhkg.values().length];
            try {
                iArr[xg0.lqeggnwhkg.IN_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.lqeggnwhkg.LATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.lqeggnwhkg.NEED_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xg0.lqeggnwhkg.PICKUP_IN_SHOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xg0.lqeggnwhkg.PICKUP_IN_POSTAMAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f110530iobyxmoadg = iArr;
        }
    }

    public static final xh0.iobyxmoadg iobyxmoadg(xg0.lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        int i13 = iobyxmoadg.f110530iobyxmoadg[lqeggnwhkgVar.ordinal()];
        if (i13 == 1) {
            return xh0.iobyxmoadg.GREEN;
        }
        if (i13 == 2) {
            return xh0.iobyxmoadg.YELLOW;
        }
        if (i13 == 3) {
            return xh0.iobyxmoadg.RED;
        }
        if (i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return xh0.iobyxmoadg.GREEN;
    }

    public static final xh0.zoijcleaow ppxfxbqfkf(xg0.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return new xh0.zoijcleaow(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.ppxfxbqfkf(), gxszxtbevoVar.iobyxmoadg(), iobyxmoadg(gxszxtbevoVar.wkgbmnqykc()), zoijcleaow(gxszxtbevoVar.wkgbmnqykc()));
    }

    public static final Integer zoijcleaow(xg0.lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar == xg0.lqeggnwhkg.PICKUP_IN_POSTAMAT) {
            return Integer.valueOf(btonecajqb.order_status_banner_qr);
        }
        return null;
    }
}
