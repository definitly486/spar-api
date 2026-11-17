package ru.myspar.proloyalty.favorites.impl.domain.store;

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
import ow1.esjtqupxsv;
import ow1.ylkuphrtab;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.BaseProduct;
import ru.myspar.proloyalty.core.domain.models.LoadingBase;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.product.FavoriteFilterSection;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.Products;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.wypolnanlu;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private tg.iobyxmoadg f96223agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lw1.iobyxmoadg f96224btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private auzgnhcxok f96225draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vm0.zoijcleaow f96226dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final esjtqupxsv f96227eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final m01.iobyxmoadg f96228gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dz0.gtknphoqwx f96229gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final m01.nufgyqmvbu f96230lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ylkuphrtab f96231nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final gg.gtknphoqwx f96232ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f96233ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private pz0.iobyxmoadg f96234wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r01.gxszxtbevo f96235wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f96237yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96238zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = iobyxmoadg.this.new agtfadlqog(gxszxtbevoVar);
            agtfadlqogVar.f96237yggfygwlhe = obj;
            return agtfadlqogVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96238zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.btonecajqb((List) this.f96237yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f96239iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f96240jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f96241yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96242zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(lg.gxszxtbevo gxszxtbevoVar, iobyxmoadg iobyxmoadgVar) {
            super(3, gxszxtbevoVar);
            this.f96239iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96242zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f96241yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f96240jyumaefscl).booleanValue() ? this.f96239iwizpuwonk.igdgnonuha().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f96242zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarZoijcleaow, this) == objGxszxtbevo) {
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

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            btonecajqb btonecajqbVar = new btonecajqb(gxszxtbevoVar, this.f96239iwizpuwonk);
            btonecajqbVar.f96241yggfygwlhe = nufgyqmvbuVar;
            btonecajqbVar.f96240jyumaefscl = obj;
            return btonecajqbVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96244zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96244zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.roivzttewh(iobyxmoadg.this, false, false, 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f96245jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96247zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96245jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(this.f96245jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96247zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarIgdgnonuha = iobyxmoadg.this.igdgnonuha();
                ChangeProductParams changeProductParams = this.f96245jyumaefscl;
                this.f96247zdlpuopuiu = 1;
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
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f96248yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f96249zdlpuopuiu;

        eablkybsjg(hkdspvbjdz hkdspvbjdzVar, iobyxmoadg iobyxmoadgVar) {
            this.f96249zdlpuopuiu = hkdspvbjdzVar;
            this.f96248yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
            boolean z13;
            if (((Boolean) iwizpuwonkVar.btonecajqb()).booleanValue()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            boolean zBooleanValue = ((Boolean) iwizpuwonkVar.nufgyqmvbu()).booleanValue();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue), this.f96249zdlpuopuiu.f60015zdlpuopuiu)) {
                z13 = false;
            } else {
                this.f96249zdlpuopuiu.f60015zdlpuopuiu = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
                z13 = true;
            }
            pz0.iobyxmoadg iobyxmoadgVar = (pz0.iobyxmoadg) iwizpuwonkVar.dxjokdxxww();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96248yggfygwlhe.dvvnrvtcbc(), iobyxmoadgVar)) {
                this.f96248yggfygwlhe.krqnebusok(iobyxmoadgVar);
                tg.iobyxmoadg iobyxmoadgVarIwxlajgraz = this.f96248yggfygwlhe.iwxlajgraz();
                if (iobyxmoadgVarIwxlajgraz != null) {
                    iobyxmoadgVarIwxlajgraz.invoke();
                }
                z13 = true;
            }
            if (z13) {
                this.f96248yggfygwlhe.tbqsvytpvh(zBooleanValue, true);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f96251yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96252zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gtknphoqwx gtknphoqwxVar = iobyxmoadg.this.new gtknphoqwx(gxszxtbevoVar);
            gtknphoqwxVar.f96251yggfygwlhe = obj;
            return gtknphoqwxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96252zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f96251yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                iobyxmoadg.this.jrbgnlbqoe(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.rhgxfdycjh(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96254zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96254zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.zoijcleaow.f96201iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.favorites.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2273iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f96255jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.favorites.impl.domain.store.ppxfxbqfkf f96256yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2273iobyxmoadg(ru.myspar.proloyalty.favorites.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96256yggfygwlhe = ppxfxbqfkfVar;
            this.f96255jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2273iobyxmoadg(this.f96256yggfygwlhe, this.f96255jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96257zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96256yggfygwlhe, ru.myspar.proloyalty.favorites.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f96290iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f96255jyumaefscl;
                this.f96257zdlpuopuiu = 1;
                if (iobyxmoadgVar.wizcaqwiak(this) == objGxszxtbevo) {
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
            return ((C2273iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f96258cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f96260jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96261yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96262zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f96260jyumaefscl = obj;
            this.f96258cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fyldjkxazc(null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96264zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96264zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.lqeggnwhkg.f96197iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f96265cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ boolean f96266esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f96267iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f96268jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96270zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(String str, boolean z13, String str2, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96268jyumaefscl = str;
            this.f96267iwizpuwonk = z13;
            this.f96265cqumvgiudr = str2;
            this.f96266esjtqupxsv = z14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ojitshcjhn(this.f96268jyumaefscl, this.f96267iwizpuwonk, this.f96265cqumvgiudr, this.f96266esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96270zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.lqeggnwhkg(this.f96268jyumaefscl, this.f96267iwizpuwonk, this.f96265cqumvgiudr, this.f96266esjtqupxsv));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f96272esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f96273iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f96274jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ boolean f96275lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96276yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96277zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(int i13, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96272esjtqupxsv = i13;
            this.f96275lereixgezr = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f96272esjtqupxsv, this.f96275lereixgezr, gxszxtbevoVar);
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
            State stateIyctptxqzt;
            int i14;
            iobyxmoadg iobyxmoadgVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i15 = this.f96273iwizpuwonk;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        int i16 = this.f96274jyumaefscl;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f96276yggfygwlhe;
                        stateIyctptxqzt = (State) this.f96277zdlpuopuiu;
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
                    i13 = this.f96272esjtqupxsv;
                    z13 = this.f96275lereixgezr;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.fmlbqenlif((Products) objWkgbmnqykc, i13, z13);
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                stateIyctptxqzt = iobyxmoadg.iyctptxqzt(iobyxmoadg.this);
                List productList = stateIyctptxqzt.getProducts().getProductList();
                if (this.f96272esjtqupxsv == 1) {
                    productList = null;
                }
                if (productList != null) {
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.dxjokdxxww(jyumaefscl.jrbgnlbqoe(productList, LoadingBase.f94455zdlpuopuiu)));
                }
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                int i17 = this.f96272esjtqupxsv;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                m01.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f96228gtknphoqwx;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f96277zdlpuopuiu = stateIyctptxqzt;
                this.f96276yggfygwlhe = iobyxmoadgVar3;
                this.f96274jyumaefscl = i17;
                this.f96273iwizpuwonk = 1;
                Object objZoijcleaow = iobyxmoadgVar5.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i14 = i17;
                iobyxmoadgVar2 = iobyxmoadgVar3;
                obj = objZoijcleaow;
                pz0.iobyxmoadg iobyxmoadgVar6 = (pz0.iobyxmoadg) obj;
                r01.gxszxtbevo.iobyxmoadg iobyxmoadgVar7 = new r01.gxszxtbevo.iobyxmoadg(iobyxmoadgVar6.wkgbmnqykc(), iobyxmoadgVar6.ppxfxbqfkf(), !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(stateIyctptxqzt.getSelectedFilterId(), "FAVORITE_ITEM_ALL_ID") ? stateIyctptxqzt.getSelectedFilterId() : null, i14, null);
                r01.gxszxtbevo gxszxtbevoVar = iobyxmoadgVar2.f96235wkgbmnqykc;
                this.f96277zdlpuopuiu = null;
                this.f96276yggfygwlhe = null;
                this.f96273iwizpuwonk = 2;
                obj = gxszxtbevoVar.zoijcleaow(iobyxmoadgVar7, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Products) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar = iobyxmoadg.this;
            i13 = this.f96272esjtqupxsv;
            z13 = this.f96275lereixgezr;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.fmlbqenlif((Products) objWkgbmnqykc, i13, z13);
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.ezmngbhpjk(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f96278yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96279zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96279zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f96278yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            wflxmlrfwpVar.f96278yggfygwlhe = th2;
            return wflxmlrfwpVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ boolean f96280iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f96281jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f96282yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96283zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (pz0.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96283zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f96282yggfygwlhe;
            return new iwizpuwonk(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (pz0.iobyxmoadg) this.f96281jyumaefscl, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f96280iwizpuwonk));
        }

        public final Object ojitshcjhn(boolean z13, pz0.iobyxmoadg iobyxmoadgVar, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f96282yggfygwlhe = z13;
            wkgbmnqykcVar.f96281jyumaefscl = iobyxmoadgVar;
            wkgbmnqykcVar.f96280iwizpuwonk = z14;
            return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f96284jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc f96285yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96286zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96285yggfygwlhe = wkgbmnqykcVar;
            this.f96284jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f96285yggfygwlhe, this.f96284jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96286zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f96285yggfygwlhe;
                if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
                    this.f96284jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.iobyxmoadg.f96196iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.zoijcleaow) {
                    this.f96284jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.wkgbmnqykc.f96200iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.ppxfxbqfkf) {
                    this.f96284jyumaefscl.ageimvtcrz(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.C2274wkgbmnqykc) {
                    iobyxmoadg iobyxmoadgVar = this.f96284jyumaefscl;
                    String strIobyxmoadg = ((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.C2274wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg();
                    this.f96286zdlpuopuiu = 1;
                    if (iobyxmoadgVar.fyldjkxazc(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.lqeggnwhkg) {
                    this.f96284jyumaefscl.grlcpdaxtj();
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww) {
                    this.f96284jyumaefscl.ixidwrxhsl(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.gtknphoqwx) {
                    iobyxmoadg.roivzttewh(this.f96284jyumaefscl, false, true, 1, null);
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.nufgyqmvbu) {
                    this.f96284jyumaefscl.mhtqkkgtqm(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).zoijcleaow(), ((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.nufgyqmvbu) this.f96285yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.eablkybsjg) {
                    this.f96284jyumaefscl.a(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.btonecajqb) {
                    this.f96284jyumaefscl.b(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.btonecajqb) wkgbmnqykcVar).iobyxmoadg());
                } else {
                    if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f96284jyumaefscl.ipoelvxyzq(((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo) wkgbmnqykcVar).zoijcleaow(), ((ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo) this.f96285yggfygwlhe).iobyxmoadg());
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
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, r01.gxszxtbevo getFavoritesUseCase, esjtqupxsv isAuthUseCase, dz0.gtknphoqwx productChangesSourceProvider, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, ylkuphrtab subscribeuserIsAuthUseCase, vm0.zoijcleaow analyticsTracker, lw1.iobyxmoadg changeFavoritesInteractor, m01.iobyxmoadg getCurrentDeliveryDataUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFavoritesUseCase, "getFavoritesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeuserIsAuthUseCase, "subscribeuserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f96233ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f96235wkgbmnqykc = getFavoritesUseCase;
        this.f96227eablkybsjg = isAuthUseCase;
        this.f96229gxszxtbevo = productChangesSourceProvider;
        this.f96230lqeggnwhkg = subscribeToCurrentDeliveryDataUseCase;
        this.f96231nufgyqmvbu = subscribeuserIsAuthUseCase;
        this.f96226dxjokdxxww = analyticsTracker;
        this.f96224btonecajqb = changeFavoritesInteractor;
        this.f96228gtknphoqwx = getCurrentDeliveryDataUseCase;
        this.f96232ojitshcjhn = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: k81.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.favorites.impl.domain.store.iobyxmoadg.yzdjzghtvl(this.f54190zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz(String str) {
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.zoijcleaow(str));
        roivzttewh(this, false, false, 3, null);
    }

    static /* synthetic */ void auzgnhcxok(iobyxmoadg iobyxmoadgVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.uawqvzlxes(i13, z13);
    }

    private final void c() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(lxfrhoxuzk(), new btonecajqb(null, this)), new gtknphoqwx(null)), sopmlzcsov());
    }

    private final void d() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f96224btonecajqb.dxjokdxxww(), new draadjrbmk(null)), new wflxmlrfwp(null)), sopmlzcsov());
    }

    private final void e() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(igdgnonuha().iobyxmoadg(), new agtfadlqog(null)), sopmlzcsov());
    }

    private final void eslsurpljm() {
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.wkgbmnqykc(1, "FAVORITE_ITEM_ALL_ID"));
        roivzttewh(this, false, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ezmngbhpjk(Throwable th2) {
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
        if (th2 instanceof DomainException) {
            eslsurpljm();
        } else {
            jrbgnlbqoe(th2);
        }
    }

    private final void f(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f96226dxjokdxxww.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Favorites.f92324iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    private final boolean fiwbwshyhd() {
        State state = (State) jlmebxxoox();
        Paging paging = state.getPaging();
        return paging != null && state.getCurrentPage() >= paging.getPagesCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(Products products, int i13, boolean z13) {
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
        pz0.iobyxmoadg iobyxmoadgVarDvvnrvtcbc = dvvnrvtcbc();
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.ppxfxbqfkf(productsPpxfxbqfkf, iobyxmoadgVarDvvnrvtcbc != null ? iobyxmoadgVarDvvnrvtcbc.ppxfxbqfkf() : null, products.getPaging(), i13, z13));
        lrnfpwlwnk();
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.nufgyqmvbu(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fyldjkxazc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        Object next;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        String message;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f96258cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f96258cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f96260jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f96258cqumvgiudr;
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
                    ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.eablkybsjg(str));
                    ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(true));
                    xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = new xm0.zoijcleaow.C3095zoijcleaow(AnalyticsPage.Favorites.f92324iwizpuwonk, null, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()));
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        lw1.iobyxmoadg iobyxmoadgVar3 = this.f96224btonecajqb;
                        String id2 = product.getId();
                        boolean isFavorite = product.getIsFavorite();
                        lqeggnwhkgVar.f96262zdlpuopuiu = this;
                        lqeggnwhkgVar.f96261yggfygwlhe = str;
                        lqeggnwhkgVar.f96258cqumvgiudr = 1;
                        if (iobyxmoadgVar3.nufgyqmvbu(id2, isFavorite, c3095zoijcleaow, lqeggnwhkgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        iobyxmoadgVar = this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) lqeggnwhkgVar.f96261yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f96262zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th3) {
            th = th3;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null && (message = thDxjokdxxww.getMessage()) != null) {
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.nufgyqmvbu(message));
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.C2272gxszxtbevo(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void g(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.f(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj() {
        if (fiwbwshyhd() || hszhottldk()) {
            return;
        }
        auzgnhcxok(this, ((State) jlmebxxoox()).getCurrentPage() + 1, false, 2, null);
    }

    private final void h(String str, boolean z13, String str2, boolean z14) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(str, z13, str2, z14, null), 3, null);
    }

    private final boolean hszhottldk() {
        auzgnhcxok auzgnhcxokVar = this.f96225draadjrbmk;
        return (auzgnhcxokVar == null || auzgnhcxokVar.agtfadlqog()) ? false : true;
    }

    static /* synthetic */ void i(iobyxmoadg iobyxmoadgVar, String str, boolean z13, String str2, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.h(str, z13, str2, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb igdgnonuha() {
        return (dz0.btonecajqb) this.f96232ojitshcjhn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.C2271eablkybsjg(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, AnalyticsPage.Favorites.f92324iwizpuwonk, null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixidwrxhsl(String str) {
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
                g(this, new AnalyticsPage.ItemDetail(product.getArticle(), product.getName()), new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), null, 4, null);
                crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.btonecajqb(product.getId(), product.getArticle()));
            }
        }
    }

    public static final /* synthetic */ State iyctptxqzt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Throwable th2) {
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.gtknphoqwx(false));
        if (th2 instanceof ProductDailyLimitException) {
            crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.dxjokdxxww(((ProductDailyLimitException) th2).getMessage()));
        } else {
            crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.gxszxtbevo(th2));
        }
    }

    private final void lrnfpwlwnk() {
        State state = (State) jlmebxxoox();
        List productList = state.getProducts().getProductList();
        boolean z13 = true;
        boolean z14 = productList == null || productList.isEmpty();
        if (z14 && (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(state.getSelectedFilterId(), "FAVORITE_ITEM_ALL_ID") || weqkydbzbr(state.getProducts()))) {
            z13 = false;
        }
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.iobyxmoadg(z14 ? State.zoijcleaow.EMPTY : State.zoijcleaow.HIDE, z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mhtqkkgtqm(String str, ProductCardEvent productCardEvent) {
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
                h(str, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                i(this, str, false, null, false, 12, null);
                return;
            }
        }
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
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
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(AnalyticsPage.Favorites.f92324iwizpuwonk, null, product.getName());
        String id2 = product.getId();
        String article = product.getArticle();
        boolean isAvailableToBuy = product.getIsAvailableToBuy();
        boolean isPmProduct = product.getIsPmProduct();
        MeasureTypeModel measureTypeModel = product.getMeasureTypeModel();
        Double avgWeight = product.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = q11.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = product.getLimits();
        }
        r01.iobyxmoadg.wflxmlrfwp(this, new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, measureTypeModel, avgWeight, limits, changeProductAnalyticParams), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rhgxfdycjh(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg.dxjokdxxww(warning.getMessage()));
    }

    static /* synthetic */ void roivzttewh(iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = ((Boolean) iobyxmoadgVar.wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.tbqsvytpvh(z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tbqsvytpvh(boolean z13, boolean z14) {
        ulzqkzuiru(new ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo.draadjrbmk(z13 ? State.zoijcleaow.HIDE : State.zoijcleaow.NO_AUTH));
        if (z13) {
            uawqvzlxes(1, z14);
        }
    }

    private final void uawqvzlxes(int i13, boolean z13) {
        auzgnhcxok auzgnhcxokVar = this.f96225draadjrbmk;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f96225draadjrbmk = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(i13, z13, null), 3, null);
    }

    private final boolean weqkydbzbr(Products products) {
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
    public final Object wizcaqwiak(lg.gxszxtbevo gxszxtbevoVar) {
        e();
        c();
        d();
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        ylkuphrtab ylkuphrtabVar = this.f96231nufgyqmvbu;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Object objCollect = sj.dxjokdxxww.draadjrbmk((sj.lqeggnwhkg) ylkuphrtabVar.zoijcleaow(wwaezpbzknVar), this.f96230lqeggnwhkg.zoijcleaow(wwaezpbzknVar), skhdrjzrfn(), new wkgbmnqykc(null)).collect(new eablkybsjg(hkdspvbjdzVar, this), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb yzdjzghtvl(iobyxmoadg iobyxmoadgVar) {
        return dz0.gtknphoqwx.zoijcleaow(iobyxmoadgVar.f96229gxszxtbevo, null, 1, null);
    }

    public void a(boolean z13) {
        this.f96233ppxfxbqfkf.eablkybsjg(z13);
    }

    public void b(boolean z13) {
        this.f96233ppxfxbqfkf.gxszxtbevo(z13);
    }

    public pz0.iobyxmoadg dvvnrvtcbc() {
        return this.f96234wflxmlrfwp;
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(params, null), 3, null);
    }

    public tg.iobyxmoadg iwxlajgraz() {
        return this.f96223agtfadlqog;
    }

    public void krqnebusok(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f96234wflxmlrfwp = iobyxmoadgVar;
    }

    public sj.lqeggnwhkg lxfrhoxuzk() {
        return this.f96233ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f96223agtfadlqog = iobyxmoadgVar;
    }

    public wypolnanlu skhdrjzrfn() {
        return this.f96233ppxfxbqfkf.iobyxmoadg();
    }

    @Override // r01.iobyxmoadg
    public esjtqupxsv wkgbmnqykc() {
        return this.f96227eablkybsjg;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: zeieaojujs, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.favorites.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2273iobyxmoadg(action, this, null), 3, null);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(null), 3, null);
    }
}
