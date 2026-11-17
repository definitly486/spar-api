package bl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog implements wwaezpbzkn {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CRC32 f16649cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ojitshcjhn f16650iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Inflater f16651jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zynmafqrjb f16652yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private byte f16653zdlpuopuiu;

    public agtfadlqog(wwaezpbzkn source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        zynmafqrjb zynmafqrjbVar = new zynmafqrjb(source);
        this.f16652yggfygwlhe = zynmafqrjbVar;
        Inflater inflater = new Inflater(true);
        this.f16651jyumaefscl = inflater;
        this.f16650iwizpuwonk = new ojitshcjhn((eablkybsjg) zynmafqrjbVar, inflater);
        this.f16649cqumvgiudr = new CRC32();
    }

    private final void iobyxmoadg(String str, int i13, int i14) throws IOException {
        if (i14 == i13) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i14), Integer.valueOf(i13)}, 3));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    private final void lqeggnwhkg() throws IOException {
        iobyxmoadg("CRC", this.f16652yggfygwlhe.R(), (int) this.f16649cqumvgiudr.getValue());
        iobyxmoadg("ISIZE", this.f16652yggfygwlhe.R(), (int) this.f16651jyumaefscl.getBytesWritten());
    }

    private final void nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, long j13, long j14) {
        istkbnxepw istkbnxepwVar = ppxfxbqfkfVar.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        while (true) {
            int i13 = istkbnxepwVar.f16702ppxfxbqfkf;
            int i14 = istkbnxepwVar.f16704zoijcleaow;
            if (j13 < i13 - i14) {
                break;
            }
            j13 -= (long) (i13 - i14);
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        }
        while (j14 > 0) {
            int i15 = (int) (((long) istkbnxepwVar.f16704zoijcleaow) + j13);
            int iMin = (int) Math.min(istkbnxepwVar.f16702ppxfxbqfkf - i15, j14);
            this.f16649cqumvgiudr.update(istkbnxepwVar.f16700iobyxmoadg, i15, iMin);
            j14 -= (long) iMin;
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            j13 = 0;
        }
    }

    private final void wkgbmnqykc() throws IOException {
        this.f16652yggfygwlhe.grlcpdaxtj(10L);
        byte bAgtfadlqog = this.f16652yggfygwlhe.f16762yggfygwlhe.agtfadlqog(3L);
        boolean z13 = ((bAgtfadlqog >> 1) & 1) == 1;
        if (z13) {
            nufgyqmvbu(this.f16652yggfygwlhe.f16762yggfygwlhe, 0L, 10L);
        }
        iobyxmoadg("ID1ID2", 8075, this.f16652yggfygwlhe.readShort());
        this.f16652yggfygwlhe.wflxmlrfwp(8L);
        if (((bAgtfadlqog >> 2) & 1) == 1) {
            this.f16652yggfygwlhe.grlcpdaxtj(2L);
            if (z13) {
                nufgyqmvbu(this.f16652yggfygwlhe.f16762yggfygwlhe, 0L, 2L);
            }
            long jIgdgnonuha = this.f16652yggfygwlhe.f16762yggfygwlhe.igdgnonuha();
            this.f16652yggfygwlhe.grlcpdaxtj(jIgdgnonuha);
            if (z13) {
                nufgyqmvbu(this.f16652yggfygwlhe.f16762yggfygwlhe, 0L, jIgdgnonuha);
            }
            this.f16652yggfygwlhe.wflxmlrfwp(jIgdgnonuha);
        }
        if (((bAgtfadlqog >> 3) & 1) == 1) {
            long jIobyxmoadg = this.f16652yggfygwlhe.iobyxmoadg((byte) 0);
            if (jIobyxmoadg == -1) {
                throw new EOFException();
            }
            if (z13) {
                nufgyqmvbu(this.f16652yggfygwlhe.f16762yggfygwlhe, 0L, jIobyxmoadg + 1);
            }
            this.f16652yggfygwlhe.wflxmlrfwp(jIobyxmoadg + 1);
        }
        if (((bAgtfadlqog >> 4) & 1) == 1) {
            long jIobyxmoadg2 = this.f16652yggfygwlhe.iobyxmoadg((byte) 0);
            if (jIobyxmoadg2 == -1) {
                throw new EOFException();
            }
            if (z13) {
                nufgyqmvbu(this.f16652yggfygwlhe.f16762yggfygwlhe, 0L, jIobyxmoadg2 + 1);
            }
            this.f16652yggfygwlhe.wflxmlrfwp(jIobyxmoadg2 + 1);
        }
        if (z13) {
            iobyxmoadg("FHCRC", this.f16652yggfygwlhe.igdgnonuha(), (short) this.f16649cqumvgiudr.getValue());
            this.f16649cqumvgiudr.reset();
        }
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16650iwizpuwonk.close();
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        if (j13 == 0) {
            return 0L;
        }
        if (this.f16653zdlpuopuiu == 0) {
            wkgbmnqykc();
            this.f16653zdlpuopuiu = (byte) 1;
        }
        if (this.f16653zdlpuopuiu == 1) {
            long jDsvhmnatus = sink.dsvhmnatus();
            long jFmlbqenlif = this.f16650iwizpuwonk.fmlbqenlif(sink, j13);
            if (jFmlbqenlif != -1) {
                nufgyqmvbu(sink, jDsvhmnatus, jFmlbqenlif);
                return jFmlbqenlif;
            }
            this.f16653zdlpuopuiu = (byte) 2;
        }
        if (this.f16653zdlpuopuiu == 2) {
            lqeggnwhkg();
            this.f16653zdlpuopuiu = (byte) 3;
            if (!this.f16652yggfygwlhe.n()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16652yggfygwlhe.ppxfxbqfkf();
    }
}
