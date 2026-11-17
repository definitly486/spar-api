package com.google.android.material.card;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import da.draadjrbmk;
import da.gxszxtbevo;
import kotlin.KotlinVersion;
import na.nufgyqmvbu;
import oa.ppxfxbqfkf;
import ra.btonecajqb;
import ra.eablkybsjg;
import ra.gtknphoqwx;
import ra.lqeggnwhkg;
import ra.wkgbmnqykc;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final double f22316lereixgezr = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Drawable f22317pmvmpeiblj;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private ColorStateList f22318agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Drawable f22319btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f22320cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private ColorStateList f22321draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Drawable f22322dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f22323eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private ColorStateList f22325gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f22326gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f22327iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f22328iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final TimeInterpolator f22329jyumaefscl;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f22331lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f22332nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private Drawable f22333ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private lqeggnwhkg f22334oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f22335ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private LayerDrawable f22336rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private lqeggnwhkg f22337vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private gtknphoqwx f22338wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lqeggnwhkg f22339wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ValueAnimator f22340yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f22341zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Rect f22342zoijcleaow = new Rect();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f22330kcexrzcfyt = false;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f22324esjtqupxsv = 0.0f;

    class iobyxmoadg extends InsetDrawable {
        iobyxmoadg(Drawable drawable, int i13, int i14, int i15, int i16) {
            super(drawable, i13, i14, i15, i16);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f22317pmvmpeiblj = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public zoijcleaow(MaterialCardView materialCardView, AttributeSet attributeSet, int i13, int i14) {
        this.f22327iobyxmoadg = materialCardView;
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(materialCardView.getContext(), attributeSet, i13, i14);
        this.f22335ppxfxbqfkf = lqeggnwhkgVar;
        lqeggnwhkgVar.hkdspvbjdz(materialCardView.getContext());
        lqeggnwhkgVar.ikoacuggdj(-12303292);
        gtknphoqwx.zoijcleaow zoijcleaowVarJyumaefscl = lqeggnwhkgVar.cdpycssgdh().jyumaefscl();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, draadjrbmk.CardView, i13, da.gtknphoqwx.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.CardView_cardCornerRadius)) {
            zoijcleaowVarJyumaefscl.ojitshcjhn(typedArrayObtainStyledAttributes.getDimension(draadjrbmk.CardView_cardCornerRadius, 0.0f));
        }
        this.f22339wkgbmnqykc = new lqeggnwhkg();
        ribwqtqdhb(zoijcleaowVarJyumaefscl.wflxmlrfwp());
        this.f22329jyumaefscl = nufgyqmvbu.lqeggnwhkg(materialCardView.getContext(), da.zoijcleaow.motionEasingLinearInterpolator, ea.iobyxmoadg.f31020iobyxmoadg);
        this.f22328iwizpuwonk = nufgyqmvbu.gxszxtbevo(materialCardView.getContext(), da.zoijcleaow.motionDurationShort2, 300);
        this.f22320cqumvgiudr = nufgyqmvbu.gxszxtbevo(materialCardView.getContext(), da.zoijcleaow.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private lqeggnwhkg btonecajqb() {
        return new lqeggnwhkg(this.f22338wflxmlrfwp);
    }

    private Drawable cdpycssgdh(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f22327iobyxmoadg.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(gxszxtbevo());
            iCeil = (int) Math.ceil(eablkybsjg());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new iobyxmoadg(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private Drawable dxjokdxxww() {
        if (!pa.zoijcleaow.f76259iobyxmoadg) {
            return nufgyqmvbu();
        }
        this.f22334oxmwwwfdhm = btonecajqb();
        return new RippleDrawable(this.f22325gtknphoqwx, null, this.f22334oxmwwwfdhm);
    }

    private float eablkybsjg() {
        return this.f22327iobyxmoadg.getMaxCardElevation() + (jztzpxfvev() ? ppxfxbqfkf() : 0.0f);
    }

    private float gxszxtbevo() {
        return (this.f22327iobyxmoadg.getMaxCardElevation() * 1.5f) + (jztzpxfvev() ? ppxfxbqfkf() : 0.0f);
    }

    private float jyumaefscl() {
        if (this.f22327iobyxmoadg.getPreventCornerOverlap() && this.f22327iobyxmoadg.getUseCompatPadding()) {
            return (float) ((1.0d - f22316lereixgezr) * ((double) this.f22327iobyxmoadg.getCardViewRadius()));
        }
        return 0.0f;
    }

    private boolean jztzpxfvev() {
        return this.f22327iobyxmoadg.getPreventCornerOverlap() && lqeggnwhkg() && this.f22327iobyxmoadg.getUseCompatPadding();
    }

    private boolean lmojexxdyd() {
        return (this.f22331lqeggnwhkg & 80) == 80;
    }

    private boolean lqeggnwhkg() {
        return this.f22335ppxfxbqfkf.wypolnanlu();
    }

    private Drawable nufgyqmvbu() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        lqeggnwhkg lqeggnwhkgVarBtonecajqb = btonecajqb();
        this.f22337vdvldrhtss = lqeggnwhkgVarBtonecajqb;
        lqeggnwhkgVarBtonecajqb.crxdokpmqz(this.f22325gtknphoqwx);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f22337vdvldrhtss);
        return stateListDrawable;
    }

    private boolean okpsazkaxt() {
        return this.f22327iobyxmoadg.getPreventCornerOverlap() && !lqeggnwhkg();
    }

    private float ppxfxbqfkf() {
        return Math.max(Math.max(wkgbmnqykc(this.f22338wflxmlrfwp.vdvldrhtss(), this.f22335ppxfxbqfkf.iozdgvuglv()), wkgbmnqykc(this.f22338wflxmlrfwp.kcexrzcfyt(), this.f22335ppxfxbqfkf.lmojexxdyd())), Math.max(wkgbmnqykc(this.f22338wflxmlrfwp.gtknphoqwx(), this.f22335ppxfxbqfkf.zdlpuopuiu()), wkgbmnqykc(this.f22338wflxmlrfwp.dxjokdxxww(), this.f22335ppxfxbqfkf.kcexrzcfyt())));
    }

    private void uwvvkdfqfp(Drawable drawable) {
        if (this.f22327iobyxmoadg.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f22327iobyxmoadg.getForeground()).setDrawable(drawable);
        } else {
            this.f22327iobyxmoadg.setForeground(cdpycssgdh(drawable));
        }
    }

    private float wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, float f13) {
        if (wkgbmnqykcVar instanceof btonecajqb) {
            return (float) ((1.0d - f22316lereixgezr) * ((double) f13));
        }
        if (wkgbmnqykcVar instanceof eablkybsjg) {
            return f13 / 2.0f;
        }
        return 0.0f;
    }

    private boolean wwaezpbzkn() {
        return (this.f22331lqeggnwhkg & 8388613) == 8388613;
    }

    private boolean xrmfcynszj() {
        if (this.f22327iobyxmoadg.isClickable()) {
            return true;
        }
        View view = this.f22327iobyxmoadg;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private void ydmasvzmpa() {
        Drawable drawable;
        if (pa.zoijcleaow.f76259iobyxmoadg && (drawable = this.f22333ojitshcjhn) != null) {
            ((RippleDrawable) drawable).setColor(this.f22325gtknphoqwx);
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = this.f22337vdvldrhtss;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.crxdokpmqz(this.f22325gtknphoqwx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ylkuphrtab(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f22319btonecajqb.setAlpha((int) (255.0f * fFloatValue));
        this.f22324esjtqupxsv = fFloatValue;
    }

    private Drawable zdlpuopuiu() {
        if (this.f22333ojitshcjhn == null) {
            this.f22333ojitshcjhn = dxjokdxxww();
        }
        if (this.f22336rgvfuqvkyq == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f22333ojitshcjhn, this.f22339wkgbmnqykc, this.f22319btonecajqb});
            this.f22336rgvfuqvkyq = layerDrawable;
            layerDrawable.setId(2, gxszxtbevo.mtrl_card_checked_layer_id);
        }
        return this.f22336rgvfuqvkyq;
    }

    ColorStateList agtfadlqog() {
        return this.f22339wkgbmnqykc.cqumvgiudr();
    }

    void cllcsxoeiz(ColorStateList colorStateList) {
        lqeggnwhkg lqeggnwhkgVar = this.f22339wkgbmnqykc;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        lqeggnwhkgVar.crxdokpmqz(colorStateList);
    }

    ColorStateList cqumvgiudr() {
        return this.f22325gtknphoqwx;
    }

    void crxdokpmqz(float f13) {
        this.f22335ppxfxbqfkf.jlmebxxoox(f13);
        lqeggnwhkg lqeggnwhkgVar = this.f22339wkgbmnqykc;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.jlmebxxoox(f13);
        }
        lqeggnwhkg lqeggnwhkgVar2 = this.f22334oxmwwwfdhm;
        if (lqeggnwhkgVar2 != null) {
            lqeggnwhkgVar2.jlmebxxoox(f13);
        }
    }

    void czzsidtyhn() {
        this.f22335ppxfxbqfkf.sopmlzcsov(this.f22327iobyxmoadg.getCardElevation());
    }

    lqeggnwhkg draadjrbmk() {
        return this.f22335ppxfxbqfkf;
    }

    void dsvhmnatus(boolean z13) {
        this.f22341zdlpuopuiu = z13;
    }

    gtknphoqwx esjtqupxsv() {
        return this.f22338wflxmlrfwp;
    }

    void gtknphoqwx() {
        Drawable drawable = this.f22333ojitshcjhn;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i13 = bounds.bottom;
            this.f22333ojitshcjhn.setBounds(bounds.left, bounds.top, bounds.right, i13 - 1);
            this.f22333ojitshcjhn.setBounds(bounds.left, bounds.top, bounds.right, i13);
        }
    }

    void hcddaimhww(int i13, int i14) {
        int iCeil;
        int iCeil2;
        int i15;
        int i16;
        if (this.f22336rgvfuqvkyq != null) {
            if (this.f22327iobyxmoadg.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(gxszxtbevo() * 2.0f);
                iCeil2 = (int) Math.ceil(eablkybsjg() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i17 = wwaezpbzkn() ? ((i13 - this.f22323eablkybsjg) - this.f22326gxszxtbevo) - iCeil2 : this.f22323eablkybsjg;
            int i18 = lmojexxdyd() ? this.f22323eablkybsjg : ((i14 - this.f22323eablkybsjg) - this.f22326gxszxtbevo) - iCeil;
            int i19 = wwaezpbzkn() ? this.f22323eablkybsjg : ((i13 - this.f22323eablkybsjg) - this.f22326gxszxtbevo) - iCeil2;
            int i23 = lmojexxdyd() ? ((i14 - this.f22323eablkybsjg) - this.f22326gxszxtbevo) - iCeil : this.f22323eablkybsjg;
            if (jhduphickx.lereixgezr(this.f22327iobyxmoadg) == 1) {
                i16 = i19;
                i15 = i17;
            } else {
                i15 = i19;
                i16 = i17;
            }
            this.f22336rgvfuqvkyq.setLayerInset(2, i16, i23, i15, i18);
        }
    }

    void hkdspvbjdz(ColorStateList colorStateList) {
        this.f22335ppxfxbqfkf.crxdokpmqz(colorStateList);
    }

    void ikoacuggdj(int i13, int i14, int i15, int i16) {
        this.f22342zoijcleaow.set(i13, i14, i15, i16);
        rlfsiqarku();
    }

    boolean iozdgvuglv() {
        return this.f22341zdlpuopuiu;
    }

    Rect istkbnxepw() {
        return this.f22342zoijcleaow;
    }

    float iwizpuwonk() {
        return this.f22335ppxfxbqfkf.esjtqupxsv();
    }

    void jhduphickx(int i13) {
        if (i13 == this.f22332nufgyqmvbu) {
            return;
        }
        this.f22332nufgyqmvbu = i13;
        sflfametgt();
    }

    void jlmebxxoox(ColorStateList colorStateList) {
        this.f22325gtknphoqwx = colorStateList;
        ydmasvzmpa();
    }

    void jpowsppfya(boolean z13) {
        this.f22330kcexrzcfyt = z13;
    }

    ColorStateList kcexrzcfyt() {
        return this.f22321draadjrbmk;
    }

    void kegysxyocb(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
            this.f22319btonecajqb = drawableMutate;
            k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f22321draadjrbmk);
            wypolnanlu(this.f22327iobyxmoadg.isChecked());
        } else {
            this.f22319btonecajqb = f22317pmvmpeiblj;
        }
        LayerDrawable layerDrawable = this.f22336rgvfuqvkyq;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(gxszxtbevo.mtrl_card_checked_layer_id, this.f22319btonecajqb);
        }
    }

    int lereixgezr() {
        ColorStateList colorStateList = this.f22318agtfadlqog;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    void mbcevpiqjq(int i13) {
        this.f22323eablkybsjg = i13;
    }

    void metgxyhuhe() {
        Drawable drawable = this.f22322dxjokdxxww;
        Drawable drawableZdlpuopuiu = xrmfcynszj() ? zdlpuopuiu() : this.f22339wkgbmnqykc;
        this.f22322dxjokdxxww = drawableZdlpuopuiu;
        if (drawable != drawableZdlpuopuiu) {
            uwvvkdfqfp(drawableZdlpuopuiu);
        }
    }

    void ntlheqmsrt(int i13) {
        this.f22326gxszxtbevo = i13;
    }

    Drawable ojitshcjhn() {
        return this.f22319btonecajqb;
    }

    int oxmwwwfdhm() {
        return this.f22326gxszxtbevo;
    }

    void pkzmftpjix(TypedArray typedArray) {
        ColorStateList colorStateListIobyxmoadg = ppxfxbqfkf.iobyxmoadg(this.f22327iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialCardView_strokeColor);
        this.f22318agtfadlqog = colorStateListIobyxmoadg;
        if (colorStateListIobyxmoadg == null) {
            this.f22318agtfadlqog = ColorStateList.valueOf(-1);
        }
        this.f22332nufgyqmvbu = typedArray.getDimensionPixelSize(draadjrbmk.MaterialCardView_strokeWidth, 0);
        boolean z13 = typedArray.getBoolean(draadjrbmk.MaterialCardView_android_checkable, false);
        this.f22341zdlpuopuiu = z13;
        this.f22327iobyxmoadg.setLongClickable(z13);
        this.f22321draadjrbmk = ppxfxbqfkf.iobyxmoadg(this.f22327iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialCardView_checkedIconTint);
        kegysxyocb(ppxfxbqfkf.wkgbmnqykc(this.f22327iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialCardView_checkedIcon));
        ntlheqmsrt(typedArray.getDimensionPixelSize(draadjrbmk.MaterialCardView_checkedIconSize, 0));
        mbcevpiqjq(typedArray.getDimensionPixelSize(draadjrbmk.MaterialCardView_checkedIconMargin, 0));
        this.f22331lqeggnwhkg = typedArray.getInteger(draadjrbmk.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListIobyxmoadg2 = ppxfxbqfkf.iobyxmoadg(this.f22327iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialCardView_rippleColor);
        this.f22325gtknphoqwx = colorStateListIobyxmoadg2;
        if (colorStateListIobyxmoadg2 == null) {
            this.f22325gtknphoqwx = ColorStateList.valueOf(ia.iobyxmoadg.wkgbmnqykc(this.f22327iobyxmoadg, da.zoijcleaow.colorControlHighlight));
        }
        cllcsxoeiz(ppxfxbqfkf.iobyxmoadg(this.f22327iobyxmoadg.getContext(), typedArray, draadjrbmk.MaterialCardView_cardForegroundColor));
        ydmasvzmpa();
        czzsidtyhn();
        sflfametgt();
        this.f22327iobyxmoadg.setBackgroundInternal(cdpycssgdh(this.f22335ppxfxbqfkf));
        Drawable drawableZdlpuopuiu = xrmfcynszj() ? zdlpuopuiu() : this.f22339wkgbmnqykc;
        this.f22322dxjokdxxww = drawableZdlpuopuiu;
        this.f22327iobyxmoadg.setForeground(cdpycssgdh(drawableZdlpuopuiu));
    }

    ColorStateList pmvmpeiblj() {
        return this.f22318agtfadlqog;
    }

    int rgvfuqvkyq() {
        return this.f22331lqeggnwhkg;
    }

    void ribwqtqdhb(gtknphoqwx gtknphoqwxVar) {
        this.f22338wflxmlrfwp = gtknphoqwxVar;
        this.f22335ppxfxbqfkf.setShapeAppearanceModel(gtknphoqwxVar);
        lqeggnwhkg lqeggnwhkgVar = this.f22335ppxfxbqfkf;
        lqeggnwhkgVar.jhduphickx(!lqeggnwhkgVar.wypolnanlu());
        lqeggnwhkg lqeggnwhkgVar2 = this.f22339wkgbmnqykc;
        if (lqeggnwhkgVar2 != null) {
            lqeggnwhkgVar2.setShapeAppearanceModel(gtknphoqwxVar);
        }
        lqeggnwhkg lqeggnwhkgVar3 = this.f22334oxmwwwfdhm;
        if (lqeggnwhkgVar3 != null) {
            lqeggnwhkgVar3.setShapeAppearanceModel(gtknphoqwxVar);
        }
        lqeggnwhkg lqeggnwhkgVar4 = this.f22337vdvldrhtss;
        if (lqeggnwhkgVar4 != null) {
            lqeggnwhkgVar4.setShapeAppearanceModel(gtknphoqwxVar);
        }
    }

    void rlfsiqarku() {
        int iPpxfxbqfkf = (int) (((okpsazkaxt() || jztzpxfvev()) ? ppxfxbqfkf() : 0.0f) - jyumaefscl());
        MaterialCardView materialCardView = this.f22327iobyxmoadg;
        Rect rect = this.f22342zoijcleaow;
        materialCardView.eablkybsjg(rect.left + iPpxfxbqfkf, rect.top + iPpxfxbqfkf, rect.right + iPpxfxbqfkf, rect.bottom + iPpxfxbqfkf);
    }

    void sflfametgt() {
        this.f22339wkgbmnqykc.xrmfcynszj(this.f22332nufgyqmvbu, this.f22318agtfadlqog);
    }

    void sopmlzcsov(float f13) {
        ribwqtqdhb(this.f22338wflxmlrfwp.iwizpuwonk(f13));
        this.f22322dxjokdxxww.invalidateSelf();
        if (jztzpxfvev() || okpsazkaxt()) {
            rlfsiqarku();
        }
        if (jztzpxfvev()) {
            yfnezrywwk();
        }
    }

    public void stevsuqkhv(boolean z13, boolean z14) {
        Drawable drawable = this.f22319btonecajqb;
        if (drawable != null) {
            if (z14) {
                zoijcleaow(z13);
            } else {
                drawable.setAlpha(z13 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
                this.f22324esjtqupxsv = z13 ? 1.0f : 0.0f;
            }
        }
    }

    void tzroggbefp(int i13) {
        this.f22331lqeggnwhkg = i13;
        hcddaimhww(this.f22327iobyxmoadg.getMeasuredWidth(), this.f22327iobyxmoadg.getMeasuredHeight());
    }

    void ulzqkzuiru(ColorStateList colorStateList) {
        this.f22321draadjrbmk = colorStateList;
        Drawable drawable = this.f22319btonecajqb;
        if (drawable != null) {
            k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList);
        }
    }

    int vdvldrhtss() {
        return this.f22323eablkybsjg;
    }

    void vipkmwdibw(ColorStateList colorStateList) {
        if (this.f22318agtfadlqog == colorStateList) {
            return;
        }
        this.f22318agtfadlqog = colorStateList;
        sflfametgt();
    }

    ColorStateList wflxmlrfwp() {
        return this.f22335ppxfxbqfkf.cqumvgiudr();
    }

    public void wypolnanlu(boolean z13) {
        stevsuqkhv(z13, false);
    }

    boolean yadqdtsiqt() {
        return this.f22330kcexrzcfyt;
    }

    void yfnezrywwk() {
        if (!yadqdtsiqt()) {
            this.f22327iobyxmoadg.setBackgroundInternal(cdpycssgdh(this.f22335ppxfxbqfkf));
        }
        this.f22327iobyxmoadg.setForeground(cdpycssgdh(this.f22322dxjokdxxww));
    }

    float yggfygwlhe() {
        return this.f22335ppxfxbqfkf.iozdgvuglv();
    }

    public void zoijcleaow(boolean z13) {
        float f13 = z13 ? 1.0f : 0.0f;
        float f14 = z13 ? 1.0f - this.f22324esjtqupxsv : this.f22324esjtqupxsv;
        ValueAnimator valueAnimator = this.f22340yggfygwlhe;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f22340yggfygwlhe = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f22324esjtqupxsv, f13);
        this.f22340yggfygwlhe = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.iobyxmoadg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f22315iobyxmoadg.ylkuphrtab(valueAnimator2);
            }
        });
        this.f22340yggfygwlhe.setInterpolator(this.f22329jyumaefscl);
        this.f22340yggfygwlhe.setDuration((long) ((z13 ? this.f22328iwizpuwonk : this.f22320cqumvgiudr) * f14));
        this.f22340yggfygwlhe.start();
    }

    int zynmafqrjb() {
        return this.f22332nufgyqmvbu;
    }
}
