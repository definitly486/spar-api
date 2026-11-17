package t;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f109202eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final z.pkzmftpjix f109203iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f109204ppxfxbqfkf = new zynmafqrjb();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z.iwizpuwonk f109205wkgbmnqykc = new z.iwizpuwonk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f109206zoijcleaow;

    public yadqdtsiqt(z.pkzmftpjix pkzmftpjixVar) {
        this.f109203iobyxmoadg = pkzmftpjixVar;
        this.f109206zoijcleaow = new wkgbmnqykc(pkzmftpjixVar.pmvmpeiblj());
    }

    public final void iobyxmoadg() {
        this.f109206zoijcleaow.ppxfxbqfkf();
    }

    public final void ppxfxbqfkf() {
        if (this.f109202eablkybsjg) {
            return;
        }
        this.f109204ppxfxbqfkf.iobyxmoadg();
        this.f109206zoijcleaow.eablkybsjg();
    }

    public final int zoijcleaow(istkbnxepw istkbnxepwVar, dsvhmnatus dsvhmnatusVar, boolean z13) {
        int i13;
        boolean z14;
        boolean z15;
        if (this.f109202eablkybsjg) {
            return iozdgvuglv.iobyxmoadg(false, false, false);
        }
        boolean z16 = true;
        try {
            this.f109202eablkybsjg = true;
            gxszxtbevo gxszxtbevoVarZoijcleaow = this.f109204ppxfxbqfkf.zoijcleaow(istkbnxepwVar, dsvhmnatusVar);
            int iWflxmlrfwp = gxszxtbevoVarZoijcleaow.zoijcleaow().wflxmlrfwp();
            while (true) {
                if (i13 >= iWflxmlrfwp) {
                    z14 = true;
                    break;
                }
                pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) gxszxtbevoVarZoijcleaow.zoijcleaow().agtfadlqog(i13);
                i13 = (pmvmpeibljVar.dxjokdxxww() || pmvmpeibljVar.draadjrbmk()) ? 0 : i13 + 1;
                z14 = false;
                break;
            }
            int iWflxmlrfwp2 = gxszxtbevoVarZoijcleaow.zoijcleaow().wflxmlrfwp();
            for (int i14 = 0; i14 < iWflxmlrfwp2; i14++) {
                pmvmpeiblj pmvmpeibljVar2 = (pmvmpeiblj) gxszxtbevoVarZoijcleaow.zoijcleaow().agtfadlqog(i14);
                if (z14 || vdvldrhtss.zoijcleaow(pmvmpeibljVar2)) {
                    z.pkzmftpjix.fyldjkxazc(this.f109203iobyxmoadg, pmvmpeibljVar2.nufgyqmvbu(), this.f109205wkgbmnqykc, pmvmpeibljVar2.agtfadlqog(), false, 8, null);
                    if (!this.f109205wkgbmnqykc.isEmpty()) {
                        this.f109206zoijcleaow.zoijcleaow(pmvmpeibljVar2.gxszxtbevo(), this.f109205wkgbmnqykc, vdvldrhtss.zoijcleaow(pmvmpeibljVar2));
                        this.f109205wkgbmnqykc.clear();
                    }
                }
            }
            boolean zWkgbmnqykc = this.f109206zoijcleaow.wkgbmnqykc(gxszxtbevoVarZoijcleaow, z13);
            if (gxszxtbevoVarZoijcleaow.wkgbmnqykc()) {
                z15 = false;
                break;
            }
            int iWflxmlrfwp3 = gxszxtbevoVarZoijcleaow.zoijcleaow().wflxmlrfwp();
            int i15 = 0;
            while (true) {
                if (i15 >= iWflxmlrfwp3) {
                    z15 = false;
                    break;
                }
                pmvmpeiblj pmvmpeibljVar3 = (pmvmpeiblj) gxszxtbevoVarZoijcleaow.zoijcleaow().agtfadlqog(i15);
                if (vdvldrhtss.btonecajqb(pmvmpeibljVar3) && pmvmpeibljVar3.rgvfuqvkyq()) {
                    z15 = true;
                    break;
                }
                i15++;
            }
            int iWflxmlrfwp4 = gxszxtbevoVarZoijcleaow.zoijcleaow().wflxmlrfwp();
            int i16 = 0;
            while (true) {
                if (i16 >= iWflxmlrfwp4) {
                    z16 = false;
                    break;
                }
                if (((pmvmpeiblj) gxszxtbevoVarZoijcleaow.zoijcleaow().agtfadlqog(i16)).rgvfuqvkyq()) {
                    break;
                }
                i16++;
            }
            return iozdgvuglv.iobyxmoadg(zWkgbmnqykc, z15, z16);
        } finally {
            this.f109202eablkybsjg = false;
        }
    }
}
