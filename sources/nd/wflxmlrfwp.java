package nd;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final wflxmlrfwp DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<wflxmlrfwp> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<wflxmlrfwp> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<gtknphoqwx> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69740iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69740iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69740iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final MapEntryLite f69741iobyxmoadg = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final MapEntryLite f69742iobyxmoadg;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f69742iobyxmoadg = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(Map map) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).cdpycssgdh().putAll(map);
            return this;
        }

        public zoijcleaow draadjrbmk(wflxmlrfwp wflxmlrfwpVar) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).zdlpuopuiu(wflxmlrfwpVar);
            return this;
        }

        public zoijcleaow gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).kcexrzcfyt(gtknphoqwxVar);
            return this;
        }

        public zoijcleaow kcexrzcfyt(String str) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).setName(str);
            return this;
        }

        public zoijcleaow lqeggnwhkg(Iterable iterable) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).vdvldrhtss(iterable);
            return this;
        }

        public zoijcleaow nufgyqmvbu(Iterable iterable) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).oxmwwwfdhm(iterable);
            return this;
        }

        public zoijcleaow ojitshcjhn(String str, long j13) {
            str.getClass();
            copyOnWrite();
            ((wflxmlrfwp) this.instance).istkbnxepw().put(str, Long.valueOf(j13));
            return this;
        }

        public zoijcleaow oxmwwwfdhm(long j13) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).cllcsxoeiz(j13);
            return this;
        }

        public zoijcleaow rgvfuqvkyq(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((wflxmlrfwp) this.instance).cdpycssgdh().put(str, str2);
            return this;
        }

        public zoijcleaow vdvldrhtss(long j13) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).hkdspvbjdz(j13);
            return this;
        }

        public zoijcleaow wflxmlrfwp(Map map) {
            copyOnWrite();
            ((wflxmlrfwp) this.instance).istkbnxepw().putAll(map);
            return this;
        }

        private zoijcleaow() {
            super(wflxmlrfwp.DEFAULT_INSTANCE);
        }
    }

    static {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        DEFAULT_INSTANCE = wflxmlrfwpVar;
        GeneratedMessageLite.registerDefaultInstance(wflxmlrfwp.class, wflxmlrfwpVar);
    }

    private wflxmlrfwp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map cdpycssgdh() {
        return hcddaimhww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cllcsxoeiz(long j13) {
        this.bitField0_ |= 8;
        this.durationUs_ = j13;
    }

    private MapFieldLite hcddaimhww() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hkdspvbjdz(long j13) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map istkbnxepw() {
        return pkzmftpjix();
    }

    private void iwizpuwonk() {
        Internal.ProtobufList<wflxmlrfwp> protobufList = this.subtraces_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static zoijcleaow jpowsppfya() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    private void jyumaefscl() {
        Internal.ProtobufList<gtknphoqwx> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kcexrzcfyt(gtknphoqwx gtknphoqwxVar) {
        gtknphoqwxVar.getClass();
        jyumaefscl();
        this.perfSessions_.add(gtknphoqwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oxmwwwfdhm(Iterable iterable) {
        iwizpuwonk();
        AbstractMessageLite.addAll(iterable, (List) this.subtraces_);
    }

    private MapFieldLite pkzmftpjix() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    public static wflxmlrfwp pmvmpeiblj() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vdvldrhtss(Iterable iterable) {
        jyumaefscl();
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    private MapFieldLite wwaezpbzkn() {
        return this.counters_;
    }

    private MapFieldLite ylkuphrtab() {
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zdlpuopuiu(wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwpVar.getClass();
        iwizpuwonk();
        this.subtraces_.add(wflxmlrfwpVar);
    }

    public int cqumvgiudr() {
        return wwaezpbzkn().size();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69740iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new wflxmlrfwp();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", ppxfxbqfkf.f69741iobyxmoadg, "subtraces_", wflxmlrfwp.class, "customAttributes_", wkgbmnqykc.f69742iobyxmoadg, "perfSessions_", gtknphoqwx.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<wflxmlrfwp> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (wflxmlrfwp.class) {
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

    public Map esjtqupxsv() {
        return Collections.unmodifiableMap(wwaezpbzkn());
    }

    public String getName() {
        return this.name_;
    }

    public List iozdgvuglv() {
        return this.subtraces_;
    }

    public Map lereixgezr() {
        return Collections.unmodifiableMap(ylkuphrtab());
    }

    public boolean lmojexxdyd() {
        return (this.bitField0_ & 4) != 0;
    }

    public List yadqdtsiqt() {
        return this.perfSessions_;
    }

    public boolean yggfygwlhe(String str) {
        str.getClass();
        return ylkuphrtab().containsKey(str);
    }

    public long zynmafqrjb() {
        return this.durationUs_;
    }
}
