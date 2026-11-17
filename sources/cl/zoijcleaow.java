package cl;

import bl.draadjrbmk;
import bl.wwaezpbzkn;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f19998iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f19999jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f20000yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(wwaezpbzkn delegate, long j13, boolean z13) {
        super(delegate);
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f20000yggfygwlhe = j13;
        this.f19999jyumaefscl = z13;
    }

    private final void wkgbmnqykc(bl.ppxfxbqfkf ppxfxbqfkfVar, long j13) throws EOFException {
        bl.ppxfxbqfkf ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
        ppxfxbqfkfVar2.xrmfcynszj(ppxfxbqfkfVar);
        ppxfxbqfkfVar.zeieaojujs(ppxfxbqfkfVar2, j13);
        ppxfxbqfkfVar2.iobyxmoadg();
    }

    @Override // bl.draadjrbmk, bl.wwaezpbzkn
    public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
        zdlpuopuiu.btonecajqb(sink, "sink");
        long j14 = this.f19998iwizpuwonk;
        long j15 = this.f20000yggfygwlhe;
        if (j14 > j15) {
            j13 = 0;
        } else if (this.f19999jyumaefscl) {
            long j16 = j15 - j14;
            if (j16 == 0) {
                return -1L;
            }
            j13 = Math.min(j13, j16);
        }
        long jFmlbqenlif = super.fmlbqenlif(sink, j13);
        if (jFmlbqenlif != -1) {
            this.f19998iwizpuwonk += jFmlbqenlif;
        }
        long j17 = this.f19998iwizpuwonk;
        long j18 = this.f20000yggfygwlhe;
        if ((j17 >= j18 || jFmlbqenlif != -1) && j17 <= j18) {
            return jFmlbqenlif;
        }
        if (jFmlbqenlif > 0 && j17 > j18) {
            wkgbmnqykc(sink, sink.dsvhmnatus() - (this.f19998iwizpuwonk - this.f20000yggfygwlhe));
        }
        throw new IOException("expected " + this.f20000yggfygwlhe + " bytes but got " + this.f19998iwizpuwonk);
    }
}
