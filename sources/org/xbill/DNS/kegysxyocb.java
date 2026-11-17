package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class kegysxyocb extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74449lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private byte[] f74450pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private byte[] f74451zynmafqrjb;

    kegysxyocb() {
    }

    private void ribwqtqdhb(double d13, double d14) {
        if (d13 < -90.0d || d13 > 90.0d) {
            throw new IllegalArgumentException("illegal longitude " + d13);
        }
        if (d14 < -180.0d || d14 > 180.0d) {
            throw new IllegalArgumentException("illegal latitude " + d14);
        }
    }

    public double crxdokpmqz() {
        return Double.parseDouble(jlmebxxoox());
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return e.iobyxmoadg(this.f74450pmvmpeiblj, true) + " " + e.iobyxmoadg(this.f74449lereixgezr, true) + " " + e.iobyxmoadg(this.f74451zynmafqrjb, true);
    }

    public String jlmebxxoox() {
        return e.iobyxmoadg(this.f74450pmvmpeiblj, false);
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.nufgyqmvbu(this.f74450pmvmpeiblj);
        jyumaefsclVar.nufgyqmvbu(this.f74449lereixgezr);
        jyumaefsclVar.nufgyqmvbu(this.f74451zynmafqrjb);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74450pmvmpeiblj = zdlpuopuiuVar.lqeggnwhkg();
        this.f74449lereixgezr = zdlpuopuiuVar.lqeggnwhkg();
        this.f74451zynmafqrjb = zdlpuopuiuVar.lqeggnwhkg();
        try {
            ribwqtqdhb(crxdokpmqz(), ulzqkzuiru());
        } catch (IllegalArgumentException e13) {
            throw new WireParseException(e13.getMessage());
        }
    }

    public String sopmlzcsov() {
        return e.iobyxmoadg(this.f74449lereixgezr, false);
    }

    public double ulzqkzuiru() {
        return Double.parseDouble(sopmlzcsov());
    }
}
