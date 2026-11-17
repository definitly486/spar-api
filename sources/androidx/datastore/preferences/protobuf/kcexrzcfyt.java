package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt extends androidx.datastore.preferences.protobuf.iobyxmoadg {
    private static Map<Object, kcexrzcfyt> defaultInstanceMap = new ConcurrentHashMap();
    protected okpsazkaxt unknownFields = okpsazkaxt.eablkybsjg();
    protected int memoizedSerializedSize = -1;

    public static abstract class iobyxmoadg extends androidx.datastore.preferences.protobuf.iobyxmoadg.AbstractC0140iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        protected boolean f8682jyumaefscl = false;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        protected kcexrzcfyt f8683yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final kcexrzcfyt f8684zdlpuopuiu;

        protected iobyxmoadg(kcexrzcfyt kcexrzcfytVar) {
            this.f8684zdlpuopuiu = kcexrzcfytVar;
            this.f8683yggfygwlhe = (kcexrzcfyt) kcexrzcfytVar.gtknphoqwx(wkgbmnqykc.NEW_MUTABLE_INSTANCE);
        }

        private void rgvfuqvkyq(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2) {
            tzroggbefp.iobyxmoadg().wkgbmnqykc(kcexrzcfytVar).mergeFrom(kcexrzcfytVar, kcexrzcfytVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.iobyxmoadg.AbstractC0140iobyxmoadg
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg wkgbmnqykc(kcexrzcfyt kcexrzcfytVar) {
            return ojitshcjhn(kcexrzcfytVar);
        }

        protected void draadjrbmk() {
            if (this.f8682jyumaefscl) {
                kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) this.f8683yggfygwlhe.gtknphoqwx(wkgbmnqykc.NEW_MUTABLE_INSTANCE);
                rgvfuqvkyq(kcexrzcfytVar, this.f8683yggfygwlhe);
                this.f8683yggfygwlhe = kcexrzcfytVar;
                this.f8682jyumaefscl = false;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg clone() {
            iobyxmoadg iobyxmoadgVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            iobyxmoadgVarNewBuilderForType.ojitshcjhn(buildPartial());
            return iobyxmoadgVarNewBuilderForType;
        }

        public final kcexrzcfyt lqeggnwhkg() {
            kcexrzcfyt kcexrzcfytVarBuildPartial = buildPartial();
            if (kcexrzcfytVarBuildPartial.oxmwwwfdhm()) {
                return kcexrzcfytVarBuildPartial;
            }
            throw androidx.datastore.preferences.protobuf.iobyxmoadg.AbstractC0140iobyxmoadg.gxszxtbevo(kcexrzcfytVarBuildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public kcexrzcfyt buildPartial() {
            if (this.f8682jyumaefscl) {
                return this.f8683yggfygwlhe;
            }
            this.f8683yggfygwlhe.zdlpuopuiu();
            this.f8682jyumaefscl = true;
            return this.f8683yggfygwlhe;
        }

        public iobyxmoadg ojitshcjhn(kcexrzcfyt kcexrzcfytVar) {
            draadjrbmk();
            rgvfuqvkyq(this.f8683yggfygwlhe, kcexrzcfytVar);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ylkuphrtab
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public kcexrzcfyt getDefaultInstanceForType() {
            return this.f8684zdlpuopuiu;
        }
    }

    public static class ppxfxbqfkf extends btonecajqb {
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

    protected static class zoijcleaow extends androidx.datastore.preferences.protobuf.zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final kcexrzcfyt f8693zoijcleaow;

        public zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
            this.f8693zoijcleaow = kcexrzcfytVar;
        }
    }

    protected static zdlpuopuiu.zoijcleaow agtfadlqog() {
        return mbcevpiqjq.ppxfxbqfkf();
    }

    protected static kcexrzcfyt cqumvgiudr(kcexrzcfyt kcexrzcfytVar, InputStream inputStream) {
        return dxjokdxxww(esjtqupxsv(kcexrzcfytVar, lqeggnwhkg.gxszxtbevo(inputStream), draadjrbmk.zoijcleaow()));
    }

    private static kcexrzcfyt dxjokdxxww(kcexrzcfyt kcexrzcfytVar) throws InvalidProtocolBufferException {
        if (kcexrzcfytVar == null || kcexrzcfytVar.oxmwwwfdhm()) {
            return kcexrzcfytVar;
        }
        throw kcexrzcfytVar.eablkybsjg().iobyxmoadg().ojitshcjhn(kcexrzcfytVar);
    }

    static kcexrzcfyt esjtqupxsv(kcexrzcfyt kcexrzcfytVar, lqeggnwhkg lqeggnwhkgVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException {
        kcexrzcfyt kcexrzcfytVar2 = (kcexrzcfyt) kcexrzcfytVar.gtknphoqwx(wkgbmnqykc.NEW_MUTABLE_INSTANCE);
        try {
            sopmlzcsov sopmlzcsovVarWkgbmnqykc = tzroggbefp.iobyxmoadg().wkgbmnqykc(kcexrzcfytVar2);
            sopmlzcsovVarWkgbmnqykc.iobyxmoadg(kcexrzcfytVar2, nufgyqmvbu.gxszxtbevo(lqeggnwhkgVar), draadjrbmkVar);
            sopmlzcsovVarWkgbmnqykc.makeImmutable(kcexrzcfytVar2);
            return kcexrzcfytVar2;
        } catch (IOException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw new InvalidProtocolBufferException(e13.getMessage()).ojitshcjhn(kcexrzcfytVar2);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw e14;
        }
    }

    protected static Object iwizpuwonk(wwaezpbzkn wwaezpbzknVar, String str, Object[] objArr) {
        return new ntlheqmsrt(wwaezpbzknVar, str, objArr);
    }

    protected static final boolean kcexrzcfyt(kcexrzcfyt kcexrzcfytVar, boolean z13) {
        byte bByteValue = ((Byte) kcexrzcfytVar.gtknphoqwx(wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = tzroggbefp.iobyxmoadg().wkgbmnqykc(kcexrzcfytVar).isInitialized(kcexrzcfytVar);
        if (z13) {
            kcexrzcfytVar.draadjrbmk(wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? kcexrzcfytVar : null);
        }
        return zIsInitialized;
    }

    protected static void lereixgezr(Class cls, kcexrzcfyt kcexrzcfytVar) {
        defaultInstanceMap.put(cls, kcexrzcfytVar);
    }

    static kcexrzcfyt ojitshcjhn(Class cls) {
        kcexrzcfyt defaultInstanceForType = defaultInstanceMap.get(cls);
        if (defaultInstanceForType == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                defaultInstanceForType = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (defaultInstanceForType == null) {
            defaultInstanceForType = ((kcexrzcfyt) metgxyhuhe.dxjokdxxww(cls)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, defaultInstanceForType);
        }
        return defaultInstanceForType;
    }

    static Object vdvldrhtss(Method method, Object obj, Object... objArr) {
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

    protected static zdlpuopuiu.zoijcleaow yggfygwlhe(zdlpuopuiu.zoijcleaow zoijcleaowVar) {
        int size = zoijcleaowVar.size();
        return zoijcleaowVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected final iobyxmoadg btonecajqb() {
        return (iobyxmoadg) gtknphoqwx(wkgbmnqykc.NEW_BUILDER);
    }

    protected Object draadjrbmk(wkgbmnqykc wkgbmnqykcVar, Object obj) {
        return wflxmlrfwp(wkgbmnqykcVar, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return tzroggbefp.iobyxmoadg().wkgbmnqykc(this).equals(this, (kcexrzcfyt) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = tzroggbefp.iobyxmoadg().wkgbmnqykc(this).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    protected Object gtknphoqwx(wkgbmnqykc wkgbmnqykcVar) {
        return wflxmlrfwp(wkgbmnqykcVar, null, null);
    }

    @Override // androidx.datastore.preferences.protobuf.iobyxmoadg
    void gxszxtbevo(int i13) {
        this.memoizedSerializedSize = i13;
    }

    public int hashCode() {
        int i13 = this.memoizedHashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = tzroggbefp.iobyxmoadg().wkgbmnqykc(this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn
    public void iobyxmoadg(CodedOutputStream codedOutputStream) {
        tzroggbefp.iobyxmoadg().wkgbmnqykc(this).zoijcleaow(this, dxjokdxxww.lqeggnwhkg(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public final iobyxmoadg newBuilderForType() {
        return (iobyxmoadg) gtknphoqwx(wkgbmnqykc.NEW_BUILDER);
    }

    Object nufgyqmvbu() {
        return gtknphoqwx(wkgbmnqykc.BUILD_MESSAGE_INFO);
    }

    public final boolean oxmwwwfdhm() {
        return kcexrzcfyt(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public final iobyxmoadg toBuilder() {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) gtknphoqwx(wkgbmnqykc.NEW_BUILDER);
        iobyxmoadgVar.ojitshcjhn(this);
        return iobyxmoadgVar;
    }

    @Override // androidx.datastore.preferences.protobuf.iobyxmoadg
    int ppxfxbqfkf() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.ylkuphrtab
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public final kcexrzcfyt getDefaultInstanceForType() {
        return (kcexrzcfyt) gtknphoqwx(wkgbmnqykc.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return pkzmftpjix.eablkybsjg(this, super.toString());
    }

    protected abstract Object wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2);

    protected void zdlpuopuiu() {
        tzroggbefp.iobyxmoadg().wkgbmnqykc(this).makeImmutable(this);
    }
}
