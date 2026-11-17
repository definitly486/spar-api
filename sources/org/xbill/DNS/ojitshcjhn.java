package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class ojitshcjhn extends yadqdtsiqt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private byte[] f74490ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private byte[] f74491zoijcleaow;

    ojitshcjhn() {
        super(10);
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    String eablkybsjg() {
        if (this.f74490ppxfxbqfkf == null) {
            return km.iobyxmoadg.iobyxmoadg(this.f74491zoijcleaow);
        }
        return km.iobyxmoadg.iobyxmoadg(this.f74491zoijcleaow) + " " + km.iobyxmoadg.iobyxmoadg(this.f74490ppxfxbqfkf);
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void gxszxtbevo(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.gxszxtbevo(this.f74491zoijcleaow);
        byte[] bArr = this.f74490ppxfxbqfkf;
        if (bArr != null) {
            jyumaefsclVar.gxszxtbevo(bArr);
        }
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        int iGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
        if (iGtknphoqwx < 8) {
            throw new WireParseException("invalid length of client cookie");
        }
        this.f74491zoijcleaow = zdlpuopuiuVar.gxszxtbevo(8);
        if (iGtknphoqwx > 8) {
            if (iGtknphoqwx < 16 || iGtknphoqwx > 40) {
                throw new WireParseException("invalid length of server cookie");
            }
            this.f74490ppxfxbqfkf = zdlpuopuiuVar.eablkybsjg();
        }
    }
}
