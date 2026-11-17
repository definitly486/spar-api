package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final agtfadlqog DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser<agtfadlqog> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69697iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69697iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69697iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum ppxfxbqfkf implements Internal.EnumLite {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final Internal.EnumLiteMap f69699iwizpuwonk = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f69702zdlpuopuiu;

        class iobyxmoadg implements Internal.EnumLiteMap {
            iobyxmoadg() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public ppxfxbqfkf findValueByNumber(int i13) {
                return ppxfxbqfkf.wkgbmnqykc(i13);
            }
        }

        private static final class zoijcleaow implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            static final Internal.EnumVerifier f69703iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i13) {
                return ppxfxbqfkf.wkgbmnqykc(i13) != null;
            }
        }

        ppxfxbqfkf(int i13) {
            this.f69702zdlpuopuiu = i13;
        }

        public static Internal.EnumVerifier lqeggnwhkg() {
            return zoijcleaow.f69703iobyxmoadg;
        }

        public static ppxfxbqfkf wkgbmnqykc(int i13) {
            if (i13 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i13 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f69702zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        private zoijcleaow() {
            super(agtfadlqog.DEFAULT_INSTANCE);
        }
    }

    static {
        agtfadlqog agtfadlqogVar = new agtfadlqog();
        DEFAULT_INSTANCE = agtfadlqogVar;
        GeneratedMessageLite.registerDefaultInstance(agtfadlqog.class, agtfadlqogVar);
    }

    private agtfadlqog() {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69697iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new agtfadlqog();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", ppxfxbqfkf.lqeggnwhkg()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<agtfadlqog> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (agtfadlqog.class) {
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
