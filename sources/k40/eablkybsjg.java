package k40;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import hg.agtfadlqog;
import hg.jyumaefscl;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.iwizpuwonk;
import lk.lereixgezr;
import lk.vdvldrhtss;
import org.xbill.DNS.c0;
import org.xbill.DNS.dsvhmnatus;
import org.xbill.DNS.xrmfcynszj;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f53765iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        if (xx.iobyxmoadg.f123319iobyxmoadg.rlfsiqarku()) {
            rs.wkgbmnqykc.wkgbmnqykc(rs.wkgbmnqykc.f83693iobyxmoadg, "Network", message, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(String str, SSLSession sSLSession) {
        zdlpuopuiu.btonecajqb(str, "<unused var>");
        zdlpuopuiu.btonecajqb(sSLSession, "<unused var>");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wflxmlrfwp(eablkybsjg eablkybsjgVar, String hostname) {
        Object objWkgbmnqykc;
        Object objWkgbmnqykc2;
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(vdvldrhtss.f63198zoijcleaow.iobyxmoadg(hostname));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        List list = (List) objWkgbmnqykc;
        if (list != null) {
            return list;
        }
        try {
            InetAddress[] inetAddressArrWkgbmnqykc = org.xbill.DNS.gxszxtbevo.wkgbmnqykc(hostname);
            zdlpuopuiu.dxjokdxxww(inetAddressArrWkgbmnqykc, "getAllByName(...)");
            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(agtfadlqog.i(inetAddressArrWkgbmnqykc));
        } catch (Throwable th3) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
        }
        List list2 = (List) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2) ? null : objWkgbmnqykc2);
        return list2 == null ? jyumaefscl.wflxmlrfwp() : list2;
    }

    public final lereixgezr agtfadlqog(iwizpuwonk authInterceptor, iwizpuwonk headersInterceptor, iwizpuwonk loggingInterceptor, iwizpuwonk errorWrapperInterceptor, iwizpuwonk iwizpuwonkVar, iwizpuwonk cachedInterceptor, HostnameVerifier hostnameVerifier, vdvldrhtss dns) {
        zdlpuopuiu.btonecajqb(authInterceptor, "authInterceptor");
        zdlpuopuiu.btonecajqb(headersInterceptor, "headersInterceptor");
        zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        zdlpuopuiu.btonecajqb(errorWrapperInterceptor, "errorWrapperInterceptor");
        zdlpuopuiu.btonecajqb(cachedInterceptor, "cachedInterceptor");
        zdlpuopuiu.btonecajqb(hostnameVerifier, "hostnameVerifier");
        zdlpuopuiu.btonecajqb(dns, "dns");
        lereixgezr.iobyxmoadg iobyxmoadgVarIobyxmoadg = new lereixgezr.iobyxmoadg().gxszxtbevo(dns).iobyxmoadg(authInterceptor).iobyxmoadg(headersInterceptor).iobyxmoadg(loggingInterceptor).iobyxmoadg(errorWrapperInterceptor);
        if (iwizpuwonkVar != null) {
            iobyxmoadgVarIobyxmoadg.iobyxmoadg(iwizpuwonkVar);
        }
        if (xx.iobyxmoadg.f123319iobyxmoadg.iozdgvuglv()) {
            iobyxmoadgVarIobyxmoadg.iobyxmoadg(cachedInterceptor);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return iobyxmoadgVarIobyxmoadg.wypolnanlu(30L, timeUnit).eablkybsjg(30L, timeUnit).tzroggbefp(30L, timeUnit).stevsuqkhv(true).dsvhmnatus(hostnameVerifier).ppxfxbqfkf();
    }

    public final vdvldrhtss draadjrbmk() {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(jyumaefscl.eablkybsjg(new c0("176.67.241.157")));
            xrmfcynszj.rgvfuqvkyq(dsvhmnatusVar);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(dsvhmnatusVar);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) == null ? new vdvldrhtss() { // from class: k40.wkgbmnqykc
            @Override // lk.vdvldrhtss
            public final List iobyxmoadg(String str) {
                return eablkybsjg.wflxmlrfwp(this.f53766ppxfxbqfkf, str);
            }
        } : vdvldrhtss.f63198zoijcleaow;
    }

    public final zk.iobyxmoadg.zoijcleaow dxjokdxxww() {
        return new zk.iobyxmoadg.zoijcleaow() { // from class: k40.zoijcleaow
            @Override // zk.iobyxmoadg.zoijcleaow
            public final void log(String str) {
                eablkybsjg.btonecajqb(str);
            }
        };
    }

    public final lm.gxszxtbevo.iobyxmoadg eablkybsjg() {
        return ff.ppxfxbqfkf.iobyxmoadg(gk.jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: k40.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.gxszxtbevo((gk.eablkybsjg) obj);
            }
        }, 1, null), cqumvgiudr.f62887eablkybsjg.iobyxmoadg("application/json; charset=UTF8"));
    }

    public final iwizpuwonk gtknphoqwx(zk.iobyxmoadg.zoijcleaow httpLogger) {
        zdlpuopuiu.btonecajqb(httpLogger, "httpLogger");
        zk.iobyxmoadg iobyxmoadgVar = new zk.iobyxmoadg(httpLogger);
        iobyxmoadgVar.ppxfxbqfkf(xx.iobyxmoadg.f123319iobyxmoadg.rlfsiqarku() ? zk.iobyxmoadg.EnumC3324iobyxmoadg.BODY : zk.iobyxmoadg.EnumC3324iobyxmoadg.NONE);
        return iobyxmoadgVar;
    }

    public final HostnameVerifier lqeggnwhkg() {
        return new HostnameVerifier() { // from class: k40.ppxfxbqfkf
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return eablkybsjg.nufgyqmvbu(str, sSLSession);
            }
        };
    }

    public final lereixgezr ojitshcjhn() {
        return new lereixgezr.iobyxmoadg().wkgbmnqykc(500L, TimeUnit.MILLISECONDS).ppxfxbqfkf();
    }

    public final lm.zdlpuopuiu rgvfuqvkyq(lereixgezr okHttpClient, l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        lm.zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = new lm.zdlpuopuiu.zoijcleaow().iobyxmoadg(eablkybsjg()).iobyxmoadg(nm.gtknphoqwx.gxszxtbevo()).zoijcleaow(apiEndPointsProvider.zoijcleaow()).gxszxtbevo(okHttpClient).wkgbmnqykc();
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        return zdlpuopuiuVarWkgbmnqykc;
    }
}
