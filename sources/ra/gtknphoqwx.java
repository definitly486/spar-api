package ra;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final ra.ppxfxbqfkf f82293wflxmlrfwp = new dxjokdxxww(0.5f);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    gxszxtbevo f82294btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    gxszxtbevo f82295draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    gxszxtbevo f82296dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ra.ppxfxbqfkf f82297eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    gxszxtbevo f82298gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    ra.ppxfxbqfkf f82299gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    wkgbmnqykc f82300iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    ra.ppxfxbqfkf f82301lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    ra.ppxfxbqfkf f82302nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    wkgbmnqykc f82303ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    wkgbmnqykc f82304wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    wkgbmnqykc f82305zoijcleaow;

    public interface ppxfxbqfkf {
        ra.ppxfxbqfkf iobyxmoadg(ra.ppxfxbqfkf ppxfxbqfkfVar);
    }

    public static zoijcleaow eablkybsjg(Context context, AttributeSet attributeSet, int i13, int i14) {
        return gxszxtbevo(context, attributeSet, i13, i14, 0);
    }

    public static zoijcleaow gxszxtbevo(Context context, AttributeSet attributeSet, int i13, int i14, int i15) {
        return lqeggnwhkg(context, attributeSet, i13, i14, new ra.iobyxmoadg(i15));
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public static zoijcleaow lqeggnwhkg(Context context, AttributeSet attributeSet, int i13, int i14, ra.ppxfxbqfkf ppxfxbqfkfVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.MaterialShape, i13, i14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return wkgbmnqykc(context, resourceId, resourceId2, ppxfxbqfkfVar);
    }

    private static zoijcleaow ppxfxbqfkf(Context context, int i13, int i14, int i15) {
        return wkgbmnqykc(context, i13, i14, new ra.iobyxmoadg(i15));
    }

    private static ra.ppxfxbqfkf wflxmlrfwp(TypedArray typedArray, int i13, ra.ppxfxbqfkf ppxfxbqfkfVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i13);
        if (typedValuePeekValue == null) {
            return ppxfxbqfkfVar;
        }
        int i14 = typedValuePeekValue.type;
        if (i14 == 5) {
            return new ra.iobyxmoadg(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i14 == 6 ? new dxjokdxxww(typedValuePeekValue.getFraction(1.0f, 1.0f)) : ppxfxbqfkfVar;
    }

    private static zoijcleaow wkgbmnqykc(Context context, int i13, int i14, ra.ppxfxbqfkf ppxfxbqfkfVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i13);
        if (i14 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i14);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(da.draadjrbmk.ShapeAppearance);
        try {
            int i15 = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.ShapeAppearance_cornerFamily, 0);
            int i16 = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.ShapeAppearance_cornerFamilyTopLeft, i15);
            int i17 = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.ShapeAppearance_cornerFamilyTopRight, i15);
            int i18 = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.ShapeAppearance_cornerFamilyBottomRight, i15);
            int i19 = typedArrayObtainStyledAttributes.getInt(da.draadjrbmk.ShapeAppearance_cornerFamilyBottomLeft, i15);
            ra.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeAppearance_cornerSize, ppxfxbqfkfVar);
            ra.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp2 = wflxmlrfwp(typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeAppearance_cornerSizeTopLeft, ppxfxbqfkfVarWflxmlrfwp);
            ra.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp3 = wflxmlrfwp(typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeAppearance_cornerSizeTopRight, ppxfxbqfkfVarWflxmlrfwp);
            ra.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp4 = wflxmlrfwp(typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeAppearance_cornerSizeBottomRight, ppxfxbqfkfVarWflxmlrfwp);
            return new zoijcleaow().pmvmpeiblj(i16, ppxfxbqfkfVarWflxmlrfwp2).yadqdtsiqt(i17, ppxfxbqfkfVarWflxmlrfwp3).iwizpuwonk(i18, ppxfxbqfkfVarWflxmlrfwp4).kcexrzcfyt(i19, wflxmlrfwp(typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeAppearance_cornerSizeBottomLeft, ppxfxbqfkfVarWflxmlrfwp));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static zoijcleaow zoijcleaow(Context context, int i13, int i14) {
        return ppxfxbqfkf(context, i13, i14, 0);
    }

    public gxszxtbevo agtfadlqog() {
        return this.f82295draadjrbmk;
    }

    public ra.ppxfxbqfkf btonecajqb() {
        return this.f82302nufgyqmvbu;
    }

    public gtknphoqwx cqumvgiudr(ra.ppxfxbqfkf ppxfxbqfkfVar) {
        return jyumaefscl().rgvfuqvkyq(ppxfxbqfkfVar).wflxmlrfwp();
    }

    public ra.ppxfxbqfkf draadjrbmk() {
        return this.f82301lqeggnwhkg;
    }

    public wkgbmnqykc dxjokdxxww() {
        return this.f82304wkgbmnqykc;
    }

    public gtknphoqwx esjtqupxsv(ppxfxbqfkf ppxfxbqfkfVar) {
        return jyumaefscl().cdpycssgdh(ppxfxbqfkfVar.iobyxmoadg(oxmwwwfdhm())).wwaezpbzkn(ppxfxbqfkfVar.iobyxmoadg(zdlpuopuiu())).jyumaefscl(ppxfxbqfkfVar.iobyxmoadg(btonecajqb())).lereixgezr(ppxfxbqfkfVar.iobyxmoadg(draadjrbmk())).wflxmlrfwp();
    }

    public wkgbmnqykc gtknphoqwx() {
        return this.f82303ppxfxbqfkf;
    }

    public gtknphoqwx iwizpuwonk(float f13) {
        return jyumaefscl().ojitshcjhn(f13).wflxmlrfwp();
    }

    public zoijcleaow jyumaefscl() {
        return new zoijcleaow(this);
    }

    public wkgbmnqykc kcexrzcfyt() {
        return this.f82305zoijcleaow;
    }

    public gxszxtbevo nufgyqmvbu() {
        return this.f82298gtknphoqwx;
    }

    public gxszxtbevo ojitshcjhn() {
        return this.f82294btonecajqb;
    }

    public ra.ppxfxbqfkf oxmwwwfdhm() {
        return this.f82297eablkybsjg;
    }

    public gxszxtbevo rgvfuqvkyq() {
        return this.f82296dxjokdxxww;
    }

    public wkgbmnqykc vdvldrhtss() {
        return this.f82300iobyxmoadg;
    }

    public boolean yggfygwlhe(RectF rectF) {
        boolean z13 = this.f82295draadjrbmk.getClass().equals(gxszxtbevo.class) && this.f82294btonecajqb.getClass().equals(gxszxtbevo.class) && this.f82296dxjokdxxww.getClass().equals(gxszxtbevo.class) && this.f82298gtknphoqwx.getClass().equals(gxszxtbevo.class);
        float fIobyxmoadg = this.f82297eablkybsjg.iobyxmoadg(rectF);
        return z13 && ((this.f82299gxszxtbevo.iobyxmoadg(rectF) > fIobyxmoadg ? 1 : (this.f82299gxszxtbevo.iobyxmoadg(rectF) == fIobyxmoadg ? 0 : -1)) == 0 && (this.f82302nufgyqmvbu.iobyxmoadg(rectF) > fIobyxmoadg ? 1 : (this.f82302nufgyqmvbu.iobyxmoadg(rectF) == fIobyxmoadg ? 0 : -1)) == 0 && (this.f82301lqeggnwhkg.iobyxmoadg(rectF) > fIobyxmoadg ? 1 : (this.f82301lqeggnwhkg.iobyxmoadg(rectF) == fIobyxmoadg ? 0 : -1)) == 0) && ((this.f82305zoijcleaow instanceof btonecajqb) && (this.f82300iobyxmoadg instanceof btonecajqb) && (this.f82303ppxfxbqfkf instanceof btonecajqb) && (this.f82304wkgbmnqykc instanceof btonecajqb));
    }

    public ra.ppxfxbqfkf zdlpuopuiu() {
        return this.f82299gxszxtbevo;
    }

    private gtknphoqwx(zoijcleaow zoijcleaowVar) {
        this.f82300iobyxmoadg = zoijcleaowVar.f82312iobyxmoadg;
        this.f82305zoijcleaow = zoijcleaowVar.f82317zoijcleaow;
        this.f82303ppxfxbqfkf = zoijcleaowVar.f82315ppxfxbqfkf;
        this.f82304wkgbmnqykc = zoijcleaowVar.f82316wkgbmnqykc;
        this.f82297eablkybsjg = zoijcleaowVar.f82309eablkybsjg;
        this.f82299gxszxtbevo = zoijcleaowVar.f82311gxszxtbevo;
        this.f82301lqeggnwhkg = zoijcleaowVar.f82313lqeggnwhkg;
        this.f82302nufgyqmvbu = zoijcleaowVar.f82314nufgyqmvbu;
        this.f82296dxjokdxxww = zoijcleaowVar.f82308dxjokdxxww;
        this.f82294btonecajqb = zoijcleaowVar.f82306btonecajqb;
        this.f82298gtknphoqwx = zoijcleaowVar.f82310gtknphoqwx;
        this.f82295draadjrbmk = zoijcleaowVar.f82307draadjrbmk;
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private gxszxtbevo f82306btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private gxszxtbevo f82307draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private gxszxtbevo f82308dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private ra.ppxfxbqfkf f82309eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private gxszxtbevo f82310gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private ra.ppxfxbqfkf f82311gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private wkgbmnqykc f82312iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private ra.ppxfxbqfkf f82313lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private ra.ppxfxbqfkf f82314nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private wkgbmnqykc f82315ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private wkgbmnqykc f82316wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private wkgbmnqykc f82317zoijcleaow;

        public zoijcleaow() {
            this.f82312iobyxmoadg = nufgyqmvbu.zoijcleaow();
            this.f82317zoijcleaow = nufgyqmvbu.zoijcleaow();
            this.f82315ppxfxbqfkf = nufgyqmvbu.zoijcleaow();
            this.f82316wkgbmnqykc = nufgyqmvbu.zoijcleaow();
            this.f82309eablkybsjg = new ra.iobyxmoadg(0.0f);
            this.f82311gxszxtbevo = new ra.iobyxmoadg(0.0f);
            this.f82313lqeggnwhkg = new ra.iobyxmoadg(0.0f);
            this.f82314nufgyqmvbu = new ra.iobyxmoadg(0.0f);
            this.f82308dxjokdxxww = nufgyqmvbu.ppxfxbqfkf();
            this.f82306btonecajqb = nufgyqmvbu.ppxfxbqfkf();
            this.f82310gtknphoqwx = nufgyqmvbu.ppxfxbqfkf();
            this.f82307draadjrbmk = nufgyqmvbu.ppxfxbqfkf();
        }

        private static float agtfadlqog(wkgbmnqykc wkgbmnqykcVar) {
            if (wkgbmnqykcVar instanceof btonecajqb) {
                return ((btonecajqb) wkgbmnqykcVar).f82272iobyxmoadg;
            }
            if (wkgbmnqykcVar instanceof eablkybsjg) {
                return ((eablkybsjg) wkgbmnqykcVar).f82292iobyxmoadg;
            }
            return -1.0f;
        }

        public zoijcleaow cdpycssgdh(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f82309eablkybsjg = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow cqumvgiudr(wkgbmnqykc wkgbmnqykcVar) {
            this.f82315ppxfxbqfkf = wkgbmnqykcVar;
            float fAgtfadlqog = agtfadlqog(wkgbmnqykcVar);
            if (fAgtfadlqog != -1.0f) {
                esjtqupxsv(fAgtfadlqog);
            }
            return this;
        }

        public zoijcleaow esjtqupxsv(float f13) {
            this.f82313lqeggnwhkg = new ra.iobyxmoadg(f13);
            return this;
        }

        public zoijcleaow iozdgvuglv(wkgbmnqykc wkgbmnqykcVar) {
            this.f82317zoijcleaow = wkgbmnqykcVar;
            float fAgtfadlqog = agtfadlqog(wkgbmnqykcVar);
            if (fAgtfadlqog != -1.0f) {
                lmojexxdyd(fAgtfadlqog);
            }
            return this;
        }

        public zoijcleaow istkbnxepw(float f13) {
            this.f82309eablkybsjg = new ra.iobyxmoadg(f13);
            return this;
        }

        public zoijcleaow iwizpuwonk(int i13, ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return cqumvgiudr(nufgyqmvbu.iobyxmoadg(i13)).lereixgezr(ppxfxbqfkfVar);
        }

        public zoijcleaow jyumaefscl(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f82314nufgyqmvbu = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow kcexrzcfyt(int i13, ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return zdlpuopuiu(nufgyqmvbu.iobyxmoadg(i13)).jyumaefscl(ppxfxbqfkfVar);
        }

        public zoijcleaow lereixgezr(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f82313lqeggnwhkg = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow lmojexxdyd(float f13) {
            this.f82311gxszxtbevo = new ra.iobyxmoadg(f13);
            return this;
        }

        public zoijcleaow ojitshcjhn(float f13) {
            return istkbnxepw(f13).lmojexxdyd(f13).esjtqupxsv(f13).yggfygwlhe(f13);
        }

        public zoijcleaow oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar) {
            return zynmafqrjb(wkgbmnqykcVar).iozdgvuglv(wkgbmnqykcVar).cqumvgiudr(wkgbmnqykcVar).zdlpuopuiu(wkgbmnqykcVar);
        }

        public zoijcleaow pmvmpeiblj(int i13, ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return zynmafqrjb(nufgyqmvbu.iobyxmoadg(i13)).cdpycssgdh(ppxfxbqfkfVar);
        }

        public zoijcleaow rgvfuqvkyq(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return cdpycssgdh(ppxfxbqfkfVar).wwaezpbzkn(ppxfxbqfkfVar).lereixgezr(ppxfxbqfkfVar).jyumaefscl(ppxfxbqfkfVar);
        }

        public zoijcleaow vdvldrhtss(int i13, float f13) {
            return oxmwwwfdhm(nufgyqmvbu.iobyxmoadg(i13)).ojitshcjhn(f13);
        }

        public gtknphoqwx wflxmlrfwp() {
            return new gtknphoqwx(this);
        }

        public zoijcleaow wwaezpbzkn(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f82311gxszxtbevo = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow yadqdtsiqt(int i13, ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return iozdgvuglv(nufgyqmvbu.iobyxmoadg(i13)).wwaezpbzkn(ppxfxbqfkfVar);
        }

        public zoijcleaow yggfygwlhe(float f13) {
            this.f82314nufgyqmvbu = new ra.iobyxmoadg(f13);
            return this;
        }

        public zoijcleaow zdlpuopuiu(wkgbmnqykc wkgbmnqykcVar) {
            this.f82316wkgbmnqykc = wkgbmnqykcVar;
            float fAgtfadlqog = agtfadlqog(wkgbmnqykcVar);
            if (fAgtfadlqog != -1.0f) {
                yggfygwlhe(fAgtfadlqog);
            }
            return this;
        }

        public zoijcleaow zynmafqrjb(wkgbmnqykc wkgbmnqykcVar) {
            this.f82312iobyxmoadg = wkgbmnqykcVar;
            float fAgtfadlqog = agtfadlqog(wkgbmnqykcVar);
            if (fAgtfadlqog != -1.0f) {
                istkbnxepw(fAgtfadlqog);
            }
            return this;
        }

        public zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this.f82312iobyxmoadg = nufgyqmvbu.zoijcleaow();
            this.f82317zoijcleaow = nufgyqmvbu.zoijcleaow();
            this.f82315ppxfxbqfkf = nufgyqmvbu.zoijcleaow();
            this.f82316wkgbmnqykc = nufgyqmvbu.zoijcleaow();
            this.f82309eablkybsjg = new ra.iobyxmoadg(0.0f);
            this.f82311gxszxtbevo = new ra.iobyxmoadg(0.0f);
            this.f82313lqeggnwhkg = new ra.iobyxmoadg(0.0f);
            this.f82314nufgyqmvbu = new ra.iobyxmoadg(0.0f);
            this.f82308dxjokdxxww = nufgyqmvbu.ppxfxbqfkf();
            this.f82306btonecajqb = nufgyqmvbu.ppxfxbqfkf();
            this.f82310gtknphoqwx = nufgyqmvbu.ppxfxbqfkf();
            this.f82307draadjrbmk = nufgyqmvbu.ppxfxbqfkf();
            this.f82312iobyxmoadg = gtknphoqwxVar.f82300iobyxmoadg;
            this.f82317zoijcleaow = gtknphoqwxVar.f82305zoijcleaow;
            this.f82315ppxfxbqfkf = gtknphoqwxVar.f82303ppxfxbqfkf;
            this.f82316wkgbmnqykc = gtknphoqwxVar.f82304wkgbmnqykc;
            this.f82309eablkybsjg = gtknphoqwxVar.f82297eablkybsjg;
            this.f82311gxszxtbevo = gtknphoqwxVar.f82299gxszxtbevo;
            this.f82313lqeggnwhkg = gtknphoqwxVar.f82301lqeggnwhkg;
            this.f82314nufgyqmvbu = gtknphoqwxVar.f82302nufgyqmvbu;
            this.f82308dxjokdxxww = gtknphoqwxVar.f82296dxjokdxxww;
            this.f82306btonecajqb = gtknphoqwxVar.f82294btonecajqb;
            this.f82310gtknphoqwx = gtknphoqwxVar.f82298gtknphoqwx;
            this.f82307draadjrbmk = gtknphoqwxVar.f82295draadjrbmk;
        }
    }

    public gtknphoqwx() {
        this.f82300iobyxmoadg = nufgyqmvbu.zoijcleaow();
        this.f82305zoijcleaow = nufgyqmvbu.zoijcleaow();
        this.f82303ppxfxbqfkf = nufgyqmvbu.zoijcleaow();
        this.f82304wkgbmnqykc = nufgyqmvbu.zoijcleaow();
        this.f82297eablkybsjg = new ra.iobyxmoadg(0.0f);
        this.f82299gxszxtbevo = new ra.iobyxmoadg(0.0f);
        this.f82301lqeggnwhkg = new ra.iobyxmoadg(0.0f);
        this.f82302nufgyqmvbu = new ra.iobyxmoadg(0.0f);
        this.f82296dxjokdxxww = nufgyqmvbu.ppxfxbqfkf();
        this.f82294btonecajqb = nufgyqmvbu.ppxfxbqfkf();
        this.f82298gtknphoqwx = nufgyqmvbu.ppxfxbqfkf();
        this.f82295draadjrbmk = nufgyqmvbu.ppxfxbqfkf();
    }
}
