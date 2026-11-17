package di;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final lqeggnwhkg f28646pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28647zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28648cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private byte f28649esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28650iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28651jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f28652lereixgezr;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28653cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28654iwizpuwonk;

        private zoijcleaow() {
            vdvldrhtss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
        }

        public lqeggnwhkg agtfadlqog() {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this);
            int i13 = (this.f28654iwizpuwonk & 1) != 1 ? 0 : 1;
            lqeggnwhkgVar.f28648cqumvgiudr = this.f28653cqumvgiudr;
            lqeggnwhkgVar.f28650iwizpuwonk = i13;
            return lqeggnwhkgVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            lqeggnwhkg lqeggnwhkgVar = null;
            try {
                try {
                    lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) lqeggnwhkg.f28647zynmafqrjb.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (lqeggnwhkgVar2 != null) {
                        wkgbmnqykc(lqeggnwhkgVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    lqeggnwhkg lqeggnwhkgVar3 = (lqeggnwhkg) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        lqeggnwhkgVar = lqeggnwhkgVar3;
                        if (lqeggnwhkgVar != null) {
                            wkgbmnqykc(lqeggnwhkgVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (lqeggnwhkgVar != null) {
                    wkgbmnqykc(lqeggnwhkgVar);
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
        public zoijcleaow wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
            if (lqeggnwhkgVar == lqeggnwhkg.wwaezpbzkn()) {
                return this;
            }
            if (lqeggnwhkgVar.hcddaimhww()) {
                zdlpuopuiu(lqeggnwhkgVar.pkzmftpjix());
            }
            gtknphoqwx(lqeggnwhkgVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(lqeggnwhkgVar.f28651jyumaefscl));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg build() {
            lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog();
            if (lqeggnwhkgVarAgtfadlqog.isInitialized()) {
                return lqeggnwhkgVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(lqeggnwhkgVarAgtfadlqog);
        }

        public zoijcleaow zdlpuopuiu(int i13) {
            this.f28654iwizpuwonk |= 1;
            this.f28653cqumvgiudr = i13;
            return this;
        }
    }

    static {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(true);
        f28646pmvmpeiblj = lqeggnwhkgVar;
        lqeggnwhkgVar.jpowsppfya();
    }

    public static zoijcleaow cllcsxoeiz(lqeggnwhkg lqeggnwhkgVar) {
        return hkdspvbjdz().wkgbmnqykc(lqeggnwhkgVar);
    }

    public static zoijcleaow hkdspvbjdz() {
        return zoijcleaow.rgvfuqvkyq();
    }

    private void jpowsppfya() {
        this.f28648cqumvgiudr = 0;
    }

    public static lqeggnwhkg wwaezpbzkn() {
        return f28646pmvmpeiblj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: dsvhmnatus, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return hkdspvbjdz();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28652lereixgezr;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = ((this.f28650iwizpuwonk & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28648cqumvgiudr) : 0) + yggfygwlhe() + this.f28651jyumaefscl.size();
        this.f28652lereixgezr = iOjitshcjhn;
        return iOjitshcjhn;
    }

    public boolean hcddaimhww() {
        return (this.f28650iwizpuwonk & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28650iwizpuwonk & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28648cqumvgiudr);
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(200, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28651jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28649esjtqupxsv;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (zdlpuopuiu()) {
            this.f28649esjtqupxsv = (byte) 1;
            return true;
        }
        this.f28649esjtqupxsv = (byte) 0;
        return false;
    }

    public int pkzmftpjix() {
        return this.f28648cqumvgiudr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return cllcsxoeiz(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: ylkuphrtab, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg getDefaultInstanceForType() {
        return f28646pmvmpeiblj;
    }

    private lqeggnwhkg(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28649esjtqupxsv = (byte) -1;
        this.f28652lereixgezr = -1;
        this.f28651jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private lqeggnwhkg(boolean z13) {
        this.f28649esjtqupxsv = (byte) -1;
        this.f28652lereixgezr = -1;
        this.f28651jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private lqeggnwhkg(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28649esjtqupxsv = (byte) -1;
        this.f28652lereixgezr = -1;
        jpowsppfya();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        while (!z13) {
            try {
                try {
                    try {
                        int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                        if (iPkzmftpjix != 0) {
                            if (iPkzmftpjix != 8) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                this.f28650iwizpuwonk |= 1;
                                this.f28648cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
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
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28651jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28651jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
