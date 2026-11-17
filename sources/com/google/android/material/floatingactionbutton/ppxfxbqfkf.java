package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import ra.gtknphoqwx;
import ra.lqeggnwhkg;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf extends zoijcleaow {

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private StateListAnimator f22774dsvhmnatus;

    static class iobyxmoadg extends lqeggnwhkg {
        iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            super(gtknphoqwxVar);
        }

        @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    ppxfxbqfkf(FloatingActionButton floatingActionButton, qa.zoijcleaow zoijcleaowVar) {
        super(floatingActionButton, zoijcleaowVar);
    }

    private StateListAnimator metgxyhuhe(float f13, float f14, float f15) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(zoijcleaow.f22785ylkuphrtab, rlfsiqarku(f13, f15));
        stateListAnimator.addState(zoijcleaow.f22782pkzmftpjix, rlfsiqarku(f13, f14));
        stateListAnimator.addState(zoijcleaow.f22777hcddaimhww, rlfsiqarku(f13, f14));
        stateListAnimator.addState(zoijcleaow.f22780jpowsppfya, rlfsiqarku(f13, f14));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f22797iwizpuwonk, "elevation", f13).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f22797iwizpuwonk, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(zoijcleaow.f22775cdpycssgdh);
        stateListAnimator.addState(zoijcleaow.f22778hkdspvbjdz, animatorSet);
        stateListAnimator.addState(zoijcleaow.f22776cllcsxoeiz, rlfsiqarku(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator rlfsiqarku(float f13, float f14) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f22797iwizpuwonk, "elevation", f13).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f22797iwizpuwonk, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f14).setDuration(100L));
        animatorSet.setInterpolator(zoijcleaow.f22775cdpycssgdh);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    public float btonecajqb() {
        return this.f22797iwizpuwonk.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void cqumvgiudr() {
    }

    lqeggnwhkg czzsidtyhn() {
        return new iobyxmoadg((gtknphoqwx) nufgyqmvbu.gxszxtbevo(this.f22795iobyxmoadg));
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void istkbnxepw(float f13, float f14, float f15) {
        if (this.f22797iwizpuwonk.getStateListAnimator() == this.f22774dsvhmnatus) {
            StateListAnimator stateListAnimatorMetgxyhuhe = metgxyhuhe(f13, f14, f15);
            this.f22774dsvhmnatus = stateListAnimatorMetgxyhuhe;
            this.f22797iwizpuwonk.setStateListAnimator(stateListAnimatorMetgxyhuhe);
        }
        if (sopmlzcsov()) {
            ikoacuggdj();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void lereixgezr() {
        ikoacuggdj();
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void ojitshcjhn(Rect rect) {
        if (this.f22788cqumvgiudr.zoijcleaow()) {
            super.ojitshcjhn(rect);
        } else if (jlmebxxoox()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f22793gtknphoqwx - this.f22797iwizpuwonk.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    boolean sopmlzcsov() {
        return this.f22788cqumvgiudr.zoijcleaow() || !jlmebxxoox();
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void tzroggbefp(ColorStateList colorStateList) {
        Drawable drawable = this.f22806ppxfxbqfkf;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(pa.zoijcleaow.wkgbmnqykc(colorStateList));
        } else {
            super.tzroggbefp(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void vipkmwdibw() {
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    boolean wwaezpbzkn() {
        return false;
    }

    com.google.android.material.floatingactionbutton.iobyxmoadg xrmfcynszj(int i13, ColorStateList colorStateList) {
        Context context = this.f22797iwizpuwonk.getContext();
        com.google.android.material.floatingactionbutton.iobyxmoadg iobyxmoadgVar = new com.google.android.material.floatingactionbutton.iobyxmoadg((gtknphoqwx) nufgyqmvbu.gxszxtbevo(this.f22795iobyxmoadg));
        iobyxmoadgVar.eablkybsjg(androidx.core.content.iobyxmoadg.getColor(context, da.ppxfxbqfkf.design_fab_stroke_top_outer_color), androidx.core.content.iobyxmoadg.getColor(context, da.ppxfxbqfkf.design_fab_stroke_top_inner_color), androidx.core.content.iobyxmoadg.getColor(context, da.ppxfxbqfkf.design_fab_stroke_end_inner_color), androidx.core.content.iobyxmoadg.getColor(context, da.ppxfxbqfkf.design_fab_stroke_end_outer_color));
        iobyxmoadgVar.wkgbmnqykc(i13);
        iobyxmoadgVar.ppxfxbqfkf(colorStateList);
        return iobyxmoadgVar;
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void yggfygwlhe(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13) {
        Drawable layerDrawable;
        lqeggnwhkg lqeggnwhkgVarCzzsidtyhn = czzsidtyhn();
        this.f22813zoijcleaow = lqeggnwhkgVarCzzsidtyhn;
        lqeggnwhkgVarCzzsidtyhn.setTintList(colorStateList);
        if (mode != null) {
            this.f22813zoijcleaow.setTintMode(mode);
        }
        this.f22813zoijcleaow.hkdspvbjdz(this.f22797iwizpuwonk.getContext());
        if (i13 > 0) {
            this.f22810wkgbmnqykc = xrmfcynszj(i13, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) nufgyqmvbu.gxszxtbevo(this.f22810wkgbmnqykc), (Drawable) nufgyqmvbu.gxszxtbevo(this.f22813zoijcleaow)});
        } else {
            this.f22810wkgbmnqykc = null;
            layerDrawable = this.f22813zoijcleaow;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(pa.zoijcleaow.wkgbmnqykc(colorStateList2), layerDrawable, null);
        this.f22806ppxfxbqfkf = rippleDrawable;
        this.f22791eablkybsjg = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.zoijcleaow
    void zynmafqrjb(int[] iArr) {
    }
}
