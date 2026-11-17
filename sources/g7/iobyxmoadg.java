package g7;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements wkgbmnqykc, h7.ppxfxbqfkf, gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f36553zdlpuopuiu;

    protected final void btonecajqb(Drawable drawable) {
        Object objWkgbmnqykc = wkgbmnqykc();
        Animatable animatable = objWkgbmnqykc instanceof Animatable ? (Animatable) objWkgbmnqykc : null;
        if (animatable != null) {
            animatable.stop();
        }
        gxszxtbevo(drawable);
        dxjokdxxww();
    }

    protected final void dxjokdxxww() {
        Object objWkgbmnqykc = wkgbmnqykc();
        Animatable animatable = objWkgbmnqykc instanceof Animatable ? (Animatable) objWkgbmnqykc : null;
        if (animatable == null) {
            return;
        }
        if (this.f36553zdlpuopuiu) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public abstract void gxszxtbevo(Drawable drawable);

    @Override // g7.ppxfxbqfkf
    public void iobyxmoadg(Drawable drawable) {
        btonecajqb(drawable);
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onStart(vdvldrhtss vdvldrhtssVar) {
        this.f36553zdlpuopuiu = true;
        dxjokdxxww();
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onStop(vdvldrhtss vdvldrhtssVar) {
        this.f36553zdlpuopuiu = false;
        dxjokdxxww();
    }

    @Override // g7.ppxfxbqfkf
    public void ppxfxbqfkf(Drawable drawable) {
        btonecajqb(drawable);
    }

    public abstract Drawable wkgbmnqykc();

    @Override // g7.ppxfxbqfkf
    public void zoijcleaow(Drawable drawable) {
        btonecajqb(drawable);
    }
}
