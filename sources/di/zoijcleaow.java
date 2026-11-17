package di;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final zoijcleaow f28926pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28927zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private List f28928cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private byte f28929esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28930iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f28931jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f28932lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28933yggfygwlhe;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public zoijcleaow zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class ppxfxbqfkf extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private List f28934iwizpuwonk = Collections.emptyList();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f28935jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f28936yggfygwlhe;

        private ppxfxbqfkf() {
            agtfadlqog();
        }

        private void agtfadlqog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ppxfxbqfkf draadjrbmk() {
            return new ppxfxbqfkf();
        }

        private void wflxmlrfwp() {
            if ((this.f28936yggfygwlhe & 2) != 2) {
                this.f28934iwizpuwonk = new ArrayList(this.f28934iwizpuwonk);
                this.f28936yggfygwlhe |= 2;
            }
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf clone() {
            return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public zoijcleaow build() {
            zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu();
            if (zoijcleaowVarNufgyqmvbu.isInitialized()) {
                return zoijcleaowVarNufgyqmvbu;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(zoijcleaowVarNufgyqmvbu);
        }

        public zoijcleaow nufgyqmvbu() {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this);
            int i13 = (this.f28936yggfygwlhe & 1) != 1 ? 0 : 1;
            zoijcleaowVar.f28930iwizpuwonk = this.f28935jyumaefscl;
            if ((this.f28936yggfygwlhe & 2) == 2) {
                this.f28934iwizpuwonk = Collections.unmodifiableList(this.f28934iwizpuwonk);
                this.f28936yggfygwlhe &= -3;
            }
            zoijcleaowVar.f28928cqumvgiudr = this.f28934iwizpuwonk;
            zoijcleaowVar.f28931jyumaefscl = i13;
            return zoijcleaowVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf wkgbmnqykc(zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar == zoijcleaow.istkbnxepw()) {
                return this;
            }
            if (zoijcleaowVar.yadqdtsiqt()) {
                vdvldrhtss(zoijcleaowVar.cdpycssgdh());
            }
            if (!zoijcleaowVar.f28928cqumvgiudr.isEmpty()) {
                if (this.f28934iwizpuwonk.isEmpty()) {
                    this.f28934iwizpuwonk = zoijcleaowVar.f28928cqumvgiudr;
                    this.f28936yggfygwlhe &= -3;
                } else {
                    wflxmlrfwp();
                    this.f28934iwizpuwonk.addAll(zoijcleaowVar.f28928cqumvgiudr);
                }
            }
            eablkybsjg(ppxfxbqfkf().zoijcleaow(zoijcleaowVar.f28933yggfygwlhe));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            zoijcleaow zoijcleaowVar = null;
            try {
                try {
                    zoijcleaow zoijcleaowVar2 = (zoijcleaow) zoijcleaow.f28927zynmafqrjb.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (zoijcleaowVar2 != null) {
                        wkgbmnqykc(zoijcleaowVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    zoijcleaow zoijcleaowVar3 = (zoijcleaow) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        zoijcleaowVar = zoijcleaowVar3;
                        if (zoijcleaowVar != null) {
                            wkgbmnqykc(zoijcleaowVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (zoijcleaowVar != null) {
                    wkgbmnqykc(zoijcleaowVar);
                }
                throw th;
            }
        }

        public ppxfxbqfkf vdvldrhtss(int i13) {
            this.f28936yggfygwlhe |= 1;
            this.f28935jyumaefscl = i13;
            return this;
        }
    }

    /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0572zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final C0572zoijcleaow f28937pmvmpeiblj;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28938zynmafqrjb = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private ppxfxbqfkf f28939cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private byte f28940esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28941iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f28942jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private int f28943lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28944yggfygwlhe;

        /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$iobyxmoadg */
        static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
            iobyxmoadg() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
            /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
            public C0572zoijcleaow zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
                return new C0572zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
            }
        }

        /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C0575zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private ppxfxbqfkf f28990iwizpuwonk = ppxfxbqfkf.wypolnanlu();

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private int f28991jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private int f28992yggfygwlhe;

            private C0575zoijcleaow() {
                wflxmlrfwp();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0575zoijcleaow draadjrbmk() {
                return new C0575zoijcleaow();
            }

            private void wflxmlrfwp() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
            /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
            public C0575zoijcleaow wkgbmnqykc(C0572zoijcleaow c0572zoijcleaow) {
                if (c0572zoijcleaow == C0572zoijcleaow.cqumvgiudr()) {
                    return this;
                }
                if (c0572zoijcleaow.zynmafqrjb()) {
                    vdvldrhtss(c0572zoijcleaow.lereixgezr());
                }
                if (c0572zoijcleaow.istkbnxepw()) {
                    rgvfuqvkyq(c0572zoijcleaow.pmvmpeiblj());
                }
                eablkybsjg(ppxfxbqfkf().zoijcleaow(c0572zoijcleaow.f28944yggfygwlhe));
                return this;
            }

            /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
            public C0575zoijcleaow clone() {
                return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public C0572zoijcleaow build() {
                C0572zoijcleaow c0572zoijcleaowNufgyqmvbu = nufgyqmvbu();
                if (c0572zoijcleaowNufgyqmvbu.isInitialized()) {
                    return c0572zoijcleaowNufgyqmvbu;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(c0572zoijcleaowNufgyqmvbu);
            }

            public C0572zoijcleaow nufgyqmvbu() {
                C0572zoijcleaow c0572zoijcleaow = new C0572zoijcleaow(this);
                int i13 = this.f28992yggfygwlhe;
                int i14 = (i13 & 1) != 1 ? 0 : 1;
                c0572zoijcleaow.f28941iwizpuwonk = this.f28991jyumaefscl;
                if ((i13 & 2) == 2) {
                    i14 |= 2;
                }
                c0572zoijcleaow.f28939cqumvgiudr = this.f28990iwizpuwonk;
                c0572zoijcleaow.f28942jyumaefscl = i14;
                return c0572zoijcleaow;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public C0575zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
                C0572zoijcleaow c0572zoijcleaow = null;
                try {
                    try {
                        C0572zoijcleaow c0572zoijcleaow2 = (C0572zoijcleaow) C0572zoijcleaow.f28938zynmafqrjb.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                        if (c0572zoijcleaow2 != null) {
                            wkgbmnqykc(c0572zoijcleaow2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        C0572zoijcleaow c0572zoijcleaow3 = (C0572zoijcleaow) e13.iobyxmoadg();
                        try {
                            throw e13;
                        } catch (Throwable th2) {
                            th = th2;
                            c0572zoijcleaow = c0572zoijcleaow3;
                            if (c0572zoijcleaow != null) {
                                wkgbmnqykc(c0572zoijcleaow);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (c0572zoijcleaow != null) {
                        wkgbmnqykc(c0572zoijcleaow);
                    }
                    throw th;
                }
            }

            public C0575zoijcleaow rgvfuqvkyq(ppxfxbqfkf ppxfxbqfkfVar) {
                if ((this.f28992yggfygwlhe & 2) != 2 || this.f28990iwizpuwonk == ppxfxbqfkf.wypolnanlu()) {
                    this.f28990iwizpuwonk = ppxfxbqfkfVar;
                } else {
                    this.f28990iwizpuwonk = ppxfxbqfkf.yfnezrywwk(this.f28990iwizpuwonk).wkgbmnqykc(ppxfxbqfkfVar).nufgyqmvbu();
                }
                this.f28992yggfygwlhe |= 2;
                return this;
            }

            public C0575zoijcleaow vdvldrhtss(int i13) {
                this.f28992yggfygwlhe |= 1;
                this.f28991jyumaefscl = i13;
                return this;
            }
        }

        static {
            C0572zoijcleaow c0572zoijcleaow = new C0572zoijcleaow(true);
            f28937pmvmpeiblj = c0572zoijcleaow;
            c0572zoijcleaow.cdpycssgdh();
        }

        private void cdpycssgdh() {
            this.f28941iwizpuwonk = 0;
            this.f28939cqumvgiudr = ppxfxbqfkf.wypolnanlu();
        }

        public static C0572zoijcleaow cqumvgiudr() {
            return f28937pmvmpeiblj;
        }

        public static C0575zoijcleaow lmojexxdyd(C0572zoijcleaow c0572zoijcleaow) {
            return yadqdtsiqt().wkgbmnqykc(c0572zoijcleaow);
        }

        public static C0575zoijcleaow yadqdtsiqt() {
            return C0575zoijcleaow.draadjrbmk();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        public int getSerializedSize() {
            int i13 = this.f28943lereixgezr;
            if (i13 != -1) {
                return i13;
            }
            int iOjitshcjhn = (this.f28942jyumaefscl & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28941iwizpuwonk) : 0;
            if ((this.f28942jyumaefscl & 2) == 2) {
                iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(2, this.f28939cqumvgiudr);
            }
            int size = iOjitshcjhn + this.f28944yggfygwlhe.size();
            this.f28943lereixgezr = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f28942jyumaefscl & 1) == 1) {
                codedOutputStream.ribwqtqdhb(1, this.f28941iwizpuwonk);
            }
            if ((this.f28942jyumaefscl & 2) == 2) {
                codedOutputStream.ikoacuggdj(2, this.f28939cqumvgiudr);
            }
            codedOutputStream.rlfsiqarku(this.f28944yggfygwlhe);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
        public final boolean isInitialized() {
            byte b13 = this.f28940esjtqupxsv;
            if (b13 == 1) {
                return true;
            }
            if (b13 == 0) {
                return false;
            }
            if (!zynmafqrjb()) {
                this.f28940esjtqupxsv = (byte) 0;
                return false;
            }
            if (!istkbnxepw()) {
                this.f28940esjtqupxsv = (byte) 0;
                return false;
            }
            if (pmvmpeiblj().isInitialized()) {
                this.f28940esjtqupxsv = (byte) 1;
                return true;
            }
            this.f28940esjtqupxsv = (byte) 0;
            return false;
        }

        public boolean istkbnxepw() {
            return (this.f28942jyumaefscl & 2) == 2;
        }

        public int lereixgezr() {
            return this.f28941iwizpuwonk;
        }

        public ppxfxbqfkf pmvmpeiblj() {
            return this.f28939cqumvgiudr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        /* JADX INFO: renamed from: wwaezpbzkn, reason: merged with bridge method [inline-methods] */
        public C0575zoijcleaow newBuilderForType() {
            return yadqdtsiqt();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
        /* JADX INFO: renamed from: ylkuphrtab, reason: merged with bridge method [inline-methods] */
        public C0575zoijcleaow toBuilder() {
            return lmojexxdyd(this);
        }

        public boolean zynmafqrjb() {
            return (this.f28942jyumaefscl & 1) == 1;
        }

        /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$ppxfxbqfkf */
        public static final class ppxfxbqfkf extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

            /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28945hcddaimhww = new iobyxmoadg();

            /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
            private static final ppxfxbqfkf f28946pkzmftpjix;

            /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
            private zoijcleaow f28947cdpycssgdh;

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            private long f28948cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            private float f28949esjtqupxsv;

            /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
            private int f28950iozdgvuglv;

            /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
            private int f28951istkbnxepw;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private EnumC0573ppxfxbqfkf f28952iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private int f28953jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            private double f28954lereixgezr;

            /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
            private int f28955lmojexxdyd;

            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            private int f28956pmvmpeiblj;

            /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
            private byte f28957wwaezpbzkn;

            /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
            private List f28958yadqdtsiqt;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28959yggfygwlhe;

            /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
            private int f28960ylkuphrtab;

            /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
            private int f28961zynmafqrjb;

            /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$ppxfxbqfkf$iobyxmoadg */
            static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
                iobyxmoadg() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
                /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
                public ppxfxbqfkf zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
                    return new ppxfxbqfkf(eablkybsjgVar, gxszxtbevoVar);
                }
            }

            /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
            public enum EnumC0573ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
                private static kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow f28972wwaezpbzkn = new iobyxmoadg();

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                private final int f28977zdlpuopuiu;

                /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg */
                static class iobyxmoadg implements kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow {
                    iobyxmoadg() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.zoijcleaow
                    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                    public EnumC0573ppxfxbqfkf findValueByNumber(int i13) {
                        return EnumC0573ppxfxbqfkf.iobyxmoadg(i13);
                    }
                }

                EnumC0573ppxfxbqfkf(int i13, int i14) {
                    this.f28977zdlpuopuiu = i14;
                }

                public static EnumC0573ppxfxbqfkf iobyxmoadg(int i13) {
                    switch (i13) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.dxjokdxxww.iobyxmoadg
                public final int getNumber() {
                    return this.f28977zdlpuopuiu;
                }
            }

            /* JADX INFO: renamed from: di.zoijcleaow$zoijcleaow$ppxfxbqfkf$zoijcleaow, reason: collision with other inner class name */
            public static final class C0574zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                private float f28979cqumvgiudr;

                /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
                private double f28980esjtqupxsv;

                /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
                private int f28981iozdgvuglv;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                private long f28983iwizpuwonk;

                /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
                private int f28985lereixgezr;

                /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
                private int f28986pmvmpeiblj;

                /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
                private int f28987yadqdtsiqt;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                private int f28988yggfygwlhe;

                /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
                private int f28989zynmafqrjb;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                private EnumC0573ppxfxbqfkf f28984jyumaefscl = EnumC0573ppxfxbqfkf.BYTE;

                /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
                private zoijcleaow f28982istkbnxepw = zoijcleaow.istkbnxepw();

                /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
                private List f28978cdpycssgdh = Collections.emptyList();

                private C0574zoijcleaow() {
                    agtfadlqog();
                }

                private void agtfadlqog() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0574zoijcleaow draadjrbmk() {
                    return new C0574zoijcleaow();
                }

                private void wflxmlrfwp() {
                    if ((this.f28988yggfygwlhe & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                        this.f28978cdpycssgdh = new ArrayList(this.f28978cdpycssgdh);
                        this.f28988yggfygwlhe |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                }

                public C0574zoijcleaow cqumvgiudr(long j13) {
                    this.f28988yggfygwlhe |= 2;
                    this.f28983iwizpuwonk = j13;
                    return this;
                }

                public C0574zoijcleaow esjtqupxsv(int i13) {
                    this.f28988yggfygwlhe |= 16;
                    this.f28985lereixgezr = i13;
                    return this;
                }

                /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
                public C0574zoijcleaow clone() {
                    return draadjrbmk().wkgbmnqykc(nufgyqmvbu());
                }

                public C0574zoijcleaow iwizpuwonk(float f13) {
                    this.f28988yggfygwlhe |= 4;
                    this.f28979cqumvgiudr = f13;
                    return this;
                }

                public C0574zoijcleaow jyumaefscl(int i13) {
                    this.f28988yggfygwlhe |= UserVerificationMethods.USER_VERIFY_ALL;
                    this.f28981iozdgvuglv = i13;
                    return this;
                }

                public C0574zoijcleaow kcexrzcfyt(int i13) {
                    this.f28988yggfygwlhe |= 32;
                    this.f28986pmvmpeiblj = i13;
                    return this;
                }

                public C0574zoijcleaow lereixgezr(EnumC0573ppxfxbqfkf enumC0573ppxfxbqfkf) {
                    enumC0573ppxfxbqfkf.getClass();
                    this.f28988yggfygwlhe |= 1;
                    this.f28984jyumaefscl = enumC0573ppxfxbqfkf;
                    return this;
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
                    int i13 = this.f28988yggfygwlhe;
                    int i14 = (i13 & 1) != 1 ? 0 : 1;
                    ppxfxbqfkfVar.f28952iwizpuwonk = this.f28984jyumaefscl;
                    if ((i13 & 2) == 2) {
                        i14 |= 2;
                    }
                    ppxfxbqfkfVar.f28948cqumvgiudr = this.f28983iwizpuwonk;
                    if ((i13 & 4) == 4) {
                        i14 |= 4;
                    }
                    ppxfxbqfkfVar.f28949esjtqupxsv = this.f28979cqumvgiudr;
                    if ((i13 & 8) == 8) {
                        i14 |= 8;
                    }
                    ppxfxbqfkfVar.f28954lereixgezr = this.f28980esjtqupxsv;
                    if ((i13 & 16) == 16) {
                        i14 |= 16;
                    }
                    ppxfxbqfkfVar.f28956pmvmpeiblj = this.f28985lereixgezr;
                    if ((i13 & 32) == 32) {
                        i14 |= 32;
                    }
                    ppxfxbqfkfVar.f28961zynmafqrjb = this.f28986pmvmpeiblj;
                    if ((i13 & 64) == 64) {
                        i14 |= 64;
                    }
                    ppxfxbqfkfVar.f28951istkbnxepw = this.f28989zynmafqrjb;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        i14 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    ppxfxbqfkfVar.f28947cdpycssgdh = this.f28982istkbnxepw;
                    if ((this.f28988yggfygwlhe & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                        this.f28978cdpycssgdh = Collections.unmodifiableList(this.f28978cdpycssgdh);
                        this.f28988yggfygwlhe &= -257;
                    }
                    ppxfxbqfkfVar.f28958yadqdtsiqt = this.f28978cdpycssgdh;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        i14 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    ppxfxbqfkfVar.f28950iozdgvuglv = this.f28987yadqdtsiqt;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                        i14 |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    ppxfxbqfkfVar.f28955lmojexxdyd = this.f28981iozdgvuglv;
                    ppxfxbqfkfVar.f28953jyumaefscl = i14;
                    return ppxfxbqfkfVar;
                }

                public C0574zoijcleaow ojitshcjhn(zoijcleaow zoijcleaowVar) {
                    if ((this.f28988yggfygwlhe & UserVerificationMethods.USER_VERIFY_PATTERN) != 128 || this.f28982istkbnxepw == zoijcleaow.istkbnxepw()) {
                        this.f28982istkbnxepw = zoijcleaowVar;
                    } else {
                        this.f28982istkbnxepw = zoijcleaow.ylkuphrtab(this.f28982istkbnxepw).wkgbmnqykc(zoijcleaowVar).nufgyqmvbu();
                    }
                    this.f28988yggfygwlhe |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    return this;
                }

                public C0574zoijcleaow oxmwwwfdhm(int i13) {
                    this.f28988yggfygwlhe |= UserVerificationMethods.USER_VERIFY_NONE;
                    this.f28987yadqdtsiqt = i13;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
                /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
                public C0574zoijcleaow wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
                    if (ppxfxbqfkfVar == ppxfxbqfkf.wypolnanlu()) {
                        return this;
                    }
                    if (ppxfxbqfkfVar.rlfsiqarku()) {
                        lereixgezr(ppxfxbqfkfVar.crxdokpmqz());
                    }
                    if (ppxfxbqfkfVar.xrmfcynszj()) {
                        cqumvgiudr(ppxfxbqfkfVar.ulzqkzuiru());
                    }
                    if (ppxfxbqfkfVar.jztzpxfvev()) {
                        iwizpuwonk(ppxfxbqfkfVar.ntlheqmsrt());
                    }
                    if (ppxfxbqfkfVar.jhduphickx()) {
                        zdlpuopuiu(ppxfxbqfkfVar.stevsuqkhv());
                    }
                    if (ppxfxbqfkfVar.metgxyhuhe()) {
                        esjtqupxsv(ppxfxbqfkfVar.sopmlzcsov());
                    }
                    if (ppxfxbqfkfVar.vipkmwdibw()) {
                        kcexrzcfyt(ppxfxbqfkfVar.dsvhmnatus());
                    }
                    if (ppxfxbqfkfVar.ikoacuggdj()) {
                        yggfygwlhe(ppxfxbqfkfVar.tzroggbefp());
                    }
                    if (ppxfxbqfkfVar.jlmebxxoox()) {
                        ojitshcjhn(ppxfxbqfkfVar.pkzmftpjix());
                    }
                    if (!ppxfxbqfkfVar.f28958yadqdtsiqt.isEmpty()) {
                        if (this.f28978cdpycssgdh.isEmpty()) {
                            this.f28978cdpycssgdh = ppxfxbqfkfVar.f28958yadqdtsiqt;
                            this.f28988yggfygwlhe &= -257;
                        } else {
                            wflxmlrfwp();
                            this.f28978cdpycssgdh.addAll(ppxfxbqfkfVar.f28958yadqdtsiqt);
                        }
                    }
                    if (ppxfxbqfkfVar.ribwqtqdhb()) {
                        oxmwwwfdhm(ppxfxbqfkfVar.hcddaimhww());
                    }
                    if (ppxfxbqfkfVar.okpsazkaxt()) {
                        jyumaefscl(ppxfxbqfkfVar.mbcevpiqjq());
                    }
                    eablkybsjg(ppxfxbqfkf().zoijcleaow(ppxfxbqfkfVar.f28959yggfygwlhe));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
                /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
                public C0574zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
                    ppxfxbqfkf ppxfxbqfkfVar = null;
                    try {
                        try {
                            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkf.f28945hcddaimhww.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
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

                public C0574zoijcleaow yggfygwlhe(int i13) {
                    this.f28988yggfygwlhe |= 64;
                    this.f28989zynmafqrjb = i13;
                    return this;
                }

                public C0574zoijcleaow zdlpuopuiu(double d13) {
                    this.f28988yggfygwlhe |= 8;
                    this.f28980esjtqupxsv = d13;
                    return this;
                }
            }

            static {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(true);
                f28946pkzmftpjix = ppxfxbqfkfVar;
                ppxfxbqfkfVar.czzsidtyhn();
            }

            private void czzsidtyhn() {
                this.f28952iwizpuwonk = EnumC0573ppxfxbqfkf.BYTE;
                this.f28948cqumvgiudr = 0L;
                this.f28949esjtqupxsv = 0.0f;
                this.f28954lereixgezr = 0.0d;
                this.f28956pmvmpeiblj = 0;
                this.f28961zynmafqrjb = 0;
                this.f28951istkbnxepw = 0;
                this.f28947cdpycssgdh = zoijcleaow.istkbnxepw();
                this.f28958yadqdtsiqt = Collections.emptyList();
                this.f28950iozdgvuglv = 0;
                this.f28955lmojexxdyd = 0;
            }

            public static C0574zoijcleaow uwvvkdfqfp() {
                return C0574zoijcleaow.draadjrbmk();
            }

            public static ppxfxbqfkf wypolnanlu() {
                return f28946pkzmftpjix;
            }

            public static C0574zoijcleaow yfnezrywwk(ppxfxbqfkf ppxfxbqfkfVar) {
                return uwvvkdfqfp().wkgbmnqykc(ppxfxbqfkfVar);
            }

            public List cllcsxoeiz() {
                return this.f28958yadqdtsiqt;
            }

            public EnumC0573ppxfxbqfkf crxdokpmqz() {
                return this.f28952iwizpuwonk;
            }

            public int dsvhmnatus() {
                return this.f28961zynmafqrjb;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
            public int getSerializedSize() {
                int i13 = this.f28960ylkuphrtab;
                if (i13 != -1) {
                    return i13;
                }
                int iNufgyqmvbu = (this.f28953jyumaefscl & 1) == 1 ? CodedOutputStream.nufgyqmvbu(1, this.f28952iwizpuwonk.getNumber()) : 0;
                if ((this.f28953jyumaefscl & 2) == 2) {
                    iNufgyqmvbu += CodedOutputStream.lereixgezr(2, this.f28948cqumvgiudr);
                }
                if ((this.f28953jyumaefscl & 4) == 4) {
                    iNufgyqmvbu += CodedOutputStream.draadjrbmk(3, this.f28949esjtqupxsv);
                }
                if ((this.f28953jyumaefscl & 8) == 8) {
                    iNufgyqmvbu += CodedOutputStream.gxszxtbevo(4, this.f28954lereixgezr);
                }
                if ((this.f28953jyumaefscl & 16) == 16) {
                    iNufgyqmvbu += CodedOutputStream.ojitshcjhn(5, this.f28956pmvmpeiblj);
                }
                if ((this.f28953jyumaefscl & 32) == 32) {
                    iNufgyqmvbu += CodedOutputStream.ojitshcjhn(6, this.f28961zynmafqrjb);
                }
                if ((this.f28953jyumaefscl & 64) == 64) {
                    iNufgyqmvbu += CodedOutputStream.ojitshcjhn(7, this.f28951istkbnxepw);
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    iNufgyqmvbu += CodedOutputStream.oxmwwwfdhm(8, this.f28947cdpycssgdh);
                }
                for (int i14 = 0; i14 < this.f28958yadqdtsiqt.size(); i14++) {
                    iNufgyqmvbu += CodedOutputStream.oxmwwwfdhm(9, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28958yadqdtsiqt.get(i14));
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    iNufgyqmvbu += CodedOutputStream.ojitshcjhn(10, this.f28955lmojexxdyd);
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    iNufgyqmvbu += CodedOutputStream.ojitshcjhn(11, this.f28950iozdgvuglv);
                }
                int size = iNufgyqmvbu + this.f28959yggfygwlhe.size();
                this.f28960ylkuphrtab = size;
                return size;
            }

            public int hcddaimhww() {
                return this.f28950iozdgvuglv;
            }

            public int hkdspvbjdz() {
                return this.f28958yadqdtsiqt.size();
            }

            public boolean ikoacuggdj() {
                return (this.f28953jyumaefscl & 64) == 64;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
            public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f28953jyumaefscl & 1) == 1) {
                    codedOutputStream.kegysxyocb(1, this.f28952iwizpuwonk.getNumber());
                }
                if ((this.f28953jyumaefscl & 2) == 2) {
                    codedOutputStream.weqkydbzbr(2, this.f28948cqumvgiudr);
                }
                if ((this.f28953jyumaefscl & 4) == 4) {
                    codedOutputStream.ulzqkzuiru(3, this.f28949esjtqupxsv);
                }
                if ((this.f28953jyumaefscl & 8) == 8) {
                    codedOutputStream.wypolnanlu(4, this.f28954lereixgezr);
                }
                if ((this.f28953jyumaefscl & 16) == 16) {
                    codedOutputStream.ribwqtqdhb(5, this.f28956pmvmpeiblj);
                }
                if ((this.f28953jyumaefscl & 32) == 32) {
                    codedOutputStream.ribwqtqdhb(6, this.f28961zynmafqrjb);
                }
                if ((this.f28953jyumaefscl & 64) == 64) {
                    codedOutputStream.ribwqtqdhb(7, this.f28951istkbnxepw);
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    codedOutputStream.ikoacuggdj(8, this.f28947cdpycssgdh);
                }
                for (int i13 = 0; i13 < this.f28958yadqdtsiqt.size(); i13++) {
                    codedOutputStream.ikoacuggdj(9, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28958yadqdtsiqt.get(i13));
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    codedOutputStream.ribwqtqdhb(10, this.f28955lmojexxdyd);
                }
                if ((this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    codedOutputStream.ribwqtqdhb(11, this.f28950iozdgvuglv);
                }
                codedOutputStream.rlfsiqarku(this.f28959yggfygwlhe);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
            public final boolean isInitialized() {
                byte b13 = this.f28957wwaezpbzkn;
                if (b13 == 1) {
                    return true;
                }
                if (b13 == 0) {
                    return false;
                }
                if (jlmebxxoox() && !pkzmftpjix().isInitialized()) {
                    this.f28957wwaezpbzkn = (byte) 0;
                    return false;
                }
                for (int i13 = 0; i13 < hkdspvbjdz(); i13++) {
                    if (!jpowsppfya(i13).isInitialized()) {
                        this.f28957wwaezpbzkn = (byte) 0;
                        return false;
                    }
                }
                this.f28957wwaezpbzkn = (byte) 1;
                return true;
            }

            public boolean jhduphickx() {
                return (this.f28953jyumaefscl & 8) == 8;
            }

            public boolean jlmebxxoox() {
                return (this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
            }

            public ppxfxbqfkf jpowsppfya(int i13) {
                return (ppxfxbqfkf) this.f28958yadqdtsiqt.get(i13);
            }

            public boolean jztzpxfvev() {
                return (this.f28953jyumaefscl & 4) == 4;
            }

            public int mbcevpiqjq() {
                return this.f28955lmojexxdyd;
            }

            public boolean metgxyhuhe() {
                return (this.f28953jyumaefscl & 16) == 16;
            }

            public float ntlheqmsrt() {
                return this.f28949esjtqupxsv;
            }

            public boolean okpsazkaxt() {
                return (this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_NONE) == 512;
            }

            public zoijcleaow pkzmftpjix() {
                return this.f28947cdpycssgdh;
            }

            public boolean ribwqtqdhb() {
                return (this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256;
            }

            public boolean rlfsiqarku() {
                return (this.f28953jyumaefscl & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
            /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
            public C0574zoijcleaow toBuilder() {
                return yfnezrywwk(this);
            }

            public int sopmlzcsov() {
                return this.f28956pmvmpeiblj;
            }

            public double stevsuqkhv() {
                return this.f28954lereixgezr;
            }

            public int tzroggbefp() {
                return this.f28951istkbnxepw;
            }

            public long ulzqkzuiru() {
                return this.f28948cqumvgiudr;
            }

            public boolean vipkmwdibw() {
                return (this.f28953jyumaefscl & 32) == 32;
            }

            public boolean xrmfcynszj() {
                return (this.f28953jyumaefscl & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
            /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
            public C0574zoijcleaow newBuilderForType() {
                return uwvvkdfqfp();
            }

            private ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
                super(zoijcleaowVar);
                this.f28957wwaezpbzkn = (byte) -1;
                this.f28960ylkuphrtab = -1;
                this.f28959yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
            }

            private ppxfxbqfkf(boolean z13) {
                this.f28957wwaezpbzkn = (byte) -1;
                this.f28960ylkuphrtab = -1;
                this.f28959yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
            }

            private ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
                this.f28957wwaezpbzkn = (byte) -1;
                this.f28960ylkuphrtab = -1;
                czzsidtyhn();
                kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
                CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
                boolean z13 = false;
                char c13 = 0;
                while (!z13) {
                    try {
                        try {
                            int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                            switch (iPkzmftpjix) {
                                case 0:
                                    break;
                                case 8:
                                    int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                                    EnumC0573ppxfxbqfkf enumC0573ppxfxbqfkfIobyxmoadg = EnumC0573ppxfxbqfkf.iobyxmoadg(iWflxmlrfwp);
                                    if (enumC0573ppxfxbqfkfIobyxmoadg == null) {
                                        codedOutputStreamYlkuphrtab.zfvoamnweg(iPkzmftpjix);
                                        codedOutputStreamYlkuphrtab.zfvoamnweg(iWflxmlrfwp);
                                    } else {
                                        this.f28953jyumaefscl |= 1;
                                        this.f28952iwizpuwonk = enumC0573ppxfxbqfkfIobyxmoadg;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.f28953jyumaefscl |= 2;
                                    this.f28948cqumvgiudr = eablkybsjgVar.lmojexxdyd();
                                    continue;
                                case C4007z9.I /* 29 */:
                                    this.f28953jyumaefscl |= 4;
                                    this.f28949esjtqupxsv = eablkybsjgVar.rgvfuqvkyq();
                                    continue;
                                case 33:
                                    this.f28953jyumaefscl |= 8;
                                    this.f28954lereixgezr = eablkybsjgVar.draadjrbmk();
                                    continue;
                                case 40:
                                    this.f28953jyumaefscl |= 16;
                                    this.f28956pmvmpeiblj = eablkybsjgVar.oxmwwwfdhm();
                                    continue;
                                case 48:
                                    this.f28953jyumaefscl |= 32;
                                    this.f28961zynmafqrjb = eablkybsjgVar.oxmwwwfdhm();
                                    continue;
                                case 56:
                                    this.f28953jyumaefscl |= 64;
                                    this.f28951istkbnxepw = eablkybsjgVar.oxmwwwfdhm();
                                    continue;
                                case 66:
                                    ppxfxbqfkf builder = (this.f28953jyumaefscl & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 ? this.f28947cdpycssgdh.toBuilder() : null;
                                    zoijcleaow zoijcleaowVar = (zoijcleaow) eablkybsjgVar.zdlpuopuiu(zoijcleaow.f28927zynmafqrjb, gxszxtbevoVar);
                                    this.f28947cdpycssgdh = zoijcleaowVar;
                                    if (builder != null) {
                                        builder.wkgbmnqykc(zoijcleaowVar);
                                        this.f28947cdpycssgdh = builder.nufgyqmvbu();
                                    }
                                    this.f28953jyumaefscl |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                    continue;
                                case 74:
                                    if ((c13 & 256) != 256) {
                                        this.f28958yadqdtsiqt = new ArrayList();
                                        c13 = 256;
                                    }
                                    this.f28958yadqdtsiqt.add(eablkybsjgVar.zdlpuopuiu(f28945hcddaimhww, gxszxtbevoVar));
                                    continue;
                                case 80:
                                    this.f28953jyumaefscl |= UserVerificationMethods.USER_VERIFY_NONE;
                                    this.f28955lmojexxdyd = eablkybsjgVar.oxmwwwfdhm();
                                    continue;
                                case 88:
                                    this.f28953jyumaefscl |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                    this.f28950iozdgvuglv = eablkybsjgVar.oxmwwwfdhm();
                                    continue;
                                default:
                                    if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                        break;
                                    }
                                    break;
                            }
                            z13 = true;
                        } catch (Throwable th2) {
                            if ((c13 & 256) == 256) {
                                this.f28958yadqdtsiqt = Collections.unmodifiableList(this.f28958yadqdtsiqt);
                            }
                            try {
                                codedOutputStreamYlkuphrtab.wwaezpbzkn();
                            } catch (IOException unused) {
                            } finally {
                                this.f28959yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
                if ((c13 & 256) == 256) {
                    this.f28958yadqdtsiqt = Collections.unmodifiableList(this.f28958yadqdtsiqt);
                }
                try {
                    codedOutputStreamYlkuphrtab.wwaezpbzkn();
                } catch (IOException unused2) {
                } finally {
                    this.f28959yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                }
                draadjrbmk();
            }
        }

        private C0572zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
            this.f28940esjtqupxsv = (byte) -1;
            this.f28943lereixgezr = -1;
            this.f28944yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
        }

        private C0572zoijcleaow(boolean z13) {
            this.f28940esjtqupxsv = (byte) -1;
            this.f28943lereixgezr = -1;
            this.f28944yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
        }

        private C0572zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            this.f28940esjtqupxsv = (byte) -1;
            this.f28943lereixgezr = -1;
            cdpycssgdh();
            kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
            CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
            boolean z13 = false;
            while (!z13) {
                try {
                    try {
                        int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                        if (iPkzmftpjix != 0) {
                            if (iPkzmftpjix == 8) {
                                this.f28942jyumaefscl |= 1;
                                this.f28941iwizpuwonk = eablkybsjgVar.oxmwwwfdhm();
                            } else if (iPkzmftpjix != 18) {
                                if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                }
                            } else {
                                ppxfxbqfkf.C0574zoijcleaow builder = (this.f28942jyumaefscl & 2) == 2 ? this.f28939cqumvgiudr.toBuilder() : null;
                                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) eablkybsjgVar.zdlpuopuiu(ppxfxbqfkf.f28945hcddaimhww, gxszxtbevoVar);
                                this.f28939cqumvgiudr = ppxfxbqfkfVar;
                                if (builder != null) {
                                    builder.wkgbmnqykc(ppxfxbqfkfVar);
                                    this.f28939cqumvgiudr = builder.nufgyqmvbu();
                                }
                                this.f28942jyumaefscl |= 2;
                            }
                        }
                        z13 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamYlkuphrtab.wwaezpbzkn();
                        } catch (IOException unused) {
                        } finally {
                            this.f28944yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
                this.f28944yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
            }
            draadjrbmk();
        }
    }

    static {
        zoijcleaow zoijcleaowVar = new zoijcleaow(true);
        f28926pmvmpeiblj = zoijcleaowVar;
        zoijcleaowVar.lmojexxdyd();
    }

    public static zoijcleaow istkbnxepw() {
        return f28926pmvmpeiblj;
    }

    private void lmojexxdyd() {
        this.f28930iwizpuwonk = 0;
        this.f28928cqumvgiudr = Collections.emptyList();
    }

    public static ppxfxbqfkf wwaezpbzkn() {
        return ppxfxbqfkf.draadjrbmk();
    }

    public static ppxfxbqfkf ylkuphrtab(zoijcleaow zoijcleaowVar) {
        return wwaezpbzkn().wkgbmnqykc(zoijcleaowVar);
    }

    public int cdpycssgdh() {
        return this.f28930iwizpuwonk;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28932lereixgezr;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28931jyumaefscl & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28930iwizpuwonk) : 0;
        for (int i14 = 0; i14 < this.f28928cqumvgiudr.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(2, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28928cqumvgiudr.get(i14));
        }
        int size = iOjitshcjhn + this.f28933yggfygwlhe.size();
        this.f28932lereixgezr = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf toBuilder() {
        return ylkuphrtab(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f28931jyumaefscl & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28930iwizpuwonk);
        }
        for (int i13 = 0; i13 < this.f28928cqumvgiudr.size(); i13++) {
            codedOutputStream.ikoacuggdj(2, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28928cqumvgiudr.get(i13));
        }
        codedOutputStream.rlfsiqarku(this.f28933yggfygwlhe);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28929esjtqupxsv;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (!yadqdtsiqt()) {
            this.f28929esjtqupxsv = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < pmvmpeiblj(); i13++) {
            if (!lereixgezr(i13).isInitialized()) {
                this.f28929esjtqupxsv = (byte) 0;
                return false;
            }
        }
        this.f28929esjtqupxsv = (byte) 1;
        return true;
    }

    public C0572zoijcleaow lereixgezr(int i13) {
        return (C0572zoijcleaow) this.f28928cqumvgiudr.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf newBuilderForType() {
        return wwaezpbzkn();
    }

    public int pmvmpeiblj() {
        return this.f28928cqumvgiudr.size();
    }

    public boolean yadqdtsiqt() {
        return (this.f28931jyumaefscl & 1) == 1;
    }

    public List zynmafqrjb() {
        return this.f28928cqumvgiudr;
    }

    private zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f28929esjtqupxsv = (byte) -1;
        this.f28932lereixgezr = -1;
        this.f28933yggfygwlhe = zoijcleaowVar.ppxfxbqfkf();
    }

    private zoijcleaow(boolean z13) {
        this.f28929esjtqupxsv = (byte) -1;
        this.f28932lereixgezr = -1;
        this.f28933yggfygwlhe = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        this.f28929esjtqupxsv = (byte) -1;
        this.f28932lereixgezr = -1;
        lmojexxdyd();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    if (iPkzmftpjix != 0) {
                        if (iPkzmftpjix == 8) {
                            this.f28931jyumaefscl |= 1;
                            this.f28930iwizpuwonk = eablkybsjgVar.oxmwwwfdhm();
                        } else if (iPkzmftpjix != 18) {
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                            }
                        } else {
                            if ((c13 & 2) != 2) {
                                this.f28928cqumvgiudr = new ArrayList();
                                c13 = 2;
                            }
                            this.f28928cqumvgiudr.add(eablkybsjgVar.zdlpuopuiu(C0572zoijcleaow.f28938zynmafqrjb, gxszxtbevoVar));
                        }
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if ((c13 & 2) == 2) {
                        this.f28928cqumvgiudr = Collections.unmodifiableList(this.f28928cqumvgiudr);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28933yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
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
        if ((c13 & 2) == 2) {
            this.f28928cqumvgiudr = Collections.unmodifiableList(this.f28928cqumvgiudr);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28933yggfygwlhe = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}
