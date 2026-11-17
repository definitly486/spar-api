package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class zeieaojujs extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74611lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private y2 f74612pmvmpeiblj;

    zeieaojujs() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74611lereixgezr);
        if (!this.f74612pmvmpeiblj.iobyxmoadg()) {
            sb3.append(' ');
            sb3.append(this.f74612pmvmpeiblj.toString());
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74611lereixgezr.lmojexxdyd(jyumaefsclVar, null, false);
        this.f74612pmvmpeiblj.lqeggnwhkg(jyumaefsclVar);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74611lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74612pmvmpeiblj = new y2(zdlpuopuiuVar);
    }
}
