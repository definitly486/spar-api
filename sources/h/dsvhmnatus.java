package h;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class dsvhmnatus {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f38878iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f38879ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f38880zoijcleaow;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f38878iobyxmoadg = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f38880zoijcleaow = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f38879ppxfxbqfkf = iArr3;
        }
    }

    public static final void agtfadlqog(Paint paint, long j13) {
        paint.setColor(bfopjjpdmp.nufgyqmvbu(j13));
    }

    public static final Paint btonecajqb() {
        return new Paint(7);
    }

    public static final void draadjrbmk(Paint paint, boolean z13) {
        paint.setAntiAlias(z13);
    }

    public static final float dxjokdxxww(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int eablkybsjg(Paint paint) {
        return !paint.isFilterBitmap() ? roivzttewh.f38955iobyxmoadg.zoijcleaow() : roivzttewh.f38955iobyxmoadg.iobyxmoadg();
    }

    public static final void gtknphoqwx(Paint paint, float f13) {
        paint.setAlpha((int) Math.rint(f13 * 255.0f));
    }

    public static final int gxszxtbevo(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i13 = strokeCap == null ? -1 : iobyxmoadg.f38880zoijcleaow[strokeCap.ordinal()];
        if (i13 == 1) {
            return g.f38891iobyxmoadg.iobyxmoadg();
        }
        if (i13 != 2) {
            return i13 != 3 ? g.f38891iobyxmoadg.iobyxmoadg() : g.f38891iobyxmoadg.ppxfxbqfkf();
        }
        return g.f38891iobyxmoadg.zoijcleaow();
    }

    public static final ipoelvxyzq iobyxmoadg() {
        return new androidx.compose.ui.graphics.zoijcleaow();
    }

    public static final void iwizpuwonk(Paint paint, int i13) {
        paint.setStyle(grlcpdaxtj.wkgbmnqykc(i13, grlcpdaxtj.f38895iobyxmoadg.zoijcleaow()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final void jyumaefscl(Paint paint, float f13) {
        paint.setStrokeWidth(f13);
    }

    public static final void kcexrzcfyt(Paint paint, int i13) {
        Paint.Cap cap;
        g.iobyxmoadg iobyxmoadgVar = g.f38891iobyxmoadg;
        if (g.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            cap = Paint.Cap.SQUARE;
        } else if (g.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = g.eablkybsjg(i13, iobyxmoadgVar.iobyxmoadg()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final int lqeggnwhkg(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i13 = strokeJoin == null ? -1 : iobyxmoadg.f38879ppxfxbqfkf[strokeJoin.ordinal()];
        if (i13 == 1) {
            return h.f38898iobyxmoadg.zoijcleaow();
        }
        if (i13 != 2) {
            return i13 != 3 ? h.f38898iobyxmoadg.zoijcleaow() : h.f38898iobyxmoadg.ppxfxbqfkf();
        }
        return h.f38898iobyxmoadg.iobyxmoadg();
    }

    public static final float nufgyqmvbu(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final void ojitshcjhn(Paint paint, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        paint.setColorFilter(wkgbmnqykcVar != null ? iozdgvuglv.zoijcleaow(wkgbmnqykcVar) : null);
    }

    public static final void oxmwwwfdhm(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final float ppxfxbqfkf(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final void rgvfuqvkyq(Paint paint, int i13) {
        paint.setFilterBitmap(!roivzttewh.wkgbmnqykc(i13, roivzttewh.f38955iobyxmoadg.zoijcleaow()));
    }

    public static final void vdvldrhtss(Paint paint, ixidwrxhsl ixidwrxhslVar) {
        stevsuqkhv stevsuqkhvVar = (stevsuqkhv) ixidwrxhslVar;
        paint.setPathEffect(stevsuqkhvVar != null ? stevsuqkhvVar.iobyxmoadg() : null);
    }

    public static final void wflxmlrfwp(Paint paint, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.f38931iobyxmoadg.iobyxmoadg(paint, i13);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.iobyxmoadg.zoijcleaow(i13)));
        }
    }

    public static final long wkgbmnqykc(Paint paint) {
        return bfopjjpdmp.zoijcleaow(paint.getColor());
    }

    public static final void yggfygwlhe(Paint paint, float f13) {
        paint.setStrokeMiter(f13);
    }

    public static final void zdlpuopuiu(Paint paint, int i13) {
        Paint.Join join;
        h.iobyxmoadg iobyxmoadgVar = h.f38898iobyxmoadg;
        if (h.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            join = Paint.Join.MITER;
        } else if (h.eablkybsjg(i13, iobyxmoadgVar.iobyxmoadg())) {
            join = Paint.Join.BEVEL;
        } else {
            join = h.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final ipoelvxyzq zoijcleaow(Paint paint) {
        return new androidx.compose.ui.graphics.zoijcleaow(paint);
    }
}
