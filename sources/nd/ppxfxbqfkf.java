package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ppxfxbqfkf DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<ppxfxbqfkf> PARSER;
    private nd.iobyxmoadg androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69738iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69738iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69738iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: nd.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C1501ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final MapEntryLite f69739iobyxmoadg;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f69739iobyxmoadg = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(String str) {
            copyOnWrite();
            ((ppxfxbqfkf) this.instance).esjtqupxsv(str);
            return this;
        }

        public zoijcleaow draadjrbmk(String str) {
            copyOnWrite();
            ((ppxfxbqfkf) this.instance).iwizpuwonk(str);
            return this;
        }

        public zoijcleaow gtknphoqwx(nd.iobyxmoadg.zoijcleaow zoijcleaowVar) {
            copyOnWrite();
            ((ppxfxbqfkf) this.instance).jyumaefscl((nd.iobyxmoadg) zoijcleaowVar.build());
            return this;
        }

        public boolean lqeggnwhkg() {
            return ((ppxfxbqfkf) this.instance).vdvldrhtss();
        }

        public zoijcleaow nufgyqmvbu(Map map) {
            copyOnWrite();
            ((ppxfxbqfkf) this.instance).ojitshcjhn().putAll(map);
            return this;
        }

        public zoijcleaow wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
            copyOnWrite();
            ((ppxfxbqfkf) this.instance).cqumvgiudr(wkgbmnqykcVar);
            return this;
        }

        private zoijcleaow() {
            super(ppxfxbqfkf.DEFAULT_INSTANCE);
        }
    }

    static {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        DEFAULT_INSTANCE = ppxfxbqfkfVar;
        GeneratedMessageLite.registerDefaultInstance(ppxfxbqfkf.class, ppxfxbqfkfVar);
    }

    private ppxfxbqfkf() {
    }

    public static ppxfxbqfkf agtfadlqog() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cqumvgiudr(wkgbmnqykc wkgbmnqykcVar) {
        this.applicationProcessState_ = wkgbmnqykcVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void esjtqupxsv(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iwizpuwonk(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyumaefscl(nd.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.getClass();
        this.androidAppInfo_ = iobyxmoadgVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map ojitshcjhn() {
        return zdlpuopuiu();
    }

    public static zoijcleaow yggfygwlhe() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    private MapFieldLite zdlpuopuiu() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69738iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new ppxfxbqfkf();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", wkgbmnqykc.lqeggnwhkg(), "customAttributes_", C1501ppxfxbqfkf.f69739iobyxmoadg});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ppxfxbqfkf> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ppxfxbqfkf.class) {
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

    public boolean kcexrzcfyt() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean oxmwwwfdhm() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean rgvfuqvkyq() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean vdvldrhtss() {
        return (this.bitField0_ & 2) != 0;
    }

    public nd.iobyxmoadg wflxmlrfwp() {
        nd.iobyxmoadg iobyxmoadgVar = this.androidAppInfo_;
        return iobyxmoadgVar == null ? nd.iobyxmoadg.gtknphoqwx() : iobyxmoadgVar;
    }
}
