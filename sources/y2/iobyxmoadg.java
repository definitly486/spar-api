package y2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    public static Object btonecajqb(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }

    public static Object dxjokdxxww(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static Object eablkybsjg(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object gxszxtbevo(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void iobyxmoadg(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static void lqeggnwhkg(boolean z13) {
        if (!z13) {
            throw new IllegalStateException();
        }
    }

    public static void nufgyqmvbu(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int ppxfxbqfkf(int i13, int i14, int i15) {
        if (i13 < i14 || i13 >= i15) {
            throw new IndexOutOfBoundsException();
        }
        return i13;
    }

    public static String wkgbmnqykc(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void zoijcleaow(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
