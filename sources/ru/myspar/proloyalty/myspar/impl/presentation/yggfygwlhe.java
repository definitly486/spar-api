package ru.myspar.proloyalty.myspar.impl.presentation;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.components.special_products.api.models.Action;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.myspar.impl.domain.model.Promotion;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import ru.myspar.proloyalty.user.domain.model.UserState;
import ru.myspar.proloyalty.videoplayer.api.model.VideoPlayerArgs;
import ru.myspar.proloyalty.webview_screen.api.models.SpecialProductsWebViewArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class yggfygwlhe extends sw0.eablkybsjg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ow1.esjtqupxsv f98228agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ee1.wkgbmnqykc f98229btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final ut1.iobyxmoadg f98230cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final x21.zoijcleaow f98231cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final dz0.gtknphoqwx f98232cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final m01.nufgyqmvbu f98233draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final jt1.wkgbmnqykc f98234dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final cz0.iobyxmoadg f98235dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final sc1.iobyxmoadg f98236esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final m01.iobyxmoadg f98237gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final tu0.iobyxmoadg f98238hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final ut1.wkgbmnqykc f98239hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final ow1.jpowsppfya f98240iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final be1.zoijcleaow f98241istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final vm0.zoijcleaow f98242iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final ur0.iobyxmoadg f98243jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final af1.zoijcleaow f98244jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final p01.ppxfxbqfkf f98245kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final n91.ppxfxbqfkf f98246kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final an0.iobyxmoadg f98247lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final do0.gxszxtbevo f98248lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f98249lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private pz0.iobyxmoadg f98250mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private tg.iobyxmoadg f98251ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ow1.wflxmlrfwp f98252nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final ye1.eablkybsjg f98253ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final kc1.iobyxmoadg f98254oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final fe1.iobyxmoadg f98255pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final mn1.iobyxmoadg f98256pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final i01.eablkybsjg f98257rgvfuqvkyq;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final ow1.pkzmftpjix f98258stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final gg.gtknphoqwx f98259tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private List f98260ulzqkzuiru;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final cu1.iobyxmoadg f98261vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final e11.iobyxmoadg f98262wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final lw1.zoijcleaow f98263wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final do0.wkgbmnqykc f98264wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final u51.iobyxmoadg f98265yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ow1.zoijcleaow f98266yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq f98267ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ow1.iwizpuwonk f98268zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final q41.iobyxmoadg f98269zynmafqrjb;

    public static final class agtfadlqog implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98270zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98271zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$agtfadlqog$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2327iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98273yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98274zdlpuopuiu;

                public C2327iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98274zdlpuopuiu = obj;
                    this.f98273yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98271zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2327iobyxmoadg c2327iobyxmoadg;
                if (gxszxtbevoVar instanceof C2327iobyxmoadg) {
                    c2327iobyxmoadg = (C2327iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2327iobyxmoadg.f98273yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2327iobyxmoadg.f98273yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2327iobyxmoadg = new C2327iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2327iobyxmoadg = new C2327iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2327iobyxmoadg.f98274zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2327iobyxmoadg.f98273yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98271zdlpuopuiu;
                    if (!((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) obj).ppxfxbqfkf().isEmpty()) {
                        c2327iobyxmoadg.f98273yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2327iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public agtfadlqog(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98270zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98270zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f98276yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98277zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, yggfygwlhe.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((yggfygwlhe) this.receiver).zdlpuopuiu(p13);
            }
        }

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            be1.zoijcleaow zoijcleaowVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98276yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zoijcleaowVar = (be1.zoijcleaow) this.f98277zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                yggfygwlhe.this.skhdrjzrfn();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.u();
            yggfygwlhe.this.x();
            yggfygwlhe.this.yggfygwlhe(ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.iobyxmoadg.f98154iobyxmoadg);
            yggfygwlhe.this.f98263wwaezpbzkn.zoijcleaow();
            zoijcleaowVar = yggfygwlhe.this.f98241istkbnxepw;
            m01.iobyxmoadg iobyxmoadgVar = yggfygwlhe.this.f98237gtknphoqwx;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f98277zdlpuopuiu = zoijcleaowVar;
            this.f98276yggfygwlhe = 1;
            obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(yggfygwlhe.this);
            this.f98277zdlpuopuiu = null;
            this.f98276yggfygwlhe = 2;
            if (zoijcleaowVar.zdlpuopuiu((pz0.iobyxmoadg) obj, iobyxmoadgVar2, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            yggfygwlhe.this.skhdrjzrfn();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98279yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98280zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98280zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.lxfrhoxuzk((Throwable) this.f98279yggfygwlhe);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cdpycssgdh cdpycssgdhVar = yggfygwlhe.this.new cdpycssgdh(gxszxtbevoVar);
            cdpycssgdhVar.f98279yggfygwlhe = th2;
            return cdpycssgdhVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class cllcsxoeiz implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98281zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98282zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$cllcsxoeiz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2328iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98284yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98285zdlpuopuiu;

                public C2328iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98285zdlpuopuiu = obj;
                    this.f98284yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98282zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2328iobyxmoadg c2328iobyxmoadg;
                if (gxszxtbevoVar instanceof C2328iobyxmoadg) {
                    c2328iobyxmoadg = (C2328iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2328iobyxmoadg.f98284yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2328iobyxmoadg.f98284yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2328iobyxmoadg = new C2328iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2328iobyxmoadg = new C2328iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2328iobyxmoadg.f98285zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2328iobyxmoadg.f98284yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98282zdlpuopuiu;
                    UserInfo userInfoAgeimvtcrz = ((UserState) obj).ageimvtcrz();
                    String phone = userInfoAgeimvtcrz != null ? userInfoAgeimvtcrz.getPhone() : null;
                    c2328iobyxmoadg.f98284yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(phone, c2328iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public cllcsxoeiz(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98281zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98281zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f98286jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f98287yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98288zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (kc1.iobyxmoadg.C1170iobyxmoadg) obj2, (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98288zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f98287yggfygwlhe;
            return gg.cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (kc1.iobyxmoadg.C1170iobyxmoadg) this.f98286jyumaefscl);
        }

        public final Object ojitshcjhn(boolean z13, kc1.iobyxmoadg.C1170iobyxmoadg c1170iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f98287yggfygwlhe = z13;
            cqumvgiudrVar.f98286jyumaefscl = c1170iobyxmoadg;
            return cqumvgiudrVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class crxdokpmqz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98290yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98291zdlpuopuiu;

        crxdokpmqz(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            crxdokpmqz crxdokpmqzVar = yggfygwlhe.this.new crxdokpmqz(gxszxtbevoVar);
            crxdokpmqzVar.f98290yggfygwlhe = obj;
            return crxdokpmqzVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98291zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f98290yggfygwlhe;
            yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yggfygwlheVar.k((zoijcleaow) it.next());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((crxdokpmqz) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98292zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98293zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2329iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98295yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98296zdlpuopuiu;

                public C2329iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98296zdlpuopuiu = obj;
                    this.f98295yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98293zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2329iobyxmoadg c2329iobyxmoadg;
                if (gxszxtbevoVar instanceof C2329iobyxmoadg) {
                    c2329iobyxmoadg = (C2329iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2329iobyxmoadg.f98295yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2329iobyxmoadg.f98295yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2329iobyxmoadg = new C2329iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2329iobyxmoadg = new C2329iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2329iobyxmoadg.f98296zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2329iobyxmoadg.f98295yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98293zdlpuopuiu;
                    if (!((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) obj).ppxfxbqfkf().isEmpty()) {
                        c2329iobyxmoadg.f98295yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2329iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public draadjrbmk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98292zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98292zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class dsvhmnatus implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98297zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98298zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$dsvhmnatus$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2330iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98300yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98301zdlpuopuiu;

                public C2330iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98301zdlpuopuiu = obj;
                    this.f98300yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98298zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2330iobyxmoadg c2330iobyxmoadg;
                if (gxszxtbevoVar instanceof C2330iobyxmoadg) {
                    c2330iobyxmoadg = (C2330iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2330iobyxmoadg.f98300yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2330iobyxmoadg.f98300yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2330iobyxmoadg = new C2330iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2330iobyxmoadg = new C2330iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2330iobyxmoadg.f98301zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2330iobyxmoadg.f98300yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98298zdlpuopuiu;
                    zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new zoijcleaow.ppxfxbqfkf((String) obj);
                    c2330iobyxmoadg.f98300yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c2330iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public dsvhmnatus(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98297zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98297zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98303zdlpuopuiu;

        public static final class iobyxmoadg implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f98304zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2331iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f98305zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$dxjokdxxww$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2332iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f98307yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f98308zdlpuopuiu;

                    public C2332iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f98308zdlpuopuiu = obj;
                        this.f98307yggfygwlhe |= Integer.MIN_VALUE;
                        return C2331iobyxmoadg.this.emit(null, this);
                    }
                }

                public C2331iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f98305zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2332iobyxmoadg c2332iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2332iobyxmoadg) {
                        c2332iobyxmoadg = (C2332iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2332iobyxmoadg.f98307yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2332iobyxmoadg.f98307yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2332iobyxmoadg = new C2332iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2332iobyxmoadg = new C2332iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2332iobyxmoadg.f98308zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2332iobyxmoadg.f98307yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f98305zdlpuopuiu;
                        if (((Boolean) obj).booleanValue()) {
                            c2332iobyxmoadg.f98307yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2332iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f98304zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f98304zdlpuopuiu.collect(new C2331iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98303zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg((sj.lqeggnwhkg) yggfygwlhe.this.f98234dsvhmnatus.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg));
            this.f98303zdlpuopuiu = 1;
            if (sj.dxjokdxxww.pmvmpeiblj(iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ur0.iobyxmoadg iobyxmoadgVar2 = yggfygwlhe.this.f98243jpowsppfya;
            List listI = hg.agtfadlqog.i((Object[]) yggfygwlhe.this.f98262wflxmlrfwp.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg));
            this.f98303zdlpuopuiu = 2;
            if (iobyxmoadgVar2.ppxfxbqfkf("MySparViewModelTag", listI, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f98309cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f98311jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98313zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f98311jyumaefscl = obj;
            this.f98309cqumvgiudr |= Integer.MIN_VALUE;
            return yggfygwlhe.this.nuxfzjnpeb(null, this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98315zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, yggfygwlhe.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((yggfygwlhe) this.receiver).zdlpuopuiu(p13);
            }
        }

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new esjtqupxsv(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98315zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                be1.zoijcleaow zoijcleaowVar = yggfygwlhe.this.f98241istkbnxepw;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(yggfygwlhe.this);
                this.f98315zdlpuopuiu = 1;
                if (zoijcleaowVar.iwizpuwonk(iobyxmoadgVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kc1.iobyxmoadg.C1170iobyxmoadg c1170iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((esjtqupxsv) create(c1170iobyxmoadg, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f98316jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98318zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98316jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new gtknphoqwx(this.f98316jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98318zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarUawqvzlxes = yggfygwlhe.this.uawqvzlxes();
                ChangeProductParams changeProductParams = this.f98316jyumaefscl;
                this.f98318zdlpuopuiu = 1;
                if (btonecajqbVarUawqvzlxes.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ m91.gxszxtbevo f98319cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f98320esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f98322jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f98323yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98324zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(m91.gxszxtbevo gxszxtbevoVar, int i13, lg.gxszxtbevo gxszxtbevoVar2) {
            super(2, gxszxtbevoVar2);
            this.f98319cqumvgiudr = gxszxtbevoVar;
            this.f98320esjtqupxsv = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new gxszxtbevo(this.f98319cqumvgiudr, this.f98320esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yggfygwlhe yggfygwlheVar;
            m91.gxszxtbevo gxszxtbevoVar;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98322jyumaefscl;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (yggfygwlhe.this.q(this.f98319cqumvgiudr.rgvfuqvkyq(), new iobyxmoadg.C2334iobyxmoadg(this.f98319cqumvgiudr, this.f98320esjtqupxsv))) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                String strGtknphoqwx = this.f98319cqumvgiudr.gtknphoqwx();
                if (strGtknphoqwx != null) {
                    yggfygwlheVar = yggfygwlhe.this;
                    m91.gxszxtbevo gxszxtbevoVar2 = this.f98319cqumvgiudr;
                    ut1.iobyxmoadg.C2836iobyxmoadg c2836iobyxmoadg = new ut1.iobyxmoadg.C2836iobyxmoadg(strGtknphoqwx);
                    try {
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        ut1.iobyxmoadg iobyxmoadgVar2 = yggfygwlheVar.f98230cdpycssgdh;
                        this.f98324zdlpuopuiu = yggfygwlheVar;
                        this.f98323yggfygwlhe = gxszxtbevoVar2;
                        this.f98322jyumaefscl = 1;
                        obj = iobyxmoadgVar2.zoijcleaow(c2836iobyxmoadg, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        gxszxtbevoVar = gxszxtbevoVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gxszxtbevoVar = gxszxtbevoVar2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                }
                yggfygwlhe.s(yggfygwlhe.this, this.f98319cqumvgiudr, false, this.f98320esjtqupxsv, 2, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gxszxtbevoVar = (m91.gxszxtbevo) this.f98323yggfygwlhe;
            yggfygwlheVar = (yggfygwlhe) this.f98324zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((StoryItem) obj);
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            StoryItem storyItem = (StoryItem) objWkgbmnqykc;
            if (storyItem != null) {
                yggfygwlheVar.i(storyItem, new StoryNavLink(gxszxtbevoVar.btonecajqb().btonecajqb(), gxszxtbevoVar.draadjrbmk()));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            yggfygwlhe.s(yggfygwlhe.this, this.f98319cqumvgiudr, false, this.f98320esjtqupxsv, 2, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class hcddaimhww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98326zdlpuopuiu;

        hcddaimhww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new hcddaimhww(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98326zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.o();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((hcddaimhww) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class hkdspvbjdz implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98327zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98328zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$hkdspvbjdz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2333iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98330yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98331zdlpuopuiu;

                public C2333iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98331zdlpuopuiu = obj;
                    this.f98330yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98328zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2333iobyxmoadg c2333iobyxmoadg;
                if (gxszxtbevoVar instanceof C2333iobyxmoadg) {
                    c2333iobyxmoadg = (C2333iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2333iobyxmoadg.f98330yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2333iobyxmoadg.f98330yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2333iobyxmoadg = new C2333iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2333iobyxmoadg = new C2333iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2333iobyxmoadg.f98331zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2333iobyxmoadg.f98330yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98328zdlpuopuiu;
                    zoijcleaow.wkgbmnqykc wkgbmnqykcVar = new zoijcleaow.wkgbmnqykc((pz0.iobyxmoadg) obj);
                    c2333iobyxmoadg.f98330yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(wkgbmnqykcVar, c2333iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public hkdspvbjdz(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98327zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98327zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2334iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            public static final int f98332ppxfxbqfkf = m91.gxszxtbevo.f66592wypolnanlu;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final m91.gxszxtbevo f98333iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f98334zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2334iobyxmoadg(m91.gxszxtbevo banner, int i13) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
                this.f98333iobyxmoadg = banner;
                this.f98334zoijcleaow = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2334iobyxmoadg)) {
                    return false;
                }
                C2334iobyxmoadg c2334iobyxmoadg = (C2334iobyxmoadg) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98333iobyxmoadg, c2334iobyxmoadg.f98333iobyxmoadg) && this.f98334zoijcleaow == c2334iobyxmoadg.f98334zoijcleaow;
            }

            public int hashCode() {
                return (this.f98333iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f98334zoijcleaow);
            }

            public final m91.gxszxtbevo iobyxmoadg() {
                return this.f98333iobyxmoadg;
            }

            public String toString() {
                return "Banner(banner=" + this.f98333iobyxmoadg + ", bannerIndex=" + this.f98334zoijcleaow + ")";
            }

            public final int zoijcleaow() {
                return this.f98334zoijcleaow;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final bf1.ppxfxbqfkf f98335iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(bf1.ppxfxbqfkf story) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
                this.f98335iobyxmoadg = story;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98335iobyxmoadg, ((zoijcleaow) obj).f98335iobyxmoadg);
            }

            public int hashCode() {
                return this.f98335iobyxmoadg.hashCode();
            }

            public final bf1.ppxfxbqfkf iobyxmoadg() {
                return this.f98335iobyxmoadg;
            }

            public String toString() {
                return "Story(story=" + this.f98335iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class iozdgvuglv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98337zdlpuopuiu;

        iozdgvuglv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new iozdgvuglv(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98337zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.o();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iozdgvuglv) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98339yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98340zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            istkbnxepw istkbnxepwVar = yggfygwlhe.this.new istkbnxepw(gxszxtbevoVar);
            istkbnxepwVar.f98339yggfygwlhe = obj;
            return istkbnxepwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98340zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            i01.eablkybsjg.iobyxmoadg iobyxmoadgVar = (i01.eablkybsjg.iobyxmoadg) this.f98339yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, i01.eablkybsjg.iobyxmoadg.C0972iobyxmoadg.f41612iobyxmoadg)) {
                yggfygwlhe.this.o();
            } else {
                if (!(iobyxmoadgVar instanceof i01.eablkybsjg.iobyxmoadg.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
                i01.eablkybsjg.iobyxmoadg.zoijcleaow zoijcleaowVar = (i01.eablkybsjg.iobyxmoadg.zoijcleaow) iobyxmoadgVar;
                String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                String strZoijcleaow = zoijcleaowVar.zoijcleaow();
                yggfygwlhe yggfygwlheVar2 = yggfygwlhe.this;
                if (strZoijcleaow.length() == 0) {
                    strZoijcleaow = yggfygwlheVar2.f98269zynmafqrjb.getString(vk0.lqeggnwhkg.proloyalty_promotion);
                }
                yggfygwlheVar.fiwbwshyhd(strIobyxmoadg, strZoijcleaow);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i01.eablkybsjg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((istkbnxepw) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iwizpuwonk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98341zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98342zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$iwizpuwonk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2335iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98344yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98345zdlpuopuiu;

                public C2335iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98345zdlpuopuiu = obj;
                    this.f98344yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98342zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2335iobyxmoadg c2335iobyxmoadg;
                if (gxszxtbevoVar instanceof C2335iobyxmoadg) {
                    c2335iobyxmoadg = (C2335iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2335iobyxmoadg.f98344yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2335iobyxmoadg.f98344yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2335iobyxmoadg = new C2335iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2335iobyxmoadg = new C2335iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2335iobyxmoadg.f98345zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2335iobyxmoadg.f98344yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98342zdlpuopuiu;
                    gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) obj;
                    boolean zBooleanValue = ((Boolean) vdvldrhtssVar.iobyxmoadg()).booleanValue();
                    kc1.iobyxmoadg.C1170iobyxmoadg c1170iobyxmoadg = (kc1.iobyxmoadg.C1170iobyxmoadg) vdvldrhtssVar.wkgbmnqykc();
                    if (!zBooleanValue) {
                        c1170iobyxmoadg = null;
                    }
                    if (c1170iobyxmoadg != null) {
                        c2335iobyxmoadg.f98344yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(c1170iobyxmoadg, c2335iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public iwizpuwonk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98341zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98341zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class jlmebxxoox extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98347zdlpuopuiu;

        jlmebxxoox(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new jlmebxxoox(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98347zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ee1.wkgbmnqykc wkgbmnqykcVar = yggfygwlheVar.f98229btonecajqb;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f98347zdlpuopuiu = 1;
                    obj = wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Promotion) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            yggfygwlhe.this.L(df1.iobyxmoadg.gxszxtbevo.eablkybsjg.f27989pmvmpeiblj.zoijcleaow((Promotion) objWkgbmnqykc));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jlmebxxoox) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jpowsppfya extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f98349yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98350zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ yggfygwlhe f98351yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ pj.cllcsxoeiz f98352zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$jpowsppfya$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2336iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ be1.iobyxmoadg f98353jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ yggfygwlhe f98354yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f98355zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$jpowsppfya$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                /* synthetic */ class C2337iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
                    C2337iobyxmoadg(Object obj) {
                        super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
                    }

                    @Override // tg.rgvfuqvkyq
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
                    }

                    public final String iobyxmoadg(int i13, Object[] objArr) {
                        return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2336iobyxmoadg(yggfygwlhe yggfygwlheVar, be1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f98354yggfygwlhe = yggfygwlheVar;
                    this.f98353jyumaefscl = iobyxmoadgVar;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C2336iobyxmoadg(this.f98354yggfygwlhe, this.f98353jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f98355zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ye1.eablkybsjg eablkybsjgVar = this.f98354yggfygwlhe.f98253ojitshcjhn;
                        Map mapPpxfxbqfkf = ((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) this.f98354yggfygwlhe.getState().getValue()).ppxfxbqfkf();
                        be1.iobyxmoadg iobyxmoadgVar = this.f98353jyumaefscl;
                        List listWflxmlrfwp = this.f98354yggfygwlhe.f98260ulzqkzuiru;
                        if (listWflxmlrfwp == null) {
                            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                        }
                        List list = listWflxmlrfwp;
                        pz0.iobyxmoadg iobyxmoadgVarRoivzttewh = this.f98354yggfygwlhe.roivzttewh();
                        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVarRoivzttewh != null ? iobyxmoadgVarRoivzttewh.ppxfxbqfkf() : null;
                        C2337iobyxmoadg c2337iobyxmoadg = new C2337iobyxmoadg(this.f98354yggfygwlhe.f98269zynmafqrjb);
                        this.f98355zdlpuopuiu = 1;
                        obj = eablkybsjgVar.dxjokdxxww(mapPpxfxbqfkf, iobyxmoadgVar, list, deliveryCodePpxfxbqfkf, c2337iobyxmoadg, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    yggfygwlhe yggfygwlheVar = this.f98354yggfygwlhe;
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        yggfygwlheVar.L((gg.vdvldrhtss) it.next());
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C2336iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            iobyxmoadg(pj.cllcsxoeiz cllcsxoeizVar, yggfygwlhe yggfygwlheVar) {
                this.f98352zdlpuopuiu = cllcsxoeizVar;
                this.f98351yggfygwlhe = yggfygwlheVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(be1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                pj.gtknphoqwx.wkgbmnqykc(this.f98352zdlpuopuiu, null, null, new C2336iobyxmoadg(this.f98351yggfygwlhe, iobyxmoadgVar, null), 3, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        jpowsppfya(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            jpowsppfya jpowsppfyaVar = yggfygwlhe.this.new jpowsppfya(gxszxtbevoVar);
            jpowsppfyaVar.f98349yggfygwlhe = obj;
            return jpowsppfyaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98350zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f98349yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarKcexrzcfyt = yggfygwlhe.this.f98241istkbnxepw.kcexrzcfyt();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(cllcsxoeizVar, yggfygwlhe.this);
                this.f98350zdlpuopuiu = 1;
                if (lqeggnwhkgVarKcexrzcfyt.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((jpowsppfya) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98357zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new jyumaefscl(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98357zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.f98242iwizpuwonk.zoijcleaow(ym0.eablkybsjg.wkgbmnqykc.f125941gxszxtbevo);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98358zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98359zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2338iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98361yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98362zdlpuopuiu;

                public C2338iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98362zdlpuopuiu = obj;
                    this.f98361yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98359zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2338iobyxmoadg c2338iobyxmoadg;
                if (gxszxtbevoVar instanceof C2338iobyxmoadg) {
                    c2338iobyxmoadg = (C2338iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2338iobyxmoadg.f98361yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2338iobyxmoadg.f98361yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2338iobyxmoadg = new C2338iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2338iobyxmoadg = new C2338iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2338iobyxmoadg.f98362zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2338iobyxmoadg.f98361yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98359zdlpuopuiu;
                    List listZfvoamnweg = hg.jyumaefscl.zfvoamnweg(((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) obj).ppxfxbqfkf().values());
                    c2338iobyxmoadg.f98361yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listZfvoamnweg, c2338iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public kcexrzcfyt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98358zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98358zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kegysxyocb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98364yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98365zdlpuopuiu;

        kegysxyocb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            kegysxyocb kegysxyocbVar = yggfygwlhe.this.new kegysxyocb(gxszxtbevoVar);
            kegysxyocbVar.f98364yggfygwlhe = obj;
            return kegysxyocbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98365zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f98364yggfygwlhe;
            yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yggfygwlheVar.k((zoijcleaow) it.next());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((kegysxyocb) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98367yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98368zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98368zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.lxfrhoxuzk((Throwable) this.f98367yggfygwlhe);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = yggfygwlhe.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f98367yggfygwlhe = th2;
            return lereixgezrVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lmojexxdyd extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98370yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98371zdlpuopuiu;

        lmojexxdyd(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98371zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.lxfrhoxuzk((Throwable) this.f98370yggfygwlhe);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            lmojexxdyd lmojexxdydVar = yggfygwlhe.this.new lmojexxdyd(gxszxtbevoVar);
            lmojexxdydVar.f98370yggfygwlhe = th2;
            return lmojexxdydVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f98372jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98374zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98372jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new lqeggnwhkg(this.f98372jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98374zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
                ChangeProductParams changeProductParams = this.f98372jyumaefscl;
                this.f98374zdlpuopuiu = 1;
                if (yggfygwlheVar.nuxfzjnpeb(changeProductParams, this) == objGxszxtbevo) {
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
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class mbcevpiqjq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98375zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98376zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$mbcevpiqjq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2339iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98378yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98379zdlpuopuiu;

                public C2339iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98379zdlpuopuiu = obj;
                    this.f98378yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98376zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2339iobyxmoadg c2339iobyxmoadg;
                if (gxszxtbevoVar instanceof C2339iobyxmoadg) {
                    c2339iobyxmoadg = (C2339iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2339iobyxmoadg.f98378yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2339iobyxmoadg.f98378yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2339iobyxmoadg = new C2339iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2339iobyxmoadg = new C2339iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2339iobyxmoadg.f98379zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2339iobyxmoadg.f98378yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98376zdlpuopuiu;
                    zoijcleaow.C2353zoijcleaow c2353zoijcleaow = new zoijcleaow.C2353zoijcleaow((UserBalance) obj);
                    c2339iobyxmoadg.f98378yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2353zoijcleaow, c2339iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public mbcevpiqjq(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98375zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98375zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ntlheqmsrt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98380zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98381zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$ntlheqmsrt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2340iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98383yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98384zdlpuopuiu;

                public C2340iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98384zdlpuopuiu = obj;
                    this.f98383yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98381zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2340iobyxmoadg c2340iobyxmoadg;
                if (gxszxtbevoVar instanceof C2340iobyxmoadg) {
                    c2340iobyxmoadg = (C2340iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2340iobyxmoadg.f98383yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2340iobyxmoadg.f98383yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2340iobyxmoadg = new C2340iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2340iobyxmoadg = new C2340iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2340iobyxmoadg.f98384zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2340iobyxmoadg.f98383yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98381zdlpuopuiu;
                    UserInfo userInfoAgeimvtcrz = ((UserState) obj).ageimvtcrz();
                    c2340iobyxmoadg.f98383yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(userInfoAgeimvtcrz, c2340iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ntlheqmsrt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98380zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98380zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f98385iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f98386jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f98387yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98388zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, yggfygwlhe.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((yggfygwlhe) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            ppxfxbqfkf(Object obj) {
                super(1, obj, yggfygwlhe.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((yggfygwlhe) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, yggfygwlhe.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((yggfygwlhe) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(zoijcleaow zoijcleaowVar, yggfygwlhe yggfygwlheVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98386jyumaefscl = zoijcleaowVar;
            this.f98385iwizpuwonk = yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f98386jyumaefscl, this.f98385iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object value;
            ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm oxmwwwfdhmVar;
            be1.zoijcleaow zoijcleaowVar;
            String strWkgbmnqykc;
            zoijcleaow zoijcleaowVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98387yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar3 = this.f98386jyumaefscl;
                if (zoijcleaowVar3 instanceof zoijcleaow.wkgbmnqykc) {
                    kr0.wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("MOB-7588", "MySparViewModel VisibilityEvent.City = " + zoijcleaowVar3, true);
                    this.f98385iwizpuwonk.p(((zoijcleaow.wkgbmnqykc) this.f98386jyumaefscl).iobyxmoadg());
                    tg.iobyxmoadg iobyxmoadgVarTbqsvytpvh = this.f98385iwizpuwonk.tbqsvytpvh();
                    if (iobyxmoadgVarTbqsvytpvh != null) {
                        iobyxmoadgVarTbqsvytpvh.invoke();
                    }
                    this.f98385iwizpuwonk.u();
                    be1.zoijcleaow zoijcleaowVar4 = this.f98385iwizpuwonk.f98241istkbnxepw;
                    pz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((zoijcleaow.wkgbmnqykc) this.f98386jyumaefscl).iobyxmoadg();
                    iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f98385iwizpuwonk);
                    this.f98387yggfygwlhe = 1;
                    if (zoijcleaowVar4.esjtqupxsv(iobyxmoadgVarIobyxmoadg, iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    this.f98385iwizpuwonk.skhdrjzrfn();
                } else if (zoijcleaowVar3 instanceof zoijcleaow.ppxfxbqfkf) {
                    zoijcleaowVar = this.f98385iwizpuwonk.f98241istkbnxepw;
                    m01.iobyxmoadg iobyxmoadgVar2 = this.f98385iwizpuwonk.f98237gtknphoqwx;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f98388zdlpuopuiu = zoijcleaowVar;
                    this.f98387yggfygwlhe = 2;
                    obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    strWkgbmnqykc = ((pz0.iobyxmoadg) obj).wkgbmnqykc();
                    zoijcleaowVar2 = new zoijcleaow(this.f98385iwizpuwonk);
                    this.f98388zdlpuopuiu = null;
                    this.f98387yggfygwlhe = 3;
                    if (zoijcleaowVar.yggfygwlhe(strWkgbmnqykc, zoijcleaowVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (zoijcleaowVar3 instanceof zoijcleaow.eablkybsjg) {
                    this.f98385iwizpuwonk.f98260ulzqkzuiru = ((zoijcleaow.eablkybsjg) zoijcleaowVar3).iobyxmoadg();
                    sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = this.f98385iwizpuwonk.ojitshcjhn();
                    yggfygwlhe yggfygwlheVar = this.f98385iwizpuwonk;
                    zoijcleaow zoijcleaowVar5 = this.f98386jyumaefscl;
                    do {
                        value = zynmafqrjbVarOjitshcjhn.getValue();
                        oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value;
                    } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow(oxmwwwfdhmVar, yggfygwlheVar.f98253ojitshcjhn.draadjrbmk(oxmwwwfdhmVar.ppxfxbqfkf(), ((zoijcleaow.eablkybsjg) zoijcleaowVar5).iobyxmoadg()), false, false, false, 14, null)));
                } else if (zoijcleaowVar3 instanceof zoijcleaow.gxszxtbevo) {
                    gg.vdvldrhtss vdvldrhtssVarZoijcleaow = this.f98385iwizpuwonk.f98244jyumaefscl.zoijcleaow(((zoijcleaow.gxszxtbevo) this.f98386jyumaefscl).zoijcleaow(), ((zoijcleaow.gxszxtbevo) this.f98386jyumaefscl).iobyxmoadg(), ((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) this.f98385iwizpuwonk.getState().getValue()).ppxfxbqfkf());
                    if (vdvldrhtssVarZoijcleaow != null) {
                        this.f98385iwizpuwonk.L(vdvldrhtssVarZoijcleaow);
                    }
                } else if (zoijcleaowVar3 instanceof zoijcleaow.iobyxmoadg) {
                    this.f98385iwizpuwonk.u();
                    this.f98385iwizpuwonk.yggfygwlhe(ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.iobyxmoadg.f98154iobyxmoadg);
                    if (((zoijcleaow.iobyxmoadg) this.f98386jyumaefscl).iobyxmoadg() == null) {
                        this.f98385iwizpuwonk.w();
                    } else {
                        this.f98385iwizpuwonk.v();
                        this.f98385iwizpuwonk.f98238hcddaimhww.zoijcleaow();
                    }
                    this.f98385iwizpuwonk.f98236esjtqupxsv.iobyxmoadg();
                    be1.zoijcleaow zoijcleaowVar6 = this.f98385iwizpuwonk.f98241istkbnxepw;
                    ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f98385iwizpuwonk);
                    this.f98387yggfygwlhe = 4;
                    if (zoijcleaowVar6.pmvmpeiblj(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    this.f98385iwizpuwonk.skhdrjzrfn();
                } else {
                    if (!(zoijcleaowVar3 instanceof zoijcleaow.C2353zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserBalance userBalanceIobyxmoadg = ((zoijcleaow.C2353zoijcleaow) zoijcleaowVar3).iobyxmoadg();
                    this.f98385iwizpuwonk.L(df1.iobyxmoadg.gxszxtbevo.AbstractC0550iobyxmoadg.f28005zynmafqrjb.zoijcleaow(userBalanceIobyxmoadg != null ? bf1.gxszxtbevo.iobyxmoadg(userBalanceIobyxmoadg) : null));
                }
            } else if (i13 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f98385iwizpuwonk.skhdrjzrfn();
            } else if (i13 == 2) {
                zoijcleaowVar = (be1.zoijcleaow) this.f98388zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                strWkgbmnqykc = ((pz0.iobyxmoadg) obj).wkgbmnqykc();
                zoijcleaowVar2 = new zoijcleaow(this.f98385iwizpuwonk);
                this.f98388zdlpuopuiu = null;
                this.f98387yggfygwlhe = 3;
                if (zoijcleaowVar.yggfygwlhe(strWkgbmnqykc, zoijcleaowVar2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i13 == 3) {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f98385iwizpuwonk.skhdrjzrfn();
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ojitshcjhn implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98389zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98390zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$ojitshcjhn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2341iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98392yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98393zdlpuopuiu;

                public C2341iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98393zdlpuopuiu = obj;
                    this.f98392yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98390zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2341iobyxmoadg c2341iobyxmoadg;
                if (gxszxtbevoVar instanceof C2341iobyxmoadg) {
                    c2341iobyxmoadg = (C2341iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2341iobyxmoadg.f98392yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2341iobyxmoadg.f98392yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2341iobyxmoadg = new C2341iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2341iobyxmoadg = new C2341iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2341iobyxmoadg.f98393zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2341iobyxmoadg.f98392yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98390zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2341iobyxmoadg.f98392yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2341iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ojitshcjhn(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98389zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98389zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class oxmwwwfdhm implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98394zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98395zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$oxmwwwfdhm$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2342iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98397yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98398zdlpuopuiu;

                public C2342iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98398zdlpuopuiu = obj;
                    this.f98397yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98395zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2342iobyxmoadg c2342iobyxmoadg;
                boolean z13;
                if (gxszxtbevoVar instanceof C2342iobyxmoadg) {
                    c2342iobyxmoadg = (C2342iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2342iobyxmoadg.f98397yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2342iobyxmoadg.f98397yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2342iobyxmoadg = new C2342iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2342iobyxmoadg = new C2342iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2342iobyxmoadg.f98398zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2342iobyxmoadg.f98397yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98395zdlpuopuiu;
                    List list = (List) obj;
                    if (list != null && list.isEmpty()) {
                        z13 = true;
                        break;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = true;
                            break;
                        }
                        if (((df1.iobyxmoadg) it.next()).wkgbmnqykc()) {
                            z13 = false;
                            break;
                        }
                    }
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
                    c2342iobyxmoadg.f98397yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2342iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public oxmwwwfdhm(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98394zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98394zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class pkzmftpjix extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f98399jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98400yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98401zdlpuopuiu;

        pkzmftpjix(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((gg.vdvldrhtss) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98401zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg(((gg.vdvldrhtss) this.f98400yggfygwlhe).nufgyqmvbu(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f98399jyumaefscl));
        }

        public final Object ojitshcjhn(gg.vdvldrhtss vdvldrhtssVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            pkzmftpjix pkzmftpjixVar = new pkzmftpjix(gxszxtbevoVar);
            pkzmftpjixVar.f98400yggfygwlhe = vdvldrhtssVar;
            pkzmftpjixVar.f98399jyumaefscl = z13;
            return pkzmftpjixVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f98402iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f98403jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f98404yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98405zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar, yggfygwlhe yggfygwlheVar) {
            super(3, gxszxtbevoVar);
            this.f98402iwizpuwonk = yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98405zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f98404yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f98403jyumaefscl).booleanValue() ? this.f98402iwizpuwonk.uawqvzlxes().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f98405zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarZoijcleaow, this) == objGxszxtbevo) {
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

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar, this.f98402iwizpuwonk);
            pmvmpeibljVar.f98404yggfygwlhe = nufgyqmvbuVar;
            pmvmpeibljVar.f98403jyumaefscl = obj;
            return pmvmpeibljVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f98406iobyxmoadg;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.SECTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.PRODUCTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f98406iobyxmoadg = iArr;
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98407zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98408zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2343iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98410yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98411zdlpuopuiu;

                public C2343iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98411zdlpuopuiu = obj;
                    this.f98410yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98408zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2343iobyxmoadg c2343iobyxmoadg;
                if (gxszxtbevoVar instanceof C2343iobyxmoadg) {
                    c2343iobyxmoadg = (C2343iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2343iobyxmoadg.f98410yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2343iobyxmoadg.f98410yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2343iobyxmoadg = new C2343iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2343iobyxmoadg = new C2343iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2343iobyxmoadg.f98411zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2343iobyxmoadg.f98410yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98408zdlpuopuiu;
                    List listZfvoamnweg = hg.jyumaefscl.zfvoamnweg(((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) obj).ppxfxbqfkf().values());
                    c2343iobyxmoadg.f98410yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listZfvoamnweg, c2343iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public rgvfuqvkyq(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98407zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98407zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class sopmlzcsov extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98413zdlpuopuiu;

        sopmlzcsov(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new sopmlzcsov(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98413zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.f98265yadqdtsiqt.clear();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserInfo userInfo, lg.gxszxtbevo gxszxtbevoVar) {
            return ((sopmlzcsov) create(userInfo, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class stevsuqkhv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98414zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98415zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$stevsuqkhv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2344iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98417yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98418zdlpuopuiu;

                public C2344iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98418zdlpuopuiu = obj;
                    this.f98417yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98415zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2344iobyxmoadg c2344iobyxmoadg;
                if (gxszxtbevoVar instanceof C2344iobyxmoadg) {
                    c2344iobyxmoadg = (C2344iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2344iobyxmoadg.f98417yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2344iobyxmoadg.f98417yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2344iobyxmoadg = new C2344iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2344iobyxmoadg = new C2344iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2344iobyxmoadg.f98418zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2344iobyxmoadg.f98417yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98415zdlpuopuiu;
                    UserNews userNews = (UserNews) obj;
                    zoijcleaow.gxszxtbevo gxszxtbevoVar2 = new zoijcleaow.gxszxtbevo(userNews.getDiscounts(), userNews.getChatSupportMessages());
                    c2344iobyxmoadg.f98417yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(gxszxtbevoVar2, c2344iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public stevsuqkhv(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98414zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98414zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class tzroggbefp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98419yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98420zdlpuopuiu;

        tzroggbefp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            tzroggbefp tzroggbefpVar = new tzroggbefp(gxszxtbevoVar);
            tzroggbefpVar.f98419yggfygwlhe = obj;
            return tzroggbefpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98420zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            pz0.iobyxmoadg iobyxmoadgVar = (pz0.iobyxmoadg) this.f98419yggfygwlhe;
            kr0.wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("MOB-7588", "MySparViewModel subscribeToCurrentDeliveryDataUseCase = " + iobyxmoadgVar, true);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((tzroggbefp) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ulzqkzuiru implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98421zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98422zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$ulzqkzuiru$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2345iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98424yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98425zdlpuopuiu;

                public C2345iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98425zdlpuopuiu = obj;
                    this.f98424yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98422zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2345iobyxmoadg c2345iobyxmoadg;
                if (gxszxtbevoVar instanceof C2345iobyxmoadg) {
                    c2345iobyxmoadg = (C2345iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2345iobyxmoadg.f98424yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2345iobyxmoadg.f98424yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2345iobyxmoadg = new C2345iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2345iobyxmoadg = new C2345iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2345iobyxmoadg.f98425zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2345iobyxmoadg.f98424yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98422zdlpuopuiu;
                    zoijcleaow.iobyxmoadg iobyxmoadgVar = new zoijcleaow.iobyxmoadg((UserInfo) obj);
                    c2345iobyxmoadg.f98424yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c2345iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ulzqkzuiru(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98421zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98421zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98426zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98427zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2346iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98429yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98430zdlpuopuiu;

                public C2346iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98430zdlpuopuiu = obj;
                    this.f98429yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98427zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2346iobyxmoadg c2346iobyxmoadg;
                if (gxszxtbevoVar instanceof C2346iobyxmoadg) {
                    c2346iobyxmoadg = (C2346iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2346iobyxmoadg.f98429yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2346iobyxmoadg.f98429yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2346iobyxmoadg = new C2346iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2346iobyxmoadg = new C2346iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2346iobyxmoadg.f98430zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2346iobyxmoadg.f98429yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98427zdlpuopuiu;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((df1.iobyxmoadg) obj3).eablkybsjg()) {
                            arrayList.add(obj3);
                        }
                    }
                    c2346iobyxmoadg.f98429yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(arrayList, c2346iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public vdvldrhtss(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98426zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98426zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98431zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98432zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$wflxmlrfwp$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2347iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98434yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98435zdlpuopuiu;

                public C2347iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98435zdlpuopuiu = obj;
                    this.f98434yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98432zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2347iobyxmoadg c2347iobyxmoadg;
                if (gxszxtbevoVar instanceof C2347iobyxmoadg) {
                    c2347iobyxmoadg = (C2347iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2347iobyxmoadg.f98434yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2347iobyxmoadg.f98434yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2347iobyxmoadg = new C2347iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2347iobyxmoadg = new C2347iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2347iobyxmoadg.f98435zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2347iobyxmoadg.f98434yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98432zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2347iobyxmoadg.f98434yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2347iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wflxmlrfwp(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98431zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98431zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f98436iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f98437jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98439zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98437jyumaefscl = comboSetProduct;
            this.f98436iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new wkgbmnqykc(this.f98437jyumaefscl, this.f98436iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objAgtfadlqog;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98439zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                yggfygwlhe.this.t(true);
                cz0.iobyxmoadg iobyxmoadgVar = yggfygwlhe.this.f98235dxjokdxxww;
                ComboSetProduct comboSetProduct = this.f98437jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f98436iwizpuwonk;
                this.f98439zdlpuopuiu = 1;
                objAgtfadlqog = iobyxmoadgVar.agtfadlqog(comboSetProduct, comboSetProduct2, this);
                if (objAgtfadlqog == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objAgtfadlqog = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
            if (gg.kcexrzcfyt.agtfadlqog(objAgtfadlqog)) {
                yggfygwlheVar.dvvnrvtcbc(((kz0.iobyxmoadg) objAgtfadlqog).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objAgtfadlqog);
            if (thDxjokdxxww != null) {
                yggfygwlheVar.zdlpuopuiu(thDxjokdxxww);
            }
            yggfygwlhe.this.ppxfxbqfkf(null);
            yggfygwlhe.this.t(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wwaezpbzkn implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f98440yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98441zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ yggfygwlhe f98442yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98443zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$wwaezpbzkn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2348iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98445yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98446zdlpuopuiu;

                public C2348iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98446zdlpuopuiu = obj;
                    this.f98445yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, yggfygwlhe yggfygwlheVar) {
                this.f98443zdlpuopuiu = nufgyqmvbuVar;
                this.f98442yggfygwlhe = yggfygwlheVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2348iobyxmoadg c2348iobyxmoadg;
                if (gxszxtbevoVar instanceof C2348iobyxmoadg) {
                    c2348iobyxmoadg = (C2348iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2348iobyxmoadg.f98445yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2348iobyxmoadg.f98445yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2348iobyxmoadg = new C2348iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2348iobyxmoadg = new C2348iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2348iobyxmoadg.f98446zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2348iobyxmoadg.f98445yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98443zdlpuopuiu;
                    if (((Boolean) obj).booleanValue() && ((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) this.f98442yggfygwlhe.getState().getValue()).gxszxtbevo()) {
                        c2348iobyxmoadg.f98445yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2348iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wwaezpbzkn(sj.lqeggnwhkg lqeggnwhkgVar, yggfygwlhe yggfygwlheVar) {
            this.f98441zdlpuopuiu = lqeggnwhkgVar;
            this.f98440yggfygwlhe = yggfygwlheVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98441zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f98440yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class wypolnanlu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98447zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98448zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$wypolnanlu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2349iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98450yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98451zdlpuopuiu;

                public C2349iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98451zdlpuopuiu = obj;
                    this.f98450yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98448zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2349iobyxmoadg c2349iobyxmoadg;
                if (gxszxtbevoVar instanceof C2349iobyxmoadg) {
                    c2349iobyxmoadg = (C2349iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2349iobyxmoadg.f98450yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2349iobyxmoadg.f98450yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2349iobyxmoadg = new C2349iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2349iobyxmoadg = new C2349iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2349iobyxmoadg.f98451zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2349iobyxmoadg.f98450yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98448zdlpuopuiu;
                    zoijcleaow.eablkybsjg eablkybsjgVar = new zoijcleaow.eablkybsjg((List) obj);
                    c2349iobyxmoadg.f98450yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVar, c2349iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wypolnanlu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98447zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98447zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class yadqdtsiqt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98453yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98454zdlpuopuiu;

        yadqdtsiqt(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yadqdtsiqt yadqdtsiqtVar = yggfygwlhe.this.new yadqdtsiqt(gxszxtbevoVar);
            yadqdtsiqtVar.f98453yggfygwlhe = obj;
            return yadqdtsiqtVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98454zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                List list = (List) this.f98453yggfygwlhe;
                be1.zoijcleaow zoijcleaowVar = yggfygwlhe.this.f98241istkbnxepw;
                be1.iobyxmoadg.gtknphoqwx gtknphoqwxVar = new be1.iobyxmoadg.gtknphoqwx(list);
                this.f98454zdlpuopuiu = 1;
                if (zoijcleaowVar.zynmafqrjb(gtknphoqwxVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yadqdtsiqt) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$yggfygwlhe, reason: collision with other inner class name */
    static final class C2350yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98456zdlpuopuiu;

        C2350yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return yggfygwlhe.this.new C2350yggfygwlhe(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98456zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe.this.f98242iwizpuwonk.zoijcleaow(ym0.eablkybsjg.zoijcleaow.f125942gxszxtbevo);
            yggfygwlhe.this.f98242iwizpuwonk.zoijcleaow(ym0.eablkybsjg.iobyxmoadg.f125930gxszxtbevo);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2350yggfygwlhe) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ylkuphrtab implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98457zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98458zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$ylkuphrtab$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2351iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98460yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98461zdlpuopuiu;

                public C2351iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98461zdlpuopuiu = obj;
                    this.f98460yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98458zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2351iobyxmoadg c2351iobyxmoadg;
                if (gxszxtbevoVar instanceof C2351iobyxmoadg) {
                    c2351iobyxmoadg = (C2351iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2351iobyxmoadg.f98460yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2351iobyxmoadg.f98460yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2351iobyxmoadg = new C2351iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2351iobyxmoadg = new C2351iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2351iobyxmoadg.f98461zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2351iobyxmoadg.f98460yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98458zdlpuopuiu;
                    gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) obj;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!((Boolean) vdvldrhtssVar.iobyxmoadg()).booleanValue() && ((Boolean) vdvldrhtssVar.wkgbmnqykc()).booleanValue());
                    c2351iobyxmoadg.f98460yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2351iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ylkuphrtab(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98457zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98457zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f98462zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f98463zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2352iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f98465yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f98466zdlpuopuiu;

                public C2352iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f98466zdlpuopuiu = obj;
                    this.f98465yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f98463zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2352iobyxmoadg c2352iobyxmoadg;
                boolean z13;
                if (gxszxtbevoVar instanceof C2352iobyxmoadg) {
                    c2352iobyxmoadg = (C2352iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2352iobyxmoadg.f98465yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2352iobyxmoadg.f98465yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2352iobyxmoadg = new C2352iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2352iobyxmoadg = new C2352iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2352iobyxmoadg.f98466zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2352iobyxmoadg.f98465yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f98463zdlpuopuiu;
                    List list = (List) obj;
                    if (list != null && list.isEmpty()) {
                        z13 = true;
                        break;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = true;
                            break;
                        }
                        if (((df1.iobyxmoadg) it.next()).wkgbmnqykc()) {
                            z13 = false;
                            break;
                        }
                    }
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
                    c2352iobyxmoadg.f98465yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2352iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zdlpuopuiu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f98462zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f98462zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private static abstract class zoijcleaow implements er0.iobyxmoadg {

        public static final class eablkybsjg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f98467iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f98468zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public eablkybsjg(List productData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productData, "productData");
                this.f98467iobyxmoadg = productData;
                this.f98468zoijcleaow = "products";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98467iobyxmoadg, ((eablkybsjg) obj).f98467iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98468zoijcleaow;
            }

            public int hashCode() {
                return this.f98467iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f98467iobyxmoadg;
            }

            public String toString() {
                return "Products(productData=" + this.f98467iobyxmoadg + ")";
            }
        }

        public static final class gxszxtbevo extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f98469iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f98470ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f98471zoijcleaow;

            public gxszxtbevo(int i13, int i14) {
                super(null);
                this.f98469iobyxmoadg = i13;
                this.f98471zoijcleaow = i14;
                this.f98470ppxfxbqfkf = "unread_user_news";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof gxszxtbevo)) {
                    return false;
                }
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
                return this.f98469iobyxmoadg == gxszxtbevoVar.f98469iobyxmoadg && this.f98471zoijcleaow == gxszxtbevoVar.f98471zoijcleaow;
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98470ppxfxbqfkf;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f98469iobyxmoadg) * 31) + Integer.hashCode(this.f98471zoijcleaow);
            }

            public final int iobyxmoadg() {
                return this.f98471zoijcleaow;
            }

            public String toString() {
                return "UnreadUserNews(unreadDiscounts=" + this.f98469iobyxmoadg + ", unreadChatSupportMessages=" + this.f98471zoijcleaow + ")";
            }

            public final int zoijcleaow() {
                return this.f98469iobyxmoadg;
            }
        }

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final UserInfo f98472iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f98473zoijcleaow;

            public iobyxmoadg(UserInfo userInfo) {
                super(null);
                this.f98472iobyxmoadg = userInfo;
                this.f98473zoijcleaow = "user_id";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98472iobyxmoadg, ((iobyxmoadg) obj).f98472iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98473zoijcleaow;
            }

            public int hashCode() {
                UserInfo userInfo = this.f98472iobyxmoadg;
                if (userInfo == null) {
                    return 0;
                }
                return userInfo.hashCode();
            }

            public final UserInfo iobyxmoadg() {
                return this.f98472iobyxmoadg;
            }

            public String toString() {
                return "Auth(userInfo=" + this.f98472iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f98474iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f98475zoijcleaow;

            public ppxfxbqfkf(String str) {
                super(null);
                this.f98474iobyxmoadg = str;
                this.f98475zoijcleaow = "banners";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98474iobyxmoadg, ((ppxfxbqfkf) obj).f98474iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98475zoijcleaow;
            }

            public int hashCode() {
                String str = this.f98474iobyxmoadg;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Banners(userPhone=" + this.f98474iobyxmoadg + ")";
            }
        }

        public static final class wkgbmnqykc extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final pz0.iobyxmoadg f98476iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f98477zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(pz0.iobyxmoadg deliveryData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
                this.f98476iobyxmoadg = deliveryData;
                this.f98477zoijcleaow = "changeCurrentShop";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98476iobyxmoadg, ((wkgbmnqykc) obj).f98476iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98477zoijcleaow;
            }

            public int hashCode() {
                return this.f98476iobyxmoadg.hashCode();
            }

            public final pz0.iobyxmoadg iobyxmoadg() {
                return this.f98476iobyxmoadg;
            }

            public String toString() {
                return "ChangeDeliveryData(deliveryData=" + this.f98476iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.yggfygwlhe$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2353zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final UserBalance f98478iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f98479zoijcleaow;

            public C2353zoijcleaow(UserBalance userBalance) {
                super(null);
                this.f98478iobyxmoadg = userBalance;
                this.f98479zoijcleaow = "balance";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2353zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98478iobyxmoadg, ((C2353zoijcleaow) obj).f98478iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f98479zoijcleaow;
            }

            public int hashCode() {
                UserBalance userBalance = this.f98478iobyxmoadg;
                if (userBalance == null) {
                    return 0;
                }
                return userBalance.hashCode();
            }

            public final UserBalance iobyxmoadg() {
                return this.f98478iobyxmoadg;
            }

            public String toString() {
                return "Balance(userBalance=" + this.f98478iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98481yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98482zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zynmafqrjb zynmafqrjbVar = yggfygwlhe.this.new zynmafqrjb(gxszxtbevoVar);
            zynmafqrjbVar.f98481yggfygwlhe = obj;
            return zynmafqrjbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98482zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f98481yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                yggfygwlhe.this.j(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                yggfygwlhe.this.m(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zynmafqrjb) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(ow1.wflxmlrfwp fetchAndSaveIsAgreementAcceptedUseCase, cz0.iobyxmoadg cartInteractor, ee1.wkgbmnqykc getPromotionUseCase, m01.iobyxmoadg getCurrentDeliveryDataUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, e11.iobyxmoadg getMainPermissionsUseCase, ow1.esjtqupxsv isAuthUseCase, ye1.eablkybsjg mySparUiMapper, i01.eablkybsjg changePromotionObserver, cu1.iobyxmoadg changeSubscribeTicketsObserver, kc1.iobyxmoadg loyaltyCategoriesSelectedObserver, p01.ppxfxbqfkf clearCartUseCase, ow1.iwizpuwonk isAdultCheckedUseCase, ow1.zoijcleaow changeAdultCheckedUseCase, af1.zoijcleaow featuresMyCouponsUpdateBadgeMapper, vm0.zoijcleaow analyticsTracker, dz0.gtknphoqwx productChangesSourceProvider, sc1.iobyxmoadg dialogsInteractor, an0.iobyxmoadg authFeatureApi, mn1.iobyxmoadg scanGoFeatureApi, q41.iobyxmoadg resourcesManager, be1.zoijcleaow sectionInteractor, ut1.iobyxmoadg getOnboardingStoryUseCase, u51.iobyxmoadg dialogManager, ow1.jpowsppfya subscribeUserStateUseCase, do0.gxszxtbevo subscribeUserBalanceUseCase, lw1.zoijcleaow userNewsInteractor, ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq mySparNavigation, fe1.iobyxmoadg mySparOpenScreenAnalytics, tu0.iobyxmoadg notificationsRepository, ur0.iobyxmoadg permissionManager, ut1.wkgbmnqykc observeStoriesUseCase, x21.zoijcleaow connectivityChecker, jt1.wkgbmnqykc subscribeShowedSplashScreenUseCase, do0.wkgbmnqykc getCachedUserBalanceUseCase, ow1.pkzmftpjix subscribeUserNewsUseCase, n91.ppxfxbqfkf comboSetUiMapper) {
        super(new ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm(null, false, false, false, 15, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchAndSaveIsAgreementAcceptedUseCase, "fetchAndSaveIsAgreementAcceptedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromotionUseCase, "getPromotionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMainPermissionsUseCase, "getMainPermissionsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparUiMapper, "mySparUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeSubscribeTicketsObserver, "changeSubscribeTicketsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loyaltyCategoriesSelectedObserver, "loyaltyCategoriesSelectedObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresMyCouponsUpdateBadgeMapper, "featuresMyCouponsUpdateBadgeMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogsInteractor, "dialogsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoFeatureApi, "scanGoFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionInteractor, "sectionInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserBalanceUseCase, "subscribeUserBalanceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userNewsInteractor, "userNewsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparNavigation, "mySparNavigation");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparOpenScreenAnalytics, "mySparOpenScreenAnalytics");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observeStoriesUseCase, "observeStoriesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityChecker, "connectivityChecker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeShowedSplashScreenUseCase, "subscribeShowedSplashScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCachedUserBalanceUseCase, "getCachedUserBalanceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserNewsUseCase, "subscribeUserNewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        this.f98249lqeggnwhkg = new pw0.ppxfxbqfkf();
        this.f98252nufgyqmvbu = fetchAndSaveIsAgreementAcceptedUseCase;
        this.f98235dxjokdxxww = cartInteractor;
        this.f98229btonecajqb = getPromotionUseCase;
        this.f98237gtknphoqwx = getCurrentDeliveryDataUseCase;
        this.f98233draadjrbmk = subscribeToCurrentDeliveryDataUseCase;
        this.f98262wflxmlrfwp = getMainPermissionsUseCase;
        this.f98228agtfadlqog = isAuthUseCase;
        this.f98253ojitshcjhn = mySparUiMapper;
        this.f98257rgvfuqvkyq = changePromotionObserver;
        this.f98261vdvldrhtss = changeSubscribeTicketsObserver;
        this.f98254oxmwwwfdhm = loyaltyCategoriesSelectedObserver;
        this.f98245kcexrzcfyt = clearCartUseCase;
        this.f98268zdlpuopuiu = isAdultCheckedUseCase;
        this.f98266yggfygwlhe = changeAdultCheckedUseCase;
        this.f98244jyumaefscl = featuresMyCouponsUpdateBadgeMapper;
        this.f98242iwizpuwonk = analyticsTracker;
        this.f98232cqumvgiudr = productChangesSourceProvider;
        this.f98236esjtqupxsv = dialogsInteractor;
        this.f98247lereixgezr = authFeatureApi;
        this.f98256pmvmpeiblj = scanGoFeatureApi;
        this.f98269zynmafqrjb = resourcesManager;
        this.f98241istkbnxepw = sectionInteractor;
        this.f98230cdpycssgdh = getOnboardingStoryUseCase;
        this.f98265yadqdtsiqt = dialogManager;
        this.f98240iozdgvuglv = subscribeUserStateUseCase;
        this.f98248lmojexxdyd = subscribeUserBalanceUseCase;
        this.f98263wwaezpbzkn = userNewsInteractor;
        this.f98267ylkuphrtab = mySparNavigation;
        this.f98255pkzmftpjix = mySparOpenScreenAnalytics;
        this.f98238hcddaimhww = notificationsRepository;
        this.f98243jpowsppfya = permissionManager;
        this.f98239hkdspvbjdz = observeStoriesUseCase;
        this.f98231cllcsxoeiz = connectivityChecker;
        this.f98234dsvhmnatus = subscribeShowedSplashScreenUseCase;
        this.f98264wypolnanlu = getCachedUserBalanceUseCase;
        this.f98258stevsuqkhv = subscribeUserNewsUseCase;
        this.f98246kegysxyocb = comboSetUiMapper;
        this.f98259tzroggbefp = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return yggfygwlhe.n(this.f98483zdlpuopuiu);
            }
        });
        this.f98260ulzqkzuiru = hg.jyumaefscl.wflxmlrfwp();
        C();
        D();
        F();
        A();
        B();
        z();
        x();
        E();
        y();
        H();
        G();
        l();
    }

    private final void A() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(auzgnhcxok(), new pmvmpeiblj(null, this)), new zynmafqrjb(null)), agtfadlqog());
    }

    private final void B() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f98257rgvfuqvkyq.nufgyqmvbu(), new istkbnxepw(null)), new cdpycssgdh(null)), agtfadlqog());
    }

    private final void C() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.lereixgezr(this.f98239hkdspvbjdz.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)), new yadqdtsiqt(null)), agtfadlqog());
    }

    private final void D() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f98261vdvldrhtss.nufgyqmvbu(), new iozdgvuglv(null)), new lmojexxdyd(null)), agtfadlqog());
    }

    private final void E() {
        boolean zIsConnected = this.f98231cllcsxoeiz.isConnected();
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(new wwaezpbzkn(new ylkuphrtab(sj.dxjokdxxww.jlmebxxoox(this.f98231cllcsxoeiz.getState(), gg.cqumvgiudr.iobyxmoadg(Boolean.valueOf(zIsConnected), Boolean.valueOf(zIsConnected)), new pkzmftpjix(null))), this)), new hcddaimhww(null)), agtfadlqog());
    }

    private final auzgnhcxok F() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new jpowsppfya(null), 3, null);
    }

    private final void G() {
        sj.lqeggnwhkg lqeggnwhkgVarAuzgnhcxok = auzgnhcxok();
        m01.nufgyqmvbu nufgyqmvbuVar = this.f98233draadjrbmk;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(er0.lqeggnwhkg.iobyxmoadg(lqeggnwhkgVarAuzgnhcxok, new hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(nufgyqmvbuVar.zoijcleaow(wwaezpbzknVar), new tzroggbefp(null))), new dsvhmnatus(sj.dxjokdxxww.vdvldrhtss(new cllcsxoeiz((sj.lqeggnwhkg) this.f98240iozdgvuglv.zoijcleaow(wwaezpbzknVar)))), new wypolnanlu(uawqvzlxes().iobyxmoadg()), new stevsuqkhv((sj.lqeggnwhkg) this.f98258stevsuqkhv.zoijcleaow(wwaezpbzknVar))), new kegysxyocb(null)), agtfadlqog());
    }

    private final void H() {
        sj.lqeggnwhkg lqeggnwhkgVarAuzgnhcxok = auzgnhcxok();
        do0.gxszxtbevo gxszxtbevoVar = this.f98248lmojexxdyd;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(er0.lqeggnwhkg.iobyxmoadg(lqeggnwhkgVarAuzgnhcxok, new mbcevpiqjq(sj.dxjokdxxww.vdvldrhtss((sj.lqeggnwhkg) gxszxtbevoVar.zoijcleaow(wwaezpbzknVar))), new ulzqkzuiru(sj.dxjokdxxww.kegysxyocb(new ntlheqmsrt(sj.dxjokdxxww.vdvldrhtss((sj.lqeggnwhkg) this.f98240iozdgvuglv.zoijcleaow(wwaezpbzknVar))), new sopmlzcsov(null)))), new crxdokpmqz(null)), agtfadlqog());
    }

    private final void I(ProductUiModel productUiModel, boolean z13, String str, boolean z14) {
        Object value;
        ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm oxmwwwfdhmVar;
        LinkedHashMap linkedHashMap;
        b21.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value;
            Map mapPpxfxbqfkf = oxmwwwfdhmVar.ppxfxbqfkf();
            linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapPpxfxbqfkf.size()));
            for (Map.Entry entry : mapPpxfxbqfkf.entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg abstractC0530iobyxmoadg = value2 instanceof df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg ? (df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) value2 : null;
                if (abstractC0530iobyxmoadg == null) {
                    ppxfxbqfkfVarNufgyqmvbu = (df1.iobyxmoadg) entry.getValue();
                } else {
                    CounterModel counterModel = productUiModel.getCounterModel();
                    ppxfxbqfkfVarNufgyqmvbu = abstractC0530iobyxmoadg.nufgyqmvbu(bf1.zoijcleaow.zoijcleaow(abstractC0530iobyxmoadg.lqeggnwhkg(), null, null, jr0.wkgbmnqykc.dxjokdxxww(abstractC0530iobyxmoadg.lqeggnwhkg().eablkybsjg(), productUiModel, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : z13, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : str, (14714 & 4096) != 0 ? counterModel.autoHideMessage : z14, (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null)), null, null, null, 59, null));
                }
                linkedHashMap.put(key, ppxfxbqfkfVarNufgyqmvbu);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow(oxmwwwfdhmVar, linkedHashMap, false, false, false, 14, null)));
    }

    static /* synthetic */ void J(yggfygwlhe yggfygwlheVar, ProductUiModel productUiModel, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        yggfygwlheVar.I(productUiModel, z13, str, z14);
    }

    private final void K() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new jlmebxxoox(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(gg.vdvldrhtss vdvldrhtssVar) {
        Object value;
        ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm oxmwwwfdhmVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value;
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(oxmwwwfdhmVar.ppxfxbqfkf());
            mapIwizpuwonk.replace(vdvldrhtssVar.lqeggnwhkg(), vdvldrhtssVar.nufgyqmvbu());
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow(oxmwwwfdhmVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    private final void a(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.eablkybsjg(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, AnalyticsPage.MainScreen.f92334iwizpuwonk, analyticsLocation)));
    }

    private final void ageimvtcrz(String str) {
        this.f98267ylkuphrtab.lqeggnwhkg(str);
    }

    private final void b(ProductUiModel productUiModel, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
        ProductUIData productUIData;
        List limits;
        List listIobyxmoadg;
        Object next;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                I(productUiModel, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                J(this, productUiModel, false, null, false, 12, null);
                return;
            }
        }
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(AnalyticsPage.MainScreen.f92334iwizpuwonk, analyticsLocation, productUiModel.getName());
        List list = this.f98260ulzqkzuiru;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
            productUIData = (ProductUIData) next;
        } else {
            productUIData = null;
        }
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(new ChangeProductParams(productUiModel.getId(), productUiModel.getArticle(), zoijcleaowVarIobyxmoadg, productUiModel.getAvailabilityModel().getIsAvailableToBuy(), productUiModel.getIsPmProduct(), productUiModel.getMeasureTypeModel(), productUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = q11.zoijcleaow.iobyxmoadg(limits)) == null) ? productUiModel.getLimits() : listIobyxmoadg, changeProductAnalyticParams), null), 3, null);
    }

    private final void c(df1.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow zoijcleaowVar) {
        k21.ojitshcjhn ojitshcjhnVarBtonecajqb = zoijcleaowVar.btonecajqb();
        if (ojitshcjhnVarBtonecajqb == null || !ojitshcjhnVarBtonecajqb.nufgyqmvbu() || zoijcleaowVar.draadjrbmk() == null) {
            ageimvtcrz(zoijcleaowVar.gtknphoqwx());
        } else {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhnVarBtonecajqb, zoijcleaowVar.draadjrbmk(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f92334iwizpuwonk, null, null, 6, null), false, 184, null));
        }
    }

    private final void d(ProductUiModel productUiModel, ot0.zoijcleaow zoijcleaowVar) {
        fyldjkxazc(productUiModel, zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc(Warning warning) {
        if ((warning instanceof Warning.AvailableOnlyForPickup) || (warning instanceof Warning.Interval)) {
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f95255jyumaefscl)) {
            yggfygwlhe(ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.ppxfxbqfkf.f98157iobyxmoadg);
        } else {
            if (!(warning instanceof Warning.WithCodeAndMessage) && !(warning instanceof Warning.DailyLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.btonecajqb(warning.getMessage()));
        }
    }

    private final void e(ot0.zoijcleaow zoijcleaowVar) {
    }

    private final void ezmngbhpjk(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        if (igdgnonuha()) {
            zeieaojujs(comboSetProduct, comboSetProduct2);
        } else {
            this.f98267ylkuphrtab.iobyxmoadg();
        }
    }

    private final void f(bf1.zoijcleaow zoijcleaowVar) {
        mz0.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.nufgyqmvbu() == bf1.zoijcleaow.iobyxmoadg.NEW ? mz0.iobyxmoadg.NEW_PRODUCTS : mz0.iobyxmoadg.DEFAULT;
        int i13 = ppxfxbqfkf.f98406iobyxmoadg[zoijcleaowVar.ppxfxbqfkf().ordinal()];
        if (i13 == 1) {
            this.f98267ylkuphrtab.agtfadlqog(new SubCatalogArgs(iobyxmoadgVar, null, zoijcleaowVar.gxszxtbevo(), zoijcleaowVar.lqeggnwhkg(), 2, null));
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                this.f98267ylkuphrtab.btonecajqb(new SpecialProductsWebViewArgs(zoijcleaowVar.gxszxtbevo(), zoijcleaowVar.lqeggnwhkg()));
                return;
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ProductListPayload productListPayload = new ProductListPayload(iobyxmoadgVar, null, zoijcleaowVar.gxszxtbevo(), null, null, zoijcleaowVar.lqeggnwhkg(), null, null, false, 474, null);
        ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq rgvfuqvkyqVar = this.f98267ylkuphrtab;
        String lowerCase = zoijcleaowVar.nufgyqmvbu().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq.gxszxtbevo(rgvfuqvkyqVar, productListPayload, new AnalyticsLocation.ItemFeed(lowerCase, zoijcleaowVar.lqeggnwhkg()), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(String str, String str2) {
        ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq.gxszxtbevo(this.f98267ylkuphrtab, new ProductListPayload(null, null, null, null, str, str2, null, null, false, 463, null), null, null, 6, null);
    }

    private final void fmlbqenlif(ComboSetProduct comboSetProduct, wm0.zoijcleaow zoijcleaowVar) {
        this.f98267ylkuphrtab.draadjrbmk(new ProductPayload(new ProductPayload.Type.Article(comboSetProduct.getArticle()), null, 2, null), comboSetProduct.getArticle(), comboSetProduct.getName(), new AnalyticsLocation.ItemFeed(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()), new AnalyticElement.ProductItemElement(comboSetProduct.getArticle(), comboSetProduct.getName()));
    }

    private final void fyldjkxazc(ProductUiModel productUiModel, ot0.zoijcleaow zoijcleaowVar) {
        ProductPayload productPayload = new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null);
        this.f98267ylkuphrtab.draadjrbmk(productPayload, productUiModel.getArticle(), productUiModel.getName(), new AnalyticsLocation.ItemFeed(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()));
    }

    private final void g(bf1.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!ppxfxbqfkfVar.wkgbmnqykc() || ((Boolean) this.f98268zdlpuopuiu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            h(ppxfxbqfkfVar.iobyxmoadg());
        } else {
            yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(new iobyxmoadg.zoijcleaow(ppxfxbqfkfVar)));
        }
    }

    private final void grlcpdaxtj(String str) {
        this.f98267ylkuphrtab.wflxmlrfwp(new SpecificRestaurantArgs(str));
    }

    private final void h(String str) {
        yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.dxjokdxxww(new StoryPayload.Groups(str)));
        this.f98255pkzmftpjix.lqeggnwhkg(str, AnalyticsLocation.StoriesFeed.f92289iwizpuwonk, new AnalyticElement.StoryItemElement(str));
    }

    private final void hszhottldk() {
        this.f98267ylkuphrtab.wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(StoryItem storyItem, StoryNavLink storyNavLink) {
        StoryPayload.Onboarding onboarding = new StoryPayload.Onboarding(storyItem, storyNavLink);
        yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.dxjokdxxww(onboarding));
        this.f98255pkzmftpjix.lqeggnwhkg(onboarding.getStory().getId(), AnalyticsLocation.StoriesFeed.f92289iwizpuwonk, new AnalyticElement.StoryItemElement(onboarding.getStory().getId()));
    }

    private final boolean igdgnonuha() {
        return ((Boolean) wkgbmnqykc().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
    }

    private final void ipoelvxyzq(ProductUiModel productUiModel, bf1.zoijcleaow zoijcleaowVar) {
        ProductPayload productPayload = new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null);
        ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq rgvfuqvkyqVar = this.f98267ylkuphrtab;
        String article = productUiModel.getArticle();
        String name = productUiModel.getName();
        String lowerCase = zoijcleaowVar.nufgyqmvbu().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        rgvfuqvkyqVar.draadjrbmk(productPayload, article, name, new AnalyticsLocation.ItemFeed(lowerCase, zoijcleaowVar.lqeggnwhkg()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()));
    }

    private final void ixidwrxhsl() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, null, true, false, false, 13, null)));
        this.f98267ylkuphrtab.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Throwable th2) {
        if (th2 instanceof ProductDailyLimitException) {
            yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.btonecajqb(((ProductDailyLimitException) th2).getMessage()));
        } else {
            super.zdlpuopuiu(th2);
        }
    }

    private final auzgnhcxok jrbgnlbqoe(m91.gxszxtbevo gxszxtbevoVar, int i13) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(gxszxtbevoVar, i13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok k(zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new nufgyqmvbu(zoijcleaowVar, this, null), 3, null);
    }

    private final void krqnebusok(m91.nufgyqmvbu nufgyqmvbuVar, int i13) {
        int i14 = i13 + 1;
        i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
        String strGtknphoqwx = nufgyqmvbuVar.gtknphoqwx();
        k21.ojitshcjhn ojitshcjhnVarDxjokdxxww = nufgyqmvbuVar.dxjokdxxww();
        String strBtonecajqb = nufgyqmvbuVar.btonecajqb();
        AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f92334iwizpuwonk;
        m91.iobyxmoadg iobyxmoadgVarEablkybsjg = nufgyqmvbuVar.eablkybsjg();
        iobyxmoadgVar.pkzmftpjix(new NavigationPayload(ojitshcjhnVarDxjokdxxww, strBtonecajqb, strGtknphoqwx, null, false, null, new AnalyticsPayload(mainScreen, iobyxmoadgVarEablkybsjg != null ? new AnalyticsLocation.BannerFeed(iobyxmoadgVarEablkybsjg.iobyxmoadg(), iobyxmoadgVarEablkybsjg.zoijcleaow()) : null, new AnalyticElement.BannerItemElement(nufgyqmvbuVar.getId(), String.valueOf(i14))), false, 184, null));
    }

    private final auzgnhcxok l() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new dxjokdxxww(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(Throwable th2) {
        kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.btonecajqb(warning.getMessage()));
    }

    private final void mhtqkkgtqm(iobyxmoadg iobyxmoadgVar) {
        this.f98266yggfygwlhe.zoijcleaow(Boolean.TRUE);
        if (iobyxmoadgVar instanceof iobyxmoadg.C2334iobyxmoadg) {
            iobyxmoadg.C2334iobyxmoadg c2334iobyxmoadg = (iobyxmoadg.C2334iobyxmoadg) iobyxmoadgVar;
            r(c2334iobyxmoadg.iobyxmoadg(), true, c2334iobyxmoadg.zoijcleaow());
        } else {
            if (!(iobyxmoadgVar instanceof iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            h(((iobyxmoadg.zoijcleaow) iobyxmoadgVar).iobyxmoadg().iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb n(yggfygwlhe yggfygwlheVar) {
        return dz0.gtknphoqwx.zoijcleaow(yggfygwlheVar.f98232cqumvgiudr, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object nuxfzjnpeb(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        yggfygwlhe yggfygwlheVar;
        Object objWkgbmnqykc;
        ProductUIData productUIData;
        Object next;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f98309cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f98309cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f98311jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f98309cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ow1.wflxmlrfwp wflxmlrfwpVar = this.f98252nufgyqmvbu;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                eablkybsjgVar.f98313zdlpuopuiu = this;
                eablkybsjgVar.f98312yggfygwlhe = changeProductParams;
                eablkybsjgVar.f98309cqumvgiudr = 1;
                objZoijcleaow = wflxmlrfwpVar.zoijcleaow(wwaezpbzknVar, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                yggfygwlheVar = this;
            } catch (Throwable th2) {
                th = th2;
                yggfygwlheVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            changeProductParams = (ChangeProductParams) eablkybsjgVar.f98312yggfygwlhe;
            yggfygwlheVar = (yggfygwlhe) eablkybsjgVar.f98313zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
        Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = boolIobyxmoadg;
        }
        boolean zBooleanValue = ((Boolean) objWkgbmnqykc).booleanValue();
        List list = yggfygwlheVar.f98260ulzqkzuiru;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), changeProductParams.getProductId()));
            productUIData = (ProductUIData) next;
        } else {
            productUIData = null;
        }
        boolean z13 = productUIData != null;
        if (zBooleanValue || !changeProductParams.getIsPmProduct() || z13) {
            r01.iobyxmoadg.wflxmlrfwp(yggfygwlheVar, changeProductParams, false, 2, null);
        } else {
            yggfygwlheVar.yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.gxszxtbevo(true, changeProductParams));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new btonecajqb(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(boolean z13, iobyxmoadg iobyxmoadgVar) {
        boolean z14 = z13 && !((Boolean) this.f98268zdlpuopuiu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (z14) {
            yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(iobyxmoadgVar));
        }
        return z14;
    }

    private final void r(m91.gxszxtbevo gxszxtbevoVar, boolean z13, int i13) {
        if (gxszxtbevoVar.btonecajqb().nufgyqmvbu()) {
            int i14 = i13 + 1;
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            String strWflxmlrfwp = gxszxtbevoVar.wflxmlrfwp();
            String str = strWflxmlrfwp == null ? "" : strWflxmlrfwp;
            k21.ojitshcjhn ojitshcjhnVarBtonecajqb = gxszxtbevoVar.btonecajqb();
            String strDraadjrbmk = gxszxtbevoVar.draadjrbmk();
            AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f92334iwizpuwonk;
            m91.iobyxmoadg iobyxmoadgVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
            iobyxmoadgVar.pkzmftpjix(new NavigationPayload(ojitshcjhnVarBtonecajqb, strDraadjrbmk, str, null, z13, null, new AnalyticsPayload(mainScreen, iobyxmoadgVarLqeggnwhkg != null ? new AnalyticsLocation.BannerFeed(iobyxmoadgVarLqeggnwhkg.iobyxmoadg(), iobyxmoadgVarLqeggnwhkg.zoijcleaow()) : null, new AnalyticElement.BannerItemElement(gxszxtbevoVar.getId(), String.valueOf(i14))), false, 168, null));
        } else if (gxszxtbevoVar.nufgyqmvbu() == hh1.lqeggnwhkg.VIDEO) {
            ru.myspar.proloyalty.myspar.impl.presentation.rgvfuqvkyq rgvfuqvkyqVar = this.f98267ylkuphrtab;
            String strOjitshcjhn = gxszxtbevoVar.ojitshcjhn();
            rgvfuqvkyqVar.ojitshcjhn(new VideoPlayerArgs(strOjitshcjhn != null ? strOjitshcjhn : ""));
        }
    }

    private final void rhgxfdycjh(kt0.iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.wkgbmnqykc(new BuildYourComboDialogArgs(this.f98246kegysxyocb.ppxfxbqfkf(iobyxmoadgVar), iobyxmoadgVar.wflxmlrfwp().iobyxmoadg().getId(), iobyxmoadgVar.wflxmlrfwp().zoijcleaow().getId())));
    }

    static /* synthetic */ void s(yggfygwlhe yggfygwlheVar, m91.gxszxtbevo gxszxtbevoVar, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        yggfygwlheVar.r(gxszxtbevoVar, z13, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, null, false, false, false, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean z13) {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, null, false, false, z13, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, null, false, true, false, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb uawqvzlxes() {
        return (dz0.btonecajqb) this.f98259tzroggbefp.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        Object value;
        ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm oxmwwwfdhmVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value;
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(oxmwwwfdhmVar.ppxfxbqfkf());
            for (Map.Entry entry : df1.iobyxmoadg.gxszxtbevo.f27986cqumvgiudr.iobyxmoadg().entrySet()) {
                if (mapIwizpuwonk.get(entry.getKey()) == null) {
                    mapIwizpuwonk.replace(entry.getKey(), entry.getValue());
                }
            }
            mapIwizpuwonk.replace("auth", null);
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow(oxmwwwfdhmVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Object value;
        ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm oxmwwwfdhmVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value;
            Map mapPpxfxbqfkf = oxmwwwfdhmVar.ppxfxbqfkf();
            LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapPpxfxbqfkf.size()));
            for (Map.Entry entry : mapPpxfxbqfkf.entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                if (((df1.iobyxmoadg) value2) instanceof df1.iobyxmoadg.gxszxtbevo) {
                    value2 = null;
                }
                linkedHashMap.put(key, (df1.iobyxmoadg) value2);
            }
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(linkedHashMap);
            mapIwizpuwonk.replace("auth", df1.iobyxmoadg.AbstractC0556iobyxmoadg.ppxfxbqfkf.f28024cqumvgiudr);
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow(oxmwwwfdhmVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    private final void wizcaqwiak() {
        i21.iobyxmoadg.f41720iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Object value;
        UserBalance userBalance = (UserBalance) this.f98264wypolnanlu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg);
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, df1.esjtqupxsv.f27931iobyxmoadg.iobyxmoadg(igdgnonuha(), userBalance), false, false, false, 14, null)));
    }

    private final void y() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new wflxmlrfwp(new oxmwwwfdhm(new vdvldrhtss(new rgvfuqvkyq(new draadjrbmk(ojitshcjhn()))))), new jyumaefscl(null)), agtfadlqog());
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new ojitshcjhn(new zdlpuopuiu(new kcexrzcfyt(new agtfadlqog(ojitshcjhn())))), new C2350yggfygwlhe(null)), agtfadlqog());
    }

    private final void yzdjzghtvl(df1.iobyxmoadg.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(zoijcleaowVar.nufgyqmvbu(), zoijcleaowVar.dxjokdxxww(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f92334iwizpuwonk, null, null, 6, null), false, 184, null));
    }

    private final void z() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(new iwizpuwonk(sj.dxjokdxxww.wflxmlrfwp(auzgnhcxok(), this.f98254oxmwwwfdhm.nufgyqmvbu(), new cqumvgiudr(null)))), new esjtqupxsv(null)), new lereixgezr(null)), agtfadlqog());
    }

    private final void zeieaojujs(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    public sj.lqeggnwhkg auzgnhcxok() {
        return this.f98249lqeggnwhkg.ppxfxbqfkf();
    }

    public final void eslsurpljm(ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss event) {
        Object value;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.istkbnxepw) {
            o();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.zoijcleaow) {
            ixidwrxhsl();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.esjtqupxsv) {
            this.f98267ylkuphrtab.dxjokdxxww();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.ojitshcjhn) {
            hszhottldk();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.zdlpuopuiu) {
            this.f98255pkzmftpjix.gxszxtbevo();
            yggfygwlhe(new ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.nufgyqmvbu(false));
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.cqumvgiudr) {
            this.f98267ylkuphrtab.nufgyqmvbu();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.kcexrzcfyt) {
            c(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.kcexrzcfyt) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.ppxfxbqfkf) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.ppxfxbqfkf) event;
            jrbgnlbqoe(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.draadjrbmk) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.draadjrbmk draadjrbmkVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.draadjrbmk) event;
            krqnebusok(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wkgbmnqykc) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wkgbmnqykc wkgbmnqykcVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wkgbmnqykc) event;
            String strIobyxmoadg = wkgbmnqykcVar.iobyxmoadg().iobyxmoadg();
            String strZoijcleaow = wkgbmnqykcVar.iobyxmoadg().zoijcleaow();
            if (strZoijcleaow.length() == 0) {
                strZoijcleaow = this.f98269zynmafqrjb.getString(vk0.lqeggnwhkg.proloyalty_promotion);
            }
            fiwbwshyhd(strIobyxmoadg, strZoijcleaow);
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.lereixgezr) {
            f(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.lereixgezr) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.oxmwwwfdhm) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.oxmwwwfdhm) event;
            ipoelvxyzq(oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.C2326vdvldrhtss) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.C2326vdvldrhtss c2326vdvldrhtss = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.C2326vdvldrhtss) event;
            b(c2326vdvldrhtss.zoijcleaow(), c2326vdvldrhtss.ppxfxbqfkf(), c2326vdvldrhtss.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.eablkybsjg) {
            r01.iobyxmoadg.wflxmlrfwp(this, ((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.eablkybsjg) event).iobyxmoadg(), false, 2, null);
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.jyumaefscl) {
            e(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.jyumaefscl) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.yggfygwlhe) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.yggfygwlhe yggfygwlheVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.yggfygwlhe) event;
            d(yggfygwlheVar.iobyxmoadg(), yggfygwlheVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.iwizpuwonk) {
            grlcpdaxtj(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.iwizpuwonk) event).iobyxmoadg().draadjrbmk());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.gxszxtbevo) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.gxszxtbevo gxszxtbevoVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.gxszxtbevo) event;
            fmlbqenlif(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.nufgyqmvbu) {
            rhgxfdycjh(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.nufgyqmvbu) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.lqeggnwhkg) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.lqeggnwhkg) event;
            ezmngbhpjk(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.btonecajqb) {
            yzdjzghtvl(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.rgvfuqvkyq.f98211iobyxmoadg)) {
            wizcaqwiak();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.dxjokdxxww) {
            this.f98267ylkuphrtab.gtknphoqwx(new SpecificOrderArgs(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.dxjokdxxww) event).iobyxmoadg(), null, false, 6, null));
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.pmvmpeiblj) {
            g(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.pmvmpeiblj) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.iobyxmoadg) {
            mhtqkkgtqm(((ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.iobyxmoadg) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.gtknphoqwx.f98190iobyxmoadg)) {
            K();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.zynmafqrjb) {
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow((ru.myspar.proloyalty.myspar.impl.presentation.oxmwwwfdhm) value, null, false, false, false, 13, null)));
        } else if (event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wflxmlrfwp) {
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.wflxmlrfwp) event;
            a(wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
        } else {
            if (!(event instanceof ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.agtfadlqog)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.agtfadlqog agtfadlqogVar = (ru.myspar.proloyalty.myspar.impl.presentation.vdvldrhtss.agtfadlqog) event;
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f92334iwizpuwonk, null, null, 6, null), false, 184, null));
        }
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(params, null), 3, null);
    }

    public void iwxlajgraz(pw0.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f98249lqeggnwhkg.wkgbmnqykc(event);
    }

    public void p(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f98250mbcevpiqjq = iobyxmoadgVar;
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f98251ntlheqmsrt = iobyxmoadgVar;
    }

    public pz0.iobyxmoadg roivzttewh() {
        return this.f98250mbcevpiqjq;
    }

    public tg.iobyxmoadg tbqsvytpvh() {
        return this.f98251ntlheqmsrt;
    }

    @Override // sw0.eablkybsjg
    protected Object vdvldrhtss(pw0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iwxlajgraz(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f98228agtfadlqog;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        yggfygwlhe(ru.myspar.proloyalty.myspar.impl.presentation.kcexrzcfyt.lqeggnwhkg.f98155iobyxmoadg);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98247lereixgezr.eablkybsjg());
    }
}
