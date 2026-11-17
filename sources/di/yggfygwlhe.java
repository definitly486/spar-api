package di;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final yggfygwlhe f28896iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28897lmojexxdyd = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private byte f28898cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28899cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f28900esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f28901istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28902iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28903jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private vdvldrhtss f28904lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f28905pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f28906yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private vdvldrhtss f28907zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public yggfygwlhe zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new yggfygwlhe(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28908cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f28909esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private int f28910istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28911iwizpuwonk;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private int f28913pmvmpeiblj;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private vdvldrhtss f28912lereixgezr = vdvldrhtss.ikoacuggdj();

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private vdvldrhtss f28914zynmafqrjb = vdvldrhtss.ikoacuggdj();

        private zoijcleaow() {
            vdvldrhtss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
        }

        public yggfygwlhe agtfadlqog() {
            yggfygwlhe yggfygwlheVar = new yggfygwlhe(this);
            int i13 = this.f28911iwizpuwonk;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            yggfygwlheVar.f28899cqumvgiudr = this.f28908cqumvgiudr;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            yggfygwlheVar.f28900esjtqupxsv = this.f28909esjtqupxsv;
            if ((i13 & 4) == 4) {
                i14 |= 4;
            }
            yggfygwlheVar.f28904lereixgezr = this.f28912lereixgezr;
            if ((i13 & 8) == 8) {
                i14 |= 8;
            }
            yggfygwlheVar.f28905pmvmpeiblj = this.f28913pmvmpeiblj;
            if ((i13 & 16) == 16) {
                i14 |= 16;
            }
            yggfygwlheVar.f28907zynmafqrjb = this.f28914zynmafqrjb;
            if ((i13 & 32) == 32) {
                i14 |= 32;
            }
            yggfygwlheVar.f28901istkbnxepw = this.f28910istkbnxepw;
            yggfygwlheVar.f28902iwizpuwonk = i14;
            return yggfygwlheVar;
        }

        public zoijcleaow cqumvgiudr(int i13) {
            this.f28911iwizpuwonk |= 8;
            this.f28913pmvmpeiblj = i13;
            return this;
        }

        public zoijcleaow esjtqupxsv(int i13) {
            this.f28911iwizpuwonk |= 32;
            this.f28910istkbnxepw = i13;
            return this;
        }

        public zoijcleaow iwizpuwonk(int i13) {
            this.f28911iwizpuwonk |= 2;
            this.f28909esjtqupxsv = i13;
            return this;
        }

        public zoijcleaow jyumaefscl(int i13) {
            this.f28911iwizpuwonk |= 1;
            this.f28908cqumvgiudr = i13;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            yggfygwlhe yggfygwlheVar = null;
            try {
                try {
                    yggfygwlhe yggfygwlheVar2 = (yggfygwlhe) yggfygwlhe.f28897lmojexxdyd.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (yggfygwlheVar2 != null) {
                        wkgbmnqykc(yggfygwlheVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    yggfygwlhe yggfygwlheVar3 = (yggfygwlhe) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        yggfygwlheVar = yggfygwlheVar3;
                        if (yggfygwlheVar != null) {
                            wkgbmnqykc(yggfygwlheVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (yggfygwlheVar != null) {
                    wkgbmnqykc(yggfygwlheVar);
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(yggfygwlhe yggfygwlheVar) {
            if (yggfygwlheVar == yggfygwlhe.hkdspvbjdz()) {
                return this;
            }
            if (yggfygwlheVar.ulzqkzuiru()) {
                jyumaefscl(yggfygwlheVar.dsvhmnatus());
            }
            if (yggfygwlheVar.sopmlzcsov()) {
                iwizpuwonk(yggfygwlheVar.wypolnanlu());
            }
            if (yggfygwlheVar.crxdokpmqz()) {
                zdlpuopuiu(yggfygwlheVar.stevsuqkhv());
            }
            if (yggfygwlheVar.jlmebxxoox()) {
                cqumvgiudr(yggfygwlheVar.tzroggbefp());
            }
            if (yggfygwlheVar.ribwqtqdhb()) {
                yggfygwlhe(yggfygwlheVar.mbcevpiqjq());
            }
            if (yggfygwlheVar.vipkmwdibw()) {
                esjtqupxsv(yggfygwlheVar.ntlheqmsrt());
            }
            gtknphoqwx(yggfygwlheVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(yggfygwlheVar.f28903jyumaefscl));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public yggfygwlhe build() {
            yggfygwlhe yggfygwlheVarAgtfadlqog = agtfadlqog();
            if (yggfygwlheVarAgtfadlqog.isInitialized()) {
                return yggfygwlheVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(yggfygwlheVarAgtfadlqog);
        }

        public zoijcleaow yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
            if ((this.f28911iwizpuwonk & 16) != 16 || this.f28914zynmafqrjb == vdvldrhtss.ikoacuggdj()) {
                this.f28914zynmafqrjb = vdvldrhtssVar;
            } else {
                this.f28914zynmafqrjb = vdvldrhtss.igdgnonuha(this.f28914zynmafqrjb).wkgbmnqykc(vdvldrhtssVar).agtfadlqog();
            }
            this.f28911iwizpuwonk |= 16;
            return this;
        }

        public zoijcleaow zdlpuopuiu(vdvldrhtss vdvldrhtssVar) {
            if ((this.f28911iwizpuwonk & 4) != 4 || this.f28912lereixgezr == vdvldrhtss.ikoacuggdj()) {
                this.f28912lereixgezr = vdvldrhtssVar;
            } else {
                this.f28912lereixgezr = vdvldrhtss.igdgnonuha(this.f28912lereixgezr).wkgbmnqykc(vdvldrhtssVar).agtfadlqog();
            }
            this.f28911iwizpuwonk |= 4;
            return this;
        }
    }

    static {
        yggfygwlhe yggfygwlheVar = new yggfygwlhe(true);
        f28896iozdgvuglv = yggfygwlheVar;
        yggfygwlheVar.jhduphickx();
    }

    public static yggfygwlhe hkdspvbjdz() {
        return f28896iozdgvuglv;
    }

    public static zoijcleaow ikoacuggdj() {
        return zoijcleaow.rgvfuqvkyq();
    }

    private void jhduphickx() {
        this.f28899cqumvgiudr = 0;
        this.f28900esjtqupxsv = 0;
        this.f28904lereixgezr = vdvldrhtss.ikoacuggdj();
        this.f28905pmvmpeiblj = 0;
        this.f28907zynmafqrjb = vdvldrhtss.ikoacuggdj();
        this.f28901istkbnxepw = 0;
    }

    public static zoijcleaow okpsazkaxt(yggfygwlhe yggfygwlheVar) {
        return ikoacuggdj().wkgbmnqykc(yggfygwlheVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public yggfygwlhe getDefaultInstanceForType() {
        return f28896iozdgvuglv;
    }

    public boolean crxdokpmqz() {
        return (this.f28902iwizpuwonk & 4) == 4;
    }

    public int dsvhmnatus() {
        return this.f28899cqumvgiudr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28906yadqdtsiqt;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28902iwizpuwonk & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28899cqumvgiudr) : 0;
        if ((this.f28902iwizpuwonk & 2) == 2) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28900esjtqupxsv);
        }
        if ((this.f28902iwizpuwonk & 4) == 4) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(3, this.f28904lereixgezr);
        }
        if ((this.f28902iwizpuwonk & 16) == 16) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(4, this.f28907zynmafqrjb);
        }
        if ((this.f28902iwizpuwonk & 8) == 8) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(5, this.f28905pmvmpeiblj);
        }
        if ((this.f28902iwizpuwonk & 32) == 32) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(6, this.f28901istkbnxepw);
        }
        int iYggfygwlhe = iOjitshcjhn + yggfygwlhe() + this.f28903jyumaefscl.size();
        this.f28906yadqdtsiqt = iYggfygwlhe;
        return iYggfygwlhe;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28902iwizpuwonk & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28899cqumvgiudr);
        }
        if ((this.f28902iwizpuwonk & 2) == 2) {
            codedOutputStream.ribwqtqdhb(2, this.f28900esjtqupxsv);
        }
        if ((this.f28902iwizpuwonk & 4) == 4) {
            codedOutputStream.ikoacuggdj(3, this.f28904lereixgezr);
        }
        if ((this.f28902iwizpuwonk & 16) == 16) {
            codedOutputStream.ikoacuggdj(4, this.f28907zynmafqrjb);
        }
        if ((this.f28902iwizpuwonk & 8) == 8) {
            codedOutputStream.ribwqtqdhb(5, this.f28905pmvmpeiblj);
        }
        if ((this.f28902iwizpuwonk & 32) == 32) {
            codedOutputStream.ribwqtqdhb(6, this.f28901istkbnxepw);
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(200, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28903jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28898cdpycssgdh;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (!sopmlzcsov()) {
            this.f28898cdpycssgdh = (byte) 0;
            return false;
        }
        if (crxdokpmqz() && !stevsuqkhv().isInitialized()) {
            this.f28898cdpycssgdh = (byte) 0;
            return false;
        }
        if (ribwqtqdhb() && !mbcevpiqjq().isInitialized()) {
            this.f28898cdpycssgdh = (byte) 0;
            return false;
        }
        if (zdlpuopuiu()) {
            this.f28898cdpycssgdh = (byte) 1;
            return true;
        }
        this.f28898cdpycssgdh = (byte) 0;
        return false;
    }

    public boolean jlmebxxoox() {
        return (this.f28902iwizpuwonk & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return ikoacuggdj();
    }

    public vdvldrhtss mbcevpiqjq() {
        return this.f28907zynmafqrjb;
    }

    public int ntlheqmsrt() {
        return this.f28901istkbnxepw;
    }

    public boolean ribwqtqdhb() {
        return (this.f28902iwizpuwonk & 16) == 16;
    }

    public boolean sopmlzcsov() {
        return (this.f28902iwizpuwonk & 2) == 2;
    }

    public vdvldrhtss stevsuqkhv() {
        return this.f28904lereixgezr;
    }

    public int tzroggbefp() {
        return this.f28905pmvmpeiblj;
    }

    public boolean ulzqkzuiru() {
        return (this.f28902iwizpuwonk & 1) == 1;
    }

    public boolean vipkmwdibw() {
        return (this.f28902iwizpuwonk & 32) == 32;
    }

    public int wypolnanlu() {
        return this.f28900esjtqupxsv;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return okpsazkaxt(this);
    }

    private yggfygwlhe(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28898cdpycssgdh = (byte) -1;
        this.f28906yadqdtsiqt = -1;
        this.f28903jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private yggfygwlhe(boolean z13) {
        this.f28898cdpycssgdh = (byte) -1;
        this.f28906yadqdtsiqt = -1;
        this.f28903jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private yggfygwlhe(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss.ppxfxbqfkf builder;
        this.f28898cdpycssgdh = (byte) -1;
        this.f28906yadqdtsiqt = -1;
        jhduphickx();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 8) {
                            this.f28902iwizpuwonk |= 1;
                            this.f28899cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix != 16) {
                            if (iPkzmftpjix == 26) {
                                builder = (this.f28902iwizpuwonk & 4) == 4 ? this.f28904lereixgezr.toBuilder() : null;
                                vdvldrhtss vdvldrhtssVar = (vdvldrhtss) eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar);
                                this.f28904lereixgezr = vdvldrhtssVar;
                                if (builder != null) {
                                    builder.wkgbmnqykc(vdvldrhtssVar);
                                    this.f28904lereixgezr = builder.agtfadlqog();
                                }
                                this.f28902iwizpuwonk |= 4;
                            } else if (iPkzmftpjix == 34) {
                                builder = (this.f28902iwizpuwonk & 16) == 16 ? this.f28907zynmafqrjb.toBuilder() : null;
                                vdvldrhtss vdvldrhtssVar2 = (vdvldrhtss) eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar);
                                this.f28907zynmafqrjb = vdvldrhtssVar2;
                                if (builder != null) {
                                    builder.wkgbmnqykc(vdvldrhtssVar2);
                                    this.f28907zynmafqrjb = builder.agtfadlqog();
                                }
                                this.f28902iwizpuwonk |= 16;
                            } else if (iPkzmftpjix == 40) {
                                this.f28902iwizpuwonk |= 8;
                                this.f28905pmvmpeiblj = eablkybsjgVar.oxmwwwfdhm();
                            } else if (iPkzmftpjix != 48) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                this.f28902iwizpuwonk |= 32;
                                this.f28901istkbnxepw = eablkybsjgVar.oxmwwwfdhm();
                            }
                        } else {
                            this.f28902iwizpuwonk |= 2;
                            this.f28900esjtqupxsv = eablkybsjgVar.oxmwwwfdhm();
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28903jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
            this.f28903jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
