package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class esjtqupxsv extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74350istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74351lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74352pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74353zynmafqrjb;

    esjtqupxsv() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74351lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74352pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74353zynmafqrjb);
        if (this.f74350istkbnxepw != null) {
            sb3.append(" ");
            sb3.append(km.iobyxmoadg.iobyxmoadg(this.f74350istkbnxepw));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74351lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74352pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74353zynmafqrjb);
        byte[] bArr = this.f74350istkbnxepw;
        if (bArr != null) {
            jyumaefsclVar.gxszxtbevo(bArr);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74351lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74352pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74353zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        this.f74350istkbnxepw = zdlpuopuiuVar.eablkybsjg();
    }
}
