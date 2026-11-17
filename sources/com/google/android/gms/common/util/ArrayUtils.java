package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i13 = 1; i13 < tArr.length; i13++) {
            T[] tArr4 = tArr[i13];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i13 = 1; i13 < bArr.length; i13++) {
            byte[] bArr3 = bArr[i13];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    @KeepForSdk
    public static boolean contains(int[] iArr, int i13) {
        if (iArr != null) {
            for (int i14 : iArr) {
                if (i14 == i13) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i13;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i13 = 0;
            for (T t13 : tArr) {
                if (!Objects.equal(tArr2[0], t13)) {
                    tArr3[i13] = t13;
                    i13++;
                }
            }
        } else {
            int i14 = 0;
            for (T t14 : tArr) {
                if (!contains(tArr2, t14)) {
                    tArr3[i14] = t14;
                    i14++;
                }
            }
            i13 = i14;
        }
        if (tArr3 == null) {
            return null;
        }
        return i13 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i13);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t13 : tArr) {
            arrayList.add(t13);
        }
        return arrayList;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i13 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i13] = it.next().intValue();
            i13++;
        }
        return iArr;
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i13 = 0; i13 < length; i13++) {
            numArr[i13] = Integer.valueOf(iArr[i13]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, double[] dArr) {
        int length = dArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(dArr[i13]);
        }
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder sb3, String[] strArr) {
        int length = strArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append("\"");
            sb3.append(strArr[i13]);
            sb3.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(T[] tArr, T t13) {
        int length = tArr != null ? tArr.length : 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (Objects.equal(tArr[i13], t13)) {
                if (i13 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, float[] fArr) {
        int length = fArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(fArr[i13]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, int[] iArr) {
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(iArr[i13]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, long[] jArr) {
        int length = jArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(jArr[i13]);
        }
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder sb3, T[] tArr) {
        int length = tArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(tArr[i13]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, boolean[] zArr) {
        int length = zArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != 0) {
                sb3.append(StringUtils.COMMA);
            }
            sb3.append(zArr[i13]);
        }
    }
}
