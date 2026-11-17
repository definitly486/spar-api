package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class lrnfpwlwnk extends e {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final km.zoijcleaow f74463iozdgvuglv = new km.zoijcleaow("0123456789ABCDEFGHIJKLMNOPQRSTUV=", false, false);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private byte[] f74464cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74465istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74466lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74467pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private y2 f74468yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74469zynmafqrjb;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final oipsdeybqn f74470iobyxmoadg;

        static {
            oipsdeybqn oipsdeybqnVar = new oipsdeybqn("DNSSEC NSEC3 Hash Algorithms", 1);
            f74470iobyxmoadg = oipsdeybqnVar;
            oipsdeybqnVar.iobyxmoadg(1, "SHA-1");
        }

        public static String iobyxmoadg(int i13) {
            return f74470iobyxmoadg.wkgbmnqykc(i13);
        }
    }

    lrnfpwlwnk() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74466lereixgezr);
        sb3.append(' ');
        sb3.append(this.f74467pmvmpeiblj);
        sb3.append(' ');
        sb3.append(this.f74469zynmafqrjb);
        sb3.append(' ');
        byte[] bArr = this.f74465istkbnxepw;
        if (bArr == null) {
            sb3.append('-');
        } else {
            sb3.append(km.iobyxmoadg.iobyxmoadg(bArr));
        }
        sb3.append(' ');
        sb3.append(f74463iozdgvuglv.zoijcleaow(this.f74464cdpycssgdh));
        if (!this.f74468yadqdtsiqt.iobyxmoadg()) {
            sb3.append(' ');
            sb3.append(this.f74468yadqdtsiqt.toString());
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74466lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74467pmvmpeiblj);
        jyumaefsclVar.dxjokdxxww(this.f74469zynmafqrjb);
        byte[] bArr = this.f74465istkbnxepw;
        if (bArr != null) {
            jyumaefsclVar.draadjrbmk(bArr.length);
            jyumaefsclVar.gxszxtbevo(this.f74465istkbnxepw);
        } else {
            jyumaefsclVar.draadjrbmk(0);
        }
        jyumaefsclVar.draadjrbmk(this.f74464cdpycssgdh.length);
        jyumaefsclVar.gxszxtbevo(this.f74464cdpycssgdh);
        this.f74468yadqdtsiqt.lqeggnwhkg(jyumaefsclVar);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74466lereixgezr = zdlpuopuiuVar.btonecajqb();
        this.f74467pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74469zynmafqrjb = zdlpuopuiuVar.nufgyqmvbu();
        int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
        if (iBtonecajqb > 0) {
            this.f74465istkbnxepw = zdlpuopuiuVar.gxszxtbevo(iBtonecajqb);
        } else {
            this.f74465istkbnxepw = null;
        }
        this.f74464cdpycssgdh = zdlpuopuiuVar.gxszxtbevo(zdlpuopuiuVar.btonecajqb());
        this.f74468yadqdtsiqt = new y2(zdlpuopuiuVar);
    }
}
