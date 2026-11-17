package nb;

import com.google.crypto.tink.shaded.protobuf.cllcsxoeiz;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import com.google.crypto.tink.shaded.protobuf.ntlheqmsrt;

/* JADX INFO: loaded from: classes2.dex */
public final class iozdgvuglv extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk implements cllcsxoeiz {
    private static final iozdgvuglv DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile ntlheqmsrt PARSER;
    private String keyUri_ = "";

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f69445iobyxmoadg;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.values().length];
            f69445iobyxmoadg = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69445iobyxmoadg[com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class zoijcleaow extends com.google.crypto.tink.shaded.protobuf.iwizpuwonk.iobyxmoadg implements cllcsxoeiz {
        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
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

        private zoijcleaow() {
            super(iozdgvuglv.DEFAULT_INSTANCE);
        }
    }

    static {
        iozdgvuglv iozdgvuglvVar = new iozdgvuglv();
        DEFAULT_INSTANCE = iozdgvuglvVar;
        com.google.crypto.tink.shaded.protobuf.iwizpuwonk.hcddaimhww(iozdgvuglv.class, iozdgvuglvVar);
    }

    private iozdgvuglv() {
    }

    public static iozdgvuglv kegysxyocb(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn ojitshcjhnVar) {
        return (iozdgvuglv) com.google.crypto.tink.shaded.protobuf.iwizpuwonk.yadqdtsiqt(DEFAULT_INSTANCE, nufgyqmvbuVar, ojitshcjhnVar);
    }

    public static iozdgvuglv wypolnanlu() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.iwizpuwonk
    protected final Object agtfadlqog(com.google.crypto.tink.shaded.protobuf.iwizpuwonk.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        iobyxmoadg iobyxmoadgVar = null;
        switch (iobyxmoadg.f69445iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new iozdgvuglv();
            case 2:
                return new zoijcleaow(iobyxmoadgVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.iwizpuwonk.istkbnxepw(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ntlheqmsrt zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (iozdgvuglv.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public /* bridge */ /* synthetic */ hkdspvbjdz.iobyxmoadg newBuilderForType() {
        return super.zynmafqrjb();
    }

    public String stevsuqkhv() {
        return this.keyUri_;
    }
}
