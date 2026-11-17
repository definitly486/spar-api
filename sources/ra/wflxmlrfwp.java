package ra;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f82369dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public float f82370eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public float f82371gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public float f82372iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f82373lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List f82374nufgyqmvbu = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public float f82375ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public float f82376wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public float f82377zoijcleaow;

    public static class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float f82378ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f82379zoijcleaow;

        @Override // ra.wflxmlrfwp.gxszxtbevo
        public void iobyxmoadg(Matrix matrix, Path path) {
            Matrix matrix2 = this.f82380iobyxmoadg;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f82379zoijcleaow, this.f82378ppxfxbqfkf);
            path.transform(matrix);
        }
    }

    public static abstract class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected final Matrix f82380iobyxmoadg = new Matrix();

        public abstract void iobyxmoadg(Matrix matrix, Path path);
    }

    class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ List f82382ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ Matrix f82383wkgbmnqykc;

        iobyxmoadg(List list, Matrix matrix) {
            this.f82382ppxfxbqfkf = list;
            this.f82383wkgbmnqykc = matrix;
        }

        @Override // ra.wflxmlrfwp.lqeggnwhkg
        public void iobyxmoadg(Matrix matrix, qa.iobyxmoadg iobyxmoadgVar, int i13, Canvas canvas) {
            Iterator it = this.f82382ppxfxbqfkf.iterator();
            while (it.hasNext()) {
                ((lqeggnwhkg) it.next()).iobyxmoadg(this.f82383wkgbmnqykc, iobyxmoadgVar, i13, canvas);
            }
        }
    }

    static abstract class lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final Matrix f82384zoijcleaow = new Matrix();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Matrix f82385iobyxmoadg = new Matrix();

        lqeggnwhkg() {
        }

        public abstract void iobyxmoadg(Matrix matrix, qa.iobyxmoadg iobyxmoadgVar, int i13, Canvas canvas);

        public final void zoijcleaow(qa.iobyxmoadg iobyxmoadgVar, int i13, Canvas canvas) {
            iobyxmoadg(f82384zoijcleaow, iobyxmoadgVar, i13, canvas);
        }
    }

    static class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f82386eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final eablkybsjg f82387ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f82388wkgbmnqykc;

        public ppxfxbqfkf(eablkybsjg eablkybsjgVar, float f13, float f14) {
            this.f82387ppxfxbqfkf = eablkybsjgVar;
            this.f82388wkgbmnqykc = f13;
            this.f82386eablkybsjg = f14;
        }

        @Override // ra.wflxmlrfwp.lqeggnwhkg
        public void iobyxmoadg(Matrix matrix, qa.iobyxmoadg iobyxmoadgVar, int i13, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f82387ppxfxbqfkf.f82378ppxfxbqfkf - this.f82386eablkybsjg, this.f82387ppxfxbqfkf.f82379zoijcleaow - this.f82388wkgbmnqykc), 0.0f);
            this.f82385iobyxmoadg.set(matrix);
            this.f82385iobyxmoadg.preTranslate(this.f82388wkgbmnqykc, this.f82386eablkybsjg);
            this.f82385iobyxmoadg.preRotate(ppxfxbqfkf());
            iobyxmoadgVar.zoijcleaow(canvas, this.f82385iobyxmoadg, rectF, i13);
        }

        float ppxfxbqfkf() {
            return (float) Math.toDegrees(Math.atan((this.f82387ppxfxbqfkf.f82378ppxfxbqfkf - this.f82386eablkybsjg) / (this.f82387ppxfxbqfkf.f82379zoijcleaow - this.f82388wkgbmnqykc)));
        }
    }

    public static class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static final RectF f82389nufgyqmvbu = new RectF();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public float f82390eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public float f82391gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public float f82392lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public float f82393ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public float f82394wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public float f82395zoijcleaow;

        public wkgbmnqykc(float f13, float f14, float f15, float f16) {
            vdvldrhtss(f13);
            yggfygwlhe(f14);
            oxmwwwfdhm(f15);
            rgvfuqvkyq(f16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float agtfadlqog() {
            return this.f82392lqeggnwhkg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float btonecajqb() {
            return this.f82390eablkybsjg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float draadjrbmk() {
            return this.f82394wkgbmnqykc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float gtknphoqwx() {
            return this.f82395zoijcleaow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kcexrzcfyt(float f13) {
            this.f82391gxszxtbevo = f13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float ojitshcjhn() {
            return this.f82393ppxfxbqfkf;
        }

        private void oxmwwwfdhm(float f13) {
            this.f82394wkgbmnqykc = f13;
        }

        private void rgvfuqvkyq(float f13) {
            this.f82390eablkybsjg = f13;
        }

        private void vdvldrhtss(float f13) {
            this.f82395zoijcleaow = f13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float wflxmlrfwp() {
            return this.f82391gxszxtbevo;
        }

        private void yggfygwlhe(float f13) {
            this.f82393ppxfxbqfkf = f13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zdlpuopuiu(float f13) {
            this.f82392lqeggnwhkg = f13;
        }

        @Override // ra.wflxmlrfwp.gxszxtbevo
        public void iobyxmoadg(Matrix matrix, Path path) {
            Matrix matrix2 = this.f82380iobyxmoadg;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f82389nufgyqmvbu;
            rectF.set(gtknphoqwx(), ojitshcjhn(), draadjrbmk(), btonecajqb());
            path.arcTo(rectF, wflxmlrfwp(), agtfadlqog(), false);
            path.transform(matrix);
        }
    }

    static class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final wkgbmnqykc f82396ppxfxbqfkf;

        public zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
            this.f82396ppxfxbqfkf = wkgbmnqykcVar;
        }

        @Override // ra.wflxmlrfwp.lqeggnwhkg
        public void iobyxmoadg(Matrix matrix, qa.iobyxmoadg iobyxmoadgVar, int i13, Canvas canvas) {
            iobyxmoadgVar.iobyxmoadg(canvas, matrix, new RectF(this.f82396ppxfxbqfkf.gtknphoqwx(), this.f82396ppxfxbqfkf.ojitshcjhn(), this.f82396ppxfxbqfkf.draadjrbmk(), this.f82396ppxfxbqfkf.btonecajqb()), i13, this.f82396ppxfxbqfkf.wflxmlrfwp(), this.f82396ppxfxbqfkf.agtfadlqog());
        }
    }

    public wflxmlrfwp() {
        agtfadlqog(0.0f, 0.0f);
    }

    private void kcexrzcfyt(float f13) {
        this.f82376wkgbmnqykc = f13;
    }

    private float lqeggnwhkg() {
        return this.f82370eablkybsjg;
    }

    private float nufgyqmvbu() {
        return this.f82371gxszxtbevo;
    }

    private void oxmwwwfdhm(float f13) {
        this.f82375ppxfxbqfkf = f13;
    }

    private void ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, float f13, float f14) {
        zoijcleaow(f13);
        this.f82374nufgyqmvbu.add(lqeggnwhkgVar);
        rgvfuqvkyq(f14);
    }

    private void rgvfuqvkyq(float f13) {
        this.f82370eablkybsjg = f13;
    }

    private void vdvldrhtss(float f13) {
        this.f82371gxszxtbevo = f13;
    }

    private void yggfygwlhe(float f13) {
        this.f82377zoijcleaow = f13;
    }

    private void zdlpuopuiu(float f13) {
        this.f82372iobyxmoadg = f13;
    }

    private void zoijcleaow(float f13) {
        if (lqeggnwhkg() == f13) {
            return;
        }
        float fLqeggnwhkg = ((f13 - lqeggnwhkg()) + 360.0f) % 360.0f;
        if (fLqeggnwhkg > 180.0f) {
            return;
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(dxjokdxxww(), btonecajqb(), dxjokdxxww(), btonecajqb());
        wkgbmnqykcVar.kcexrzcfyt(lqeggnwhkg());
        wkgbmnqykcVar.zdlpuopuiu(fLqeggnwhkg);
        this.f82374nufgyqmvbu.add(new zoijcleaow(wkgbmnqykcVar));
        rgvfuqvkyq(f13);
    }

    public void agtfadlqog(float f13, float f14) {
        ojitshcjhn(f13, f14, 270.0f, 0.0f);
    }

    float btonecajqb() {
        return this.f82376wkgbmnqykc;
    }

    float draadjrbmk() {
        return this.f82377zoijcleaow;
    }

    float dxjokdxxww() {
        return this.f82375ppxfxbqfkf;
    }

    boolean eablkybsjg() {
        return this.f82369dxjokdxxww;
    }

    float gtknphoqwx() {
        return this.f82372iobyxmoadg;
    }

    lqeggnwhkg gxszxtbevo(Matrix matrix) {
        zoijcleaow(nufgyqmvbu());
        return new iobyxmoadg(new ArrayList(this.f82374nufgyqmvbu), new Matrix(matrix));
    }

    public void iobyxmoadg(float f13, float f14, float f15, float f16, float f17, float f18) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(f13, f14, f15, f16);
        wkgbmnqykcVar.kcexrzcfyt(f17);
        wkgbmnqykcVar.zdlpuopuiu(f18);
        this.f82373lqeggnwhkg.add(wkgbmnqykcVar);
        zoijcleaow zoijcleaowVar = new zoijcleaow(wkgbmnqykcVar);
        float f19 = f17 + f18;
        boolean z13 = f18 < 0.0f;
        if (z13) {
            f17 = (f17 + 180.0f) % 360.0f;
        }
        ppxfxbqfkf(zoijcleaowVar, f17, z13 ? (180.0f + f19) % 360.0f : f19);
        double d13 = f19;
        oxmwwwfdhm(((f13 + f15) * 0.5f) + (((f15 - f13) / 2.0f) * ((float) Math.cos(Math.toRadians(d13)))));
        kcexrzcfyt(((f14 + f16) * 0.5f) + (((f16 - f14) / 2.0f) * ((float) Math.sin(Math.toRadians(d13)))));
    }

    public void ojitshcjhn(float f13, float f14, float f15, float f16) {
        zdlpuopuiu(f13);
        yggfygwlhe(f14);
        oxmwwwfdhm(f13);
        kcexrzcfyt(f14);
        rgvfuqvkyq(f15);
        vdvldrhtss((f15 + f16) % 360.0f);
        this.f82373lqeggnwhkg.clear();
        this.f82374nufgyqmvbu.clear();
        this.f82369dxjokdxxww = false;
    }

    public void wflxmlrfwp(float f13, float f14) {
        eablkybsjg eablkybsjgVar = new eablkybsjg();
        eablkybsjgVar.f82379zoijcleaow = f13;
        eablkybsjgVar.f82378ppxfxbqfkf = f14;
        this.f82373lqeggnwhkg.add(eablkybsjgVar);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(eablkybsjgVar, dxjokdxxww(), btonecajqb());
        ppxfxbqfkf(ppxfxbqfkfVar, ppxfxbqfkfVar.ppxfxbqfkf() + 270.0f, ppxfxbqfkfVar.ppxfxbqfkf() + 270.0f);
        oxmwwwfdhm(f13);
        kcexrzcfyt(f14);
    }

    public void wkgbmnqykc(Matrix matrix, Path path) {
        int size = this.f82373lqeggnwhkg.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gxszxtbevo) this.f82373lqeggnwhkg.get(i13)).iobyxmoadg(matrix, path);
        }
    }
}
