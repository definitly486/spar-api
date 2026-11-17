package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class zdlpuopuiu extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final zdlpuopuiu f28915pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28916zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28917cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private byte f28918esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private List f28919iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f28920jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f28921lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28922yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public zdlpuopuiu zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new zdlpuopuiu(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28925yggfygwlhe;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private List f28924jyumaefscl = Collections.emptyList();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28923iwizpuwonk = -1;

        private zoijcleaow() {
            agtfadlqog();
        }

        private void agtfadlqog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow draadjrbmk() {
            return new zoijcleaow();
        }

        private void wflxmlrfwp() {
            if ((this.f28925yggfygwlhe & 1) != 1) {
                this.f28924jyumaefscl = new ArrayList(this.f28924jyumaefscl);
                this.f28925yggfygwlhe |= 1;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public zdlpuopuiu build() {
            zdlpuopuiu zdlpuopuiuVarNufgyqmvbu = nufgyqmvbu();
            if (zdlpuopuiuVarNufgyqmvbu.isInitialized()) {
                return zdlpuopuiuVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(zdlpuopuiuVarNufgyqmvbu);
        }

        public zdlpuopuiu nufgyqmvbu() {
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
            int i13 = this.f28925yggfygwlhe;
            if ((i13 & 1) == 1) {
                this.f28924jyumaefscl = Collections.unmodifiableList(this.f28924jyumaefscl);
                this.f28925yggfygwlhe &= -2;
            }
            zdlpuopuiuVar.f28919iwizpuwonk = this.f28924jyumaefscl;
            int i14 = (i13 & 2) != 2 ? 0 : 1;
            zdlpuopuiuVar.f28917cqumvgiudr = this.f28923iwizpuwonk;
            zdlpuopuiuVar.f28920jyumaefscl = i14;
            return zdlpuopuiuVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) {
            if (zdlpuopuiuVar == zdlpuopuiu.lereixgezr()) {
                return this;
            }
            if (!zdlpuopuiuVar.f28919iwizpuwonk.isEmpty()) {
                if (this.f28924jyumaefscl.isEmpty()) {
                    this.f28924jyumaefscl = zdlpuopuiuVar.f28919iwizpuwonk;
                    this.f28925yggfygwlhe &= -2;
                } else {
                    wflxmlrfwp();
                    this.f28924jyumaefscl.addAll(zdlpuopuiuVar.f28919iwizpuwonk);
                }
            }
            if (zdlpuopuiuVar.yadqdtsiqt()) {
                vdvldrhtss(zdlpuopuiuVar.pmvmpeiblj());
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(zdlpuopuiuVar.f28922yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            zdlpuopuiu zdlpuopuiuVar = null;
            try {
                try {
                    zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) zdlpuopuiu.f28916zynmafqrjb.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (zdlpuopuiuVar2 != null) {
                        wkgbmnqykc(zdlpuopuiuVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    zdlpuopuiu zdlpuopuiuVar3 = (zdlpuopuiu) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        zdlpuopuiuVar = zdlpuopuiuVar3;
                        if (zdlpuopuiuVar != null) {
                            wkgbmnqykc(zdlpuopuiuVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (zdlpuopuiuVar != null) {
                    wkgbmnqykc(zdlpuopuiuVar);
                }
                throw th;
            }
        }

        public zoijcleaow vdvldrhtss(int i13) {
            this.f28925yggfygwlhe |= 2;
            this.f28923iwizpuwonk = i13;
            return this;
        }
    }

    static {
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(true);
        f28915pmvmpeiblj = zdlpuopuiuVar;
        zdlpuopuiuVar.lmojexxdyd();
    }

    public static zdlpuopuiu lereixgezr() {
        return f28915pmvmpeiblj;
    }

    private void lmojexxdyd() {
        this.f28919iwizpuwonk = Collections.emptyList();
        this.f28917cqumvgiudr = -1;
    }

    public static zoijcleaow wwaezpbzkn() {
        return zoijcleaow.draadjrbmk();
    }

    public static zoijcleaow ylkuphrtab(zdlpuopuiu zdlpuopuiuVar) {
        return wwaezpbzkn().wkgbmnqykc(zdlpuopuiuVar);
    }

    public List cdpycssgdh() {
        return this.f28919iwizpuwonk;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28921lereixgezr;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = 0;
        for (int i14 = 0; i14 < this.f28919iwizpuwonk.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28919iwizpuwonk.get(i14));
        }
        if ((this.f28920jyumaefscl & 1) == 1) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28917cqumvgiudr);
        }
        int size = iOjitshcjhn + this.f28922yggfygwlhe.size();
        this.f28921lereixgezr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return ylkuphrtab(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i13 = 0; i13 < this.f28919iwizpuwonk.size(); i13++) {
            codedOutputStream.ikoacuggdj(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28919iwizpuwonk.get(i13));
        }
        if ((this.f28920jyumaefscl & 1) == 1) {
            codedOutputStream.ribwqtqdhb(2, this.f28917cqumvgiudr);
        }
        codedOutputStream.rlfsiqarku(this.f28922yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28918esjtqupxsv;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < istkbnxepw(); i13++) {
            if (!zynmafqrjb(i13).isInitialized()) {
                this.f28918esjtqupxsv = (byte) 0;
                return false;
            }
        }
        this.f28918esjtqupxsv = (byte) 1;
        return true;
    }

    public int istkbnxepw() {
        return this.f28919iwizpuwonk.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return wwaezpbzkn();
    }

    public int pmvmpeiblj() {
        return this.f28917cqumvgiudr;
    }

    public boolean yadqdtsiqt() {
        return (this.f28920jyumaefscl & 1) == 1;
    }

    public vdvldrhtss zynmafqrjb(int i13) {
        return (vdvldrhtss) this.f28919iwizpuwonk.get(i13);
    }

    private zdlpuopuiu(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28918esjtqupxsv = (byte) -1;
        this.f28921lereixgezr = -1;
        this.f28922yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private zdlpuopuiu(boolean z13) {
        this.f28918esjtqupxsv = (byte) -1;
        this.f28921lereixgezr = -1;
        this.f28922yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private zdlpuopuiu(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28918esjtqupxsv = (byte) -1;
        this.f28921lereixgezr = -1;
        lmojexxdyd();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 10) {
                            if (!z14) {
                                this.f28919iwizpuwonk = new ArrayList();
                                z14 = true;
                            }
                            this.f28919iwizpuwonk.add(eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar));
                        } else if (iPkzmftpjix != 16) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            this.f28920jyumaefscl |= 1;
                            this.f28917cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if (z14) {
                        this.f28919iwizpuwonk = Collections.unmodifiableList(this.f28919iwizpuwonk);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28922yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
        if (z14) {
            this.f28919iwizpuwonk = Collections.unmodifiableList(this.f28919iwizpuwonk);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28922yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
