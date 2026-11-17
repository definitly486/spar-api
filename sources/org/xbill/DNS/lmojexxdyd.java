package org.xbill.DNS;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class lmojexxdyd extends yadqdtsiqt {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final oipsdeybqn f74455wkgbmnqykc;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f74456ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f74457zoijcleaow;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("EDNS Extended Error Codes", 1);
        f74455wkgbmnqykc = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(65535);
        oipsdeybqnVar.nufgyqmvbu("EDE");
        oipsdeybqnVar.iobyxmoadg(0, "OTHER");
        oipsdeybqnVar.iobyxmoadg(1, "UNSUPPORTED_DNSKEY_ALGORITHM");
        oipsdeybqnVar.iobyxmoadg(2, "UNSUPPORTED_DS_DIGEST_TYPE");
        oipsdeybqnVar.iobyxmoadg(3, "STALE_ANSWER");
        oipsdeybqnVar.iobyxmoadg(4, "FORGED_ANSWER");
        oipsdeybqnVar.iobyxmoadg(5, "DNSSEC_INDETERMINATE");
        oipsdeybqnVar.iobyxmoadg(6, "DNSSEC_BOGUS");
        oipsdeybqnVar.iobyxmoadg(7, "SIGNATURE_EXPIRED");
        oipsdeybqnVar.iobyxmoadg(8, "SIGNATURE_NOT_YET_VALID");
        oipsdeybqnVar.iobyxmoadg(9, "DNSKEY_MISSING");
        oipsdeybqnVar.iobyxmoadg(10, "RRSIGS_MISSING");
        oipsdeybqnVar.iobyxmoadg(11, "NO_ZONE_KEY_BIT_SET");
        oipsdeybqnVar.iobyxmoadg(12, "NSEC_MISSING");
        oipsdeybqnVar.iobyxmoadg(13, "CACHED_ERROR");
        oipsdeybqnVar.iobyxmoadg(14, "NOT_READY");
        oipsdeybqnVar.iobyxmoadg(15, "BLOCKED");
        oipsdeybqnVar.iobyxmoadg(16, "CENSORED");
        oipsdeybqnVar.iobyxmoadg(17, "FILTERED");
        oipsdeybqnVar.iobyxmoadg(18, "PROHIBITED");
        oipsdeybqnVar.iobyxmoadg(19, "STALE_NXDOMAIN_ANSWER");
        oipsdeybqnVar.iobyxmoadg(20, "NOT_AUTHORITATIVE");
        oipsdeybqnVar.iobyxmoadg(21, "NOT_SUPPORTED");
        oipsdeybqnVar.iobyxmoadg(22, "NO_REACHABLE_AUTHORITY");
        oipsdeybqnVar.iobyxmoadg(23, "NETWORK_ERROR");
        oipsdeybqnVar.iobyxmoadg(24, "INVALID_DATA");
    }

    lmojexxdyd() {
        super(15);
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    String eablkybsjg() {
        if (this.f74456ppxfxbqfkf == null) {
            return f74455wkgbmnqykc.wkgbmnqykc(this.f74457zoijcleaow);
        }
        return f74455wkgbmnqykc.wkgbmnqykc(this.f74457zoijcleaow) + ": " + this.f74456ppxfxbqfkf;
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void gxszxtbevo(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.dxjokdxxww(this.f74457zoijcleaow);
        String str = this.f74456ppxfxbqfkf;
        if (str == null || str.length() <= 0) {
            return;
        }
        jyumaefsclVar.gxszxtbevo(this.f74456ppxfxbqfkf.getBytes(StandardCharsets.UTF_8));
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) {
        this.f74457zoijcleaow = zdlpuopuiuVar.nufgyqmvbu();
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            byte[] bArrEablkybsjg = zdlpuopuiuVar.eablkybsjg();
            int length = bArrEablkybsjg.length;
            if (bArrEablkybsjg[bArrEablkybsjg.length - 1] == 0) {
                length--;
            }
            this.f74456ppxfxbqfkf = new String(bArrEablkybsjg, 0, length, StandardCharsets.UTF_8);
        }
    }
}
