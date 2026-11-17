package h2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow implements h2.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final h2.ppxfxbqfkf f39131eablkybsjg;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final kcexrzcfyt f39125wflxmlrfwp = new lqeggnwhkg("translationX");

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final kcexrzcfyt f39114agtfadlqog = new nufgyqmvbu("translationY");

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final kcexrzcfyt f39121ojitshcjhn = new dxjokdxxww("translationZ");

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final kcexrzcfyt f39123rgvfuqvkyq = new btonecajqb("scaleX");

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final kcexrzcfyt f39124vdvldrhtss = new gtknphoqwx("scaleY");

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final kcexrzcfyt f39122oxmwwwfdhm = new draadjrbmk("rotation");

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final kcexrzcfyt f39119kcexrzcfyt = new wflxmlrfwp("rotationX");

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final kcexrzcfyt f39127zdlpuopuiu = new agtfadlqog("rotationY");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final kcexrzcfyt f39126yggfygwlhe = new ojitshcjhn("x");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final kcexrzcfyt f39118jyumaefscl = new iobyxmoadg("y");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final kcexrzcfyt f39117iwizpuwonk = new C0900zoijcleaow("z");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final kcexrzcfyt f39115cqumvgiudr = new ppxfxbqfkf("alpha");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final kcexrzcfyt f39116esjtqupxsv = new wkgbmnqykc("scrollX");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final kcexrzcfyt f39120lereixgezr = new eablkybsjg("scrollY");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    float f39134iobyxmoadg = 0.0f;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    float f39139zoijcleaow = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    boolean f39137ppxfxbqfkf = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    boolean f39133gxszxtbevo = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    float f39135lqeggnwhkg = Float.MAX_VALUE;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    float f39136nufgyqmvbu = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f39130dxjokdxxww = 0;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ArrayList f39132gtknphoqwx = new ArrayList();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ArrayList f39129draadjrbmk = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Object f39138wkgbmnqykc = null;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f39128btonecajqb = 1.0f;

    static class agtfadlqog extends kcexrzcfyt {
        agtfadlqog(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getRotationY();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setRotationY(f13);
        }
    }

    static class btonecajqb extends kcexrzcfyt {
        btonecajqb(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getScaleX();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setScaleX(f13);
        }
    }

    static class draadjrbmk extends kcexrzcfyt {
        draadjrbmk(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getRotation();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setRotation(f13);
        }
    }

    static class dxjokdxxww extends kcexrzcfyt {
        dxjokdxxww(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return jhduphickx.pkzmftpjix(view);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            jhduphickx.ipoelvxyzq(view, f13);
        }
    }

    static class eablkybsjg extends kcexrzcfyt {
        eablkybsjg(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getScrollY();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setScrollY((int) f13);
        }
    }

    static class gtknphoqwx extends kcexrzcfyt {
        gtknphoqwx(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getScaleY();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setScaleY(f13);
        }
    }

    class gxszxtbevo extends h2.ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ h2.wkgbmnqykc f39141zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, h2.wkgbmnqykc wkgbmnqykcVar) {
            super(str);
            this.f39141zoijcleaow = wkgbmnqykcVar;
        }

        @Override // h2.ppxfxbqfkf
        public float iobyxmoadg(Object obj) {
            return this.f39141zoijcleaow.iobyxmoadg();
        }

        @Override // h2.ppxfxbqfkf
        public void zoijcleaow(Object obj, float f13) {
            this.f39141zoijcleaow.zoijcleaow(f13);
        }
    }

    static class iobyxmoadg extends kcexrzcfyt {
        iobyxmoadg(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getY();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setY(f13);
        }
    }

    public static abstract class kcexrzcfyt extends h2.ppxfxbqfkf {
        /* synthetic */ kcexrzcfyt(String str, lqeggnwhkg lqeggnwhkgVar) {
            this(str);
        }

        private kcexrzcfyt(String str) {
            super(str);
        }
    }

    static class lqeggnwhkg extends kcexrzcfyt {
        lqeggnwhkg(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getTranslationX();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setTranslationX(f13);
        }
    }

    static class nufgyqmvbu extends kcexrzcfyt {
        nufgyqmvbu(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getTranslationY();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setTranslationY(f13);
        }
    }

    static class ojitshcjhn extends kcexrzcfyt {
        ojitshcjhn(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getX();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setX(f13);
        }
    }

    public interface oxmwwwfdhm {
        void wflxmlrfwp(zoijcleaow zoijcleaowVar, float f13, float f14);
    }

    static class ppxfxbqfkf extends kcexrzcfyt {
        ppxfxbqfkf(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getAlpha();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setAlpha(f13);
        }
    }

    static class rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f39142iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f39143zoijcleaow;

        rgvfuqvkyq() {
        }
    }

    public interface vdvldrhtss {
        void iobyxmoadg(zoijcleaow zoijcleaowVar, boolean z13, float f13, float f14);
    }

    static class wflxmlrfwp extends kcexrzcfyt {
        wflxmlrfwp(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getRotationX();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setRotationX(f13);
        }
    }

    static class wkgbmnqykc extends kcexrzcfyt {
        wkgbmnqykc(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return view.getScrollX();
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            view.setScrollX((int) f13);
        }
    }

    /* JADX INFO: renamed from: h2.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static class C0900zoijcleaow extends kcexrzcfyt {
        C0900zoijcleaow(String str) {
            super(str, null);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public float iobyxmoadg(View view) {
            return jhduphickx.hkdspvbjdz(view);
        }

        @Override // h2.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(View view, float f13) {
            jhduphickx.mhtqkkgtqm(view, f13);
        }
    }

    zoijcleaow(h2.wkgbmnqykc wkgbmnqykcVar) {
        this.f39131eablkybsjg = new gxszxtbevo("FloatValueHolder", wkgbmnqykcVar);
    }

    private float eablkybsjg() {
        return this.f39131eablkybsjg.iobyxmoadg(this.f39138wkgbmnqykc);
    }

    private static void nufgyqmvbu(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void vdvldrhtss() {
        if (this.f39133gxszxtbevo) {
            return;
        }
        this.f39133gxszxtbevo = true;
        if (!this.f39137ppxfxbqfkf) {
            this.f39139zoijcleaow = eablkybsjg();
        }
        float f13 = this.f39139zoijcleaow;
        if (f13 > this.f39135lqeggnwhkg || f13 < this.f39136nufgyqmvbu) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        h2.iobyxmoadg.wkgbmnqykc().iobyxmoadg(this, 0L);
    }

    private void wkgbmnqykc(boolean z13) {
        this.f39133gxszxtbevo = false;
        h2.iobyxmoadg.wkgbmnqykc().lqeggnwhkg(this);
        this.f39130dxjokdxxww = 0L;
        this.f39137ppxfxbqfkf = false;
        for (int i13 = 0; i13 < this.f39132gtknphoqwx.size(); i13++) {
            if (this.f39132gtknphoqwx.get(i13) != null) {
                ((vdvldrhtss) this.f39132gtknphoqwx.get(i13)).iobyxmoadg(this, z13, this.f39139zoijcleaow, this.f39134iobyxmoadg);
            }
        }
        nufgyqmvbu(this.f39132gtknphoqwx);
    }

    public zoijcleaow agtfadlqog(float f13) {
        this.f39134iobyxmoadg = f13;
        return this;
    }

    public zoijcleaow btonecajqb(float f13) {
        this.f39136nufgyqmvbu = f13;
        return this;
    }

    void draadjrbmk(float f13) {
        this.f39131eablkybsjg.zoijcleaow(this.f39138wkgbmnqykc, f13);
        for (int i13 = 0; i13 < this.f39129draadjrbmk.size(); i13++) {
            if (this.f39129draadjrbmk.get(i13) != null) {
                ((oxmwwwfdhm) this.f39129draadjrbmk.get(i13)).wflxmlrfwp(this, this.f39139zoijcleaow, this.f39134iobyxmoadg);
            }
        }
        nufgyqmvbu(this.f39129draadjrbmk);
    }

    public zoijcleaow dxjokdxxww(float f13) {
        this.f39135lqeggnwhkg = f13;
        return this;
    }

    public zoijcleaow gtknphoqwx(float f13) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f39128btonecajqb = f13;
        ojitshcjhn(f13 * 0.75f);
        return this;
    }

    float gxszxtbevo() {
        return this.f39128btonecajqb * 0.75f;
    }

    @Override // h2.iobyxmoadg.zoijcleaow
    public boolean iobyxmoadg(long j13) {
        long j14 = this.f39130dxjokdxxww;
        if (j14 == 0) {
            this.f39130dxjokdxxww = j13;
            draadjrbmk(this.f39139zoijcleaow);
            return false;
        }
        this.f39130dxjokdxxww = j13;
        boolean zOxmwwwfdhm = oxmwwwfdhm(j13 - j14);
        float fMin = Math.min(this.f39139zoijcleaow, this.f39135lqeggnwhkg);
        this.f39139zoijcleaow = fMin;
        float fMax = Math.max(fMin, this.f39136nufgyqmvbu);
        this.f39139zoijcleaow = fMax;
        draadjrbmk(fMax);
        if (zOxmwwwfdhm) {
            wkgbmnqykc(false);
        }
        return zOxmwwwfdhm;
    }

    public boolean lqeggnwhkg() {
        return this.f39133gxszxtbevo;
    }

    abstract void ojitshcjhn(float f13);

    abstract boolean oxmwwwfdhm(long j13);

    public zoijcleaow ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        if (lqeggnwhkg()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f39129draadjrbmk.contains(oxmwwwfdhmVar)) {
            this.f39129draadjrbmk.add(oxmwwwfdhmVar);
        }
        return this;
    }

    public void rgvfuqvkyq() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f39133gxszxtbevo) {
            return;
        }
        vdvldrhtss();
    }

    public zoijcleaow wflxmlrfwp(float f13) {
        this.f39139zoijcleaow = f13;
        this.f39137ppxfxbqfkf = true;
        return this;
    }

    public zoijcleaow zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        if (!this.f39132gtknphoqwx.contains(vdvldrhtssVar)) {
            this.f39132gtknphoqwx.add(vdvldrhtssVar);
        }
        return this;
    }
}
