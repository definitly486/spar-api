package l7;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected w7.ppxfxbqfkf f61722eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f61727ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final List f61724iobyxmoadg = new ArrayList(1);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f61729zoijcleaow = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected float f61728wkgbmnqykc = 0.0f;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Object f61723gxszxtbevo = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f61725lqeggnwhkg = -1.0f;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f61726nufgyqmvbu = -1.0f;

    private static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f61730iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private w7.iobyxmoadg f61731ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private float f61732wkgbmnqykc = -1.0f;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private w7.iobyxmoadg f61733zoijcleaow = gxszxtbevo(0.0f);

        eablkybsjg(List list) {
            this.f61730iobyxmoadg = list;
        }

        private w7.iobyxmoadg gxszxtbevo(float f13) {
            List list = this.f61730iobyxmoadg;
            w7.iobyxmoadg iobyxmoadgVar = (w7.iobyxmoadg) list.get(list.size() - 1);
            if (f13 >= iobyxmoadgVar.gxszxtbevo()) {
                return iobyxmoadgVar;
            }
            for (int size = this.f61730iobyxmoadg.size() - 2; size >= 1; size--) {
                w7.iobyxmoadg iobyxmoadgVar2 = (w7.iobyxmoadg) this.f61730iobyxmoadg.get(size);
                if (this.f61733zoijcleaow != iobyxmoadgVar2 && iobyxmoadgVar2.iobyxmoadg(f13)) {
                    return iobyxmoadgVar2;
                }
            }
            return (w7.iobyxmoadg) this.f61730iobyxmoadg.get(0);
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float eablkybsjg() {
            List list = this.f61730iobyxmoadg;
            return ((w7.iobyxmoadg) list.get(list.size() - 1)).ppxfxbqfkf();
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean iobyxmoadg(float f13) {
            w7.iobyxmoadg iobyxmoadgVar = this.f61731ppxfxbqfkf;
            w7.iobyxmoadg iobyxmoadgVar2 = this.f61733zoijcleaow;
            if (iobyxmoadgVar == iobyxmoadgVar2 && this.f61732wkgbmnqykc == f13) {
                return true;
            }
            this.f61731ppxfxbqfkf = iobyxmoadgVar2;
            this.f61732wkgbmnqykc = f13;
            return false;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean isEmpty() {
            return false;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean ppxfxbqfkf(float f13) {
            if (this.f61733zoijcleaow.iobyxmoadg(f13)) {
                return !this.f61733zoijcleaow.dxjokdxxww();
            }
            this.f61733zoijcleaow = gxszxtbevo(f13);
            return true;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float wkgbmnqykc() {
            return ((w7.iobyxmoadg) this.f61730iobyxmoadg.get(0)).gxszxtbevo();
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public w7.iobyxmoadg zoijcleaow() {
            return this.f61733zoijcleaow;
        }
    }

    private static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final w7.iobyxmoadg f61734iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f61735zoijcleaow = -1.0f;

        gxszxtbevo(List list) {
            this.f61734iobyxmoadg = (w7.iobyxmoadg) list.get(0);
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float eablkybsjg() {
            return this.f61734iobyxmoadg.ppxfxbqfkf();
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean iobyxmoadg(float f13) {
            if (this.f61735zoijcleaow == f13) {
                return true;
            }
            this.f61735zoijcleaow = f13;
            return false;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean isEmpty() {
            return false;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean ppxfxbqfkf(float f13) {
            return !this.f61734iobyxmoadg.dxjokdxxww();
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float wkgbmnqykc() {
            return this.f61734iobyxmoadg.gxszxtbevo();
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public w7.iobyxmoadg zoijcleaow() {
            return this.f61734iobyxmoadg;
        }
    }

    private static final class ppxfxbqfkf implements wkgbmnqykc {
        private ppxfxbqfkf() {
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float eablkybsjg() {
            return 1.0f;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean iobyxmoadg(float f13) {
            throw new IllegalStateException("not implemented");
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean isEmpty() {
            return true;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public boolean ppxfxbqfkf(float f13) {
            return false;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public float wkgbmnqykc() {
            return 0.0f;
        }

        @Override // l7.iobyxmoadg.wkgbmnqykc
        public w7.iobyxmoadg zoijcleaow() {
            throw new IllegalStateException("not implemented");
        }
    }

    private interface wkgbmnqykc {
        float eablkybsjg();

        boolean iobyxmoadg(float f13);

        boolean isEmpty();

        boolean ppxfxbqfkf(float f13);

        float wkgbmnqykc();

        w7.iobyxmoadg zoijcleaow();
    }

    public interface zoijcleaow {
        void iobyxmoadg();
    }

    iobyxmoadg(List list) {
        this.f61727ppxfxbqfkf = rgvfuqvkyq(list);
    }

    private float lqeggnwhkg() {
        if (this.f61725lqeggnwhkg == -1.0f) {
            this.f61725lqeggnwhkg = this.f61727ppxfxbqfkf.wkgbmnqykc();
        }
        return this.f61725lqeggnwhkg;
    }

    private static wkgbmnqykc rgvfuqvkyq(List list) {
        if (list.isEmpty()) {
            return new ppxfxbqfkf();
        }
        return list.size() == 1 ? new gxszxtbevo(list) : new eablkybsjg(list);
    }

    public void agtfadlqog(float f13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseKeyframeAnimation#setProgress");
        if (this.f61727ppxfxbqfkf.isEmpty()) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f13 < lqeggnwhkg()) {
            f13 = lqeggnwhkg();
        } else if (f13 > ppxfxbqfkf()) {
            f13 = ppxfxbqfkf();
        }
        if (f13 == this.f61728wkgbmnqykc) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f61728wkgbmnqykc = f13;
        if (this.f61727ppxfxbqfkf.ppxfxbqfkf(f13)) {
            draadjrbmk();
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseKeyframeAnimation#setProgress");
    }

    protected Object btonecajqb(w7.iobyxmoadg iobyxmoadgVar, float f13, float f14, float f15) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void draadjrbmk() {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseKeyframeAnimation#notifyListeners");
        for (int i13 = 0; i13 < this.f61724iobyxmoadg.size(); i13++) {
            ((zoijcleaow) this.f61724iobyxmoadg.get(i13)).iobyxmoadg();
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseKeyframeAnimation#notifyListeners");
    }

    abstract Object dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13);

    float eablkybsjg() {
        if (this.f61729zoijcleaow) {
            return 0.0f;
        }
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow();
        if (iobyxmoadgVarZoijcleaow.dxjokdxxww()) {
            return 0.0f;
        }
        return (this.f61728wkgbmnqykc - iobyxmoadgVarZoijcleaow.gxszxtbevo()) / (iobyxmoadgVarZoijcleaow.ppxfxbqfkf() - iobyxmoadgVarZoijcleaow.gxszxtbevo());
    }

    public boolean gtknphoqwx() {
        return this.f61722eablkybsjg != null;
    }

    public float gxszxtbevo() {
        return this.f61728wkgbmnqykc;
    }

    public void iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f61724iobyxmoadg.add(zoijcleaowVar);
    }

    public Object nufgyqmvbu() {
        float fEablkybsjg = eablkybsjg();
        if (this.f61722eablkybsjg == null && this.f61727ppxfxbqfkf.iobyxmoadg(fEablkybsjg)) {
            return this.f61723gxszxtbevo;
        }
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow();
        Interpolator interpolator = iobyxmoadgVarZoijcleaow.f118909eablkybsjg;
        Object objDxjokdxxww = (interpolator == null || iobyxmoadgVarZoijcleaow.f118911gxszxtbevo == null) ? dxjokdxxww(iobyxmoadgVarZoijcleaow, wkgbmnqykc()) : btonecajqb(iobyxmoadgVarZoijcleaow, fEablkybsjg, interpolator.getInterpolation(fEablkybsjg), iobyxmoadgVarZoijcleaow.f118911gxszxtbevo.getInterpolation(fEablkybsjg));
        this.f61723gxszxtbevo = objDxjokdxxww;
        return objDxjokdxxww;
    }

    public void ojitshcjhn(w7.ppxfxbqfkf ppxfxbqfkfVar) {
        w7.ppxfxbqfkf ppxfxbqfkfVar2 = this.f61722eablkybsjg;
        if (ppxfxbqfkfVar2 != null) {
            ppxfxbqfkfVar2.ppxfxbqfkf(null);
        }
        this.f61722eablkybsjg = ppxfxbqfkfVar;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.ppxfxbqfkf(this);
        }
    }

    float ppxfxbqfkf() {
        if (this.f61726nufgyqmvbu == -1.0f) {
            this.f61726nufgyqmvbu = this.f61727ppxfxbqfkf.eablkybsjg();
        }
        return this.f61726nufgyqmvbu;
    }

    public void wflxmlrfwp() {
        this.f61729zoijcleaow = true;
    }

    protected float wkgbmnqykc() {
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow();
        if (iobyxmoadgVarZoijcleaow == null || iobyxmoadgVarZoijcleaow.dxjokdxxww()) {
            return 0.0f;
        }
        return iobyxmoadgVarZoijcleaow.f118919wkgbmnqykc.getInterpolation(eablkybsjg());
    }

    protected w7.iobyxmoadg zoijcleaow() {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseKeyframeAnimation#getCurrentKeyframe");
        w7.iobyxmoadg iobyxmoadgVarZoijcleaow = this.f61727ppxfxbqfkf.zoijcleaow();
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseKeyframeAnimation#getCurrentKeyframe");
        return iobyxmoadgVarZoijcleaow;
    }
}
