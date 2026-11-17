package ribwqtqdhb;

import vipkmwdibw.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe implements pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f82847iobyxmoadg;

    public yggfygwlhe(w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f82847iobyxmoadg = new draadjrbmk(jyumaefscl.iobyxmoadg(), wkgbmnqykcVar);
    }

    private final float gxszxtbevo(float f13) {
        return this.f82847iobyxmoadg.zoijcleaow(f13) * Math.signum(f13);
    }

    @Override // vipkmwdibw.pkzmftpjix
    public float eablkybsjg(long j13, float f13, float f14) {
        return f13 + this.f82847iobyxmoadg.wkgbmnqykc(f14).iobyxmoadg(j13 / 1000000);
    }

    @Override // vipkmwdibw.pkzmftpjix
    public float iobyxmoadg() {
        return 0.0f;
    }

    @Override // vipkmwdibw.pkzmftpjix
    public long ppxfxbqfkf(float f13, float f14) {
        return this.f82847iobyxmoadg.ppxfxbqfkf(f14) * 1000000;
    }

    @Override // vipkmwdibw.pkzmftpjix
    public float wkgbmnqykc(float f13, float f14) {
        return f13 + gxszxtbevo(f14);
    }

    @Override // vipkmwdibw.pkzmftpjix
    public float zoijcleaow(long j13, float f13, float f14) {
        return this.f82847iobyxmoadg.wkgbmnqykc(f14).zoijcleaow(j13 / 1000000);
    }
}
