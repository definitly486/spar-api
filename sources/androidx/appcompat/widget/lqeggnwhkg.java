package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class lqeggnwhkg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f3360gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CompoundButton f3361iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ColorStateList f3364zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private PorterDuff.Mode f3362ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f3363wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f3359eablkybsjg = false;

    lqeggnwhkg(CompoundButton compoundButton) {
        this.f3361iobyxmoadg = compoundButton;
    }

    void eablkybsjg() {
        if (this.f3360gxszxtbevo) {
            this.f3360gxszxtbevo = false;
        } else {
            this.f3360gxszxtbevo = true;
            iobyxmoadg();
        }
    }

    void gxszxtbevo(ColorStateList colorStateList) {
        this.f3364zoijcleaow = colorStateList;
        this.f3363wkgbmnqykc = true;
        iobyxmoadg();
    }

    void iobyxmoadg() {
        Drawable drawableIobyxmoadg = androidx.core.widget.ppxfxbqfkf.iobyxmoadg(this.f3361iobyxmoadg);
        if (drawableIobyxmoadg != null) {
            if (this.f3363wkgbmnqykc || this.f3359eablkybsjg) {
                Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawableIobyxmoadg).mutate();
                if (this.f3363wkgbmnqykc) {
                    k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f3364zoijcleaow);
                }
                if (this.f3359eablkybsjg) {
                    k1.iobyxmoadg.rgvfuqvkyq(drawableMutate, this.f3362ppxfxbqfkf);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f3361iobyxmoadg.getDrawableState());
                }
                this.f3361iobyxmoadg.setButtonDrawable(drawableMutate);
            }
        }
    }

    void lqeggnwhkg(PorterDuff.Mode mode) {
        this.f3362ppxfxbqfkf = mode;
        this.f3359eablkybsjg = true;
        iobyxmoadg();
    }

    PorterDuff.Mode ppxfxbqfkf() {
        return this.f3362ppxfxbqfkf;
    }

    void wkgbmnqykc(AttributeSet attributeSet, int i13) {
        int iAgtfadlqog;
        int iAgtfadlqog2;
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3361iobyxmoadg.getContext(), attributeSet, lqeggnwhkg.btonecajqb.CompoundButton, i13, 0);
        CompoundButton compoundButton = this.f3361iobyxmoadg;
        jhduphickx.sflfametgt(compoundButton, compoundButton.getContext(), lqeggnwhkg.btonecajqb.CompoundButton, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        try {
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CompoundButton_buttonCompat) && (iAgtfadlqog2 = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f3361iobyxmoadg;
                    compoundButton2.setButtonDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(compoundButton2.getContext(), iAgtfadlqog2));
                } catch (Resources.NotFoundException unused) {
                    if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CompoundButton_android_button)) {
                        CompoundButton compoundButton3 = this.f3361iobyxmoadg;
                        compoundButton3.setButtonDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(compoundButton3.getContext(), iAgtfadlqog));
                    }
                }
            } else if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CompoundButton_android_button) && (iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton4 = this.f3361iobyxmoadg;
                compoundButton4.setButtonDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(compoundButton4.getContext(), iAgtfadlqog));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CompoundButton_buttonTint)) {
                androidx.core.widget.ppxfxbqfkf.wkgbmnqykc(this.f3361iobyxmoadg, mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.CompoundButton_buttonTint));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.CompoundButton_buttonTintMode)) {
                androidx.core.widget.ppxfxbqfkf.eablkybsjg(this.f3361iobyxmoadg, yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        }
    }

    ColorStateList zoijcleaow() {
        return this.f3364zoijcleaow;
    }
}
