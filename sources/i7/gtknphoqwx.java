package i7;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import lk.cdpycssgdh;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Bitmap.Config[] f42058iobyxmoadg = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Bitmap.Config f42060zoijcleaow = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final lk.yggfygwlhe f42059ppxfxbqfkf = new lk.yggfygwlhe.iobyxmoadg().gxszxtbevo();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42061iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f42062ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f42063zoijcleaow;

        static {
            int[] iArr = new int[x6.wkgbmnqykc.values().length];
            try {
                iArr[x6.wkgbmnqykc.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x6.wkgbmnqykc.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x6.wkgbmnqykc.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x6.wkgbmnqykc.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42061iobyxmoadg = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f42063zoijcleaow = iArr2;
            int[] iArr3 = new int[f7.nufgyqmvbu.values().length];
            try {
                iArr3[f7.nufgyqmvbu.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f7.nufgyqmvbu.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f42062ppxfxbqfkf = iArr3;
        }
    }

    public static final f7.nufgyqmvbu agtfadlqog(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i13 = scaleType == null ? -1 : iobyxmoadg.f42063zoijcleaow[scaleType.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? f7.nufgyqmvbu.FIT : f7.nufgyqmvbu.FILL;
    }

    public static final String btonecajqb(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(mj.kcexrzcfyt.d(mj.kcexrzcfyt.f(mj.kcexrzcfyt.n(mj.kcexrzcfyt.n(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    public static final lk.yggfygwlhe cqumvgiudr(lk.yggfygwlhe yggfygwlheVar) {
        return yggfygwlheVar == null ? f42059ppxfxbqfkf : yggfygwlheVar;
    }

    public static final e7.yggfygwlhe draadjrbmk(View view) {
        Object tag = view.getTag(w6.iobyxmoadg.coil_request_manager);
        e7.yggfygwlhe yggfygwlheVar = tag instanceof e7.yggfygwlhe ? (e7.yggfygwlhe) tag : null;
        if (yggfygwlheVar == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(w6.iobyxmoadg.coil_request_manager);
                    e7.yggfygwlhe yggfygwlheVar2 = tag2 instanceof e7.yggfygwlhe ? (e7.yggfygwlhe) tag2 : null;
                    if (yggfygwlheVar2 != null) {
                        yggfygwlheVar = yggfygwlheVar2;
                    } else {
                        yggfygwlheVar = new e7.yggfygwlhe(view);
                        view.addOnAttachStateChangeListener(yggfygwlheVar);
                        view.setTag(w6.iobyxmoadg.coil_request_manager, yggfygwlheVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return yggfygwlheVar;
    }

    public static final int dxjokdxxww(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final double eablkybsjg(Context context) {
        try {
            Object systemService = androidx.core.content.iobyxmoadg.getSystemService(context, ActivityManager.class);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final yadqdtsiqt esjtqupxsv(cdpycssgdh cdpycssgdhVar) {
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc();
        if (yadqdtsiqtVarWkgbmnqykc != null) {
            return yadqdtsiqtVarWkgbmnqykc;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int gtknphoqwx(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final Bitmap.Config gxszxtbevo() {
        return f42060zoijcleaow;
    }

    public static final void iobyxmoadg(y6.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        try {
            zoijcleaowVar.zoijcleaow();
        } catch (Exception unused) {
        }
    }

    public static final e7.oxmwwwfdhm iwizpuwonk(e7.oxmwwwfdhm oxmwwwfdhmVar) {
        return oxmwwwfdhmVar == null ? e7.oxmwwwfdhm.f30742ppxfxbqfkf : oxmwwwfdhmVar;
    }

    public static final e7.wflxmlrfwp jyumaefscl(e7.wflxmlrfwp wflxmlrfwpVar) {
        return wflxmlrfwpVar == null ? e7.wflxmlrfwp.f30767jyumaefscl : wflxmlrfwpVar;
    }

    public static final boolean kcexrzcfyt(int i13) {
        return i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE;
    }

    public static final int lereixgezr(String str, int i13) {
        Long lKcexrzcfyt = mj.kcexrzcfyt.kcexrzcfyt(str);
        if (lKcexrzcfyt == null) {
            return i13;
        }
        long jLongValue = lKcexrzcfyt.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final v6.zoijcleaow lqeggnwhkg(a7.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar instanceof a7.ppxfxbqfkf ? ((a7.ppxfxbqfkf) iobyxmoadgVar).eablkybsjg() : v6.zoijcleaow.f116178zoijcleaow;
    }

    public static final String nufgyqmvbu(Uri uri) {
        return (String) hg.jyumaefscl.weqkydbzbr(uri.getPathSegments());
    }

    public static final Bitmap.Config[] ojitshcjhn() {
        return f42058iobyxmoadg;
    }

    public static final boolean oxmwwwfdhm() {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final int pmvmpeiblj(f7.ppxfxbqfkf ppxfxbqfkfVar, f7.nufgyqmvbu nufgyqmvbuVar) {
        if (ppxfxbqfkfVar instanceof f7.ppxfxbqfkf.iobyxmoadg) {
            return ((f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).f33044iobyxmoadg;
        }
        int i13 = iobyxmoadg.f42062ppxfxbqfkf[nufgyqmvbuVar.ordinal()];
        if (i13 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i13 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int ppxfxbqfkf(Context context, double d13) {
        int largeMemoryClass;
        try {
            Object systemService = androidx.core.content.iobyxmoadg.getSystemService(context, ActivityManager.class);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        double d14 = d13 * ((double) largeMemoryClass);
        double d15 = UserVerificationMethods.USER_VERIFY_ALL;
        return (int) (d14 * d15 * d15);
    }

    public static final int rgvfuqvkyq(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean vdvldrhtss(Uri uri) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uri.getScheme(), "file") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(uri), "android_asset");
    }

    public static final File wflxmlrfwp(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final void wkgbmnqykc(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e13) {
            throw e13;
        } catch (Exception unused) {
        }
    }

    public static final boolean yggfygwlhe(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.gxszxtbevo);
    }

    public static final boolean zdlpuopuiu(a7.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return (iobyxmoadgVar instanceof a7.ppxfxbqfkf) && ((a7.ppxfxbqfkf) iobyxmoadgVar).gxszxtbevo();
    }

    public static final lk.yggfygwlhe.iobyxmoadg zoijcleaow(lk.yggfygwlhe.iobyxmoadg iobyxmoadgVar, String str) {
        int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(str, ':', 0, false, 6, null);
        if (iYfnezrywwk == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iYfnezrywwk);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = mj.kcexrzcfyt.p(strSubstring).toString();
        String strSubstring2 = str.substring(iYfnezrywwk + 1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String).substring(startIndex)");
        iobyxmoadgVar.eablkybsjg(string, strSubstring2);
        return iobyxmoadgVar;
    }
}
