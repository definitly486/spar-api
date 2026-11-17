package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww extends GeneratedMessageLite implements btonecajqb {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final dxjokdxxww DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<dxjokdxxww> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ppxfxbqfkf applicationInfo_;
    private int bitField0_;
    private lqeggnwhkg gaugeMetric_;
    private nufgyqmvbu networkRequestMetric_;
    private wflxmlrfwp traceMetric_;
    private agtfadlqog transportInfo_;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69710iobyxmoadg;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f69710iobyxmoadg = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69710iobyxmoadg[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends GeneratedMessageLite.Builder implements btonecajqb {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow draadjrbmk(wflxmlrfwp wflxmlrfwpVar) {
            copyOnWrite();
            ((dxjokdxxww) this.instance).oxmwwwfdhm(wflxmlrfwpVar);
            return this;
        }

        @Override // nd.btonecajqb
        public wflxmlrfwp eablkybsjg() {
            return ((dxjokdxxww) this.instance).eablkybsjg();
        }

        public zoijcleaow gtknphoqwx(nufgyqmvbu nufgyqmvbuVar) {
            copyOnWrite();
            ((dxjokdxxww) this.instance).vdvldrhtss(nufgyqmvbuVar);
            return this;
        }

        @Override // nd.btonecajqb
        public lqeggnwhkg gxszxtbevo() {
            return ((dxjokdxxww) this.instance).gxszxtbevo();
        }

        @Override // nd.btonecajqb
        public boolean iobyxmoadg() {
            return ((dxjokdxxww) this.instance).iobyxmoadg();
        }

        public zoijcleaow lqeggnwhkg(ppxfxbqfkf.zoijcleaow zoijcleaowVar) {
            copyOnWrite();
            ((dxjokdxxww) this.instance).ojitshcjhn((ppxfxbqfkf) zoijcleaowVar.build());
            return this;
        }

        public zoijcleaow nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar) {
            copyOnWrite();
            ((dxjokdxxww) this.instance).rgvfuqvkyq(lqeggnwhkgVar);
            return this;
        }

        @Override // nd.btonecajqb
        public nufgyqmvbu ppxfxbqfkf() {
            return ((dxjokdxxww) this.instance).ppxfxbqfkf();
        }

        @Override // nd.btonecajqb
        public boolean wkgbmnqykc() {
            return ((dxjokdxxww) this.instance).wkgbmnqykc();
        }

        @Override // nd.btonecajqb
        public boolean zoijcleaow() {
            return ((dxjokdxxww) this.instance).zoijcleaow();
        }

        private zoijcleaow() {
            super(dxjokdxxww.DEFAULT_INSTANCE);
        }
    }

    static {
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww();
        DEFAULT_INSTANCE = dxjokdxxwwVar;
        GeneratedMessageLite.registerDefaultInstance(dxjokdxxww.class, dxjokdxxwwVar);
    }

    private dxjokdxxww() {
    }

    public static zoijcleaow agtfadlqog() {
        return (zoijcleaow) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.getClass();
        this.applicationInfo_ = ppxfxbqfkfVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oxmwwwfdhm(wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwpVar.getClass();
        this.traceMetric_ = wflxmlrfwpVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.getClass();
        this.gaugeMetric_ = lqeggnwhkgVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vdvldrhtss(nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.getClass();
        this.networkRequestMetric_ = nufgyqmvbuVar;
        this.bitField0_ |= 4;
    }

    public ppxfxbqfkf draadjrbmk() {
        ppxfxbqfkf ppxfxbqfkfVar = this.applicationInfo_;
        return ppxfxbqfkfVar == null ? ppxfxbqfkf.agtfadlqog() : ppxfxbqfkfVar;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69710iobyxmoadg[methodToInvoke.ordinal()]) {
            case 1:
                return new dxjokdxxww();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<dxjokdxxww> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (dxjokdxxww.class) {
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

    @Override // nd.btonecajqb
    public wflxmlrfwp eablkybsjg() {
        wflxmlrfwp wflxmlrfwpVar = this.traceMetric_;
        return wflxmlrfwpVar == null ? wflxmlrfwp.pmvmpeiblj() : wflxmlrfwpVar;
    }

    @Override // nd.btonecajqb
    public lqeggnwhkg gxszxtbevo() {
        lqeggnwhkg lqeggnwhkgVar = this.gaugeMetric_;
        return lqeggnwhkgVar == null ? lqeggnwhkg.oxmwwwfdhm() : lqeggnwhkgVar;
    }

    @Override // nd.btonecajqb
    public boolean iobyxmoadg() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // nd.btonecajqb
    public nufgyqmvbu ppxfxbqfkf() {
        nufgyqmvbu nufgyqmvbuVar = this.networkRequestMetric_;
        return nufgyqmvbuVar == null ? nufgyqmvbu.esjtqupxsv() : nufgyqmvbuVar;
    }

    public boolean wflxmlrfwp() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // nd.btonecajqb
    public boolean wkgbmnqykc() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // nd.btonecajqb
    public boolean zoijcleaow() {
        return (this.bitField0_ & 4) != 0;
    }
}
