package org.xbill.DNS;

import java.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
public class n0 extends yadqdtsiqt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Duration f74481ppxfxbqfkf = Duration.ofMillis(6553600);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Integer f74482zoijcleaow;

    public n0() {
        super(11);
        this.f74482zoijcleaow = null;
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    String eablkybsjg() {
        Integer num = this.f74482zoijcleaow;
        return num != null ? String.valueOf(num) : "-";
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void gxszxtbevo(jyumaefscl jyumaefsclVar) {
        Integer num = this.f74482zoijcleaow;
        if (num != null) {
            jyumaefsclVar.dxjokdxxww(num.intValue());
        }
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        int iGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
        if (iGtknphoqwx == 0) {
            this.f74482zoijcleaow = null;
            return;
        }
        if (iGtknphoqwx == 2) {
            this.f74482zoijcleaow = Integer.valueOf(zdlpuopuiuVar.nufgyqmvbu());
            return;
        }
        throw new WireParseException("invalid length (" + iGtknphoqwx + ") of the data in the edns_tcp_keepalive option");
    }
}
