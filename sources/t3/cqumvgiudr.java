package t3;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr implements pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f109358iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f109359zoijcleaow;

    public cqumvgiudr(esjtqupxsv esjtqupxsvVar, long j13) {
        this.f109358iobyxmoadg = esjtqupxsvVar;
        this.f109359zoijcleaow = j13;
    }

    private hcddaimhww iobyxmoadg(long j13, long j14) {
        return new hcddaimhww((j13 * 1000000) / ((long) this.f109358iobyxmoadg.f109420eablkybsjg), this.f109359zoijcleaow + j14);
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f109358iobyxmoadg.gxszxtbevo();
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return true;
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        y2.iobyxmoadg.dxjokdxxww(this.f109358iobyxmoadg.f109421gtknphoqwx);
        esjtqupxsv esjtqupxsvVar = this.f109358iobyxmoadg;
        esjtqupxsv.iobyxmoadg iobyxmoadgVar = esjtqupxsvVar.f109421gtknphoqwx;
        long[] jArr = iobyxmoadgVar.f109429iobyxmoadg;
        long[] jArr2 = iobyxmoadgVar.f109430zoijcleaow;
        int iLqeggnwhkg = y2.stevsuqkhv.lqeggnwhkg(jArr, esjtqupxsvVar.dxjokdxxww(j13), true, false);
        hcddaimhww hcddaimhwwVarIobyxmoadg = iobyxmoadg(iLqeggnwhkg == -1 ? 0L : jArr[iLqeggnwhkg], iLqeggnwhkg != -1 ? jArr2[iLqeggnwhkg] : 0L);
        if (hcddaimhwwVarIobyxmoadg.f109432iobyxmoadg == j13 || iLqeggnwhkg == jArr.length - 1) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVarIobyxmoadg);
        }
        int i13 = iLqeggnwhkg + 1;
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVarIobyxmoadg, iobyxmoadg(jArr[i13], jArr2[i13]));
    }
}
