package di;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final ojitshcjhn f28682esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28683lereixgezr = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28684cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte f28685iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f28686jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28687yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public ojitshcjhn zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new ojitshcjhn(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private List f28707jyumaefscl = Collections.emptyList();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28708yggfygwlhe;

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
            if ((this.f28708yggfygwlhe & 1) != 1) {
                this.f28707jyumaefscl = new ArrayList(this.f28707jyumaefscl);
                this.f28708yggfygwlhe |= 1;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public ojitshcjhn build() {
            ojitshcjhn ojitshcjhnVarNufgyqmvbu = nufgyqmvbu();
            if (ojitshcjhnVarNufgyqmvbu.isInitialized()) {
                return ojitshcjhnVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(ojitshcjhnVarNufgyqmvbu);
        }

        public ojitshcjhn nufgyqmvbu() {
            ojitshcjhn ojitshcjhnVar = new ojitshcjhn(this);
            if ((this.f28708yggfygwlhe & 1) == 1) {
                this.f28707jyumaefscl = Collections.unmodifiableList(this.f28707jyumaefscl);
                this.f28708yggfygwlhe &= -2;
            }
            ojitshcjhnVar.f28686jyumaefscl = this.f28707jyumaefscl;
            return ojitshcjhnVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(ojitshcjhn ojitshcjhnVar) {
            if (ojitshcjhnVar == ojitshcjhn.jyumaefscl()) {
                return this;
            }
            if (!ojitshcjhnVar.f28686jyumaefscl.isEmpty()) {
                if (this.f28707jyumaefscl.isEmpty()) {
                    this.f28707jyumaefscl = ojitshcjhnVar.f28686jyumaefscl;
                    this.f28708yggfygwlhe &= -2;
                } else {
                    wflxmlrfwp();
                    this.f28707jyumaefscl.addAll(ojitshcjhnVar.f28686jyumaefscl);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(ojitshcjhnVar.f28687yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            ojitshcjhn ojitshcjhnVar = null;
            try {
                try {
                    ojitshcjhn ojitshcjhnVar2 = (ojitshcjhn) ojitshcjhn.f28683lereixgezr.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (ojitshcjhnVar2 != null) {
                        wkgbmnqykc(ojitshcjhnVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    ojitshcjhn ojitshcjhnVar3 = (ojitshcjhn) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        ojitshcjhnVar = ojitshcjhnVar3;
                        if (ojitshcjhnVar != null) {
                            wkgbmnqykc(ojitshcjhnVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (ojitshcjhnVar != null) {
                    wkgbmnqykc(ojitshcjhnVar);
                }
                throw th;
            }
        }
    }

    static {
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn(true);
        f28682esjtqupxsv = ojitshcjhnVar;
        ojitshcjhnVar.pmvmpeiblj();
    }

    public static zoijcleaow istkbnxepw(ojitshcjhn ojitshcjhnVar) {
        return zynmafqrjb().wkgbmnqykc(ojitshcjhnVar);
    }

    public static ojitshcjhn jyumaefscl() {
        return f28682esjtqupxsv;
    }

    private void pmvmpeiblj() {
        this.f28686jyumaefscl = Collections.emptyList();
    }

    public static zoijcleaow zynmafqrjb() {
        return zoijcleaow.draadjrbmk();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return zynmafqrjb();
    }

    public ppxfxbqfkf cqumvgiudr(int i13) {
        return (ppxfxbqfkf) this.f28686jyumaefscl.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28684cqumvgiudr;
        if (i13 != -1) {
            return i13;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < this.f28686jyumaefscl.size(); i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28686jyumaefscl.get(i14));
        }
        int size = iOxmwwwfdhm + this.f28687yggfygwlhe.size();
        this.f28684cqumvgiudr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i13 = 0; i13 < this.f28686jyumaefscl.size(); i13++) {
            codedOutputStream.ikoacuggdj(1, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28686jyumaefscl.get(i13));
        }
        codedOutputStream.rlfsiqarku(this.f28687yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28685iwizpuwonk;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < lereixgezr(); i13++) {
            if (!cqumvgiudr(i13).isInitialized()) {
                this.f28685iwizpuwonk = (byte) 0;
                return false;
            }
        }
        this.f28685iwizpuwonk = (byte) 1;
        return true;
    }

    public int lereixgezr() {
        return this.f28686jyumaefscl.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return istkbnxepw(this);
    }

    public static final class ppxfxbqfkf extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28688istkbnxepw = new iobyxmoadg();

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private static final ppxfxbqfkf f28689zynmafqrjb;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28690cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private EnumC0569ppxfxbqfkf f28691esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28692iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f28693jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private byte f28694lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private int f28695pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28696yggfygwlhe;

        static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
            iobyxmoadg() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
            /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
            public ppxfxbqfkf zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(eablkybsjgVar, gxszxtbevoVar);
            }
        }

        /* JADX INFO: renamed from: di.ojitshcjhn$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public enum EnumC0569ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28697cqumvgiudr = new iobyxmoadg();

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final int f28702zdlpuopuiu;

            /* JADX INFO: renamed from: di.ojitshcjhn$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg */
            static class iobyxmoadg implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow {
                iobyxmoadg() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public EnumC0569ppxfxbqfkf findValueByNumber(int i13) {
                    return EnumC0569ppxfxbqfkf.iobyxmoadg(i13);
                }
            }

            EnumC0569ppxfxbqfkf(int i13, int i14) {
                this.f28702zdlpuopuiu = i14;
            }

            public static EnumC0569ppxfxbqfkf iobyxmoadg(int i13) {
                if (i13 == 0) {
                    return CLASS;
                }
                if (i13 == 1) {
                    return PACKAGE;
                }
                if (i13 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
            public final int getNumber() {
                return this.f28702zdlpuopuiu;
            }
        }

        public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private int f28704iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private int f28706yggfygwlhe;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private int f28705jyumaefscl = -1;

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            private EnumC0569ppxfxbqfkf f28703cqumvgiudr = EnumC0569ppxfxbqfkf.PACKAGE;

            private zoijcleaow() {
                wflxmlrfwp();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static zoijcleaow draadjrbmk() {
                return new zoijcleaow();
            }

            private void wflxmlrfwp() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
            /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
            public zoijcleaow wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
                if (ppxfxbqfkfVar == ppxfxbqfkf.lereixgezr()) {
                    return this;
                }
                if (ppxfxbqfkfVar.yadqdtsiqt()) {
                    vdvldrhtss(ppxfxbqfkfVar.zynmafqrjb());
                }
                if (ppxfxbqfkfVar.lmojexxdyd()) {
                    oxmwwwfdhm(ppxfxbqfkfVar.istkbnxepw());
                }
                if (ppxfxbqfkfVar.cdpycssgdh()) {
                    rgvfuqvkyq(ppxfxbqfkfVar.pmvmpeiblj());
                }
                eablkybsjg(ppxfxbqfkf().zoijcleaow(ppxfxbqfkfVar.f28696yggfygwlhe));
                return this;
            }

            /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
            public zoijcleaow clone() {
                return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public ppxfxbqfkf build() {
                ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = nufgyqmvbu();
                if (ppxfxbqfkfVarNufgyqmvbu.isInitialized()) {
                    return ppxfxbqfkfVarNufgyqmvbu;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(ppxfxbqfkfVarNufgyqmvbu);
            }

            public ppxfxbqfkf nufgyqmvbu() {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this);
                int i13 = this.f28706yggfygwlhe;
                int i14 = (i13 & 1) != 1 ? 0 : 1;
                ppxfxbqfkfVar.f28692iwizpuwonk = this.f28705jyumaefscl;
                if ((i13 & 2) == 2) {
                    i14 |= 2;
                }
                ppxfxbqfkfVar.f28690cqumvgiudr = this.f28704iwizpuwonk;
                if ((i13 & 4) == 4) {
                    i14 |= 4;
                }
                ppxfxbqfkfVar.f28691esjtqupxsv = this.f28703cqumvgiudr;
                ppxfxbqfkfVar.f28693jyumaefscl = i14;
                return ppxfxbqfkfVar;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
                ppxfxbqfkf ppxfxbqfkfVar = null;
                try {
                    try {
                        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkf.f28688istkbnxepw.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                        if (ppxfxbqfkfVar2 != null) {
                            wkgbmnqykc(ppxfxbqfkfVar2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) e13.iobyxmoadg();
                        try {
                            throw e13;
                        } catch (Throwable th2) {
                            th = th2;
                            ppxfxbqfkfVar = ppxfxbqfkfVar3;
                            if (ppxfxbqfkfVar != null) {
                                wkgbmnqykc(ppxfxbqfkfVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (ppxfxbqfkfVar != null) {
                        wkgbmnqykc(ppxfxbqfkfVar);
                    }
                    throw th;
                }
            }

            public zoijcleaow oxmwwwfdhm(int i13) {
                this.f28706yggfygwlhe |= 2;
                this.f28704iwizpuwonk = i13;
                return this;
            }

            public zoijcleaow rgvfuqvkyq(EnumC0569ppxfxbqfkf enumC0569ppxfxbqfkf) {
                enumC0569ppxfxbqfkf.getClass();
                this.f28706yggfygwlhe |= 4;
                this.f28703cqumvgiudr = enumC0569ppxfxbqfkf;
                return this;
            }

            public zoijcleaow vdvldrhtss(int i13) {
                this.f28706yggfygwlhe |= 1;
                this.f28705jyumaefscl = i13;
                return this;
            }
        }

        static {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(true);
            f28689zynmafqrjb = ppxfxbqfkfVar;
            ppxfxbqfkfVar.wwaezpbzkn();
        }

        public static ppxfxbqfkf lereixgezr() {
            return f28689zynmafqrjb;
        }

        public static zoijcleaow pkzmftpjix(ppxfxbqfkf ppxfxbqfkfVar) {
            return ylkuphrtab().wkgbmnqykc(ppxfxbqfkfVar);
        }

        private void wwaezpbzkn() {
            this.f28692iwizpuwonk = -1;
            this.f28690cqumvgiudr = 0;
            this.f28691esjtqupxsv = EnumC0569ppxfxbqfkf.PACKAGE;
        }

        public static zoijcleaow ylkuphrtab() {
            return zoijcleaow.draadjrbmk();
        }

        public boolean cdpycssgdh() {
            return (this.f28693jyumaefscl & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        public int getSerializedSize() {
            int i13 = this.f28695pmvmpeiblj;
            if (i13 != -1) {
                return i13;
            }
            int iOjitshcjhn = (this.f28693jyumaefscl & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28692iwizpuwonk) : 0;
            if ((this.f28693jyumaefscl & 2) == 2) {
                iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28690cqumvgiudr);
            }
            if ((this.f28693jyumaefscl & 4) == 4) {
                iOjitshcjhn += CodedOutputStream.nufgyqmvbu(3, this.f28691esjtqupxsv.getNumber());
            }
            int size = iOjitshcjhn + this.f28696yggfygwlhe.size();
            this.f28695pmvmpeiblj = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
        public zoijcleaow newBuilderForType() {
            return ylkuphrtab();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f28693jyumaefscl & 1) == 1) {
                codedOutputStream.ribwqtqdhb(1, this.f28692iwizpuwonk);
            }
            if ((this.f28693jyumaefscl & 2) == 2) {
                codedOutputStream.ribwqtqdhb(2, this.f28690cqumvgiudr);
            }
            if ((this.f28693jyumaefscl & 4) == 4) {
                codedOutputStream.kegysxyocb(3, this.f28691esjtqupxsv.getNumber());
            }
            codedOutputStream.rlfsiqarku(this.f28696yggfygwlhe);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
        public final boolean isInitialized() {
            byte b13 = this.f28694lereixgezr;
            if (b13 == 1) {
                return true;
            }
            if (b13 == 0) {
                return false;
            }
            if (lmojexxdyd()) {
                this.f28694lereixgezr = (byte) 1;
                return true;
            }
            this.f28694lereixgezr = (byte) 0;
            return false;
        }

        public int istkbnxepw() {
            return this.f28690cqumvgiudr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
        public zoijcleaow toBuilder() {
            return pkzmftpjix(this);
        }

        public boolean lmojexxdyd() {
            return (this.f28693jyumaefscl & 2) == 2;
        }

        public EnumC0569ppxfxbqfkf pmvmpeiblj() {
            return this.f28691esjtqupxsv;
        }

        public boolean yadqdtsiqt() {
            return (this.f28693jyumaefscl & 1) == 1;
        }

        public int zynmafqrjb() {
            return this.f28692iwizpuwonk;
        }

        private ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
            this.f28694lereixgezr = (byte) -1;
            this.f28695pmvmpeiblj = -1;
            this.f28696yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
        }

        private ppxfxbqfkf(boolean z13) {
            this.f28694lereixgezr = (byte) -1;
            this.f28695pmvmpeiblj = -1;
            this.f28696yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
        }

        private ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            this.f28694lereixgezr = (byte) -1;
            this.f28695pmvmpeiblj = -1;
            wwaezpbzkn();
            kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
            CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
            boolean z13 = false;
            while (!z13) {
                try {
                    try {
                        try {
                            int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                            if (iPkzmftpjix != 0) {
                                if (iPkzmftpjix == 8) {
                                    this.f28693jyumaefscl |= 1;
                                    this.f28692iwizpuwonk = eablkybsjgVar.oxmwwwfdhm();
                                } else if (iPkzmftpjix == 16) {
                                    this.f28693jyumaefscl |= 2;
                                    this.f28690cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                                } else if (iPkzmftpjix != 24) {
                                    if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                    }
                                } else {
                                    int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                                    EnumC0569ppxfxbqfkf enumC0569ppxfxbqfkfIobyxmoadg = EnumC0569ppxfxbqfkf.iobyxmoadg(iWflxmlrfwp);
                                    if (enumC0569ppxfxbqfkfIobyxmoadg == null) {
                                        codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                        codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp);
                                    } else {
                                        this.f28693jyumaefscl |= 4;
                                        this.f28691esjtqupxsv = enumC0569ppxfxbqfkfIobyxmoadg;
                                    }
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
                        this.f28696yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                    }
                    draadjrbmk();
                    throw th2;
                }
            }
            try {
                codedOutputStreamYlkuphrtab.wwaezpbzkn();
            } catch (IOException unused2) {
            } finally {
                this.f28696yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
            }
            draadjrbmk();
        }
    }

    private ojitshcjhn(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28685iwizpuwonk = (byte) -1;
        this.f28684cqumvgiudr = -1;
        this.f28687yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private ojitshcjhn(boolean z13) {
        this.f28685iwizpuwonk = (byte) -1;
        this.f28684cqumvgiudr = -1;
        this.f28687yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private ojitshcjhn(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28685iwizpuwonk = (byte) -1;
        this.f28684cqumvgiudr = -1;
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
                                    this.f28686jyumaefscl = new ArrayList();
                                    z14 = true;
                                }
                                this.f28686jyumaefscl.add(eablkybsjgVar.zdlpuopuiu(ppxfxbqfkf.f28688istkbnxepw, gxszxtbevoVar));
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
                    this.f28686jyumaefscl = Collections.unmodifiableList(this.f28686jyumaefscl);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused) {
                } finally {
                    this.f28687yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
                throw th2;
            }
        }
        if (z14) {
            this.f28686jyumaefscl = Collections.unmodifiableList(this.f28686jyumaefscl);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28687yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
