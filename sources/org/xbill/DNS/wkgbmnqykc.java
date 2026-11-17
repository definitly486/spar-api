package org.xbill.DNS;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f74548lereixgezr;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f74549iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f74550ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final Object f74551wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f74552zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f74549iobyxmoadg == zoijcleaowVar.f74549iobyxmoadg && this.f74552zoijcleaow == zoijcleaowVar.f74552zoijcleaow && this.f74550ppxfxbqfkf == zoijcleaowVar.f74550ppxfxbqfkf && this.f74551wkgbmnqykc.equals(zoijcleaowVar.f74551wkgbmnqykc);
        }

        public int hashCode() {
            return this.f74551wkgbmnqykc.hashCode() + this.f74550ppxfxbqfkf + (this.f74552zoijcleaow ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            if (this.f74552zoijcleaow) {
                sb3.append("!");
            }
            sb3.append(this.f74549iobyxmoadg);
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            int i13 = this.f74549iobyxmoadg;
            if (i13 == 1 || i13 == 2) {
                sb3.append(((InetAddress) this.f74551wkgbmnqykc).getHostAddress());
            } else {
                sb3.append(km.iobyxmoadg.iobyxmoadg((byte[]) this.f74551wkgbmnqykc));
            }
            sb3.append(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
            sb3.append(this.f74550ppxfxbqfkf);
            return sb3.toString();
        }

        private zoijcleaow(int i13, boolean z13, Object obj, int i14) {
            this.f74549iobyxmoadg = i13;
            this.f74552zoijcleaow = z13;
            this.f74551wkgbmnqykc = obj;
            this.f74550ppxfxbqfkf = i14;
            if (!wkgbmnqykc.jlmebxxoox(i13, i14)) {
                throw new IllegalArgumentException("invalid prefix length");
            }
        }

        public zoijcleaow(boolean z13, InetAddress inetAddress, int i13) {
            this(gxszxtbevo.ppxfxbqfkf(inetAddress), z13, inetAddress, i13);
        }
    }

    wkgbmnqykc() {
    }

    private static byte[] crxdokpmqz(byte[] bArr, int i13) throws WireParseException {
        if (bArr.length > i13) {
            throw new WireParseException("invalid address length");
        }
        if (bArr.length == i13) {
            return bArr;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean jlmebxxoox(int i13, int i14) {
        if (i14 < 0 || i14 >= 256) {
            return false;
        }
        if (i13 != 1 || i14 <= 32) {
            return i13 != 2 || i14 <= 128;
        }
        return false;
    }

    private static int sopmlzcsov(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] != 0) {
                return length + 1;
            }
        }
        return 0;
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = this.f74548lereixgezr.iterator();
        while (it.hasNext()) {
            sb3.append((zoijcleaow) it.next());
            if (it.hasNext()) {
                sb3.append(" ");
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        byte[] address;
        int iSopmlzcsov;
        for (zoijcleaow zoijcleaowVar : this.f74548lereixgezr) {
            int i13 = zoijcleaowVar.f74549iobyxmoadg;
            if (i13 == 1 || i13 == 2) {
                address = ((InetAddress) zoijcleaowVar.f74551wkgbmnqykc).getAddress();
                iSopmlzcsov = sopmlzcsov(address);
            } else {
                address = (byte[]) zoijcleaowVar.f74551wkgbmnqykc;
                iSopmlzcsov = address.length;
            }
            int i14 = zoijcleaowVar.f74552zoijcleaow ? iSopmlzcsov | UserVerificationMethods.USER_VERIFY_PATTERN : iSopmlzcsov;
            jyumaefsclVar.dxjokdxxww(zoijcleaowVar.f74549iobyxmoadg);
            jyumaefsclVar.draadjrbmk(zoijcleaowVar.f74550ppxfxbqfkf);
            jyumaefsclVar.draadjrbmk(i14);
            jyumaefsclVar.lqeggnwhkg(address, 0, iSopmlzcsov);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74548lereixgezr = new ArrayList(1);
        while (zdlpuopuiuVar.gtknphoqwx() != 0) {
            int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
            int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
            int iBtonecajqb2 = zdlpuopuiuVar.btonecajqb();
            boolean z13 = (iBtonecajqb2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            byte[] bArrGxszxtbevo = zdlpuopuiuVar.gxszxtbevo(iBtonecajqb2 & (-129));
            if (!jlmebxxoox(iNufgyqmvbu, iBtonecajqb)) {
                throw new WireParseException("invalid prefix length");
            }
            this.f74548lereixgezr.add((iNufgyqmvbu == 1 || iNufgyqmvbu == 2) ? new zoijcleaow(z13, InetAddress.getByAddress(crxdokpmqz(bArrGxszxtbevo, gxszxtbevo.zoijcleaow(iNufgyqmvbu))), iBtonecajqb) : new zoijcleaow(iNufgyqmvbu, z13, bArrGxszxtbevo, iBtonecajqb));
        }
    }
}
