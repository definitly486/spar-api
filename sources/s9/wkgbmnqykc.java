package s9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {
    public static void iobyxmoadg(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static Object ppxfxbqfkf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object wkgbmnqykc(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static Object zoijcleaow(Object obj) {
        obj.getClass();
        return obj;
    }
}
