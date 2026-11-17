package qt;

/* JADX INFO: loaded from: classes4.dex */
public enum zoijcleaow {
    FULL,
    HALF,
    SMALL,
    PRICE_AND_AMOUNT,
    LOCAL_SCREEN_CHANGES;


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f80625lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f80628iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            try {
                iArr[zoijcleaow.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zoijcleaow.HALF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zoijcleaow.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80628iobyxmoadg = iArr;
        }
    }

    public final boolean wkgbmnqykc() {
        int i13 = iobyxmoadg.f80628iobyxmoadg[ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3;
    }
}
