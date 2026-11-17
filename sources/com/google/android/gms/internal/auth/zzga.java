package com.google.android.gms.internal.auth;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i13, int i14, zzfx zzfxVar, int i15, boolean z13, int[] iArr2, int i16, int i17, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i13;
        this.zzf = i14;
        this.zzh = iArr2;
        this.zzi = i16;
        this.zzj = i17;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i13, int i14) {
        zzhj.zzn(obj, zzl(i14) & 1048575, i13);
    }

    private final void zzB(Object obj, int i13, Object obj2) {
        zzb.putObject(obj, zzo(i13) & 1048575, obj2);
        zzz(obj, i13);
    }

    private final void zzC(Object obj, int i13, int i14, Object obj2) {
        zzb.putObject(obj, zzo(i14) & 1048575, obj2);
        zzA(obj, i13, i14);
    }

    private final boolean zzD(Object obj, Object obj2, int i13) {
        return zzE(obj, i13) == zzE(obj2, i13);
    }

    private final boolean zzE(Object obj, int i13) {
        int iZzl = zzl(i13);
        long j13 = iZzl & 1048575;
        if (j13 != 1048575) {
            return (zzhj.zzc(obj, j13) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i13);
        long j14 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j14)) != 0;
            case 2:
                return zzhj.zzd(obj, j14) != 0;
            case 3:
                return zzhj.zzd(obj, j14) != 0;
            case 4:
                return zzhj.zzc(obj, j14) != 0;
            case 5:
                return zzhj.zzd(obj, j14) != 0;
            case 6:
                return zzhj.zzc(obj, j14) != 0;
            case 7:
                return zzhj.zzt(obj, j14);
            case 8:
                Object objZzf = zzhj.zzf(obj, j14);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j14) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j14));
            case 11:
                return zzhj.zzc(obj, j14) != 0;
            case 12:
                return zzhj.zzc(obj, j14) != 0;
            case 13:
                return zzhj.zzc(obj, j14) != 0;
            case 14:
                return zzhj.zzd(obj, j14) != 0;
            case 15:
                return zzhj.zzc(obj, j14) != 0;
            case 16:
                return zzhj.zzd(obj, j14) != 0;
            case 17:
                return zzhj.zzf(obj, j14) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return zzE(obj, i13);
        }
        return (i15 & i16) != 0;
    }

    private static boolean zzG(Object obj, int i13, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i13 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i13, int i14) {
        return zzhj.zzc(obj, (long) (zzl(i14) & 1048575)) == i13;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i13;
        int iCharAt;
        int iCharAt2;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char cCharAt;
        int i23;
        char cCharAt2;
        int i24;
        char cCharAt3;
        int i25;
        char cCharAt4;
        int i26;
        char cCharAt5;
        int i27;
        char cCharAt6;
        int i28;
        char cCharAt7;
        int i29;
        char cCharAt8;
        int i33;
        int i34;
        int i35;
        int i36;
        int iObjectFieldOffset;
        int i37;
        int i38;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i39;
        int i43;
        int i44;
        Object obj;
        Field fieldZzv2;
        int i45;
        Object obj2;
        Field fieldZzv3;
        int i46;
        char cCharAt10;
        int i47;
        char cCharAt11;
        int i48;
        char cCharAt12;
        int i49;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar = (zzgh) zzfuVar;
        String strZzd = zzghVar.zzd();
        int length = strZzd.length();
        char c13 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i53 = 1;
            while (true) {
                i13 = i53 + 1;
                if (strZzd.charAt(i53) < 55296) {
                    break;
                }
                i53 = i13;
            }
        } else {
            i13 = 1;
        }
        int i54 = i13 + 1;
        int iCharAt3 = strZzd.charAt(i13);
        if (iCharAt3 >= 55296) {
            int i55 = iCharAt3 & 8191;
            int i56 = 13;
            while (true) {
                i49 = i54 + 1;
                cCharAt13 = strZzd.charAt(i54);
                if (cCharAt13 < 55296) {
                    break;
                }
                i55 |= (cCharAt13 & 8191) << i56;
                i56 += 13;
                i54 = i49;
            }
            iCharAt3 = i55 | (cCharAt13 << i56);
            i54 = i49;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i15 = 0;
            i18 = 0;
            i14 = 0;
            i16 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i57 = i54 + 1;
            int iCharAt4 = strZzd.charAt(i54);
            if (iCharAt4 >= 55296) {
                int i58 = iCharAt4 & 8191;
                int i59 = 13;
                while (true) {
                    i29 = i57 + 1;
                    cCharAt8 = strZzd.charAt(i57);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt8 & 8191) << i59;
                    i59 += 13;
                    i57 = i29;
                }
                iCharAt4 = i58 | (cCharAt8 << i59);
                i57 = i29;
            }
            int i63 = i57 + 1;
            int iCharAt5 = strZzd.charAt(i57);
            if (iCharAt5 >= 55296) {
                int i64 = iCharAt5 & 8191;
                int i65 = 13;
                while (true) {
                    i28 = i63 + 1;
                    cCharAt7 = strZzd.charAt(i63);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt7 & 8191) << i65;
                    i65 += 13;
                    i63 = i28;
                }
                iCharAt5 = i64 | (cCharAt7 << i65);
                i63 = i28;
            }
            int i66 = i63 + 1;
            int iCharAt6 = strZzd.charAt(i63);
            if (iCharAt6 >= 55296) {
                int i67 = iCharAt6 & 8191;
                int i68 = 13;
                while (true) {
                    i27 = i66 + 1;
                    cCharAt6 = strZzd.charAt(i66);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt6 & 8191) << i68;
                    i68 += 13;
                    i66 = i27;
                }
                iCharAt6 = i67 | (cCharAt6 << i68);
                i66 = i27;
            }
            int i69 = i66 + 1;
            int iCharAt7 = strZzd.charAt(i66);
            if (iCharAt7 >= 55296) {
                int i73 = iCharAt7 & 8191;
                int i74 = 13;
                while (true) {
                    i26 = i69 + 1;
                    cCharAt5 = strZzd.charAt(i69);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt5 & 8191) << i74;
                    i74 += 13;
                    i69 = i26;
                }
                iCharAt7 = i73 | (cCharAt5 << i74);
                i69 = i26;
            }
            int i75 = i69 + 1;
            iCharAt = strZzd.charAt(i69);
            if (iCharAt >= 55296) {
                int i76 = iCharAt & 8191;
                int i77 = 13;
                while (true) {
                    i25 = i75 + 1;
                    cCharAt4 = strZzd.charAt(i75);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt4 & 8191) << i77;
                    i77 += 13;
                    i75 = i25;
                }
                iCharAt = i76 | (cCharAt4 << i77);
                i75 = i25;
            }
            int i78 = i75 + 1;
            iCharAt2 = strZzd.charAt(i75);
            if (iCharAt2 >= 55296) {
                int i79 = iCharAt2 & 8191;
                int i83 = 13;
                while (true) {
                    i24 = i78 + 1;
                    cCharAt3 = strZzd.charAt(i78);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt3 & 8191) << i83;
                    i83 += 13;
                    i78 = i24;
                }
                iCharAt2 = i79 | (cCharAt3 << i83);
                i78 = i24;
            }
            int i84 = i78 + 1;
            int iCharAt8 = strZzd.charAt(i78);
            if (iCharAt8 >= 55296) {
                int i85 = iCharAt8 & 8191;
                int i86 = 13;
                while (true) {
                    i23 = i84 + 1;
                    cCharAt2 = strZzd.charAt(i84);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt2 & 8191) << i86;
                    i86 += 13;
                    i84 = i23;
                }
                iCharAt8 = i85 | (cCharAt2 << i86);
                i84 = i23;
            }
            int i87 = i84 + 1;
            int iCharAt9 = strZzd.charAt(i84);
            if (iCharAt9 >= 55296) {
                int i88 = iCharAt9 & 8191;
                int i89 = 13;
                while (true) {
                    i19 = i87 + 1;
                    cCharAt = strZzd.charAt(i87);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i88 |= (cCharAt & 8191) << i89;
                    i89 += 13;
                    i87 = i19;
                }
                iCharAt9 = i88 | (cCharAt << i89);
                i87 = i19;
            }
            i14 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i15 = iCharAt6;
            i16 = iCharAt9;
            i17 = iCharAt4;
            i18 = iCharAt7;
            i54 = i87;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar.zze();
        Class<?> cls2 = zzghVar.zza().getClass();
        int i93 = i16 + iCharAt2;
        int i94 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i94];
        int i95 = 0;
        int i96 = 0;
        int i97 = i16;
        int i98 = i93;
        while (i54 < length) {
            int i99 = i54 + 1;
            int iCharAt10 = strZzd.charAt(i54);
            if (iCharAt10 >= c13) {
                int i100 = iCharAt10 & 8191;
                int i101 = i99;
                int i102 = 13;
                while (true) {
                    i48 = i101 + 1;
                    cCharAt12 = strZzd.charAt(i101);
                    if (cCharAt12 < c13) {
                        break;
                    }
                    i100 |= (cCharAt12 & 8191) << i102;
                    i102 += 13;
                    i101 = i48;
                }
                iCharAt10 = i100 | (cCharAt12 << i102);
                i33 = i48;
            } else {
                i33 = i99;
            }
            int i103 = i33 + 1;
            int iCharAt11 = strZzd.charAt(i33);
            if (iCharAt11 >= c13) {
                int i104 = iCharAt11 & 8191;
                int i105 = i103;
                int i106 = 13;
                while (true) {
                    i47 = i105 + 1;
                    cCharAt11 = strZzd.charAt(i105);
                    if (cCharAt11 < c13) {
                        break;
                    }
                    i104 |= (cCharAt11 & 8191) << i106;
                    i106 += 13;
                    i105 = i47;
                }
                iCharAt11 = i104 | (cCharAt11 << i106);
                i34 = i47;
            } else {
                i34 = i103;
            }
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i95] = i96;
                i95++;
            }
            int i107 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i107 >= 51) {
                int i108 = i34 + 1;
                int iCharAt12 = strZzd.charAt(i34);
                char c14 = 55296;
                if (iCharAt12 >= 55296) {
                    int i109 = iCharAt12 & 8191;
                    int i110 = 13;
                    while (true) {
                        i46 = i108 + 1;
                        cCharAt10 = strZzd.charAt(i108);
                        if (cCharAt10 < c14) {
                            break;
                        }
                        i109 |= (cCharAt10 & 8191) << i110;
                        i110 += 13;
                        i108 = i46;
                        c14 = 55296;
                    }
                    iCharAt12 = i109 | (cCharAt10 << i110);
                    i108 = i46;
                }
                int i111 = i107 - 51;
                int i112 = i108;
                if (i111 == 9 || i111 == 17) {
                    int i113 = i96 / 3;
                    i43 = i14 + 1;
                    objArr[i113 + i113 + 1] = objArrZze[i14];
                } else {
                    if (i111 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i114 = i96 / 3;
                        i43 = i14 + 1;
                        objArr[i114 + i114 + 1] = objArrZze[i14];
                    }
                    i44 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i44];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i44] = fieldZzv2;
                    }
                    int i115 = i15;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i45 = i44 + 1;
                    obj2 = objArrZze[i45];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i45] = fieldZzv3;
                    }
                    strZzd = strZzd;
                    i35 = i115;
                    i36 = i14;
                    i37 = i112;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                    i38 = 0;
                }
                i14 = i43;
                i44 = iCharAt12 + iCharAt12;
                obj = objArrZze[i44];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls2, (String) obj);
                    objArrZze[i44] = fieldZzv2;
                }
                int i116 = i15;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                i45 = i44 + 1;
                obj2 = objArrZze[i45];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls2, (String) obj2);
                    objArrZze[i45] = fieldZzv3;
                }
                strZzd = strZzd;
                i35 = i116;
                i36 = i14;
                i37 = i112;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                i38 = 0;
            } else {
                i35 = i15;
                i36 = i14 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i14]);
                if (i107 == 9 || i107 == 17) {
                    i35 = i35;
                    int i117 = i96 / 3;
                    objArr[i117 + i117 + 1] = fieldZzv4.getType();
                } else {
                    if (i107 == 27 || i107 == 49) {
                        i35 = i35;
                        int i118 = i96 / 3;
                        i39 = i14 + 2;
                        objArr[i118 + i118 + 1] = objArrZze[i36];
                    } else if (i107 == 12 || i107 == 30 || i107 == 44) {
                        i35 = i35;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i119 = i96 / 3;
                            i39 = i14 + 2;
                            objArr[i119 + i119 + 1] = objArrZze[i36];
                        }
                    } else if (i107 == 50) {
                        int i120 = i97 + 1;
                        iArr[i97] = i96;
                        int i121 = i96 / 3;
                        int i122 = i14 + 2;
                        int i123 = i121 + i121;
                        objArr[i123] = objArrZze[i36];
                        if ((iCharAt11 & 2048) != 0) {
                            i36 = i14 + 3;
                            objArr[i123 + 1] = objArrZze[i122];
                            i97 = i120;
                        } else {
                            i97 = i120;
                            i36 = i122;
                        }
                    }
                    i36 = i39;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i107 > 17) {
                    i37 = i34;
                    i38 = 0;
                } else {
                    int i124 = i34 + 1;
                    int iCharAt13 = strZzd.charAt(i34);
                    if (iCharAt13 >= 55296) {
                        int i125 = iCharAt13 & 8191;
                        int i126 = 13;
                        while (true) {
                            i37 = i124 + 1;
                            cCharAt9 = strZzd.charAt(i124);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i125 |= (cCharAt9 & 8191) << i126;
                            i126 += 13;
                            i124 = i37;
                        }
                        iCharAt13 = i125 | (cCharAt9 << i126);
                    } else {
                        i37 = i124;
                    }
                    int i127 = i17 + i17 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i127];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i127] = fieldZzv;
                    }
                    i38 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i107 >= 18 && i107 <= 49) {
                    iArr[i98] = iObjectFieldOffset3;
                    i98++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i128 = i96 + 1;
            iArr2[i96] = iCharAt10;
            int i129 = i96 + 2;
            iArr2[i128] = iObjectFieldOffset2 | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i107 << 20);
            i96 += 3;
            iArr2[i129] = (i38 << 20) | iObjectFieldOffset;
            i14 = i36;
            i54 = i37;
            length = length;
            i15 = i35;
            strZzd = strZzd;
            i18 = i18;
            c13 = 55296;
        }
        return new zzga(iArr2, objArr, i15, i18, zzghVar.zza(), zzghVar.zzc(), false, iArr, i16, i93, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j13) {
        return ((Integer) zzhj.zzf(obj, j13)).intValue();
    }

    private final int zzl(int i13) {
        return this.zzc[i13 + 2];
    }

    private final int zzm(int i13, int i14) {
        int length = (this.zzc.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = this.zzc[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i13) {
        return (i13 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzo(int i13) {
        return this.zzc[i13 + 1];
    }

    private static long zzp(Object obj, long j13) {
        return ((Long) zzhj.zzf(obj, j13)).longValue();
    }

    private final zzey zzq(int i13) {
        int i14 = i13 / 3;
        return (zzey) this.zzd[i14 + i14 + 1];
    }

    private final zzgi zzr(int i13) {
        int i14 = i13 / 3;
        int i15 = i14 + i14;
        zzgi zzgiVar = (zzgi) this.zzd[i15];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i15 + 1]);
        this.zzd[i15] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i13) {
        int i14 = i13 / 3;
        return this.zzd[i14 + i14];
    }

    private final Object zzt(Object obj, int i13) {
        zzgi zzgiVarZzr = zzr(i13);
        int iZzo = zzo(i13) & 1048575;
        if (!zzE(obj, i13)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i13, int i14) {
        zzgi zzgiVarZzr = zzr(i14);
        if (!zzI(obj, i13, i14)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i14) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
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

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i13) {
        if (zzE(obj2, i13)) {
            int iZzo = zzo(i13) & 1048575;
            Unsafe unsafe = zzb;
            long j13 = iZzo;
            Object object = unsafe.getObject(obj2, j13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i13] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i13);
            if (!zzE(obj, i13)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j13, objZzd);
                } else {
                    unsafe.putObject(obj, j13, object);
                }
                zzz(obj, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, j13);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j13, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i13) {
        int i14 = this.zzc[i13];
        if (zzI(obj2, i14, i13)) {
            int iZzo = zzo(i13) & 1048575;
            Unsafe unsafe = zzb;
            long j13 = iZzo;
            Object object = unsafe.getObject(obj2, j13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i13] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i13);
            if (!zzI(obj, i14, i13)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j13, objZzd);
                } else {
                    unsafe.putObject(obj, j13, object);
                }
                zzA(obj, i14, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, j13);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j13, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i13) {
        int iZzl = zzl(i13);
        long j13 = 1048575 & iZzl;
        if (j13 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j13, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j13));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i13;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iZzo = zzo(i15);
            int i16 = this.zzc[i15];
            long j13 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i13 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j13));
                    byte[] bArr = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 1:
                    i13 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j13));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 2:
                    i13 = i14 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j13);
                    byte[] bArr2 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 3:
                    i13 = i14 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j13);
                    byte[] bArr3 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 5:
                    i13 = i14 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j13);
                    byte[] bArr4 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 7:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j13));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 8:
                    i13 = i14 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j13)).hashCode();
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j13);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 14:
                    i13 = i14 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j13);
                    byte[] bArr5 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j13);
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 16:
                    i13 = i14 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j13);
                    byte[] bArr6 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j13);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 50:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                    i14 = i13 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j13)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j13)).floatValue());
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = zzp(obj, j13);
                        byte[] bArr8 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = zzp(obj, j13);
                        byte[] bArr9 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = zzp(obj, j13);
                        byte[] bArr10 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j13)).booleanValue());
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j13)).hashCode();
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = zzp(obj, j13);
                        byte[] bArr11 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzk(obj, j13);
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        jDoubleToLongBits = zzp(obj, j13);
                        byte[] bArr12 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzI(obj, i16, i15)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j13).hashCode();
                        i14 = i13 + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i14 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:109:0x0306  */
    /* JADX WARN: Code duplicated, block: B:111:0x030b  */
    /* JADX WARN: Code duplicated, block: B:119:0x035a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0368 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x036a  */
    /* JADX WARN: Code duplicated, block: B:123:0x036d  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0511  */
    /* JADX WARN: Code duplicated, block: B:172:0x051a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0588  */
    /* JADX WARN: Code duplicated, block: B:183:0x0593  */
    /* JADX WARN: Code duplicated, block: B:186:0x059f  */
    /* JADX WARN: Code duplicated, block: B:188:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:194:0x05d6 A[LOOP:2: B:191:0x05cc->B:194:0x05d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:199:0x0604  */
    /* JADX WARN: Code duplicated, block: B:201:0x060c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0617 A[LOOP:3: B:202:0x0615->B:203:0x0617, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0632 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0634  */
    /* JADX WARN: Code duplicated, block: B:211:0x0645  */
    /* JADX WARN: Code duplicated, block: B:213:0x064d A[LOOP:4: B:210:0x0643->B:213:0x064d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0669  */
    /* JADX WARN: Code duplicated, block: B:219:0x0671  */
    /* JADX WARN: Code duplicated, block: B:221:0x067c A[LOOP:5: B:220:0x067a->B:221:0x067c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x0692 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x0694  */
    /* JADX WARN: Code duplicated, block: B:229:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x06ad A[LOOP:6: B:228:0x06a3->B:231:0x06ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:234:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:235:0x06c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:242:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:244:0x0702 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0704  */
    /* JADX WARN: Code duplicated, block: B:247:0x0711  */
    /* JADX WARN: Code duplicated, block: B:251:0x0730  */
    /* JADX WARN: Code duplicated, block: B:252:0x0738  */
    /* JADX WARN: Code duplicated, block: B:255:0x074d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0765  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:260:0x0779  */
    /* JADX WARN: Code duplicated, block: B:261:0x0784  */
    /* JADX WARN: Code duplicated, block: B:263:0x0790  */
    /* JADX WARN: Code duplicated, block: B:265:0x0798  */
    /* JADX WARN: Code duplicated, block: B:267:0x079c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:268:0x079e  */
    /* JADX WARN: Code duplicated, block: B:269:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:271:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:273:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:275:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:277:0x07c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:280:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:291:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:292:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:294:0x0809  */
    /* JADX WARN: Code duplicated, block: B:295:0x082b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0833  */
    /* JADX WARN: Code duplicated, block: B:298:0x0841  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x0849  */
    /* JADX WARN: Code duplicated, block: B:302:0x0851 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x0853  */
    /* JADX WARN: Code duplicated, block: B:304:0x0859  */
    /* JADX WARN: Code duplicated, block: B:307:0x0868  */
    /* JADX WARN: Code duplicated, block: B:309:0x0870  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0878 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x0898  */
    /* JADX WARN: Code duplicated, block: B:321:0x08a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:322:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:323:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:325:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:328:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:330:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:332:0x08cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:336:0x08db  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:345:0x08fa A[PHI: r3 r4 r5 r6 r10 r11 r37 r39
      0x08fa: PHI (r3v74 int) = (r3v69 int), (r3v71 int), (r3v72 int), (r3v73 int), (r3v76 int) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r4v62 com.google.android.gms.internal.auth.zzdt) = 
      (r4v57 com.google.android.gms.internal.auth.zzdt)
      (r4v59 com.google.android.gms.internal.auth.zzdt)
      (r4v60 com.google.android.gms.internal.auth.zzdt)
      (r4v61 com.google.android.gms.internal.auth.zzdt)
      (r4v64 com.google.android.gms.internal.auth.zzdt)
     binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r5v96 int) = (r5v91 int), (r5v93 int), (r5v94 int), (r5v95 int), (r5v98 int) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r6v72 int) = (r6v66 int), (r6v69 int), (r6v70 int), (r6v71 int), (r6v74 int) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r10v31 boolean) = (r10v27 boolean), (r10v28 boolean), (r10v29 boolean), (r10v30 boolean), (r10v33 boolean) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r11v62 int) = (r11v58 int), (r11v59 int), (r11v60 int), (r11v61 int), (r11v64 int) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r37v17 sun.misc.Unsafe) = 
      (r37v13 sun.misc.Unsafe)
      (r37v14 sun.misc.Unsafe)
      (r37v15 sun.misc.Unsafe)
      (r37v16 sun.misc.Unsafe)
      (r37v19 sun.misc.Unsafe)
     binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]
      0x08fa: PHI (r39v11 int) = (r39v7 int), (r39v8 int), (r39v9 int), (r39v10 int), (r39v13 int) binds: [B:407:0x0a13, B:398:0x09de, B:383:0x0991, B:359:0x0933, B:297:0x083f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:346:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:348:0x090d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0918  */
    /* JADX WARN: Code duplicated, block: B:352:0x0922  */
    /* JADX WARN: Code duplicated, block: B:353:0x0924  */
    /* JADX WARN: Code duplicated, block: B:359:0x0933 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:360:0x0935  */
    /* JADX WARN: Code duplicated, block: B:362:0x0941  */
    /* JADX WARN: Code duplicated, block: B:363:0x0943  */
    /* JADX WARN: Code duplicated, block: B:366:0x094a  */
    /* JADX WARN: Code duplicated, block: B:368:0x0952  */
    /* JADX WARN: Code duplicated, block: B:370:0x095c  */
    /* JADX WARN: Code duplicated, block: B:371:0x095e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0964  */
    /* JADX WARN: Code duplicated, block: B:375:0x0972  */
    /* JADX WARN: Code duplicated, block: B:377:0x097d A[LOOP:14: B:376:0x097b->B:377:0x097d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x0990  */
    /* JADX WARN: Code duplicated, block: B:384:0x0993  */
    /* JADX WARN: Code duplicated, block: B:386:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:388:0x09a8 A[LOOP:15: B:385:0x099e->B:388:0x09a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:389:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:391:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:393:0x09cb A[LOOP:16: B:392:0x09c9->B:393:0x09cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:398:0x09de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:399:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:401:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:403:0x09f5 A[LOOP:17: B:400:0x09eb->B:403:0x09f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:404:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:406:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0a13 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:409:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:411:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:413:0x0a42 A[LOOP:18: B:412:0x0a40->B:413:0x0a42, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x0a55 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:419:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:421:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:423:0x0a6c A[LOOP:19: B:420:0x0a62->B:423:0x0a6c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:424:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:426:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:428:0x0a8f A[LOOP:20: B:427:0x0a8d->B:428:0x0a8f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:433:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:435:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:437:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:439:0x0ac2 A[LOOP:21: B:436:0x0ab8->B:439:0x0ac2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:441:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:443:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:445:0x0aeb A[LOOP:22: B:444:0x0ae9->B:445:0x0aeb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:450:0x0b01 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:451:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:453:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:455:0x0b1c A[LOOP:23: B:452:0x0b12->B:455:0x0b1c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:456:0x0b2a A[PHI: r6 r8 r10 r11 r12 r14 r37 r39
      0x0b2a: PHI (r6v95 int) = (r6v62 int), (r6v64 int), (r6v65 int), (r6v72 int), (r6v91 int), (r6v100 int) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r8v78 int) = (r8v49 int), (r8v51 int), (r8v52 int), (r8v67 int), (r8v77 int), (r8v81 int) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r10v42 boolean) = (r10v23 boolean), (r10v25 boolean), (r10v26 boolean), (r10v31 boolean), (r10v40 boolean), (r10v48 boolean) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r11v68 int) = (r11v54 int), (r11v56 int), (r11v57 int), (r11v62 int), (r11v67 int), (r11v72 int) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r12v75 com.google.android.gms.internal.auth.zzdt) = 
      (r12v35 com.google.android.gms.internal.auth.zzdt)
      (r12v37 com.google.android.gms.internal.auth.zzdt)
      (r12v38 com.google.android.gms.internal.auth.zzdt)
      (r12v40 com.google.android.gms.internal.auth.zzdt)
      (r10v22 com.google.android.gms.internal.auth.zzdt)
      (r12v80 com.google.android.gms.internal.auth.zzdt)
     binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r14v80 int) = (r14v59 int), (r14v61 int), (r14v62 int), (r14v64 int), (r14v75 int), (r14v87 int) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r37v29 sun.misc.Unsafe) = 
      (r37v9 sun.misc.Unsafe)
      (r37v11 sun.misc.Unsafe)
      (r37v12 sun.misc.Unsafe)
      (r37v17 sun.misc.Unsafe)
      (r37v24 sun.misc.Unsafe)
      (r37v33 sun.misc.Unsafe)
     binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x0b2a: PHI (r39v24 int) = (r39v3 int), (r39v5 int), (r39v6 int), (r39v11 int), (r39v20 int), (r39v28 int) binds: [B:450:0x0b01, B:434:0x0aa7, B:418:0x0a55, B:345:0x08fa, B:216:0x0661, B:198:0x05f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:459:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:461:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:463:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:468:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:471:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:473:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:475:0x0ba1 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:477:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:479:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:482:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:484:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:489:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:490:0x0c19  */
    /* JADX WARN: Code duplicated, block: B:492:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:498:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:499:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:501:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:502:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:504:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:505:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:506:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ca5  */
    /* JADX WARN: Code duplicated, block: B:510:0x0cad  */
    /* JADX WARN: Code duplicated, block: B:511:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:520:0x0cd4  */
    /* JADX WARN: Code duplicated, block: B:522:0x0ce0  */
    /* JADX WARN: Code duplicated, block: B:524:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:525:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:528:0x0cfb  */
    /* JADX WARN: Code duplicated, block: B:530:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:531:0x0d19  */
    /* JADX WARN: Code duplicated, block: B:533:0x0d26  */
    /* JADX WARN: Code duplicated, block: B:534:0x0d38  */
    /* JADX WARN: Code duplicated, block: B:536:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:537:0x0d57  */
    /* JADX WARN: Code duplicated, block: B:539:0x0d64  */
    /* JADX WARN: Code duplicated, block: B:540:0x0d79  */
    /* JADX WARN: Code duplicated, block: B:542:0x0d87  */
    /* JADX WARN: Code duplicated, block: B:544:0x0d9d  */
    /* JADX WARN: Code duplicated, block: B:546:0x0dab  */
    /* JADX WARN: Code duplicated, block: B:547:0x0dc0 A[PHI: r3 r4 r5 r6 r11 r17 r19
      0x0dc0: PHI (r3v124 int) = 
      (r3v97 int)
      (r3v99 int)
      (r3v100 int)
      (r3v101 int)
      (r3v102 int)
      (r3v103 int)
      (r3v105 int)
      (r3v106 int)
      (r6v106 int)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r4v103 int) = (r4v88 int), (r4v90 int), (r4v91 int), (r4v92 int), (r4v93 int), (r4v94 int), (r4v96 int), (r4v97 int), (r4v104 int) binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r5v119 com.google.android.gms.internal.auth.zzdt) = 
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v112 com.google.android.gms.internal.auth.zzdt)
      (r5v120 com.google.android.gms.internal.auth.zzdt)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r6v122 int) = 
      (r6v107 int)
      (r6v109 int)
      (r6v110 int)
      (r6v111 int)
      (r6v112 int)
      (r6v113 int)
      (r6v115 int)
      (r6v116 int)
      (r6v123 int)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r11v96 int) = 
      (r11v74 int)
      (r11v76 int)
      (r11v77 int)
      (r11v78 int)
      (r11v79 int)
      (r11v80 int)
      (r11v82 int)
      (r11v83 int)
      (r11v97 int)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r17v53 int) = 
      (r17v34 int)
      (r17v36 int)
      (r17v37 int)
      (r17v38 int)
      (r17v39 int)
      (r17v40 int)
      (r17v42 int)
      (r17v43 int)
      (r17v54 int)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]
      0x0dc0: PHI (r19v32 int) = 
      (r19v16 int)
      (r19v18 int)
      (r19v19 int)
      (r19v20 int)
      (r19v21 int)
      (r19v22 int)
      (r19v24 int)
      (r19v25 int)
      (r19v33 int)
     binds: [B:545:0x0da9, B:541:0x0d85, B:538:0x0d62, B:535:0x0d43, B:532:0x0d24, B:529:0x0d06, B:521:0x0cde, B:507:0x0ca3, B:476:0x0ba9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:584:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x062d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x068d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x07eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0893 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x08eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x08e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x098b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x09d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0a50 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0aa1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0afc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0b63 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0dc3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x048a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0ddd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0b61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0747 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x07e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x087e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x087a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x08cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x0b2b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x0ad0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0ad0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x02c9 A[EDGE_INSN: B:746:0x02c9->B:94:0x02c9 BREAK  A[LOOP:26: B:90:0x02b4->B:93:0x02be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0268  */
    /* JADX WARN: Code duplicated, block: B:77:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0272  */
    /* JADX WARN: Code duplicated, block: B:79:0x027c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0287  */
    /* JADX WARN: Code duplicated, block: B:83:0x028e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296 A[LOOP:24: B:82:0x028c->B:85:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02be A[LOOP:26: B:90:0x02b4->B:93:0x02be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d3  */
    final int zzb(Object obj, byte[] bArr, int i13, int i14, int i15, zzdt zzdtVar) throws IOException {
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int iZzm;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iZzg;
        int i33;
        int[] iArr;
        int i34;
        int iZzn;
        long j13;
        int i35;
        int i36;
        int i37;
        int i38;
        Unsafe unsafe2;
        int i39;
        int i43;
        zzdt zzdtVar2;
        boolean z13;
        int i44;
        int i45;
        boolean z14;
        int iZzh;
        int i46;
        boolean z15;
        int i47;
        int i48;
        int iZzk;
        int i49;
        boolean z16;
        int i53;
        int i54;
        int i55;
        int i56;
        int length;
        int i57;
        char[] cArr;
        int i58;
        int i59;
        byte b13;
        boolean z17;
        int i63;
        byte b14;
        byte b15;
        int i64;
        int i65;
        boolean z18;
        boolean z19;
        int i66;
        int i67;
        int i68;
        int i69;
        zzdt zzdtVar3;
        Unsafe unsafe3;
        int i73;
        int i74;
        int i75;
        zzez zzezVarZzd;
        int i76;
        zzdt zzdtVar4;
        long j14;
        Unsafe unsafe4;
        zzez zzezVarZzd2;
        zzez zzezVar;
        int i77;
        int i78;
        int i79;
        int i83;
        boolean z23;
        zzek zzekVar;
        int i84;
        int iZzh2;
        zzek zzekVar2;
        int i85;
        zzer zzerVar;
        int iZzh3;
        zzer zzerVar2;
        int i86;
        zzfm zzfmVar;
        int iZzh4;
        zzfm zzfmVar2;
        int i87;
        int i88;
        zzdt zzdtVar5;
        int i89;
        zzfm zzfmVar3;
        int iZzh5;
        zzfm zzfmVar4;
        int i93;
        zzew zzewVar;
        int iZzh6;
        zzew zzewVar2;
        int i94;
        zzdv zzdvVar;
        boolean z24;
        int iZzh7;
        boolean z25;
        zzdv zzdvVar2;
        int i95;
        boolean z26;
        int i96;
        int i97;
        int iZzh8;
        int i98;
        int i99;
        int i100;
        Object obj2;
        int iZzh9;
        int i101;
        int i102;
        int i103;
        int iZzh10;
        int i104;
        int iZzh11;
        int i105;
        int i106;
        int iZzj;
        zzey zzeyVarZzq;
        zzgz zzgzVar;
        int i107;
        int i108;
        int i109;
        boolean z27;
        Iterator it;
        Object objZzc;
        int iIntValue;
        int size;
        Object objZzc2;
        int i110;
        int i111;
        Integer num;
        int iIntValue2;
        int i112;
        int i113;
        int i114;
        char c13;
        zzew zzewVar3;
        int iZzh12;
        zzew zzewVar4;
        int i115;
        zzfm zzfmVar5;
        int iZzh13;
        zzfm zzfmVar6;
        int i116;
        zzgi zzgiVarZzr;
        int i117;
        int iZzh14;
        zzdt zzdtVar6;
        Unsafe unsafe5;
        Object object;
        Unsafe unsafe6;
        long j15;
        int i118;
        int i119;
        int iZzk2;
        boolean z28;
        int iZzh15;
        int i120;
        int i121;
        int i122;
        zzey zzeyVarZzq2;
        zzga<T> zzgaVar = this;
        Object obj3 = obj;
        i14 = i14;
        zzdt zzdtVar7 = zzdtVar;
        int i123 = 3;
        zzw(obj);
        Unsafe unsafe7 = zzb;
        int i124 = 0;
        int i125 = -1;
        int i126 = 1048575;
        int iZzl = i13;
        int i127 = 1048575;
        int i128 = -1;
        int i129 = 0;
        int i130 = 0;
        int i131 = 0;
        while (true) {
            if (iZzl < i14) {
                int iZzi = iZzl + 1;
                int i132 = bArr[iZzl];
                if (i132 < 0) {
                    iZzi = zzdu.zzi(i132, bArr, iZzi, zzdtVar7);
                    i132 = zzdtVar7.zza;
                }
                i131 = i132;
                int i133 = (i131 == true ? 1 : 0) >>> 3;
                if (i133 > i128) {
                    iZzm = (i133 < zzgaVar.zze || i133 > zzgaVar.zzf) ? i125 : zzgaVar.zzm(i133, i129 / i123);
                } else {
                    if (i133 < zzgaVar.zze || i133 > zzgaVar.zzf) {
                        i129 = i125;
                    } else {
                        iZzm = zzgaVar.zzm(i133, i124);
                    }
                    if (i129 == i125) {
                        i33 = (i131 == true ? 1 : 0) & 7;
                        iArr = zzgaVar.zzc;
                        i34 = iArr[i129 + 1];
                        iZzn = zzn(i34);
                        j13 = i34 & i126;
                        if (iZzn <= 17) {
                            int i134 = iArr[i129 + 2];
                            i35 = 1 << (i134 >>> 20);
                            i36 = 1048575;
                            i37 = i134 & 1048575;
                            if (i37 != i127) {
                                if (i127 != 1048575) {
                                    unsafe7.putInt(obj3, i127, i130);
                                    i36 = 1048575;
                                }
                                if (i37 == i36) {
                                    i68 = 0;
                                } else {
                                    i68 = unsafe7.getInt(obj3, i37);
                                }
                                i127 = i37;
                                i38 = i68;
                            } else {
                                i38 = i130;
                                i127 = i127;
                            }
                            switch (iZzn) {
                                case 0:
                                    unsafe2 = unsafe7;
                                    iZzi = iZzi;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    z13 = true;
                                    i26 = -1;
                                    i27 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 1) {
                                        zzhj.zzl(obj3, j13, Double.longBitsToDouble(zzdu.zzn(bArr, iZzi)));
                                        i44 = iZzi + 8;
                                        i128 = i39;
                                        i131 = i43;
                                        i125 = i26;
                                        i124 = i27;
                                        i123 = 3;
                                        i126 = 1048575;
                                        i14 = i14;
                                        zzdt zzdtVar8 = zzdtVar2;
                                        iZzl = i44;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i38 | i35;
                                        zzdtVar7 = zzdtVar8;
                                    } else {
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 1:
                                    unsafe2 = unsafe7;
                                    iZzi = iZzi;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    z13 = true;
                                    i26 = -1;
                                    i27 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 5) {
                                        zzhj.zzm(obj3, j13, Float.intBitsToFloat(zzdu.zzb(bArr, iZzi)));
                                        i44 = iZzi + 4;
                                        i128 = i39;
                                        i131 = i43;
                                        i125 = i26;
                                        i124 = i27;
                                        i123 = 3;
                                        i126 = 1048575;
                                        i14 = i14;
                                        zzdt zzdtVar9 = zzdtVar2;
                                        iZzl = i44;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i38 | i35;
                                        zzdtVar7 = zzdtVar9;
                                    } else {
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    unsafe2 = unsafe7;
                                    iZzi = iZzi;
                                    i43 = i131 == true ? 1 : 0;
                                    i26 = -1;
                                    i27 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        int iZzk3 = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                        unsafe2.putLong(obj, j13, zzdtVar2.zzb);
                                        i45 = i38 | i35;
                                        zzdtVar7 = zzdtVar2;
                                        iZzl = iZzk3;
                                        i131 = i43 == true ? 1 : 0;
                                        i128 = i133;
                                        i125 = -1;
                                        i124 = 0;
                                        i123 = 3;
                                        i126 = 1048575;
                                        int i135 = i127;
                                        i130 = i45;
                                        unsafe7 = unsafe2;
                                        i127 = i135;
                                    } else {
                                        i39 = i133;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    unsafe2 = unsafe7;
                                    iZzi = iZzi;
                                    i43 = i131 == true ? 1 : 0;
                                    z14 = true;
                                    i26 = -1;
                                    i27 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        iZzh = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                        unsafe2.putInt(obj3, j13, zzdtVar2.zza);
                                        i46 = i38 | i35;
                                        i131 = i43 == true ? 1 : 0;
                                        i128 = i133;
                                        zzdtVar7 = zzdtVar2;
                                        i125 = -1;
                                        i124 = 0;
                                        i126 = 1048575;
                                        z19 = z14;
                                        iZzl = iZzh;
                                        unsafe7 = unsafe2;
                                        i130 = i46;
                                        i123 = 3;
                                    } else {
                                        i39 = i133;
                                        z15 = z14;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    unsafe2 = unsafe7;
                                    z15 = true;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 1) {
                                        unsafe2.putLong(obj, j13, zzdu.zzn(bArr, iZzi));
                                        i14 = i14;
                                        zzdtVar7 = zzdtVar2;
                                        i124 = 0;
                                        i123 = 3;
                                        i126 = 1048575;
                                        iZzl = iZzi + 8;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i38 | i35;
                                        i128 = i133;
                                        i125 = -1;
                                    } else {
                                        iZzi = iZzi;
                                        i27 = 0;
                                        i39 = i133;
                                        i43 = i131 == true ? 1 : 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    unsafe2 = unsafe7;
                                    i47 = i133;
                                    i48 = 3;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 5) {
                                        unsafe2.putInt(obj3, j13, zzdu.zzb(bArr, iZzi));
                                        iZzk = iZzi + 4;
                                        i49 = i38 | i35;
                                        i123 = i48;
                                        i128 = i47;
                                        zzdtVar7 = zzdtVar2;
                                        i125 = i26;
                                        i126 = 1048575;
                                        i124 = 0;
                                        i14 = i14;
                                        iZzl = iZzk;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i49;
                                    } else {
                                        i39 = i47;
                                        i43 = i131 == true ? 1 : 0;
                                        i27 = 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 7:
                                    unsafe2 = unsafe7;
                                    i47 = i133;
                                    i48 = 3;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        iZzk = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                        if (zzdtVar2.zzb != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        zzhj.zzk(obj3, j13, z16);
                                        i49 = i38 | i35;
                                        i123 = i48;
                                        i128 = i47;
                                        zzdtVar7 = zzdtVar2;
                                        i125 = i26;
                                        i126 = 1048575;
                                        i124 = 0;
                                        i14 = i14;
                                        iZzl = iZzk;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i49;
                                    } else {
                                        i27 = 0;
                                        iZzi = iZzi;
                                        i39 = i47;
                                        i43 = i131 == true ? 1 : 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 8:
                                    unsafe2 = unsafe7;
                                    i43 = i131 == true ? 1 : 0;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 2) {
                                        if ((i34 & 536870912) != 0) {
                                            iZzk = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                            i56 = zzdtVar2.zza;
                                            if (i56 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i56 == 0) {
                                                zzdtVar2.zzc = "";
                                                i131 = i43 == true ? 1 : 0;
                                                i53 = 0;
                                                i54 = 3;
                                            } else {
                                                int i136 = zzhn.zza;
                                                length = bArr.length;
                                                if ((((length - iZzk) - i56) | iZzk | i56) >= 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzk), Integer.valueOf(i56)));
                                                }
                                                i57 = iZzk + i56;
                                                cArr = new char[i56];
                                                i58 = 0;
                                                while (iZzk < i57) {
                                                    b15 = bArr[iZzk];
                                                    if (zzhk.zzd(b15)) {
                                                        iZzk++;
                                                        cArr[i58] = (char) b15;
                                                        i58++;
                                                    } else {
                                                        while (iZzk < i57) {
                                                            i59 = iZzk + 1;
                                                            b13 = bArr[iZzk];
                                                            if (zzhk.zzd(b13)) {
                                                                cArr[i58] = (char) b13;
                                                                i58++;
                                                                iZzk = i59;
                                                                while (iZzk < i57) {
                                                                    b14 = bArr[iZzk];
                                                                    if (zzhk.zzd(b14)) {
                                                                    }
                                                                    iZzk++;
                                                                    cArr[i58] = (char) b14;
                                                                    i58++;
                                                                }
                                                            } else {
                                                                z17 = i43 == true ? 1 : 0;
                                                                if (b13 < -32) {
                                                                    if (i59 < i57) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    iZzk += 2;
                                                                    i63 = i58 + 1;
                                                                    zzhk.zzc(b13, bArr[i59], cArr, i58);
                                                                } else if (b13 < -16) {
                                                                    if (i59 < i57 - 1) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    int i137 = iZzk + 2;
                                                                    iZzk += 3;
                                                                    i63 = i58 + 1;
                                                                    zzhk.zzb(b13, bArr[i59], bArr[i137], cArr, i58);
                                                                } else {
                                                                    if (i59 < i57 - 2) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    byte b16 = bArr[i59];
                                                                    int i138 = iZzk + 3;
                                                                    byte b17 = bArr[iZzk + 2];
                                                                    iZzk += 4;
                                                                    zzhk.zza(b13, b16, b17, bArr[i138], cArr, i58);
                                                                    i58 += 2;
                                                                    i43 = z17 ? 1 : 0;
                                                                }
                                                                i43 = z17 ? 1 : 0;
                                                                i58 = i63;
                                                            }
                                                            break;
                                                        }
                                                        i131 = i43 == true ? 1 : 0;
                                                        i54 = 3;
                                                        i53 = 0;
                                                        zzdtVar2.zzc = new String(cArr, 0, i58);
                                                        iZzk = i57;
                                                    }
                                                }
                                                while (iZzk < i57) {
                                                    i59 = iZzk + 1;
                                                    b13 = bArr[iZzk];
                                                    if (zzhk.zzd(b13)) {
                                                        cArr[i58] = (char) b13;
                                                        i58++;
                                                        iZzk = i59;
                                                        while (iZzk < i57) {
                                                            b14 = bArr[iZzk];
                                                            if (zzhk.zzd(b14)) {
                                                            }
                                                            iZzk++;
                                                            cArr[i58] = (char) b14;
                                                            i58++;
                                                        }
                                                    } else {
                                                        z17 = i43 == true ? 1 : 0;
                                                        if (b13 < -32) {
                                                            if (i59 < i57) {
                                                                throw zzfb.zzb();
                                                            }
                                                            iZzk += 2;
                                                            i63 = i58 + 1;
                                                            zzhk.zzc(b13, bArr[i59], cArr, i58);
                                                        } else if (b13 < -16) {
                                                            if (i59 < i57 - 1) {
                                                                throw zzfb.zzb();
                                                            }
                                                            int i139 = iZzk + 2;
                                                            iZzk += 3;
                                                            i63 = i58 + 1;
                                                            zzhk.zzb(b13, bArr[i59], bArr[i139], cArr, i58);
                                                        } else {
                                                            if (i59 < i57 - 2) {
                                                                throw zzfb.zzb();
                                                            }
                                                            byte b18 = bArr[i59];
                                                            int i1310 = iZzk + 3;
                                                            byte b19 = bArr[iZzk + 2];
                                                            iZzk += 4;
                                                            zzhk.zza(b13, b18, b19, bArr[i1310], cArr, i58);
                                                            i58 += 2;
                                                            i43 = z17 ? 1 : 0;
                                                        }
                                                        i43 = z17 ? 1 : 0;
                                                        i58 = i63;
                                                    }
                                                    break;
                                                }
                                                i131 = i43 == true ? 1 : 0;
                                                i54 = 3;
                                                i53 = 0;
                                                zzdtVar2.zzc = new String(cArr, 0, i58);
                                                iZzk = i57;
                                            }
                                        } else {
                                            i131 = i43 == true ? 1 : 0;
                                            i53 = 0;
                                            i54 = 3;
                                            iZzk = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                            i55 = zzdtVar2.zza;
                                            if (i55 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i55 == 0) {
                                                zzdtVar2.zzc = "";
                                            } else {
                                                zzdtVar2.zzc = new String(bArr, iZzk, i55, zzfa.zzb);
                                                iZzk += i55;
                                            }
                                        }
                                        unsafe2.putObject(obj3, j13, zzdtVar2.zzc);
                                        i49 = i38 | i35;
                                        i124 = i53;
                                        i123 = i54;
                                        i128 = i133;
                                        zzdtVar7 = zzdtVar2;
                                        i125 = -1;
                                        i126 = 1048575;
                                        i14 = i14;
                                        iZzl = iZzk;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i49;
                                    } else {
                                        i39 = i133;
                                        i27 = 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 9:
                                    unsafe2 = unsafe7;
                                    i64 = i133;
                                    i65 = i131 == true ? 1 : 0;
                                    z18 = true;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 2) {
                                        Object objZzt = zzgaVar.zzt(obj3, i129);
                                        i14 = i14;
                                        int iZzm2 = zzdu.zzm(objZzt, zzgaVar.zzr(i129), bArr, iZzi, i14, zzdtVar);
                                        zzgaVar.zzB(obj3, i129, objZzt);
                                        zzdtVar7 = zzdtVar2;
                                        i128 = i64;
                                        i131 = i65 == true ? 1 : 0;
                                        i125 = -1;
                                        i123 = 3;
                                        i124 = 0;
                                        iZzl = iZzm2;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i38 | i35;
                                        i126 = 1048575;
                                    } else {
                                        iZzi = iZzi;
                                        i39 = i64;
                                        i43 = i65;
                                        i27 = 0;
                                        z15 = z18;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 10:
                                    unsafe2 = unsafe7;
                                    i64 = i133;
                                    i65 = i131 == true ? 1 : 0;
                                    z18 = true;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 2) {
                                        int iZza = zzdu.zza(bArr, iZzi, zzdtVar2);
                                        unsafe2.putObject(obj3, j13, zzdtVar2.zzc);
                                        i128 = i64;
                                        i131 = i65 == true ? 1 : 0;
                                        zzdtVar7 = zzdtVar2;
                                        unsafe7 = unsafe2;
                                        i125 = -1;
                                        i126 = 1048575;
                                        i124 = 0;
                                        iZzl = iZza;
                                        i130 = i38 | i35;
                                        i123 = 3;
                                    } else {
                                        iZzi = iZzi;
                                        i39 = i64;
                                        i43 = i65;
                                        i27 = 0;
                                        z15 = z18;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 12:
                                    unsafe2 = unsafe7;
                                    i64 = i133;
                                    i65 = i131 == true ? 1 : 0;
                                    z18 = true;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        iZzh = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                        i66 = zzdtVar2.zza;
                                        zzey zzeyVarZzq3 = zzgaVar.zzq(i129);
                                        if ((Integer.MIN_VALUE & i34) != 0 || zzeyVarZzq3 == null || zzeyVarZzq3.zza()) {
                                            unsafe2.putInt(obj3, j13, i66);
                                            i46 = i38 | i35;
                                            i128 = i64;
                                            i131 = i65 == true ? 1 : 0;
                                            zzdtVar7 = zzdtVar2;
                                            i125 = -1;
                                            i126 = 1048575;
                                            i124 = 0;
                                            z19 = z18;
                                            iZzl = iZzh;
                                            unsafe7 = unsafe2;
                                            i130 = i46;
                                            i123 = 3;
                                        } else {
                                            zzc(obj).zzh(i65 == true ? 1 : 0, Long.valueOf(i66));
                                            i128 = i64;
                                            i131 = i65 == true ? 1 : 0;
                                            zzdtVar7 = zzdtVar2;
                                            i125 = -1;
                                            i123 = 3;
                                            i126 = 1048575;
                                            i124 = 0;
                                            i14 = i14;
                                            iZzl = iZzh;
                                            unsafe7 = unsafe2;
                                            i127 = i127;
                                            i130 = i38;
                                        }
                                    } else {
                                        iZzi = iZzi;
                                        i39 = i64;
                                        i43 = i65;
                                        i27 = 0;
                                        z15 = z18;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 15:
                                    unsafe2 = unsafe7;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        int iZzh16 = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                        unsafe2.putInt(obj3, j13, zzej.zzb(zzdtVar2.zza));
                                        i128 = i133;
                                        i131 = i131 == true ? 1 : 0;
                                        zzdtVar7 = zzdtVar2;
                                        i125 = -1;
                                        i123 = 3;
                                        i126 = 1048575;
                                        i14 = i14;
                                        iZzl = iZzh16;
                                        unsafe7 = unsafe2;
                                        i127 = i127;
                                        i130 = i38 | i35;
                                        i124 = 0;
                                    } else {
                                        i27 = 0;
                                        iZzi = iZzi;
                                        i39 = i133;
                                        i43 = i131 == true ? 1 : 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                case 16:
                                    i67 = i129;
                                    i26 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i33 == 0) {
                                        int iZzk4 = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                        unsafe2 = unsafe7;
                                        i129 = i67;
                                        unsafe7.putLong(obj, j13, zzej.zzc(zzdtVar2.zzb));
                                        i45 = i38 | i35;
                                        zzdtVar7 = zzdtVar2;
                                        iZzl = iZzk4;
                                        i128 = i133;
                                        i125 = -1;
                                        i123 = 3;
                                        i126 = 1048575;
                                        i124 = 0;
                                        int i1311 = i127;
                                        i130 = i45;
                                        unsafe7 = unsafe2;
                                        i127 = i1311;
                                    } else {
                                        unsafe2 = unsafe7;
                                        i129 = i67;
                                        iZzi = iZzi;
                                        i39 = i133;
                                        i43 = i131 == true ? 1 : 0;
                                        i27 = 0;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                                default:
                                    i123 = 3;
                                    if (i33 == 3) {
                                        Object objZzt2 = zzgaVar.zzt(obj3, i129);
                                        int i140 = i129;
                                        iZzl = zzdu.zzl(objZzt2, zzgaVar.zzr(i129), bArr, iZzi, i14, (i133 << 3) | 4, zzdtVar);
                                        zzgaVar.zzB(obj3, i140, objZzt2);
                                        i126 = 1048575;
                                        i128 = i133;
                                        i129 = i140;
                                        i127 = i127;
                                        i125 = -1;
                                        i124 = 0;
                                        i14 = i14;
                                        zzdtVar7 = zzdtVar;
                                        i130 = i38 | i35;
                                    } else {
                                        i26 = -1;
                                        unsafe2 = unsafe7;
                                        iZzi = iZzi;
                                        i39 = i133;
                                        i43 = i131 == true ? 1 : 0;
                                        i27 = 0;
                                        zzdtVar2 = zzdtVar;
                                        i28 = i15;
                                        i23 = i43;
                                        unsafe = unsafe2;
                                        i25 = i127;
                                        i130 = i38;
                                        i24 = 3;
                                        i29 = i39;
                                        iZzi = iZzi;
                                    }
                                    break;
                            }
                        } else {
                            i26 = -1;
                            i27 = 0;
                            i69 = i133;
                            zzdtVar3 = zzdtVar7;
                            unsafe3 = unsafe7;
                            i73 = iZzi;
                            if (iZzn == 27) {
                                i25 = i127;
                                i76 = i129;
                                zzdtVar4 = zzdtVar3;
                                if (iZzn <= 49) {
                                    j14 = i34;
                                    unsafe4 = zzb;
                                    zzezVarZzd2 = (zzez) unsafe4.getObject(obj3, j13);
                                    if (zzezVarZzd2.zzc()) {
                                        int size2 = zzezVarZzd2.size();
                                        zzezVarZzd2 = zzezVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                        unsafe4.putObject(obj3, j13, zzezVarZzd2);
                                    }
                                    zzezVar = zzezVarZzd2;
                                    switch (iZzn) {
                                        case 18:
                                        case C4007z9.J /* 35 */:
                                            i77 = i131 == true ? 1 : 0;
                                            i78 = i76;
                                            zzdtVar4 = zzdtVar4;
                                            i79 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                zzekVar2 = (zzek) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                                i85 = zzdtVar4.zza + iZzg;
                                                while (iZzg < i85) {
                                                    zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzg)));
                                                    iZzg += 8;
                                                }
                                                if (iZzg != i85) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i33 == 1) {
                                                zzekVar = (zzek) zzezVar;
                                                zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i83)));
                                                i84 = i83 + 8;
                                                while (i84 < i79) {
                                                    iZzh2 = zzdu.zzh(bArr, i84, zzdtVar4);
                                                    if (i77 == zzdtVar4.zza) {
                                                        zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzh2)));
                                                        i84 = iZzh2 + 8;
                                                    } else {
                                                        iZzg = i84;
                                                    }
                                                }
                                                iZzg = i84;
                                            } else {
                                                iZzg = i83;
                                            }
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 19:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            i77 = i131 == true ? 1 : 0;
                                            i78 = i76;
                                            zzdtVar4 = zzdtVar4;
                                            i79 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                zzerVar2 = (zzer) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                                i86 = zzdtVar4.zza + iZzg;
                                                while (iZzg < i86) {
                                                    zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzg)));
                                                    iZzg += 4;
                                                }
                                                if (iZzg != i86) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i33 == 5) {
                                                zzerVar = (zzer) zzezVar;
                                                zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i83)));
                                                i84 = i83 + 4;
                                                while (i84 < i79) {
                                                    iZzh3 = zzdu.zzh(bArr, i84, zzdtVar4);
                                                    if (i77 == zzdtVar4.zza) {
                                                        zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzh3)));
                                                        i84 = iZzh3 + 4;
                                                    } else {
                                                        iZzg = i84;
                                                    }
                                                }
                                                iZzg = i84;
                                            } else {
                                                iZzg = i83;
                                            }
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 20:
                                        case 21:
                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        case C4007z9.K /* 38 */:
                                            i77 = i131 == true ? 1 : 0;
                                            i78 = i76;
                                            zzdtVar4 = zzdtVar4;
                                            i79 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                zzfmVar2 = (zzfm) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                                i87 = zzdtVar4.zza + iZzg;
                                                while (iZzg < i87) {
                                                    iZzg = zzdu.zzk(bArr, iZzg, zzdtVar4);
                                                    zzfmVar2.zze(zzdtVar4.zzb);
                                                }
                                                if (iZzg != i87) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i33 == 0) {
                                                zzfmVar = (zzfm) zzezVar;
                                                iZzg = zzdu.zzk(bArr, i83, zzdtVar4);
                                                zzfmVar.zze(zzdtVar4.zzb);
                                                while (iZzg < i79) {
                                                    iZzh4 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                    if (i77 == zzdtVar4.zza) {
                                                        iZzg = zzdu.zzk(bArr, iZzh4, zzdtVar4);
                                                        zzfmVar.zze(zzdtVar4.zzb);
                                                    }
                                                }
                                            } else {
                                                iZzg = i83;
                                            }
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 22:
                                        case C4007z9.I /* 29 */:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case 43:
                                            i77 = i131 == true ? 1 : 0;
                                            i88 = i76;
                                            zzdtVar5 = zzdtVar4;
                                            i89 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                iZzg = zzdu.zzf(bArr, i83, zzezVar, zzdtVar5);
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                            } else if (i33 == 0) {
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                iZzg = zzdu.zzj(i77 == true ? 1 : 0, bArr, i83, i14, zzezVar, zzdtVar);
                                                i77 = i77 == true ? 1 : 0;
                                            } else {
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                iZzg = i83;
                                            }
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i77 = i131 == true ? 1 : 0;
                                            i88 = i76;
                                            zzdtVar5 = zzdtVar4;
                                            i89 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                if (i33 == 1) {
                                                    zzfmVar3 = (zzfm) zzezVar;
                                                    zzfmVar3.zze(zzdu.zzn(bArr, i83));
                                                    iZzg = i83 + 8;
                                                    while (iZzg < i89) {
                                                        iZzh5 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                        if (i77 == zzdtVar5.zza) {
                                                            zzfmVar3.zze(zzdu.zzn(bArr, iZzh5));
                                                            iZzg = iZzh5 + 8;
                                                        }
                                                    }
                                                }
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                zzfmVar4 = (zzfm) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                i93 = zzdtVar5.zza + iZzg;
                                                while (iZzg < i93) {
                                                    zzfmVar4.zze(zzdu.zzn(bArr, iZzg));
                                                    iZzg += 8;
                                                }
                                                if (iZzg != i93) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 24:
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            i77 = i131 == true ? 1 : 0;
                                            i88 = i76;
                                            zzdtVar5 = zzdtVar4;
                                            i89 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                if (i33 == 5) {
                                                    zzewVar = (zzew) zzezVar;
                                                    zzewVar.zze(zzdu.zzb(bArr, i83));
                                                    iZzg = i83 + 4;
                                                    while (iZzg < i89) {
                                                        iZzh6 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                        if (i77 == zzdtVar5.zza) {
                                                            zzewVar.zze(zzdu.zzb(bArr, iZzh6));
                                                            iZzg = iZzh6 + 4;
                                                        }
                                                    }
                                                }
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                zzewVar2 = (zzew) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                i94 = zzdtVar5.zza + iZzg;
                                                while (iZzg < i94) {
                                                    zzewVar2.zze(zzdu.zzb(bArr, iZzg));
                                                    iZzg += 4;
                                                }
                                                if (iZzg != i94) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case C4007z9.F /* 25 */:
                                        case 42:
                                            i77 = i131 == true ? 1 : 0;
                                            i88 = i76;
                                            zzdtVar5 = zzdtVar4;
                                            i89 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                if (i33 == 0) {
                                                    zzdvVar = (zzdv) zzezVar;
                                                    iZzg = zzdu.zzk(bArr, i83, zzdtVar5);
                                                    if (zzdtVar5.zzb != 0) {
                                                        z24 = true;
                                                    } else {
                                                        z24 = false;
                                                    }
                                                    zzdvVar.zze(z24);
                                                    while (iZzg < i89) {
                                                        iZzh7 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                        if (i77 == zzdtVar5.zza) {
                                                            iZzg = zzdu.zzk(bArr, iZzh7, zzdtVar5);
                                                            if (zzdtVar5.zzb != 0) {
                                                                z25 = true;
                                                            } else {
                                                                z25 = false;
                                                            }
                                                            zzdvVar.zze(z25);
                                                        }
                                                    }
                                                }
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                zzdvVar2 = (zzdv) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                i95 = zzdtVar5.zza + iZzg;
                                                while (iZzg < i95) {
                                                    iZzg = zzdu.zzk(bArr, iZzg, zzdtVar5);
                                                    if (zzdtVar5.zzb != 0) {
                                                        z26 = true;
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    zzdvVar2.zze(z26);
                                                }
                                                if (iZzg != i95) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case C4007z9.G /* 26 */:
                                            i77 = i131 == true ? 1 : 0;
                                            i88 = i76;
                                            zzdtVar5 = zzdtVar4;
                                            i89 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            unsafe = unsafe3;
                                            z23 = true;
                                            if (i33 == 2) {
                                                if ((j14 & 536870912) == 0) {
                                                    iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                    i100 = zzdtVar5.zza;
                                                    if (i100 >= 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i100 == 0) {
                                                        obj2 = "";
                                                        zzezVar.add(obj2);
                                                    } else {
                                                        obj2 = r6;
                                                        zzezVar.add(new String(bArr, iZzg, i100, zzfa.zzb));
                                                        iZzg += i100;
                                                    }
                                                    while (iZzg < i89) {
                                                        iZzh9 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                        if (i77 == zzdtVar5.zza) {
                                                            iZzg = zzdu.zzh(bArr, iZzh9, zzdtVar5);
                                                            i101 = zzdtVar5.zza;
                                                            if (i101 >= 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i101 == 0) {
                                                                zzezVar.add(obj2);
                                                            } else {
                                                                zzezVar.add(new String(bArr, iZzg, i101, zzfa.zzb));
                                                                iZzg += i101;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                    i96 = zzdtVar5.zza;
                                                    if (i96 >= 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i96 == 0) {
                                                        zzezVar.add(r6);
                                                    } else {
                                                        i97 = iZzg + i96;
                                                        if (zzhn.zzc(bArr, iZzg, i97)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzezVar.add(new String(bArr, iZzg, i96, zzfa.zzb));
                                                        iZzg = i97;
                                                    }
                                                    while (iZzg < i89) {
                                                        iZzh8 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                        if (i77 == zzdtVar5.zza) {
                                                            iZzg = zzdu.zzh(bArr, iZzh8, zzdtVar5);
                                                            i98 = zzdtVar5.zza;
                                                            if (i98 >= 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i98 == 0) {
                                                                zzezVar.add(r6);
                                                            } else {
                                                                i99 = iZzg + i98;
                                                                if (zzhn.zzc(bArr, iZzg, i99)) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzezVar.add(new String(bArr, iZzg, i98, zzfa.zzb));
                                                                iZzg = i99;
                                                            }
                                                        }
                                                    }
                                                }
                                                i79 = i89;
                                                zzdtVar4 = zzdtVar5;
                                                i78 = i88;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 27:
                                            i77 = i131 == true ? 1 : 0;
                                            i102 = i73;
                                            unsafe = unsafe3;
                                            if (i33 == 2) {
                                                i69 = i69;
                                                int iZze = zzdu.zze(zzgaVar.zzr(i76), i77 == true ? 1 : 0, bArr, i102, i14, zzezVar, zzdtVar);
                                                i83 = i102;
                                                z23 = true;
                                                zzdtVar4 = zzdtVar4;
                                                i78 = i76;
                                                iZzg = iZze;
                                                i79 = i14;
                                            } else {
                                                i69 = i69;
                                                z23 = true;
                                                int i141 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i141;
                                                iZzg = i83;
                                            }
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 28:
                                            i103 = i131 == true ? 1 : 0;
                                            i102 = i73;
                                            unsafe = unsafe3;
                                            if (i33 == 2) {
                                                iZzh10 = zzdu.zzh(bArr, i102, zzdtVar4);
                                                i104 = zzdtVar4.zza;
                                                if (i104 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i104 <= bArr.length - iZzh10) {
                                                    throw zzfb.zzf();
                                                }
                                                if (i104 == 0) {
                                                    zzezVar.add(zzef.zzb);
                                                } else {
                                                    zzezVar.add(zzef.zzk(bArr, iZzh10, i104));
                                                    iZzh10 += i104;
                                                }
                                                while (true) {
                                                    if (iZzh10 < i14) {
                                                        iZzh11 = zzdu.zzh(bArr, iZzh10, zzdtVar4);
                                                        i77 = i103;
                                                        if (i77 == zzdtVar4.zza) {
                                                            iZzh10 = zzdu.zzh(bArr, iZzh11, zzdtVar4);
                                                            i105 = zzdtVar4.zza;
                                                            if (i105 >= 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i105 <= bArr.length - iZzh10) {
                                                                throw zzfb.zzf();
                                                            }
                                                            if (i105 == 0) {
                                                                zzezVar.add(zzef.zzb);
                                                            } else {
                                                                zzezVar.add(zzef.zzk(bArr, iZzh10, i105));
                                                                iZzh10 += i105;
                                                            }
                                                            i103 = i77 == true ? 1 : 0;
                                                        }
                                                    } else {
                                                        i77 = i103;
                                                    }
                                                }
                                                i69 = i69;
                                                zzdtVar4 = zzdtVar4;
                                                z23 = true;
                                                iZzg = iZzh10;
                                                int i142 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i142;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                i69 = i69;
                                                i77 = i103 == true ? 1 : 0;
                                                z23 = true;
                                                int i143 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i143;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            }
                                            break;
                                        case 30:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                            i106 = i131 == true ? 1 : 0;
                                            i102 = i73;
                                            unsafe = unsafe3;
                                            if (i33 == 2) {
                                                iZzj = zzdu.zzf(bArr, i102, zzezVar, zzdtVar4);
                                            } else if (i33 == 0) {
                                                i77 = i106 == true ? 1 : 0;
                                                z23 = true;
                                                int i144 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i144;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                iZzj = zzdu.zzj(i106 == true ? 1 : 0, bArr, i102, i14, zzezVar, zzdtVar);
                                            }
                                            zzeyVarZzq = zzgaVar.zzq(i76);
                                            zzgzVar = zzgaVar.zzl;
                                            int i145 = zzgk.zza;
                                            if (zzeyVarZzq != null) {
                                                i107 = iZzj;
                                                i108 = i106 == true ? 1 : 0;
                                                i109 = i69;
                                                z27 = true;
                                            } else if (zzezVar != null) {
                                                size = zzezVar.size();
                                                objZzc2 = null;
                                                i110 = 0;
                                                i111 = 0;
                                                while (i110 < size) {
                                                    num = (Integer) zzezVar.get(i110);
                                                    int i146 = iZzj;
                                                    iIntValue2 = num.intValue();
                                                    if (zzeyVarZzq.zza()) {
                                                        if (i110 != i111) {
                                                            zzezVar.set(i111, num);
                                                        }
                                                        i111++;
                                                        i113 = 1;
                                                        i112 = i69;
                                                    } else {
                                                        i112 = i69;
                                                        objZzc2 = zzgk.zzc(obj, i112, iIntValue2, objZzc2, zzgzVar);
                                                        i113 = 1;
                                                    }
                                                    i110 += i113;
                                                    iZzj = i146;
                                                    i69 = i112;
                                                    i106 = i106;
                                                }
                                                i107 = iZzj;
                                                i108 = i106;
                                                i109 = i69;
                                                z27 = true;
                                                if (i111 != size) {
                                                    zzezVar.subList(i111, size).clear();
                                                }
                                            } else {
                                                i107 = iZzj;
                                                i108 = i106 == true ? 1 : 0;
                                                i109 = i69;
                                                z27 = true;
                                                it = zzezVar.iterator();
                                                objZzc = null;
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    if (!zzeyVarZzq.zza()) {
                                                        objZzc = zzgk.zzc(obj, i109, iIntValue, objZzc, zzgzVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i69 = i109;
                                            i77 = i108;
                                            zzdtVar4 = zzdtVar4;
                                            z23 = z27;
                                            iZzg = i107;
                                            int i147 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i147;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case 33:
                                        case 47:
                                            i114 = i131 == true ? 1 : 0;
                                            i102 = i73;
                                            unsafe = unsafe3;
                                            c13 = 2;
                                            if (i33 == 2) {
                                                if (i33 == 0) {
                                                    zzewVar3 = (zzew) zzezVar;
                                                    iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                                    zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                    while (iZzg < i14) {
                                                        iZzh12 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                        if (i114 == zzdtVar4.zza) {
                                                            iZzg = zzdu.zzh(bArr, iZzh12, zzdtVar4);
                                                            zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                        }
                                                    }
                                                }
                                                i77 = i114;
                                                z23 = true;
                                                int i148 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i148;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                zzewVar4 = (zzew) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                                i115 = zzdtVar4.zza + iZzg;
                                                while (iZzg < i115) {
                                                    iZzg = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                    zzewVar4.zze(zzej.zzb(zzdtVar4.zza));
                                                }
                                                if (iZzg != i115) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i77 = i114;
                                            z23 = true;
                                            int i149 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i149;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 48:
                                            i114 = i131 == true ? 1 : 0;
                                            i102 = i73;
                                            unsafe = unsafe3;
                                            c13 = 2;
                                            if (i33 == 2) {
                                                if (i33 == 0) {
                                                    zzfmVar5 = (zzfm) zzezVar;
                                                    iZzg = zzdu.zzk(bArr, i102, zzdtVar4);
                                                    zzfmVar5.zze(zzej.zzc(zzdtVar4.zzb));
                                                    while (iZzg < i14) {
                                                        iZzh13 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                        if (i114 == zzdtVar4.zza) {
                                                            iZzg = zzdu.zzk(bArr, iZzh13, zzdtVar4);
                                                            zzfmVar5.zze(zzej.zzc(zzdtVar4.zzb));
                                                        }
                                                    }
                                                }
                                                i77 = i114;
                                                z23 = true;
                                                int i1410 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i1410;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                zzfmVar6 = (zzfm) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                                i116 = zzdtVar4.zza + iZzg;
                                                while (iZzg < i116) {
                                                    iZzg = zzdu.zzk(bArr, iZzg, zzdtVar4);
                                                    zzfmVar6.zze(zzej.zzc(zzdtVar4.zzb));
                                                }
                                                if (iZzg != i116) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i77 = i114;
                                            z23 = true;
                                            int i1411 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i1411;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                            break;
                                        default:
                                            if (i33 == 3) {
                                                zzgiVarZzr = zzgaVar.zzr(i76);
                                                i117 = ((i131 == true ? 1 : 0) & (-8)) | 4;
                                                unsafe = unsafe3;
                                                i102 = i73;
                                                iZzg = zzdu.zzc(zzgiVarZzr, bArr, i73, i14, i117, zzdtVar);
                                                zzezVar.add(zzdtVar4.zzc);
                                                while (iZzg < i14) {
                                                    iZzh14 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                    if (i131 == zzdtVar4.zza) {
                                                        i77 = i131 == true ? 1 : 0;
                                                        z23 = true;
                                                        int i1412 = i102;
                                                        i78 = i76;
                                                        i79 = i14;
                                                        i83 = i1412;
                                                        obj3 = obj;
                                                        if (iZzg != i83) {
                                                            iZzi = iZzg;
                                                            i23 = i77;
                                                            i129 = i78;
                                                            i29 = i69;
                                                            i24 = 3;
                                                            i28 = i15;
                                                        } else {
                                                            i131 = i77;
                                                            i14 = i79;
                                                            zzdtVar7 = zzdtVar4;
                                                            i129 = i78;
                                                            i125 = -1;
                                                            i124 = 0;
                                                            i127 = i25;
                                                            i128 = i69;
                                                            i123 = 3;
                                                            i126 = 1048575;
                                                        }
                                                        iZzl = iZzg;
                                                        unsafe7 = unsafe;
                                                    } else {
                                                        iZzg = zzdu.zzc(zzgiVarZzr, bArr, iZzh14, i14, i117, zzdtVar);
                                                        zzezVar.add(zzdtVar4.zzc);
                                                    }
                                                    break;
                                                }
                                                i77 = i131 == true ? 1 : 0;
                                                z23 = true;
                                                int i1413 = i102;
                                                i78 = i76;
                                                i79 = i14;
                                                i83 = i1413;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            } else {
                                                unsafe = unsafe3;
                                                i77 = i131 == true ? 1 : 0;
                                                i78 = i76;
                                                zzdtVar4 = zzdtVar4;
                                                i79 = i14;
                                                i69 = i69;
                                                i83 = i73;
                                                z23 = true;
                                                iZzg = i83;
                                                obj3 = obj;
                                                if (iZzg != i83) {
                                                    iZzi = iZzg;
                                                    i23 = i77;
                                                    i129 = i78;
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i28 = i15;
                                                } else {
                                                    i131 = i77;
                                                    i14 = i79;
                                                    zzdtVar7 = zzdtVar4;
                                                    i129 = i78;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    i128 = i69;
                                                    i123 = 3;
                                                    i126 = 1048575;
                                                }
                                                iZzl = iZzg;
                                                unsafe7 = unsafe;
                                            }
                                            break;
                                    }
                                } else {
                                    i74 = i73;
                                    unsafe = unsafe3;
                                    i75 = i76;
                                    i69 = i69;
                                    i23 = i131 == true ? 1 : 0;
                                    zzdtVar6 = zzdtVar4;
                                    if (iZzn == 50) {
                                        obj3 = obj;
                                        unsafe6 = zzb;
                                        j15 = iArr[i75 + 2] & 1048575;
                                        switch (iZzn) {
                                            case 51:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 1) {
                                                    unsafe6.putObject(obj3, j13, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr, i118))));
                                                    i119 = i118 + 8;
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = i119;
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 52:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 5) {
                                                    unsafe6.putObject(obj3, j13, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr, i118))));
                                                    i119 = i118 + 4;
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = i119;
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 0) {
                                                    iZzl = zzdu.zzk(bArr, i118, zzdtVar6);
                                                    unsafe6.putObject(obj3, j13, Long.valueOf(zzdtVar6.zzb));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 0) {
                                                    iZzl = zzdu.zzh(bArr, i118, zzdtVar6);
                                                    unsafe6.putObject(obj3, j13, Integer.valueOf(zzdtVar6.zza));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 56:
                                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 1) {
                                                    unsafe6.putObject(obj3, j13, Long.valueOf(zzdu.zzn(bArr, i118)));
                                                    iZzl = i118 + 8;
                                                    unsafe6.putInt(obj3, j15, i29);
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 57:
                                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 5) {
                                                    unsafe6.putObject(obj3, j13, Integer.valueOf(zzdu.zzb(bArr, i118)));
                                                    iZzk2 = i118 + 4;
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = iZzk2;
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 58:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 0) {
                                                    iZzk2 = zzdu.zzk(bArr, i118, zzdtVar6);
                                                    if (zzdtVar6.zzb != 0) {
                                                        z28 = true;
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    unsafe6.putObject(obj3, j13, Boolean.valueOf(z28));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = iZzk2;
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 59:
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                if (i33 == 2) {
                                                    iZzh15 = zzdu.zzh(bArr, i118, zzdtVar6);
                                                    i120 = zzdtVar6.zza;
                                                    if (i120 == 0) {
                                                        unsafe6.putObject(obj3, j13, "");
                                                    } else {
                                                        if ((i34 & 536870912) == 0 && !zzhn.zzc(bArr, iZzh15, iZzh15 + i120)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        unsafe6.putObject(obj3, j13, new String(bArr, iZzh15, i120, zzfa.zzb));
                                                        iZzh15 += i120;
                                                    }
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = iZzh15;
                                                } else {
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 60:
                                                i121 = i74;
                                                i29 = i69;
                                                if (i33 == 2) {
                                                    Object objZzu = zzgaVar.zzu(obj3, i29, i75);
                                                    zzgi zzgiVarZzr2 = zzgaVar.zzr(i75);
                                                    i24 = 3;
                                                    i118 = i121;
                                                    int iZzm3 = zzdu.zzm(objZzu, zzgiVarZzr2, bArr, i118, i14, zzdtVar);
                                                    zzgaVar.zzC(obj3, i29, i75, objZzu);
                                                    i28 = i15;
                                                    zzdtVar6 = zzdtVar;
                                                    iZzl = iZzm3;
                                                    i75 = i75;
                                                    i23 = i23 == true ? 1 : 0;
                                                } else {
                                                    i24 = 3;
                                                    zzdtVar6 = zzdtVar;
                                                    i118 = i121;
                                                    i28 = i15;
                                                    iZzl = i118;
                                                }
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 61:
                                                i121 = i74;
                                                i29 = i69;
                                                if (i33 == 2) {
                                                    int iZza2 = zzdu.zza(bArr, i121, zzdtVar6);
                                                    unsafe6.putObject(obj3, j13, zzdtVar6.zzc);
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = iZza2;
                                                    i24 = 3;
                                                    i118 = i121;
                                                    i23 = i23 == true ? 1 : 0;
                                                    i28 = i15;
                                                    if (iZzl != i118) {
                                                        zzgaVar = this;
                                                        zzdtVar7 = zzdtVar6;
                                                        i128 = i29;
                                                        i129 = i75;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        unsafe7 = unsafe;
                                                        i126 = 1048575;
                                                        i14 = i14;
                                                        i131 = i23 == true ? 1 : 0;
                                                        i123 = i24;
                                                    } else {
                                                        iZzi = iZzl;
                                                        i129 = i75;
                                                    }
                                                }
                                                i24 = 3;
                                                i118 = i121;
                                                i28 = i15;
                                                iZzl = i118;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 63:
                                                i121 = i74;
                                                i29 = i69;
                                                if (i33 == 0) {
                                                    iZzl = zzdu.zzh(bArr, i121, zzdtVar6);
                                                    i122 = zzdtVar6.zza;
                                                    zzeyVarZzq2 = zzgaVar.zzq(i75);
                                                    if (zzeyVarZzq2 != null || zzeyVarZzq2.zza()) {
                                                        unsafe6.putObject(obj3, j13, Integer.valueOf(i122));
                                                        unsafe6.putInt(obj3, j15, i29);
                                                    } else {
                                                        zzc(obj).zzh(i23 == true ? 1 : 0, Long.valueOf(i122));
                                                    }
                                                    i24 = 3;
                                                    i118 = i121;
                                                    i23 = i23 == true ? 1 : 0;
                                                    i28 = i15;
                                                    if (iZzl != i118) {
                                                        zzgaVar = this;
                                                        zzdtVar7 = zzdtVar6;
                                                        i128 = i29;
                                                        i129 = i75;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        unsafe7 = unsafe;
                                                        i126 = 1048575;
                                                        i14 = i14;
                                                        i131 = i23 == true ? 1 : 0;
                                                        i123 = i24;
                                                    } else {
                                                        iZzi = iZzl;
                                                        i129 = i75;
                                                    }
                                                }
                                                i24 = 3;
                                                i118 = i121;
                                                i28 = i15;
                                                iZzl = i118;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 66:
                                                i121 = i74;
                                                i29 = i69;
                                                if (i33 == 0) {
                                                    iZzl = zzdu.zzh(bArr, i121, zzdtVar6);
                                                    unsafe6.putObject(obj3, j13, Integer.valueOf(zzej.zzb(zzdtVar6.zza)));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    i24 = 3;
                                                    i118 = i121;
                                                    i23 = i23 == true ? 1 : 0;
                                                    i28 = i15;
                                                    if (iZzl != i118) {
                                                        zzgaVar = this;
                                                        zzdtVar7 = zzdtVar6;
                                                        i128 = i29;
                                                        i129 = i75;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        unsafe7 = unsafe;
                                                        i126 = 1048575;
                                                        i14 = i14;
                                                        i131 = i23 == true ? 1 : 0;
                                                        i123 = i24;
                                                    } else {
                                                        iZzi = iZzl;
                                                        i129 = i75;
                                                    }
                                                }
                                                i24 = 3;
                                                i118 = i121;
                                                i28 = i15;
                                                iZzl = i118;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 67:
                                                i121 = i74;
                                                i29 = i69;
                                                if (i33 == 0) {
                                                    int iZzk5 = zzdu.zzk(bArr, i121, zzdtVar6);
                                                    unsafe6.putObject(obj3, j13, Long.valueOf(zzej.zzc(zzdtVar6.zzb)));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                    iZzl = iZzk5;
                                                    i24 = 3;
                                                    i118 = i121;
                                                    i23 = i23 == true ? 1 : 0;
                                                    i28 = i15;
                                                    if (iZzl != i118) {
                                                        zzgaVar = this;
                                                        zzdtVar7 = zzdtVar6;
                                                        i128 = i29;
                                                        i129 = i75;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        unsafe7 = unsafe;
                                                        i126 = 1048575;
                                                        i14 = i14;
                                                        i131 = i23 == true ? 1 : 0;
                                                        i123 = i24;
                                                    } else {
                                                        iZzi = iZzl;
                                                        i129 = i75;
                                                    }
                                                }
                                                i24 = 3;
                                                i118 = i121;
                                                i28 = i15;
                                                iZzl = i118;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            case 68:
                                                if (i33 == 3) {
                                                    Object objZzu2 = zzgaVar.zzu(obj3, i69, i75);
                                                    i121 = i74;
                                                    iZzl = zzdu.zzl(objZzu2, zzgaVar.zzr(i75), bArr, i74, i14, ((i23 == true ? 1 : 0) & (-8)) | 4, zzdtVar);
                                                    zzgaVar.zzC(obj3, i69, i75, objZzu2);
                                                    i29 = i69;
                                                    i24 = 3;
                                                    i118 = i121;
                                                    i23 = i23 == true ? 1 : 0;
                                                    i28 = i15;
                                                    if (iZzl != i118) {
                                                        zzgaVar = this;
                                                        zzdtVar7 = zzdtVar6;
                                                        i128 = i29;
                                                        i129 = i75;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        unsafe7 = unsafe;
                                                        i126 = 1048575;
                                                        i14 = i14;
                                                        i131 = i23 == true ? 1 : 0;
                                                        i123 = i24;
                                                    } else {
                                                        iZzi = iZzl;
                                                        i129 = i75;
                                                    }
                                                    break;
                                                }
                                            default:
                                                i75 = i75;
                                                i118 = i74;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                                iZzl = i118;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i33 == 2) {
                                            unsafe5 = zzb;
                                            Object objZzs = zzgaVar.zzs(i75);
                                            object = unsafe5.getObject(obj, j13);
                                            if (!((zzfr) object).zze()) {
                                                zzfr zzfrVarZzb = zzfr.zza().zzb();
                                                zzfs.zza(zzfrVarZzb, object);
                                                unsafe5.putObject(obj, j13, zzfrVarZzb);
                                            }
                                            throw null;
                                        }
                                        obj3 = obj;
                                        i129 = i75;
                                        i23 = i23;
                                        iZzi = i74;
                                        i29 = i69;
                                        i24 = 3;
                                        i28 = i15;
                                    }
                                }
                            } else if (i33 == 2) {
                                zzezVarZzd = (zzez) unsafe3.getObject(obj3, j13);
                                if (!zzezVarZzd.zzc()) {
                                    int size3 = zzezVarZzd.size();
                                    zzezVarZzd = zzezVarZzd.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe3.putObject(obj3, j13, zzezVarZzd);
                                }
                                iZzl = zzdu.zze(zzgaVar.zzr(i129), i131 == true ? 1 : 0, bArr, i73, i14, zzezVarZzd, zzdtVar);
                                zzdtVar7 = zzdtVar;
                                unsafe7 = unsafe3;
                                i129 = i129;
                                i126 = 1048575;
                                i128 = i69;
                                i125 = -1;
                                i124 = 0;
                                i127 = i127;
                                i123 = 3;
                                i131 = i131 == true ? 1 : 0;
                                i14 = i14;
                            } else {
                                i25 = i127;
                                i74 = i73;
                                unsafe = unsafe3;
                                i75 = i129;
                                i69 = i69;
                                i23 = i131 == true ? 1 : 0;
                                i129 = i75;
                                i23 = i23;
                                iZzi = i74;
                                i29 = i69;
                                i24 = 3;
                                i28 = i15;
                            }
                        }
                    } else {
                        unsafe = unsafe7;
                        i24 = i123;
                        i25 = i127;
                        i26 = i125;
                        i129 = i124;
                        i27 = i129;
                        i23 = i131 == true ? 1 : 0;
                        i28 = i15;
                        i29 = i133;
                    }
                    if (i23 == i28 || i28 == 0) {
                        zzha zzhaVarZzc = zzc(obj);
                        boolean z29 = i23 == true ? 1 : 0;
                        boolean z33 = i23 == true ? 1 : 0;
                        zzdtVar7 = zzdtVar;
                        iZzg = zzdu.zzg(z29 ? 1 : 0, bArr, iZzi, i14, zzhaVarZzc, zzdtVar7);
                        i14 = i14;
                        i131 = z33 ? 1 : 0;
                        i126 = 1048575;
                        i128 = i29;
                        i123 = i24;
                        i125 = i26;
                        i124 = i27;
                        i127 = i25;
                        zzgaVar = this;
                        iZzl = iZzg;
                        unsafe7 = unsafe;
                    } else {
                        i16 = i14;
                        iZzl = iZzi;
                        i18 = i28;
                        i19 = i130;
                        i127 = i25;
                        i17 = 1048575;
                    }
                }
                i129 = iZzm;
                if (i129 == i125) {
                    i33 = (i131 == true ? 1 : 0) & 7;
                    iArr = zzgaVar.zzc;
                    i34 = iArr[i129 + 1];
                    iZzn = zzn(i34);
                    j13 = i34 & i126;
                    if (iZzn <= 17) {
                        int i1312 = iArr[i129 + 2];
                        i35 = 1 << (i1312 >>> 20);
                        i36 = 1048575;
                        i37 = i1312 & 1048575;
                        if (i37 != i127) {
                            if (i127 != 1048575) {
                                unsafe7.putInt(obj3, i127, i130);
                                i36 = 1048575;
                            }
                            if (i37 == i36) {
                                i68 = 0;
                            } else {
                                i68 = unsafe7.getInt(obj3, i37);
                            }
                            i127 = i37;
                            i38 = i68;
                        } else {
                            i38 = i130;
                            i127 = i127;
                        }
                        switch (iZzn) {
                            case 0:
                                unsafe2 = unsafe7;
                                iZzi = iZzi;
                                i39 = i133;
                                i43 = i131 == true ? 1 : 0;
                                z13 = true;
                                i26 = -1;
                                i27 = 0;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 1) {
                                    zzhj.zzl(obj3, j13, Double.longBitsToDouble(zzdu.zzn(bArr, iZzi)));
                                    i44 = iZzi + 8;
                                    i128 = i39;
                                    i131 = i43;
                                    i125 = i26;
                                    i124 = i27;
                                    i123 = 3;
                                    i126 = 1048575;
                                    i14 = i14;
                                    zzdt zzdtVar10 = zzdtVar2;
                                    iZzl = i44;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i38 | i35;
                                    zzdtVar7 = zzdtVar10;
                                } else {
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 1:
                                unsafe2 = unsafe7;
                                iZzi = iZzi;
                                i39 = i133;
                                i43 = i131 == true ? 1 : 0;
                                z13 = true;
                                i26 = -1;
                                i27 = 0;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 5) {
                                    zzhj.zzm(obj3, j13, Float.intBitsToFloat(zzdu.zzb(bArr, iZzi)));
                                    i44 = iZzi + 4;
                                    i128 = i39;
                                    i131 = i43;
                                    i125 = i26;
                                    i124 = i27;
                                    i123 = 3;
                                    i126 = 1048575;
                                    i14 = i14;
                                    zzdt zzdtVar11 = zzdtVar2;
                                    iZzl = i44;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i38 | i35;
                                    zzdtVar7 = zzdtVar11;
                                } else {
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe2 = unsafe7;
                                iZzi = iZzi;
                                i43 = i131 == true ? 1 : 0;
                                i26 = -1;
                                i27 = 0;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    int iZzk6 = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                    unsafe2.putLong(obj, j13, zzdtVar2.zzb);
                                    i45 = i38 | i35;
                                    zzdtVar7 = zzdtVar2;
                                    iZzl = iZzk6;
                                    i131 = i43 == true ? 1 : 0;
                                    i128 = i133;
                                    i125 = -1;
                                    i124 = 0;
                                    i123 = 3;
                                    i126 = 1048575;
                                    int i1313 = i127;
                                    i130 = i45;
                                    unsafe7 = unsafe2;
                                    i127 = i1313;
                                } else {
                                    i39 = i133;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe2 = unsafe7;
                                iZzi = iZzi;
                                i43 = i131 == true ? 1 : 0;
                                z14 = true;
                                i26 = -1;
                                i27 = 0;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    iZzh = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                    unsafe2.putInt(obj3, j13, zzdtVar2.zza);
                                    i46 = i38 | i35;
                                    i131 = i43 == true ? 1 : 0;
                                    i128 = i133;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = -1;
                                    i124 = 0;
                                    i126 = 1048575;
                                    z19 = z14;
                                    iZzl = iZzh;
                                    unsafe7 = unsafe2;
                                    i130 = i46;
                                    i123 = 3;
                                } else {
                                    i39 = i133;
                                    z15 = z14;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe2 = unsafe7;
                                z15 = true;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 1) {
                                    unsafe2.putLong(obj, j13, zzdu.zzn(bArr, iZzi));
                                    i14 = i14;
                                    zzdtVar7 = zzdtVar2;
                                    i124 = 0;
                                    i123 = 3;
                                    i126 = 1048575;
                                    iZzl = iZzi + 8;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i38 | i35;
                                    i128 = i133;
                                    i125 = -1;
                                } else {
                                    iZzi = iZzi;
                                    i27 = 0;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 6:
                            case 13:
                                unsafe2 = unsafe7;
                                i47 = i133;
                                i48 = 3;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 5) {
                                    unsafe2.putInt(obj3, j13, zzdu.zzb(bArr, iZzi));
                                    iZzk = iZzi + 4;
                                    i49 = i38 | i35;
                                    i123 = i48;
                                    i128 = i47;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = i26;
                                    i126 = 1048575;
                                    i124 = 0;
                                    i14 = i14;
                                    iZzl = iZzk;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i49;
                                } else {
                                    i39 = i47;
                                    i43 = i131 == true ? 1 : 0;
                                    i27 = 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 7:
                                unsafe2 = unsafe7;
                                i47 = i133;
                                i48 = 3;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    iZzk = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                    if (zzdtVar2.zzb != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    zzhj.zzk(obj3, j13, z16);
                                    i49 = i38 | i35;
                                    i123 = i48;
                                    i128 = i47;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = i26;
                                    i126 = 1048575;
                                    i124 = 0;
                                    i14 = i14;
                                    iZzl = iZzk;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i49;
                                } else {
                                    i27 = 0;
                                    iZzi = iZzi;
                                    i39 = i47;
                                    i43 = i131 == true ? 1 : 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 8:
                                unsafe2 = unsafe7;
                                i43 = i131 == true ? 1 : 0;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 2) {
                                    if ((i34 & 536870912) != 0) {
                                        iZzk = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                        i56 = zzdtVar2.zza;
                                        if (i56 >= 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i56 == 0) {
                                            zzdtVar2.zzc = "";
                                            i131 = i43 == true ? 1 : 0;
                                            i53 = 0;
                                            i54 = 3;
                                        } else {
                                            int i1314 = zzhn.zza;
                                            length = bArr.length;
                                            if ((((length - iZzk) - i56) | iZzk | i56) >= 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzk), Integer.valueOf(i56)));
                                            }
                                            i57 = iZzk + i56;
                                            cArr = new char[i56];
                                            i58 = 0;
                                            while (iZzk < i57) {
                                                b15 = bArr[iZzk];
                                                if (zzhk.zzd(b15)) {
                                                    iZzk++;
                                                    cArr[i58] = (char) b15;
                                                    i58++;
                                                } else {
                                                    while (iZzk < i57) {
                                                        i59 = iZzk + 1;
                                                        b13 = bArr[iZzk];
                                                        if (zzhk.zzd(b13)) {
                                                            cArr[i58] = (char) b13;
                                                            i58++;
                                                            iZzk = i59;
                                                            while (iZzk < i57) {
                                                                b14 = bArr[iZzk];
                                                                if (zzhk.zzd(b14)) {
                                                                }
                                                                iZzk++;
                                                                cArr[i58] = (char) b14;
                                                                i58++;
                                                            }
                                                        } else {
                                                            z17 = i43 == true ? 1 : 0;
                                                            if (b13 < -32) {
                                                                if (i59 < i57) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                iZzk += 2;
                                                                i63 = i58 + 1;
                                                                zzhk.zzc(b13, bArr[i59], cArr, i58);
                                                            } else if (b13 < -16) {
                                                                if (i59 < i57 - 1) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                int i1315 = iZzk + 2;
                                                                iZzk += 3;
                                                                i63 = i58 + 1;
                                                                zzhk.zzb(b13, bArr[i59], bArr[i1315], cArr, i58);
                                                            } else {
                                                                if (i59 < i57 - 2) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                byte b110 = bArr[i59];
                                                                int i1316 = iZzk + 3;
                                                                byte b111 = bArr[iZzk + 2];
                                                                iZzk += 4;
                                                                zzhk.zza(b13, b110, b111, bArr[i1316], cArr, i58);
                                                                i58 += 2;
                                                                i43 = z17 ? 1 : 0;
                                                            }
                                                            i43 = z17 ? 1 : 0;
                                                            i58 = i63;
                                                        }
                                                        break;
                                                    }
                                                    i131 = i43 == true ? 1 : 0;
                                                    i54 = 3;
                                                    i53 = 0;
                                                    zzdtVar2.zzc = new String(cArr, 0, i58);
                                                    iZzk = i57;
                                                }
                                            }
                                            while (iZzk < i57) {
                                                i59 = iZzk + 1;
                                                b13 = bArr[iZzk];
                                                if (zzhk.zzd(b13)) {
                                                    cArr[i58] = (char) b13;
                                                    i58++;
                                                    iZzk = i59;
                                                    while (iZzk < i57) {
                                                        b14 = bArr[iZzk];
                                                        if (zzhk.zzd(b14)) {
                                                        }
                                                        iZzk++;
                                                        cArr[i58] = (char) b14;
                                                        i58++;
                                                    }
                                                } else {
                                                    z17 = i43 == true ? 1 : 0;
                                                    if (b13 < -32) {
                                                        if (i59 < i57) {
                                                            throw zzfb.zzb();
                                                        }
                                                        iZzk += 2;
                                                        i63 = i58 + 1;
                                                        zzhk.zzc(b13, bArr[i59], cArr, i58);
                                                    } else if (b13 < -16) {
                                                        if (i59 < i57 - 1) {
                                                            throw zzfb.zzb();
                                                        }
                                                        int i1317 = iZzk + 2;
                                                        iZzk += 3;
                                                        i63 = i58 + 1;
                                                        zzhk.zzb(b13, bArr[i59], bArr[i1317], cArr, i58);
                                                    } else {
                                                        if (i59 < i57 - 2) {
                                                            throw zzfb.zzb();
                                                        }
                                                        byte b112 = bArr[i59];
                                                        int i1318 = iZzk + 3;
                                                        byte b113 = bArr[iZzk + 2];
                                                        iZzk += 4;
                                                        zzhk.zza(b13, b112, b113, bArr[i1318], cArr, i58);
                                                        i58 += 2;
                                                        i43 = z17 ? 1 : 0;
                                                    }
                                                    i43 = z17 ? 1 : 0;
                                                    i58 = i63;
                                                }
                                                break;
                                            }
                                            i131 = i43 == true ? 1 : 0;
                                            i54 = 3;
                                            i53 = 0;
                                            zzdtVar2.zzc = new String(cArr, 0, i58);
                                            iZzk = i57;
                                        }
                                    } else {
                                        i131 = i43 == true ? 1 : 0;
                                        i53 = 0;
                                        i54 = 3;
                                        iZzk = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                        i55 = zzdtVar2.zza;
                                        if (i55 >= 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i55 == 0) {
                                            zzdtVar2.zzc = "";
                                        } else {
                                            zzdtVar2.zzc = new String(bArr, iZzk, i55, zzfa.zzb);
                                            iZzk += i55;
                                        }
                                    }
                                    unsafe2.putObject(obj3, j13, zzdtVar2.zzc);
                                    i49 = i38 | i35;
                                    i124 = i53;
                                    i123 = i54;
                                    i128 = i133;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = -1;
                                    i126 = 1048575;
                                    i14 = i14;
                                    iZzl = iZzk;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i49;
                                } else {
                                    i39 = i133;
                                    i27 = 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 9:
                                unsafe2 = unsafe7;
                                i64 = i133;
                                i65 = i131 == true ? 1 : 0;
                                z18 = true;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 2) {
                                    Object objZzt3 = zzgaVar.zzt(obj3, i129);
                                    i14 = i14;
                                    int iZzm4 = zzdu.zzm(objZzt3, zzgaVar.zzr(i129), bArr, iZzi, i14, zzdtVar);
                                    zzgaVar.zzB(obj3, i129, objZzt3);
                                    zzdtVar7 = zzdtVar2;
                                    i128 = i64;
                                    i131 = i65 == true ? 1 : 0;
                                    i125 = -1;
                                    i123 = 3;
                                    i124 = 0;
                                    iZzl = iZzm4;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i38 | i35;
                                    i126 = 1048575;
                                } else {
                                    iZzi = iZzi;
                                    i39 = i64;
                                    i43 = i65;
                                    i27 = 0;
                                    z15 = z18;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 10:
                                unsafe2 = unsafe7;
                                i64 = i133;
                                i65 = i131 == true ? 1 : 0;
                                z18 = true;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 2) {
                                    int iZza3 = zzdu.zza(bArr, iZzi, zzdtVar2);
                                    unsafe2.putObject(obj3, j13, zzdtVar2.zzc);
                                    i128 = i64;
                                    i131 = i65 == true ? 1 : 0;
                                    zzdtVar7 = zzdtVar2;
                                    unsafe7 = unsafe2;
                                    i125 = -1;
                                    i126 = 1048575;
                                    i124 = 0;
                                    iZzl = iZza3;
                                    i130 = i38 | i35;
                                    i123 = 3;
                                } else {
                                    iZzi = iZzi;
                                    i39 = i64;
                                    i43 = i65;
                                    i27 = 0;
                                    z15 = z18;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 12:
                                unsafe2 = unsafe7;
                                i64 = i133;
                                i65 = i131 == true ? 1 : 0;
                                z18 = true;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    iZzh = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                    i66 = zzdtVar2.zza;
                                    zzey zzeyVarZzq4 = zzgaVar.zzq(i129);
                                    if ((Integer.MIN_VALUE & i34) != 0) {
                                    }
                                    unsafe2.putInt(obj3, j13, i66);
                                    i46 = i38 | i35;
                                    i128 = i64;
                                    i131 = i65 == true ? 1 : 0;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = -1;
                                    i126 = 1048575;
                                    i124 = 0;
                                    z19 = z18;
                                    iZzl = iZzh;
                                    unsafe7 = unsafe2;
                                    i130 = i46;
                                    i123 = 3;
                                } else {
                                    iZzi = iZzi;
                                    i39 = i64;
                                    i43 = i65;
                                    i27 = 0;
                                    z15 = z18;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 15:
                                unsafe2 = unsafe7;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    int iZzh17 = zzdu.zzh(bArr, iZzi, zzdtVar2);
                                    unsafe2.putInt(obj3, j13, zzej.zzb(zzdtVar2.zza));
                                    i128 = i133;
                                    i131 = i131 == true ? 1 : 0;
                                    zzdtVar7 = zzdtVar2;
                                    i125 = -1;
                                    i123 = 3;
                                    i126 = 1048575;
                                    i14 = i14;
                                    iZzl = iZzh17;
                                    unsafe7 = unsafe2;
                                    i127 = i127;
                                    i130 = i38 | i35;
                                    i124 = 0;
                                } else {
                                    i27 = 0;
                                    iZzi = iZzi;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            case 16:
                                i67 = i129;
                                i26 = -1;
                                zzdtVar2 = zzdtVar;
                                if (i33 == 0) {
                                    int iZzk7 = zzdu.zzk(bArr, iZzi, zzdtVar2);
                                    unsafe2 = unsafe7;
                                    i129 = i67;
                                    unsafe7.putLong(obj, j13, zzej.zzc(zzdtVar2.zzb));
                                    i45 = i38 | i35;
                                    zzdtVar7 = zzdtVar2;
                                    iZzl = iZzk7;
                                    i128 = i133;
                                    i125 = -1;
                                    i123 = 3;
                                    i126 = 1048575;
                                    i124 = 0;
                                    int i1319 = i127;
                                    i130 = i45;
                                    unsafe7 = unsafe2;
                                    i127 = i1319;
                                } else {
                                    unsafe2 = unsafe7;
                                    i129 = i67;
                                    iZzi = iZzi;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    i27 = 0;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                            default:
                                i123 = 3;
                                if (i33 == 3) {
                                    Object objZzt4 = zzgaVar.zzt(obj3, i129);
                                    int i1414 = i129;
                                    iZzl = zzdu.zzl(objZzt4, zzgaVar.zzr(i129), bArr, iZzi, i14, (i133 << 3) | 4, zzdtVar);
                                    zzgaVar.zzB(obj3, i1414, objZzt4);
                                    i126 = 1048575;
                                    i128 = i133;
                                    i129 = i1414;
                                    i127 = i127;
                                    i125 = -1;
                                    i124 = 0;
                                    i14 = i14;
                                    zzdtVar7 = zzdtVar;
                                    i130 = i38 | i35;
                                } else {
                                    i26 = -1;
                                    unsafe2 = unsafe7;
                                    iZzi = iZzi;
                                    i39 = i133;
                                    i43 = i131 == true ? 1 : 0;
                                    i27 = 0;
                                    zzdtVar2 = zzdtVar;
                                    i28 = i15;
                                    i23 = i43;
                                    unsafe = unsafe2;
                                    i25 = i127;
                                    i130 = i38;
                                    i24 = 3;
                                    i29 = i39;
                                    iZzi = iZzi;
                                }
                                break;
                        }
                    } else {
                        i26 = -1;
                        i27 = 0;
                        i69 = i133;
                        zzdtVar3 = zzdtVar7;
                        unsafe3 = unsafe7;
                        i73 = iZzi;
                        if (iZzn == 27) {
                            i25 = i127;
                            i76 = i129;
                            zzdtVar4 = zzdtVar3;
                            if (iZzn <= 49) {
                                j14 = i34;
                                unsafe4 = zzb;
                                zzezVarZzd2 = (zzez) unsafe4.getObject(obj3, j13);
                                if (zzezVarZzd2.zzc()) {
                                    int size4 = zzezVarZzd2.size();
                                    zzezVarZzd2 = zzezVarZzd2.zzd(size4 != 0 ? size4 + size4 : 10);
                                    unsafe4.putObject(obj3, j13, zzezVarZzd2);
                                }
                                zzezVar = zzezVarZzd2;
                                switch (iZzn) {
                                    case 18:
                                    case C4007z9.J /* 35 */:
                                        i77 = i131 == true ? 1 : 0;
                                        i78 = i76;
                                        zzdtVar4 = zzdtVar4;
                                        i79 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            zzekVar2 = (zzek) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                            i85 = zzdtVar4.zza + iZzg;
                                            while (iZzg < i85) {
                                                zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzg)));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i85) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i33 == 1) {
                                            zzekVar = (zzek) zzezVar;
                                            zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i83)));
                                            i84 = i83 + 8;
                                            while (i84 < i79) {
                                                iZzh2 = zzdu.zzh(bArr, i84, zzdtVar4);
                                                if (i77 == zzdtVar4.zza) {
                                                    zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzh2)));
                                                    i84 = iZzh2 + 8;
                                                } else {
                                                    iZzg = i84;
                                                }
                                            }
                                            iZzg = i84;
                                        } else {
                                            iZzg = i83;
                                        }
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 19:
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        i77 = i131 == true ? 1 : 0;
                                        i78 = i76;
                                        zzdtVar4 = zzdtVar4;
                                        i79 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            zzerVar2 = (zzer) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                            i86 = zzdtVar4.zza + iZzg;
                                            while (iZzg < i86) {
                                                zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzg)));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i86) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i33 == 5) {
                                            zzerVar = (zzer) zzezVar;
                                            zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i83)));
                                            i84 = i83 + 4;
                                            while (i84 < i79) {
                                                iZzh3 = zzdu.zzh(bArr, i84, zzdtVar4);
                                                if (i77 == zzdtVar4.zza) {
                                                    zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzh3)));
                                                    i84 = iZzh3 + 4;
                                                } else {
                                                    iZzg = i84;
                                                }
                                            }
                                            iZzg = i84;
                                        } else {
                                            iZzg = i83;
                                        }
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 20:
                                    case 21:
                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    case C4007z9.K /* 38 */:
                                        i77 = i131 == true ? 1 : 0;
                                        i78 = i76;
                                        zzdtVar4 = zzdtVar4;
                                        i79 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            zzfmVar2 = (zzfm) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar4);
                                            i87 = zzdtVar4.zza + iZzg;
                                            while (iZzg < i87) {
                                                iZzg = zzdu.zzk(bArr, iZzg, zzdtVar4);
                                                zzfmVar2.zze(zzdtVar4.zzb);
                                            }
                                            if (iZzg != i87) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i33 == 0) {
                                            zzfmVar = (zzfm) zzezVar;
                                            iZzg = zzdu.zzk(bArr, i83, zzdtVar4);
                                            zzfmVar.zze(zzdtVar4.zzb);
                                            while (iZzg < i79) {
                                                iZzh4 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                if (i77 == zzdtVar4.zza) {
                                                    iZzg = zzdu.zzk(bArr, iZzh4, zzdtVar4);
                                                    zzfmVar.zze(zzdtVar4.zzb);
                                                }
                                            }
                                        } else {
                                            iZzg = i83;
                                        }
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 22:
                                    case C4007z9.I /* 29 */:
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    case 43:
                                        i77 = i131 == true ? 1 : 0;
                                        i88 = i76;
                                        zzdtVar5 = zzdtVar4;
                                        i89 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            iZzg = zzdu.zzf(bArr, i83, zzezVar, zzdtVar5);
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                        } else if (i33 == 0) {
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = zzdu.zzj(i77 == true ? 1 : 0, bArr, i83, i14, zzezVar, zzdtVar);
                                            i77 = i77 == true ? 1 : 0;
                                        } else {
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = i83;
                                        }
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i77 = i131 == true ? 1 : 0;
                                        i88 = i76;
                                        zzdtVar5 = zzdtVar4;
                                        i89 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            if (i33 == 1) {
                                                zzfmVar3 = (zzfm) zzezVar;
                                                zzfmVar3.zze(zzdu.zzn(bArr, i83));
                                                iZzg = i83 + 8;
                                                while (iZzg < i89) {
                                                    iZzh5 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                    if (i77 == zzdtVar5.zza) {
                                                        zzfmVar3.zze(zzdu.zzn(bArr, iZzh5));
                                                        iZzg = iZzh5 + 8;
                                                    }
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            zzfmVar4 = (zzfm) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                            i93 = zzdtVar5.zza + iZzg;
                                            while (iZzg < i93) {
                                                zzfmVar4.zze(zzdu.zzn(bArr, iZzg));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i93) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i79 = i89;
                                        zzdtVar4 = zzdtVar5;
                                        i78 = i88;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 24:
                                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        i77 = i131 == true ? 1 : 0;
                                        i88 = i76;
                                        zzdtVar5 = zzdtVar4;
                                        i89 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            if (i33 == 5) {
                                                zzewVar = (zzew) zzezVar;
                                                zzewVar.zze(zzdu.zzb(bArr, i83));
                                                iZzg = i83 + 4;
                                                while (iZzg < i89) {
                                                    iZzh6 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                    if (i77 == zzdtVar5.zza) {
                                                        zzewVar.zze(zzdu.zzb(bArr, iZzh6));
                                                        iZzg = iZzh6 + 4;
                                                    }
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            zzewVar2 = (zzew) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                            i94 = zzdtVar5.zza + iZzg;
                                            while (iZzg < i94) {
                                                zzewVar2.zze(zzdu.zzb(bArr, iZzg));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i94) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i79 = i89;
                                        zzdtVar4 = zzdtVar5;
                                        i78 = i88;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case C4007z9.F /* 25 */:
                                    case 42:
                                        i77 = i131 == true ? 1 : 0;
                                        i88 = i76;
                                        zzdtVar5 = zzdtVar4;
                                        i89 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            if (i33 == 0) {
                                                zzdvVar = (zzdv) zzezVar;
                                                iZzg = zzdu.zzk(bArr, i83, zzdtVar5);
                                                if (zzdtVar5.zzb != 0) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                                zzdvVar.zze(z24);
                                                while (iZzg < i89) {
                                                    iZzh7 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                    if (i77 == zzdtVar5.zza) {
                                                        iZzg = zzdu.zzk(bArr, iZzh7, zzdtVar5);
                                                        if (zzdtVar5.zzb != 0) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        zzdvVar.zze(z25);
                                                    }
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            zzdvVar2 = (zzdv) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                            i95 = zzdtVar5.zza + iZzg;
                                            while (iZzg < i95) {
                                                iZzg = zzdu.zzk(bArr, iZzg, zzdtVar5);
                                                if (zzdtVar5.zzb != 0) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                zzdvVar2.zze(z26);
                                            }
                                            if (iZzg != i95) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i79 = i89;
                                        zzdtVar4 = zzdtVar5;
                                        i78 = i88;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case C4007z9.G /* 26 */:
                                        i77 = i131 == true ? 1 : 0;
                                        i88 = i76;
                                        zzdtVar5 = zzdtVar4;
                                        i89 = i14;
                                        i69 = i69;
                                        i83 = i73;
                                        unsafe = unsafe3;
                                        z23 = true;
                                        if (i33 == 2) {
                                            if ((j14 & 536870912) == 0) {
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                i100 = zzdtVar5.zza;
                                                if (i100 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i100 == 0) {
                                                    obj2 = "";
                                                    zzezVar.add(obj2);
                                                } else {
                                                    obj2 = r6;
                                                    zzezVar.add(new String(bArr, iZzg, i100, zzfa.zzb));
                                                    iZzg += i100;
                                                }
                                                while (iZzg < i89) {
                                                    iZzh9 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                    if (i77 == zzdtVar5.zza) {
                                                        iZzg = zzdu.zzh(bArr, iZzh9, zzdtVar5);
                                                        i101 = zzdtVar5.zza;
                                                        if (i101 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i101 == 0) {
                                                            zzezVar.add(obj2);
                                                        } else {
                                                            zzezVar.add(new String(bArr, iZzg, i101, zzfa.zzb));
                                                            iZzg += i101;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzg = zzdu.zzh(bArr, i83, zzdtVar5);
                                                i96 = zzdtVar5.zza;
                                                if (i96 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i96 == 0) {
                                                    zzezVar.add(r6);
                                                } else {
                                                    i97 = iZzg + i96;
                                                    if (zzhn.zzc(bArr, iZzg, i97)) {
                                                        throw zzfb.zzb();
                                                    }
                                                    zzezVar.add(new String(bArr, iZzg, i96, zzfa.zzb));
                                                    iZzg = i97;
                                                }
                                                while (iZzg < i89) {
                                                    iZzh8 = zzdu.zzh(bArr, iZzg, zzdtVar5);
                                                    if (i77 == zzdtVar5.zza) {
                                                        iZzg = zzdu.zzh(bArr, iZzh8, zzdtVar5);
                                                        i98 = zzdtVar5.zza;
                                                        if (i98 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i98 == 0) {
                                                            zzezVar.add(r6);
                                                        } else {
                                                            i99 = iZzg + i98;
                                                            if (zzhn.zzc(bArr, iZzg, i99)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            zzezVar.add(new String(bArr, iZzg, i98, zzfa.zzb));
                                                            iZzg = i99;
                                                        }
                                                    }
                                                }
                                            }
                                            i79 = i89;
                                            zzdtVar4 = zzdtVar5;
                                            i78 = i88;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        }
                                        i79 = i89;
                                        zzdtVar4 = zzdtVar5;
                                        i78 = i88;
                                        iZzg = i83;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 27:
                                        i77 = i131 == true ? 1 : 0;
                                        i102 = i73;
                                        unsafe = unsafe3;
                                        if (i33 == 2) {
                                            i69 = i69;
                                            int iZze2 = zzdu.zze(zzgaVar.zzr(i76), i77 == true ? 1 : 0, bArr, i102, i14, zzezVar, zzdtVar);
                                            i83 = i102;
                                            z23 = true;
                                            zzdtVar4 = zzdtVar4;
                                            i78 = i76;
                                            iZzg = iZze2;
                                            i79 = i14;
                                        } else {
                                            i69 = i69;
                                            z23 = true;
                                            int i1415 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i1415;
                                            iZzg = i83;
                                        }
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 28:
                                        i103 = i131 == true ? 1 : 0;
                                        i102 = i73;
                                        unsafe = unsafe3;
                                        if (i33 == 2) {
                                            iZzh10 = zzdu.zzh(bArr, i102, zzdtVar4);
                                            i104 = zzdtVar4.zza;
                                            if (i104 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i104 <= bArr.length - iZzh10) {
                                                throw zzfb.zzf();
                                            }
                                            if (i104 == 0) {
                                                zzezVar.add(zzef.zzb);
                                            } else {
                                                zzezVar.add(zzef.zzk(bArr, iZzh10, i104));
                                                iZzh10 += i104;
                                            }
                                            while (true) {
                                                if (iZzh10 < i14) {
                                                    iZzh11 = zzdu.zzh(bArr, iZzh10, zzdtVar4);
                                                    i77 = i103;
                                                    if (i77 == zzdtVar4.zza) {
                                                        iZzh10 = zzdu.zzh(bArr, iZzh11, zzdtVar4);
                                                        i105 = zzdtVar4.zza;
                                                        if (i105 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i105 <= bArr.length - iZzh10) {
                                                            throw zzfb.zzf();
                                                        }
                                                        if (i105 == 0) {
                                                            zzezVar.add(zzef.zzb);
                                                        } else {
                                                            zzezVar.add(zzef.zzk(bArr, iZzh10, i105));
                                                            iZzh10 += i105;
                                                        }
                                                        i103 = i77 == true ? 1 : 0;
                                                    }
                                                } else {
                                                    i77 = i103;
                                                }
                                            }
                                            i69 = i69;
                                            zzdtVar4 = zzdtVar4;
                                            z23 = true;
                                            iZzg = iZzh10;
                                            int i1416 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i1416;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            i69 = i69;
                                            i77 = i103 == true ? 1 : 0;
                                            z23 = true;
                                            int i1417 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i1417;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        }
                                        break;
                                    case 30:
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        i106 = i131 == true ? 1 : 0;
                                        i102 = i73;
                                        unsafe = unsafe3;
                                        if (i33 == 2) {
                                            iZzj = zzdu.zzf(bArr, i102, zzezVar, zzdtVar4);
                                        } else if (i33 == 0) {
                                            i77 = i106 == true ? 1 : 0;
                                            z23 = true;
                                            int i1418 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i1418;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            iZzj = zzdu.zzj(i106 == true ? 1 : 0, bArr, i102, i14, zzezVar, zzdtVar);
                                        }
                                        zzeyVarZzq = zzgaVar.zzq(i76);
                                        zzgzVar = zzgaVar.zzl;
                                        int i1419 = zzgk.zza;
                                        if (zzeyVarZzq != null) {
                                            i107 = iZzj;
                                            i108 = i106 == true ? 1 : 0;
                                            i109 = i69;
                                            z27 = true;
                                        } else if (zzezVar != null) {
                                            size = zzezVar.size();
                                            objZzc2 = null;
                                            i110 = 0;
                                            i111 = 0;
                                            while (i110 < size) {
                                                num = (Integer) zzezVar.get(i110);
                                                int i1420 = iZzj;
                                                iIntValue2 = num.intValue();
                                                if (zzeyVarZzq.zza()) {
                                                    if (i110 != i111) {
                                                        zzezVar.set(i111, num);
                                                    }
                                                    i111++;
                                                    i113 = 1;
                                                    i112 = i69;
                                                } else {
                                                    i112 = i69;
                                                    objZzc2 = zzgk.zzc(obj, i112, iIntValue2, objZzc2, zzgzVar);
                                                    i113 = 1;
                                                }
                                                i110 += i113;
                                                iZzj = i1420;
                                                i69 = i112;
                                                i106 = i106;
                                            }
                                            i107 = iZzj;
                                            i108 = i106;
                                            i109 = i69;
                                            z27 = true;
                                            if (i111 != size) {
                                                zzezVar.subList(i111, size).clear();
                                            }
                                        } else {
                                            i107 = iZzj;
                                            i108 = i106 == true ? 1 : 0;
                                            i109 = i69;
                                            z27 = true;
                                            it = zzezVar.iterator();
                                            objZzc = null;
                                            while (it.hasNext()) {
                                                iIntValue = ((Integer) it.next()).intValue();
                                                if (!zzeyVarZzq.zza()) {
                                                    objZzc = zzgk.zzc(obj, i109, iIntValue, objZzc, zzgzVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        i69 = i109;
                                        i77 = i108;
                                        zzdtVar4 = zzdtVar4;
                                        z23 = z27;
                                        iZzg = i107;
                                        int i14110 = i102;
                                        i78 = i76;
                                        i79 = i14;
                                        i83 = i14110;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case 33:
                                    case 47:
                                        i114 = i131 == true ? 1 : 0;
                                        i102 = i73;
                                        unsafe = unsafe3;
                                        c13 = 2;
                                        if (i33 == 2) {
                                            if (i33 == 0) {
                                                zzewVar3 = (zzew) zzezVar;
                                                iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                                zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                while (iZzg < i14) {
                                                    iZzh12 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                    if (i114 == zzdtVar4.zza) {
                                                        iZzg = zzdu.zzh(bArr, iZzh12, zzdtVar4);
                                                        zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                    }
                                                }
                                            }
                                            i77 = i114;
                                            z23 = true;
                                            int i14111 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i14111;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            zzewVar4 = (zzew) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                            i115 = zzdtVar4.zza + iZzg;
                                            while (iZzg < i115) {
                                                iZzg = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                zzewVar4.zze(zzej.zzb(zzdtVar4.zza));
                                            }
                                            if (iZzg != i115) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i77 = i114;
                                        z23 = true;
                                        int i14112 = i102;
                                        i78 = i76;
                                        i79 = i14;
                                        i83 = i14112;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    case 48:
                                        i114 = i131 == true ? 1 : 0;
                                        i102 = i73;
                                        unsafe = unsafe3;
                                        c13 = 2;
                                        if (i33 == 2) {
                                            if (i33 == 0) {
                                                zzfmVar5 = (zzfm) zzezVar;
                                                iZzg = zzdu.zzk(bArr, i102, zzdtVar4);
                                                zzfmVar5.zze(zzej.zzc(zzdtVar4.zzb));
                                                while (iZzg < i14) {
                                                    iZzh13 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                    if (i114 == zzdtVar4.zza) {
                                                        iZzg = zzdu.zzk(bArr, iZzh13, zzdtVar4);
                                                        zzfmVar5.zze(zzej.zzc(zzdtVar4.zzb));
                                                    }
                                                }
                                            }
                                            i77 = i114;
                                            z23 = true;
                                            int i14113 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i14113;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            zzfmVar6 = (zzfm) zzezVar;
                                            iZzg = zzdu.zzh(bArr, i102, zzdtVar4);
                                            i116 = zzdtVar4.zza + iZzg;
                                            while (iZzg < i116) {
                                                iZzg = zzdu.zzk(bArr, iZzg, zzdtVar4);
                                                zzfmVar6.zze(zzej.zzc(zzdtVar4.zzb));
                                            }
                                            if (iZzg != i116) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i77 = i114;
                                        z23 = true;
                                        int i14114 = i102;
                                        i78 = i76;
                                        i79 = i14;
                                        i83 = i14114;
                                        obj3 = obj;
                                        if (iZzg != i83) {
                                            iZzi = iZzg;
                                            i23 = i77;
                                            i129 = i78;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                        } else {
                                            i131 = i77;
                                            i14 = i79;
                                            zzdtVar7 = zzdtVar4;
                                            i129 = i78;
                                            i125 = -1;
                                            i124 = 0;
                                            i127 = i25;
                                            i128 = i69;
                                            i123 = 3;
                                            i126 = 1048575;
                                        }
                                        iZzl = iZzg;
                                        unsafe7 = unsafe;
                                        break;
                                    default:
                                        if (i33 == 3) {
                                            zzgiVarZzr = zzgaVar.zzr(i76);
                                            i117 = ((i131 == true ? 1 : 0) & (-8)) | 4;
                                            unsafe = unsafe3;
                                            i102 = i73;
                                            iZzg = zzdu.zzc(zzgiVarZzr, bArr, i73, i14, i117, zzdtVar);
                                            zzezVar.add(zzdtVar4.zzc);
                                            while (iZzg < i14) {
                                                iZzh14 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                if (i131 == zzdtVar4.zza) {
                                                    i77 = i131 == true ? 1 : 0;
                                                    z23 = true;
                                                    int i14115 = i102;
                                                    i78 = i76;
                                                    i79 = i14;
                                                    i83 = i14115;
                                                    obj3 = obj;
                                                    if (iZzg != i83) {
                                                        iZzi = iZzg;
                                                        i23 = i77;
                                                        i129 = i78;
                                                        i29 = i69;
                                                        i24 = 3;
                                                        i28 = i15;
                                                    } else {
                                                        i131 = i77;
                                                        i14 = i79;
                                                        zzdtVar7 = zzdtVar4;
                                                        i129 = i78;
                                                        i125 = -1;
                                                        i124 = 0;
                                                        i127 = i25;
                                                        i128 = i69;
                                                        i123 = 3;
                                                        i126 = 1048575;
                                                    }
                                                    iZzl = iZzg;
                                                    unsafe7 = unsafe;
                                                } else {
                                                    iZzg = zzdu.zzc(zzgiVarZzr, bArr, iZzh14, i14, i117, zzdtVar);
                                                    zzezVar.add(zzdtVar4.zzc);
                                                }
                                                break;
                                            }
                                            i77 = i131 == true ? 1 : 0;
                                            z23 = true;
                                            int i14116 = i102;
                                            i78 = i76;
                                            i79 = i14;
                                            i83 = i14116;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        } else {
                                            unsafe = unsafe3;
                                            i77 = i131 == true ? 1 : 0;
                                            i78 = i76;
                                            zzdtVar4 = zzdtVar4;
                                            i79 = i14;
                                            i69 = i69;
                                            i83 = i73;
                                            z23 = true;
                                            iZzg = i83;
                                            obj3 = obj;
                                            if (iZzg != i83) {
                                                iZzi = iZzg;
                                                i23 = i77;
                                                i129 = i78;
                                                i29 = i69;
                                                i24 = 3;
                                                i28 = i15;
                                            } else {
                                                i131 = i77;
                                                i14 = i79;
                                                zzdtVar7 = zzdtVar4;
                                                i129 = i78;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                i128 = i69;
                                                i123 = 3;
                                                i126 = 1048575;
                                            }
                                            iZzl = iZzg;
                                            unsafe7 = unsafe;
                                        }
                                        break;
                                }
                            } else {
                                i74 = i73;
                                unsafe = unsafe3;
                                i75 = i76;
                                i69 = i69;
                                i23 = i131 == true ? 1 : 0;
                                zzdtVar6 = zzdtVar4;
                                if (iZzn == 50) {
                                    obj3 = obj;
                                    unsafe6 = zzb;
                                    j15 = iArr[i75 + 2] & 1048575;
                                    switch (iZzn) {
                                        case 51:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 1) {
                                                unsafe6.putObject(obj3, j13, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr, i118))));
                                                i119 = i118 + 8;
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = i119;
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 52:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 5) {
                                                unsafe6.putObject(obj3, j13, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr, i118))));
                                                i119 = i118 + 4;
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = i119;
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 0) {
                                                iZzl = zzdu.zzk(bArr, i118, zzdtVar6);
                                                unsafe6.putObject(obj3, j13, Long.valueOf(zzdtVar6.zzb));
                                                unsafe6.putInt(obj3, j15, i29);
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 0) {
                                                iZzl = zzdu.zzh(bArr, i118, zzdtVar6);
                                                unsafe6.putObject(obj3, j13, Integer.valueOf(zzdtVar6.zza));
                                                unsafe6.putInt(obj3, j15, i29);
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 56:
                                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 1) {
                                                unsafe6.putObject(obj3, j13, Long.valueOf(zzdu.zzn(bArr, i118)));
                                                iZzl = i118 + 8;
                                                unsafe6.putInt(obj3, j15, i29);
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 57:
                                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 5) {
                                                unsafe6.putObject(obj3, j13, Integer.valueOf(zzdu.zzb(bArr, i118)));
                                                iZzk2 = i118 + 4;
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = iZzk2;
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 58:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 0) {
                                                iZzk2 = zzdu.zzk(bArr, i118, zzdtVar6);
                                                if (zzdtVar6.zzb != 0) {
                                                    z28 = true;
                                                } else {
                                                    z28 = false;
                                                }
                                                unsafe6.putObject(obj3, j13, Boolean.valueOf(z28));
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = iZzk2;
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 59:
                                            i75 = i75;
                                            i23 = i23 == true ? 1 : 0;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            if (i33 == 2) {
                                                iZzh15 = zzdu.zzh(bArr, i118, zzdtVar6);
                                                i120 = zzdtVar6.zza;
                                                if (i120 == 0) {
                                                    unsafe6.putObject(obj3, j13, "");
                                                } else {
                                                    if ((i34 & 536870912) == 0) {
                                                    }
                                                    unsafe6.putObject(obj3, j13, new String(bArr, iZzh15, i120, zzfa.zzb));
                                                    iZzh15 += i120;
                                                }
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = iZzh15;
                                            } else {
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 60:
                                            i121 = i74;
                                            i29 = i69;
                                            if (i33 == 2) {
                                                Object objZzu3 = zzgaVar.zzu(obj3, i29, i75);
                                                zzgi zzgiVarZzr3 = zzgaVar.zzr(i75);
                                                i24 = 3;
                                                i118 = i121;
                                                int iZzm5 = zzdu.zzm(objZzu3, zzgiVarZzr3, bArr, i118, i14, zzdtVar);
                                                zzgaVar.zzC(obj3, i29, i75, objZzu3);
                                                i28 = i15;
                                                zzdtVar6 = zzdtVar;
                                                iZzl = iZzm5;
                                                i75 = i75;
                                                i23 = i23 == true ? 1 : 0;
                                            } else {
                                                i24 = 3;
                                                zzdtVar6 = zzdtVar;
                                                i118 = i121;
                                                i28 = i15;
                                                iZzl = i118;
                                            }
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 61:
                                            i121 = i74;
                                            i29 = i69;
                                            if (i33 == 2) {
                                                int iZza4 = zzdu.zza(bArr, i121, zzdtVar6);
                                                unsafe6.putObject(obj3, j13, zzdtVar6.zzc);
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = iZza4;
                                                i24 = 3;
                                                i118 = i121;
                                                i23 = i23 == true ? 1 : 0;
                                                i28 = i15;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                            }
                                            i24 = 3;
                                            i118 = i121;
                                            i28 = i15;
                                            iZzl = i118;
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 63:
                                            i121 = i74;
                                            i29 = i69;
                                            if (i33 == 0) {
                                                iZzl = zzdu.zzh(bArr, i121, zzdtVar6);
                                                i122 = zzdtVar6.zza;
                                                zzeyVarZzq2 = zzgaVar.zzq(i75);
                                                if (zzeyVarZzq2 != null) {
                                                    unsafe6.putObject(obj3, j13, Integer.valueOf(i122));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                } else {
                                                    unsafe6.putObject(obj3, j13, Integer.valueOf(i122));
                                                    unsafe6.putInt(obj3, j15, i29);
                                                }
                                                i24 = 3;
                                                i118 = i121;
                                                i23 = i23 == true ? 1 : 0;
                                                i28 = i15;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                            }
                                            i24 = 3;
                                            i118 = i121;
                                            i28 = i15;
                                            iZzl = i118;
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 66:
                                            i121 = i74;
                                            i29 = i69;
                                            if (i33 == 0) {
                                                iZzl = zzdu.zzh(bArr, i121, zzdtVar6);
                                                unsafe6.putObject(obj3, j13, Integer.valueOf(zzej.zzb(zzdtVar6.zza)));
                                                unsafe6.putInt(obj3, j15, i29);
                                                i24 = 3;
                                                i118 = i121;
                                                i23 = i23 == true ? 1 : 0;
                                                i28 = i15;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                            }
                                            i24 = 3;
                                            i118 = i121;
                                            i28 = i15;
                                            iZzl = i118;
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 67:
                                            i121 = i74;
                                            i29 = i69;
                                            if (i33 == 0) {
                                                int iZzk8 = zzdu.zzk(bArr, i121, zzdtVar6);
                                                unsafe6.putObject(obj3, j13, Long.valueOf(zzej.zzc(zzdtVar6.zzb)));
                                                unsafe6.putInt(obj3, j15, i29);
                                                iZzl = iZzk8;
                                                i24 = 3;
                                                i118 = i121;
                                                i23 = i23 == true ? 1 : 0;
                                                i28 = i15;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                            }
                                            i24 = 3;
                                            i118 = i121;
                                            i28 = i15;
                                            iZzl = i118;
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                        case 68:
                                            if (i33 == 3) {
                                                Object objZzu4 = zzgaVar.zzu(obj3, i69, i75);
                                                i121 = i74;
                                                iZzl = zzdu.zzl(objZzu4, zzgaVar.zzr(i75), bArr, i74, i14, ((i23 == true ? 1 : 0) & (-8)) | 4, zzdtVar);
                                                zzgaVar.zzC(obj3, i69, i75, objZzu4);
                                                i29 = i69;
                                                i24 = 3;
                                                i118 = i121;
                                                i23 = i23 == true ? 1 : 0;
                                                i28 = i15;
                                                if (iZzl != i118) {
                                                    zzgaVar = this;
                                                    zzdtVar7 = zzdtVar6;
                                                    i128 = i29;
                                                    i129 = i75;
                                                    i125 = -1;
                                                    i124 = 0;
                                                    i127 = i25;
                                                    unsafe7 = unsafe;
                                                    i126 = 1048575;
                                                    i14 = i14;
                                                    i131 = i23 == true ? 1 : 0;
                                                    i123 = i24;
                                                } else {
                                                    iZzi = iZzl;
                                                    i129 = i75;
                                                }
                                                break;
                                            }
                                        default:
                                            i75 = i75;
                                            i118 = i74;
                                            i29 = i69;
                                            i24 = 3;
                                            i28 = i15;
                                            iZzl = i118;
                                            if (iZzl != i118) {
                                                zzgaVar = this;
                                                zzdtVar7 = zzdtVar6;
                                                i128 = i29;
                                                i129 = i75;
                                                i125 = -1;
                                                i124 = 0;
                                                i127 = i25;
                                                unsafe7 = unsafe;
                                                i126 = 1048575;
                                                i14 = i14;
                                                i131 = i23 == true ? 1 : 0;
                                                i123 = i24;
                                            } else {
                                                iZzi = iZzl;
                                                i129 = i75;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i33 == 2) {
                                        unsafe5 = zzb;
                                        Object objZzs2 = zzgaVar.zzs(i75);
                                        object = unsafe5.getObject(obj, j13);
                                        if (!((zzfr) object).zze()) {
                                            zzfr zzfrVarZzb2 = zzfr.zza().zzb();
                                            zzfs.zza(zzfrVarZzb2, object);
                                            unsafe5.putObject(obj, j13, zzfrVarZzb2);
                                        }
                                        throw null;
                                    }
                                    obj3 = obj;
                                    i129 = i75;
                                    i23 = i23;
                                    iZzi = i74;
                                    i29 = i69;
                                    i24 = 3;
                                    i28 = i15;
                                }
                            }
                        } else if (i33 == 2) {
                            zzezVarZzd = (zzez) unsafe3.getObject(obj3, j13);
                            if (!zzezVarZzd.zzc()) {
                                int size5 = zzezVarZzd.size();
                                zzezVarZzd = zzezVarZzd.zzd(size5 != 0 ? size5 + size5 : 10);
                                unsafe3.putObject(obj3, j13, zzezVarZzd);
                            }
                            iZzl = zzdu.zze(zzgaVar.zzr(i129), i131 == true ? 1 : 0, bArr, i73, i14, zzezVarZzd, zzdtVar);
                            zzdtVar7 = zzdtVar;
                            unsafe7 = unsafe3;
                            i129 = i129;
                            i126 = 1048575;
                            i128 = i69;
                            i125 = -1;
                            i124 = 0;
                            i127 = i127;
                            i123 = 3;
                            i131 = i131 == true ? 1 : 0;
                            i14 = i14;
                        } else {
                            i25 = i127;
                            i74 = i73;
                            unsafe = unsafe3;
                            i75 = i129;
                            i69 = i69;
                            i23 = i131 == true ? 1 : 0;
                            i129 = i75;
                            i23 = i23;
                            iZzi = i74;
                            i29 = i69;
                            i24 = 3;
                            i28 = i15;
                        }
                    }
                } else {
                    unsafe = unsafe7;
                    i24 = i123;
                    i25 = i127;
                    i26 = i125;
                    i129 = i124;
                    i27 = i129;
                    i23 = i131 == true ? 1 : 0;
                    i28 = i15;
                    i29 = i133;
                }
                if (i23 == i28) {
                }
                zzha zzhaVarZzc2 = zzc(obj);
                boolean z210 = i23 == true ? 1 : 0;
                boolean z34 = i23 == true ? 1 : 0;
                zzdtVar7 = zzdtVar;
                iZzg = zzdu.zzg(z210 ? 1 : 0, bArr, iZzi, i14, zzhaVarZzc2, zzdtVar7);
                i14 = i14;
                i131 = z34 ? 1 : 0;
                i126 = 1048575;
                i128 = i29;
                i123 = i24;
                i125 = i26;
                i124 = i27;
                i127 = i25;
                zzgaVar = this;
                iZzl = iZzg;
                unsafe7 = unsafe;
            } else {
                unsafe = unsafe7;
                i16 = i14;
                i17 = i126;
                i18 = i15;
                i19 = i130;
                i23 = i131;
            }
        }
        if (i127 != i17) {
            unsafe.putInt(obj3, i127, i19);
        }
        for (int i150 = this.zzi; i150 < this.zzj; i150++) {
            int i151 = this.zzh[i150];
            int i152 = this.zzc[i151];
            Object objZzf = zzhj.zzf(obj3, zzo(i151) & i17);
            if (objZzf != null && zzq(i151) != null) {
                throw null;
            }
        }
        if (i18 == 0) {
            if (iZzl != i16) {
                throw zzfb.zzd();
            }
        } else if (iZzl > i16 || i23 != i18) {
            throw zzfb.zzd();
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iZzo = zzo(i13);
                int i14 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j13 = i14;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i13)) {
                                    zzr(i13).zze(zzb.getObject(obj, j13));
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
                                this.zzk.zza(obj, j13);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j13, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i13], i13)) {
                        zzr(i13).zze(zzb.getObject(obj, j13));
                    }
                } else if (zzE(obj, i13)) {
                    zzr(i13).zze(zzb.getObject(obj, j13));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzo = zzo(i13);
            int i14 = this.zzc[i13];
            long j13 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i13)) {
                        zzhj.zzl(obj, j13, zzhj.zza(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i13)) {
                        zzhj.zzm(obj, j13, zzhj.zzb(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i13)) {
                        zzhj.zzo(obj, j13, zzhj.zzd(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i13)) {
                        zzhj.zzo(obj, j13, zzhj.zzd(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i13)) {
                        zzhj.zzo(obj, j13, zzhj.zzd(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i13)) {
                        zzhj.zzk(obj, j13, zzhj.zzt(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i13)) {
                        zzhj.zzp(obj, j13, zzhj.zzf(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i13);
                    break;
                case 10:
                    if (zzE(obj2, i13)) {
                        zzhj.zzp(obj, j13, zzhj.zzf(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i13)) {
                        zzhj.zzo(obj, j13, zzhj.zzd(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i13)) {
                        zzhj.zzn(obj, j13, zzhj.zzc(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i13)) {
                        zzhj.zzo(obj, j13, zzhj.zzd(obj2, j13));
                        zzz(obj, i13);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i13);
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
                    this.zzk.zzb(obj, obj2, j13);
                    break;
                case 50:
                    int i15 = zzgk.zza;
                    zzhj.zzp(obj, j13, zzfs.zza(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13)));
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
                    if (zzI(obj2, i14, i13)) {
                        zzhj.zzp(obj, j13, zzhj.zzf(obj2, j13));
                        zzA(obj, i14, i13);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i13);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzI(obj2, i14, i13)) {
                        zzhj.zzp(obj, j13, zzhj.zzf(obj2, j13));
                        zzA(obj, i14, i13);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i13);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i13, int i14, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i13, i14, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzo = zzo(i13);
            long j13 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i13) || Double.doubleToLongBits(zzhj.zza(obj, j13)) != Double.doubleToLongBits(zzhj.zza(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i13) || Float.floatToIntBits(zzhj.zzb(obj, j13)) != Float.floatToIntBits(zzhj.zzb(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i13) || zzhj.zzd(obj, j13) != zzhj.zzd(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i13) || zzhj.zzd(obj, j13) != zzhj.zzd(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i13) || zzhj.zzd(obj, j13) != zzhj.zzd(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i13) || zzhj.zzt(obj, j13) != zzhj.zzt(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i13) || !zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i13) || !zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i13) || !zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i13) || zzhj.zzd(obj, j13) != zzhj.zzd(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i13) || zzhj.zzc(obj, j13) != zzhj.zzc(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i13) || zzhj.zzd(obj, j13) != zzhj.zzd(obj2, j13)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i13) || !zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                case 68:
                    long jZzl = zzl(i13) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j13), zzhj.zzf(obj2, j13))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i13;
        int i14;
        List list;
        zzgi zzgiVarZzr;
        int i15;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i17 < this.zzi) {
            int i19 = this.zzh[i17];
            int i23 = this.zzc[i19];
            int iZzo = zzo(i19);
            int i24 = this.zzc[i19 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i18) {
                if (i25 != 1048575) {
                    i16 = zzb.getInt(obj, i25);
                }
                i14 = i16;
                i13 = i25;
            } else {
                i13 = i18;
                i14 = i16;
            }
            if ((268435456 & iZzo) != 0 && !zzF(obj, i19, i13, i14, i26)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj, i19, i13, i14, i26) && !zzG(obj, iZzo, zzr(i19))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i19);
                    for (i15 = 0; i15 < list.size(); i15++) {
                        if (!zzgiVarZzr.zzi(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj, i23, i19) && !zzG(obj, iZzo, zzr(i19))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i19);
                    while (i15 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i15))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i17++;
            i18 = i13;
            i16 = i14;
        }
        return true;
    }
}
