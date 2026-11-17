package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final lqeggnwhkg DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<lqeggnwhkg> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private gxszxtbevo gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<eablkybsjg> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<nd.zoijcleaow> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69715iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69715iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69715iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow draadjrbmk(String str) {
            copyOnWrite();
            ((lqeggnwhkg) this.instance).cqumvgiudr(str);
            return this;
        }

        public zoijcleaow gtknphoqwx(gxszxtbevo gxszxtbevoVar) {
            copyOnWrite();
            ((lqeggnwhkg) this.instance).iwizpuwonk(gxszxtbevoVar);
            return this;
        }

        public zoijcleaow lqeggnwhkg(nd.zoijcleaow zoijcleaowVar) {
            copyOnWrite();
            ((lqeggnwhkg) this.instance).draadjrbmk(zoijcleaowVar);
            return this;
        }

        public zoijcleaow nufgyqmvbu(eablkybsjg eablkybsjgVar) {
            copyOnWrite();
            ((lqeggnwhkg) this.instance).wflxmlrfwp(eablkybsjgVar);
            return this;
        }

        private zoijcleaow() {
            super(lqeggnwhkg.DEFAULT_INSTANCE);
        }
    }

    static {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        DEFAULT_INSTANCE = lqeggnwhkgVar;
        GeneratedMessageLite.registerDefaultInstance(lqeggnwhkg.class, lqeggnwhkgVar);
    }

    private lqeggnwhkg() {
    }

    private void agtfadlqog() {
        Internal.ProtobufList<nd.zoijcleaow> protobufList = this.androidMemoryReadings_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cqumvgiudr(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draadjrbmk(nd.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.getClass();
        agtfadlqog();
        this.androidMemoryReadings_.add(zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iwizpuwonk(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.getClass();
        this.gaugeMetadata_ = gxszxtbevoVar;
        this.bitField0_ |= 2;
    }

    public static zoijcleaow jyumaefscl() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    private void ojitshcjhn() {
        Internal.ProtobufList<eablkybsjg> protobufList = this.cpuMetricReadings_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static lqeggnwhkg oxmwwwfdhm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.getClass();
        ojitshcjhn();
        this.cpuMetricReadings_.add(eablkybsjgVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69715iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new lqeggnwhkg();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", eablkybsjg.class, "gaugeMetadata_", "androidMemoryReadings_", nd.zoijcleaow.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<lqeggnwhkg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (lqeggnwhkg.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public gxszxtbevo kcexrzcfyt() {
        gxszxtbevo gxszxtbevoVar = this.gaugeMetadata_;
        return gxszxtbevoVar == null ? gxszxtbevo.gtknphoqwx() : gxszxtbevoVar;
    }

    public int rgvfuqvkyq() {
        return this.androidMemoryReadings_.size();
    }

    public int vdvldrhtss() {
        return this.cpuMetricReadings_.size();
    }

    public boolean yggfygwlhe() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean zdlpuopuiu() {
        return (this.bitField0_ & 2) != 0;
    }
}
