package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f3435iobyxmoadg = {R.attr.state_checked};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f3437zoijcleaow = new int[0];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Rect f3436ppxfxbqfkf = new Rect();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final Field f3438eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final Field f3439gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final boolean f3440iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Field f3441ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Field f3442wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final Method f3443zoijcleaow;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z13;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z13 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z13 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z13 = false;
                        if (z13) {
                            f3443zoijcleaow = method;
                            f3441ppxfxbqfkf = field;
                            f3442wkgbmnqykc = field2;
                            f3438eablkybsjg = field3;
                            f3439gxszxtbevo = field4;
                            f3440iobyxmoadg = true;
                            return;
                        }
                        f3443zoijcleaow = null;
                        f3441ppxfxbqfkf = null;
                        f3442wkgbmnqykc = null;
                        f3438eablkybsjg = null;
                        f3439gxszxtbevo = null;
                        f3440iobyxmoadg = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z13 = false;
                        if (z13) {
                            f3443zoijcleaow = method;
                            f3441ppxfxbqfkf = field;
                            f3442wkgbmnqykc = field2;
                            f3438eablkybsjg = field3;
                            f3439gxszxtbevo = field4;
                            f3440iobyxmoadg = true;
                            return;
                        }
                        f3443zoijcleaow = null;
                        f3441ppxfxbqfkf = null;
                        f3442wkgbmnqykc = null;
                        f3438eablkybsjg = null;
                        f3439gxszxtbevo = null;
                        f3440iobyxmoadg = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z13 = false;
                        if (z13) {
                            f3443zoijcleaow = method;
                            f3441ppxfxbqfkf = field;
                            f3442wkgbmnqykc = field2;
                            f3438eablkybsjg = field3;
                            f3439gxszxtbevo = field4;
                            f3440iobyxmoadg = true;
                            return;
                        }
                        f3443zoijcleaow = null;
                        f3441ppxfxbqfkf = null;
                        f3442wkgbmnqykc = null;
                        f3438eablkybsjg = null;
                        f3439gxszxtbevo = null;
                        f3440iobyxmoadg = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z13 = false;
                    if (z13) {
                        f3443zoijcleaow = method;
                        f3441ppxfxbqfkf = field;
                        f3442wkgbmnqykc = field2;
                        f3438eablkybsjg = field3;
                        f3439gxszxtbevo = field4;
                        f3440iobyxmoadg = true;
                        return;
                    }
                    f3443zoijcleaow = null;
                    f3441ppxfxbqfkf = null;
                    f3442wkgbmnqykc = null;
                    f3438eablkybsjg = null;
                    f3439gxszxtbevo = null;
                    f3440iobyxmoadg = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z13 = false;
                    if (z13) {
                        f3443zoijcleaow = method;
                        f3441ppxfxbqfkf = field;
                        f3442wkgbmnqykc = field2;
                        f3438eablkybsjg = field3;
                        f3439gxszxtbevo = field4;
                        f3440iobyxmoadg = true;
                        return;
                    }
                    f3443zoijcleaow = null;
                    f3441ppxfxbqfkf = null;
                    f3442wkgbmnqykc = null;
                    f3438eablkybsjg = null;
                    f3439gxszxtbevo = null;
                    f3440iobyxmoadg = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z13 = false;
                    if (z13) {
                        f3443zoijcleaow = method;
                        f3441ppxfxbqfkf = field;
                        f3442wkgbmnqykc = field2;
                        f3438eablkybsjg = field3;
                        f3439gxszxtbevo = field4;
                        f3440iobyxmoadg = true;
                        return;
                    }
                    f3443zoijcleaow = null;
                    f3441ppxfxbqfkf = null;
                    f3442wkgbmnqykc = null;
                    f3438eablkybsjg = null;
                    f3439gxszxtbevo = null;
                    f3440iobyxmoadg = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z13) {
                f3443zoijcleaow = method;
                f3441ppxfxbqfkf = field;
                f3442wkgbmnqykc = field2;
                f3438eablkybsjg = field3;
                f3439gxszxtbevo = field4;
                f3440iobyxmoadg = true;
                return;
            }
            f3443zoijcleaow = null;
            f3441ppxfxbqfkf = null;
            f3442wkgbmnqykc = null;
            f3438eablkybsjg = null;
            f3439gxszxtbevo = null;
            f3440iobyxmoadg = false;
        }

        static Rect iobyxmoadg(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f3440iobyxmoadg) {
                try {
                    Object objInvoke = f3443zoijcleaow.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f3441ppxfxbqfkf.getInt(objInvoke), f3442wkgbmnqykc.getInt(objInvoke), f3438eablkybsjg.getInt(objInvoke), f3439gxszxtbevo.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return yadqdtsiqt.f3436ppxfxbqfkf;
        }
    }

    static class zoijcleaow {
        static Insets iobyxmoadg(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static PorterDuff.Mode eablkybsjg(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean iobyxmoadg(Drawable drawable) {
        return true;
    }

    private static void ppxfxbqfkf(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3435iobyxmoadg);
        } else {
            drawable.setState(f3437zoijcleaow);
        }
        drawable.setState(state);
    }

    public static Rect wkgbmnqykc(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return iobyxmoadg.iobyxmoadg(k1.iobyxmoadg.vdvldrhtss(drawable));
        }
        Insets insetsIobyxmoadg = zoijcleaow.iobyxmoadg(drawable);
        return new Rect(insetsIobyxmoadg.left, insetsIobyxmoadg.top, insetsIobyxmoadg.right, insetsIobyxmoadg.bottom);
    }

    static void zoijcleaow(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 29 || i13 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        ppxfxbqfkf(drawable);
    }
}
