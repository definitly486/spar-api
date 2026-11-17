package org.xbill.DNS;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    public static String btonecajqb(byte[] bArr) {
        return (bArr[0] & 255) + "." + (bArr[1] & 255) + "." + (bArr[2] & 255) + "." + (bArr[3] & 255);
    }

    public static byte[] dxjokdxxww(String str, int i13) {
        if (i13 == 1) {
            return lqeggnwhkg(str);
        }
        if (i13 == 2) {
            return nufgyqmvbu(str);
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress eablkybsjg(String str) throws UnknownHostException {
        byte[] bArrDxjokdxxww = dxjokdxxww(str, 1);
        if (bArrDxjokdxxww != null) {
            return InetAddress.getByAddress(str, bArrDxjokdxxww);
        }
        byte[] bArrDxjokdxxww2 = dxjokdxxww(str, 2);
        if (bArrDxjokdxxww2 != null) {
            return InetAddress.getByAddress(str, bArrDxjokdxxww2);
        }
        throw new UnknownHostException("Invalid address: " + str);
    }

    public static InetAddress gtknphoqwx(InetAddress inetAddress, int i13) {
        int i14;
        int iZoijcleaow = zoijcleaow(ppxfxbqfkf(inetAddress)) * 8;
        if (i13 < 0 || i13 > iZoijcleaow) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i13 == iZoijcleaow) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i15 = i13 / 8;
        int i16 = i15 + 1;
        while (true) {
            if (i16 >= address.length) {
                break;
            }
            address[i16] = 0;
            i16++;
        }
        int i17 = 0;
        for (i14 = 0; i14 < i13 % 8; i14++) {
            i17 |= 1 << (7 - i14);
        }
        address[i15] = (byte) (address[i15] & i17);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }

    private static e[] gxszxtbevo(String str, boolean z13) throws UnknownHostException {
        e[] eVarArrOjitshcjhn;
        e[] eVarArrOjitshcjhn2;
        try {
            xrmfcynszj xrmfcynszjVar = new xrmfcynszj(str, 1);
            e[] eVarArrOjitshcjhn3 = xrmfcynszjVar.ojitshcjhn();
            if (eVarArrOjitshcjhn3 != null) {
                if (!z13 || (eVarArrOjitshcjhn = new xrmfcynszj(str, 28).ojitshcjhn()) == null) {
                    return eVarArrOjitshcjhn3;
                }
                e[] eVarArr = new e[eVarArrOjitshcjhn3.length + eVarArrOjitshcjhn.length];
                System.arraycopy(eVarArrOjitshcjhn3, 0, eVarArr, 0, eVarArrOjitshcjhn3.length);
                System.arraycopy(eVarArrOjitshcjhn, 0, eVarArr, eVarArrOjitshcjhn3.length, eVarArrOjitshcjhn.length);
                return eVarArr;
            }
            if (xrmfcynszjVar.nufgyqmvbu() == 4 && (eVarArrOjitshcjhn2 = new xrmfcynszj(str, 28).ojitshcjhn()) != null) {
                return eVarArrOjitshcjhn2;
            }
            throw new UnknownHostException("<" + str + "> could not be resolved: " + xrmfcynszjVar.lqeggnwhkg());
        } catch (TextParseException e13) {
            throw new UnknownHostException("<" + str + "> is invalid: " + e13.getMessage());
        }
    }

    private static InetAddress iobyxmoadg(String str, e eVar) {
        return InetAddress.getByAddress(str, (eVar instanceof eablkybsjg ? ((eablkybsjg) eVar).sopmlzcsov() : ((zoijcleaow) eVar).ulzqkzuiru()).getAddress());
    }

    private static byte[] lqeggnwhkg(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != '.' || i13 == 3 || i14 == 0) {
                    return null;
                }
                bArr[i13] = (byte) i15;
                i15 = 0;
                i13++;
                i14 = 0;
            } else {
                if (i14 == 3) {
                    return null;
                }
                if (i14 > 0 && i15 == 0) {
                    return null;
                }
                i14++;
                i15 = (i15 * 10) + (cCharAt - '0');
                if (i15 > 255) {
                    return null;
                }
            }
        }
        if (i13 != 3 || i14 == 0) {
            return null;
        }
        bArr[i13] = (byte) i15;
        return bArr;
    }

    private static byte[] nufgyqmvbu(String str) {
        int i13;
        byte[] bArrDxjokdxxww;
        byte[] bArr = new byte[16];
        int i14 = -1;
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
        int length = strArrSplit.length;
        int i15 = length - 1;
        if (strArrSplit[0].length() != 0) {
            i13 = 0;
        } else {
            if (i15 <= 0 || strArrSplit[1].length() != 0) {
                return null;
            }
            i13 = 1;
        }
        if (strArrSplit[i15].length() == 0) {
            if (i15 - i13 <= 0 || strArrSplit[length - 2].length() != 0) {
                return null;
            }
            i15 = length - 2;
        }
        if ((i15 - i13) + 1 > 8) {
            return null;
        }
        int i16 = 0;
        while (i13 <= i15) {
            if (strArrSplit[i13].length() != 0) {
                if (strArrSplit[i13].indexOf(46) >= 0) {
                    if (i13 < i15 || i13 > 6 || (bArrDxjokdxxww = dxjokdxxww(strArrSplit[i13], 1)) == null) {
                        return null;
                    }
                    int i17 = 0;
                    while (i17 < 4) {
                        bArr[i16] = bArrDxjokdxxww[i17];
                        i17++;
                        i16++;
                    }
                    break;
                }
                for (int i18 = 0; i18 < strArrSplit[i13].length(); i18++) {
                    try {
                        if (Character.digit(strArrSplit[i13].charAt(i18), 16) < 0) {
                            return null;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                int i19 = Integer.parseInt(strArrSplit[i13], 16);
                if (i19 <= 65535 && i19 >= 0) {
                    int i23 = i16 + 1;
                    bArr[i16] = (byte) (i19 >>> 8);
                    i16 += 2;
                    bArr[i23] = (byte) (i19 & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                return null;
            }
            if (i14 >= 0) {
                return null;
            }
            i14 = i16;
            i13++;
        }
        if (i16 < 16 && i14 < 0) {
            return null;
        }
        if (i14 >= 0) {
            int i24 = (16 - i16) + i14;
            System.arraycopy(bArr, i14, bArr, i24, i16 - i14);
            while (i14 < i24) {
                bArr[i14] = 0;
                i14++;
            }
        }
        return bArr;
    }

    public static int ppxfxbqfkf(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress[] wkgbmnqykc(String str) throws UnknownHostException {
        try {
            return new InetAddress[]{eablkybsjg(str)};
        } catch (UnknownHostException unused) {
            e[] eVarArrGxszxtbevo = gxszxtbevo(str, true);
            InetAddress[] inetAddressArr = new InetAddress[eVarArrGxszxtbevo.length];
            for (int i13 = 0; i13 < eVarArrGxszxtbevo.length; i13++) {
                inetAddressArr[i13] = iobyxmoadg(str, eVarArrGxszxtbevo[i13]);
            }
            return inetAddressArr;
        }
    }

    public static int zoijcleaow(int i13) {
        if (i13 == 1) {
            return 4;
        }
        if (i13 == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }
}
