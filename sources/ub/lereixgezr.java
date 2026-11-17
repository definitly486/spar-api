package ub;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lereixgezr {
    public static void iobyxmoadg(boolean z13, String str) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object ppxfxbqfkf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void wkgbmnqykc(boolean z13, String str) {
        if (!z13) {
            throw new IllegalStateException(str);
        }
    }

    public static Object zoijcleaow(Object obj) {
        obj.getClass();
        return obj;
    }
}
