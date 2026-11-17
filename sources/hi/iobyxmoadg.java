package hi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final boolean f40421iobyxmoadg;

    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        f40421iobyxmoadg = "true".equals(property);
    }

    public static byte[] eablkybsjg(String[] strArr) {
        if (strArr == null) {
            iobyxmoadg(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrIobyxmoadg = btonecajqb.iobyxmoadg(gxszxtbevo(strArr));
                if (bArrIobyxmoadg == null) {
                    iobyxmoadg(8);
                }
                return bArrIobyxmoadg;
            }
            if (cCharAt == 65535) {
                strArr = gxszxtbevo(strArr);
            }
        }
        byte[] bArrPpxfxbqfkf = ppxfxbqfkf(strArr);
        zoijcleaow(bArrPpxfxbqfkf, 127);
        return wkgbmnqykc(bArrPpxfxbqfkf);
    }

    private static String[] gxszxtbevo(String[] strArr) {
        if (strArr == null) {
            iobyxmoadg(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) ? 2 : 3];
        if (i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i13 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i13 == 3) {
            objArr[1] = "encode8to7";
        } else if (i13 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i13 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i13 == 10) {
            objArr[1] = "dropMarker";
        } else if (i13 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i13 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i13) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 3 && i13 != 6 && i13 != 8 && i13 != 10 && i13 != 12 && i13 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private static byte[] ppxfxbqfkf(String[] strArr) {
        if (strArr == null) {
            iobyxmoadg(11);
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i13 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i14 = 0;
            while (i14 < length2) {
                bArr[i13] = (byte) str2.charAt(i14);
                i14++;
                i13++;
            }
        }
        return bArr;
    }

    private static byte[] wkgbmnqykc(byte[] bArr) {
        if (bArr == null) {
            iobyxmoadg(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i13 + 1;
            int i17 = i14 + 1;
            bArr2[i15] = (byte) (((bArr[i13] & 255) >>> i14) + ((bArr[i16] & ((1 << i17) - 1)) << (7 - i14)));
            if (i14 == 6) {
                i13 += 2;
                i14 = 0;
            } else {
                i13 = i16;
                i14 = i17;
            }
        }
        return bArr2;
    }

    private static void zoijcleaow(byte[] bArr, int i13) {
        if (bArr == null) {
            iobyxmoadg(4);
        }
        int length = bArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            bArr[i14] = (byte) ((bArr[i14] + i13) & 127);
        }
    }
}
