package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.jztzpxfvev;
import androidx.collection.xrmfcynszj;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static jpowsppfya f3344dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private TypedValue f3346eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f3347gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private WeakHashMap f3348iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private ppxfxbqfkf f3349lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private xrmfcynszj f3350ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final WeakHashMap f3351wkgbmnqykc = new WeakHashMap(0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private jztzpxfvev f3352zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final PorterDuff.Mode f3345nufgyqmvbu = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final iobyxmoadg f3343btonecajqb = new iobyxmoadg(6);

    private static class iobyxmoadg extends androidx.collection.pmvmpeiblj {
        public iobyxmoadg(int i13) {
            super(i13);
        }

        private static int zoijcleaow(int i13, PorterDuff.Mode mode) {
            return ((i13 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter ppxfxbqfkf(int i13, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(zoijcleaow(i13, mode)));
        }

        PorterDuffColorFilter wkgbmnqykc(int i13, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(zoijcleaow(i13, mode)), porterDuffColorFilter);
        }
    }

    public interface ppxfxbqfkf {
        boolean eablkybsjg(Context context, int i13, Drawable drawable);

        Drawable iobyxmoadg(jpowsppfya jpowsppfyaVar, Context context, int i13);

        boolean ppxfxbqfkf(Context context, int i13, Drawable drawable);

        PorterDuff.Mode wkgbmnqykc(int i13);

        ColorStateList zoijcleaow(Context context, int i13);
    }

    private interface zoijcleaow {
        Drawable iobyxmoadg(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    private Drawable eablkybsjg(Context context, int i13) {
        if (this.f3346eablkybsjg == null) {
            this.f3346eablkybsjg = new TypedValue();
        }
        TypedValue typedValue = this.f3346eablkybsjg;
        context.getResources().getValue(i13, typedValue, true);
        long jWkgbmnqykc = wkgbmnqykc(typedValue);
        Drawable drawableNufgyqmvbu = nufgyqmvbu(context, jWkgbmnqykc);
        if (drawableNufgyqmvbu != null) {
            return drawableNufgyqmvbu;
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f3349lqeggnwhkg;
        Drawable drawableIobyxmoadg = ppxfxbqfkfVar == null ? null : ppxfxbqfkfVar.iobyxmoadg(this, context, i13);
        if (drawableIobyxmoadg != null) {
            drawableIobyxmoadg.setChangingConfigurations(typedValue.changingConfigurations);
            iobyxmoadg(context, jWkgbmnqykc, drawableIobyxmoadg);
        }
        return drawableIobyxmoadg;
    }

    public static synchronized PorterDuffColorFilter gtknphoqwx(int i13, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = f3343btonecajqb;
        porterDuffColorFilterPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(i13, mode);
        if (porterDuffColorFilterPpxfxbqfkf == null) {
            porterDuffColorFilterPpxfxbqfkf = new PorterDuffColorFilter(i13, mode);
            iobyxmoadgVar.wkgbmnqykc(i13, mode, porterDuffColorFilterPpxfxbqfkf);
        }
        return porterDuffColorFilterPpxfxbqfkf;
    }

    private static PorterDuffColorFilter gxszxtbevo(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return gtknphoqwx(colorStateList.getColorForState(iArr, 0), mode);
    }

    private synchronized boolean iobyxmoadg(Context context, long j13, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.esjtqupxsv esjtqupxsvVar = (androidx.collection.esjtqupxsv) this.f3351wkgbmnqykc.get(context);
            if (esjtqupxsvVar == null) {
                esjtqupxsvVar = new androidx.collection.esjtqupxsv();
                this.f3351wkgbmnqykc.put(context, esjtqupxsvVar);
            }
            esjtqupxsvVar.nufgyqmvbu(j13, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static void jyumaefscl(Drawable drawable, kegysxyocb kegysxyocbVar, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z13 = kegysxyocbVar.f3357wkgbmnqykc;
        if (z13 || kegysxyocbVar.f3356ppxfxbqfkf) {
            drawable.setColorFilter(gxszxtbevo(z13 ? kegysxyocbVar.f3355iobyxmoadg : null, kegysxyocbVar.f3356ppxfxbqfkf ? kegysxyocbVar.f3358zoijcleaow : f3345nufgyqmvbu, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public static synchronized jpowsppfya lqeggnwhkg() {
        try {
            if (f3344dxjokdxxww == null) {
                jpowsppfya jpowsppfyaVar = new jpowsppfya();
                f3344dxjokdxxww = jpowsppfyaVar;
                ojitshcjhn(jpowsppfyaVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3344dxjokdxxww;
    }

    private synchronized Drawable nufgyqmvbu(Context context, long j13) {
        androidx.collection.esjtqupxsv esjtqupxsvVar = (androidx.collection.esjtqupxsv) this.f3351wkgbmnqykc.get(context);
        if (esjtqupxsvVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) esjtqupxsvVar.wkgbmnqykc(j13);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            esjtqupxsvVar.gtknphoqwx(j13);
        }
        return null;
    }

    private static void ojitshcjhn(jpowsppfya jpowsppfyaVar) {
    }

    private void ppxfxbqfkf(Context context) {
        if (this.f3347gxszxtbevo) {
            return;
        }
        this.f3347gxszxtbevo = true;
        Drawable drawableDxjokdxxww = dxjokdxxww(context, btonecajqb.iobyxmoadg.abc_vector_test);
        if (drawableDxjokdxxww == null || !rgvfuqvkyq(drawableDxjokdxxww)) {
            this.f3347gxszxtbevo = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean rgvfuqvkyq(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.gxszxtbevo) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable vdvldrhtss(Context context, int i13) {
        int next;
        jztzpxfvev jztzpxfvevVar = this.f3352zoijcleaow;
        if (jztzpxfvevVar == null || jztzpxfvevVar.isEmpty()) {
            return null;
        }
        xrmfcynszj xrmfcynszjVar = this.f3350ppxfxbqfkf;
        if (xrmfcynszjVar != null) {
            String str = (String) xrmfcynszjVar.eablkybsjg(i13);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f3352zoijcleaow.get(str) == null)) {
                return null;
            }
        } else {
            this.f3350ppxfxbqfkf = new xrmfcynszj();
        }
        if (this.f3346eablkybsjg == null) {
            this.f3346eablkybsjg = new TypedValue();
        }
        TypedValue typedValue = this.f3346eablkybsjg;
        Resources resources = context.getResources();
        resources.getValue(i13, typedValue, true);
        long jWkgbmnqykc = wkgbmnqykc(typedValue);
        Drawable drawableNufgyqmvbu = nufgyqmvbu(context, jWkgbmnqykc);
        if (drawableNufgyqmvbu != null) {
            return drawableNufgyqmvbu;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i13);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f3350ppxfxbqfkf.iobyxmoadg(i13, name);
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f3352zoijcleaow.get(name);
                if (zoijcleaowVar != null) {
                    drawableNufgyqmvbu = zoijcleaowVar.iobyxmoadg(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableNufgyqmvbu != null) {
                    drawableNufgyqmvbu.setChangingConfigurations(typedValue.changingConfigurations);
                    iobyxmoadg(context, jWkgbmnqykc, drawableNufgyqmvbu);
                }
            } catch (Exception e13) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e13);
            }
        }
        if (drawableNufgyqmvbu == null) {
            this.f3350ppxfxbqfkf.iobyxmoadg(i13, "appcompat_skip_skip");
        }
        return drawableNufgyqmvbu;
    }

    private ColorStateList wflxmlrfwp(Context context, int i13) {
        xrmfcynszj xrmfcynszjVar;
        WeakHashMap weakHashMap = this.f3348iobyxmoadg;
        if (weakHashMap == null || (xrmfcynszjVar = (xrmfcynszj) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) xrmfcynszjVar.eablkybsjg(i13);
    }

    private static long wkgbmnqykc(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable yggfygwlhe(Context context, int i13, boolean z13, Drawable drawable) {
        ColorStateList colorStateListDraadjrbmk = draadjrbmk(context, i13);
        if (colorStateListDraadjrbmk != null) {
            Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawable.mutate());
            k1.iobyxmoadg.ojitshcjhn(drawableOxmwwwfdhm, colorStateListDraadjrbmk);
            PorterDuff.Mode modeAgtfadlqog = agtfadlqog(i13);
            if (modeAgtfadlqog == null) {
                return drawableOxmwwwfdhm;
            }
            k1.iobyxmoadg.rgvfuqvkyq(drawableOxmwwwfdhm, modeAgtfadlqog);
            return drawableOxmwwwfdhm;
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f3349lqeggnwhkg;
        if ((ppxfxbqfkfVar == null || !ppxfxbqfkfVar.eablkybsjg(context, i13, drawable)) && !iwizpuwonk(context, i13, drawable) && z13) {
            return null;
        }
        return drawable;
    }

    private void zoijcleaow(Context context, int i13, ColorStateList colorStateList) {
        if (this.f3348iobyxmoadg == null) {
            this.f3348iobyxmoadg = new WeakHashMap();
        }
        xrmfcynszj xrmfcynszjVar = (xrmfcynszj) this.f3348iobyxmoadg.get(context);
        if (xrmfcynszjVar == null) {
            xrmfcynszjVar = new xrmfcynszj();
            this.f3348iobyxmoadg.put(context, xrmfcynszjVar);
        }
        xrmfcynszjVar.iobyxmoadg(i13, colorStateList);
    }

    PorterDuff.Mode agtfadlqog(int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f3349lqeggnwhkg;
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        return ppxfxbqfkfVar.wkgbmnqykc(i13);
    }

    synchronized Drawable btonecajqb(Context context, int i13, boolean z13) {
        Drawable drawableVdvldrhtss;
        try {
            ppxfxbqfkf(context);
            drawableVdvldrhtss = vdvldrhtss(context, i13);
            if (drawableVdvldrhtss == null) {
                drawableVdvldrhtss = eablkybsjg(context, i13);
            }
            if (drawableVdvldrhtss == null) {
                drawableVdvldrhtss = androidx.core.content.iobyxmoadg.getDrawable(context, i13);
            }
            if (drawableVdvldrhtss != null) {
                drawableVdvldrhtss = yggfygwlhe(context, i13, z13, drawableVdvldrhtss);
            }
            if (drawableVdvldrhtss != null) {
                yadqdtsiqt.zoijcleaow(drawableVdvldrhtss);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableVdvldrhtss;
    }

    synchronized ColorStateList draadjrbmk(Context context, int i13) {
        ColorStateList colorStateListWflxmlrfwp;
        colorStateListWflxmlrfwp = wflxmlrfwp(context, i13);
        if (colorStateListWflxmlrfwp == null) {
            ppxfxbqfkf ppxfxbqfkfVar = this.f3349lqeggnwhkg;
            colorStateListWflxmlrfwp = ppxfxbqfkfVar == null ? null : ppxfxbqfkfVar.zoijcleaow(context, i13);
            if (colorStateListWflxmlrfwp != null) {
                zoijcleaow(context, i13, colorStateListWflxmlrfwp);
            }
        }
        return colorStateListWflxmlrfwp;
    }

    public synchronized Drawable dxjokdxxww(Context context, int i13) {
        return btonecajqb(context, i13, false);
    }

    boolean iwizpuwonk(Context context, int i13, Drawable drawable) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f3349lqeggnwhkg;
        return ppxfxbqfkfVar != null && ppxfxbqfkfVar.ppxfxbqfkf(context, i13, drawable);
    }

    synchronized Drawable kcexrzcfyt(Context context, ribwqtqdhb ribwqtqdhbVar, int i13) {
        try {
            Drawable drawableVdvldrhtss = vdvldrhtss(context, i13);
            if (drawableVdvldrhtss == null) {
                drawableVdvldrhtss = ribwqtqdhbVar.iobyxmoadg(i13);
            }
            if (drawableVdvldrhtss == null) {
                return null;
            }
            return yggfygwlhe(context, i13, false, drawableVdvldrhtss);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void oxmwwwfdhm(Context context) {
        androidx.collection.esjtqupxsv esjtqupxsvVar = (androidx.collection.esjtqupxsv) this.f3351wkgbmnqykc.get(context);
        if (esjtqupxsvVar != null) {
            esjtqupxsvVar.iobyxmoadg();
        }
    }

    public synchronized void zdlpuopuiu(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f3349lqeggnwhkg = ppxfxbqfkfVar;
    }
}
