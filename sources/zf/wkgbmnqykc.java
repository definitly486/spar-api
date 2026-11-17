package zf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static Object iobyxmoadg(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void ppxfxbqfkf(boolean z13, String str, Object... objArr) {
        if (!z13) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static Object zoijcleaow(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
