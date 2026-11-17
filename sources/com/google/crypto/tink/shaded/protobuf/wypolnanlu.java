package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class wypolnanlu implements jhduphickx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final istkbnxepw f24061agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int[] f24062btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f24063draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f24064dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hkdspvbjdz f24065eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f24066gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f24067gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f24068iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f24069lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f24070nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final metgxyhuhe f24071ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f24072ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final rgvfuqvkyq f24073rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final wwaezpbzkn f24074vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final kegysxyocb f24075wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f24076wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object[] f24077zoijcleaow;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final int[] f24060oxmwwwfdhm = new int[0];

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final Unsafe f24059kcexrzcfyt = yfnezrywwk.cdpycssgdh();

    private wypolnanlu(int[] iArr, Object[] objArr, int i13, int i14, hkdspvbjdz hkdspvbjdzVar, boolean z13, boolean z14, int[] iArr2, int i15, int i16, kegysxyocb kegysxyocbVar, istkbnxepw istkbnxepwVar, metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, wwaezpbzkn wwaezpbzknVar) {
        this.f24068iobyxmoadg = iArr;
        this.f24077zoijcleaow = objArr;
        this.f24072ppxfxbqfkf = i13;
        this.f24076wkgbmnqykc = i14;
        this.f24069lqeggnwhkg = hkdspvbjdzVar instanceof iwizpuwonk;
        this.f24070nufgyqmvbu = z13;
        this.f24067gxszxtbevo = rgvfuqvkyqVar != null && rgvfuqvkyqVar.eablkybsjg(hkdspvbjdzVar);
        this.f24064dxjokdxxww = z14;
        this.f24062btonecajqb = iArr2;
        this.f24066gtknphoqwx = i15;
        this.f24063draadjrbmk = i16;
        this.f24075wflxmlrfwp = kegysxyocbVar;
        this.f24061agtfadlqog = istkbnxepwVar;
        this.f24071ojitshcjhn = metgxyhuheVar;
        this.f24073rgvfuqvkyq = rgvfuqvkyqVar;
        this.f24065eablkybsjg = hkdspvbjdzVar;
        this.f24074vdvldrhtss = wwaezpbzknVar;
    }

    private jhduphickx agtfadlqog(int i13) {
        int i14 = (i13 / 3) * 2;
        jhduphickx jhduphickxVar = (jhduphickx) this.f24077zoijcleaow[i14];
        if (jhduphickxVar != null) {
            return jhduphickxVar;
        }
        jhduphickx jhduphickxVarPpxfxbqfkf = crxdokpmqz.iobyxmoadg().ppxfxbqfkf((Class) this.f24077zoijcleaow[i14 + 1]);
        this.f24077zoijcleaow[i14] = jhduphickxVarPpxfxbqfkf;
        return jhduphickxVarPpxfxbqfkf;
    }

    private int bfopjjpdmp(int i13) {
        return this.f24068iobyxmoadg[i13 + 1];
    }

    private Object btonecajqb(Object obj, int i13, Object obj2, metgxyhuhe metgxyhuheVar, Object obj3) {
        wypolnanlu(i13);
        if (yfnezrywwk.istkbnxepw(obj, stevsuqkhv(bfopjjpdmp(i13))) == null) {
            return obj2;
        }
        draadjrbmk(i13);
        return obj2;
    }

    private static List cdpycssgdh(Object obj, long j13) {
        return (List) yfnezrywwk.istkbnxepw(obj, j13);
    }

    static wypolnanlu cllcsxoeiz(jztzpxfvev jztzpxfvevVar, kegysxyocb kegysxyocbVar, istkbnxepw istkbnxepwVar, metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, wwaezpbzkn wwaezpbzknVar) {
        throw null;
    }

    private boolean cqumvgiudr(Object obj, int i13, int i14) {
        List list = (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(i13));
        if (list.isEmpty()) {
            return true;
        }
        jhduphickx jhduphickxVarAgtfadlqog = agtfadlqog(i14);
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!jhduphickxVarAgtfadlqog.isInitialized(list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    private int crxdokpmqz(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, int i23, eablkybsjg.iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f24059kcexrzcfyt;
        long j14 = this.f24068iobyxmoadg[i23 + 2] & 1048575;
        switch (i19) {
            case 51:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j13, Double.valueOf(eablkybsjg.wkgbmnqykc(bArr, i13)));
                int i24 = i13 + 8;
                unsafe.putInt(obj, j14, i16);
                return i24;
            case 52:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j13, Float.valueOf(eablkybsjg.gtknphoqwx(bArr, i13)));
                int i25 = i13 + 4;
                unsafe.putInt(obj, j14, i16);
                return i25;
            case 53:
            case 54:
                if (i17 != 0) {
                    return i13;
                }
                int iHcddaimhww = eablkybsjg.hcddaimhww(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, Long.valueOf(iobyxmoadgVar.f23922zoijcleaow));
                unsafe.putInt(obj, j14, i16);
                return iHcddaimhww;
            case 55:
            case 62:
                if (i17 != 0) {
                    return i13;
                }
                int iWwaezpbzkn = eablkybsjg.wwaezpbzkn(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, Integer.valueOf(iobyxmoadgVar.f23919iobyxmoadg));
                unsafe.putInt(obj, j14, i16);
                return iWwaezpbzkn;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(obj, j13, Long.valueOf(eablkybsjg.dxjokdxxww(bArr, i13)));
                int i26 = i13 + 8;
                unsafe.putInt(obj, j14, i16);
                return i26;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(obj, j13, Integer.valueOf(eablkybsjg.lqeggnwhkg(bArr, i13)));
                int i27 = i13 + 4;
                unsafe.putInt(obj, j14, i16);
                return i27;
            case 58:
                if (i17 != 0) {
                    return i13;
                }
                int iHcddaimhww2 = eablkybsjg.hcddaimhww(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, Boolean.valueOf(iobyxmoadgVar.f23922zoijcleaow != 0));
                unsafe.putInt(obj, j14, i16);
                return iHcddaimhww2;
            case 59:
                if (i17 != 2) {
                    return i13;
                }
                int iWwaezpbzkn2 = eablkybsjg.wwaezpbzkn(bArr, i13, iobyxmoadgVar);
                int i28 = iobyxmoadgVar.f23919iobyxmoadg;
                if (i28 == 0) {
                    unsafe.putObject(obj, j13, "");
                } else {
                    if ((i18 & 536870912) != 0 && !ydmasvzmpa.agtfadlqog(bArr, iWwaezpbzkn2, iWwaezpbzkn2 + i28)) {
                        throw InvalidProtocolBufferException.nufgyqmvbu();
                    }
                    unsafe.putObject(obj, j13, new String(bArr, iWwaezpbzkn2, i28, esjtqupxsv.f23928zoijcleaow));
                    iWwaezpbzkn2 += i28;
                }
                unsafe.putInt(obj, j14, i16);
                return iWwaezpbzkn2;
            case 60:
                if (i17 != 2) {
                    return i13;
                }
                Object objJpowsppfya = jpowsppfya(obj, i16, i23);
                int iCllcsxoeiz = eablkybsjg.cllcsxoeiz(objJpowsppfya, agtfadlqog(i23), bArr, i13, i14, iobyxmoadgVar);
                zfvoamnweg(obj, i16, i23, objJpowsppfya);
                return iCllcsxoeiz;
            case 61:
                if (i17 != 2) {
                    return i13;
                }
                int iZoijcleaow = eablkybsjg.zoijcleaow(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, iobyxmoadgVar.f23920ppxfxbqfkf);
                unsafe.putInt(obj, j14, i16);
                return iZoijcleaow;
            case 63:
                if (i17 != 0) {
                    return i13;
                }
                int iWwaezpbzkn3 = eablkybsjg.wwaezpbzkn(bArr, i13, iobyxmoadgVar);
                int i29 = iobyxmoadgVar.f23919iobyxmoadg;
                draadjrbmk(i23);
                unsafe.putObject(obj, j13, Integer.valueOf(i29));
                unsafe.putInt(obj, j14, i16);
                return iWwaezpbzkn3;
            case 66:
                if (i17 != 0) {
                    return i13;
                }
                int iWwaezpbzkn4 = eablkybsjg.wwaezpbzkn(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, Integer.valueOf(dxjokdxxww.zoijcleaow(iobyxmoadgVar.f23919iobyxmoadg)));
                unsafe.putInt(obj, j14, i16);
                return iWwaezpbzkn4;
            case 67:
                if (i17 != 0) {
                    return i13;
                }
                int iHcddaimhww3 = eablkybsjg.hcddaimhww(bArr, i13, iobyxmoadgVar);
                unsafe.putObject(obj, j13, Long.valueOf(dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.f23922zoijcleaow)));
                unsafe.putInt(obj, j14, i16);
                return iHcddaimhww3;
            case 68:
                if (i17 != 3) {
                    return i13;
                }
                Object objJpowsppfya2 = jpowsppfya(obj, i16, i23);
                int iHkdspvbjdz = eablkybsjg.hkdspvbjdz(objJpowsppfya2, agtfadlqog(i23), bArr, i13, i14, (i15 & (-8)) | 4, iobyxmoadgVar);
                zfvoamnweg(obj, i16, i23, objJpowsppfya2);
                return iHkdspvbjdz;
            default:
                return i13;
        }
    }

    private static Field czzsidtyhn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private esjtqupxsv.ppxfxbqfkf draadjrbmk(int i13) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f24077zoijcleaow[((i13 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:163:0x031f  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    static wypolnanlu dsvhmnatus(ribwqtqdhb ribwqtqdhbVar, kegysxyocb kegysxyocbVar, istkbnxepw istkbnxepwVar, metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, wwaezpbzkn wwaezpbzknVar) {
        int i13;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i36;
        int i37;
        Field fieldCzzsidtyhn;
        char cCharAt9;
        int i38;
        int i39;
        int i43;
        Object obj;
        Field fieldCzzsidtyhn2;
        int i44;
        Object obj2;
        Field fieldCzzsidtyhn3;
        int i45;
        char cCharAt10;
        int i46;
        char cCharAt11;
        int i47;
        char cCharAt12;
        int i48;
        char cCharAt13;
        boolean z13 = ribwqtqdhbVar.getSyntax() == sopmlzcsov.PROTO3;
        String strZoijcleaow = ribwqtqdhbVar.zoijcleaow();
        int length = strZoijcleaow.length();
        char c13 = 55296;
        if (strZoijcleaow.charAt(0) >= 55296) {
            int i49 = 1;
            while (true) {
                i13 = i49 + 1;
                if (strZoijcleaow.charAt(i49) < 55296) {
                    break;
                }
                i49 = i13;
            }
        } else {
            i13 = 1;
        }
        int i53 = i13 + 1;
        int iCharAt6 = strZoijcleaow.charAt(i13);
        if (iCharAt6 >= 55296) {
            int i54 = iCharAt6 & 8191;
            int i55 = 13;
            while (true) {
                i48 = i53 + 1;
                cCharAt13 = strZoijcleaow.charAt(i53);
                if (cCharAt13 < 55296) {
                    break;
                }
                i54 |= (cCharAt13 & 8191) << i55;
                i55 += 13;
                i53 = i48;
            }
            iCharAt6 = i54 | (cCharAt13 << i55);
            i53 = i48;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i14 = 0;
            iArr = f24060oxmwwwfdhm;
            i15 = 0;
        } else {
            int i56 = i53 + 1;
            int iCharAt7 = strZoijcleaow.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i26 = i56 + 1;
                    cCharAt8 = strZoijcleaow.charAt(i56);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt8 & 8191) << i58;
                    i58 += 13;
                    i56 = i26;
                }
                iCharAt7 = i57 | (cCharAt8 << i58);
                i56 = i26;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strZoijcleaow.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i25 = i59 + 1;
                    cCharAt7 = strZoijcleaow.charAt(i59);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt7 & 8191) << i64;
                    i64 += 13;
                    i59 = i25;
                }
                iCharAt8 = i63 | (cCharAt7 << i64);
                i59 = i25;
            }
            int i65 = i59 + 1;
            iCharAt = strZoijcleaow.charAt(i59);
            if (iCharAt >= 55296) {
                int i66 = iCharAt & 8191;
                int i67 = 13;
                while (true) {
                    i24 = i65 + 1;
                    cCharAt6 = strZoijcleaow.charAt(i65);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt6 & 8191) << i67;
                    i67 += 13;
                    i65 = i24;
                }
                iCharAt = i66 | (cCharAt6 << i67);
                i65 = i24;
            }
            int i68 = i65 + 1;
            iCharAt2 = strZoijcleaow.charAt(i65);
            if (iCharAt2 >= 55296) {
                int i69 = iCharAt2 & 8191;
                int i73 = 13;
                while (true) {
                    i23 = i68 + 1;
                    cCharAt5 = strZoijcleaow.charAt(i68);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt5 & 8191) << i73;
                    i73 += 13;
                    i68 = i23;
                }
                iCharAt2 = i69 | (cCharAt5 << i73);
                i68 = i23;
            }
            int i74 = i68 + 1;
            iCharAt3 = strZoijcleaow.charAt(i68);
            if (iCharAt3 >= 55296) {
                int i75 = iCharAt3 & 8191;
                int i76 = 13;
                while (true) {
                    i19 = i74 + 1;
                    cCharAt4 = strZoijcleaow.charAt(i74);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt4 & 8191) << i76;
                    i76 += 13;
                    i74 = i19;
                }
                iCharAt3 = i75 | (cCharAt4 << i76);
                i74 = i19;
            }
            int i77 = i74 + 1;
            iCharAt4 = strZoijcleaow.charAt(i74);
            if (iCharAt4 >= 55296) {
                int i78 = iCharAt4 & 8191;
                int i79 = 13;
                while (true) {
                    i18 = i77 + 1;
                    cCharAt3 = strZoijcleaow.charAt(i77);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt3 & 8191) << i79;
                    i79 += 13;
                    i77 = i18;
                }
                iCharAt4 = i78 | (cCharAt3 << i79);
                i77 = i18;
            }
            int i83 = i77 + 1;
            int iCharAt9 = strZoijcleaow.charAt(i77);
            if (iCharAt9 >= 55296) {
                int i84 = iCharAt9 & 8191;
                int i85 = 13;
                while (true) {
                    i17 = i83 + 1;
                    cCharAt2 = strZoijcleaow.charAt(i83);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt2 & 8191) << i85;
                    i85 += 13;
                    i83 = i17;
                }
                iCharAt9 = i84 | (cCharAt2 << i85);
                i83 = i17;
            }
            int i86 = i83 + 1;
            iCharAt5 = strZoijcleaow.charAt(i83);
            if (iCharAt5 >= 55296) {
                int i87 = iCharAt5 & 8191;
                int i88 = 13;
                while (true) {
                    i16 = i86 + 1;
                    cCharAt = strZoijcleaow.charAt(i86);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i87 |= (cCharAt & 8191) << i88;
                    i88 += 13;
                    i86 = i16;
                }
                iCharAt5 = i87 | (cCharAt << i88);
                i86 = i16;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i14 = (iCharAt7 * 2) + iCharAt8;
            i15 = iCharAt7;
            i53 = i86;
        }
        Unsafe unsafe = f24059kcexrzcfyt;
        Object[] objArrIobyxmoadg = ribwqtqdhbVar.iobyxmoadg();
        Class<?> cls = ribwqtqdhbVar.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i89 = iCharAt5 + iCharAt4;
        int i93 = iCharAt5;
        int i94 = i89;
        int i95 = 0;
        int i96 = 0;
        while (i53 < length) {
            int i97 = i53 + 1;
            int iCharAt10 = strZoijcleaow.charAt(i53);
            if (iCharAt10 >= c13) {
                int i98 = iCharAt10 & 8191;
                int i99 = i97;
                int i100 = 13;
                while (true) {
                    i47 = i99 + 1;
                    cCharAt12 = strZoijcleaow.charAt(i99);
                    if (cCharAt12 < c13) {
                        break;
                    }
                    i98 |= (cCharAt12 & 8191) << i100;
                    i100 += 13;
                    i99 = i47;
                }
                iCharAt10 = i98 | (cCharAt12 << i100);
                i27 = i47;
            } else {
                i27 = i97;
            }
            int i101 = i27 + 1;
            int iCharAt11 = strZoijcleaow.charAt(i27);
            if (iCharAt11 >= c13) {
                int i102 = iCharAt11 & 8191;
                int i103 = i101;
                int i104 = 13;
                while (true) {
                    i46 = i103 + 1;
                    cCharAt11 = strZoijcleaow.charAt(i103);
                    i28 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i102 |= (cCharAt11 & 8191) << i104;
                    i104 += 13;
                    i103 = i46;
                    length = i28;
                }
                iCharAt11 = i102 | (cCharAt11 << i104);
                i29 = i46;
            } else {
                i28 = length;
                i29 = i101;
            }
            int i105 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i106 = iCharAt5;
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i95] = i96;
                i95++;
            }
            int i107 = i95;
            if (i105 >= 51) {
                int i108 = i29 + 1;
                int iCharAt12 = strZoijcleaow.charAt(i29);
                char c14 = 55296;
                if (iCharAt12 >= 55296) {
                    int i109 = iCharAt12 & 8191;
                    int i110 = 13;
                    while (true) {
                        i45 = i108 + 1;
                        cCharAt10 = strZoijcleaow.charAt(i108);
                        if (cCharAt10 < c14) {
                            break;
                        }
                        i109 |= (cCharAt10 & 8191) << i110;
                        i110 += 13;
                        i108 = i45;
                        c14 = 55296;
                    }
                    iCharAt12 = i109 | (cCharAt10 << i110);
                    i108 = i45;
                }
                int i111 = i105 - 51;
                int i112 = i108;
                if (i111 == 9 || i111 == 17) {
                    i39 = i14 + 1;
                    objArr[((i96 / 3) * 2) + 1] = objArrIobyxmoadg[i14];
                } else {
                    if (i111 == 12 && !z13) {
                        i39 = i14 + 1;
                        objArr[((i96 / 3) * 2) + 1] = objArrIobyxmoadg[i14];
                    }
                    i43 = iCharAt12 * 2;
                    obj = objArrIobyxmoadg[i43];
                    if (obj instanceof Field) {
                        fieldCzzsidtyhn2 = (Field) obj;
                    } else {
                        fieldCzzsidtyhn2 = czzsidtyhn(cls, (String) obj);
                        objArrIobyxmoadg[i43] = fieldCzzsidtyhn2;
                    }
                    i33 = iCharAt;
                    i34 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn2);
                    i44 = i43 + 1;
                    obj2 = objArrIobyxmoadg[i44];
                    if (obj2 instanceof Field) {
                        fieldCzzsidtyhn3 = (Field) obj2;
                    } else {
                        fieldCzzsidtyhn3 = czzsidtyhn(cls, (String) obj2);
                        objArrIobyxmoadg[i44] = fieldCzzsidtyhn3;
                    }
                    strZoijcleaow = strZoijcleaow;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn3);
                    z13 = z13;
                    i36 = i112;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i37 = 0;
                }
                i14 = i39;
                i43 = iCharAt12 * 2;
                obj = objArrIobyxmoadg[i43];
                if (obj instanceof Field) {
                    fieldCzzsidtyhn2 = (Field) obj;
                } else {
                    fieldCzzsidtyhn2 = czzsidtyhn(cls, (String) obj);
                    objArrIobyxmoadg[i43] = fieldCzzsidtyhn2;
                }
                i33 = iCharAt;
                i34 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn2);
                i44 = i43 + 1;
                obj2 = objArrIobyxmoadg[i44];
                if (obj2 instanceof Field) {
                    fieldCzzsidtyhn3 = (Field) obj2;
                } else {
                    fieldCzzsidtyhn3 = czzsidtyhn(cls, (String) obj2);
                    objArrIobyxmoadg[i44] = fieldCzzsidtyhn3;
                }
                strZoijcleaow = strZoijcleaow;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn3);
                z13 = z13;
                i36 = i112;
                iObjectFieldOffset = iObjectFieldOffset4;
                i37 = 0;
            } else {
                i33 = iCharAt;
                i34 = iCharAt2;
                int i113 = i14 + 1;
                Field fieldCzzsidtyhn4 = czzsidtyhn(cls, (String) objArrIobyxmoadg[i14]);
                if (i105 == 9 || i105 == 17) {
                    objArr[((i96 / 3) * 2) + 1] = fieldCzzsidtyhn4.getType();
                } else {
                    if (i105 == 27 || i105 == 49) {
                        i38 = i14 + 2;
                        objArr[((i96 / 3) * 2) + 1] = objArrIobyxmoadg[i113];
                    } else if (i105 == 12 || i105 == 30 || i105 == 44) {
                        if (!z13) {
                            i38 = i14 + 2;
                            objArr[((i96 / 3) * 2) + 1] = objArrIobyxmoadg[i113];
                        }
                    } else if (i105 == 50) {
                        int i114 = i93 + 1;
                        iArr[i93] = i96;
                        int i115 = (i96 / 3) * 2;
                        int i116 = i14 + 2;
                        objArr[i115] = objArrIobyxmoadg[i113];
                        if ((iCharAt11 & 2048) != 0) {
                            i113 = i14 + 3;
                            objArr[i115 + 1] = objArrIobyxmoadg[i116];
                            i93 = i114;
                        } else {
                            i93 = i114;
                            i35 = i116;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn4);
                        i14 = i35;
                        if ((iCharAt11 & 4096) == 4096 || i105 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i36 = i29;
                            i37 = 0;
                        } else {
                            int i117 = i29 + 1;
                            int iCharAt13 = strZoijcleaow.charAt(i29);
                            if (iCharAt13 >= 55296) {
                                int i118 = iCharAt13 & 8191;
                                int i119 = 13;
                                while (true) {
                                    i36 = i117 + 1;
                                    cCharAt9 = strZoijcleaow.charAt(i117);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i118 |= (cCharAt9 & 8191) << i119;
                                    i119 += 13;
                                    i117 = i36;
                                }
                                iCharAt13 = i118 | (cCharAt9 << i119);
                            } else {
                                i36 = i117;
                            }
                            int i120 = (i15 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrIobyxmoadg[i120];
                            if (obj3 instanceof Field) {
                                fieldCzzsidtyhn = (Field) obj3;
                            } else {
                                fieldCzzsidtyhn = czzsidtyhn(cls, (String) obj3);
                                objArrIobyxmoadg[i120] = fieldCzzsidtyhn;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn);
                            i37 = iCharAt13 % 32;
                        }
                        if (i105 >= 18 && i105 <= 49) {
                            iArr[i94] = iObjectFieldOffset;
                            i94++;
                        }
                    }
                    i35 = i38;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn4);
                    i14 = i35;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i36 = i29;
                        i37 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i36 = i29;
                        i37 = 0;
                    }
                    if (i105 >= 18) {
                        iArr[i94] = iObjectFieldOffset;
                        i94++;
                    }
                }
                i35 = i113;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldCzzsidtyhn4);
                i14 = i35;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i36 = i29;
                    i37 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i36 = i29;
                    i37 = 0;
                }
                if (i105 >= 18) {
                    iArr[i94] = iObjectFieldOffset;
                    i94++;
                }
            }
            int i121 = i96 + 1;
            iArr2[i96] = iCharAt10;
            int i122 = i96 + 2;
            iArr2[i121] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | (i105 << 20) | iObjectFieldOffset;
            i96 += 3;
            iArr2[i122] = (i37 << 20) | iObjectFieldOffset2;
            z13 = z13;
            iCharAt = i33;
            iCharAt5 = i106;
            i53 = i36;
            length = i28;
            strZoijcleaow = strZoijcleaow;
            i95 = i107;
            iCharAt2 = i34;
            c13 = 55296;
        }
        return new wypolnanlu(iArr2, objArr, iCharAt, iCharAt2, ribwqtqdhbVar.getDefaultInstance(), z13, false, iArr, iCharAt5, i89, kegysxyocbVar, istkbnxepwVar, metgxyhuheVar, rgvfuqvkyqVar, wwaezpbzknVar);
    }

    private boolean dxjokdxxww(Object obj, Object obj2, int i13) {
        int iBfopjjpdmp = bfopjjpdmp(i13);
        long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
        switch (oipsdeybqn(iBfopjjpdmp)) {
            case 0:
                return wkgbmnqykc(obj, obj2, i13) && Double.doubleToLongBits(yfnezrywwk.cqumvgiudr(obj, jStevsuqkhv)) == Double.doubleToLongBits(yfnezrywwk.cqumvgiudr(obj2, jStevsuqkhv));
            case 1:
                return wkgbmnqykc(obj, obj2, i13) && Float.floatToIntBits(yfnezrywwk.esjtqupxsv(obj, jStevsuqkhv)) == Float.floatToIntBits(yfnezrywwk.esjtqupxsv(obj2, jStevsuqkhv));
            case 2:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) == yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv);
            case 3:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) == yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv);
            case 4:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 5:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) == yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv);
            case 6:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 7:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.oxmwwwfdhm(obj, jStevsuqkhv) == yfnezrywwk.oxmwwwfdhm(obj2, jStevsuqkhv);
            case 8:
                return wkgbmnqykc(obj, obj2, i13) && okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 9:
                return wkgbmnqykc(obj, obj2, i13) && okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 10:
                return wkgbmnqykc(obj, obj2, i13) && okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 11:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 12:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 13:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 14:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) == yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv);
            case 15:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.lereixgezr(obj, jStevsuqkhv) == yfnezrywwk.lereixgezr(obj2, jStevsuqkhv);
            case 16:
                return wkgbmnqykc(obj, obj2, i13) && yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) == yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv);
            case 17:
                return wkgbmnqykc(obj, obj2, i13) && okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                return okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 50:
                return okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 68:
                return pmvmpeiblj(obj, obj2, i13) && okpsazkaxt.pkzmftpjix(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
            default:
                return true;
        }
    }

    private static boolean eablkybsjg(Object obj, long j13) {
        return yfnezrywwk.oxmwwwfdhm(obj, j13);
    }

    private boolean esjtqupxsv(Object obj, int i13, int i14) {
        if (this.f24074vdvldrhtss.forMapData(yfnezrywwk.istkbnxepw(obj, stevsuqkhv(i13))).isEmpty()) {
            return true;
        }
        this.f24074vdvldrhtss.forMapMetadata(wflxmlrfwp(i14));
        throw null;
    }

    private static float gtknphoqwx(Object obj, long j13) {
        return yfnezrywwk.esjtqupxsv(obj, j13);
    }

    private static void gxszxtbevo(Object obj) {
        if (lereixgezr(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private Object hcddaimhww(Object obj, int i13) {
        jhduphickx jhduphickxVarAgtfadlqog = agtfadlqog(i13);
        long jStevsuqkhv = stevsuqkhv(bfopjjpdmp(i13));
        if (!yggfygwlhe(obj, i13)) {
            return jhduphickxVarAgtfadlqog.newInstance();
        }
        Object object = f24059kcexrzcfyt.getObject(obj, jStevsuqkhv);
        if (lereixgezr(object)) {
            return object;
        }
        Object objNewInstance = jhduphickxVarAgtfadlqog.newInstance();
        if (object != null) {
            jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static wypolnanlu hkdspvbjdz(Class cls, hcddaimhww hcddaimhwwVar, kegysxyocb kegysxyocbVar, istkbnxepw istkbnxepwVar, metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, wwaezpbzkn wwaezpbzknVar) {
        if (hcddaimhwwVar instanceof ribwqtqdhb) {
            return dsvhmnatus((ribwqtqdhb) hcddaimhwwVar, kegysxyocbVar, istkbnxepwVar, metgxyhuheVar, rgvfuqvkyqVar, wwaezpbzknVar);
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(hcddaimhwwVar);
        return cllcsxoeiz(null, kegysxyocbVar, istkbnxepwVar, metgxyhuheVar, rgvfuqvkyqVar, wwaezpbzknVar);
    }

    private int ikoacuggdj(int i13, int i14) {
        if (i13 < this.f24072ppxfxbqfkf || i13 > this.f24076wkgbmnqykc) {
            return -1;
        }
        return ydmasvzmpa(i13, i14);
    }

    private void iozdgvuglv(metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, Object obj, vipkmwdibw vipkmwdibwVar, ojitshcjhn ojitshcjhnVar) {
        Object objLqeggnwhkg = null;
        while (true) {
            try {
                int fieldNumber = vipkmwdibwVar.getFieldNumber();
                int iJhduphickx = jhduphickx(fieldNumber);
                if (iJhduphickx >= 0) {
                    int iBfopjjpdmp = bfopjjpdmp(iJhduphickx);
                    try {
                        switch (oipsdeybqn(iBfopjjpdmp)) {
                            case 0:
                                yfnezrywwk.cllcsxoeiz(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readDouble());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 1:
                                yfnezrywwk.dsvhmnatus(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readFloat());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 2:
                                yfnezrywwk.stevsuqkhv(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readInt64());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 3:
                                yfnezrywwk.stevsuqkhv(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readUInt64());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 4:
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readInt32());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 5:
                                yfnezrywwk.stevsuqkhv(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readFixed64());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 6:
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readFixed32());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 7:
                                yfnezrywwk.wwaezpbzkn(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readBool());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 8:
                                metgxyhuhe(obj, iBfopjjpdmp, vipkmwdibwVar);
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 9:
                                hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) hcddaimhww(obj, iJhduphickx);
                                vipkmwdibwVar.ppxfxbqfkf(hkdspvbjdzVar, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                sflfametgt(obj, iJhduphickx, hkdspvbjdzVar);
                                break;
                            case 10:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readBytes());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 11:
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readUInt32());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 12:
                                int i13 = vipkmwdibwVar.readEnum();
                                draadjrbmk(iJhduphickx);
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), i13);
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 13:
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readSFixed32());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 14:
                                yfnezrywwk.stevsuqkhv(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readSFixed64());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 15:
                                yfnezrywwk.wypolnanlu(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readSInt32());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 16:
                                yfnezrywwk.stevsuqkhv(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readSInt64());
                                uwvvkdfqfp(obj, iJhduphickx);
                                break;
                            case 17:
                                hkdspvbjdz hkdspvbjdzVar2 = (hkdspvbjdz) hcddaimhww(obj, iJhduphickx);
                                vipkmwdibwVar.iobyxmoadg(hkdspvbjdzVar2, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                sflfametgt(obj, iJhduphickx, hkdspvbjdzVar2);
                                break;
                            case 18:
                                vipkmwdibwVar.readDoubleList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 19:
                                vipkmwdibwVar.readFloatList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 20:
                                vipkmwdibwVar.readInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 21:
                                vipkmwdibwVar.readUInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 22:
                                vipkmwdibwVar.readInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 23:
                                vipkmwdibwVar.readFixed64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 24:
                                vipkmwdibwVar.readFixed32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case C4007z9.F /* 25 */:
                                vipkmwdibwVar.readBoolList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case C4007z9.G /* 26 */:
                                rlfsiqarku(obj, iBfopjjpdmp, vipkmwdibwVar);
                                break;
                            case 27:
                                xrmfcynszj(obj, iBfopjjpdmp, vipkmwdibwVar, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                break;
                            case 28:
                                vipkmwdibwVar.readBytesList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case C4007z9.I /* 29 */:
                                vipkmwdibwVar.readUInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 30:
                                List listEablkybsjg = this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp));
                                vipkmwdibwVar.readEnumList(listEablkybsjg);
                                draadjrbmk(iJhduphickx);
                                objLqeggnwhkg = okpsazkaxt.lereixgezr(obj, fieldNumber, listEablkybsjg, null, objLqeggnwhkg, metgxyhuheVar);
                                break;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                vipkmwdibwVar.readSFixed32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 32:
                                vipkmwdibwVar.readSFixed64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 33:
                                vipkmwdibwVar.readSInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                vipkmwdibwVar.readSInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case C4007z9.J /* 35 */:
                                vipkmwdibwVar.readDoubleList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                vipkmwdibwVar.readFloatList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                vipkmwdibwVar.readInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case C4007z9.K /* 38 */:
                                vipkmwdibwVar.readUInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                vipkmwdibwVar.readInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 40:
                                vipkmwdibwVar.readFixed64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                vipkmwdibwVar.readFixed32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 42:
                                vipkmwdibwVar.readBoolList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 43:
                                vipkmwdibwVar.readUInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                List listEablkybsjg2 = this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp));
                                vipkmwdibwVar.readEnumList(listEablkybsjg2);
                                draadjrbmk(iJhduphickx);
                                objLqeggnwhkg = okpsazkaxt.lereixgezr(obj, fieldNumber, listEablkybsjg2, null, objLqeggnwhkg, metgxyhuheVar);
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                vipkmwdibwVar.readSFixed32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 46:
                                vipkmwdibwVar.readSFixed64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 47:
                                vipkmwdibwVar.readSInt32List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 48:
                                vipkmwdibwVar.readSInt64List(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                                break;
                            case 49:
                                jztzpxfvev(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                break;
                            case 50:
                                lmojexxdyd(obj, iJhduphickx, wflxmlrfwp(iJhduphickx), ojitshcjhnVar, vipkmwdibwVar);
                                break;
                            case 51:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Double.valueOf(vipkmwdibwVar.readDouble()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 52:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Float.valueOf(vipkmwdibwVar.readFloat()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 53:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Long.valueOf(vipkmwdibwVar.readInt64()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 54:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Long.valueOf(vipkmwdibwVar.readUInt64()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 55:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(vipkmwdibwVar.readInt32()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 56:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Long.valueOf(vipkmwdibwVar.readFixed64()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 57:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(vipkmwdibwVar.readFixed32()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 58:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Boolean.valueOf(vipkmwdibwVar.readBool()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 59:
                                metgxyhuhe(obj, iBfopjjpdmp, vipkmwdibwVar);
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 60:
                                hkdspvbjdz hkdspvbjdzVar3 = (hkdspvbjdz) jpowsppfya(obj, fieldNumber, iJhduphickx);
                                vipkmwdibwVar.ppxfxbqfkf(hkdspvbjdzVar3, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                zfvoamnweg(obj, fieldNumber, iJhduphickx, hkdspvbjdzVar3);
                                break;
                            case 61:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), vipkmwdibwVar.readBytes());
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 62:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(vipkmwdibwVar.readUInt32()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 63:
                                int i14 = vipkmwdibwVar.readEnum();
                                draadjrbmk(iJhduphickx);
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(i14));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(vipkmwdibwVar.readSFixed32()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Long.valueOf(vipkmwdibwVar.readSFixed64()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 66:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Integer.valueOf(vipkmwdibwVar.readSInt32()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 67:
                                yfnezrywwk.kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp), Long.valueOf(vipkmwdibwVar.readSInt64()));
                                yfnezrywwk(obj, fieldNumber, iJhduphickx);
                                break;
                            case 68:
                                hkdspvbjdz hkdspvbjdzVar4 = (hkdspvbjdz) jpowsppfya(obj, fieldNumber, iJhduphickx);
                                vipkmwdibwVar.iobyxmoadg(hkdspvbjdzVar4, agtfadlqog(iJhduphickx), ojitshcjhnVar);
                                zfvoamnweg(obj, fieldNumber, iJhduphickx, hkdspvbjdzVar4);
                                break;
                            default:
                                if (objLqeggnwhkg == null) {
                                    objLqeggnwhkg = metgxyhuheVar.gxszxtbevo(obj);
                                }
                                if (!metgxyhuheVar.wflxmlrfwp(objLqeggnwhkg, vipkmwdibwVar)) {
                                    Object objBtonecajqb = objLqeggnwhkg;
                                    for (int i15 = this.f24066gtknphoqwx; i15 < this.f24063draadjrbmk; i15++) {
                                        objBtonecajqb = btonecajqb(obj, this.f24062btonecajqb[i15], objBtonecajqb, metgxyhuheVar, obj);
                                    }
                                    if (objBtonecajqb != null) {
                                        metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!metgxyhuheVar.vdvldrhtss(vipkmwdibwVar)) {
                            if (objLqeggnwhkg == null) {
                                objLqeggnwhkg = metgxyhuheVar.gxszxtbevo(obj);
                            }
                            if (!metgxyhuheVar.wflxmlrfwp(objLqeggnwhkg, vipkmwdibwVar)) {
                                Object objBtonecajqb2 = objLqeggnwhkg;
                                for (int i16 = this.f24066gtknphoqwx; i16 < this.f24063draadjrbmk; i16++) {
                                    objBtonecajqb2 = btonecajqb(obj, this.f24062btonecajqb[i16], objBtonecajqb2, metgxyhuheVar, obj);
                                }
                                if (objBtonecajqb2 != null) {
                                    metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb2);
                                    return;
                                }
                                return;
                            }
                        } else if (!vipkmwdibwVar.skipField()) {
                            Object objBtonecajqb3 = objLqeggnwhkg;
                            for (int i17 = this.f24066gtknphoqwx; i17 < this.f24063draadjrbmk; i17++) {
                                objBtonecajqb3 = btonecajqb(obj, this.f24062btonecajqb[i17], objBtonecajqb3, metgxyhuheVar, obj);
                            }
                            if (objBtonecajqb3 != null) {
                                metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb3);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objBtonecajqb4 = objLqeggnwhkg;
                        for (int i18 = this.f24066gtknphoqwx; i18 < this.f24063draadjrbmk; i18++) {
                            objBtonecajqb4 = btonecajqb(obj, this.f24062btonecajqb[i18], objBtonecajqb4, metgxyhuheVar, obj);
                        }
                        if (objBtonecajqb4 != null) {
                            metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb4);
                            return;
                        }
                        return;
                    }
                    Object objZoijcleaow = !this.f24067gxszxtbevo ? null : rgvfuqvkyqVar.zoijcleaow(ojitshcjhnVar, this.f24065eablkybsjg, fieldNumber);
                    if (objZoijcleaow != null) {
                        objLqeggnwhkg = rgvfuqvkyqVar.lqeggnwhkg(obj, vipkmwdibwVar, objZoijcleaow, ojitshcjhnVar, rgvfuqvkyqVar.wkgbmnqykc(obj), objLqeggnwhkg, metgxyhuheVar);
                    } else if (!metgxyhuheVar.vdvldrhtss(vipkmwdibwVar)) {
                        if (objLqeggnwhkg == null) {
                            objLqeggnwhkg = metgxyhuheVar.gxszxtbevo(obj);
                        }
                        if (metgxyhuheVar.wflxmlrfwp(objLqeggnwhkg, vipkmwdibwVar)) {
                        }
                    } else if (vipkmwdibwVar.skipField()) {
                    }
                }
            } catch (Throwable th2) {
                Object objBtonecajqb5 = objLqeggnwhkg;
                for (int i19 = this.f24066gtknphoqwx; i19 < this.f24063draadjrbmk; i19++) {
                    objBtonecajqb5 = btonecajqb(obj, this.f24062btonecajqb[i19], objBtonecajqb5, metgxyhuheVar, obj);
                }
                if (objBtonecajqb5 != null) {
                    metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb5);
                }
                throw th2;
            }
        }
        Object objBtonecajqb6 = objLqeggnwhkg;
        for (int i23 = this.f24066gtknphoqwx; i23 < this.f24063draadjrbmk; i23++) {
            objBtonecajqb6 = btonecajqb(obj, this.f24062btonecajqb[i23], objBtonecajqb6, metgxyhuheVar, obj);
        }
        if (objBtonecajqb6 != null) {
            metgxyhuheVar.ojitshcjhn(obj, objBtonecajqb6);
        }
    }

    private static boolean istkbnxepw(int i13) {
        return (i13 & 268435456) != 0;
    }

    private static boolean iwizpuwonk(Object obj, int i13, jhduphickx jhduphickxVar) {
        return jhduphickxVar.isInitialized(yfnezrywwk.istkbnxepw(obj, stevsuqkhv(i13)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void iyctptxqzt(Object obj, zfvoamnweg zfvoamnwegVar) {
        Iterator itGxszxtbevo;
        Map.Entry entry;
        if (this.f24067gxszxtbevo) {
            kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = this.f24073rgvfuqvkyq.ppxfxbqfkf(obj);
            if (kcexrzcfytVarPpxfxbqfkf.wkgbmnqykc()) {
                itGxszxtbevo = null;
                entry = null;
            } else {
                itGxszxtbevo = kcexrzcfytVarPpxfxbqfkf.gxszxtbevo();
                entry = (Map.Entry) itGxszxtbevo.next();
            }
        } else {
            itGxszxtbevo = null;
            entry = null;
        }
        int length = this.f24068iobyxmoadg.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iBfopjjpdmp = bfopjjpdmp(i13);
            int iWypolnanlu = wypolnanlu(i13);
            while (entry != null && this.f24073rgvfuqvkyq.iobyxmoadg(entry) <= iWypolnanlu) {
                this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
                entry = itGxszxtbevo.hasNext() ? (Map.Entry) itGxszxtbevo.next() : null;
            }
            switch (oipsdeybqn(iBfopjjpdmp)) {
                case 0:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, nufgyqmvbu(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 1:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, gtknphoqwx(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 2:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 3:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 4:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 5:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 6:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 7:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 8:
                    if (yggfygwlhe(obj, i13)) {
                        zeieaojujs(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    }
                    break;
                case 9:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(i13));
                    }
                    break;
                case 10:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 11:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 12:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 13:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 14:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 15:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 16:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 17:
                    if (yggfygwlhe(obj, i13)) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(i13));
                    }
                    break;
                case 18:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 19:
                    okpsazkaxt.tzroggbefp(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 20:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 21:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 22:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 23:
                    okpsazkaxt.kegysxyocb(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 24:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.F /* 25 */:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.G /* 26 */:
                    okpsazkaxt.jhduphickx(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    break;
                case 27:
                    okpsazkaxt.sopmlzcsov(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, agtfadlqog(i13));
                    break;
                case 28:
                    okpsazkaxt.cllcsxoeiz(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    break;
                case C4007z9.I /* 29 */:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 30:
                    okpsazkaxt.wypolnanlu(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 32:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 33:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.J /* 35 */:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    okpsazkaxt.tzroggbefp(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 40:
                    okpsazkaxt.kegysxyocb(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 42:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 43:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    okpsazkaxt.wypolnanlu(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 46:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 47:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 48:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 49:
                    okpsazkaxt.mbcevpiqjq(wypolnanlu(i13), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, agtfadlqog(i13));
                    break;
                case 50:
                    lrnfpwlwnk(zfvoamnwegVar, iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), i13);
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, tzroggbefp(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, mbcevpiqjq(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zeieaojujs(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(i13));
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, i13)) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(i13));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
            entry = itGxszxtbevo.hasNext() ? (Map.Entry) itGxszxtbevo.next() : null;
        }
        nuxfzjnpeb(this.f24071ojitshcjhn, obj, zfvoamnwegVar);
    }

    private int jhduphickx(int i13) {
        if (i13 < this.f24072ppxfxbqfkf || i13 > this.f24076wkgbmnqykc) {
            return -1;
        }
        return ydmasvzmpa(i13, 0);
    }

    private Object jpowsppfya(Object obj, int i13, int i14) {
        jhduphickx jhduphickxVarAgtfadlqog = agtfadlqog(i14);
        if (!zynmafqrjb(obj, i13, i14)) {
            return jhduphickxVarAgtfadlqog.newInstance();
        }
        Object object = f24059kcexrzcfyt.getObject(obj, stevsuqkhv(bfopjjpdmp(i14)));
        if (lereixgezr(object)) {
            return object;
        }
        Object objNewInstance = jhduphickxVarAgtfadlqog.newInstance();
        if (object != null) {
            jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private boolean jyumaefscl(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return yggfygwlhe(obj, i13);
        }
        return (i15 & i16) != 0;
    }

    private void jztzpxfvev(Object obj, long j13, vipkmwdibw vipkmwdibwVar, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) {
        vipkmwdibwVar.eablkybsjg(this.f24061agtfadlqog.eablkybsjg(obj, j13), jhduphickxVar, ojitshcjhnVar);
    }

    private static int kcexrzcfyt(Object obj, long j13) {
        return yfnezrywwk.lereixgezr(obj, j13);
    }

    private static boolean kegysxyocb(Object obj, long j13) {
        return ((Boolean) yfnezrywwk.istkbnxepw(obj, j13)).booleanValue();
    }

    private static boolean lereixgezr(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof iwizpuwonk) {
            return ((iwizpuwonk) obj).cqumvgiudr();
        }
        return true;
    }

    private final void lmojexxdyd(Object obj, int i13, Object obj2, ojitshcjhn ojitshcjhnVar, vipkmwdibw vipkmwdibwVar) {
        long jStevsuqkhv = stevsuqkhv(bfopjjpdmp(i13));
        Object objIstkbnxepw = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
        if (objIstkbnxepw == null) {
            objIstkbnxepw = this.f24074vdvldrhtss.newMapField(obj2);
            yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, objIstkbnxepw);
        } else if (this.f24074vdvldrhtss.isImmutable(objIstkbnxepw)) {
            Object objNewMapField = this.f24074vdvldrhtss.newMapField(obj2);
            this.f24074vdvldrhtss.mergeFrom(objNewMapField, objIstkbnxepw);
            yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, objNewMapField);
            objIstkbnxepw = objNewMapField;
        }
        Map mapForMutableMapData = this.f24074vdvldrhtss.forMutableMapData(objIstkbnxepw);
        this.f24074vdvldrhtss.forMapMetadata(obj2);
        vipkmwdibwVar.zoijcleaow(mapForMutableMapData, null, ojitshcjhnVar);
    }

    private int lqeggnwhkg(byte[] bArr, int i13, int i14, iozdgvuglv.iobyxmoadg iobyxmoadgVar, Map map, eablkybsjg.iobyxmoadg iobyxmoadgVar2) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = eablkybsjg.wwaezpbzkn(bArr, i13, iobyxmoadgVar2);
        int i15 = iobyxmoadgVar2.f23919iobyxmoadg;
        if (i15 < 0 || i15 > i14 - iWwaezpbzkn) {
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }
        throw null;
    }

    private void lrnfpwlwnk(zfvoamnweg zfvoamnwegVar, int i13, Object obj, int i14) {
        if (obj != null) {
            this.f24074vdvldrhtss.forMapMetadata(wflxmlrfwp(i14));
            zfvoamnwegVar.iobyxmoadg(i13, null, this.f24074vdvldrhtss.forMapData(obj));
        }
    }

    private static float mbcevpiqjq(Object obj, long j13) {
        return ((Float) yfnezrywwk.istkbnxepw(obj, j13)).floatValue();
    }

    private void metgxyhuhe(Object obj, int i13, vipkmwdibw vipkmwdibwVar) {
        if (zdlpuopuiu(i13)) {
            yfnezrywwk.kegysxyocb(obj, stevsuqkhv(i13), vipkmwdibwVar.readStringRequireUtf8());
        } else if (this.f24069lqeggnwhkg) {
            yfnezrywwk.kegysxyocb(obj, stevsuqkhv(i13), vipkmwdibwVar.readString());
        } else {
            yfnezrywwk.kegysxyocb(obj, stevsuqkhv(i13), vipkmwdibwVar.readBytes());
        }
    }

    private static int ntlheqmsrt(Object obj, long j13) {
        return ((Integer) yfnezrywwk.istkbnxepw(obj, j13)).intValue();
    }

    private static double nufgyqmvbu(Object obj, long j13) {
        return yfnezrywwk.cqumvgiudr(obj, j13);
    }

    private void nuxfzjnpeb(metgxyhuhe metgxyhuheVar, Object obj, zfvoamnweg zfvoamnwegVar) {
        metgxyhuheVar.zdlpuopuiu(metgxyhuheVar.lqeggnwhkg(obj), zfvoamnwegVar);
    }

    private static int oipsdeybqn(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    static rlfsiqarku ojitshcjhn(Object obj) {
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        rlfsiqarku rlfsiqarkuVar = iwizpuwonkVar.unknownFields;
        if (rlfsiqarkuVar != rlfsiqarku.ppxfxbqfkf()) {
            return rlfsiqarkuVar;
        }
        rlfsiqarku rlfsiqarkuVarGtknphoqwx = rlfsiqarku.gtknphoqwx();
        iwizpuwonkVar.unknownFields = rlfsiqarkuVarGtknphoqwx;
        return rlfsiqarkuVarGtknphoqwx;
    }

    private int okpsazkaxt(int i13) {
        return this.f24068iobyxmoadg[i13 + 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void opjhrmiecq(Object obj, zfvoamnweg zfvoamnwegVar) {
        Iterator itGxszxtbevo;
        Map.Entry entry;
        int i13;
        if (this.f24067gxszxtbevo) {
            kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = this.f24073rgvfuqvkyq.ppxfxbqfkf(obj);
            if (kcexrzcfytVarPpxfxbqfkf.wkgbmnqykc()) {
                itGxszxtbevo = null;
                entry = null;
            } else {
                itGxszxtbevo = kcexrzcfytVarPpxfxbqfkf.gxszxtbevo();
                entry = (Map.Entry) itGxszxtbevo.next();
            }
        } else {
            itGxszxtbevo = null;
            entry = null;
        }
        int length = this.f24068iobyxmoadg.length;
        Unsafe unsafe = f24059kcexrzcfyt;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int iBfopjjpdmp = bfopjjpdmp(i16);
            int iWypolnanlu = wypolnanlu(i16);
            int iOipsdeybqn = oipsdeybqn(iBfopjjpdmp);
            if (iOipsdeybqn <= 17) {
                int i18 = this.f24068iobyxmoadg[i16 + 2];
                int i19 = i18 & i14;
                if (i19 != i15) {
                    i17 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
                i13 = 1 << (i18 >>> 20);
            } else {
                i13 = 0;
            }
            while (entry != null && this.f24073rgvfuqvkyq.iobyxmoadg(entry) <= iWypolnanlu) {
                this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
                entry = itGxszxtbevo.hasNext() ? (Map.Entry) itGxszxtbevo.next() : null;
            }
            long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
            switch (iOipsdeybqn) {
                case 0:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, nufgyqmvbu(obj, jStevsuqkhv));
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 1:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, gtknphoqwx(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 2:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 3:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 4:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 5:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 6:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 7:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, eablkybsjg(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 8:
                    if ((i13 & i17) != 0) {
                        zeieaojujs(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar);
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 9:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 10:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) unsafe.getObject(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 11:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 12:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 13:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 14:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 15:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 16:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 17:
                    if ((i13 & i17) != 0) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 18:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 19:
                    okpsazkaxt.tzroggbefp(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 20:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 21:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 22:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 23:
                    okpsazkaxt.kegysxyocb(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 24:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C4007z9.F /* 25 */:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C4007z9.G /* 26 */:
                    okpsazkaxt.jhduphickx(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar);
                    break;
                case 27:
                    okpsazkaxt.sopmlzcsov(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, agtfadlqog(i16));
                    break;
                case 28:
                    okpsazkaxt.cllcsxoeiz(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar);
                    break;
                case C4007z9.I /* 29 */:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 30:
                    okpsazkaxt.wypolnanlu(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 32:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case 33:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, false);
                    continue;
                    i16 += 3;
                    i14 = 1048575;
                    break;
                case C4007z9.J /* 35 */:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    okpsazkaxt.tzroggbefp(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 40:
                    okpsazkaxt.kegysxyocb(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 42:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 43:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    okpsazkaxt.wypolnanlu(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 46:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 47:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 48:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, true);
                    break;
                case 49:
                    okpsazkaxt.mbcevpiqjq(wypolnanlu(i16), (List) unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar, agtfadlqog(i16));
                    break;
                case 50:
                    lrnfpwlwnk(zfvoamnwegVar, iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), i16);
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, tzroggbefp(obj, jStevsuqkhv));
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, mbcevpiqjq(obj, jStevsuqkhv));
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, kegysxyocb(obj, jStevsuqkhv));
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zeieaojujs(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), zfvoamnwegVar);
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i16));
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) unsafe.getObject(obj, jStevsuqkhv));
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, i16)) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i16));
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        while (entry != null) {
            this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
            entry = itGxszxtbevo.hasNext() ? (Map.Entry) itGxszxtbevo.next() : null;
        }
        nuxfzjnpeb(this.f24071ojitshcjhn, obj, zfvoamnwegVar);
    }

    private int oxmwwwfdhm(metgxyhuhe metgxyhuheVar, Object obj) {
        return metgxyhuheVar.nufgyqmvbu(metgxyhuheVar.lqeggnwhkg(obj));
    }

    private void pkzmftpjix(Object obj, Object obj2, int i13) {
        int iBfopjjpdmp = bfopjjpdmp(i13);
        long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
        int iWypolnanlu = wypolnanlu(i13);
        switch (oipsdeybqn(iBfopjjpdmp)) {
            case 0:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.cllcsxoeiz(obj, jStevsuqkhv, yfnezrywwk.cqumvgiudr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 1:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.dsvhmnatus(obj, jStevsuqkhv, yfnezrywwk.esjtqupxsv(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 2:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.stevsuqkhv(obj, jStevsuqkhv, yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 3:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.stevsuqkhv(obj, jStevsuqkhv, yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 4:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 5:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.stevsuqkhv(obj, jStevsuqkhv, yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 6:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 7:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wwaezpbzkn(obj, jStevsuqkhv, yfnezrywwk.oxmwwwfdhm(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 8:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 9:
                wwaezpbzkn(obj, obj2, i13);
                break;
            case 10:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 11:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 12:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 13:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 14:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.stevsuqkhv(obj, jStevsuqkhv, yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 15:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.wypolnanlu(obj, jStevsuqkhv, yfnezrywwk.lereixgezr(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 16:
                if (yggfygwlhe(obj2, i13)) {
                    yfnezrywwk.stevsuqkhv(obj, jStevsuqkhv, yfnezrywwk.pmvmpeiblj(obj2, jStevsuqkhv));
                    uwvvkdfqfp(obj, i13);
                }
                break;
            case 17:
                wwaezpbzkn(obj, obj2, i13);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f24061agtfadlqog.wkgbmnqykc(obj, obj2, jStevsuqkhv);
                break;
            case 50:
                okpsazkaxt.yadqdtsiqt(this.f24074vdvldrhtss, obj, obj2, jStevsuqkhv);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (zynmafqrjb(obj2, iWypolnanlu, i13)) {
                    yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
                    yfnezrywwk(obj, iWypolnanlu, i13);
                }
                break;
            case 60:
                ylkuphrtab(obj, obj2, i13);
                break;
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
                if (zynmafqrjb(obj2, iWypolnanlu, i13)) {
                    yfnezrywwk.kegysxyocb(obj, jStevsuqkhv, yfnezrywwk.istkbnxepw(obj2, jStevsuqkhv));
                    yfnezrywwk(obj, iWypolnanlu, i13);
                }
                break;
            case 68:
                ylkuphrtab(obj, obj2, i13);
                break;
        }
    }

    private boolean pmvmpeiblj(Object obj, Object obj2, int i13) {
        long jOkpsazkaxt = okpsazkaxt(i13) & 1048575;
        return yfnezrywwk.lereixgezr(obj, jOkpsazkaxt) == yfnezrywwk.lereixgezr(obj2, jOkpsazkaxt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[PHI: r6
      0x0077: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:20:0x005e, B:224:0x04c8, B:221:0x04bd, B:215:0x04a1, B:212:0x048f, B:209:0x047f, B:206:0x0471, B:203:0x0463, B:200:0x0458, B:197:0x044e, B:194:0x0440, B:191:0x0432, B:188:0x041e, B:164:0x032d, B:158:0x030f, B:152:0x02f1, B:146:0x02d3, B:140:0x02b5, B:134:0x0297, B:128:0x0279, B:122:0x025b, B:116:0x023d, B:110:0x0220, B:104:0x0203, B:98:0x01e6, B:92:0x01c9, B:85:0x01a9, B:80:0x0175, B:77:0x0169, B:74:0x0159, B:71:0x0149, B:68:0x0139, B:65:0x012d, B:62:0x0121, B:59:0x0114, B:53:0x00f6, B:50:0x00e3, B:47:0x00d2, B:44:0x00c3, B:41:0x00b4, B:39:0x00ae, B:37:0x00a7, B:34:0x009c, B:31:0x008d, B:28:0x007e, B:25:0x0076, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private int rgvfuqvkyq(Object obj) {
        int i13;
        int i14;
        int iNufgyqmvbu;
        int iWkgbmnqykc;
        int iZynmafqrjb;
        boolean z13;
        int iGxszxtbevo;
        int iDxjokdxxww;
        int iJpowsppfya;
        int iCllcsxoeiz;
        Unsafe unsafe = f24059kcexrzcfyt;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < this.f24068iobyxmoadg.length) {
            int iBfopjjpdmp = bfopjjpdmp(i17);
            int iWypolnanlu = wypolnanlu(i17);
            int iOipsdeybqn = oipsdeybqn(iBfopjjpdmp);
            if (iOipsdeybqn <= 17) {
                i13 = this.f24068iobyxmoadg[i17 + 2];
                int i23 = i13 & i15;
                i14 = 1 << (i13 >>> 20);
                if (i23 != i16) {
                    i19 = unsafe.getInt(obj, i23);
                    i16 = i23;
                }
            } else {
                i13 = (!this.f24064dxjokdxxww || iOipsdeybqn < zdlpuopuiu.f24139rlfsiqarku.iobyxmoadg() || iOipsdeybqn > zdlpuopuiu.f24158zeieaojujs.iobyxmoadg()) ? 0 : this.f24068iobyxmoadg[i17 + 2] & i15;
                i14 = 0;
            }
            long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
            switch (iOipsdeybqn) {
                case 0:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iWypolnanlu, 0.0d);
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 1:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iWypolnanlu, 0.0f);
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 2:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.jyumaefscl(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 3:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.dsvhmnatus(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 4:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.zdlpuopuiu(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 5:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iWypolnanlu, 0L);
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 6:
                    if ((i19 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iWypolnanlu, 0);
                        i18 += iNufgyqmvbu;
                    }
                    break;
                case 7:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.wkgbmnqykc(iWypolnanlu, true);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 8:
                    if ((i19 & i14) != 0) {
                        Object object = unsafe.getObject(obj, jStevsuqkhv);
                        iWkgbmnqykc = object instanceof nufgyqmvbu ? CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) object) : CodedOutputStream.pkzmftpjix(iWypolnanlu, (String) object);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 9:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = okpsazkaxt.ojitshcjhn(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 10:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) unsafe.getObject(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 11:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.hkdspvbjdz(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 12:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.btonecajqb(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 13:
                    if ((i19 & i14) != 0) {
                        iZynmafqrjb = CodedOutputStream.zynmafqrjb(iWypolnanlu, 0);
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 14:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.cdpycssgdh(iWypolnanlu, 0L);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 15:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.iozdgvuglv(iWypolnanlu, unsafe.getInt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 16:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.wwaezpbzkn(iWypolnanlu, unsafe.getLong(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 17:
                    if ((i19 & i14) != 0) {
                        iWkgbmnqykc = CodedOutputStream.oxmwwwfdhm(iWypolnanlu, (hkdspvbjdz) unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 18:
                    iWkgbmnqykc = okpsazkaxt.nufgyqmvbu(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iWkgbmnqykc;
                    break;
                case 19:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.gxszxtbevo(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 20:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.wflxmlrfwp(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 21:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.cqumvgiudr(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 22:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.gtknphoqwx(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 23:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.nufgyqmvbu(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 24:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.gxszxtbevo(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case C4007z9.F /* 25 */:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.iobyxmoadg(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case C4007z9.G /* 26 */:
                    iWkgbmnqykc = okpsazkaxt.yggfygwlhe(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv));
                    i18 += iWkgbmnqykc;
                    break;
                case 27:
                    iWkgbmnqykc = okpsazkaxt.rgvfuqvkyq(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                    i18 += iWkgbmnqykc;
                    break;
                case 28:
                    iWkgbmnqykc = okpsazkaxt.ppxfxbqfkf(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv));
                    i18 += iWkgbmnqykc;
                    break;
                case C4007z9.I /* 29 */:
                    iWkgbmnqykc = okpsazkaxt.jyumaefscl(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iWkgbmnqykc;
                    break;
                case 30:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.wkgbmnqykc(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.gxszxtbevo(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 32:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.nufgyqmvbu(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case 33:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.vdvldrhtss(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z13 = false;
                    iGxszxtbevo = okpsazkaxt.kcexrzcfyt(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), false);
                    i18 += iGxszxtbevo;
                    break;
                case C4007z9.J /* 35 */:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iDxjokdxxww = okpsazkaxt.agtfadlqog((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case C4007z9.K /* 38 */:
                    iDxjokdxxww = okpsazkaxt.esjtqupxsv((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iDxjokdxxww = okpsazkaxt.draadjrbmk((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 40:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 42:
                    iDxjokdxxww = okpsazkaxt.zoijcleaow((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 43:
                    iDxjokdxxww = okpsazkaxt.iwizpuwonk((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iDxjokdxxww = okpsazkaxt.eablkybsjg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 46:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 47:
                    iDxjokdxxww = okpsazkaxt.oxmwwwfdhm((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 48:
                    iDxjokdxxww = okpsazkaxt.zdlpuopuiu((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iZynmafqrjb = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 49:
                    iWkgbmnqykc = okpsazkaxt.btonecajqb(iWypolnanlu, (List) unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                    i18 += iWkgbmnqykc;
                    break;
                case 50:
                    iWkgbmnqykc = this.f24074vdvldrhtss.getSerializedSize(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), wflxmlrfwp(i17));
                    i18 += iWkgbmnqykc;
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.nufgyqmvbu(iWypolnanlu, 0.0d);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.rgvfuqvkyq(iWypolnanlu, 0.0f);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.jyumaefscl(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.dsvhmnatus(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.zdlpuopuiu(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.agtfadlqog(iWypolnanlu, 0L);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iZynmafqrjb = CodedOutputStream.draadjrbmk(iWypolnanlu, 0);
                        i18 += iZynmafqrjb;
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.wkgbmnqykc(iWypolnanlu, true);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        Object object2 = unsafe.getObject(obj, jStevsuqkhv);
                        iWkgbmnqykc = object2 instanceof nufgyqmvbu ? CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) object2) : CodedOutputStream.pkzmftpjix(iWypolnanlu, (String) object2);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = okpsazkaxt.ojitshcjhn(iWypolnanlu, unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) unsafe.getObject(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.hkdspvbjdz(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.btonecajqb(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iZynmafqrjb = CodedOutputStream.zynmafqrjb(iWypolnanlu, 0);
                        i18 += iZynmafqrjb;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.cdpycssgdh(iWypolnanlu, 0L);
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.iozdgvuglv(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.wwaezpbzkn(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, i17)) {
                        iWkgbmnqykc = CodedOutputStream.oxmwwwfdhm(iWypolnanlu, (hkdspvbjdz) unsafe.getObject(obj, jStevsuqkhv), agtfadlqog(i17));
                        i18 += iWkgbmnqykc;
                    }
                    break;
                default:
                    break;
            }
            i17 += 3;
            i15 = 1048575;
        }
        int iOxmwwwfdhm = i18 + oxmwwwfdhm(this.f24071ojitshcjhn, obj);
        return this.f24067gxszxtbevo ? iOxmwwwfdhm + this.f24073rgvfuqvkyq.ppxfxbqfkf(obj).ppxfxbqfkf() : iOxmwwwfdhm;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b2 A[PHI: r0 r19 r22 r26 r27 r28
      0x02b2: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r22v1 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r27v4 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x029a A[PHI: r0 r19 r22 r26 r27 r28
      0x029a: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r22v2 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    private int ribwqtqdhb(Object obj, byte[] bArr, int i13, int i14, eablkybsjg.iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int i15;
        int iLmojexxdyd;
        int i16;
        int i17;
        int i18;
        Unsafe unsafe;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iZoijcleaow;
        this = this;
        obj = obj;
        bArr = bArr;
        i14 = i14;
        iobyxmoadgVar = iobyxmoadgVar;
        gxszxtbevo(obj);
        Unsafe unsafe2 = f24059kcexrzcfyt;
        int i29 = -1;
        int iIozdgvuglv = i13;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        while (iIozdgvuglv < i14) {
            int i37 = iIozdgvuglv + 1;
            byte b13 = bArr[iIozdgvuglv];
            if (b13 < 0) {
                iLmojexxdyd = eablkybsjg.lmojexxdyd(b13, bArr, i37, iobyxmoadgVar);
                i15 = iobyxmoadgVar.f23919iobyxmoadg;
            } else {
                i15 = b13;
                iLmojexxdyd = i37;
            }
            int i38 = i15 >>> 3;
            int i39 = i15 & 7;
            int iIkoacuggdj = i38 > i33 ? this.ikoacuggdj(i38, i34 / 3) : this.jhduphickx(i38);
            if (iIkoacuggdj == i29) {
                i16 = iLmojexxdyd;
                i17 = i38;
                i18 = i29;
                unsafe = unsafe2;
                i19 = 0;
            } else {
                int i43 = this.f24068iobyxmoadg[iIkoacuggdj + 1];
                int iOipsdeybqn = oipsdeybqn(i43);
                long jStevsuqkhv = stevsuqkhv(i43);
                if (iOipsdeybqn <= 17) {
                    int i44 = this.f24068iobyxmoadg[iIkoacuggdj + 2];
                    int i45 = 1 << (i44 >>> 20);
                    int i46 = 1048575;
                    int i47 = i44 & 1048575;
                    if (i47 != i36) {
                        if (i36 != 1048575) {
                            unsafe2.putInt(obj, i36, i35);
                            i46 = 1048575;
                        }
                        if (i47 != i46) {
                            i35 = unsafe2.getInt(obj, i47);
                        }
                        i36 = i47;
                    }
                    switch (iOipsdeybqn) {
                        case 0:
                            i17 = i38;
                            i26 = iIkoacuggdj;
                            i27 = iLmojexxdyd;
                            i28 = i35;
                            if (i39 != 1) {
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                yfnezrywwk.cllcsxoeiz(obj, jStevsuqkhv, eablkybsjg.wkgbmnqykc(bArr, i27));
                                iIozdgvuglv = i27 + 8;
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 1:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i27 = iLmojexxdyd;
                            i28 = i35;
                            i26 = iIkoacuggdj;
                            if (i39 != 5) {
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                yfnezrywwk.dsvhmnatus(obj, jStevsuqkhv, eablkybsjg.gtknphoqwx(bArr, i27));
                                iIozdgvuglv = i27 + 4;
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            i27 = iLmojexxdyd;
                            i28 = i35;
                            if (i39 != 0) {
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                int iHcddaimhww = eablkybsjg.hcddaimhww(bArr, i27, iobyxmoadgVar);
                                unsafe2.putLong(obj, jStevsuqkhv, iobyxmoadgVar.f23922zoijcleaow);
                                i35 = i28 | i45;
                                i34 = i26;
                                iIozdgvuglv = iHcddaimhww;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            i27 = iLmojexxdyd;
                            i28 = i35;
                            if (i39 != 0) {
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iIozdgvuglv = eablkybsjg.wwaezpbzkn(bArr, i27, iobyxmoadgVar);
                                unsafe2.putInt(obj, jStevsuqkhv, iobyxmoadgVar.f23919iobyxmoadg);
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i17 = i38;
                            i26 = iIkoacuggdj;
                            i28 = i35;
                            if (i39 != 1) {
                                i27 = iLmojexxdyd;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                i27 = iLmojexxdyd;
                                unsafe2.putLong(obj, jStevsuqkhv, eablkybsjg.dxjokdxxww(bArr, iLmojexxdyd));
                                iIozdgvuglv = i27 + 8;
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i28 = i35;
                            i26 = iIkoacuggdj;
                            if (i39 != 5) {
                                i27 = iLmojexxdyd;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                unsafe2.putInt(obj, jStevsuqkhv, eablkybsjg.lqeggnwhkg(bArr, iLmojexxdyd));
                                iIozdgvuglv = iLmojexxdyd + 4;
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 7:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            i28 = i35;
                            if (i39 != 0) {
                                i27 = iLmojexxdyd;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                int iHcddaimhww2 = eablkybsjg.hcddaimhww(bArr, iLmojexxdyd, iobyxmoadgVar);
                                yfnezrywwk.wwaezpbzkn(obj, jStevsuqkhv, iobyxmoadgVar.f23922zoijcleaow != 0);
                                i35 = i28 | i45;
                                iIozdgvuglv = iHcddaimhww2;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 8:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            i28 = i35;
                            if (i39 != 2) {
                                i27 = iLmojexxdyd;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iIozdgvuglv = (536870912 & i43) == 0 ? eablkybsjg.zynmafqrjb(bArr, iLmojexxdyd, iobyxmoadgVar) : eablkybsjg.yadqdtsiqt(bArr, iLmojexxdyd, iobyxmoadgVar);
                                unsafe2.putObject(obj, jStevsuqkhv, iobyxmoadgVar.f23920ppxfxbqfkf);
                                i35 = i28 | i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 9:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            if (i39 != 2) {
                                i27 = iLmojexxdyd;
                                i28 = i35;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                Object objHcddaimhww = this.hcddaimhww(obj, i26);
                                iIozdgvuglv = eablkybsjg.cllcsxoeiz(objHcddaimhww, this.agtfadlqog(i26), bArr, iLmojexxdyd, i14, iobyxmoadgVar);
                                this.sflfametgt(obj, i26, objHcddaimhww);
                                i35 |= i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 10:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            if (i39 != 2) {
                                i27 = iLmojexxdyd;
                                i28 = i35;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iZoijcleaow = eablkybsjg.zoijcleaow(bArr, iLmojexxdyd, iobyxmoadgVar);
                                unsafe2.putObject(obj, jStevsuqkhv, iobyxmoadgVar.f23920ppxfxbqfkf);
                                i35 |= i45;
                                iIozdgvuglv = iZoijcleaow;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 12:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            if (i39 != 0) {
                                i27 = iLmojexxdyd;
                                i28 = i35;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iZoijcleaow = eablkybsjg.wwaezpbzkn(bArr, iLmojexxdyd, iobyxmoadgVar);
                                unsafe2.putInt(obj, jStevsuqkhv, iobyxmoadgVar.f23919iobyxmoadg);
                                i35 |= i45;
                                iIozdgvuglv = iZoijcleaow;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 15:
                            i17 = i38;
                            iobyxmoadgVar = iobyxmoadgVar;
                            i26 = iIkoacuggdj;
                            if (i39 != 0) {
                                i27 = iLmojexxdyd;
                                i28 = i35;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iIozdgvuglv = eablkybsjg.wwaezpbzkn(bArr, iLmojexxdyd, iobyxmoadgVar);
                                unsafe2.putInt(obj, jStevsuqkhv, dxjokdxxww.zoijcleaow(iobyxmoadgVar.f23919iobyxmoadg));
                                i35 |= i45;
                                i34 = i26;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        case 16:
                            if (i39 != 0) {
                                i17 = i38;
                                i26 = iIkoacuggdj;
                                i27 = iLmojexxdyd;
                                i28 = i35;
                                i35 = i28;
                                i19 = i26;
                                unsafe = unsafe2;
                                i16 = i27;
                                i18 = -1;
                            } else {
                                iobyxmoadgVar = iobyxmoadgVar;
                                int iHcddaimhww3 = eablkybsjg.hcddaimhww(bArr, iLmojexxdyd, iobyxmoadgVar);
                                i17 = i38;
                                unsafe2.putLong(obj, jStevsuqkhv, dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.f23922zoijcleaow));
                                i35 |= i45;
                                i34 = iIkoacuggdj;
                                iIozdgvuglv = iHcddaimhww3;
                                i33 = i17;
                                i29 = -1;
                            }
                            break;
                        default:
                            i17 = i38;
                            i26 = iIkoacuggdj;
                            i27 = iLmojexxdyd;
                            i28 = i35;
                            i35 = i28;
                            i19 = i26;
                            unsafe = unsafe2;
                            i16 = i27;
                            i18 = -1;
                            break;
                    }
                } else {
                    i17 = i38;
                    int i48 = i35;
                    iobyxmoadgVar = iobyxmoadgVar;
                    int i49 = iLmojexxdyd;
                    if (iOipsdeybqn != 27) {
                        if (iOipsdeybqn <= 49) {
                            i23 = i48;
                            i19 = iIkoacuggdj;
                            i18 = -1;
                            unsafe = unsafe2;
                            i24 = i36;
                            iIozdgvuglv = vipkmwdibw(obj, bArr, i49, i14, i15, i17, i39, iIkoacuggdj, i43, iOipsdeybqn, jStevsuqkhv, iobyxmoadgVar);
                            if (iIozdgvuglv != i49) {
                                i33 = i17;
                                i29 = i18;
                                i36 = i24;
                                i35 = i23;
                            } else {
                                i16 = iIozdgvuglv;
                                i36 = i24;
                                i35 = i23;
                            }
                        } else {
                            i23 = i48;
                            i24 = i36;
                            i19 = iIkoacuggdj;
                            unsafe = unsafe2;
                            i25 = i49;
                            i18 = -1;
                            if (iOipsdeybqn == 50) {
                                if (i39 == 2) {
                                    iIozdgvuglv = sopmlzcsov(obj, bArr, i25, i14, i19, jStevsuqkhv, iobyxmoadgVar);
                                    if (iIozdgvuglv != i25) {
                                        i33 = i17;
                                        i29 = i18;
                                        i36 = i24;
                                        i35 = i23;
                                    } else {
                                        i16 = iIozdgvuglv;
                                    }
                                }
                                i36 = i24;
                                i35 = i23;
                            } else {
                                iIozdgvuglv = crxdokpmqz(obj, bArr, i25, i14, i15, i17, i39, i43, iOipsdeybqn, jStevsuqkhv, i19, iobyxmoadgVar);
                                if (iIozdgvuglv != i25) {
                                    i33 = i17;
                                    i29 = i18;
                                    i36 = i24;
                                    i35 = i23;
                                } else {
                                    i16 = iIozdgvuglv;
                                    i36 = i24;
                                    i35 = i23;
                                }
                            }
                        }
                        i34 = i19;
                        unsafe2 = unsafe;
                    } else if (i39 == 2) {
                        esjtqupxsv.wkgbmnqykc wkgbmnqykcVarMutableCopyWithCapacity = (esjtqupxsv.wkgbmnqykc) unsafe2.getObject(obj, jStevsuqkhv);
                        if (!wkgbmnqykcVarMutableCopyWithCapacity.isModifiable()) {
                            int size = wkgbmnqykcVarMutableCopyWithCapacity.size();
                            wkgbmnqykcVarMutableCopyWithCapacity = wkgbmnqykcVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, jStevsuqkhv, wkgbmnqykcVarMutableCopyWithCapacity);
                        }
                        iIozdgvuglv = eablkybsjg.rgvfuqvkyq(this.agtfadlqog(iIkoacuggdj), i15, bArr, i49, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                        i34 = iIkoacuggdj;
                        i35 = i48;
                        i33 = i17;
                        i29 = -1;
                    } else {
                        i24 = i36;
                        i19 = iIkoacuggdj;
                        unsafe = unsafe2;
                        i25 = i49;
                        i23 = i48;
                        i18 = -1;
                    }
                    i16 = i25;
                    i36 = i24;
                    i35 = i23;
                }
            }
            iIozdgvuglv = eablkybsjg.iozdgvuglv(i15, bArr, i16, i14, ojitshcjhn(obj), iobyxmoadgVar);
            i33 = i17;
            i29 = i18;
            i34 = i19;
            unsafe2 = unsafe;
        }
        int i53 = i35;
        Unsafe unsafe3 = unsafe2;
        if (i36 != 1048575) {
            unsafe3.putInt(obj, i36, i53);
        }
        if (iIozdgvuglv == i14) {
            return iIozdgvuglv;
        }
        throw InvalidProtocolBufferException.agtfadlqog();
    }

    private void rlfsiqarku(Object obj, int i13, vipkmwdibw vipkmwdibwVar) {
        if (zdlpuopuiu(i13)) {
            vipkmwdibwVar.readStringListRequireUtf8(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(i13)));
        } else {
            vipkmwdibwVar.readStringList(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(i13)));
        }
    }

    private void sflfametgt(Object obj, int i13, Object obj2) {
        f24059kcexrzcfyt.putObject(obj, stevsuqkhv(bfopjjpdmp(i13)), obj2);
        uwvvkdfqfp(obj, i13);
    }

    private int sopmlzcsov(Object obj, byte[] bArr, int i13, int i14, int i15, long j13, eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        Unsafe unsafe = f24059kcexrzcfyt;
        Object objWflxmlrfwp = wflxmlrfwp(i15);
        Object object = unsafe.getObject(obj, j13);
        if (this.f24074vdvldrhtss.isImmutable(object)) {
            Object objNewMapField = this.f24074vdvldrhtss.newMapField(objWflxmlrfwp);
            this.f24074vdvldrhtss.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j13, objNewMapField);
            object = objNewMapField;
        }
        this.f24074vdvldrhtss.forMapMetadata(objWflxmlrfwp);
        return lqeggnwhkg(bArr, i13, i14, null, this.f24074vdvldrhtss.forMutableMapData(object), iobyxmoadgVar);
    }

    private static long stevsuqkhv(int i13) {
        return i13 & 1048575;
    }

    private static double tzroggbefp(Object obj, long j13) {
        return ((Double) yfnezrywwk.istkbnxepw(obj, j13)).doubleValue();
    }

    private static long ulzqkzuiru(Object obj, long j13) {
        return ((Long) yfnezrywwk.istkbnxepw(obj, j13)).longValue();
    }

    private void uwvvkdfqfp(Object obj, int i13) {
        int iOkpsazkaxt = okpsazkaxt(i13);
        long j13 = 1048575 & iOkpsazkaxt;
        if (j13 == 1048575) {
            return;
        }
        yfnezrywwk.wypolnanlu(obj, j13, (1 << (iOkpsazkaxt >>> 20)) | yfnezrywwk.lereixgezr(obj, j13));
    }

    private int vdvldrhtss(Object obj) {
        int iNufgyqmvbu;
        int iDxjokdxxww;
        int iJpowsppfya;
        int iCllcsxoeiz;
        Unsafe unsafe = f24059kcexrzcfyt;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f24068iobyxmoadg.length; i14 += 3) {
            int iBfopjjpdmp = bfopjjpdmp(i14);
            int iOipsdeybqn = oipsdeybqn(iBfopjjpdmp);
            int iWypolnanlu = wypolnanlu(i14);
            long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
            int i15 = (iOipsdeybqn < zdlpuopuiu.f24139rlfsiqarku.iobyxmoadg() || iOipsdeybqn > zdlpuopuiu.f24158zeieaojujs.iobyxmoadg()) ? 0 : this.f24068iobyxmoadg[i14 + 2] & 1048575;
            switch (iOipsdeybqn) {
                case 0:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iWypolnanlu, 0.0d);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 1:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iWypolnanlu, 0.0f);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 2:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.jyumaefscl(iWypolnanlu, yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 3:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.dsvhmnatus(iWypolnanlu, yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 4:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.zdlpuopuiu(iWypolnanlu, yfnezrywwk.lereixgezr(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 5:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iWypolnanlu, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 6:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iWypolnanlu, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 7:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wkgbmnqykc(iWypolnanlu, true);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 8:
                    if (yggfygwlhe(obj, i14)) {
                        Object objIstkbnxepw = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
                        iNufgyqmvbu = objIstkbnxepw instanceof nufgyqmvbu ? CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) objIstkbnxepw) : CodedOutputStream.pkzmftpjix(iWypolnanlu, (String) objIstkbnxepw);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 9:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = okpsazkaxt.ojitshcjhn(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), agtfadlqog(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 10:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 11:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.hkdspvbjdz(iWypolnanlu, yfnezrywwk.lereixgezr(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 12:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.btonecajqb(iWypolnanlu, yfnezrywwk.lereixgezr(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 13:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.zynmafqrjb(iWypolnanlu, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 14:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.cdpycssgdh(iWypolnanlu, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 15:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iozdgvuglv(iWypolnanlu, yfnezrywwk.lereixgezr(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 16:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wwaezpbzkn(iWypolnanlu, yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 17:
                    if (yggfygwlhe(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.oxmwwwfdhm(iWypolnanlu, (hkdspvbjdz) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), agtfadlqog(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 18:
                    iNufgyqmvbu = okpsazkaxt.nufgyqmvbu(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 19:
                    iNufgyqmvbu = okpsazkaxt.gxszxtbevo(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 20:
                    iNufgyqmvbu = okpsazkaxt.wflxmlrfwp(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 21:
                    iNufgyqmvbu = okpsazkaxt.cqumvgiudr(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 22:
                    iNufgyqmvbu = okpsazkaxt.gtknphoqwx(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 23:
                    iNufgyqmvbu = okpsazkaxt.nufgyqmvbu(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 24:
                    iNufgyqmvbu = okpsazkaxt.gxszxtbevo(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.F /* 25 */:
                    iNufgyqmvbu = okpsazkaxt.iobyxmoadg(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.G /* 26 */:
                    iNufgyqmvbu = okpsazkaxt.yggfygwlhe(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv));
                    i13 += iNufgyqmvbu;
                    break;
                case 27:
                    iNufgyqmvbu = okpsazkaxt.rgvfuqvkyq(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), agtfadlqog(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 28:
                    iNufgyqmvbu = okpsazkaxt.ppxfxbqfkf(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv));
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.I /* 29 */:
                    iNufgyqmvbu = okpsazkaxt.jyumaefscl(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 30:
                    iNufgyqmvbu = okpsazkaxt.wkgbmnqykc(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iNufgyqmvbu = okpsazkaxt.gxszxtbevo(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 32:
                    iNufgyqmvbu = okpsazkaxt.nufgyqmvbu(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 33:
                    iNufgyqmvbu = okpsazkaxt.vdvldrhtss(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iNufgyqmvbu = okpsazkaxt.kcexrzcfyt(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.J /* 35 */:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iDxjokdxxww = okpsazkaxt.agtfadlqog((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case C4007z9.K /* 38 */:
                    iDxjokdxxww = okpsazkaxt.esjtqupxsv((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iDxjokdxxww = okpsazkaxt.draadjrbmk((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 40:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 42:
                    iDxjokdxxww = okpsazkaxt.zoijcleaow((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 43:
                    iDxjokdxxww = okpsazkaxt.iwizpuwonk((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iDxjokdxxww = okpsazkaxt.eablkybsjg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iDxjokdxxww = okpsazkaxt.lqeggnwhkg((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 46:
                    iDxjokdxxww = okpsazkaxt.dxjokdxxww((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 47:
                    iDxjokdxxww = okpsazkaxt.oxmwwwfdhm((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 48:
                    iDxjokdxxww = okpsazkaxt.zdlpuopuiu((List) unsafe.getObject(obj, jStevsuqkhv));
                    if (iDxjokdxxww > 0) {
                        if (this.f24064dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iJpowsppfya = CodedOutputStream.jpowsppfya(iWypolnanlu);
                        iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(iDxjokdxxww);
                        iNufgyqmvbu = iJpowsppfya + iCllcsxoeiz + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 49:
                    iNufgyqmvbu = okpsazkaxt.btonecajqb(iWypolnanlu, cdpycssgdh(obj, jStevsuqkhv), agtfadlqog(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 50:
                    iNufgyqmvbu = this.f24074vdvldrhtss.getSerializedSize(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), wflxmlrfwp(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iWypolnanlu, 0.0d);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iWypolnanlu, 0.0f);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.jyumaefscl(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.dsvhmnatus(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.zdlpuopuiu(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iWypolnanlu, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iWypolnanlu, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wkgbmnqykc(iWypolnanlu, true);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        Object objIstkbnxepw2 = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
                        iNufgyqmvbu = objIstkbnxepw2 instanceof nufgyqmvbu ? CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) objIstkbnxepw2) : CodedOutputStream.pkzmftpjix(iWypolnanlu, (String) objIstkbnxepw2);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = okpsazkaxt.ojitshcjhn(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), agtfadlqog(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.gxszxtbevo(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.hkdspvbjdz(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.btonecajqb(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.zynmafqrjb(iWypolnanlu, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.cdpycssgdh(iWypolnanlu, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iozdgvuglv(iWypolnanlu, ntlheqmsrt(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wwaezpbzkn(iWypolnanlu, ulzqkzuiru(obj, jStevsuqkhv));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, i14)) {
                        iNufgyqmvbu = CodedOutputStream.oxmwwwfdhm(iWypolnanlu, (hkdspvbjdz) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv), agtfadlqog(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
            }
        }
        return i13 + oxmwwwfdhm(this.f24071ojitshcjhn, obj);
    }

    private int vipkmwdibw(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, long j13, int i19, long j14, eablkybsjg.iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iYlkuphrtab;
        Unsafe unsafe = f24059kcexrzcfyt;
        esjtqupxsv.wkgbmnqykc wkgbmnqykcVarMutableCopyWithCapacity = (esjtqupxsv.wkgbmnqykc) unsafe.getObject(obj, j14);
        if (!wkgbmnqykcVarMutableCopyWithCapacity.isModifiable()) {
            int size = wkgbmnqykcVarMutableCopyWithCapacity.size();
            wkgbmnqykcVarMutableCopyWithCapacity = wkgbmnqykcVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j14, wkgbmnqykcVarMutableCopyWithCapacity);
        }
        switch (i19) {
            case 18:
            case C4007z9.J /* 35 */:
                if (i17 == 2) {
                    return eablkybsjg.oxmwwwfdhm(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 1 ? eablkybsjg.eablkybsjg(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i17 == 2) {
                    return eablkybsjg.yggfygwlhe(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 5 ? eablkybsjg.draadjrbmk(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
                if (i17 == 2) {
                    return eablkybsjg.esjtqupxsv(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 0 ? eablkybsjg.jpowsppfya(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 22:
            case C4007z9.I /* 29 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i17 == 2) {
                    return eablkybsjg.cqumvgiudr(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 0 ? eablkybsjg.ylkuphrtab(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i17 == 2) {
                    return eablkybsjg.zdlpuopuiu(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 1 ? eablkybsjg.btonecajqb(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i17 == 2) {
                    return eablkybsjg.kcexrzcfyt(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 5 ? eablkybsjg.nufgyqmvbu(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case C4007z9.F /* 25 */:
            case 42:
                if (i17 == 2) {
                    return eablkybsjg.vdvldrhtss(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 0 ? eablkybsjg.iobyxmoadg(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case C4007z9.G /* 26 */:
                if (i17 == 2) {
                    return (j13 & 536870912) == 0 ? eablkybsjg.istkbnxepw(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : eablkybsjg.cdpycssgdh(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i13;
            case 27:
                return i17 == 2 ? eablkybsjg.rgvfuqvkyq(agtfadlqog(i18), i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 28:
                return i17 == 2 ? eablkybsjg.ppxfxbqfkf(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i17 == 2) {
                    iYlkuphrtab = eablkybsjg.cqumvgiudr(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                } else {
                    if (i17 != 0) {
                        return i13;
                    }
                    iYlkuphrtab = eablkybsjg.ylkuphrtab(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                draadjrbmk(i18);
                okpsazkaxt.lereixgezr(obj, i16, wkgbmnqykcVarMutableCopyWithCapacity, null, null, this.f24071ojitshcjhn);
                return iYlkuphrtab;
            case 33:
            case 47:
                if (i17 == 2) {
                    return eablkybsjg.jyumaefscl(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 0 ? eablkybsjg.lereixgezr(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i17 == 2) {
                    return eablkybsjg.iwizpuwonk(bArr, i13, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar);
                }
                return i17 == 0 ? eablkybsjg.pmvmpeiblj(i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            case 49:
                return i17 == 3 ? eablkybsjg.agtfadlqog(agtfadlqog(i18), i15, bArr, i13, i14, wkgbmnqykcVarMutableCopyWithCapacity, iobyxmoadgVar) : i13;
            default:
                return i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void weqkydbzbr(Object obj, zfvoamnweg zfvoamnwegVar) {
        Iterator itIobyxmoadg;
        Map.Entry entry;
        nuxfzjnpeb(this.f24071ojitshcjhn, obj, zfvoamnwegVar);
        if (this.f24067gxszxtbevo) {
            kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = this.f24073rgvfuqvkyq.ppxfxbqfkf(obj);
            if (kcexrzcfytVarPpxfxbqfkf.wkgbmnqykc()) {
                itIobyxmoadg = null;
                entry = null;
            } else {
                itIobyxmoadg = kcexrzcfytVarPpxfxbqfkf.iobyxmoadg();
                entry = (Map.Entry) itIobyxmoadg.next();
            }
        } else {
            itIobyxmoadg = null;
            entry = null;
        }
        for (int length = this.f24068iobyxmoadg.length - 3; length >= 0; length -= 3) {
            int iBfopjjpdmp = bfopjjpdmp(length);
            int iWypolnanlu = wypolnanlu(length);
            while (entry != null && this.f24073rgvfuqvkyq.iobyxmoadg(entry) > iWypolnanlu) {
                this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
                entry = itIobyxmoadg.hasNext() ? (Map.Entry) itIobyxmoadg.next() : null;
            }
            switch (oipsdeybqn(iBfopjjpdmp)) {
                case 0:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, nufgyqmvbu(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 1:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, gtknphoqwx(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 2:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 3:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 4:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 5:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 6:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 7:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, eablkybsjg(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 8:
                    if (yggfygwlhe(obj, length)) {
                        zeieaojujs(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    }
                    break;
                case 9:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(length));
                    }
                    break;
                case 10:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 11:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 12:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 13:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 14:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 15:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, kcexrzcfyt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 16:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, yadqdtsiqt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 17:
                    if (yggfygwlhe(obj, length)) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(length));
                    }
                    break;
                case 18:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 19:
                    okpsazkaxt.tzroggbefp(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 20:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 21:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 22:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 23:
                    okpsazkaxt.kegysxyocb(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 24:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.F /* 25 */:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.G /* 26 */:
                    okpsazkaxt.jhduphickx(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    break;
                case 27:
                    okpsazkaxt.sopmlzcsov(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, agtfadlqog(length));
                    break;
                case 28:
                    okpsazkaxt.cllcsxoeiz(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    break;
                case C4007z9.I /* 29 */:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 30:
                    okpsazkaxt.wypolnanlu(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 32:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case 33:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, false);
                    break;
                case C4007z9.J /* 35 */:
                    okpsazkaxt.dsvhmnatus(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    okpsazkaxt.tzroggbefp(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    okpsazkaxt.ulzqkzuiru(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    okpsazkaxt.okpsazkaxt(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    okpsazkaxt.ntlheqmsrt(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 40:
                    okpsazkaxt.kegysxyocb(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    okpsazkaxt.stevsuqkhv(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 42:
                    okpsazkaxt.hkdspvbjdz(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 43:
                    okpsazkaxt.ikoacuggdj(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    okpsazkaxt.wypolnanlu(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    okpsazkaxt.crxdokpmqz(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 46:
                    okpsazkaxt.jlmebxxoox(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 47:
                    okpsazkaxt.ribwqtqdhb(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 48:
                    okpsazkaxt.vipkmwdibw(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, true);
                    break;
                case 49:
                    okpsazkaxt.mbcevpiqjq(wypolnanlu(length), (List) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar, agtfadlqog(length));
                    break;
                case 50:
                    lrnfpwlwnk(zfvoamnwegVar, iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), length);
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeDouble(iWypolnanlu, tzroggbefp(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeFloat(iWypolnanlu, mbcevpiqjq(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeUInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeFixed64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeFixed32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeBool(iWypolnanlu, kegysxyocb(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zeieaojujs(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), zfvoamnwegVar);
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.eablkybsjg(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(length));
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.wkgbmnqykc(iWypolnanlu, (nufgyqmvbu) yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeUInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeEnum(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeSFixed32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeSFixed64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeSInt32(iWypolnanlu, ntlheqmsrt(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.writeSInt64(iWypolnanlu, ulzqkzuiru(obj, stevsuqkhv(iBfopjjpdmp)));
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, length)) {
                        zfvoamnwegVar.zoijcleaow(iWypolnanlu, yfnezrywwk.istkbnxepw(obj, stevsuqkhv(iBfopjjpdmp)), agtfadlqog(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f24073rgvfuqvkyq.btonecajqb(zfvoamnwegVar, entry);
            entry = itIobyxmoadg.hasNext() ? (Map.Entry) itIobyxmoadg.next() : null;
        }
    }

    private Object wflxmlrfwp(int i13) {
        return this.f24077zoijcleaow[(i13 / 3) * 2];
    }

    private boolean wkgbmnqykc(Object obj, Object obj2, int i13) {
        return yggfygwlhe(obj, i13) == yggfygwlhe(obj2, i13);
    }

    private void wwaezpbzkn(Object obj, Object obj2, int i13) {
        if (yggfygwlhe(obj2, i13)) {
            long jStevsuqkhv = stevsuqkhv(bfopjjpdmp(i13));
            Unsafe unsafe = f24059kcexrzcfyt;
            Object object = unsafe.getObject(obj2, jStevsuqkhv);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + wypolnanlu(i13) + " is present but null: " + obj2);
            }
            jhduphickx jhduphickxVarAgtfadlqog = agtfadlqog(i13);
            if (!yggfygwlhe(obj, i13)) {
                if (lereixgezr(object)) {
                    Object objNewInstance = jhduphickxVarAgtfadlqog.newInstance();
                    jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jStevsuqkhv, objNewInstance);
                } else {
                    unsafe.putObject(obj, jStevsuqkhv, object);
                }
                uwvvkdfqfp(obj, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, jStevsuqkhv);
            if (!lereixgezr(object2)) {
                Object objNewInstance2 = jhduphickxVarAgtfadlqog.newInstance();
                jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jStevsuqkhv, objNewInstance2);
                object2 = objNewInstance2;
            }
            jhduphickxVarAgtfadlqog.mergeFrom(object2, object);
        }
    }

    private int wypolnanlu(int i13) {
        return this.f24068iobyxmoadg[i13];
    }

    private void xrmfcynszj(Object obj, int i13, vipkmwdibw vipkmwdibwVar, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) {
        vipkmwdibwVar.wkgbmnqykc(this.f24061agtfadlqog.eablkybsjg(obj, stevsuqkhv(i13)), jhduphickxVar, ojitshcjhnVar);
    }

    private static long yadqdtsiqt(Object obj, long j13) {
        return yfnezrywwk.pmvmpeiblj(obj, j13);
    }

    private int ydmasvzmpa(int i13, int i14) {
        int length = (this.f24068iobyxmoadg.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int iWypolnanlu = wypolnanlu(i16);
            if (i13 == iWypolnanlu) {
                return i16;
            }
            if (i13 < iWypolnanlu) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    private void yfnezrywwk(Object obj, int i13, int i14) {
        yfnezrywwk.wypolnanlu(obj, okpsazkaxt(i14) & 1048575, i13);
    }

    private boolean yggfygwlhe(Object obj, int i13) {
        int iOkpsazkaxt = okpsazkaxt(i13);
        long j13 = 1048575 & iOkpsazkaxt;
        if (j13 != 1048575) {
            return (yfnezrywwk.lereixgezr(obj, j13) & (1 << (iOkpsazkaxt >>> 20))) != 0;
        }
        int iBfopjjpdmp = bfopjjpdmp(i13);
        long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
        switch (oipsdeybqn(iBfopjjpdmp)) {
            case 0:
                return Double.doubleToRawLongBits(yfnezrywwk.cqumvgiudr(obj, jStevsuqkhv)) != 0;
            case 1:
                return Float.floatToRawIntBits(yfnezrywwk.esjtqupxsv(obj, jStevsuqkhv)) != 0;
            case 2:
                return yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) != 0;
            case 3:
                return yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) != 0;
            case 4:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 5:
                return yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) != 0;
            case 6:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 7:
                return yfnezrywwk.oxmwwwfdhm(obj, jStevsuqkhv);
            case 8:
                Object objIstkbnxepw = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
                if (objIstkbnxepw instanceof String) {
                    return !((String) objIstkbnxepw).isEmpty();
                }
                if (objIstkbnxepw instanceof nufgyqmvbu) {
                    return !nufgyqmvbu.f23969yggfygwlhe.equals(objIstkbnxepw);
                }
                throw new IllegalArgumentException();
            case 9:
                return yfnezrywwk.istkbnxepw(obj, jStevsuqkhv) != null;
            case 10:
                return !nufgyqmvbu.f23969yggfygwlhe.equals(yfnezrywwk.istkbnxepw(obj, jStevsuqkhv));
            case 11:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 12:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 13:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 14:
                return yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) != 0;
            case 15:
                return yfnezrywwk.lereixgezr(obj, jStevsuqkhv) != 0;
            case 16:
                return yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv) != 0;
            case 17:
                return yfnezrywwk.istkbnxepw(obj, jStevsuqkhv) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void ylkuphrtab(Object obj, Object obj2, int i13) {
        int iWypolnanlu = wypolnanlu(i13);
        if (zynmafqrjb(obj2, iWypolnanlu, i13)) {
            long jStevsuqkhv = stevsuqkhv(bfopjjpdmp(i13));
            Unsafe unsafe = f24059kcexrzcfyt;
            Object object = unsafe.getObject(obj2, jStevsuqkhv);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + wypolnanlu(i13) + " is present but null: " + obj2);
            }
            jhduphickx jhduphickxVarAgtfadlqog = agtfadlqog(i13);
            if (!zynmafqrjb(obj, iWypolnanlu, i13)) {
                if (lereixgezr(object)) {
                    Object objNewInstance = jhduphickxVarAgtfadlqog.newInstance();
                    jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jStevsuqkhv, objNewInstance);
                } else {
                    unsafe.putObject(obj, jStevsuqkhv, object);
                }
                yfnezrywwk(obj, iWypolnanlu, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, jStevsuqkhv);
            if (!lereixgezr(object2)) {
                Object objNewInstance2 = jhduphickxVarAgtfadlqog.newInstance();
                jhduphickxVarAgtfadlqog.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jStevsuqkhv, objNewInstance2);
                object2 = objNewInstance2;
            }
            jhduphickxVarAgtfadlqog.mergeFrom(object2, object);
        }
    }

    private static boolean zdlpuopuiu(int i13) {
        return (i13 & 536870912) != 0;
    }

    private void zeieaojujs(int i13, Object obj, zfvoamnweg zfvoamnwegVar) {
        if (obj instanceof String) {
            zfvoamnwegVar.writeString(i13, (String) obj);
        } else {
            zfvoamnwegVar.wkgbmnqykc(i13, (nufgyqmvbu) obj);
        }
    }

    private void zfvoamnweg(Object obj, int i13, int i14, Object obj2) {
        f24059kcexrzcfyt.putObject(obj, stevsuqkhv(bfopjjpdmp(i14)), obj2);
        yfnezrywwk(obj, i13, i14);
    }

    private boolean zynmafqrjb(Object obj, int i13, int i14) {
        return yfnezrywwk.lereixgezr(obj, (long) (okpsazkaxt(i14) & 1048575)) == i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public boolean equals(Object obj, Object obj2) {
        int length = this.f24068iobyxmoadg.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            if (!dxjokdxxww(obj, obj2, i13)) {
                return false;
            }
        }
        if (!this.f24071ojitshcjhn.lqeggnwhkg(obj).equals(this.f24071ojitshcjhn.lqeggnwhkg(obj2))) {
            return false;
        }
        if (this.f24067gxszxtbevo) {
            return this.f24073rgvfuqvkyq.ppxfxbqfkf(obj).equals(this.f24073rgvfuqvkyq.ppxfxbqfkf(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public int getSerializedSize(Object obj) {
        return this.f24070nufgyqmvbu ? vdvldrhtss(obj) : rgvfuqvkyq(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public int hashCode(Object obj) {
        int i13;
        int iGxszxtbevo;
        int length = this.f24068iobyxmoadg.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iBfopjjpdmp = bfopjjpdmp(i15);
            int iWypolnanlu = wypolnanlu(i15);
            long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
            int iHashCode = 37;
            switch (oipsdeybqn(iBfopjjpdmp)) {
                case 0:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(Double.doubleToLongBits(yfnezrywwk.cqumvgiudr(obj, jStevsuqkhv)));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 1:
                    i13 = i14 * 53;
                    iGxszxtbevo = Float.floatToIntBits(yfnezrywwk.esjtqupxsv(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 2:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 3:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 5:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 7:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.ppxfxbqfkf(yfnezrywwk.oxmwwwfdhm(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 8:
                    i13 = i14 * 53;
                    iGxszxtbevo = ((String) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv)).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 9:
                    Object objIstkbnxepw = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
                    if (objIstkbnxepw != null) {
                        iHashCode = objIstkbnxepw.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 14:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.lereixgezr(obj, jStevsuqkhv);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 16:
                    i13 = i14 * 53;
                    iGxszxtbevo = esjtqupxsv.gxszxtbevo(yfnezrywwk.pmvmpeiblj(obj, jStevsuqkhv));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 17:
                    Object objIstkbnxepw2 = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv);
                    if (objIstkbnxepw2 != null) {
                        iHashCode = objIstkbnxepw2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                case 28:
                case C4007z9.I /* 29 */:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case C4007z9.J /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case C4007z9.K /* 38 */:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 50:
                    i13 = i14 * 53;
                    iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 51:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(Double.doubleToLongBits(tzroggbefp(obj, jStevsuqkhv)));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 52:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = Float.floatToIntBits(mbcevpiqjq(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 53:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(ulzqkzuiru(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 54:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(ulzqkzuiru(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 55:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 56:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(ulzqkzuiru(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 57:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 58:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.ppxfxbqfkf(kegysxyocb(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 59:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ((String) yfnezrywwk.istkbnxepw(obj, jStevsuqkhv)).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 60:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 61:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 62:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 63:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(ulzqkzuiru(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 66:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ntlheqmsrt(obj, jStevsuqkhv);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 67:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = esjtqupxsv.gxszxtbevo(ulzqkzuiru(obj, jStevsuqkhv));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 68:
                    if (zynmafqrjb(obj, iWypolnanlu, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = yfnezrywwk.istkbnxepw(obj, jStevsuqkhv).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
            }
        }
        int iHashCode2 = (i14 * 53) + this.f24071ojitshcjhn.lqeggnwhkg(obj).hashCode();
        return this.f24067gxszxtbevo ? (iHashCode2 * 53) + this.f24073rgvfuqvkyq.ppxfxbqfkf(obj).hashCode() : iHashCode2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void iobyxmoadg(Object obj, byte[] bArr, int i13, int i14, eablkybsjg.iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        if (this.f24070nufgyqmvbu) {
            ribwqtqdhb(obj, bArr, i13, i14, iobyxmoadgVar);
        } else {
            jlmebxxoox(obj, bArr, i13, i14, 0, iobyxmoadgVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public final boolean isInitialized(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f24066gtknphoqwx) {
            int i18 = this.f24062btonecajqb[i17];
            int iWypolnanlu = wypolnanlu(i18);
            int iBfopjjpdmp = bfopjjpdmp(i18);
            int i19 = this.f24068iobyxmoadg[i18 + 2];
            int i23 = i19 & 1048575;
            int i24 = 1 << (i19 >>> 20);
            if (i23 != i15) {
                if (i23 != 1048575) {
                    i16 = f24059kcexrzcfyt.getInt(obj, i23);
                }
                i14 = i16;
                i13 = i23;
            } else {
                i13 = i15;
                i14 = i16;
            }
            if (istkbnxepw(iBfopjjpdmp) && !jyumaefscl(obj, i18, i13, i14, i24)) {
                return false;
            }
            int iOipsdeybqn = oipsdeybqn(iBfopjjpdmp);
            if (iOipsdeybqn == 9 || iOipsdeybqn == 17) {
                if (jyumaefscl(obj, i18, i13, i14, i24) && !iwizpuwonk(obj, iBfopjjpdmp, agtfadlqog(i18))) {
                    return false;
                }
            } else if (iOipsdeybqn == 27) {
                if (!cqumvgiudr(obj, iBfopjjpdmp, i18)) {
                    return false;
                }
            } else if (iOipsdeybqn == 60 || iOipsdeybqn == 68) {
                if (zynmafqrjb(obj, iWypolnanlu, i18) && !iwizpuwonk(obj, iBfopjjpdmp, agtfadlqog(i18))) {
                    return false;
                }
            } else if (iOipsdeybqn != 49) {
                if (iOipsdeybqn == 50 && !esjtqupxsv(obj, iBfopjjpdmp, i18)) {
                    return false;
                }
            } else if (!cqumvgiudr(obj, iBfopjjpdmp, i18)) {
                return false;
            }
            i17++;
            i15 = i13;
            i16 = i14;
        }
        return !this.f24067gxszxtbevo || this.f24073rgvfuqvkyq.ppxfxbqfkf(obj).eablkybsjg();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    int jlmebxxoox(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.eablkybsjg.iobyxmoadg r36) {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.wypolnanlu.jlmebxxoox(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.eablkybsjg$iobyxmoadg):int");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void makeImmutable(Object obj) {
        if (lereixgezr(obj)) {
            if (obj instanceof iwizpuwonk) {
                iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
                iwizpuwonkVar.nufgyqmvbu();
                iwizpuwonkVar.lqeggnwhkg();
                iwizpuwonkVar.lereixgezr();
            }
            int length = this.f24068iobyxmoadg.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iBfopjjpdmp = bfopjjpdmp(i13);
                long jStevsuqkhv = stevsuqkhv(iBfopjjpdmp);
                int iOipsdeybqn = oipsdeybqn(iBfopjjpdmp);
                if (iOipsdeybqn != 9) {
                    switch (iOipsdeybqn) {
                        case 17:
                            if (yggfygwlhe(obj, i13)) {
                                agtfadlqog(i13).makeImmutable(f24059kcexrzcfyt.getObject(obj, jStevsuqkhv));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                        case C4007z9.G /* 26 */:
                        case 27:
                        case 28:
                        case C4007z9.I /* 29 */:
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        case C4007z9.K /* 38 */:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case 40:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case 42:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f24061agtfadlqog.ppxfxbqfkf(obj, jStevsuqkhv);
                            break;
                        case 50:
                            Unsafe unsafe = f24059kcexrzcfyt;
                            Object object = unsafe.getObject(obj, jStevsuqkhv);
                            if (object != null) {
                                unsafe.putObject(obj, jStevsuqkhv, this.f24074vdvldrhtss.toImmutable(object));
                            }
                            break;
                    }
                } else if (yggfygwlhe(obj, i13)) {
                    agtfadlqog(i13).makeImmutable(f24059kcexrzcfyt.getObject(obj, jStevsuqkhv));
                }
            }
            this.f24071ojitshcjhn.btonecajqb(obj);
            if (this.f24067gxszxtbevo) {
                this.f24073rgvfuqvkyq.gxszxtbevo(obj);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void mergeFrom(Object obj, Object obj2) {
        gxszxtbevo(obj);
        obj2.getClass();
        for (int i13 = 0; i13 < this.f24068iobyxmoadg.length; i13 += 3) {
            pkzmftpjix(obj, obj2, i13);
        }
        okpsazkaxt.iozdgvuglv(this.f24071ojitshcjhn, obj, obj2);
        if (this.f24067gxszxtbevo) {
            okpsazkaxt.cdpycssgdh(this.f24073rgvfuqvkyq, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public Object newInstance() {
        return this.f24075wflxmlrfwp.newInstance(this.f24065eablkybsjg);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void ppxfxbqfkf(Object obj, zfvoamnweg zfvoamnwegVar) {
        if (zfvoamnwegVar.fieldOrder() == zfvoamnweg.iobyxmoadg.DESCENDING) {
            weqkydbzbr(obj, zfvoamnwegVar);
        } else if (this.f24070nufgyqmvbu) {
            iyctptxqzt(obj, zfvoamnwegVar);
        } else {
            opjhrmiecq(obj, zfvoamnwegVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void zoijcleaow(Object obj, vipkmwdibw vipkmwdibwVar, ojitshcjhn ojitshcjhnVar) {
        ojitshcjhnVar.getClass();
        gxszxtbevo(obj);
        iozdgvuglv(this.f24071ojitshcjhn, this.f24073rgvfuqvkyq, obj, vipkmwdibwVar, ojitshcjhnVar);
    }
}
