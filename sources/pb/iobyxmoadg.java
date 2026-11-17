package pb;

import java.util.Arrays;
import ob.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f76301iobyxmoadg;

    private iobyxmoadg(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        this.f76301iobyxmoadg = bArr2;
        System.arraycopy(bArr, i13, bArr2, 0, i14);
    }

    public static iobyxmoadg iobyxmoadg(byte[] bArr) {
        if (bArr != null) {
            return zoijcleaow(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static iobyxmoadg zoijcleaow(byte[] bArr, int i13, int i14) {
        if (bArr != null) {
            return new iobyxmoadg(bArr, i13, i14);
        }
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return Arrays.equals(((iobyxmoadg) obj).f76301iobyxmoadg, this.f76301iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f76301iobyxmoadg);
    }

    public int ppxfxbqfkf() {
        return this.f76301iobyxmoadg.length;
    }

    public String toString() {
        return "Bytes(" + gtknphoqwx.zoijcleaow(this.f76301iobyxmoadg) + ")";
    }
}
