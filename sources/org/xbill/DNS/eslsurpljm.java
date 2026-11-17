package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class eslsurpljm extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74354lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private auzgnhcxok f74355pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private auzgnhcxok f74356zynmafqrjb;

    eslsurpljm() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return this.f74354lereixgezr + " " + this.f74355pmvmpeiblj + " " + this.f74356zynmafqrjb;
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74354lereixgezr);
        this.f74355pmvmpeiblj.lmojexxdyd(jyumaefsclVar, null, z13);
        this.f74356zynmafqrjb.lmojexxdyd(jyumaefsclVar, null, z13);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74354lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74355pmvmpeiblj = new auzgnhcxok(zdlpuopuiuVar);
        this.f74356zynmafqrjb = new auzgnhcxok(zdlpuopuiuVar);
    }
}
