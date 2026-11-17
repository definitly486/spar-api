package com.google.android.gms.common.util;

import androidx.collection.zoijcleaow;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k13, V v13, K k14, V v14, K k15, V v15) {
        Map mapZza = zza(3, false);
        mapZza.put(k13, v13);
        mapZza.put(k14, v14);
        mapZza.put(k15, v15);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i13 = 0; i13 < kArr.length; i13++) {
            mapZza.put(kArr[i13], vArr[i13]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i13) {
        return i13 == 0 ? new zoijcleaow() : zzb(i13, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t13, T t14, T t15) {
        Set setZzb = zzb(3, false);
        setZzb.add(t13);
        setZzb.add(t14);
        setZzb.add(t15);
        return Collections.unmodifiableSet(setZzb);
    }

    private static Map zza(int i13, boolean z13) {
        return i13 <= 256 ? new androidx.collection.iobyxmoadg(i13) : new HashMap(i13, 1.0f);
    }

    private static Set zzb(int i13, boolean z13) {
        if (i13 <= (true != z13 ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN)) {
            return new zoijcleaow(i13);
        }
        return new HashSet(i13, true != z13 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t13) {
        return Collections.singletonList(t13);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        Map mapZza = zza(6, false);
        mapZza.put(k13, v13);
        mapZza.put(k14, v14);
        mapZza.put(k15, v15);
        mapZza.put(k16, v16);
        mapZza.put(k17, v17);
        mapZza.put(k18, v18);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t13 = tArr[0];
            T t14 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t13);
            setZzb.add(t14);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t15 = tArr[0];
        T t16 = tArr[1];
        T t17 = tArr[2];
        T t18 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t15);
        setZzb3.add(t16);
        setZzb3.add(t17);
        setZzb3.add(t18);
        return Collections.unmodifiableSet(setZzb3);
    }
}
