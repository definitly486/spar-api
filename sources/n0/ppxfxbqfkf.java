package n0;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends i1.nufgyqmvbu.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f68325iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ntlheqmsrt f68326zoijcleaow;

        iobyxmoadg(pj.agtfadlqog agtfadlqogVar, ntlheqmsrt ntlheqmsrtVar) {
            this.f68325iobyxmoadg = agtfadlqogVar;
            this.f68326zoijcleaow = ntlheqmsrtVar;
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww */
        public void lqeggnwhkg(Typeface typeface) {
            this.f68325iobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(typeface));
        }

        @Override // i1.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu */
        public void gxszxtbevo(int i13) {
            this.f68325iobyxmoadg.hkdspvbjdz(new IllegalStateException("Unable to load font " + this.f68326zoijcleaow + " (reason=" + i13 + ')'));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface ppxfxbqfkf(ntlheqmsrt ntlheqmsrtVar, Context context) {
        Typeface typefaceDxjokdxxww = i1.nufgyqmvbu.dxjokdxxww(context, ntlheqmsrtVar.wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(typefaceDxjokdxxww);
        return typefaceDxjokdxxww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wkgbmnqykc(ntlheqmsrt ntlheqmsrtVar, Context context, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        i1.nufgyqmvbu.gtknphoqwx(context, ntlheqmsrtVar.wkgbmnqykc(), new iobyxmoadg(rgvfuqvkyqVar, ntlheqmsrtVar), null);
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }
}
