package aj0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f2083iobyxmoadg = new eablkybsjg();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f2084iobyxmoadg;

        static {
            int[] iArr = new int[dj0.zoijcleaow.values().length];
            try {
                iArr[dj0.zoijcleaow.RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dj0.zoijcleaow.DATETIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dj0.zoijcleaow.ORDER_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dj0.zoijcleaow.TOTAL_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dj0.zoijcleaow.BONUSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2084iobyxmoadg = iArr;
        }
    }

    private eablkybsjg() {
    }

    public final String iobyxmoadg(dj0.zoijcleaow type) {
        zdlpuopuiu.btonecajqb(type, "type");
        int i13 = iobyxmoadg.f2084iobyxmoadg[type.ordinal()];
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
