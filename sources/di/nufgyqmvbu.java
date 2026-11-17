package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final nufgyqmvbu f28655iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28656lmojexxdyd = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private byte f28657cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28658cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ppxfxbqfkf f28659esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private List f28660istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28661iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f28662jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private vdvldrhtss f28663lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f28664pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f28665yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28666yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private List f28667zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public nufgyqmvbu zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public enum ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28668cqumvgiudr = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f28673zdlpuopuiu;

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
            this.f28673zdlpuopuiu = i14;
        }

        public static ppxfxbqfkf iobyxmoadg(int i13) {
            if (i13 == 0) {
                return TRUE;
            }
            if (i13 == 1) {
                return FALSE;
            }
            if (i13 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
        public final int getNumber() {
            return this.f28673zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28676iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f28677jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private int f28678lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28680yggfygwlhe;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private ppxfxbqfkf f28674cqumvgiudr = ppxfxbqfkf.TRUE;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private vdvldrhtss f28675esjtqupxsv = vdvldrhtss.ikoacuggdj();

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private List f28679pmvmpeiblj = Collections.emptyList();

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private List f28681zynmafqrjb = Collections.emptyList();

        private zoijcleaow() {
            ojitshcjhn();
        }

        private void agtfadlqog() {
            if ((this.f28680yggfygwlhe & 64) != 64) {
                this.f28681zynmafqrjb = new ArrayList(this.f28681zynmafqrjb);
                this.f28680yggfygwlhe |= 64;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow draadjrbmk() {
            return new zoijcleaow();
        }

        private void ojitshcjhn() {
        }

        private void wflxmlrfwp() {
            if ((this.f28680yggfygwlhe & 32) != 32) {
                this.f28679pmvmpeiblj = new ArrayList(this.f28679pmvmpeiblj);
                this.f28680yggfygwlhe |= 32;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        public zoijcleaow jyumaefscl(int i13) {
            this.f28680yggfygwlhe |= 2;
            this.f28676iwizpuwonk = i13;
            return this;
        }

        public zoijcleaow kcexrzcfyt(ppxfxbqfkf ppxfxbqfkfVar) {
            ppxfxbqfkfVar.getClass();
            this.f28680yggfygwlhe |= 4;
            this.f28674cqumvgiudr = ppxfxbqfkfVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nufgyqmvbu build() {
            nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu();
            if (nufgyqmvbuVarNufgyqmvbu.isInitialized()) {
                return nufgyqmvbuVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(nufgyqmvbuVarNufgyqmvbu);
        }

        public nufgyqmvbu nufgyqmvbu() {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(this);
            int i13 = this.f28680yggfygwlhe;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            nufgyqmvbuVar.f28661iwizpuwonk = this.f28677jyumaefscl;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            nufgyqmvbuVar.f28658cqumvgiudr = this.f28676iwizpuwonk;
            if ((i13 & 4) == 4) {
                i14 |= 4;
            }
            nufgyqmvbuVar.f28659esjtqupxsv = this.f28674cqumvgiudr;
            if ((i13 & 8) == 8) {
                i14 |= 8;
            }
            nufgyqmvbuVar.f28663lereixgezr = this.f28675esjtqupxsv;
            if ((i13 & 16) == 16) {
                i14 |= 16;
            }
            nufgyqmvbuVar.f28664pmvmpeiblj = this.f28678lereixgezr;
            if ((this.f28680yggfygwlhe & 32) == 32) {
                this.f28679pmvmpeiblj = Collections.unmodifiableList(this.f28679pmvmpeiblj);
                this.f28680yggfygwlhe &= -33;
            }
            nufgyqmvbuVar.f28667zynmafqrjb = this.f28679pmvmpeiblj;
            if ((this.f28680yggfygwlhe & 64) == 64) {
                this.f28681zynmafqrjb = Collections.unmodifiableList(this.f28681zynmafqrjb);
                this.f28680yggfygwlhe &= -65;
            }
            nufgyqmvbuVar.f28660istkbnxepw = this.f28681zynmafqrjb;
            nufgyqmvbuVar.f28662jyumaefscl = i14;
            return nufgyqmvbuVar;
        }

        public zoijcleaow oxmwwwfdhm(vdvldrhtss vdvldrhtssVar) {
            if ((this.f28680yggfygwlhe & 8) != 8 || this.f28675esjtqupxsv == vdvldrhtss.ikoacuggdj()) {
                this.f28675esjtqupxsv = vdvldrhtssVar;
            } else {
                this.f28675esjtqupxsv = vdvldrhtss.igdgnonuha(this.f28675esjtqupxsv).wkgbmnqykc(vdvldrhtssVar).agtfadlqog();
            }
            this.f28680yggfygwlhe |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar) {
            if (nufgyqmvbuVar == nufgyqmvbu.pkzmftpjix()) {
                return this;
            }
            if (nufgyqmvbuVar.tzroggbefp()) {
                zdlpuopuiu(nufgyqmvbuVar.hcddaimhww());
            }
            if (nufgyqmvbuVar.ulzqkzuiru()) {
                jyumaefscl(nufgyqmvbuVar.wypolnanlu());
            }
            if (nufgyqmvbuVar.stevsuqkhv()) {
                kcexrzcfyt(nufgyqmvbuVar.ylkuphrtab());
            }
            if (nufgyqmvbuVar.mbcevpiqjq()) {
                oxmwwwfdhm(nufgyqmvbuVar.jpowsppfya());
            }
            if (nufgyqmvbuVar.ntlheqmsrt()) {
                yggfygwlhe(nufgyqmvbuVar.hkdspvbjdz());
            }
            if (!nufgyqmvbuVar.f28667zynmafqrjb.isEmpty()) {
                if (this.f28679pmvmpeiblj.isEmpty()) {
                    this.f28679pmvmpeiblj = nufgyqmvbuVar.f28667zynmafqrjb;
                    this.f28680yggfygwlhe &= -33;
                } else {
                    wflxmlrfwp();
                    this.f28679pmvmpeiblj.addAll(nufgyqmvbuVar.f28667zynmafqrjb);
                }
            }
            if (!nufgyqmvbuVar.f28660istkbnxepw.isEmpty()) {
                if (this.f28681zynmafqrjb.isEmpty()) {
                    this.f28681zynmafqrjb = nufgyqmvbuVar.f28660istkbnxepw;
                    this.f28680yggfygwlhe &= -65;
                } else {
                    agtfadlqog();
                    this.f28681zynmafqrjb.addAll(nufgyqmvbuVar.f28660istkbnxepw);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(nufgyqmvbuVar.f28666yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            nufgyqmvbu nufgyqmvbuVar = null;
            try {
                try {
                    nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) nufgyqmvbu.f28656lmojexxdyd.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (nufgyqmvbuVar2 != null) {
                        wkgbmnqykc(nufgyqmvbuVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    nufgyqmvbu nufgyqmvbuVar3 = (nufgyqmvbu) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        nufgyqmvbuVar = nufgyqmvbuVar3;
                        if (nufgyqmvbuVar != null) {
                            wkgbmnqykc(nufgyqmvbuVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (nufgyqmvbuVar != null) {
                    wkgbmnqykc(nufgyqmvbuVar);
                }
                throw th;
            }
        }

        public zoijcleaow yggfygwlhe(int i13) {
            this.f28680yggfygwlhe |= 16;
            this.f28678lereixgezr = i13;
            return this;
        }

        public zoijcleaow zdlpuopuiu(int i13) {
            this.f28680yggfygwlhe |= 1;
            this.f28677jyumaefscl = i13;
            return this;
        }
    }

    static {
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(true);
        f28655iozdgvuglv = nufgyqmvbuVar;
        nufgyqmvbuVar.sopmlzcsov();
    }

    public static zoijcleaow crxdokpmqz() {
        return zoijcleaow.draadjrbmk();
    }

    public static zoijcleaow jlmebxxoox(nufgyqmvbu nufgyqmvbuVar) {
        return crxdokpmqz().wkgbmnqykc(nufgyqmvbuVar);
    }

    public static nufgyqmvbu pkzmftpjix() {
        return f28655iozdgvuglv;
    }

    private void sopmlzcsov() {
        this.f28661iwizpuwonk = 0;
        this.f28658cqumvgiudr = 0;
        this.f28659esjtqupxsv = ppxfxbqfkf.TRUE;
        this.f28663lereixgezr = vdvldrhtss.ikoacuggdj();
        this.f28664pmvmpeiblj = 0;
        this.f28667zynmafqrjb = Collections.emptyList();
        this.f28660istkbnxepw = Collections.emptyList();
    }

    public nufgyqmvbu cllcsxoeiz(int i13) {
        return (nufgyqmvbu) this.f28660istkbnxepw.get(i13);
    }

    public int dsvhmnatus() {
        return this.f28660istkbnxepw.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28665yadqdtsiqt;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28662jyumaefscl & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28661iwizpuwonk) : 0;
        if ((this.f28662jyumaefscl & 2) == 2) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28658cqumvgiudr);
        }
        if ((this.f28662jyumaefscl & 4) == 4) {
            iOjitshcjhn += CodedOutputStream.nufgyqmvbu(3, this.f28659esjtqupxsv.getNumber());
        }
        if ((this.f28662jyumaefscl & 8) == 8) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(4, this.f28663lereixgezr);
        }
        if ((this.f28662jyumaefscl & 16) == 16) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(5, this.f28664pmvmpeiblj);
        }
        for (int i14 = 0; i14 < this.f28667zynmafqrjb.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(6, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28667zynmafqrjb.get(i14));
        }
        for (int i15 = 0; i15 < this.f28660istkbnxepw.size(); i15++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(7, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28660istkbnxepw.get(i15));
        }
        int size = iOjitshcjhn + this.f28666yggfygwlhe.size();
        this.f28665yadqdtsiqt = size;
        return size;
    }

    public int hcddaimhww() {
        return this.f28661iwizpuwonk;
    }

    public int hkdspvbjdz() {
        return this.f28664pmvmpeiblj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f28662jyumaefscl & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28661iwizpuwonk);
        }
        if ((this.f28662jyumaefscl & 2) == 2) {
            codedOutputStream.ribwqtqdhb(2, this.f28658cqumvgiudr);
        }
        if ((this.f28662jyumaefscl & 4) == 4) {
            codedOutputStream.kegysxyocb(3, this.f28659esjtqupxsv.getNumber());
        }
        if ((this.f28662jyumaefscl & 8) == 8) {
            codedOutputStream.ikoacuggdj(4, this.f28663lereixgezr);
        }
        if ((this.f28662jyumaefscl & 16) == 16) {
            codedOutputStream.ribwqtqdhb(5, this.f28664pmvmpeiblj);
        }
        for (int i13 = 0; i13 < this.f28667zynmafqrjb.size(); i13++) {
            codedOutputStream.ikoacuggdj(6, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28667zynmafqrjb.get(i13));
        }
        for (int i14 = 0; i14 < this.f28660istkbnxepw.size(); i14++) {
            codedOutputStream.ikoacuggdj(7, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28660istkbnxepw.get(i14));
        }
        codedOutputStream.rlfsiqarku(this.f28666yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28657cdpycssgdh;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (mbcevpiqjq() && !jpowsppfya().isInitialized()) {
            this.f28657cdpycssgdh = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < wwaezpbzkn(); i13++) {
            if (!lmojexxdyd(i13).isInitialized()) {
                this.f28657cdpycssgdh = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < dsvhmnatus(); i14++) {
            if (!cllcsxoeiz(i14).isInitialized()) {
                this.f28657cdpycssgdh = (byte) 0;
                return false;
            }
        }
        this.f28657cdpycssgdh = (byte) 1;
        return true;
    }

    public vdvldrhtss jpowsppfya() {
        return this.f28663lereixgezr;
    }

    public nufgyqmvbu lmojexxdyd(int i13) {
        return (nufgyqmvbu) this.f28667zynmafqrjb.get(i13);
    }

    public boolean mbcevpiqjq() {
        return (this.f28662jyumaefscl & 8) == 8;
    }

    public boolean ntlheqmsrt() {
        return (this.f28662jyumaefscl & 16) == 16;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return crxdokpmqz();
    }

    public boolean stevsuqkhv() {
        return (this.f28662jyumaefscl & 4) == 4;
    }

    public boolean tzroggbefp() {
        return (this.f28662jyumaefscl & 1) == 1;
    }

    public boolean ulzqkzuiru() {
        return (this.f28662jyumaefscl & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return jlmebxxoox(this);
    }

    public int wwaezpbzkn() {
        return this.f28667zynmafqrjb.size();
    }

    public int wypolnanlu() {
        return this.f28658cqumvgiudr;
    }

    public ppxfxbqfkf ylkuphrtab() {
        return this.f28659esjtqupxsv;
    }

    private nufgyqmvbu(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28657cdpycssgdh = (byte) -1;
        this.f28665yadqdtsiqt = -1;
        this.f28666yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private nufgyqmvbu(boolean z13) {
        this.f28657cdpycssgdh = (byte) -1;
        this.f28665yadqdtsiqt = -1;
        this.f28666yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private nufgyqmvbu(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28657cdpycssgdh = (byte) -1;
        this.f28665yadqdtsiqt = -1;
        sopmlzcsov();
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
                            this.f28662jyumaefscl |= 1;
                            this.f28661iwizpuwonk = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 16) {
                            this.f28662jyumaefscl |= 2;
                            this.f28658cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 24) {
                            int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                            ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg(iWflxmlrfwp);
                            if (ppxfxbqfkfVarIobyxmoadg == null) {
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp);
                            } else {
                                this.f28662jyumaefscl |= 4;
                                this.f28659esjtqupxsv = ppxfxbqfkfVarIobyxmoadg;
                            }
                        } else if (iPkzmftpjix == 34) {
                            vdvldrhtss.ppxfxbqfkf builder = (this.f28662jyumaefscl & 8) == 8 ? this.f28663lereixgezr.toBuilder() : null;
                            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar);
                            this.f28663lereixgezr = vdvldrhtssVar;
                            if (builder != null) {
                                builder.wkgbmnqykc(vdvldrhtssVar);
                                this.f28663lereixgezr = builder.agtfadlqog();
                            }
                            this.f28662jyumaefscl |= 8;
                        } else if (iPkzmftpjix == 40) {
                            this.f28662jyumaefscl |= 16;
                            this.f28664pmvmpeiblj = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix == 50) {
                            if ((i13 & 32) != 32) {
                                this.f28667zynmafqrjb = new ArrayList();
                                i13 |= 32;
                            }
                            this.f28667zynmafqrjb.add(eablkybsjgVar.zdlpuopuiu(f28656lmojexxdyd, gxszxtbevoVar));
                        } else if (iPkzmftpjix != 58) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            if ((i13 & 64) != 64) {
                                this.f28660istkbnxepw = new ArrayList();
                                i13 |= 64;
                            }
                            this.f28660istkbnxepw.add(eablkybsjgVar.zdlpuopuiu(f28656lmojexxdyd, gxszxtbevoVar));
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if ((i13 & 32) == 32) {
                        this.f28667zynmafqrjb = Collections.unmodifiableList(this.f28667zynmafqrjb);
                    }
                    if ((i13 & 64) == 64) {
                        this.f28660istkbnxepw = Collections.unmodifiableList(this.f28660istkbnxepw);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28666yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
        if ((i13 & 32) == 32) {
            this.f28667zynmafqrjb = Collections.unmodifiableList(this.f28667zynmafqrjb);
        }
        if ((i13 & 64) == 64) {
            this.f28660istkbnxepw = Collections.unmodifiableList(this.f28660istkbnxepw);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28666yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
