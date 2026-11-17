package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
abstract class z2 extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected int f74604lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected auzgnhcxok f74605pmvmpeiblj;

    protected z2() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return this.f74604lereixgezr + " " + this.f74605pmvmpeiblj;
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74604lereixgezr);
        this.f74605pmvmpeiblj.lmojexxdyd(jyumaefsclVar, null, z13);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74604lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74605pmvmpeiblj = new auzgnhcxok(zdlpuopuiuVar);
    }

    protected auzgnhcxok ulzqkzuiru() {
        return this.f74605pmvmpeiblj;
    }
}
