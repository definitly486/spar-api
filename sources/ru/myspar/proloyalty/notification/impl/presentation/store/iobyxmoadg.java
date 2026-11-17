package ru.myspar.proloyalty.notification.impl.presentation.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.ylkuphrtab;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.models.push.NotificationModel;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final i01.ppxfxbqfkf f98519eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lw1.zoijcleaow f98520gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final vm0.zoijcleaow f98521lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f98522nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a11.zoijcleaow f98523ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ylkuphrtab f98524wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98525yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98526zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98526zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f98525yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f98525yggfygwlhe = th2;
            return eablkybsjgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ b01.iobyxmoadg f98527cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f98529jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f98530yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f98531zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(b01.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f98527cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(this.f98527cqumvgiudr, gxszxtbevoVar);
            gxszxtbevoVar2.f98529jyumaefscl = obj;
            return gxszxtbevoVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            b01.iobyxmoadg iobyxmoadgVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f98530yggfygwlhe;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = iobyxmoadg.this;
                    b01.iobyxmoadg iobyxmoadgVar3 = this.f98527cqumvgiudr;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                    a11.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f98523ppxfxbqfkf;
                    a11.zoijcleaow.iobyxmoadg iobyxmoadgVar5 = new a11.zoijcleaow.iobyxmoadg(iobyxmoadgVar3);
                    this.f98529jyumaefscl = iobyxmoadgVar;
                    this.f98531zdlpuopuiu = iobyxmoadgVar3;
                    this.f98530yggfygwlhe = 1;
                    Object objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar5, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar2 = iobyxmoadgVar3;
                    obj = objZoijcleaow;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar2 = (b01.iobyxmoadg) this.f98531zdlpuopuiu;
                    iobyxmoadgVar = (iobyxmoadg) this.f98529jyumaefscl;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                List list = (List) obj;
                if (iobyxmoadgVar2 == b01.iobyxmoadg.PROMO) {
                    iobyxmoadgVar.czzsidtyhn(list);
                }
                iobyxmoadgVar.ulzqkzuiru(new kf1.ppxfxbqfkf(iobyxmoadgVar2, list));
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar7 = iobyxmoadg.this;
            b01.iobyxmoadg iobyxmoadgVar8 = this.f98527cqumvgiudr;
            if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                iobyxmoadgVar7.ulzqkzuiru(new kf1.zoijcleaow(iobyxmoadgVar8));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2355iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f98532iobyxmoadg;

        static {
            int[] iArr = new int[b01.iobyxmoadg.values().length];
            try {
                iArr[b01.iobyxmoadg.ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b01.iobyxmoadg.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f98532iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f98533yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98534zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98534zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f98533yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f98533yggfygwlhe = th2;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f98536yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98537zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f98536yggfygwlhe = ((Boolean) obj).booleanValue();
            return wkgbmnqykcVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98537zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (this.f98536yggfygwlhe) {
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.notification.impl.presentation.store.gxszxtbevo.iobyxmoadg(new State.Content.Notifications(tzroggbefp.dxjokdxxww())));
            } else {
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.notification.impl.presentation.store.gxszxtbevo.iobyxmoadg(State.Content.NonAuth.f98509zdlpuopuiu));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f98539zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f98539zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.metgxyhuhe(b01.iobyxmoadg.ORDERS);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(a11.zoijcleaow getNotificationsUseCase, ylkuphrtab subscribeUserIsAuthUseCase, i01.ppxfxbqfkf changeNotificationObserver, lw1.zoijcleaow userNewsInteractor, vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getNotificationsUseCase, "getNotificationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserIsAuthUseCase, "subscribeUserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeNotificationObserver, "changeNotificationObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userNewsInteractor, "userNewsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f98523ppxfxbqfkf = getNotificationsUseCase;
        this.f98524wkgbmnqykc = subscribeUserIsAuthUseCase;
        this.f98519eablkybsjg = changeNotificationObserver;
        this.f98520gxszxtbevo = userNewsInteractor;
        this.f98521lqeggnwhkg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(List list) {
        Map notifications;
        State.NotificationTypeHolder notificationTypeHolder;
        State.Content content = ((State) jlmebxxoox()).getContent();
        List items = null;
        State.Content.Notifications notifications2 = content instanceof State.Content.Notifications ? (State.Content.Notifications) content : null;
        if (notifications2 != null && (notifications = notifications2.getNotifications()) != null && (notificationTypeHolder = (State.NotificationTypeHolder) notifications.get(b01.iobyxmoadg.PROMO)) != null) {
            items = notificationTypeHolder.getItems();
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(list, items)) {
            return;
        }
        this.f98520gxszxtbevo.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(b01.iobyxmoadg iobyxmoadgVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.notification.impl.presentation.store.gxszxtbevo.zoijcleaow(iobyxmoadgVar));
        auzgnhcxok auzgnhcxokVar = this.f98522nufgyqmvbu;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f98522nufgyqmvbu = gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(iobyxmoadgVar, null), 3, null);
    }

    private final void rlfsiqarku(AnalyticsPage analyticsPage, AnalyticsPage analyticsPage2) {
        this.f98521lqeggnwhkg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(analyticsPage, analyticsPage2, null, null, null, 28, null)));
    }

    private final void xrmfcynszj(b01.iobyxmoadg iobyxmoadgVar, String str) {
        Map notifications;
        State.NotificationTypeHolder notificationTypeHolder;
        List items;
        Object next;
        AnalyticsPage analyticsPage;
        State.Content content = ((State) jlmebxxoox()).getContent();
        State.Content.Notifications notifications2 = content instanceof State.Content.Notifications ? (State.Content.Notifications) content : null;
        if (notifications2 == null || (notifications = notifications2.getNotifications()) == null || (notificationTypeHolder = (State.NotificationTypeHolder) notifications.get(iobyxmoadgVar)) == null || (items = notificationTypeHolder.getItems()) == null) {
            return;
        }
        Iterator it = items.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((NotificationModel) next).getId(), str));
        NotificationModel notificationModel = (NotificationModel) next;
        if (notificationModel != null) {
            int i13 = C2355iobyxmoadg.f98532iobyxmoadg[iobyxmoadgVar.ordinal()];
            if (i13 == 1) {
                analyticsPage = AnalyticsPage.NotificationSys.f92339iwizpuwonk;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsPage = AnalyticsPage.NotificationsAdv.f92342iwizpuwonk;
            }
            AnalyticsPage.NotificationDetail notificationDetail = new AnalyticsPage.NotificationDetail(notificationModel.getId(), notificationModel.getTitle());
            String action = notificationModel.getAction();
            String reference = notificationModel.getReference();
            NavigationPayload navigationPayloadLqeggnwhkg = ojitshcjhn.lqeggnwhkg(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(action), null, 1, null);
            NavigationPayload navigationPayloadPpxfxbqfkf = navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : reference, (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : new AnalyticsPayload(analyticsPage, null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false);
            if (notificationModel.getIsPromoAction() && reference.length() > 0) {
                rlfsiqarku(analyticsPage, notificationDetail);
                crxdokpmqz(new ru.myspar.proloyalty.notification.impl.presentation.store.eablkybsjg.zoijcleaow(notificationModel.getTitle(), reference));
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ojitshcjhn.DEEPLINK.btonecajqb()) && reference.length() > 0) {
                crxdokpmqz(new ru.myspar.proloyalty.notification.impl.presentation.store.eablkybsjg.ppxfxbqfkf(notificationModel));
                i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadPpxfxbqfkf);
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ojitshcjhn.BASKET.btonecajqb())) {
                i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadPpxfxbqfkf);
            } else if (reference.length() > 0) {
                i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadPpxfxbqfkf);
            } else {
                rlfsiqarku(analyticsPage, notificationDetail);
                crxdokpmqz(new ru.myspar.proloyalty.notification.impl.presentation.store.eablkybsjg.zoijcleaow(notificationModel.getTitle(), notificationModel.getBody()));
            }
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.ppxfxbqfkf) {
            metgxyhuhe(((ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.zoijcleaow) {
            ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.zoijcleaow) intent;
            xrmfcynszj(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.iobyxmoadg.f98543iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(ru.myspar.proloyalty.notification.impl.presentation.store.eablkybsjg.iobyxmoadg.f98513iobyxmoadg);
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.notification.impl.presentation.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.notification.impl.presentation.store.ppxfxbqfkf.iobyxmoadg.f98542iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(this.f98519eablkybsjg.nufgyqmvbu(), new zoijcleaow(null)), new ppxfxbqfkf(null)), sopmlzcsov());
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb((sj.lqeggnwhkg) this.f98524wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new wkgbmnqykc(null)), new eablkybsjg(null)), sopmlzcsov());
    }
}
