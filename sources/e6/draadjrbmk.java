package e6;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final ojitshcjhn f30523iobyxmoadg = new ojitshcjhn(draadjrbmk.wkgbmnqykc().getWebkitToCompatConverter());
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final wflxmlrfwp f30524iobyxmoadg = draadjrbmk.iobyxmoadg();
    }

    public static ClassLoader eablkybsjg() {
        return Build.VERSION.SDK_INT >= 28 ? wkgbmnqykc.iobyxmoadg() : gxszxtbevo().getClass().getClassLoader();
    }

    private static Object gxszxtbevo() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    static wflxmlrfwp iobyxmoadg() {
        try {
            return new agtfadlqog((WebViewProviderFactoryBoundaryInterface) dl.iobyxmoadg.iobyxmoadg(WebViewProviderFactoryBoundaryInterface.class, zoijcleaow()));
        } catch (ClassNotFoundException unused) {
            return new nufgyqmvbu();
        } catch (IllegalAccessException e13) {
            e = e13;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new RuntimeException(e);
        }
    }

    public static ojitshcjhn ppxfxbqfkf() {
        return iobyxmoadg.f30523iobyxmoadg;
    }

    public static wflxmlrfwp wkgbmnqykc() {
        return zoijcleaow.f30524iobyxmoadg;
    }

    private static InvocationHandler zoijcleaow() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, eablkybsjg()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
