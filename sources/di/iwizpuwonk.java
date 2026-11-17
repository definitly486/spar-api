package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final iwizpuwonk f28581esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28582lereixgezr = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28583cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte f28584iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f28585jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28586yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public iwizpuwonk zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new iwizpuwonk(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private List f28587jyumaefscl = Collections.emptyList();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28588yggfygwlhe;

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
            if ((this.f28588yggfygwlhe & 1) != 1) {
                this.f28587jyumaefscl = new ArrayList(this.f28587jyumaefscl);
                this.f28588yggfygwlhe |= 1;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public iwizpuwonk build() {
            iwizpuwonk iwizpuwonkVarNufgyqmvbu = nufgyqmvbu();
            if (iwizpuwonkVarNufgyqmvbu.isInitialized()) {
                return iwizpuwonkVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(iwizpuwonkVarNufgyqmvbu);
        }

        public iwizpuwonk nufgyqmvbu() {
            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(this);
            if ((this.f28588yggfygwlhe & 1) == 1) {
                this.f28587jyumaefscl = Collections.unmodifiableList(this.f28587jyumaefscl);
                this.f28588yggfygwlhe &= -2;
            }
            iwizpuwonkVar.f28585jyumaefscl = this.f28587jyumaefscl;
            return iwizpuwonkVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(iwizpuwonk iwizpuwonkVar) {
            if (iwizpuwonkVar == iwizpuwonk.jyumaefscl()) {
                return this;
            }
            if (!iwizpuwonkVar.f28585jyumaefscl.isEmpty()) {
                if (this.f28587jyumaefscl.isEmpty()) {
                    this.f28587jyumaefscl = iwizpuwonkVar.f28585jyumaefscl;
                    this.f28588yggfygwlhe &= -2;
                } else {
                    wflxmlrfwp();
                    this.f28587jyumaefscl.addAll(iwizpuwonkVar.f28585jyumaefscl);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(iwizpuwonkVar.f28586yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            iwizpuwonk iwizpuwonkVar = null;
            try {
                try {
                    iwizpuwonk iwizpuwonkVar2 = (iwizpuwonk) iwizpuwonk.f28582lereixgezr.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (iwizpuwonkVar2 != null) {
                        wkgbmnqykc(iwizpuwonkVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    iwizpuwonk iwizpuwonkVar3 = (iwizpuwonk) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        iwizpuwonkVar = iwizpuwonkVar3;
                        if (iwizpuwonkVar != null) {
                            wkgbmnqykc(iwizpuwonkVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (iwizpuwonkVar != null) {
                    wkgbmnqykc(iwizpuwonkVar);
                }
                throw th;
            }
        }
    }

    static {
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk(true);
        f28581esjtqupxsv = iwizpuwonkVar;
        iwizpuwonkVar.pmvmpeiblj();
    }

    public static zoijcleaow istkbnxepw(iwizpuwonk iwizpuwonkVar) {
        return zynmafqrjb().wkgbmnqykc(iwizpuwonkVar);
    }

    public static iwizpuwonk jyumaefscl() {
        return f28581esjtqupxsv;
    }

    private void pmvmpeiblj() {
        this.f28585jyumaefscl = Collections.emptyList();
    }

    public static zoijcleaow zynmafqrjb() {
        return zoijcleaow.draadjrbmk();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return zynmafqrjb();
    }

    public int cqumvgiudr() {
        return this.f28585jyumaefscl.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28583cqumvgiudr;
        if (i13 != -1) {
            return i13;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < this.f28585jyumaefscl.size(); i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28585jyumaefscl.get(i14));
        }
        int size = iOxmwwwfdhm + this.f28586yggfygwlhe.size();
        this.f28583cqumvgiudr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i13 = 0; i13 < this.f28585jyumaefscl.size(); i13++) {
            codedOutputStream.ikoacuggdj(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28585jyumaefscl.get(i13));
        }
        codedOutputStream.rlfsiqarku(this.f28586yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28584iwizpuwonk;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f28584iwizpuwonk = (byte) 1;
        return true;
    }

    public List lereixgezr() {
        return this.f28585jyumaefscl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return istkbnxepw(this);
    }

    private iwizpuwonk(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28584iwizpuwonk = (byte) -1;
        this.f28583cqumvgiudr = -1;
        this.f28586yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private iwizpuwonk(boolean z13) {
        this.f28584iwizpuwonk = (byte) -1;
        this.f28583cqumvgiudr = -1;
        this.f28586yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private iwizpuwonk(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28584iwizpuwonk = (byte) -1;
        this.f28583cqumvgiudr = -1;
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
                                    this.f28585jyumaefscl = new ArrayList();
                                    z14 = true;
                                }
                                this.f28585jyumaefscl.add(eablkybsjgVar.zdlpuopuiu(jyumaefscl.f28589iozdgvuglv, gxszxtbevoVar));
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
                    this.f28585jyumaefscl = Collections.unmodifiableList(this.f28585jyumaefscl);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28586yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if (z14) {
            this.f28585jyumaefscl = Collections.unmodifiableList(this.f28585jyumaefscl);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28586yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
