package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class metgxyhuhe {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final long f8725agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final long f8726btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final boolean f8727cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final long f8728draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final long f8729dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final long f8731gtknphoqwx;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final int f8734iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final long f8735jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final long f8736kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final long f8739ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final long f8740oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final long f8742rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final long f8743vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final long f8744wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final long f8746yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final long f8747zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f8733iobyxmoadg = Logger.getLogger(metgxyhuhe.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Unsafe f8748zoijcleaow = zynmafqrjb();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Class f8741ppxfxbqfkf = androidx.datastore.preferences.protobuf.wkgbmnqykc.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final boolean f8745wkgbmnqykc = wflxmlrfwp(Long.TYPE);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final boolean f8730eablkybsjg = wflxmlrfwp(Integer.TYPE);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final eablkybsjg f8732gxszxtbevo = lereixgezr();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final boolean f8737lqeggnwhkg = stevsuqkhv();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final boolean f8738nufgyqmvbu = wypolnanlu();

    private static abstract class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Unsafe f8749iobyxmoadg;

        eablkybsjg(Unsafe unsafe) {
            this.f8749iobyxmoadg = unsafe;
        }

        public abstract void agtfadlqog(Object obj, long j13, float f13);

        public final long btonecajqb(Field field) {
            return this.f8749iobyxmoadg.objectFieldOffset(field);
        }

        public abstract void draadjrbmk(Object obj, long j13, byte b13);

        public final Object dxjokdxxww(Object obj, long j13) {
            return this.f8749iobyxmoadg.getObject(obj, j13);
        }

        public abstract double eablkybsjg(Object obj, long j13);

        public abstract void gtknphoqwx(Object obj, long j13, boolean z13);

        public abstract float gxszxtbevo(Object obj, long j13);

        public final int iobyxmoadg(Class cls) {
            return this.f8749iobyxmoadg.arrayBaseOffset(cls);
        }

        public final int lqeggnwhkg(Object obj, long j13) {
            return this.f8749iobyxmoadg.getInt(obj, j13);
        }

        public final long nufgyqmvbu(Object obj, long j13) {
            return this.f8749iobyxmoadg.getLong(obj, j13);
        }

        public final void ojitshcjhn(Object obj, long j13, int i13) {
            this.f8749iobyxmoadg.putInt(obj, j13, i13);
        }

        public abstract boolean ppxfxbqfkf(Object obj, long j13);

        public final void rgvfuqvkyq(Object obj, long j13, long j14) {
            this.f8749iobyxmoadg.putLong(obj, j13, j14);
        }

        public final void vdvldrhtss(Object obj, long j13, Object obj2) {
            this.f8749iobyxmoadg.putObject(obj, j13, obj2);
        }

        public abstract void wflxmlrfwp(Object obj, long j13, double d13);

        public abstract byte wkgbmnqykc(Object obj, long j13);

        public final int zoijcleaow(Class cls) {
            return this.f8749iobyxmoadg.arrayIndexScale(cls);
        }
    }

    static class iobyxmoadg implements PrivilegedExceptionAction {
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

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            ojitshcjhn(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            if (metgxyhuhe.f8727cqumvgiudr) {
                metgxyhuhe.ylkuphrtab(obj, j13, b13);
            } else {
                metgxyhuhe.pkzmftpjix(obj, j13, b13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return Double.longBitsToDouble(nufgyqmvbu(obj, j13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            if (metgxyhuhe.f8727cqumvgiudr) {
                metgxyhuhe.iozdgvuglv(obj, j13, z13);
            } else {
                metgxyhuhe.lmojexxdyd(obj, j13, z13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return Float.intBitsToFloat(lqeggnwhkg(obj, j13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return metgxyhuhe.f8727cqumvgiudr ? metgxyhuhe.vdvldrhtss(obj, j13) : metgxyhuhe.oxmwwwfdhm(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            rgvfuqvkyq(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return metgxyhuhe.f8727cqumvgiudr ? metgxyhuhe.zdlpuopuiu(obj, j13) : metgxyhuhe.yggfygwlhe(obj, j13);
        }
    }

    private static final class wkgbmnqykc extends eablkybsjg {
        wkgbmnqykc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            this.f8749iobyxmoadg.putFloat(obj, j13, f13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            this.f8749iobyxmoadg.putByte(obj, j13, b13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return this.f8749iobyxmoadg.getDouble(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            this.f8749iobyxmoadg.putBoolean(obj, j13, z13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return this.f8749iobyxmoadg.getFloat(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return this.f8749iobyxmoadg.getBoolean(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            this.f8749iobyxmoadg.putDouble(obj, j13, d13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return this.f8749iobyxmoadg.getByte(obj, j13);
        }
    }

    private static final class zoijcleaow extends eablkybsjg {
        zoijcleaow(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void agtfadlqog(Object obj, long j13, float f13) {
            ojitshcjhn(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void draadjrbmk(Object obj, long j13, byte b13) {
            if (metgxyhuhe.f8727cqumvgiudr) {
                metgxyhuhe.ylkuphrtab(obj, j13, b13);
            } else {
                metgxyhuhe.pkzmftpjix(obj, j13, b13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public double eablkybsjg(Object obj, long j13) {
            return Double.longBitsToDouble(nufgyqmvbu(obj, j13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void gtknphoqwx(Object obj, long j13, boolean z13) {
            if (metgxyhuhe.f8727cqumvgiudr) {
                metgxyhuhe.iozdgvuglv(obj, j13, z13);
            } else {
                metgxyhuhe.lmojexxdyd(obj, j13, z13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public float gxszxtbevo(Object obj, long j13) {
            return Float.intBitsToFloat(lqeggnwhkg(obj, j13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public boolean ppxfxbqfkf(Object obj, long j13) {
            return metgxyhuhe.f8727cqumvgiudr ? metgxyhuhe.vdvldrhtss(obj, j13) : metgxyhuhe.oxmwwwfdhm(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public void wflxmlrfwp(Object obj, long j13, double d13) {
            rgvfuqvkyq(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // androidx.datastore.preferences.protobuf.metgxyhuhe.eablkybsjg
        public byte wkgbmnqykc(Object obj, long j13) {
            return metgxyhuhe.f8727cqumvgiudr ? metgxyhuhe.zdlpuopuiu(obj, j13) : metgxyhuhe.yggfygwlhe(obj, j13);
        }
    }

    static {
        long jBtonecajqb = btonecajqb(byte[].class);
        f8729dxjokdxxww = jBtonecajqb;
        f8726btonecajqb = btonecajqb(boolean[].class);
        f8731gtknphoqwx = gtknphoqwx(boolean[].class);
        f8728draadjrbmk = btonecajqb(int[].class);
        f8744wflxmlrfwp = gtknphoqwx(int[].class);
        f8725agtfadlqog = btonecajqb(long[].class);
        f8739ojitshcjhn = gtknphoqwx(long[].class);
        f8742rgvfuqvkyq = btonecajqb(float[].class);
        f8743vdvldrhtss = gtknphoqwx(float[].class);
        f8740oxmwwwfdhm = btonecajqb(double[].class);
        f8736kcexrzcfyt = gtknphoqwx(double[].class);
        f8747zdlpuopuiu = btonecajqb(Object[].class);
        f8746yggfygwlhe = gtknphoqwx(Object[].class);
        f8735jyumaefscl = ojitshcjhn(draadjrbmk());
        f8734iwizpuwonk = (int) (jBtonecajqb & 7);
        f8727cqumvgiudr = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private static Field agtfadlqog(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int btonecajqb(Class cls) {
        if (f8738nufgyqmvbu) {
            return f8732gxszxtbevo.iobyxmoadg(cls);
        }
        return -1;
    }

    static boolean cdpycssgdh() {
        return f8737lqeggnwhkg;
    }

    static void cllcsxoeiz(Object obj, long j13, long j14) {
        f8732gxszxtbevo.rgvfuqvkyq(obj, j13, j14);
    }

    static int cqumvgiudr(Object obj, long j13) {
        return f8732gxszxtbevo.lqeggnwhkg(obj, j13);
    }

    private static Field draadjrbmk() {
        Field fieldAgtfadlqog;
        if (androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf() && (fieldAgtfadlqog = agtfadlqog(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldAgtfadlqog;
        }
        Field fieldAgtfadlqog2 = agtfadlqog(Buffer.class, "address");
        if (fieldAgtfadlqog2 == null || fieldAgtfadlqog2.getType() != Long.TYPE) {
            return null;
        }
        return fieldAgtfadlqog2;
    }

    static void dsvhmnatus(Object obj, long j13, Object obj2) {
        f8732gxszxtbevo.vdvldrhtss(obj, j13, obj2);
    }

    static Object dxjokdxxww(Class cls) {
        try {
            return f8748zoijcleaow.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    static long esjtqupxsv(Object obj, long j13) {
        return f8732gxszxtbevo.nufgyqmvbu(obj, j13);
    }

    private static int gtknphoqwx(Class cls) {
        if (f8738nufgyqmvbu) {
            return f8732gxszxtbevo.zoijcleaow(cls);
        }
        return -1;
    }

    static void hcddaimhww(Object obj, long j13, double d13) {
        f8732gxszxtbevo.wflxmlrfwp(obj, j13, d13);
    }

    static void hkdspvbjdz(Object obj, long j13, int i13) {
        f8732gxszxtbevo.ojitshcjhn(obj, j13, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void iozdgvuglv(Object obj, long j13, boolean z13) {
        ylkuphrtab(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    static boolean istkbnxepw() {
        return f8738nufgyqmvbu;
    }

    static float iwizpuwonk(Object obj, long j13) {
        return f8732gxszxtbevo.gxszxtbevo(obj, j13);
    }

    static void jpowsppfya(Object obj, long j13, float f13) {
        f8732gxszxtbevo.agtfadlqog(obj, j13, f13);
    }

    static double jyumaefscl(Object obj, long j13) {
        return f8732gxszxtbevo.eablkybsjg(obj, j13);
    }

    static byte kcexrzcfyt(byte[] bArr, long j13) {
        return f8732gxszxtbevo.wkgbmnqykc(bArr, f8729dxjokdxxww + j13);
    }

    private static eablkybsjg lereixgezr() {
        Unsafe unsafe = f8748zoijcleaow;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
            return new wkgbmnqykc(unsafe);
        }
        if (f8745wkgbmnqykc) {
            return new ppxfxbqfkf(unsafe);
        }
        if (f8730eablkybsjg) {
            return new zoijcleaow(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lmojexxdyd(Object obj, long j13, boolean z13) {
        pkzmftpjix(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    private static long ojitshcjhn(Field field) {
        eablkybsjg eablkybsjgVar;
        if (field == null || (eablkybsjgVar = f8732gxszxtbevo) == null) {
            return -1L;
        }
        return eablkybsjgVar.btonecajqb(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oxmwwwfdhm(Object obj, long j13) {
        return yggfygwlhe(obj, j13) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pkzmftpjix(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        hkdspvbjdz(obj, j14, ((255 & b13) << i13) | (cqumvgiudr(obj, j14) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i13))));
    }

    static Object pmvmpeiblj(Object obj, long j13) {
        return f8732gxszxtbevo.dxjokdxxww(obj, j13);
    }

    static boolean rgvfuqvkyq(Object obj, long j13) {
        return f8732gxszxtbevo.ppxfxbqfkf(obj, j13);
    }

    private static boolean stevsuqkhv() {
        Unsafe unsafe = f8748zoijcleaow;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (draadjrbmk() == null) {
                return false;
            }
            if (androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
                return true;
            }
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
            f8733iobyxmoadg.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean vdvldrhtss(Object obj, long j13) {
        return zdlpuopuiu(obj, j13) != 0;
    }

    private static boolean wflxmlrfwp(Class cls) {
        if (!androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
            return false;
        }
        try {
            Class cls2 = f8741ppxfxbqfkf;
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

    static void wwaezpbzkn(byte[] bArr, long j13, byte b13) {
        f8732gxszxtbevo.draadjrbmk(bArr, f8729dxjokdxxww + j13, b13);
    }

    private static boolean wypolnanlu() {
        Unsafe unsafe = f8748zoijcleaow;
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
            if (androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf()) {
                return true;
            }
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
            f8733iobyxmoadg.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static void yadqdtsiqt(Object obj, long j13, boolean z13) {
        f8732gxszxtbevo.gtknphoqwx(obj, j13, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte yggfygwlhe(Object obj, long j13) {
        return (byte) ((cqumvgiudr(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ylkuphrtab(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int iCqumvgiudr = cqumvgiudr(obj, j14);
        int i13 = ((~((int) j13)) & 3) << 3;
        hkdspvbjdz(obj, j14, ((255 & b13) << i13) | (iCqumvgiudr & (~(KotlinVersion.MAX_COMPONENT_VALUE << i13))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zdlpuopuiu(Object obj, long j13) {
        return (byte) ((cqumvgiudr(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    static Unsafe zynmafqrjb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new iobyxmoadg());
        } catch (Throwable unused) {
            return null;
        }
    }
}
