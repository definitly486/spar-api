package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public class wflxmlrfwp extends yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private InetAddress f74544eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74545ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f74546wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f74547zoijcleaow;

    wflxmlrfwp() {
        super(8);
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    String eablkybsjg() {
        return this.f74544eablkybsjg.getHostAddress() + CardDateFormatTextWatcher.DIVIDER_CHARACTER + this.f74545ppxfxbqfkf + ", scope netmask " + this.f74546wkgbmnqykc;
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void gxszxtbevo(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.dxjokdxxww(this.f74547zoijcleaow);
        jyumaefsclVar.draadjrbmk(this.f74545ppxfxbqfkf);
        jyumaefsclVar.draadjrbmk(this.f74546wkgbmnqykc);
        jyumaefsclVar.lqeggnwhkg(this.f74544eablkybsjg.getAddress(), 0, (this.f74545ppxfxbqfkf + 7) / 8);
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        this.f74547zoijcleaow = iNufgyqmvbu;
        if (iNufgyqmvbu != 1 && iNufgyqmvbu != 2) {
            throw new WireParseException("unknown address family");
        }
        int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
        this.f74545ppxfxbqfkf = iBtonecajqb;
        if (iBtonecajqb > gxszxtbevo.zoijcleaow(this.f74547zoijcleaow) * 8) {
            throw new WireParseException("invalid source netmask");
        }
        int iBtonecajqb2 = zdlpuopuiuVar.btonecajqb();
        this.f74546wkgbmnqykc = iBtonecajqb2;
        if (iBtonecajqb2 > gxszxtbevo.zoijcleaow(this.f74547zoijcleaow) * 8) {
            throw new WireParseException("invalid scope netmask");
        }
        byte[] bArrEablkybsjg = zdlpuopuiuVar.eablkybsjg();
        if (bArrEablkybsjg.length != (this.f74545ppxfxbqfkf + 7) / 8) {
            throw new WireParseException("invalid address");
        }
        byte[] bArr = new byte[gxszxtbevo.zoijcleaow(this.f74547zoijcleaow)];
        System.arraycopy(bArrEablkybsjg, 0, bArr, 0, bArrEablkybsjg.length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.f74544eablkybsjg = byAddress;
            if (!gxszxtbevo.gtknphoqwx(byAddress, this.f74545ppxfxbqfkf).equals(this.f74544eablkybsjg)) {
                throw new WireParseException("invalid padding");
            }
        } catch (UnknownHostException e13) {
            throw new WireParseException("invalid address", e13);
        }
    }
}
