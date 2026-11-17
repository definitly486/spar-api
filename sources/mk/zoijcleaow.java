package mk;

import bl.wwaezpbzkn;
import bl.ylkuphrtab;
import bl.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends yadqdtsiqt implements wwaezpbzkn {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f67381iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final cqumvgiudr f67382jyumaefscl;

    public zoijcleaow(cqumvgiudr cqumvgiudrVar, long j13) {
        this.f67382jyumaefscl = cqumvgiudrVar;
        this.f67381iwizpuwonk = j13;
    }

    @Override // lk.yadqdtsiqt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // lk.yadqdtsiqt
    public bl.eablkybsjg draadjrbmk() {
        return zdlpuopuiu.ppxfxbqfkf(this);
    }

    @Override // lk.yadqdtsiqt
    public cqumvgiudr dxjokdxxww() {
        return this.f67382jyumaefscl;
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // lk.yadqdtsiqt
    public long nufgyqmvbu() {
        return this.f67381iwizpuwonk;
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return ylkuphrtab.f16756eablkybsjg;
    }
}
