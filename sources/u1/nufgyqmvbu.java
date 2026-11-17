package u1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {
    public static void dxjokdxxww(boolean z13, String str) {
        if (!z13) {
            throw new IllegalStateException(str);
        }
    }

    public static int eablkybsjg(int i13, int i14) {
        if ((i13 & i14) == i13) {
            return i13;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i13) + ", but only 0x" + Integer.toHexString(i14) + " are allowed");
    }

    public static Object gxszxtbevo(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void iobyxmoadg(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static Object lqeggnwhkg(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void nufgyqmvbu(boolean z13) {
        dxjokdxxww(z13, null);
    }

    public static int ppxfxbqfkf(int i13, int i14, int i15, String str) {
        if (i13 < i14) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        if (i13 <= i15) {
            return i13;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    public static int wkgbmnqykc(int i13) {
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException();
    }

    public static void zoijcleaow(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
