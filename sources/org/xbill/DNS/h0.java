package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class h0 extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74385istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74386lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74387pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74388zynmafqrjb;

    h0() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return this.f74386lereixgezr + " " + this.f74387pmvmpeiblj + " " + this.f74388zynmafqrjb + " " + km.iobyxmoadg.iobyxmoadg(this.f74385istkbnxepw);
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74386lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74387pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74388zynmafqrjb);
        jyumaefsclVar.gxszxtbevo(this.f74385istkbnxepw);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74386lereixgezr = zdlpuopuiuVar.btonecajqb();
        this.f74387pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74388zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        byte[] bArrEablkybsjg = zdlpuopuiuVar.eablkybsjg();
        this.f74385istkbnxepw = bArrEablkybsjg;
        if (bArrEablkybsjg.length == 0) {
            throw new WireParseException("end of input");
        }
    }
}
