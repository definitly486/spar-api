package bl;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class rgvfuqvkyq implements wwaezpbzkn {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ylkuphrtab f16749yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final InputStream f16750zdlpuopuiu;

    public rgvfuqvkyq(InputStream input, ylkuphrtab timeout) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(timeout, "timeout");
        this.f16750zdlpuopuiu = input;
        this.f16749yggfygwlhe = timeout;
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16750zdlpuopuiu.close();
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (j13 == 0) {
            return 0L;
        }
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        try {
            this.f16749yggfygwlhe.gxszxtbevo();
            istkbnxepw istkbnxepwVarNtlheqmsrt = sink.ntlheqmsrt(1);
            int i13 = this.f16750zdlpuopuiu.read(istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg, istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf, (int) Math.min(j13, 8192 - istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf));
            if (i13 != -1) {
                istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += i13;
                long j14 = i13;
                sink.hkdspvbjdz(sink.dsvhmnatus() + j14);
                return j14;
            }
            if (istkbnxepwVarNtlheqmsrt.f16704zoijcleaow != istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf) {
                return -1L;
            }
            sink.f16740zdlpuopuiu = istkbnxepwVarNtlheqmsrt.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVarNtlheqmsrt);
            return -1L;
        } catch (AssertionError e13) {
            if (zdlpuopuiu.wkgbmnqykc(e13)) {
                throw new IOException(e13);
            }
            throw e13;
        }
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16749yggfygwlhe;
    }

    public String toString() {
        return "source(" + this.f16750zdlpuopuiu + ')';
    }
}
