package ra;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp[] f82279iobyxmoadg = new wflxmlrfwp[4];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Matrix[] f82284zoijcleaow = new Matrix[4];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Matrix[] f82282ppxfxbqfkf = new Matrix[4];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final PointF f82283wkgbmnqykc = new PointF();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Path f82276eablkybsjg = new Path();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Path f82278gxszxtbevo = new Path();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wflxmlrfwp f82280lqeggnwhkg = new wflxmlrfwp();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float[] f82281nufgyqmvbu = new float[2];

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float[] f82275dxjokdxxww = new float[2];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Path f82273btonecajqb = new Path();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final Path f82277gtknphoqwx = new Path();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f82274draadjrbmk = true;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final draadjrbmk f82285iobyxmoadg = new draadjrbmk();
    }

    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final float f82286eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final gtknphoqwx f82287iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final RectF f82288ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final zoijcleaow f82289wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Path f82290zoijcleaow;

        ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, float f13, RectF rectF, zoijcleaow zoijcleaowVar, Path path) {
            this.f82289wkgbmnqykc = zoijcleaowVar;
            this.f82287iobyxmoadg = gtknphoqwxVar;
            this.f82286eablkybsjg = f13;
            this.f82288ppxfxbqfkf = rectF;
            this.f82290zoijcleaow = path;
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, Matrix matrix, int i13);

        void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, Matrix matrix, int i13);
    }

    public draadjrbmk() {
        for (int i13 = 0; i13 < 4; i13++) {
            this.f82279iobyxmoadg[i13] = new wflxmlrfwp();
            this.f82284zoijcleaow[i13] = new Matrix();
            this.f82282ppxfxbqfkf[i13] = new Matrix();
        }
    }

    private void agtfadlqog(int i13) {
        this.f82281nufgyqmvbu[0] = this.f82279iobyxmoadg[i13].dxjokdxxww();
        this.f82281nufgyqmvbu[1] = this.f82279iobyxmoadg[i13].btonecajqb();
        this.f82284zoijcleaow[i13].mapPoints(this.f82281nufgyqmvbu);
        float fIobyxmoadg = iobyxmoadg(i13);
        this.f82282ppxfxbqfkf[i13].reset();
        Matrix matrix = this.f82282ppxfxbqfkf[i13];
        float[] fArr = this.f82281nufgyqmvbu;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f82282ppxfxbqfkf[i13].preRotate(fIobyxmoadg);
    }

    private gxszxtbevo btonecajqb(int i13, gtknphoqwx gtknphoqwxVar) {
        if (i13 == 1) {
            return gtknphoqwxVar.nufgyqmvbu();
        }
        if (i13 != 2) {
            return i13 != 3 ? gtknphoqwxVar.ojitshcjhn() : gtknphoqwxVar.rgvfuqvkyq();
        }
        return gtknphoqwxVar.agtfadlqog();
    }

    private boolean draadjrbmk(Path path, int i13) {
        this.f82277gtknphoqwx.reset();
        this.f82279iobyxmoadg[i13].wkgbmnqykc(this.f82284zoijcleaow[i13], this.f82277gtknphoqwx);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f82277gtknphoqwx.computeBounds(rectF, true);
        path.op(this.f82277gtknphoqwx, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private float dxjokdxxww(RectF rectF, int i13) {
        float[] fArr = this.f82281nufgyqmvbu;
        wflxmlrfwp wflxmlrfwpVar = this.f82279iobyxmoadg[i13];
        fArr[0] = wflxmlrfwpVar.f82375ppxfxbqfkf;
        fArr[1] = wflxmlrfwpVar.f82376wkgbmnqykc;
        this.f82284zoijcleaow[i13].mapPoints(fArr);
        return (i13 == 1 || i13 == 3) ? Math.abs(rectF.centerX() - this.f82281nufgyqmvbu[0]) : Math.abs(rectF.centerY() - this.f82281nufgyqmvbu[1]);
    }

    public static draadjrbmk gtknphoqwx() {
        return iobyxmoadg.f82285iobyxmoadg;
    }

    private void gxszxtbevo(int i13, RectF rectF, PointF pointF) {
        if (i13 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i13 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i13 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private float iobyxmoadg(int i13) {
        return ((i13 + 1) % 4) * 90;
    }

    private ra.ppxfxbqfkf lqeggnwhkg(int i13, gtknphoqwx gtknphoqwxVar) {
        if (i13 == 1) {
            return gtknphoqwxVar.draadjrbmk();
        }
        if (i13 != 2) {
            return i13 != 3 ? gtknphoqwxVar.zdlpuopuiu() : gtknphoqwxVar.oxmwwwfdhm();
        }
        return gtknphoqwxVar.btonecajqb();
    }

    private wkgbmnqykc nufgyqmvbu(int i13, gtknphoqwx gtknphoqwxVar) {
        if (i13 == 1) {
            return gtknphoqwxVar.gtknphoqwx();
        }
        if (i13 != 2) {
            return i13 != 3 ? gtknphoqwxVar.kcexrzcfyt() : gtknphoqwxVar.vdvldrhtss();
        }
        return gtknphoqwxVar.dxjokdxxww();
    }

    private void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        int i14 = (i13 + 1) % 4;
        this.f82281nufgyqmvbu[0] = this.f82279iobyxmoadg[i13].dxjokdxxww();
        this.f82281nufgyqmvbu[1] = this.f82279iobyxmoadg[i13].btonecajqb();
        this.f82284zoijcleaow[i13].mapPoints(this.f82281nufgyqmvbu);
        this.f82275dxjokdxxww[0] = this.f82279iobyxmoadg[i14].gtknphoqwx();
        this.f82275dxjokdxxww[1] = this.f82279iobyxmoadg[i14].draadjrbmk();
        this.f82284zoijcleaow[i14].mapPoints(this.f82275dxjokdxxww);
        float[] fArr = this.f82281nufgyqmvbu;
        float f13 = fArr[0];
        float[] fArr2 = this.f82275dxjokdxxww;
        float fMax = Math.max(((float) Math.hypot(f13 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fDxjokdxxww = dxjokdxxww(ppxfxbqfkfVar.f82288ppxfxbqfkf, i13);
        this.f82280lqeggnwhkg.agtfadlqog(0.0f, 0.0f);
        gxszxtbevo gxszxtbevoVarBtonecajqb = btonecajqb(i13, ppxfxbqfkfVar.f82287iobyxmoadg);
        gxszxtbevoVarBtonecajqb.zoijcleaow(fMax, fDxjokdxxww, ppxfxbqfkfVar.f82286eablkybsjg, this.f82280lqeggnwhkg);
        this.f82273btonecajqb.reset();
        this.f82280lqeggnwhkg.wkgbmnqykc(this.f82282ppxfxbqfkf[i13], this.f82273btonecajqb);
        if (this.f82274draadjrbmk && (gxszxtbevoVarBtonecajqb.iobyxmoadg() || draadjrbmk(this.f82273btonecajqb, i13) || draadjrbmk(this.f82273btonecajqb, i14))) {
            Path path = this.f82273btonecajqb;
            path.op(path, this.f82278gxszxtbevo, Path.Op.DIFFERENCE);
            this.f82281nufgyqmvbu[0] = this.f82280lqeggnwhkg.gtknphoqwx();
            this.f82281nufgyqmvbu[1] = this.f82280lqeggnwhkg.draadjrbmk();
            this.f82282ppxfxbqfkf[i13].mapPoints(this.f82281nufgyqmvbu);
            Path path2 = this.f82276eablkybsjg;
            float[] fArr3 = this.f82281nufgyqmvbu;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f82280lqeggnwhkg.wkgbmnqykc(this.f82282ppxfxbqfkf[i13], this.f82276eablkybsjg);
        } else {
            this.f82280lqeggnwhkg.wkgbmnqykc(this.f82282ppxfxbqfkf[i13], ppxfxbqfkfVar.f82290zoijcleaow);
        }
        zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f82289wkgbmnqykc;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.zoijcleaow(this.f82280lqeggnwhkg, this.f82282ppxfxbqfkf[i13], i13);
        }
    }

    private void wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        nufgyqmvbu(i13, ppxfxbqfkfVar.f82287iobyxmoadg).zoijcleaow(this.f82279iobyxmoadg[i13], 90.0f, ppxfxbqfkfVar.f82286eablkybsjg, ppxfxbqfkfVar.f82288ppxfxbqfkf, lqeggnwhkg(i13, ppxfxbqfkfVar.f82287iobyxmoadg));
        float fIobyxmoadg = iobyxmoadg(i13);
        this.f82284zoijcleaow[i13].reset();
        gxszxtbevo(i13, ppxfxbqfkfVar.f82288ppxfxbqfkf, this.f82283wkgbmnqykc);
        Matrix matrix = this.f82284zoijcleaow[i13];
        PointF pointF = this.f82283wkgbmnqykc;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f82284zoijcleaow[i13].preRotate(fIobyxmoadg);
    }

    private void zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        this.f82281nufgyqmvbu[0] = this.f82279iobyxmoadg[i13].gtknphoqwx();
        this.f82281nufgyqmvbu[1] = this.f82279iobyxmoadg[i13].draadjrbmk();
        this.f82284zoijcleaow[i13].mapPoints(this.f82281nufgyqmvbu);
        if (i13 == 0) {
            Path path = ppxfxbqfkfVar.f82290zoijcleaow;
            float[] fArr = this.f82281nufgyqmvbu;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = ppxfxbqfkfVar.f82290zoijcleaow;
            float[] fArr2 = this.f82281nufgyqmvbu;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f82279iobyxmoadg[i13].wkgbmnqykc(this.f82284zoijcleaow[i13], ppxfxbqfkfVar.f82290zoijcleaow);
        zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f82289wkgbmnqykc;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this.f82279iobyxmoadg[i13], this.f82284zoijcleaow[i13], i13);
        }
    }

    public void eablkybsjg(gtknphoqwx gtknphoqwxVar, float f13, RectF rectF, zoijcleaow zoijcleaowVar, Path path) {
        path.rewind();
        this.f82276eablkybsjg.rewind();
        this.f82278gxszxtbevo.rewind();
        this.f82278gxszxtbevo.addRect(rectF, Path.Direction.CW);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(gtknphoqwxVar, f13, rectF, zoijcleaowVar, path);
        for (int i13 = 0; i13 < 4; i13++) {
            wflxmlrfwp(ppxfxbqfkfVar, i13);
            agtfadlqog(i13);
        }
        for (int i14 = 0; i14 < 4; i14++) {
            zoijcleaow(ppxfxbqfkfVar, i14);
            ppxfxbqfkf(ppxfxbqfkfVar, i14);
        }
        path.close();
        this.f82276eablkybsjg.close();
        if (this.f82276eablkybsjg.isEmpty()) {
            return;
        }
        path.op(this.f82276eablkybsjg, Path.Op.UNION);
    }

    public void wkgbmnqykc(gtknphoqwx gtknphoqwxVar, float f13, RectF rectF, Path path) {
        eablkybsjg(gtknphoqwxVar, f13, rectF, null, path);
    }
}
