package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class vipkmwdibw extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74538lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private byte[] f74539pmvmpeiblj;

    vipkmwdibw() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(e.iobyxmoadg(this.f74538lereixgezr, true));
        if (this.f74539pmvmpeiblj != null) {
            sb3.append(" ");
            sb3.append(e.iobyxmoadg(this.f74539pmvmpeiblj, true));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.nufgyqmvbu(this.f74538lereixgezr);
        byte[] bArr = this.f74539pmvmpeiblj;
        if (bArr != null) {
            jyumaefsclVar.nufgyqmvbu(bArr);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74538lereixgezr = zdlpuopuiuVar.lqeggnwhkg();
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74539pmvmpeiblj = zdlpuopuiuVar.lqeggnwhkg();
        }
    }
}
