package pc;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends OutputStream {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f76380zdlpuopuiu = 0;

    zoijcleaow() {
    }

    long iobyxmoadg() {
        return this.f76380zdlpuopuiu;
    }

    @Override // java.io.OutputStream
    public void write(int i13) {
        this.f76380zdlpuopuiu++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f76380zdlpuopuiu += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) {
        int i15;
        if (i13 >= 0 && i13 <= bArr.length && i14 >= 0 && (i15 = i13 + i14) <= bArr.length && i15 >= 0) {
            this.f76380zdlpuopuiu += (long) i14;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
