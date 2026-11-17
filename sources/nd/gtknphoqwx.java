package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final gtknphoqwx DEFAULT_INSTANCE;
    private static volatile Parser<gtknphoqwx> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, draadjrbmk> sessionVerbosity_converter_ = new iobyxmoadg();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    class iobyxmoadg implements Internal.ListAdapter.Converter {
        iobyxmoadg() {
        }

        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public draadjrbmk convert(Integer num) {
            draadjrbmk draadjrbmkVarWkgbmnqykc = draadjrbmk.wkgbmnqykc(num.intValue());
            return draadjrbmkVarWkgbmnqykc == null ? draadjrbmk.SESSION_VERBOSITY_NONE : draadjrbmkVarWkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public ppxfxbqfkf lqeggnwhkg(draadjrbmk draadjrbmkVar) {
            copyOnWrite();
            ((gtknphoqwx) this.instance).btonecajqb(draadjrbmkVar);
            return this;
        }

        public ppxfxbqfkf nufgyqmvbu(String str) {
            copyOnWrite();
            ((gtknphoqwx) this.instance).ojitshcjhn(str);
            return this;
        }

        private ppxfxbqfkf() {
            super(gtknphoqwx.DEFAULT_INSTANCE);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69712iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69712iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69712iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx();
        DEFAULT_INSTANCE = gtknphoqwxVar;
        GeneratedMessageLite.registerDefaultInstance(gtknphoqwx.class, gtknphoqwxVar);
    }

    private gtknphoqwx() {
    }

    public static ppxfxbqfkf agtfadlqog() {
        return (ppxfxbqfkf) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btonecajqb(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.getClass();
        gtknphoqwx();
        this.sessionVerbosity_.addInt(draadjrbmkVar.getNumber());
    }

    private void gtknphoqwx() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (intList.isModifiable()) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public draadjrbmk draadjrbmk(int i13) {
        draadjrbmk draadjrbmkVarWkgbmnqykc = draadjrbmk.wkgbmnqykc(this.sessionVerbosity_.getInt(i13));
        return draadjrbmkVarWkgbmnqykc == null ? draadjrbmk.SESSION_VERBOSITY_NONE : draadjrbmkVarWkgbmnqykc;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (zoijcleaow.f69712iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new gtknphoqwx();
            case 2:
                return new ppxfxbqfkf(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", draadjrbmk.lqeggnwhkg()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<gtknphoqwx> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (gtknphoqwx.class) {
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

    public int wflxmlrfwp() {
        return this.sessionVerbosity_.size();
    }
}
