package cf0;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.loymaxpopup.impl.domain.LoymaxPopupArgs;
import ru.myspar.loymaxpopup.impl.presentation.LoymaxPopupDialogFragment;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements xe0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bf0.iobyxmoadg f19822iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f19823zoijcleaow;

    /* JADX INFO: renamed from: cf0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0361iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f19824cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f19826jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f19827yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f19828zdlpuopuiu;

        C0361iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19826jyumaefscl = obj;
            this.f19824cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f19829cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f19831jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f19832yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f19833zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19831jyumaefscl = obj;
            this.f19829cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(0L, this);
        }
    }

    public iobyxmoadg(bf0.iobyxmoadg loymaxPopupRemoteSource, ca2.ppxfxbqfkf userRepository) {
        zdlpuopuiu.btonecajqb(loymaxPopupRemoteSource, "loymaxPopupRemoteSource");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f19822iobyxmoadg = loymaxPopupRemoteSource;
        this.f19823zoijcleaow = userRepository;
    }

    @Override // xe0.iobyxmoadg
    public BaseMviBottomSheetDialogFragment iobyxmoadg(af0.iobyxmoadg popup, AnalyticsPage page) {
        zdlpuopuiu.btonecajqb(popup, "popup");
        zdlpuopuiu.btonecajqb(page, "page");
        long jZoijcleaow = popup.zoijcleaow();
        String strPpxfxbqfkf = popup.ppxfxbqfkf();
        String strWkgbmnqykc = popup.wkgbmnqykc();
        af0.zoijcleaow zoijcleaowVarIobyxmoadg = popup.iobyxmoadg();
        String strEablkybsjg = zoijcleaowVarIobyxmoadg != null ? zoijcleaowVarIobyxmoadg.eablkybsjg() : null;
        af0.zoijcleaow zoijcleaowVarIobyxmoadg2 = popup.iobyxmoadg();
        String strPpxfxbqfkf2 = zoijcleaowVarIobyxmoadg2 != null ? zoijcleaowVarIobyxmoadg2.ppxfxbqfkf() : null;
        af0.zoijcleaow zoijcleaowVarIobyxmoadg3 = popup.iobyxmoadg();
        String strZoijcleaow = zoijcleaowVarIobyxmoadg3 != null ? zoijcleaowVarIobyxmoadg3.zoijcleaow() : null;
        af0.zoijcleaow zoijcleaowVarIobyxmoadg4 = popup.iobyxmoadg();
        String strWkgbmnqykc2 = zoijcleaowVarIobyxmoadg4 != null ? zoijcleaowVarIobyxmoadg4.wkgbmnqykc() : null;
        af0.zoijcleaow zoijcleaowVarIobyxmoadg5 = popup.iobyxmoadg();
        return LoymaxPopupDialogFragment.INSTANCE.iobyxmoadg(new LoymaxPopupArgs(jZoijcleaow, page, strPpxfxbqfkf, strWkgbmnqykc, strEablkybsjg, strPpxfxbqfkf2, strZoijcleaow, strWkgbmnqykc2, zoijcleaowVarIobyxmoadg5 != null ? zoijcleaowVarIobyxmoadg5.iobyxmoadg() : null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // xe0.iobyxmoadg
    public Object ppxfxbqfkf(ze0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C0361iobyxmoadg c0361iobyxmoadg;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof C0361iobyxmoadg) {
            c0361iobyxmoadg = (C0361iobyxmoadg) gxszxtbevoVar;
            int i13 = c0361iobyxmoadg.f19824cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0361iobyxmoadg.f19824cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0361iobyxmoadg = new C0361iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0361iobyxmoadg = new C0361iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c0361iobyxmoadg.f19826jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0361iobyxmoadg.f19824cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (ze0.iobyxmoadg) c0361iobyxmoadg.f19827yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) c0361iobyxmoadg.f19828zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f19823zoijcleaow;
        c0361iobyxmoadg.f19828zdlpuopuiu = this;
        c0361iobyxmoadg.f19827yggfygwlhe = iobyxmoadgVar;
        c0361iobyxmoadg.f19824cqumvgiudr = 1;
        objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(c0361iobyxmoadg);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = this;
        User user = (User) objLqeggnwhkg;
        String xmlId = user != null ? user.getXmlId() : null;
        if (xmlId == null || kcexrzcfyt.zfvoamnweg(xmlId) || xx.iobyxmoadg.f123319iobyxmoadg.dsvhmnatus()) {
            return null;
        }
        bf0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2.f19822iobyxmoadg;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        c0361iobyxmoadg.f19828zdlpuopuiu = null;
        c0361iobyxmoadg.f19827yggfygwlhe = null;
        c0361iobyxmoadg.f19824cqumvgiudr = 2;
        objLqeggnwhkg = iobyxmoadgVar3.zoijcleaow(xmlId, strZoijcleaow, strIobyxmoadg, c0361iobyxmoadg);
        return objLqeggnwhkg == objGxszxtbevo ? objGxszxtbevo : objLqeggnwhkg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // xe0.iobyxmoadg
    public Object zoijcleaow(long j13, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f19829cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f19829cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f19831jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f19829cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                j13 = zoijcleaowVar.f19832yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f19833zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f19823zoijcleaow;
        zoijcleaowVar.f19833zdlpuopuiu = this;
        zoijcleaowVar.f19832yggfygwlhe = j13;
        zoijcleaowVar.f19829cqumvgiudr = 1;
        objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(zoijcleaowVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        User user = (User) objLqeggnwhkg;
        String xmlId = user != null ? user.getXmlId() : null;
        if (xmlId == null || kcexrzcfyt.zfvoamnweg(xmlId)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        bf0.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f19822iobyxmoadg;
        zoijcleaowVar.f19833zdlpuopuiu = null;
        zoijcleaowVar.f19829cqumvgiudr = 2;
        if (iobyxmoadgVar2.iobyxmoadg(xmlId, j13, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
