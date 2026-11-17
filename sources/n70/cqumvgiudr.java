package n70;

import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.dsvhmnatus;
import pj.ikoacuggdj;
import yx.ApiVersionConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class cqumvgiudr implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final iobyxmoadg f69225lereixgezr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final int f69226pmvmpeiblj = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final b20.zoijcleaow f69227cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final b20.iobyxmoadg f69228esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final f30.zoijcleaow f69229iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final c20.gxszxtbevo f69230jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final p20.zoijcleaow f69231yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final p20.iobyxmoadg f69232zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, cqumvgiudr.class, "titleProvider", "titleProvider(Lcom/pandulapeter/beagle/common/contracts/BeagleListItemContract;)Lcom/pandulapeter/beagle/common/configuration/Text;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Text invoke(p002if.zoijcleaow zoijcleaowVar) {
            return ((cqumvgiudr) this.receiver).zdlpuopuiu(zoijcleaowVar);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ o70.gxszxtbevo f69233jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69235zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(o70.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
            super(2, gxszxtbevoVar2);
            this.f69233jyumaefscl = gxszxtbevoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return cqumvgiudr.this.new zoijcleaow(this.f69233jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cqumvgiudr cqumvgiudrVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69235zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    cqumvgiudrVar = cqumvgiudr.this;
                    this.f69235zdlpuopuiu = 3;
                    if (cqumvgiudrVar.kcexrzcfyt(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            l40.ppxfxbqfkf ppxfxbqfkfVarYggfygwlhe = cqumvgiudr.this.yggfygwlhe(this.f69233jyumaefscl);
            cqumvgiudr.this.f69231yggfygwlhe.zoijcleaow(ppxfxbqfkfVarYggfygwlhe);
            cqumvgiudr.this.oxmwwwfdhm(ppxfxbqfkfVarYggfygwlhe);
            c20.gxszxtbevo gxszxtbevoVar = cqumvgiudr.this.f69230jyumaefscl;
            c20.gxszxtbevo.iobyxmoadg iobyxmoadgVar = new c20.gxszxtbevo.iobyxmoadg(false);
            this.f69235zdlpuopuiu = 1;
            if (gxszxtbevoVar.zoijcleaow(iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f69235zdlpuopuiu = 2;
            if (crxdokpmqz.zoijcleaow(500L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cqumvgiudrVar = cqumvgiudr.this;
            this.f69235zdlpuopuiu = 3;
            if (cqumvgiudrVar.kcexrzcfyt(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public cqumvgiudr(p20.iobyxmoadg getCurrentApiEndPointUseCase, p20.zoijcleaow setCurrentApiEndPointUseCase, c20.gxszxtbevo logoutUseCase, f30.zoijcleaow restartAppUseCase, b20.zoijcleaow setApiVersionUseCase, b20.iobyxmoadg getCurrentApiVersionUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentApiEndPointUseCase, "getCurrentApiEndPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCurrentApiEndPointUseCase, "setCurrentApiEndPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logoutUseCase, "logoutUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restartAppUseCase, "restartAppUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setApiVersionUseCase, "setApiVersionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentApiVersionUseCase, "getCurrentApiVersionUseCase");
        this.f69232zdlpuopuiu = getCurrentApiEndPointUseCase;
        this.f69231yggfygwlhe = setCurrentApiEndPointUseCase;
        this.f69230jyumaefscl = logoutUseCase;
        this.f69229iwizpuwonk = restartAppUseCase;
        this.f69227cqumvgiudr = setApiVersionUseCase;
        this.f69228esjtqupxsv = getCurrentApiVersionUseCase;
    }

    private final void gtknphoqwx(o70.gxszxtbevo gxszxtbevoVar) {
        pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(ikoacuggdj.zoijcleaow()), null, null, new zoijcleaow(gxszxtbevoVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
        f30.zoijcleaow zoijcleaowVar = this.f69229iwizpuwonk;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(cqumvgiudr cqumvgiudrVar, o70.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar != null) {
            cqumvgiudrVar.gtknphoqwx(gxszxtbevoVar);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oxmwwwfdhm(l40.ppxfxbqfkf ppxfxbqfkfVar) {
        Object next;
        List supportedEndpoints;
        Iterator it = xx.ppxfxbqfkf.zoijcleaow(xx.iobyxmoadg.f123319iobyxmoadg).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ApiVersionConfig) next).getVersion(), this.f69228esjtqupxsv.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        ApiVersionConfig apiVersionConfig = (ApiVersionConfig) next;
        if ((apiVersionConfig == null || (supportedEndpoints = apiVersionConfig.getSupportedEndpoints()) == null) ? false : supportedEndpoints.contains(ppxfxbqfkfVar.wkgbmnqykc())) {
            return;
        }
        this.f69227cqumvgiudr.zoijcleaow(xx.iobyxmoadg.f123319iobyxmoadg.rgvfuqvkyq().getVersion());
    }

    private final String wflxmlrfwp() {
        return ((l40.ppxfxbqfkf) this.f69232zdlpuopuiu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l40.ppxfxbqfkf yggfygwlhe(o70.gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, o70.gxszxtbevo.iobyxmoadg.f72235zoijcleaow)) {
            return l40.ppxfxbqfkf.DEV;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, o70.gxszxtbevo.eablkybsjg.f72234zoijcleaow)) {
            return l40.ppxfxbqfkf.TEST;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, o70.gxszxtbevo.zoijcleaow.f72238zoijcleaow)) {
            return l40.ppxfxbqfkf.PREPROD;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, o70.gxszxtbevo.ppxfxbqfkf.f72236zoijcleaow)) {
            return l40.ppxfxbqfkf.PROD;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, o70.gxszxtbevo.wkgbmnqykc.f72237zoijcleaow)) {
            return l40.ppxfxbqfkf.TEAMPROFI;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Text zdlpuopuiu(p002if.zoijcleaow zoijcleaowVar) {
        Text title;
        Text textZoijcleaow;
        return (zoijcleaowVar == null || (title = zoijcleaowVar.getTitle()) == null || (textZoijcleaow = title.zoijcleaow("")) == null) ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Неизвестно") : textZoijcleaow;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public jf.iobyxmoadg invoke() {
        return new nf.agtfadlqog(new ppxfxbqfkf(this), hg.jyumaefscl.rgvfuqvkyq(o70.gxszxtbevo.iobyxmoadg.f72235zoijcleaow, o70.gxszxtbevo.eablkybsjg.f72234zoijcleaow, o70.gxszxtbevo.zoijcleaow.f72238zoijcleaow, o70.gxszxtbevo.ppxfxbqfkf.f72236zoijcleaow, o70.gxszxtbevo.wkgbmnqykc.f72237zoijcleaow), wflxmlrfwp(), false, false, true, false, null, new tg.draadjrbmk() { // from class: n70.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.ojitshcjhn(this.f69239zdlpuopuiu, (o70.gxszxtbevo) obj);
            }
        }, 216, null);
    }
}
