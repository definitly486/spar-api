package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
class wflxmlrfwp extends wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f60168jyumaefscl = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final byte[] f60169yggfygwlhe;

    private class zoijcleaow implements wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f60171yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f60172zdlpuopuiu;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60172zdlpuopuiu < this.f60171yggfygwlhe;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg
        public byte nextByte() {
            try {
                byte[] bArr = wflxmlrfwp.this.f60169yggfygwlhe;
                int i13 = this.f60172zdlpuopuiu;
                this.f60172zdlpuopuiu = i13 + 1;
                return bArr[i13];
            } catch (ArrayIndexOutOfBoundsException e13) {
                throw new NoSuchElementException(e13.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private zoijcleaow() {
            this.f60172zdlpuopuiu = 0;
            this.f60171yggfygwlhe = wflxmlrfwp.this.size();
        }
    }

    wflxmlrfwp(byte[] bArr) {
        this.f60169yggfygwlhe = bArr;
    }

    static int esjtqupxsv(int i13, byte[] bArr, int i14, int i15) {
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            i13 = (i13 * 31) + bArr[i16];
        }
        return i13;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected void btonecajqb(byte[] bArr, int i13, int i14, int i15) {
        System.arraycopy(this.f60169yggfygwlhe, i13, bArr, i14, i15);
    }

    protected int cqumvgiudr() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected boolean draadjrbmk() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc) || size() != ((wkgbmnqykc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof wflxmlrfwp) {
            return iwizpuwonk((wflxmlrfwp) obj, 0, size());
        }
        if (obj instanceof oxmwwwfdhm) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 49);
        sb3.append("Has a new type of ByteString been created? Found ");
        sb3.append(strValueOf);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int gtknphoqwx() {
        return 0;
    }

    public int hashCode() {
        int iOjitshcjhn = this.f60168jyumaefscl;
        if (iOjitshcjhn == 0) {
            int size = size();
            iOjitshcjhn = ojitshcjhn(size, 0, size);
            if (iOjitshcjhn == 0) {
                iOjitshcjhn = 1;
            }
            this.f60168jyumaefscl = iOjitshcjhn;
        }
        return iOjitshcjhn;
    }

    boolean iwizpuwonk(wflxmlrfwp wflxmlrfwpVar, int i13, int i14) {
        if (i14 > wflxmlrfwpVar.size()) {
            int size = size();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(i14);
            sb3.append(size);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i13 + i14 > wflxmlrfwpVar.size()) {
            int size2 = wflxmlrfwpVar.size();
            StringBuilder sb4 = new StringBuilder(59);
            sb4.append("Ran off end of other: ");
            sb4.append(i13);
            sb4.append(", ");
            sb4.append(i14);
            sb4.append(", ");
            sb4.append(size2);
            throw new IllegalArgumentException(sb4.toString());
        }
        byte[] bArr = this.f60169yggfygwlhe;
        byte[] bArr2 = wflxmlrfwpVar.f60169yggfygwlhe;
        int iCqumvgiudr = cqumvgiudr() + i14;
        int iCqumvgiudr2 = cqumvgiudr();
        int iCqumvgiudr3 = wflxmlrfwpVar.cqumvgiudr() + i13;
        while (iCqumvgiudr2 < iCqumvgiudr) {
            if (bArr[iCqumvgiudr2] != bArr2[iCqumvgiudr3]) {
                return false;
            }
            iCqumvgiudr2++;
            iCqumvgiudr3++;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    void jyumaefscl(OutputStream outputStream, int i13, int i14) throws IOException {
        outputStream.write(this.f60169yggfygwlhe, cqumvgiudr() + i13, i14);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public String kcexrzcfyt(String str) {
        return new String(this.f60169yggfygwlhe, cqumvgiudr(), size(), str);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc.iobyxmoadg iterator() {
        return new zoijcleaow();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int ojitshcjhn(int i13, int i14, int i15) {
        return esjtqupxsv(i13, this.f60169yggfygwlhe, cqumvgiudr() + i14, i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int rgvfuqvkyq(int i13, int i14, int i15) {
        int iCqumvgiudr = cqumvgiudr() + i14;
        return yggfygwlhe.lqeggnwhkg(i13, this.f60169yggfygwlhe, iCqumvgiudr, i15 + iCqumvgiudr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public int size() {
        return this.f60169yggfygwlhe.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int vdvldrhtss() {
        return this.f60168jyumaefscl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public boolean wflxmlrfwp() {
        int iCqumvgiudr = cqumvgiudr();
        return yggfygwlhe.gxszxtbevo(this.f60169yggfygwlhe, iCqumvgiudr, size() + iCqumvgiudr);
    }
}
