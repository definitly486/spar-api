package f2;

import androidx.datastore.preferences.protobuf.kcexrzcfyt;
import androidx.datastore.preferences.protobuf.wypolnanlu;
import androidx.datastore.preferences.protobuf.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu extends kcexrzcfyt implements ylkuphrtab {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final nufgyqmvbu DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile wypolnanlu PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class iobyxmoadg extends kcexrzcfyt.iobyxmoadg implements ylkuphrtab {
        /* synthetic */ iobyxmoadg(eablkybsjg eablkybsjgVar) {
            this();
        }

        public iobyxmoadg iwizpuwonk(lqeggnwhkg.iobyxmoadg iobyxmoadgVar) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).vipkmwdibw(iobyxmoadgVar);
            return this;
        }

        public iobyxmoadg jyumaefscl(String str) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).ribwqtqdhb(str);
            return this;
        }

        public iobyxmoadg kcexrzcfyt(float f13) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).sopmlzcsov(f13);
            return this;
        }

        public iobyxmoadg oxmwwwfdhm(double d13) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).ulzqkzuiru(d13);
            return this;
        }

        public iobyxmoadg vdvldrhtss(boolean z13) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).ntlheqmsrt(z13);
            return this;
        }

        public iobyxmoadg yggfygwlhe(long j13) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).jlmebxxoox(j13);
            return this;
        }

        public iobyxmoadg zdlpuopuiu(int i13) {
            draadjrbmk();
            ((nufgyqmvbu) this.f8683yggfygwlhe).crxdokpmqz(i13);
            return this;
        }

        private iobyxmoadg() {
            super(nufgyqmvbu.DEFAULT_INSTANCE);
        }
    }

    public enum zoijcleaow {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f32588zdlpuopuiu;

        zoijcleaow(int i13) {
            this.f32588zdlpuopuiu = i13;
        }

        public static zoijcleaow iobyxmoadg(int i13) {
            switch (i13) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu();
        DEFAULT_INSTANCE = nufgyqmvbuVar;
        kcexrzcfyt.lereixgezr(nufgyqmvbu.class, nufgyqmvbuVar);
    }

    private nufgyqmvbu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void crxdokpmqz(int i13) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jlmebxxoox(long j13) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j13);
    }

    public static nufgyqmvbu jpowsppfya() {
        return DEFAULT_INSTANCE;
    }

    public static iobyxmoadg mbcevpiqjq() {
        return (iobyxmoadg) DEFAULT_INSTANCE.btonecajqb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ntlheqmsrt(boolean z13) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ribwqtqdhb(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sopmlzcsov(float f13) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ulzqkzuiru(double d13) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vipkmwdibw(lqeggnwhkg.iobyxmoadg iobyxmoadgVar) {
        this.value_ = iobyxmoadgVar.lqeggnwhkg();
        this.valueCase_ = 6;
    }

    public float cllcsxoeiz() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int dsvhmnatus() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public boolean hcddaimhww() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double hkdspvbjdz() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public lqeggnwhkg kegysxyocb() {
        return this.valueCase_ == 6 ? (lqeggnwhkg) this.value_ : lqeggnwhkg.iozdgvuglv();
    }

    public String stevsuqkhv() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public zoijcleaow tzroggbefp() {
        return zoijcleaow.iobyxmoadg(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.kcexrzcfyt
    protected final Object wflxmlrfwp(kcexrzcfyt.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        eablkybsjg eablkybsjgVar = null;
        switch (eablkybsjg.f32576iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new nufgyqmvbu();
            case 2:
                return new iobyxmoadg(eablkybsjgVar);
            case 3:
                return kcexrzcfyt.iwizpuwonk(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", lqeggnwhkg.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wypolnanlu zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (nufgyqmvbu.class) {
                        try {
                            zoijcleaowVar = PARSER;
                            if (zoijcleaowVar == null) {
                                zoijcleaowVar = new kcexrzcfyt.zoijcleaow(DEFAULT_INSTANCE);
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

    public long wypolnanlu() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
