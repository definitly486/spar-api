package dl;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static Object iobyxmoadg(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(iobyxmoadg.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    private static boolean ppxfxbqfkf() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static boolean zoijcleaow(Collection collection, String str) {
        if (!collection.contains(str)) {
            if (ppxfxbqfkf()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
