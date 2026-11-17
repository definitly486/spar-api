package nb;

import com.google.crypto.tink.shaded.protobuf.cllcsxoeiz;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import com.google.crypto.tink.shaded.protobuf.ntlheqmsrt;

/* JADX INFO: loaded from: classes2.dex */
public final class cdpycssgdh extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
    private static final cdpycssgdh DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile ntlheqmsrt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc keyInfo_ = com.google.crypto.tink.shaded.protobuf.iwizpuwonk.ojitshcjhn();
    private int primaryKeyId_;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69426iobyxmoadg;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.values().length];
            f69426iobyxmoadg = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69426iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class ppxfxbqfkf extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
        private static final ppxfxbqfkf DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ntlheqmsrt PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class iobyxmoadg extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
            /* synthetic */ iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this();
            }

            public iobyxmoadg agtfadlqog(int i13) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).ulzqkzuiru(i13);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz.iobyxmoadg
            public /* bridge */ /* synthetic */ hkdspvbjdz buildPartial() {
                return super.wkgbmnqykc();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.eablkybsjg();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.cllcsxoeiz
            public /* bridge */ /* synthetic */ hkdspvbjdz getDefaultInstanceForType() {
                return super.nufgyqmvbu();
            }

            public iobyxmoadg ojitshcjhn(ylkuphrtab ylkuphrtabVar) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).sopmlzcsov(ylkuphrtabVar);
                return this;
            }

            public iobyxmoadg rgvfuqvkyq(lereixgezr lereixgezrVar) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).crxdokpmqz(lereixgezrVar);
                return this;
            }

            public iobyxmoadg vdvldrhtss(String str) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).jlmebxxoox(str);
                return this;
            }

            private iobyxmoadg() {
                super(ppxfxbqfkf.DEFAULT_INSTANCE);
            }
        }

        static {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            DEFAULT_INSTANCE = ppxfxbqfkfVar;
            com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(ppxfxbqfkf.class, ppxfxbqfkfVar);
        }

        private ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crxdokpmqz(lereixgezr lereixgezrVar) {
            this.status_ = lereixgezrVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jlmebxxoox(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public static iobyxmoadg ntlheqmsrt() {
            return (iobyxmoadg) DEFAULT_INSTANCE.gtknphoqwx();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sopmlzcsov(ylkuphrtab ylkuphrtabVar) {
            this.outputPrefixType_ = ylkuphrtabVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ulzqkzuiru(int i13) {
            this.keyId_ = i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
        protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
            iobyxmoadg iobyxmoadgVar = null;
            switch (iobyxmoadg.f69426iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
                case 1:
                    return new ppxfxbqfkf();
                case 2:
                    return new iobyxmoadg(iobyxmoadgVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    ntlheqmsrt zoijcleaowVar = PARSER;
                    if (zoijcleaowVar == null) {
                        synchronized (ppxfxbqfkf.class) {
                            try {
                                zoijcleaowVar = PARSER;
                                if (zoijcleaowVar == null) {
                                    zoijcleaowVar = new com.google.crypto.tink.shaded.protobuf.iwizpuwonk.zoijcleaow(DEFAULT_INSTANCE);
                                    PARSER = zoijcleaowVar;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    }
                    return zoijcleaowVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.cllcsxoeiz
        public /* bridge */ /* synthetic */ hkdspvbjdz getDefaultInstanceForType() {
            return super.vdvldrhtss();
        }

        public int mbcevpiqjq() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
        public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
            return super.zynmafqrjb();
        }
    }

    public static final class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar) {
            gxszxtbevo();
            ((cdpycssgdh) this.f23934yggfygwlhe).kegysxyocb(ppxfxbqfkfVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz.iobyxmoadg
        public /* bridge */ /* synthetic */ hkdspvbjdz buildPartial() {
            return super.wkgbmnqykc();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.eablkybsjg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.cllcsxoeiz
        public /* bridge */ /* synthetic */ hkdspvbjdz getDefaultInstanceForType() {
            return super.nufgyqmvbu();
        }

        public zoijcleaow ojitshcjhn(int i13) {
            gxszxtbevo();
            ((cdpycssgdh) this.f23934yggfygwlhe).ulzqkzuiru(i13);
            return this;
        }

        private zoijcleaow() {
            super(cdpycssgdh.DEFAULT_INSTANCE);
        }
    }

    static {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh();
        DEFAULT_INSTANCE = cdpycssgdhVar;
        com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(cdpycssgdh.class, cdpycssgdhVar);
    }

    private cdpycssgdh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kegysxyocb(ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.getClass();
        tzroggbefp();
        this.keyInfo_.add(ppxfxbqfkfVar);
    }

    public static zoijcleaow ntlheqmsrt() {
        return (zoijcleaow) DEFAULT_INSTANCE.gtknphoqwx();
    }

    private void tzroggbefp() {
        com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar = this.keyInfo_;
        if (wkgbmnqykcVar.isModifiable()) {
            return;
        }
        this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.iwizpuwonk.pmvmpeiblj(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ulzqkzuiru(int i13) {
        this.primaryKeyId_ = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
    protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69426iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new cdpycssgdh();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", ppxfxbqfkf.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ntlheqmsrt zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (cdpycssgdh.class) {
                        try {
                            zoijcleaowVar = PARSER;
                            if (zoijcleaowVar == null) {
                                zoijcleaowVar = new com.google.crypto.tink.shaded.protobuf.iwizpuwonk.zoijcleaow(DEFAULT_INSTANCE);
                                PARSER = zoijcleaowVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return zoijcleaowVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cllcsxoeiz
    public /* bridge */ /* synthetic */ hkdspvbjdz getDefaultInstanceForType() {
        return super.vdvldrhtss();
    }

    public ppxfxbqfkf mbcevpiqjq(int i13) {
        return (ppxfxbqfkf) this.keyInfo_.get(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
        return super.zynmafqrjb();
    }
}
