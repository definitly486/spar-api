package androidx.compose.ui.viewinterop;

import android.view.View;
import x.vdvldrhtss;
import z.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f7261iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg implements s.iobyxmoadg {
        iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dxjokdxxww(int i13) {
        return i13 == 0 ? s.eablkybsjg.f105077iobyxmoadg.zoijcleaow() : s.eablkybsjg.f105077iobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(View view, pkzmftpjix pkzmftpjixVar) {
        long jEablkybsjg = vdvldrhtss.eablkybsjg(pkzmftpjixVar.pmvmpeiblj());
        int iRound = Math.round(Float.intBitsToFloat((int) (jEablkybsjg >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jEablkybsjg & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lqeggnwhkg(int i13) {
        return i13 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nufgyqmvbu(float f13) {
        return f13 * (-1.0f);
    }
}
