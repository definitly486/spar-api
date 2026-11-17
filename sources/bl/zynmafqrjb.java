package bl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb implements eablkybsjg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public boolean f16761jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final ppxfxbqfkf f16762yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final wwaezpbzkn f16763zdlpuopuiu;

    public zynmafqrjb(wwaezpbzkn source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        this.f16763zdlpuopuiu = source;
        this.f16762yggfygwlhe = new ppxfxbqfkf();
    }

    @Override // bl.eablkybsjg
    public String F(Charset charset) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        this.f16762yggfygwlhe.xrmfcynszj(this.f16763zdlpuopuiu);
        return this.f16762yggfygwlhe.F(charset);
    }

    @Override // bl.eablkybsjg
    public long H(gxszxtbevo bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        return wkgbmnqykc(bytes, 0L);
    }

    @Override // bl.eablkybsjg
    public long P(iozdgvuglv sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        long j13 = 0;
        while (this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) != -1) {
            long jLqeggnwhkg = this.f16762yggfygwlhe.lqeggnwhkg();
            if (jLqeggnwhkg > 0) {
                j13 += jLqeggnwhkg;
                sink.zeieaojujs(this.f16762yggfygwlhe, jLqeggnwhkg);
            }
        }
        if (this.f16762yggfygwlhe.dsvhmnatus() <= 0) {
            return j13;
        }
        long jDsvhmnatus = j13 + this.f16762yggfygwlhe.dsvhmnatus();
        ppxfxbqfkf ppxfxbqfkfVar = this.f16762yggfygwlhe;
        sink.zeieaojujs(ppxfxbqfkfVar, ppxfxbqfkfVar.dsvhmnatus());
        return jDsvhmnatus;
    }

    @Override // bl.eablkybsjg
    public long Q(gxszxtbevo targetBytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetBytes, "targetBytes");
        return lqeggnwhkg(targetBytes, 0L);
    }

    @Override // bl.eablkybsjg
    public int R() {
        grlcpdaxtj(4L);
        return this.f16762yggfygwlhe.R();
    }

    @Override // bl.eablkybsjg
    public byte[] auzgnhcxok(long j13) {
        grlcpdaxtj(j13);
        return this.f16762yggfygwlhe.auzgnhcxok(j13);
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f16761jyumaefscl) {
            return;
        }
        this.f16761jyumaefscl = true;
        this.f16763zdlpuopuiu.close();
        this.f16762yggfygwlhe.iobyxmoadg();
    }

    @Override // bl.eablkybsjg
    public gxszxtbevo d(long j13) {
        grlcpdaxtj(j13);
        return this.f16762yggfygwlhe.d(j13);
    }

    @Override // bl.eablkybsjg
    public long fiwbwshyhd() {
        grlcpdaxtj(8L);
        return this.f16762yggfygwlhe.fiwbwshyhd();
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        if (this.f16762yggfygwlhe.dsvhmnatus() == 0 && this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
            return -1L;
        }
        return this.f16762yggfygwlhe.fmlbqenlif(sink, Math.min(j13, this.f16762yggfygwlhe.dsvhmnatus()));
    }

    @Override // bl.eablkybsjg
    public void grlcpdaxtj(long j13) {
        if (!lrnfpwlwnk(j13)) {
            throw new EOFException();
        }
    }

    @Override // bl.eablkybsjg
    public long i0() {
        grlcpdaxtj(1L);
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (!lrnfpwlwnk(i14)) {
                break;
            }
            byte bAgtfadlqog = this.f16762yggfygwlhe.agtfadlqog(i13);
            if ((bAgtfadlqog < 48 || bAgtfadlqog > 57) && ((bAgtfadlqog < 97 || bAgtfadlqog > 102) && (bAgtfadlqog < 65 || bAgtfadlqog > 70))) {
                if (i13 != 0) {
                    break;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bAgtfadlqog, mj.iobyxmoadg.iobyxmoadg(mj.iobyxmoadg.iobyxmoadg(16)));
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(this, checkRadix(radix))");
                sb3.append(string);
                throw new NumberFormatException(sb3.toString());
            }
            i13 = i14;
        }
        return this.f16762yggfygwlhe.i0();
    }

    @Override // bl.eablkybsjg
    public short igdgnonuha() {
        grlcpdaxtj(2L);
        return this.f16762yggfygwlhe.igdgnonuha();
    }

    public long iobyxmoadg(byte b13) {
        return sopmlzcsov(b13, 0L, Long.MAX_VALUE);
    }

    @Override // bl.eablkybsjg
    public ppxfxbqfkf iozdgvuglv() {
        return this.f16762yggfygwlhe;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16761jyumaefscl;
    }

    @Override // bl.eablkybsjg
    public InputStream j0() {
        return new iobyxmoadg();
    }

    public long lqeggnwhkg(gxszxtbevo targetBytes, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetBytes, "targetBytes");
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jRgvfuqvkyq = this.f16762yggfygwlhe.rgvfuqvkyq(targetBytes, j13);
            if (jRgvfuqvkyq != -1) {
                return jRgvfuqvkyq;
            }
            long jDsvhmnatus = this.f16762yggfygwlhe.dsvhmnatus();
            if (this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
                return -1L;
            }
            j13 = Math.max(j13, jDsvhmnatus);
        }
    }

    @Override // bl.eablkybsjg
    public boolean lrnfpwlwnk(long j13) {
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        while (this.f16762yggfygwlhe.dsvhmnatus() < j13) {
            if (this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // bl.eablkybsjg
    public boolean n() {
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        return this.f16762yggfygwlhe.n() && this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1;
    }

    public boolean nufgyqmvbu(long j13, gxszxtbevo bytes, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        if (j13 < 0 || i13 < 0 || i14 < 0 || bytes.hcddaimhww() - i13 < i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            long j14 = ((long) i15) + j13;
            if (!lrnfpwlwnk(1 + j14) || this.f16762yggfygwlhe.agtfadlqog(j14) != bytes.draadjrbmk(i13 + i15)) {
                return false;
            }
        }
        return true;
    }

    @Override // bl.eablkybsjg
    public eablkybsjg peek() {
        return zdlpuopuiu.ppxfxbqfkf(new lereixgezr(this));
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16763zdlpuopuiu.ppxfxbqfkf();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (this.f16762yggfygwlhe.dsvhmnatus() == 0 && this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
            return -1;
        }
        return this.f16762yggfygwlhe.read(sink);
    }

    @Override // bl.eablkybsjg
    public byte readByte() {
        grlcpdaxtj(1L);
        return this.f16762yggfygwlhe.readByte();
    }

    @Override // bl.eablkybsjg
    public int readInt() {
        grlcpdaxtj(4L);
        return this.f16762yggfygwlhe.readInt();
    }

    @Override // bl.eablkybsjg
    public short readShort() {
        grlcpdaxtj(2L);
        return this.f16762yggfygwlhe.readShort();
    }

    @Override // bl.eablkybsjg
    public String ribwqtqdhb(long j13) throws EOFException {
        if (j13 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j13).toString());
        }
        long j14 = j13 == Long.MAX_VALUE ? Long.MAX_VALUE : j13 + 1;
        long jSopmlzcsov = sopmlzcsov((byte) 10, 0L, j14);
        if (jSopmlzcsov != -1) {
            return cl.gxszxtbevo.ppxfxbqfkf(this.f16762yggfygwlhe, jSopmlzcsov);
        }
        if (j14 < Long.MAX_VALUE && lrnfpwlwnk(j14) && this.f16762yggfygwlhe.agtfadlqog(j14 - 1) == 13 && lrnfpwlwnk(1 + j14) && this.f16762yggfygwlhe.agtfadlqog(j14) == 10) {
            return cl.gxszxtbevo.ppxfxbqfkf(this.f16762yggfygwlhe, j14);
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        ppxfxbqfkf ppxfxbqfkfVar2 = this.f16762yggfygwlhe;
        ppxfxbqfkfVar2.draadjrbmk(ppxfxbqfkfVar, 0L, Math.min(32, ppxfxbqfkfVar2.dsvhmnatus()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16762yggfygwlhe.dsvhmnatus(), j13) + " content=" + ppxfxbqfkfVar.cqumvgiudr().kcexrzcfyt() + (char) 8230);
    }

    @Override // bl.eablkybsjg
    public String roivzttewh() {
        return ribwqtqdhb(Long.MAX_VALUE);
    }

    @Override // bl.eablkybsjg
    public long sopmlzcsov(byte b13, long j13, long j14) {
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        if (0 > j13 || j13 > j14) {
            throw new IllegalArgumentException(("fromIndex=" + j13 + " toIndex=" + j14).toString());
        }
        while (j13 < j14) {
            long jSopmlzcsov = this.f16762yggfygwlhe.sopmlzcsov(b13, j13, j14);
            if (jSopmlzcsov != -1) {
                return jSopmlzcsov;
            }
            long jDsvhmnatus = this.f16762yggfygwlhe.dsvhmnatus();
            if (jDsvhmnatus >= j14 || this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
                return -1L;
            }
            j13 = Math.max(j13, jDsvhmnatus);
        }
        return -1L;
    }

    public String toString() {
        return "buffer(" + this.f16763zdlpuopuiu + ')';
    }

    @Override // bl.eablkybsjg
    public boolean tzroggbefp(long j13, gxszxtbevo bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        return nufgyqmvbu(j13, bytes, 0, bytes.hcddaimhww());
    }

    @Override // bl.eablkybsjg
    public void wflxmlrfwp(long j13) {
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        while (j13 > 0) {
            if (this.f16762yggfygwlhe.dsvhmnatus() == 0 && this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j13, this.f16762yggfygwlhe.dsvhmnatus());
            this.f16762yggfygwlhe.wflxmlrfwp(jMin);
            j13 -= jMin;
        }
    }

    public long wkgbmnqykc(gxszxtbevo bytes, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jOjitshcjhn = this.f16762yggfygwlhe.ojitshcjhn(bytes, j13);
            if (jOjitshcjhn != -1) {
                return jOjitshcjhn;
            }
            long jDsvhmnatus = this.f16762yggfygwlhe.dsvhmnatus();
            if (this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) == -1) {
                return -1L;
            }
            j13 = Math.max(j13, (jDsvhmnatus - ((long) bytes.hcddaimhww())) + 1);
        }
    }

    @Override // bl.eablkybsjg
    public int yggfygwlhe(iwizpuwonk options) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        if (this.f16761jyumaefscl) {
            throw new IllegalStateException("closed");
        }
        do {
            int iWkgbmnqykc = cl.gxszxtbevo.wkgbmnqykc(this.f16762yggfygwlhe, options, true);
            if (iWkgbmnqykc != -2) {
                if (iWkgbmnqykc == -1) {
                    break;
                }
                this.f16762yggfygwlhe.wflxmlrfwp(options.agtfadlqog()[iWkgbmnqykc].hcddaimhww());
                return iWkgbmnqykc;
            }
        } while (this.f16763zdlpuopuiu.fmlbqenlif(this.f16762yggfygwlhe, 8192L) != -1);
        return -1;
    }

    @Override // bl.eablkybsjg
    public String yzdjzghtvl(long j13) {
        grlcpdaxtj(j13);
        return this.f16762yggfygwlhe.yzdjzghtvl(j13);
    }

    @Override // bl.eablkybsjg, bl.wkgbmnqykc
    public ppxfxbqfkf zoijcleaow() {
        return this.f16762yggfygwlhe;
    }

    public static final class iobyxmoadg extends InputStream {
        iobyxmoadg() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            zynmafqrjb zynmafqrjbVar = zynmafqrjb.this;
            if (zynmafqrjbVar.f16761jyumaefscl) {
                throw new IOException("closed");
            }
            return (int) Math.min(zynmafqrjbVar.f16762yggfygwlhe.dsvhmnatus(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            zynmafqrjb.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            zynmafqrjb zynmafqrjbVar = zynmafqrjb.this;
            if (zynmafqrjbVar.f16761jyumaefscl) {
                throw new IOException("closed");
            }
            if (zynmafqrjbVar.f16762yggfygwlhe.dsvhmnatus() == 0) {
                zynmafqrjb zynmafqrjbVar2 = zynmafqrjb.this;
                if (zynmafqrjbVar2.f16763zdlpuopuiu.fmlbqenlif(zynmafqrjbVar2.f16762yggfygwlhe, 8192L) == -1) {
                    return -1;
                }
            }
            return zynmafqrjb.this.f16762yggfygwlhe.readByte() & 255;
        }

        public String toString() {
            return zynmafqrjb.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i13, int i14) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
            if (!zynmafqrjb.this.f16761jyumaefscl) {
                cllcsxoeiz.zoijcleaow(data.length, i13, i14);
                if (zynmafqrjb.this.f16762yggfygwlhe.dsvhmnatus() == 0) {
                    zynmafqrjb zynmafqrjbVar = zynmafqrjb.this;
                    if (zynmafqrjbVar.f16763zdlpuopuiu.fmlbqenlif(zynmafqrjbVar.f16762yggfygwlhe, 8192L) == -1) {
                        return -1;
                    }
                }
                return zynmafqrjb.this.f16762yggfygwlhe.zdlpuopuiu(data, i13, i14);
            }
            throw new IOException("closed");
        }
    }
}
