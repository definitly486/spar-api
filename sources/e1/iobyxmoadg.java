package e1;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: e1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static /* synthetic */ class C0629iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f30138iobyxmoadg;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.values().length];
            f30138iobyxmoadg = iArr;
            try {
                iArr[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30138iobyxmoadg[androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int iobyxmoadg(int i13) {
        int i14 = (i13 & (~(i13 >> 31))) - 255;
        return (i14 & (i14 >> 31)) + KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static void zoijcleaow(androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + iobyxmoadgVar.ppxfxbqfkf();
        try {
            boolean z13 = true;
            switch (C0629iobyxmoadg.f30138iobyxmoadg[iobyxmoadgVar.wkgbmnqykc().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iIobyxmoadg = (iobyxmoadg((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (iobyxmoadg((int) (fArr[3] * 255.0f)) << 24) | (iobyxmoadg((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | iobyxmoadg((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iIobyxmoadg);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((iobyxmoadg((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (iobyxmoadg((int) (fArr[3] * 255.0f)) << 24) | (iobyxmoadg((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | iobyxmoadg((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + iobyxmoadgVar.ppxfxbqfkf());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z13 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z13));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e13) {
            Log.e("CustomSupport", "Cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(view) + "\"", e13);
        } catch (NoSuchMethodException e14) {
            Log.e("CustomSupport", "No method " + str + " on View \"" + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(view) + "\"", e14);
        } catch (InvocationTargetException e15) {
            Log.e("CustomSupport", "Cannot invoke method " + str + " on View \"" + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(view) + "\"", e15);
        }
    }
}
