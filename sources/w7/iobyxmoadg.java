package w7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f118905agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f118906btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f118907draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f118908dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Interpolator f118909eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f118910gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Interpolator f118911gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f118912iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final float f118913lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public Float f118914nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public PointF f118915ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public Object f118916ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public PointF f118917rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f118918wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Interpolator f118919wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Object f118920zoijcleaow;

    public iobyxmoadg(btonecajqb btonecajqbVar, Object obj, Object obj2, Interpolator interpolator, float f13, Float f14) {
        this.f118908dxjokdxxww = -3987645.8f;
        this.f118906btonecajqb = -3987645.8f;
        this.f118910gtknphoqwx = 784923401;
        this.f118907draadjrbmk = 784923401;
        this.f118918wflxmlrfwp = Float.MIN_VALUE;
        this.f118905agtfadlqog = Float.MIN_VALUE;
        this.f118915ojitshcjhn = null;
        this.f118917rgvfuqvkyq = null;
        this.f118912iobyxmoadg = btonecajqbVar;
        this.f118920zoijcleaow = obj;
        this.f118916ppxfxbqfkf = obj2;
        this.f118919wkgbmnqykc = interpolator;
        this.f118909eablkybsjg = null;
        this.f118911gxszxtbevo = null;
        this.f118913lqeggnwhkg = f13;
        this.f118914nufgyqmvbu = f14;
    }

    public boolean dxjokdxxww() {
        return this.f118919wkgbmnqykc == null && this.f118909eablkybsjg == null && this.f118911gxszxtbevo == null;
    }

    public int eablkybsjg() {
        if (this.f118907draadjrbmk == 784923401) {
            this.f118907draadjrbmk = ((Integer) this.f118916ppxfxbqfkf).intValue();
        }
        return this.f118907draadjrbmk;
    }

    public float gxszxtbevo() {
        btonecajqb btonecajqbVar = this.f118912iobyxmoadg;
        if (btonecajqbVar == null) {
            return 0.0f;
        }
        if (this.f118918wflxmlrfwp == Float.MIN_VALUE) {
            this.f118918wflxmlrfwp = (this.f118913lqeggnwhkg - btonecajqbVar.rgvfuqvkyq()) / this.f118912iobyxmoadg.eablkybsjg();
        }
        return this.f118918wflxmlrfwp;
    }

    public boolean iobyxmoadg(float f13) {
        return f13 >= gxszxtbevo() && f13 < ppxfxbqfkf();
    }

    public float lqeggnwhkg() {
        if (this.f118908dxjokdxxww == -3987645.8f) {
            this.f118908dxjokdxxww = ((Float) this.f118920zoijcleaow).floatValue();
        }
        return this.f118908dxjokdxxww;
    }

    public int nufgyqmvbu() {
        if (this.f118910gtknphoqwx == 784923401) {
            this.f118910gtknphoqwx = ((Integer) this.f118920zoijcleaow).intValue();
        }
        return this.f118910gtknphoqwx;
    }

    public float ppxfxbqfkf() {
        if (this.f118912iobyxmoadg == null) {
            return 1.0f;
        }
        if (this.f118905agtfadlqog == Float.MIN_VALUE) {
            if (this.f118914nufgyqmvbu == null) {
                this.f118905agtfadlqog = 1.0f;
            } else {
                this.f118905agtfadlqog = gxszxtbevo() + ((this.f118914nufgyqmvbu.floatValue() - this.f118913lqeggnwhkg) / this.f118912iobyxmoadg.eablkybsjg());
            }
        }
        return this.f118905agtfadlqog;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f118920zoijcleaow + ", endValue=" + this.f118916ppxfxbqfkf + ", startFrame=" + this.f118913lqeggnwhkg + ", endFrame=" + this.f118914nufgyqmvbu + ", interpolator=" + this.f118919wkgbmnqykc + '}';
    }

    public float wkgbmnqykc() {
        if (this.f118906btonecajqb == -3987645.8f) {
            this.f118906btonecajqb = ((Float) this.f118916ppxfxbqfkf).floatValue();
        }
        return this.f118906btonecajqb;
    }

    public iobyxmoadg zoijcleaow(Object obj, Object obj2) {
        return new iobyxmoadg(obj, obj2);
    }

    public iobyxmoadg(btonecajqb btonecajqbVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f13, Float f14) {
        this.f118908dxjokdxxww = -3987645.8f;
        this.f118906btonecajqb = -3987645.8f;
        this.f118910gtknphoqwx = 784923401;
        this.f118907draadjrbmk = 784923401;
        this.f118918wflxmlrfwp = Float.MIN_VALUE;
        this.f118905agtfadlqog = Float.MIN_VALUE;
        this.f118915ojitshcjhn = null;
        this.f118917rgvfuqvkyq = null;
        this.f118912iobyxmoadg = btonecajqbVar;
        this.f118920zoijcleaow = obj;
        this.f118916ppxfxbqfkf = obj2;
        this.f118919wkgbmnqykc = null;
        this.f118909eablkybsjg = interpolator;
        this.f118911gxszxtbevo = interpolator2;
        this.f118913lqeggnwhkg = f13;
        this.f118914nufgyqmvbu = f14;
    }

    protected iobyxmoadg(btonecajqb btonecajqbVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f13, Float f14) {
        this.f118908dxjokdxxww = -3987645.8f;
        this.f118906btonecajqb = -3987645.8f;
        this.f118910gtknphoqwx = 784923401;
        this.f118907draadjrbmk = 784923401;
        this.f118918wflxmlrfwp = Float.MIN_VALUE;
        this.f118905agtfadlqog = Float.MIN_VALUE;
        this.f118915ojitshcjhn = null;
        this.f118917rgvfuqvkyq = null;
        this.f118912iobyxmoadg = btonecajqbVar;
        this.f118920zoijcleaow = obj;
        this.f118916ppxfxbqfkf = obj2;
        this.f118919wkgbmnqykc = interpolator;
        this.f118909eablkybsjg = interpolator2;
        this.f118911gxszxtbevo = interpolator3;
        this.f118913lqeggnwhkg = f13;
        this.f118914nufgyqmvbu = f14;
    }

    public iobyxmoadg(Object obj) {
        this.f118908dxjokdxxww = -3987645.8f;
        this.f118906btonecajqb = -3987645.8f;
        this.f118910gtknphoqwx = 784923401;
        this.f118907draadjrbmk = 784923401;
        this.f118918wflxmlrfwp = Float.MIN_VALUE;
        this.f118905agtfadlqog = Float.MIN_VALUE;
        this.f118915ojitshcjhn = null;
        this.f118917rgvfuqvkyq = null;
        this.f118912iobyxmoadg = null;
        this.f118920zoijcleaow = obj;
        this.f118916ppxfxbqfkf = obj;
        this.f118919wkgbmnqykc = null;
        this.f118909eablkybsjg = null;
        this.f118911gxszxtbevo = null;
        this.f118913lqeggnwhkg = Float.MIN_VALUE;
        this.f118914nufgyqmvbu = Float.valueOf(Float.MAX_VALUE);
    }

    private iobyxmoadg(Object obj, Object obj2) {
        this.f118908dxjokdxxww = -3987645.8f;
        this.f118906btonecajqb = -3987645.8f;
        this.f118910gtknphoqwx = 784923401;
        this.f118907draadjrbmk = 784923401;
        this.f118918wflxmlrfwp = Float.MIN_VALUE;
        this.f118905agtfadlqog = Float.MIN_VALUE;
        this.f118915ojitshcjhn = null;
        this.f118917rgvfuqvkyq = null;
        this.f118912iobyxmoadg = null;
        this.f118920zoijcleaow = obj;
        this.f118916ppxfxbqfkf = obj2;
        this.f118919wkgbmnqykc = null;
        this.f118909eablkybsjg = null;
        this.f118911gxszxtbevo = null;
        this.f118913lqeggnwhkg = Float.MIN_VALUE;
        this.f118914nufgyqmvbu = Float.valueOf(Float.MAX_VALUE);
    }
}
