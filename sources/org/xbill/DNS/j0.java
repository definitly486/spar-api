package org.xbill.DNS;

import java.time.Duration;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends e {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f74411cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private byte[] f74412iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte[] f74413istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74414lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Instant f74415pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f74416yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Duration f74417zynmafqrjb;

    j0() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74414lereixgezr);
        sb3.append(" ");
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("(\n\t");
        }
        sb3.append(this.f74415pmvmpeiblj.getEpochSecond());
        sb3.append(" ");
        sb3.append((int) this.f74417zynmafqrjb.getSeconds());
        sb3.append(" ");
        sb3.append(this.f74413istkbnxepw.length);
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("\n");
            sb3.append(km.ppxfxbqfkf.iobyxmoadg(this.f74413istkbnxepw, 64, "\t", false));
        } else {
            sb3.append(" ");
            sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74413istkbnxepw));
        }
        sb3.append(" ");
        sb3.append(d.iobyxmoadg(this.f74416yadqdtsiqt));
        sb3.append(" ");
        byte[] bArr = this.f74412iozdgvuglv;
        if (bArr == null) {
            sb3.append(0);
        } else {
            sb3.append(bArr.length);
            if (rhgxfdycjh.iobyxmoadg("multiline")) {
                sb3.append("\n\n\n\t");
            } else {
                sb3.append(" ");
            }
            if (this.f74416yadqdtsiqt == 18) {
                byte[] bArr2 = this.f74412iozdgvuglv;
                if (bArr2.length != 6) {
                    sb3.append("<invalid BADTIME other data>");
                } else {
                    long j13 = (((long) (bArr2[0] & 255)) << 40) + (((long) (bArr2[1] & 255)) << 32) + ((long) ((bArr2[2] & 255) << 24)) + ((long) ((bArr2[3] & 255) << 16)) + ((long) ((bArr2[4] & 255) << 8)) + ((long) (bArr2[5] & 255));
                    sb3.append("<server time: ");
                    sb3.append(Instant.ofEpochSecond(j13));
                    sb3.append(">");
                }
            } else {
                sb3.append("<");
                sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74412iozdgvuglv));
                sb3.append(">");
            }
        }
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append(" )");
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74414lereixgezr.lmojexxdyd(jyumaefsclVar, null, z13);
        long epochSecond = this.f74415pmvmpeiblj.getEpochSecond();
        jyumaefsclVar.dxjokdxxww((int) (epochSecond >> 32));
        jyumaefsclVar.gtknphoqwx(epochSecond & 4294967295L);
        jyumaefsclVar.dxjokdxxww((int) this.f74417zynmafqrjb.getSeconds());
        jyumaefsclVar.dxjokdxxww(this.f74413istkbnxepw.length);
        jyumaefsclVar.gxszxtbevo(this.f74413istkbnxepw);
        jyumaefsclVar.dxjokdxxww(this.f74411cdpycssgdh);
        jyumaefsclVar.dxjokdxxww(this.f74416yadqdtsiqt);
        byte[] bArr = this.f74412iozdgvuglv;
        if (bArr == null) {
            jyumaefsclVar.dxjokdxxww(0);
        } else {
            jyumaefsclVar.dxjokdxxww(bArr.length);
            jyumaefsclVar.gxszxtbevo(this.f74412iozdgvuglv);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74414lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74415pmvmpeiblj = Instant.ofEpochSecond((((long) zdlpuopuiuVar.nufgyqmvbu()) << 32) + zdlpuopuiuVar.dxjokdxxww());
        this.f74417zynmafqrjb = Duration.ofSeconds(zdlpuopuiuVar.nufgyqmvbu());
        this.f74413istkbnxepw = zdlpuopuiuVar.gxszxtbevo(zdlpuopuiuVar.nufgyqmvbu());
        this.f74411cdpycssgdh = zdlpuopuiuVar.nufgyqmvbu();
        this.f74416yadqdtsiqt = zdlpuopuiuVar.nufgyqmvbu();
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        if (iNufgyqmvbu > 0) {
            this.f74412iozdgvuglv = zdlpuopuiuVar.gxszxtbevo(iNufgyqmvbu);
        } else {
            this.f74412iozdgvuglv = null;
        }
    }
}
