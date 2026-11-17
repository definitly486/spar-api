package i7;

import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42053iobyxmoadg;

        static {
            int[] iArr = new int[f7.nufgyqmvbu.values().length];
            try {
                iArr[f7.nufgyqmvbu.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f7.nufgyqmvbu.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42053iobyxmoadg = iArr;
        }
    }

    public static final long iobyxmoadg(bl.eablkybsjg eablkybsjgVar, bl.gxszxtbevo gxszxtbevoVar, long j13, long j14) {
        if (gxszxtbevoVar.hcddaimhww() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte bDraadjrbmk = gxszxtbevoVar.draadjrbmk(0);
        long jHcddaimhww = j14 - ((long) gxszxtbevoVar.hcddaimhww());
        long j15 = j13;
        while (j15 < jHcddaimhww) {
            long jSopmlzcsov = eablkybsjgVar.sopmlzcsov(bDraadjrbmk, j15, jHcddaimhww);
            if (jSopmlzcsov == -1 || eablkybsjgVar.tzroggbefp(jSopmlzcsov, gxszxtbevoVar)) {
                return jSopmlzcsov;
            }
            j15 = jSopmlzcsov + 1;
        }
        return -1L;
    }

    public static final float ppxfxbqfkf(f7.ppxfxbqfkf ppxfxbqfkfVar, f7.nufgyqmvbu nufgyqmvbuVar) {
        if (ppxfxbqfkfVar instanceof f7.ppxfxbqfkf.iobyxmoadg) {
            return ((f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).f33044iobyxmoadg;
        }
        int i13 = iobyxmoadg.f42053iobyxmoadg[nufgyqmvbuVar.ordinal()];
        if (i13 == 1) {
            return Float.MIN_VALUE;
        }
        if (i13 == 2) {
            return Float.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Bitmap.Config wkgbmnqykc(Bitmap.Config config) {
        return (config == null || zoijcleaow(config)) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final boolean zoijcleaow(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
