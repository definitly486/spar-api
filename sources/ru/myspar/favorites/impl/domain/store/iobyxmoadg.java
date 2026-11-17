package ru.myspar.favorites.impl.domain.store;

import gg.iwizpuwonk;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.BaseProduct;
import ru.myspar.core.domain.models.LoadingBase;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.product.FavoriteFilterSection;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.Products;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.wypolnanlu;
import tg.oxmwwwfdhm;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private auzgnhcxok f88409agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lo.zoijcleaow f88410btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final sm.iobyxmoadg f88411draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final d60.iobyxmoadg f88412dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c20.eablkybsjg f88413eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final j00.zoijcleaow f88414gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c20.dxjokdxxww f88415gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l00.gtknphoqwx f88416lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final z10.nufgyqmvbu f88417nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private y00.iobyxmoadg f88418ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f88419ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private tg.iobyxmoadg f88420rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final gg.gtknphoqwx f88421vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final z10.iobyxmoadg f88422wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final h20.dxjokdxxww f88423wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88424yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88425zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88425zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f88424yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            agtfadlqogVar.f88424yggfygwlhe = th2;
            return agtfadlqogVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f88426jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88428zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88426jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(this.f88426jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88428zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarIgdgnonuha = iobyxmoadg.this.igdgnonuha();
                ChangeProductParams changeProductParams = this.f88426jyumaefscl;
                this.f88428zdlpuopuiu = 1;
                if (btonecajqbVarIgdgnonuha.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88430yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88431zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            draadjrbmk draadjrbmkVar = iobyxmoadg.this.new draadjrbmk(gxszxtbevoVar);
            draadjrbmkVar.f88430yggfygwlhe = obj;
            return draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88431zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            l00.eablkybsjg eablkybsjgVar = (l00.eablkybsjg) this.f88430yggfygwlhe;
            if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                iobyxmoadg.this.ixidwrxhsl(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.ezmngbhpjk(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88433zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88433zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(ru.myspar.favorites.impl.domain.store.eablkybsjg.btonecajqb.f88371iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88434yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f88435zdlpuopuiu;

        eablkybsjg(hkdspvbjdz hkdspvbjdzVar, iobyxmoadg iobyxmoadgVar) {
            this.f88435zdlpuopuiu = hkdspvbjdzVar;
            this.f88434yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
            boolean z13;
            if (((Boolean) iwizpuwonkVar.btonecajqb()).booleanValue()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) iwizpuwonkVar.nufgyqmvbu();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVar, this.f88435zdlpuopuiu.f60015zdlpuopuiu)) {
                z13 = false;
            } else {
                this.f88435zdlpuopuiu.f60015zdlpuopuiu = vdvldrhtssVar;
                z13 = true;
            }
            y00.iobyxmoadg iobyxmoadgVar = (y00.iobyxmoadg) iwizpuwonkVar.dxjokdxxww();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88434yggfygwlhe.kcexrzcfyt(), iobyxmoadgVar)) {
                this.f88434yggfygwlhe.eslsurpljm(iobyxmoadgVar);
                tg.iobyxmoadg iobyxmoadgVarDvvnrvtcbc = this.f88434yggfygwlhe.dvvnrvtcbc();
                if (iobyxmoadgVarDvvnrvtcbc != null) {
                    iobyxmoadgVarDvvnrvtcbc.invoke();
                }
                z13 = true;
            }
            if (z13) {
                this.f88434yggfygwlhe.roivzttewh(((Boolean) vdvldrhtssVar.lqeggnwhkg()).booleanValue(), true);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f88436iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f88437jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88439zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(ChangeProductParams changeProductParams, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88437jyumaefscl = changeProductParams;
            this.f88436iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gtknphoqwx(this.f88437jyumaefscl, this.f88436iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88439zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            ChangeProductParams changeProductParams = this.f88437jyumaefscl;
            String string = this.f88436iwizpuwonk;
            if (string == null) {
                string = iobyxmoadg.this.f88412dxjokdxxww.getString(pm.dxjokdxxww.available_only_for_pickup_product);
            }
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.nufgyqmvbu(changeProductParams, string));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88441zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88441zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f88411draadjrbmk;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f88441zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.C2027eablkybsjg(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2029iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88442jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.favorites.impl.domain.store.ppxfxbqfkf f88443yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88444zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2029iobyxmoadg(ru.myspar.favorites.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88443yggfygwlhe = ppxfxbqfkfVar;
            this.f88442jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2029iobyxmoadg(this.f88443yggfygwlhe, this.f88442jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88444zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88443yggfygwlhe, ru.myspar.favorites.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f88479iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f88442jyumaefscl;
                this.f88444zdlpuopuiu = 1;
                if (iobyxmoadgVar.lxfrhoxuzk(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2029iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88446zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88446zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(ru.myspar.favorites.impl.domain.store.eablkybsjg.zoijcleaow.f88387iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f88447cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f88449jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88450yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88451zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88449jyumaefscl = obj;
            this.f88447cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ageimvtcrz(null, this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88453yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88454zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
            ojitshcjhnVar.f88453yggfygwlhe = obj;
            return ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88454zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.btonecajqb((List) this.f88453yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f88456esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f88457iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f88458jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ boolean f88459lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88460yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88461zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(int i13, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88456esjtqupxsv = i13;
            this.f88459lereixgezr = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f88456esjtqupxsv, this.f88459lereixgezr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            int i13;
            boolean z13;
            Throwable thDxjokdxxww;
            State stateWeqkydbzbr;
            int i14;
            iobyxmoadg iobyxmoadgVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i15 = this.f88457iwizpuwonk;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        int i16 = this.f88458jyumaefscl;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f88460yggfygwlhe;
                        stateWeqkydbzbr = (State) this.f88461zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        i14 = i16;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Products) obj);
                    iobyxmoadgVar = iobyxmoadg.this;
                    i13 = this.f88456esjtqupxsv;
                    z13 = this.f88459lereixgezr;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.jrbgnlbqoe((Products) objWkgbmnqykc, i13, z13);
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.fmlbqenlif(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                stateWeqkydbzbr = iobyxmoadg.weqkydbzbr(iobyxmoadg.this);
                List productList = stateWeqkydbzbr.getProducts().getProductList();
                if (this.f88456esjtqupxsv == 1) {
                    productList = null;
                }
                if (productList != null) {
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.dxjokdxxww(jyumaefscl.jrbgnlbqoe(productList, LoadingBase.f86718zdlpuopuiu)));
                }
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                int i17 = this.f88456esjtqupxsv;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                z10.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f88422wflxmlrfwp;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f88461zdlpuopuiu = stateWeqkydbzbr;
                this.f88460yggfygwlhe = iobyxmoadgVar3;
                this.f88458jyumaefscl = i17;
                this.f88457iwizpuwonk = 1;
                Object objZoijcleaow = iobyxmoadgVar5.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i14 = i17;
                iobyxmoadgVar2 = iobyxmoadgVar3;
                obj = objZoijcleaow;
                y00.iobyxmoadg iobyxmoadgVar6 = (y00.iobyxmoadg) obj;
                h20.dxjokdxxww.iobyxmoadg iobyxmoadgVar7 = new h20.dxjokdxxww.iobyxmoadg(iobyxmoadgVar6.wkgbmnqykc(), iobyxmoadgVar6.ppxfxbqfkf(), !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(stateWeqkydbzbr.getSelectedFilterId(), "FAVORITE_ITEM_ALL_ID") ? stateWeqkydbzbr.getSelectedFilterId() : null, i14, null);
                h20.dxjokdxxww dxjokdxxwwVar = iobyxmoadgVar2.f88423wkgbmnqykc;
                this.f88461zdlpuopuiu = null;
                this.f88460yggfygwlhe = null;
                this.f88457iwizpuwonk = 2;
                obj = dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar7, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Products) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar = iobyxmoadg.this;
            i13 = this.f88456esjtqupxsv;
            z13 = this.f88459lereixgezr;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.jrbgnlbqoe((Products) objWkgbmnqykc, i13, z13);
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.fmlbqenlif(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f88462cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ boolean f88463esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f88464iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f88465jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88467zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(String str, boolean z13, String str2, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88465jyumaefscl = str;
            this.f88464iwizpuwonk = z13;
            this.f88462cqumvgiudr = str2;
            this.f88463esjtqupxsv = z14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new rgvfuqvkyq(this.f88465jyumaefscl, this.f88464iwizpuwonk, this.f88462cqumvgiudr, this.f88463esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88467zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.lqeggnwhkg(this.f88465jyumaefscl, this.f88464iwizpuwonk, this.f88462cqumvgiudr, this.f88463esjtqupxsv));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88469zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88469zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.uawqvzlxes(iobyxmoadg.this, false, false, 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ boolean f88470iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f88471jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88472yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88473zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn((gg.vdvldrhtss) obj, (y00.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88473zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return new iwizpuwonk((gg.vdvldrhtss) this.f88472yggfygwlhe, (y00.iobyxmoadg) this.f88471jyumaefscl, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f88470iwizpuwonk));
        }

        public final Object ojitshcjhn(gg.vdvldrhtss vdvldrhtssVar, y00.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f88472yggfygwlhe = vdvldrhtssVar;
            wkgbmnqykcVar.f88471jyumaefscl = iobyxmoadgVar;
            wkgbmnqykcVar.f88470iwizpuwonk = z13;
            return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88474jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.favorites.impl.domain.store.wkgbmnqykc f88475yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88476zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ru.myspar.favorites.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88475yggfygwlhe = wkgbmnqykcVar;
            this.f88474jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f88475yggfygwlhe, this.f88474jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88476zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.favorites.impl.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f88475yggfygwlhe;
                if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.zoijcleaow) {
                    this.f88474jyumaefscl.crxdokpmqz(ru.myspar.favorites.impl.domain.store.eablkybsjg.iobyxmoadg.f88379iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.ppxfxbqfkf) {
                    this.f88474jyumaefscl.crxdokpmqz(ru.myspar.favorites.impl.domain.store.eablkybsjg.wkgbmnqykc.f88386iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.C2030wkgbmnqykc) {
                    this.f88474jyumaefscl.fiwbwshyhd(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.C2030wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.eablkybsjg) {
                    iobyxmoadg iobyxmoadgVar = this.f88474jyumaefscl;
                    String strIobyxmoadg = ((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg();
                    this.f88476zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ageimvtcrz(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.nufgyqmvbu) {
                    this.f88474jyumaefscl.ipoelvxyzq();
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.btonecajqb) {
                    this.f88474jyumaefscl.mhtqkkgtqm(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.btonecajqb) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.draadjrbmk) {
                    iobyxmoadg.uawqvzlxes(this.f88474jyumaefscl, false, true, 1, null);
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
                    this.f88474jyumaefscl.ylkuphrtab(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww) {
                    this.f88474jyumaefscl.grlcpdaxtj(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar).zoijcleaow(), ((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww) this.f88475yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo) {
                    this.f88474jyumaefscl.krqnebusok(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gtknphoqwx) {
                    this.f88474jyumaefscl.a(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gtknphoqwx) wkgbmnqykcVar).iobyxmoadg());
                } else {
                    if (!(wkgbmnqykcVar instanceof ru.myspar.favorites.impl.domain.store.wkgbmnqykc.lqeggnwhkg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f88474jyumaefscl.fyldjkxazc(((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.lqeggnwhkg) wkgbmnqykcVar).zoijcleaow(), ((ru.myspar.favorites.impl.domain.store.wkgbmnqykc.lqeggnwhkg) this.f88475yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(h20.dxjokdxxww getFavoritesUseCase, c20.eablkybsjg loggedInUseCase, c20.dxjokdxxww subscribeToLoggedInUseCase, l00.gtknphoqwx productChangesSourceProvider, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, d60.iobyxmoadg resourcesManager, lo.zoijcleaow analyticsTracker, j00.zoijcleaow changeFavoritesInteractor, sm.iobyxmoadg getUserAddressFlowInfo, z10.iobyxmoadg getCurrentDeliveryDataUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFavoritesUseCase, "getFavoritesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggedInUseCase, "loggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f88419ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f88423wkgbmnqykc = getFavoritesUseCase;
        this.f88413eablkybsjg = loggedInUseCase;
        this.f88415gxszxtbevo = subscribeToLoggedInUseCase;
        this.f88416lqeggnwhkg = productChangesSourceProvider;
        this.f88417nufgyqmvbu = subscribeToCurrentDeliveryDataUseCase;
        this.f88412dxjokdxxww = resourcesManager;
        this.f88410btonecajqb = analyticsTracker;
        this.f88414gtknphoqwx = changeFavoritesInteractor;
        this.f88411draadjrbmk = getUserAddressFlowInfo;
        this.f88422wflxmlrfwp = getCurrentDeliveryDataUseCase;
        this.f88421vdvldrhtss = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ga0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.favorites.impl.domain.store.iobyxmoadg.rhgxfdycjh(this.f36719zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ageimvtcrz(String str, lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        Object next;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        String message;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f88447cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f88447cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object obj = nufgyqmvbuVar.f88449jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f88447cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            if (((State) jlmebxxoox()).getChangingFavoriteProductsIds().contains(str)) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            List productList = ((State) jlmebxxoox()).getProducts().getProductList();
            if (productList != null) {
                Iterator it = productList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    BaseProduct baseProduct = (BaseProduct) next;
                    if ((baseProduct instanceof Product) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) baseProduct).getId(), str)) {
                        break;
                    }
                }
                BaseProduct baseProduct2 = (BaseProduct) next;
                if (baseProduct2 != null) {
                    Product product = (Product) baseProduct2;
                    ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.eablkybsjg(str));
                    ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
                    no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = new no.zoijcleaow.C1522zoijcleaow(AnalyticsPage.Favorites.f84296iwizpuwonk, null, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()));
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        j00.zoijcleaow zoijcleaowVar = this.f88414gtknphoqwx;
                        String id2 = product.getId();
                        boolean isFavorite = product.getIsFavorite();
                        nufgyqmvbuVar.f88451zdlpuopuiu = this;
                        nufgyqmvbuVar.f88450yggfygwlhe = str;
                        nufgyqmvbuVar.f88447cqumvgiudr = 1;
                        if (zoijcleaowVar.nufgyqmvbu(id2, isFavorite, c1522zoijcleaow, nufgyqmvbuVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        iobyxmoadgVar = this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) nufgyqmvbuVar.f88450yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) nufgyqmvbuVar.f88451zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th3) {
            th = th3;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null && (message = thDxjokdxxww.getMessage()) != null) {
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.gtknphoqwx(message));
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.C2028gxszxtbevo(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void auzgnhcxok(int i13, boolean z13) {
        auzgnhcxok auzgnhcxokVar = this.f88409agtfadlqog;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f88409agtfadlqog = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(i13, z13, null), 3, null);
    }

    private final void b() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(igdgnonuha().zoijcleaow(), new draadjrbmk(null)), sopmlzcsov());
    }

    private final void c() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f88414gtknphoqwx.dxjokdxxww(), new wflxmlrfwp(null)), new agtfadlqog(null)), sopmlzcsov());
    }

    private final void d() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(igdgnonuha().iobyxmoadg(), new ojitshcjhn(null)), sopmlzcsov());
    }

    private final void e(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f88410btonecajqb.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Favorites.f84296iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ezmngbhpjk(Warning warning) {
        if ((warning instanceof Warning.Empty) || (warning instanceof Warning.DailyLimit)) {
            return;
        }
        if (warning instanceof Warning.Interval) {
            crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.draadjrbmk(((Warning.Interval) warning).getMessage()));
        } else {
            crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.dxjokdxxww(warning.getMessage()));
        }
    }

    static /* synthetic */ void f(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.e(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(String str) {
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.zoijcleaow(str));
        uawqvzlxes(this, false, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(Throwable th2) {
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
        if (th2 instanceof DomainException) {
            yzdjzghtvl();
        } else {
            ixidwrxhsl(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.gxszxtbevo(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, AnalyticsPage.Favorites.f84296iwizpuwonk, null, 4, null)));
    }

    private final void g(String str, boolean z13, String str2, boolean z14) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(str, z13, str2, z14, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj(String str, ProductCardEvent productCardEvent) {
        BaseProduct baseProduct;
        ProductUIData productUIData;
        List limits;
        List limits2;
        Object next;
        Object next2;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                g(str, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                h(this, str, false, null, false, 12, null);
                return;
            }
        }
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        List productList = ((State) jlmebxxoox()).getProducts().getProductList();
        if (productList != null) {
            Iterator it = productList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                BaseProduct baseProduct2 = (BaseProduct) next2;
                if ((baseProduct2 instanceof Product) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) baseProduct2).getId(), str)) {
                    break;
                }
            }
            baseProduct = (BaseProduct) next2;
        } else {
            baseProduct = null;
        }
        Product product = baseProduct instanceof Product ? (Product) baseProduct : null;
        if (product == null) {
            return;
        }
        List productDataList = ((State) jlmebxxoox()).getProductDataList();
        if (productDataList != null) {
            Iterator it2 = productDataList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), product.getId()));
            productUIData = (ProductUIData) next;
        } else {
            productUIData = null;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(AnalyticsPage.Favorites.f84296iwizpuwonk, null, product.getName());
        String id2 = product.getId();
        String article = product.getArticle();
        boolean isAvailableToBuy = product.getIsAvailableToBuy();
        boolean isPmProduct = product.getIsPmProduct();
        boolean availableOnlyForPickup = product.getAvailableOnlyForPickup();
        MeasureTypeModel measureTypeModel = product.getMeasureTypeModel();
        Double avgWeight = product.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = k30.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = product.getLimits();
        }
        h20.ppxfxbqfkf.dsvhmnatus(this, new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, availableOnlyForPickup, measureTypeModel, avgWeight, limits, changeProductAnalyticParams), false, 2, null);
    }

    static /* synthetic */ void h(iobyxmoadg iobyxmoadgVar, String str, boolean z13, String str2, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.g(str, z13, str2, z14);
    }

    private final boolean hszhottldk() {
        State state = (State) jlmebxxoox();
        Paging paging = state.getPaging();
        return paging != null && state.getCurrentPage() >= paging.getPagesCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb igdgnonuha() {
        return (l00.btonecajqb) this.f88421vdvldrhtss.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq() {
        if (hszhottldk() || wizcaqwiak()) {
            return;
        }
        iwxlajgraz(this, ((State) jlmebxxoox()).getCurrentPage() + 1, false, 2, null);
    }

    static /* synthetic */ void iwxlajgraz(iobyxmoadg iobyxmoadgVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.auzgnhcxok(i13, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Products products, int i13, boolean z13) {
        List listIxidwrxhsl;
        State state = (State) jlmebxxoox();
        if (i13 == 1) {
            listIxidwrxhsl = products.getProductList();
            if (listIxidwrxhsl == null) {
                listIxidwrxhsl = jyumaefscl.wflxmlrfwp();
            }
        } else {
            List productList = state.getProducts().getProductList();
            if (productList == null) {
                productList = jyumaefscl.wflxmlrfwp();
            }
            List productList2 = products.getProductList();
            if (productList2 == null) {
                productList2 = jyumaefscl.wflxmlrfwp();
            }
            listIxidwrxhsl = jyumaefscl.ixidwrxhsl(productList, productList2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIxidwrxhsl) {
            if (!(((BaseProduct) obj) instanceof LoadingBase)) {
                arrayList.add(obj);
            }
        }
        Products productsPpxfxbqfkf = Products.ppxfxbqfkf(products, arrayList, null, null, false, 14, null);
        y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.ppxfxbqfkf(productsPpxfxbqfkf, iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null, products.getPaging(), i13, z13));
        zeieaojujs();
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
    }

    private final boolean lrnfpwlwnk(Products products) {
        int size;
        List favoriteFilterSections = products.getFavoriteFilterSections();
        if (favoriteFilterSections != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : favoriteFilterSections) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((FavoriteFilterSection) obj).getId(), "FAVORITE_ITEM_ALL_ID")) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        return size <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lxfrhoxuzk(lg.gxszxtbevo gxszxtbevoVar) {
        d();
        b();
        c();
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        sj.lqeggnwhkg lqeggnwhkgVarVdvldrhtss = sj.dxjokdxxww.vdvldrhtss(this.f88415gxszxtbevo.wkgbmnqykc());
        z10.nufgyqmvbu nufgyqmvbuVar = this.f88417nufgyqmvbu;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.draadjrbmk(lqeggnwhkgVarVdvldrhtss, nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar), skhdrjzrfn(), new wkgbmnqykc(null)).collect(new eablkybsjg(hkdspvbjdzVar, this), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mhtqkkgtqm(String str) {
        Object next;
        List productList = ((State) jlmebxxoox()).getProducts().getProductList();
        if (productList != null) {
            Iterator it = productList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                BaseProduct baseProduct = (BaseProduct) next;
                if ((baseProduct instanceof Product) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) baseProduct).getId(), str)) {
                    break;
                }
            }
            BaseProduct baseProduct2 = (BaseProduct) next;
            if (baseProduct2 != null) {
                Product product = (Product) baseProduct2;
                f(this, new AnalyticsPage.ItemDetail(product.getArticle(), product.getName()), new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), null, 4, null);
                crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.wflxmlrfwp(product.getId(), product.getArticle()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb rhgxfdycjh(iobyxmoadg iobyxmoadgVar) {
        return l00.gtknphoqwx.zoijcleaow(iobyxmoadgVar.f88416lqeggnwhkg, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh(boolean z13, boolean z14) {
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.draadjrbmk(z13 ? State.zoijcleaow.HIDE : State.zoijcleaow.NO_AUTH));
        if (z13) {
            auzgnhcxok(1, z14);
        }
    }

    static /* synthetic */ void uawqvzlxes(iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = ((Boolean) iobyxmoadgVar.eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.roivzttewh(z13, z14);
    }

    public static final /* synthetic */ State weqkydbzbr(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final boolean wizcaqwiak() {
        auzgnhcxok auzgnhcxokVar = this.f88409agtfadlqog;
        return (auzgnhcxokVar == null || auzgnhcxokVar.agtfadlqog()) ? false : true;
    }

    private final void yzdjzghtvl() {
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.wkgbmnqykc(1, "FAVORITE_ITEM_ALL_ID"));
        uawqvzlxes(this, false, false, 3, null);
    }

    private final void zeieaojujs() {
        State state = (State) jlmebxxoox();
        List productList = state.getProducts().getProductList();
        boolean z13 = true;
        boolean z14 = productList == null || productList.isEmpty();
        if (z14 && (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(state.getSelectedFilterId(), "FAVORITE_ITEM_ALL_ID") || lrnfpwlwnk(state.getProducts()))) {
            z13 = false;
        }
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.iobyxmoadg(z14 ? State.zoijcleaow.EMPTY : State.zoijcleaow.HIDE, z13));
    }

    public void a(boolean z13) {
        this.f88419ppxfxbqfkf.gxszxtbevo(z13);
    }

    public tg.iobyxmoadg dvvnrvtcbc() {
        return this.f88420rgvfuqvkyq;
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f88413eablkybsjg;
    }

    public void eslsurpljm(y00.iobyxmoadg iobyxmoadgVar) {
        this.f88418ojitshcjhn = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(params, str, null), 3, null);
    }

    public final void ixidwrxhsl(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        if (error instanceof ProductDailyLimitException) {
            crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.draadjrbmk(((ProductDailyLimitException) error).getMessage()));
        } else {
            crxdokpmqz(new ru.myspar.favorites.impl.domain.store.eablkybsjg.lqeggnwhkg(error));
        }
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f88418ojitshcjhn;
    }

    public void krqnebusok(boolean z13) {
        this.f88419ppxfxbqfkf.eablkybsjg(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.favorites.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2029iobyxmoadg(action, this, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f88420rgvfuqvkyq = iobyxmoadgVar;
    }

    public wypolnanlu skhdrjzrfn() {
        return this.f88419ppxfxbqfkf.iobyxmoadg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.favorites.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(params, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(null), 3, null);
    }
}
