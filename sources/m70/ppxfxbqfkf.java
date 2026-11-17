package m70;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.oxmwwwfdhm;
import gg.lqeggnwhkg;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Arrays;
import n70.zdlpuopuiu;
import sj.kegysxyocb;
import sj.zynmafqrjb;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements rs.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f66443iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f66444ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final of0.zoijcleaow f66445zoijcleaow;

    public ppxfxbqfkf(zdlpuopuiu debugPanelModulesFactory, of0.zoijcleaow mainActivityFeatureApi) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugPanelModulesFactory, "debugPanelModulesFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mainActivityFeatureApi, "mainActivityFeatureApi");
        this.f66443iobyxmoadg = debugPanelModulesFactory;
        this.f66445zoijcleaow = mainActivityFeatureApi;
        this.f66444ppxfxbqfkf = kegysxyocb.iobyxmoadg(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar, oxmwwwfdhm fragmentActivity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentActivity, "fragmentActivity");
        return ppxfxbqfkfVar.f66445zoijcleaow.zoijcleaow(fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVar = ppxfxbqfkfVar.f66444ppxfxbqfkf;
        do {
            value = zynmafqrjbVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!zynmafqrjbVar.compareAndSet(value, Boolean.valueOf(z13)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean dxjokdxxww() {
        return hf.iobyxmoadg.f40131iobyxmoadg.gxszxtbevo();
    }

    public final boolean eablkybsjg() {
        return hf.iobyxmoadg.f40131iobyxmoadg.wkgbmnqykc();
    }

    public final void gxszxtbevo(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        hf.iobyxmoadg iobyxmoadgVar = hf.iobyxmoadg.f40131iobyxmoadg;
        com.pandulapeter.beagle.common.configuration.zoijcleaow.gtknphoqwx gtknphoqwxVar = new com.pandulapeter.beagle.common.configuration.zoijcleaow.gtknphoqwx(null, 0L);
        com.pandulapeter.beagle.common.configuration.zoijcleaow.dxjokdxxww dxjokdxxwwVar = new com.pandulapeter.beagle.common.configuration.zoijcleaow.dxjokdxxww(0, jyumaefscl.eablkybsjg(mf.iobyxmoadg.f66906iobyxmoadg), null, null, 13, null);
        p002if.iobyxmoadg.C1000iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar, (Application) context, null, new com.pandulapeter.beagle.common.configuration.zoijcleaow(new draadjrbmk() { // from class: m70.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ppxfxbqfkf.lqeggnwhkg(this.f66442zdlpuopuiu, (oxmwwwfdhm) obj));
            }
        }, null, false, null, gtknphoqwxVar, new com.pandulapeter.beagle.common.configuration.zoijcleaow.nufgyqmvbu(0, jyumaefscl.eablkybsjg(lf.iobyxmoadg.f62491iobyxmoadg), null, 5, null), dxjokdxxwwVar, null, null, null, 910, null), 2, null);
        this.f66443iobyxmoadg.dsvhmnatus(new draadjrbmk() { // from class: m70.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.nufgyqmvbu(this.f66446zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        });
        jf.iobyxmoadg[] iobyxmoadgVarArrPmvmpeiblj = this.f66443iobyxmoadg.invoke();
        iobyxmoadgVar.eablkybsjg((jf.iobyxmoadg[]) Arrays.copyOf(iobyxmoadgVarArrPmvmpeiblj, iobyxmoadgVarArrPmvmpeiblj.length));
    }

    @Override // rs.zoijcleaow
    public void iobyxmoadg(String message, String label, Throwable th2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
        p002if.iobyxmoadg.C1000iobyxmoadg.eablkybsjg(hf.iobyxmoadg.f40131iobyxmoadg, message, label, th2 != null ? lqeggnwhkg.ppxfxbqfkf(th2) : null, false, 0L, null, 56, null);
    }

    public final zynmafqrjb wkgbmnqykc() {
        return this.f66444ppxfxbqfkf;
    }
}
