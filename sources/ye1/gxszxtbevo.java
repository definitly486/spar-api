package ye1;

import b31.btonecajqb;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f124653iobyxmoadg;

        static {
            int[] iArr = new int[ce1.wkgbmnqykc.values().length];
            try {
                iArr[ce1.wkgbmnqykc.IN_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ce1.wkgbmnqykc.LATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ce1.wkgbmnqykc.NEED_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ce1.wkgbmnqykc.PICKUP_IN_SHOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ce1.wkgbmnqykc.PICKUP_IN_POSTAMAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f124653iobyxmoadg = iArr;
        }
    }

    public static final cf1.iobyxmoadg iobyxmoadg(ce1.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        int i13 = iobyxmoadg.f124653iobyxmoadg[wkgbmnqykcVar.ordinal()];
        if (i13 == 1) {
            return cf1.iobyxmoadg.GREEN;
        }
        if (i13 == 2) {
            return cf1.iobyxmoadg.YELLOW;
        }
        if (i13 == 3) {
            return cf1.iobyxmoadg.RED;
        }
        if (i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return cf1.iobyxmoadg.GREEN;
    }

    public static final cf1.zoijcleaow ppxfxbqfkf(ce1.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return new cf1.zoijcleaow(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.iobyxmoadg(), iobyxmoadg(ppxfxbqfkfVar.wkgbmnqykc()), zoijcleaow(ppxfxbqfkfVar.wkgbmnqykc()));
    }

    public static final Integer zoijcleaow(ce1.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (wkgbmnqykcVar == ce1.wkgbmnqykc.PICKUP_IN_POSTAMAT) {
            return Integer.valueOf(btonecajqb.order_status_banner_qr);
        }
        return null;
    }
}
