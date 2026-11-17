package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu {
    static int zza(byte[] bArr, int i13, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i13, zzdtVar);
        int i14 = zzdtVar.zza;
        if (i14 < 0) {
            throw zzfb.zzc();
        }
        if (i14 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i14 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i14);
        return iZzh + i14;
    }

    static int zzb(byte[] bArr, int i13) {
        int i14 = bArr[i13] & 255;
        int i15 = bArr[i13 + 1] & 255;
        int i16 = bArr[i13 + 2] & 255;
        return ((bArr[i13 + 3] & 255) << 24) | (i15 << 8) | i14 | (i16 << 16);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i13, int i14, int i15, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i13, i14, i15, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i13, int i14, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i13, i14, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    static int zze(zzgi zzgiVar, int i13, byte[] bArr, int i14, int i15, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i14, i15, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i15) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i13 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i15, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i13, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i13, zzdtVar);
        int i14 = zzdtVar.zza + iZzh;
        while (iZzh < i14) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i14) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i13, byte[] bArr, int i14, int i15, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i13 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int iZzk = zzk(bArr, i14, zzdtVar);
            zzhaVar.zzh(i13, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i16 == 1) {
            zzhaVar.zzh(i13, Long.valueOf(zzn(bArr, i14)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int iZzh = zzh(bArr, i14, zzdtVar);
            int i17 = zzdtVar.zza;
            if (i17 < 0) {
                throw zzfb.zzc();
            }
            if (i17 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i17 == 0) {
                zzhaVar.zzh(i13, zzef.zzb);
            } else {
                zzhaVar.zzh(i13, zzef.zzk(bArr, iZzh, i17));
            }
            return iZzh + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i13, Integer.valueOf(zzb(bArr, i14)));
            return i14 + 4;
        }
        int i18 = (i13 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i19 = 0;
        while (i14 < i15) {
            int iZzh2 = zzh(bArr, i14, zzdtVar);
            int i23 = zzdtVar.zza;
            i19 = i23;
            if (i23 == i18) {
                i14 = iZzh2;
                break;
            }
            int iZzg = zzg(i19, bArr, iZzh2, i15, zzhaVarZzd, zzdtVar);
            i19 = i23;
            i14 = iZzg;
        }
        if (i14 > i15 || i19 != i18) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i13, zzhaVarZzd);
        return i14;
    }

    static int zzh(byte[] bArr, int i13, zzdt zzdtVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return zzi(b13, bArr, i14, zzdtVar);
        }
        zzdtVar.zza = b13;
        return i14;
    }

    static int zzi(int i13, byte[] bArr, int i14, zzdt zzdtVar) {
        byte b13 = bArr[i14];
        int i15 = i14 + 1;
        int i16 = i13 & 127;
        if (b13 >= 0) {
            zzdtVar.zza = i16 | (b13 << 7);
            return i15;
        }
        int i17 = i16 | ((b13 & 127) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i15];
        if (b14 >= 0) {
            zzdtVar.zza = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & 127) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            zzdtVar.zza = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & 127) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            zzdtVar.zza = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & 127) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                zzdtVar.zza = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    static int zzj(int i13, byte[] bArr, int i14, int i15, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i14, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i15) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i13 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i13, zzdt zzdtVar) {
        long j13 = bArr[i13];
        int i14 = i13 + 1;
        if (j13 >= 0) {
            zzdtVar.zzb = j13;
            return i14;
        }
        int i15 = i13 + 2;
        byte b13 = bArr[i14];
        long j14 = (j13 & 127) | (((long) (b13 & 127)) << 7);
        int i16 = 7;
        while (b13 < 0) {
            int i17 = i15 + 1;
            byte b14 = bArr[i15];
            i16 += 7;
            j14 |= ((long) (b14 & 127)) << i16;
            b13 = b14;
            i15 = i17;
        }
        zzdtVar.zzb = j14;
        return i15;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i13, int i14, int i15, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i13, i14, i15, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i13, int i14, zzdt zzdtVar) throws IOException {
        int iZzi = i13 + 1;
        int i15 = bArr[i13];
        if (i15 < 0) {
            iZzi = zzi(i15, bArr, iZzi, zzdtVar);
            i15 = zzdtVar.zza;
        }
        int i16 = iZzi;
        if (i15 < 0 || i15 > i14 - i16) {
            throw zzfb.zzf();
        }
        int i17 = i15 + i16;
        zzgiVar.zzg(obj, bArr, i16, i17, zzdtVar);
        zzdtVar.zzc = obj;
        return i17;
    }

    static long zzn(byte[] bArr, int i13) {
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48) | ((((long) bArr[i13 + 7]) & 255) << 56);
    }
}
