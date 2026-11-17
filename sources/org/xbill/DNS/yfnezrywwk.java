package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class yfnezrywwk extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74597lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private auzgnhcxok f74598pmvmpeiblj;

    yfnezrywwk() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return this.f74597lereixgezr + " " + this.f74598pmvmpeiblj;
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74597lereixgezr.lmojexxdyd(jyumaefsclVar, null, z13);
        this.f74598pmvmpeiblj.lmojexxdyd(jyumaefsclVar, null, z13);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74597lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74598pmvmpeiblj = new auzgnhcxok(zdlpuopuiuVar);
    }
}
