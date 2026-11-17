package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo implements Iterable, Serializable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Comparator f8640iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final InterfaceC0139gxszxtbevo f8641jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final gxszxtbevo f8642yggfygwlhe = new dxjokdxxww(zdlpuopuiu.f8903ppxfxbqfkf);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f8643zdlpuopuiu = 0;

    private static final class btonecajqb implements InterfaceC0139gxszxtbevo {
        private btonecajqb() {
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.InterfaceC0139gxszxtbevo
        public byte[] copyFrom(byte[] bArr, int i13, int i14) {
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            return bArr2;
        }

        /* synthetic */ btonecajqb(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private static class dxjokdxxww extends nufgyqmvbu {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        protected final byte[] f8644cqumvgiudr;

        dxjokdxxww(byte[] bArr) {
            bArr.getClass();
            this.f8644cqumvgiudr = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        public final gxszxtbevo cqumvgiudr(int i13, int i14) {
            int iBtonecajqb = gxszxtbevo.btonecajqb(i13, i14, size());
            return iBtonecajqb == 0 ? gxszxtbevo.f8642yggfygwlhe : new eablkybsjg(this.f8644cqumvgiudr, pkzmftpjix() + i13, iBtonecajqb);
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo) || size() != ((gxszxtbevo) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return obj.equals(this);
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            int iJyumaefscl = jyumaefscl();
            int iJyumaefscl2 = dxjokdxxwwVar.jyumaefscl();
            if (iJyumaefscl == 0 || iJyumaefscl2 == 0 || iJyumaefscl == iJyumaefscl2) {
                return ylkuphrtab(dxjokdxxwwVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        protected final String istkbnxepw(Charset charset) {
            return new String(this.f8644cqumvgiudr, pkzmftpjix(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        public final boolean kcexrzcfyt() {
            int iPkzmftpjix = pkzmftpjix();
            return rlfsiqarku.agtfadlqog(this.f8644cqumvgiudr, iPkzmftpjix, size() + iPkzmftpjix);
        }

        protected int pkzmftpjix() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        protected void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15) {
            System.arraycopy(this.f8644cqumvgiudr, i13, bArr, i14, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        public int size() {
            return this.f8644cqumvgiudr.length;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        byte vdvldrhtss(int i13) {
            return this.f8644cqumvgiudr[i13];
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        public byte wkgbmnqykc(int i13) {
            return this.f8644cqumvgiudr[i13];
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        final void wwaezpbzkn(androidx.datastore.preferences.protobuf.eablkybsjg eablkybsjgVar) {
            eablkybsjgVar.iobyxmoadg(this.f8644cqumvgiudr, pkzmftpjix(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo
        protected final int yggfygwlhe(int i13, int i14, int i15) {
            return zdlpuopuiu.dxjokdxxww(i13, this.f8644cqumvgiudr, pkzmftpjix() + i14, i15);
        }

        final boolean ylkuphrtab(gxszxtbevo gxszxtbevoVar, int i13, int i14) {
            if (i14 > gxszxtbevoVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i14 + size());
            }
            int i15 = i13 + i14;
            if (i15 > gxszxtbevoVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i13 + ", " + i14 + ", " + gxszxtbevoVar.size());
            }
            if (!(gxszxtbevoVar instanceof dxjokdxxww)) {
                return gxszxtbevoVar.cqumvgiudr(i13, i15).equals(cqumvgiudr(0, i14));
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            byte[] bArr = this.f8644cqumvgiudr;
            byte[] bArr2 = dxjokdxxwwVar.f8644cqumvgiudr;
            int iPkzmftpjix = pkzmftpjix() + i14;
            int iPkzmftpjix2 = pkzmftpjix();
            int iPkzmftpjix3 = dxjokdxxwwVar.pkzmftpjix() + i13;
            while (iPkzmftpjix2 < iPkzmftpjix) {
                if (bArr[iPkzmftpjix2] != bArr2[iPkzmftpjix3]) {
                    return false;
                }
                iPkzmftpjix2++;
                iPkzmftpjix3++;
            }
            return true;
        }
    }

    private static final class eablkybsjg extends dxjokdxxww {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f8645esjtqupxsv;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final int f8646lereixgezr;

        eablkybsjg(byte[] bArr, int i13, int i14) {
            super(bArr);
            gxszxtbevo.btonecajqb(i13, i13 + i14, bArr.length);
            this.f8645esjtqupxsv = i13;
            this.f8646lereixgezr = i14;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.dxjokdxxww
        protected int pkzmftpjix() {
            return this.f8645esjtqupxsv;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.dxjokdxxww, androidx.datastore.preferences.protobuf.gxszxtbevo
        protected void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15) {
            System.arraycopy(this.f8644cqumvgiudr, pkzmftpjix() + i13, bArr, i14, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.dxjokdxxww, androidx.datastore.preferences.protobuf.gxszxtbevo
        public int size() {
            return this.f8646lereixgezr;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.dxjokdxxww, androidx.datastore.preferences.protobuf.gxszxtbevo
        byte vdvldrhtss(int i13) {
            return this.f8644cqumvgiudr[this.f8645esjtqupxsv + i13];
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.dxjokdxxww, androidx.datastore.preferences.protobuf.gxszxtbevo
        public byte wkgbmnqykc(int i13) {
            gxszxtbevo.dxjokdxxww(i13, size());
            return this.f8644cqumvgiudr[this.f8645esjtqupxsv + i13];
        }

        Object writeReplace() {
            return gxszxtbevo.yadqdtsiqt(lereixgezr());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    private interface InterfaceC0139gxszxtbevo {
        byte[] copyFrom(byte[] bArr, int i13, int i14);
    }

    class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f8648yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f8649zdlpuopuiu = 0;

        iobyxmoadg() {
            this.f8648yggfygwlhe = gxszxtbevo.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8649zdlpuopuiu < this.f8648yggfygwlhe;
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.lqeggnwhkg
        public byte nextByte() {
            int i13 = this.f8649zdlpuopuiu;
            if (i13 >= this.f8648yggfygwlhe) {
                throw new NoSuchElementException();
            }
            this.f8649zdlpuopuiu = i13 + 1;
            return gxszxtbevo.this.vdvldrhtss(i13);
        }
    }

    public interface lqeggnwhkg extends Iterator {
        byte nextByte();
    }

    static abstract class nufgyqmvbu extends gxszxtbevo {
        nufgyqmvbu() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.zdlpuopuiu();
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

    private static final class wkgbmnqykc implements InterfaceC0139gxszxtbevo {
        private wkgbmnqykc() {
        }

        @Override // androidx.datastore.preferences.protobuf.gxszxtbevo.InterfaceC0139gxszxtbevo
        public byte[] copyFrom(byte[] bArr, int i13, int i14) {
            return Arrays.copyOfRange(bArr, i13, i14 + i13);
        }

        /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static class zoijcleaow implements Comparator {
        zoijcleaow() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
            lqeggnwhkg lqeggnwhkgVarZdlpuopuiu = gxszxtbevoVar.zdlpuopuiu();
            lqeggnwhkg lqeggnwhkgVarZdlpuopuiu2 = gxszxtbevoVar2.zdlpuopuiu();
            while (lqeggnwhkgVarZdlpuopuiu.hasNext() && lqeggnwhkgVarZdlpuopuiu2.hasNext()) {
                int iCompare = Integer.compare(gxszxtbevo.pmvmpeiblj(lqeggnwhkgVarZdlpuopuiu.nextByte()), gxszxtbevo.pmvmpeiblj(lqeggnwhkgVarZdlpuopuiu2.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(gxszxtbevoVar.size(), gxszxtbevoVar2.size());
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = null;
        f8641jyumaefscl = androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf() ? new btonecajqb(iobyxmoadgVar) : new wkgbmnqykc(iobyxmoadgVar);
        f8640iwizpuwonk = new zoijcleaow();
    }

    gxszxtbevo() {
    }

    public static gxszxtbevo agtfadlqog(byte[] bArr, int i13, int i14) {
        btonecajqb(i13, i13 + i14, bArr.length);
        return new dxjokdxxww(f8641jyumaefscl.copyFrom(bArr, i13, i14));
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

    public static gxszxtbevo draadjrbmk(byte[] bArr) {
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

    static gxszxtbevo lmojexxdyd(byte[] bArr, int i13, int i14) {
        return new eablkybsjg(bArr, i13, i14);
    }

    public static gxszxtbevo ojitshcjhn(String str) {
        return new dxjokdxxww(str.getBytes(zdlpuopuiu.f8902iobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int pmvmpeiblj(byte b13) {
        return b13 & 255;
    }

    static gxszxtbevo yadqdtsiqt(byte[] bArr) {
        return new dxjokdxxww(bArr);
    }

    public final String cdpycssgdh() {
        return zynmafqrjb(zdlpuopuiu.f8902iobyxmoadg);
    }

    public abstract gxszxtbevo cqumvgiudr(int i13, int i14);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iYggfygwlhe = this.f8643zdlpuopuiu;
        if (iYggfygwlhe == 0) {
            int size = size();
            iYggfygwlhe = yggfygwlhe(size, 0, size);
            if (iYggfygwlhe == 0) {
                iYggfygwlhe = 1;
            }
            this.f8643zdlpuopuiu = iYggfygwlhe;
        }
        return iYggfygwlhe;
    }

    protected abstract String istkbnxepw(Charset charset);

    protected final int jyumaefscl() {
        return this.f8643zdlpuopuiu;
    }

    public abstract boolean kcexrzcfyt();

    public final byte[] lereixgezr() {
        int size = size();
        if (size == 0) {
            return zdlpuopuiu.f8903ppxfxbqfkf;
        }
        byte[] bArr = new byte[size];
        rgvfuqvkyq(bArr, 0, 0, size);
        return bArr;
    }

    protected abstract void rgvfuqvkyq(byte[] bArr, int i13, int i14, int i15);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    abstract byte vdvldrhtss(int i13);

    public abstract byte wkgbmnqykc(int i13);

    abstract void wwaezpbzkn(androidx.datastore.preferences.protobuf.eablkybsjg eablkybsjgVar);

    protected abstract int yggfygwlhe(int i13, int i14, int i15);

    public lqeggnwhkg zdlpuopuiu() {
        return new iobyxmoadg();
    }

    public final String zynmafqrjb(Charset charset) {
        return size() == 0 ? "" : istkbnxepw(charset);
    }
}
