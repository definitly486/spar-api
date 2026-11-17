package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f7381iobyxmoadg;

        static {
            int[] iArr = new int[jyumaefscl.values().length];
            try {
                iArr[jyumaefscl.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jyumaefscl.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jyumaefscl.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7381iobyxmoadg = iArr;
        }
    }

    public static final boolean iobyxmoadg(jyumaefscl jyumaefsclVar, boolean z13) {
        int i13 = iobyxmoadg.f7381iobyxmoadg[jyumaefsclVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        if (i13 == 3) {
            return z13;
        }
        throw new NoWhenBranchMatchedException();
    }
}
