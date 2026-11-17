package ru.myspar.proloyalty.main_activity.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import it1.Splash;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.data.common.MockConstants;
import ow1.hkdspvbjdz;
import ow1.jpowsppfya;
import ow1.pkzmftpjix;
import ow1.ylkuphrtab;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import ru.myspar.proloyalty.user.domain.model.UserState;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn extends sw0.eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ih1.wkgbmnqykc f97847agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final hw1.zoijcleaow f97848btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final z21.iobyxmoadg f97849cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final s01.iobyxmoadg f97850cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final sc1.iobyxmoadg f97851cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private pz0.iobyxmoadg f97852crxdokpmqz;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ih1.ppxfxbqfkf f97853draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final ylkuphrtab f97854dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final lw1.zoijcleaow f97855dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final vc1.iobyxmoadg f97856esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ow1.esjtqupxsv f97857gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final hkdspvbjdz f97858hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final u51.iobyxmoadg f97859hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final jt1.zoijcleaow f97860iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final lw1.iobyxmoadg f97861istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ur0.iobyxmoadg f97862iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private auzgnhcxok f97863jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final k11.iobyxmoadg f97864jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final x21.zoijcleaow f97865jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final an0.iobyxmoadg f97866kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final t21.gxszxtbevo f97867kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final l11.iobyxmoadg f97868lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final jt1.eablkybsjg f97869lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ow1.zdlpuopuiu f97870lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final al1.zoijcleaow f97871mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final yk1.iobyxmoadg f97872ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final jpowsppfya f97873nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final wk1.iobyxmoadg f97874ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final dz0.gtknphoqwx f97875oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final pkzmftpjix f97876pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ow1.iwizpuwonk f97877pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final xr0.zoijcleaow f97878rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private final gg.gtknphoqwx f97879ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private auzgnhcxok f97880sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final vm0.zoijcleaow f97881stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final dw0.iobyxmoadg f97882tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final jt1.iobyxmoadg f97883ulzqkzuiru;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final q41.iobyxmoadg f97884vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ah1.iobyxmoadg f97885wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final jt1.ppxfxbqfkf f97886wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final jt1.wkgbmnqykc f97887wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final j01.zoijcleaow f97888yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final s21.iobyxmoadg f97889yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final cz0.iobyxmoadg f97890ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final kd1.iobyxmoadg f97891zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final m01.nufgyqmvbu f97892zynmafqrjb;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp f97893jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97895zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp wflxmlrfwpVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97893jyumaefscl = wflxmlrfwpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new agtfadlqog(this.f97893jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97895zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l11.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97868lereixgezr;
                l11.iobyxmoadg.C1239iobyxmoadg c1239iobyxmoadg = new l11.iobyxmoadg.C1239iobyxmoadg(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.C2323wflxmlrfwp) this.f97893jyumaefscl).iobyxmoadg().getReviewItem().getArticle());
                this.f97895zdlpuopuiu = 1;
                if (iobyxmoadgVar.zoijcleaow(c1239iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f97896jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97898zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97896jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new btonecajqb(this.f97896jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ComboSet comboSet;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97898zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ojitshcjhn.this.z();
                    String str = this.f97896jyumaefscl;
                    ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    s01.iobyxmoadg.InterfaceC2556iobyxmoadg.C2557iobyxmoadg c2557iobyxmoadg = new s01.iobyxmoadg.InterfaceC2556iobyxmoadg.C2557iobyxmoadg(str);
                    s01.iobyxmoadg iobyxmoadgVar2 = ojitshcjhnVar.f97850cllcsxoeiz;
                    this.f97898zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zoijcleaow(c2557iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            ojitshcjhn ojitshcjhnVar2 = ojitshcjhn.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc) && (comboSet = (ComboSet) hg.jyumaefscl.weqkydbzbr((List) objWkgbmnqykc)) != null) {
                ojitshcjhnVar2.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.btonecajqb(new BuildYourComboDialogArgs(comboSet, ((ComboSetProduct) hg.jyumaefscl.opjhrmiecq(comboSet.getProductsFirst())).getId(), ((ComboSetProduct) hg.jyumaefscl.opjhrmiecq(comboSet.getProductsSecond())).getId())));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar2.zdlpuopuiu(thDxjokdxxww);
            }
            ojitshcjhn.this.i();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class cdpycssgdh extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        cdpycssgdh(Object obj) {
            super(2, obj, ojitshcjhn.class, "publishLabel", "publishLabel(Ljava/lang/Object;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ru.myspar.proloyalty.main_activity.impl.agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.W((ojitshcjhn) this.f60022zdlpuopuiu, agtfadlqogVar, gxszxtbevoVar);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f97900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97901zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97902jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f97903yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97904zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97902jyumaefscl = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f97902jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f97903yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97904zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ojitshcjhn ojitshcjhnVar = this.f97902jyumaefscl;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        cz0.iobyxmoadg iobyxmoadgVar2 = ojitshcjhnVar.f97890ylkuphrtab;
                        this.f97904zdlpuopuiu = 1;
                        obj = iobyxmoadgVar2.cdpycssgdh(this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    gg.kcexrzcfyt.wkgbmnqykc((Cart) obj);
                } catch (Throwable th2) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = ojitshcjhn.this.new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f97900yggfygwlhe = obj;
            return cqumvgiudrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97901zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                UserState userState = (UserState) this.f97900yggfygwlhe;
                if (userState instanceof UserState.IsAuth) {
                    pj.gtknphoqwx.wkgbmnqykc(ojitshcjhn.this.agtfadlqog(), null, null, new iobyxmoadg(ojitshcjhn.this, null), 3, null);
                    ojitshcjhn.this.f97855dxjokdxxww.zoijcleaow();
                    ojitshcjhn.this.f97874ojitshcjhn.gtknphoqwx(ojitshcjhn.this.agtfadlqog());
                } else {
                    if (!(userState instanceof UserState.NonAuth)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ojitshcjhn.this.f97855dxjokdxxww.zoijcleaow();
                    wk1.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97874ojitshcjhn;
                    this.f97901zdlpuopuiu = 1;
                    if (iobyxmoadgVar.btonecajqb(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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
        public final Object invoke(UserState userState, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(userState, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f97905jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f97907zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f97907zdlpuopuiu = obj;
            this.f97905jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.m(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tc1.zoijcleaow f97908jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97910zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(tc1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97908jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new dxjokdxxww(this.f97908jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97910zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ojitshcjhn.b0(ojitshcjhn.this, AnalyticsPage.PurchasePopup.f92363iwizpuwonk, null, null, 6, null);
                ojitshcjhn.this.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.kcexrzcfyt(hd1.zoijcleaow.zoijcleaow(((tc1.zoijcleaow.nufgyqmvbu) this.f97908jyumaefscl).iobyxmoadg())));
                sc1.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97851cqumvgiudr;
                zz0.iobyxmoadg type = ((tc1.zoijcleaow.nufgyqmvbu) this.f97908jyumaefscl).iobyxmoadg().getType();
                this.f97910zdlpuopuiu = 1;
                if (iobyxmoadgVar.wkgbmnqykc(type, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97912zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97912zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ah1.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97885wflxmlrfwp;
                hh1.gtknphoqwx.zoijcleaow zoijcleaowVar = hh1.gtknphoqwx.zoijcleaow.f40371ppxfxbqfkf;
                AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f92334iwizpuwonk;
                this.f97912zdlpuopuiu = 1;
                if (iobyxmoadgVar.gxszxtbevo(zoijcleaowVar, mainScreen, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f97914yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97915zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            esjtqupxsv esjtqupxsvVar = ojitshcjhn.this.new esjtqupxsv(gxszxtbevoVar);
            esjtqupxsvVar.f97914yggfygwlhe = obj;
            return esjtqupxsvVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cz0.iobyxmoadg iobyxmoadgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97915zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                ojitshcjhn.this.f97888yadqdtsiqt.zoijcleaow();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            hw1.iobyxmoadg iobyxmoadgVar2 = (hw1.iobyxmoadg) this.f97914yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, hw1.iobyxmoadg.C0958iobyxmoadg.f41248iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ojitshcjhn.this.f97866kcexrzcfyt.ppxfxbqfkf());
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, hw1.iobyxmoadg.zoijcleaow.f41249iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21.iobyxmoadg iobyxmoadgVar3 = i21.iobyxmoadg.f41720iobyxmoadg;
                MainTab mainTab = MainTab.MY_SPAR;
                this.f97915zdlpuopuiu = 1;
                if (iobyxmoadgVar3.zynmafqrjb(mainTab, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            iobyxmoadgVar = ojitshcjhn.this.f97890ylkuphrtab;
            this.f97915zdlpuopuiu = 2;
            if (iobyxmoadgVar.iwizpuwonk(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhn.this.f97888yadqdtsiqt.zoijcleaow();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().draadjrbmk(ojitshcjhn.this.f97866kcexrzcfyt.eablkybsjg());
            iobyxmoadgVar = ojitshcjhn.this.f97890ylkuphrtab;
            this.f97915zdlpuopuiu = 2;
            if (iobyxmoadgVar.iwizpuwonk(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhn.this.f97888yadqdtsiqt.zoijcleaow();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hw1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((esjtqupxsv) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f97917yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97918zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gtknphoqwx gtknphoqwxVar = ojitshcjhn.this.new gtknphoqwx(gxszxtbevoVar);
            gtknphoqwxVar.f97917yggfygwlhe = obj;
            return gtknphoqwxVar;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0135  */
        /* JADX WARN: Code duplicated, block: B:45:0x013e  */
        /* JADX WARN: Code duplicated, block: B:46:0x0140  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ?? r13;
            ?? r23;
            ojitshcjhn ojitshcjhnVar;
            Throwable thDxjokdxxww;
            Object obj2;
            Splash splash;
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn;
            Object value;
            uc1.iwizpuwonk iwizpuwonkVar;
            Object objZoijcleaow;
            String str;
            Object value2;
            uc1.iwizpuwonk iwizpuwonkVar2;
            Object objZoijcleaow2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r14 = this.f97918zdlpuopuiu;
            try {
                if (r14 != 0) {
                    if (r14 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow = obj;
                    } else {
                        if (r14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = (String) this.f97917yggfygwlhe;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow2 = obj;
                        r14 = str2;
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Splash) objZoijcleaow2);
                    r13 = r14;
                    r23 = r13;
                    ojitshcjhnVar = ojitshcjhn.this;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        ojitshcjhnVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        obj2 = null;
                    } else {
                        obj2 = objWkgbmnqykc;
                    }
                    splash = (Splash) obj2;
                    zynmafqrjbVarOjitshcjhn = ojitshcjhn.this.ojitshcjhn();
                    do {
                        value = zynmafqrjbVarOjitshcjhn.getValue();
                        iwizpuwonkVar = (uc1.iwizpuwonk) value;
                    } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : r23, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : splash, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
                    ojitshcjhn.this.yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.ppxfxbqfkf.f97815iobyxmoadg);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f97917yggfygwlhe;
                ow1.zdlpuopuiu zdlpuopuiuVar = ojitshcjhn.this.f97870lqeggnwhkg;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f97917yggfygwlhe = cllcsxoeizVar;
                this.f97918zdlpuopuiu = 1;
                objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                UserInfo userInfo = (UserInfo) objZoijcleaow;
                String firstName = userInfo != null ? userInfo.getFirstName() : null;
                if (firstName == null) {
                    firstName = "";
                }
                String string = ojitshcjhn.this.f97884vdvldrhtss.getString(ojitshcjhn.this.f97878rgvfuqvkyq.zoijcleaow());
                if (mj.kcexrzcfyt.zfvoamnweg(firstName)) {
                    str = string + "!";
                } else {
                    str = string + ", " + firstName + "!";
                }
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn.this.ojitshcjhn();
                while (true) {
                    Object value3 = zynmafqrjbVarOjitshcjhn2.getValue();
                    uc1.iwizpuwonk iwizpuwonkVar3 = (uc1.iwizpuwonk) value3;
                    sj.zynmafqrjb zynmafqrjbVar = zynmafqrjbVarOjitshcjhn2;
                    if (zynmafqrjbVar.compareAndSet(value3, iwizpuwonkVar3.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar3.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar3.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar3.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar3.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar3.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar3.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar3.f113281lqeggnwhkg : str, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar3.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar3.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar3.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar3.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar3.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar3.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar3.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar3.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar3.f113285rgvfuqvkyq : null))) {
                        break;
                    }
                    zynmafqrjbVarOjitshcjhn2 = zynmafqrjbVar;
                }
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn3 = ojitshcjhn.this.ojitshcjhn();
                do {
                    value2 = zynmafqrjbVarOjitshcjhn3.getValue();
                    iwizpuwonkVar2 = (uc1.iwizpuwonk) value2;
                } while (!zynmafqrjbVarOjitshcjhn3.compareAndSet(value2, iwizpuwonkVar2.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar2.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar2.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar2.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar2.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar2.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar2.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar2.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar2.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar2.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar2.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar2.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar2.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar2.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar2.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar2.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar2.f113285rgvfuqvkyq : null)));
                ojitshcjhn ojitshcjhnVar2 = ojitshcjhn.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                jt1.zoijcleaow zoijcleaowVar = ojitshcjhnVar2.f97860iozdgvuglv;
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f97917yggfygwlhe = str;
                this.f97918zdlpuopuiu = 2;
                objZoijcleaow2 = zoijcleaowVar.zoijcleaow(wwaezpbzknVar2, this);
                r14 = str;
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Splash) objZoijcleaow2);
                r13 = r14;
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                r13 = r14;
            }
            r23 = r13;
            ojitshcjhnVar = ojitshcjhn.this;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar.zdlpuopuiu(thDxjokdxxww);
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                obj2 = null;
            } else {
                obj2 = objWkgbmnqykc;
            }
            splash = (Splash) obj2;
            zynmafqrjbVarOjitshcjhn = ojitshcjhn.this.ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
                iwizpuwonkVar = (uc1.iwizpuwonk) value;
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : r23, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : splash, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
            ojitshcjhn.this.yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.ppxfxbqfkf.f97815iobyxmoadg);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97920zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97920zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ah1.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97885wflxmlrfwp;
                hh1.gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = hh1.gtknphoqwx.iobyxmoadg.f40369ppxfxbqfkf;
                AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f92334iwizpuwonk;
                this.f97920zdlpuopuiu = 1;
                if (iobyxmoadgVar.gxszxtbevo(iobyxmoadgVar2, mainScreen, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, ojitshcjhn.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((ojitshcjhn) this.receiver).zdlpuopuiu(p13);
        }
    }

    public static final class iozdgvuglv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn f97921yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f97922zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97923yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f97924zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$iozdgvuglv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2314iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f97926yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f97927zdlpuopuiu;

                public C2314iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f97927zdlpuopuiu = obj;
                    this.f97926yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, ojitshcjhn ojitshcjhnVar) {
                this.f97924zdlpuopuiu = nufgyqmvbuVar;
                this.f97923yggfygwlhe = ojitshcjhnVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2314iobyxmoadg c2314iobyxmoadg;
                if (gxszxtbevoVar instanceof C2314iobyxmoadg) {
                    c2314iobyxmoadg = (C2314iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2314iobyxmoadg.f97926yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2314iobyxmoadg.f97926yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2314iobyxmoadg = new C2314iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2314iobyxmoadg = new C2314iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2314iobyxmoadg.f97927zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2314iobyxmoadg.f97926yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f97924zdlpuopuiu;
                    if (((Boolean) this.f97923yggfygwlhe.f97857gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                        c2314iobyxmoadg.f97926yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2314iobyxmoadg) == objGxszxtbevo) {
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

        public iozdgvuglv(sj.lqeggnwhkg lqeggnwhkgVar, ojitshcjhn ojitshcjhnVar) {
            this.f97922zdlpuopuiu = lqeggnwhkgVar;
            this.f97921yggfygwlhe = ojitshcjhnVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f97922zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f97921yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class istkbnxepw implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f97928zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f97929zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$istkbnxepw$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2315iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f97931yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f97932zdlpuopuiu;

                public C2315iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f97932zdlpuopuiu = obj;
                    this.f97931yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f97929zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2315iobyxmoadg c2315iobyxmoadg;
                if (gxszxtbevoVar instanceof C2315iobyxmoadg) {
                    c2315iobyxmoadg = (C2315iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2315iobyxmoadg.f97931yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2315iobyxmoadg.f97931yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2315iobyxmoadg = new C2315iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2315iobyxmoadg = new C2315iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2315iobyxmoadg.f97932zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2315iobyxmoadg.f97931yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f97929zdlpuopuiu;
                    Object cqumvgiudrVar = ((Boolean) obj).booleanValue() ? ru.myspar.proloyalty.main_activity.impl.agtfadlqog.zoijcleaow.f97823iobyxmoadg : new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.cqumvgiudr(lr0.eablkybsjg.ppxfxbqfkf.f63912ppxfxbqfkf);
                    c2315iobyxmoadg.f97931yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(cqumvgiudrVar, c2315iobyxmoadg) == objGxszxtbevo) {
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

        public istkbnxepw(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f97928zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f97928zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class iwizpuwonk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f97933zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f97934zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$iwizpuwonk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2316iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f97936yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f97937zdlpuopuiu;

                public C2316iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f97937zdlpuopuiu = obj;
                    this.f97936yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f97934zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2316iobyxmoadg c2316iobyxmoadg;
                if (gxszxtbevoVar instanceof C2316iobyxmoadg) {
                    c2316iobyxmoadg = (C2316iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2316iobyxmoadg.f97936yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2316iobyxmoadg.f97936yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2316iobyxmoadg = new C2316iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2316iobyxmoadg = new C2316iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2316iobyxmoadg.f97937zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2316iobyxmoadg.f97936yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f97934zdlpuopuiu;
                    UserNews userNews = (UserNews) obj;
                    gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(userNews.getNotifications() + userNews.getDiscounts()), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(userNews.getChatSupportMessages()));
                    c2316iobyxmoadg.f97936yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(vdvldrhtssVarIobyxmoadg, c2316iobyxmoadg) == objGxszxtbevo) {
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

        public iwizpuwonk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f97933zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f97933zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f97939yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97940zdlpuopuiu;

        public static final class eablkybsjg implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f97941zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f97942zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$jyumaefscl$eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2317iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f97944yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f97945zdlpuopuiu;

                    public C2317iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f97945zdlpuopuiu = obj;
                        this.f97944yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f97942zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2317iobyxmoadg c2317iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2317iobyxmoadg) {
                        c2317iobyxmoadg = (C2317iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2317iobyxmoadg.f97944yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2317iobyxmoadg.f97944yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2317iobyxmoadg = new C2317iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2317iobyxmoadg = new C2317iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2317iobyxmoadg.f97945zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2317iobyxmoadg.f97944yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f97942zdlpuopuiu;
                        if (((Boolean) obj).booleanValue()) {
                            c2317iobyxmoadg.f97944yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2317iobyxmoadg) == objGxszxtbevo) {
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

            public eablkybsjg(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f97941zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f97941zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class gxszxtbevo implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f97946zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f97947zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$jyumaefscl$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2318iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f97949yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f97950zdlpuopuiu;

                    public C2318iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f97950zdlpuopuiu = obj;
                        this.f97949yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f97947zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2318iobyxmoadg c2318iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2318iobyxmoadg) {
                        c2318iobyxmoadg = (C2318iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2318iobyxmoadg.f97949yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2318iobyxmoadg.f97949yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2318iobyxmoadg = new C2318iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2318iobyxmoadg = new C2318iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2318iobyxmoadg.f97950zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2318iobyxmoadg.f97949yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f97947zdlpuopuiu;
                        if (((Boolean) obj).booleanValue()) {
                            c2318iobyxmoadg.f97949yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2318iobyxmoadg) == objGxszxtbevo) {
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

            public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f97946zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f97946zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97951yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97952zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97951yggfygwlhe = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f97951yggfygwlhe, gxszxtbevoVar);
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97952zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    jt1.eablkybsjg eablkybsjgVar = this.f97951yggfygwlhe.f97869lmojexxdyd;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f97952zdlpuopuiu = 1;
                    if (eablkybsjgVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
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

            public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class lqeggnwhkg implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f97953zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f97954zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$jyumaefscl$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2319iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f97956yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f97957zdlpuopuiu;

                    public C2319iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f97957zdlpuopuiu = obj;
                        this.f97956yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f97954zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2319iobyxmoadg c2319iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2319iobyxmoadg) {
                        c2319iobyxmoadg = (C2319iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2319iobyxmoadg.f97956yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2319iobyxmoadg.f97956yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2319iobyxmoadg = new C2319iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2319iobyxmoadg = new C2319iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2319iobyxmoadg.f97957zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2319iobyxmoadg.f97956yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f97954zdlpuopuiu;
                        String strWkgbmnqykc = ((pz0.iobyxmoadg) obj).wkgbmnqykc();
                        c2319iobyxmoadg.f97956yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(strWkgbmnqykc, c2319iobyxmoadg) == objGxszxtbevo) {
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

            public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f97953zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f97953zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97958yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97959zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97958yggfygwlhe = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f97958yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f97959zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    jt1.eablkybsjg eablkybsjgVar = this.f97958yggfygwlhe.f97869lmojexxdyd;
                    this.f97959zdlpuopuiu = 1;
                    if (eablkybsjgVar.wkgbmnqykc(this) == objGxszxtbevo) {
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
            public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(obj, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97960jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f97961yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97962zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f97960jyumaefscl = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f97962zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f97960jyumaefscl.zdlpuopuiu((Throwable) this.f97961yggfygwlhe);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f97960jyumaefscl, gxszxtbevoVar);
                wkgbmnqykcVar.f97961yggfygwlhe = th2;
                return wkgbmnqykcVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97963jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f97964yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97965zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f97963jyumaefscl = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f97965zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f97963jyumaefscl.zdlpuopuiu((Throwable) this.f97964yggfygwlhe);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f97963jyumaefscl, gxszxtbevoVar);
                zoijcleaowVar.f97964yggfygwlhe = th2;
                return zoijcleaowVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = ojitshcjhn.this.new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f97939yggfygwlhe = obj;
            return jyumaefsclVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cllcsxoeiz cllcsxoeizVar;
            cllcsxoeiz cllcsxoeizVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97940zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    cllcsxoeiz cllcsxoeizVar3 = (cllcsxoeiz) this.f97939yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    cllcsxoeizVar = cllcsxoeizVar3;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cllcsxoeizVar2 = (cllcsxoeiz) this.f97939yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                ylkuphrtab ylkuphrtabVar = ojitshcjhn.this.f97854dsvhmnatus;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ojitshcjhn(sj.dxjokdxxww.wypolnanlu(sj.dxjokdxxww.zdlpuopuiu(sj.dxjokdxxww.vdvldrhtss((sj.lqeggnwhkg) ylkuphrtabVar.zoijcleaow(wwaezpbzknVar)), 1), sj.dxjokdxxww.zdlpuopuiu(sj.dxjokdxxww.vdvldrhtss(new lqeggnwhkg(ojitshcjhn.this.f97892zynmafqrjb.zoijcleaow(wwaezpbzknVar))), 1)), MockConstants.TWO_SECONDS_DELAY), new ppxfxbqfkf(ojitshcjhn.this, null)), new wkgbmnqykc(ojitshcjhn.this, null)), cllcsxoeizVar2);
                return wwaezpbzknVar;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeizVar = (cllcsxoeiz) this.f97939yggfygwlhe;
            jt1.wkgbmnqykc wkgbmnqykcVar = ojitshcjhn.this.f97887wypolnanlu;
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new eablkybsjg((sj.lqeggnwhkg) wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar2)), new iobyxmoadg(ojitshcjhn.this, null)), new zoijcleaow(ojitshcjhn.this, null)), cllcsxoeizVar);
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo((sj.lqeggnwhkg) ojitshcjhn.this.f97887wypolnanlu.zoijcleaow(wwaezpbzknVar2));
            this.f97939yggfygwlhe = cllcsxoeizVar;
            this.f97940zdlpuopuiu = 1;
            if (sj.dxjokdxxww.pmvmpeiblj(gxszxtbevoVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            jt1.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97883ulzqkzuiru;
            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f97939yggfygwlhe = cllcsxoeizVar;
            this.f97940zdlpuopuiu = 2;
            if (iobyxmoadgVar.zoijcleaow(wwaezpbzknVar3, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cllcsxoeizVar2 = cllcsxoeizVar;
            ylkuphrtab ylkuphrtabVar2 = ojitshcjhn.this.f97854dsvhmnatus;
            gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ojitshcjhn(sj.dxjokdxxww.wypolnanlu(sj.dxjokdxxww.zdlpuopuiu(sj.dxjokdxxww.vdvldrhtss((sj.lqeggnwhkg) ylkuphrtabVar2.zoijcleaow(wwaezpbzknVar4)), 1), sj.dxjokdxxww.zdlpuopuiu(sj.dxjokdxxww.vdvldrhtss(new lqeggnwhkg(ojitshcjhn.this.f97892zynmafqrjb.zoijcleaow(wwaezpbzknVar4))), 1)), MockConstants.TWO_SECONDS_DELAY), new ppxfxbqfkf(ojitshcjhn.this, null)), new wkgbmnqykc(ojitshcjhn.this, null)), cllcsxoeizVar2);
            return wwaezpbzknVar4;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class kcexrzcfyt extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        kcexrzcfyt(Object obj) {
            super(1, obj, ojitshcjhn.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((ojitshcjhn) this.receiver).zdlpuopuiu(p13);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f97967yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97968zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = ojitshcjhn.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f97967yggfygwlhe = obj;
            return lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f97968zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) this.f97967yggfygwlhe;
            int iIntValue = ((Number) vdvldrhtssVar.iobyxmoadg()).intValue();
            int iIntValue2 = ((Number) vdvldrhtssVar.wkgbmnqykc()).intValue();
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn.this.ojitshcjhn();
            while (true) {
                Object value = zynmafqrjbVarOjitshcjhn.getValue();
                uc1.iwizpuwonk iwizpuwonkVar = (uc1.iwizpuwonk) value;
                sj.zynmafqrjb zynmafqrjbVar = zynmafqrjbVarOjitshcjhn;
                if (zynmafqrjbVar.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : iIntValue2, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : iIntValue, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null))) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                zynmafqrjbVarOjitshcjhn = zynmafqrjbVar;
            }
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lereixgezr) create(vdvldrhtssVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lmojexxdyd extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f97970jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f97971yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f97972zdlpuopuiu;

        lmojexxdyd(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lmojexxdyd lmojexxdydVar = ojitshcjhn.this.new lmojexxdyd(gxszxtbevoVar);
            lmojexxdydVar.f97970jyumaefscl = obj;
            return lmojexxdydVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ojitshcjhn ojitshcjhnVar;
            Throwable thDxjokdxxww;
            ojitshcjhn ojitshcjhnVar2;
            ah1.iobyxmoadg.C0041iobyxmoadg c0041iobyxmoadg;
            hh1.btonecajqb btonecajqbVar;
            hh1.btonecajqb btonecajqbVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97971yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        ojitshcjhnVar2 = (ojitshcjhn) this.f97972zdlpuopuiu;
                        c0041iobyxmoadg = (ah1.iobyxmoadg.C0041iobyxmoadg) this.f97970jyumaefscl;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        btonecajqbVar2 = (hh1.btonecajqb) this.f97970jyumaefscl;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    btonecajqbVar = btonecajqbVar2;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(btonecajqbVar);
                    ojitshcjhnVar = ojitshcjhn.this;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        ojitshcjhnVar.l(thDxjokdxxww);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ah1.iobyxmoadg.C0041iobyxmoadg c0041iobyxmoadg2 = (ah1.iobyxmoadg.C0041iobyxmoadg) this.f97970jyumaefscl;
                ojitshcjhnVar2 = ojitshcjhn.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ih1.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhnVar2.f97853draadjrbmk;
                hh1.gtknphoqwx gtknphoqwxVarIobyxmoadg = c0041iobyxmoadg2.iobyxmoadg();
                this.f97970jyumaefscl = c0041iobyxmoadg2;
                this.f97972zdlpuopuiu = ojitshcjhnVar2;
                this.f97971yggfygwlhe = 1;
                Object objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(gtknphoqwxVarIobyxmoadg, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                c0041iobyxmoadg = c0041iobyxmoadg2;
                obj = objZoijcleaow;
                hh1.btonecajqb btonecajqbVar3 = (hh1.btonecajqb) obj;
                btonecajqbVar = null;
                if (btonecajqbVar3 != null) {
                    ojitshcjhnVar2.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.oxmwwwfdhm(btonecajqbVar3, c0041iobyxmoadg.zoijcleaow()));
                    ih1.wkgbmnqykc wkgbmnqykcVar = ojitshcjhnVar2.f97847agtfadlqog;
                    String strZoijcleaow = btonecajqbVar3.zoijcleaow();
                    this.f97970jyumaefscl = btonecajqbVar3;
                    this.f97972zdlpuopuiu = null;
                    this.f97971yggfygwlhe = 2;
                    if (wkgbmnqykcVar.zoijcleaow(strZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    btonecajqbVar2 = btonecajqbVar3;
                    btonecajqbVar = btonecajqbVar2;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(btonecajqbVar);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            ojitshcjhnVar = ojitshcjhn.this;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar.l(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ah1.iobyxmoadg.C0041iobyxmoadg c0041iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lmojexxdyd) create(c0041iobyxmoadg, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn f97973jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jd1.ppxfxbqfkf f97974yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97975zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(jd1.ppxfxbqfkf ppxfxbqfkfVar, ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97974yggfygwlhe = ppxfxbqfkfVar;
            this.f97973jyumaefscl = ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f97974yggfygwlhe, this.f97973jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97975zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long jWkgbmnqykc = this.f97974yggfygwlhe.wkgbmnqykc();
                this.f97975zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(jWkgbmnqykc, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            pz0.iobyxmoadg iobyxmoadgVar = this.f97973jyumaefscl.f97852crxdokpmqz;
            String strWkgbmnqykc = iobyxmoadgVar != null ? iobyxmoadgVar.wkgbmnqykc() : null;
            if (strWkgbmnqykc == null) {
                strWkgbmnqykc = "";
            }
            pz0.iobyxmoadg iobyxmoadgVar2 = this.f97973jyumaefscl.f97852crxdokpmqz;
            this.f97973jyumaefscl.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.lqeggnwhkg(strWkgbmnqykc, iobyxmoadgVar2 != null ? iobyxmoadgVar2.ppxfxbqfkf() : null, this.f97974yggfygwlhe));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn f97976jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tc1.zoijcleaow f97977yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97978zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(tc1.zoijcleaow zoijcleaowVar, ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97977yggfygwlhe = zoijcleaowVar;
            this.f97976jyumaefscl = ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f97977yggfygwlhe, this.f97976jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97978zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long delayMs = ((tc1.zoijcleaow.gtknphoqwx) this.f97977yggfygwlhe).iobyxmoadg().getDelayMs();
                this.f97978zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(delayMs, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            this.f97976jyumaefscl.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.iwizpuwonk(((tc1.zoijcleaow.gtknphoqwx) this.f97977yggfygwlhe).iobyxmoadg()));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$ojitshcjhn, reason: collision with other inner class name */
    static final class C2320ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ur0.ppxfxbqfkf f97979jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97981zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2320ojitshcjhn(ur0.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97979jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new C2320ojitshcjhn(this.f97979jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97981zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97862iwizpuwonk;
                ur0.ppxfxbqfkf ppxfxbqfkfVar = this.f97979jyumaefscl;
                this.f97981zdlpuopuiu = 1;
                if (iobyxmoadgVar.eablkybsjg(ppxfxbqfkfVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2320ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f97983yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97984zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = ojitshcjhn.this.new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f97983yggfygwlhe = obj;
            return oxmwwwfdhmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f97984zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            y11.iobyxmoadg iobyxmoadgVar = (y11.iobyxmoadg) this.f97983yggfygwlhe;
            if (iobyxmoadgVar instanceof y11.iobyxmoadg.ppxfxbqfkf) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().draadjrbmk(ojitshcjhn.this.f97866kcexrzcfyt.eablkybsjg());
            } else if (iobyxmoadgVar instanceof y11.iobyxmoadg.zoijcleaow) {
                ojitshcjhn.this.l(((y11.iobyxmoadg.zoijcleaow) iobyxmoadgVar).iobyxmoadg());
            } else if (iobyxmoadgVar instanceof y11.iobyxmoadg.wkgbmnqykc) {
                ojitshcjhn.this.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.cqumvgiudr(((y11.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg()));
            } else if (iobyxmoadgVar instanceof y11.iobyxmoadg.C3121iobyxmoadg) {
                ojitshcjhn.this.A();
            } else {
                if (!(iobyxmoadgVar instanceof y11.iobyxmoadg.eablkybsjg)) {
                    throw new NoWhenBranchMatchedException();
                }
                ojitshcjhn.this.B(((y11.iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg());
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y11.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97986zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97987jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f97988yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f97989zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f97987jyumaefscl = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f97987jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f97988yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object value;
                uc1.iwizpuwonk iwizpuwonkVar;
                mg.zoijcleaow.gxszxtbevo();
                if (this.f97989zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                List list = (List) this.f97988yggfygwlhe;
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = this.f97987jyumaefscl.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    iwizpuwonkVar = (uc1.iwizpuwonk) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : list.size(), (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(list, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new pmvmpeiblj(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f97986zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(ojitshcjhn.this.e().iobyxmoadg(), new iobyxmoadg(ojitshcjhn.this, null)), ojitshcjhn.this.agtfadlqog());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((pmvmpeiblj) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f97990iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f97991jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97993zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97991jyumaefscl = comboSetProduct;
            this.f97990iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new ppxfxbqfkf(this.f97991jyumaefscl, this.f97990iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objAgtfadlqog;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97993zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ojitshcjhn.this.z();
                cz0.iobyxmoadg iobyxmoadgVar = ojitshcjhn.this.f97890ylkuphrtab;
                ComboSetProduct comboSetProduct = this.f97991jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f97990iwizpuwonk;
                this.f97993zdlpuopuiu = 1;
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
            ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
            if (gg.kcexrzcfyt.agtfadlqog(objAgtfadlqog)) {
                Warning warningZoijcleaow = ((kz0.iobyxmoadg) objAgtfadlqog).zoijcleaow();
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warningZoijcleaow, Warning.Empty.f95255jyumaefscl)) {
                    ojitshcjhnVar.yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.dxjokdxxww.f97799iobyxmoadg);
                } else if ((warningZoijcleaow instanceof Warning.WithCodeAndMessage) || (warningZoijcleaow instanceof Warning.DailyLimit)) {
                    ojitshcjhnVar.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.cqumvgiudr(lr0.eablkybsjg.zoijcleaow.dxjokdxxww(lr0.eablkybsjg.f63889zoijcleaow, warningZoijcleaow.getMessage(), null, null, 6, null)));
                } else if (!(warningZoijcleaow instanceof Warning.AvailableOnlyForPickup) && !(warningZoijcleaow instanceof Warning.Interval)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objAgtfadlqog);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar.zdlpuopuiu(thDxjokdxxww);
            }
            ojitshcjhn.this.i();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f97995yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97996zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            rgvfuqvkyq rgvfuqvkyqVar = ojitshcjhn.this.new rgvfuqvkyq(gxszxtbevoVar);
            rgvfuqvkyqVar.f97995yggfygwlhe = obj;
            return rgvfuqvkyqVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0088 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            k11.iobyxmoadg iobyxmoadgVar;
            gg.wwaezpbzkn wwaezpbzknVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97996zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else if (i13 == 2) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar = ojitshcjhn.this.f97864jpowsppfya;
                        wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        this.f97996zdlpuopuiu = 3;
                        if (iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ojitshcjhn.this.f97888yadqdtsiqt.ojitshcjhn(o21.iobyxmoadg.BITRIX_OLD.wkgbmnqykc());
                ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                hkdspvbjdz hkdspvbjdzVar = ojitshcjhnVar.f97858hcddaimhww;
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                this.f97996zdlpuopuiu = 1;
                if (hkdspvbjdzVar.zoijcleaow(wwaezpbzknVar2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                w11.iobyxmoadg.f118559iobyxmoadg.zoijcleaow(thDxjokdxxww);
            }
            this.f97996zdlpuopuiu = 2;
            if (crxdokpmqz.zoijcleaow(100L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = ojitshcjhn.this.f97864jpowsppfya;
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f97996zdlpuopuiu = 3;
            if (iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97998zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f97999jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f98000yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f98001zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f97999jyumaefscl = ojitshcjhnVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f98001zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f97999jyumaefscl.l((Throwable) this.f98000yggfygwlhe);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f97999jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f98000yggfygwlhe = th2;
                return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f98002yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f98003zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ ojitshcjhn f98004yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f98005zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$vdvldrhtss$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2321iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                    Object f98007jyumaefscl;

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f98008yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f98009zdlpuopuiu;

                    public C2321iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f98009zdlpuopuiu = obj;
                        this.f98008yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, ojitshcjhn ojitshcjhnVar) {
                    this.f98005zdlpuopuiu = nufgyqmvbuVar;
                    this.f98004yggfygwlhe = ojitshcjhnVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2321iobyxmoadg c2321iobyxmoadg;
                    sj.nufgyqmvbu nufgyqmvbuVar;
                    if (gxszxtbevoVar instanceof C2321iobyxmoadg) {
                        c2321iobyxmoadg = (C2321iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2321iobyxmoadg.f98008yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2321iobyxmoadg.f98008yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2321iobyxmoadg = new C2321iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2321iobyxmoadg = new C2321iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2321iobyxmoadg.f98009zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2321iobyxmoadg.f98008yggfygwlhe;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            nufgyqmvbuVar = (sj.nufgyqmvbu) c2321iobyxmoadg.f98007jyumaefscl;
                            gg.zdlpuopuiu.zoijcleaow(obj2);
                        } else {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gg.zdlpuopuiu.zoijcleaow(obj2);
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar2 = this.f98005zdlpuopuiu;
                    ojitshcjhn ojitshcjhnVar = this.f98004yggfygwlhe;
                    c2321iobyxmoadg.f98007jyumaefscl = nufgyqmvbuVar2;
                    c2321iobyxmoadg.f98008yggfygwlhe = 1;
                    Object objM = ojitshcjhnVar.m((QrModel) obj, c2321iobyxmoadg);
                    if (objM == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj2 = objM;
                    nufgyqmvbuVar = nufgyqmvbuVar2;
                    if (obj2 != null) {
                        c2321iobyxmoadg.f98007jyumaefscl = null;
                        c2321iobyxmoadg.f98008yggfygwlhe = 2;
                        if (nufgyqmvbuVar.emit(obj2, c2321iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar, ojitshcjhn ojitshcjhnVar) {
                this.f98003zdlpuopuiu = lqeggnwhkgVar;
                this.f98002yggfygwlhe = ojitshcjhnVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f98003zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f98002yggfygwlhe), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* synthetic */ class zoijcleaow implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f98010zdlpuopuiu;

            zoijcleaow(ojitshcjhn ojitshcjhnVar) {
                this.f98010zdlpuopuiu = ojitshcjhnVar;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                    return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
                }
                return false;
            }

            public final int hashCode() {
                return zoijcleaow().hashCode();
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public final Object emit(jd1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objKcexrzcfyt = vdvldrhtss.kcexrzcfyt(this.f98010zdlpuopuiu, wkgbmnqykcVar, gxszxtbevoVar);
                return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.jvm.internal.agtfadlqog
            public final gg.dxjokdxxww zoijcleaow() {
                return new kotlin.jvm.internal.iobyxmoadg(2, this.f98010zdlpuopuiu, ojitshcjhn.class, "changeVpnScreenQrType", "changeVpnScreenQrType(Lru/myspar/proloyalty/main_activity/impl/models/VpnImageUiModel;)V", 4);
            }
        }

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object kcexrzcfyt(ojitshcjhn ojitshcjhnVar, jd1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhnVar.eslsurpljm(wkgbmnqykcVar);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97998zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(new ppxfxbqfkf(ojitshcjhn.this.f97871mbcevpiqjq.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg), ojitshcjhn.this), new iobyxmoadg(ojitshcjhn.this, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(ojitshcjhn.this);
                this.f97998zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Splash f98011iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f98013yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98014zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(Splash splash, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98011iwizpuwonk = splash;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wflxmlrfwp wflxmlrfwpVar = ojitshcjhn.this.new wflxmlrfwp(this.f98011iwizpuwonk, gxszxtbevoVar);
            wflxmlrfwpVar.f98013yggfygwlhe = obj;
            return wflxmlrfwpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object value;
            uc1.iwizpuwonk iwizpuwonkVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98014zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn.this.ojitshcjhn();
                    do {
                        value = zynmafqrjbVarOjitshcjhn.getValue();
                        iwizpuwonkVar = (uc1.iwizpuwonk) value;
                    } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
                    ojitshcjhn.this.f97856esjtqupxsv.ppxfxbqfkf();
                    ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
                    Splash splash = this.f98011iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    jt1.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhnVar.f97886wwaezpbzkn;
                    this.f98014zdlpuopuiu = 1;
                    if (ppxfxbqfkfVar.zoijcleaow(splash, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            ojitshcjhn ojitshcjhnVar2 = ojitshcjhn.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar2.zdlpuopuiu(thDxjokdxxww);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98016zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98016zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ojitshcjhn.this.yzdjzghtvl(true);
                    ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    dw0.iobyxmoadg iobyxmoadgVar2 = ojitshcjhnVar.f97882tzroggbefp;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    this.f98016zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((dw0.iobyxmoadg.C0602iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            ojitshcjhn ojitshcjhnVar2 = ojitshcjhn.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                dw0.iobyxmoadg.C0602iobyxmoadg c0602iobyxmoadg = (dw0.iobyxmoadg.C0602iobyxmoadg) objWkgbmnqykc;
                if (c0602iobyxmoadg == null) {
                    ojitshcjhnVar2.f97867kegysxyocb.zoijcleaow();
                } else {
                    ojitshcjhnVar2.krqnebusok(c0602iobyxmoadg.iobyxmoadg());
                }
            }
            ojitshcjhn ojitshcjhnVar3 = ojitshcjhn.this;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                ojitshcjhnVar3.zdlpuopuiu(thDxjokdxxww);
            }
            ojitshcjhn.this.yzdjzghtvl(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wwaezpbzkn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98018yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98019zdlpuopuiu;

        wwaezpbzkn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wwaezpbzkn wwaezpbzknVar = ojitshcjhn.this.new wwaezpbzkn(gxszxtbevoVar);
            wwaezpbzknVar.f98018yggfygwlhe = obj;
            return wwaezpbzknVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            jd1.wkgbmnqykc wkgbmnqykcVar;
            Object value;
            uc1.iwizpuwonk iwizpuwonkVar;
            Object value2;
            uc1.iwizpuwonk iwizpuwonkVar2;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98019zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            t21.lqeggnwhkg lqeggnwhkgVar = (t21.lqeggnwhkg) this.f98018yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, t21.lqeggnwhkg.iobyxmoadg.f109333iobyxmoadg)) {
                ojitshcjhn.this.D();
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn.this.ojitshcjhn();
                ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
                do {
                    value2 = zynmafqrjbVarOjitshcjhn.getValue();
                    iwizpuwonkVar2 = (uc1.iwizpuwonk) value2;
                    jd1.iobyxmoadg iobyxmoadgVarGtknphoqwx = iwizpuwonkVar2.gtknphoqwx();
                    if (iobyxmoadgVarGtknphoqwx != null) {
                        ojitshcjhnVar.rhgxfdycjh(iobyxmoadgVarGtknphoqwx);
                    }
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, iwizpuwonkVar2.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar2.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar2.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar2.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar2.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar2.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar2.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar2.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar2.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar2.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar2.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar2.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar2.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar2.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar2.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar2.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar2.f113285rgvfuqvkyq : null)));
            } else {
                if (!(lqeggnwhkgVar instanceof t21.lqeggnwhkg.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((Boolean) ojitshcjhn.this.f97857gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    ojitshcjhn.this.C();
                    wkgbmnqykcVar = jd1.wkgbmnqykc.C1100wkgbmnqykc.f51172iobyxmoadg;
                } else {
                    wkgbmnqykcVar = jd1.wkgbmnqykc.eablkybsjg.f51169iobyxmoadg;
                }
                jd1.iobyxmoadg iobyxmoadgVar = new jd1.iobyxmoadg(((t21.lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg(), wkgbmnqykcVar, false, 4, null);
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn.this.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn2.getValue();
                    iwizpuwonkVar = (uc1.iwizpuwonk) value;
                } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : iobyxmoadgVar)));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t21.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wwaezpbzkn) create(lqeggnwhkgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yadqdtsiqt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98021yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98022zdlpuopuiu;

        yadqdtsiqt(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yadqdtsiqt yadqdtsiqtVar = ojitshcjhn.this.new yadqdtsiqt(gxszxtbevoVar);
            yadqdtsiqtVar.f98021yggfygwlhe = obj;
            return yadqdtsiqtVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98022zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ojitshcjhn.this.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.eablkybsjg((ur0.zoijcleaow) this.f98021yggfygwlhe));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ur0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yadqdtsiqt) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98024yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98025zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = ojitshcjhn.this.new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f98024yggfygwlhe = obj;
            return yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98025zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ojitshcjhn.this.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.cqumvgiudr((lr0.eablkybsjg) this.f98024yggfygwlhe));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lr0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98027zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ boolean f98028jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ojitshcjhn f98029yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f98030zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.ojitshcjhn$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2322iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ ojitshcjhn f98031jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f98032yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f98033zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2322iobyxmoadg(ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(3, gxszxtbevoVar);
                    this.f98031jyumaefscl = ojitshcjhnVar;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    mg.zoijcleaow.gxszxtbevo();
                    if (this.f98033zdlpuopuiu != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f98031jyumaefscl.zdlpuopuiu((Throwable) this.f98032yggfygwlhe);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.vdvldrhtss
                /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                    C2322iobyxmoadg c2322iobyxmoadg = new C2322iobyxmoadg(this.f98031jyumaefscl, gxszxtbevoVar);
                    c2322iobyxmoadg.f98032yggfygwlhe = th2;
                    return c2322iobyxmoadg.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* synthetic */ class zoijcleaow implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ ojitshcjhn f98034zdlpuopuiu;

                zoijcleaow(ojitshcjhn ojitshcjhnVar) {
                    this.f98034zdlpuopuiu = ojitshcjhnVar;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
                    }
                    return false;
                }

                public final int hashCode() {
                    return zoijcleaow().hashCode();
                }

                @Override // sj.nufgyqmvbu
                /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
                public final Object emit(tc1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                    Object objKcexrzcfyt = iobyxmoadg.kcexrzcfyt(this.f98034zdlpuopuiu, zoijcleaowVar, gxszxtbevoVar);
                    return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // kotlin.jvm.internal.agtfadlqog
                public final gg.dxjokdxxww zoijcleaow() {
                    return new kotlin.jvm.internal.iobyxmoadg(2, this.f98034zdlpuopuiu, ojitshcjhn.class, "dialogsToUi", "dialogsToUi(Lru/myspar/proloyalty/main_activity/api/models/Dialogs;)V", 4);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ojitshcjhn ojitshcjhnVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f98029yggfygwlhe = ojitshcjhnVar;
                this.f98028jyumaefscl = z13;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object kcexrzcfyt(ojitshcjhn ojitshcjhnVar, tc1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                ojitshcjhnVar.d(zoijcleaowVar);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f98029yggfygwlhe, this.f98028jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f98030zdlpuopuiu;
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
                sc1.iobyxmoadg iobyxmoadgVar = this.f98029yggfygwlhe.f97851cqumvgiudr;
                boolean z13 = this.f98028jyumaefscl;
                this.f98030zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(z13, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo((sj.lqeggnwhkg) obj, new C2322iobyxmoadg(this.f98029yggfygwlhe, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f98029yggfygwlhe);
                this.f98030zdlpuopuiu = 2;
                if (lqeggnwhkgVarGxszxtbevo.collect(zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ojitshcjhn.this.new zdlpuopuiu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98027zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            auzgnhcxok auzgnhcxokVar = ojitshcjhn.this.f97880sopmlzcsov;
            if (auzgnhcxokVar != null) {
                cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
            }
            boolean z13 = ojitshcjhn.this.f97880sopmlzcsov == null;
            ojitshcjhn ojitshcjhnVar = ojitshcjhn.this;
            ojitshcjhnVar.f97880sopmlzcsov = pj.gtknphoqwx.wkgbmnqykc(ojitshcjhnVar.agtfadlqog(), null, null, new iobyxmoadg(ojitshcjhn.this, z13, null), 3, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f98035iobyxmoadg;

        static {
            int[] iArr = new int[MySparScreenPayload.zoijcleaow.values().length];
            try {
                iArr[MySparScreenPayload.zoijcleaow.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MySparScreenPayload.zoijcleaow.CART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MySparScreenPayload.zoijcleaow.ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MySparScreenPayload.zoijcleaow.BROWSER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MySparScreenPayload.zoijcleaow.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f98035iobyxmoadg = iArr;
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98038zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zynmafqrjb zynmafqrjbVar = ojitshcjhn.this.new zynmafqrjb(gxszxtbevoVar);
            zynmafqrjbVar.f98037yggfygwlhe = obj;
            return zynmafqrjbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98038zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ojitshcjhn.this.f97852crxdokpmqz = (pz0.iobyxmoadg) this.f98037yggfygwlhe;
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zynmafqrjb) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(ow1.zdlpuopuiu getUserInfoUseCase, jpowsppfya subscribeUserStateUseCase, lw1.zoijcleaow userNewsInteractor, hw1.zoijcleaow userLogoutObserver, ow1.esjtqupxsv isAuthUseCase, ih1.ppxfxbqfkf getPopupUseCase, ah1.iobyxmoadg popupsObserver, ih1.wkgbmnqykc markPopupAsViewedUseCase, wk1.iobyxmoadg qrCodesInteractor, xr0.zoijcleaow dateUtils, q41.iobyxmoadg resourcesManager, dz0.gtknphoqwx productChangesSourceProvider, an0.iobyxmoadg authFeatureApi, kd1.iobyxmoadg mainNavigationInterractor, s21.iobyxmoadg apiEndPointsProvider, x21.zoijcleaow networkConnectivityChecker, ur0.iobyxmoadg permissionManager, sc1.iobyxmoadg dialogsInteractor, vc1.iobyxmoadg mainActivityScreenAnalytics, l11.iobyxmoadg setShowedReviewWithBonusesUseCase, ow1.iwizpuwonk isAdultCheckedUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, lw1.iobyxmoadg changeFavoritesInteractor, z21.iobyxmoadg snackbarManager, j01.zoijcleaow sharedPreferencesRepository, jt1.zoijcleaow getSplashScreenUseCase, jt1.eablkybsjg updateSplashScreenUseCase, jt1.ppxfxbqfkf setSplashShowedScreenUseCase, cz0.iobyxmoadg cartInteractor, pkzmftpjix subscribeUserNewsUseCase, hkdspvbjdz updateBearerTokenUseCase, k11.iobyxmoadg restartAppUseCase, u51.iobyxmoadg dialogManager, s01.iobyxmoadg getComboSetUseCase, ylkuphrtab subscribeIsAuthUseCase, jt1.wkgbmnqykc subscribeShowedSplashScreenUseCase, vm0.zoijcleaow analyticsTracker, t21.gxszxtbevo vpnConnectionListener, dw0.iobyxmoadg checkVpnConnectionUseCase, al1.zoijcleaow observeCurrentQrcodeUseCase, yk1.iobyxmoadg qrChangeStatusObserver, jt1.iobyxmoadg clearDeprecatedSplashUseCase) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        super(new uc1.iwizpuwonk(null, 0, 0, 0, false, false, null, null, false, null, null, false, null, null, false, null, 65535, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userNewsInteractor, "userNewsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLogoutObserver, "userLogoutObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPopupUseCase, "getPopupUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupsObserver, "popupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(markPopupAsViewedUseCase, "markPopupAsViewedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrCodesInteractor, "qrCodesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mainNavigationInterractor, "mainNavigationInterractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkConnectivityChecker, "networkConnectivityChecker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogsInteractor, "dialogsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mainActivityScreenAnalytics, "mainActivityScreenAnalytics");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setShowedReviewWithBonusesUseCase, "setShowedReviewWithBonusesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(snackbarManager, "snackbarManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSplashScreenUseCase, "getSplashScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateSplashScreenUseCase, "updateSplashScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setSplashShowedScreenUseCase, "setSplashShowedScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserNewsUseCase, "subscribeUserNewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateBearerTokenUseCase, "updateBearerTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restartAppUseCase, "restartAppUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeIsAuthUseCase, "subscribeIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeShowedSplashScreenUseCase, "subscribeShowedSplashScreenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vpnConnectionListener, "vpnConnectionListener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkVpnConnectionUseCase, "checkVpnConnectionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observeCurrentQrcodeUseCase, "observeCurrentQrcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrChangeStatusObserver, "qrChangeStatusObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearDeprecatedSplashUseCase, "clearDeprecatedSplashUseCase");
        this.f97870lqeggnwhkg = getUserInfoUseCase;
        this.f97873nufgyqmvbu = subscribeUserStateUseCase;
        this.f97855dxjokdxxww = userNewsInteractor;
        this.f97848btonecajqb = userLogoutObserver;
        this.f97857gtknphoqwx = isAuthUseCase;
        this.f97853draadjrbmk = getPopupUseCase;
        this.f97885wflxmlrfwp = popupsObserver;
        this.f97847agtfadlqog = markPopupAsViewedUseCase;
        this.f97874ojitshcjhn = qrCodesInteractor;
        this.f97878rgvfuqvkyq = dateUtils;
        this.f97884vdvldrhtss = resourcesManager;
        this.f97875oxmwwwfdhm = productChangesSourceProvider;
        this.f97866kcexrzcfyt = authFeatureApi;
        this.f97891zdlpuopuiu = mainNavigationInterractor;
        this.f97889yggfygwlhe = apiEndPointsProvider;
        this.f97865jyumaefscl = networkConnectivityChecker;
        this.f97862iwizpuwonk = permissionManager;
        this.f97851cqumvgiudr = dialogsInteractor;
        this.f97856esjtqupxsv = mainActivityScreenAnalytics;
        this.f97868lereixgezr = setShowedReviewWithBonusesUseCase;
        this.f97877pmvmpeiblj = isAdultCheckedUseCase;
        this.f97892zynmafqrjb = subscribeToCurrentDeliveryDataUseCase;
        this.f97861istkbnxepw = changeFavoritesInteractor;
        this.f97849cdpycssgdh = snackbarManager;
        this.f97888yadqdtsiqt = sharedPreferencesRepository;
        this.f97860iozdgvuglv = getSplashScreenUseCase;
        this.f97869lmojexxdyd = updateSplashScreenUseCase;
        this.f97886wwaezpbzkn = setSplashShowedScreenUseCase;
        this.f97890ylkuphrtab = cartInteractor;
        this.f97876pkzmftpjix = subscribeUserNewsUseCase;
        this.f97858hcddaimhww = updateBearerTokenUseCase;
        this.f97864jpowsppfya = restartAppUseCase;
        this.f97859hkdspvbjdz = dialogManager;
        this.f97850cllcsxoeiz = getComboSetUseCase;
        this.f97854dsvhmnatus = subscribeIsAuthUseCase;
        this.f97887wypolnanlu = subscribeShowedSplashScreenUseCase;
        this.f97881stevsuqkhv = analyticsTracker;
        this.f97867kegysxyocb = vpnConnectionListener;
        this.f97882tzroggbefp = checkVpnConnectionUseCase;
        this.f97871mbcevpiqjq = observeCurrentQrcodeUseCase;
        this.f97872ntlheqmsrt = qrChangeStatusObserver;
        this.f97883ulzqkzuiru = clearDeprecatedSplashUseCase;
        this.f97879ribwqtqdhb = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: uc1.cqumvgiudr
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.w(this.f113261zdlpuopuiu);
            }
        });
        E();
        k();
        U();
        T();
        Y();
        X();
        Q();
        V();
        Z();
        R();
        changeFavoritesInteractor.gxszxtbevo(agtfadlqog(), new iobyxmoadg(this));
        s21.zoijcleaow zoijcleaowVarLqeggnwhkg = apiEndPointsProvider.lqeggnwhkg();
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : zoijcleaowVarLqeggnwhkg, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        this.f97859hkdspvbjdz.stop();
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : ru.myspar.proloyalty.main_activity.impl.draadjrbmk.iobyxmoadg.f97828iobyxmoadg, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String str) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        this.f97859hkdspvbjdz.stop();
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : new ru.myspar.proloyalty.main_activity.impl.draadjrbmk.zoijcleaow(str), (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        auzgnhcxok auzgnhcxokVar = this.f97863jlmebxxoox;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f97863jlmebxxoox = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new vdvldrhtss(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        auzgnhcxok auzgnhcxokVar = this.f97863jlmebxxoox;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f97863jlmebxxoox = null;
    }

    private final void E() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(w11.iobyxmoadg.f118559iobyxmoadg.ppxfxbqfkf(), new oxmwwwfdhm(null)), agtfadlqog());
    }

    private final void F() {
        this.f97891zdlpuopuiu.vdvldrhtss(agtfadlqog(), new tg.draadjrbmk() { // from class: uc1.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.M(this.f113266zdlpuopuiu, (MainTab) obj);
            }
        }, new tg.draadjrbmk() { // from class: uc1.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.N(this.f113291zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new tg.draadjrbmk() { // from class: uc1.pmvmpeiblj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.O(this.f113299zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new tg.iobyxmoadg() { // from class: uc1.zynmafqrjb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.G(this.f113310zdlpuopuiu);
            }
        }, new tg.rgvfuqvkyq() { // from class: uc1.istkbnxepw
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.H(this.f113272zdlpuopuiu, (EvropolisGift) obj, (DeliveryCode) obj2);
            }
        }, new tg.draadjrbmk() { // from class: uc1.cdpycssgdh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.I(this.f113260zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: uc1.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.J(this.f113308zdlpuopuiu, (PurchaseListSharedWithYouDialogArgs) obj);
            }
        }, new tg.draadjrbmk() { // from class: uc1.iozdgvuglv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.K(this.f113271zdlpuopuiu, (x81.wflxmlrfwp) obj);
            }
        }, new tg.draadjrbmk() { // from class: uc1.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.main_activity.impl.ojitshcjhn.L(this.f113292zdlpuopuiu, (String) obj);
            }
        }, new kcexrzcfyt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn G(ojitshcjhn ojitshcjhnVar) {
        ojitshcjhnVar.yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.zdlpuopuiu.f97822iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn H(ojitshcjhn ojitshcjhnVar, EvropolisGift gift, DeliveryCode deliveryCode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
        ojitshcjhnVar.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.C2312agtfadlqog(gift, deliveryCode));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I(ojitshcjhn ojitshcjhnVar, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ojitshcjhnVar.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.wkgbmnqykc(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn J(ojitshcjhn ojitshcjhnVar, PurchaseListSharedWithYouDialogArgs it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ojitshcjhnVar.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.gtknphoqwx(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn K(ojitshcjhn ojitshcjhnVar, x81.wflxmlrfwp it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ojitshcjhnVar.yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.yggfygwlhe(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn L(ojitshcjhn ojitshcjhnVar, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ojitshcjhnVar.j(it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn M(ojitshcjhn ojitshcjhnVar, MainTab tab) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tab, "tab");
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhnVar.ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : tab, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn N(ojitshcjhn ojitshcjhnVar, boolean z13) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhnVar.ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : !z13, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn O(ojitshcjhn ojitshcjhnVar, boolean z13) {
        if (z13) {
            ojitshcjhnVar.z();
        } else {
            ojitshcjhnVar.i();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void P() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97851cqumvgiudr.ppxfxbqfkf(), new zdlpuopuiu(null)), agtfadlqog());
    }

    private final void Q() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97849cdpycssgdh.zoijcleaow(), new yggfygwlhe(null)), agtfadlqog());
    }

    private final void R() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new jyumaefscl(null), 3, null);
    }

    private final void S() {
        jpowsppfya jpowsppfyaVar = this.f97873nufgyqmvbu;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb((sj.lqeggnwhkg) jpowsppfyaVar.zoijcleaow(wwaezpbzknVar), new cqumvgiudr(null)), agtfadlqog());
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97848btonecajqb.nufgyqmvbu(), new esjtqupxsv(null)), agtfadlqog());
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(new iwizpuwonk((sj.lqeggnwhkg) this.f97876pkzmftpjix.zoijcleaow(wwaezpbzknVar))), new lereixgezr(null)), agtfadlqog());
    }

    private final void T() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new pmvmpeiblj(null), 3, null);
    }

    private final void U() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97892zynmafqrjb.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg), new zynmafqrjb(null)), agtfadlqog());
    }

    private final void V() {
        this.f97865jyumaefscl.iobyxmoadg();
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new istkbnxepw(this.f97865jyumaefscl.getState()), new cdpycssgdh(this)), agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object W(ojitshcjhn ojitshcjhnVar, ru.myspar.proloyalty.main_activity.impl.agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhnVar.yggfygwlhe(agtfadlqogVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void X() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97862iwizpuwonk.wkgbmnqykc(), new yadqdtsiqt(null)), agtfadlqog());
    }

    private final void Y() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new iozdgvuglv(this.f97885wflxmlrfwp.iobyxmoadg(), this), new lmojexxdyd(null)), agtfadlqog());
    }

    private final void Z() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f97867kegysxyocb.iobyxmoadg(), new wwaezpbzkn(null)), agtfadlqog());
    }

    private final void a0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f97881stevsuqkhv.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void b0(ojitshcjhn ojitshcjhnVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        ojitshcjhnVar.a0(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void c() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(tc1.zoijcleaow zoijcleaowVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, tc1.zoijcleaow.gxszxtbevo.f110284iobyxmoadg)) {
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.rgvfuqvkyq.f97816iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, tc1.zoijcleaow.ppxfxbqfkf.f110288iobyxmoadg)) {
            this.f97856esjtqupxsv.iobyxmoadg();
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.draadjrbmk.f97798iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, tc1.zoijcleaow.eablkybsjg.f110282iobyxmoadg)) {
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.ojitshcjhn.f97812iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, tc1.zoijcleaow.agtfadlqog.f110278iobyxmoadg)) {
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.vdvldrhtss.f97817iobyxmoadg);
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.dxjokdxxww) {
            this.f97856esjtqupxsv.zoijcleaow();
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.zdlpuopuiu.f97822iobyxmoadg);
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.btonecajqb) {
            yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.jyumaefscl(((tc1.zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, tc1.zoijcleaow.draadjrbmk.f110280iobyxmoadg)) {
            yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.nufgyqmvbu.f97811iobyxmoadg);
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.wflxmlrfwp) {
            yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.esjtqupxsv(((tc1.zoijcleaow.wflxmlrfwp) zoijcleaowVar).iobyxmoadg()));
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.iobyxmoadg) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(null), 3, null);
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.lqeggnwhkg) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(null), 3, null);
            return;
        }
        if (zoijcleaowVar instanceof tc1.zoijcleaow.C2705zoijcleaow) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(hd1.iobyxmoadg.zoijcleaow(((tc1.zoijcleaow.C2705zoijcleaow) zoijcleaowVar).iobyxmoadg()), this, null), 3, null);
        } else if (zoijcleaowVar instanceof tc1.zoijcleaow.gtknphoqwx) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new nufgyqmvbu(zoijcleaowVar, this, null), 3, null);
        } else if (zoijcleaowVar instanceof tc1.zoijcleaow.nufgyqmvbu) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new dxjokdxxww(zoijcleaowVar, null), 3, null);
        } else {
            if (!(zoijcleaowVar instanceof tc1.zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.wflxmlrfwp(((tc1.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb e() {
        return (dz0.btonecajqb) this.f97879ribwqtqdhb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eslsurpljm(jd1.wkgbmnqykc wkgbmnqykcVar) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        jd1.iobyxmoadg iobyxmoadgVarGtknphoqwx;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
            iobyxmoadgVarGtknphoqwx = iwizpuwonkVar.gtknphoqwx();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : iobyxmoadgVarGtknphoqwx != null ? jd1.iobyxmoadg.zoijcleaow(iobyxmoadgVarGtknphoqwx, null, wkgbmnqykcVar, false, 5, null) : null)));
    }

    private final void ezmngbhpjk(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    private final void f(jd1.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.gtknphoqwx(), ppxfxbqfkfVar.ojitshcjhn(), null, z13, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f92334iwizpuwonk, new AnalyticsLocation.BackendPopups(ppxfxbqfkfVar.gxszxtbevo()), null, 4, null), false, 168, null));
    }

    private final void g() {
        if (this.f97863jlmebxxoox != null) {
            this.f97871mbcevpiqjq.lqeggnwhkg();
        }
    }

    private final void h() {
        if (this.f97863jlmebxxoox != null) {
            this.f97871mbcevpiqjq.nufgyqmvbu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
    }

    private final void j(String str) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new btonecajqb(str, null), 3, null);
    }

    private final void k() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(String str) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        jd1.iobyxmoadg iobyxmoadgVarGtknphoqwx;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
            iobyxmoadgVarGtknphoqwx = iwizpuwonkVar.gtknphoqwx();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : iobyxmoadgVarGtknphoqwx != null ? jd1.iobyxmoadg.zoijcleaow(iobyxmoadgVarGtknphoqwx, str, null, false, 6, null) : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Throwable th2) {
        kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(QrModel qrModel, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        String cardNumber;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f97905jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f97905jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objZoijcleaow = draadjrbmkVar.f97907zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f97905jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (qrModel instanceof QrModel.Dynamic) {
                return new jd1.wkgbmnqykc.zoijcleaow((QrModel.Dynamic) qrModel);
            }
            if (qrModel instanceof QrModel.Static) {
                return new jd1.wkgbmnqykc.ppxfxbqfkf(((QrModel.Static) qrModel).getValue());
            }
            if (qrModel != null) {
                throw new NoWhenBranchMatchedException();
            }
            ow1.zdlpuopuiu zdlpuopuiuVar = this.f97870lqeggnwhkg;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.f97905jyumaefscl = 1;
            objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, draadjrbmkVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        UserInfo userInfo = (UserInfo) objZoijcleaow;
        return (userInfo == null || (cardNumber = userInfo.getCardNumber()) == null) ? jd1.wkgbmnqykc.eablkybsjg.f51169iobyxmoadg : new jd1.wkgbmnqykc.iobyxmoadg(cardNumber);
    }

    private final void n(boolean z13) {
        if (z13) {
            this.f97891zdlpuopuiu.gxszxtbevo();
        } else {
            this.f97891zdlpuopuiu.nufgyqmvbu();
        }
    }

    private final void o(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        if (((Boolean) this.f97857gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            ezmngbhpjk(comboSetProduct, comboSetProduct2);
        } else {
            this.f97891zdlpuopuiu.eablkybsjg();
        }
    }

    private final void p(Splash splash) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(splash, null), 3, null);
        F();
        P();
        S();
    }

    private final void r(ur0.ppxfxbqfkf ppxfxbqfkfVar) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new C2320ojitshcjhn(ppxfxbqfkfVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rhgxfdycjh(jd1.iobyxmoadg iobyxmoadgVar) {
        jd1.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        jd1.wkgbmnqykc.zoijcleaow zoijcleaowVar = wkgbmnqykcVarWkgbmnqykc instanceof jd1.wkgbmnqykc.zoijcleaow ? (jd1.wkgbmnqykc.zoijcleaow) wkgbmnqykcVarWkgbmnqykc : null;
        if (zoijcleaowVar != null) {
            jd1.wkgbmnqykc.zoijcleaow zoijcleaowVar2 = zoijcleaowVar.iobyxmoadg().getStatus() != xk1.iobyxmoadg.ARCHIVED ? zoijcleaowVar : null;
            if (zoijcleaowVar2 != null) {
                this.f97872ntlheqmsrt.gtknphoqwx(zoijcleaowVar2.iobyxmoadg());
            }
        }
    }

    private final void s(k21.ojitshcjhn ojitshcjhnVar, jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        jd1.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg((126975 & 1) != 0 ? ppxfxbqfkfVar.f51159iobyxmoadg : null, (126975 & 2) != 0 ? ppxfxbqfkfVar.f51168zoijcleaow : null, (126975 & 4) != 0 ? ppxfxbqfkfVar.f51163ppxfxbqfkf : 0, (126975 & 8) != 0 ? ppxfxbqfkfVar.f51167wkgbmnqykc : null, (126975 & 16) != 0 ? ppxfxbqfkfVar.f51156eablkybsjg : null, (126975 & 32) != 0 ? ppxfxbqfkfVar.f51158gxszxtbevo : null, (126975 & 64) != 0 ? ppxfxbqfkfVar.f51160lqeggnwhkg : null, (126975 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ppxfxbqfkfVar.f51161nufgyqmvbu : null, (126975 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ppxfxbqfkfVar.f51155dxjokdxxww : null, (126975 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ppxfxbqfkfVar.f51153btonecajqb : 0L, (126975 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? ppxfxbqfkfVar.f51157gtknphoqwx : null, (126975 & 2048) != 0 ? ppxfxbqfkfVar.f51154draadjrbmk : null, (126975 & 4096) != 0 ? ppxfxbqfkfVar.f51166wflxmlrfwp : ojitshcjhnVar, (126975 & 8192) != 0 ? ppxfxbqfkfVar.f51152agtfadlqog : null, (126975 & 16384) != 0 ? ppxfxbqfkfVar.f51162ojitshcjhn : null, (126975 & 32768) != 0 ? ppxfxbqfkfVar.f51164rgvfuqvkyq : false, (126975 & 65536) != 0 ? ppxfxbqfkfVar.f51165vdvldrhtss : null);
        if (y(ppxfxbqfkfVar)) {
            return;
        }
        f(ppxfxbqfkfVarIobyxmoadg, false);
    }

    private final void t() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new rgvfuqvkyq(null), 3, null);
    }

    private final void u(MainTab mainTab) {
        if (((Boolean) this.f97857gtknphoqwx.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue() || !(mainTab == MainTab.CART || mainTab == MainTab.PROFILE)) {
            i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, mainTab, false, 2, null);
        } else {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().draadjrbmk(this.f97866kcexrzcfyt.eablkybsjg());
        }
    }

    private final void v(MySparScreenPayload mySparScreenPayload) {
        if (mySparScreenPayload.getNavigationLink().nufgyqmvbu()) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(mySparScreenPayload.getNavigationLink(), mySparScreenPayload.getReference(), q11.dxjokdxxww.ppxfxbqfkf(), null, false, null, new AnalyticsPayload(AnalyticsPage.MainScreen.f92334iwizpuwonk, null, null, 6, null), false, 184, null));
            return;
        }
        int i13 = zoijcleaow.f98035iobyxmoadg[mySparScreenPayload.getExtraAction().ordinal()];
        if (i13 == 1) {
            String reference = mySparScreenPayload.getReference();
            if (reference == null) {
                reference = "";
            }
            this.f97891zdlpuopuiu.wflxmlrfwp(new ProductPayload(new ProductPayload.Type.ProductId(reference), null, 2, null));
            return;
        }
        if (i13 == 2) {
            i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, MainTab.CART, false, 2, null);
            return;
        }
        if (i13 == 3) {
            this.f97891zdlpuopuiu.draadjrbmk(new SpecificOrderArgs(mySparScreenPayload.getOrderId(), null, false, 6, null));
        } else if (i13 != 4) {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            String reference2 = mySparScreenPayload.getReference();
            if (reference2 != null) {
                this.f97891zdlpuopuiu.lqeggnwhkg(reference2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb w(ojitshcjhn ojitshcjhnVar) {
        return dz0.gtknphoqwx.zoijcleaow(ojitshcjhnVar.f97875oxmwwwfdhm, null, 1, null);
    }

    private final void x(k21.ojitshcjhn ojitshcjhnVar, String str) {
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhnVar, str, null, null, false, null, new AnalyticsPayload(AnalyticsPage.PurchasePopup.f92363iwizpuwonk, null, null, 6, null), false, 188, null));
    }

    private final boolean y(jd1.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13 = ppxfxbqfkfVar.rgvfuqvkyq() && !((Boolean) this.f97877pmvmpeiblj.zoijcleaow(gg.wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (z13) {
            yggfygwlhe(new ru.myspar.proloyalty.main_activity.impl.agtfadlqog.gxszxtbevo(ppxfxbqfkfVar));
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yzdjzghtvl(boolean z13) {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        jd1.iobyxmoadg iobyxmoadgVarGtknphoqwx;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
            iobyxmoadgVarGtknphoqwx = iwizpuwonkVar.gtknphoqwx();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : false, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : iobyxmoadgVarGtknphoqwx != null ? jd1.iobyxmoadg.zoijcleaow(iobyxmoadgVarGtknphoqwx, null, null, z13, 3, null) : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        Object value;
        uc1.iwizpuwonk iwizpuwonkVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (uc1.iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((65327 & 1) != 0 ? iwizpuwonkVar.f113280iobyxmoadg : null, (65327 & 2) != 0 ? iwizpuwonkVar.f113288zoijcleaow : 0, (65327 & 4) != 0 ? iwizpuwonkVar.f113284ppxfxbqfkf : 0, (65327 & 8) != 0 ? iwizpuwonkVar.f113287wkgbmnqykc : 0, (65327 & 16) != 0 ? iwizpuwonkVar.f113277eablkybsjg : false, (65327 & 32) != 0 ? iwizpuwonkVar.f113279gxszxtbevo : false, (65327 & 64) != 0 ? iwizpuwonkVar.f113281lqeggnwhkg : null, (65327 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f113282nufgyqmvbu : null, (65327 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f113276dxjokdxxww : false, (65327 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f113274btonecajqb : null, (65327 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f113278gtknphoqwx : null, (65327 & 2048) != 0 ? iwizpuwonkVar.f113275draadjrbmk : false, (65327 & 4096) != 0 ? iwizpuwonkVar.f113286wflxmlrfwp : null, (65327 & 8192) != 0 ? iwizpuwonkVar.f113273agtfadlqog : null, (65327 & 16384) != 0 ? iwizpuwonkVar.f113283ojitshcjhn : true, (65327 & 32768) != 0 ? iwizpuwonkVar.f113285rgvfuqvkyq : null)));
    }

    @Override // sw0.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f97874ojitshcjhn.dxjokdxxww();
        this.f97867kegysxyocb.zoijcleaow();
        this.f97865jyumaefscl.ppxfxbqfkf();
        this.f97855dxjokdxxww.iobyxmoadg();
        super.onCleared();
    }

    public final void q(ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.iobyxmoadg.f98048iobyxmoadg)) {
            if (((uc1.iwizpuwonk) getState().getValue()).gtknphoqwx() == null) {
                i21.iobyxmoadg.f41720iobyxmoadg.draadjrbmk();
                return;
            } else {
                yggfygwlhe(ru.myspar.proloyalty.main_activity.impl.agtfadlqog.iobyxmoadg.f97804iobyxmoadg);
                return;
            }
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.wkgbmnqykc) {
            p(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.wkgbmnqykc) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.dxjokdxxww) {
            r(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.dxjokdxxww) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.lqeggnwhkg) {
            n(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.lqeggnwhkg) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.gtknphoqwx) {
            v(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.gtknphoqwx) event).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.vdvldrhtss.f98057iobyxmoadg)) {
            this.f97891zdlpuopuiu.gtknphoqwx();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.C2323wflxmlrfwp) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new agtfadlqog(event, null), 3, null);
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.btonecajqb) {
            ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.btonecajqb btonecajqbVar = (ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.btonecajqb) event;
            s(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.gxszxtbevo) {
            f(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.gxszxtbevo) event).iobyxmoadg(), true);
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.agtfadlqog) {
            u(((ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.agtfadlqog) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.draadjrbmk) {
            t();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.nufgyqmvbu) {
            ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.nufgyqmvbu) event;
            o(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.oxmwwwfdhm) {
            ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.oxmwwwfdhm) event;
            x(oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.ppxfxbqfkf.f98055iobyxmoadg)) {
            c();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.zoijcleaow.f98060iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(k21.ojitshcjhn.CALL, null, null, null, false, null, null, false, 254, null));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.ojitshcjhn.f98052iobyxmoadg)) {
            g();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.rgvfuqvkyq.f98056iobyxmoadg)) {
            h();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp.eablkybsjg.f98045iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f97865jyumaefscl.wkgbmnqykc();
        }
    }
}
