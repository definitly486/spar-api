package f;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public enum rgvfuqvkyq implements ojitshcjhn {
    Active,
    ActiveParent,
    Captured,
    Inactive;


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f32481esjtqupxsv = ng.zoijcleaow.iobyxmoadg(lqeggnwhkg());

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f32486iobyxmoadg;

        static {
            int[] iArr = new int[rgvfuqvkyq.values().length];
            try {
                iArr[rgvfuqvkyq.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rgvfuqvkyq.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rgvfuqvkyq.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rgvfuqvkyq.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32486iobyxmoadg = iArr;
        }
    }

    @Override // f.ojitshcjhn
    public boolean iobyxmoadg() {
        int i13 = iobyxmoadg.f32486iobyxmoadg[ordinal()];
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3 || i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // f.ojitshcjhn
    public boolean wkgbmnqykc() {
        int i13 = iobyxmoadg.f32486iobyxmoadg[ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return true;
        }
        if (i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
