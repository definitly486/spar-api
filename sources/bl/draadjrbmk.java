package bl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class draadjrbmk implements wwaezpbzkn {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wwaezpbzkn f16664zdlpuopuiu;

    public draadjrbmk(wwaezpbzkn delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f16664zdlpuopuiu = delegate;
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16664zdlpuopuiu.close();
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        return this.f16664zdlpuopuiu.fmlbqenlif(sink, j13);
    }

    public final wwaezpbzkn iobyxmoadg() {
        return this.f16664zdlpuopuiu;
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16664zdlpuopuiu.ppxfxbqfkf();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f16664zdlpuopuiu + ')';
    }
}
