package di;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28486iozdgvuglv = new iobyxmoadg();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final draadjrbmk f28487yadqdtsiqt;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f28488cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private List f28489cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f28490esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private byte f28491istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28492iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28493jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f28494lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private zdlpuopuiu f28495pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private iwizpuwonk f28496zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public draadjrbmk zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new draadjrbmk(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28499iwizpuwonk;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private List f28497cqumvgiudr = Collections.emptyList();

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private List f28498esjtqupxsv = Collections.emptyList();

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private List f28500lereixgezr = Collections.emptyList();

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private zdlpuopuiu f28501pmvmpeiblj = zdlpuopuiu.lereixgezr();

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private iwizpuwonk f28502zynmafqrjb = iwizpuwonk.jyumaefscl();

        private zoijcleaow() {
            zdlpuopuiu();
        }

        private void kcexrzcfyt() {
            if ((this.f28499iwizpuwonk & 4) != 4) {
                this.f28500lereixgezr = new ArrayList(this.f28500lereixgezr);
                this.f28499iwizpuwonk |= 4;
            }
        }

        private void oxmwwwfdhm() {
            if ((this.f28499iwizpuwonk & 2) != 2) {
                this.f28498esjtqupxsv = new ArrayList(this.f28498esjtqupxsv);
                this.f28499iwizpuwonk |= 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
            if ((this.f28499iwizpuwonk & 1) != 1) {
                this.f28497cqumvgiudr = new ArrayList(this.f28497cqumvgiudr);
                this.f28499iwizpuwonk |= 1;
            }
        }

        private void zdlpuopuiu() {
        }

        public draadjrbmk agtfadlqog() {
            draadjrbmk draadjrbmkVar = new draadjrbmk(this);
            int i13 = this.f28499iwizpuwonk;
            if ((i13 & 1) == 1) {
                this.f28497cqumvgiudr = Collections.unmodifiableList(this.f28497cqumvgiudr);
                this.f28499iwizpuwonk &= -2;
            }
            draadjrbmkVar.f28489cqumvgiudr = this.f28497cqumvgiudr;
            if ((this.f28499iwizpuwonk & 2) == 2) {
                this.f28498esjtqupxsv = Collections.unmodifiableList(this.f28498esjtqupxsv);
                this.f28499iwizpuwonk &= -3;
            }
            draadjrbmkVar.f28490esjtqupxsv = this.f28498esjtqupxsv;
            if ((this.f28499iwizpuwonk & 4) == 4) {
                this.f28500lereixgezr = Collections.unmodifiableList(this.f28500lereixgezr);
                this.f28499iwizpuwonk &= -5;
            }
            draadjrbmkVar.f28494lereixgezr = this.f28500lereixgezr;
            int i14 = (i13 & 8) != 8 ? 0 : 1;
            draadjrbmkVar.f28495pmvmpeiblj = this.f28501pmvmpeiblj;
            if ((i13 & 16) == 16) {
                i14 |= 2;
            }
            draadjrbmkVar.f28496zynmafqrjb = this.f28502zynmafqrjb;
            draadjrbmkVar.f28492iwizpuwonk = i14;
            return draadjrbmkVar;
        }

        public zoijcleaow cqumvgiudr(iwizpuwonk iwizpuwonkVar) {
            if ((this.f28499iwizpuwonk & 16) != 16 || this.f28502zynmafqrjb == iwizpuwonk.jyumaefscl()) {
                this.f28502zynmafqrjb = iwizpuwonkVar;
            } else {
                this.f28502zynmafqrjb = iwizpuwonk.istkbnxepw(this.f28502zynmafqrjb).wkgbmnqykc(iwizpuwonkVar).nufgyqmvbu();
            }
            this.f28499iwizpuwonk |= 16;
            return this;
        }

        public zoijcleaow iwizpuwonk(zdlpuopuiu zdlpuopuiuVar) {
            if ((this.f28499iwizpuwonk & 8) != 8 || this.f28501pmvmpeiblj == zdlpuopuiu.lereixgezr()) {
                this.f28501pmvmpeiblj = zdlpuopuiuVar;
            } else {
                this.f28501pmvmpeiblj = zdlpuopuiu.ylkuphrtab(this.f28501pmvmpeiblj).wkgbmnqykc(zdlpuopuiuVar).nufgyqmvbu();
            }
            this.f28499iwizpuwonk |= 8;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            draadjrbmk draadjrbmkVar = null;
            try {
                try {
                    draadjrbmk draadjrbmkVar2 = (draadjrbmk) draadjrbmk.f28486iozdgvuglv.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (draadjrbmkVar2 != null) {
                        wkgbmnqykc(draadjrbmkVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    draadjrbmk draadjrbmkVar3 = (draadjrbmk) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        draadjrbmkVar = draadjrbmkVar3;
                        if (draadjrbmkVar != null) {
                            wkgbmnqykc(draadjrbmkVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (draadjrbmkVar != null) {
                    wkgbmnqykc(draadjrbmkVar);
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public draadjrbmk build() {
            draadjrbmk draadjrbmkVarAgtfadlqog = agtfadlqog();
            if (draadjrbmkVarAgtfadlqog.isInitialized()) {
                return draadjrbmkVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(draadjrbmkVarAgtfadlqog);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(draadjrbmk draadjrbmkVar) {
            if (draadjrbmkVar == draadjrbmk.dsvhmnatus()) {
                return this;
            }
            if (!draadjrbmkVar.f28489cqumvgiudr.isEmpty()) {
                if (this.f28497cqumvgiudr.isEmpty()) {
                    this.f28497cqumvgiudr = draadjrbmkVar.f28489cqumvgiudr;
                    this.f28499iwizpuwonk &= -2;
                } else {
                    vdvldrhtss();
                    this.f28497cqumvgiudr.addAll(draadjrbmkVar.f28489cqumvgiudr);
                }
            }
            if (!draadjrbmkVar.f28490esjtqupxsv.isEmpty()) {
                if (this.f28498esjtqupxsv.isEmpty()) {
                    this.f28498esjtqupxsv = draadjrbmkVar.f28490esjtqupxsv;
                    this.f28499iwizpuwonk &= -3;
                } else {
                    oxmwwwfdhm();
                    this.f28498esjtqupxsv.addAll(draadjrbmkVar.f28490esjtqupxsv);
                }
            }
            if (!draadjrbmkVar.f28494lereixgezr.isEmpty()) {
                if (this.f28500lereixgezr.isEmpty()) {
                    this.f28500lereixgezr = draadjrbmkVar.f28494lereixgezr;
                    this.f28499iwizpuwonk &= -5;
                } else {
                    kcexrzcfyt();
                    this.f28500lereixgezr.addAll(draadjrbmkVar.f28494lereixgezr);
                }
            }
            if (draadjrbmkVar.ikoacuggdj()) {
                iwizpuwonk(draadjrbmkVar.vipkmwdibw());
            }
            if (draadjrbmkVar.okpsazkaxt()) {
                cqumvgiudr(draadjrbmkVar.jhduphickx());
            }
            gtknphoqwx(draadjrbmkVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(draadjrbmkVar.f28493jyumaefscl));
            return this;
        }
    }

    static {
        draadjrbmk draadjrbmkVar = new draadjrbmk(true);
        f28487yadqdtsiqt = draadjrbmkVar;
        draadjrbmkVar.jztzpxfvev();
    }

    public static draadjrbmk czzsidtyhn(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        return (draadjrbmk) f28486iozdgvuglv.iobyxmoadg(inputStream, gxszxtbevoVar);
    }

    public static draadjrbmk dsvhmnatus() {
        return f28487yadqdtsiqt;
    }

    private void jztzpxfvev() {
        this.f28489cqumvgiudr = Collections.emptyList();
        this.f28490esjtqupxsv = Collections.emptyList();
        this.f28494lereixgezr = Collections.emptyList();
        this.f28495pmvmpeiblj = zdlpuopuiu.lereixgezr();
        this.f28496zynmafqrjb = iwizpuwonk.jyumaefscl();
    }

    public static zoijcleaow metgxyhuhe(draadjrbmk draadjrbmkVar) {
        return xrmfcynszj().wkgbmnqykc(draadjrbmkVar);
    }

    public static zoijcleaow xrmfcynszj() {
        return zoijcleaow.rgvfuqvkyq();
    }

    public oxmwwwfdhm crxdokpmqz(int i13) {
        return (oxmwwwfdhm) this.f28494lereixgezr.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28488cdpycssgdh;
        if (i13 != -1) {
            return i13;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < this.f28489cqumvgiudr.size(); i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(3, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28489cqumvgiudr.get(i14));
        }
        for (int i15 = 0; i15 < this.f28490esjtqupxsv.size(); i15++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(4, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28490esjtqupxsv.get(i15));
        }
        for (int i16 = 0; i16 < this.f28494lereixgezr.size(); i16++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(5, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28494lereixgezr.get(i16));
        }
        if ((this.f28492iwizpuwonk & 1) == 1) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(30, this.f28495pmvmpeiblj);
        }
        if ((this.f28492iwizpuwonk & 2) == 2) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(32, this.f28496zynmafqrjb);
        }
        int iYggfygwlhe = iOxmwwwfdhm + yggfygwlhe() + this.f28493jyumaefscl.size();
        this.f28488cdpycssgdh = iYggfygwlhe;
        return iYggfygwlhe;
    }

    public boolean ikoacuggdj() {
        return (this.f28492iwizpuwonk & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        for (int i13 = 0; i13 < this.f28489cqumvgiudr.size(); i13++) {
            codedOutputStream.ikoacuggdj(3, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28489cqumvgiudr.get(i13));
        }
        for (int i14 = 0; i14 < this.f28490esjtqupxsv.size(); i14++) {
            codedOutputStream.ikoacuggdj(4, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28490esjtqupxsv.get(i14));
        }
        for (int i15 = 0; i15 < this.f28494lereixgezr.size(); i15++) {
            codedOutputStream.ikoacuggdj(5, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28494lereixgezr.get(i15));
        }
        if ((this.f28492iwizpuwonk & 1) == 1) {
            codedOutputStream.ikoacuggdj(30, this.f28495pmvmpeiblj);
        }
        if ((this.f28492iwizpuwonk & 2) == 2) {
            codedOutputStream.ikoacuggdj(32, this.f28496zynmafqrjb);
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(200, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28493jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28491istkbnxepw;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < tzroggbefp(); i13++) {
            if (!stevsuqkhv(i13).isInitialized()) {
                this.f28491istkbnxepw = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < ulzqkzuiru(); i14++) {
            if (!ntlheqmsrt(i14).isInitialized()) {
                this.f28491istkbnxepw = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < jlmebxxoox(); i15++) {
            if (!crxdokpmqz(i15).isInitialized()) {
                this.f28491istkbnxepw = (byte) 0;
                return false;
            }
        }
        if (ikoacuggdj() && !vipkmwdibw().isInitialized()) {
            this.f28491istkbnxepw = (byte) 0;
            return false;
        }
        if (zdlpuopuiu()) {
            this.f28491istkbnxepw = (byte) 1;
            return true;
        }
        this.f28491istkbnxepw = (byte) 0;
        return false;
    }

    public iwizpuwonk jhduphickx() {
        return this.f28496zynmafqrjb;
    }

    public int jlmebxxoox() {
        return this.f28494lereixgezr.size();
    }

    public List mbcevpiqjq() {
        return this.f28489cqumvgiudr;
    }

    public agtfadlqog ntlheqmsrt(int i13) {
        return (agtfadlqog) this.f28490esjtqupxsv.get(i13);
    }

    public boolean okpsazkaxt() {
        return (this.f28492iwizpuwonk & 2) == 2;
    }

    public List ribwqtqdhb() {
        return this.f28494lereixgezr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return xrmfcynszj();
    }

    public List sopmlzcsov() {
        return this.f28490esjtqupxsv;
    }

    public dxjokdxxww stevsuqkhv(int i13) {
        return (dxjokdxxww) this.f28489cqumvgiudr.get(i13);
    }

    public int tzroggbefp() {
        return this.f28489cqumvgiudr.size();
    }

    public int ulzqkzuiru() {
        return this.f28490esjtqupxsv.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return metgxyhuhe(this);
    }

    public zdlpuopuiu vipkmwdibw() {
        return this.f28495pmvmpeiblj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public draadjrbmk getDefaultInstanceForType() {
        return f28487yadqdtsiqt;
    }

    private draadjrbmk(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28491istkbnxepw = (byte) -1;
        this.f28488cdpycssgdh = -1;
        this.f28493jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private draadjrbmk(boolean z13) {
        this.f28491istkbnxepw = (byte) -1;
        this.f28488cdpycssgdh = -1;
        this.f28493jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private draadjrbmk(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28491istkbnxepw = (byte) -1;
        this.f28488cdpycssgdh = -1;
        jztzpxfvev();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 26) {
                            int i14 = (i13 == true ? 1 : 0) & 1;
                            i13 = i13;
                            if (i14 != 1) {
                                this.f28489cqumvgiudr = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 1;
                            }
                            this.f28489cqumvgiudr.add(eablkybsjgVar.zdlpuopuiu(dxjokdxxww.f28504wypolnanlu, gxszxtbevoVar));
                        } else if (iPkzmftpjix == 34) {
                            int i15 = (i13 == true ? 1 : 0) & 2;
                            i13 = i13;
                            if (i15 != 2) {
                                this.f28490esjtqupxsv = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 2;
                            }
                            this.f28490esjtqupxsv.add(eablkybsjgVar.zdlpuopuiu(agtfadlqog.f28435wypolnanlu, gxszxtbevoVar));
                        } else if (iPkzmftpjix != 42) {
                            if (iPkzmftpjix == 242) {
                                zdlpuopuiu.zoijcleaow zoijcleaowVarHcddaimhww = (this.f28492iwizpuwonk & 1) == 1 ? this.f28495pmvmpeiblj.toBuilder() : null;
                                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) eablkybsjgVar.zdlpuopuiu(zdlpuopuiu.f28916zynmafqrjb, gxszxtbevoVar);
                                this.f28495pmvmpeiblj = zdlpuopuiuVar;
                                if (zoijcleaowVarHcddaimhww != null) {
                                    zoijcleaowVarHcddaimhww.wkgbmnqykc(zdlpuopuiuVar);
                                    this.f28495pmvmpeiblj = zoijcleaowVarHcddaimhww.nufgyqmvbu();
                                }
                                this.f28492iwizpuwonk |= 1;
                            } else if (iPkzmftpjix != 258) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                iwizpuwonk.zoijcleaow zoijcleaowVarYadqdtsiqt = (this.f28492iwizpuwonk & 2) == 2 ? this.f28496zynmafqrjb.toBuilder() : null;
                                iwizpuwonk iwizpuwonkVar = (iwizpuwonk) eablkybsjgVar.zdlpuopuiu(iwizpuwonk.f28582lereixgezr, gxszxtbevoVar);
                                this.f28496zynmafqrjb = iwizpuwonkVar;
                                if (zoijcleaowVarYadqdtsiqt != null) {
                                    zoijcleaowVarYadqdtsiqt.wkgbmnqykc(iwizpuwonkVar);
                                    this.f28496zynmafqrjb = zoijcleaowVarYadqdtsiqt.nufgyqmvbu();
                                }
                                this.f28492iwizpuwonk |= 2;
                            }
                        } else {
                            int i16 = (i13 == true ? 1 : 0) & 4;
                            i13 = i13;
                            if (i16 != 4) {
                                this.f28494lereixgezr = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 4;
                            }
                            this.f28494lereixgezr.add(eablkybsjgVar.zdlpuopuiu(oxmwwwfdhm.f28709pkzmftpjix, gxszxtbevoVar));
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if (((i13 == true ? 1 : 0) & 1) == 1) {
                        this.f28489cqumvgiudr = Collections.unmodifiableList(this.f28489cqumvgiudr);
                    }
                    if (((i13 == true ? 1 : 0) & 2) == 2) {
                        this.f28490esjtqupxsv = Collections.unmodifiableList(this.f28490esjtqupxsv);
                    }
                    if (((i13 == true ? 1 : 0) & 4) == 4) {
                        this.f28494lereixgezr = Collections.unmodifiableList(this.f28494lereixgezr);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28493jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
        if (((i13 == true ? 1 : 0) & 1) == 1) {
            this.f28489cqumvgiudr = Collections.unmodifiableList(this.f28489cqumvgiudr);
        }
        if (((i13 == true ? 1 : 0) & 2) == 2) {
            this.f28490esjtqupxsv = Collections.unmodifiableList(this.f28490esjtqupxsv);
        }
        if (((i13 == true ? 1 : 0) & 4) == 4) {
            this.f28494lereixgezr = Collections.unmodifiableList(this.f28494lereixgezr);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28493jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
