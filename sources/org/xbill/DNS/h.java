package org.xbill.DNS;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
abstract class h extends e {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    protected Instant f74376cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    protected int f74377iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    protected long f74378istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected int f74379lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    protected auzgnhcxok f74380lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected int f74381pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    protected byte[] f74382wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    protected Instant f74383yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected int f74384zynmafqrjb;

    protected h() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(x2.wkgbmnqykc(this.f74379lereixgezr));
        sb3.append(" ");
        sb3.append(this.f74381pmvmpeiblj);
        sb3.append(" ");
        sb3.append(this.f74384zynmafqrjb);
        sb3.append(" ");
        sb3.append(this.f74378istkbnxepw);
        sb3.append(" ");
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("(\n\t");
        }
        sb3.append(stevsuqkhv.iobyxmoadg(this.f74376cdpycssgdh));
        sb3.append(" ");
        sb3.append(stevsuqkhv.iobyxmoadg(this.f74383yadqdtsiqt));
        sb3.append(" ");
        sb3.append(this.f74377iozdgvuglv);
        sb3.append(" ");
        sb3.append(this.f74380lmojexxdyd);
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("\n");
            sb3.append(km.ppxfxbqfkf.iobyxmoadg(this.f74382wwaezpbzkn, 64, "\t", true));
        } else {
            sb3.append(" ");
            sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74382wwaezpbzkn));
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74379lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74381pmvmpeiblj);
        jyumaefsclVar.draadjrbmk(this.f74384zynmafqrjb);
        jyumaefsclVar.gtknphoqwx(this.f74378istkbnxepw);
        jyumaefsclVar.gtknphoqwx(this.f74376cdpycssgdh.getEpochSecond());
        jyumaefsclVar.gtknphoqwx(this.f74383yadqdtsiqt.getEpochSecond());
        jyumaefsclVar.dxjokdxxww(this.f74377iozdgvuglv);
        this.f74380lmojexxdyd.lmojexxdyd(jyumaefsclVar, null, z13);
        jyumaefsclVar.gxszxtbevo(this.f74382wwaezpbzkn);
    }

    @Override // org.xbill.DNS.e
    public int lereixgezr() {
        return this.f74379lereixgezr;
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74379lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74381pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        this.f74384zynmafqrjb = zdlpuopuiuVar.btonecajqb();
        this.f74378istkbnxepw = zdlpuopuiuVar.dxjokdxxww();
        this.f74376cdpycssgdh = Instant.ofEpochSecond(zdlpuopuiuVar.dxjokdxxww());
        this.f74383yadqdtsiqt = Instant.ofEpochSecond(zdlpuopuiuVar.dxjokdxxww());
        this.f74377iozdgvuglv = zdlpuopuiuVar.nufgyqmvbu();
        this.f74380lmojexxdyd = new auzgnhcxok(zdlpuopuiuVar);
        this.f74382wwaezpbzkn = zdlpuopuiuVar.eablkybsjg();
    }

    public int ulzqkzuiru() {
        return this.f74379lereixgezr;
    }
}
