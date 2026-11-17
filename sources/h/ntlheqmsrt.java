package h;

import android.graphics.Path;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ntlheqmsrt {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f38930iobyxmoadg;

        static {
            int[] iArr = new int[mhtqkkgtqm.zoijcleaow.values().length];
            try {
                iArr[mhtqkkgtqm.zoijcleaow.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mhtqkkgtqm.zoijcleaow.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38930iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction eablkybsjg(mhtqkkgtqm.zoijcleaow zoijcleaowVar) {
        int i13 = iobyxmoadg.f38930iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return Path.Direction.CCW;
        }
        if (i13 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mhtqkkgtqm iobyxmoadg() {
        return new wypolnanlu(null, 1, 0 == true ? 1 : 0);
    }

    public static final mhtqkkgtqm ppxfxbqfkf(Path path) {
        return new wypolnanlu(path);
    }

    public static final void wkgbmnqykc(String str) {
        throw new IllegalStateException(str);
    }
}
