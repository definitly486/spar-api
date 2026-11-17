package n0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class crxdokpmqz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final crxdokpmqz f68244iobyxmoadg = new crxdokpmqz();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static ThreadLocal f68245zoijcleaow = new ThreadLocal();

    private crxdokpmqz() {
    }

    public final Typeface iobyxmoadg(Typeface typeface, cdpycssgdh cdpycssgdhVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (cdpycssgdhVar.iobyxmoadg().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f68245zoijcleaow.get();
        if (paint == null) {
            paint = new Paint();
            f68245zoijcleaow.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(cllcsxoeiz.wkgbmnqykc(cdpycssgdhVar, context));
        return paint.getTypeface();
    }
}
