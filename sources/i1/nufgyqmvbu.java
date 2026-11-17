package i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f41668iobyxmoadg = new ThreadLocal();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final WeakHashMap f41670zoijcleaow = new WeakHashMap(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f41669ppxfxbqfkf = new Object();

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Resources f41671iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Resources.Theme f41672zoijcleaow;

        eablkybsjg(Resources resources, Resources.Theme theme) {
            this.f41671iobyxmoadg = resources;
            this.f41672zoijcleaow = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || eablkybsjg.class != obj.getClass()) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f41671iobyxmoadg.equals(eablkybsjgVar.f41671iobyxmoadg) && u1.zoijcleaow.iobyxmoadg(this.f41672zoijcleaow, eablkybsjgVar.f41672zoijcleaow);
        }

        public int hashCode() {
            return u1.zoijcleaow.zoijcleaow(this.f41671iobyxmoadg, this.f41672zoijcleaow);
        }
    }

    public static abstract class gxszxtbevo {
        public static Handler eablkybsjg(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public abstract void lqeggnwhkg(Typeface typeface);

        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public abstract void gxszxtbevo(int i13);

        public final void ppxfxbqfkf(final int i13, Handler handler) {
            eablkybsjg(handler).post(new Runnable() { // from class: i1.btonecajqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41631zdlpuopuiu.gxszxtbevo(i13);
                }
            });
        }

        public final void wkgbmnqykc(final Typeface typeface, Handler handler) {
            eablkybsjg(handler).post(new Runnable() { // from class: i1.dxjokdxxww
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41644zdlpuopuiu.lqeggnwhkg(typeface);
                }
            });
        }
    }

    static class iobyxmoadg {
        static Drawable iobyxmoadg(Resources resources, int i13, Resources.Theme theme) {
            return resources.getDrawable(i13, theme);
        }

        static Drawable zoijcleaow(Resources resources, int i13, int i14, Resources.Theme theme) {
            return resources.getDrawableForDensity(i13, i14, theme);
        }
    }

    public static final class lqeggnwhkg {

        static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private static final Object f41673iobyxmoadg = new Object();

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private static boolean f41674ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private static Method f41675zoijcleaow;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            static void iobyxmoadg(Resources.Theme theme) {
                Method method;
                synchronized (f41673iobyxmoadg) {
                    if (f41674ppxfxbqfkf) {
                        method = f41675zoijcleaow;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f41675zoijcleaow = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e13) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e13);
                        }
                        f41674ppxfxbqfkf = true;
                        method = f41675zoijcleaow;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e14) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e14);
                                f41675zoijcleaow = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        static class zoijcleaow {
            static void iobyxmoadg(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void iobyxmoadg(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                zoijcleaow.iobyxmoadg(theme);
            } else {
                iobyxmoadg.iobyxmoadg(theme);
            }
        }
    }

    static class ppxfxbqfkf {
        static float iobyxmoadg(Resources resources, int i13) {
            return resources.getFloat(i13);
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final ColorStateList f41676iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final int f41677ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Configuration f41678zoijcleaow;

        wkgbmnqykc(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f41676iobyxmoadg = colorStateList;
            this.f41678zoijcleaow = configuration;
            this.f41677ppxfxbqfkf = theme == null ? 0 : theme.hashCode();
        }
    }

    static class zoijcleaow {
        static int iobyxmoadg(Resources resources, int i13, Resources.Theme theme) {
            return resources.getColor(i13, theme);
        }

        static ColorStateList zoijcleaow(Resources resources, int i13, Resources.Theme theme) {
            return resources.getColorStateList(i13, theme);
        }
    }

    private static boolean agtfadlqog(Resources resources, int i13) {
        TypedValue typedValueDraadjrbmk = draadjrbmk();
        resources.getValue(i13, typedValueDraadjrbmk, true);
        int i14 = typedValueDraadjrbmk.type;
        return i14 >= 28 && i14 <= 31;
    }

    public static Typeface btonecajqb(Context context, int i13, TypedValue typedValue, int i14, gxszxtbevo gxszxtbevoVar) {
        if (context.isRestricted()) {
            return null;
        }
        return ojitshcjhn(context, i13, typedValue, i14, gxszxtbevoVar, null, true, false);
    }

    private static TypedValue draadjrbmk() {
        ThreadLocal threadLocal = f41668iobyxmoadg;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static Typeface dxjokdxxww(Context context, int i13) {
        if (context.isRestricted()) {
            return null;
        }
        return ojitshcjhn(context, i13, new TypedValue(), 0, null, null, false, false);
    }

    public static ColorStateList eablkybsjg(Resources resources, int i13, Resources.Theme theme) {
        eablkybsjg eablkybsjgVar = new eablkybsjg(resources, theme);
        ColorStateList colorStateListZoijcleaow = zoijcleaow(eablkybsjgVar, i13);
        if (colorStateListZoijcleaow != null) {
            return colorStateListZoijcleaow;
        }
        ColorStateList colorStateListWflxmlrfwp = wflxmlrfwp(resources, i13, theme);
        if (colorStateListWflxmlrfwp == null) {
            return zoijcleaow.zoijcleaow(resources, i13, theme);
        }
        iobyxmoadg(eablkybsjgVar, i13, colorStateListWflxmlrfwp, theme);
        return colorStateListWflxmlrfwp;
    }

    public static void gtknphoqwx(Context context, int i13, gxszxtbevo gxszxtbevoVar, Handler handler) {
        u1.nufgyqmvbu.gxszxtbevo(gxszxtbevoVar);
        if (context.isRestricted()) {
            gxszxtbevoVar.ppxfxbqfkf(-4, handler);
        } else {
            ojitshcjhn(context, i13, new TypedValue(), 0, gxszxtbevoVar, handler, false, false);
        }
    }

    public static Drawable gxszxtbevo(Resources resources, int i13, Resources.Theme theme) {
        return iobyxmoadg.iobyxmoadg(resources, i13, theme);
    }

    private static void iobyxmoadg(eablkybsjg eablkybsjgVar, int i13, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f41669ppxfxbqfkf) {
            try {
                WeakHashMap weakHashMap = f41670zoijcleaow;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(eablkybsjgVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(eablkybsjgVar, sparseArray);
                }
                sparseArray.append(i13, new wkgbmnqykc(colorStateList, eablkybsjgVar.f41671iobyxmoadg.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Drawable lqeggnwhkg(Resources resources, int i13, int i14, Resources.Theme theme) {
        return iobyxmoadg.zoijcleaow(resources, i13, i14, theme);
    }

    public static float nufgyqmvbu(Resources resources, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ppxfxbqfkf.iobyxmoadg(resources, i13);
        }
        TypedValue typedValueDraadjrbmk = draadjrbmk();
        resources.getValue(i13, typedValueDraadjrbmk, true);
        if (typedValueDraadjrbmk.type == 4) {
            return typedValueDraadjrbmk.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i13) + " type #0x" + Integer.toHexString(typedValueDraadjrbmk.type) + " is not valid");
    }

    private static Typeface ojitshcjhn(Context context, int i13, TypedValue typedValue, int i14, gxszxtbevo gxszxtbevoVar, Handler handler, boolean z13, boolean z14) {
        Resources resources = context.getResources();
        resources.getValue(i13, typedValue, true);
        Typeface typefaceRgvfuqvkyq = rgvfuqvkyq(context, resources, typedValue, i13, i14, gxszxtbevoVar, handler, z13, z14);
        if (typefaceRgvfuqvkyq != null || gxszxtbevoVar != null || z14) {
            return typefaceRgvfuqvkyq;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i13) + " could not be retrieved.");
    }

    public static Typeface ppxfxbqfkf(Context context, int i13) {
        if (context.isRestricted()) {
            return null;
        }
        return ojitshcjhn(context, i13, new TypedValue(), 0, null, null, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    private static Typeface rgvfuqvkyq(Context context, Resources resources, TypedValue typedValue, int i13, int i14, gxszxtbevo gxszxtbevoVar, Handler handler, boolean z13, boolean z14) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i13) + "\" (" + Integer.toHexString(i13) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        int i15 = 0;
        if (!string.startsWith("res/")) {
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.ppxfxbqfkf(-3, handler);
            }
            return null;
        }
        Typeface typefaceLqeggnwhkg = j1.dxjokdxxww.lqeggnwhkg(resources, i13, string, typedValue.assetCookie, i14);
        if (typefaceLqeggnwhkg != null) {
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.wkgbmnqykc(typefaceLqeggnwhkg, handler);
            }
            return typefaceLqeggnwhkg;
        }
        if (z14) {
            return null;
        }
        try {
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    Typeface typefaceEablkybsjg = j1.dxjokdxxww.eablkybsjg(context, resources, i13, string, typedValue.assetCookie, i14);
                    if (gxszxtbevoVar != null) {
                        if (typefaceEablkybsjg != null) {
                            gxszxtbevoVar.wkgbmnqykc(typefaceEablkybsjg, handler);
                        } else {
                            gxszxtbevoVar.ppxfxbqfkf(-3, handler);
                        }
                    }
                    return typefaceEablkybsjg;
                }
                i1.eablkybsjg.zoijcleaow zoijcleaowVarZoijcleaow = i1.eablkybsjg.zoijcleaow(resources.getXml(i13), resources);
                if (zoijcleaowVarZoijcleaow != null) {
                    return j1.dxjokdxxww.wkgbmnqykc(context, zoijcleaowVarZoijcleaow, resources, i13, string, typedValue.assetCookie, i14, gxszxtbevoVar, handler, z13);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.ppxfxbqfkf(-3, handler);
                }
                return null;
            } catch (IOException e13) {
                e = e13;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (gxszxtbevoVar != null) {
                    return null;
                }
                gxszxtbevoVar.ppxfxbqfkf(i15, handler);
                return null;
            } catch (XmlPullParserException e14) {
                e = e14;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (gxszxtbevoVar != null) {
                    return null;
                }
                gxszxtbevoVar.ppxfxbqfkf(i15, handler);
                return null;
            }
        } catch (IOException e15) {
            e = e15;
            i15 = -3;
        } catch (XmlPullParserException e16) {
            e = e16;
            i15 = -3;
        }
    }

    private static ColorStateList wflxmlrfwp(Resources resources, int i13, Resources.Theme theme) {
        if (agtfadlqog(resources, i13)) {
            return null;
        }
        try {
            return i1.ppxfxbqfkf.iobyxmoadg(resources, resources.getXml(i13), theme);
        } catch (Exception e13) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e13);
            return null;
        }
    }

    public static int wkgbmnqykc(Resources resources, int i13, Resources.Theme theme) {
        return zoijcleaow.iobyxmoadg(resources, i13, theme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f41677ppxfxbqfkf == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList zoijcleaow(i1.nufgyqmvbu.eablkybsjg r5, int r6) {
        /*
            java.lang.Object r0 = i1.nufgyqmvbu.f41669ppxfxbqfkf
            monitor-enter(r0)
            java.util.WeakHashMap r1 = i1.nufgyqmvbu.f41670zoijcleaow     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            i1.nufgyqmvbu$wkgbmnqykc r2 = (i1.nufgyqmvbu.wkgbmnqykc) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f41678zoijcleaow     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f41671iobyxmoadg     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f41672zoijcleaow     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f41677ppxfxbqfkf     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f41677ppxfxbqfkf     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f41676iobyxmoadg     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.nufgyqmvbu.zoijcleaow(i1.nufgyqmvbu$eablkybsjg, int):android.content.res.ColorStateList");
    }
}
