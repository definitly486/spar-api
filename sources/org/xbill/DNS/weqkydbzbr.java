package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class weqkydbzbr extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74540istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74541lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74542pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74543zynmafqrjb;

    weqkydbzbr() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74541lereixgezr);
        sb3.append(' ');
        sb3.append(this.f74542pmvmpeiblj);
        sb3.append(' ');
        sb3.append(this.f74543zynmafqrjb);
        sb3.append(' ');
        byte[] bArr = this.f74540istkbnxepw;
        if (bArr == null) {
            sb3.append('-');
        } else {
            sb3.append(km.iobyxmoadg.iobyxmoadg(bArr));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74541lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74542pmvmpeiblj);
        jyumaefsclVar.dxjokdxxww(this.f74543zynmafqrjb);
        byte[] bArr = this.f74540istkbnxepw;
        if (bArr == null) {
            jyumaefsclVar.draadjrbmk(0);
        } else {
            jyumaefsclVar.draadjrbmk(bArr.length);
            jyumaefsclVar.gxszxtbevo(this.f74540istkbnxepw);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74541lereixgezr = zdlpuopuiuVar.btonecajqb();
        this.f74542pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74543zynmafqrjb = zdlpuopuiuVar.nufgyqmvbu();
        int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
        if (iBtonecajqb > 0) {
            this.f74540istkbnxepw = zdlpuopuiuVar.gxszxtbevo(iBtonecajqb);
        } else {
            this.f74540istkbnxepw = null;
        }
    }
}
