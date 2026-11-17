package t3;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.zdlpuopuiu f109567iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f109568ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.zdlpuopuiu f109569zoijcleaow;

    public yadqdtsiqt(long[] jArr, long[] jArr2, long j13) {
        y2.iobyxmoadg.iobyxmoadg(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f109567iobyxmoadg = new y2.zdlpuopuiu(length);
            this.f109569zoijcleaow = new y2.zdlpuopuiu(length);
        } else {
            int i13 = length + 1;
            y2.zdlpuopuiu zdlpuopuiuVar = new y2.zdlpuopuiu(i13);
            this.f109567iobyxmoadg = zdlpuopuiuVar;
            y2.zdlpuopuiu zdlpuopuiuVar2 = new y2.zdlpuopuiu(i13);
            this.f109569zoijcleaow = zdlpuopuiuVar2;
            zdlpuopuiuVar.iobyxmoadg(0L);
            zdlpuopuiuVar2.iobyxmoadg(0L);
        }
        this.f109567iobyxmoadg.zoijcleaow(jArr);
        this.f109569zoijcleaow.zoijcleaow(jArr2);
        this.f109568ppxfxbqfkf = j13;
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f109568ppxfxbqfkf;
    }

    public void iobyxmoadg(long j13, long j14) {
        if (this.f109569zoijcleaow.wkgbmnqykc() == 0 && j13 > 0) {
            this.f109567iobyxmoadg.iobyxmoadg(0L);
            this.f109569zoijcleaow.iobyxmoadg(0L);
        }
        this.f109567iobyxmoadg.iobyxmoadg(j14);
        this.f109569zoijcleaow.iobyxmoadg(j13);
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return this.f109569zoijcleaow.wkgbmnqykc() > 0;
    }

    public long nufgyqmvbu(long j13) {
        if (this.f109569zoijcleaow.wkgbmnqykc() == 0) {
            return -9223372036854775807L;
        }
        return this.f109569zoijcleaow.ppxfxbqfkf(y2.stevsuqkhv.eablkybsjg(this.f109567iobyxmoadg, j13, true, true));
    }

    public void ppxfxbqfkf(long j13) {
        this.f109568ppxfxbqfkf = j13;
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        if (this.f109569zoijcleaow.wkgbmnqykc() == 0) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhww.f109431ppxfxbqfkf);
        }
        int iEablkybsjg = y2.stevsuqkhv.eablkybsjg(this.f109569zoijcleaow, j13, true, true);
        hcddaimhww hcddaimhwwVar = new hcddaimhww(this.f109569zoijcleaow.ppxfxbqfkf(iEablkybsjg), this.f109567iobyxmoadg.ppxfxbqfkf(iEablkybsjg));
        if (hcddaimhwwVar.f109432iobyxmoadg == j13 || iEablkybsjg == this.f109569zoijcleaow.wkgbmnqykc() - 1) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar);
        }
        int i13 = iEablkybsjg + 1;
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar, new hcddaimhww(this.f109569zoijcleaow.ppxfxbqfkf(i13), this.f109567iobyxmoadg.ppxfxbqfkf(i13)));
    }

    public boolean zoijcleaow(long j13, long j14) {
        if (this.f109569zoijcleaow.wkgbmnqykc() == 0) {
            return false;
        }
        y2.zdlpuopuiu zdlpuopuiuVar = this.f109569zoijcleaow;
        return j13 - zdlpuopuiuVar.ppxfxbqfkf(zdlpuopuiuVar.wkgbmnqykc() - 1) < j14;
    }
}
