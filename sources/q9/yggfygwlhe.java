package q9;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class yggfygwlhe implements zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static volatile jyumaefscl f78313eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final aa.iobyxmoadg f78314iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w9.eablkybsjg f78315ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final x9.oxmwwwfdhm f78316wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final aa.iobyxmoadg f78317zoijcleaow;

    yggfygwlhe(aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2, w9.eablkybsjg eablkybsjgVar, x9.oxmwwwfdhm oxmwwwfdhmVar, x9.jyumaefscl jyumaefsclVar) {
        this.f78314iobyxmoadg = iobyxmoadgVar;
        this.f78317zoijcleaow = iobyxmoadgVar2;
        this.f78315ppxfxbqfkf = eablkybsjgVar;
        this.f78316wkgbmnqykc = oxmwwwfdhmVar;
        jyumaefsclVar.ppxfxbqfkf();
    }

    public static void gxszxtbevo(Context context) {
        if (f78313eablkybsjg == null) {
            synchronized (yggfygwlhe.class) {
                try {
                    if (f78313eablkybsjg == null) {
                        f78313eablkybsjg = eablkybsjg.iobyxmoadg().iobyxmoadg(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static yggfygwlhe ppxfxbqfkf() {
        jyumaefscl jyumaefsclVar = f78313eablkybsjg;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar.wkgbmnqykc();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar instanceof lqeggnwhkg ? Collections.unmodifiableSet(((lqeggnwhkg) gxszxtbevoVar).iobyxmoadg()) : Collections.singleton(o9.ppxfxbqfkf.zoijcleaow("proto"));
    }

    private dxjokdxxww zoijcleaow(ojitshcjhn ojitshcjhnVar) {
        dxjokdxxww.iobyxmoadg iobyxmoadgVarLqeggnwhkg = dxjokdxxww.iobyxmoadg().dxjokdxxww(this.f78314iobyxmoadg.wflxmlrfwp()).ojitshcjhn(this.f78317zoijcleaow.wflxmlrfwp()).agtfadlqog(ojitshcjhnVar.lqeggnwhkg()).nufgyqmvbu(new nufgyqmvbu(ojitshcjhnVar.zoijcleaow(), ojitshcjhnVar.wkgbmnqykc())).lqeggnwhkg(ojitshcjhnVar.ppxfxbqfkf().iobyxmoadg());
        if (ojitshcjhnVar.ppxfxbqfkf().eablkybsjg() != null && ojitshcjhnVar.ppxfxbqfkf().eablkybsjg().iobyxmoadg() != null) {
            iobyxmoadgVarLqeggnwhkg.draadjrbmk(ojitshcjhnVar.ppxfxbqfkf().eablkybsjg().iobyxmoadg());
        }
        ojitshcjhnVar.ppxfxbqfkf().zoijcleaow();
        return iobyxmoadgVarLqeggnwhkg.wkgbmnqykc();
    }

    public x9.oxmwwwfdhm eablkybsjg() {
        return this.f78316wkgbmnqykc;
    }

    @Override // q9.zdlpuopuiu
    public void iobyxmoadg(ojitshcjhn ojitshcjhnVar, o9.gtknphoqwx gtknphoqwxVar) {
        this.f78315ppxfxbqfkf.iobyxmoadg(ojitshcjhnVar.gxszxtbevo().gxszxtbevo(ojitshcjhnVar.ppxfxbqfkf().wkgbmnqykc()), zoijcleaow(ojitshcjhnVar), gtknphoqwxVar);
    }

    public o9.btonecajqb lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        return new vdvldrhtss(wkgbmnqykc(gxszxtbevoVar), rgvfuqvkyq.iobyxmoadg().zoijcleaow(gxszxtbevoVar.getName()).ppxfxbqfkf(gxszxtbevoVar.getExtras()).iobyxmoadg(), this);
    }
}
