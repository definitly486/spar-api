package oa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import da.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f72389agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final float f72390btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final float f72391draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final float f72392dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f72393eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final boolean f72394gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f72395gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ColorStateList f72396iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final boolean f72397lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final float f72398nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final int f72399ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ColorStateList f72400ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f72401rgvfuqvkyq = false;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private Typeface f72402vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private ColorStateList f72403wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f72404wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ColorStateList f72405zoijcleaow;

    class iobyxmoadg extends i1.nufgyqmvbu.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f72406iobyxmoadg;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f72406iobyxmoadg = gxszxtbevoVar;
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww */
        public void lqeggnwhkg(Typeface typeface) {
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            wkgbmnqykcVar.f72402vdvldrhtss = Typeface.create(typeface, wkgbmnqykcVar.f72393eablkybsjg);
            wkgbmnqykc.this.f72401rgvfuqvkyq = true;
            this.f72406iobyxmoadg.zoijcleaow(wkgbmnqykc.this.f72402vdvldrhtss, false);
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu */
        public void gxszxtbevo(int i13) {
            wkgbmnqykc.this.f72401rgvfuqvkyq = true;
            this.f72406iobyxmoadg.iobyxmoadg(i13);
        }
    }

    class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Context f72408iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f72409ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ TextPaint f72411zoijcleaow;

        zoijcleaow(Context context, TextPaint textPaint, gxszxtbevo gxszxtbevoVar) {
            this.f72408iobyxmoadg = context;
            this.f72411zoijcleaow = textPaint;
            this.f72409ppxfxbqfkf = gxszxtbevoVar;
        }

        @Override // oa.gxszxtbevo
        public void iobyxmoadg(int i13) {
            this.f72409ppxfxbqfkf.iobyxmoadg(i13);
        }

        @Override // oa.gxszxtbevo
        public void zoijcleaow(Typeface typeface, boolean z13) {
            wkgbmnqykc.this.rgvfuqvkyq(this.f72408iobyxmoadg, this.f72411zoijcleaow, typeface);
            this.f72409ppxfxbqfkf.zoijcleaow(typeface, z13);
        }
    }

    public wkgbmnqykc(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, draadjrbmk.TextAppearance);
        draadjrbmk(typedArrayObtainStyledAttributes.getDimension(draadjrbmk.TextAppearance_android_textSize, 0.0f));
        gtknphoqwx(ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.TextAppearance_android_textColor));
        this.f72396iobyxmoadg = ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.TextAppearance_android_textColorHint);
        this.f72405zoijcleaow = ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.TextAppearance_android_textColorLink);
        this.f72393eablkybsjg = typedArrayObtainStyledAttributes.getInt(draadjrbmk.TextAppearance_android_textStyle, 0);
        this.f72395gxszxtbevo = typedArrayObtainStyledAttributes.getInt(draadjrbmk.TextAppearance_android_typeface, 1);
        int iGxszxtbevo = ppxfxbqfkf.gxszxtbevo(typedArrayObtainStyledAttributes, draadjrbmk.TextAppearance_fontFamily, draadjrbmk.TextAppearance_android_fontFamily);
        this.f72399ojitshcjhn = typedArrayObtainStyledAttributes.getResourceId(iGxszxtbevo, 0);
        this.f72404wkgbmnqykc = typedArrayObtainStyledAttributes.getString(iGxszxtbevo);
        this.f72397lqeggnwhkg = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.TextAppearance_textAllCaps, false);
        this.f72400ppxfxbqfkf = ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.TextAppearance_android_shadowColor);
        this.f72398nufgyqmvbu = typedArrayObtainStyledAttributes.getFloat(draadjrbmk.TextAppearance_android_shadowDx, 0.0f);
        this.f72392dxjokdxxww = typedArrayObtainStyledAttributes.getFloat(draadjrbmk.TextAppearance_android_shadowDy, 0.0f);
        this.f72390btonecajqb = typedArrayObtainStyledAttributes.getFloat(draadjrbmk.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i13, draadjrbmk.MaterialTextAppearance);
        this.f72394gtknphoqwx = typedArrayObtainStyledAttributes2.hasValue(draadjrbmk.MaterialTextAppearance_android_letterSpacing);
        this.f72391draadjrbmk = typedArrayObtainStyledAttributes2.getFloat(draadjrbmk.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private boolean wflxmlrfwp(Context context) {
        if (eablkybsjg.iobyxmoadg()) {
            return true;
        }
        int i13 = this.f72399ojitshcjhn;
        return (i13 != 0 ? i1.nufgyqmvbu.ppxfxbqfkf(context, i13) : null) != null;
    }

    private void wkgbmnqykc() {
        String str;
        if (this.f72402vdvldrhtss == null && (str = this.f72404wkgbmnqykc) != null) {
            this.f72402vdvldrhtss = Typeface.create(str, this.f72393eablkybsjg);
        }
        if (this.f72402vdvldrhtss == null) {
            int i13 = this.f72395gxszxtbevo;
            if (i13 == 1) {
                this.f72402vdvldrhtss = Typeface.SANS_SERIF;
            } else if (i13 == 2) {
                this.f72402vdvldrhtss = Typeface.SERIF;
            } else if (i13 != 3) {
                this.f72402vdvldrhtss = Typeface.DEFAULT;
            } else {
                this.f72402vdvldrhtss = Typeface.MONOSPACE;
            }
            this.f72402vdvldrhtss = Typeface.create(this.f72402vdvldrhtss, this.f72393eablkybsjg);
        }
    }

    public void agtfadlqog(Context context, TextPaint textPaint, gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn(context, textPaint, gxszxtbevoVar);
        ColorStateList colorStateList = this.f72403wflxmlrfwp;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f13 = this.f72390btonecajqb;
        float f14 = this.f72398nufgyqmvbu;
        float f15 = this.f72392dxjokdxxww;
        ColorStateList colorStateList2 = this.f72400ppxfxbqfkf;
        textPaint.setShadowLayer(f13, f14, f15, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public float btonecajqb() {
        return this.f72389agtfadlqog;
    }

    public void draadjrbmk(float f13) {
        this.f72389agtfadlqog = f13;
    }

    public ColorStateList dxjokdxxww() {
        return this.f72403wflxmlrfwp;
    }

    public Typeface eablkybsjg() {
        wkgbmnqykc();
        return this.f72402vdvldrhtss;
    }

    public void gtknphoqwx(ColorStateList colorStateList) {
        this.f72403wflxmlrfwp = colorStateList;
    }

    public Typeface gxszxtbevo(Context context) {
        if (this.f72401rgvfuqvkyq) {
            return this.f72402vdvldrhtss;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceDxjokdxxww = i1.nufgyqmvbu.dxjokdxxww(context, this.f72399ojitshcjhn);
                this.f72402vdvldrhtss = typefaceDxjokdxxww;
                if (typefaceDxjokdxxww != null) {
                    this.f72402vdvldrhtss = Typeface.create(typefaceDxjokdxxww, this.f72393eablkybsjg);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e13) {
                Log.d("TextAppearance", "Error loading font " + this.f72404wkgbmnqykc, e13);
            }
        }
        wkgbmnqykc();
        this.f72401rgvfuqvkyq = true;
        return this.f72402vdvldrhtss;
    }

    public void lqeggnwhkg(Context context, TextPaint textPaint, gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq(context, textPaint, eablkybsjg());
        nufgyqmvbu(context, new zoijcleaow(context, textPaint, gxszxtbevoVar));
    }

    public void nufgyqmvbu(Context context, gxszxtbevo gxszxtbevoVar) {
        if (wflxmlrfwp(context)) {
            gxszxtbevo(context);
        } else {
            wkgbmnqykc();
        }
        int i13 = this.f72399ojitshcjhn;
        if (i13 == 0) {
            this.f72401rgvfuqvkyq = true;
        }
        if (this.f72401rgvfuqvkyq) {
            gxszxtbevoVar.zoijcleaow(this.f72402vdvldrhtss, true);
            return;
        }
        try {
            i1.nufgyqmvbu.gtknphoqwx(context, i13, new iobyxmoadg(gxszxtbevoVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f72401rgvfuqvkyq = true;
            gxszxtbevoVar.iobyxmoadg(1);
        } catch (Exception e13) {
            Log.d("TextAppearance", "Error loading font " + this.f72404wkgbmnqykc, e13);
            this.f72401rgvfuqvkyq = true;
            gxszxtbevoVar.iobyxmoadg(-3);
        }
    }

    public void ojitshcjhn(Context context, TextPaint textPaint, gxszxtbevo gxszxtbevoVar) {
        if (wflxmlrfwp(context)) {
            rgvfuqvkyq(context, textPaint, gxszxtbevo(context));
        } else {
            lqeggnwhkg(context, textPaint, gxszxtbevoVar);
        }
    }

    public void rgvfuqvkyq(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceIobyxmoadg = nufgyqmvbu.iobyxmoadg(context, typeface);
        if (typefaceIobyxmoadg != null) {
            typeface = typefaceIobyxmoadg;
        }
        textPaint.setTypeface(typeface);
        int i13 = this.f72393eablkybsjg & (~typeface.getStyle());
        textPaint.setFakeBoldText((i13 & 1) != 0);
        textPaint.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f72389agtfadlqog);
        if (this.f72394gtknphoqwx) {
            textPaint.setLetterSpacing(this.f72391draadjrbmk);
        }
    }
}
