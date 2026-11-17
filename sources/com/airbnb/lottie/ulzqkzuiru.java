package com.airbnb.lottie;

/* JADX INFO: loaded from: classes2.dex */
public enum ulzqkzuiru {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20514iobyxmoadg;

        static {
            int[] iArr = new int[ulzqkzuiru.values().length];
            f20514iobyxmoadg = iArr;
            try {
                iArr[ulzqkzuiru.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20514iobyxmoadg[ulzqkzuiru.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20514iobyxmoadg[ulzqkzuiru.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean wkgbmnqykc(int i13, boolean z13, int i14) {
        int i15 = iobyxmoadg.f20514iobyxmoadg[ordinal()];
        if (i15 == 1) {
            return false;
        }
        if (i15 != 2) {
            return (z13 && i13 < 28) || i14 > 4 || i13 <= 25;
        }
        return true;
    }
}
