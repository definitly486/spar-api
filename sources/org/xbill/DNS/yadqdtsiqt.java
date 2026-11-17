package org.xbill.DNS;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f74595iobyxmoadg;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final oipsdeybqn f74596iobyxmoadg;

        static {
            oipsdeybqn oipsdeybqnVar = new oipsdeybqn("EDNS Option Codes", 1);
            f74596iobyxmoadg = oipsdeybqnVar;
            oipsdeybqnVar.gxszxtbevo(65535);
            oipsdeybqnVar.nufgyqmvbu("CODE");
            oipsdeybqnVar.lqeggnwhkg(true);
            oipsdeybqnVar.iobyxmoadg(1, "LLQ");
            oipsdeybqnVar.iobyxmoadg(2, "UL");
            oipsdeybqnVar.iobyxmoadg(3, "NSID");
            oipsdeybqnVar.iobyxmoadg(5, "DAU");
            oipsdeybqnVar.iobyxmoadg(6, "DHU");
            oipsdeybqnVar.iobyxmoadg(7, "N3U");
            oipsdeybqnVar.iobyxmoadg(8, "edns-client-subnet");
            oipsdeybqnVar.iobyxmoadg(9, "EDNS_EXPIRE");
            oipsdeybqnVar.iobyxmoadg(10, "COOKIE");
            oipsdeybqnVar.iobyxmoadg(11, "edns-tcp-keepalive");
            oipsdeybqnVar.iobyxmoadg(12, "Padding");
            oipsdeybqnVar.iobyxmoadg(13, "CHAIN");
            oipsdeybqnVar.iobyxmoadg(14, "edns-key-tag");
            oipsdeybqnVar.iobyxmoadg(15, "Extended_DNS_Error");
            oipsdeybqnVar.iobyxmoadg(16, "EDNS-Client-Tag");
            oipsdeybqnVar.iobyxmoadg(17, "EDNS-Server-Tag");
        }

        public static String iobyxmoadg(int i13) {
            return f74596iobyxmoadg.wkgbmnqykc(i13);
        }
    }

    public yadqdtsiqt(int i13) {
        this.f74595iobyxmoadg = e.lqeggnwhkg("code", i13);
    }

    static yadqdtsiqt iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        yadqdtsiqt nuxfzjnpebVar;
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        int iNufgyqmvbu2 = zdlpuopuiuVar.nufgyqmvbu();
        if (zdlpuopuiuVar.gtknphoqwx() < iNufgyqmvbu2) {
            throw new WireParseException("truncated option");
        }
        int iRgvfuqvkyq = zdlpuopuiuVar.rgvfuqvkyq();
        zdlpuopuiuVar.vdvldrhtss(iNufgyqmvbu2);
        if (iNufgyqmvbu == 3) {
            nuxfzjnpebVar = new nuxfzjnpeb();
        } else if (iNufgyqmvbu == 15) {
            nuxfzjnpebVar = new lmojexxdyd();
        } else if (iNufgyqmvbu == 5 || iNufgyqmvbu == 6 || iNufgyqmvbu == 7) {
            nuxfzjnpebVar = new cdpycssgdh(iNufgyqmvbu, new int[0]);
        } else if (iNufgyqmvbu == 8) {
            nuxfzjnpebVar = new wflxmlrfwp();
        } else if (iNufgyqmvbu != 10) {
            nuxfzjnpebVar = iNufgyqmvbu != 11 ? new tzroggbefp(iNufgyqmvbu) : new n0();
        } else {
            nuxfzjnpebVar = new ojitshcjhn();
        }
        nuxfzjnpebVar.wkgbmnqykc(zdlpuopuiuVar);
        zdlpuopuiuVar.agtfadlqog(iRgvfuqvkyq);
        return nuxfzjnpebVar;
    }

    abstract String eablkybsjg();

    public boolean equals(Object obj) {
        if (!(obj instanceof yadqdtsiqt)) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        if (this.f74595iobyxmoadg != yadqdtsiqtVar.f74595iobyxmoadg) {
            return false;
        }
        return Arrays.equals(ppxfxbqfkf(), yadqdtsiqtVar.ppxfxbqfkf());
    }

    abstract void gxszxtbevo(jyumaefscl jyumaefsclVar);

    public int hashCode() {
        int i13 = 0;
        for (byte b13 : ppxfxbqfkf()) {
            i13 += (i13 << 3) + (b13 & 255);
        }
        return i13;
    }

    void lqeggnwhkg(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.dxjokdxxww(this.f74595iobyxmoadg);
        int iZoijcleaow = jyumaefsclVar.zoijcleaow();
        jyumaefsclVar.dxjokdxxww(0);
        gxszxtbevo(jyumaefsclVar);
        jyumaefsclVar.btonecajqb((jyumaefsclVar.zoijcleaow() - iZoijcleaow) - 2, iZoijcleaow);
    }

    byte[] ppxfxbqfkf() {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        gxszxtbevo(jyumaefsclVar);
        return jyumaefsclVar.eablkybsjg();
    }

    public String toString() {
        return "{" + iobyxmoadg.iobyxmoadg(this.f74595iobyxmoadg) + ": " + eablkybsjg() + "}";
    }

    abstract void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar);

    public int zoijcleaow() {
        return this.f74595iobyxmoadg;
    }
}
