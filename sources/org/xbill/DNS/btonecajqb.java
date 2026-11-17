package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class btonecajqb extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74257istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74258lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74259pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74260zynmafqrjb;

    btonecajqb() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74258lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74259pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74260zynmafqrjb);
        if (this.f74257istkbnxepw != null) {
            if (rhgxfdycjh.iobyxmoadg("multiline")) {
                sb3.append(" (\n");
                sb3.append(km.ppxfxbqfkf.iobyxmoadg(this.f74257istkbnxepw, 64, "\t", true));
            } else {
                sb3.append(" ");
                sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74257istkbnxepw));
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74258lereixgezr);
        jyumaefsclVar.dxjokdxxww(this.f74259pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74260zynmafqrjb);
        jyumaefsclVar.gxszxtbevo(this.f74257istkbnxepw);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74258lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74259pmvmpeiblj = zdlpuopuiuVar.nufgyqmvbu();
        this.f74260zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        this.f74257istkbnxepw = zdlpuopuiuVar.eablkybsjg();
    }
}
