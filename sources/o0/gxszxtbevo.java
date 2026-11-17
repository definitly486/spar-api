package o0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import gg.kcexrzcfyt;
import pj.agtfadlqog;
import pj.rgvfuqvkyq;
import r1.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements n0.iobyxmoadg.InterfaceC1469iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f71489iobyxmoadg = new gxszxtbevo();

    public static final class iobyxmoadg extends gtknphoqwx.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f71490iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ n0.iobyxmoadg f71491zoijcleaow;

        iobyxmoadg(agtfadlqog agtfadlqogVar, n0.iobyxmoadg iobyxmoadgVar) {
            this.f71490iobyxmoadg = agtfadlqogVar;
            this.f71491zoijcleaow = iobyxmoadgVar;
        }

        @Override // r1.gtknphoqwx.ppxfxbqfkf
        public void iobyxmoadg(int i13) {
            this.f71490iobyxmoadg.hkdspvbjdz(new IllegalStateException("Failed to load " + this.f71491zoijcleaow + " (reason=" + i13 + ", " + eablkybsjg.wkgbmnqykc(i13) + ')'));
        }

        @Override // r1.gtknphoqwx.ppxfxbqfkf
        public void zoijcleaow(Typeface typeface) {
            this.f71490iobyxmoadg.resumeWith(kcexrzcfyt.wkgbmnqykc(typeface));
        }
    }

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler wkgbmnqykc() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return nufgyqmvbu.f71493iobyxmoadg.iobyxmoadg(looperMyLooper);
    }

    public final Object eablkybsjg(Context context, n0.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(iobyxmoadgVar instanceof wkgbmnqykc)) {
            throw new IllegalArgumentException(("Only GoogleFontImpl supported (actual " + iobyxmoadgVar + ')').toString());
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar;
        r1.eablkybsjg eablkybsjgVarGxszxtbevo = wkgbmnqykcVar.gxszxtbevo();
        int iNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu();
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        zoijcleaowVar.iobyxmoadg(context, eablkybsjgVarGxszxtbevo, iNufgyqmvbu, f71489iobyxmoadg.wkgbmnqykc(), new iobyxmoadg(rgvfuqvkyqVar, iobyxmoadgVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    @Override // n0.iobyxmoadg.InterfaceC1469iobyxmoadg
    public Typeface iobyxmoadg(Context context, n0.iobyxmoadg iobyxmoadgVar) {
        throw new IllegalStateException(("GoogleFont only support async loading: " + iobyxmoadgVar).toString());
    }

    @Override // n0.iobyxmoadg.InterfaceC1469iobyxmoadg
    public Object zoijcleaow(Context context, n0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(context, iobyxmoadgVar, o0.iobyxmoadg.f71492iobyxmoadg, gxszxtbevoVar);
    }
}
