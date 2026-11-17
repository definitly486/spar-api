package e1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc extends a1.btonecajqb {

    static class agtfadlqog extends wkgbmnqykc {
        agtfadlqog() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setTranslationY(iobyxmoadg(f13));
        }
    }

    static class btonecajqb extends wkgbmnqykc {
        btonecajqb() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setRotationY(iobyxmoadg(f13));
        }
    }

    static class draadjrbmk extends wkgbmnqykc {
        draadjrbmk() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setScaleY(iobyxmoadg(f13));
        }
    }

    static class dxjokdxxww extends wkgbmnqykc {
        dxjokdxxww() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setRotationX(iobyxmoadg(f13));
        }
    }

    static class eablkybsjg extends wkgbmnqykc {
        eablkybsjg() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setPivotX(iobyxmoadg(f13));
        }
    }

    static class gtknphoqwx extends wkgbmnqykc {
        gtknphoqwx() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setScaleX(iobyxmoadg(f13));
        }
    }

    static class gxszxtbevo extends wkgbmnqykc {
        gxszxtbevo() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setPivotY(iobyxmoadg(f13));
        }
    }

    static class iobyxmoadg extends wkgbmnqykc {
        iobyxmoadg() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setAlpha(iobyxmoadg(f13));
        }
    }

    static class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f30142gxszxtbevo = false;

        lqeggnwhkg() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(iobyxmoadg(f13));
                return;
            }
            if (this.f30142gxszxtbevo) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f30142gxszxtbevo = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(iobyxmoadg(f13)));
                } catch (IllegalAccessException e13) {
                    Log.e("ViewSpline", "unable to setProgress", e13);
                } catch (InvocationTargetException e14) {
                    Log.e("ViewSpline", "unable to setProgress", e14);
                }
            }
        }
    }

    static class nufgyqmvbu extends wkgbmnqykc {
        nufgyqmvbu() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setRotation(iobyxmoadg(f13));
        }
    }

    static class ojitshcjhn extends wkgbmnqykc {
        ojitshcjhn() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setTranslationZ(iobyxmoadg(f13));
        }
    }

    static class ppxfxbqfkf extends wkgbmnqykc {
        ppxfxbqfkf() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setElevation(iobyxmoadg(f13));
        }
    }

    static class wflxmlrfwp extends wkgbmnqykc {
        wflxmlrfwp() {
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            view.setTranslationX(iobyxmoadg(f13));
        }
    }

    /* JADX INFO: renamed from: e1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static class C0631wkgbmnqykc extends wkgbmnqykc {
        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
        }

        public void nufgyqmvbu(View view, float f13, double d13, double d14) {
            view.setRotation(iobyxmoadg(f13) + ((float) Math.toDegrees(Math.atan2(d14, d13))));
        }
    }

    public static class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        String f30143gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        SparseArray f30144lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        float[] f30145nufgyqmvbu;

        public zoijcleaow(String str, SparseArray sparseArray) {
            this.f30143gxszxtbevo = str.split(StringUtils.COMMA)[1];
            this.f30144lqeggnwhkg = sparseArray;
        }

        @Override // e1.wkgbmnqykc
        public void lqeggnwhkg(View view, float f13) {
            this.f161iobyxmoadg.eablkybsjg(f13, this.f30145nufgyqmvbu);
            e1.iobyxmoadg.zoijcleaow((androidx.constraintlayout.widget.iobyxmoadg) this.f30144lqeggnwhkg.valueAt(0), view, this.f30145nufgyqmvbu);
        }

        public void nufgyqmvbu(int i13, androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar) {
            this.f30144lqeggnwhkg.append(i13, iobyxmoadgVar);
        }

        @Override // a1.btonecajqb
        public void wkgbmnqykc(int i13) {
            int size = this.f30144lqeggnwhkg.size();
            int iNufgyqmvbu = ((androidx.constraintlayout.widget.iobyxmoadg) this.f30144lqeggnwhkg.valueAt(0)).nufgyqmvbu();
            double[] dArr = new double[size];
            this.f30145nufgyqmvbu = new float[iNufgyqmvbu];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNufgyqmvbu);
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f30144lqeggnwhkg.keyAt(i14);
                androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f30144lqeggnwhkg.valueAt(i14);
                dArr[i14] = ((double) iKeyAt) * 0.01d;
                iobyxmoadgVar.gxszxtbevo(this.f30145nufgyqmvbu);
                int i15 = 0;
                while (true) {
                    float[] fArr = this.f30145nufgyqmvbu;
                    if (i15 < fArr.length) {
                        dArr2[i14][i15] = fArr[i15];
                        i15++;
                    }
                }
            }
            this.f161iobyxmoadg = a1.zoijcleaow.iobyxmoadg(i13, dArr, dArr2);
        }

        @Override // a1.btonecajqb
        public void zoijcleaow(int i13, float f13) {
            throw new RuntimeException("call of custom attribute setPoint");
        }
    }

    public static wkgbmnqykc eablkybsjg(String str, SparseArray sparseArray) {
        return new zoijcleaow(str, sparseArray);
    }

    public static wkgbmnqykc gxszxtbevo(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new dxjokdxxww();
            case "rotationY":
                return new btonecajqb();
            case "translationX":
                return new wflxmlrfwp();
            case "translationY":
                return new agtfadlqog();
            case "translationZ":
                return new ojitshcjhn();
            case "progress":
                return new lqeggnwhkg();
            case "scaleX":
                return new gtknphoqwx();
            case "scaleY":
                return new draadjrbmk();
            case "waveVariesBy":
                return new iobyxmoadg();
            case "transformPivotX":
                return new eablkybsjg();
            case "transformPivotY":
                return new gxszxtbevo();
            case "rotation":
                return new nufgyqmvbu();
            case "elevation":
                return new ppxfxbqfkf();
            case "transitionPathRotate":
                return new C0631wkgbmnqykc();
            case "alpha":
                return new iobyxmoadg();
            case "waveOffset":
                return new iobyxmoadg();
            default:
                return null;
        }
    }

    public abstract void lqeggnwhkg(View view, float f13);
}
