package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class b3 extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74248lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74249pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private byte[] f74250zynmafqrjb = new byte[0];

    b3() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return this.f74248lereixgezr + " " + this.f74249pmvmpeiblj + " " + e.iobyxmoadg(this.f74250zynmafqrjb, true);
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74248lereixgezr);
        jyumaefsclVar.dxjokdxxww(this.f74249pmvmpeiblj);
        jyumaefsclVar.gxszxtbevo(this.f74250zynmafqrjb);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74248lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74249pmvmpeiblj = zdlpuopuiuVar.nufgyqmvbu();
        this.f74250zynmafqrjb = zdlpuopuiuVar.eablkybsjg();
    }
}
