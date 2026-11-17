package n0;

import java.util.List;
import pj.auzgnhcxok;
import pj.krqnebusok;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f68277iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private pj.cllcsxoeiz f68278zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f68275ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f68276wkgbmnqykc = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final esjtqupxsv f68273eablkybsjg = new esjtqupxsv();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final pj.hcddaimhww f68274gxszxtbevo = new ppxfxbqfkf(pj.hcddaimhww.f76711btonecajqb);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf extends lg.iobyxmoadg implements pj.hcddaimhww {
        public ppxfxbqfkf(pj.hcddaimhww.zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
        }

        @Override // pj.hcddaimhww
        public void handleException(lg.btonecajqb btonecajqbVar, Throwable th2) {
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f68279yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f68280zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f68279yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f68279yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f68280zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = this.f68279yggfygwlhe;
                this.f68280zdlpuopuiu = 1;
                if (nufgyqmvbuVar.draadjrbmk(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public jyumaefscl(dxjokdxxww dxjokdxxwwVar, lg.btonecajqb btonecajqbVar) {
        this.f68277iobyxmoadg = dxjokdxxwwVar;
        this.f68278zoijcleaow = pj.dsvhmnatus.iobyxmoadg(f68274gxszxtbevo.plus(s0.rgvfuqvkyq.iobyxmoadg()).plus(btonecajqbVar).plus(krqnebusok.iobyxmoadg((auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx))));
    }

    public ikoacuggdj iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, jpowsppfya jpowsppfyaVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        if (!(ribwqtqdhbVar.ppxfxbqfkf() instanceof yggfygwlhe)) {
            return null;
        }
        gg.vdvldrhtss vdvldrhtssVarZoijcleaow = iwizpuwonk.zoijcleaow(f68273eablkybsjg.iobyxmoadg(((yggfygwlhe) ribwqtqdhbVar.ppxfxbqfkf()).btonecajqb(), ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc()), ribwqtqdhbVar, this.f68277iobyxmoadg, jpowsppfyaVar, draadjrbmkVar2);
        List list = (List) vdvldrhtssVarZoijcleaow.iobyxmoadg();
        Object objWkgbmnqykc = vdvldrhtssVarZoijcleaow.wkgbmnqykc();
        if (list == null) {
            return new ikoacuggdj.zoijcleaow(objWkgbmnqykc, false, 2, null);
        }
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(list, objWkgbmnqykc, ribwqtqdhbVar, this.f68277iobyxmoadg, draadjrbmkVar, jpowsppfyaVar);
        pj.gtknphoqwx.wkgbmnqykc(this.f68278zoijcleaow, null, pj.wypolnanlu.UNDISPATCHED, new zoijcleaow(nufgyqmvbuVar, null), 1, null);
        return new ikoacuggdj.iobyxmoadg(nufgyqmvbuVar);
    }

    public /* synthetic */ jyumaefscl(dxjokdxxww dxjokdxxwwVar, lg.btonecajqb btonecajqbVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new dxjokdxxww() : dxjokdxxwwVar, (i13 & 2) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar);
    }
}
