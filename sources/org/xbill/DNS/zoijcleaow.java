package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74623lereixgezr;

    zoijcleaow() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.f74623lereixgezr);
            if (byAddress.getAddress().length != 4) {
                return byAddress.getHostAddress();
            }
            return "::ffff:" + byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.gxszxtbevo(this.f74623lereixgezr);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74623lereixgezr = zdlpuopuiuVar.gxszxtbevo(16);
    }

    public InetAddress ulzqkzuiru() {
        try {
            auzgnhcxok auzgnhcxokVar = this.f74323zdlpuopuiu;
            return auzgnhcxokVar == null ? InetAddress.getByAddress(this.f74623lereixgezr) : InetAddress.getByAddress(auzgnhcxokVar.toString(), this.f74623lereixgezr);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public zoijcleaow(auzgnhcxok auzgnhcxokVar, int i13, long j13, InetAddress inetAddress) {
        super(auzgnhcxokVar, 28, i13, j13);
        if (gxszxtbevo.ppxfxbqfkf(inetAddress) != 1 && gxszxtbevo.ppxfxbqfkf(inetAddress) != 2) {
            throw new IllegalArgumentException("invalid IPv4/IPv6 address");
        }
        this.f74623lereixgezr = inetAddress.getAddress();
    }
}
