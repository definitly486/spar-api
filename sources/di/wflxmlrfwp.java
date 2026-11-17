package di;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final wflxmlrfwp f28868cdpycssgdh;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28869yadqdtsiqt = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private rgvfuqvkyq f28870cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ojitshcjhn f28871esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f28872istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28873iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28874jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private draadjrbmk f28875lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private List f28876pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private byte f28877zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public wflxmlrfwp zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new wflxmlrfwp(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28880iwizpuwonk;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private rgvfuqvkyq f28878cqumvgiudr = rgvfuqvkyq.jyumaefscl();

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private ojitshcjhn f28879esjtqupxsv = ojitshcjhn.jyumaefscl();

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private draadjrbmk f28881lereixgezr = draadjrbmk.dsvhmnatus();

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private List f28882pmvmpeiblj = Collections.emptyList();

        private zoijcleaow() {
            oxmwwwfdhm();
        }

        private void oxmwwwfdhm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
            if ((this.f28880iwizpuwonk & 8) != 8) {
                this.f28882pmvmpeiblj = new ArrayList(this.f28882pmvmpeiblj);
                this.f28880iwizpuwonk |= 8;
            }
        }

        public wflxmlrfwp agtfadlqog() {
            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(this);
            int i13 = this.f28880iwizpuwonk;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            wflxmlrfwpVar.f28870cqumvgiudr = this.f28878cqumvgiudr;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            wflxmlrfwpVar.f28871esjtqupxsv = this.f28879esjtqupxsv;
            if ((i13 & 4) == 4) {
                i14 |= 4;
            }
            wflxmlrfwpVar.f28875lereixgezr = this.f28881lereixgezr;
            if ((this.f28880iwizpuwonk & 8) == 8) {
                this.f28882pmvmpeiblj = Collections.unmodifiableList(this.f28882pmvmpeiblj);
                this.f28880iwizpuwonk &= -9;
            }
            wflxmlrfwpVar.f28876pmvmpeiblj = this.f28882pmvmpeiblj;
            wflxmlrfwpVar.f28873iwizpuwonk = i14;
            return wflxmlrfwpVar;
        }

        public zoijcleaow iwizpuwonk(rgvfuqvkyq rgvfuqvkyqVar) {
            if ((this.f28880iwizpuwonk & 1) != 1 || this.f28878cqumvgiudr == rgvfuqvkyq.jyumaefscl()) {
                this.f28878cqumvgiudr = rgvfuqvkyqVar;
            } else {
                this.f28878cqumvgiudr = rgvfuqvkyq.istkbnxepw(this.f28878cqumvgiudr).wkgbmnqykc(rgvfuqvkyqVar).nufgyqmvbu();
            }
            this.f28880iwizpuwonk |= 1;
            return this;
        }

        public zoijcleaow jyumaefscl(ojitshcjhn ojitshcjhnVar) {
            if ((this.f28880iwizpuwonk & 2) != 2 || this.f28879esjtqupxsv == ojitshcjhn.jyumaefscl()) {
                this.f28879esjtqupxsv = ojitshcjhnVar;
            } else {
                this.f28879esjtqupxsv = ojitshcjhn.istkbnxepw(this.f28879esjtqupxsv).wkgbmnqykc(ojitshcjhnVar).nufgyqmvbu();
            }
            this.f28880iwizpuwonk |= 2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(wflxmlrfwp wflxmlrfwpVar) {
            if (wflxmlrfwpVar == wflxmlrfwp.dsvhmnatus()) {
                return this;
            }
            if (wflxmlrfwpVar.sopmlzcsov()) {
                iwizpuwonk(wflxmlrfwpVar.mbcevpiqjq());
            }
            if (wflxmlrfwpVar.ulzqkzuiru()) {
                jyumaefscl(wflxmlrfwpVar.tzroggbefp());
            }
            if (wflxmlrfwpVar.ntlheqmsrt()) {
                yggfygwlhe(wflxmlrfwpVar.stevsuqkhv());
            }
            if (!wflxmlrfwpVar.f28876pmvmpeiblj.isEmpty()) {
                if (this.f28882pmvmpeiblj.isEmpty()) {
                    this.f28882pmvmpeiblj = wflxmlrfwpVar.f28876pmvmpeiblj;
                    this.f28880iwizpuwonk &= -9;
                } else {
                    vdvldrhtss();
                    this.f28882pmvmpeiblj.addAll(wflxmlrfwpVar.f28876pmvmpeiblj);
                }
            }
            gtknphoqwx(wflxmlrfwpVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(wflxmlrfwpVar.f28874jyumaefscl));
            return this;
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public wflxmlrfwp build() {
            wflxmlrfwp wflxmlrfwpVarAgtfadlqog = agtfadlqog();
            if (wflxmlrfwpVarAgtfadlqog.isInitialized()) {
                return wflxmlrfwpVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(wflxmlrfwpVarAgtfadlqog);
        }

        public zoijcleaow yggfygwlhe(draadjrbmk draadjrbmkVar) {
            if ((this.f28880iwizpuwonk & 4) != 4 || this.f28881lereixgezr == draadjrbmk.dsvhmnatus()) {
                this.f28881lereixgezr = draadjrbmkVar;
            } else {
                this.f28881lereixgezr = draadjrbmk.metgxyhuhe(this.f28881lereixgezr).wkgbmnqykc(draadjrbmkVar).agtfadlqog();
            }
            this.f28880iwizpuwonk |= 4;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            wflxmlrfwp wflxmlrfwpVar = null;
            try {
                try {
                    wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) wflxmlrfwp.f28869yadqdtsiqt.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (wflxmlrfwpVar2 != null) {
                        wkgbmnqykc(wflxmlrfwpVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    wflxmlrfwp wflxmlrfwpVar3 = (wflxmlrfwp) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        wflxmlrfwpVar = wflxmlrfwpVar3;
                        if (wflxmlrfwpVar != null) {
                            wkgbmnqykc(wflxmlrfwpVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (wflxmlrfwpVar != null) {
                    wkgbmnqykc(wflxmlrfwpVar);
                }
                throw th;
            }
        }
    }

    static {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(true);
        f28868cdpycssgdh = wflxmlrfwpVar;
        wflxmlrfwpVar.crxdokpmqz();
    }

    private void crxdokpmqz() {
        this.f28870cqumvgiudr = rgvfuqvkyq.jyumaefscl();
        this.f28871esjtqupxsv = ojitshcjhn.jyumaefscl();
        this.f28875lereixgezr = draadjrbmk.dsvhmnatus();
        this.f28876pmvmpeiblj = Collections.emptyList();
    }

    public static wflxmlrfwp dsvhmnatus() {
        return f28868cdpycssgdh;
    }

    public static wflxmlrfwp jhduphickx(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        return (wflxmlrfwp) f28869yadqdtsiqt.iobyxmoadg(inputStream, gxszxtbevoVar);
    }

    public static zoijcleaow jlmebxxoox() {
        return zoijcleaow.rgvfuqvkyq();
    }

    public static zoijcleaow ribwqtqdhb(wflxmlrfwp wflxmlrfwpVar) {
        return jlmebxxoox().wkgbmnqykc(wflxmlrfwpVar);
    }

    public List cllcsxoeiz() {
        return this.f28876pmvmpeiblj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28872istkbnxepw;
        if (i13 != -1) {
            return i13;
        }
        int iOxmwwwfdhm = (this.f28873iwizpuwonk & 1) == 1 ? CodedOutputStream.oxmwwwfdhm(1, this.f28870cqumvgiudr) : 0;
        if ((this.f28873iwizpuwonk & 2) == 2) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(2, this.f28871esjtqupxsv);
        }
        if ((this.f28873iwizpuwonk & 4) == 4) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(3, this.f28875lereixgezr);
        }
        for (int i14 = 0; i14 < this.f28876pmvmpeiblj.size(); i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(4, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28876pmvmpeiblj.get(i14));
        }
        int iYggfygwlhe = iOxmwwwfdhm + yggfygwlhe() + this.f28874jyumaefscl.size();
        this.f28872istkbnxepw = iYggfygwlhe;
        return iYggfygwlhe;
    }

    public int hkdspvbjdz() {
        return this.f28876pmvmpeiblj.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return ribwqtqdhb(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28873iwizpuwonk & 1) == 1) {
            codedOutputStream.ikoacuggdj(1, this.f28870cqumvgiudr);
        }
        if ((this.f28873iwizpuwonk & 2) == 2) {
            codedOutputStream.ikoacuggdj(2, this.f28871esjtqupxsv);
        }
        if ((this.f28873iwizpuwonk & 4) == 4) {
            codedOutputStream.ikoacuggdj(3, this.f28875lereixgezr);
        }
        for (int i13 = 0; i13 < this.f28876pmvmpeiblj.size(); i13++) {
            codedOutputStream.ikoacuggdj(4, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28876pmvmpeiblj.get(i13));
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(200, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28874jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28877zynmafqrjb;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (ulzqkzuiru() && !tzroggbefp().isInitialized()) {
            this.f28877zynmafqrjb = (byte) 0;
            return false;
        }
        if (ntlheqmsrt() && !stevsuqkhv().isInitialized()) {
            this.f28877zynmafqrjb = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < hkdspvbjdz(); i13++) {
            if (!jpowsppfya(i13).isInitialized()) {
                this.f28877zynmafqrjb = (byte) 0;
                return false;
            }
        }
        if (zdlpuopuiu()) {
            this.f28877zynmafqrjb = (byte) 1;
            return true;
        }
        this.f28877zynmafqrjb = (byte) 0;
        return false;
    }

    public ppxfxbqfkf jpowsppfya(int i13) {
        return (ppxfxbqfkf) this.f28876pmvmpeiblj.get(i13);
    }

    public rgvfuqvkyq mbcevpiqjq() {
        return this.f28870cqumvgiudr;
    }

    public boolean ntlheqmsrt() {
        return (this.f28873iwizpuwonk & 4) == 4;
    }

    public boolean sopmlzcsov() {
        return (this.f28873iwizpuwonk & 1) == 1;
    }

    public draadjrbmk stevsuqkhv() {
        return this.f28875lereixgezr;
    }

    public ojitshcjhn tzroggbefp() {
        return this.f28871esjtqupxsv;
    }

    public boolean ulzqkzuiru() {
        return (this.f28873iwizpuwonk & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return jlmebxxoox();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp getDefaultInstanceForType() {
        return f28868cdpycssgdh;
    }

    private wflxmlrfwp(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28877zynmafqrjb = (byte) -1;
        this.f28872istkbnxepw = -1;
        this.f28874jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private wflxmlrfwp(boolean z13) {
        this.f28877zynmafqrjb = (byte) -1;
        this.f28872istkbnxepw = -1;
        this.f28874jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private wflxmlrfwp(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28877zynmafqrjb = (byte) -1;
        this.f28872istkbnxepw = -1;
        crxdokpmqz();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 10) {
                            rgvfuqvkyq.zoijcleaow builder = (this.f28873iwizpuwonk & 1) == 1 ? this.f28870cqumvgiudr.toBuilder() : null;
                            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) eablkybsjgVar.zdlpuopuiu(rgvfuqvkyq.f28806lereixgezr, gxszxtbevoVar);
                            this.f28870cqumvgiudr = rgvfuqvkyqVar;
                            if (builder != null) {
                                builder.wkgbmnqykc(rgvfuqvkyqVar);
                                this.f28870cqumvgiudr = builder.nufgyqmvbu();
                            }
                            this.f28873iwizpuwonk |= 1;
                        } else if (iPkzmftpjix == 18) {
                            ojitshcjhn.zoijcleaow builder2 = (this.f28873iwizpuwonk & 2) == 2 ? this.f28871esjtqupxsv.toBuilder() : null;
                            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) eablkybsjgVar.zdlpuopuiu(ojitshcjhn.f28683lereixgezr, gxszxtbevoVar);
                            this.f28871esjtqupxsv = ojitshcjhnVar;
                            if (builder2 != null) {
                                builder2.wkgbmnqykc(ojitshcjhnVar);
                                this.f28871esjtqupxsv = builder2.nufgyqmvbu();
                            }
                            this.f28873iwizpuwonk |= 2;
                        } else if (iPkzmftpjix == 26) {
                            draadjrbmk.zoijcleaow builder3 = (this.f28873iwizpuwonk & 4) == 4 ? this.f28875lereixgezr.toBuilder() : null;
                            draadjrbmk draadjrbmkVar = (draadjrbmk) eablkybsjgVar.zdlpuopuiu(draadjrbmk.f28486iozdgvuglv, gxszxtbevoVar);
                            this.f28875lereixgezr = draadjrbmkVar;
                            if (builder3 != null) {
                                builder3.wkgbmnqykc(draadjrbmkVar);
                                this.f28875lereixgezr = builder3.agtfadlqog();
                            }
                            this.f28873iwizpuwonk |= 4;
                        } else if (iPkzmftpjix != 34) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            int i13 = (c13 == true ? 1 : 0) & '\b';
                            c13 = c13;
                            if (i13 != 8) {
                                this.f28876pmvmpeiblj = new ArrayList();
                                c13 = '\b';
                            }
                            this.f28876pmvmpeiblj.add(eablkybsjgVar.zdlpuopuiu(ppxfxbqfkf.f28734jztzpxfvev, gxszxtbevoVar));
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if (((c13 == true ? 1 : 0) & '\b') == 8) {
                        this.f28876pmvmpeiblj = Collections.unmodifiableList(this.f28876pmvmpeiblj);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28874jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
        if (((c13 == true ? 1 : 0) & '\b') == 8) {
            this.f28876pmvmpeiblj = Collections.unmodifiableList(this.f28876pmvmpeiblj);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28874jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
