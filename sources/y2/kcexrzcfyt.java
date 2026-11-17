package y2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f123562ppxfxbqfkf = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static int f123564zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f123561iobyxmoadg = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static iobyxmoadg f123563wkgbmnqykc = iobyxmoadg.f123565iobyxmoadg;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f123565iobyxmoadg = new C3122iobyxmoadg();

        /* JADX INFO: renamed from: y2.kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C3122iobyxmoadg implements iobyxmoadg {
            C3122iobyxmoadg() {
            }

            @Override // y2.kcexrzcfyt.iobyxmoadg
            public void iobyxmoadg(String str, String str2, Throwable th2) {
                Log.d(str, kcexrzcfyt.iobyxmoadg(str2, th2));
            }

            @Override // y2.kcexrzcfyt.iobyxmoadg
            public void ppxfxbqfkf(String str, String str2, Throwable th2) {
                Log.e(str, kcexrzcfyt.iobyxmoadg(str2, th2));
            }

            @Override // y2.kcexrzcfyt.iobyxmoadg
            public void wkgbmnqykc(String str, String str2, Throwable th2) {
                Log.i(str, kcexrzcfyt.iobyxmoadg(str2, th2));
            }

            @Override // y2.kcexrzcfyt.iobyxmoadg
            public void zoijcleaow(String str, String str2, Throwable th2) {
                Log.w(str, kcexrzcfyt.iobyxmoadg(str2, th2));
            }
        }

        void iobyxmoadg(String str, String str2, Throwable th2);

        void ppxfxbqfkf(String str, String str2, Throwable th2);

        void wkgbmnqykc(String str, String str2, Throwable th2);

        void zoijcleaow(String str, String str2, Throwable th2);
    }

    public static void dxjokdxxww(String str, String str2, Throwable th2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow <= 2) {
                    f123563wkgbmnqykc.zoijcleaow(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String eablkybsjg(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f123561iobyxmoadg) {
            try {
                if (lqeggnwhkg(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f123562ppxfxbqfkf) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void gxszxtbevo(String str, String str2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow <= 1) {
                    f123563wkgbmnqykc.wkgbmnqykc(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String iobyxmoadg(String str, Throwable th2) {
        String strEablkybsjg = eablkybsjg(th2);
        if (TextUtils.isEmpty(strEablkybsjg)) {
            return str;
        }
        return str + "\n  " + strEablkybsjg.replace("\n", "\n  ") + '\n';
    }

    private static boolean lqeggnwhkg(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void nufgyqmvbu(String str, String str2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow <= 2) {
                    f123563wkgbmnqykc.zoijcleaow(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void ppxfxbqfkf(String str, String str2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow <= 3) {
                    f123563wkgbmnqykc.ppxfxbqfkf(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void wkgbmnqykc(String str, String str2, Throwable th2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow <= 3) {
                    f123563wkgbmnqykc.ppxfxbqfkf(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void zoijcleaow(String str, String str2) {
        synchronized (f123561iobyxmoadg) {
            try {
                if (f123564zoijcleaow == 0) {
                    f123563wkgbmnqykc.iobyxmoadg(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
