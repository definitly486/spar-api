package nb;

import com.google.crypto.tink.shaded.protobuf.cllcsxoeiz;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import com.google.crypto.tink.shaded.protobuf.ntlheqmsrt;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class istkbnxepw extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
    private static final istkbnxepw DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile ntlheqmsrt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc key_ = com.google.crypto.tink.shaded.protobuf.iwizpuwonk.ojitshcjhn();
    private int primaryKeyId_;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69446iobyxmoadg;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.values().length];
            f69446iobyxmoadg = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69446iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class ppxfxbqfkf extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
        private static final ppxfxbqfkf DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ntlheqmsrt PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private esjtqupxsv keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class iobyxmoadg extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
            /* synthetic */ iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this();
            }

            public iobyxmoadg agtfadlqog(esjtqupxsv esjtqupxsvVar) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).ribwqtqdhb(esjtqupxsvVar);
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

            public iobyxmoadg ojitshcjhn(int i13) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).vipkmwdibw(i13);
                return this;
            }

            public iobyxmoadg rgvfuqvkyq(ylkuphrtab ylkuphrtabVar) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).jhduphickx(ylkuphrtabVar);
                return this;
            }

            public iobyxmoadg vdvldrhtss(lereixgezr lereixgezrVar) {
                gxszxtbevo();
                ((ppxfxbqfkf) this.f23934yggfygwlhe).ikoacuggdj(lereixgezrVar);
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
        public void ikoacuggdj(lereixgezr lereixgezrVar) {
            this.status_ = lereixgezrVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jhduphickx(ylkuphrtab ylkuphrtabVar) {
            this.outputPrefixType_ = ylkuphrtabVar.getNumber();
        }

        public static iobyxmoadg jlmebxxoox() {
            return (iobyxmoadg) DEFAULT_INSTANCE.gtknphoqwx();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ribwqtqdhb(esjtqupxsv esjtqupxsvVar) {
            esjtqupxsvVar.getClass();
            this.keyData_ = esjtqupxsvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vipkmwdibw(int i13) {
            this.keyId_ = i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
        protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
            iobyxmoadg iobyxmoadgVar = null;
            switch (iobyxmoadg.f69446iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
                case 1:
                    return new ppxfxbqfkf();
                case 2:
                    return new iobyxmoadg(iobyxmoadgVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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

        public boolean crxdokpmqz() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.cllcsxoeiz
        public /* bridge */ /* synthetic */ hkdspvbjdz getDefaultInstanceForType() {
            return super.vdvldrhtss();
        }

        public esjtqupxsv mbcevpiqjq() {
            esjtqupxsv esjtqupxsvVar = this.keyData_;
            return esjtqupxsvVar == null ? esjtqupxsv.tzroggbefp() : esjtqupxsvVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
        public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
            return super.zynmafqrjb();
        }

        public int ntlheqmsrt() {
            return this.keyId_;
        }

        public lereixgezr sopmlzcsov() {
            lereixgezr lereixgezrVarIobyxmoadg = lereixgezr.iobyxmoadg(this.status_);
            return lereixgezrVarIobyxmoadg == null ? lereixgezr.UNRECOGNIZED : lereixgezrVarIobyxmoadg;
        }

        public ylkuphrtab ulzqkzuiru() {
            ylkuphrtab ylkuphrtabVarIobyxmoadg = ylkuphrtab.iobyxmoadg(this.outputPrefixType_);
            return ylkuphrtabVarIobyxmoadg == null ? ylkuphrtab.UNRECOGNIZED : ylkuphrtabVarIobyxmoadg;
        }
    }

    public static final class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar) {
            gxszxtbevo();
            ((istkbnxepw) this.f23934yggfygwlhe).kegysxyocb(ppxfxbqfkfVar);
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

        public ppxfxbqfkf ojitshcjhn(int i13) {
            return ((istkbnxepw) this.f23934yggfygwlhe).mbcevpiqjq(i13);
        }

        public zoijcleaow oxmwwwfdhm(int i13) {
            gxszxtbevo();
            ((istkbnxepw) this.f23934yggfygwlhe).vipkmwdibw(i13);
            return this;
        }

        public int rgvfuqvkyq() {
            return ((istkbnxepw) this.f23934yggfygwlhe).ntlheqmsrt();
        }

        public List vdvldrhtss() {
            return Collections.unmodifiableList(((istkbnxepw) this.f23934yggfygwlhe).ulzqkzuiru());
        }

        private zoijcleaow() {
            super(istkbnxepw.DEFAULT_INSTANCE);
        }
    }

    static {
        istkbnxepw istkbnxepwVar = new istkbnxepw();
        DEFAULT_INSTANCE = istkbnxepwVar;
        com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(istkbnxepw.class, istkbnxepwVar);
    }

    private istkbnxepw() {
    }

    public static zoijcleaow crxdokpmqz() {
        return (zoijcleaow) DEFAULT_INSTANCE.gtknphoqwx();
    }

    public static istkbnxepw jlmebxxoox(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ojitshcjhn ojitshcjhnVar) {
        return (istkbnxepw) com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iozdgvuglv(DEFAULT_INSTANCE, inputStream, ojitshcjhnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kegysxyocb(ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.getClass();
        tzroggbefp();
        this.key_.add(ppxfxbqfkfVar);
    }

    public static istkbnxepw ribwqtqdhb(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ojitshcjhn ojitshcjhnVar) {
        return (istkbnxepw) com.google.crypto.tink.shaded.protobuf.iwizpuwonk.lmojexxdyd(DEFAULT_INSTANCE, bArr, ojitshcjhnVar);
    }

    private void tzroggbefp() {
        com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar = this.key_;
        if (wkgbmnqykcVar.isModifiable()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.iwizpuwonk.pmvmpeiblj(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vipkmwdibw(int i13) {
        this.primaryKeyId_ = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
    protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69446iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new istkbnxepw();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", ppxfxbqfkf.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ntlheqmsrt zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (istkbnxepw.class) {
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
        return (ppxfxbqfkf) this.key_.get(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
        return super.zynmafqrjb();
    }

    public int ntlheqmsrt() {
        return this.key_.size();
    }

    public int sopmlzcsov() {
        return this.primaryKeyId_;
    }

    public List ulzqkzuiru() {
        return this.key_;
    }
}
