package org.xbill.DNS;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public class ribwqtqdhb extends e {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private byte[] f74500cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Object f74501istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74502lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74503pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f74504zynmafqrjb;

    ribwqtqdhb() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74502lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74503pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74504zynmafqrjb);
        sb3.append(" ");
        int i13 = this.f74503pmvmpeiblj;
        if (i13 == 0) {
            sb3.append(".");
        } else if (i13 == 1 || i13 == 2) {
            sb3.append(((InetAddress) this.f74501istkbnxepw).getHostAddress());
        } else if (i13 == 3) {
            sb3.append(this.f74501istkbnxepw);
        }
        if (this.f74500cdpycssgdh != null) {
            sb3.append(" ");
            sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74500cdpycssgdh));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74502lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74503pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74504zynmafqrjb);
        int i13 = this.f74503pmvmpeiblj;
        if (i13 == 1 || i13 == 2) {
            jyumaefsclVar.gxszxtbevo(((InetAddress) this.f74501istkbnxepw).getAddress());
        } else if (i13 == 3) {
            ((auzgnhcxok) this.f74501istkbnxepw).lmojexxdyd(jyumaefsclVar, null, z13);
        }
        byte[] bArr = this.f74500cdpycssgdh;
        if (bArr != null) {
            jyumaefsclVar.gxszxtbevo(bArr);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74502lereixgezr = zdlpuopuiuVar.btonecajqb();
        this.f74503pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74504zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        int i13 = this.f74503pmvmpeiblj;
        if (i13 == 0) {
            this.f74501istkbnxepw = null;
        } else if (i13 == 1) {
            this.f74501istkbnxepw = InetAddress.getByAddress(zdlpuopuiuVar.gxszxtbevo(4));
        } else if (i13 == 2) {
            this.f74501istkbnxepw = InetAddress.getByAddress(zdlpuopuiuVar.gxszxtbevo(16));
        } else {
            if (i13 != 3) {
                throw new WireParseException("invalid gateway type");
            }
            this.f74501istkbnxepw = new auzgnhcxok(zdlpuopuiuVar);
        }
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74500cdpycssgdh = zdlpuopuiuVar.eablkybsjg();
        }
    }
}
