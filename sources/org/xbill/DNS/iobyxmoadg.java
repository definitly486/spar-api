package org.xbill.DNS;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74394lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private InetAddress f74395pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private auzgnhcxok f74396zynmafqrjb;

    iobyxmoadg() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74394lereixgezr);
        if (this.f74395pmvmpeiblj != null) {
            sb3.append(" ");
            sb3.append(this.f74395pmvmpeiblj.getHostAddress());
        }
        if (this.f74396zynmafqrjb != null) {
            sb3.append(" ");
            sb3.append(this.f74396zynmafqrjb);
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74394lereixgezr);
        InetAddress inetAddress = this.f74395pmvmpeiblj;
        if (inetAddress != null) {
            int i13 = (135 - this.f74394lereixgezr) / 8;
            jyumaefsclVar.lqeggnwhkg(inetAddress.getAddress(), 16 - i13, i13);
        }
        auzgnhcxok auzgnhcxokVar = this.f74396zynmafqrjb;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.lmojexxdyd(jyumaefsclVar, null, z13);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
        this.f74394lereixgezr = iBtonecajqb;
        int i13 = (135 - iBtonecajqb) / 8;
        if (iBtonecajqb < 128) {
            byte[] bArr = new byte[16];
            zdlpuopuiuVar.wkgbmnqykc(bArr, 16 - i13, i13);
            this.f74395pmvmpeiblj = InetAddress.getByAddress(bArr);
        }
        if (this.f74394lereixgezr > 0) {
            this.f74396zynmafqrjb = new auzgnhcxok(zdlpuopuiuVar);
        }
    }
}
