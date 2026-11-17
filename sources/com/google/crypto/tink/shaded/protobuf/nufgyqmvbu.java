package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu implements Iterable, Serializable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Comparator f23967iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final gxszxtbevo f23968jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final nufgyqmvbu f23969yggfygwlhe = new btonecajqb(esjtqupxsv.f23927wkgbmnqykc);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f23970zdlpuopuiu = 0;

    private static class btonecajqb extends dxjokdxxww {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        protected final byte[] f23971cqumvgiudr;

        btonecajqb(byte[] bArr) {
            bArr.getClass();
            this.f23971cqumvgiudr = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        protected final int cqumvgiudr(int i13, int i14, int i15) {
            return esjtqupxsv.nufgyqmvbu(i13, this.f23971cqumvgiudr, hkdspvbjdz() + i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu) || size() != ((nufgyqmvbu) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return obj.equals(this);
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            int iLereixgezr = lereixgezr();
            int iLereixgezr2 = btonecajqbVar.lereixgezr();
            if (iLereixgezr == 0 || iLereixgezr2 == 0 || iLereixgezr == iLereixgezr2) {
                return jpowsppfya(btonecajqbVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        final void hcddaimhww(com.google.crypto.tink.shaded.protobuf.lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.iobyxmoadg(this.f23971cqumvgiudr, hkdspvbjdz(), size());
        }

        protected int hkdspvbjdz() {
            return 0;
        }

        final boolean jpowsppfya(nufgyqmvbu nufgyqmvbuVar, int i13, int i14) {
            if (i14 > nufgyqmvbuVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i14 + size());
            }
            int i15 = i13 + i14;
            if (i15 > nufgyqmvbuVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i13 + ", " + i14 + ", " + nufgyqmvbuVar.size());
            }
            if (!(nufgyqmvbuVar instanceof btonecajqb)) {
                return nufgyqmvbuVar.pmvmpeiblj(i13, i15).equals(pmvmpeiblj(0, i14));
            }
            btonecajqb btonecajqbVar = (btonecajqb) nufgyqmvbuVar;
            byte[] bArr = this.f23971cqumvgiudr;
            byte[] bArr2 = btonecajqbVar.f23971cqumvgiudr;
            int iHkdspvbjdz = hkdspvbjdz() + i14;
            int iHkdspvbjdz2 = hkdspvbjdz();
            int iHkdspvbjdz3 = btonecajqbVar.hkdspvbjdz() + i13;
            while (iHkdspvbjdz2 < iHkdspvbjdz) {
                if (bArr[iHkdspvbjdz2] != bArr2[iHkdspvbjdz3]) {
                    return false;
                }
                iHkdspvbjdz2++;
                iHkdspvbjdz3++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public final com.google.crypto.tink.shaded.protobuf.dxjokdxxww jyumaefscl() {
            return com.google.crypto.tink.shaded.protobuf.dxjokdxxww.btonecajqb(this.f23971cqumvgiudr, hkdspvbjdz(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public final boolean kcexrzcfyt() {
            int iHkdspvbjdz = hkdspvbjdz();
            return ydmasvzmpa.agtfadlqog(this.f23971cqumvgiudr, iHkdspvbjdz, size() + iHkdspvbjdz);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public final nufgyqmvbu pmvmpeiblj(int i13, int i14) {
            int iBtonecajqb = nufgyqmvbu.btonecajqb(i13, i14, size());
            return iBtonecajqb == 0 ? nufgyqmvbu.f23969yggfygwlhe : new eablkybsjg(this.f23971cqumvgiudr, hkdspvbjdz() + i13, iBtonecajqb);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        protected void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15) {
            System.arraycopy(this.f23971cqumvgiudr, i13, bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public int size() {
            return this.f23971cqumvgiudr.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        byte vdvldrhtss(int i13) {
            return this.f23971cqumvgiudr[i13];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public byte wkgbmnqykc(int i13) {
            return this.f23971cqumvgiudr[i13];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        protected final String yadqdtsiqt(Charset charset) {
            return new String(this.f23971cqumvgiudr, hkdspvbjdz(), size(), charset);
        }
    }

    static abstract class dxjokdxxww extends nufgyqmvbu {
        dxjokdxxww() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.zdlpuopuiu();
        }
    }

    private static final class eablkybsjg extends btonecajqb {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f23972esjtqupxsv;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final int f23973lereixgezr;

        eablkybsjg(byte[] bArr, int i13, int i14) {
            super(bArr);
            nufgyqmvbu.btonecajqb(i13, i13 + i14, bArr.length);
            this.f23972esjtqupxsv = i13;
            this.f23973lereixgezr = i14;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.btonecajqb
        protected int hkdspvbjdz() {
            return this.f23972esjtqupxsv;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.btonecajqb, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        protected void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15) {
            System.arraycopy(this.f23971cqumvgiudr, hkdspvbjdz() + i13, bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.btonecajqb, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public int size() {
            return this.f23973lereixgezr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.btonecajqb, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        byte vdvldrhtss(int i13) {
            return this.f23971cqumvgiudr[this.f23972esjtqupxsv + i13];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.btonecajqb, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu
        public byte wkgbmnqykc(int i13) {
            nufgyqmvbu.dxjokdxxww(i13, size());
            return this.f23971cqumvgiudr[this.f23972esjtqupxsv + i13];
        }

        Object writeReplace() {
            return nufgyqmvbu.ylkuphrtab(zynmafqrjb());
        }
    }

    private static final class gtknphoqwx implements gxszxtbevo {
        private gtknphoqwx() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.gxszxtbevo
        public byte[] copyFrom(byte[] bArr, int i13, int i14) {
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            return bArr2;
        }

        /* synthetic */ gtknphoqwx(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private interface gxszxtbevo {
        byte[] copyFrom(byte[] bArr, int i13, int i14);
    }

    class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f23975yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f23976zdlpuopuiu = 0;

        iobyxmoadg() {
            this.f23975yggfygwlhe = nufgyqmvbu.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23976zdlpuopuiu < this.f23975yggfygwlhe;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.lqeggnwhkg
        public byte nextByte() {
            int i13 = this.f23976zdlpuopuiu;
            if (i13 >= this.f23975yggfygwlhe) {
                throw new NoSuchElementException();
            }
            this.f23976zdlpuopuiu = i13 + 1;
            return nufgyqmvbu.this.vdvldrhtss(i13);
        }
    }

    public interface lqeggnwhkg extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    static final class C0415nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CodedOutputStream f23977iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final byte[] f23978zoijcleaow;

        /* synthetic */ C0415nufgyqmvbu(int i13, iobyxmoadg iobyxmoadgVar) {
            this(i13);
        }

        public nufgyqmvbu iobyxmoadg() {
            this.f23977iobyxmoadg.ppxfxbqfkf();
            return new btonecajqb(this.f23978zoijcleaow);
        }

        public CodedOutputStream zoijcleaow() {
            return this.f23977iobyxmoadg;
        }

        private C0415nufgyqmvbu(int i13) {
            byte[] bArr = new byte[i13];
            this.f23978zoijcleaow = bArr;
            this.f23977iobyxmoadg = CodedOutputStream.ntlheqmsrt(bArr);
        }
    }

    static abstract class ppxfxbqfkf implements lqeggnwhkg {
        ppxfxbqfkf() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class wkgbmnqykc implements gxszxtbevo {
        private wkgbmnqykc() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.gxszxtbevo
        public byte[] copyFrom(byte[] bArr, int i13, int i14) {
            return Arrays.copyOfRange(bArr, i13, i14 + i13);
        }

        /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    class zoijcleaow implements Comparator {
        zoijcleaow() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
            lqeggnwhkg lqeggnwhkgVarZdlpuopuiu = nufgyqmvbuVar.zdlpuopuiu();
            lqeggnwhkg lqeggnwhkgVarZdlpuopuiu2 = nufgyqmvbuVar2.zdlpuopuiu();
            while (lqeggnwhkgVarZdlpuopuiu.hasNext() && lqeggnwhkgVarZdlpuopuiu2.hasNext()) {
                int iCompareTo = Integer.valueOf(nufgyqmvbu.istkbnxepw(lqeggnwhkgVarZdlpuopuiu.nextByte())).compareTo(Integer.valueOf(nufgyqmvbu.istkbnxepw(lqeggnwhkgVarZdlpuopuiu2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(nufgyqmvbuVar.size()).compareTo(Integer.valueOf(nufgyqmvbuVar2.size()));
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = null;
        f23968jyumaefscl = com.google.crypto.tink.shaded.protobuf.wkgbmnqykc.ppxfxbqfkf() ? new gtknphoqwx(iobyxmoadgVar) : new wkgbmnqykc(iobyxmoadgVar);
        f23967iwizpuwonk = new zoijcleaow();
    }

    nufgyqmvbu() {
    }

    public static nufgyqmvbu agtfadlqog(byte[] bArr, int i13, int i14) {
        btonecajqb(i13, i13 + i14, bArr.length);
        return new btonecajqb(f23968jyumaefscl.copyFrom(bArr, i13, i14));
    }

    static int btonecajqb(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i13 + " < 0");
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i13 + ", " + i14);
        }
        throw new IndexOutOfBoundsException("End index: " + i14 + " >= " + i15);
    }

    public static nufgyqmvbu draadjrbmk(byte[] bArr) {
        return agtfadlqog(bArr, 0, bArr.length);
    }

    static void dxjokdxxww(int i13, int i14) {
        if (((i14 - (i13 + 1)) | i13) < 0) {
            if (i13 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i13);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i13 + ", " + i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int istkbnxepw(byte b13) {
        return b13 & 255;
    }

    public static nufgyqmvbu ojitshcjhn(String str) {
        return new btonecajqb(str.getBytes(esjtqupxsv.f23928zoijcleaow));
    }

    static nufgyqmvbu pkzmftpjix(byte[] bArr, int i13, int i14) {
        return new eablkybsjg(bArr, i13, i14);
    }

    private String wwaezpbzkn() {
        if (size() <= 50) {
            return xrmfcynszj.iobyxmoadg(this);
        }
        return xrmfcynszj.iobyxmoadg(pmvmpeiblj(0, 47)) + "...";
    }

    static C0415nufgyqmvbu yggfygwlhe(int i13) {
        return new C0415nufgyqmvbu(i13, null);
    }

    static nufgyqmvbu ylkuphrtab(byte[] bArr) {
        return new btonecajqb(bArr);
    }

    public final String cdpycssgdh(Charset charset) {
        return size() == 0 ? "" : yadqdtsiqt(charset);
    }

    protected abstract int cqumvgiudr(int i13, int i14, int i15);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iCqumvgiudr = this.f23970zdlpuopuiu;
        if (iCqumvgiudr == 0) {
            int size = size();
            iCqumvgiudr = cqumvgiudr(size, 0, size);
            if (iCqumvgiudr == 0) {
                iCqumvgiudr = 1;
            }
            this.f23970zdlpuopuiu = iCqumvgiudr;
        }
        return iCqumvgiudr;
    }

    abstract void hcddaimhww(com.google.crypto.tink.shaded.protobuf.lqeggnwhkg lqeggnwhkgVar);

    public abstract com.google.crypto.tink.shaded.protobuf.dxjokdxxww jyumaefscl();

    public abstract boolean kcexrzcfyt();

    protected final int lereixgezr() {
        return this.f23970zdlpuopuiu;
    }

    public final String lmojexxdyd() {
        return cdpycssgdh(esjtqupxsv.f23928zoijcleaow);
    }

    public abstract nufgyqmvbu pmvmpeiblj(int i13, int i14);

    protected abstract void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), wwaezpbzkn());
    }

    abstract byte vdvldrhtss(int i13);

    public abstract byte wkgbmnqykc(int i13);

    protected abstract String yadqdtsiqt(Charset charset);

    public lqeggnwhkg zdlpuopuiu() {
        return new iobyxmoadg();
    }

    public final byte[] zynmafqrjb() {
        int size = size();
        if (size == 0) {
            return esjtqupxsv.f23927wkgbmnqykc;
        }
        byte[] bArr = new byte[size];
        rgvfuqvkyq(bArr, 0, 0, size);
        return bArr;
    }
}
