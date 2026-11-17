package androidx.compose.animation;

import tg.rgvfuqvkyq;
import vipkmwdibw.d0;
import vipkmwdibw.draadjrbmk;
import vipkmwdibw.wwaezpbzkn;
import w0.oxmwwwfdhm;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final long f4436iobyxmoadg;

    static {
        long j13 = Integer.MIN_VALUE;
        f4436iobyxmoadg = oxmwwwfdhm.ppxfxbqfkf((j13 & 4294967295L) | (j13 << 32));
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, wwaezpbzkn wwaezpbzknVar, rgvfuqvkyq rgvfuqvkyqVar) {
        return e.eablkybsjg.zoijcleaow(wkgbmnqykcVar).eablkybsjg(new SizeAnimationModifierElement(wwaezpbzknVar, a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), rgvfuqvkyqVar));
    }

    public static final long ppxfxbqfkf() {
        return f4436iobyxmoadg;
    }

    public static final boolean wkgbmnqykc(long j13) {
        return !oxmwwwfdhm.eablkybsjg(j13, f4436iobyxmoadg);
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, wwaezpbzkn wwaezpbzknVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            wwaezpbzknVar = draadjrbmk.btonecajqb(0.0f, 400.0f, oxmwwwfdhm.zoijcleaow(d0.gxszxtbevo(oxmwwwfdhm.f118270zoijcleaow)), 1, null);
        }
        if ((i13 & 2) != 0) {
            rgvfuqvkyqVar = null;
        }
        return iobyxmoadg(wkgbmnqykcVar, wwaezpbzknVar, rgvfuqvkyqVar);
    }
}
