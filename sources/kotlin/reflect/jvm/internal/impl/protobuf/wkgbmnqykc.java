package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc implements Iterable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final wkgbmnqykc f60173zdlpuopuiu = new wflxmlrfwp(new byte[0]);

    public interface iobyxmoadg extends Iterator {
        byte nextByte();
    }

    wkgbmnqykc() {
    }

    public static zoijcleaow agtfadlqog() {
        return new zoijcleaow(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    public static wkgbmnqykc eablkybsjg(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return new wflxmlrfwp(bArr2);
    }

    public static wkgbmnqykc gxszxtbevo(String str) {
        try {
            return new wflxmlrfwp(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported?", e13);
        }
    }

    private static wkgbmnqykc iobyxmoadg(Iterator it, int i13) {
        if (i13 == 1) {
            return (wkgbmnqykc) it.next();
        }
        int i14 = i13 >>> 1;
        return iobyxmoadg(it, i14).zoijcleaow(iobyxmoadg(it, i13 - i14));
    }

    public static wkgbmnqykc ppxfxbqfkf(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((wkgbmnqykc) it.next());
            }
        }
        return arrayList.isEmpty() ? f60173zdlpuopuiu : iobyxmoadg(arrayList.iterator(), arrayList.size());
    }

    public static wkgbmnqykc wkgbmnqykc(byte[] bArr) {
        return eablkybsjg(bArr, 0, bArr.length);
    }

    protected abstract void btonecajqb(byte[] bArr, int i13, int i14, int i15);

    protected abstract boolean draadjrbmk();

    public void dxjokdxxww(byte[] bArr, int i13, int i14, int i15) {
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Source offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Target offset < 0: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i16 = i13 + i15;
        if (i16 > size()) {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Source end offset < 0: ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        int i17 = i14 + i15;
        if (i17 <= bArr.length) {
            if (i15 > 0) {
                btonecajqb(bArr, i13, i14, i15);
            }
        } else {
            StringBuilder sb7 = new StringBuilder(34);
            sb7.append("Target end offset < 0: ");
            sb7.append(i17);
            throw new IndexOutOfBoundsException(sb7.toString());
        }
    }

    protected abstract int gtknphoqwx();

    public boolean isEmpty() {
        return size() == 0;
    }

    abstract void jyumaefscl(OutputStream outputStream, int i13, int i14);

    public abstract String kcexrzcfyt(String str);

    protected abstract int ojitshcjhn(int i13, int i14, int i15);

    public byte[] oxmwwwfdhm() {
        int size = size();
        if (size == 0) {
            return dxjokdxxww.f60049iobyxmoadg;
        }
        byte[] bArr = new byte[size];
        btonecajqb(bArr, 0, 0, size);
        return bArr;
    }

    protected abstract int rgvfuqvkyq(int i13, int i14, int i15);

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int vdvldrhtss();

    public abstract boolean wflxmlrfwp();

    void yggfygwlhe(OutputStream outputStream, int i13, int i14) {
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Source offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i15 = i13 + i14;
        if (i15 <= size()) {
            if (i14 > 0) {
                jyumaefscl(outputStream, i13, i14);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(39);
            sb5.append("Source end offset exceeded: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public String zdlpuopuiu() {
        try {
            return kcexrzcfyt("UTF-8");
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported?", e13);
        }
    }

    public wkgbmnqykc zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        int size = size();
        int size2 = wkgbmnqykcVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return oxmwwwfdhm.lereixgezr(this, wkgbmnqykcVar);
        }
        StringBuilder sb3 = new StringBuilder(53);
        sb3.append("ByteString would be too long: ");
        sb3.append(size);
        sb3.append("+");
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static final class zoijcleaow extends OutputStream {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final byte[] f60174esjtqupxsv = new byte[0];

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f60175cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private byte[] f60176iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f60177jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ArrayList f60178yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f60179zdlpuopuiu;

        zoijcleaow(int i13) {
            if (i13 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f60179zdlpuopuiu = i13;
            this.f60178yggfygwlhe = new ArrayList();
            this.f60176iwizpuwonk = new byte[i13];
        }

        private byte[] iobyxmoadg(byte[] bArr, int i13) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i13));
            return bArr2;
        }

        private void lqeggnwhkg() {
            int i13 = this.f60175cqumvgiudr;
            byte[] bArr = this.f60176iwizpuwonk;
            if (i13 >= bArr.length) {
                this.f60178yggfygwlhe.add(new wflxmlrfwp(this.f60176iwizpuwonk));
                this.f60176iwizpuwonk = f60174esjtqupxsv;
            } else if (i13 > 0) {
                this.f60178yggfygwlhe.add(new wflxmlrfwp(iobyxmoadg(bArr, i13)));
            }
            this.f60177jyumaefscl += this.f60175cqumvgiudr;
            this.f60175cqumvgiudr = 0;
        }

        private void wkgbmnqykc(int i13) {
            this.f60178yggfygwlhe.add(new wflxmlrfwp(this.f60176iwizpuwonk));
            int length = this.f60177jyumaefscl + this.f60176iwizpuwonk.length;
            this.f60177jyumaefscl = length;
            this.f60176iwizpuwonk = new byte[Math.max(this.f60179zdlpuopuiu, Math.max(i13, length >>> 1))];
            this.f60175cqumvgiudr = 0;
        }

        public synchronized wkgbmnqykc dxjokdxxww() {
            lqeggnwhkg();
            return wkgbmnqykc.ppxfxbqfkf(this.f60178yggfygwlhe);
        }

        public synchronized int nufgyqmvbu() {
            return this.f60177jyumaefscl + this.f60175cqumvgiudr;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(nufgyqmvbu()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i13) {
            try {
                if (this.f60175cqumvgiudr == this.f60176iwizpuwonk.length) {
                    wkgbmnqykc(1);
                }
                byte[] bArr = this.f60176iwizpuwonk;
                int i14 = this.f60175cqumvgiudr;
                this.f60175cqumvgiudr = i14 + 1;
                bArr[i14] = (byte) i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i13, int i14) {
            try {
                byte[] bArr2 = this.f60176iwizpuwonk;
                int length = bArr2.length;
                int i15 = this.f60175cqumvgiudr;
                if (i14 <= length - i15) {
                    System.arraycopy(bArr, i13, bArr2, i15, i14);
                    this.f60175cqumvgiudr += i14;
                } else {
                    int length2 = bArr2.length - i15;
                    System.arraycopy(bArr, i13, bArr2, i15, length2);
                    int i16 = i14 - length2;
                    wkgbmnqykc(i16);
                    System.arraycopy(bArr, i13 + length2, this.f60176iwizpuwonk, 0, i16);
                    this.f60175cqumvgiudr = i16;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
