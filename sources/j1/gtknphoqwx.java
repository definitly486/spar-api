package j1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class gtknphoqwx extends btonecajqb {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    protected final Method f50462btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    protected final Method f50463draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    protected final Method f50464dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    protected final Method f50465gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    protected final Class f50466lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected final Constructor f50467nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    protected final Method f50468wflxmlrfwp;

    public gtknphoqwx() {
        Class clsYggfygwlhe;
        Constructor constructorJyumaefscl;
        Method methodOxmwwwfdhm;
        Method methodKcexrzcfyt;
        Method methodIwizpuwonk;
        Method methodVdvldrhtss;
        Method methodZdlpuopuiu;
        try {
            clsYggfygwlhe = yggfygwlhe();
            constructorJyumaefscl = jyumaefscl(clsYggfygwlhe);
            methodOxmwwwfdhm = oxmwwwfdhm(clsYggfygwlhe);
            methodKcexrzcfyt = kcexrzcfyt(clsYggfygwlhe);
            methodIwizpuwonk = iwizpuwonk(clsYggfygwlhe);
            methodVdvldrhtss = vdvldrhtss(clsYggfygwlhe);
            methodZdlpuopuiu = zdlpuopuiu(clsYggfygwlhe);
        } catch (ClassNotFoundException | NoSuchMethodException e13) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e13.getClass().getName(), e13);
            clsYggfygwlhe = null;
            constructorJyumaefscl = null;
            methodOxmwwwfdhm = null;
            methodKcexrzcfyt = null;
            methodIwizpuwonk = null;
            methodVdvldrhtss = null;
            methodZdlpuopuiu = null;
        }
        this.f50466lqeggnwhkg = clsYggfygwlhe;
        this.f50467nufgyqmvbu = constructorJyumaefscl;
        this.f50464dxjokdxxww = methodOxmwwwfdhm;
        this.f50462btonecajqb = methodKcexrzcfyt;
        this.f50465gtknphoqwx = methodIwizpuwonk;
        this.f50463draadjrbmk = methodVdvldrhtss;
        this.f50468wflxmlrfwp = methodZdlpuopuiu;
    }

    private boolean agtfadlqog(Object obj, ByteBuffer byteBuffer, int i13, int i14, int i15) {
        try {
            return ((Boolean) this.f50462btonecajqb.invoke(obj, byteBuffer, Integer.valueOf(i13), null, Integer.valueOf(i14), Integer.valueOf(i15))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void draadjrbmk(Object obj) {
        try {
            this.f50463draadjrbmk.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private Object gtknphoqwx() {
        try {
            return this.f50467nufgyqmvbu.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean ojitshcjhn(Object obj) {
        try {
            return ((Boolean) this.f50465gtknphoqwx.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean rgvfuqvkyq() {
        if (this.f50464dxjokdxxww == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f50464dxjokdxxww != null;
    }

    private boolean wflxmlrfwp(Context context, Object obj, String str, int i13, int i14, int i15, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f50464dxjokdxxww.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Typeface dxjokdxxww(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f50466lqeggnwhkg, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f50468wflxmlrfwp.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // j1.btonecajqb, j1.agtfadlqog
    public Typeface iobyxmoadg(Context context, i1.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, Resources resources, int i13) {
        if (!rgvfuqvkyq()) {
            return super.iobyxmoadg(context, ppxfxbqfkfVar, resources, i13);
        }
        Object objGtknphoqwx = gtknphoqwx();
        if (objGtknphoqwx == null) {
            return null;
        }
        for (i1.eablkybsjg.wkgbmnqykc wkgbmnqykcVar : ppxfxbqfkfVar.iobyxmoadg()) {
            if (!wflxmlrfwp(context, objGtknphoqwx, wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.eablkybsjg(), wkgbmnqykcVar.gxszxtbevo() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(wkgbmnqykcVar.wkgbmnqykc()))) {
                draadjrbmk(objGtknphoqwx);
                return null;
            }
        }
        if (ojitshcjhn(objGtknphoqwx)) {
            return dxjokdxxww(objGtknphoqwx);
        }
        return null;
    }

    protected Method iwizpuwonk(Class cls) {
        return cls.getMethod("freeze", null);
    }

    protected Constructor jyumaefscl(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method kcexrzcfyt(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method oxmwwwfdhm(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // j1.agtfadlqog
    public /* bridge */ /* synthetic */ Typeface ppxfxbqfkf(Context context, CancellationSignal cancellationSignal, List list, int i13) {
        return super.ppxfxbqfkf(context, cancellationSignal, list, i13);
    }

    protected Method vdvldrhtss(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    @Override // j1.agtfadlqog
    public Typeface wkgbmnqykc(Context context, Resources resources, int i13, String str, int i14) {
        if (!rgvfuqvkyq()) {
            return super.wkgbmnqykc(context, resources, i13, str, i14);
        }
        Object objGtknphoqwx = gtknphoqwx();
        if (objGtknphoqwx == null) {
            return null;
        }
        if (!wflxmlrfwp(context, objGtknphoqwx, str, 0, -1, -1, null)) {
            draadjrbmk(objGtknphoqwx);
            return null;
        }
        if (ojitshcjhn(objGtknphoqwx)) {
            return dxjokdxxww(objGtknphoqwx);
        }
        return null;
    }

    protected Class yggfygwlhe() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Method zdlpuopuiu(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // j1.agtfadlqog
    public Typeface zoijcleaow(Context context, CancellationSignal cancellationSignal, r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13) {
        Typeface typefaceDxjokdxxww;
        if (zoijcleaowVarArr.length < 1) {
            return null;
        }
        if (!rgvfuqvkyq()) {
            r1.gtknphoqwx.zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(zoijcleaowVarArr, i13);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(zoijcleaowVarLqeggnwhkg.wkgbmnqykc(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(zoijcleaowVarLqeggnwhkg.eablkybsjg()).setItalic(zoijcleaowVarLqeggnwhkg.gxszxtbevo()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapGxszxtbevo = ojitshcjhn.gxszxtbevo(context, zoijcleaowVarArr, cancellationSignal);
        Object objGtknphoqwx = gtknphoqwx();
        if (objGtknphoqwx == null) {
            return null;
        }
        boolean z13 = false;
        for (r1.gtknphoqwx.zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapGxszxtbevo.get(zoijcleaowVar.wkgbmnqykc());
            if (byteBuffer != null) {
                if (!agtfadlqog(objGtknphoqwx, byteBuffer, zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.eablkybsjg(), zoijcleaowVar.gxszxtbevo() ? 1 : 0)) {
                    draadjrbmk(objGtknphoqwx);
                    return null;
                }
                z13 = true;
            }
        }
        if (!z13) {
            draadjrbmk(objGtknphoqwx);
            return null;
        }
        if (ojitshcjhn(objGtknphoqwx) && (typefaceDxjokdxxww = dxjokdxxww(objGtknphoqwx)) != null) {
            return Typeface.create(typefaceDxjokdxxww, i13);
        }
        return null;
    }
}
