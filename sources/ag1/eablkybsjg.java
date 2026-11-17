package ag1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f1791iobyxmoadg = new eablkybsjg();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f1792iobyxmoadg;

        static {
            int[] iArr = new int[dg1.zoijcleaow.values().length];
            try {
                iArr[dg1.zoijcleaow.RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dg1.zoijcleaow.DATETIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dg1.zoijcleaow.ORDER_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dg1.zoijcleaow.TOTAL_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dg1.zoijcleaow.BONUSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1792iobyxmoadg = iArr;
        }
    }

    private eablkybsjg() {
    }

    public final String iobyxmoadg(dg1.zoijcleaow type) {
        zdlpuopuiu.btonecajqb(type, "type");
        int i13 = iobyxmoadg.f1792iobyxmoadg[type.ordinal()];
        if (i13 == 1) {
            return "tvReceiver";
        }
        if (i13 == 2) {
            return "tvDateTime";
        }
        if (i13 == 3) {
            return "tvOrderStatus";
        }
        if (i13 == 4) {
            return "tvTotalPrice";
        }
        if (i13 == 5) {
            return "tvBonuses";
        }
        throw new NoWhenBranchMatchedException();
    }
}
