package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements eablkybsjg, wkgbmnqykc, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f16739yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public istkbnxepw f16740zdlpuopuiu;

    public static final class iobyxmoadg implements Closeable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public byte[] f16743iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private istkbnxepw f16745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public ppxfxbqfkf f16746zdlpuopuiu;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public long f16744jyumaefscl = -1;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public int f16741cqumvgiudr = -1;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public int f16742esjtqupxsv = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16746zdlpuopuiu == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f16746zdlpuopuiu = null;
            iobyxmoadg(null);
            this.f16744jyumaefscl = -1L;
            this.f16743iwizpuwonk = null;
            this.f16741cqumvgiudr = -1;
            this.f16742esjtqupxsv = -1;
        }

        public final void iobyxmoadg(istkbnxepw istkbnxepwVar) {
            this.f16745yggfygwlhe = istkbnxepwVar;
        }
    }

    /* JADX INFO: renamed from: bl.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C0300ppxfxbqfkf extends OutputStream {
        C0300ppxfxbqfkf() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return ppxfxbqfkf.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i13) {
            ppxfxbqfkf.this.o(i13);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
            ppxfxbqfkf.this.gtknphoqwx(data, i13, i14);
        }
    }

    @Override // bl.eablkybsjg
    public String F(Charset charset) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        return zynmafqrjb(this.f16739yggfygwlhe, charset);
    }

    @Override // bl.eablkybsjg
    public long H(gxszxtbevo bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        return ojitshcjhn(bytes, 0L);
    }

    @Override // bl.eablkybsjg
    public long P(iozdgvuglv sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        long jDsvhmnatus = dsvhmnatus();
        if (jDsvhmnatus > 0) {
            sink.zeieaojujs(this, jDsvhmnatus);
        }
        return jDsvhmnatus;
    }

    @Override // bl.eablkybsjg
    public long Q(gxszxtbevo targetBytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetBytes, "targetBytes");
        return rgvfuqvkyq(targetBytes, 0L);
    }

    @Override // bl.eablkybsjg
    public int R() {
        return cllcsxoeiz.gxszxtbevo(readInt());
    }

    public final byte agtfadlqog(long j13) {
        cllcsxoeiz.zoijcleaow(dsvhmnatus(), j13, 1L);
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(null);
            throw null;
        }
        if (dsvhmnatus() - j13 < j13) {
            long jDsvhmnatus = dsvhmnatus();
            while (jDsvhmnatus > j13) {
                istkbnxepwVar = istkbnxepwVar.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                jDsvhmnatus -= (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            return istkbnxepwVar.f16700iobyxmoadg[(int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus)];
        }
        long j14 = 0;
        while (true) {
            long j15 = ((long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow)) + j14;
            if (j15 > j13) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                return istkbnxepwVar.f16700iobyxmoadg[(int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - j14)];
            }
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            j14 = j15;
        }
    }

    @Override // bl.eablkybsjg
    public byte[] auzgnhcxok(long j13) throws EOFException {
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j13).toString());
        }
        if (dsvhmnatus() < j13) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j13];
        lereixgezr(bArr);
        return bArr;
    }

    public int cdpycssgdh() throws EOFException {
        int i13;
        int i14;
        int i15;
        if (dsvhmnatus() == 0) {
            throw new EOFException();
        }
        byte bAgtfadlqog = agtfadlqog(0L);
        if ((bAgtfadlqog & 128) == 0) {
            i13 = bAgtfadlqog & 127;
            i15 = 0;
            i14 = 1;
        } else if ((bAgtfadlqog & 224) == 192) {
            i13 = bAgtfadlqog & 31;
            i14 = 2;
            i15 = 128;
        } else if ((bAgtfadlqog & 240) == 224) {
            i13 = bAgtfadlqog & 15;
            i14 = 3;
            i15 = 2048;
        } else {
            if ((bAgtfadlqog & 248) != 240) {
                wflxmlrfwp(1L);
                return 65533;
            }
            i13 = bAgtfadlqog & 7;
            i14 = 4;
            i15 = 65536;
        }
        long j13 = i14;
        if (dsvhmnatus() < j13) {
            throw new EOFException("size < " + i14 + ": " + dsvhmnatus() + " (to read code point prefixed 0x" + cllcsxoeiz.dxjokdxxww(bAgtfadlqog) + ')');
        }
        for (int i16 = 1; i16 < i14; i16++) {
            long j14 = i16;
            byte bAgtfadlqog2 = agtfadlqog(j14);
            if ((bAgtfadlqog2 & 192) != 128) {
                wflxmlrfwp(j14);
                return 65533;
            }
            i13 = (i13 << 6) | (bAgtfadlqog2 & 63);
        }
        wflxmlrfwp(j13);
        if (i13 > 1114111) {
            return 65533;
        }
        if ((55296 > i13 || i13 >= 57344) && i13 >= i15) {
            return i13;
        }
        return 65533;
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public gxszxtbevo cqumvgiudr() {
        return d(dsvhmnatus());
    }

    public ppxfxbqfkf crxdokpmqz(wwaezpbzkn source, long j13) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        while (j13 > 0) {
            long jFmlbqenlif = source.fmlbqenlif(this, j13);
            if (jFmlbqenlif == -1) {
                throw new EOFException();
            }
            j13 -= jFmlbqenlif;
        }
        return this;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf ixidwrxhsl(long j13) {
        boolean z13;
        if (j13 == 0) {
            return o(48);
        }
        int i13 = 1;
        if (j13 < 0) {
            j13 = -j13;
            if (j13 < 0) {
                return metgxyhuhe("-9223372036854775808");
            }
            z13 = true;
        } else {
            z13 = false;
        }
        if (j13 < 100000000) {
            if (j13 < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                if (j13 >= 100) {
                    i13 = j13 < 1000 ? 3 : 4;
                } else if (j13 >= 10) {
                    i13 = 2;
                }
            } else if (j13 < 1000000) {
                i13 = j13 < 100000 ? 5 : 6;
            } else {
                i13 = j13 < 10000000 ? 7 : 8;
            }
        } else if (j13 < 1000000000000L) {
            if (j13 < 10000000000L) {
                i13 = j13 < 1000000000 ? 9 : 10;
            } else {
                i13 = j13 < 100000000000L ? 11 : 12;
            }
        } else if (j13 < 1000000000000000L) {
            if (j13 < 10000000000000L) {
                i13 = 13;
            } else {
                i13 = j13 < 100000000000000L ? 14 : 15;
            }
        } else if (j13 < 100000000000000000L) {
            i13 = j13 < 10000000000000000L ? 16 : 17;
        } else {
            i13 = j13 < 1000000000000000000L ? 18 : 19;
        }
        if (z13) {
            i13++;
        }
        istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(i13);
        byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
        int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf + i13;
        while (j13 != 0) {
            long j14 = 10;
            i14--;
            bArr[i14] = cl.gxszxtbevo.iobyxmoadg()[(int) (j13 % j14)];
            j13 /= j14;
        }
        if (z13) {
            bArr[i14 - 1] = 45;
        }
        istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += i13;
        hkdspvbjdz(dsvhmnatus() + ((long) i13));
        return this;
    }

    @Override // bl.eablkybsjg
    public gxszxtbevo d(long j13) throws EOFException {
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j13).toString());
        }
        if (dsvhmnatus() < j13) {
            throw new EOFException();
        }
        if (j13 < 4096) {
            return new gxszxtbevo(auzgnhcxok(j13));
        }
        gxszxtbevo gxszxtbevoVarMbcevpiqjq = mbcevpiqjq((int) j13);
        wflxmlrfwp(j13);
        return gxszxtbevoVarMbcevpiqjq;
    }

    public final ppxfxbqfkf draadjrbmk(ppxfxbqfkf out, long j13, long j14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(out, "out");
        cllcsxoeiz.zoijcleaow(dsvhmnatus(), j13, j14);
        if (j14 != 0) {
            out.hkdspvbjdz(out.dsvhmnatus() + j14);
            istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
            while (true) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                int i13 = istkbnxepwVar.f16702ppxfxbqfkf;
                int i14 = istkbnxepwVar.f16704zoijcleaow;
                if (j13 < i13 - i14) {
                    break;
                }
                j13 -= (long) (i13 - i14);
                istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            }
            while (j14 > 0) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                istkbnxepw istkbnxepwVarWkgbmnqykc = istkbnxepwVar.wkgbmnqykc();
                int i15 = istkbnxepwVarWkgbmnqykc.f16704zoijcleaow + ((int) j13);
                istkbnxepwVarWkgbmnqykc.f16704zoijcleaow = i15;
                istkbnxepwVarWkgbmnqykc.f16702ppxfxbqfkf = Math.min(i15 + ((int) j14), istkbnxepwVarWkgbmnqykc.f16702ppxfxbqfkf);
                istkbnxepw istkbnxepwVar2 = out.f16740zdlpuopuiu;
                if (istkbnxepwVar2 == null) {
                    istkbnxepwVarWkgbmnqykc.f16701lqeggnwhkg = istkbnxepwVarWkgbmnqykc;
                    istkbnxepwVarWkgbmnqykc.f16699gxszxtbevo = istkbnxepwVarWkgbmnqykc;
                    out.f16740zdlpuopuiu = istkbnxepwVarWkgbmnqykc;
                } else {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
                    istkbnxepw istkbnxepwVar3 = istkbnxepwVar2.f16701lqeggnwhkg;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
                    istkbnxepwVar3.ppxfxbqfkf(istkbnxepwVarWkgbmnqykc);
                }
                j14 -= (long) (istkbnxepwVarWkgbmnqykc.f16702ppxfxbqfkf - istkbnxepwVarWkgbmnqykc.f16704zoijcleaow);
                istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                j13 = 0;
            }
        }
        return this;
    }

    public final long dsvhmnatus() {
        return this.f16739yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppxfxbqfkf) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (dsvhmnatus() == ppxfxbqfkfVar.dsvhmnatus()) {
                if (dsvhmnatus() == 0) {
                    return true;
                }
                istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                istkbnxepw istkbnxepwVar2 = ppxfxbqfkfVar.f16740zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
                int i13 = istkbnxepwVar.f16704zoijcleaow;
                int i14 = istkbnxepwVar2.f16704zoijcleaow;
                long j13 = 0;
                while (j13 < dsvhmnatus()) {
                    long jMin = Math.min(istkbnxepwVar.f16702ppxfxbqfkf - i13, istkbnxepwVar2.f16702ppxfxbqfkf - i14);
                    long j14 = 0;
                    while (j14 < jMin) {
                        int i15 = i13 + 1;
                        int i16 = i14 + 1;
                        if (istkbnxepwVar.f16700iobyxmoadg[i13] == istkbnxepwVar2.f16700iobyxmoadg[i14]) {
                            j14++;
                            i13 = i15;
                            i14 = i16;
                        }
                    }
                    if (i13 == istkbnxepwVar.f16702ppxfxbqfkf) {
                        istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                        i13 = istkbnxepwVar.f16704zoijcleaow;
                    }
                    if (i14 == istkbnxepwVar2.f16702ppxfxbqfkf) {
                        istkbnxepwVar2 = istkbnxepwVar2.f16699gxszxtbevo;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
                        i14 = istkbnxepwVar2.f16704zoijcleaow;
                    }
                    j13 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // bl.eablkybsjg
    public long fiwbwshyhd() {
        return cllcsxoeiz.lqeggnwhkg(pmvmpeiblj());
    }

    @Override // bl.wkgbmnqykc, bl.iozdgvuglv, java.io.Flushable
    public void flush() {
    }

    @Override // bl.wwaezpbzkn
    public long fmlbqenlif(ppxfxbqfkf sink, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
        }
        if (dsvhmnatus() == 0) {
            return -1L;
        }
        if (j13 > dsvhmnatus()) {
            j13 = dsvhmnatus();
        }
        sink.zeieaojujs(this, j13);
        return j13;
    }

    @Override // bl.eablkybsjg
    public void grlcpdaxtj(long j13) throws EOFException {
        if (this.f16739yggfygwlhe < j13) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar == null) {
            return 0;
        }
        int i13 = 1;
        do {
            int i14 = istkbnxepwVar.f16702ppxfxbqfkf;
            for (int i15 = istkbnxepwVar.f16704zoijcleaow; i15 < i14; i15++) {
                i13 = (i13 * 31) + istkbnxepwVar.f16700iobyxmoadg[i15];
            }
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        } while (istkbnxepwVar != this.f16740zdlpuopuiu);
        return i13;
    }

    public final void hkdspvbjdz(long j13) {
        this.f16739yggfygwlhe = j13;
    }

    @Override // bl.eablkybsjg
    public long i0() throws EOFException {
        int i13;
        if (dsvhmnatus() == 0) {
            throw new EOFException();
        }
        int i14 = 0;
        boolean z13 = false;
        long j13 = 0;
        do {
            istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
            int i15 = istkbnxepwVar.f16704zoijcleaow;
            int i16 = istkbnxepwVar.f16702ppxfxbqfkf;
            while (i15 < i16) {
                byte b13 = bArr[i15];
                if (b13 >= 48 && b13 <= 57) {
                    i13 = b13 - 48;
                } else if (b13 >= 97 && b13 <= 102) {
                    i13 = b13 - 87;
                } else {
                    if (b13 < 65 || b13 > 70) {
                        if (i14 != 0) {
                            z13 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + cllcsxoeiz.dxjokdxxww(b13));
                    }
                    i13 = b13 - 55;
                }
                if (((-1152921504606846976L) & j13) != 0) {
                    throw new NumberFormatException("Number too large: " + new ppxfxbqfkf().I(j13).o(b13).istkbnxepw());
                }
                j13 = (j13 << 4) | ((long) i13);
                i15++;
                i14++;
            }
            if (i15 == i16) {
                this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
                cdpycssgdh.zoijcleaow(istkbnxepwVar);
            } else {
                istkbnxepwVar.f16704zoijcleaow = i15;
            }
            if (z13) {
                break;
            }
        } while (this.f16740zdlpuopuiu != null);
        hkdspvbjdz(dsvhmnatus() - ((long) i14));
        return j13;
    }

    @Override // bl.eablkybsjg
    public short igdgnonuha() {
        return cllcsxoeiz.nufgyqmvbu(readShort());
    }

    public final void iobyxmoadg() throws EOFException {
        wflxmlrfwp(dsvhmnatus());
    }

    @Override // bl.eablkybsjg
    public ppxfxbqfkf iozdgvuglv() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String istkbnxepw() {
        return zynmafqrjb(this.f16739yggfygwlhe, mj.wkgbmnqykc.f67326zoijcleaow);
    }

    public ppxfxbqfkf iyctptxqzt(String string, int i13, int i14, Charset charset) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        if (i13 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i13).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i14 + " < " + i13).toString());
        }
        if (i14 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i14 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(charset, mj.wkgbmnqykc.f67326zoijcleaow)) {
            return sflfametgt(string, i13, i14);
        }
        String strSubstring = string.substring(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        return gtknphoqwx(bytes, 0, bytes.length);
    }

    @Override // bl.eablkybsjg
    public InputStream j0() {
        return new zoijcleaow();
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf skhdrjzrfn(byte[] source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        return gtknphoqwx(source, 0, source.length);
    }

    public byte[] jyumaefscl() {
        return auzgnhcxok(dsvhmnatus());
    }

    public boolean kcexrzcfyt(long j13, gxszxtbevo bytes, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        if (j13 < 0 || i13 < 0 || i14 < 0 || dsvhmnatus() - j13 < i14 || bytes.hcddaimhww() - i13 < i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (agtfadlqog(((long) i15) + j13) != bytes.draadjrbmk(i13 + i15)) {
                return false;
            }
        }
        return true;
    }

    public void lereixgezr(byte[] sink) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        int i13 = 0;
        while (i13 < sink.length) {
            int iZdlpuopuiu = zdlpuopuiu(sink, i13, sink.length - i13);
            if (iZdlpuopuiu == -1) {
                throw new EOFException();
            }
            i13 += iZdlpuopuiu;
        }
    }

    public final long lqeggnwhkg() {
        long jDsvhmnatus = dsvhmnatus();
        if (jDsvhmnatus == 0) {
            return 0L;
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        istkbnxepw istkbnxepwVar2 = istkbnxepwVar.f16701lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
        int i13 = istkbnxepwVar2.f16702ppxfxbqfkf;
        if (i13 < 8192 && istkbnxepwVar2.f16698eablkybsjg) {
            jDsvhmnatus -= (long) (i13 - istkbnxepwVar2.f16704zoijcleaow);
        }
        return jDsvhmnatus;
    }

    @Override // bl.eablkybsjg
    public boolean lrnfpwlwnk(long j13) {
        return this.f16739yggfygwlhe >= j13;
    }

    public final gxszxtbevo mbcevpiqjq(int i13) {
        if (i13 == 0) {
            return gxszxtbevo.f16673cqumvgiudr;
        }
        cllcsxoeiz.zoijcleaow(dsvhmnatus(), 0L, i13);
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            int i17 = istkbnxepwVar.f16702ppxfxbqfkf;
            int i18 = istkbnxepwVar.f16704zoijcleaow;
            if (i17 == i18) {
                throw new AssertionError("s.limit == s.pos");
            }
            i15 += i17 - i18;
            i16++;
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
        }
        byte[][] bArr = new byte[i16][];
        int[] iArr = new int[i16 * 2];
        istkbnxepw istkbnxepwVar2 = this.f16740zdlpuopuiu;
        int i19 = 0;
        while (i14 < i13) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
            bArr[i19] = istkbnxepwVar2.f16700iobyxmoadg;
            i14 += istkbnxepwVar2.f16702ppxfxbqfkf - istkbnxepwVar2.f16704zoijcleaow;
            iArr[i19] = Math.min(i14, i13);
            iArr[i19 + i16] = istkbnxepwVar2.f16704zoijcleaow;
            istkbnxepwVar2.f16703wkgbmnqykc = true;
            i19++;
            istkbnxepwVar2 = istkbnxepwVar2.f16699gxszxtbevo;
        }
        return new yadqdtsiqt(bArr, iArr);
    }

    @Override // bl.eablkybsjg
    public boolean n() {
        return this.f16739yggfygwlhe == 0;
    }

    public final istkbnxepw ntlheqmsrt(int i13) {
        if (i13 < 1 || i13 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            istkbnxepw istkbnxepwVar2 = istkbnxepwVar.f16701lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
            return (istkbnxepwVar2.f16702ppxfxbqfkf + i13 > 8192 || !istkbnxepwVar2.f16698eablkybsjg) ? istkbnxepwVar2.ppxfxbqfkf(cdpycssgdh.ppxfxbqfkf()) : istkbnxepwVar2;
        }
        istkbnxepw istkbnxepwVarPpxfxbqfkf = cdpycssgdh.ppxfxbqfkf();
        this.f16740zdlpuopuiu = istkbnxepwVarPpxfxbqfkf;
        istkbnxepwVarPpxfxbqfkf.f16701lqeggnwhkg = istkbnxepwVarPpxfxbqfkf;
        istkbnxepwVarPpxfxbqfkf.f16699gxszxtbevo = istkbnxepwVarPpxfxbqfkf;
        return istkbnxepwVarPpxfxbqfkf;
    }

    public final ppxfxbqfkf nufgyqmvbu() {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        if (dsvhmnatus() != 0) {
            istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            istkbnxepw istkbnxepwVarWkgbmnqykc = istkbnxepwVar.wkgbmnqykc();
            ppxfxbqfkfVar.f16740zdlpuopuiu = istkbnxepwVarWkgbmnqykc;
            istkbnxepwVarWkgbmnqykc.f16701lqeggnwhkg = istkbnxepwVarWkgbmnqykc;
            istkbnxepwVarWkgbmnqykc.f16699gxszxtbevo = istkbnxepwVarWkgbmnqykc;
            for (istkbnxepw istkbnxepwVar2 = istkbnxepwVar.f16699gxszxtbevo; istkbnxepwVar2 != istkbnxepwVar; istkbnxepwVar2 = istkbnxepwVar2.f16699gxszxtbevo) {
                istkbnxepw istkbnxepwVar3 = istkbnxepwVarWkgbmnqykc.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
                istkbnxepwVar3.ppxfxbqfkf(istkbnxepwVar2.wkgbmnqykc());
            }
            ppxfxbqfkfVar.hkdspvbjdz(dsvhmnatus());
        }
        return ppxfxbqfkfVar;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf metgxyhuhe(String string) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        return sflfametgt(string, 0, string.length());
    }

    public long ojitshcjhn(gxszxtbevo bytes, long j13) {
        int i13;
        long j14 = j13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        if (bytes.hcddaimhww() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long jDsvhmnatus = 0;
        if (j14 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j14).toString());
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar != null) {
            if (dsvhmnatus() - j14 < j14) {
                jDsvhmnatus = dsvhmnatus();
                while (jDsvhmnatus > j14) {
                    istkbnxepwVar = istkbnxepwVar.f16701lqeggnwhkg;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    jDsvhmnatus -= (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                }
                byte[] bArrLereixgezr = bytes.lereixgezr();
                byte b13 = bArrLereixgezr[0];
                int iHcddaimhww = bytes.hcddaimhww();
                long jDsvhmnatus2 = (dsvhmnatus() - ((long) iHcddaimhww)) + 1;
                while (jDsvhmnatus < jDsvhmnatus2) {
                    byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
                    long j15 = jDsvhmnatus2;
                    int iMin = (int) Math.min(istkbnxepwVar.f16702ppxfxbqfkf, (((long) istkbnxepwVar.f16704zoijcleaow) + jDsvhmnatus2) - jDsvhmnatus);
                    i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j14) - jDsvhmnatus);
                    while (i13 < iMin) {
                        if (bArr[i13] == b13 && cl.gxszxtbevo.zoijcleaow(istkbnxepwVar, i13 + 1, bArrLereixgezr, 1, iHcddaimhww)) {
                            return ((long) (i13 - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
                        }
                        i13++;
                    }
                    jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                    istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    j14 = jDsvhmnatus;
                    jDsvhmnatus2 = j15;
                }
            } else {
                while (true) {
                    long j16 = ((long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
                    if (j16 > j14) {
                        break;
                    }
                    istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    jDsvhmnatus = j16;
                }
                byte[] bArrLereixgezr2 = bytes.lereixgezr();
                byte b14 = bArrLereixgezr2[0];
                int iHcddaimhww2 = bytes.hcddaimhww();
                long jDsvhmnatus3 = (dsvhmnatus() - ((long) iHcddaimhww2)) + 1;
                while (jDsvhmnatus < jDsvhmnatus3) {
                    byte[] bArr2 = istkbnxepwVar.f16700iobyxmoadg;
                    int iMin2 = (int) Math.min(istkbnxepwVar.f16702ppxfxbqfkf, (((long) istkbnxepwVar.f16704zoijcleaow) + jDsvhmnatus3) - jDsvhmnatus);
                    i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j14) - jDsvhmnatus);
                    while (i13 < iMin2) {
                        if (bArr2[i13] == b14 && cl.gxszxtbevo.zoijcleaow(istkbnxepwVar, i13 + 1, bArrLereixgezr2, 1, iHcddaimhww2)) {
                            return ((long) (i13 - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
                        }
                        i13++;
                    }
                    jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                    istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    j14 = jDsvhmnatus;
                }
            }
        }
        return -1L;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf gtknphoqwx(byte[] source, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        long j13 = i14;
        cllcsxoeiz.zoijcleaow(source.length, i13, j13);
        int i15 = i14 + i13;
        while (i13 < i15) {
            istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(1);
            int iMin = Math.min(i15 - i13, 8192 - istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf);
            int i16 = i13 + iMin;
            hg.agtfadlqog.dxjokdxxww(source, istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg, istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf, i13, i16);
            istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += iMin;
            i13 = i16;
        }
        hkdspvbjdz(dsvhmnatus() + j13);
        return this;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf j(int i13) {
        istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(2);
        byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
        int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
        bArr[i14] = (byte) ((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14 + 1] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf = i14 + 2;
        hkdspvbjdz(dsvhmnatus() + 2);
        return this;
    }

    @Override // bl.eablkybsjg
    public eablkybsjg peek() {
        return zdlpuopuiu.ppxfxbqfkf(new lereixgezr(this));
    }

    public long pmvmpeiblj() throws EOFException {
        if (dsvhmnatus() < 8) {
            throw new EOFException();
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16704zoijcleaow;
        int i14 = istkbnxepwVar.f16702ppxfxbqfkf;
        if (i14 - i13 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
        int i15 = i13 + 7;
        long j13 = ((((long) bArr[i13]) & 255) << 56) | ((((long) bArr[i13 + 1]) & 255) << 48) | ((((long) bArr[i13 + 2]) & 255) << 40) | ((((long) bArr[i13 + 3]) & 255) << 32) | ((((long) bArr[i13 + 4]) & 255) << 24) | ((((long) bArr[i13 + 5]) & 255) << 16) | ((((long) bArr[i13 + 6]) & 255) << 8);
        int i16 = i13 + 8;
        long j14 = j13 | (((long) bArr[i15]) & 255);
        hkdspvbjdz(dsvhmnatus() - 8);
        if (i16 == i14) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        } else {
            istkbnxepwVar.f16704zoijcleaow = i16;
        }
        return j14;
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return ylkuphrtab.f16756eablkybsjg;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
        sink.put(istkbnxepwVar.f16700iobyxmoadg, istkbnxepwVar.f16704zoijcleaow, iMin);
        int i13 = istkbnxepwVar.f16704zoijcleaow + iMin;
        istkbnxepwVar.f16704zoijcleaow = i13;
        this.f16739yggfygwlhe -= (long) iMin;
        if (i13 == istkbnxepwVar.f16702ppxfxbqfkf) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        }
        return iMin;
    }

    @Override // bl.eablkybsjg
    public byte readByte() {
        if (dsvhmnatus() == 0) {
            throw new EOFException();
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16704zoijcleaow;
        int i14 = istkbnxepwVar.f16702ppxfxbqfkf;
        int i15 = i13 + 1;
        byte b13 = istkbnxepwVar.f16700iobyxmoadg[i13];
        hkdspvbjdz(dsvhmnatus() - 1);
        if (i15 == i14) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        } else {
            istkbnxepwVar.f16704zoijcleaow = i15;
        }
        return b13;
    }

    @Override // bl.eablkybsjg
    public int readInt() throws EOFException {
        if (dsvhmnatus() < 4) {
            throw new EOFException();
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16704zoijcleaow;
        int i14 = istkbnxepwVar.f16702ppxfxbqfkf;
        if (i14 - i13 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
        int i15 = i13 + 3;
        int i16 = ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 2] & 255) << 8);
        int i17 = i13 + 4;
        int i18 = (bArr[i15] & 255) | i16;
        hkdspvbjdz(dsvhmnatus() - 4);
        if (i17 == i14) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        } else {
            istkbnxepwVar.f16704zoijcleaow = i17;
        }
        return i18;
    }

    @Override // bl.eablkybsjg
    public short readShort() throws EOFException {
        if (dsvhmnatus() < 2) {
            throw new EOFException();
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16704zoijcleaow;
        int i14 = istkbnxepwVar.f16702ppxfxbqfkf;
        if (i14 - i13 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
        int i15 = i13 + 1;
        int i16 = (bArr[i13] & 255) << 8;
        int i17 = i13 + 2;
        int i18 = (bArr[i15] & 255) | i16;
        hkdspvbjdz(dsvhmnatus() - 2);
        if (i17 == i14) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        } else {
            istkbnxepwVar.f16704zoijcleaow = i17;
        }
        return (short) i18;
    }

    public long rgvfuqvkyq(gxszxtbevo targetBytes, long j13) {
        int i13;
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetBytes, "targetBytes");
        long jDsvhmnatus = 0;
        if (j13 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j13).toString());
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar == null) {
            return -1L;
        }
        if (dsvhmnatus() - j13 < j13) {
            jDsvhmnatus = dsvhmnatus();
            while (jDsvhmnatus > j13) {
                istkbnxepwVar = istkbnxepwVar.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                jDsvhmnatus -= (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            }
            if (targetBytes.hcddaimhww() == 2) {
                byte bDraadjrbmk = targetBytes.draadjrbmk(0);
                byte bDraadjrbmk2 = targetBytes.draadjrbmk(1);
                while (jDsvhmnatus < dsvhmnatus()) {
                    byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
                    i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
                    int i15 = istkbnxepwVar.f16702ppxfxbqfkf;
                    while (true) {
                        if (i13 >= i15) {
                            jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                            j13 = jDsvhmnatus;
                        } else {
                            byte b13 = bArr[i13];
                            if (b13 == bDraadjrbmk || b13 == bDraadjrbmk2) {
                                i14 = istkbnxepwVar.f16704zoijcleaow;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrLereixgezr = targetBytes.lereixgezr();
            while (jDsvhmnatus < dsvhmnatus()) {
                byte[] bArr2 = istkbnxepwVar.f16700iobyxmoadg;
                i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
                int i16 = istkbnxepwVar.f16702ppxfxbqfkf;
                while (true) {
                    if (i13 < i16) {
                        byte b14 = bArr2[i13];
                        int length = bArrLereixgezr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                i13++;
                            } else if (b14 == bArrLereixgezr[i17]) {
                                i14 = istkbnxepwVar.f16704zoijcleaow;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                        istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                        j13 = jDsvhmnatus;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
            if (j14 > j13) {
                break;
            }
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            jDsvhmnatus = j14;
        }
        if (targetBytes.hcddaimhww() == 2) {
            byte bDraadjrbmk3 = targetBytes.draadjrbmk(0);
            byte bDraadjrbmk4 = targetBytes.draadjrbmk(1);
            while (jDsvhmnatus < dsvhmnatus()) {
                byte[] bArr3 = istkbnxepwVar.f16700iobyxmoadg;
                i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
                int i18 = istkbnxepwVar.f16702ppxfxbqfkf;
                while (true) {
                    if (i13 >= i18) {
                        jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                        istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                        j13 = jDsvhmnatus;
                    } else {
                        byte b15 = bArr3[i13];
                        if (b15 == bDraadjrbmk3 || b15 == bDraadjrbmk4) {
                            i14 = istkbnxepwVar.f16704zoijcleaow;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrLereixgezr2 = targetBytes.lereixgezr();
        while (jDsvhmnatus < dsvhmnatus()) {
            byte[] bArr4 = istkbnxepwVar.f16700iobyxmoadg;
            i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
            int i19 = istkbnxepwVar.f16702ppxfxbqfkf;
            while (true) {
                if (i13 < i19) {
                    byte b16 = bArr4[i13];
                    int length2 = bArrLereixgezr2.length;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= length2) {
                            i13++;
                        } else if (b16 == bArrLereixgezr2[i23]) {
                            i14 = istkbnxepwVar.f16704zoijcleaow;
                        } else {
                            i23++;
                        }
                    }
                } else {
                    jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                    istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    j13 = jDsvhmnatus;
                }
            }
        }
        return -1L;
        return ((long) (i13 - i14)) + jDsvhmnatus;
    }

    @Override // bl.eablkybsjg
    public String ribwqtqdhb(long j13) throws EOFException {
        if (j13 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j13).toString());
        }
        long j14 = j13 != Long.MAX_VALUE ? j13 + 1 : Long.MAX_VALUE;
        long jSopmlzcsov = sopmlzcsov((byte) 10, 0L, j14);
        if (jSopmlzcsov != -1) {
            return cl.gxszxtbevo.ppxfxbqfkf(this, jSopmlzcsov);
        }
        if (j14 < dsvhmnatus() && agtfadlqog(j14 - 1) == 13 && agtfadlqog(j14) == 10) {
            return cl.gxszxtbevo.ppxfxbqfkf(this, j14);
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        draadjrbmk(ppxfxbqfkfVar, 0L, Math.min(32, dsvhmnatus()));
        throw new EOFException("\\n not found: limit=" + Math.min(dsvhmnatus(), j13) + " content=" + ppxfxbqfkfVar.cqumvgiudr().kcexrzcfyt() + (char) 8230);
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf o(int i13) {
        istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(1);
        byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
        int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
        istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf = i14 + 1;
        bArr[i14] = (byte) i13;
        hkdspvbjdz(dsvhmnatus() + 1);
        return this;
    }

    @Override // bl.eablkybsjg
    public String roivzttewh() {
        return ribwqtqdhb(Long.MAX_VALUE);
    }

    @Override // bl.eablkybsjg
    public long sopmlzcsov(byte b13, long j13, long j14) {
        istkbnxepw istkbnxepwVar;
        int i13;
        long jDsvhmnatus = 0;
        if (0 > j13 || j13 > j14) {
            throw new IllegalArgumentException(("size=" + dsvhmnatus() + " fromIndex=" + j13 + " toIndex=" + j14).toString());
        }
        if (j14 > dsvhmnatus()) {
            j14 = dsvhmnatus();
        }
        if (j13 == j14 || (istkbnxepwVar = this.f16740zdlpuopuiu) == null) {
            return -1L;
        }
        if (dsvhmnatus() - j13 < j13) {
            jDsvhmnatus = dsvhmnatus();
            while (jDsvhmnatus > j13) {
                istkbnxepwVar = istkbnxepwVar.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                jDsvhmnatus -= (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            }
            while (jDsvhmnatus < j14) {
                byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
                int iMin = (int) Math.min(istkbnxepwVar.f16702ppxfxbqfkf, (((long) istkbnxepwVar.f16704zoijcleaow) + j14) - jDsvhmnatus);
                i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
                while (i13 < iMin) {
                    if (bArr[i13] != b13) {
                        i13++;
                    }
                }
                jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                j13 = jDsvhmnatus;
            }
            return -1L;
        }
        while (true) {
            long j15 = ((long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
            if (j15 > j13) {
                break;
            }
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            jDsvhmnatus = j15;
        }
        while (jDsvhmnatus < j14) {
            byte[] bArr2 = istkbnxepwVar.f16700iobyxmoadg;
            int iMin2 = (int) Math.min(istkbnxepwVar.f16702ppxfxbqfkf, (((long) istkbnxepwVar.f16704zoijcleaow) + j14) - jDsvhmnatus);
            i13 = (int) ((((long) istkbnxepwVar.f16704zoijcleaow) + j13) - jDsvhmnatus);
            while (i13 < iMin2) {
                if (bArr2[i13] != b13) {
                    i13++;
                }
            }
            jDsvhmnatus += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
            j13 = jDsvhmnatus;
        }
        return -1L;
        return ((long) (i13 - istkbnxepwVar.f16704zoijcleaow)) + jDsvhmnatus;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf sflfametgt(String string, int i13, int i14) {
        char cCharAt;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        if (i13 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i13).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i14 + " < " + i13).toString());
        }
        if (i14 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i14 + " > " + string.length()).toString());
        }
        while (i13 < i14) {
            char cCharAt2 = string.charAt(i13);
            if (cCharAt2 < 128) {
                istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(1);
                byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
                int i15 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf - i13;
                int iMin = Math.min(i14, 8192 - i15);
                int i16 = i13 + 1;
                bArr[i13 + i15] = (byte) cCharAt2;
                while (true) {
                    i13 = i16;
                    if (i13 >= iMin || (cCharAt = string.charAt(i13)) >= 128) {
                        break;
                    }
                    i16 = i13 + 1;
                    bArr[i13 + i15] = (byte) cCharAt;
                }
                int i17 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
                int i18 = (i15 + i13) - i17;
                istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf = i17 + i18;
                hkdspvbjdz(dsvhmnatus() + ((long) i18));
            } else {
                if (cCharAt2 < 2048) {
                    istkbnxepw istkbnxepwVarNtlheqmsrt2 = ntlheqmsrt(2);
                    byte[] bArr2 = istkbnxepwVarNtlheqmsrt2.f16700iobyxmoadg;
                    int i19 = istkbnxepwVarNtlheqmsrt2.f16702ppxfxbqfkf;
                    bArr2[i19] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i19 + 1] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    istkbnxepwVarNtlheqmsrt2.f16702ppxfxbqfkf = i19 + 2;
                    hkdspvbjdz(dsvhmnatus() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    istkbnxepw istkbnxepwVarNtlheqmsrt3 = ntlheqmsrt(3);
                    byte[] bArr3 = istkbnxepwVarNtlheqmsrt3.f16700iobyxmoadg;
                    int i23 = istkbnxepwVarNtlheqmsrt3.f16702ppxfxbqfkf;
                    bArr3[i23] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i23 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    bArr3[i23 + 2] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    istkbnxepwVarNtlheqmsrt3.f16702ppxfxbqfkf = i23 + 3;
                    hkdspvbjdz(dsvhmnatus() + 3);
                } else {
                    int i24 = i13 + 1;
                    char cCharAt3 = i24 < i14 ? string.charAt(i24) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        o(63);
                        i13 = i24;
                    } else {
                        int i25 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        istkbnxepw istkbnxepwVarNtlheqmsrt4 = ntlheqmsrt(4);
                        byte[] bArr4 = istkbnxepwVarNtlheqmsrt4.f16700iobyxmoadg;
                        int i26 = istkbnxepwVarNtlheqmsrt4.f16702ppxfxbqfkf;
                        bArr4[i26] = (byte) ((i25 >> 18) | 240);
                        bArr4[i26 + 1] = (byte) (((i25 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i26 + 2] = (byte) (((i25 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i26 + 3] = (byte) ((i25 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        istkbnxepwVarNtlheqmsrt4.f16702ppxfxbqfkf = i26 + 4;
                        hkdspvbjdz(dsvhmnatus() + 4);
                        i13 += 2;
                    }
                }
                i13++;
            }
        }
        return this;
    }

    public String toString() {
        return wypolnanlu().toString();
    }

    @Override // bl.eablkybsjg
    public boolean tzroggbefp(long j13, gxszxtbevo bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        return kcexrzcfyt(j13, bytes, 0, bytes.hcddaimhww());
    }

    public ppxfxbqfkf uawqvzlxes(int i13) {
        if (i13 < 128) {
            o(i13);
        } else if (i13 < 2048) {
            istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(2);
            byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
            int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
            bArr[i14] = (byte) ((i13 >> 6) | 192);
            bArr[i14 + 1] = (byte) ((i13 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf = i14 + 2;
            hkdspvbjdz(dsvhmnatus() + 2);
        } else if (55296 <= i13 && i13 < 57344) {
            o(63);
        } else if (i13 < 65536) {
            istkbnxepw istkbnxepwVarNtlheqmsrt2 = ntlheqmsrt(3);
            byte[] bArr2 = istkbnxepwVarNtlheqmsrt2.f16700iobyxmoadg;
            int i15 = istkbnxepwVarNtlheqmsrt2.f16702ppxfxbqfkf;
            bArr2[i15] = (byte) ((i13 >> 12) | 224);
            bArr2[i15 + 1] = (byte) (((i13 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr2[i15 + 2] = (byte) ((i13 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            istkbnxepwVarNtlheqmsrt2.f16702ppxfxbqfkf = i15 + 3;
            hkdspvbjdz(dsvhmnatus() + 3);
        } else {
            if (i13 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + cllcsxoeiz.btonecajqb(i13));
            }
            istkbnxepw istkbnxepwVarNtlheqmsrt3 = ntlheqmsrt(4);
            byte[] bArr3 = istkbnxepwVarNtlheqmsrt3.f16700iobyxmoadg;
            int i16 = istkbnxepwVarNtlheqmsrt3.f16702ppxfxbqfkf;
            bArr3[i16] = (byte) ((i13 >> 18) | 240);
            bArr3[i16 + 1] = (byte) (((i13 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[i16 + 2] = (byte) (((i13 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[i16 + 3] = (byte) ((i13 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            istkbnxepwVarNtlheqmsrt3.f16702ppxfxbqfkf = i16 + 4;
            hkdspvbjdz(dsvhmnatus() + 4);
        }
        return this;
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf t(gxszxtbevo byteString) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(byteString, "byteString");
        byteString.stevsuqkhv(this, 0, byteString.hcddaimhww());
        return this;
    }

    public OutputStream vdvldrhtss() {
        return new C0300ppxfxbqfkf();
    }

    public ppxfxbqfkf weqkydbzbr(String string, Charset charset) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        return iyctptxqzt(string, 0, string.length(), charset);
    }

    @Override // bl.eablkybsjg
    public void wflxmlrfwp(long j13) throws EOFException {
        while (j13 > 0) {
            istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
            if (istkbnxepwVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j13, istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
            long j14 = iMin;
            hkdspvbjdz(dsvhmnatus() - j14);
            j13 -= j14;
            int i13 = istkbnxepwVar.f16704zoijcleaow + iMin;
            istkbnxepwVar.f16704zoijcleaow = i13;
            if (i13 == istkbnxepwVar.f16702ppxfxbqfkf) {
                this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
                cdpycssgdh.zoijcleaow(istkbnxepwVar);
            }
        }
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf clone() {
        return nufgyqmvbu();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        int iRemaining = source.remaining();
        int i13 = iRemaining;
        while (i13 > 0) {
            istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(1);
            int iMin = Math.min(i13, 8192 - istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf);
            source.get(istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg, istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf, iMin);
            i13 -= iMin;
            istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += iMin;
        }
        this.f16739yggfygwlhe += (long) iRemaining;
        return iRemaining;
    }

    public final gxszxtbevo wypolnanlu() {
        if (dsvhmnatus() <= 2147483647L) {
            return mbcevpiqjq((int) dsvhmnatus());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + dsvhmnatus()).toString());
    }

    public long xrmfcynszj(wwaezpbzkn source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        long j13 = 0;
        while (true) {
            long jFmlbqenlif = source.fmlbqenlif(this, 8192L);
            if (jFmlbqenlif == -1) {
                return j13;
            }
            j13 += jFmlbqenlif;
        }
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf I(long j13) {
        if (j13 == 0) {
            return o(48);
        }
        long j14 = (j13 >>> 1) | j13;
        long j15 = j14 | (j14 >>> 2);
        long j16 = j15 | (j15 >>> 4);
        long j17 = j16 | (j16 >>> 8);
        long j18 = j17 | (j17 >>> 16);
        long j19 = j18 | (j18 >>> 32);
        long j23 = j19 - ((j19 >>> 1) & 6148914691236517205L);
        long j24 = ((j23 >>> 2) & 3689348814741910323L) + (j23 & 3689348814741910323L);
        long j25 = ((j24 >>> 4) + j24) & 1085102592571150095L;
        long j26 = j25 + (j25 >>> 8);
        long j27 = j26 + (j26 >>> 16);
        int i13 = (int) ((((j27 & 63) + ((j27 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(i13);
        byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
        int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
        for (int i15 = (i14 + i13) - 1; i15 >= i14; i15--) {
            bArr[i15] = cl.gxszxtbevo.iobyxmoadg()[(int) (15 & j13)];
            j13 >>>= 4;
        }
        istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += i13;
        hkdspvbjdz(dsvhmnatus() + ((long) i13));
        return this;
    }

    @Override // bl.eablkybsjg
    public int yggfygwlhe(iwizpuwonk options) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        int iEablkybsjg = cl.gxszxtbevo.eablkybsjg(this, options, false, 2, null);
        if (iEablkybsjg == -1) {
            return -1;
        }
        wflxmlrfwp(options.agtfadlqog()[iEablkybsjg].hcddaimhww());
        return iEablkybsjg;
    }

    @Override // bl.eablkybsjg
    public String yzdjzghtvl(long j13) throws EOFException {
        return zynmafqrjb(j13, mj.wkgbmnqykc.f67326zoijcleaow);
    }

    public int zdlpuopuiu(byte[] sink, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        cllcsxoeiz.zoijcleaow(sink.length, i13, i14);
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        if (istkbnxepwVar == null) {
            return -1;
        }
        int iMin = Math.min(i14, istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
        byte[] bArr = istkbnxepwVar.f16700iobyxmoadg;
        int i15 = istkbnxepwVar.f16704zoijcleaow;
        hg.agtfadlqog.dxjokdxxww(bArr, sink, i13, i15, i15 + iMin);
        istkbnxepwVar.f16704zoijcleaow += iMin;
        hkdspvbjdz(dsvhmnatus() - ((long) iMin));
        if (istkbnxepwVar.f16704zoijcleaow == istkbnxepwVar.f16702ppxfxbqfkf) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        }
        return iMin;
    }

    @Override // bl.iozdgvuglv
    public void zeieaojujs(ppxfxbqfkf source, long j13) {
        istkbnxepw istkbnxepwVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        cllcsxoeiz.zoijcleaow(source.dsvhmnatus(), 0L, j13);
        while (j13 > 0) {
            istkbnxepw istkbnxepwVar2 = source.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
            int i13 = istkbnxepwVar2.f16702ppxfxbqfkf;
            istkbnxepw istkbnxepwVar3 = source.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
            if (j13 < i13 - istkbnxepwVar3.f16704zoijcleaow) {
                istkbnxepw istkbnxepwVar4 = this.f16740zdlpuopuiu;
                if (istkbnxepwVar4 != null) {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar4);
                    istkbnxepwVar = istkbnxepwVar4.f16701lqeggnwhkg;
                } else {
                    istkbnxepwVar = null;
                }
                if (istkbnxepwVar != null && istkbnxepwVar.f16698eablkybsjg) {
                    if ((((long) istkbnxepwVar.f16702ppxfxbqfkf) + j13) - ((long) (istkbnxepwVar.f16703wkgbmnqykc ? 0 : istkbnxepwVar.f16704zoijcleaow)) <= 8192) {
                        istkbnxepw istkbnxepwVar5 = source.f16740zdlpuopuiu;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar5);
                        istkbnxepwVar5.gxszxtbevo(istkbnxepwVar, (int) j13);
                        source.hkdspvbjdz(source.dsvhmnatus() - j13);
                        hkdspvbjdz(dsvhmnatus() + j13);
                        return;
                    }
                }
                istkbnxepw istkbnxepwVar6 = source.f16740zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar6);
                source.f16740zdlpuopuiu = istkbnxepwVar6.eablkybsjg((int) j13);
            }
            istkbnxepw istkbnxepwVar7 = source.f16740zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar7);
            long j14 = istkbnxepwVar7.f16702ppxfxbqfkf - istkbnxepwVar7.f16704zoijcleaow;
            source.f16740zdlpuopuiu = istkbnxepwVar7.zoijcleaow();
            istkbnxepw istkbnxepwVar8 = this.f16740zdlpuopuiu;
            if (istkbnxepwVar8 == null) {
                this.f16740zdlpuopuiu = istkbnxepwVar7;
                istkbnxepwVar7.f16701lqeggnwhkg = istkbnxepwVar7;
                istkbnxepwVar7.f16699gxszxtbevo = istkbnxepwVar7;
            } else {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar8);
                istkbnxepw istkbnxepwVar9 = istkbnxepwVar8.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar9);
                istkbnxepwVar9.ppxfxbqfkf(istkbnxepwVar7).iobyxmoadg();
            }
            source.hkdspvbjdz(source.dsvhmnatus() - j14);
            hkdspvbjdz(dsvhmnatus() + j14);
            j13 -= j14;
        }
    }

    @Override // bl.wkgbmnqykc
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf hcddaimhww(int i13) {
        istkbnxepw istkbnxepwVarNtlheqmsrt = ntlheqmsrt(4);
        byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
        int i14 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
        bArr[i14] = (byte) ((i13 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14 + 1] = (byte) ((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14 + 2] = (byte) ((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14 + 3] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf = i14 + 4;
        hkdspvbjdz(dsvhmnatus() + 4);
        return this;
    }

    @Override // bl.eablkybsjg, bl.wkgbmnqykc
    public ppxfxbqfkf zoijcleaow() {
        return this;
    }

    public String zynmafqrjb(long j13, Charset charset) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j13).toString());
        }
        if (this.f16739yggfygwlhe < j13) {
            throw new EOFException();
        }
        if (j13 == 0) {
            return "";
        }
        istkbnxepw istkbnxepwVar = this.f16740zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        int i13 = istkbnxepwVar.f16704zoijcleaow;
        if (((long) i13) + j13 > istkbnxepwVar.f16702ppxfxbqfkf) {
            return new String(auzgnhcxok(j13), charset);
        }
        int i14 = (int) j13;
        String str = new String(istkbnxepwVar.f16700iobyxmoadg, i13, i14, charset);
        int i15 = istkbnxepwVar.f16704zoijcleaow + i14;
        istkbnxepwVar.f16704zoijcleaow = i15;
        this.f16739yggfygwlhe -= j13;
        if (i15 == istkbnxepwVar.f16702ppxfxbqfkf) {
            this.f16740zdlpuopuiu = istkbnxepwVar.zoijcleaow();
            cdpycssgdh.zoijcleaow(istkbnxepwVar);
        }
        return str;
    }

    public static final class zoijcleaow extends InputStream {
        zoijcleaow() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(ppxfxbqfkf.this.dsvhmnatus(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (ppxfxbqfkf.this.dsvhmnatus() > 0) {
                return ppxfxbqfkf.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return ppxfxbqfkf.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
            return ppxfxbqfkf.this.zdlpuopuiu(sink, i13, i14);
        }
    }
}
