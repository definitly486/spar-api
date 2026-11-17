package androidx.media3.exoplayer.drm;

import android.net.Uri;
import com.google.common.collect.ulzqkzuiru;
import java.util.Map;
import v2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements i3.gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f10462eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.zoijcleaow f10463gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f10464iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private dxjokdxxww f10465ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f10466wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private kcexrzcfyt.gxszxtbevo f10467zoijcleaow;

    private dxjokdxxww zoijcleaow(kcexrzcfyt.gxszxtbevo gxszxtbevoVar) {
        androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadgPpxfxbqfkf = this.f10466wkgbmnqykc;
        if (interfaceC0162iobyxmoadgPpxfxbqfkf == null) {
            interfaceC0162iobyxmoadgPpxfxbqfkf = new androidx.media3.datasource.ppxfxbqfkf.zoijcleaow().ppxfxbqfkf(this.f10462eablkybsjg);
        }
        Uri uri = gxszxtbevoVar.f115447ppxfxbqfkf;
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn(uri == null ? null : uri.toString(), gxszxtbevoVar.f115446nufgyqmvbu, interfaceC0162iobyxmoadgPpxfxbqfkf);
        ulzqkzuiru it = gxszxtbevoVar.f115441eablkybsjg.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ojitshcjhnVar.ppxfxbqfkf((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager.zoijcleaow zoijcleaowVarEablkybsjg = new DefaultDrmSessionManager.zoijcleaow().gxszxtbevo(gxszxtbevoVar.f115444iobyxmoadg, agtfadlqog.f10453wkgbmnqykc).ppxfxbqfkf(gxszxtbevoVar.f115443gxszxtbevo).wkgbmnqykc(gxszxtbevoVar.f115445lqeggnwhkg).eablkybsjg(com.google.common.primitives.gxszxtbevo.draadjrbmk(gxszxtbevoVar.f115439btonecajqb));
        androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar = this.f10463gxszxtbevo;
        if (zoijcleaowVar != null) {
            zoijcleaowVarEablkybsjg.zoijcleaow(zoijcleaowVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerIobyxmoadg = zoijcleaowVarEablkybsjg.iobyxmoadg(ojitshcjhnVar);
        defaultDrmSessionManagerIobyxmoadg.iozdgvuglv(0, gxszxtbevoVar.ppxfxbqfkf());
        return defaultDrmSessionManagerIobyxmoadg;
    }

    @Override // i3.gtknphoqwx
    public dxjokdxxww iobyxmoadg(kcexrzcfyt kcexrzcfytVar) {
        dxjokdxxww dxjokdxxwwVar;
        y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar.f115398zoijcleaow);
        kcexrzcfyt.gxszxtbevo gxszxtbevoVar = kcexrzcfytVar.f115398zoijcleaow.f115488ppxfxbqfkf;
        if (gxszxtbevoVar == null) {
            return dxjokdxxww.f10458iobyxmoadg;
        }
        synchronized (this.f10464iobyxmoadg) {
            try {
                if (!gxszxtbevoVar.equals(this.f10467zoijcleaow)) {
                    this.f10467zoijcleaow = gxszxtbevoVar;
                    this.f10465ppxfxbqfkf = zoijcleaow(gxszxtbevoVar);
                }
                dxjokdxxwwVar = (dxjokdxxww) y2.iobyxmoadg.eablkybsjg(this.f10465ppxfxbqfkf);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dxjokdxxwwVar;
    }
}
