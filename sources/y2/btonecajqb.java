package y2;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte[] f123523iobyxmoadg = {0, 0, 0, 1};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String[] f123525zoijcleaow = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f123524ppxfxbqfkf = Pattern.compile("^\\D?(\\d+)$");

    public static Pair agtfadlqog(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        byte b13 = 0;
        String str = iobyxmoadgVar.f9754gtknphoqwx;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            return ojitshcjhn(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b13 = -1;
                }
                break;
            case 3006243:
                b13 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b13 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b13 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b13 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b13 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3475740:
                b13 = !str2.equals("s263") ? (byte) -1 : (byte) 6;
                break;
            case 3624515:
                b13 = !str2.equals("vp09") ? (byte) -1 : (byte) 7;
                break;
            default:
                b13 = -1;
                break;
        }
        switch (b13) {
            case 0:
                return draadjrbmk(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit, iobyxmoadgVar.f9760istkbnxepw);
            case 1:
            case 2:
                return wflxmlrfwp(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit);
            case 3:
            case 4:
                return vdvldrhtss(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit, iobyxmoadgVar.f9760istkbnxepw);
            case 5:
                return gtknphoqwx(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit);
            case 6:
                return rgvfuqvkyq(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit);
            case 7:
                return oxmwwwfdhm(iobyxmoadgVar.f9754gtknphoqwx, strArrSplit);
            default:
                return null;
        }
    }

    private static Integer btonecajqb(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
            case "08":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case "09":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
            case "10":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
            default:
                return null;
        }
    }

    private static int cqumvgiudr(int i13) {
        if (i13 == 0) {
            return 1;
        }
        if (i13 == 1) {
            return 2;
        }
        if (i13 != 2) {
            return i13 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Pair draadjrbmk(String str, String[] strArr, v2.dxjokdxxww dxjokdxxwwVar) {
        int i13;
        if (strArr.length < 4) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i14 = 1;
        try {
            int i15 = Integer.parseInt(strArr[1]);
            int i16 = Integer.parseInt(strArr[2].substring(0, 2));
            int i17 = Integer.parseInt(strArr[3]);
            if (i15 != 0) {
                kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown AV1 profile: " + i15);
                return null;
            }
            if (i17 != 8 && i17 != 10) {
                kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i17);
                return null;
            }
            if (i17 != 8) {
                i14 = (dxjokdxxwwVar == null || !(dxjokdxxwwVar.f115327wkgbmnqykc != null || (i13 = dxjokdxxwwVar.f115326ppxfxbqfkf) == 7 || i13 == 6)) ? 2 : 4096;
            }
            int iIobyxmoadg = iobyxmoadg(i16);
            if (iIobyxmoadg != -1) {
                return new Pair(Integer.valueOf(i14), Integer.valueOf(iIobyxmoadg));
            }
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown AV1 level: " + i16);
            return null;
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Integer dxjokdxxww(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
            case "09":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case "10":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
            case "11":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    public static List eablkybsjg(boolean z13) {
        return Collections.singletonList(z13 ? new byte[]{1} : new byte[]{0});
    }

    private static Pair gtknphoqwx(String str, String[] strArr) {
        int iZdlpuopuiu;
        if (strArr.length != 3) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(v2.iwizpuwonk.nufgyqmvbu(Integer.parseInt(strArr[1], 16))) && (iZdlpuopuiu = zdlpuopuiu(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iZdlpuopuiu), 0);
            }
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String gxszxtbevo(int i13, boolean z13, int i14, int i15, int[] iArr, int i16) {
        StringBuilder sb3 = new StringBuilder(stevsuqkhv.iozdgvuglv("hvc1.%s%d.%X.%c%d", f123525zoijcleaow[i13], Integer.valueOf(i14), Integer.valueOf(i15), Character.valueOf(z13 ? 'H' : 'L'), Integer.valueOf(i16)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i17 = 0; i17 < length; i17++) {
            sb3.append(String.format(".%02X", Integer.valueOf(iArr[i17])));
        }
        return sb3.toString();
    }

    private static int iobyxmoadg(int i13) {
        switch (i13) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return UserVerificationMethods.USER_VERIFY_PATTERN;
            case 8:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            case 9:
                return UserVerificationMethods.USER_VERIFY_NONE;
            case 10:
                return UserVerificationMethods.USER_VERIFY_ALL;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int iwizpuwonk(int i13) {
        if (i13 == 10) {
            return 1;
        }
        if (i13 == 11) {
            return 2;
        }
        if (i13 == 20) {
            return 4;
        }
        if (i13 == 21) {
            return 8;
        }
        if (i13 == 30) {
            return 16;
        }
        if (i13 == 31) {
            return 32;
        }
        if (i13 == 40) {
            return 64;
        }
        if (i13 == 41) {
            return UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (i13 == 50) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (i13 == 51) {
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
        switch (i13) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static boolean jyumaefscl(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    private static Integer kcexrzcfyt(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
            case "H93":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return 524288;
            case "H180":
                return 2097152;
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return 1048576;
            case "L183":
                return 4194304;
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    public static byte[] lqeggnwhkg(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = f123523iobyxmoadg;
        byte[] bArr3 = new byte[bArr2.length + i14];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i13, bArr3, bArr2.length, i14);
        return bArr3;
    }

    public static com.google.common.collect.zdlpuopuiu nufgyqmvbu(byte b13, byte b14, byte b15, byte b16) {
        return com.google.common.collect.zdlpuopuiu.istkbnxepw(new byte[]{1, 1, b13, 2, 1, b14, 3, 1, b15, 4, 1, b16});
    }

    private static Pair ojitshcjhn(String str, String[] strArr) {
        if (strArr.length < 3) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f123524ppxfxbqfkf.matcher(strArr[1]);
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numBtonecajqb = btonecajqb(strGroup);
        if (numBtonecajqb == null) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDxjokdxxww = dxjokdxxww(str2);
        if (numDxjokdxxww != null) {
            return new Pair(numBtonecajqb, numDxjokdxxww);
        }
        kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair oxmwwwfdhm(String str, String[] strArr) {
        if (strArr.length < 3) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i13 = Integer.parseInt(strArr[1]);
            int i14 = Integer.parseInt(strArr[2]);
            int iCqumvgiudr = cqumvgiudr(i13);
            if (iCqumvgiudr == -1) {
                kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown VP9 profile: " + i13);
                return null;
            }
            int iIwizpuwonk = iwizpuwonk(i14);
            if (iIwizpuwonk != -1) {
                return new Pair(Integer.valueOf(iCqumvgiudr), Integer.valueOf(iIwizpuwonk));
            }
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown VP9 level: " + i14);
            return null;
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static int ppxfxbqfkf(int i13) {
        if (i13 == 66) {
            return 1;
        }
        if (i13 == 77) {
            return 2;
        }
        if (i13 == 88) {
            return 4;
        }
        if (i13 == 100) {
            return 8;
        }
        if (i13 == 110) {
            return 16;
        }
        if (i13 != 122) {
            return i13 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Pair rgvfuqvkyq(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair vdvldrhtss(String str, String[] strArr, v2.dxjokdxxww dxjokdxxwwVar) {
        if (strArr.length < 4) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i13 = 1;
        Matcher matcher = f123524ppxfxbqfkf.matcher(strArr[1]);
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i13 = 6;
            if ("2".equals(strGroup)) {
                i13 = (dxjokdxxwwVar == null || dxjokdxxwwVar.f115326ppxfxbqfkf != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numKcexrzcfyt = kcexrzcfyt(str2);
        if (numKcexrzcfyt != null) {
            return new Pair(Integer.valueOf(i13), numKcexrzcfyt);
        }
        kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair wflxmlrfwp(String str, String[] strArr) {
        int i13;
        int i14;
        if (strArr.length < 2) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i14 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i13 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i15 = Integer.parseInt(strArr[1]);
                i13 = Integer.parseInt(strArr[2]);
                i14 = i15;
            }
            int iPpxfxbqfkf = ppxfxbqfkf(i14);
            if (iPpxfxbqfkf == -1) {
                kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown AVC profile: " + i14);
                return null;
            }
            int iZoijcleaow = zoijcleaow(i13);
            if (iZoijcleaow != -1) {
                return new Pair(Integer.valueOf(iPpxfxbqfkf), Integer.valueOf(iZoijcleaow));
            }
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Unknown AVC level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            kcexrzcfyt.nufgyqmvbu("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static String wkgbmnqykc(int i13, int i14, int i15) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    public static Pair yggfygwlhe(byte[] bArr) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(bArr);
        yadqdtsiqtVar.sopmlzcsov(9);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        yadqdtsiqtVar.sopmlzcsov(20);
        return Pair.create(Integer.valueOf(yadqdtsiqtVar.jpowsppfya()), Integer.valueOf(iWwaezpbzkn));
    }

    private static int zdlpuopuiu(int i13) {
        int i14 = 17;
        if (i13 != 17) {
            i14 = 20;
            if (i13 != 20) {
                i14 = 23;
                if (i13 != 23) {
                    i14 = 29;
                    if (i13 != 29) {
                        i14 = 39;
                        if (i13 != 39) {
                            i14 = 42;
                            if (i13 != 42) {
                                switch (i13) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i14;
    }

    private static int zoijcleaow(int i13) {
        switch (i13) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i13) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return UserVerificationMethods.USER_VERIFY_PATTERN;
                    default:
                        switch (i13) {
                            case 30:
                                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                return UserVerificationMethods.USER_VERIFY_NONE;
                            case 32:
                                return UserVerificationMethods.USER_VERIFY_ALL;
                            default:
                                switch (i13) {
                                    case 40:
                                        return 2048;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i13) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }
}
