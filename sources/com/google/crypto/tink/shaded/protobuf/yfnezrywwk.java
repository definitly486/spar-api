package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class yfnezrywwk {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final long f24083agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final long f24084btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final long f24085draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final long f24086dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final long f24088gtknphoqwx;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final boolean f24091iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final int f24092jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final long f24093kcexrzcfyt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final long f24095nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final long f24096ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final long f24097oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final long f24099rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final long f24100vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final long f24101wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final long f24103yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final long f24104zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Unsafe f24090iobyxmoadg = cdpycssgdh();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Class f24105zoijcleaow = com.google.crypto.tink.shaded.protobuf.wkgbmnqykc.zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final boolean f24098ppxfxbqfkf = ojitshcjhn(Long.TYPE);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final boolean f24102wkgbmnqykc = ojitshcjhn(Integer.TYPE);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final eablkybsjg f24087eablkybsjg = zynmafqrjb();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final boolean f24089gxszxtbevo = mbcevpiqjq();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final boolean f24094lqeggnwhkg = tzroggbefp();

    private static abstract class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Unsafe f24106iobyxmoadg;

        eablkybsjg(Unsafe unsafe) {
            this.f24106iobyxmoadg = unsafe;
        }

        public abstract void agtfadlqog(Object obj, long j13, float f13);

        public final long btonecajqb(Field field) {
            return this.f24106iobyxmoadg.objectFieldOffset(field);
        }

        public abstract void draadjrbmk(Object obj, long j13, byte b13);

        public final Object dxjokdxxww(Object obj, long j13) {
            return this.f24106iobyxmoadg.getObject(obj, j13);
        }

        public abstract double eablkybsjg(Object obj, long j13);

        public abstract void gtknphoqwx(Object obj, long j13, boolean z13);

        public abstract float gxszxtbevo(Object obj, long j13);

        public final int iobyxmoadg(Class cls) {
            return this.f24106iobyxmoadg.arrayBaseOffset(cls);
        }

        public boolean kcexrzcfyt() {
            Unsafe unsafe = this.f24106iobyxmoadg;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return yfnezrywwk.agtfadlqog() != null;
            } catch (Throwable th2) {
                yfnezrywwk.lmojexxdyd(th2);
                return false;
            }
        }

        public final int lqeggnwhkg(Object obj, long j13) {
            return this.f24106iobyxmoadg.getInt(obj, j13);
        }

        public final long nufgyqmvbu(Object obj, long j13) {
            return this.f24106iobyxmoadg.getLong(obj, j13);
        }

        public final void ojitshcjhn(Object obj, long j13, int i13) {
            this.f24106iobyxmoadg.putInt(obj, j13, i13);
        }

        public boolean oxmwwwfdhm() {
            Unsafe unsafe = this.f24106iobyxmoadg;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                yfnezrywwk.lmojexxdyd(th2);
                return false;
            }
        }

        public abstract boolean ppxfxbqfkf(Object obj, long j13);

        public final void rgvfuqvkyq(Object obj, long j13, long j14) {
            this.f24106iobyxmoadg.putLong(obj, j13, j14);
        }

        public final void vdvldrhtss(Object obj, long j13, Object obj2) {
            this.f24106iobyxmoadg.putObject(obj, j13, obj2);
        }

        public abstract void wflxmlrfwp(Object obj, long j13, double d13);

        public abstract byte wkgbmnqykc(Object obj, long j13);

        public final int zoijcleaow(Class cls) {
            return this.f24106iobyxmoadg.arrayIndexScale(cls);
        }
    }

    class iobyxmoadg implements PrivilegedExceptionAction {
        iobyxmoadg() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class ppxfxbqfkf extends eablkybsjg {
        ppxfxbqfkf(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            ojitshcjhn(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            if (yfnezrywwk.f24091iwizpuwonk) {
                yfnezrywwk.jpowsppfya(obj, j13, b13);
            } else {
                yfnezrywwk.hkdspvbjdz(obj, j13, b13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return Double.longBitsToDouble(nufgyqmvbu(obj, j13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            if (yfnezrywwk.f24091iwizpuwonk) {
                yfnezrywwk.ylkuphrtab(obj, j13, z13);
            } else {
                yfnezrywwk.pkzmftpjix(obj, j13, z13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return Float.intBitsToFloat(lqeggnwhkg(obj, j13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean kcexrzcfyt() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return yfnezrywwk.f24091iwizpuwonk ? yfnezrywwk.kcexrzcfyt(obj, j13) : yfnezrywwk.zdlpuopuiu(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            rgvfuqvkyq(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return yfnezrywwk.f24091iwizpuwonk ? yfnezrywwk.jyumaefscl(obj, j13) : yfnezrywwk.iwizpuwonk(obj, j13);
        }
    }

    private static final class wkgbmnqykc extends eablkybsjg {
        wkgbmnqykc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            this.f24106iobyxmoadg.putFloat(obj, j13, f13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            this.f24106iobyxmoadg.putByte(obj, j13, b13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return this.f24106iobyxmoadg.getDouble(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            this.f24106iobyxmoadg.putBoolean(obj, j13, z13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return this.f24106iobyxmoadg.getFloat(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean kcexrzcfyt() {
            if (!super.kcexrzcfyt()) {
                return false;
            }
            try {
                Class<?> cls = this.f24106iobyxmoadg.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                yfnezrywwk.lmojexxdyd(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean oxmwwwfdhm() {
            if (!super.oxmwwwfdhm()) {
                return false;
            }
            try {
                Class<?> cls = this.f24106iobyxmoadg.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                yfnezrywwk.lmojexxdyd(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return this.f24106iobyxmoadg.getBoolean(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            this.f24106iobyxmoadg.putDouble(obj, j13, d13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return this.f24106iobyxmoadg.getByte(obj, j13);
        }
    }

    private static final class zoijcleaow extends eablkybsjg {
        zoijcleaow(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            ojitshcjhn(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            if (yfnezrywwk.f24091iwizpuwonk) {
                yfnezrywwk.jpowsppfya(obj, j13, b13);
            } else {
                yfnezrywwk.hkdspvbjdz(obj, j13, b13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return Double.longBitsToDouble(nufgyqmvbu(obj, j13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            if (yfnezrywwk.f24091iwizpuwonk) {
                yfnezrywwk.ylkuphrtab(obj, j13, z13);
            } else {
                yfnezrywwk.pkzmftpjix(obj, j13, z13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return Float.intBitsToFloat(lqeggnwhkg(obj, j13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean kcexrzcfyt() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return yfnezrywwk.f24091iwizpuwonk ? yfnezrywwk.kcexrzcfyt(obj, j13) : yfnezrywwk.zdlpuopuiu(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            rgvfuqvkyq(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.yfnezrywwk.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return yfnezrywwk.f24091iwizpuwonk ? yfnezrywwk.jyumaefscl(obj, j13) : yfnezrywwk.iwizpuwonk(obj, j13);
        }
    }

    static {
        long jDraadjrbmk = draadjrbmk(byte[].class);
        f24095nufgyqmvbu = jDraadjrbmk;
        f24086dxjokdxxww = draadjrbmk(boolean[].class);
        f24084btonecajqb = wflxmlrfwp(boolean[].class);
        f24088gtknphoqwx = draadjrbmk(int[].class);
        f24085draadjrbmk = wflxmlrfwp(int[].class);
        f24101wflxmlrfwp = draadjrbmk(long[].class);
        f24083agtfadlqog = wflxmlrfwp(long[].class);
        f24096ojitshcjhn = draadjrbmk(float[].class);
        f24099rgvfuqvkyq = wflxmlrfwp(float[].class);
        f24100vdvldrhtss = draadjrbmk(double[].class);
        f24097oxmwwwfdhm = wflxmlrfwp(double[].class);
        f24093kcexrzcfyt = draadjrbmk(Object[].class);
        f24104zdlpuopuiu = wflxmlrfwp(Object[].class);
        f24103yggfygwlhe = vdvldrhtss(agtfadlqog());
        f24092jyumaefscl = (int) (jDraadjrbmk & 7);
        f24091iwizpuwonk = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field agtfadlqog() {
        Field fieldRgvfuqvkyq;
        if (com.google.crypto.tink.shaded.protobuf.wkgbmnqykc.ppxfxbqfkf() && (fieldRgvfuqvkyq = rgvfuqvkyq(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldRgvfuqvkyq;
        }
        Field fieldRgvfuqvkyq2 = rgvfuqvkyq(Buffer.class, "address");
        if (fieldRgvfuqvkyq2 == null || fieldRgvfuqvkyq2.getType() != Long.TYPE) {
            return null;
        }
        return fieldRgvfuqvkyq2;
    }

    static Unsafe cdpycssgdh() {
        try {
            return (Unsafe) AccessController.doPrivileged(new iobyxmoadg());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void cllcsxoeiz(Object obj, long j13, double d13) {
        f24087eablkybsjg.wflxmlrfwp(obj, j13, d13);
    }

    static double cqumvgiudr(Object obj, long j13) {
        return f24087eablkybsjg.eablkybsjg(obj, j13);
    }

    private static int draadjrbmk(Class cls) {
        if (f24094lqeggnwhkg) {
            return f24087eablkybsjg.iobyxmoadg(cls);
        }
        return -1;
    }

    static void dsvhmnatus(Object obj, long j13, float f13) {
        f24087eablkybsjg.agtfadlqog(obj, j13, f13);
    }

    static float esjtqupxsv(Object obj, long j13) {
        return f24087eablkybsjg.gxszxtbevo(obj, j13);
    }

    static Object gtknphoqwx(Class cls) {
        try {
            return f24090iobyxmoadg.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    static void hcddaimhww(byte[] bArr, long j13, byte b13) {
        f24087eablkybsjg.draadjrbmk(bArr, f24095nufgyqmvbu + j13, b13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hkdspvbjdz(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        wypolnanlu(obj, j14, ((255 & b13) << i13) | (lereixgezr(obj, j14) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i13))));
    }

    static boolean iozdgvuglv() {
        return f24089gxszxtbevo;
    }

    static Object istkbnxepw(Object obj, long j13) {
        return f24087eablkybsjg.dxjokdxxww(obj, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte iwizpuwonk(Object obj, long j13) {
        return (byte) ((lereixgezr(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jpowsppfya(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int iLereixgezr = lereixgezr(obj, j14);
        int i13 = ((~((int) j13)) & 3) << 3;
        wypolnanlu(obj, j14, ((255 & b13) << i13) | (iLereixgezr & (~(KotlinVersion.MAX_COMPONENT_VALUE << i13))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte jyumaefscl(Object obj, long j13) {
        return (byte) ((lereixgezr(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean kcexrzcfyt(Object obj, long j13) {
        return jyumaefscl(obj, j13) != 0;
    }

    static void kegysxyocb(Object obj, long j13, Object obj2) {
        f24087eablkybsjg.vdvldrhtss(obj, j13, obj2);
    }

    static int lereixgezr(Object obj, long j13) {
        return f24087eablkybsjg.lqeggnwhkg(obj, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lmojexxdyd(Throwable th2) {
        Logger.getLogger(yfnezrywwk.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    private static boolean mbcevpiqjq() {
        eablkybsjg eablkybsjgVar = f24087eablkybsjg;
        if (eablkybsjgVar == null) {
            return false;
        }
        return eablkybsjgVar.kcexrzcfyt();
    }

    static boolean ojitshcjhn(Class cls) {
        if (!com.google.crypto.tink.shaded.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
            return false;
        }
        try {
            Class cls2 = f24105zoijcleaow;
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

    static boolean oxmwwwfdhm(Object obj, long j13) {
        return f24087eablkybsjg.ppxfxbqfkf(obj, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pkzmftpjix(Object obj, long j13, boolean z13) {
        hkdspvbjdz(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    static long pmvmpeiblj(Object obj, long j13) {
        return f24087eablkybsjg.nufgyqmvbu(obj, j13);
    }

    private static Field rgvfuqvkyq(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void stevsuqkhv(Object obj, long j13, long j14) {
        f24087eablkybsjg.rgvfuqvkyq(obj, j13, j14);
    }

    private static boolean tzroggbefp() {
        eablkybsjg eablkybsjgVar = f24087eablkybsjg;
        if (eablkybsjgVar == null) {
            return false;
        }
        return eablkybsjgVar.oxmwwwfdhm();
    }

    private static long vdvldrhtss(Field field) {
        eablkybsjg eablkybsjgVar;
        if (field == null || (eablkybsjgVar = f24087eablkybsjg) == null) {
            return -1L;
        }
        return eablkybsjgVar.btonecajqb(field);
    }

    private static int wflxmlrfwp(Class cls) {
        if (f24094lqeggnwhkg) {
            return f24087eablkybsjg.zoijcleaow(cls);
        }
        return -1;
    }

    static void wwaezpbzkn(Object obj, long j13, boolean z13) {
        f24087eablkybsjg.gtknphoqwx(obj, j13, z13);
    }

    static void wypolnanlu(Object obj, long j13, int i13) {
        f24087eablkybsjg.ojitshcjhn(obj, j13, i13);
    }

    static boolean yadqdtsiqt() {
        return f24094lqeggnwhkg;
    }

    static byte yggfygwlhe(byte[] bArr, long j13) {
        return f24087eablkybsjg.wkgbmnqykc(bArr, f24095nufgyqmvbu + j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ylkuphrtab(Object obj, long j13, boolean z13) {
        jpowsppfya(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zdlpuopuiu(Object obj, long j13) {
        return iwizpuwonk(obj, j13) != 0;
    }

    private static eablkybsjg zynmafqrjb() {
        Unsafe unsafe = f24090iobyxmoadg;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
            return new wkgbmnqykc(unsafe);
        }
        if (f24098ppxfxbqfkf) {
            return new ppxfxbqfkf(unsafe);
        }
        if (f24102wkgbmnqykc) {
            return new zoijcleaow(unsafe);
        }
        return null;
    }
}
