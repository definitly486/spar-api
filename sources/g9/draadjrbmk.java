package g9;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile Handler f36683ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f36682iobyxmoadg = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final char[] f36684zoijcleaow = new char[64];

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f36685iobyxmoadg;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f36685iobyxmoadg = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36685iobyxmoadg[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36685iobyxmoadg[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36685iobyxmoadg[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36685iobyxmoadg[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int agtfadlqog(int i13, int i14) {
        return (i14 * 31) + i13;
    }

    public static List btonecajqb(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int draadjrbmk(float f13) {
        return wflxmlrfwp(f13, 17);
    }

    public static int dxjokdxxww(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i13 = iobyxmoadg.f36685iobyxmoadg[config.ordinal()];
        if (i13 == 1) {
            return 1;
        }
        if (i13 == 2 || i13 == 3) {
            return 2;
        }
        return i13 != 4 ? 4 : 8;
    }

    private static String eablkybsjg(byte[] bArr, char[] cArr) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b13 = bArr[i13];
            int i14 = i13 * 2;
            char[] cArr2 = f36682iobyxmoadg;
            cArr[i14] = cArr2[(b13 & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b13 & 15];
        }
        return new String(cArr);
    }

    private static Handler gtknphoqwx() {
        if (f36683ppxfxbqfkf == null) {
            synchronized (draadjrbmk.class) {
                try {
                    if (f36683ppxfxbqfkf == null) {
                        f36683ppxfxbqfkf = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36683ppxfxbqfkf;
    }

    public static Queue gxszxtbevo(int i13) {
        return new ArrayDeque(i13);
    }

    public static void iobyxmoadg() {
        if (!oxmwwwfdhm()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static String iwizpuwonk(byte[] bArr) {
        String strEablkybsjg;
        char[] cArr = f36684zoijcleaow;
        synchronized (cArr) {
            strEablkybsjg = eablkybsjg(bArr, cArr);
        }
        return strEablkybsjg;
    }

    public static void jyumaefscl(Runnable runnable) {
        gtknphoqwx().removeCallbacks(runnable);
    }

    public static boolean kcexrzcfyt(int i13) {
        return i13 > 0 || i13 == Integer.MIN_VALUE;
    }

    public static int lqeggnwhkg(int i13, int i14, Bitmap.Config config) {
        return i13 * i14 * dxjokdxxww(config);
    }

    public static int nufgyqmvbu(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int ojitshcjhn(Object obj, int i13) {
        return agtfadlqog(obj == null ? 0 : obj.hashCode(), i13);
    }

    public static boolean oxmwwwfdhm() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean ppxfxbqfkf(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int rgvfuqvkyq(boolean z13, int i13) {
        return agtfadlqog(z13 ? 1 : 0, i13);
    }

    public static boolean vdvldrhtss() {
        return !oxmwwwfdhm();
    }

    public static int wflxmlrfwp(float f13, int i13) {
        return agtfadlqog(Float.floatToIntBits(f13), i13);
    }

    public static boolean wkgbmnqykc(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void yggfygwlhe(Runnable runnable) {
        gtknphoqwx().post(runnable);
    }

    public static boolean zdlpuopuiu(int i13, int i14) {
        return kcexrzcfyt(i13) && kcexrzcfyt(i14);
    }

    public static boolean zoijcleaow(c9.iobyxmoadg iobyxmoadgVar, c9.iobyxmoadg iobyxmoadgVar2) {
        if (iobyxmoadgVar == null) {
            return iobyxmoadgVar2 == null;
        }
        return iobyxmoadgVar.lmojexxdyd(iobyxmoadgVar2);
    }
}
