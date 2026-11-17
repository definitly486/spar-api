package g6;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f36487iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f36488ppxfxbqfkf = 20;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static volatile yggfygwlhe f36489zoijcleaow;

    public static class iobyxmoadg extends yggfygwlhe {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f36490wkgbmnqykc;

        public iobyxmoadg(int i13) {
            super(i13);
            this.f36490wkgbmnqykc = i13;
        }

        @Override // g6.yggfygwlhe
        public void btonecajqb(String str, String str2) {
            if (this.f36490wkgbmnqykc <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // g6.yggfygwlhe
        public void draadjrbmk(String str, String str2, Throwable th2) {
            if (this.f36490wkgbmnqykc <= 5) {
                Log.w(str, str2, th2);
            }
        }

        @Override // g6.yggfygwlhe
        public void gtknphoqwx(String str, String str2) {
            if (this.f36490wkgbmnqykc <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // g6.yggfygwlhe
        public void gxszxtbevo(String str, String str2) {
            if (this.f36490wkgbmnqykc <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // g6.yggfygwlhe
        public void iobyxmoadg(String str, String str2) {
            if (this.f36490wkgbmnqykc <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // g6.yggfygwlhe
        public void lqeggnwhkg(String str, String str2, Throwable th2) {
            if (this.f36490wkgbmnqykc <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // g6.yggfygwlhe
        public void ppxfxbqfkf(String str, String str2) {
            if (this.f36490wkgbmnqykc <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // g6.yggfygwlhe
        public void wkgbmnqykc(String str, String str2, Throwable th2) {
            if (this.f36490wkgbmnqykc <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // g6.yggfygwlhe
        public void zoijcleaow(String str, String str2, Throwable th2) {
            if (this.f36490wkgbmnqykc <= 3) {
                Log.d(str, str2, th2);
            }
        }
    }

    public yggfygwlhe(int i13) {
    }

    public static String dxjokdxxww(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("WM-");
        int i13 = f36488ppxfxbqfkf;
        if (length >= i13) {
            sb3.append(str.substring(0, i13));
        } else {
            sb3.append(str);
        }
        return sb3.toString();
    }

    public static yggfygwlhe eablkybsjg() {
        yggfygwlhe yggfygwlheVar;
        synchronized (f36487iobyxmoadg) {
            try {
                if (f36489zoijcleaow == null) {
                    f36489zoijcleaow = new iobyxmoadg(3);
                }
                yggfygwlheVar = f36489zoijcleaow;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yggfygwlheVar;
    }

    public static void nufgyqmvbu(yggfygwlhe yggfygwlheVar) {
        synchronized (f36487iobyxmoadg) {
            try {
                if (f36489zoijcleaow == null) {
                    f36489zoijcleaow = yggfygwlheVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void btonecajqb(String str, String str2);

    public abstract void draadjrbmk(String str, String str2, Throwable th2);

    public abstract void gtknphoqwx(String str, String str2);

    public abstract void gxszxtbevo(String str, String str2);

    public abstract void iobyxmoadg(String str, String str2);

    public abstract void lqeggnwhkg(String str, String str2, Throwable th2);

    public abstract void ppxfxbqfkf(String str, String str2);

    public abstract void wkgbmnqykc(String str, String str2, Throwable th2);

    public abstract void zoijcleaow(String str, String str2, Throwable th2);
}
