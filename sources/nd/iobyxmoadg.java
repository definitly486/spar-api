package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final iobyxmoadg DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<iobyxmoadg> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* JADX INFO: renamed from: nd.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static /* synthetic */ class C1500iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69714iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69714iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69714iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(C1500iobyxmoadg c1500iobyxmoadg) {
            this();
        }

        public zoijcleaow gtknphoqwx(String str) {
            copyOnWrite();
            ((iobyxmoadg) this.instance).vdvldrhtss(str);
            return this;
        }

        public zoijcleaow lqeggnwhkg(String str) {
            copyOnWrite();
            ((iobyxmoadg) this.instance).ojitshcjhn(str);
            return this;
        }

        public zoijcleaow nufgyqmvbu(String str) {
            copyOnWrite();
            ((iobyxmoadg) this.instance).rgvfuqvkyq(str);
            return this;
        }

        private zoijcleaow() {
            super(iobyxmoadg.DEFAULT_INSTANCE);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        DEFAULT_INSTANCE = iobyxmoadgVar;
        GeneratedMessageLite.registerDefaultInstance(iobyxmoadg.class, iobyxmoadgVar);
    }

    private iobyxmoadg() {
    }

    public static zoijcleaow agtfadlqog() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    public static iobyxmoadg gtknphoqwx() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vdvldrhtss(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    public boolean draadjrbmk() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C1500iobyxmoadg c1500iobyxmoadg = null;
        switch (C1500iobyxmoadg.f69714iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new iobyxmoadg();
            case 2:
                return new zoijcleaow(c1500iobyxmoadg);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<iobyxmoadg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (iobyxmoadg.class) {
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

    public boolean wflxmlrfwp() {
        return (this.bitField0_ & 2) != 0;
    }
}
