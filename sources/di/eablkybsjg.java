package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final eablkybsjg f28539esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28540lereixgezr = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28541cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte f28542iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f28543jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28544yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public eablkybsjg zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private List f28545jyumaefscl = Collections.emptyList();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28546yggfygwlhe;

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
            if ((this.f28546yggfygwlhe & 1) != 1) {
                this.f28545jyumaefscl = new ArrayList(this.f28545jyumaefscl);
                this.f28546yggfygwlhe |= 1;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg build() {
            eablkybsjg eablkybsjgVarNufgyqmvbu = nufgyqmvbu();
            if (eablkybsjgVarNufgyqmvbu.isInitialized()) {
                return eablkybsjgVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(eablkybsjgVarNufgyqmvbu);
        }

        public eablkybsjg nufgyqmvbu() {
            eablkybsjg eablkybsjgVar = new eablkybsjg(this);
            if ((this.f28546yggfygwlhe & 1) == 1) {
                this.f28545jyumaefscl = Collections.unmodifiableList(this.f28545jyumaefscl);
                this.f28546yggfygwlhe &= -2;
            }
            eablkybsjgVar.f28543jyumaefscl = this.f28545jyumaefscl;
            return eablkybsjgVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar == eablkybsjg.jyumaefscl()) {
                return this;
            }
            if (!eablkybsjgVar.f28543jyumaefscl.isEmpty()) {
                if (this.f28545jyumaefscl.isEmpty()) {
                    this.f28545jyumaefscl = eablkybsjgVar.f28543jyumaefscl;
                    this.f28546yggfygwlhe &= -2;
                } else {
                    wflxmlrfwp();
                    this.f28545jyumaefscl.addAll(eablkybsjgVar.f28543jyumaefscl);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(eablkybsjgVar.f28544yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            eablkybsjg eablkybsjgVar2 = null;
            try {
                try {
                    eablkybsjg eablkybsjgVar3 = (eablkybsjg) eablkybsjg.f28540lereixgezr.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (eablkybsjgVar3 != null) {
                        wkgbmnqykc(eablkybsjgVar3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    eablkybsjg eablkybsjgVar4 = (eablkybsjg) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        eablkybsjgVar2 = eablkybsjgVar4;
                        if (eablkybsjgVar2 != null) {
                            wkgbmnqykc(eablkybsjgVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (eablkybsjgVar2 != null) {
                    wkgbmnqykc(eablkybsjgVar2);
                }
                throw th;
            }
        }
    }

    static {
        eablkybsjg eablkybsjgVar = new eablkybsjg(true);
        f28539esjtqupxsv = eablkybsjgVar;
        eablkybsjgVar.pmvmpeiblj();
    }

    public static zoijcleaow istkbnxepw(eablkybsjg eablkybsjgVar) {
        return zynmafqrjb().wkgbmnqykc(eablkybsjgVar);
    }

    public static eablkybsjg jyumaefscl() {
        return f28539esjtqupxsv;
    }

    private void pmvmpeiblj() {
        this.f28543jyumaefscl = Collections.emptyList();
    }

    public static zoijcleaow zynmafqrjb() {
        return zoijcleaow.draadjrbmk();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return zynmafqrjb();
    }

    public gxszxtbevo cqumvgiudr(int i13) {
        return (gxszxtbevo) this.f28543jyumaefscl.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28541cqumvgiudr;
        if (i13 != -1) {
            return i13;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < this.f28543jyumaefscl.size(); i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28543jyumaefscl.get(i14));
        }
        int size = iOxmwwwfdhm + this.f28544yggfygwlhe.size();
        this.f28541cqumvgiudr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i13 = 0; i13 < this.f28543jyumaefscl.size(); i13++) {
            codedOutputStream.ikoacuggdj(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28543jyumaefscl.get(i13));
        }
        codedOutputStream.rlfsiqarku(this.f28544yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28542iwizpuwonk;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < lereixgezr(); i13++) {
            if (!cqumvgiudr(i13).isInitialized()) {
                this.f28542iwizpuwonk = (byte) 0;
                return false;
            }
        }
        this.f28542iwizpuwonk = (byte) 1;
        return true;
    }

    public int lereixgezr() {
        return this.f28543jyumaefscl.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return istkbnxepw(this);
    }

    private eablkybsjg(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28542iwizpuwonk = (byte) -1;
        this.f28541cqumvgiudr = -1;
        this.f28544yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private eablkybsjg(boolean z13) {
        this.f28542iwizpuwonk = (byte) -1;
        this.f28541cqumvgiudr = -1;
        this.f28544yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private eablkybsjg(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28542iwizpuwonk = (byte) -1;
        this.f28541cqumvgiudr = -1;
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
                                if (!z14) {
                                    this.f28543jyumaefscl = new ArrayList();
                                    z14 = true;
                                }
                                this.f28543jyumaefscl.add(eablkybsjgVar.zdlpuopuiu(gxszxtbevo.f28554cdpycssgdh, gxszxtbevoVar));
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
                    this.f28543jyumaefscl = Collections.unmodifiableList(this.f28543jyumaefscl);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28544yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if (z14) {
            this.f28543jyumaefscl = Collections.unmodifiableList(this.f28543jyumaefscl);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28544yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
