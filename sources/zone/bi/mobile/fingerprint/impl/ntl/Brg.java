package zone.bi.mobile.fingerprint.impl.ntl;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import t6.iyctptxqzt;
import t6.lmojexxdyd;
import t6.m1;

/* JADX INFO: loaded from: classes6.dex */
public final class Brg implements lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f130658iobyxmoadg = m1.iobyxmoadg(new byte[]{-62, -127, -85, -8, 2, 94, -94, 100, 3, -98, -105, -117, -60, 68, 22, -51});

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f130660zoijcleaow = m1.iobyxmoadg(new byte[]{37, -45, -29, 126, 39, -103, -8, -74, 114, -82, 76, -58, -5, 97, 10, -110, 83, 32, 51, -41, 62, 48, -91, 118, -66, 117, -112, -45, 67, -101, -82, 81});

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f130659ppxfxbqfkf = {m1.iobyxmoadg(new byte[]{-7, -46, -26, -123, -69, -48, 9, 37, 40, -24, 70, 91, 26, 78, 108, -5}), m1.iobyxmoadg(new byte[]{7, 97, 2, 67, -76, 73, 5, -128, -40, 70, -2, -92, 46, 117, 0, 16}), m1.iobyxmoadg(new byte[]{56, 91, -51, -102, 48, 35, 125, 7, 117, 3, 122, -70, -117, -5, -85, 127})};

    private static boolean dxjokdxxww(String str) {
        for (String str2 : f130659ppxfxbqfkf) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean eablkybsjg(String str) {
        try {
            System.load(nufgyqmvbu(str));
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    private static native int ff();

    private static native int fm();

    private static native int fs();

    private static boolean gxszxtbevo() {
        try {
            System.loadLibrary(f130658iobyxmoadg);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    private static boolean lqeggnwhkg(String str) {
        boolean zGxszxtbevo = gxszxtbevo();
        return !zGxszxtbevo ? eablkybsjg(str) : zGxszxtbevo;
    }

    private static String nufgyqmvbu(String str) {
        return String.format(Locale.ROOT, m1.iobyxmoadg(new byte[]{16, -26, -115, -112, -118, 50, 75, -100, -77, -40, 11, -122, -127, -94, 28, -63}), str, f130658iobyxmoadg);
    }

    @Override // t6.lmojexxdyd
    public int iobyxmoadg() {
        return ff();
    }

    @Override // t6.lmojexxdyd
    public int ppxfxbqfkf() {
        try {
            Iterator it = iyctptxqzt.iobyxmoadg(new File(f130660zoijcleaow)).iterator();
            while (it.hasNext()) {
                if (dxjokdxxww((String) it.next())) {
                    return 2;
                }
            }
            return fm();
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // t6.lmojexxdyd
    public boolean wkgbmnqykc(Context context) {
        return lqeggnwhkg(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // t6.lmojexxdyd
    public int zoijcleaow() {
        return fs();
    }
}
