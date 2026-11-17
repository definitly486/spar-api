package bl;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class cqumvgiudr implements iozdgvuglv {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ylkuphrtab f16662yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final OutputStream f16663zdlpuopuiu;

    public cqumvgiudr(OutputStream out, ylkuphrtab timeout) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(out, "out");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(timeout, "timeout");
        this.f16663zdlpuopuiu = out;
        this.f16662yggfygwlhe = timeout;
    }

    @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16663zdlpuopuiu.close();
    }

    @Override // bl.iozdgvuglv, java.io.Flushable
    public void flush() throws IOException {
        this.f16663zdlpuopuiu.flush();
    }

    @Override // bl.iozdgvuglv
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16662yggfygwlhe;
    }

    public String toString() {
        return "sink(" + this.f16663zdlpuopuiu + ')';
    }

    @Override // bl.iozdgvuglv
    public void zeieaojujs(ppxfxbqfkf source, long j13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        cllcsxoeiz.zoijcleaow(source.dsvhmnatus(), 0L, j13);
        while (j13 > 0) {
            this.f16662yggfygwlhe.gxszxtbevo();
            istkbnxepw istkbnxepwVar = source.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            int iMin = (int) Math.min(j13, istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            this.f16663zdlpuopuiu.write(istkbnxepwVar.f16700iobyxmoadg, istkbnxepwVar.f16704zoijcleaow, iMin);
            istkbnxepwVar.f16704zoijcleaow += iMin;
            long j14 = iMin;
            j13 -= j14;
            source.hkdspvbjdz(source.dsvhmnatus() - j14);
            if (istkbnxepwVar.f16704zoijcleaow == istkbnxepwVar.f16702ppxfxbqfkf) {
                source.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
                cdpycssgdh.zoijcleaow(istkbnxepwVar);
            }
        }
    }
}
