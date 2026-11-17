package e1;

import a1.ojitshcjhn;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo extends ojitshcjhn {

    static class btonecajqb extends gxszxtbevo {
        btonecajqb() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setScaleY(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class draadjrbmk extends gxszxtbevo {
        draadjrbmk() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setTranslationY(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class dxjokdxxww extends gxszxtbevo {
        dxjokdxxww() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setScaleX(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        boolean f30133draadjrbmk = false;

        eablkybsjg() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            } else {
                if (this.f30133draadjrbmk) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f30133draadjrbmk = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(gxszxtbevo(f13, j13, view, wkgbmnqykcVar)));
                    } catch (IllegalAccessException e13) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e13);
                    } catch (InvocationTargetException e14) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e14);
                    }
                }
            }
            return this.f255nufgyqmvbu;
        }
    }

    static class gtknphoqwx extends gxszxtbevo {
        gtknphoqwx() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setTranslationX(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    /* JADX INFO: renamed from: e1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    static class C0628gxszxtbevo extends gxszxtbevo {
        C0628gxszxtbevo() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setRotation(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class iobyxmoadg extends gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setAlpha(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class lqeggnwhkg extends gxszxtbevo {
        lqeggnwhkg() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setRotationX(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class nufgyqmvbu extends gxszxtbevo {
        nufgyqmvbu() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setRotationY(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class ppxfxbqfkf extends gxszxtbevo {
        ppxfxbqfkf() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setElevation(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    static class wflxmlrfwp extends gxszxtbevo {
        wflxmlrfwp() {
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            view.setTranslationZ(gxszxtbevo(f13, j13, view, wkgbmnqykcVar));
            return this.f255nufgyqmvbu;
        }
    }

    public static class wkgbmnqykc extends gxszxtbevo {
        public boolean btonecajqb(View view, a1.wkgbmnqykc wkgbmnqykcVar, float f13, long j13, double d13, double d14) {
            view.setRotation(gxszxtbevo(f13, j13, view, wkgbmnqykcVar) + ((float) Math.toDegrees(Math.atan2(d14, d13))));
            return this.f255nufgyqmvbu;
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            return this.f255nufgyqmvbu;
        }
    }

    public static class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        SparseArray f30134agtfadlqog = new SparseArray();

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        String f30135draadjrbmk;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        float[] f30136ojitshcjhn;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        SparseArray f30137wflxmlrfwp;

        public zoijcleaow(String str, SparseArray sparseArray) {
            this.f30135draadjrbmk = str.split(StringUtils.COMMA)[1];
            this.f30137wflxmlrfwp = sparseArray;
        }

        public void btonecajqb(int i13, androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar, float f13, int i14, float f14) {
            this.f30137wflxmlrfwp.append(i13, iobyxmoadgVar);
            this.f30134agtfadlqog.append(i13, new float[]{f13, f14});
            this.f258zoijcleaow = Math.max(this.f258zoijcleaow, i14);
        }

        @Override // e1.gxszxtbevo
        public boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
            this.f253iobyxmoadg.eablkybsjg(f13, this.f30136ojitshcjhn);
            float[] fArr = this.f30136ojitshcjhn;
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            long j14 = j13 - this.f250dxjokdxxww;
            if (Float.isNaN(this.f249btonecajqb)) {
                float fIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(view, this.f30135draadjrbmk, 0);
                this.f249btonecajqb = fIobyxmoadg;
                if (Float.isNaN(fIobyxmoadg)) {
                    this.f249btonecajqb = 0.0f;
                }
            }
            float f16 = (float) ((((double) this.f249btonecajqb) + ((j14 * 1.0E-9d) * ((double) f14))) % 1.0d);
            this.f249btonecajqb = f16;
            this.f250dxjokdxxww = j13;
            float fIobyxmoadg2 = iobyxmoadg(f16);
            this.f255nufgyqmvbu = false;
            int i13 = 0;
            while (true) {
                float[] fArr2 = this.f254lqeggnwhkg;
                if (i13 >= fArr2.length) {
                    break;
                }
                boolean z13 = this.f255nufgyqmvbu;
                float f17 = this.f30136ojitshcjhn[i13];
                this.f255nufgyqmvbu = z13 | (((double) f17) != 0.0d);
                fArr2[i13] = (f17 * fIobyxmoadg2) + f15;
                i13++;
            }
            e1.iobyxmoadg.zoijcleaow((androidx.constraintlayout.widget.iobyxmoadg) this.f30137wflxmlrfwp.valueAt(0), view, this.f254lqeggnwhkg);
            if (f14 != 0.0f) {
                this.f255nufgyqmvbu = true;
            }
            return this.f255nufgyqmvbu;
        }

        @Override // a1.ojitshcjhn
        public void eablkybsjg(int i13) {
            int size = this.f30137wflxmlrfwp.size();
            int iNufgyqmvbu = ((androidx.constraintlayout.widget.iobyxmoadg) this.f30137wflxmlrfwp.valueAt(0)).nufgyqmvbu();
            double[] dArr = new double[size];
            int i14 = iNufgyqmvbu + 2;
            this.f30136ojitshcjhn = new float[i14];
            this.f254lqeggnwhkg = new float[iNufgyqmvbu];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i14);
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = this.f30137wflxmlrfwp.keyAt(i15);
                androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f30137wflxmlrfwp.valueAt(i15);
                float[] fArr = (float[]) this.f30134agtfadlqog.valueAt(i15);
                dArr[i15] = ((double) iKeyAt) * 0.01d;
                iobyxmoadgVar.gxszxtbevo(this.f30136ojitshcjhn);
                int i16 = 0;
                while (true) {
                    float[] fArr2 = this.f30136ojitshcjhn;
                    if (i16 < fArr2.length) {
                        dArr2[i15][i16] = fArr2[i16];
                        i16++;
                    }
                }
                double[] dArr3 = dArr2[i15];
                dArr3[iNufgyqmvbu] = fArr[0];
                dArr3[iNufgyqmvbu + 1] = fArr[1];
            }
            this.f253iobyxmoadg = a1.zoijcleaow.iobyxmoadg(i13, dArr, dArr2);
        }

        @Override // a1.ojitshcjhn
        public void zoijcleaow(int i13, float f13, float f14, int i14, float f15) {
            throw new RuntimeException("Wrong call for custom attribute");
        }
    }

    public static gxszxtbevo lqeggnwhkg(String str, SparseArray sparseArray) {
        return new zoijcleaow(str, sparseArray);
    }

    public static gxszxtbevo nufgyqmvbu(String str, long j13) {
        gxszxtbevo lqeggnwhkgVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                lqeggnwhkgVar = new lqeggnwhkg();
                break;
            case "rotationY":
                lqeggnwhkgVar = new nufgyqmvbu();
                break;
            case "translationX":
                lqeggnwhkgVar = new gtknphoqwx();
                break;
            case "translationY":
                lqeggnwhkgVar = new draadjrbmk();
                break;
            case "translationZ":
                lqeggnwhkgVar = new wflxmlrfwp();
                break;
            case "progress":
                lqeggnwhkgVar = new eablkybsjg();
                break;
            case "scaleX":
                lqeggnwhkgVar = new dxjokdxxww();
                break;
            case "scaleY":
                lqeggnwhkgVar = new btonecajqb();
                break;
            case "rotation":
                lqeggnwhkgVar = new C0628gxszxtbevo();
                break;
            case "elevation":
                lqeggnwhkgVar = new ppxfxbqfkf();
                break;
            case "transitionPathRotate":
                lqeggnwhkgVar = new wkgbmnqykc();
                break;
            case "alpha":
                lqeggnwhkgVar = new iobyxmoadg();
                break;
            default:
                return null;
        }
        lqeggnwhkgVar.ppxfxbqfkf(j13);
        return lqeggnwhkgVar;
    }

    public abstract boolean dxjokdxxww(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar);

    public float gxszxtbevo(float f13, long j13, View view, a1.wkgbmnqykc wkgbmnqykcVar) {
        this.f253iobyxmoadg.eablkybsjg(f13, this.f254lqeggnwhkg);
        float[] fArr = this.f254lqeggnwhkg;
        float f14 = fArr[1];
        if (f14 == 0.0f) {
            this.f255nufgyqmvbu = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f249btonecajqb)) {
            float fIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(view, this.f252gxszxtbevo, 0);
            this.f249btonecajqb = fIobyxmoadg;
            if (Float.isNaN(fIobyxmoadg)) {
                this.f249btonecajqb = 0.0f;
            }
        }
        float f15 = (float) ((((double) this.f249btonecajqb) + (((j13 - this.f250dxjokdxxww) * 1.0E-9d) * ((double) f14))) % 1.0d);
        this.f249btonecajqb = f15;
        wkgbmnqykcVar.zoijcleaow(view, this.f252gxszxtbevo, 0, f15);
        this.f250dxjokdxxww = j13;
        float f16 = this.f254lqeggnwhkg[0];
        float fIobyxmoadg2 = (iobyxmoadg(this.f249btonecajqb) * f16) + this.f254lqeggnwhkg[2];
        this.f255nufgyqmvbu = (f16 == 0.0f && f14 == 0.0f) ? false : true;
        return fIobyxmoadg2;
    }
}
