package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28883cdpycssgdh = new iobyxmoadg();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final wkgbmnqykc f28884istkbnxepw;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28885cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f28886esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28887iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28888jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f28889lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private byte f28890pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f28891zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public wkgbmnqykc zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28894iwizpuwonk;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28892cqumvgiudr = 6;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private List f28893esjtqupxsv = Collections.emptyList();

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private List f28895lereixgezr = Collections.emptyList();

        private zoijcleaow() {
            kcexrzcfyt();
        }

        private void kcexrzcfyt() {
        }

        private void oxmwwwfdhm() {
            if ((this.f28894iwizpuwonk & 4) != 4) {
                this.f28895lereixgezr = new ArrayList(this.f28895lereixgezr);
                this.f28894iwizpuwonk |= 4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
            if ((this.f28894iwizpuwonk & 2) != 2) {
                this.f28893esjtqupxsv = new ArrayList(this.f28893esjtqupxsv);
                this.f28894iwizpuwonk |= 2;
            }
        }

        public wkgbmnqykc agtfadlqog() {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this);
            int i13 = (this.f28894iwizpuwonk & 1) != 1 ? 0 : 1;
            wkgbmnqykcVar.f28885cqumvgiudr = this.f28892cqumvgiudr;
            if ((this.f28894iwizpuwonk & 2) == 2) {
                this.f28893esjtqupxsv = Collections.unmodifiableList(this.f28893esjtqupxsv);
                this.f28894iwizpuwonk &= -3;
            }
            wkgbmnqykcVar.f28886esjtqupxsv = this.f28893esjtqupxsv;
            if ((this.f28894iwizpuwonk & 4) == 4) {
                this.f28895lereixgezr = Collections.unmodifiableList(this.f28895lereixgezr);
                this.f28894iwizpuwonk &= -5;
            }
            wkgbmnqykcVar.f28889lereixgezr = this.f28895lereixgezr;
            wkgbmnqykcVar.f28887iwizpuwonk = i13;
            return wkgbmnqykcVar;
        }

        public zoijcleaow jyumaefscl(int i13) {
            this.f28894iwizpuwonk |= 1;
            this.f28892cqumvgiudr = i13;
            return this;
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public wkgbmnqykc build() {
            wkgbmnqykc wkgbmnqykcVarAgtfadlqog = agtfadlqog();
            if (wkgbmnqykcVarAgtfadlqog.isInitialized()) {
                return wkgbmnqykcVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(wkgbmnqykcVarAgtfadlqog);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            wkgbmnqykc wkgbmnqykcVar = null;
            try {
                try {
                    wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) wkgbmnqykc.f28883cdpycssgdh.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (wkgbmnqykcVar2 != null) {
                        wkgbmnqykc(wkgbmnqykcVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    wkgbmnqykc wkgbmnqykcVar3 = (wkgbmnqykc) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        wkgbmnqykcVar = wkgbmnqykcVar3;
                        if (wkgbmnqykcVar != null) {
                            wkgbmnqykc(wkgbmnqykcVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (wkgbmnqykcVar != null) {
                    wkgbmnqykc(wkgbmnqykcVar);
                }
                throw th;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
            if (wkgbmnqykcVar == wkgbmnqykc.jpowsppfya()) {
                return this;
            }
            if (wkgbmnqykcVar.mbcevpiqjq()) {
                jyumaefscl(wkgbmnqykcVar.cllcsxoeiz());
            }
            if (!wkgbmnqykcVar.f28886esjtqupxsv.isEmpty()) {
                if (this.f28893esjtqupxsv.isEmpty()) {
                    this.f28893esjtqupxsv = wkgbmnqykcVar.f28886esjtqupxsv;
                    this.f28894iwizpuwonk &= -3;
                } else {
                    vdvldrhtss();
                    this.f28893esjtqupxsv.addAll(wkgbmnqykcVar.f28886esjtqupxsv);
                }
            }
            if (!wkgbmnqykcVar.f28889lereixgezr.isEmpty()) {
                if (this.f28895lereixgezr.isEmpty()) {
                    this.f28895lereixgezr = wkgbmnqykcVar.f28889lereixgezr;
                    this.f28894iwizpuwonk &= -5;
                } else {
                    oxmwwwfdhm();
                    this.f28895lereixgezr.addAll(wkgbmnqykcVar.f28889lereixgezr);
                }
            }
            gtknphoqwx(wkgbmnqykcVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(wkgbmnqykcVar.f28888jyumaefscl));
            return this;
        }
    }

    static {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(true);
        f28884istkbnxepw = wkgbmnqykcVar;
        wkgbmnqykcVar.ntlheqmsrt();
    }

    public static wkgbmnqykc jpowsppfya() {
        return f28884istkbnxepw;
    }

    private void ntlheqmsrt() {
        this.f28885cqumvgiudr = 6;
        this.f28886esjtqupxsv = Collections.emptyList();
        this.f28889lereixgezr = Collections.emptyList();
    }

    public static zoijcleaow sopmlzcsov(wkgbmnqykc wkgbmnqykcVar) {
        return ulzqkzuiru().wkgbmnqykc(wkgbmnqykcVar);
    }

    public static zoijcleaow ulzqkzuiru() {
        return zoijcleaow.rgvfuqvkyq();
    }

    public int cllcsxoeiz() {
        return this.f28885cqumvgiudr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return ulzqkzuiru();
    }

    public yggfygwlhe dsvhmnatus(int i13) {
        return (yggfygwlhe) this.f28886esjtqupxsv.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28891zynmafqrjb;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28887iwizpuwonk & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28885cqumvgiudr) : 0;
        for (int i14 = 0; i14 < this.f28886esjtqupxsv.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(2, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28886esjtqupxsv.get(i14));
        }
        int iRgvfuqvkyq = 0;
        for (int i15 = 0; i15 < this.f28889lereixgezr.size(); i15++) {
            iRgvfuqvkyq += CodedOutputStream.rgvfuqvkyq(((Integer) this.f28889lereixgezr.get(i15)).intValue());
        }
        int size = iOjitshcjhn + iRgvfuqvkyq + (tzroggbefp().size() * 2) + yggfygwlhe() + this.f28888jyumaefscl.size();
        this.f28891zynmafqrjb = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc getDefaultInstanceForType() {
        return f28884istkbnxepw;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28887iwizpuwonk & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28885cqumvgiudr);
        }
        for (int i13 = 0; i13 < this.f28886esjtqupxsv.size(); i13++) {
            codedOutputStream.ikoacuggdj(2, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28886esjtqupxsv.get(i13));
        }
        for (int i14 = 0; i14 < this.f28889lereixgezr.size(); i14++) {
            codedOutputStream.ribwqtqdhb(31, ((Integer) this.f28889lereixgezr.get(i14)).intValue());
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(19000, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28888jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28890pmvmpeiblj;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < wypolnanlu(); i13++) {
            if (!dsvhmnatus(i13).isInitialized()) {
                this.f28890pmvmpeiblj = (byte) 0;
                return false;
            }
        }
        if (zdlpuopuiu()) {
            this.f28890pmvmpeiblj = (byte) 1;
            return true;
        }
        this.f28890pmvmpeiblj = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return sopmlzcsov(this);
    }

    public boolean mbcevpiqjq() {
        return (this.f28887iwizpuwonk & 1) == 1;
    }

    public List stevsuqkhv() {
        return this.f28886esjtqupxsv;
    }

    public List tzroggbefp() {
        return this.f28889lereixgezr;
    }

    public int wypolnanlu() {
        return this.f28886esjtqupxsv.size();
    }

    private wkgbmnqykc(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28890pmvmpeiblj = (byte) -1;
        this.f28891zynmafqrjb = -1;
        this.f28888jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private wkgbmnqykc(boolean z13) {
        this.f28890pmvmpeiblj = (byte) -1;
        this.f28891zynmafqrjb = -1;
        this.f28888jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private wkgbmnqykc(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28890pmvmpeiblj = (byte) -1;
        this.f28891zynmafqrjb = -1;
        ntlheqmsrt();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    try {
                        int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                        if (iPkzmftpjix != 0) {
                            if (iPkzmftpjix == 8) {
                                this.f28887iwizpuwonk |= 1;
                                this.f28885cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                            } else if (iPkzmftpjix == 18) {
                                if ((i13 & 2) != 2) {
                                    this.f28886esjtqupxsv = new ArrayList();
                                    i13 |= 2;
                                }
                                this.f28886esjtqupxsv.add(eablkybsjgVar.zdlpuopuiu(yggfygwlhe.f28897lmojexxdyd, gxszxtbevoVar));
                            } else if (iPkzmftpjix == 248) {
                                if ((i13 & 4) != 4) {
                                    this.f28889lereixgezr = new ArrayList();
                                    i13 |= 4;
                                }
                                this.f28889lereixgezr.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                            } else if (iPkzmftpjix != 250) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                int iDxjokdxxww = eablkybsjgVar.dxjokdxxww(eablkybsjgVar.lereixgezr());
                                if ((i13 & 4) != 4 && eablkybsjgVar.eablkybsjg() > 0) {
                                    this.f28889lereixgezr = new ArrayList();
                                    i13 |= 4;
                                }
                                while (eablkybsjgVar.eablkybsjg() > 0) {
                                    this.f28889lereixgezr.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                                }
                                eablkybsjgVar.nufgyqmvbu(iDxjokdxxww);
                            }
                        }
                        z13 = true;
                    } catch (InvalidProtocolBufferException e13) {
                        throw e13.ojitshcjhn(this);
                    }
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).ojitshcjhn(this);
                }
            } catch (Throwable th2) {
                if ((i13 & 2) == 2) {
                    this.f28886esjtqupxsv = Collections.unmodifiableList(this.f28886esjtqupxsv);
                }
                if ((i13 & 4) == 4) {
                    this.f28889lereixgezr = Collections.unmodifiableList(this.f28889lereixgezr);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28888jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if ((i13 & 2) == 2) {
            this.f28886esjtqupxsv = Collections.unmodifiableList(this.f28886esjtqupxsv);
        }
        if ((i13 & 4) == 4) {
            this.f28889lereixgezr = Collections.unmodifiableList(this.f28889lereixgezr);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28888jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
