package gj;

import zi.ikoacuggdj;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37550iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f37551ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f37552zoijcleaow;

    public static final class iobyxmoadg extends jyumaefscl {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final iobyxmoadg f37553wkgbmnqykc = new iobyxmoadg();

        private iobyxmoadg() {
            super("Boolean", yggfygwlhe.f37591zdlpuopuiu, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kegysxyocb ppxfxbqfkf(gh.dxjokdxxww dxjokdxxwwVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
            ikoacuggdj ikoacuggdjVarAgtfadlqog = dxjokdxxwwVar.agtfadlqog();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarAgtfadlqog, "getBooleanType(...)");
            return ikoacuggdjVarAgtfadlqog;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f37554wkgbmnqykc = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super("Unit", cqumvgiudr.f37540zdlpuopuiu, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kegysxyocb ppxfxbqfkf(gh.dxjokdxxww dxjokdxxwwVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
            ikoacuggdj ikoacuggdjVarRibwqtqdhb = dxjokdxxwwVar.ribwqtqdhb();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarRibwqtqdhb, "getUnitType(...)");
            return ikoacuggdjVarRibwqtqdhb;
        }
    }

    public static final class zoijcleaow extends jyumaefscl {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final zoijcleaow f37555wkgbmnqykc = new zoijcleaow();

        private zoijcleaow() {
            super("Int", iwizpuwonk.f37549zdlpuopuiu, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kegysxyocb ppxfxbqfkf(gh.dxjokdxxww dxjokdxxwwVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
            ikoacuggdj ikoacuggdjVarCdpycssgdh = dxjokdxxwwVar.cdpycssgdh();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarCdpycssgdh, "getIntType(...)");
            return ikoacuggdjVarCdpycssgdh;
        }
    }

    public /* synthetic */ jyumaefscl(String str, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, draadjrbmkVar);
    }

    @Override // gj.gxszxtbevo
    public String getDescription() {
        return this.f37551ppxfxbqfkf;
    }

    @Override // gj.gxszxtbevo
    public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(functionDescriptor.getReturnType(), this.f37552zoijcleaow.invoke(pi.eablkybsjg.wflxmlrfwp(functionDescriptor)));
    }

    @Override // gj.gxszxtbevo
    public String zoijcleaow(jh.lereixgezr lereixgezrVar) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, lereixgezrVar);
    }

    private jyumaefscl(String str, tg.draadjrbmk draadjrbmkVar) {
        this.f37550iobyxmoadg = str;
        this.f37552zoijcleaow = draadjrbmkVar;
        this.f37551ppxfxbqfkf = "must return " + str;
    }
}
