package g9;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {
    public static Object eablkybsjg(Object obj) {
        return gxszxtbevo(obj, "Argument must not be null");
    }

    public static Object gxszxtbevo(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void iobyxmoadg(boolean z13) {
        zoijcleaow(z13, "");
    }

    public static String ppxfxbqfkf(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static Collection wkgbmnqykc(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    public static void zoijcleaow(boolean z13, String str) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }
}
