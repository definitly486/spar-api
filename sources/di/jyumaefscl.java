package di;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class jyumaefscl extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28589iozdgvuglv = new iobyxmoadg();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final jyumaefscl f28590yadqdtsiqt;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f28591cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28592cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ppxfxbqfkf f28593esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte f28594istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28595iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f28596jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f28597lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f28598pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28599yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private wkgbmnqykc f28600zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public jyumaefscl zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new jyumaefscl(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public enum ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28601cqumvgiudr = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f28606zdlpuopuiu;

        static class iobyxmoadg implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow {
            iobyxmoadg() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public ppxfxbqfkf findValueByNumber(int i13) {
                return ppxfxbqfkf.iobyxmoadg(i13);
            }
        }

        ppxfxbqfkf(int i13, int i14) {
            this.f28606zdlpuopuiu = i14;
        }

        public static ppxfxbqfkf iobyxmoadg(int i13) {
            if (i13 == 0) {
                return WARNING;
            }
            if (i13 == 1) {
                return ERROR;
            }
            if (i13 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
        public final int getNumber() {
            return this.f28606zdlpuopuiu;
        }
    }

    public enum wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28607cqumvgiudr = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f28612zdlpuopuiu;

        static class iobyxmoadg implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow {
            iobyxmoadg() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public wkgbmnqykc findValueByNumber(int i13) {
                return wkgbmnqykc.iobyxmoadg(i13);
            }
        }

        wkgbmnqykc(int i13, int i14) {
            this.f28612zdlpuopuiu = i14;
        }

        public static wkgbmnqykc iobyxmoadg(int i13) {
            if (i13 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i13 == 1) {
                return COMPILER_VERSION;
            }
            if (i13 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
        public final int getNumber() {
            return this.f28612zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f28614esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28615iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f28616jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private int f28617lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28619yggfygwlhe;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private ppxfxbqfkf f28613cqumvgiudr = ppxfxbqfkf.ERROR;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private wkgbmnqykc f28618pmvmpeiblj = wkgbmnqykc.LANGUAGE_VERSION;

        private zoijcleaow() {
            wflxmlrfwp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow draadjrbmk() {
            return new zoijcleaow();
        }

        private void wflxmlrfwp() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(jyumaefscl jyumaefsclVar) {
            if (jyumaefsclVar == jyumaefscl.istkbnxepw()) {
                return this;
            }
            if (jyumaefsclVar.cllcsxoeiz()) {
                kcexrzcfyt(jyumaefsclVar.wwaezpbzkn());
            }
            if (jyumaefsclVar.dsvhmnatus()) {
                zdlpuopuiu(jyumaefsclVar.ylkuphrtab());
            }
            if (jyumaefsclVar.jpowsppfya()) {
                vdvldrhtss(jyumaefsclVar.yadqdtsiqt());
            }
            if (jyumaefsclVar.hcddaimhww()) {
                rgvfuqvkyq(jyumaefsclVar.cdpycssgdh());
            }
            if (jyumaefsclVar.hkdspvbjdz()) {
                oxmwwwfdhm(jyumaefsclVar.lmojexxdyd());
            }
            if (jyumaefsclVar.wypolnanlu()) {
                yggfygwlhe(jyumaefsclVar.pkzmftpjix());
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(jyumaefsclVar.f28599yggfygwlhe));
            return this;
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        public zoijcleaow kcexrzcfyt(int i13) {
            this.f28619yggfygwlhe |= 1;
            this.f28616jyumaefscl = i13;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public jyumaefscl build() {
            jyumaefscl jyumaefsclVarNufgyqmvbu = nufgyqmvbu();
            if (jyumaefsclVarNufgyqmvbu.isInitialized()) {
                return jyumaefsclVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(jyumaefsclVarNufgyqmvbu);
        }

        public jyumaefscl nufgyqmvbu() {
            jyumaefscl jyumaefsclVar = new jyumaefscl(this);
            int i13 = this.f28619yggfygwlhe;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            jyumaefsclVar.f28595iwizpuwonk = this.f28616jyumaefscl;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            jyumaefsclVar.f28592cqumvgiudr = this.f28615iwizpuwonk;
            if ((i13 & 4) == 4) {
                i14 |= 4;
            }
            jyumaefsclVar.f28593esjtqupxsv = this.f28613cqumvgiudr;
            if ((i13 & 8) == 8) {
                i14 |= 8;
            }
            jyumaefsclVar.f28597lereixgezr = this.f28614esjtqupxsv;
            if ((i13 & 16) == 16) {
                i14 |= 16;
            }
            jyumaefsclVar.f28598pmvmpeiblj = this.f28617lereixgezr;
            if ((i13 & 32) == 32) {
                i14 |= 32;
            }
            jyumaefsclVar.f28600zynmafqrjb = this.f28618pmvmpeiblj;
            jyumaefsclVar.f28596jyumaefscl = i14;
            return jyumaefsclVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            jyumaefscl jyumaefsclVar = null;
            try {
                try {
                    jyumaefscl jyumaefsclVar2 = (jyumaefscl) jyumaefscl.f28589iozdgvuglv.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (jyumaefsclVar2 != null) {
                        wkgbmnqykc(jyumaefsclVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    jyumaefscl jyumaefsclVar3 = (jyumaefscl) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        jyumaefsclVar = jyumaefsclVar3;
                        if (jyumaefsclVar != null) {
                            wkgbmnqykc(jyumaefsclVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (jyumaefsclVar != null) {
                    wkgbmnqykc(jyumaefsclVar);
                }
                throw th;
            }
        }

        public zoijcleaow oxmwwwfdhm(int i13) {
            this.f28619yggfygwlhe |= 16;
            this.f28617lereixgezr = i13;
            return this;
        }

        public zoijcleaow rgvfuqvkyq(int i13) {
            this.f28619yggfygwlhe |= 8;
            this.f28614esjtqupxsv = i13;
            return this;
        }

        public zoijcleaow vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar) {
            ppxfxbqfkfVar.getClass();
            this.f28619yggfygwlhe |= 4;
            this.f28613cqumvgiudr = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow yggfygwlhe(wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.getClass();
            this.f28619yggfygwlhe |= 32;
            this.f28618pmvmpeiblj = wkgbmnqykcVar;
            return this;
        }

        public zoijcleaow zdlpuopuiu(int i13) {
            this.f28619yggfygwlhe |= 2;
            this.f28615iwizpuwonk = i13;
            return this;
        }
    }

    static {
        jyumaefscl jyumaefsclVar = new jyumaefscl(true);
        f28590yadqdtsiqt = jyumaefsclVar;
        jyumaefsclVar.stevsuqkhv();
    }

    public static jyumaefscl istkbnxepw() {
        return f28590yadqdtsiqt;
    }

    public static zoijcleaow mbcevpiqjq(jyumaefscl jyumaefsclVar) {
        return tzroggbefp().wkgbmnqykc(jyumaefsclVar);
    }

    private void stevsuqkhv() {
        this.f28595iwizpuwonk = 0;
        this.f28592cqumvgiudr = 0;
        this.f28593esjtqupxsv = ppxfxbqfkf.ERROR;
        this.f28597lereixgezr = 0;
        this.f28598pmvmpeiblj = 0;
        this.f28600zynmafqrjb = wkgbmnqykc.LANGUAGE_VERSION;
    }

    public static zoijcleaow tzroggbefp() {
        return zoijcleaow.draadjrbmk();
    }

    public int cdpycssgdh() {
        return this.f28597lereixgezr;
    }

    public boolean cllcsxoeiz() {
        return (this.f28596jyumaefscl & 1) == 1;
    }

    public boolean dsvhmnatus() {
        return (this.f28596jyumaefscl & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28591cdpycssgdh;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28596jyumaefscl & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28595iwizpuwonk) : 0;
        if ((this.f28596jyumaefscl & 2) == 2) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28592cqumvgiudr);
        }
        if ((this.f28596jyumaefscl & 4) == 4) {
            iOjitshcjhn += CodedOutputStream.nufgyqmvbu(3, this.f28593esjtqupxsv.getNumber());
        }
        if ((this.f28596jyumaefscl & 8) == 8) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(4, this.f28597lereixgezr);
        }
        if ((this.f28596jyumaefscl & 16) == 16) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(5, this.f28598pmvmpeiblj);
        }
        if ((this.f28596jyumaefscl & 32) == 32) {
            iOjitshcjhn += CodedOutputStream.nufgyqmvbu(6, this.f28600zynmafqrjb.getNumber());
        }
        int size = iOjitshcjhn + this.f28599yggfygwlhe.size();
        this.f28591cdpycssgdh = size;
        return size;
    }

    public boolean hcddaimhww() {
        return (this.f28596jyumaefscl & 8) == 8;
    }

    public boolean hkdspvbjdz() {
        return (this.f28596jyumaefscl & 16) == 16;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f28596jyumaefscl & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28595iwizpuwonk);
        }
        if ((this.f28596jyumaefscl & 2) == 2) {
            codedOutputStream.ribwqtqdhb(2, this.f28592cqumvgiudr);
        }
        if ((this.f28596jyumaefscl & 4) == 4) {
            codedOutputStream.kegysxyocb(3, this.f28593esjtqupxsv.getNumber());
        }
        if ((this.f28596jyumaefscl & 8) == 8) {
            codedOutputStream.ribwqtqdhb(4, this.f28597lereixgezr);
        }
        if ((this.f28596jyumaefscl & 16) == 16) {
            codedOutputStream.ribwqtqdhb(5, this.f28598pmvmpeiblj);
        }
        if ((this.f28596jyumaefscl & 32) == 32) {
            codedOutputStream.kegysxyocb(6, this.f28600zynmafqrjb.getNumber());
        }
        codedOutputStream.rlfsiqarku(this.f28599yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28594istkbnxepw;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f28594istkbnxepw = (byte) 1;
        return true;
    }

    public boolean jpowsppfya() {
        return (this.f28596jyumaefscl & 4) == 4;
    }

    public int lmojexxdyd() {
        return this.f28598pmvmpeiblj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return tzroggbefp();
    }

    public wkgbmnqykc pkzmftpjix() {
        return this.f28600zynmafqrjb;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return mbcevpiqjq(this);
    }

    public int wwaezpbzkn() {
        return this.f28595iwizpuwonk;
    }

    public boolean wypolnanlu() {
        return (this.f28596jyumaefscl & 32) == 32;
    }

    public ppxfxbqfkf yadqdtsiqt() {
        return this.f28593esjtqupxsv;
    }

    public int ylkuphrtab() {
        return this.f28592cqumvgiudr;
    }

    private jyumaefscl(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28594istkbnxepw = (byte) -1;
        this.f28591cdpycssgdh = -1;
        this.f28599yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private jyumaefscl(boolean z13) {
        this.f28594istkbnxepw = (byte) -1;
        this.f28591cdpycssgdh = -1;
        this.f28599yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private jyumaefscl(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28594istkbnxepw = (byte) -1;
        this.f28591cdpycssgdh = -1;
        stevsuqkhv();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 8) {
                            this.f28596jyumaefscl |= 1;
                            this.f28595iwizpuwonk = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 16) {
                            this.f28596jyumaefscl |= 2;
                            this.f28592cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 24) {
                            int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                            ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg(iWflxmlrfwp);
                            if (ppxfxbqfkfVarIobyxmoadg == null) {
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp);
                            } else {
                                this.f28596jyumaefscl |= 4;
                                this.f28593esjtqupxsv = ppxfxbqfkfVarIobyxmoadg;
                            }
                        } else if (iPkzmftpjix == 32) {
                            this.f28596jyumaefscl |= 8;
                            this.f28597lereixgezr = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 40) {
                            this.f28596jyumaefscl |= 16;
                            this.f28598pmvmpeiblj = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix != 48) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            int iWflxmlrfwp2 = eablkybsjgVar.wflxmlrfwp();
                            wkgbmnqykc wkgbmnqykcVarIobyxmoadg = wkgbmnqykc.iobyxmoadg(iWflxmlrfwp2);
                            if (wkgbmnqykcVarIobyxmoadg == null) {
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp2);
                            } else {
                                this.f28596jyumaefscl |= 32;
                                this.f28600zynmafqrjb = wkgbmnqykcVarIobyxmoadg;
                            }
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28599yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                    }
                    draadjrbmk();
                    throw th2;
                }
            } catch (InvalidProtocolBufferException e13) {
                throw e13.ojitshcjhn(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).ojitshcjhn(this);
            }
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28599yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
