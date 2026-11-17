package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long btonecajqb(int[] iArr, long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) >= 0.0f ? zg.gtknphoqwx.dxjokdxxww(dxjokdxxww(iArr[0]), Float.intBitsToFloat(i13)) : zg.gtknphoqwx.eablkybsjg(dxjokdxxww(iArr[0]), Float.intBitsToFloat(i13)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14) >= 0.0f ? zg.gtknphoqwx.dxjokdxxww(dxjokdxxww(iArr[1]), Float.intBitsToFloat(i14)) : zg.gtknphoqwx.eablkybsjg(dxjokdxxww(iArr[1]), Float.intBitsToFloat(i14)))) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float draadjrbmk(float f13) {
        return f13 * (-1.0f);
    }

    private static final float dxjokdxxww(int i13) {
        return i13 * (-1.0f);
    }

    private static final float eablkybsjg(float f13) {
        return (float) (f13 >= 0.0f ? Math.ceil(f13) : Math.floor(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gtknphoqwx(int i13) {
        return !s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow()) ? 1 : 0;
    }

    public static final int gxszxtbevo(float f13) {
        return ((int) eablkybsjg(f13)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lqeggnwhkg(long j13) {
        int i13 = Math.abs(Float.intBitsToFloat((int) (j13 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j13 & 4294967295L))) >= 0.5f ? i13 | 2 : i13;
    }

    public static final s.iobyxmoadg nufgyqmvbu(View view, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1075877987, i13, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:354)");
        }
        w wVar = (w) draadjrbmkVar.ojitshcjhn(zeieaojujs.kcexrzcfyt());
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(view) | draadjrbmkVar.ulzqkzuiru(wVar);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = a.nufgyqmvbu.f55draadjrbmk ? new a(view, wVar.wkgbmnqykc()) : new yzdjzghtvl(view);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        s.iobyxmoadg iobyxmoadgVar = (s.iobyxmoadg) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return iobyxmoadgVar;
    }
}
