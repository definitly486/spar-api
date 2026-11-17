package w40;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public enum nufgyqmvbu {
    Initial,
    ToShow,
    ToHide;


    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f118733cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f118738iobyxmoadg;

        static {
            int[] iArr = new int[nufgyqmvbu.values().length];
            try {
                iArr[nufgyqmvbu.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nufgyqmvbu.ToHide.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nufgyqmvbu.ToShow.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f118738iobyxmoadg = iArr;
        }
    }

    public final boolean lqeggnwhkg() {
        int i13 = iobyxmoadg.f118738iobyxmoadg[ordinal()];
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return false;
        }
        if (i13 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean wkgbmnqykc() {
        int i13 = iobyxmoadg.f118738iobyxmoadg[ordinal()];
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
