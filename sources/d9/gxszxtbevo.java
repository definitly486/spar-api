package d9;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo extends btonecajqb implements e9.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Animatable f27211pmvmpeiblj;

    public gxszxtbevo(ImageView imageView) {
        super(imageView);
    }

    private void ojitshcjhn(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f27211pmvmpeiblj = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f27211pmvmpeiblj = animatable;
        animatable.start();
    }

    private void vdvldrhtss(Object obj) {
        rgvfuqvkyq(obj);
        ojitshcjhn(obj);
    }

    @Override // d9.iobyxmoadg, d9.dxjokdxxww
    public void dxjokdxxww(Drawable drawable) {
        super.dxjokdxxww(drawable);
        vdvldrhtss(null);
        wkgbmnqykc(drawable);
    }

    @Override // e9.wkgbmnqykc.iobyxmoadg
    public Drawable eablkybsjg() {
        return ((ImageView) this.f27204zdlpuopuiu).getDrawable();
    }

    @Override // d9.btonecajqb, d9.iobyxmoadg, d9.dxjokdxxww
    public void gxszxtbevo(Drawable drawable) {
        super.gxszxtbevo(drawable);
        vdvldrhtss(null);
        wkgbmnqykc(drawable);
    }

    @Override // d9.btonecajqb, d9.iobyxmoadg, d9.dxjokdxxww
    public void lqeggnwhkg(Drawable drawable) {
        super.lqeggnwhkg(drawable);
        Animatable animatable = this.f27211pmvmpeiblj;
        if (animatable != null) {
            animatable.stop();
        }
        vdvldrhtss(null);
        wkgbmnqykc(drawable);
    }

    @Override // d9.dxjokdxxww
    public void nufgyqmvbu(Object obj, e9.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null || !wkgbmnqykcVar.iobyxmoadg(obj, this)) {
            vdvldrhtss(obj);
        } else {
            ojitshcjhn(obj);
        }
    }

    @Override // z8.draadjrbmk
    public void onStart() {
        Animatable animatable = this.f27211pmvmpeiblj;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // z8.draadjrbmk
    public void onStop() {
        Animatable animatable = this.f27211pmvmpeiblj;
        if (animatable != null) {
            animatable.stop();
        }
    }

    protected abstract void rgvfuqvkyq(Object obj);

    @Override // e9.wkgbmnqykc.iobyxmoadg
    public void wkgbmnqykc(Drawable drawable) {
        ((ImageView) this.f27204zdlpuopuiu).setImageDrawable(drawable);
    }
}
