package v2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg implements esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final cdpycssgdh.ppxfxbqfkf f115643iobyxmoadg = new cdpycssgdh.ppxfxbqfkf();

    protected lqeggnwhkg() {
    }

    private void bfopjjpdmp(int i13) {
        int iMetgxyhuhe = metgxyhuhe();
        if (iMetgxyhuhe == -1) {
            czzsidtyhn(i13);
        } else if (iMetgxyhuhe == mbcevpiqjq()) {
            uwvvkdfqfp(i13);
        } else {
            sflfametgt(iMetgxyhuhe, i13);
        }
    }

    private void czzsidtyhn(int i13) {
        yfnezrywwk(-1, -9223372036854775807L, i13, false);
    }

    private void oipsdeybqn(long j13, int i13) {
        long jIkoacuggdj = ikoacuggdj() + j13;
        long jIobyxmoadg = iobyxmoadg();
        if (jIobyxmoadg != -9223372036854775807L) {
            jIkoacuggdj = Math.min(jIkoacuggdj, jIobyxmoadg);
        }
        ydmasvzmpa(Math.max(jIkoacuggdj, 0L), i13);
    }

    private int rlfsiqarku() {
        int iSopmlzcsov = sopmlzcsov();
        if (iSopmlzcsov == 1) {
            return 0;
        }
        return iSopmlzcsov;
    }

    private void sflfametgt(int i13, int i14) {
        yfnezrywwk(i13, -9223372036854775807L, i14, false);
    }

    private void uwvvkdfqfp(int i13) {
        yfnezrywwk(mbcevpiqjq(), -9223372036854775807L, i13, true);
    }

    private void ydmasvzmpa(long j13, int i13) {
        yfnezrywwk(mbcevpiqjq(), j13, i13, false);
    }

    private void zfvoamnweg(int i13) {
        int iXrmfcynszj = xrmfcynszj();
        if (iXrmfcynszj == -1) {
            czzsidtyhn(i13);
        } else if (iXrmfcynszj == mbcevpiqjq()) {
            uwvvkdfqfp(i13);
        } else {
            sflfametgt(iXrmfcynszj, i13);
        }
    }

    @Override // v2.esjtqupxsv
    public final void agtfadlqog(kcexrzcfyt kcexrzcfytVar) {
        opjhrmiecq(com.google.common.collect.zdlpuopuiu.istkbnxepw(kcexrzcfytVar));
    }

    @Override // v2.esjtqupxsv
    public final void dsvhmnatus(long j13) {
        ydmasvzmpa(j13, 5);
    }

    @Override // v2.esjtqupxsv
    public final void esjtqupxsv() {
        if (jyumaefscl().vdvldrhtss() || ppxfxbqfkf()) {
            czzsidtyhn(9);
            return;
        }
        if (rgvfuqvkyq()) {
            zfvoamnweg(9);
        } else if (jztzpxfvev() && zdlpuopuiu()) {
            sflfametgt(mbcevpiqjq(), 9);
        } else {
            czzsidtyhn(9);
        }
    }

    @Override // v2.esjtqupxsv
    public final void gtknphoqwx() {
        if (jyumaefscl().vdvldrhtss() || ppxfxbqfkf()) {
            czzsidtyhn(7);
            return;
        }
        boolean zHkdspvbjdz = hkdspvbjdz();
        if (jztzpxfvev() && !kegysxyocb()) {
            if (zHkdspvbjdz) {
                bfopjjpdmp(7);
                return;
            } else {
                czzsidtyhn(7);
                return;
            }
        }
        if (!zHkdspvbjdz || ikoacuggdj() > wwaezpbzkn()) {
            ydmasvzmpa(0L, 7);
        } else {
            bfopjjpdmp(7);
        }
    }

    @Override // v2.esjtqupxsv
    public final void gxszxtbevo() {
        sflfametgt(mbcevpiqjq(), 4);
    }

    @Override // v2.esjtqupxsv
    public final boolean hkdspvbjdz() {
        return metgxyhuhe() != -1;
    }

    @Override // v2.esjtqupxsv
    public final void istkbnxepw(int i13, long j13) {
        yfnezrywwk(i13, j13, 10, false);
    }

    @Override // v2.esjtqupxsv
    public final boolean jztzpxfvev() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        return !cdpycssgdhVarJyumaefscl.vdvldrhtss() && cdpycssgdhVarJyumaefscl.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).gxszxtbevo();
    }

    @Override // v2.esjtqupxsv
    public final boolean kcexrzcfyt(int i13) {
        return cdpycssgdh().zoijcleaow(i13);
    }

    @Override // v2.esjtqupxsv
    public final boolean kegysxyocb() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        return !cdpycssgdhVarJyumaefscl.vdvldrhtss() && cdpycssgdhVarJyumaefscl.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).f115288nufgyqmvbu;
    }

    public final int metgxyhuhe() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            return -1;
        }
        return cdpycssgdhVarJyumaefscl.draadjrbmk(mbcevpiqjq(), rlfsiqarku(), crxdokpmqz());
    }

    @Override // v2.esjtqupxsv
    public final boolean nufgyqmvbu() {
        return tzroggbefp() == 3 && iozdgvuglv() && yggfygwlhe() == 0;
    }

    public final void opjhrmiecq(List list) {
        dxjokdxxww(list, true);
    }

    @Override // v2.esjtqupxsv
    public final void pause() {
        wflxmlrfwp(false);
    }

    @Override // v2.esjtqupxsv
    public final void play() {
        wflxmlrfwp(true);
    }

    @Override // v2.esjtqupxsv
    public final boolean rgvfuqvkyq() {
        return xrmfcynszj() != -1;
    }

    @Override // v2.esjtqupxsv
    public final void ribwqtqdhb() {
        oipsdeybqn(wypolnanlu(), 12);
    }

    @Override // v2.esjtqupxsv
    public final void vipkmwdibw() {
        oipsdeybqn(-okpsazkaxt(), 11);
    }

    public final int xrmfcynszj() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            return -1;
        }
        return cdpycssgdhVarJyumaefscl.eablkybsjg(mbcevpiqjq(), rlfsiqarku(), crxdokpmqz());
    }

    protected abstract void yfnezrywwk(int i13, long j13, int i14, boolean z13);

    @Override // v2.esjtqupxsv
    public final long ylkuphrtab() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            return -9223372036854775807L;
        }
        return cdpycssgdhVarJyumaefscl.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).wkgbmnqykc();
    }

    @Override // v2.esjtqupxsv
    public final boolean zdlpuopuiu() {
        cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        return !cdpycssgdhVarJyumaefscl.vdvldrhtss() && cdpycssgdhVarJyumaefscl.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).f115282dxjokdxxww;
    }
}
