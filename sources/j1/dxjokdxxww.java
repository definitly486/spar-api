package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.pmvmpeiblj;
import java.util.List;
import lereixgezr.istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final agtfadlqog f50458iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final pmvmpeiblj f50459zoijcleaow;

    public static class iobyxmoadg extends r1.gtknphoqwx.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private i1.nufgyqmvbu.gxszxtbevo f50460iobyxmoadg;

        public iobyxmoadg(i1.nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
            this.f50460iobyxmoadg = gxszxtbevoVar;
        }

        @Override // r1.gtknphoqwx.ppxfxbqfkf
        public void iobyxmoadg(int i13) {
            i1.nufgyqmvbu.gxszxtbevo gxszxtbevoVar = this.f50460iobyxmoadg;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.gxszxtbevo(i13);
            }
        }

        @Override // r1.gtknphoqwx.ppxfxbqfkf
        public void zoijcleaow(Typeface typeface) {
            i1.nufgyqmvbu.gxszxtbevo gxszxtbevoVar = this.f50460iobyxmoadg;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.lqeggnwhkg(typeface);
            }
        }
    }

    static {
        y5.iobyxmoadg.ppxfxbqfkf("TypefaceCompat static init");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            f50458iobyxmoadg = new wflxmlrfwp();
        } else if (i13 >= 28) {
            f50458iobyxmoadg = new draadjrbmk();
        } else {
            f50458iobyxmoadg = new gtknphoqwx();
        }
        f50459zoijcleaow = new pmvmpeiblj(16);
        y5.iobyxmoadg.gxszxtbevo();
    }

    public static Typeface eablkybsjg(Context context, Resources resources, int i13, String str, int i14, int i15) {
        Typeface typefaceWkgbmnqykc = f50458iobyxmoadg.wkgbmnqykc(context, resources, i13, str, i15);
        if (typefaceWkgbmnqykc != null) {
            f50459zoijcleaow.put(gxszxtbevo(resources, i13, str, i14, i15), typefaceWkgbmnqykc);
        }
        return typefaceWkgbmnqykc;
    }

    private static String gxszxtbevo(Resources resources, int i13, String str, int i14, int i15) {
        return resources.getResourcePackageName(i13) + '-' + str + '-' + i14 + '-' + i13 + '-' + i15;
    }

    public static Typeface iobyxmoadg(Context context, Typeface typeface, int i13) {
        if (context != null) {
            return Typeface.create(typeface, i13);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface lqeggnwhkg(Resources resources, int i13, String str, int i14, int i15) {
        return (Typeface) f50459zoijcleaow.get(gxszxtbevo(resources, i13, str, i14, i15));
    }

    private static Typeface nufgyqmvbu(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static Typeface ppxfxbqfkf(Context context, CancellationSignal cancellationSignal, List list, int i13) {
        y5.iobyxmoadg.ppxfxbqfkf("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f50458iobyxmoadg.ppxfxbqfkf(context, cancellationSignal, list, i13);
        } finally {
            y5.iobyxmoadg.gxszxtbevo();
        }
    }

    public static Typeface wkgbmnqykc(Context context, i1.eablkybsjg.zoijcleaow zoijcleaowVar, Resources resources, int i13, String str, int i14, int i15, i1.nufgyqmvbu.gxszxtbevo gxszxtbevoVar, Handler handler, boolean z13) {
        Typeface typefaceIobyxmoadg;
        if (zoijcleaowVar instanceof i1.eablkybsjg.C0974eablkybsjg) {
            i1.eablkybsjg.C0974eablkybsjg c0974eablkybsjg = (i1.eablkybsjg.C0974eablkybsjg) zoijcleaowVar;
            Typeface typefaceNufgyqmvbu = nufgyqmvbu(c0974eablkybsjg.wkgbmnqykc());
            if (typefaceNufgyqmvbu != null) {
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.wkgbmnqykc(typefaceNufgyqmvbu, handler);
                }
                return typefaceNufgyqmvbu;
            }
            typefaceIobyxmoadg = r1.gtknphoqwx.iobyxmoadg(context, c0974eablkybsjg.iobyxmoadg() != null ? istkbnxepw.iobyxmoadg(new Object[]{c0974eablkybsjg.ppxfxbqfkf(), c0974eablkybsjg.iobyxmoadg()}) : istkbnxepw.iobyxmoadg(new Object[]{c0974eablkybsjg.ppxfxbqfkf()}), i15, !z13 ? gxszxtbevoVar != null : c0974eablkybsjg.zoijcleaow() != 0, z13 ? c0974eablkybsjg.eablkybsjg() : -1, i1.nufgyqmvbu.gxszxtbevo.eablkybsjg(handler), new iobyxmoadg(gxszxtbevoVar));
        } else {
            typefaceIobyxmoadg = f50458iobyxmoadg.iobyxmoadg(context, (i1.eablkybsjg.ppxfxbqfkf) zoijcleaowVar, resources, i15);
            if (gxszxtbevoVar != null) {
                if (typefaceIobyxmoadg != null) {
                    gxszxtbevoVar.wkgbmnqykc(typefaceIobyxmoadg, handler);
                } else {
                    gxszxtbevoVar.ppxfxbqfkf(-3, handler);
                }
            }
        }
        if (typefaceIobyxmoadg != null) {
            f50459zoijcleaow.put(gxszxtbevo(resources, i13, str, i14, i15), typefaceIobyxmoadg);
        }
        return typefaceIobyxmoadg;
    }

    public static Typeface zoijcleaow(Context context, CancellationSignal cancellationSignal, r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13) {
        y5.iobyxmoadg.ppxfxbqfkf("TypefaceCompat.createFromFontInfo");
        try {
            return f50458iobyxmoadg.zoijcleaow(context, cancellationSignal, zoijcleaowVarArr, i13);
        } finally {
            y5.iobyxmoadg.gxszxtbevo();
        }
    }
}
