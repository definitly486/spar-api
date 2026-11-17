package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwizpuwonk extends com.google.crypto.tink.shaded.protobuf.iobyxmoadg {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, iwizpuwonk> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected rlfsiqarku unknownFields = rlfsiqarku.ppxfxbqfkf();

    public static abstract class iobyxmoadg extends com.google.crypto.tink.shaded.protobuf.iobyxmoadg.AbstractC0414iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        protected iwizpuwonk f23934yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final iwizpuwonk f23935zdlpuopuiu;

        protected iobyxmoadg(iwizpuwonk iwizpuwonkVar) {
            this.f23935zdlpuopuiu = iwizpuwonkVar;
            if (iwizpuwonkVar.cqumvgiudr()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f23934yggfygwlhe = wflxmlrfwp();
        }

        private static void draadjrbmk(Object obj, Object obj2) {
            crxdokpmqz.iobyxmoadg().wkgbmnqykc(obj).mergeFrom(obj, obj2);
        }

        private iwizpuwonk wflxmlrfwp() {
            return this.f23935zdlpuopuiu.cdpycssgdh();
        }

        public iobyxmoadg eablkybsjg() {
            iobyxmoadg iobyxmoadgVarZynmafqrjb = nufgyqmvbu().zynmafqrjb();
            iobyxmoadgVarZynmafqrjb.f23934yggfygwlhe = wkgbmnqykc();
            return iobyxmoadgVarZynmafqrjb;
        }

        public iobyxmoadg gtknphoqwx(iwizpuwonk iwizpuwonkVar) {
            if (nufgyqmvbu().equals(iwizpuwonkVar)) {
                return this;
            }
            gxszxtbevo();
            draadjrbmk(this.f23934yggfygwlhe, iwizpuwonkVar);
            return this;
        }

        protected final void gxszxtbevo() {
            if (this.f23934yggfygwlhe.cqumvgiudr()) {
                return;
            }
            lqeggnwhkg();
        }

        protected void lqeggnwhkg() {
            iwizpuwonk iwizpuwonkVarWflxmlrfwp = wflxmlrfwp();
            draadjrbmk(iwizpuwonkVarWflxmlrfwp, this.f23934yggfygwlhe);
            this.f23934yggfygwlhe = iwizpuwonkVarWflxmlrfwp;
        }

        public iwizpuwonk nufgyqmvbu() {
            return this.f23935zdlpuopuiu;
        }

        public final iwizpuwonk ppxfxbqfkf() {
            iwizpuwonk iwizpuwonkVarWkgbmnqykc = wkgbmnqykc();
            if (iwizpuwonkVarWkgbmnqykc.jyumaefscl()) {
                return iwizpuwonkVarWkgbmnqykc;
            }
            throw com.google.crypto.tink.shaded.protobuf.iobyxmoadg.AbstractC0414iobyxmoadg.zoijcleaow(iwizpuwonkVarWkgbmnqykc);
        }

        public iwizpuwonk wkgbmnqykc() {
            if (!this.f23934yggfygwlhe.cqumvgiudr()) {
                return this.f23934yggfygwlhe;
            }
            this.f23934yggfygwlhe.esjtqupxsv();
            return this.f23934yggfygwlhe;
        }
    }

    public static class ppxfxbqfkf extends wflxmlrfwp {
    }

    public enum wkgbmnqykc {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iwizpuwonk f23944zoijcleaow;

        public zoijcleaow(iwizpuwonk iwizpuwonkVar) {
            this.f23944zoijcleaow = iwizpuwonkVar;
        }
    }

    private int btonecajqb(jhduphickx jhduphickxVar) {
        return jhduphickxVar == null ? crxdokpmqz.iobyxmoadg().wkgbmnqykc(this).getSerializedSize(this) : jhduphickxVar.getSerializedSize(this);
    }

    private static iwizpuwonk gxszxtbevo(iwizpuwonk iwizpuwonkVar) throws InvalidProtocolBufferException {
        if (iwizpuwonkVar == null || iwizpuwonkVar.jyumaefscl()) {
            return iwizpuwonkVar;
        }
        throw iwizpuwonkVar.wkgbmnqykc().iobyxmoadg().vdvldrhtss(iwizpuwonkVar);
    }

    protected static void hcddaimhww(Class cls, iwizpuwonk iwizpuwonkVar) {
        iwizpuwonkVar.lereixgezr();
        defaultInstanceMap.put(cls, iwizpuwonkVar);
    }

    protected static iwizpuwonk iozdgvuglv(iwizpuwonk iwizpuwonkVar, InputStream inputStream, ojitshcjhn ojitshcjhnVar) {
        return gxszxtbevo(ylkuphrtab(iwizpuwonkVar, dxjokdxxww.gxszxtbevo(inputStream), ojitshcjhnVar));
    }

    protected static Object istkbnxepw(hkdspvbjdz hkdspvbjdzVar, String str, Object[] objArr) {
        return new ribwqtqdhb(hkdspvbjdzVar, str, objArr);
    }

    protected static final boolean iwizpuwonk(iwizpuwonk iwizpuwonkVar, boolean z13) {
        byte bByteValue = ((Byte) iwizpuwonkVar.draadjrbmk(wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = crxdokpmqz.iobyxmoadg().wkgbmnqykc(iwizpuwonkVar).isInitialized(iwizpuwonkVar);
        if (z13) {
            iwizpuwonkVar.wflxmlrfwp(wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? iwizpuwonkVar : null);
        }
        return zIsInitialized;
    }

    protected static iwizpuwonk lmojexxdyd(iwizpuwonk iwizpuwonkVar, byte[] bArr, ojitshcjhn ojitshcjhnVar) {
        return gxszxtbevo(pkzmftpjix(iwizpuwonkVar, bArr, 0, bArr.length, ojitshcjhnVar));
    }

    protected static esjtqupxsv.wkgbmnqykc ojitshcjhn() {
        return jlmebxxoox.ppxfxbqfkf();
    }

    private static iwizpuwonk pkzmftpjix(iwizpuwonk iwizpuwonkVar, byte[] bArr, int i13, int i14, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        iwizpuwonk iwizpuwonkVarCdpycssgdh = iwizpuwonkVar.cdpycssgdh();
        try {
            jhduphickx jhduphickxVarWkgbmnqykc = crxdokpmqz.iobyxmoadg().wkgbmnqykc(iwizpuwonkVarCdpycssgdh);
            jhduphickxVarWkgbmnqykc.iobyxmoadg(iwizpuwonkVarCdpycssgdh, bArr, i13, i13 + i14, new eablkybsjg.iobyxmoadg(ojitshcjhnVar));
            jhduphickxVarWkgbmnqykc.makeImmutable(iwizpuwonkVarCdpycssgdh);
            return iwizpuwonkVarCdpycssgdh;
        } catch (InvalidProtocolBufferException e13) {
            e = e13;
            if (e.iobyxmoadg()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (UninitializedMessageException e14) {
            throw e14.iobyxmoadg().vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15).vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.zdlpuopuiu().vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        }
    }

    protected static esjtqupxsv.wkgbmnqykc pmvmpeiblj(esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        int size = wkgbmnqykcVar.size();
        return wkgbmnqykcVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    static iwizpuwonk rgvfuqvkyq(Class cls) {
        iwizpuwonk iwizpuwonkVarVdvldrhtss = defaultInstanceMap.get(cls);
        if (iwizpuwonkVarVdvldrhtss == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                iwizpuwonkVarVdvldrhtss = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (iwizpuwonkVarVdvldrhtss == null) {
            iwizpuwonkVarVdvldrhtss = ((iwizpuwonk) yfnezrywwk.gtknphoqwx(cls)).vdvldrhtss();
            if (iwizpuwonkVarVdvldrhtss == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, iwizpuwonkVarVdvldrhtss);
        }
        return iwizpuwonkVarVdvldrhtss;
    }

    private static iwizpuwonk wwaezpbzkn(iwizpuwonk iwizpuwonkVar, nufgyqmvbu nufgyqmvbuVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        dxjokdxxww dxjokdxxwwVarJyumaefscl = nufgyqmvbuVar.jyumaefscl();
        iwizpuwonk iwizpuwonkVarYlkuphrtab = ylkuphrtab(iwizpuwonkVar, dxjokdxxwwVarJyumaefscl, ojitshcjhnVar);
        try {
            dxjokdxxwwVarJyumaefscl.iobyxmoadg(0);
            return iwizpuwonkVarYlkuphrtab;
        } catch (InvalidProtocolBufferException e13) {
            throw e13.vdvldrhtss(iwizpuwonkVarYlkuphrtab);
        }
    }

    protected static iwizpuwonk yadqdtsiqt(iwizpuwonk iwizpuwonkVar, nufgyqmvbu nufgyqmvbuVar, ojitshcjhn ojitshcjhnVar) {
        return gxszxtbevo(wwaezpbzkn(iwizpuwonkVar, nufgyqmvbuVar, ojitshcjhnVar));
    }

    static Object yggfygwlhe(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    static iwizpuwonk ylkuphrtab(iwizpuwonk iwizpuwonkVar, dxjokdxxww dxjokdxxwwVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        iwizpuwonk iwizpuwonkVarCdpycssgdh = iwizpuwonkVar.cdpycssgdh();
        try {
            jhduphickx jhduphickxVarWkgbmnqykc = crxdokpmqz.iobyxmoadg().wkgbmnqykc(iwizpuwonkVarCdpycssgdh);
            jhduphickxVarWkgbmnqykc.zoijcleaow(iwizpuwonkVarCdpycssgdh, btonecajqb.gxszxtbevo(dxjokdxxwwVar), ojitshcjhnVar);
            jhduphickxVarWkgbmnqykc.makeImmutable(iwizpuwonkVarCdpycssgdh);
            return iwizpuwonkVarCdpycssgdh;
        } catch (InvalidProtocolBufferException e13) {
            e = e13;
            if (e.iobyxmoadg()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (UninitializedMessageException e14) {
            throw e14.iobyxmoadg().vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15).vdvldrhtss(iwizpuwonkVarCdpycssgdh);
        } catch (RuntimeException e16) {
            if (e16.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e16.getCause());
            }
            throw e16;
        }
    }

    protected abstract Object agtfadlqog(wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2);

    iwizpuwonk cdpycssgdh() {
        return (iwizpuwonk) draadjrbmk(wkgbmnqykc.NEW_MUTABLE_INSTANCE);
    }

    public final iobyxmoadg cllcsxoeiz() {
        return ((iobyxmoadg) draadjrbmk(wkgbmnqykc.NEW_BUILDER)).gtknphoqwx(this);
    }

    boolean cqumvgiudr() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected Object draadjrbmk(wkgbmnqykc wkgbmnqykcVar) {
        return agtfadlqog(wkgbmnqykcVar, null, null);
    }

    int dxjokdxxww() {
        return crxdokpmqz.iobyxmoadg().wkgbmnqykc(this).hashCode(this);
    }

    Object eablkybsjg() {
        return draadjrbmk(wkgbmnqykc.BUILD_MESSAGE_INFO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return crxdokpmqz.iobyxmoadg().wkgbmnqykc(this).equals(this, (iwizpuwonk) obj);
        }
        return false;
    }

    protected void esjtqupxsv() {
        crxdokpmqz.iobyxmoadg().wkgbmnqykc(this).makeImmutable(this);
        lereixgezr();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public int getSerializedSize() {
        return zoijcleaow(null);
    }

    protected final iobyxmoadg gtknphoqwx() {
        return (iobyxmoadg) draadjrbmk(wkgbmnqykc.NEW_BUILDER);
    }

    public int hashCode() {
        if (cqumvgiudr()) {
            return dxjokdxxww();
        }
        if (zdlpuopuiu()) {
            jpowsppfya(dxjokdxxww());
        }
        return oxmwwwfdhm();
    }

    void hkdspvbjdz(int i13) {
        if (i13 >= 0) {
            this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public void iobyxmoadg(CodedOutputStream codedOutputStream) {
        crxdokpmqz.iobyxmoadg().wkgbmnqykc(this).ppxfxbqfkf(this, gtknphoqwx.lqeggnwhkg(codedOutputStream));
    }

    void jpowsppfya(int i13) {
        this.memoizedHashCode = i13;
    }

    public final boolean jyumaefscl() {
        return iwizpuwonk(this, true);
    }

    int kcexrzcfyt() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    void lereixgezr() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    void lqeggnwhkg() {
        this.memoizedHashCode = 0;
    }

    void nufgyqmvbu() {
        hkdspvbjdz(Integer.MAX_VALUE);
    }

    int oxmwwwfdhm() {
        return this.memoizedHashCode;
    }

    public String toString() {
        return dsvhmnatus.gxszxtbevo(this, super.toString());
    }

    public final iwizpuwonk vdvldrhtss() {
        return (iwizpuwonk) draadjrbmk(wkgbmnqykc.GET_DEFAULT_INSTANCE);
    }

    protected Object wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, Object obj) {
        return agtfadlqog(wkgbmnqykcVar, obj, null);
    }

    boolean zdlpuopuiu() {
        return oxmwwwfdhm() == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iobyxmoadg
    int zoijcleaow(jhduphickx jhduphickxVar) {
        if (!cqumvgiudr()) {
            if (kcexrzcfyt() != Integer.MAX_VALUE) {
                return kcexrzcfyt();
            }
            int iBtonecajqb = btonecajqb(jhduphickxVar);
            hkdspvbjdz(iBtonecajqb);
            return iBtonecajqb;
        }
        int iBtonecajqb2 = btonecajqb(jhduphickxVar);
        if (iBtonecajqb2 >= 0) {
            return iBtonecajqb2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iBtonecajqb2);
    }

    public final iobyxmoadg zynmafqrjb() {
        return (iobyxmoadg) draadjrbmk(wkgbmnqykc.NEW_BUILDER);
    }
}
