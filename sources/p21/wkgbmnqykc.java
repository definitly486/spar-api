package p21;

import androidx.appcompat.app.yggfygwlhe;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.iwizpuwonk;
import lk.lereixgezr;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f75415iobyxmoadg;

    public wkgbmnqykc(u21.iobyxmoadg authInterceptorContract, u21.ppxfxbqfkf headersInterceptorContract, Set debugInterceptors, Set interceptors) {
        zdlpuopuiu.btonecajqb(authInterceptorContract, "authInterceptorContract");
        zdlpuopuiu.btonecajqb(headersInterceptorContract, "headersInterceptorContract");
        zdlpuopuiu.btonecajqb(debugInterceptors, "debugInterceptors");
        zdlpuopuiu.btonecajqb(interceptors, "interceptors");
        lereixgezr.iobyxmoadg iobyxmoadgVarIobyxmoadg = new lereixgezr.iobyxmoadg().gxszxtbevo(r21.zoijcleaow.zoijcleaow()).iobyxmoadg(authInterceptorContract.iobyxmoadg()).iobyxmoadg(headersInterceptorContract.iobyxmoadg());
        if (uw0.ppxfxbqfkf.f114521iobyxmoadg.kcexrzcfyt()) {
            hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
            hkdspvbjdzVar.f60015zdlpuopuiu = iobyxmoadgVarIobyxmoadg;
            Iterator it = debugInterceptors.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                Object obj = hkdspvbjdzVar.f60015zdlpuopuiu;
                yggfygwlhe.iobyxmoadg(next);
                throw null;
            }
            iobyxmoadgVarIobyxmoadg = (lereixgezr.iobyxmoadg) hkdspvbjdzVar.f60015zdlpuopuiu;
        }
        Iterator it2 = interceptors.iterator();
        while (it2.hasNext()) {
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg((iwizpuwonk) it2.next());
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f75415iobyxmoadg = iobyxmoadgVarIobyxmoadg.wypolnanlu(30L, timeUnit).eablkybsjg(30L, timeUnit).tzroggbefp(30L, timeUnit).stevsuqkhv(true).dsvhmnatus(new HostnameVerifier() { // from class: p21.ppxfxbqfkf
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return wkgbmnqykc.ppxfxbqfkf(str, sSLSession);
            }
        }).ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(String str, SSLSession sSLSession) {
        zdlpuopuiu.btonecajqb(str, "<unused var>");
        zdlpuopuiu.btonecajqb(sSLSession, "<unused var>");
        return true;
    }

    @Override // p21.iobyxmoadg
    public lereixgezr iobyxmoadg() {
        return this.f75415iobyxmoadg;
    }
}
