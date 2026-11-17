package mk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {
    public static final String iobyxmoadg(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (!kcexrzcfyt.sopmlzcsov(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                zdlpuopuiu.dxjokdxxww(ascii, "toASCII(host)");
                Locale US = Locale.US;
                zdlpuopuiu.dxjokdxxww(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || gxszxtbevo.zoijcleaow(lowerCase) || gxszxtbevo.ppxfxbqfkf(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        byte[] bArrEablkybsjg = (kcexrzcfyt.stevsuqkhv(str, "[", false, 2, null) && kcexrzcfyt.zynmafqrjb(str, "]", false, 2, null)) ? gxszxtbevo.eablkybsjg(str, 1, str.length() - 1) : gxszxtbevo.eablkybsjg(str, 0, str.length());
        if (bArrEablkybsjg == null) {
            return null;
        }
        InetAddress byAddress = InetAddress.getByAddress(bArrEablkybsjg);
        byte[] address = byAddress.getAddress();
        if (address.length == 16) {
            zdlpuopuiu.dxjokdxxww(address, "address");
            return gxszxtbevo.gxszxtbevo(address);
        }
        if (address.length == 4) {
            return byAddress.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
