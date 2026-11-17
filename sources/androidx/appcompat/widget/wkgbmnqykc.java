package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private kegysxyocb f3408eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private kegysxyocb f3409gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f3410iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private kegysxyocb f3412wkgbmnqykc;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f3411ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f3413zoijcleaow = nufgyqmvbu.zoijcleaow();

    wkgbmnqykc(View view) {
        this.f3410iobyxmoadg = view;
    }

    private boolean gtknphoqwx() {
        return this.f3412wkgbmnqykc != null;
    }

    private boolean iobyxmoadg(Drawable drawable) {
        if (this.f3409gxszxtbevo == null) {
            this.f3409gxszxtbevo = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3409gxszxtbevo;
        kegysxyocbVar.iobyxmoadg();
        ColorStateList colorStateListOxmwwwfdhm = jhduphickx.oxmwwwfdhm(this.f3410iobyxmoadg);
        if (colorStateListOxmwwwfdhm != null) {
            kegysxyocbVar.f3357wkgbmnqykc = true;
            kegysxyocbVar.f3355iobyxmoadg = colorStateListOxmwwwfdhm;
        }
        PorterDuff.Mode modeKcexrzcfyt = jhduphickx.kcexrzcfyt(this.f3410iobyxmoadg);
        if (modeKcexrzcfyt != null) {
            kegysxyocbVar.f3356ppxfxbqfkf = true;
            kegysxyocbVar.f3358zoijcleaow = modeKcexrzcfyt;
        }
        if (!kegysxyocbVar.f3357wkgbmnqykc && !kegysxyocbVar.f3356ppxfxbqfkf) {
            return false;
        }
        nufgyqmvbu.dxjokdxxww(drawable, kegysxyocbVar, this.f3410iobyxmoadg.getDrawableState());
        return true;
    }

    void btonecajqb(PorterDuff.Mode mode) {
        if (this.f3408eablkybsjg == null) {
            this.f3408eablkybsjg = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3408eablkybsjg;
        kegysxyocbVar.f3358zoijcleaow = mode;
        kegysxyocbVar.f3356ppxfxbqfkf = true;
        zoijcleaow();
    }

    void dxjokdxxww(ColorStateList colorStateList) {
        if (this.f3408eablkybsjg == null) {
            this.f3408eablkybsjg = new kegysxyocb();
        }
        kegysxyocb kegysxyocbVar = this.f3408eablkybsjg;
        kegysxyocbVar.f3355iobyxmoadg = colorStateList;
        kegysxyocbVar.f3357wkgbmnqykc = true;
        zoijcleaow();
    }

    void eablkybsjg(AttributeSet attributeSet, int i13) {
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3410iobyxmoadg.getContext(), attributeSet, lqeggnwhkg.btonecajqb.ViewBackgroundHelper, i13, 0);
        View view = this.f3410iobyxmoadg;
        jhduphickx.sflfametgt(view, view.getContext(), lqeggnwhkg.btonecajqb.ViewBackgroundHelper, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        try {
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_android_background)) {
                this.f3411ppxfxbqfkf = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListGxszxtbevo = this.f3413zoijcleaow.gxszxtbevo(this.f3410iobyxmoadg.getContext(), this.f3411ppxfxbqfkf);
                if (colorStateListGxszxtbevo != null) {
                    nufgyqmvbu(colorStateListGxszxtbevo);
                }
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_backgroundTint)) {
                jhduphickx.lrnfpwlwnk(this.f3410iobyxmoadg, mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_backgroundTint));
            }
            if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_backgroundTintMode)) {
                jhduphickx.zeieaojujs(this.f3410iobyxmoadg, yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        }
    }

    void gxszxtbevo(Drawable drawable) {
        this.f3411ppxfxbqfkf = -1;
        nufgyqmvbu(null);
        zoijcleaow();
    }

    void lqeggnwhkg(int i13) {
        this.f3411ppxfxbqfkf = i13;
        nufgyqmvbu nufgyqmvbuVar = this.f3413zoijcleaow;
        nufgyqmvbu(nufgyqmvbuVar != null ? nufgyqmvbuVar.gxszxtbevo(this.f3410iobyxmoadg.getContext(), i13) : null);
        zoijcleaow();
    }

    void nufgyqmvbu(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3412wkgbmnqykc == null) {
                this.f3412wkgbmnqykc = new kegysxyocb();
            }
            kegysxyocb kegysxyocbVar = this.f3412wkgbmnqykc;
            kegysxyocbVar.f3355iobyxmoadg = colorStateList;
            kegysxyocbVar.f3357wkgbmnqykc = true;
        } else {
            this.f3412wkgbmnqykc = null;
        }
        zoijcleaow();
    }

    ColorStateList ppxfxbqfkf() {
        kegysxyocb kegysxyocbVar = this.f3408eablkybsjg;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3355iobyxmoadg;
        }
        return null;
    }

    PorterDuff.Mode wkgbmnqykc() {
        kegysxyocb kegysxyocbVar = this.f3408eablkybsjg;
        if (kegysxyocbVar != null) {
            return kegysxyocbVar.f3358zoijcleaow;
        }
        return null;
    }

    void zoijcleaow() {
        Drawable background = this.f3410iobyxmoadg.getBackground();
        if (background != null) {
            if (gtknphoqwx() && iobyxmoadg(background)) {
                return;
            }
            kegysxyocb kegysxyocbVar = this.f3408eablkybsjg;
            if (kegysxyocbVar != null) {
                nufgyqmvbu.dxjokdxxww(background, kegysxyocbVar, this.f3410iobyxmoadg.getDrawableState());
                return;
            }
            kegysxyocb kegysxyocbVar2 = this.f3412wkgbmnqykc;
            if (kegysxyocbVar2 != null) {
                nufgyqmvbu.dxjokdxxww(background, kegysxyocbVar2, this.f3410iobyxmoadg.getDrawableState());
            }
        }
    }
}
