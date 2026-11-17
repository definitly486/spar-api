package nb;

import com.google.crypto.tink.shaded.protobuf.cllcsxoeiz;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import com.google.crypto.tink.shaded.protobuf.ntlheqmsrt;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
    private static final zdlpuopuiu DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile ntlheqmsrt PARSER;
    private com.google.crypto.tink.shaded.protobuf.nufgyqmvbu encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.f23969yggfygwlhe;
    private cdpycssgdh keysetInfo_;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69492iobyxmoadg;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.values().length];
            f69492iobyxmoadg = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69492iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }

        public zoijcleaow agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            gxszxtbevo();
            ((zdlpuopuiu) this.f23934yggfygwlhe).ntlheqmsrt(nufgyqmvbuVar);
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

        public zoijcleaow ojitshcjhn(cdpycssgdh cdpycssgdhVar) {
            gxszxtbevo();
            ((zdlpuopuiu) this.f23934yggfygwlhe).ulzqkzuiru(cdpycssgdhVar);
            return this;
        }

        private zoijcleaow() {
            super(zdlpuopuiu.DEFAULT_INSTANCE);
        }
    }

    static {
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu();
        DEFAULT_INSTANCE = zdlpuopuiuVar;
        com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(zdlpuopuiu.class, zdlpuopuiuVar);
    }

    private zdlpuopuiu() {
    }

    public static zdlpuopuiu mbcevpiqjq(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ojitshcjhn ojitshcjhnVar) {
        return (zdlpuopuiu) com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iozdgvuglv(DEFAULT_INSTANCE, inputStream, ojitshcjhnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ntlheqmsrt(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.getClass();
        this.encryptedKeyset_ = nufgyqmvbuVar;
    }

    public static zoijcleaow tzroggbefp() {
        return (zoijcleaow) DEFAULT_INSTANCE.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ulzqkzuiru(cdpycssgdh cdpycssgdhVar) {
        cdpycssgdhVar.getClass();
        this.keysetInfo_ = cdpycssgdhVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
    protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69492iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new zdlpuopuiu();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ntlheqmsrt zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (zdlpuopuiu.class) {
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

    public com.google.crypto.tink.shaded.protobuf.nufgyqmvbu kegysxyocb() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
        return super.zynmafqrjb();
    }
}
