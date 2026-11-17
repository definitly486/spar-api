package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final gxszxtbevo DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Parser<gxszxtbevo> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69713iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69713iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69713iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow gtknphoqwx(int i13) {
            copyOnWrite();
            ((gxszxtbevo) this.instance).rgvfuqvkyq(i13);
            return this;
        }

        public zoijcleaow lqeggnwhkg(int i13) {
            copyOnWrite();
            ((gxszxtbevo) this.instance).agtfadlqog(i13);
            return this;
        }

        public zoijcleaow nufgyqmvbu(int i13) {
            copyOnWrite();
            ((gxszxtbevo) this.instance).ojitshcjhn(i13);
            return this;
        }

        private zoijcleaow() {
            super(gxszxtbevo.DEFAULT_INSTANCE);
        }
    }

    static {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        DEFAULT_INSTANCE = gxszxtbevoVar;
        GeneratedMessageLite.registerDefaultInstance(gxszxtbevo.class, gxszxtbevoVar);
    }

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void agtfadlqog(int i13) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i13;
    }

    public static gxszxtbevo gtknphoqwx() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn(int i13) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(int i13) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i13;
    }

    public static zoijcleaow wflxmlrfwp() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    public boolean draadjrbmk() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69713iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new gxszxtbevo();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<gxszxtbevo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (gxszxtbevo.class) {
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
}
