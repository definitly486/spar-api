package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class oxmwwwfdhm extends ojitshcjhn {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f3381dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Drawable f3382eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ColorStateList f3383gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private PorterDuff.Mode f3384lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f3385nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final SeekBar f3386wkgbmnqykc;

    oxmwwwfdhm(SeekBar seekBar) {
        super(seekBar);
        this.f3383gxszxtbevo = null;
        this.f3384lqeggnwhkg = null;
        this.f3385nufgyqmvbu = false;
        this.f3381dxjokdxxww = false;
        this.f3386wkgbmnqykc = seekBar;
    }

    private void gxszxtbevo() {
        Drawable drawable = this.f3382eablkybsjg;
        if (drawable != null) {
            if (this.f3385nufgyqmvbu || this.f3381dxjokdxxww) {
                Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawable.mutate());
                this.f3382eablkybsjg = drawableOxmwwwfdhm;
                if (this.f3385nufgyqmvbu) {
                    k1.iobyxmoadg.ojitshcjhn(drawableOxmwwwfdhm, this.f3383gxszxtbevo);
                }
                if (this.f3381dxjokdxxww) {
                    k1.iobyxmoadg.rgvfuqvkyq(this.f3382eablkybsjg, this.f3384lqeggnwhkg);
                }
                if (this.f3382eablkybsjg.isStateful()) {
                    this.f3382eablkybsjg.setState(this.f3386wkgbmnqykc.getDrawableState());
                }
            }
        }
    }

    void btonecajqb(Drawable drawable) {
        Drawable drawable2 = this.f3382eablkybsjg;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3382eablkybsjg = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3386wkgbmnqykc);
            k1.iobyxmoadg.wflxmlrfwp(drawable, this.f3386wkgbmnqykc.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f3386wkgbmnqykc.getDrawableState());
            }
            gxszxtbevo();
        }
        this.f3386wkgbmnqykc.invalidate();
    }

    void dxjokdxxww() {
        Drawable drawable = this.f3382eablkybsjg;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void lqeggnwhkg(Canvas canvas) {
        if (this.f3382eablkybsjg != null) {
            int max = this.f3386wkgbmnqykc.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3382eablkybsjg.getIntrinsicWidth();
                int intrinsicHeight = this.f3382eablkybsjg.getIntrinsicHeight();
                int i13 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i14 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3382eablkybsjg.setBounds(-i13, -i14, i13, i14);
                float width = ((this.f3386wkgbmnqykc.getWidth() - this.f3386wkgbmnqykc.getPaddingLeft()) - this.f3386wkgbmnqykc.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f3386wkgbmnqykc.getPaddingLeft(), this.f3386wkgbmnqykc.getHeight() / 2);
                for (int i15 = 0; i15 <= max; i15++) {
                    this.f3382eablkybsjg.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void nufgyqmvbu() {
        Drawable drawable = this.f3382eablkybsjg;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3386wkgbmnqykc.getDrawableState())) {
            this.f3386wkgbmnqykc.invalidateDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.ojitshcjhn
    void ppxfxbqfkf(AttributeSet attributeSet, int i13) {
        super.ppxfxbqfkf(attributeSet, i13);
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3386wkgbmnqykc.getContext(), attributeSet, lqeggnwhkg.btonecajqb.AppCompatSeekBar, i13, 0);
        SeekBar seekBar = this.f3386wkgbmnqykc;
        jhduphickx.sflfametgt(seekBar, seekBar.getContext(), lqeggnwhkg.btonecajqb.AppCompatSeekBar, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        Drawable drawableNufgyqmvbu = mbcevpiqjqVarJyumaefscl.nufgyqmvbu(lqeggnwhkg.btonecajqb.AppCompatSeekBar_android_thumb);
        if (drawableNufgyqmvbu != null) {
            this.f3386wkgbmnqykc.setThumb(drawableNufgyqmvbu);
        }
        btonecajqb(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.AppCompatSeekBar_tickMark));
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3384lqeggnwhkg = yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.AppCompatSeekBar_tickMarkTintMode, -1), this.f3384lqeggnwhkg);
            this.f3381dxjokdxxww = true;
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatSeekBar_tickMarkTint)) {
            this.f3383gxszxtbevo = mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.AppCompatSeekBar_tickMarkTint);
            this.f3385nufgyqmvbu = true;
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        gxszxtbevo();
    }
}
