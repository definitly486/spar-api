package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f3300gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CheckedTextView f3301iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ColorStateList f3304zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private PorterDuff.Mode f3302ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f3303wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f3299eablkybsjg = false;

    gxszxtbevo(CheckedTextView checkedTextView) {
        this.f3301iobyxmoadg = checkedTextView;
    }

    void eablkybsjg() {
        if (this.f3300gxszxtbevo) {
            this.f3300gxszxtbevo = false;
        } else {
            this.f3300gxszxtbevo = true;
            iobyxmoadg();
        }
    }

    void gxszxtbevo(ColorStateList colorStateList) {
        this.f3304zoijcleaow = colorStateList;
        this.f3303wkgbmnqykc = true;
        iobyxmoadg();
    }

    void iobyxmoadg() {
        Drawable drawableIobyxmoadg = androidx.core.widget.zoijcleaow.iobyxmoadg(this.f3301iobyxmoadg);
        if (drawableIobyxmoadg != null) {
            if (this.f3303wkgbmnqykc || this.f3299eablkybsjg) {
                Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawableIobyxmoadg).mutate();
                if (this.f3303wkgbmnqykc) {
                    k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f3304zoijcleaow);
                }
                if (this.f3299eablkybsjg) {
                    k1.iobyxmoadg.rgvfuqvkyq(drawableMutate, this.f3302ppxfxbqfkf);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f3301iobyxmoadg.getDrawableState());
                }
                this.f3301iobyxmoadg.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    void lqeggnwhkg(PorterDuff.Mode mode) {
        this.f3302ppxfxbqfkf = mode;
        this.f3299eablkybsjg = true;
        iobyxmoadg();
    }

    PorterDuff.Mode ppxfxbqfkf() {
        return this.f3302ppxfxbqfkf;
    }

    void wkgbmnqykc(AttributeSet attributeSet, int i13) {
        int iAgtfadlqog;
        int iAgtfadlqog2;
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3301iobyxmoadg.getContext(), attributeSet, lqeggnwhkg.btonecajqb.CheckedTextView, i13, 0);
        CheckedTextView checkedTextView = this.f3301iobyxmoadg;
        jhduphickx.sflfametgt(checkedTextView, checkedTextView.getContext(), lqeggnwhkg.btonecajqb.CheckedTextView, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        try {
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkCompat) && (iAgtfadlqog2 = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f3301iobyxmoadg;
                    checkedTextView2.setCheckMarkDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(checkedTextView2.getContext(), iAgtfadlqog2));
                } catch (Resources.NotFoundException unused) {
                    if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CheckedTextView_android_checkMark)) {
                        CheckedTextView checkedTextView3 = this.f3301iobyxmoadg;
                        checkedTextView3.setCheckMarkDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(checkedTextView3.getContext(), iAgtfadlqog));
                    }
                }
            } else if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CheckedTextView_android_checkMark) && (iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f3301iobyxmoadg;
                checkedTextView4.setCheckMarkDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(checkedTextView4.getContext(), iAgtfadlqog));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkTint)) {
                androidx.core.widget.zoijcleaow.zoijcleaow(this.f3301iobyxmoadg, mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkTint));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkTintMode)) {
                androidx.core.widget.zoijcleaow.ppxfxbqfkf(this.f3301iobyxmoadg, yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        }
    }

    ColorStateList zoijcleaow() {
        return this.f3304zoijcleaow;
    }
}
