package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ConcurrentHashMap f50451iobyxmoadg = new ConcurrentHashMap();

    class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // j1.agtfadlqog.zoijcleaow
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public int zoijcleaow(r1.gtknphoqwx.zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.eablkybsjg();
        }

        @Override // j1.agtfadlqog.zoijcleaow
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(r1.gtknphoqwx.zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.gxszxtbevo();
        }
    }

    private interface zoijcleaow {
        boolean iobyxmoadg(Object obj);

        int zoijcleaow(Object obj);
    }

    agtfadlqog() {
    }

    private static Object eablkybsjg(Object[] objArr, int i13, zoijcleaow zoijcleaowVar) {
        return gxszxtbevo(objArr, (i13 & 1) == 0 ? OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST : 700, (i13 & 2) != 0, zoijcleaowVar);
    }

    private static Object gxszxtbevo(Object[] objArr, int i13, boolean z13, zoijcleaow zoijcleaowVar) {
        Object obj = null;
        int i14 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(zoijcleaowVar.zoijcleaow(obj2) - i13) * 2) + (zoijcleaowVar.iobyxmoadg(obj2) == z13 ? 0 : 1);
            if (obj == null || i14 > iAbs) {
                obj = obj2;
                i14 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface iobyxmoadg(Context context, i1.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, Resources resources, int i13);

    protected r1.gtknphoqwx.zoijcleaow lqeggnwhkg(r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13) {
        return (r1.gtknphoqwx.zoijcleaow) eablkybsjg(zoijcleaowVarArr, i13, new iobyxmoadg());
    }

    public Typeface ppxfxbqfkf(Context context, CancellationSignal cancellationSignal, List list, int i13) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface wkgbmnqykc(Context context, Resources resources, int i13, String str, int i14) {
        File fileWkgbmnqykc = ojitshcjhn.wkgbmnqykc(context);
        if (fileWkgbmnqykc == null) {
            return null;
        }
        try {
            if (ojitshcjhn.zoijcleaow(fileWkgbmnqykc, resources, i13)) {
                return Typeface.createFromFile(fileWkgbmnqykc.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileWkgbmnqykc.delete();
        }
    }

    public abstract Typeface zoijcleaow(Context context, CancellationSignal cancellationSignal, r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13);
}
