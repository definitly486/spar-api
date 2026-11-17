package org.xbill.DNS;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements f {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final am.iobyxmoadg f74261lqeggnwhkg = am.zoijcleaow.dxjokdxxww(c0.class);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static InetSocketAddress f74262nufgyqmvbu = new InetSocketAddress(InetAddress.getLoopbackAddress(), 53);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private fmlbqenlif f74263eablkybsjg = new fmlbqenlif(1280, 0, 0, 0);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Duration f74264gxszxtbevo = Duration.ofSeconds(10);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private InetSocketAddress f74265iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f74266ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f74267wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private InetSocketAddress f74268zoijcleaow;

    public c0(String str) {
        if (str != null) {
            this.f74265iobyxmoadg = new InetSocketAddress(CommonUrlParts.Values.FALSE_INTEGER.equals(str) ? InetAddress.getLoopbackAddress() : InetAddress.getByName(str), 53);
            return;
        }
        InetSocketAddress inetSocketAddressGxszxtbevo = g.zoijcleaow().gxszxtbevo();
        this.f74265iobyxmoadg = inetSocketAddressGxszxtbevo;
        if (inetSocketAddressGxszxtbevo == null) {
            this.f74265iobyxmoadg = f74262nufgyqmvbu;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage btonecajqb(int i13, zfvoamnweg zfvoamnwegVar, boolean z13, Executor executor, byte[] bArr) {
        CompletableFuture completableFuture = new CompletableFuture();
        if (bArr.length < 12) {
            completableFuture.completeExceptionally(new WireParseException("invalid DNS header - too short"));
            return completableFuture;
        }
        int i14 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        if (i14 != i13) {
            completableFuture.completeExceptionally(new WireParseException("invalid message id: expected " + i13 + "; got id " + i14));
            return completableFuture;
        }
        try {
            zfvoamnweg zfvoamnwegVarDraadjrbmk = draadjrbmk(bArr);
            if (!zfvoamnwegVar.eablkybsjg().cqumvgiudr().equals(zfvoamnwegVarDraadjrbmk.eablkybsjg().cqumvgiudr())) {
                completableFuture.completeExceptionally(new WireParseException("invalid name in message: expected " + zfvoamnwegVar.eablkybsjg().cqumvgiudr() + "; got " + zfvoamnwegVarDraadjrbmk.eablkybsjg().cqumvgiudr()));
                return completableFuture;
            }
            if (zfvoamnwegVar.eablkybsjg().zdlpuopuiu() != zfvoamnwegVarDraadjrbmk.eablkybsjg().zdlpuopuiu()) {
                completableFuture.completeExceptionally(new WireParseException("invalid class in message: expected " + rgvfuqvkyq.zoijcleaow(zfvoamnwegVar.eablkybsjg().zdlpuopuiu()) + "; got " + rgvfuqvkyq.zoijcleaow(zfvoamnwegVarDraadjrbmk.eablkybsjg().zdlpuopuiu())));
                return completableFuture;
            }
            if (zfvoamnwegVar.eablkybsjg().zynmafqrjb() != zfvoamnwegVarDraadjrbmk.eablkybsjg().zynmafqrjb()) {
                completableFuture.completeExceptionally(new WireParseException("invalid type in message: expected " + x2.wkgbmnqykc(zfvoamnwegVar.eablkybsjg().zynmafqrjb()) + "; got " + x2.wkgbmnqykc(zfvoamnwegVarDraadjrbmk.eablkybsjg().zynmafqrjb())));
                return completableFuture;
            }
            ojitshcjhn(zfvoamnwegVar, zfvoamnwegVarDraadjrbmk, bArr);
            if (z13 || this.f74267wkgbmnqykc || !zfvoamnwegVarDraadjrbmk.ppxfxbqfkf().wkgbmnqykc(6)) {
                zfvoamnwegVarDraadjrbmk.oxmwwwfdhm(this);
                completableFuture.complete(zfvoamnwegVarDraadjrbmk);
                return completableFuture;
            }
            am.iobyxmoadg iobyxmoadgVar = f74261lqeggnwhkg;
            if (iobyxmoadgVar.draadjrbmk()) {
                iobyxmoadgVar.dxjokdxxww("Got truncated response for id {}, retrying via TCP, response:\n{}", Integer.valueOf(i13), zfvoamnwegVarDraadjrbmk);
            } else {
                iobyxmoadgVar.yggfygwlhe("Got truncated response for id {}, retrying via TCP", Integer.valueOf(i13));
            }
            return agtfadlqog(zfvoamnwegVar, true, executor);
        } catch (WireParseException e13) {
            completableFuture.completeExceptionally(e13);
            return completableFuture;
        }
    }

    private zfvoamnweg draadjrbmk(byte[] bArr) throws WireParseException {
        try {
            return new zfvoamnweg(bArr);
        } catch (IOException e13) {
            if (e13 instanceof WireParseException) {
                throw ((WireParseException) e13);
            }
            throw new WireParseException("Error parsing message", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dxjokdxxww(CompletableFuture completableFuture, zfvoamnweg zfvoamnwegVar) {
        try {
            completableFuture.complete(wflxmlrfwp(zfvoamnwegVar));
        } catch (IOException e13) {
            completableFuture.completeExceptionally(e13);
        }
    }

    private int gtknphoqwx(zfvoamnweg zfvoamnwegVar) {
        fmlbqenlif fmlbqenlifVarWkgbmnqykc = zfvoamnwegVar.wkgbmnqykc();
        return fmlbqenlifVarWkgbmnqykc == null ? UserVerificationMethods.USER_VERIFY_NONE : fmlbqenlifVarWkgbmnqykc.crxdokpmqz();
    }

    private void nufgyqmvbu(zfvoamnweg zfvoamnwegVar) {
        if (this.f74263eablkybsjg == null || zfvoamnwegVar.wkgbmnqykc() != null) {
            return;
        }
        zfvoamnwegVar.iobyxmoadg(this.f74263eablkybsjg, 3);
    }

    private void ojitshcjhn(zfvoamnweg zfvoamnwegVar, zfvoamnweg zfvoamnwegVar2, byte[] bArr) {
    }

    private zfvoamnweg wflxmlrfwp(zfvoamnweg zfvoamnwegVar) throws WireParseException {
        e3 e3VarGtknphoqwx = e3.gtknphoqwx(zfvoamnwegVar.eablkybsjg().cqumvgiudr(), this.f74265iobyxmoadg, null);
        e3VarGtknphoqwx.kcexrzcfyt(this.f74264gxszxtbevo);
        e3VarGtknphoqwx.oxmwwwfdhm(this.f74268zoijcleaow);
        try {
            e3VarGtknphoqwx.ojitshcjhn();
            List listLqeggnwhkg = e3VarGtknphoqwx.lqeggnwhkg();
            zfvoamnweg zfvoamnwegVar2 = new zfvoamnweg(zfvoamnwegVar.ppxfxbqfkf().gxszxtbevo());
            zfvoamnwegVar2.ppxfxbqfkf().agtfadlqog(5);
            zfvoamnwegVar2.ppxfxbqfkf().agtfadlqog(0);
            zfvoamnwegVar2.iobyxmoadg(zfvoamnwegVar.eablkybsjg(), 0);
            Iterator it = listLqeggnwhkg.iterator();
            while (it.hasNext()) {
                zfvoamnwegVar2.iobyxmoadg((e) it.next(), 1);
            }
            return zfvoamnwegVar2;
        } catch (ZoneTransferException e13) {
            throw new WireParseException(e13.getMessage());
        }
    }

    CompletableFuture agtfadlqog(final zfvoamnweg zfvoamnwegVar, boolean z13, final Executor executor) {
        final int iGxszxtbevo = zfvoamnwegVar.ppxfxbqfkf().gxszxtbevo();
        byte[] bArrZdlpuopuiu = zfvoamnwegVar.zdlpuopuiu(65535);
        int iGtknphoqwx = gtknphoqwx(zfvoamnwegVar);
        final boolean z14 = z13 || bArrZdlpuopuiu.length > iGtknphoqwx;
        am.iobyxmoadg iobyxmoadgVar = f74261lqeggnwhkg;
        if (iobyxmoadgVar.draadjrbmk()) {
            iobyxmoadgVar.rgvfuqvkyq("Sending {}/{}, id={} to {}/{}:{}, query:\n{}", zfvoamnwegVar.eablkybsjg().cqumvgiudr(), x2.wkgbmnqykc(zfvoamnwegVar.eablkybsjg().zynmafqrjb()), Integer.valueOf(iGxszxtbevo), z14 ? "tcp" : "udp", this.f74265iobyxmoadg.getAddress().getHostAddress(), Integer.valueOf(this.f74265iobyxmoadg.getPort()), zfvoamnwegVar);
        } else if (iobyxmoadgVar.nufgyqmvbu()) {
            iobyxmoadgVar.agtfadlqog("Sending {}/{}, id={} to {}/{}:{}", zfvoamnwegVar.eablkybsjg().cqumvgiudr(), x2.wkgbmnqykc(zfvoamnwegVar.eablkybsjg().zynmafqrjb()), Integer.valueOf(iGxszxtbevo), z14 ? "tcp" : "udp", this.f74265iobyxmoadg.getAddress().getHostAddress(), Integer.valueOf(this.f74265iobyxmoadg.getPort()));
        }
        return (z14 ? ageimvtcrz.esjtqupxsv(this.f74268zoijcleaow, this.f74265iobyxmoadg, zfvoamnwegVar, bArrZdlpuopuiu, this.f74264gxszxtbevo) : ixidwrxhsl.jyumaefscl(this.f74268zoijcleaow, this.f74265iobyxmoadg, zfvoamnwegVar, bArrZdlpuopuiu, iGtknphoqwx, this.f74264gxszxtbevo)).thenComposeAsync(new Function() { // from class: org.xbill.DNS.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f74244iobyxmoadg.btonecajqb(iGxszxtbevo, zfvoamnwegVar, z14, executor, (byte[]) obj);
            }
        }, executor);
    }

    @Override // org.xbill.DNS.f
    public CompletionStage eablkybsjg(zfvoamnweg zfvoamnwegVar) {
        return wkgbmnqykc(zfvoamnwegVar, ForkJoinPool.commonPool());
    }

    @Override // org.xbill.DNS.f
    public void iobyxmoadg(Duration duration) {
        this.f74264gxszxtbevo = duration;
    }

    public String toString() {
        return "SimpleResolver [" + this.f74265iobyxmoadg + "]";
    }

    @Override // org.xbill.DNS.f
    public CompletionStage wkgbmnqykc(final zfvoamnweg zfvoamnwegVar, Executor executor) {
        e eVarEablkybsjg;
        if (zfvoamnwegVar.ppxfxbqfkf().lqeggnwhkg() == 0 && (eVarEablkybsjg = zfvoamnwegVar.eablkybsjg()) != null && eVarEablkybsjg.zynmafqrjb() == 252) {
            final CompletableFuture completableFuture = new CompletableFuture();
            CompletableFuture.runAsync(new Runnable() { // from class: org.xbill.DNS.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74205zdlpuopuiu.dxjokdxxww(completableFuture, zfvoamnwegVar);
                }
            }, executor);
            return completableFuture;
        }
        zfvoamnweg zfvoamnwegVarClone = zfvoamnwegVar.clone();
        nufgyqmvbu(zfvoamnwegVarClone);
        return agtfadlqog(zfvoamnwegVarClone, this.f74266ppxfxbqfkf, executor);
    }

    @Override // org.xbill.DNS.f
    public Duration zoijcleaow() {
        return this.f74264gxszxtbevo;
    }

    public c0(InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(inetSocketAddress, "host must not be null");
        this.f74265iobyxmoadg = inetSocketAddress;
    }
}
