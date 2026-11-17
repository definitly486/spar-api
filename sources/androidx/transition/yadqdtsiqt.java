package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f13557iobyxmoadg = true;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f13558ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Field f13559zoijcleaow;

    static class iobyxmoadg {
        static float iobyxmoadg(View view) {
            return view.getTransitionAlpha();
        }

        static void zoijcleaow(View view, float f13) {
            view.setTransitionAlpha(f13);
        }
    }

    yadqdtsiqt() {
    }

    public void eablkybsjg(View view, float f13) {
        if (f13557iobyxmoadg) {
            try {
                iobyxmoadg.zoijcleaow(view, f13);
                return;
            } catch (NoSuchMethodError unused) {
                f13557iobyxmoadg = false;
            }
        }
        view.setAlpha(f13);
    }

    public void gxszxtbevo(View view, int i13) {
        if (!f13558ppxfxbqfkf) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f13559zoijcleaow = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f13558ppxfxbqfkf = true;
        }
        Field field = f13559zoijcleaow;
        if (field != null) {
            try {
                f13559zoijcleaow.setInt(view, i13 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void iobyxmoadg(View view) {
    }

    public abstract void lqeggnwhkg(View view, Matrix matrix);

    public abstract void nufgyqmvbu(View view, Matrix matrix);

    public void ppxfxbqfkf(View view) {
    }

    public abstract void wkgbmnqykc(View view, int i13, int i14, int i15, int i16);

    public float zoijcleaow(View view) {
        if (f13557iobyxmoadg) {
            try {
                return iobyxmoadg.iobyxmoadg(view);
            } catch (NoSuchMethodError unused) {
                f13557iobyxmoadg = false;
            }
        }
        return view.getAlpha();
    }
}
