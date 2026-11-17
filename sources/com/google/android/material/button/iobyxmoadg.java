package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.ojitshcjhn;
import da.draadjrbmk;
import da.zoijcleaow;
import oa.ppxfxbqfkf;
import ra.agtfadlqog;
import ra.gtknphoqwx;
import ra.lqeggnwhkg;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ColorStateList f22288btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private ColorStateList f22289draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private PorterDuff.Mode f22290dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f22291eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private ColorStateList f22292gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f22293gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialButton f22294iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private LayerDrawable f22295kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f22296lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f22297nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f22300ppxfxbqfkf;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f22302vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Drawable f22303wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f22304wkgbmnqykc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f22305zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private gtknphoqwx f22306zoijcleaow;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final boolean f22286yggfygwlhe = true;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final boolean f22285jyumaefscl = false;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f22287agtfadlqog = false;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f22298ojitshcjhn = false;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f22301rgvfuqvkyq = false;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f22299oxmwwwfdhm = true;

    iobyxmoadg(MaterialButton materialButton, gtknphoqwx gtknphoqwxVar) {
        this.f22294iobyxmoadg = materialButton;
        this.f22306zoijcleaow = gtknphoqwxVar;
    }

    private lqeggnwhkg agtfadlqog() {
        return lqeggnwhkg(true);
    }

    private InsetDrawable hcddaimhww(Drawable drawable) {
        return new InsetDrawable(drawable, this.f22300ppxfxbqfkf, this.f22291eablkybsjg, this.f22304wkgbmnqykc, this.f22293gxszxtbevo);
    }

    private Drawable iobyxmoadg() {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this.f22306zoijcleaow);
        lqeggnwhkgVar.hkdspvbjdz(this.f22294iobyxmoadg.getContext());
        k1.iobyxmoadg.ojitshcjhn(lqeggnwhkgVar, this.f22288btonecajqb);
        PorterDuff.Mode mode = this.f22290dxjokdxxww;
        if (mode != null) {
            k1.iobyxmoadg.rgvfuqvkyq(lqeggnwhkgVar, mode);
        }
        lqeggnwhkgVar.xrmfcynszj(this.f22297nufgyqmvbu, this.f22292gtknphoqwx);
        lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg(this.f22306zoijcleaow);
        lqeggnwhkgVar2.setTint(0);
        lqeggnwhkgVar2.jztzpxfvev(this.f22297nufgyqmvbu, this.f22287agtfadlqog ? ia.iobyxmoadg.wkgbmnqykc(this.f22294iobyxmoadg, zoijcleaow.colorSurface) : 0);
        if (f22286yggfygwlhe) {
            lqeggnwhkg lqeggnwhkgVar3 = new lqeggnwhkg(this.f22306zoijcleaow);
            this.f22303wflxmlrfwp = lqeggnwhkgVar3;
            k1.iobyxmoadg.agtfadlqog(lqeggnwhkgVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(pa.zoijcleaow.wkgbmnqykc(this.f22289draadjrbmk), hcddaimhww(new LayerDrawable(new Drawable[]{lqeggnwhkgVar2, lqeggnwhkgVar})), this.f22303wflxmlrfwp);
            this.f22295kcexrzcfyt = rippleDrawable;
            return rippleDrawable;
        }
        pa.iobyxmoadg iobyxmoadgVar = new pa.iobyxmoadg(this.f22306zoijcleaow);
        this.f22303wflxmlrfwp = iobyxmoadgVar;
        k1.iobyxmoadg.ojitshcjhn(iobyxmoadgVar, pa.zoijcleaow.wkgbmnqykc(this.f22289draadjrbmk));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{lqeggnwhkgVar2, lqeggnwhkgVar, this.f22303wflxmlrfwp});
        this.f22295kcexrzcfyt = layerDrawable;
        return hcddaimhww(layerDrawable);
    }

    private void lmojexxdyd(int i13, int i14) {
        int iYadqdtsiqt = jhduphickx.yadqdtsiqt(this.f22294iobyxmoadg);
        int paddingTop = this.f22294iobyxmoadg.getPaddingTop();
        int iCdpycssgdh = jhduphickx.cdpycssgdh(this.f22294iobyxmoadg);
        int paddingBottom = this.f22294iobyxmoadg.getPaddingBottom();
        int i15 = this.f22291eablkybsjg;
        int i16 = this.f22293gxszxtbevo;
        this.f22293gxszxtbevo = i14;
        this.f22291eablkybsjg = i13;
        if (!this.f22298ojitshcjhn) {
            wwaezpbzkn();
        }
        jhduphickx.lxfrhoxuzk(this.f22294iobyxmoadg, iYadqdtsiqt, (paddingTop + i13) - i15, iCdpycssgdh, (paddingBottom + i14) - i16);
    }

    private lqeggnwhkg lqeggnwhkg(boolean z13) {
        LayerDrawable layerDrawable = this.f22295kcexrzcfyt;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f22286yggfygwlhe ? (lqeggnwhkg) ((LayerDrawable) ((InsetDrawable) this.f22295kcexrzcfyt.getDrawable(0)).getDrawable()).getDrawable(!z13 ? 1 : 0) : (lqeggnwhkg) this.f22295kcexrzcfyt.getDrawable(!z13 ? 1 : 0);
    }

    private void pkzmftpjix() {
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo();
        lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog();
        if (lqeggnwhkgVarGxszxtbevo != null) {
            lqeggnwhkgVarGxszxtbevo.xrmfcynszj(this.f22297nufgyqmvbu, this.f22292gtknphoqwx);
            if (lqeggnwhkgVarAgtfadlqog != null) {
                lqeggnwhkgVarAgtfadlqog.jztzpxfvev(this.f22297nufgyqmvbu, this.f22287agtfadlqog ? ia.iobyxmoadg.wkgbmnqykc(this.f22294iobyxmoadg, zoijcleaow.colorSurface) : 0);
            }
        }
    }

    private void wwaezpbzkn() {
        this.f22294iobyxmoadg.setInternalBackground(iobyxmoadg());
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo();
        if (lqeggnwhkgVarGxszxtbevo != null) {
            lqeggnwhkgVarGxszxtbevo.sopmlzcsov(this.f22305zdlpuopuiu);
            lqeggnwhkgVarGxszxtbevo.setState(this.f22294iobyxmoadg.getDrawableState());
        }
    }

    private void ylkuphrtab(gtknphoqwx gtknphoqwxVar) {
        if (f22285jyumaefscl && !this.f22298ojitshcjhn) {
            int iYadqdtsiqt = jhduphickx.yadqdtsiqt(this.f22294iobyxmoadg);
            int paddingTop = this.f22294iobyxmoadg.getPaddingTop();
            int iCdpycssgdh = jhduphickx.cdpycssgdh(this.f22294iobyxmoadg);
            int paddingBottom = this.f22294iobyxmoadg.getPaddingBottom();
            wwaezpbzkn();
            jhduphickx.lxfrhoxuzk(this.f22294iobyxmoadg, iYadqdtsiqt, paddingTop, iCdpycssgdh, paddingBottom);
            return;
        }
        if (gxszxtbevo() != null) {
            gxszxtbevo().setShapeAppearanceModel(gtknphoqwxVar);
        }
        if (agtfadlqog() != null) {
            agtfadlqog().setShapeAppearanceModel(gtknphoqwxVar);
        }
        if (eablkybsjg() != null) {
            eablkybsjg().setShapeAppearanceModel(gtknphoqwxVar);
        }
    }

    ColorStateList btonecajqb() {
        return this.f22292gtknphoqwx;
    }

    void cdpycssgdh(ColorStateList colorStateList) {
        if (this.f22288btonecajqb != colorStateList) {
            this.f22288btonecajqb = colorStateList;
            if (gxszxtbevo() != null) {
                k1.iobyxmoadg.ojitshcjhn(gxszxtbevo(), this.f22288btonecajqb);
            }
        }
    }

    public void cqumvgiudr(int i13) {
        lmojexxdyd(i13, this.f22293gxszxtbevo);
    }

    ColorStateList draadjrbmk() {
        return this.f22288btonecajqb;
    }

    gtknphoqwx dxjokdxxww() {
        return this.f22306zoijcleaow;
    }

    public agtfadlqog eablkybsjg() {
        LayerDrawable layerDrawable = this.f22295kcexrzcfyt;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f22295kcexrzcfyt.getNumberOfLayers() > 2 ? (agtfadlqog) this.f22295kcexrzcfyt.getDrawable(2) : (agtfadlqog) this.f22295kcexrzcfyt.getDrawable(1);
    }

    void esjtqupxsv(ColorStateList colorStateList) {
        if (this.f22289draadjrbmk != colorStateList) {
            this.f22289draadjrbmk = colorStateList;
            boolean z13 = f22286yggfygwlhe;
            if (z13 && (this.f22294iobyxmoadg.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f22294iobyxmoadg.getBackground()).setColor(pa.zoijcleaow.wkgbmnqykc(colorStateList));
            } else {
                if (z13 || !(this.f22294iobyxmoadg.getBackground() instanceof pa.iobyxmoadg)) {
                    return;
                }
                ((pa.iobyxmoadg) this.f22294iobyxmoadg.getBackground()).setTintList(pa.zoijcleaow.wkgbmnqykc(colorStateList));
            }
        }
    }

    int gtknphoqwx() {
        return this.f22297nufgyqmvbu;
    }

    lqeggnwhkg gxszxtbevo() {
        return lqeggnwhkg(false);
    }

    void iozdgvuglv(boolean z13) {
        this.f22299oxmwwwfdhm = z13;
    }

    void istkbnxepw(int i13) {
        if (this.f22297nufgyqmvbu != i13) {
            this.f22297nufgyqmvbu = i13;
            pkzmftpjix();
        }
    }

    public void iwizpuwonk(int i13) {
        lmojexxdyd(this.f22291eablkybsjg, i13);
    }

    void jyumaefscl(int i13) {
        if (this.f22301rgvfuqvkyq && this.f22296lqeggnwhkg == i13) {
            return;
        }
        this.f22296lqeggnwhkg = i13;
        this.f22301rgvfuqvkyq = true;
        lereixgezr(this.f22306zoijcleaow.iwizpuwonk(i13));
    }

    void kcexrzcfyt(int i13) {
        if (gxszxtbevo() != null) {
            gxszxtbevo().setTint(i13);
        }
    }

    void lereixgezr(gtknphoqwx gtknphoqwxVar) {
        this.f22306zoijcleaow = gtknphoqwxVar;
        ylkuphrtab(gtknphoqwxVar);
    }

    ColorStateList nufgyqmvbu() {
        return this.f22289draadjrbmk;
    }

    boolean ojitshcjhn() {
        return this.f22298ojitshcjhn;
    }

    void oxmwwwfdhm(TypedArray typedArray) {
        this.f22300ppxfxbqfkf = typedArray.getDimensionPixelOffset(draadjrbmk.MaterialButton_android_insetLeft, 0);
        this.f22304wkgbmnqykc = typedArray.getDimensionPixelOffset(draadjrbmk.MaterialButton_android_insetRight, 0);
        this.f22291eablkybsjg = typedArray.getDimensionPixelOffset(draadjrbmk.MaterialButton_android_insetTop, 0);
        this.f22293gxszxtbevo = typedArray.getDimensionPixelOffset(draadjrbmk.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(draadjrbmk.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(draadjrbmk.MaterialButton_cornerRadius, -1);
            this.f22296lqeggnwhkg = dimensionPixelSize;
            lereixgezr(this.f22306zoijcleaow.iwizpuwonk(dimensionPixelSize));
            this.f22301rgvfuqvkyq = true;
        }
        this.f22297nufgyqmvbu = typedArray.getDimensionPixelSize(draadjrbmk.MaterialButton_strokeWidth, 0);
        this.f22290dxjokdxxww = ojitshcjhn.btonecajqb(typedArray.getInt(draadjrbmk.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f22288btonecajqb = ppxfxbqfkf.iobyxmoadg(this.f22294iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialButton_backgroundTint);
        this.f22292gtknphoqwx = ppxfxbqfkf.iobyxmoadg(this.f22294iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialButton_strokeColor);
        this.f22289draadjrbmk = ppxfxbqfkf.iobyxmoadg(this.f22294iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialButton_rippleColor);
        this.f22302vdvldrhtss = typedArray.getBoolean(draadjrbmk.MaterialButton_android_checkable, false);
        this.f22305zdlpuopuiu = typedArray.getDimensionPixelSize(draadjrbmk.MaterialButton_elevation, 0);
        this.f22299oxmwwwfdhm = typedArray.getBoolean(draadjrbmk.MaterialButton_toggleCheckedStateOnClick, true);
        int iYadqdtsiqt = jhduphickx.yadqdtsiqt(this.f22294iobyxmoadg);
        int paddingTop = this.f22294iobyxmoadg.getPaddingTop();
        int iCdpycssgdh = jhduphickx.cdpycssgdh(this.f22294iobyxmoadg);
        int paddingBottom = this.f22294iobyxmoadg.getPaddingBottom();
        if (typedArray.hasValue(draadjrbmk.MaterialButton_android_background)) {
            zdlpuopuiu();
        } else {
            wwaezpbzkn();
        }
        jhduphickx.lxfrhoxuzk(this.f22294iobyxmoadg, iYadqdtsiqt + this.f22300ppxfxbqfkf, paddingTop + this.f22291eablkybsjg, iCdpycssgdh + this.f22304wkgbmnqykc, paddingBottom + this.f22293gxszxtbevo);
    }

    void pmvmpeiblj(boolean z13) {
        this.f22287agtfadlqog = z13;
        pkzmftpjix();
    }

    public int ppxfxbqfkf() {
        return this.f22293gxszxtbevo;
    }

    boolean rgvfuqvkyq() {
        return this.f22302vdvldrhtss;
    }

    boolean vdvldrhtss() {
        return this.f22299oxmwwwfdhm;
    }

    PorterDuff.Mode wflxmlrfwp() {
        return this.f22290dxjokdxxww;
    }

    public int wkgbmnqykc() {
        return this.f22291eablkybsjg;
    }

    void yadqdtsiqt(PorterDuff.Mode mode) {
        if (this.f22290dxjokdxxww != mode) {
            this.f22290dxjokdxxww = mode;
            if (gxszxtbevo() == null || this.f22290dxjokdxxww == null) {
                return;
            }
            k1.iobyxmoadg.rgvfuqvkyq(gxszxtbevo(), this.f22290dxjokdxxww);
        }
    }

    void yggfygwlhe(boolean z13) {
        this.f22302vdvldrhtss = z13;
    }

    void zdlpuopuiu() {
        this.f22298ojitshcjhn = true;
        this.f22294iobyxmoadg.setSupportBackgroundTintList(this.f22288btonecajqb);
        this.f22294iobyxmoadg.setSupportBackgroundTintMode(this.f22290dxjokdxxww);
    }

    int zoijcleaow() {
        return this.f22296lqeggnwhkg;
    }

    void zynmafqrjb(ColorStateList colorStateList) {
        if (this.f22292gtknphoqwx != colorStateList) {
            this.f22292gtknphoqwx = colorStateList;
            pkzmftpjix();
        }
    }
}
