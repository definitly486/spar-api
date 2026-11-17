package j4;

import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f50656iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final byte[] f50657ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f50658zoijcleaow;

    private iobyxmoadg(long j13, byte[] bArr, long j14) {
        this.f50656iobyxmoadg = j14;
        this.f50658zoijcleaow = j13;
        this.f50657ppxfxbqfkf = bArr;
    }

    static iobyxmoadg wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, int i13, long j13) {
        long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
        int i14 = i13 - 4;
        byte[] bArr = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
        return new iobyxmoadg(jPkzmftpjix, bArr, j13);
    }

    @Override // j4.zoijcleaow
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f50656iobyxmoadg + ", identifier= " + this.f50658zoijcleaow + " }";
    }
}
