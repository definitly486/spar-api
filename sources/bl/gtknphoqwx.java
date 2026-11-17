package bl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx implements iozdgvuglv {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iozdgvuglv f16672zdlpuopuiu;

    public gtknphoqwx(iozdgvuglv delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f16672zdlpuopuiu = delegate;
    }

    @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16672zdlpuopuiu.close();
    }

    @Override // bl.iozdgvuglv, java.io.Flushable
    public void flush() {
        this.f16672zdlpuopuiu.flush();
    }

    @Override // bl.iozdgvuglv
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16672zdlpuopuiu.ppxfxbqfkf();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f16672zdlpuopuiu + ')';
    }

    @Override // bl.iozdgvuglv
    public void zeieaojujs(ppxfxbqfkf source, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        this.f16672zdlpuopuiu.zeieaojujs(source, j13);
    }
}
