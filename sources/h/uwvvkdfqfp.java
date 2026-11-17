package h;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final uwvvkdfqfp f38971iobyxmoadg = new uwvvkdfqfp();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static Method f38972ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static boolean f38973wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Method f38974zoijcleaow;

    private uwvvkdfqfp() {
    }

    public final void iobyxmoadg(Canvas canvas, boolean z13) {
        Method method;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            sflfametgt.f38959iobyxmoadg.iobyxmoadg(canvas, z13);
            return;
        }
        if (!f38973wkgbmnqykc) {
            try {
                if (i13 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f38974zoijcleaow = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f38972ppxfxbqfkf = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f38974zoijcleaow = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f38972ppxfxbqfkf = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f38974zoijcleaow;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f38972ppxfxbqfkf;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f38973wkgbmnqykc = true;
        }
        if (z13) {
            try {
                Method method4 = f38974zoijcleaow;
                if (method4 != null) {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z13 || (method = f38972ppxfxbqfkf) == null) {
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(method);
        method.invoke(canvas, null);
    }
}
