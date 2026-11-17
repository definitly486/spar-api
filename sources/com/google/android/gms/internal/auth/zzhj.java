package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z13;
        boolean z14;
        zzhi zzhiVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        int i13 = zzds.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zzd = zZzs;
        boolean zZzs2 = zzs(Integer.TYPE);
        zzhi zzhgVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhgVar = new zzhh(unsafeZzg);
            } else if (zZzs2) {
                zzhgVar = new zzhg(unsafeZzg);
            }
        }
        zze = zzhgVar;
        if (zzhgVar == null) {
            z13 = false;
        } else {
            try {
                Class<?> cls2 = zzhgVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (zzy() == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } catch (Throwable th2) {
                zzh(th2);
            }
        }
        zzf = z13;
        zzhi zzhiVar2 = zze;
        if (zzhiVar2 == null) {
            z14 = false;
        } else {
            try {
                Class<?> cls3 = zzhiVar2.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z14 = true;
            } catch (Throwable th3) {
                zzh(th3);
                z14 = false;
            }
        }
        zzg = z14;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhiVar = zze) != null) {
            zzhiVar.zza.objectFieldOffset(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    static double zza(Object obj, long j13) {
        return zze.zza(obj, j13);
    }

    static float zzb(Object obj, long j13) {
        return zze.zzb(obj, j13);
    }

    static int zzc(Object obj, long j13) {
        return zze.zza.getInt(obj, j13);
    }

    static long zzd(Object obj, long j13) {
        return zze.zza.getLong(obj, j13);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    static Object zzf(Object obj, long j13) {
        return zze.zza.getObject(obj, j13);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j13, boolean z13) {
        zzhi zzhiVar = zze;
        long j14 = (-4) & j13;
        int i13 = zzhiVar.zza.getInt(obj, j14);
        int i14 = ((~((int) j13)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j14, ((z13 ? 1 : 0) << i14) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i14)) & i13));
    }

    static /* synthetic */ void zzj(Object obj, long j13, boolean z13) {
        zzhi zzhiVar = zze;
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        zzhiVar.zza.putInt(obj, j14, ((z13 ? 1 : 0) << i13) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i13)) & zzhiVar.zza.getInt(obj, j14)));
    }

    static void zzk(Object obj, long j13, boolean z13) {
        zze.zzc(obj, j13, z13);
    }

    static void zzl(Object obj, long j13, double d13) {
        zze.zzd(obj, j13, d13);
    }

    static void zzm(Object obj, long j13, float f13) {
        zze.zze(obj, j13, f13);
    }

    static void zzn(Object obj, long j13, int i13) {
        zze.zza.putInt(obj, j13, i13);
    }

    static void zzo(Object obj, long j13, long j14) {
        zze.zza.putLong(obj, j13, j14);
    }

    static void zzp(Object obj, long j13, Object obj2) {
        zze.zza.putObject(obj, j13, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j13) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j13) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static boolean zzs(Class cls) {
        int i13 = zzds.zza;
        try {
            Class cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzt(Object obj, long j13) {
        return zze.zzf(obj, j13);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i13 = zzds.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
