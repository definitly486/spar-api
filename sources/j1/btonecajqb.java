package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
abstract class btonecajqb extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static Method f50453eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static boolean f50454gxszxtbevo = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static Constructor f50455ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static Method f50456wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Class f50457zoijcleaow;

    btonecajqb() {
    }

    private static void btonecajqb() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f50454gxszxtbevo) {
            return;
        }
        f50454gxszxtbevo = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e13) {
            Log.e("TypefaceCompatApi21Impl", e13.getClass().getName(), e13);
            method = null;
            cls = null;
            method2 = null;
        }
        f50455ppxfxbqfkf = constructor;
        f50457zoijcleaow = cls;
        f50456wkgbmnqykc = method2;
        f50453eablkybsjg = method;
    }

    private static Typeface dxjokdxxww(Object obj) throws NoSuchMethodException {
        btonecajqb();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f50457zoijcleaow, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f50453eablkybsjg.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static Object gtknphoqwx() throws NoSuchMethodException {
        btonecajqb();
        try {
            return f50455ppxfxbqfkf.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static boolean nufgyqmvbu(Object obj, String str, int i13, boolean z13) throws NoSuchMethodException {
        btonecajqb();
        try {
            return ((Boolean) f50456wkgbmnqykc.invoke(obj, str, Integer.valueOf(i13), Boolean.valueOf(z13))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // j1.agtfadlqog
    public Typeface iobyxmoadg(Context context, i1.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, Resources resources, int i13) throws NoSuchMethodException {
        Object objGtknphoqwx = gtknphoqwx();
        for (i1.eablkybsjg.wkgbmnqykc wkgbmnqykcVar : ppxfxbqfkfVar.iobyxmoadg()) {
            File fileWkgbmnqykc = ojitshcjhn.wkgbmnqykc(context);
            if (fileWkgbmnqykc == null) {
                return null;
            }
            try {
                if (!ojitshcjhn.zoijcleaow(fileWkgbmnqykc, resources, wkgbmnqykcVar.zoijcleaow())) {
                    return null;
                }
                if (!nufgyqmvbu(objGtknphoqwx, fileWkgbmnqykc.getPath(), wkgbmnqykcVar.eablkybsjg(), wkgbmnqykcVar.gxszxtbevo())) {
                    return null;
                }
                fileWkgbmnqykc.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileWkgbmnqykc.delete();
            }
        }
        return dxjokdxxww(objGtknphoqwx);
    }
}
