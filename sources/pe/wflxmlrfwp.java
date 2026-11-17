package pe;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final zzv f76463iobyxmoadg = zzv.zza("\n");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Comparator f76464zoijcleaow = new Comparator() { // from class: pe.nufgyqmvbu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzv zzvVar = wflxmlrfwp.f76463iobyxmoadg;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    static oe.iobyxmoadg iobyxmoadg(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i13 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i14 = 0;
        while (i14 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i14);
            zzbh zzbhVar2 = new zzbh();
            for (int i15 = i13; i15 < sparseArray3.size(); i15++) {
                zzbhVar2.zza((zzl) sparseArray3.valueAt(i15));
            }
            zzbk zzbkVarZzb = zzbhVar2.zzb();
            List listZza = zzbu.zza(zzbkVarZzb, new zzu() { // from class: pe.btonecajqb
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzl zzlVar2 = (zzl) obj;
                    zzv zzvVar = wflxmlrfwp.f76463iobyxmoadg;
                    List listZoijcleaow = eablkybsjg.zoijcleaow(zzlVar2.zzb);
                    String str = zzy.zzb(zzlVar2.zze) ? "" : zzlVar2.zze;
                    Rect rectIobyxmoadg = eablkybsjg.iobyxmoadg(listZoijcleaow);
                    String str2 = zzy.zzb(zzlVar2.zzg) ? "und" : zzlVar2.zzg;
                    final Matrix matrix2 = matrix;
                    return new oe.iobyxmoadg.zoijcleaow(str, rectIobyxmoadg, listZoijcleaow, str2, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: pe.draadjrbmk
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            zzr zzrVar = (zzr) obj2;
                            zzv zzvVar2 = wflxmlrfwp.f76463iobyxmoadg;
                            List listZoijcleaow2 = eablkybsjg.zoijcleaow(zzrVar.zzb);
                            return new oe.iobyxmoadg.C1577iobyxmoadg(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, eablkybsjg.iobyxmoadg(listZoijcleaow2), listZoijcleaow2, zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            zzf zzfVar = ((zzl) zzbkVarZzb.get(i13)).zzb;
            zzcp zzcpVarListIterator = zzbkVarZzb.listIterator(i13);
            int iMax = Integer.MIN_VALUE;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (zzcpVarListIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) zzcpVarListIterator.next()).zzb;
                int i16 = -zzfVar.zza;
                int i17 = -zzfVar.zzb;
                List list = listZza;
                double dSin = Math.sin(Math.toRadians(zzfVar.zze));
                zzcp zzcpVar = zzcpVarListIterator;
                double dCos = Math.cos(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i18 = i14;
                zzbh zzbhVar3 = zzbhVar;
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                point.offset(i16, i17);
                Point[] pointArr = {point, new Point(zzfVar2.zzc + i, i), new Point(zzfVar2.zzc + i, zzfVar2.zzd + i), new Point(i, i + zzfVar2.zzd)};
                Point point2 = pointArr[0];
                int i19 = point2.x;
                int i23 = point2.y;
                int i24 = iMax;
                double d13 = ((double) i23) * dSin;
                int i25 = iMin;
                double d14 = ((double) (-i19)) * dSin;
                double d15 = ((double) i23) * dCos;
                int i26 = (int) ((((double) i19) * dCos) + d13);
                point2.x = i26;
                int i27 = (int) (d14 + d15);
                point2.y = i27;
                iMax = i24;
                iMax2 = iMax2;
                iMin = i25;
                iMin2 = iMin2;
                int i28 = 0;
                for (int i29 = 4; i28 < i29; i29 = 4) {
                    Point point3 = pointArr[i28];
                    iMin = Math.min(iMin, point3.x);
                    iMax = Math.max(iMax, point3.x);
                    iMin2 = Math.min(iMin2, point3.y);
                    iMax2 = Math.max(iMax2, point3.y);
                    i28++;
                }
                listZza = list;
                zzcpVarListIterator = zzcpVar;
                sparseArray = sparseArray4;
                i14 = i18;
                zzbhVar = zzbhVar3;
            }
            zzbh zzbhVar4 = zzbhVar;
            SparseArray sparseArray5 = sparseArray;
            int i33 = i14;
            int i34 = iMax;
            int i35 = iMax2;
            int i36 = iMin;
            List list2 = listZza;
            int i37 = zzfVar.zza;
            int i38 = zzfVar.zzb;
            double dSin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double dCos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i36, iMin2), new Point(i34, iMin2), new Point(i34, i35), new Point(i36, i35)};
            int i39 = 0;
            for (int i43 = 4; i39 < i43; i43 = 4) {
                Point point4 = pointArr2[i39];
                int i44 = point4.x;
                int i45 = point4.y;
                point4.x = (int) ((((double) i44) * dCos2) - (((double) i45) * dSin2));
                point4.y = (int) ((((double) i44) * dSin2) + (((double) i45) * dCos2));
                point4.offset(i37, i38);
                i39++;
                dSin2 = dSin2;
            }
            List listAsList = Arrays.asList(pointArr2);
            zzbhVar4.zza(new oe.iobyxmoadg.eablkybsjg(f76463iobyxmoadg.zzb(zzbu.zza(list2, new zzu() { // from class: pe.gtknphoqwx
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((oe.iobyxmoadg.zoijcleaow) obj).ppxfxbqfkf();
                }
            })), eablkybsjg.iobyxmoadg(listAsList), listAsList, zoijcleaow(list2), matrix, list2));
            i14 = i33 + 1;
            zzbhVar = zzbhVar4;
            sparseArray = sparseArray5;
            i13 = 0;
        }
        zzbk zzbkVarZzb2 = zzbhVar.zzb();
        return new oe.iobyxmoadg(f76463iobyxmoadg.zzb(zzbu.zza(zzbkVarZzb2, new zzu() { // from class: pe.dxjokdxxww
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((oe.iobyxmoadg.eablkybsjg) obj).ppxfxbqfkf();
            }
        })), zzbkVarZzb2);
    }

    private static String zoijcleaow(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strIobyxmoadg = ((oe.iobyxmoadg.zoijcleaow) it.next()).iobyxmoadg();
            map.put(strIobyxmoadg, Integer.valueOf((map.containsKey(strIobyxmoadg) ? ((Integer) map.get(strIobyxmoadg)).intValue() : 0) + 1));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(setEntrySet, f76464zoijcleaow)).getKey();
        return !zzy.zzb(str) ? str : "und";
    }
}
