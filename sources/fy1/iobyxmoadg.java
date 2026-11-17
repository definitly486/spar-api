package fy1;

import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.legacy.presentation.model.AddProductParams;
import ru.myspar.purchases.impl.list_details.domain.store.State;
import ru.myspar.purchases_list.api.models.PurchaseListDetails;
import ru.myspar.purchases_list.api.models.PurchaseProduct;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements de0.ppxfxbqfkf {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final C0796iobyxmoadg f35374rgvfuqvkyq = new C0796iobyxmoadg(null);

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final int f35375vdvldrhtss = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private auzgnhcxok f35376agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final j00.zoijcleaow f35377btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final yj0.ppxfxbqfkf f35378draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final lo.zoijcleaow f35379dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final f20.ppxfxbqfkf f35380eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final sm.iobyxmoadg f35381gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final k00.iobyxmoadg f35382gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final oa0.rgvfuqvkyq f35383lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yy1.iobyxmoadg f35384nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private Runnable f35385ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final z10.nufgyqmvbu f35386ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final j00.gxszxtbevo f35387wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f35388wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ fy1.wkgbmnqykc f35389jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35391zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(fy1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35389jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new agtfadlqog(this.f35389jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35391zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((fy1.wkgbmnqykc.btonecajqb) this.f35389jyumaefscl).iobyxmoadg();
                this.f35391zdlpuopuiu = 1;
                if (iobyxmoadgVar.lrnfpwlwnk(strIobyxmoadg, this) == objGxszxtbevo) {
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
        final /* synthetic */ String f35393esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f35394iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f35395jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ Map f35396lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f35397yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35398zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, Map map, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35393esjtqupxsv = str;
            this.f35396lereixgezr = map;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(this.f35393esjtqupxsv, this.f35396lereixgezr, gxszxtbevoVar);
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
            int i13 = this.f35394iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (iobyxmoadg) this.f35397yggfygwlhe;
                        obj2 = this.f35398zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                String str = this.f35393esjtqupxsv;
                Map map = this.f35396lereixgezr;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f35384nufgyqmvbu;
                this.f35394iwizpuwonk = 1;
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
                iobyxmoadgVar.rhgxfdycjh((PurchaseListDetails) obj2);
                zy1.iobyxmoadg iobyxmoadgVarEablkybsjg = iobyxmoadgVar.f35384nufgyqmvbu.eablkybsjg();
                this.f35398zdlpuopuiu = obj2;
                this.f35397yggfygwlhe = iobyxmoadgVar;
                this.f35395jyumaefscl = obj2;
                this.f35394iwizpuwonk = 2;
                if (iobyxmoadgVarEablkybsjg.ppxfxbqfkf(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35400zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new cqumvgiudr(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35400zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.lxfrhoxuzk();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.C3366iobyxmoadg c3366iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(c3366iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ fy1.wkgbmnqykc f35401jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35403zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(fy1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35401jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(this.f35401jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35403zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((fy1.wkgbmnqykc.ojitshcjhn) this.f35401jyumaefscl).iobyxmoadg();
                this.f35403zdlpuopuiu = 1;
                if (iobyxmoadgVar.zeieaojujs(strIobyxmoadg, false, this) == objGxszxtbevo) {
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
        final /* synthetic */ AddProductParams f35404iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f35405jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35407zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(String str, AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35405jyumaefscl = str;
            this.f35404iwizpuwonk = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(this.f35405jyumaefscl, this.f35404iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35407zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f35405jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    f20.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f35380eablkybsjg;
                    f20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new f20.ppxfxbqfkf.iobyxmoadg(str);
                    this.f35407zdlpuopuiu = 1;
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
            AddProductParams addProductParams = this.f35404iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.zdlpuopuiu(addProductParams);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f35408iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35410yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35411zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35410yggfygwlhe = obj;
            this.f35408iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lrnfpwlwnk(null, this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35413yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35414zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35414zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ezmngbhpjk((Throwable) this.f35413yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            esjtqupxsv esjtqupxsvVar = iobyxmoadg.this.new esjtqupxsv(gxszxtbevoVar);
            esjtqupxsvVar.f35413yggfygwlhe = th2;
            return esjtqupxsvVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ fy1.wkgbmnqykc f35415jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35417zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(fy1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35415jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gtknphoqwx(this.f35415jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35417zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.nuxfzjnpeb(((fy1.wkgbmnqykc.dxjokdxxww) this.f35415jyumaefscl).iobyxmoadg(), ((fy1.wkgbmnqykc.dxjokdxxww) this.f35415jyumaefscl).zoijcleaow());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f35418iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35420yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35421zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35420yggfygwlhe = obj;
            this.f35418iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zeieaojujs(null, false, this);
        }
    }

    /* JADX INFO: renamed from: fy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0796iobyxmoadg {
        public /* synthetic */ C0796iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0796iobyxmoadg() {
        }
    }

    public static final class iwizpuwonk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f35422zdlpuopuiu;

        /* JADX INFO: renamed from: fy1.iobyxmoadg$iwizpuwonk$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0797iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f35423zdlpuopuiu;

            /* JADX INFO: renamed from: fy1.iobyxmoadg$iwizpuwonk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0798iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f35425yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f35426zdlpuopuiu;

                public C0798iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f35426zdlpuopuiu = obj;
                    this.f35425yggfygwlhe |= Integer.MIN_VALUE;
                    return C0797iobyxmoadg.this.emit(null, this);
                }
            }

            public C0797iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f35423zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0798iobyxmoadg c0798iobyxmoadg;
                if (gxszxtbevoVar instanceof C0798iobyxmoadg) {
                    c0798iobyxmoadg = (C0798iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0798iobyxmoadg.f35425yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0798iobyxmoadg.f35425yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0798iobyxmoadg = new C0798iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0798iobyxmoadg = new C0798iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0798iobyxmoadg.f35426zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0798iobyxmoadg.f35425yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f35423zdlpuopuiu;
                    if (obj instanceof zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.C3366iobyxmoadg) {
                        c0798iobyxmoadg.f35425yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0798iobyxmoadg) == objGxszxtbevo) {
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

        public iwizpuwonk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f35422zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f35422zdlpuopuiu.collect(new C0797iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f35427yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f35428zdlpuopuiu;

        /* JADX INFO: renamed from: fy1.iobyxmoadg$jyumaefscl$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0799iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f35429yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f35430zdlpuopuiu;

            /* JADX INFO: renamed from: fy1.iobyxmoadg$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0800iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f35432yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f35433zdlpuopuiu;

                public C0800iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f35433zdlpuopuiu = obj;
                    this.f35432yggfygwlhe |= Integer.MIN_VALUE;
                    return C0799iobyxmoadg.this.emit(null, this);
                }
            }

            public C0799iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f35430zdlpuopuiu = nufgyqmvbuVar;
                this.f35429yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0800iobyxmoadg c0800iobyxmoadg;
                if (gxszxtbevoVar instanceof C0800iobyxmoadg) {
                    c0800iobyxmoadg = (C0800iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0800iobyxmoadg.f35432yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0800iobyxmoadg.f35432yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0800iobyxmoadg = new C0800iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0800iobyxmoadg = new C0800iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0800iobyxmoadg.f35433zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0800iobyxmoadg.f35432yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f35430zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.C3366iobyxmoadg) obj).iobyxmoadg(), iobyxmoadg.iyctptxqzt(this.f35429yggfygwlhe).getArgs().getListId())) {
                        c0800iobyxmoadg.f35432yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0800iobyxmoadg) == objGxszxtbevo) {
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

        public jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f35428zdlpuopuiu = lqeggnwhkgVar;
            this.f35427yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f35428zdlpuopuiu.collect(new C0799iobyxmoadg(nufgyqmvbuVar, this.f35427yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35434yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35435zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35435zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f35434yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f35434yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ az1.iobyxmoadg f35436cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f35437iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f35438jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35440zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, List list, az1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35438jyumaefscl = str;
            this.f35437iwizpuwonk = list;
            this.f35436cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f35438jyumaefscl, this.f35437iwizpuwonk, this.f35436cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35440zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f35438jyumaefscl;
                    List list = this.f35437iwizpuwonk;
                    az1.iobyxmoadg iobyxmoadgVar2 = this.f35436cqumvgiudr;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    yy1.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar.f35384nufgyqmvbu;
                    this.f35440zdlpuopuiu = 1;
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
                iobyxmoadgVar6.rhgxfdycjh((PurchaseListDetails) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar6.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35442zdlpuopuiu;

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
            int i13 = this.f35442zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    oa0.rgvfuqvkyq rgvfuqvkyqVar = iobyxmoadgVar.f35383lqeggnwhkg;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f35442zdlpuopuiu = 1;
                    obj = rgvfuqvkyqVar.zoijcleaow(wwaezpbzknVar, this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            Boolean bool = (Boolean) objWkgbmnqykc;
            if (bool != null) {
                iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.ppxfxbqfkf(bool.booleanValue()));
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
        int f35444zdlpuopuiu;

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
            int i13 = this.f35444zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    yy1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f35384nufgyqmvbu;
                    String listId = iobyxmoadg.iyctptxqzt(iobyxmoadgVar).getArgs().getListId();
                    this.f35444zdlpuopuiu = 1;
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
                iobyxmoadgVar5.rhgxfdycjh((PurchaseListDetails) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.yzdjzghtvl(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35446yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35447zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = iobyxmoadg.this.new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f35446yggfygwlhe = obj;
            return oxmwwwfdhmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35447zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f35446yggfygwlhe;
            iobyxmoadg.this.ipoelvxyzq(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddProductParams f35448jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35450zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(AddProductParams addProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35448jyumaefscl = addProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f35448jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35450zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    AddProductParams addProductParams = this.f35448jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    k00.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f35382gxszxtbevo;
                    String productId = addProductParams.getProductId();
                    double quantity = addProductParams.getQuantity();
                    MeasureType measureType = addProductParams.getMeasureType();
                    this.f35450zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.oxmwwwfdhm((16 & 1) != 0 ? null : productId, (16 & 2) != 0 ? null : null, quantity, measureType, (16 & 16) != 0 ? false : false, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(((t00.ppxfxbqfkf) obj).ppxfxbqfkf());
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            AddProductParams addProductParams2 = this.f35448jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.jrbgnlbqoe((Warning.DailyLimit) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.fmlbqenlif(addProductParams2, thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35452zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new rgvfuqvkyq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35452zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f35381gtknphoqwx;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f35452zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(new fy1.eablkybsjg.lqeggnwhkg(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35454zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new vdvldrhtss(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0099  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35454zdlpuopuiu;
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
                        iobyxmoadgVar.rhgxfdycjh((PurchaseListDetails) objWkgbmnqykc);
                    }
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f35454zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(700L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar2.f35384nufgyqmvbu;
                String listId = iobyxmoadg.iyctptxqzt(iobyxmoadgVar2).getArgs().getListId();
                List productDataList = iobyxmoadg.iyctptxqzt(iobyxmoadgVar2).getProductDataList();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(productDataList, 10));
                Iterator it = productDataList.iterator();
                while (it.hasNext()) {
                    arrayList.add(iobyxmoadgVar2.fiwbwshyhd((ProductData) it.next()));
                }
                this.f35454zdlpuopuiu = 2;
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
                iobyxmoadgVar.rhgxfdycjh((PurchaseListDetails) objWkgbmnqykc);
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ fy1.wkgbmnqykc f35455jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35457zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(fy1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35455jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(this.f35455jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35457zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((fy1.wkgbmnqykc.oxmwwwfdhm) this.f35455jyumaefscl).iobyxmoadg();
                this.f35457zdlpuopuiu = 1;
                if (iobyxmoadgVar.zeieaojujs(strIobyxmoadg, true, this) == objGxszxtbevo) {
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
        final /* synthetic */ PurchaseProduct f35458jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35460zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(PurchaseProduct purchaseProduct, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35458jyumaefscl = purchaseProduct;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f35458jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35460zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = new no.zoijcleaow.C1522zoijcleaow(new AnalyticsPage.ShoppingList(iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getArgs().getListId(), iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getListName()), null, new AnalyticElement.ProductItemElement(this.f35458jyumaefscl.getArticle(), this.f35458jyumaefscl.getName()));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    PurchaseProduct purchaseProduct = this.f35458jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    j00.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f35377btonecajqb;
                    String id2 = purchaseProduct.getId();
                    boolean isFavorite = purchaseProduct.getIsFavorite();
                    this.f35460zdlpuopuiu = 1;
                    if (zoijcleaowVar.nufgyqmvbu(id2, isFavorite, c1522zoijcleaow, this) == objGxszxtbevo) {
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35462zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new yggfygwlhe(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35462zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.lxfrhoxuzk();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35464yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35465zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zdlpuopuiu zdlpuopuiuVar = iobyxmoadg.this.new zdlpuopuiu(gxszxtbevoVar);
            zdlpuopuiuVar.f35464yggfygwlhe = obj;
            return zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f35465zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new fy1.gxszxtbevo.iobyxmoadg((List) this.f35464yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f35466iobyxmoadg;

        static {
            int[] iArr = new int[az1.iobyxmoadg.values().length];
            try {
                iArr[az1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[az1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35466iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, c20.eablkybsjg loggedInUseCase, f20.ppxfxbqfkf clearCartUseCase, k00.iobyxmoadg cartInteractor, oa0.rgvfuqvkyq isShareFeatureEnabledUseCase, yy1.iobyxmoadg purchasesListComponentApi, lo.zoijcleaow analyticsTracker, j00.zoijcleaow changeFavoritesInteractor, sm.iobyxmoadg getUserAddressFlowInfo, yj0.ppxfxbqfkf interactor, j00.gxszxtbevo utilsInteractor) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggedInUseCase, "loggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isShareFeatureEnabledUseCase, "isShareFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interactor, "interactor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(utilsInteractor, "utilsInteractor");
        this.f35386ppxfxbqfkf = subscribeToCurrentDeliveryDataUseCase;
        this.f35388wkgbmnqykc = loggedInUseCase;
        this.f35380eablkybsjg = clearCartUseCase;
        this.f35382gxszxtbevo = cartInteractor;
        this.f35383lqeggnwhkg = isShareFeatureEnabledUseCase;
        this.f35384nufgyqmvbu = purchasesListComponentApi;
        this.f35379dxjokdxxww = analyticsTracker;
        this.f35377btonecajqb = changeFavoritesInteractor;
        this.f35381gtknphoqwx = getUserAddressFlowInfo;
        this.f35378draadjrbmk = interactor;
        this.f35387wflxmlrfwp = utilsInteractor;
    }

    private final void a() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f35378draadjrbmk.iobyxmoadg(), new zdlpuopuiu(null)), sopmlzcsov());
    }

    private final void ageimvtcrz(String str) {
        Object next;
        MeasureType measureType;
        PurchaseProduct purchaseProductSkhdrjzrfn = skhdrjzrfn(str);
        if (purchaseProductSkhdrjzrfn == null) {
            return;
        }
        Iterator it = ((State) jlmebxxoox()).getProductDataList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductData) next).getArticle(), purchaseProductSkhdrjzrfn.getArticle()));
        ProductData productData = (ProductData) next;
        cllcsxoeiz(new AddProductParams(purchaseProductSkhdrjzrfn.getId(), this.f35387wflxmlrfwp.eablkybsjg(purchaseProductSkhdrjzrfn.getIsAvailable(), purchaseProductSkhdrjzrfn.getOnlyInShop(), purchaseProductSkhdrjzrfn.getIsProductWithZeroPrice()), false, false, productData != null ? productData.getQuantity() : purchaseProductSkhdrjzrfn.getQuantity(), (productData == null || (measureType = productData.getMeasureType()) == null) ? purchaseProductSkhdrjzrfn.getMeasureTypeModel().getCurrentMeasure() : measureType));
    }

    private final void auzgnhcxok(String str, Map map) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(str, map, null), 3, null);
    }

    private final void b() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f35386ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new yggfygwlhe(null)), sopmlzcsov());
    }

    private final void c() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new jyumaefscl(new iwizpuwonk(this.f35384nufgyqmvbu.eablkybsjg().eablkybsjg()), this), new cqumvgiudr(null)), new esjtqupxsv(null)), sopmlzcsov());
    }

    private final void d(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f35379dxjokdxxww.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.ShoppingList(((State) jlmebxxoox()).getArgs().getListId(), ((State) jlmebxxoox()).getListName()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void e(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.d(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void eslsurpljm() {
        auzgnhcxok auzgnhcxokVar = this.f35376agtfadlqog;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f35376agtfadlqog = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final az1.ppxfxbqfkf fiwbwshyhd(ProductData productData) {
        String article = productData.getArticle();
        if (article == null) {
            article = "";
        }
        return new az1.ppxfxbqfkf(article, productData.getQuantity(), productData.getMeasureType().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(AddProductParams addProductParams, Throwable th2) {
        if (th2 instanceof AvailableOnlyForPickupException) {
            crxdokpmqz(new fy1.eablkybsjg.btonecajqb(addProductParams, ((AvailableOnlyForPickupException) th2).getMessage()));
        } else {
            ezmngbhpjk(th2);
        }
    }

    private final void fyldjkxazc(String str, az1.iobyxmoadg iobyxmoadgVar) {
        List<PurchaseProduct> listIgdgnonuha;
        State state = (State) jlmebxxoox();
        int i13 = zoijcleaow.f35466iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            listIgdgnonuha = igdgnonuha(state.getProductsBuy(), str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listIgdgnonuha = igdgnonuha(state.getProductsBought(), str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(listIgdgnonuha, 10)), 16));
        for (PurchaseProduct purchaseProduct : listIgdgnonuha) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(purchaseProduct.getArticle(), purchaseProduct.getMeasureTypeModel().getCurrentMeasure().getValue());
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        auzgnhcxok(state.getArgs().getListId(), linkedHashMap);
    }

    private final void grlcpdaxtj(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new fy1.eablkybsjg.gxszxtbevo(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.PurchaseDetail(((State) jlmebxxoox()).getArgs().getListId()), null, 4, null)));
    }

    private final ChangeProductParams hszhottldk(PurchaseProduct purchaseProduct, m00.zoijcleaow zoijcleaowVar) {
        return new ChangeProductParams(purchaseProduct.getId(), purchaseProduct.getArticle(), zoijcleaowVar, purchaseProduct.getIsAvailable(), false, purchaseProduct.getAvailableOnlyForPickup(), purchaseProduct.getMeasureTypeModel(), purchaseProduct.getAvgWeight(), hg.jyumaefscl.wflxmlrfwp(), null);
    }

    private final List igdgnonuha(List list, String str) {
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
    public final void ipoelvxyzq(String str, boolean z13) {
        ulzqkzuiru(new fy1.gxszxtbevo.zoijcleaow(str, z13));
    }

    private final void ixidwrxhsl(String str, String str2) {
        e(this, new AnalyticsPage.ItemDetail(str, str2), new AnalyticElement.ProductItemElement(str, str2), null, 4, null);
        crxdokpmqz(new fy1.eablkybsjg.zoijcleaow(str, ((State) jlmebxxoox()).getArgs().getListId(), ((State) jlmebxxoox()).getListName()));
    }

    public static final /* synthetic */ State iyctptxqzt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Warning.DailyLimit dailyLimit) {
        crxdokpmqz(dailyLimit != null ? new fy1.eablkybsjg.wflxmlrfwp(dailyLimit.getMessage()) : fy1.eablkybsjg.ojitshcjhn.f35353iobyxmoadg);
    }

    private final void krqnebusok() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f35377btonecajqb.dxjokdxxww(), new oxmwwwfdhm(null)), new kcexrzcfyt(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lrnfpwlwnk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f35408iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f35408iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f35410yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f35408iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PurchaseProduct purchaseProductSkhdrjzrfn = skhdrjzrfn(str);
            if (purchaseProductSkhdrjzrfn == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            yj0.ppxfxbqfkf ppxfxbqfkfVar = this.f35378draadjrbmk;
            ChangeProductParams changeProductParamsHszhottldk = hszhottldk(purchaseProductSkhdrjzrfn, m00.zoijcleaow.CHANGE_MEASURE);
            eablkybsjgVar.f35411zdlpuopuiu = this;
            eablkybsjgVar.f35408iwizpuwonk = 1;
            if (ppxfxbqfkfVar.ppxfxbqfkf(changeProductParamsHszhottldk, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f35411zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.eslsurpljm();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    private final void mhtqkkgtqm(String str, az1.iobyxmoadg iobyxmoadgVar) {
        List listIgdgnonuha;
        State state = (State) jlmebxxoox();
        int i13 = zoijcleaow.f35466iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            listIgdgnonuha = igdgnonuha(state.getProductsBought(), str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listIgdgnonuha = igdgnonuha(state.getProductsBuy(), str);
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIgdgnonuha, 10));
        Iterator it = listIgdgnonuha.iterator();
        while (it.hasNext()) {
            arrayList.add(((PurchaseProduct) it.next()).getArticle());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        tbqsvytpvh(state.getArgs().getListId(), arrayList, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nuxfzjnpeb(String str, double d13) {
        PurchaseProduct purchaseProductSkhdrjzrfn = skhdrjzrfn(str);
        if (purchaseProductSkhdrjzrfn == null) {
            return;
        }
        this.f35378draadjrbmk.wkgbmnqykc(purchaseProductSkhdrjzrfn.getId(), d13);
        eslsurpljm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rhgxfdycjh(PurchaseListDetails purchaseListDetails) {
        boolean z13 = purchaseListDetails.getProductsBought().isEmpty() && purchaseListDetails.getProductsBuy().isEmpty();
        yj0.ppxfxbqfkf ppxfxbqfkfVar = this.f35378draadjrbmk;
        List productsBuy = purchaseListDetails.getProductsBuy();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(productsBuy, 10));
        Iterator it = productsBuy.iterator();
        while (it.hasNext()) {
            arrayList.add(wizcaqwiak((PurchaseProduct) it.next()));
        }
        ppxfxbqfkfVar.zoijcleaow(arrayList);
        ulzqkzuiru(new fy1.gxszxtbevo.eablkybsjg(purchaseListDetails.getName(), purchaseListDetails.getSum(), purchaseListDetails.getCount(), purchaseListDetails.getUrl(), z13, purchaseListDetails.getProductsBuy(), purchaseListDetails.getProductsBought(), null));
    }

    private final void roivzttewh() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(null), 3, null);
    }

    private final PurchaseProduct skhdrjzrfn(String str) {
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

    private final void tbqsvytpvh(String str, List list, az1.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(str, list, iobyxmoadgVar, null), 3, null);
    }

    private final void uawqvzlxes(AddProductParams addProductParams, String str) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(str, addProductParams, null), 3, null);
    }

    private final void weqkydbzbr(String str) {
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
        ulzqkzuiru(new fy1.gxszxtbevo.wkgbmnqykc(true));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(purchaseProduct, null), 3, null);
    }

    private final m00.iobyxmoadg wizcaqwiak(PurchaseProduct purchaseProduct) {
        return new m00.iobyxmoadg(purchaseProduct.getId(), purchaseProduct.getArticle(), purchaseProduct.getQuantity(), purchaseProduct.getMeasureTypeModel().getCurrentMeasure(), hg.jyumaefscl.wflxmlrfwp(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yzdjzghtvl(Throwable th2) {
        ezmngbhpjk(th2);
        if (((State) jlmebxxoox()).getProductsBought().isEmpty() && ((State) jlmebxxoox()).getProductsBuy().isEmpty()) {
            ulzqkzuiru(new fy1.gxszxtbevo.C0795gxszxtbevo(true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zeieaojujs(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f35418iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f35418iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f35420yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f35418iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            PurchaseProduct purchaseProductSkhdrjzrfn = skhdrjzrfn(str);
            if (purchaseProductSkhdrjzrfn == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            m00.zoijcleaow zoijcleaowVar = z13 ? m00.zoijcleaow.INCREASE : m00.zoijcleaow.DECREASE;
            yj0.ppxfxbqfkf ppxfxbqfkfVar = this.f35378draadjrbmk;
            ChangeProductParams changeProductParamsHszhottldk = hszhottldk(purchaseProductSkhdrjzrfn, zoijcleaowVar);
            gxszxtbevoVar2.f35421zdlpuopuiu = this;
            gxszxtbevoVar2.f35418iwizpuwonk = 1;
            if (ppxfxbqfkfVar.ppxfxbqfkf(changeProductParamsHszhottldk, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f35421zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.eslsurpljm();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // de0.ppxfxbqfkf
    public Runnable cdpycssgdh() {
        return this.f35385ojitshcjhn;
    }

    @Override // de0.ppxfxbqfkf
    public void draadjrbmk(Runnable runnable) {
        this.f35385ojitshcjhn = runnable;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: dvvnrvtcbc, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(fy1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.ppxfxbqfkf.f35484iobyxmoadg)) {
            crxdokpmqz(fy1.eablkybsjg.iobyxmoadg.f35350iobyxmoadg);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.yggfygwlhe) {
            fy1.wkgbmnqykc.yggfygwlhe yggfygwlheVar = (fy1.wkgbmnqykc.yggfygwlhe) intent;
            ixidwrxhsl(yggfygwlheVar.iobyxmoadg(), yggfygwlheVar.zoijcleaow());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.iobyxmoadg) {
            ageimvtcrz(((fy1.wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.gtknphoqwx) {
            fy1.wkgbmnqykc.gtknphoqwx gtknphoqwxVar = (fy1.wkgbmnqykc.gtknphoqwx) intent;
            uawqvzlxes(gtknphoqwxVar.iobyxmoadg(), gtknphoqwxVar.zoijcleaow());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.wflxmlrfwp) {
            fyldjkxazc(null, ((fy1.wkgbmnqykc.wflxmlrfwp) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.agtfadlqog) {
            fy1.wkgbmnqykc.agtfadlqog agtfadlqogVar = (fy1.wkgbmnqykc.agtfadlqog) intent;
            fyldjkxazc(agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.kcexrzcfyt) {
            mhtqkkgtqm(null, ((fy1.wkgbmnqykc.kcexrzcfyt) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.zdlpuopuiu) {
            fy1.wkgbmnqykc.zdlpuopuiu zdlpuopuiuVar = (fy1.wkgbmnqykc.zdlpuopuiu) intent;
            mhtqkkgtqm(zdlpuopuiuVar.iobyxmoadg(), zdlpuopuiuVar.zoijcleaow());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.eablkybsjg.f35476iobyxmoadg)) {
            crxdokpmqz(new fy1.eablkybsjg.gtknphoqwx(az1.iobyxmoadg.TO_BUY));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.C0801wkgbmnqykc.f35490iobyxmoadg)) {
            crxdokpmqz(new fy1.eablkybsjg.gtknphoqwx(az1.iobyxmoadg.BOUGHT));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.nufgyqmvbu.f35481iobyxmoadg)) {
            crxdokpmqz(new fy1.eablkybsjg.dxjokdxxww(((State) jlmebxxoox()).getUrl()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.lqeggnwhkg.f35480iobyxmoadg)) {
            e(this, AnalyticsPage.Search.f84345iwizpuwonk, null, null, 6, null);
            crxdokpmqz(fy1.eablkybsjg.C0794eablkybsjg.f35345iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, fy1.wkgbmnqykc.gxszxtbevo.f35477iobyxmoadg)) {
            e(this, AnalyticsPage.Catalog.f84276iwizpuwonk, null, null, 6, null);
            crxdokpmqz(fy1.eablkybsjg.ppxfxbqfkf.f35354iobyxmoadg);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.draadjrbmk) {
            weqkydbzbr(((fy1.wkgbmnqykc.draadjrbmk) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.dxjokdxxww) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(intent, null), 3, null);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.ojitshcjhn) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(intent, null), 3, null);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.oxmwwwfdhm) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(intent, null), 3, null);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.btonecajqb) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(intent, null), 3, null);
            return;
        }
        if (intent instanceof fy1.wkgbmnqykc.rgvfuqvkyq) {
            fy1.wkgbmnqykc.rgvfuqvkyq rgvfuqvkyqVar = (fy1.wkgbmnqykc.rgvfuqvkyq) intent;
            crxdokpmqz(new fy1.eablkybsjg.draadjrbmk(rgvfuqvkyqVar.iobyxmoadg(), rgvfuqvkyqVar.zoijcleaow()));
        } else if (intent instanceof fy1.wkgbmnqykc.zoijcleaow) {
            cqumvgiudr(((fy1.wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof fy1.wkgbmnqykc.vdvldrhtss)) {
                throw new NoWhenBranchMatchedException();
            }
            fy1.wkgbmnqykc.vdvldrhtss vdvldrhtssVar = (fy1.wkgbmnqykc.vdvldrhtss) intent;
            grlcpdaxtj(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.iobyxmoadg());
        }
    }

    @Override // de0.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f35388wkgbmnqykc;
    }

    public final void ezmngbhpjk(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new fy1.eablkybsjg.nufgyqmvbu(error));
    }

    @Override // de0.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: iwxlajgraz, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(fy1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fy1.ppxfxbqfkf.iobyxmoadg.f35469iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        c();
        b();
        roivzttewh();
        krqnebusok();
        a();
    }

    @Override // de0.ppxfxbqfkf
    public void zdlpuopuiu(AddProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(params, null), 3, null);
    }

    @Override // de0.ppxfxbqfkf
    public void zoijcleaow() {
        crxdokpmqz(fy1.eablkybsjg.wkgbmnqykc.f35356iobyxmoadg);
    }
}
