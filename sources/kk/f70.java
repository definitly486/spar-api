package kk;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class f70 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final z40 f56507iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f56508ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56509zoijcleaow;

    public f70(r20 r20Var, z40 z40Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f56507iobyxmoadg = z40Var;
        this.f56509zoijcleaow = iobyxmoadgVar;
        this.f56508ppxfxbqfkf = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        lk.iwizpuwonk interceptor = (lk.iwizpuwonk) this.f56507iobyxmoadg.get();
        zk.iobyxmoadg loggingInterceptor = (zk.iobyxmoadg) this.f56509zoijcleaow.get();
        nl sslInteractor = (nl) this.f56508ppxfxbqfkf.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interceptor, "interceptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        lk.lereixgezr.iobyxmoadg iobyxmoadgVarWypolnanlu = new lk.lereixgezr().lereixgezr().zoijcleaow(loggingInterceptor).iobyxmoadg(interceptor).wypolnanlu(20000L, TimeUnit.MILLISECONDS);
        SSLSocketFactory socketFactory = sslInteractor.b().getSocketFactory();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(socketFactory, "sslInteractor.customSSLContext.socketFactory");
        return (lk.lereixgezr.iobyxmoadg) ag.dxjokdxxww.eablkybsjg(iobyxmoadgVarWypolnanlu.kegysxyocb(socketFactory, sslInteractor.a()).dsvhmnatus(sslInteractor.c()));
    }
}
