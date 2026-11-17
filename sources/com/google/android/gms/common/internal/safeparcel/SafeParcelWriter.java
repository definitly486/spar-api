package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i13) {
        zzb(parcel, i13);
    }

    public static void writeBigDecimal(Parcel parcel, int i13, BigDecimal bigDecimal, boolean z13) {
        if (bigDecimal == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i13, BigDecimal[] bigDecimalArr, boolean z13) {
        if (bigDecimalArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i14 = 0; i14 < length; i14++) {
            parcel.writeByteArray(bigDecimalArr[i14].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i14].scale());
        }
        zzb(parcel, iZza);
    }

    public static void writeBigInteger(Parcel parcel, int i13, BigInteger bigInteger, boolean z13) {
        if (bigInteger == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i13, BigInteger[] bigIntegerArr, boolean z13) {
        if (bigIntegerArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, iZza);
    }

    public static void writeBoolean(Parcel parcel, int i13, boolean z13) {
        zzc(parcel, i13, 4);
        parcel.writeInt(z13 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i13, boolean[] zArr, boolean z13) {
        if (zArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i13, List<Boolean> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(list.get(i14).booleanValue() ? 1 : 0);
        }
        zzb(parcel, iZza);
    }

    public static void writeBooleanObject(Parcel parcel, int i13, Boolean bool, boolean z13) {
        if (bool != null) {
            zzc(parcel, i13, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z13) {
            zzc(parcel, i13, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i13, Bundle bundle, boolean z13) {
        if (bundle == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeBundle(bundle);
            zzb(parcel, iZza);
        }
    }

    public static void writeByte(Parcel parcel, int i13, byte b13) {
        zzc(parcel, i13, 4);
        parcel.writeInt(b13);
    }

    public static void writeByteArray(Parcel parcel, int i13, byte[] bArr, boolean z13) {
        if (bArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeByteArray(bArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i13, byte[][] bArr, boolean z13) {
        if (bArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, iZza);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i13, SparseArray<byte[]> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            parcel.writeByteArray(sparseArray.valueAt(i14));
        }
        zzb(parcel, iZza);
    }

    public static void writeChar(Parcel parcel, int i13, char c13) {
        zzc(parcel, i13, 4);
        parcel.writeInt(c13);
    }

    public static void writeCharArray(Parcel parcel, int i13, char[] cArr, boolean z13) {
        if (cArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeCharArray(cArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDouble(Parcel parcel, int i13, double d13) {
        zzc(parcel, i13, 8);
        parcel.writeDouble(d13);
    }

    public static void writeDoubleArray(Parcel parcel, int i13, double[] dArr, boolean z13) {
        if (dArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i13, List<Double> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeDouble(list.get(i14).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeDoubleObject(Parcel parcel, int i13, Double d13, boolean z13) {
        if (d13 != null) {
            zzc(parcel, i13, 8);
            parcel.writeDouble(d13.doubleValue());
        } else if (z13) {
            zzc(parcel, i13, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i13, SparseArray<Double> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            parcel.writeDouble(sparseArray.valueAt(i14).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloat(Parcel parcel, int i13, float f13) {
        zzc(parcel, i13, 4);
        parcel.writeFloat(f13);
    }

    public static void writeFloatArray(Parcel parcel, int i13, float[] fArr, boolean z13) {
        if (fArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeFloatArray(fArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeFloatList(Parcel parcel, int i13, List<Float> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeFloat(list.get(i14).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloatObject(Parcel parcel, int i13, Float f13, boolean z13) {
        if (f13 != null) {
            zzc(parcel, i13, 4);
            parcel.writeFloat(f13.floatValue());
        } else if (z13) {
            zzc(parcel, i13, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i13, SparseArray<Float> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            parcel.writeFloat(sparseArray.valueAt(i14).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIBinder(Parcel parcel, int i13, IBinder iBinder, boolean z13) {
        if (iBinder == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i13, IBinder[] iBinderArr, boolean z13) {
        if (iBinderArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i13, List<IBinder> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeBinderList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i13, SparseArray<IBinder> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            parcel.writeStrongBinder(sparseArray.valueAt(i14));
        }
        zzb(parcel, iZza);
    }

    public static void writeInt(Parcel parcel, int i13, int i14) {
        zzc(parcel, i13, 4);
        parcel.writeInt(i14);
    }

    public static void writeIntArray(Parcel parcel, int i13, int[] iArr, boolean z13) {
        if (iArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeIntArray(iArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i13, List<Integer> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(list.get(i14).intValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIntegerObject(Parcel parcel, int i13, Integer num, boolean z13) {
        if (num != null) {
            zzc(parcel, i13, 4);
            parcel.writeInt(num.intValue());
        } else if (z13) {
            zzc(parcel, i13, 0);
        }
    }

    public static void writeList(Parcel parcel, int i13, List list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeLong(Parcel parcel, int i13, long j13) {
        zzc(parcel, i13, 8);
        parcel.writeLong(j13);
    }

    public static void writeLongArray(Parcel parcel, int i13, long[] jArr, boolean z13) {
        if (jArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeLongArray(jArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeLongList(Parcel parcel, int i13, List<Long> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeLong(list.get(i14).longValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeLongObject(Parcel parcel, int i13, Long l13, boolean z13) {
        if (l13 != null) {
            zzc(parcel, i13, 8);
            parcel.writeLong(l13.longValue());
        } else if (z13) {
            zzc(parcel, i13, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i13, Parcel parcel2, boolean z13) {
        if (parcel2 == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, iZza);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i13, Parcel[] parcelArr, boolean z13) {
        if (parcelArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelList(Parcel parcel, int i13, List<Parcel> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            Parcel parcel2 = list.get(i14);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i13, SparseArray<Parcel> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            Parcel parcelValueAt = sparseArray.valueAt(i14);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelable(Parcel parcel, int i13, Parcelable parcelable, int i14, boolean z13) {
        if (parcelable == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcelable.writeToParcel(parcel, i14);
            zzb(parcel, iZza);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i13, PendingIntent pendingIntent, boolean z13) {
        if (pendingIntent == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, iZza);
        }
    }

    public static void writeShort(Parcel parcel, int i13, short s13) {
        zzc(parcel, i13, 4);
        parcel.writeInt(s13);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i13, SparseBooleanArray sparseBooleanArray, boolean z13) {
        if (sparseBooleanArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, iZza);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i13, SparseIntArray sparseIntArray, boolean z13) {
        if (sparseIntArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseIntArray.keyAt(i14));
            parcel.writeInt(sparseIntArray.valueAt(i14));
        }
        zzb(parcel, iZza);
    }

    public static void writeSparseLongArray(Parcel parcel, int i13, SparseLongArray sparseLongArray, boolean z13) {
        if (sparseLongArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseLongArray.keyAt(i14));
            parcel.writeLong(sparseLongArray.valueAt(i14));
        }
        zzb(parcel, iZza);
    }

    public static void writeString(Parcel parcel, int i13, String str, boolean z13) {
        if (str == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeString(str);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringArray(Parcel parcel, int i13, String[] strArr, boolean z13) {
        if (strArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeStringArray(strArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringList(Parcel parcel, int i13, List<String> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
            }
        } else {
            int iZza = zza(parcel, i13);
            parcel.writeStringList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i13, SparseArray<String> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            parcel.writeString(sparseArray.valueAt(i14));
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i13, T[] tArr, int i14, boolean z13) {
        if (tArr == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        parcel.writeInt(tArr.length);
        for (T t13 : tArr) {
            if (t13 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t13, i14);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i13, List<T> list, boolean z13) {
        if (list == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            T t13 = list.get(i14);
            if (t13 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t13, 0);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i13, SparseArray<T> sparseArray, boolean z13) {
        if (sparseArray == null) {
            if (z13) {
                zzc(parcel, i13, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i13);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(sparseArray.keyAt(i14));
            T tValueAt = sparseArray.valueAt(i14);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzb(parcel, iZza);
    }

    private static int zza(Parcel parcel, int i13) {
        parcel.writeInt(i13 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i13) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i13 - 4);
        parcel.writeInt(iDataPosition - i13);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzc(Parcel parcel, int i13, int i14) {
        parcel.writeInt(i13 | (i14 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i13) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i13);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
