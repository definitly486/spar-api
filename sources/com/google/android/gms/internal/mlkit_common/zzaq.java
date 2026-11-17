package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i13) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i13;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013b A[PHI: r5
      0x013b: PHI (r5v5 ??) = (r5v2 ??), (r5v6 short[]) binds: [B:74:0x01a5, B:57:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzaq zzg(int i13, Object[] objArr, zzah zzahVar) {
        int iHighestOneBit;
        short[] sArr;
        char c13;
        char c14;
        ?? r13;
        ?? r14;
        int i14 = i13;
        Object[] objArrCopyOf = objArr;
        if (i14 == 0) {
            return (zzaq) zza;
        }
        zzag zzagVar = null;
        ?? r15 = 0;
        zzag zzagVar2 = null;
        zzag zzagVar3 = null;
        int i15 = 1;
        if (i14 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzw.zza(obj, obj2);
            return new zzaq(null, objArrCopyOf, 1);
        }
        zzt.zzb(i14, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i14, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i14 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            i14 = 1;
            c13 = 1;
            c14 = 2;
        } else {
            int i16 = iHighestOneBit - 1;
            byte b13 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i18 + i18;
                    int i23 = i17 + i17;
                    Object obj5 = objArrCopyOf[i23];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i23 ^ i15];
                    Objects.requireNonNull(obj6);
                    zzw.zza(obj5, obj6);
                    int iZza = zzy.zza(obj5.hashCode());
                    while (true) {
                        int i24 = iZza & i16;
                        int i25 = bArr[i24] & 255;
                        if (i25 == 255) {
                            bArr[i24] = (byte) i19;
                            if (i18 < i17) {
                                objArrCopyOf[i19] = obj5;
                                objArrCopyOf[i19 ^ 1] = obj6;
                            }
                            i18++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                            int i26 = ~i25;
                            Object obj7 = objArrCopyOf[i26 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzag zzagVar4 = new zzag(obj5, obj6, obj7);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj6;
                            zzagVar2 = zzagVar4;
                            break;
                        }
                        iZza = i24 + 1;
                    }
                    i17++;
                    i15 = 1;
                }
                if (i18 == i14) {
                    r13 = bArr;
                } else {
                    r14 = new Object[]{bArr, Integer.valueOf(i18), zzagVar2};
                    c14 = 2;
                }
                c13 = 1;
                r15 = r14;
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i27 = 0;
                for (int i28 = 0; i28 < i14; i28++) {
                    int i29 = i27 + i27;
                    int i33 = i28 + i28;
                    Object obj8 = objArrCopyOf[i33];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArrCopyOf[i33 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzw.zza(obj8, obj9);
                    int iZza2 = zzy.zza(obj8.hashCode());
                    while (true) {
                        int i34 = iZza2 & i16;
                        char c15 = (char) sArr[i34];
                        if (c15 == 65535) {
                            sArr[i34] = (short) i29;
                            if (i27 < i28) {
                                objArrCopyOf[i29] = obj8;
                                objArrCopyOf[i29 ^ 1] = obj9;
                            }
                            i27++;
                            break;
                        }
                        if (obj8.equals(objArrCopyOf[c15])) {
                            int i35 = c15 ^ 1;
                            Object obj10 = objArrCopyOf[i35 == true ? 1 : 0];
                            Objects.requireNonNull(obj10);
                            zzag zzagVar5 = new zzag(obj8, obj9, obj10);
                            objArrCopyOf[i35 == true ? 1 : 0] = obj9;
                            zzagVar3 = zzagVar5;
                            break;
                        }
                        iZza2 = i34 + 1;
                    }
                }
                if (i27 == i14) {
                    r13 = sArr;
                } else {
                    c14 = 2;
                    r15 = new Object[]{sArr, Integer.valueOf(i27), zzagVar3};
                    c13 = 1;
                }
            } else {
                int i36 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i37 = 0;
                int i38 = 0;
                while (i37 < i14) {
                    int i39 = i38 + i38;
                    int i43 = i37 + i37;
                    Object obj11 = objArrCopyOf[i43];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i43 ^ i36];
                    Objects.requireNonNull(obj12);
                    zzw.zza(obj11, obj12);
                    int iZza3 = zzy.zza(obj11.hashCode());
                    while (true) {
                        int i44 = iZza3 & i16;
                        ?? r16 = sArr[i44];
                        if (r16 == b13) {
                            sArr[i44] = i39;
                            if (i38 < i37) {
                                objArrCopyOf[i39] = obj11;
                                objArrCopyOf[i39 ^ 1] = obj12;
                            }
                            i38++;
                            break;
                        }
                        if (obj11.equals(objArrCopyOf[r16])) {
                            int i45 = r16 ^ 1;
                            Object obj13 = objArrCopyOf[i45 == true ? 1 : 0];
                            Objects.requireNonNull(obj13);
                            zzag zzagVar6 = new zzag(obj11, obj12, obj13);
                            objArrCopyOf[i45 == true ? 1 : 0] = obj12;
                            zzagVar = zzagVar6;
                            break;
                        }
                        iZza3 = i44 + 1;
                        b13 = -1;
                    }
                    i37++;
                    i36 = 1;
                    b13 = -1;
                }
                if (i38 == i14) {
                    r13 = sArr;
                } else {
                    c13 = 1;
                    c14 = 2;
                    r15 = new Object[]{sArr, Integer.valueOf(i38), zzagVar};
                }
            }
            c14 = 2;
            r14 = r13;
            c13 = 1;
            r15 = r14;
        }
        boolean z13 = r15 instanceof Object[];
        ?? r17 = r15;
        if (z13) {
            Object[] objArr2 = (Object[]) r15;
            zzag zzagVar7 = (zzag) objArr2[c14];
            if (zzahVar == null) {
                throw zzagVar7.zza();
            }
            zzahVar.zzc = zzagVar7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c13]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r17 = obj14;
            i14 = iIntValue;
        }
        return new zzaq(r17, objArrCopyOf, i14);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i13 = this.zzd;
            Object[] objArr = this.zzb;
            if (i13 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzy.zza(obj.hashCode());
                    while (true) {
                        int i14 = iZza & length;
                        int i15 = bArr[i14] & 255;
                        if (i15 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iZza = i14 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzy.zza(obj.hashCode());
                    while (true) {
                        int i16 = iZza2 & length2;
                        char c13 = (char) sArr[i16];
                        if (c13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c13])) {
                            obj2 = objArr[c13 ^ 1];
                        } else {
                            iZza2 = i16 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzy.zza(obj.hashCode());
                    while (true) {
                        int i17 = iZza3 & length3;
                        int i18 = iArr[i17];
                        if (i18 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i18])) {
                            obj2 = objArr[i18 ^ 1];
                        } else {
                            iZza3 = i17 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
