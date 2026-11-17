package ni;

import jh.lmojexxdyd;
import jh.yfnezrywwk;
import kotlin.NoWhenBranchMatchedException;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.opjhrmiecq;
import zi.skhdrjzrfn;
import zi.ulzqkzuiru;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f70096zoijcleaow = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg(kegysxyocb argumentType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(argumentType, "argumentType");
            if (ulzqkzuiru.iobyxmoadg(argumentType)) {
                return null;
            }
            kegysxyocb type = argumentType;
            int i13 = 0;
            while (gh.dxjokdxxww.ikoacuggdj(type)) {
                type = ((iwxlajgraz) hg.jyumaefscl.yzdjzghtvl(type.fyldjkxazc())).getType();
                i13++;
            }
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = type.grlcpdaxtj().ylkuphrtab();
            if (nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg) {
                ii.zoijcleaow zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(nufgyqmvbuVarWkgbmnqykc);
                return zoijcleaowVarAgtfadlqog == null ? new kcexrzcfyt(new zoijcleaow.iobyxmoadg(argumentType)) : new kcexrzcfyt(zoijcleaowVarAgtfadlqog, i13);
            }
            if (!(nufgyqmvbuVarWkgbmnqykc instanceof yfnezrywwk)) {
                return null;
            }
            ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
            ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = gh.ojitshcjhn.iobyxmoadg.f37364zoijcleaow.draadjrbmk();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk, "toSafe(...)");
            return new kcexrzcfyt(iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVarDraadjrbmk), 0);
        }

        private iobyxmoadg() {
        }
    }

    public static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final kegysxyocb f70097iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(kegysxyocb type) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                this.f70097iobyxmoadg = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f70097iobyxmoadg, ((iobyxmoadg) obj).f70097iobyxmoadg);
            }

            public int hashCode() {
                return this.f70097iobyxmoadg.hashCode();
            }

            public final kegysxyocb iobyxmoadg() {
                return this.f70097iobyxmoadg;
            }

            public String toString() {
                return "LocalClass(type=" + this.f70097iobyxmoadg + ')';
            }
        }

        /* JADX INFO: renamed from: ni.kcexrzcfyt$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1512zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final gxszxtbevo f70098iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1512zoijcleaow(gxszxtbevo value) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                this.f70098iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1512zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f70098iobyxmoadg, ((C1512zoijcleaow) obj).f70098iobyxmoadg);
            }

            public int hashCode() {
                return this.f70098iobyxmoadg.hashCode();
            }

            public final int iobyxmoadg() {
                return this.f70098iobyxmoadg.ppxfxbqfkf();
            }

            public final gxszxtbevo ppxfxbqfkf() {
                return this.f70098iobyxmoadg;
            }

            public String toString() {
                return "NormalClass(value=" + this.f70098iobyxmoadg + ')';
            }

            public final ii.zoijcleaow zoijcleaow() {
                return this.f70098iobyxmoadg.wkgbmnqykc();
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcexrzcfyt(zoijcleaow value) {
        super(value);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
    }

    @Override // ni.lqeggnwhkg
    public kegysxyocb iobyxmoadg(lmojexxdyd module) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        opjhrmiecq opjhrmiecqVarBtonecajqb = opjhrmiecq.f130109yggfygwlhe.btonecajqb();
        jh.eablkybsjg eablkybsjgVarYadqdtsiqt = module.wflxmlrfwp().yadqdtsiqt();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarYadqdtsiqt, "getKClass(...)");
        return ntlheqmsrt.nufgyqmvbu(opjhrmiecqVarBtonecajqb, eablkybsjgVarYadqdtsiqt, hg.jyumaefscl.eablkybsjg(new skhdrjzrfn(ppxfxbqfkf(module))));
    }

    public final kegysxyocb ppxfxbqfkf(lmojexxdyd module) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        zoijcleaow zoijcleaowVar = (zoijcleaow) zoijcleaow();
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return ((zoijcleaow.iobyxmoadg) zoijcleaow()).iobyxmoadg();
        }
        if (!(zoijcleaowVar instanceof zoijcleaow.C1512zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo gxszxtbevoVarPpxfxbqfkf = ((zoijcleaow.C1512zoijcleaow) zoijcleaow()).ppxfxbqfkf();
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = gxszxtbevoVarPpxfxbqfkf.iobyxmoadg();
        int iZoijcleaow = gxszxtbevoVarPpxfxbqfkf.zoijcleaow();
        jh.eablkybsjg eablkybsjgVarZoijcleaow = jh.esjtqupxsv.zoijcleaow(module, zoijcleaowVarIobyxmoadg);
        if (eablkybsjgVarZoijcleaow == null) {
            return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16485pmvmpeiblj, zoijcleaowVarIobyxmoadg.toString(), String.valueOf(iZoijcleaow));
        }
        ikoacuggdj ikoacuggdjVarOjitshcjhn = eablkybsjgVarZoijcleaow.ojitshcjhn();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
        kegysxyocb kegysxyocbVarCdpycssgdh = ej.wkgbmnqykc.cdpycssgdh(ikoacuggdjVarOjitshcjhn);
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            kegysxyocbVarCdpycssgdh = module.wflxmlrfwp().draadjrbmk(mhtqkkgtqm.INVARIANT, kegysxyocbVarCdpycssgdh);
        }
        return kegysxyocbVarCdpycssgdh;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kcexrzcfyt(gxszxtbevo value) {
        this(new zoijcleaow.C1512zoijcleaow(value));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kcexrzcfyt(ii.zoijcleaow classId, int i13) {
        this(new gxszxtbevo(classId, i13));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
    }
}
