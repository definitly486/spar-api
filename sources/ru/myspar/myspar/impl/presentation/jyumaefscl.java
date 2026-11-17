package ru.myspar.myspar.impl.presentation;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.components.special_products.api.models.Action;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.myspar.impl.domain.model.Promotion;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.story.api.model.StoryPayload;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;
import ru.myspar.webview_screen.api.models.SpecialProductsWebViewArgs;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl extends vx.eablkybsjg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final c20.dxjokdxxww f90539agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final z10.iobyxmoadg f90540btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final q12.iobyxmoadg f90541cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final sm.iobyxmoadg f90542cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final l00.gtknphoqwx f90543cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final z20.iobyxmoadg f90544draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final p72.wkgbmnqykc f90545dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final zg0.eablkybsjg f90546dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final of0.iobyxmoadg f90547esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final z10.nufgyqmvbu f90548gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final zv.iobyxmoadg f90549hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final b82.wkgbmnqykc f90550hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final wg0.zoijcleaow f90551iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final g42.ppxfxbqfkf f90552istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lo.zoijcleaow f90553iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final at.iobyxmoadg f90554jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final vh0.wkgbmnqykc f90555jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final f20.ppxfxbqfkf f90556kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private y00.iobyxmoadg f90557kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ra2.gxszxtbevo f90558lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final b82.iobyxmoadg f90559lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f90560lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private List f90561mbcevpiqjq;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final k00.iobyxmoadg f90562nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final th0.eablkybsjg f90563ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final t20.zoijcleaow f90564oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final ah0.iobyxmoadg f90565pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final t20.ppxfxbqfkf f90566pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final u10.eablkybsjg f90567rgvfuqvkyq;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final gg.gtknphoqwx f90568stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private tg.iobyxmoadg f90569tzroggbefp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final j82.iobyxmoadg f90570vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final c20.eablkybsjg f90571wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final f70.iobyxmoadg f90572wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final ra2.ppxfxbqfkf f90573wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final d60.iobyxmoadg f90574yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final a20.iobyxmoadg f90575yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final ru.myspar.myspar.impl.presentation.vdvldrhtss f90576ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final a20.zoijcleaow f90577zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final g42.zoijcleaow f90578zynmafqrjb;

    public static final class agtfadlqog implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90579zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90580zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$agtfadlqog$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2081iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90582yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90583zdlpuopuiu;

                public C2081iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90583zdlpuopuiu = obj;
                    this.f90582yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90580zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2081iobyxmoadg c2081iobyxmoadg;
                if (gxszxtbevoVar instanceof C2081iobyxmoadg) {
                    c2081iobyxmoadg = (C2081iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2081iobyxmoadg.f90582yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2081iobyxmoadg.f90582yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2081iobyxmoadg = new C2081iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2081iobyxmoadg = new C2081iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2081iobyxmoadg.f90583zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2081iobyxmoadg.f90582yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90580zdlpuopuiu;
                    if (!((ru.myspar.myspar.impl.presentation.kcexrzcfyt) obj).ppxfxbqfkf().isEmpty()) {
                        c2081iobyxmoadg.f90582yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2081iobyxmoadg) == objGxszxtbevo) {
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
            this.f90579zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90579zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f90585yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90586zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, jyumaefscl.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((jyumaefscl) this.receiver).zdlpuopuiu(p13);
            }
        }

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new btonecajqb(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0075 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            wg0.zoijcleaow zoijcleaowVar;
            iobyxmoadg iobyxmoadgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90585yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    zoijcleaowVar = (wg0.zoijcleaow) this.f90586zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = new iobyxmoadg(jyumaefscl.this);
                    this.f90586zdlpuopuiu = null;
                    this.f90585yggfygwlhe = 3;
                    if (zoijcleaowVar.zdlpuopuiu((y00.iobyxmoadg) obj, iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                jyumaefscl.this.igdgnonuha();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jyumaefscl.this.u();
            jyumaefscl.this.x();
            jyumaefscl.this.yggfygwlhe(ru.myspar.myspar.impl.presentation.zdlpuopuiu.iobyxmoadg.f90848iobyxmoadg);
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            this.f90585yggfygwlhe = 1;
            if (jyumaefsclVar.o(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = jyumaefscl.this.f90551iozdgvuglv;
            z10.iobyxmoadg iobyxmoadgVar2 = jyumaefscl.this.f90540btonecajqb;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f90586zdlpuopuiu = zoijcleaowVar;
            this.f90585yggfygwlhe = 2;
            obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = new iobyxmoadg(jyumaefscl.this);
            this.f90586zdlpuopuiu = null;
            this.f90585yggfygwlhe = 3;
            if (zoijcleaowVar.zdlpuopuiu((y00.iobyxmoadg) obj, iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            jyumaefscl.this.igdgnonuha();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90587yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90588zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90588zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f90587yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cdpycssgdh cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
            cdpycssgdhVar.f90587yggfygwlhe = th2;
            return cdpycssgdhVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class cllcsxoeiz implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90589zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90590zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$cllcsxoeiz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2082iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90592yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90593zdlpuopuiu;

                public C2082iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90593zdlpuopuiu = obj;
                    this.f90592yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90590zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2082iobyxmoadg c2082iobyxmoadg;
                if (gxszxtbevoVar instanceof C2082iobyxmoadg) {
                    c2082iobyxmoadg = (C2082iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2082iobyxmoadg.f90592yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2082iobyxmoadg.f90592yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2082iobyxmoadg = new C2082iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2082iobyxmoadg = new C2082iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2082iobyxmoadg.f90593zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2082iobyxmoadg.f90592yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90590zdlpuopuiu;
                    User user = (User) obj;
                    Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(user != null ? user.getDiscountsNew() : 0);
                    c2082iobyxmoadg.f90592yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(numWkgbmnqykc, c2082iobyxmoadg) == objGxszxtbevo) {
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
            this.f90589zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90589zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90595zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new cqumvgiudr(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90595zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jyumaefscl.this.f90553iwizpuwonk.zoijcleaow(oo.eablkybsjg.wkgbmnqykc.f73279gxszxtbevo);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f90596jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90598zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f90596jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new draadjrbmk(this.f90596jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90598zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarAuzgnhcxok = jyumaefscl.this.auzgnhcxok();
                ChangeProductParams changeProductParams = this.f90596jyumaefscl;
                this.f90598zdlpuopuiu = 1;
                if (btonecajqbVarAuzgnhcxok.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class dsvhmnatus implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90599zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90600zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$dsvhmnatus$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2083iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90602yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90603zdlpuopuiu;

                public C2083iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90603zdlpuopuiu = obj;
                    this.f90602yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90600zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2083iobyxmoadg c2083iobyxmoadg;
                if (gxszxtbevoVar instanceof C2083iobyxmoadg) {
                    c2083iobyxmoadg = (C2083iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2083iobyxmoadg.f90602yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2083iobyxmoadg.f90602yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2083iobyxmoadg = new C2083iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2083iobyxmoadg = new C2083iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2083iobyxmoadg.f90603zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2083iobyxmoadg.f90602yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90600zdlpuopuiu;
                    zoijcleaow.eablkybsjg eablkybsjgVar = new zoijcleaow.eablkybsjg(((Number) obj).intValue());
                    c2083iobyxmoadg.f90602yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVar, c2083iobyxmoadg) == objGxszxtbevo) {
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
            this.f90599zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90599zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90605zdlpuopuiu;

        public static final class iobyxmoadg implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f90606zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2084iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f90607zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$dxjokdxxww$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2085iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f90609yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f90610zdlpuopuiu;

                    public C2085iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f90610zdlpuopuiu = obj;
                        this.f90609yggfygwlhe |= Integer.MIN_VALUE;
                        return C2084iobyxmoadg.this.emit(null, this);
                    }
                }

                public C2084iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f90607zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2085iobyxmoadg c2085iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2085iobyxmoadg) {
                        c2085iobyxmoadg = (C2085iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2085iobyxmoadg.f90609yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2085iobyxmoadg.f90609yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2085iobyxmoadg = new C2085iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2085iobyxmoadg = new C2085iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2085iobyxmoadg.f90610zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2085iobyxmoadg.f90609yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f90607zdlpuopuiu;
                        if (((Boolean) obj).booleanValue()) {
                            c2085iobyxmoadg.f90609yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2085iobyxmoadg) == objGxszxtbevo) {
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
                this.f90606zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f90606zdlpuopuiu.collect(new C2084iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90605zdlpuopuiu;
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
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg((sj.lqeggnwhkg) jyumaefscl.this.f90545dsvhmnatus.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg));
            this.f90605zdlpuopuiu = 1;
            if (sj.dxjokdxxww.pmvmpeiblj(iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            at.iobyxmoadg iobyxmoadgVar2 = jyumaefscl.this.f90554jpowsppfya;
            List listI = hg.agtfadlqog.i((Object[]) jyumaefscl.this.f90544draadjrbmk.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg));
            this.f90605zdlpuopuiu = 2;
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

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90612zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90612zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    jyumaefscl jyumaefsclVar = jyumaefscl.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    t20.zoijcleaow zoijcleaowVar = jyumaefsclVar.f90564oxmwwwfdhm;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f90612zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            return gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false) : objWkgbmnqykc;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90614zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ jyumaefscl f90615zdlpuopuiu;

            iobyxmoadg(jyumaefscl jyumaefsclVar) {
                this.f90615zdlpuopuiu = jyumaefsclVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                    this.f90615zdlpuopuiu.zdlpuopuiu(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f90615zdlpuopuiu.l(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new esjtqupxsv(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90614zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = jyumaefscl.this.auzgnhcxok().zoijcleaow();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(jyumaefscl.this);
                this.f90614zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((esjtqupxsv) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f90617esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f90618iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f90619jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f90620yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90621zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f90618iwizpuwonk = obj;
            this.f90617esjtqupxsv |= Integer.MIN_VALUE;
            return jyumaefscl.this.o(this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90623zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90623zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = jyumaefscl.this.f90542cllcsxoeiz;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f90623zdlpuopuiu = 1;
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
            jyumaefscl.this.f90576ylkuphrtab.vdvldrhtss(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class hcddaimhww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90625yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90626zdlpuopuiu;

        hcddaimhww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            hcddaimhww hcddaimhwwVar = jyumaefscl.this.new hcddaimhww(gxszxtbevoVar);
            hcddaimhwwVar.f90625yggfygwlhe = obj;
            return hcddaimhwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90626zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f90625yggfygwlhe;
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.j((zoijcleaow) it.next());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((hcddaimhww) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class hkdspvbjdz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90628yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90629zdlpuopuiu;

        hkdspvbjdz(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            hkdspvbjdz hkdspvbjdzVar = jyumaefscl.this.new hkdspvbjdz(gxszxtbevoVar);
            hkdspvbjdzVar.f90628yggfygwlhe = obj;
            return hkdspvbjdzVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90629zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f90628yggfygwlhe;
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.j((zoijcleaow) it.next());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((hkdspvbjdz) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2086iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            public static final int f90630ppxfxbqfkf = nb0.eablkybsjg.f69495wypolnanlu;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final nb0.eablkybsjg f90631iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f90632zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2086iobyxmoadg(nb0.eablkybsjg banner, int i13) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
                this.f90631iobyxmoadg = banner;
                this.f90632zoijcleaow = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2086iobyxmoadg)) {
                    return false;
                }
                C2086iobyxmoadg c2086iobyxmoadg = (C2086iobyxmoadg) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90631iobyxmoadg, c2086iobyxmoadg.f90631iobyxmoadg) && this.f90632zoijcleaow == c2086iobyxmoadg.f90632zoijcleaow;
            }

            public int hashCode() {
                return (this.f90631iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f90632zoijcleaow);
            }

            public final nb0.eablkybsjg iobyxmoadg() {
                return this.f90631iobyxmoadg;
            }

            public String toString() {
                return "Banner(banner=" + this.f90631iobyxmoadg + ", bannerIndex=" + this.f90632zoijcleaow + ")";
            }

            public final int zoijcleaow() {
                return this.f90632zoijcleaow;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final wh0.eablkybsjg f90633iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(wh0.eablkybsjg story) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
                this.f90633iobyxmoadg = story;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90633iobyxmoadg, ((zoijcleaow) obj).f90633iobyxmoadg);
            }

            public int hashCode() {
                return this.f90633iobyxmoadg.hashCode();
            }

            public final wh0.eablkybsjg iobyxmoadg() {
                return this.f90633iobyxmoadg;
            }

            public String toString() {
                return "Story(story=" + this.f90633iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class iozdgvuglv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90634zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90635zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$iozdgvuglv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2087iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90637yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90638zdlpuopuiu;

                public C2087iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90638zdlpuopuiu = obj;
                    this.f90637yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90635zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2087iobyxmoadg c2087iobyxmoadg;
                if (gxszxtbevoVar instanceof C2087iobyxmoadg) {
                    c2087iobyxmoadg = (C2087iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2087iobyxmoadg.f90637yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2087iobyxmoadg.f90637yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2087iobyxmoadg = new C2087iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2087iobyxmoadg = new C2087iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2087iobyxmoadg.f90638zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2087iobyxmoadg.f90637yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90635zdlpuopuiu;
                    zoijcleaow.wkgbmnqykc wkgbmnqykcVar = new zoijcleaow.wkgbmnqykc((y00.iobyxmoadg) obj);
                    c2087iobyxmoadg.f90637yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(wkgbmnqykcVar, c2087iobyxmoadg) == objGxszxtbevo) {
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

        public iozdgvuglv(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90634zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90634zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90640zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new istkbnxepw(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90640zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jyumaefscl.this.n();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((istkbnxepw) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90642zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new iwizpuwonk(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90642zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jyumaefscl.this.f90553iwizpuwonk.zoijcleaow(oo.eablkybsjg.zoijcleaow.f73280gxszxtbevo);
            jyumaefscl.this.f90553iwizpuwonk.zoijcleaow(oo.eablkybsjg.iobyxmoadg.f73268gxszxtbevo);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jpowsppfya extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90644zdlpuopuiu;

        jpowsppfya(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new jpowsppfya(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90644zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jyumaefscl.this.f90572wwaezpbzkn.clear();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(User user, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jpowsppfya) create(user, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$jyumaefscl, reason: collision with other inner class name */
    public static final class C2088jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90645zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$jyumaefscl$iobyxmoadg */
        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90646zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2089iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90648yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90649zdlpuopuiu;

                public C2089iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90649zdlpuopuiu = obj;
                    this.f90648yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90646zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2089iobyxmoadg c2089iobyxmoadg;
                boolean z13;
                if (gxszxtbevoVar instanceof C2089iobyxmoadg) {
                    c2089iobyxmoadg = (C2089iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2089iobyxmoadg.f90648yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2089iobyxmoadg.f90648yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2089iobyxmoadg = new C2089iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2089iobyxmoadg = new C2089iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2089iobyxmoadg.f90649zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2089iobyxmoadg.f90648yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90646zdlpuopuiu;
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
                        if (((yh0.iobyxmoadg) it.next()).wkgbmnqykc()) {
                            z13 = false;
                            break;
                        }
                    }
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
                    c2089iobyxmoadg.f90648yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2089iobyxmoadg) == objGxszxtbevo) {
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

        public C2088jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90645zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90645zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90650zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90651zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2090iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90653yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90654zdlpuopuiu;

                public C2090iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90654zdlpuopuiu = obj;
                    this.f90653yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90651zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2090iobyxmoadg c2090iobyxmoadg;
                if (gxszxtbevoVar instanceof C2090iobyxmoadg) {
                    c2090iobyxmoadg = (C2090iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2090iobyxmoadg.f90653yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2090iobyxmoadg.f90653yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2090iobyxmoadg = new C2090iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2090iobyxmoadg = new C2090iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2090iobyxmoadg.f90654zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2090iobyxmoadg.f90653yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90651zdlpuopuiu;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((yh0.iobyxmoadg) obj3).eablkybsjg()) {
                            arrayList.add(obj3);
                        }
                    }
                    c2090iobyxmoadg.f90653yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(arrayList, c2090iobyxmoadg) == objGxszxtbevo) {
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
            this.f90650zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90650zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class kegysxyocb implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90655zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90656zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$kegysxyocb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2091iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90658yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90659zdlpuopuiu;

                public C2091iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90659zdlpuopuiu = obj;
                    this.f90658yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90656zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2091iobyxmoadg c2091iobyxmoadg;
                if (gxszxtbevoVar instanceof C2091iobyxmoadg) {
                    c2091iobyxmoadg = (C2091iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2091iobyxmoadg.f90658yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2091iobyxmoadg.f90658yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2091iobyxmoadg = new C2091iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2091iobyxmoadg = new C2091iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2091iobyxmoadg.f90659zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2091iobyxmoadg.f90658yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90656zdlpuopuiu;
                    User user = (User) obj;
                    UserCard userCard = user != null ? user.getUserCard() : null;
                    c2091iobyxmoadg.f90658yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(userCard, c2091iobyxmoadg) == objGxszxtbevo) {
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

        public kegysxyocb(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90655zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90655zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90661yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90662zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = jyumaefscl.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f90661yggfygwlhe = obj;
            return lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90662zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            u10.eablkybsjg.iobyxmoadg iobyxmoadgVar = (u10.eablkybsjg.iobyxmoadg) this.f90661yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, u10.eablkybsjg.iobyxmoadg.C2773iobyxmoadg.f112479iobyxmoadg)) {
                jyumaefscl.this.n();
            } else {
                if (!(iobyxmoadgVar instanceof u10.eablkybsjg.iobyxmoadg.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                u10.eablkybsjg.iobyxmoadg.zoijcleaow zoijcleaowVar = (u10.eablkybsjg.iobyxmoadg.zoijcleaow) iobyxmoadgVar;
                String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                String strZoijcleaow = zoijcleaowVar.zoijcleaow();
                jyumaefscl jyumaefsclVar = jyumaefscl.this;
                if (strZoijcleaow.length() == 0) {
                    strZoijcleaow = jyumaefsclVar.f90574yadqdtsiqt.getString(pm.dxjokdxxww.promotion);
                }
                ru.myspar.myspar.impl.presentation.vdvldrhtss.lqeggnwhkg(jyumaefscl.this.f90576ylkuphrtab, new ProductListPayload(null, null, null, null, strIobyxmoadg, strZoijcleaow, null, null, false, 463, null), null, null, 6, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u10.eablkybsjg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lereixgezr) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class lmojexxdyd implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90663zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90664zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$lmojexxdyd$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2092iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90666yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90667zdlpuopuiu;

                public C2092iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90667zdlpuopuiu = obj;
                    this.f90666yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90664zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2092iobyxmoadg c2092iobyxmoadg;
                if (gxszxtbevoVar instanceof C2092iobyxmoadg) {
                    c2092iobyxmoadg = (C2092iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2092iobyxmoadg.f90666yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2092iobyxmoadg.f90666yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2092iobyxmoadg = new C2092iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2092iobyxmoadg = new C2092iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2092iobyxmoadg.f90667zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2092iobyxmoadg.f90666yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90664zdlpuopuiu;
                    User user = (User) obj;
                    String phone = user != null ? user.getPhone() : null;
                    c2092iobyxmoadg.f90666yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(phone, c2092iobyxmoadg) == objGxszxtbevo) {
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

        public lmojexxdyd(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90663zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90663zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ nb0.eablkybsjg f90668cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f90669esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f90671jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f90672yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90673zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(nb0.eablkybsjg eablkybsjgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f90668cqumvgiudr = eablkybsjgVar;
            this.f90669esjtqupxsv = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new lqeggnwhkg(this.f90668cqumvgiudr, this.f90669esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            jyumaefscl jyumaefsclVar;
            nb0.eablkybsjg eablkybsjgVar;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90671jyumaefscl;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (jyumaefscl.this.q(this.f90668cqumvgiudr.ojitshcjhn(), new iobyxmoadg.C2086iobyxmoadg(this.f90668cqumvgiudr, this.f90669esjtqupxsv))) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                String strBtonecajqb = this.f90668cqumvgiudr.btonecajqb();
                if (strBtonecajqb != null) {
                    jyumaefsclVar = jyumaefscl.this;
                    nb0.eablkybsjg eablkybsjgVar2 = this.f90668cqumvgiudr;
                    b82.iobyxmoadg.C0266iobyxmoadg c0266iobyxmoadg = new b82.iobyxmoadg.C0266iobyxmoadg(strBtonecajqb);
                    try {
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        b82.iobyxmoadg iobyxmoadgVar2 = jyumaefsclVar.f90559lmojexxdyd;
                        this.f90673zdlpuopuiu = jyumaefsclVar;
                        this.f90672yggfygwlhe = eablkybsjgVar2;
                        this.f90671jyumaefscl = 1;
                        obj = iobyxmoadgVar2.zoijcleaow(c0266iobyxmoadg, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        eablkybsjgVar = eablkybsjgVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        eablkybsjgVar = eablkybsjgVar2;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                }
                jyumaefscl.s(jyumaefscl.this, this.f90668cqumvgiudr, false, this.f90669esjtqupxsv, 2, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (nb0.eablkybsjg) this.f90672yggfygwlhe;
            jyumaefsclVar = (jyumaefscl) this.f90673zdlpuopuiu;
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
                jyumaefsclVar.i(storyItem, new StoryNavLink(eablkybsjgVar.dxjokdxxww().dxjokdxxww(), eablkybsjgVar.gtknphoqwx()));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            jyumaefscl.s(jyumaefscl.this, this.f90668cqumvgiudr, false, this.f90669esjtqupxsv, 2, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class mbcevpiqjq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90675zdlpuopuiu;

        mbcevpiqjq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new mbcevpiqjq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90675zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    jyumaefscl jyumaefsclVar = jyumaefscl.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    zg0.eablkybsjg eablkybsjgVar = jyumaefsclVar.f90546dxjokdxxww;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f90675zdlpuopuiu = 1;
                    obj = eablkybsjgVar.zoijcleaow(wwaezpbzknVar, this);
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
            jyumaefscl.this.J(yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.f125088pmvmpeiblj.zoijcleaow((Promotion) objWkgbmnqykc));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((mbcevpiqjq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ jyumaefscl f90676iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f90677jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f90678yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90679zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, jyumaefscl.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((jyumaefscl) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            ppxfxbqfkf(Object obj) {
                super(1, obj, jyumaefscl.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((jyumaefscl) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, jyumaefscl.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((jyumaefscl) this.receiver).zdlpuopuiu(p13);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(zoijcleaow zoijcleaowVar, jyumaefscl jyumaefsclVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f90677jyumaefscl = zoijcleaowVar;
            this.f90676iwizpuwonk = jyumaefsclVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f90677jyumaefscl, this.f90676iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x01b9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object value;
            ru.myspar.myspar.impl.presentation.kcexrzcfyt kcexrzcfytVar;
            wg0.zoijcleaow zoijcleaowVar;
            String strWkgbmnqykc;
            zoijcleaow zoijcleaowVar2;
            wg0.zoijcleaow zoijcleaowVar3;
            ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90678yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar4 = this.f90677jyumaefscl;
                if (zoijcleaowVar4 instanceof zoijcleaow.wkgbmnqykc) {
                    rs.wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "MySparViewModel VisibilityEvent.City = " + zoijcleaowVar4, true);
                    this.f90676iwizpuwonk.p(((zoijcleaow.wkgbmnqykc) this.f90677jyumaefscl).iobyxmoadg());
                    tg.iobyxmoadg iobyxmoadgVarUawqvzlxes = this.f90676iwizpuwonk.uawqvzlxes();
                    if (iobyxmoadgVarUawqvzlxes != null) {
                        iobyxmoadgVarUawqvzlxes.invoke();
                    }
                    this.f90676iwizpuwonk.u();
                    wg0.zoijcleaow zoijcleaowVar5 = this.f90676iwizpuwonk.f90551iozdgvuglv;
                    y00.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((zoijcleaow.wkgbmnqykc) this.f90677jyumaefscl).iobyxmoadg();
                    iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f90676iwizpuwonk);
                    this.f90678yggfygwlhe = 1;
                    if (zoijcleaowVar5.cqumvgiudr(iobyxmoadgVarIobyxmoadg, iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    this.f90676iwizpuwonk.igdgnonuha();
                } else if (zoijcleaowVar4 instanceof zoijcleaow.C2106zoijcleaow) {
                    zoijcleaowVar = this.f90676iwizpuwonk.f90551iozdgvuglv;
                    z10.iobyxmoadg iobyxmoadgVar2 = this.f90676iwizpuwonk.f90540btonecajqb;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f90679zdlpuopuiu = zoijcleaowVar;
                    this.f90678yggfygwlhe = 2;
                    obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    strWkgbmnqykc = ((y00.iobyxmoadg) obj).wkgbmnqykc();
                    zoijcleaowVar2 = new zoijcleaow(this.f90676iwizpuwonk);
                    this.f90679zdlpuopuiu = null;
                    this.f90678yggfygwlhe = 3;
                    if (zoijcleaowVar.yggfygwlhe(strWkgbmnqykc, zoijcleaowVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (zoijcleaowVar4 instanceof zoijcleaow.gxszxtbevo) {
                    this.f90676iwizpuwonk.f90561mbcevpiqjq = ((zoijcleaow.gxszxtbevo) zoijcleaowVar4).iobyxmoadg();
                    sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = this.f90676iwizpuwonk.ojitshcjhn();
                    jyumaefscl jyumaefsclVar = this.f90676iwizpuwonk;
                    zoijcleaow zoijcleaowVar6 = this.f90677jyumaefscl;
                    do {
                        value = zynmafqrjbVarOjitshcjhn.getValue();
                        kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.kcexrzcfyt) value;
                    } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(kcexrzcfytVar, jyumaefsclVar.f90563ojitshcjhn.draadjrbmk(kcexrzcfytVar.ppxfxbqfkf(), ((zoijcleaow.gxszxtbevo) zoijcleaowVar6).iobyxmoadg()), false, false, false, 14, null)));
                } else if (zoijcleaowVar4 instanceof zoijcleaow.eablkybsjg) {
                    Map mapEablkybsjg = this.f90676iwizpuwonk.f90555jyumaefscl.eablkybsjg(((zoijcleaow.eablkybsjg) this.f90677jyumaefscl).iobyxmoadg(), ((ru.myspar.myspar.impl.presentation.kcexrzcfyt) this.f90676iwizpuwonk.getState().getValue()).ppxfxbqfkf());
                    jyumaefscl jyumaefsclVar2 = this.f90676iwizpuwonk;
                    for (Map.Entry entry : mapEablkybsjg.entrySet()) {
                        jyumaefsclVar2.J(new gg.vdvldrhtss(entry.getKey(), entry.getValue()));
                    }
                } else if (zoijcleaowVar4 instanceof zoijcleaow.iobyxmoadg) {
                    this.f90676iwizpuwonk.u();
                    this.f90676iwizpuwonk.yggfygwlhe(ru.myspar.myspar.impl.presentation.zdlpuopuiu.iobyxmoadg.f90848iobyxmoadg);
                    if (((zoijcleaow.iobyxmoadg) this.f90677jyumaefscl).iobyxmoadg()) {
                        this.f90676iwizpuwonk.v();
                        jyumaefscl jyumaefsclVar3 = this.f90676iwizpuwonk;
                        this.f90678yggfygwlhe = 4;
                        if (jyumaefsclVar3.o(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        this.f90676iwizpuwonk.roivzttewh();
                    } else {
                        this.f90676iwizpuwonk.w();
                    }
                    this.f90676iwizpuwonk.f90547esjtqupxsv.iobyxmoadg();
                    zoijcleaowVar3 = this.f90676iwizpuwonk.f90551iozdgvuglv;
                    ppxfxbqfkfVar = new ppxfxbqfkf(this.f90676iwizpuwonk);
                    this.f90678yggfygwlhe = 5;
                    if (zoijcleaowVar3.lereixgezr(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    this.f90676iwizpuwonk.igdgnonuha();
                } else {
                    if (!(zoijcleaowVar4 instanceof zoijcleaow.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jyumaefscl jyumaefsclVar4 = this.f90676iwizpuwonk;
                    yh0.iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.C3176iobyxmoadg c3176iobyxmoadg = yh0.iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.f125104zynmafqrjb;
                    UserCard userCardIobyxmoadg = ((zoijcleaow.ppxfxbqfkf) zoijcleaowVar4).iobyxmoadg();
                    jyumaefsclVar4.J(c3176iobyxmoadg.zoijcleaow(userCardIobyxmoadg != null ? wh0.ppxfxbqfkf.iobyxmoadg(userCardIobyxmoadg) : null));
                }
            } else if (i13 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f90676iwizpuwonk.igdgnonuha();
            } else if (i13 == 2) {
                zoijcleaowVar = (wg0.zoijcleaow) this.f90679zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                strWkgbmnqykc = ((y00.iobyxmoadg) obj).wkgbmnqykc();
                zoijcleaowVar2 = new zoijcleaow(this.f90676iwizpuwonk);
                this.f90679zdlpuopuiu = null;
                this.f90678yggfygwlhe = 3;
                if (zoijcleaowVar.yggfygwlhe(strWkgbmnqykc, zoijcleaowVar2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i13 != 3) {
                if (i13 == 4) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f90676iwizpuwonk.roivzttewh();
                    this.f90676iwizpuwonk.f90547esjtqupxsv.iobyxmoadg();
                    zoijcleaowVar3 = this.f90676iwizpuwonk.f90551iozdgvuglv;
                    ppxfxbqfkfVar = new ppxfxbqfkf(this.f90676iwizpuwonk);
                    this.f90678yggfygwlhe = 5;
                    if (zoijcleaowVar3.lereixgezr(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f90676iwizpuwonk.igdgnonuha();
            } else {
                gg.zdlpuopuiu.zoijcleaow(obj);
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
        final /* synthetic */ sj.lqeggnwhkg f90680zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90681zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$ojitshcjhn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2093iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90683yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90684zdlpuopuiu;

                public C2093iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90684zdlpuopuiu = obj;
                    this.f90683yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90681zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2093iobyxmoadg c2093iobyxmoadg;
                if (gxszxtbevoVar instanceof C2093iobyxmoadg) {
                    c2093iobyxmoadg = (C2093iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2093iobyxmoadg.f90683yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2093iobyxmoadg.f90683yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2093iobyxmoadg = new C2093iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2093iobyxmoadg = new C2093iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2093iobyxmoadg.f90684zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2093iobyxmoadg.f90683yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90681zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2093iobyxmoadg.f90683yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2093iobyxmoadg) == objGxszxtbevo) {
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
            this.f90680zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90680zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class oxmwwwfdhm implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90685zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90686zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$oxmwwwfdhm$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2094iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90688yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90689zdlpuopuiu;

                public C2094iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90689zdlpuopuiu = obj;
                    this.f90688yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90686zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2094iobyxmoadg c2094iobyxmoadg;
                if (gxszxtbevoVar instanceof C2094iobyxmoadg) {
                    c2094iobyxmoadg = (C2094iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2094iobyxmoadg.f90688yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2094iobyxmoadg.f90688yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2094iobyxmoadg = new C2094iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2094iobyxmoadg = new C2094iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2094iobyxmoadg.f90689zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2094iobyxmoadg.f90688yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90686zdlpuopuiu;
                    List listZfvoamnweg = hg.jyumaefscl.zfvoamnweg(((ru.myspar.myspar.impl.presentation.kcexrzcfyt) obj).ppxfxbqfkf().values());
                    c2094iobyxmoadg.f90688yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listZfvoamnweg, c2094iobyxmoadg) == objGxszxtbevo) {
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
            this.f90685zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90685zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class pkzmftpjix extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90690yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90691zdlpuopuiu;

        pkzmftpjix(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            pkzmftpjix pkzmftpjixVar = new pkzmftpjix(gxszxtbevoVar);
            pkzmftpjixVar.f90690yggfygwlhe = obj;
            return pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90691zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            y00.iobyxmoadg iobyxmoadgVar = (y00.iobyxmoadg) this.f90690yggfygwlhe;
            rs.wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "MySparViewModel subscribeToCurrentDeliveryDataUseCase = " + iobyxmoadgVar, true);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((pkzmftpjix) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90692yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90693zdlpuopuiu;

        pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f90693zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f90692yggfygwlhe, new CrashlyticsKey[0]);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar);
            pmvmpeibljVar.f90692yggfygwlhe = th2;
            return pmvmpeibljVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f90694iobyxmoadg;

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
            f90694iobyxmoadg = iArr;
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90695zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90696zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2095iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90698yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90699zdlpuopuiu;

                public C2095iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90699zdlpuopuiu = obj;
                    this.f90698yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90696zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2095iobyxmoadg c2095iobyxmoadg;
                if (gxszxtbevoVar instanceof C2095iobyxmoadg) {
                    c2095iobyxmoadg = (C2095iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2095iobyxmoadg.f90698yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2095iobyxmoadg.f90698yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2095iobyxmoadg = new C2095iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2095iobyxmoadg = new C2095iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2095iobyxmoadg.f90699zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2095iobyxmoadg.f90698yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90696zdlpuopuiu;
                    if (!((ru.myspar.myspar.impl.presentation.kcexrzcfyt) obj).ppxfxbqfkf().isEmpty()) {
                        c2095iobyxmoadg.f90698yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2095iobyxmoadg) == objGxszxtbevo) {
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

        public rgvfuqvkyq(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90695zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90695zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class stevsuqkhv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90700zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90701zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$stevsuqkhv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2096iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90703yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90704zdlpuopuiu;

                public C2096iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90704zdlpuopuiu = obj;
                    this.f90703yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90701zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2096iobyxmoadg c2096iobyxmoadg;
                if (gxszxtbevoVar instanceof C2096iobyxmoadg) {
                    c2096iobyxmoadg = (C2096iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2096iobyxmoadg.f90703yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2096iobyxmoadg.f90703yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2096iobyxmoadg = new C2096iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2096iobyxmoadg = new C2096iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2096iobyxmoadg.f90704zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2096iobyxmoadg.f90703yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90701zdlpuopuiu;
                    zoijcleaow.iobyxmoadg iobyxmoadgVar = new zoijcleaow.iobyxmoadg(((String) obj) != null);
                    c2096iobyxmoadg.f90703yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c2096iobyxmoadg) == objGxszxtbevo) {
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
            this.f90700zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90700zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class tzroggbefp implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90705zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90706zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$tzroggbefp$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2097iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90708yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90709zdlpuopuiu;

                public C2097iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90709zdlpuopuiu = obj;
                    this.f90708yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90706zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2097iobyxmoadg c2097iobyxmoadg;
                if (gxszxtbevoVar instanceof C2097iobyxmoadg) {
                    c2097iobyxmoadg = (C2097iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2097iobyxmoadg.f90708yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2097iobyxmoadg.f90708yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2097iobyxmoadg = new C2097iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2097iobyxmoadg = new C2097iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2097iobyxmoadg.f90709zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2097iobyxmoadg.f90708yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90706zdlpuopuiu;
                    zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new zoijcleaow.ppxfxbqfkf((UserCard) obj);
                    c2097iobyxmoadg.f90708yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c2097iobyxmoadg) == objGxszxtbevo) {
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

        public tzroggbefp(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90705zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90705zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90710zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90711zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2098iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90713yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90714zdlpuopuiu;

                public C2098iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90714zdlpuopuiu = obj;
                    this.f90713yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90711zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2098iobyxmoadg c2098iobyxmoadg;
                if (gxszxtbevoVar instanceof C2098iobyxmoadg) {
                    c2098iobyxmoadg = (C2098iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2098iobyxmoadg.f90713yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2098iobyxmoadg.f90713yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2098iobyxmoadg = new C2098iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2098iobyxmoadg = new C2098iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2098iobyxmoadg.f90714zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2098iobyxmoadg.f90713yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90711zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2098iobyxmoadg.f90713yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2098iobyxmoadg) == objGxszxtbevo) {
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

        public vdvldrhtss(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90710zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90710zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90716zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90716zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ra2.ppxfxbqfkf ppxfxbqfkfVar = jyumaefscl.this.f90573wypolnanlu;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f90716zdlpuopuiu = 1;
                obj = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            if (mj.kcexrzcfyt.zfvoamnweg(((UserCard) obj).getNumber())) {
                obj = null;
            }
            UserCard userCard = (UserCard) obj;
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = jyumaefscl.this.ojitshcjhn();
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, yh0.lereixgezr.f125163iobyxmoadg.iobyxmoadg(jyumaefsclVar.lxfrhoxuzk(), userCard), false, false, false, 14, null)));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f90717iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f90718jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90720zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f90718jyumaefscl = comboSetProduct;
            this.f90717iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return jyumaefscl.this.new wkgbmnqykc(this.f90718jyumaefscl, this.f90717iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objVdvldrhtss;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90720zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                jyumaefscl.this.t(true);
                k00.iobyxmoadg iobyxmoadgVar = jyumaefscl.this.f90562nufgyqmvbu;
                ComboSetProduct comboSetProduct = this.f90718jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f90717iwizpuwonk;
                this.f90720zdlpuopuiu = 1;
                objVdvldrhtss = iobyxmoadgVar.vdvldrhtss(comboSetProduct, comboSetProduct2, this);
                if (objVdvldrhtss == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objVdvldrhtss = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            if (gg.kcexrzcfyt.agtfadlqog(objVdvldrhtss)) {
                jyumaefsclVar.skhdrjzrfn(((t00.iobyxmoadg) objVdvldrhtss).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objVdvldrhtss);
            if (thDxjokdxxww != null) {
                jyumaefsclVar.zdlpuopuiu(thDxjokdxxww);
            }
            jyumaefscl.this.ppxfxbqfkf(null);
            jyumaefscl.this.t(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wwaezpbzkn implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90721zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90722zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$wwaezpbzkn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2099iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90724yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90725zdlpuopuiu;

                public C2099iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90725zdlpuopuiu = obj;
                    this.f90724yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90722zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2099iobyxmoadg c2099iobyxmoadg;
                if (gxszxtbevoVar instanceof C2099iobyxmoadg) {
                    c2099iobyxmoadg = (C2099iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2099iobyxmoadg.f90724yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2099iobyxmoadg.f90724yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2099iobyxmoadg = new C2099iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2099iobyxmoadg = new C2099iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2099iobyxmoadg.f90725zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2099iobyxmoadg.f90724yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90722zdlpuopuiu;
                    zoijcleaow.C2106zoijcleaow c2106zoijcleaow = new zoijcleaow.C2106zoijcleaow((String) obj);
                    c2099iobyxmoadg.f90724yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2106zoijcleaow, c2099iobyxmoadg) == objGxszxtbevo) {
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

        public wwaezpbzkn(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90721zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90721zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class wypolnanlu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90726zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90727zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$wypolnanlu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2100iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90729yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90730zdlpuopuiu;

                public C2100iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90730zdlpuopuiu = obj;
                    this.f90729yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90727zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2100iobyxmoadg c2100iobyxmoadg;
                if (gxszxtbevoVar instanceof C2100iobyxmoadg) {
                    c2100iobyxmoadg = (C2100iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2100iobyxmoadg.f90729yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2100iobyxmoadg.f90729yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2100iobyxmoadg = new C2100iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2100iobyxmoadg = new C2100iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2100iobyxmoadg.f90730zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2100iobyxmoadg.f90729yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90727zdlpuopuiu;
                    User user = (User) obj;
                    String phone = user != null ? user.getPhone() : null;
                    c2100iobyxmoadg.f90729yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(phone, c2100iobyxmoadg) == objGxszxtbevo) {
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
            this.f90726zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90726zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class yadqdtsiqt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f90732yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90733zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ jyumaefscl f90734yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ pj.cllcsxoeiz f90735zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$yadqdtsiqt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2101iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ wg0.iobyxmoadg f90736jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ jyumaefscl f90737yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f90738zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$yadqdtsiqt$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                /* synthetic */ class C2102iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
                    C2102iobyxmoadg(Object obj) {
                        super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
                    }

                    @Override // tg.rgvfuqvkyq
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
                    }

                    public final String iobyxmoadg(int i13, Object[] objArr) {
                        return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2101iobyxmoadg(jyumaefscl jyumaefsclVar, wg0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f90737yggfygwlhe = jyumaefsclVar;
                    this.f90736jyumaefscl = iobyxmoadgVar;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C2101iobyxmoadg(this.f90737yggfygwlhe, this.f90736jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f90738zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        th0.eablkybsjg eablkybsjgVar = this.f90737yggfygwlhe.f90563ojitshcjhn;
                        wg0.iobyxmoadg iobyxmoadgVar = this.f90736jyumaefscl;
                        List listWflxmlrfwp = this.f90737yggfygwlhe.f90561mbcevpiqjq;
                        if (listWflxmlrfwp == null) {
                            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                        }
                        List list = listWflxmlrfwp;
                        y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = this.f90737yggfygwlhe.kcexrzcfyt();
                        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null;
                        C2102iobyxmoadg c2102iobyxmoadg = new C2102iobyxmoadg(this.f90737yggfygwlhe.f90574yadqdtsiqt);
                        this.f90738zdlpuopuiu = 1;
                        obj = eablkybsjgVar.dxjokdxxww(iobyxmoadgVar, list, deliveryCodePpxfxbqfkf, c2102iobyxmoadg, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    jyumaefscl jyumaefsclVar = this.f90737yggfygwlhe;
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        jyumaefsclVar.J((gg.vdvldrhtss) it.next());
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C2101iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            iobyxmoadg(pj.cllcsxoeiz cllcsxoeizVar, jyumaefscl jyumaefsclVar) {
                this.f90735zdlpuopuiu = cllcsxoeizVar;
                this.f90734yggfygwlhe = jyumaefsclVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(wg0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                pj.gtknphoqwx.wkgbmnqykc(this.f90735zdlpuopuiu, null, null, new C2101iobyxmoadg(this.f90734yggfygwlhe, iobyxmoadgVar, null), 3, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        yadqdtsiqt(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yadqdtsiqt yadqdtsiqtVar = jyumaefscl.this.new yadqdtsiqt(gxszxtbevoVar);
            yadqdtsiqtVar.f90732yggfygwlhe = obj;
            return yadqdtsiqtVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90733zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f90732yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarKcexrzcfyt = jyumaefscl.this.f90551iozdgvuglv.kcexrzcfyt();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(cllcsxoeizVar, jyumaefscl.this);
                this.f90733zdlpuopuiu = 1;
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
            return ((yadqdtsiqt) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90739zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90740zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2103iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90742yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90743zdlpuopuiu;

                public C2103iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90743zdlpuopuiu = obj;
                    this.f90742yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90740zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2103iobyxmoadg c2103iobyxmoadg;
                if (gxszxtbevoVar instanceof C2103iobyxmoadg) {
                    c2103iobyxmoadg = (C2103iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2103iobyxmoadg.f90742yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2103iobyxmoadg.f90742yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2103iobyxmoadg = new C2103iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2103iobyxmoadg = new C2103iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2103iobyxmoadg.f90743zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2103iobyxmoadg.f90742yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90740zdlpuopuiu;
                    List listZfvoamnweg = hg.jyumaefscl.zfvoamnweg(((ru.myspar.myspar.impl.presentation.kcexrzcfyt) obj).ppxfxbqfkf().values());
                    c2103iobyxmoadg.f90742yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listZfvoamnweg, c2103iobyxmoadg) == objGxszxtbevo) {
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

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f90739zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90739zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ylkuphrtab implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90744zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90745zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$ylkuphrtab$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2104iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90747yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90748zdlpuopuiu;

                public C2104iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90748zdlpuopuiu = obj;
                    this.f90747yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90745zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2104iobyxmoadg c2104iobyxmoadg;
                if (gxszxtbevoVar instanceof C2104iobyxmoadg) {
                    c2104iobyxmoadg = (C2104iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2104iobyxmoadg.f90747yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2104iobyxmoadg.f90747yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2104iobyxmoadg = new C2104iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2104iobyxmoadg = new C2104iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2104iobyxmoadg.f90748zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2104iobyxmoadg.f90747yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90745zdlpuopuiu;
                    zoijcleaow.gxszxtbevo gxszxtbevoVar2 = new zoijcleaow.gxszxtbevo((List) obj);
                    c2104iobyxmoadg.f90747yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(gxszxtbevoVar2, c2104iobyxmoadg) == objGxszxtbevo) {
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
            this.f90744zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90744zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f90749zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f90750zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2105iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f90752yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f90753zdlpuopuiu;

                public C2105iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f90753zdlpuopuiu = obj;
                    this.f90752yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f90750zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2105iobyxmoadg c2105iobyxmoadg;
                boolean z13;
                if (gxszxtbevoVar instanceof C2105iobyxmoadg) {
                    c2105iobyxmoadg = (C2105iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2105iobyxmoadg.f90752yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2105iobyxmoadg.f90752yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2105iobyxmoadg = new C2105iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2105iobyxmoadg = new C2105iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2105iobyxmoadg.f90753zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2105iobyxmoadg.f90752yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f90750zdlpuopuiu;
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
                        if (((yh0.iobyxmoadg) it.next()).wkgbmnqykc()) {
                            z13 = false;
                            break;
                        }
                    }
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
                    c2105iobyxmoadg.f90752yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2105iobyxmoadg) == objGxszxtbevo) {
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
            this.f90749zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f90749zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private static abstract class zoijcleaow implements os.iobyxmoadg {

        public static final class eablkybsjg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f90754iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90755zoijcleaow;

            public eablkybsjg(int i13) {
                super(null);
                this.f90754iobyxmoadg = i13;
                this.f90755zoijcleaow = "discounts_new";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof eablkybsjg) && this.f90754iobyxmoadg == ((eablkybsjg) obj).f90754iobyxmoadg;
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90755zoijcleaow;
            }

            public int hashCode() {
                return Integer.hashCode(this.f90754iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f90754iobyxmoadg;
            }

            public String toString() {
                return "DiscountsNew(unread=" + this.f90754iobyxmoadg + ")";
            }
        }

        public static final class gxszxtbevo extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f90756iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90757zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public gxszxtbevo(List productData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productData, "productData");
                this.f90756iobyxmoadg = productData;
                this.f90757zoijcleaow = "products";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90756iobyxmoadg, ((gxszxtbevo) obj).f90756iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90757zoijcleaow;
            }

            public int hashCode() {
                return this.f90756iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f90756iobyxmoadg;
            }

            public String toString() {
                return "Products(productData=" + this.f90756iobyxmoadg + ")";
            }
        }

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final boolean f90758iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90759zoijcleaow;

            public iobyxmoadg(boolean z13) {
                super(null);
                this.f90758iobyxmoadg = z13;
                this.f90759zoijcleaow = "user_id";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && this.f90758iobyxmoadg == ((iobyxmoadg) obj).f90758iobyxmoadg;
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90759zoijcleaow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f90758iobyxmoadg);
            }

            public final boolean iobyxmoadg() {
                return this.f90758iobyxmoadg;
            }

            public String toString() {
                return "Auth(isAuth=" + this.f90758iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final UserCard f90760iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90761zoijcleaow;

            public ppxfxbqfkf(UserCard userCard) {
                super(null);
                this.f90760iobyxmoadg = userCard;
                this.f90761zoijcleaow = "user_card";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90760iobyxmoadg, ((ppxfxbqfkf) obj).f90760iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90761zoijcleaow;
            }

            public int hashCode() {
                UserCard userCard = this.f90760iobyxmoadg;
                if (userCard == null) {
                    return 0;
                }
                return userCard.hashCode();
            }

            public final UserCard iobyxmoadg() {
                return this.f90760iobyxmoadg;
            }

            public String toString() {
                return "CardInfo(card=" + this.f90760iobyxmoadg + ")";
            }
        }

        public static final class wkgbmnqykc extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final y00.iobyxmoadg f90762iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90763zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(y00.iobyxmoadg deliveryData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
                this.f90762iobyxmoadg = deliveryData;
                this.f90763zoijcleaow = "changeCurrentShop";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90762iobyxmoadg, ((wkgbmnqykc) obj).f90762iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90763zoijcleaow;
            }

            public int hashCode() {
                return this.f90762iobyxmoadg.hashCode();
            }

            public final y00.iobyxmoadg iobyxmoadg() {
                return this.f90762iobyxmoadg;
            }

            public String toString() {
                return "ChangeDeliveryData(deliveryData=" + this.f90762iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.jyumaefscl$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2106zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f90764iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f90765zoijcleaow;

            public C2106zoijcleaow(String str) {
                super(null);
                this.f90764iobyxmoadg = str;
                this.f90765zoijcleaow = "banners";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2106zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90764iobyxmoadg, ((C2106zoijcleaow) obj).f90764iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f90765zoijcleaow;
            }

            public int hashCode() {
                String str = this.f90764iobyxmoadg;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Banners(userPhone=" + this.f90764iobyxmoadg + ")";
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
        /* synthetic */ Object f90767yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f90768zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zynmafqrjb zynmafqrjbVar = jyumaefscl.this.new zynmafqrjb(gxszxtbevoVar);
            zynmafqrjbVar.f90767yggfygwlhe = obj;
            return zynmafqrjbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f90768zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                List list = (List) this.f90767yggfygwlhe;
                wg0.zoijcleaow zoijcleaowVar = jyumaefscl.this.f90551iozdgvuglv;
                wg0.iobyxmoadg.gtknphoqwx gtknphoqwxVar = new wg0.iobyxmoadg.gtknphoqwx(list);
                this.f90768zdlpuopuiu = 1;
                if (zoijcleaowVar.pmvmpeiblj(gtknphoqwxVar, this) == objGxszxtbevo) {
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
            return ((zynmafqrjb) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(k00.iobyxmoadg cartInteractor, zg0.eablkybsjg getPromotionUseCase, z10.iobyxmoadg getCurrentDeliveryDataUseCase, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, z20.iobyxmoadg getMainPermissionsUseCase, c20.eablkybsjg isLoggedInUseCase, c20.dxjokdxxww subscribeToLoggedInUseCase, th0.eablkybsjg mySparUiMapper, u10.eablkybsjg changePromotionObserver, j82.iobyxmoadg changeSubscribeTicketsObserver, t20.zoijcleaow getIqosAgreementsStatusUseCase, f20.ppxfxbqfkf clearCartUseCase, a20.zoijcleaow isAdultCheckedUseCase, a20.iobyxmoadg changeAdultCheckedUseCase, vh0.wkgbmnqykc featuresMyCouponsUpdateBadgeMapper, lo.zoijcleaow analyticsTracker, l00.gtknphoqwx productChangesSourceProvider, of0.iobyxmoadg dialogsInteractor, ra2.gxszxtbevo loadUserUseCase, t20.ppxfxbqfkf setIqosAgreementsStatusUseCase, g42.zoijcleaow isUpdateInstanceIdUseCase, g42.ppxfxbqfkf updateInstanceIdUseCase, q12.iobyxmoadg scanGoFeatureApi, d60.iobyxmoadg resourcesManager, wg0.zoijcleaow sectionInteractor, b82.iobyxmoadg getOnboardingStoryUseCase, f70.iobyxmoadg dialogManager, ru.myspar.myspar.impl.presentation.vdvldrhtss mySparNavigation, ah0.iobyxmoadg mySparOpenScreenAnalytics, zv.iobyxmoadg notificationsRepository, at.iobyxmoadg permissionManager, b82.wkgbmnqykc observeStoriesUseCase, sm.iobyxmoadg getUserAddressFlowInfo, p72.wkgbmnqykc subscribeShowedSplashScreenUseCase, ra2.ppxfxbqfkf getUserCardOrEmptyUseCase) {
        super(new ru.myspar.myspar.impl.presentation.kcexrzcfyt(null, false, false, false, 15, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromotionUseCase, "getPromotionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMainPermissionsUseCase, "getMainPermissionsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparUiMapper, "mySparUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeSubscribeTicketsObserver, "changeSubscribeTicketsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIqosAgreementsStatusUseCase, "getIqosAgreementsStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresMyCouponsUpdateBadgeMapper, "featuresMyCouponsUpdateBadgeMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogsInteractor, "dialogsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadUserUseCase, "loadUserUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIqosAgreementsStatusUseCase, "setIqosAgreementsStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isUpdateInstanceIdUseCase, "isUpdateInstanceIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateInstanceIdUseCase, "updateInstanceIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoFeatureApi, "scanGoFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionInteractor, "sectionInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparNavigation, "mySparNavigation");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparOpenScreenAnalytics, "mySparOpenScreenAnalytics");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observeStoriesUseCase, "observeStoriesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeShowedSplashScreenUseCase, "subscribeShowedSplashScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserCardOrEmptyUseCase, "getUserCardOrEmptyUseCase");
        this.f90560lqeggnwhkg = new sx.ppxfxbqfkf();
        this.f90562nufgyqmvbu = cartInteractor;
        this.f90546dxjokdxxww = getPromotionUseCase;
        this.f90540btonecajqb = getCurrentDeliveryDataUseCase;
        this.f90548gtknphoqwx = subscribeToCurrentDeliveryDataUseCase;
        this.f90544draadjrbmk = getMainPermissionsUseCase;
        this.f90571wflxmlrfwp = isLoggedInUseCase;
        this.f90539agtfadlqog = subscribeToLoggedInUseCase;
        this.f90563ojitshcjhn = mySparUiMapper;
        this.f90567rgvfuqvkyq = changePromotionObserver;
        this.f90570vdvldrhtss = changeSubscribeTicketsObserver;
        this.f90564oxmwwwfdhm = getIqosAgreementsStatusUseCase;
        this.f90556kcexrzcfyt = clearCartUseCase;
        this.f90577zdlpuopuiu = isAdultCheckedUseCase;
        this.f90575yggfygwlhe = changeAdultCheckedUseCase;
        this.f90555jyumaefscl = featuresMyCouponsUpdateBadgeMapper;
        this.f90553iwizpuwonk = analyticsTracker;
        this.f90543cqumvgiudr = productChangesSourceProvider;
        this.f90547esjtqupxsv = dialogsInteractor;
        this.f90558lereixgezr = loadUserUseCase;
        this.f90566pmvmpeiblj = setIqosAgreementsStatusUseCase;
        this.f90578zynmafqrjb = isUpdateInstanceIdUseCase;
        this.f90552istkbnxepw = updateInstanceIdUseCase;
        this.f90541cdpycssgdh = scanGoFeatureApi;
        this.f90574yadqdtsiqt = resourcesManager;
        this.f90551iozdgvuglv = sectionInteractor;
        this.f90559lmojexxdyd = getOnboardingStoryUseCase;
        this.f90572wwaezpbzkn = dialogManager;
        this.f90576ylkuphrtab = mySparNavigation;
        this.f90565pkzmftpjix = mySparOpenScreenAnalytics;
        this.f90549hcddaimhww = notificationsRepository;
        this.f90554jpowsppfya = permissionManager;
        this.f90550hkdspvbjdz = observeStoriesUseCase;
        this.f90542cllcsxoeiz = getUserAddressFlowInfo;
        this.f90545dsvhmnatus = subscribeShowedSplashScreenUseCase;
        this.f90573wypolnanlu = getUserCardOrEmptyUseCase;
        this.f90568stevsuqkhv = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.yggfygwlhe
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return jyumaefscl.m(this.f90838zdlpuopuiu);
            }
        });
        this.f90561mbcevpiqjq = hg.jyumaefscl.wflxmlrfwp();
        B();
        C();
        D();
        z();
        A();
        x();
        y();
        F();
        E();
        k();
    }

    private final void A() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f90567rgvfuqvkyq.btonecajqb(), new lereixgezr(null)), new pmvmpeiblj(null)), agtfadlqog());
    }

    private final void B() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.lereixgezr(this.f90550hkdspvbjdz.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)), new zynmafqrjb(null)), agtfadlqog());
    }

    private final void C() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f90570vdvldrhtss.btonecajqb(), new istkbnxepw(null)), new cdpycssgdh(null)), agtfadlqog());
    }

    private final auzgnhcxok D() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new yadqdtsiqt(null), 3, null);
    }

    private final void E() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(os.lqeggnwhkg.iobyxmoadg(iwxlajgraz(), new iozdgvuglv(sj.dxjokdxxww.kegysxyocb(this.f90548gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg), new pkzmftpjix(null))), new wwaezpbzkn(sj.dxjokdxxww.vdvldrhtss(new lmojexxdyd(this.f90539agtfadlqog.eablkybsjg()))), new ylkuphrtab(auzgnhcxok().iobyxmoadg())), new hcddaimhww(null)), agtfadlqog());
    }

    private final void F() {
        sj.lqeggnwhkg lqeggnwhkgVarIwxlajgraz = iwxlajgraz();
        sj.lqeggnwhkg lqeggnwhkgVarKegysxyocb = sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(this.f90539agtfadlqog.eablkybsjg()), new jpowsppfya(null));
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(os.lqeggnwhkg.iobyxmoadg(lqeggnwhkgVarIwxlajgraz, sj.dxjokdxxww.wypolnanlu(new dsvhmnatus(sj.dxjokdxxww.vdvldrhtss(new cllcsxoeiz(lqeggnwhkgVarKegysxyocb))), new stevsuqkhv(sj.dxjokdxxww.vdvldrhtss(new wypolnanlu(lqeggnwhkgVarKegysxyocb))), new tzroggbefp(sj.dxjokdxxww.vdvldrhtss(new kegysxyocb(lqeggnwhkgVarKegysxyocb))))), new hkdspvbjdz(null)), agtfadlqog());
    }

    private final void G(ProductUiModel productUiModel, boolean z13, String str, boolean z14) {
        Object value;
        ru.myspar.myspar.impl.presentation.kcexrzcfyt kcexrzcfytVar;
        LinkedHashMap linkedHashMap;
        yh0.iobyxmoadg iobyxmoadgVarNufgyqmvbu;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.kcexrzcfyt) value;
            Map mapPpxfxbqfkf = kcexrzcfytVar.ppxfxbqfkf();
            linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapPpxfxbqfkf.size()));
            for (Map.Entry entry : mapPpxfxbqfkf.entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg abstractC3155iobyxmoadg = value2 instanceof yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg ? (yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) value2 : null;
                if (abstractC3155iobyxmoadg == null) {
                    iobyxmoadgVarNufgyqmvbu = (yh0.iobyxmoadg) entry.getValue();
                } else {
                    CounterModel counterModel = productUiModel.getCounterModel();
                    iobyxmoadgVarNufgyqmvbu = abstractC3155iobyxmoadg.nufgyqmvbu(wh0.wkgbmnqykc.zoijcleaow(abstractC3155iobyxmoadg.lqeggnwhkg(), null, null, qs.eablkybsjg.dxjokdxxww(abstractC3155iobyxmoadg.lqeggnwhkg().eablkybsjg(), productUiModel, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : z13, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : str, (10235 & 4096) != 0 ? counterModel.autoHideMessage : z14, (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null)), null, null, null, 59, null));
                }
                linkedHashMap.put(key, iobyxmoadgVarNufgyqmvbu);
            }
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(kcexrzcfytVar, linkedHashMap, false, false, false, 14, null)));
    }

    static /* synthetic */ void H(jyumaefscl jyumaefsclVar, ProductUiModel productUiModel, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        jyumaefsclVar.G(productUiModel, z13, str, z14);
    }

    private final void I() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new mbcevpiqjq(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(gg.vdvldrhtss vdvldrhtssVar) {
        Object value;
        ru.myspar.myspar.impl.presentation.kcexrzcfyt kcexrzcfytVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.kcexrzcfyt) value;
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(kcexrzcfytVar.ppxfxbqfkf());
            mapIwizpuwonk.replace(vdvldrhtssVar.lqeggnwhkg(), vdvldrhtssVar.nufgyqmvbu());
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(kcexrzcfytVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    private final void a(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.gxszxtbevo(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, AnalyticsPage.MainScreen.f84306iwizpuwonk, analyticsLocation)));
    }

    private final void ageimvtcrz(String str) {
        this.f90576ylkuphrtab.nufgyqmvbu(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb auzgnhcxok() {
        return (l00.btonecajqb) this.f90568stevsuqkhv.getValue();
    }

    private final void b(ProductUiModel productUiModel, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
        List limits;
        List listIobyxmoadg;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                G(productUiModel, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                H(this, productUiModel, false, null, false, 12, null);
                return;
            }
        }
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(AnalyticsPage.MainScreen.f84306iwizpuwonk, analyticsLocation, productUiModel.getName());
        List list = this.f90561mbcevpiqjq;
        ProductUIData productUIData = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), productUiModel.getId())) {
                    obj = obj2;
                    break;
                }
            }
            productUIData = (ProductUIData) obj;
        }
        tbqsvytpvh(new ChangeProductParams(productUiModel.getId(), productUiModel.getArticle(), zoijcleaowVarIobyxmoadg, productUiModel.getAvailabilityModel().getIsAvailableToBuy(), productUiModel.getIsPmProduct(), productUiModel.getAvailabilityModel().getAvailableOnlyForPickup(), productUiModel.getMeasureTypeModel(), productUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(limits)) == null) ? productUiModel.getLimits() : listIobyxmoadg, changeProductAnalyticParams));
    }

    private final void c(yh0.iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow zoijcleaowVar) {
        f40.zoijcleaow zoijcleaowVarBtonecajqb = zoijcleaowVar.btonecajqb();
        if (zoijcleaowVarBtonecajqb == null || !zoijcleaowVarBtonecajqb.lqeggnwhkg() || zoijcleaowVar.draadjrbmk() == null) {
            ageimvtcrz(zoijcleaowVar.gtknphoqwx());
        } else {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(zoijcleaowVarBtonecajqb, zoijcleaowVar.draadjrbmk(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f84306iwizpuwonk, null, null, 6, null), false, 184, null));
        }
    }

    private final void d(ProductUiModel productUiModel, uu.zoijcleaow zoijcleaowVar) {
        fyldjkxazc(productUiModel, zoijcleaowVar);
    }

    private final void e(uu.zoijcleaow zoijcleaowVar) {
    }

    private final void ezmngbhpjk(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        if (lxfrhoxuzk()) {
            nuxfzjnpeb(comboSetProduct, comboSetProduct2);
        } else {
            this.f90576ylkuphrtab.eablkybsjg();
        }
    }

    private final void f(wh0.wkgbmnqykc wkgbmnqykcVar) {
        v00.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.nufgyqmvbu() == wh0.wkgbmnqykc.iobyxmoadg.NEW ? v00.iobyxmoadg.NEW_PRODUCTS : v00.iobyxmoadg.DEFAULT;
        int i13 = ppxfxbqfkf.f90694iobyxmoadg[wkgbmnqykcVar.ppxfxbqfkf().ordinal()];
        if (i13 == 1) {
            this.f90576ylkuphrtab.ojitshcjhn(new SubCatalogArgs(iobyxmoadgVar, null, wkgbmnqykcVar.gxszxtbevo(), wkgbmnqykcVar.lqeggnwhkg(), 2, null));
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                this.f90576ylkuphrtab.gtknphoqwx(new SpecialProductsWebViewArgs(wkgbmnqykcVar.gxszxtbevo(), wkgbmnqykcVar.lqeggnwhkg()));
                return;
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ProductListPayload productListPayload = new ProductListPayload(iobyxmoadgVar, null, wkgbmnqykcVar.gxszxtbevo(), null, null, wkgbmnqykcVar.lqeggnwhkg(), null, null, false, 474, null);
        ru.myspar.myspar.impl.presentation.vdvldrhtss vdvldrhtssVar = this.f90576ylkuphrtab;
        String lowerCase = wkgbmnqykcVar.nufgyqmvbu().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        ru.myspar.myspar.impl.presentation.vdvldrhtss.lqeggnwhkg(vdvldrhtssVar, productListPayload, new AnalyticsLocation.ItemFeed(lowerCase, wkgbmnqykcVar.lqeggnwhkg()), null, 4, null);
    }

    private final void fiwbwshyhd() {
        this.f90576ylkuphrtab.wkgbmnqykc();
    }

    private final void fmlbqenlif(ComboSetProduct comboSetProduct, mo.zoijcleaow zoijcleaowVar) {
        this.f90576ylkuphrtab.wflxmlrfwp(new ProductPayload(new ProductPayload.Type.Article(comboSetProduct.getArticle()), null, 2, null), comboSetProduct.getArticle(), comboSetProduct.getName(), new AnalyticsLocation.ItemFeed(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()), new AnalyticElement.ProductItemElement(comboSetProduct.getArticle(), comboSetProduct.getName()));
    }

    private final void fyldjkxazc(ProductUiModel productUiModel, uu.zoijcleaow zoijcleaowVar) {
        ProductPayload productPayload = new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null);
        this.f90576ylkuphrtab.wflxmlrfwp(productPayload, productUiModel.getArticle(), productUiModel.getName(), new AnalyticsLocation.ItemFeed(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()));
    }

    private final void g(wh0.eablkybsjg eablkybsjgVar) {
        if (!eablkybsjgVar.wkgbmnqykc() || ((Boolean) this.f90577zdlpuopuiu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            h(eablkybsjgVar.iobyxmoadg());
        } else {
            yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.zoijcleaow(new iobyxmoadg.zoijcleaow(eablkybsjgVar)));
        }
    }

    private final void grlcpdaxtj(ProductUiModel productUiModel, wh0.wkgbmnqykc wkgbmnqykcVar) {
        ProductPayload productPayload = new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), null, 2, null);
        ru.myspar.myspar.impl.presentation.vdvldrhtss vdvldrhtssVar = this.f90576ylkuphrtab;
        String article = productUiModel.getArticle();
        String name = productUiModel.getName();
        String lowerCase = wkgbmnqykcVar.nufgyqmvbu().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        vdvldrhtssVar.wflxmlrfwp(productPayload, article, name, new AnalyticsLocation.ItemFeed(lowerCase, wkgbmnqykcVar.lqeggnwhkg()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()));
    }

    private final void h(String str) {
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.gtknphoqwx(new StoryPayload.Groups(str)));
        this.f90565pkzmftpjix.gxszxtbevo(str, AnalyticsLocation.StoriesFeed.f84261iwizpuwonk, new AnalyticElement.StoryItemElement(str));
    }

    private final void hszhottldk() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, true, false, false, 13, null)));
        this.f90576ylkuphrtab.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(StoryItem storyItem, StoryNavLink storyNavLink) {
        StoryPayload.Onboarding onboarding = new StoryPayload.Onboarding(storyItem, storyNavLink);
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.gtknphoqwx(onboarding));
        this.f90565pkzmftpjix.gxszxtbevo(onboarding.getStory().getId(), AnalyticsLocation.StoriesFeed.f84261iwizpuwonk, new AnalyticElement.StoryItemElement(onboarding.getStory().getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, false, false, false, 11, null)));
    }

    private final void ipoelvxyzq() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, true, false, false, 13, null)));
        this.f90576ylkuphrtab.dxjokdxxww();
    }

    private final void ixidwrxhsl(iobyxmoadg iobyxmoadgVar) {
        this.f90575yggfygwlhe.zoijcleaow(Boolean.TRUE);
        if (iobyxmoadgVar instanceof iobyxmoadg.C2086iobyxmoadg) {
            iobyxmoadg.C2086iobyxmoadg c2086iobyxmoadg = (iobyxmoadg.C2086iobyxmoadg) iobyxmoadgVar;
            r(c2086iobyxmoadg.iobyxmoadg(), true, c2086iobyxmoadg.zoijcleaow());
        } else {
            if (!(iobyxmoadgVar instanceof iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            h(((iobyxmoadg.zoijcleaow) iobyxmoadgVar).iobyxmoadg().iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok j(zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new nufgyqmvbu(zoijcleaowVar, this, null), 3, null);
    }

    private final auzgnhcxok jrbgnlbqoe(nb0.eablkybsjg eablkybsjgVar, int i13) {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(eablkybsjgVar, i13, null), 3, null);
    }

    private final auzgnhcxok k() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new dxjokdxxww(null), 3, null);
    }

    private final void krqnebusok(nb0.gxszxtbevo gxszxtbevoVar, int i13) {
        int i14 = i13 + 1;
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        String strGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        f40.zoijcleaow zoijcleaowVarDxjokdxxww = gxszxtbevoVar.dxjokdxxww();
        String strBtonecajqb = gxszxtbevoVar.btonecajqb();
        AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f84306iwizpuwonk;
        nb0.iobyxmoadg iobyxmoadgVarEablkybsjg = gxszxtbevoVar.eablkybsjg();
        iobyxmoadgVar.pkzmftpjix(new NavigationPayload(zoijcleaowVarDxjokdxxww, strBtonecajqb, strGtknphoqwx, null, false, null, new AnalyticsPayload(mainScreen, iobyxmoadgVarEablkybsjg != null ? new AnalyticsLocation.BannerFeed(iobyxmoadgVarEablkybsjg.iobyxmoadg(), iobyxmoadgVarEablkybsjg.zoijcleaow()) : null, new AnalyticElement.BannerItemElement(gxszxtbevoVar.getId(), String.valueOf(i14))), false, 184, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.draadjrbmk(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean lxfrhoxuzk() {
        return ((Boolean) eablkybsjg().zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb m(jyumaefscl jyumaefsclVar) {
        return l00.gtknphoqwx.zoijcleaow(jyumaefsclVar.f90543cqumvgiudr, null, 1, null);
    }

    private final void mhtqkkgtqm(String str) {
        this.f90576ylkuphrtab.agtfadlqog(new SpecificRestaurantArgs(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new btonecajqb(null), 3, null);
    }

    private final void nuxfzjnpeb(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        jyumaefscl jyumaefsclVar;
        Object objWkgbmnqykc;
        jyumaefscl jyumaefsclVar2;
        User user;
        jyumaefscl jyumaefsclVar3;
        Object objWkgbmnqykc2;
        Boolean boolIobyxmoadg;
        g42.ppxfxbqfkf ppxfxbqfkfVar;
        gg.wwaezpbzkn wwaezpbzknVar;
        User user2;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f90617esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f90617esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objZoijcleaow = gtknphoqwxVar.f90618iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f90617esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                jyumaefsclVar = (jyumaefscl) gtknphoqwxVar.f90621zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else if (i14 == 2) {
                user = (User) gtknphoqwxVar.f90620yggfygwlhe;
                jyumaefsclVar2 = (jyumaefscl) gtknphoqwxVar.f90621zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    g42.zoijcleaow zoijcleaowVar = jyumaefsclVar2.f90578zynmafqrjb;
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    gtknphoqwxVar.f90621zdlpuopuiu = jyumaefsclVar2;
                    gtknphoqwxVar.f90620yggfygwlhe = user;
                    gtknphoqwxVar.f90619jyumaefscl = null;
                    gtknphoqwxVar.f90617esjtqupxsv = 3;
                    objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar2, gtknphoqwxVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jyumaefsclVar3 = jyumaefsclVar2;
                    objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
                    boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
                    if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = boolIobyxmoadg;
                    }
                    if (!((Boolean) objWkgbmnqykc2).booleanValue()) {
                        return user;
                    }
                    ppxfxbqfkfVar = jyumaefsclVar3.f90552istkbnxepw;
                    wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    gtknphoqwxVar.f90621zdlpuopuiu = user;
                    gtknphoqwxVar.f90620yggfygwlhe = objWkgbmnqykc2;
                    gtknphoqwxVar.f90619jyumaefscl = null;
                    gtknphoqwxVar.f90617esjtqupxsv = 4;
                    if (ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, gtknphoqwxVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    user2 = user;
                } catch (Throwable th3) {
                    th = th3;
                    jyumaefsclVar3 = jyumaefsclVar2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else if (i14 == 3) {
                user = (User) gtknphoqwxVar.f90620yggfygwlhe;
                jyumaefsclVar3 = (jyumaefscl) gtknphoqwxVar.f90621zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
                } catch (Throwable th4) {
                    th = th4;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
                boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
                if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                    objWkgbmnqykc2 = boolIobyxmoadg;
                }
                if (!((Boolean) objWkgbmnqykc2).booleanValue()) {
                    return user;
                }
                ppxfxbqfkfVar = jyumaefsclVar3.f90552istkbnxepw;
                wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                gtknphoqwxVar.f90621zdlpuopuiu = user;
                gtknphoqwxVar.f90620yggfygwlhe = objWkgbmnqykc2;
                gtknphoqwxVar.f90619jyumaefscl = null;
                gtknphoqwxVar.f90617esjtqupxsv = 4;
                if (ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, gtknphoqwxVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                user2 = user;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                user2 = (User) gtknphoqwxVar.f90621zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return user2;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (!lxfrhoxuzk()) {
            return null;
        }
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            ra2.gxszxtbevo gxszxtbevoVar2 = this.f90558lereixgezr;
            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
            gtknphoqwxVar.f90621zdlpuopuiu = this;
            gtknphoqwxVar.f90617esjtqupxsv = 1;
            objZoijcleaow = gxszxtbevoVar2.zoijcleaow(wwaezpbzknVar3, gtknphoqwxVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            jyumaefsclVar = this;
        } catch (Throwable th5) {
            th = th5;
            jyumaefsclVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((User) objZoijcleaow);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        User user3 = (User) objWkgbmnqykc;
        if (user3 == null) {
            return null;
        }
        t20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar7 = new t20.ppxfxbqfkf.iobyxmoadg(user3.getIsIqosAgreementsApplied());
        t20.ppxfxbqfkf ppxfxbqfkfVar2 = jyumaefsclVar.f90566pmvmpeiblj;
        gtknphoqwxVar.f90621zdlpuopuiu = jyumaefsclVar;
        gtknphoqwxVar.f90620yggfygwlhe = user3;
        gtknphoqwxVar.f90619jyumaefscl = iobyxmoadgVar7;
        gtknphoqwxVar.f90617esjtqupxsv = 2;
        if (ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar7, gtknphoqwxVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        jyumaefsclVar2 = jyumaefsclVar;
        user = user3;
        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = gg.kcexrzcfyt.f37117yggfygwlhe;
        g42.zoijcleaow zoijcleaowVar2 = jyumaefsclVar2.f90578zynmafqrjb;
        gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
        gtknphoqwxVar.f90621zdlpuopuiu = jyumaefsclVar2;
        gtknphoqwxVar.f90620yggfygwlhe = user;
        gtknphoqwxVar.f90619jyumaefscl = null;
        gtknphoqwxVar.f90617esjtqupxsv = 3;
        objZoijcleaow = zoijcleaowVar2.zoijcleaow(wwaezpbzknVar4, gtknphoqwxVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        jyumaefsclVar3 = jyumaefsclVar2;
        objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
        boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
            objWkgbmnqykc2 = boolIobyxmoadg;
        }
        if (!((Boolean) objWkgbmnqykc2).booleanValue()) {
            return user;
        }
        ppxfxbqfkfVar = jyumaefsclVar3.f90552istkbnxepw;
        wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        gtknphoqwxVar.f90621zdlpuopuiu = user;
        gtknphoqwxVar.f90620yggfygwlhe = objWkgbmnqykc2;
        gtknphoqwxVar.f90619jyumaefscl = null;
        gtknphoqwxVar.f90617esjtqupxsv = 4;
        if (ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, gtknphoqwxVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        user2 = user;
        return user2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(boolean z13, iobyxmoadg iobyxmoadgVar) {
        boolean z14 = z13 && !((Boolean) this.f90577zdlpuopuiu.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (z14) {
            yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.zoijcleaow(iobyxmoadgVar));
        }
        return z14;
    }

    private final void r(nb0.eablkybsjg eablkybsjgVar, boolean z13, int i13) {
        if (eablkybsjgVar.dxjokdxxww().lqeggnwhkg()) {
            int i14 = i13 + 1;
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            String strDraadjrbmk = eablkybsjgVar.draadjrbmk();
            String str = strDraadjrbmk == null ? "" : strDraadjrbmk;
            f40.zoijcleaow zoijcleaowVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            String strGtknphoqwx = eablkybsjgVar.gtknphoqwx();
            AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f84306iwizpuwonk;
            nb0.iobyxmoadg iobyxmoadgVarWkgbmnqykc = eablkybsjgVar.wkgbmnqykc();
            iobyxmoadgVar.pkzmftpjix(new NavigationPayload(zoijcleaowVarDxjokdxxww, strGtknphoqwx, str, null, z13, null, new AnalyticsPayload(mainScreen, iobyxmoadgVarWkgbmnqykc != null ? new AnalyticsLocation.BannerFeed(iobyxmoadgVarWkgbmnqykc.iobyxmoadg(), iobyxmoadgVarWkgbmnqykc.zoijcleaow()) : null, new AnalyticElement.BannerItemElement(eablkybsjgVar.getId(), String.valueOf(i14))), false, 168, null));
        } else if (eablkybsjgVar.lqeggnwhkg() == q00.ppxfxbqfkf.VIDEO) {
            ru.myspar.myspar.impl.presentation.vdvldrhtss vdvldrhtssVar = this.f90576ylkuphrtab;
            String strWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
            vdvldrhtssVar.rgvfuqvkyq(new VideoPlayerArgs(strWflxmlrfwp != null ? strWflxmlrfwp : ""));
        }
    }

    private final void rhgxfdycjh(qu.iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.eablkybsjg(new BuildYourComboDialogArgs(iobyxmoadgVar.dxjokdxxww().iobyxmoadg(), iobyxmoadgVar.dxjokdxxww().zoijcleaow(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.btonecajqb())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh() {
        this.f90549hcddaimhww.zoijcleaow();
    }

    static /* synthetic */ void s(jyumaefscl jyumaefsclVar, nb0.eablkybsjg eablkybsjgVar, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        jyumaefsclVar.r(eablkybsjgVar, z13, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn(Warning warning) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f87479jyumaefscl)) {
            yggfygwlhe(ru.myspar.myspar.impl.presentation.zdlpuopuiu.wkgbmnqykc.f90854iobyxmoadg);
            return;
        }
        if (warning instanceof Warning.WithCodeAndMessage) {
            l(warning);
        } else if (warning instanceof Warning.DailyLimit) {
            yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.nufgyqmvbu(((Warning.DailyLimit) warning).getMessage()));
        } else if (!(warning instanceof Warning.AvailableOnlyForPickup) && !(warning instanceof Warning.Interval)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean z13) {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, false, false, z13, 7, null)));
    }

    private final void tbqsvytpvh(ChangeProductParams changeProductParams) {
        ProductUIData productUIData;
        Object next;
        boolean zBooleanValue = ((Boolean) pj.btonecajqb.zoijcleaow(null, new eablkybsjg(null), 1, null)).booleanValue();
        List list = this.f90561mbcevpiqjq;
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
            h20.ppxfxbqfkf.dsvhmnatus(this, changeProductParams, false, 2, null);
        } else {
            yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.lqeggnwhkg(true, changeProductParams));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        Object value;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, false, true, false, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        Object value;
        ru.myspar.myspar.impl.presentation.kcexrzcfyt kcexrzcfytVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.kcexrzcfyt) value;
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(kcexrzcfytVar.ppxfxbqfkf());
            for (Map.Entry entry : yh0.iobyxmoadg.gxszxtbevo.f125085cqumvgiudr.iobyxmoadg().entrySet()) {
                if (mapIwizpuwonk.get(entry.getKey()) == null) {
                    mapIwizpuwonk.replace(entry.getKey(), entry.getValue());
                }
            }
            mapIwizpuwonk.replace("auth", null);
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(kcexrzcfytVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Object value;
        ru.myspar.myspar.impl.presentation.kcexrzcfyt kcexrzcfytVar;
        Map mapIwizpuwonk;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.kcexrzcfyt) value;
            Map mapPpxfxbqfkf = kcexrzcfytVar.ppxfxbqfkf();
            LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapPpxfxbqfkf.size()));
            for (Map.Entry entry : mapPpxfxbqfkf.entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                if (((yh0.iobyxmoadg) value2) instanceof yh0.iobyxmoadg.gxszxtbevo) {
                    value2 = null;
                }
                linkedHashMap.put(key, (yh0.iobyxmoadg) value2);
            }
            mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(linkedHashMap);
            mapIwizpuwonk.replace("auth", yh0.iobyxmoadg.AbstractC3181iobyxmoadg.ppxfxbqfkf.f125123cqumvgiudr);
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow(kcexrzcfytVar, mapIwizpuwonk, false, false, false, 14, null)));
    }

    private final void wizcaqwiak() {
        d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(null), 3, null);
    }

    private final void y() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new ojitshcjhn(new zdlpuopuiu(new kcexrzcfyt(new oxmwwwfdhm(new agtfadlqog(ojitshcjhn()))))), new cqumvgiudr(null)), agtfadlqog());
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new vdvldrhtss(new C2088jyumaefscl(new yggfygwlhe(new rgvfuqvkyq(ojitshcjhn())))), new iwizpuwonk(null)), agtfadlqog());
    }

    private final void yzdjzghtvl(yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(zoijcleaowVar.dxjokdxxww(), zoijcleaowVar.btonecajqb(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f84306iwizpuwonk, null, null, 6, null), false, 184, null));
    }

    private final void z() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new esjtqupxsv(null), 3, null);
    }

    public void dvvnrvtcbc(sx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f90560lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f90571wflxmlrfwp;
    }

    public final void eslsurpljm(ru.myspar.myspar.impl.presentation.oxmwwwfdhm event) {
        Object value;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.cdpycssgdh) {
            n();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.cqumvgiudr) {
            ipoelvxyzq();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.agtfadlqog) {
            hszhottldk();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.rgvfuqvkyq) {
            fiwbwshyhd();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.yggfygwlhe) {
            this.f90565pkzmftpjix.eablkybsjg();
            yggfygwlhe(ru.myspar.myspar.impl.presentation.zdlpuopuiu.btonecajqb.f90839iobyxmoadg);
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lereixgezr) {
            this.f90576ylkuphrtab.btonecajqb();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zdlpuopuiu) {
            c(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zdlpuopuiu) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ppxfxbqfkf) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ppxfxbqfkf) event;
            jrbgnlbqoe(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.draadjrbmk) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.draadjrbmk draadjrbmkVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.draadjrbmk) event;
            krqnebusok(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wkgbmnqykc) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wkgbmnqykc wkgbmnqykcVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wkgbmnqykc) event;
            String strIobyxmoadg = wkgbmnqykcVar.iobyxmoadg().iobyxmoadg();
            String strZoijcleaow = wkgbmnqykcVar.iobyxmoadg().zoijcleaow();
            if (strZoijcleaow.length() == 0) {
                strZoijcleaow = this.f90574yadqdtsiqt.getString(pm.dxjokdxxww.promotion);
            }
            this.f90576ylkuphrtab.gxszxtbevo(new ProductListPayload(null, null, null, null, strIobyxmoadg, strZoijcleaow, null, null, false, 463, null), AnalyticsLocation.BrandsFeed.f84246iwizpuwonk, new AnalyticElement.BrandItemElement(strIobyxmoadg, strZoijcleaow));
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.pmvmpeiblj) {
            f(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.pmvmpeiblj) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.kcexrzcfyt) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.kcexrzcfyt kcexrzcfytVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.kcexrzcfyt) event;
            grlcpdaxtj(kcexrzcfytVar.iobyxmoadg(), kcexrzcfytVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.C2107oxmwwwfdhm) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.C2107oxmwwwfdhm c2107oxmwwwfdhm = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.C2107oxmwwwfdhm) event;
            b(c2107oxmwwwfdhm.zoijcleaow(), c2107oxmwwwfdhm.ppxfxbqfkf(), c2107oxmwwwfdhm.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.eablkybsjg) {
            h20.ppxfxbqfkf.dsvhmnatus(this, ((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.eablkybsjg) event).iobyxmoadg(), false, 2, null);
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.iwizpuwonk) {
            e(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.iwizpuwonk) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.jyumaefscl) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.jyumaefscl jyumaefsclVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.jyumaefscl) event;
            d(jyumaefsclVar.iobyxmoadg(), jyumaefsclVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.esjtqupxsv) {
            mhtqkkgtqm(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.esjtqupxsv) event).iobyxmoadg().gtknphoqwx());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.gxszxtbevo) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.gxszxtbevo gxszxtbevoVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.gxszxtbevo) event;
            fmlbqenlif(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.nufgyqmvbu) {
            rhgxfdycjh(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.nufgyqmvbu) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lqeggnwhkg) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lqeggnwhkg) event;
            ezmngbhpjk(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.btonecajqb) {
            yzdjzghtvl(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.myspar.impl.presentation.oxmwwwfdhm.vdvldrhtss.f90815iobyxmoadg)) {
            wizcaqwiak();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.dxjokdxxww) {
            this.f90576ylkuphrtab.draadjrbmk(new SpecificOrderArgs(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.dxjokdxxww) event).iobyxmoadg(), null, false, 6, null));
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zynmafqrjb) {
            g(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zynmafqrjb) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.iobyxmoadg) {
            ixidwrxhsl(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.iobyxmoadg) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow) {
            ylkuphrtab(((ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zoijcleaow) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.myspar.impl.presentation.oxmwwwfdhm.gtknphoqwx.f90789iobyxmoadg)) {
            I();
            return;
        }
        if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.istkbnxepw) {
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ru.myspar.myspar.impl.presentation.kcexrzcfyt.zoijcleaow((ru.myspar.myspar.impl.presentation.kcexrzcfyt) value, null, false, false, false, 13, null)));
        } else if (event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wflxmlrfwp) {
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wflxmlrfwp) event;
            a(wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
        } else {
            if (!(event instanceof ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ojitshcjhn)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ojitshcjhn ojitshcjhnVar = (ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ojitshcjhn) event;
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhnVar.iobyxmoadg(), ojitshcjhnVar.zoijcleaow(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f84306iwizpuwonk, null, null, 6, null), false, 184, null));
        }
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        if (str == null) {
            str = this.f90574yadqdtsiqt.getString(pm.dxjokdxxww.available_only_for_pickup_product);
        }
        yggfygwlhe(new ru.myspar.myspar.impl.presentation.zdlpuopuiu.ppxfxbqfkf(params, str));
    }

    public sj.lqeggnwhkg iwxlajgraz() {
        return this.f90560lqeggnwhkg.ppxfxbqfkf();
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f90557kegysxyocb;
    }

    public void p(y00.iobyxmoadg iobyxmoadgVar) {
        this.f90557kegysxyocb = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f90569tzroggbefp = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        yggfygwlhe(ru.myspar.myspar.impl.presentation.zdlpuopuiu.dxjokdxxww.f90841iobyxmoadg);
    }

    public tg.iobyxmoadg uawqvzlxes() {
        return this.f90569tzroggbefp;
    }

    @Override // vx.eablkybsjg
    protected Object vdvldrhtss(sx.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        dvvnrvtcbc(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(params, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        this.f90576ylkuphrtab.eablkybsjg();
    }
}
