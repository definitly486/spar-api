package u1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static String eablkybsjg(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static boolean iobyxmoadg(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static Object ppxfxbqfkf(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object wkgbmnqykc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zoijcleaow(Object... objArr) {
        return Objects.hash(objArr);
    }
}
