package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f3288eablkybsjg = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ImageView f3289iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private kegysxyocb f3290ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private kegysxyocb f3291wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private kegysxyocb f3292zoijcleaow;

    public draadjrbmk(ImageView imageView) {
        this.f3289iobyxmoadg = imageView;
    }

    private boolean draadjrbmk() {
        return this.f3292zoijcleaow != null;
    }

    private boolean iobyxmoadg(Drawable drawable) {
        if (this.f3291wkgbmnqykc == null) {
            this.f3291wkgbmnqykc = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3291wkgbmnqykc;
        kegysxyocbVar.iobyxmoadg();
        ColorStateList colorStateListIobyxmoadg = androidx.core.widget.eablkybsjg.iobyxmoadg(this.f3289iobyxmoadg);
        if (colorStateListIobyxmoadg != null) {
            kegysxyocbVar.f3357wkgbmnqykc = true;
            kegysxyocbVar.f3355iobyxmoadg = colorStateListIobyxmoadg;
        }
        PorterDuff.Mode modeZoijcleaow = androidx.core.widget.eablkybsjg.zoijcleaow(this.f3289iobyxmoadg);
        if (modeZoijcleaow != null) {
            kegysxyocbVar.f3356ppxfxbqfkf = true;
            kegysxyocbVar.f3358zoijcleaow = modeZoijcleaow;
        }
        if (!kegysxyocbVar.f3357wkgbmnqykc && !kegysxyocbVar.f3356ppxfxbqfkf) {
            return false;
        }
        nufgyqmvbu.dxjokdxxww(drawable, kegysxyocbVar, this.f3289iobyxmoadg.getDrawableState());
        return true;
    }

    void btonecajqb(ColorStateList colorStateList) {
        if (this.f3290ppxfxbqfkf == null) {
            this.f3290ppxfxbqfkf = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3290ppxfxbqfkf;
        kegysxyocbVar.f3355iobyxmoadg = colorStateList;
        kegysxyocbVar.f3357wkgbmnqykc = true;
        ppxfxbqfkf();
    }

    public void dxjokdxxww(int i13) {
        if (i13 != 0) {
            Drawable drawableZoijcleaow = nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f3289iobyxmoadg.getContext(), i13);
            if (drawableZoijcleaow != null) {
                yadqdtsiqt.zoijcleaow(drawableZoijcleaow);
            }
            this.f3289iobyxmoadg.setImageDrawable(drawableZoijcleaow);
        } else {
            this.f3289iobyxmoadg.setImageDrawable(null);
        }
        ppxfxbqfkf();
    }

    PorterDuff.Mode eablkybsjg() {
        kegysxyocb kegysxyocbVar = this.f3290ppxfxbqfkf;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3358zoijcleaow;
        }
        return null;
    }

    void gtknphoqwx(PorterDuff.Mode mode) {
        if (this.f3290ppxfxbqfkf == null) {
            this.f3290ppxfxbqfkf = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3290ppxfxbqfkf;
        kegysxyocbVar.f3358zoijcleaow = mode;
        kegysxyocbVar.f3356ppxfxbqfkf = true;
        ppxfxbqfkf();
    }

    boolean gxszxtbevo() {
        return !(this.f3289iobyxmoadg.getBackground() instanceof RippleDrawable);
    }

    public void lqeggnwhkg(AttributeSet attributeSet, int i13) {
        int iAgtfadlqog;
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3289iobyxmoadg.getContext(), attributeSet, lqeggnwhkg.btonecajqb.AppCompatImageView, i13, 0);
        ImageView imageView = this.f3289iobyxmoadg;
        jhduphickx.sflfametgt(imageView, imageView.getContext(), lqeggnwhkg.btonecajqb.AppCompatImageView, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        try {
            Drawable drawable = this.f3289iobyxmoadg.getDrawable();
            if (drawable == null && (iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f3289iobyxmoadg.getContext(), iAgtfadlqog)) != null) {
                this.f3289iobyxmoadg.setImageDrawable(drawable);
            }
            if (drawable != null) {
                yadqdtsiqt.zoijcleaow(drawable);
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatImageView_tint)) {
                androidx.core.widget.eablkybsjg.ppxfxbqfkf(this.f3289iobyxmoadg, mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.AppCompatImageView_tint));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.AppCompatImageView_tintMode)) {
                androidx.core.widget.eablkybsjg.wkgbmnqykc(this.f3289iobyxmoadg, yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        }
    }

    void nufgyqmvbu(Drawable drawable) {
        this.f3288eablkybsjg = drawable.getLevel();
    }

    void ppxfxbqfkf() {
        Drawable drawable = this.f3289iobyxmoadg.getDrawable();
        if (drawable != null) {
            yadqdtsiqt.zoijcleaow(drawable);
        }
        if (drawable != null) {
            if (draadjrbmk() && iobyxmoadg(drawable)) {
                return;
            }
            kegysxyocb kegysxyocbVar = this.f3290ppxfxbqfkf;
            if (kegysxyocbVar != null) {
                nufgyqmvbu.dxjokdxxww(drawable, kegysxyocbVar, this.f3289iobyxmoadg.getDrawableState());
                return;
            }
            kegysxyocb kegysxyocbVar2 = this.f3292zoijcleaow;
            if (kegysxyocbVar2 != null) {
                nufgyqmvbu.dxjokdxxww(drawable, kegysxyocbVar2, this.f3289iobyxmoadg.getDrawableState());
            }
        }
    }

    ColorStateList wkgbmnqykc() {
        kegysxyocb kegysxyocbVar = this.f3290ppxfxbqfkf;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3355iobyxmoadg;
        }
        return null;
    }

    void zoijcleaow() {
        if (this.f3289iobyxmoadg.getDrawable() != null) {
            this.f3289iobyxmoadg.getDrawable().setLevel(this.f3288eablkybsjg);
        }
    }
}
