package iozdgvuglv;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc implements com.google.common.util.concurrent.wkgbmnqykc {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f49133yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f49134zdlpuopuiu;

    class iobyxmoadg implements androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
        public Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            u1.nufgyqmvbu.dxjokdxxww(wkgbmnqykc.this.f49133yggfygwlhe == null, "The result can only set once!");
            wkgbmnqykc.this.f49133yggfygwlhe = iobyxmoadgVar;
            return "FutureChain[" + wkgbmnqykc.this + "]";
        }
    }

    wkgbmnqykc(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        this.f49134zdlpuopuiu = (com.google.common.util.concurrent.wkgbmnqykc) u1.nufgyqmvbu.gxszxtbevo(wkgbmnqykcVar);
    }

    public static wkgbmnqykc zoijcleaow(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar instanceof wkgbmnqykc ? (wkgbmnqykc) wkgbmnqykcVar : new wkgbmnqykc(wkgbmnqykcVar);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        return this.f49134zdlpuopuiu.cancel(z13);
    }

    public final wkgbmnqykc eablkybsjg(ojitshcjhn.iobyxmoadg iobyxmoadgVar, Executor executor) {
        return (wkgbmnqykc) gtknphoqwx.esjtqupxsv(this, iobyxmoadgVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f49134zdlpuopuiu.get();
    }

    public final wkgbmnqykc gxszxtbevo(iozdgvuglv.iobyxmoadg iobyxmoadgVar, Executor executor) {
        return (wkgbmnqykc) gtknphoqwx.lereixgezr(this, iobyxmoadgVar, executor);
    }

    @Override // com.google.common.util.concurrent.wkgbmnqykc
    public void iobyxmoadg(Runnable runnable, Executor executor) {
        this.f49134zdlpuopuiu.iobyxmoadg(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f49134zdlpuopuiu.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f49134zdlpuopuiu.isDone();
    }

    boolean ppxfxbqfkf(Object obj) {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f49133yggfygwlhe;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ppxfxbqfkf(obj);
        }
        return false;
    }

    boolean wkgbmnqykc(Throwable th2) {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f49133yggfygwlhe;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.gxszxtbevo(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) {
        return this.f49134zdlpuopuiu.get(j13, timeUnit);
    }

    wkgbmnqykc() {
        this.f49134zdlpuopuiu = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new iobyxmoadg());
    }
}
