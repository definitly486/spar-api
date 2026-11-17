package org.xbill.DNS;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
abstract class jhduphickx extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    protected byte[] f74419istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected int f74420lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected int f74421pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected int f74423zynmafqrjb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    protected int f74418cdpycssgdh = -1;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    protected PublicKey f74422yadqdtsiqt = null;

    protected jhduphickx() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74420lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74421pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74423zynmafqrjb);
        if (this.f74419istkbnxepw != null) {
            if (rhgxfdycjh.iobyxmoadg("multiline")) {
                sb3.append(" (\n");
                sb3.append(km.ppxfxbqfkf.iobyxmoadg(this.f74419istkbnxepw, 64, "\t", true));
                sb3.append(" ; key_tag = ");
                sb3.append(ulzqkzuiru());
            } else {
                sb3.append(" ");
                sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74419istkbnxepw));
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74420lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74421pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74423zynmafqrjb);
        byte[] bArr = this.f74419istkbnxepw;
        if (bArr != null) {
            jyumaefsclVar.gxszxtbevo(bArr);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74420lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74421pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74423zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74419istkbnxepw = zdlpuopuiuVar.eablkybsjg();
        }
    }

    public int ulzqkzuiru() {
        int i13;
        int i14;
        int i15 = this.f74418cdpycssgdh;
        if (i15 >= 0) {
            return i15;
        }
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        int i16 = 0;
        jpowsppfya(jyumaefsclVar, null, false);
        byte[] bArrEablkybsjg = jyumaefsclVar.eablkybsjg();
        if (this.f74423zynmafqrjb == 1) {
            int i17 = bArrEablkybsjg[bArrEablkybsjg.length - 3] & 255;
            i14 = bArrEablkybsjg[bArrEablkybsjg.length - 2] & 255;
            i13 = i17 << 8;
        } else {
            i13 = 0;
            while (i16 < bArrEablkybsjg.length - 1) {
                i13 += ((bArrEablkybsjg[i16] & 255) << 8) + (bArrEablkybsjg[i16 + 1] & 255);
                i16 += 2;
            }
            if (i16 < bArrEablkybsjg.length) {
                i13 += (bArrEablkybsjg[i16] & 255) << 8;
            }
            i14 = (i13 >> 16) & 65535;
        }
        int i18 = (i13 + i14) & 65535;
        this.f74418cdpycssgdh = i18;
        return i18;
    }
}
