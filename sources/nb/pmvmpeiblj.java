package nb;

import com.google.crypto.tink.shaded.protobuf.cllcsxoeiz;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import com.google.crypto.tink.shaded.protobuf.ntlheqmsrt;

/* JADX INFO: loaded from: classes2.dex */
public final class pmvmpeiblj extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
    private static final pmvmpeiblj DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile ntlheqmsrt PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.nufgyqmvbu value_ = com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.f23969yggfygwlhe;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69465iobyxmoadg;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.values().length];
            f69465iobyxmoadg = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69465iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(ylkuphrtab ylkuphrtabVar) {
            gxszxtbevo();
            ((pmvmpeiblj) this.f23934yggfygwlhe).crxdokpmqz(ylkuphrtabVar);
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

        public zoijcleaow ojitshcjhn(String str) {
            gxszxtbevo();
            ((pmvmpeiblj) this.f23934yggfygwlhe).jlmebxxoox(str);
            return this;
        }

        public zoijcleaow rgvfuqvkyq(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            gxszxtbevo();
            ((pmvmpeiblj) this.f23934yggfygwlhe).ribwqtqdhb(nufgyqmvbuVar);
            return this;
        }

        private zoijcleaow() {
            super(pmvmpeiblj.DEFAULT_INSTANCE);
        }
    }

    static {
        pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj();
        DEFAULT_INSTANCE = pmvmpeibljVar;
        com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(pmvmpeiblj.class, pmvmpeibljVar);
    }

    private pmvmpeiblj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void crxdokpmqz(ylkuphrtab ylkuphrtabVar) {
        this.outputPrefixType_ = ylkuphrtabVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jlmebxxoox(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ribwqtqdhb(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.getClass();
        this.value_ = nufgyqmvbuVar;
    }

    public static zoijcleaow sopmlzcsov() {
        return (zoijcleaow) DEFAULT_INSTANCE.gtknphoqwx();
    }

    public static pmvmpeiblj tzroggbefp() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
    protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69465iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new pmvmpeiblj();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ntlheqmsrt zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (pmvmpeiblj.class) {
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

    public ylkuphrtab mbcevpiqjq() {
        ylkuphrtab ylkuphrtabVarIobyxmoadg = ylkuphrtab.iobyxmoadg(this.outputPrefixType_);
        return ylkuphrtabVarIobyxmoadg == null ? ylkuphrtab.UNRECOGNIZED : ylkuphrtabVarIobyxmoadg;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
        return super.zynmafqrjb();
    }

    public String ntlheqmsrt() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.nufgyqmvbu ulzqkzuiru() {
        return this.value_;
    }
}
