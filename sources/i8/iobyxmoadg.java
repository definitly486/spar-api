package i8;

import android.graphics.drawable.Drawable;
import g.gtknphoqwx;
import h.iozdgvuglv;
import h.metgxyhuhe;
import h.yadqdtsiqt;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import w0.kcexrzcfyt;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends l.ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Drawable f42116lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f42117nufgyqmvbu;

    /* JADX INFO: renamed from: i8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0992iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42118iobyxmoadg;

        static {
            int[] iArr = new int[zdlpuopuiu.values().length];
            try {
                iArr[zdlpuopuiu.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zdlpuopuiu.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42118iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(Drawable drawable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(drawable, "drawable");
        this.f42116lqeggnwhkg = drawable;
        if (draadjrbmk(drawable)) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.f42117nufgyqmvbu = gtknphoqwx(drawable);
    }

    private final boolean draadjrbmk(Drawable drawable) {
        return drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0;
    }

    private final long gtknphoqwx(Drawable drawable) {
        return draadjrbmk(drawable) ? kcexrzcfyt.wkgbmnqykc(kcexrzcfyt.iobyxmoadg(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())) : gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
    }

    @Override // l.ppxfxbqfkf
    protected void btonecajqb(j.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        metgxyhuhe metgxyhuheVarGxszxtbevo = gxszxtbevoVar.K().gxszxtbevo();
        this.f42116lqeggnwhkg.setBounds(0, 0, vg.iobyxmoadg.wkgbmnqykc(gtknphoqwx.gtknphoqwx(gxszxtbevoVar.zoijcleaow())), vg.iobyxmoadg.wkgbmnqykc(gtknphoqwx.dxjokdxxww(gxszxtbevoVar.zoijcleaow())));
        try {
            metgxyhuheVarGxszxtbevo.jyumaefscl();
            this.f42116lqeggnwhkg.draw(yadqdtsiqt.wkgbmnqykc(metgxyhuheVarGxszxtbevo));
        } finally {
            metgxyhuheVarGxszxtbevo.agtfadlqog();
        }
    }

    @Override // l.ppxfxbqfkf
    protected boolean iobyxmoadg(float f13) {
        this.f42116lqeggnwhkg.setAlpha(zg.gtknphoqwx.agtfadlqog(vg.iobyxmoadg.wkgbmnqykc(f13 * KotlinVersion.MAX_COMPONENT_VALUE), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        return true;
    }

    @Override // l.ppxfxbqfkf
    public long nufgyqmvbu() {
        return this.f42117nufgyqmvbu;
    }

    @Override // l.ppxfxbqfkf
    protected boolean ppxfxbqfkf(zdlpuopuiu layoutDirection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutDirection, "layoutDirection");
        Drawable drawable = this.f42116lqeggnwhkg;
        int i13 = C0992iobyxmoadg.f42118iobyxmoadg[layoutDirection.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i14 = 0;
        } else if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i14);
    }

    @Override // l.ppxfxbqfkf
    protected boolean zoijcleaow(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f42116lqeggnwhkg.setColorFilter(wkgbmnqykcVar != null ? iozdgvuglv.zoijcleaow(wkgbmnqykcVar) : null);
        return true;
    }
}
