package nd;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final nufgyqmvbu DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<nufgyqmvbu> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<gtknphoqwx> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    public enum eablkybsjg implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final Internal.EnumLiteMap f69717iwizpuwonk = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f69720zdlpuopuiu;

        class iobyxmoadg implements Internal.EnumLiteMap {
            iobyxmoadg() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public eablkybsjg findValueByNumber(int i13) {
                return eablkybsjg.wkgbmnqykc(i13);
            }
        }

        private static final class zoijcleaow implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            static final Internal.EnumVerifier f69721iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i13) {
                return eablkybsjg.wkgbmnqykc(i13) != null;
            }
        }

        eablkybsjg(int i13) {
            this.f69720zdlpuopuiu = i13;
        }

        public static Internal.EnumVerifier lqeggnwhkg() {
            return zoijcleaow.f69721iobyxmoadg;
        }

        public static eablkybsjg wkgbmnqykc(int i13) {
            if (i13 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i13 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f69720zdlpuopuiu;
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69722iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69722iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69722iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final MapEntryLite f69723iobyxmoadg;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f69723iobyxmoadg = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    public enum wkgbmnqykc implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private static final Internal.EnumLiteMap f69733yadqdtsiqt = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f69736zdlpuopuiu;

        class iobyxmoadg implements Internal.EnumLiteMap {
            iobyxmoadg() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public wkgbmnqykc findValueByNumber(int i13) {
                return wkgbmnqykc.wkgbmnqykc(i13);
            }
        }

        private static final class zoijcleaow implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            static final Internal.EnumVerifier f69737iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i13) {
                return wkgbmnqykc.wkgbmnqykc(i13) != null;
            }
        }

        wkgbmnqykc(int i13) {
            this.f69736zdlpuopuiu = i13;
        }

        public static Internal.EnumVerifier lqeggnwhkg() {
            return zoijcleaow.f69737iobyxmoadg;
        }

        public static wkgbmnqykc wkgbmnqykc(int i13) {
            switch (i13) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f69736zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public boolean agtfadlqog() {
            return ((nufgyqmvbu) this.instance).wypolnanlu();
        }

        public zoijcleaow cqumvgiudr(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).jhduphickx(j13);
            return this;
        }

        public boolean draadjrbmk() {
            return ((nufgyqmvbu) this.instance).pkzmftpjix();
        }

        public zoijcleaow esjtqupxsv(String str) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).ikoacuggdj(str);
            return this;
        }

        public long gtknphoqwx() {
            return ((nufgyqmvbu) this.instance).wwaezpbzkn();
        }

        public zoijcleaow iwizpuwonk(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).vipkmwdibw(j13);
            return this;
        }

        public zoijcleaow jyumaefscl(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).ribwqtqdhb(j13);
            return this;
        }

        public zoijcleaow kcexrzcfyt(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).sopmlzcsov(j13);
            return this;
        }

        public zoijcleaow lqeggnwhkg(Iterable iterable) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).yggfygwlhe(iterable);
            return this;
        }

        public zoijcleaow nufgyqmvbu() {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).jyumaefscl();
            return this;
        }

        public zoijcleaow ojitshcjhn(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).tzroggbefp(j13);
            return this;
        }

        public zoijcleaow oxmwwwfdhm(eablkybsjg eablkybsjgVar) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).ulzqkzuiru(eablkybsjgVar);
            return this;
        }

        public zoijcleaow rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).mbcevpiqjq(wkgbmnqykcVar);
            return this;
        }

        public zoijcleaow vdvldrhtss(int i13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).ntlheqmsrt(i13);
            return this;
        }

        public boolean wflxmlrfwp() {
            return ((nufgyqmvbu) this.instance).jpowsppfya();
        }

        public zoijcleaow yggfygwlhe(long j13) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).jlmebxxoox(j13);
            return this;
        }

        public zoijcleaow zdlpuopuiu(String str) {
            copyOnWrite();
            ((nufgyqmvbu) this.instance).crxdokpmqz(str);
            return this;
        }

        private zoijcleaow() {
            super(nufgyqmvbu.DEFAULT_INSTANCE);
        }
    }

    static {
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu();
        DEFAULT_INSTANCE = nufgyqmvbuVar;
        GeneratedMessageLite.registerDefaultInstance(nufgyqmvbu.class, nufgyqmvbuVar);
    }

    private nufgyqmvbu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void crxdokpmqz(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public static nufgyqmvbu esjtqupxsv() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ikoacuggdj(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    private void iwizpuwonk() {
        Internal.ProtobufList<gtknphoqwx> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jhduphickx(long j13) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
        this.timeToResponseInitiatedUs_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jlmebxxoox(long j13) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyumaefscl() {
        this.bitField0_ &= -65;
        this.responseContentType_ = esjtqupxsv().cdpycssgdh();
    }

    public static zoijcleaow kegysxyocb() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mbcevpiqjq(wkgbmnqykc wkgbmnqykcVar) {
        this.httpMethod_ = wkgbmnqykcVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ntlheqmsrt(int i13) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ribwqtqdhb(long j13) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        this.timeToRequestCompletedUs_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sopmlzcsov(long j13) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tzroggbefp(long j13) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
        this.clientStartTimeUs_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ulzqkzuiru(eablkybsjg eablkybsjgVar) {
        this.networkClientErrorReason_ = eablkybsjgVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vipkmwdibw(long j13) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
        this.timeToResponseCompletedUs_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yggfygwlhe(Iterable iterable) {
        iwizpuwonk();
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    public String cdpycssgdh() {
        return this.responseContentType_;
    }

    public boolean cllcsxoeiz() {
        return (this.bitField0_ & 8) != 0;
    }

    public long cqumvgiudr() {
        return this.clientStartTimeUs_;
    }

    public boolean dsvhmnatus() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69722iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new nufgyqmvbu();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", wkgbmnqykc.lqeggnwhkg(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", eablkybsjg.lqeggnwhkg(), "customAttributes_", ppxfxbqfkf.f69723iobyxmoadg, "perfSessions_", gtknphoqwx.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<nufgyqmvbu> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (nufgyqmvbu.class) {
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

    public boolean hcddaimhww() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hkdspvbjdz() {
        return (this.bitField0_ & 4) != 0;
    }

    public long iozdgvuglv() {
        return this.timeToRequestCompletedUs_;
    }

    public long istkbnxepw() {
        return this.requestPayloadBytes_;
    }

    public boolean jpowsppfya() {
        return (this.bitField0_ & 32) != 0;
    }

    public wkgbmnqykc lereixgezr() {
        wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = wkgbmnqykc.wkgbmnqykc(this.httpMethod_);
        return wkgbmnqykcVarWkgbmnqykc == null ? wkgbmnqykc.HTTP_METHOD_UNKNOWN : wkgbmnqykcVarWkgbmnqykc;
    }

    public long lmojexxdyd() {
        return this.timeToResponseCompletedUs_;
    }

    public boolean pkzmftpjix() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    public int pmvmpeiblj() {
        return this.httpResponseCode_;
    }

    public boolean stevsuqkhv() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    public long wwaezpbzkn() {
        return this.timeToResponseInitiatedUs_;
    }

    public boolean wypolnanlu() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    public long yadqdtsiqt() {
        return this.responsePayloadBytes_;
    }

    public String ylkuphrtab() {
        return this.url_;
    }

    public List zynmafqrjb() {
        return this.perfSessions_;
    }
}
