package n70;

import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.dsvhmnatus;
import pj.ikoacuggdj;
import yx.ApiVersionConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f69307cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f69308esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final f30.zoijcleaow f69309iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final b20.zoijcleaow f69310jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final b20.iobyxmoadg f69311yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final p20.iobyxmoadg f69312zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, zoijcleaow.class, "getTitle", "getTitle(Lcom/pandulapeter/beagle/common/contracts/BeagleListItemContract;)Lcom/pandulapeter/beagle/common/configuration/Text;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Text invoke(p002if.zoijcleaow zoijcleaowVar) {
            return ((zoijcleaow) this.receiver).gtknphoqwx(zoijcleaowVar);
        }
    }

    /* JADX INFO: renamed from: n70.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1487zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ o70.iobyxmoadg f69313jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69315zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1487zoijcleaow(o70.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69313jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C1487zoijcleaow(this.f69313jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69315zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.f69310jyumaefscl.zoijcleaow(this.f69313jyumaefscl.iobyxmoadg());
            this.f69315zdlpuopuiu = 1;
            if (crxdokpmqz.zoijcleaow(500L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            this.f69315zdlpuopuiu = 2;
            if (zoijcleaowVar.ojitshcjhn(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1487zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zoijcleaow(p20.iobyxmoadg getCurrentApiEndPointUseCase, b20.iobyxmoadg getCurrentApiVersionUseCase, b20.zoijcleaow setApiVersionUseCase, f30.zoijcleaow restartAppUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentApiEndPointUseCase, "getCurrentApiEndPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentApiVersionUseCase, "getCurrentApiVersionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setApiVersionUseCase, "setApiVersionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restartAppUseCase, "restartAppUseCase");
        this.f69312zdlpuopuiu = getCurrentApiEndPointUseCase;
        this.f69311yggfygwlhe = getCurrentApiVersionUseCase;
        this.f69310jyumaefscl = setApiVersionUseCase;
        this.f69309iwizpuwonk = restartAppUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(zoijcleaow zoijcleaowVar, o70.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar != null) {
            zoijcleaowVar.gxszxtbevo(iobyxmoadgVar);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final String btonecajqb() {
        return (String) this.f69311yggfygwlhe.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Text gtknphoqwx(p002if.zoijcleaow zoijcleaowVar) {
        Text title;
        return (zoijcleaowVar == null || (title = zoijcleaowVar.getTitle()) == null) ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Неизвестно") : title;
    }

    private final void gxszxtbevo(o70.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(ikoacuggdj.zoijcleaow()), null, null, new C1487zoijcleaow(iobyxmoadgVar, null), 3, null);
    }

    private final List lqeggnwhkg(l40.ppxfxbqfkf ppxfxbqfkfVar) {
        List<ApiVersionConfig> listZoijcleaow = xx.ppxfxbqfkf.zoijcleaow(xx.iobyxmoadg.f123319iobyxmoadg);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        for (ApiVersionConfig apiVersionConfig : listZoijcleaow) {
            String version = apiVersionConfig.getVersion();
            String description = apiVersionConfig.getDescription();
            List supportedEndpoints = apiVersionConfig.getSupportedEndpoints();
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(supportedEndpoints, 10));
            Iterator it = supportedEndpoints.iterator();
            while (it.hasNext()) {
                arrayList2.add(l40.ppxfxbqfkf.f61574yggfygwlhe.iobyxmoadg((String) it.next()));
            }
            arrayList.add(new o70.iobyxmoadg(version, description, arrayList2));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((o70.iobyxmoadg) obj).iobyxmoadg(), ppxfxbqfkfVar.name())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
        f30.zoijcleaow zoijcleaowVar = this.f69309iwizpuwonk;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzknVar;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public jf.iobyxmoadg invoke() {
        return new nf.agtfadlqog(new ppxfxbqfkf(this), lqeggnwhkg((l40.ppxfxbqfkf) this.f69312zdlpuopuiu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)), btonecajqb(), false, false, true, false, null, new tg.draadjrbmk() { // from class: n70.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.agtfadlqog(this.f69238zdlpuopuiu, (o70.iobyxmoadg) obj);
            }
        }, 216, null);
    }
}
