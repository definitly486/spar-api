package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
abstract class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final yadqdtsiqt f13593iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final Property f13594ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final Property f13595zoijcleaow;

    class iobyxmoadg extends Property {
        iobyxmoadg(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(zynmafqrjb.zoijcleaow(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f13) {
            zynmafqrjb.eablkybsjg(view, f13.floatValue());
        }
    }

    class zoijcleaow extends Property {
        zoijcleaow(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f13593iobyxmoadg = new hkdspvbjdz();
        } else {
            f13593iobyxmoadg = new jpowsppfya();
        }
        f13595zoijcleaow = new iobyxmoadg(Float.class, "translationAlpha");
        f13594ppxfxbqfkf = new zoijcleaow(Rect.class, "clipBounds");
    }

    static void eablkybsjg(View view, float f13) {
        f13593iobyxmoadg.eablkybsjg(view, f13);
    }

    static void gxszxtbevo(View view, int i13) {
        f13593iobyxmoadg.gxszxtbevo(view, i13);
    }

    static void iobyxmoadg(View view) {
        f13593iobyxmoadg.iobyxmoadg(view);
    }

    static void lqeggnwhkg(View view, Matrix matrix) {
        f13593iobyxmoadg.lqeggnwhkg(view, matrix);
    }

    static void nufgyqmvbu(View view, Matrix matrix) {
        f13593iobyxmoadg.nufgyqmvbu(view, matrix);
    }

    static void ppxfxbqfkf(View view) {
        f13593iobyxmoadg.ppxfxbqfkf(view);
    }

    static void wkgbmnqykc(View view, int i13, int i14, int i15, int i16) {
        f13593iobyxmoadg.wkgbmnqykc(view, i13, i14, i15, i16);
    }

    static float zoijcleaow(View view) {
        return f13593iobyxmoadg.zoijcleaow(view);
    }
}
