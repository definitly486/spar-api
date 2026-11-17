package lj1;

import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ow1.esjtqupxsv;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.legacy.presentation.model.AddProductParams;
import ru.myspar.proloyalty.purchases.impl.list_details.domain.store.State;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseListDetails;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseProduct;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements zb1.iobyxmoadg {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final C1274iobyxmoadg f62732ojitshcjhn = new C1274iobyxmoadg(null);

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final int f62733rgvfuqvkyq = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private Runnable f62734agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lw1.iobyxmoadg f62735btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final bz0.eablkybsjg f62736draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vm0.zoijcleaow f62737dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p01.ppxfxbqfkf f62738eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final oh1.ppxfxbqfkf f62739gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cz0.iobyxmoadg f62740gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final t81.iobyxmoadg f62741lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ek1.iobyxmoadg f62742nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f62743ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private auzgnhcxok f62744wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m01.nufgyqmvbu f62745wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lj1.wkgbmnqykc f62746jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62748zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(lj1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62746jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new agtfadlqog(this.f62746jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62748zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((lj1.wkgbmnqykc.dxjokdxxww) this.f62746jyumaefscl).iobyxmoadg();
                this.f62748zdlpuopuiu = 1;
                if (iobyxmoadgVar.opjhrmiecq(strIobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ String f62750esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f62751iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f62752jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ Map f62753lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f62754yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f62755zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, Map map, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62750esjtqupxsv = str;
            this.f62753lereixgezr = map;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(this.f62750esjtqupxsv, this.f62753lereixgezr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            iobyxmoadg iobyxmoadgVar;
            iobyxmoadg iobyxmoadgVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62751iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (iobyxmoadg) this.f62754yggfygwlhe;
                        obj2 = this.f62755zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.mhtqkkgtqm(thDxjokdxxww);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                String str = this.f62750esjtqupxsv;
                Map map = this.f62753lereixgezr;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f62742nufgyqmvbu;
                this.f62751iwizpuwonk = 1;
                obj = iobyxmoadgVar5.ppxfxbqfkf(str, map, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((PurchaseListDetails) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            iobyxmoadgVar = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                iobyxmoadgVar.ixidwrxhsl((PurchaseListDetails) obj2);
                fk1.iobyxmoadg iobyxmoadgVarEablkybsjg = iobyxmoadgVar.f62742nufgyqmvbu.eablkybsjg();
                this.f62755zdlpuopuiu = obj2;
                this.f62754yggfygwlhe = iobyxmoadgVar;
                this.f62752jyumaefscl = obj2;
                this.f62751iwizpuwonk = 2;
                if (iobyxmoadgVarEablkybsjg.ppxfxbqfkf(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62757yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62758zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62758zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.mhtqkkgtqm((Throwable) this.f62757yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = iobyxmoadg.this.new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f62757yggfygwlhe = th2;
            return cqumvgiudrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lj1.wkgbmnqykc f62759jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62761zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(lj1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62759jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(this.f62759jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62761zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((lj1.wkgbmnqykc.agtfadlqog) this.f62759jyumaefscl).iobyxmoadg();
                this.f62761zdlpuopuiu = 1;
                if (iobyxmoadgVar.iyctptxqzt(strIobyxmoadg, false, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ AddProductParams f62762iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f62763jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62765zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(String str, AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62763jyumaefscl = str;
            this.f62762iwizpuwonk = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(this.f62763jyumaefscl, this.f62762iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62765zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f62763jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    p01.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f62738eablkybsjg;
                    p01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new p01.ppxfxbqfkf.iobyxmoadg(str);
                    this.f62765zdlpuopuiu = 1;
                    obj = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar3, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            AddProductParams addProductParams = this.f62762iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.mbcevpiqjq(addProductParams);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f62766iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62768yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f62769zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f62768yggfygwlhe = obj;
            this.f62766iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.opjhrmiecq(null, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lj1.wkgbmnqykc f62770jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62772zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(lj1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62770jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gtknphoqwx(this.f62770jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62772zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.weqkydbzbr(((lj1.wkgbmnqykc.nufgyqmvbu) this.f62770jyumaefscl).iobyxmoadg(), ((lj1.wkgbmnqykc.nufgyqmvbu) this.f62770jyumaefscl).zoijcleaow());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f62773iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62775yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f62776zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f62775yggfygwlhe = obj;
            this.f62773iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iyctptxqzt(null, false, this);
        }
    }

    /* JADX INFO: renamed from: lj1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1274iobyxmoadg {
        public /* synthetic */ C1274iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1274iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62778zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new iwizpuwonk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62778zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.dvvnrvtcbc();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.C0753iobyxmoadg c0753iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(c0753iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f62779zdlpuopuiu;

        /* JADX INFO: renamed from: lj1.iobyxmoadg$jyumaefscl$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1275iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f62780zdlpuopuiu;

            /* JADX INFO: renamed from: lj1.iobyxmoadg$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1276iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f62782yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f62783zdlpuopuiu;

                public C1276iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f62783zdlpuopuiu = obj;
                    this.f62782yggfygwlhe |= Integer.MIN_VALUE;
                    return C1275iobyxmoadg.this.emit(null, this);
                }
            }

            public C1275iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f62780zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1276iobyxmoadg c1276iobyxmoadg;
                if (gxszxtbevoVar instanceof C1276iobyxmoadg) {
                    c1276iobyxmoadg = (C1276iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1276iobyxmoadg.f62782yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1276iobyxmoadg.f62782yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1276iobyxmoadg = new C1276iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1276iobyxmoadg = new C1276iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1276iobyxmoadg.f62783zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1276iobyxmoadg.f62782yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f62780zdlpuopuiu;
                    if (obj instanceof fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.C0753iobyxmoadg) {
                        c1276iobyxmoadg.f62782yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1276iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f62779zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f62779zdlpuopuiu.collect(new C1275iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62785yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62786zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = iobyxmoadg.this.new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f62785yggfygwlhe = obj;
            return kcexrzcfytVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62786zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.iobyxmoadg((List) this.f62785yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ gk1.iobyxmoadg f62787cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f62788iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f62789jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62791zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, List list, gk1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62789jyumaefscl = str;
            this.f62788iwizpuwonk = list;
            this.f62787cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f62789jyumaefscl, this.f62788iwizpuwonk, this.f62787cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62791zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f62789jyumaefscl;
                    List list = this.f62788iwizpuwonk;
                    gk1.iobyxmoadg iobyxmoadgVar2 = this.f62787cqumvgiudr;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ek1.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar.f62742nufgyqmvbu;
                    this.f62791zdlpuopuiu = 1;
                    obj = iobyxmoadgVar4.draadjrbmk(str, list, iobyxmoadgVar2, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((PurchaseListDetails) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar6 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar6.ixidwrxhsl((PurchaseListDetails) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar6.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62793zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62793zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    t81.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f62741lqeggnwhkg;
                    s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105726hkdspvbjdz;
                    this.f62793zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            Boolean bool = (Boolean) objWkgbmnqykc;
            if (bool != null) {
                iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.ppxfxbqfkf(bool.booleanValue()));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62795zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62795zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ek1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f62742nufgyqmvbu;
                    String listId = iobyxmoadg.oipsdeybqn(iobyxmoadgVar).getArgs().getListId();
                    this.f62795zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.dxjokdxxww(listId, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((PurchaseListDetails) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ixidwrxhsl((PurchaseListDetails) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.jrbgnlbqoe(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62796yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62797zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62797zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f62796yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f62796yggfygwlhe = th2;
            return oxmwwwfdhmVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddProductParams f62798jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62800zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62798jyumaefscl = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f62798jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62800zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    AddProductParams addProductParams = this.f62798jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    cz0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f62740gxszxtbevo;
                    String productId = addProductParams.getProductId();
                    double quantity = addProductParams.getQuantity();
                    MeasureType measureType = addProductParams.getMeasureType();
                    this.f62800zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.ojitshcjhn((16 & 1) != 0 ? null : productId, (16 & 2) != 0 ? null : null, quantity, measureType, (16 & 16) != 0 ? false : false, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(((kz0.ppxfxbqfkf) obj).ppxfxbqfkf());
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.grlcpdaxtj((Warning.DailyLimit) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62802zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new rgvfuqvkyq(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0099  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62802zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((PurchaseListDetails) obj);
                    iobyxmoadgVar = iobyxmoadg.this;
                    if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.ixidwrxhsl((PurchaseListDetails) objWkgbmnqykc);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.mhtqkkgtqm(thDxjokdxxww);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f62802zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(700L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar2.f62742nufgyqmvbu;
                String listId = iobyxmoadg.oipsdeybqn(iobyxmoadgVar2).getArgs().getListId();
                List productDataList = iobyxmoadg.oipsdeybqn(iobyxmoadgVar2).getProductDataList();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(productDataList, 10));
                Iterator it = productDataList.iterator();
                while (it.hasNext()) {
                    arrayList.add(iobyxmoadgVar2.lxfrhoxuzk((ProductData) it.next()));
                }
                this.f62802zdlpuopuiu = 2;
                obj = iobyxmoadgVar4.lqeggnwhkg(listId, arrayList, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((PurchaseListDetails) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.ixidwrxhsl((PurchaseListDetails) objWkgbmnqykc);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f62804yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62805zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            vdvldrhtss vdvldrhtssVar = iobyxmoadg.this.new vdvldrhtss(gxszxtbevoVar);
            vdvldrhtssVar.f62804yggfygwlhe = obj;
            return vdvldrhtssVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62805zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f62804yggfygwlhe;
            iobyxmoadg.this.fiwbwshyhd(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lj1.wkgbmnqykc f62806jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62808zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(lj1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62806jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(this.f62806jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62808zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((lj1.wkgbmnqykc.vdvldrhtss) this.f62806jyumaefscl).iobyxmoadg();
                this.f62808zdlpuopuiu = 1;
                if (iobyxmoadgVar.iyctptxqzt(strIobyxmoadg, true, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ PurchaseProduct f62809jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62811zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(PurchaseProduct purchaseProduct, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f62809jyumaefscl = purchaseProduct;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f62809jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f62811zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = new xm0.zoijcleaow.C3095zoijcleaow(new AnalyticsPage.ShoppingList(iobyxmoadg.oipsdeybqn(iobyxmoadg.this).getArgs().getListId(), iobyxmoadg.oipsdeybqn(iobyxmoadg.this).getListName()), null, new AnalyticElement.ProductItemElement(this.f62809jyumaefscl.getArticle(), this.f62809jyumaefscl.getName()));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    PurchaseProduct purchaseProduct = this.f62809jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    lw1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f62735btonecajqb;
                    String id2 = purchaseProduct.getId();
                    boolean isFavorite = purchaseProduct.getIsFavorite();
                    this.f62811zdlpuopuiu = 1;
                    if (iobyxmoadgVar3.nufgyqmvbu(id2, isFavorite, c3095zoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.mhtqkkgtqm(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f62812yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f62813zdlpuopuiu;

        /* JADX INFO: renamed from: lj1.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1277iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f62814yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f62815zdlpuopuiu;

            /* JADX INFO: renamed from: lj1.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1278iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f62817yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f62818zdlpuopuiu;

                public C1278iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f62818zdlpuopuiu = obj;
                    this.f62817yggfygwlhe |= Integer.MIN_VALUE;
                    return C1277iobyxmoadg.this.emit(null, this);
                }
            }

            public C1277iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f62815zdlpuopuiu = nufgyqmvbuVar;
                this.f62814yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1278iobyxmoadg c1278iobyxmoadg;
                if (gxszxtbevoVar instanceof C1278iobyxmoadg) {
                    c1278iobyxmoadg = (C1278iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1278iobyxmoadg.f62817yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1278iobyxmoadg.f62817yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1278iobyxmoadg = new C1278iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1278iobyxmoadg = new C1278iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1278iobyxmoadg.f62818zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1278iobyxmoadg.f62817yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f62815zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.C0753iobyxmoadg) obj).iobyxmoadg(), iobyxmoadg.oipsdeybqn(this.f62814yggfygwlhe).getArgs().getListId())) {
                        c1278iobyxmoadg.f62817yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1278iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f62813zdlpuopuiu = lqeggnwhkgVar;
            this.f62812yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f62813zdlpuopuiu.collect(new C1277iobyxmoadg(nufgyqmvbuVar, this.f62812yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f62820zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zdlpuopuiu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f62820zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.dvvnrvtcbc();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f62821iobyxmoadg;

        static {
            int[] iArr = new int[gk1.iobyxmoadg.values().length];
            try {
                iArr[gk1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gk1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f62821iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, esjtqupxsv authUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, p01.ppxfxbqfkf clearCartUseCase, cz0.iobyxmoadg cartInteractor, t81.iobyxmoadg featureManager, ek1.iobyxmoadg purchasesListComponentApi, vm0.zoijcleaow analyticsTracker, lw1.iobyxmoadg changeFavoritesInteractor, oh1.ppxfxbqfkf interactor, bz0.eablkybsjg utilsInteractor) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authUseCase, "authUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interactor, "interactor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(utilsInteractor, "utilsInteractor");
        this.f62743ppxfxbqfkf = authUseCase;
        this.f62745wkgbmnqykc = subscribeToCurrentDeliveryDataUseCase;
        this.f62738eablkybsjg = clearCartUseCase;
        this.f62740gxszxtbevo = cartInteractor;
        this.f62741lqeggnwhkg = featureManager;
        this.f62742nufgyqmvbu = purchasesListComponentApi;
        this.f62737dxjokdxxww = analyticsTracker;
        this.f62735btonecajqb = changeFavoritesInteractor;
        this.f62739gtknphoqwx = interactor;
        this.f62736draadjrbmk = utilsInteractor;
    }

    static /* synthetic */ void a(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.krqnebusok(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void ageimvtcrz(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new lj1.eablkybsjg.gxszxtbevo(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.PurchaseDetail(((State) jlmebxxoox()).getArgs().getListId()), null, 4, null)));
    }

    private final PurchaseProduct auzgnhcxok(String str) {
        Object obj;
        Object next;
        State state = (State) jlmebxxoox();
        Iterator it = state.getProductsBuy().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseProduct) next).getArticle(), str));
        PurchaseProduct purchaseProduct = (PurchaseProduct) next;
        if (purchaseProduct != null) {
            return purchaseProduct;
        }
        for (Object obj2 : state.getProductsBought()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseProduct) obj2).getArticle(), str)) {
                obj = obj2;
                break;
            }
        }
        return (PurchaseProduct) obj;
    }

    private final void bfopjjpdmp(String str) {
        Object next;
        Object next2;
        Iterator it = ((State) jlmebxxoox()).getProductsBuy().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseProduct) next).getId(), str));
        PurchaseProduct purchaseProduct = (PurchaseProduct) next;
        if (purchaseProduct == null) {
            Iterator it2 = ((State) jlmebxxoox()).getProductsBought().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseProduct) next2).getId(), str));
            purchaseProduct = (PurchaseProduct) next2;
            if (purchaseProduct == null) {
                return;
            }
        }
        ulzqkzuiru(new lj1.gxszxtbevo.wkgbmnqykc(true));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(purchaseProduct, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    private final void eslsurpljm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new yggfygwlhe(new jyumaefscl(this.f62742nufgyqmvbu.eablkybsjg().eablkybsjg()), this), new iwizpuwonk(null)), new cqumvgiudr(null)), sopmlzcsov());
    }

    private final void ezmngbhpjk() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f62735btonecajqb.dxjokdxxww(), new vdvldrhtss(null)), new oxmwwwfdhm(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(String str, boolean z13) {
        ulzqkzuiru(new lj1.gxszxtbevo.zoijcleaow(str, z13));
    }

    private final void fmlbqenlif() {
        auzgnhcxok auzgnhcxokVar = this.f62744wflxmlrfwp;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f62744wflxmlrfwp = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(null), 3, null);
    }

    private final void fyldjkxazc(String str, gk1.iobyxmoadg iobyxmoadgVar) {
        List listIwxlajgraz;
        State state = (State) jlmebxxoox();
        int i13 = zoijcleaow.f62821iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            listIwxlajgraz = iwxlajgraz(state.getProductsBought(), str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listIwxlajgraz = iwxlajgraz(state.getProductsBuy(), str);
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIwxlajgraz, 10));
        Iterator it = listIwxlajgraz.iterator();
        while (it.hasNext()) {
            arrayList.add(((PurchaseProduct) it.next()).getArticle());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        lrnfpwlwnk(state.getArgs().getListId(), arrayList, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj(Warning.DailyLimit dailyLimit) {
        crxdokpmqz(dailyLimit != null ? new lj1.eablkybsjg.gtknphoqwx(dailyLimit.getMessage()) : lj1.eablkybsjg.wflxmlrfwp.f62715iobyxmoadg);
    }

    private final void hszhottldk(String str, gk1.iobyxmoadg iobyxmoadgVar) {
        List<PurchaseProduct> listIwxlajgraz;
        State state = (State) jlmebxxoox();
        int i13 = zoijcleaow.f62821iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            listIwxlajgraz = iwxlajgraz(state.getProductsBuy(), str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listIwxlajgraz = iwxlajgraz(state.getProductsBought(), str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(listIwxlajgraz, 10)), 16));
        for (PurchaseProduct purchaseProduct : listIwxlajgraz) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(purchaseProduct.getArticle(), purchaseProduct.getMeasureTypeModel().getCurrentMeasure().getValue());
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        tbqsvytpvh(state.getArgs().getListId(), linkedHashMap);
    }

    private final ChangeProductParams igdgnonuha(PurchaseProduct purchaseProduct, ez0.zoijcleaow zoijcleaowVar) {
        return new ChangeProductParams(purchaseProduct.getId(), purchaseProduct.getArticle(), zoijcleaowVar, purchaseProduct.getIsAvailable(), false, purchaseProduct.getMeasureTypeModel(), purchaseProduct.getAvgWeight(), hg.jyumaefscl.wflxmlrfwp(), null);
    }

    private final void ipoelvxyzq(String str, String str2) {
        a(this, new AnalyticsPage.ItemDetail(str, str2), new AnalyticElement.ProductItemElement(str, str2), null, 4, null);
        crxdokpmqz(new lj1.eablkybsjg.ppxfxbqfkf(str, ((State) jlmebxxoox()).getArgs().getListId(), ((State) jlmebxxoox()).getListName()));
    }

    private final List iwxlajgraz(List list, String str) {
        Object next;
        List listEablkybsjg;
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            return list;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseProduct) next).getId(), str));
        PurchaseProduct purchaseProduct = (PurchaseProduct) next;
        return (purchaseProduct == null || (listEablkybsjg = hg.jyumaefscl.eablkybsjg(purchaseProduct)) == null) ? hg.jyumaefscl.wflxmlrfwp() : listEablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixidwrxhsl(PurchaseListDetails purchaseListDetails) {
        boolean z13 = purchaseListDetails.getProductsBought().isEmpty() && purchaseListDetails.getProductsBuy().isEmpty();
        oh1.ppxfxbqfkf ppxfxbqfkfVar = this.f62739gtknphoqwx;
        List productsBuy = purchaseListDetails.getProductsBuy();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(productsBuy, 10));
        Iterator it = productsBuy.iterator();
        while (it.hasNext()) {
            arrayList.add(skhdrjzrfn((PurchaseProduct) it.next()));
        }
        ppxfxbqfkfVar.zoijcleaow(arrayList);
        ulzqkzuiru(new lj1.gxszxtbevo.eablkybsjg(purchaseListDetails.getName(), purchaseListDetails.getSum(), purchaseListDetails.getCount(), purchaseListDetails.getUrl(), z13, purchaseListDetails.getProductsBuy(), purchaseListDetails.getProductsBought(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iyctptxqzt(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f62773iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f62773iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f62775yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f62773iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PurchaseProduct purchaseProductAuzgnhcxok = auzgnhcxok(str);
            if (purchaseProductAuzgnhcxok == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ez0.zoijcleaow zoijcleaowVar = z13 ? ez0.zoijcleaow.INCREASE : ez0.zoijcleaow.DECREASE;
            oh1.ppxfxbqfkf ppxfxbqfkfVar = this.f62739gtknphoqwx;
            ChangeProductParams changeProductParamsIgdgnonuha = igdgnonuha(purchaseProductAuzgnhcxok, zoijcleaowVar);
            gxszxtbevoVar2.f62776zdlpuopuiu = this;
            gxszxtbevoVar2.f62773iwizpuwonk = 1;
            if (ppxfxbqfkfVar.ppxfxbqfkf(changeProductParamsIgdgnonuha, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f62776zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.fmlbqenlif();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Throwable th2) {
        mhtqkkgtqm(th2);
        if (((State) jlmebxxoox()).getProductsBought().isEmpty() && ((State) jlmebxxoox()).getProductsBuy().isEmpty()) {
            ulzqkzuiru(new lj1.gxszxtbevo.C1273gxszxtbevo(true));
        }
    }

    private final void krqnebusok(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f62737dxjokdxxww.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.ShoppingList(((State) jlmebxxoox()).getArgs().getListId(), ((State) jlmebxxoox()).getListName()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    private final void lrnfpwlwnk(String str, List list, gk1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(str, list, iobyxmoadgVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gk1.ppxfxbqfkf lxfrhoxuzk(ProductData productData) {
        String article = productData.getArticle();
        if (article == null) {
            article = "";
        }
        return new gk1.ppxfxbqfkf(article, productData.getQuantity(), productData.getMeasureType().getValue());
    }

    private final void nuxfzjnpeb(AddProductParams addProductParams, String str) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(str, addProductParams, null), 3, null);
    }

    public static final /* synthetic */ State oipsdeybqn(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object opjhrmiecq(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f62766iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f62766iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f62768yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f62766iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PurchaseProduct purchaseProductAuzgnhcxok = auzgnhcxok(str);
            if (purchaseProductAuzgnhcxok == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            oh1.ppxfxbqfkf ppxfxbqfkfVar = this.f62739gtknphoqwx;
            ChangeProductParams changeProductParamsIgdgnonuha = igdgnonuha(purchaseProductAuzgnhcxok, ez0.zoijcleaow.CHANGE_MEASURE);
            eablkybsjgVar.f62769zdlpuopuiu = this;
            eablkybsjgVar.f62766iwizpuwonk = 1;
            if (ppxfxbqfkfVar.ppxfxbqfkf(changeProductParamsIgdgnonuha, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f62769zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.fmlbqenlif();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rhgxfdycjh() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f62739gtknphoqwx.iobyxmoadg(), new kcexrzcfyt(null)), sopmlzcsov());
    }

    private final ez0.iobyxmoadg skhdrjzrfn(PurchaseProduct purchaseProduct) {
        return new ez0.iobyxmoadg(purchaseProduct.getId(), purchaseProduct.getArticle(), purchaseProduct.getQuantity(), purchaseProduct.getMeasureTypeModel().getCurrentMeasure(), hg.jyumaefscl.wflxmlrfwp(), null);
    }

    private final void tbqsvytpvh(String str, Map map) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(str, map, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(String str, double d13) {
        PurchaseProduct purchaseProductAuzgnhcxok = auzgnhcxok(str);
        if (purchaseProductAuzgnhcxok == null) {
            return;
        }
        this.f62739gtknphoqwx.wkgbmnqykc(purchaseProductAuzgnhcxok.getId(), d13);
        fmlbqenlif();
    }

    private final void wizcaqwiak(String str) {
        Object next;
        MeasureType measureType;
        PurchaseProduct purchaseProductAuzgnhcxok = auzgnhcxok(str);
        if (purchaseProductAuzgnhcxok == null) {
            return;
        }
        Iterator it = ((State) jlmebxxoox()).getProductDataList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductData) next).getArticle(), purchaseProductAuzgnhcxok.getArticle()));
        ProductData productData = (ProductData) next;
        esjtqupxsv(new AddProductParams(purchaseProductAuzgnhcxok.getId(), this.f62736draadjrbmk.eablkybsjg(purchaseProductAuzgnhcxok.getIsAvailable(), purchaseProductAuzgnhcxok.getIsProductWithZeroPrice()), false, productData != null ? productData.getQuantity() : purchaseProductAuzgnhcxok.getQuantity(), (productData == null || (measureType = productData.getMeasureType()) == null) ? purchaseProductAuzgnhcxok.getMeasureTypeModel().getCurrentMeasure() : measureType));
    }

    private final void yzdjzghtvl() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f62745wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new zdlpuopuiu(null)), sopmlzcsov());
    }

    private final void zeieaojujs() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(null), 3, null);
    }

    @Override // zb1.iobyxmoadg
    public void draadjrbmk(Runnable runnable) {
        this.f62734agtfadlqog = runnable;
    }

    @Override // zb1.iobyxmoadg
    public void mbcevpiqjq(AddProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(params, null), 3, null);
    }

    public final void mhtqkkgtqm(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new lj1.eablkybsjg.lqeggnwhkg(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(lj1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, lj1.ppxfxbqfkf.iobyxmoadg.f62825iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        eslsurpljm();
        yzdjzghtvl();
        zeieaojujs();
        ezmngbhpjk();
        rhgxfdycjh();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(lj1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.zoijcleaow.f62850iobyxmoadg)) {
            crxdokpmqz(lj1.eablkybsjg.iobyxmoadg.f62709iobyxmoadg);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.zdlpuopuiu) {
            lj1.wkgbmnqykc.zdlpuopuiu zdlpuopuiuVar = (lj1.wkgbmnqykc.zdlpuopuiu) intent;
            ipoelvxyzq(zdlpuopuiuVar.iobyxmoadg(), zdlpuopuiuVar.zoijcleaow());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.iobyxmoadg) {
            wizcaqwiak(((lj1.wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.btonecajqb) {
            lj1.wkgbmnqykc.btonecajqb btonecajqbVar = (lj1.wkgbmnqykc.btonecajqb) intent;
            nuxfzjnpeb(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.draadjrbmk) {
            hszhottldk(null, ((lj1.wkgbmnqykc.draadjrbmk) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.wflxmlrfwp) {
            lj1.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = (lj1.wkgbmnqykc.wflxmlrfwp) intent;
            hszhottldk(wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.oxmwwwfdhm) {
            fyldjkxazc(null, ((lj1.wkgbmnqykc.oxmwwwfdhm) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.kcexrzcfyt) {
            lj1.wkgbmnqykc.kcexrzcfyt kcexrzcfytVar = (lj1.wkgbmnqykc.kcexrzcfyt) intent;
            fyldjkxazc(kcexrzcfytVar.iobyxmoadg(), kcexrzcfytVar.zoijcleaow());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.C1279wkgbmnqykc.f62847iobyxmoadg)) {
            crxdokpmqz(new lj1.eablkybsjg.dxjokdxxww(gk1.iobyxmoadg.TO_BUY));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.ppxfxbqfkf.f62841iobyxmoadg)) {
            crxdokpmqz(new lj1.eablkybsjg.dxjokdxxww(gk1.iobyxmoadg.BOUGHT));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.lqeggnwhkg.f62835iobyxmoadg)) {
            crxdokpmqz(new lj1.eablkybsjg.nufgyqmvbu(((State) jlmebxxoox()).getUrl()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.gxszxtbevo.f62831iobyxmoadg)) {
            a(this, AnalyticsPage.Search.f92373iwizpuwonk, null, null, 6, null);
            crxdokpmqz(lj1.eablkybsjg.C1272eablkybsjg.f62704iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lj1.wkgbmnqykc.eablkybsjg.f62829iobyxmoadg)) {
            a(this, AnalyticsPage.Catalog.f92304iwizpuwonk, null, null, 6, null);
            crxdokpmqz(lj1.eablkybsjg.wkgbmnqykc.f62716iobyxmoadg);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.gtknphoqwx) {
            bfopjjpdmp(((lj1.wkgbmnqykc.gtknphoqwx) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.nufgyqmvbu) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(intent, null), 3, null);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.agtfadlqog) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(intent, null), 3, null);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.vdvldrhtss) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(intent, null), 3, null);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.dxjokdxxww) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(intent, null), 3, null);
            return;
        }
        if (intent instanceof lj1.wkgbmnqykc.ojitshcjhn) {
            lj1.wkgbmnqykc.ojitshcjhn ojitshcjhnVar = (lj1.wkgbmnqykc.ojitshcjhn) intent;
            crxdokpmqz(new lj1.eablkybsjg.btonecajqb(ojitshcjhnVar.iobyxmoadg(), ojitshcjhnVar.zoijcleaow()));
        } else {
            if (!(intent instanceof lj1.wkgbmnqykc.rgvfuqvkyq)) {
                throw new NoWhenBranchMatchedException();
            }
            lj1.wkgbmnqykc.rgvfuqvkyq rgvfuqvkyqVar = (lj1.wkgbmnqykc.rgvfuqvkyq) intent;
            ageimvtcrz(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg());
        }
    }

    @Override // zb1.iobyxmoadg
    public esjtqupxsv wkgbmnqykc() {
        return this.f62743ppxfxbqfkf;
    }

    @Override // zb1.iobyxmoadg
    public void zoijcleaow() {
        crxdokpmqz(lj1.eablkybsjg.zoijcleaow.f62717iobyxmoadg);
    }
}
