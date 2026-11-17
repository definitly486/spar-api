package e1;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf extends a1.eablkybsjg {

    static class btonecajqb extends ppxfxbqfkf {
        btonecajqb() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setScaleY(iobyxmoadg(f13));
        }
    }

    static class draadjrbmk extends ppxfxbqfkf {
        draadjrbmk() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setTranslationY(iobyxmoadg(f13));
        }
    }

    static class dxjokdxxww extends ppxfxbqfkf {
        dxjokdxxww() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setScaleX(iobyxmoadg(f13));
        }
    }

    static class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        boolean f30139nufgyqmvbu = false;

        eablkybsjg() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(iobyxmoadg(f13));
                return;
            }
            if (this.f30139nufgyqmvbu) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f30139nufgyqmvbu = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(iobyxmoadg(f13)));
                } catch (IllegalAccessException e13) {
                    Log.e("ViewOscillator", "unable to setProgress", e13);
                } catch (InvocationTargetException e14) {
                    Log.e("ViewOscillator", "unable to setProgress", e14);
                }
            }
        }
    }

    static class gtknphoqwx extends ppxfxbqfkf {
        gtknphoqwx() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setTranslationX(iobyxmoadg(f13));
        }
    }

    static class gxszxtbevo extends ppxfxbqfkf {
        gxszxtbevo() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setRotation(iobyxmoadg(f13));
        }
    }

    static class iobyxmoadg extends ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setAlpha(iobyxmoadg(f13));
        }
    }

    static class lqeggnwhkg extends ppxfxbqfkf {
        lqeggnwhkg() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setRotationX(iobyxmoadg(f13));
        }
    }

    static class nufgyqmvbu extends ppxfxbqfkf {
        nufgyqmvbu() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setRotationY(iobyxmoadg(f13));
        }
    }

    /* JADX INFO: renamed from: e1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static class C0630ppxfxbqfkf extends ppxfxbqfkf {
        C0630ppxfxbqfkf() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setElevation(iobyxmoadg(f13));
        }
    }

    static class wflxmlrfwp extends ppxfxbqfkf {
        wflxmlrfwp() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            view.setTranslationZ(iobyxmoadg(f13));
        }
    }

    public static class wkgbmnqykc extends ppxfxbqfkf {
        public void btonecajqb(View view, float f13, double d13, double d14) {
            view.setRotation(iobyxmoadg(f13) + ((float) Math.toDegrees(Math.atan2(d14, d13))));
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
        }
    }

    static class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        protected androidx.constraintlayout.widget.iobyxmoadg f30140dxjokdxxww;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        float[] f30141nufgyqmvbu = new float[1];

        zoijcleaow() {
        }

        @Override // e1.ppxfxbqfkf
        public void dxjokdxxww(View view, float f13) {
            this.f30141nufgyqmvbu[0] = iobyxmoadg(f13);
            e1.iobyxmoadg.zoijcleaow(this.f30140dxjokdxxww, view, this.f30141nufgyqmvbu);
        }

        @Override // a1.eablkybsjg
        protected void zoijcleaow(Object obj) {
            this.f30140dxjokdxxww = (androidx.constraintlayout.widget.iobyxmoadg) obj;
        }
    }

    public static ppxfxbqfkf nufgyqmvbu(String str) {
        if (str.startsWith("CUSTOM")) {
            return new zoijcleaow();
        }
        switch (str) {
            case "rotationX":
                return new lqeggnwhkg();
            case "rotationY":
                return new nufgyqmvbu();
            case "translationX":
                return new gtknphoqwx();
            case "translationY":
                return new draadjrbmk();
            case "translationZ":
                return new wflxmlrfwp();
            case "progress":
                return new eablkybsjg();
            case "scaleX":
                return new dxjokdxxww();
            case "scaleY":
                return new btonecajqb();
            case "waveVariesBy":
                return new iobyxmoadg();
            case "rotation":
                return new gxszxtbevo();
            case "elevation":
                return new C0630ppxfxbqfkf();
            case "transitionPathRotate":
                return new wkgbmnqykc();
            case "alpha":
                return new iobyxmoadg();
            case "waveOffset":
                return new iobyxmoadg();
            default:
                return null;
        }
    }

    public abstract void dxjokdxxww(View view, float f13);
}
