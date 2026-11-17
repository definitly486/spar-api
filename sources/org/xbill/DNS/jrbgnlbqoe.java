package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class jrbgnlbqoe extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74430lereixgezr;

    jrbgnlbqoe() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        if (this.f74430lereixgezr != null) {
            if (rhgxfdycjh.iobyxmoadg("multiline")) {
                sb3.append("(\n");
                sb3.append(km.ppxfxbqfkf.iobyxmoadg(this.f74430lereixgezr, 64, "\t", true));
            } else {
                sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74430lereixgezr));
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.gxszxtbevo(this.f74430lereixgezr);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74430lereixgezr = zdlpuopuiuVar.eablkybsjg();
    }
}
