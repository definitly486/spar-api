package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class k extends e {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f74442cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private long f74443iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f74444istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74445lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private auzgnhcxok f74446pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f74447yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f74448zynmafqrjb;

    k() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74445lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74446pmvmpeiblj);
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append(" (\n\t\t\t\t\t");
            sb3.append(this.f74448zynmafqrjb);
            sb3.append("\t; serial\n\t\t\t\t\t");
            sb3.append(this.f74444istkbnxepw);
            sb3.append("\t; refresh\n\t\t\t\t\t");
            sb3.append(this.f74442cdpycssgdh);
            sb3.append("\t; retry\n\t\t\t\t\t");
            sb3.append(this.f74447yadqdtsiqt);
            sb3.append("\t; expire\n\t\t\t\t\t");
            sb3.append(this.f74443iozdgvuglv);
            sb3.append(" )\t; minimum");
        } else {
            sb3.append(" ");
            sb3.append(this.f74448zynmafqrjb);
            sb3.append(" ");
            sb3.append(this.f74444istkbnxepw);
            sb3.append(" ");
            sb3.append(this.f74442cdpycssgdh);
            sb3.append(" ");
            sb3.append(this.f74447yadqdtsiqt);
            sb3.append(" ");
            sb3.append(this.f74443iozdgvuglv);
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74445lereixgezr.lmojexxdyd(jyumaefsclVar, agtfadlqogVar, z13);
        this.f74446pmvmpeiblj.lmojexxdyd(jyumaefsclVar, agtfadlqogVar, z13);
        jyumaefsclVar.gtknphoqwx(this.f74448zynmafqrjb);
        jyumaefsclVar.gtknphoqwx(this.f74444istkbnxepw);
        jyumaefsclVar.gtknphoqwx(this.f74442cdpycssgdh);
        jyumaefsclVar.gtknphoqwx(this.f74447yadqdtsiqt);
        jyumaefsclVar.gtknphoqwx(this.f74443iozdgvuglv);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74445lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74446pmvmpeiblj = new auzgnhcxok(zdlpuopuiuVar);
        this.f74448zynmafqrjb = zdlpuopuiuVar.dxjokdxxww();
        this.f74444istkbnxepw = zdlpuopuiuVar.dxjokdxxww();
        this.f74442cdpycssgdh = zdlpuopuiuVar.dxjokdxxww();
        this.f74447yadqdtsiqt = zdlpuopuiuVar.dxjokdxxww();
        this.f74443iozdgvuglv = zdlpuopuiuVar.dxjokdxxww();
    }

    public long sopmlzcsov() {
        return this.f74448zynmafqrjb;
    }

    public long ulzqkzuiru() {
        return this.f74443iozdgvuglv;
    }

    public k(auzgnhcxok auzgnhcxokVar, int i13, long j13, auzgnhcxok auzgnhcxokVar2, auzgnhcxok auzgnhcxokVar3, long j14, long j15, long j16, long j17, long j18) {
        super(auzgnhcxokVar, 6, i13, j13);
        this.f74445lereixgezr = e.wkgbmnqykc("host", auzgnhcxokVar2);
        this.f74446pmvmpeiblj = e.wkgbmnqykc("admin", auzgnhcxokVar3);
        this.f74448zynmafqrjb = e.nufgyqmvbu("serial", j14);
        this.f74444istkbnxepw = e.nufgyqmvbu("refresh", j15);
        this.f74442cdpycssgdh = e.nufgyqmvbu("retry", j16);
        this.f74447yadqdtsiqt = e.nufgyqmvbu("expire", j17);
        this.f74443iozdgvuglv = e.nufgyqmvbu("minimum", j18);
    }
}
