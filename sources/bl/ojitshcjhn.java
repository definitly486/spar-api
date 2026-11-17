package bl;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn implements wwaezpbzkn {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f16732iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f16733jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Inflater f16734yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final eablkybsjg f16735zdlpuopuiu;

    public ojitshcjhn(eablkybsjg source, Inflater inflater) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inflater, "inflater");
        this.f16735zdlpuopuiu = source;
        this.f16734yggfygwlhe = inflater;
    }

    private final void lqeggnwhkg() {
        int i13 = this.f16733jyumaefscl;
        if (i13 == 0) {
            return;
        }
        int remaining = i13 - this.f16734yggfygwlhe.getRemaining();
        this.f16733jyumaefscl -= remaining;
        this.f16735zdlpuopuiu.wflxmlrfwp(remaining);
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16732iwizpuwonk) {
            return;
        }
        this.f16734yggfygwlhe.end();
        this.f16732iwizpuwonk = true;
        this.f16735zdlpuopuiu.close();
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        do {
            long jIobyxmoadg = iobyxmoadg(sink, j13);
            if (jIobyxmoadg > 0) {
                return jIobyxmoadg;
            }
            if (this.f16734yggfygwlhe.finished() || this.f16734yggfygwlhe.needsDictionary()) {
                return -1L;
            }
        } while (!this.f16735zdlpuopuiu.n());
        throw new EOFException("source exhausted prematurely");
    }

    public final long iobyxmoadg(ppxfxbqfkf sink, long j13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        if (this.f16732iwizpuwonk) {
            throw new IllegalStateException("closed");
        }
        if (j13 == 0) {
            return 0L;
        }
        try {
            istkbnxepw istkbnxepwVarNtlheqmsrt = sink.ntlheqmsrt(1);
            int iMin = (int) Math.min(j13, 8192 - istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf);
            wkgbmnqykc();
            int iInflate = this.f16734yggfygwlhe.inflate(istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg, istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf, iMin);
            lqeggnwhkg();
            if (iInflate > 0) {
                istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += iInflate;
                long j14 = iInflate;
                sink.hkdspvbjdz(sink.dsvhmnatus() + j14);
                return j14;
            }
            if (istkbnxepwVarNtlheqmsrt.f16704zoijcleaow == istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf) {
                sink.f16740zdlpuopuiu = istkbnxepwVarNtlheqmsrt.zoijcleaow();
                cdpycssgdh.zoijcleaow(istkbnxepwVarNtlheqmsrt);
            }
            return 0L;
        } catch (DataFormatException e13) {
            throw new IOException(e13);
        }
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16735zdlpuopuiu.ppxfxbqfkf();
    }

    public final boolean wkgbmnqykc() {
        if (!this.f16734yggfygwlhe.needsInput()) {
            return false;
        }
        if (this.f16735zdlpuopuiu.n()) {
            return true;
        }
        istkbnxepw istkbnxepwVar = this.f16735zdlpuopuiu.zoijcleaow().f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16702ppxfxbqfkf;
        int i14 = istkbnxepwVar.f16704zoijcleaow;
        int i15 = i13 - i14;
        this.f16733jyumaefscl = i15;
        this.f16734yggfygwlhe.setInput(istkbnxepwVar.f16700iobyxmoadg, i14, i15);
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(wwaezpbzkn source, Inflater inflater) {
        this(zdlpuopuiu.ppxfxbqfkf(source), inflater);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inflater, "inflater");
    }
}
