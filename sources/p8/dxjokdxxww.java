package p8;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75980iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f75981ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f75982wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75983zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        static final int f75984dxjokdxxww = 1;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        float f75985eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Context f75987iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        ppxfxbqfkf f75990ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        ActivityManager f75992zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f75991wkgbmnqykc = 2.0f;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        float f75986gxszxtbevo = 0.4f;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        float f75988lqeggnwhkg = 0.33f;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        int f75989nufgyqmvbu = 4194304;

        public iobyxmoadg(Context context) {
            this.f75985eablkybsjg = f75984dxjokdxxww;
            this.f75987iobyxmoadg = context;
            this.f75992zoijcleaow = (ActivityManager) context.getSystemService("activity");
            this.f75990ppxfxbqfkf = new zoijcleaow(context.getResources().getDisplayMetrics());
            if (dxjokdxxww.eablkybsjg(this.f75992zoijcleaow)) {
                this.f75985eablkybsjg = 0.0f;
            }
        }

        public dxjokdxxww iobyxmoadg() {
            return new dxjokdxxww(this);
        }
    }

    interface ppxfxbqfkf {
        int iobyxmoadg();

        int zoijcleaow();
    }

    private static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DisplayMetrics f75993iobyxmoadg;

        zoijcleaow(DisplayMetrics displayMetrics) {
            this.f75993iobyxmoadg = displayMetrics;
        }

        @Override // p8.dxjokdxxww.ppxfxbqfkf
        public int iobyxmoadg() {
            return this.f75993iobyxmoadg.heightPixels;
        }

        @Override // p8.dxjokdxxww.ppxfxbqfkf
        public int zoijcleaow() {
            return this.f75993iobyxmoadg.widthPixels;
        }
    }

    dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
        this.f75981ppxfxbqfkf = iobyxmoadgVar.f75987iobyxmoadg;
        int i13 = eablkybsjg(iobyxmoadgVar.f75992zoijcleaow) ? iobyxmoadgVar.f75989nufgyqmvbu / 2 : iobyxmoadgVar.f75989nufgyqmvbu;
        this.f75982wkgbmnqykc = i13;
        int iPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar.f75992zoijcleaow, iobyxmoadgVar.f75986gxszxtbevo, iobyxmoadgVar.f75988lqeggnwhkg);
        float fZoijcleaow = iobyxmoadgVar.f75990ppxfxbqfkf.zoijcleaow() * iobyxmoadgVar.f75990ppxfxbqfkf.iobyxmoadg() * 4;
        int iRound = Math.round(iobyxmoadgVar.f75985eablkybsjg * fZoijcleaow);
        int iRound2 = Math.round(fZoijcleaow * iobyxmoadgVar.f75991wkgbmnqykc);
        int i14 = iPpxfxbqfkf - i13;
        int i15 = iRound2 + iRound;
        if (i15 <= i14) {
            this.f75983zoijcleaow = iRound2;
            this.f75980iobyxmoadg = iRound;
        } else {
            float f13 = i14;
            float f14 = iobyxmoadgVar.f75985eablkybsjg;
            float f15 = iobyxmoadgVar.f75991wkgbmnqykc;
            float f16 = f13 / (f14 + f15);
            this.f75983zoijcleaow = Math.round(f15 * f16);
            this.f75980iobyxmoadg = Math.round(f16 * iobyxmoadgVar.f75985eablkybsjg);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Calculation complete, Calculated memory cache size: ");
            sb3.append(gxszxtbevo(this.f75983zoijcleaow));
            sb3.append(", pool size: ");
            sb3.append(gxszxtbevo(this.f75980iobyxmoadg));
            sb3.append(", byte array size: ");
            sb3.append(gxszxtbevo(i13));
            sb3.append(", memory class limited? ");
            sb3.append(i15 > iPpxfxbqfkf);
            sb3.append(", max size: ");
            sb3.append(gxszxtbevo(iPpxfxbqfkf));
            sb3.append(", memoryClass: ");
            sb3.append(iobyxmoadgVar.f75992zoijcleaow.getMemoryClass());
            sb3.append(", isLowMemoryDevice: ");
            sb3.append(eablkybsjg(iobyxmoadgVar.f75992zoijcleaow));
            Log.d("MemorySizeCalculator", sb3.toString());
        }
    }

    static boolean eablkybsjg(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String gxszxtbevo(int i13) {
        return Formatter.formatFileSize(this.f75981ppxfxbqfkf, i13);
    }

    private static int ppxfxbqfkf(ActivityManager activityManager, float f13, float f14) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (eablkybsjg(activityManager)) {
            f13 = f14;
        }
        return Math.round(memoryClass * f13);
    }

    public int iobyxmoadg() {
        return this.f75982wkgbmnqykc;
    }

    public int wkgbmnqykc() {
        return this.f75983zoijcleaow;
    }

    public int zoijcleaow() {
        return this.f75980iobyxmoadg;
    }
}
