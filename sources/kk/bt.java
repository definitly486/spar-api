package kk;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedList;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class bt {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static boolean f56046gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static ta f56047lqeggnwhkg;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinkedList f56048eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f56049iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final jlmebxxoox f56050ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final tc f56051wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wc0 f56052zoijcleaow;

    public bt(Context context, wc0 featuresHandler, jlmebxxoox sPayDataContract, tc userIdManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userIdManager, "userIdManager");
        this.f56049iobyxmoadg = context;
        this.f56052zoijcleaow = featuresHandler;
        this.f56050ppxfxbqfkf = sPayDataContract;
        this.f56051wkgbmnqykc = userIdManager;
        this.f56048eablkybsjg = new LinkedList();
    }

    public final void iobyxmoadg(ow analyticMetric) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticMetric, "analyticMetric");
        if (!f56046gxszxtbevo) {
            this.f56048eablkybsjg.add(analyticMetric);
            return;
        }
        ta taVar = f56047lqeggnwhkg;
        if (taVar != null) {
            taVar.iobyxmoadg(analyticMetric);
        }
    }

    public final void zoijcleaow(SPaySdkConfig config, dc2.zoijcleaow networkClientBuilder) {
        Object objWkgbmnqykc;
        Object next;
        String clickStreamUrl;
        String clickStreamAppId;
        String strPpxfxbqfkf;
        String stand;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(config, "config");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkClientBuilder, "networkClientBuilder");
        String strPpxfxbqfkf2 = null;
        if (zd0.iobyxmoadg(this.f56052zoijcleaow, uc0.CLICKSTREAM_METRICS, null)) {
            String strIobyxmoadg = eh.iobyxmoadg();
            Iterator<T> it = config.getSchemas().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                SPaySdkConfig.Schema schema = (SPaySdkConfig.Schema) next;
                strPpxfxbqfkf = (schema == null || (stand = schema.getStand()) == null) ? null : ir.ppxfxbqfkf(stand);
                if (strPpxfxbqfkf == null) {
                    strPpxfxbqfkf = "";
                }
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strPpxfxbqfkf, strIobyxmoadg));
            SPaySdkConfig.Schema schema2 = (SPaySdkConfig.Schema) next;
            String strPpxfxbqfkf3 = (schema2 == null || (clickStreamAppId = schema2.getClickStreamAppId()) == null) ? null : ir.ppxfxbqfkf(clickStreamAppId);
            if (strPpxfxbqfkf3 == null) {
                strPpxfxbqfkf3 = "";
            }
            if (schema2 != null && (clickStreamUrl = schema2.getClickStreamUrl()) != null) {
                strPpxfxbqfkf2 = ir.ppxfxbqfkf(clickStreamUrl);
            }
            rb2.zoijcleaow zoijcleaowVarIobyxmoadg = new rb2.zoijcleaow.iobyxmoadg(strPpxfxbqfkf3, strPpxfxbqfkf2 != null ? strPpxfxbqfkf2 : "", this.f56049iobyxmoadg).zoijcleaow(networkClientBuilder).iobyxmoadg();
            zoijcleaowVarIobyxmoadg.zoijcleaow(this.f56051wkgbmnqykc.iobyxmoadg());
            f56047lqeggnwhkg = new ta(zoijcleaowVarIobyxmoadg, this.f56050ppxfxbqfkf);
        }
        f56046gxszxtbevo = f56047lqeggnwhkg != null;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            if (!this.f56048eablkybsjg.isEmpty()) {
                while (!this.f56048eablkybsjg.isEmpty()) {
                    ow event = (ow) this.f56048eablkybsjg.pop();
                    ta taVar = f56047lqeggnwhkg;
                    if (taVar != null) {
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(event, "event");
                        taVar.iobyxmoadg(event);
                    }
                }
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            jc2.iobyxmoadg.f51100iobyxmoadg.dxjokdxxww("Exception while sending inner analytics", new Object[0]);
        }
    }
}
