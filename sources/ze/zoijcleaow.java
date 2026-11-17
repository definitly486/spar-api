package ze;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f129797iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f129798zoijcleaow = 0;

    zoijcleaow(int i13) {
        this.f129797iobyxmoadg = new byte[i13];
    }

    private void ppxfxbqfkf(int i13, boolean z13) {
        this.f129797iobyxmoadg[i13] = z13 ? (byte) 1 : (byte) 0;
    }

    void iobyxmoadg(boolean z13, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f129798zoijcleaow;
            this.f129798zoijcleaow = i15 + 1;
            ppxfxbqfkf(i15, z13);
        }
    }

    byte[] zoijcleaow(int i13) {
        int length = this.f129797iobyxmoadg.length * i13;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            bArr[i14] = this.f129797iobyxmoadg[i14 / i13];
        }
        return bArr;
    }
}
