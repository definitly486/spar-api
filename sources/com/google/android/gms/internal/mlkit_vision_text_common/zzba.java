package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzba extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzba() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object zzg(zzba zzbaVar, int i13) {
        return zzbaVar.zzB()[i13];
    }

    static /* synthetic */ Object zzi(zzba zzbaVar) {
        Object obj = zzbaVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object zzj(zzba zzbaVar, int i13) {
        return zzbaVar.zzC()[i13];
    }

    static /* synthetic */ void zzn(zzba zzbaVar, int i13, Object obj) {
        zzbaVar.zzC()[i13] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzbb.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i13 = ~iZzv;
            int i14 = iZza & i13;
            do {
                int i15 = iZzc - 1;
                int i16 = zzA()[i15];
                if ((i16 & i13) == i14 && zzw.zza(obj, zzB()[i15])) {
                    return i15;
                }
                iZzc = i16 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i13, int i14, int i15, int i16) {
        int i17 = i14 - 1;
        Object objZzd = zzbb.zzd(i14);
        if (i16 != 0) {
            zzbb.zze(objZzd, i15 & i17, i16 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i18 = 0; i18 <= i13; i18++) {
            int iZzc = zzbb.zzc(obj, i18);
            while (iZzc != 0) {
                int i19 = iZzc - 1;
                int i23 = iArrZzA[i19];
                int i24 = ((~i13) & i23) | i18;
                int i25 = i24 & i17;
                int iZzc2 = zzbb.zzc(objZzd, i25);
                zzbb.zze(objZzd, i25, iZzc);
                iArrZzA[i19] = ((~i17) & i24) | (iZzc2 & i17);
                iZzc = i23 & i13;
            }
        }
        this.zze = objZzd;
        zzz(i17);
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzbb.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i13) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcq.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i13 = 0; i13 < this.zzg; i13++) {
            if (zzw.zza(obj, zzC()[i13])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzau zzauVar = new zzau(this);
        this.zzi = zzauVar;
        return zzauVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzax zzaxVar = new zzax(this);
        this.zzh = zzaxVar;
        return zzaxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (zzr()) {
            zzx.zzd(zzr(), "Arrays already allocated");
            int i13 = this.zzf;
            int iMax = Math.max(i13 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbb.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i13];
            this.zzb = new Object[i13];
            this.zzc = new Object[i13];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i14 = this.zzg;
        int i15 = i14 + 1;
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        int i16 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzbb.zzc(obj3, i16);
        if (iZzc != 0) {
            int i17 = ~iZzv;
            int i18 = iZza & i17;
            int i19 = 0;
            while (true) {
                int i23 = iZzc - 1;
                int i24 = iArrZzA[i23];
                int i25 = i24 & i17;
                if (i25 == i18 && zzw.zza(obj, objArrZzB[i23])) {
                    Object obj4 = objArrZzC[i23];
                    objArrZzC[i23] = obj2;
                    return obj4;
                }
                int i26 = i24 & iZzv;
                i19++;
                if (i26 == 0) {
                    if (i19 < 9) {
                        if (i15 <= iZzv) {
                            iArrZzA[i23] = (i15 & iZzv) | i25;
                            break;
                        }
                        iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i14);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i26;
            }
        } else if (i15 > iZzv) {
            iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i14);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzbb.zze(obj5, i16, i15);
        }
        int length = zzA().length;
        if (i15 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), iMin);
            this.zzb = Arrays.copyOf(zzB(), iMin);
            this.zzc = Arrays.copyOf(zzC(), iMin);
        }
        zzA()[i14] = (~iZzv) & iZza;
        zzB()[i14] = obj;
        zzC()[i14] = obj2;
        this.zzg = i15;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzaz zzazVar = new zzaz(this);
        this.zzj = zzazVar;
        return zzazVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i13) {
        int i14 = i13 + 1;
        if (i14 < this.zzg) {
            return i14;
        }
        return -1;
    }

    final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i13) {
        this.zzf = zzcq.zza(i13, 1, 1073741823);
    }

    final void zzq(int i13, int i14) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i15 = size - 1;
        if (i13 >= i15) {
            objArrZzB[i13] = null;
            objArrZzC[i13] = null;
            iArrZzA[i13] = 0;
            return;
        }
        int i16 = i13 + 1;
        Object obj2 = objArrZzB[i15];
        objArrZzB[i13] = obj2;
        objArrZzC[i13] = objArrZzC[i15];
        objArrZzB[i15] = null;
        objArrZzC[i15] = null;
        iArrZzA[i13] = iArrZzA[i15];
        iArrZzA[i15] = 0;
        int iZza = zzbc.zza(obj2) & i14;
        int iZzc = zzbb.zzc(obj, iZza);
        if (iZzc == size) {
            zzbb.zze(obj, iZza, i16);
            return;
        }
        while (true) {
            int i17 = iZzc - 1;
            int i18 = iArrZzA[i17];
            int i19 = i18 & i14;
            if (i19 == size) {
                iArrZzA[i17] = (i18 & (~i14)) | (i14 & i16);
                return;
            }
            iZzc = i19;
        }
    }

    final boolean zzr() {
        return this.zze == null;
    }

    zzba(int i13) {
        zzp(12);
    }
}
