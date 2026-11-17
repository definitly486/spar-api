package org.xbill.DNS;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public class g0 extends e {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f74369cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private byte[] f74370iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f74371istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74372lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Instant f74373pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private byte[] f74374yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Instant f74375zynmafqrjb;

    g0() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74372lereixgezr);
        sb3.append(" ");
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("(\n\t");
        }
        sb3.append(stevsuqkhv.iobyxmoadg(this.f74373pmvmpeiblj));
        sb3.append(" ");
        sb3.append(stevsuqkhv.iobyxmoadg(this.f74375zynmafqrjb));
        sb3.append(" ");
        sb3.append(ulzqkzuiru());
        sb3.append(" ");
        sb3.append(d.iobyxmoadg(this.f74369cdpycssgdh));
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("\n");
            byte[] bArr = this.f74374yadqdtsiqt;
            if (bArr != null) {
                sb3.append(km.ppxfxbqfkf.iobyxmoadg(bArr, 64, "\t", false));
                sb3.append("\n");
            }
            byte[] bArr2 = this.f74370iozdgvuglv;
            if (bArr2 != null) {
                sb3.append(km.ppxfxbqfkf.iobyxmoadg(bArr2, 64, "\t", false));
            }
            sb3.append(" )");
        } else {
            sb3.append(" ");
            byte[] bArr3 = this.f74374yadqdtsiqt;
            if (bArr3 != null) {
                sb3.append(km.ppxfxbqfkf.zoijcleaow(bArr3));
                sb3.append(" ");
            }
            byte[] bArr4 = this.f74370iozdgvuglv;
            if (bArr4 != null) {
                sb3.append(km.ppxfxbqfkf.zoijcleaow(bArr4));
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74372lereixgezr.lmojexxdyd(jyumaefsclVar, null, z13);
        jyumaefsclVar.gtknphoqwx(this.f74373pmvmpeiblj.getEpochSecond());
        jyumaefsclVar.gtknphoqwx(this.f74375zynmafqrjb.getEpochSecond());
        jyumaefsclVar.dxjokdxxww(this.f74371istkbnxepw);
        jyumaefsclVar.dxjokdxxww(this.f74369cdpycssgdh);
        byte[] bArr = this.f74374yadqdtsiqt;
        if (bArr != null) {
            jyumaefsclVar.dxjokdxxww(bArr.length);
            jyumaefsclVar.gxszxtbevo(this.f74374yadqdtsiqt);
        } else {
            jyumaefsclVar.dxjokdxxww(0);
        }
        byte[] bArr2 = this.f74370iozdgvuglv;
        if (bArr2 == null) {
            jyumaefsclVar.dxjokdxxww(0);
        } else {
            jyumaefsclVar.dxjokdxxww(bArr2.length);
            jyumaefsclVar.gxszxtbevo(this.f74370iozdgvuglv);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74372lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74373pmvmpeiblj = Instant.ofEpochSecond(zdlpuopuiuVar.dxjokdxxww());
        this.f74375zynmafqrjb = Instant.ofEpochSecond(zdlpuopuiuVar.dxjokdxxww());
        this.f74371istkbnxepw = zdlpuopuiuVar.nufgyqmvbu();
        this.f74369cdpycssgdh = zdlpuopuiuVar.nufgyqmvbu();
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        if (iNufgyqmvbu > 0) {
            this.f74374yadqdtsiqt = zdlpuopuiuVar.gxszxtbevo(iNufgyqmvbu);
        } else {
            this.f74374yadqdtsiqt = null;
        }
        int iNufgyqmvbu2 = zdlpuopuiuVar.nufgyqmvbu();
        if (iNufgyqmvbu2 > 0) {
            this.f74370iozdgvuglv = zdlpuopuiuVar.gxszxtbevo(iNufgyqmvbu2);
        } else {
            this.f74370iozdgvuglv = null;
        }
    }

    protected String ulzqkzuiru() {
        int i13 = this.f74371istkbnxepw;
        if (i13 == 1) {
            return "SERVERASSIGNED";
        }
        if (i13 == 2) {
            return "DIFFIEHELLMAN";
        }
        if (i13 == 3) {
            return "GSSAPI";
        }
        if (i13 != 4) {
            return i13 != 5 ? Integer.toString(i13) : "DELETE";
        }
        return "RESOLVERASSIGNED";
    }
}
