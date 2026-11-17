package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class oxmwwwfdhm extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74493istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74494lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74495pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74496zynmafqrjb;

    oxmwwwfdhm() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74494lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74495pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74496zynmafqrjb);
        if (this.f74493istkbnxepw != null) {
            sb3.append(" ");
            sb3.append(km.iobyxmoadg.iobyxmoadg(this.f74493istkbnxepw));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74494lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74495pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74496zynmafqrjb);
        byte[] bArr = this.f74493istkbnxepw;
        if (bArr != null) {
            jyumaefsclVar.gxszxtbevo(bArr);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74494lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74495pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74496zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        this.f74493istkbnxepw = zdlpuopuiuVar.eablkybsjg();
    }
}
