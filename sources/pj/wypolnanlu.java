package pj;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public enum wypolnanlu {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f76800esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f76805iobyxmoadg;

        static {
            int[] iArr = new int[wypolnanlu.values().length];
            try {
                iArr[wypolnanlu.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wypolnanlu.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wypolnanlu.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wypolnanlu.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f76805iobyxmoadg = iArr;
        }
    }

    public final boolean lqeggnwhkg() {
        return this == LAZY;
    }

    public final void wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int i13 = iobyxmoadg.f76805iobyxmoadg[ordinal()];
        if (i13 == 1) {
            vj.iobyxmoadg.ppxfxbqfkf(rgvfuqvkyqVar, obj, gxszxtbevoVar);
            return;
        }
        if (i13 == 2) {
            lg.nufgyqmvbu.zoijcleaow(rgvfuqvkyqVar, obj, gxszxtbevoVar);
        } else if (i13 == 3) {
            vj.zoijcleaow.iobyxmoadg(rgvfuqvkyqVar, obj, gxszxtbevoVar);
        } else if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
