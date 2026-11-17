package xb;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final lqeggnwhkg f121960ppxfxbqfkf = new lqeggnwhkg("FirebaseCrashlytics");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f121961iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f121962zoijcleaow = 4;

    public lqeggnwhkg(String str) {
        this.f121961iobyxmoadg = str;
    }

    public static lqeggnwhkg gxszxtbevo() {
        return f121960ppxfxbqfkf;
    }

    private boolean iobyxmoadg(int i13) {
        return this.f121962zoijcleaow <= i13 || Log.isLoggable(this.f121961iobyxmoadg, i13);
    }

    public void btonecajqb(String str, Throwable th2) {
        if (iobyxmoadg(2)) {
            Log.v(this.f121961iobyxmoadg, str, th2);
        }
    }

    public void draadjrbmk(String str, Throwable th2) {
        if (iobyxmoadg(5)) {
            Log.w(this.f121961iobyxmoadg, str, th2);
        }
    }

    public void dxjokdxxww(String str) {
        btonecajqb(str, null);
    }

    public void eablkybsjg(String str, Throwable th2) {
        if (iobyxmoadg(6)) {
            Log.e(this.f121961iobyxmoadg, str, th2);
        }
    }

    public void gtknphoqwx(String str) {
        draadjrbmk(str, null);
    }

    public void lqeggnwhkg(String str) {
        nufgyqmvbu(str, null);
    }

    public void nufgyqmvbu(String str, Throwable th2) {
        if (iobyxmoadg(4)) {
            Log.i(this.f121961iobyxmoadg, str, th2);
        }
    }

    public void ppxfxbqfkf(String str, Throwable th2) {
        if (iobyxmoadg(3)) {
            Log.d(this.f121961iobyxmoadg, str, th2);
        }
    }

    public void wkgbmnqykc(String str) {
        eablkybsjg(str, null);
    }

    public void zoijcleaow(String str) {
        ppxfxbqfkf(str, null);
    }
}
