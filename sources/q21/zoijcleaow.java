package q21;

import android.content.Context;
import android.net.ConnectivityManager;
import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import java.util.Set;
import lk.cqumvgiudr;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final lm.gxszxtbevo.iobyxmoadg btonecajqb() {
        nm.gtknphoqwx gtknphoqwxVarGxszxtbevo = nm.gtknphoqwx.gxszxtbevo();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarGxszxtbevo, "create(...)");
        return gtknphoqwxVarGxszxtbevo;
    }

    public final t21.dxjokdxxww draadjrbmk(yy0.iobyxmoadg debugPanelLocalSource) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugPanelLocalSource, "debugPanelLocalSource");
        return new t21.dxjokdxxww(debugPanelLocalSource);
    }

    public final v21.iobyxmoadg dxjokdxxww(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        return new v21.zoijcleaow(context);
    }

    public final Set eablkybsjg(t21.dxjokdxxww vpnDetectInterceptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vpnDetectInterceptor, "vpnDetectInterceptor");
        return ikoacuggdj.dxjokdxxww(t21.eablkybsjg.zoijcleaow(), new t21.iobyxmoadg(), vpnDetectInterceptor);
    }

    public final t21.gxszxtbevo gtknphoqwx(t21.dxjokdxxww vpnDetectInterceptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vpnDetectInterceptor, "vpnDetectInterceptor");
        return vpnDetectInterceptor;
    }

    public final lm.gxszxtbevo.iobyxmoadg gxszxtbevo() {
        return ff.ppxfxbqfkf.iobyxmoadg(gk.jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: q21.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.lqeggnwhkg((gk.eablkybsjg) obj);
            }
        }, 1, null), cqumvgiudr.f62887eablkybsjg.iobyxmoadg("application/json; charset=UTF8"));
    }

    public final x21.zoijcleaow nufgyqmvbu(Context context, p21.nufgyqmvbu client) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(client, "client");
        return new x21.ppxfxbqfkf(context, client);
    }

    public final ConnectivityManager ppxfxbqfkf(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public final u21.ppxfxbqfkf wkgbmnqykc(s21.iobyxmoadg apiEndPointsProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        return new u21.wkgbmnqykc(apiEndPointsProvider);
    }

    public final s21.iobyxmoadg zoijcleaow(v21.iobyxmoadg networkLocalSource) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkLocalSource, "networkLocalSource");
        return new s21.iobyxmoadg(networkLocalSource);
    }
}
