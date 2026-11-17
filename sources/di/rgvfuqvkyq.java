package di;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final rgvfuqvkyq f28805esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28806lereixgezr = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28807cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte f28808iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk f28809jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28810yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public rgvfuqvkyq zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new rgvfuqvkyq(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk f28811jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.gtknphoqwx.f60064yggfygwlhe;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28812yggfygwlhe;

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
            if ((this.f28812yggfygwlhe & 1) != 1) {
                this.f28811jyumaefscl = new kotlin.reflect.jvm.internal.impl.protobuf.gtknphoqwx(this.f28811jyumaefscl);
                this.f28812yggfygwlhe |= 1;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public rgvfuqvkyq build() {
            rgvfuqvkyq rgvfuqvkyqVarNufgyqmvbu = nufgyqmvbu();
            if (rgvfuqvkyqVarNufgyqmvbu.isInitialized()) {
                return rgvfuqvkyqVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(rgvfuqvkyqVarNufgyqmvbu);
        }

        public rgvfuqvkyq nufgyqmvbu() {
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(this);
            if ((this.f28812yggfygwlhe & 1) == 1) {
                this.f28811jyumaefscl = this.f28811jyumaefscl.getUnmodifiableView();
                this.f28812yggfygwlhe &= -2;
            }
            rgvfuqvkyqVar.f28809jyumaefscl = this.f28811jyumaefscl;
            return rgvfuqvkyqVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar) {
            if (rgvfuqvkyqVar == rgvfuqvkyq.jyumaefscl()) {
                return this;
            }
            if (!rgvfuqvkyqVar.f28809jyumaefscl.isEmpty()) {
                if (this.f28811jyumaefscl.isEmpty()) {
                    this.f28811jyumaefscl = rgvfuqvkyqVar.f28809jyumaefscl;
                    this.f28812yggfygwlhe &= -2;
                } else {
                    wflxmlrfwp();
                    this.f28811jyumaefscl.addAll(rgvfuqvkyqVar.f28809jyumaefscl);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(rgvfuqvkyqVar.f28810yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            rgvfuqvkyq rgvfuqvkyqVar = null;
            try {
                try {
                    rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) rgvfuqvkyq.f28806lereixgezr.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (rgvfuqvkyqVar2 != null) {
                        wkgbmnqykc(rgvfuqvkyqVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    rgvfuqvkyq rgvfuqvkyqVar3 = (rgvfuqvkyq) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        rgvfuqvkyqVar = rgvfuqvkyqVar3;
                        if (rgvfuqvkyqVar != null) {
                            wkgbmnqykc(rgvfuqvkyqVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (rgvfuqvkyqVar != null) {
                    wkgbmnqykc(rgvfuqvkyqVar);
                }
                throw th;
            }
        }
    }

    static {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(true);
        f28805esjtqupxsv = rgvfuqvkyqVar;
        rgvfuqvkyqVar.pmvmpeiblj();
    }

    public static zoijcleaow istkbnxepw(rgvfuqvkyq rgvfuqvkyqVar) {
        return zynmafqrjb().wkgbmnqykc(rgvfuqvkyqVar);
    }

    public static rgvfuqvkyq jyumaefscl() {
        return f28805esjtqupxsv;
    }

    private void pmvmpeiblj() {
        this.f28809jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.gtknphoqwx.f60064yggfygwlhe;
    }

    public static zoijcleaow zynmafqrjb() {
        return zoijcleaow.draadjrbmk();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return zynmafqrjb();
    }

    public String cqumvgiudr(int i13) {
        return (String) this.f28809jyumaefscl.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28807cqumvgiudr;
        if (i13 != -1) {
            return i13;
        }
        int iEablkybsjg = 0;
        for (int i14 = 0; i14 < this.f28809jyumaefscl.size(); i14++) {
            iEablkybsjg += CodedOutputStream.eablkybsjg(this.f28809jyumaefscl.getByteString(i14));
        }
        int size = iEablkybsjg + lereixgezr().size() + this.f28810yggfygwlhe.size();
        this.f28807cqumvgiudr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i13 = 0; i13 < this.f28809jyumaefscl.size(); i13++) {
            codedOutputStream.cllcsxoeiz(1, this.f28809jyumaefscl.getByteString(i13));
        }
        codedOutputStream.rlfsiqarku(this.f28810yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28808iwizpuwonk;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f28808iwizpuwonk = (byte) 1;
        return true;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.vdvldrhtss lereixgezr() {
        return this.f28809jyumaefscl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return istkbnxepw(this);
    }

    private rgvfuqvkyq(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28808iwizpuwonk = (byte) -1;
        this.f28807cqumvgiudr = -1;
        this.f28810yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private rgvfuqvkyq(boolean z13) {
        this.f28808iwizpuwonk = (byte) -1;
        this.f28807cqumvgiudr = -1;
        this.f28810yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private rgvfuqvkyq(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28808iwizpuwonk = (byte) -1;
        this.f28807cqumvgiudr = -1;
        pmvmpeiblj();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            try {
                try {
                    try {
                        int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                        if (iPkzmftpjix != 0) {
                            if (iPkzmftpjix != 10) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = eablkybsjgVar.gtknphoqwx();
                                if (!z14) {
                                    this.f28809jyumaefscl = new kotlin.reflect.jvm.internal.impl.protobuf.gtknphoqwx();
                                    z14 = true;
                                }
                                this.f28809jyumaefscl.mhtqkkgtqm(wkgbmnqykcVarGtknphoqwx);
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
                if (z14) {
                    this.f28809jyumaefscl = this.f28809jyumaefscl.getUnmodifiableView();
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28810yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if (z14) {
            this.f28809jyumaefscl = this.f28809jyumaefscl.getUnmodifiableView();
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28810yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
