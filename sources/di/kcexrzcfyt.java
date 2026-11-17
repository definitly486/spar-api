package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final kcexrzcfyt f28620lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28621wwaezpbzkn = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f28622cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28623cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f28624esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f28625iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private List f28626istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28627iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28628jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f28629lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ppxfxbqfkf f28630pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private byte f28631yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private List f28632zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public kcexrzcfyt zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new kcexrzcfyt(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public enum ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28633cqumvgiudr = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f28638zdlpuopuiu;

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
            this.f28638zdlpuopuiu = i14;
        }

        public static ppxfxbqfkf iobyxmoadg(int i13) {
            if (i13 == 0) {
                return IN;
            }
            if (i13 == 1) {
                return OUT;
            }
            if (i13 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
        public final int getNumber() {
            return this.f28638zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28639cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f28640esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28642iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private boolean f28643lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private ppxfxbqfkf f28644pmvmpeiblj = ppxfxbqfkf.INV;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private List f28645zynmafqrjb = Collections.emptyList();

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private List f28641istkbnxepw = Collections.emptyList();

        private zoijcleaow() {
            kcexrzcfyt();
        }

        private void kcexrzcfyt() {
        }

        private void oxmwwwfdhm() {
            if ((this.f28642iwizpuwonk & 16) != 16) {
                this.f28645zynmafqrjb = new ArrayList(this.f28645zynmafqrjb);
                this.f28642iwizpuwonk |= 16;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
            if ((this.f28642iwizpuwonk & 32) != 32) {
                this.f28641istkbnxepw = new ArrayList(this.f28641istkbnxepw);
                this.f28642iwizpuwonk |= 32;
            }
        }

        public kcexrzcfyt agtfadlqog() {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(this);
            int i13 = this.f28642iwizpuwonk;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            kcexrzcfytVar.f28623cqumvgiudr = this.f28639cqumvgiudr;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            kcexrzcfytVar.f28624esjtqupxsv = this.f28640esjtqupxsv;
            if ((i13 & 4) == 4) {
                i14 |= 4;
            }
            kcexrzcfytVar.f28629lereixgezr = this.f28643lereixgezr;
            if ((i13 & 8) == 8) {
                i14 |= 8;
            }
            kcexrzcfytVar.f28630pmvmpeiblj = this.f28644pmvmpeiblj;
            if ((this.f28642iwizpuwonk & 16) == 16) {
                this.f28645zynmafqrjb = Collections.unmodifiableList(this.f28645zynmafqrjb);
                this.f28642iwizpuwonk &= -17;
            }
            kcexrzcfytVar.f28632zynmafqrjb = this.f28645zynmafqrjb;
            if ((this.f28642iwizpuwonk & 32) == 32) {
                this.f28641istkbnxepw = Collections.unmodifiableList(this.f28641istkbnxepw);
                this.f28642iwizpuwonk &= -33;
            }
            kcexrzcfytVar.f28626istkbnxepw = this.f28641istkbnxepw;
            kcexrzcfytVar.f28627iwizpuwonk = i14;
            return kcexrzcfytVar;
        }

        public zoijcleaow cqumvgiudr(boolean z13) {
            this.f28642iwizpuwonk |= 4;
            this.f28643lereixgezr = z13;
            return this;
        }

        public zoijcleaow esjtqupxsv(ppxfxbqfkf ppxfxbqfkfVar) {
            ppxfxbqfkfVar.getClass();
            this.f28642iwizpuwonk |= 8;
            this.f28644pmvmpeiblj = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow iwizpuwonk(int i13) {
            this.f28642iwizpuwonk |= 2;
            this.f28640esjtqupxsv = i13;
            return this;
        }

        public zoijcleaow jyumaefscl(int i13) {
            this.f28642iwizpuwonk |= 1;
            this.f28639cqumvgiudr = i13;
            return this;
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public kcexrzcfyt build() {
            kcexrzcfyt kcexrzcfytVarAgtfadlqog = agtfadlqog();
            if (kcexrzcfytVarAgtfadlqog.isInitialized()) {
                return kcexrzcfytVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(kcexrzcfytVarAgtfadlqog);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            kcexrzcfyt kcexrzcfytVar = null;
            try {
                try {
                    kcexrzcfyt kcexrzcfytVar2 = (kcexrzcfyt) kcexrzcfyt.f28621wwaezpbzkn.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (kcexrzcfytVar2 != null) {
                        wkgbmnqykc(kcexrzcfytVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    kcexrzcfyt kcexrzcfytVar3 = (kcexrzcfyt) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        kcexrzcfytVar = kcexrzcfytVar3;
                        if (kcexrzcfytVar != null) {
                            wkgbmnqykc(kcexrzcfytVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (kcexrzcfytVar != null) {
                    wkgbmnqykc(kcexrzcfytVar);
                }
                throw th;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(kcexrzcfyt kcexrzcfytVar) {
            if (kcexrzcfytVar == kcexrzcfyt.dsvhmnatus()) {
                return this;
            }
            if (kcexrzcfytVar.ribwqtqdhb()) {
                jyumaefscl(kcexrzcfytVar.stevsuqkhv());
            }
            if (kcexrzcfytVar.vipkmwdibw()) {
                iwizpuwonk(kcexrzcfytVar.tzroggbefp());
            }
            if (kcexrzcfytVar.jhduphickx()) {
                cqumvgiudr(kcexrzcfytVar.mbcevpiqjq());
            }
            if (kcexrzcfytVar.ikoacuggdj()) {
                esjtqupxsv(kcexrzcfytVar.jlmebxxoox());
            }
            if (!kcexrzcfytVar.f28632zynmafqrjb.isEmpty()) {
                if (this.f28645zynmafqrjb.isEmpty()) {
                    this.f28645zynmafqrjb = kcexrzcfytVar.f28632zynmafqrjb;
                    this.f28642iwizpuwonk &= -17;
                } else {
                    oxmwwwfdhm();
                    this.f28645zynmafqrjb.addAll(kcexrzcfytVar.f28632zynmafqrjb);
                }
            }
            if (!kcexrzcfytVar.f28626istkbnxepw.isEmpty()) {
                if (this.f28641istkbnxepw.isEmpty()) {
                    this.f28641istkbnxepw = kcexrzcfytVar.f28626istkbnxepw;
                    this.f28642iwizpuwonk &= -33;
                } else {
                    vdvldrhtss();
                    this.f28641istkbnxepw.addAll(kcexrzcfytVar.f28626istkbnxepw);
                }
            }
            gtknphoqwx(kcexrzcfytVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(kcexrzcfytVar.f28628jyumaefscl));
            return this;
        }
    }

    static {
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(true);
        f28620lmojexxdyd = kcexrzcfytVar;
        kcexrzcfytVar.okpsazkaxt();
    }

    public static kcexrzcfyt dsvhmnatus() {
        return f28620lmojexxdyd;
    }

    public static zoijcleaow jztzpxfvev() {
        return zoijcleaow.rgvfuqvkyq();
    }

    private void okpsazkaxt() {
        this.f28623cqumvgiudr = 0;
        this.f28624esjtqupxsv = 0;
        this.f28629lereixgezr = false;
        this.f28630pmvmpeiblj = ppxfxbqfkf.INV;
        this.f28632zynmafqrjb = Collections.emptyList();
        this.f28626istkbnxepw = Collections.emptyList();
    }

    public static zoijcleaow xrmfcynszj(kcexrzcfyt kcexrzcfytVar) {
        return jztzpxfvev().wkgbmnqykc(kcexrzcfytVar);
    }

    public List crxdokpmqz() {
        return this.f28632zynmafqrjb;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28625iozdgvuglv;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28627iwizpuwonk & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28623cqumvgiudr) : 0;
        if ((this.f28627iwizpuwonk & 2) == 2) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28624esjtqupxsv);
        }
        if ((this.f28627iwizpuwonk & 4) == 4) {
            iOjitshcjhn += CodedOutputStream.iobyxmoadg(3, this.f28629lereixgezr);
        }
        if ((this.f28627iwizpuwonk & 8) == 8) {
            iOjitshcjhn += CodedOutputStream.nufgyqmvbu(4, this.f28630pmvmpeiblj.getNumber());
        }
        for (int i14 = 0; i14 < this.f28632zynmafqrjb.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(5, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28632zynmafqrjb.get(i14));
        }
        int iRgvfuqvkyq = 0;
        for (int i15 = 0; i15 < this.f28626istkbnxepw.size(); i15++) {
            iRgvfuqvkyq += CodedOutputStream.rgvfuqvkyq(((Integer) this.f28626istkbnxepw.get(i15)).intValue());
        }
        int iRgvfuqvkyq2 = iOjitshcjhn + iRgvfuqvkyq;
        if (!sopmlzcsov().isEmpty()) {
            iRgvfuqvkyq2 = iRgvfuqvkyq2 + 1 + CodedOutputStream.rgvfuqvkyq(iRgvfuqvkyq);
        }
        this.f28622cdpycssgdh = iRgvfuqvkyq;
        int iYggfygwlhe = iRgvfuqvkyq2 + yggfygwlhe() + this.f28628jyumaefscl.size();
        this.f28625iozdgvuglv = iYggfygwlhe;
        return iYggfygwlhe;
    }

    public boolean ikoacuggdj() {
        return (this.f28627iwizpuwonk & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28627iwizpuwonk & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28623cqumvgiudr);
        }
        if ((this.f28627iwizpuwonk & 2) == 2) {
            codedOutputStream.ribwqtqdhb(2, this.f28624esjtqupxsv);
        }
        if ((this.f28627iwizpuwonk & 4) == 4) {
            codedOutputStream.hcddaimhww(3, this.f28629lereixgezr);
        }
        if ((this.f28627iwizpuwonk & 8) == 8) {
            codedOutputStream.kegysxyocb(4, this.f28630pmvmpeiblj.getNumber());
        }
        for (int i13 = 0; i13 < this.f28632zynmafqrjb.size(); i13++) {
            codedOutputStream.ikoacuggdj(5, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28632zynmafqrjb.get(i13));
        }
        if (sopmlzcsov().size() > 0) {
            codedOutputStream.zfvoamnweg(50);
            codedOutputStream.zfvoamnweg(this.f28622cdpycssgdh);
        }
        for (int i14 = 0; i14 < this.f28626istkbnxepw.size(); i14++) {
            codedOutputStream.vipkmwdibw(((Integer) this.f28626istkbnxepw.get(i14)).intValue());
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(1000, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28628jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28631yadqdtsiqt;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (!ribwqtqdhb()) {
            this.f28631yadqdtsiqt = (byte) 0;
            return false;
        }
        if (!vipkmwdibw()) {
            this.f28631yadqdtsiqt = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < ulzqkzuiru(); i13++) {
            if (!ntlheqmsrt(i13).isInitialized()) {
                this.f28631yadqdtsiqt = (byte) 0;
                return false;
            }
        }
        if (zdlpuopuiu()) {
            this.f28631yadqdtsiqt = (byte) 1;
            return true;
        }
        this.f28631yadqdtsiqt = (byte) 0;
        return false;
    }

    public boolean jhduphickx() {
        return (this.f28627iwizpuwonk & 4) == 4;
    }

    public ppxfxbqfkf jlmebxxoox() {
        return this.f28630pmvmpeiblj;
    }

    public boolean mbcevpiqjq() {
        return this.f28629lereixgezr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return jztzpxfvev();
    }

    public vdvldrhtss ntlheqmsrt(int i13) {
        return (vdvldrhtss) this.f28632zynmafqrjb.get(i13);
    }

    public boolean ribwqtqdhb() {
        return (this.f28627iwizpuwonk & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return xrmfcynszj(this);
    }

    public List sopmlzcsov() {
        return this.f28626istkbnxepw;
    }

    public int stevsuqkhv() {
        return this.f28623cqumvgiudr;
    }

    public int tzroggbefp() {
        return this.f28624esjtqupxsv;
    }

    public int ulzqkzuiru() {
        return this.f28632zynmafqrjb.size();
    }

    public boolean vipkmwdibw() {
        return (this.f28627iwizpuwonk & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt getDefaultInstanceForType() {
        return f28620lmojexxdyd;
    }

    private kcexrzcfyt(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28622cdpycssgdh = -1;
        this.f28631yadqdtsiqt = (byte) -1;
        this.f28625iozdgvuglv = -1;
        this.f28628jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private kcexrzcfyt(boolean z13) {
        this.f28622cdpycssgdh = -1;
        this.f28631yadqdtsiqt = (byte) -1;
        this.f28625iozdgvuglv = -1;
        this.f28628jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private kcexrzcfyt(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28622cdpycssgdh = -1;
        this.f28631yadqdtsiqt = (byte) -1;
        this.f28625iozdgvuglv = -1;
        okpsazkaxt();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 8) {
                            this.f28627iwizpuwonk |= 1;
                            this.f28623cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 16) {
                            this.f28627iwizpuwonk |= 2;
                            this.f28624esjtqupxsv = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 24) {
                            this.f28627iwizpuwonk |= 4;
                            this.f28629lereixgezr = eablkybsjgVar.btonecajqb();
                        } else if (iPkzmftpjix == 32) {
                            int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                            ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg(iWflxmlrfwp);
                            if (ppxfxbqfkfVarIobyxmoadg == null) {
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp);
                            } else {
                                this.f28627iwizpuwonk |= 8;
                                this.f28630pmvmpeiblj = ppxfxbqfkfVarIobyxmoadg;
                            }
                        } else if (iPkzmftpjix == 42) {
                            if ((i13 & 16) != 16) {
                                this.f28632zynmafqrjb = new ArrayList();
                                i13 |= 16;
                            }
                            this.f28632zynmafqrjb.add(eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar));
                        } else if (iPkzmftpjix == 48) {
                            if ((i13 & 32) != 32) {
                                this.f28626istkbnxepw = new ArrayList();
                                i13 |= 32;
                            }
                            this.f28626istkbnxepw.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                        } else if (iPkzmftpjix != 50) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            int iDxjokdxxww = eablkybsjgVar.dxjokdxxww(eablkybsjgVar.lereixgezr());
                            if ((i13 & 32) != 32 && eablkybsjgVar.eablkybsjg() > 0) {
                                this.f28626istkbnxepw = new ArrayList();
                                i13 |= 32;
                            }
                            while (eablkybsjgVar.eablkybsjg() > 0) {
                                this.f28626istkbnxepw.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                            }
                            eablkybsjgVar.nufgyqmvbu(iDxjokdxxww);
                        }
                    }
                    z13 = true;
                } catch (InvalidProtocolBufferException e13) {
                    throw e13.ojitshcjhn(this);
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).ojitshcjhn(this);
                }
            } catch (Throwable th2) {
                if ((i13 & 16) == 16) {
                    this.f28632zynmafqrjb = Collections.unmodifiableList(this.f28632zynmafqrjb);
                }
                if ((i13 & 32) == 32) {
                    this.f28626istkbnxepw = Collections.unmodifiableList(this.f28626istkbnxepw);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28628jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if ((i13 & 16) == 16) {
            this.f28632zynmafqrjb = Collections.unmodifiableList(this.f28632zynmafqrjb);
        }
        if ((i13 & 32) == 32) {
            this.f28626istkbnxepw = Collections.unmodifiableList(this.f28626istkbnxepw);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28628jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
