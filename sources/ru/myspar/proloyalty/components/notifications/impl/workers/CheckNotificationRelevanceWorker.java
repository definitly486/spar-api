package ru.myspar.proloyalty.components.notifications.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.ppxfxbqfkf;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ow1.draadjrbmk;
import ow1.esjtqupxsv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(¨\u0006)"}, d2 = {"Lru/myspar/proloyalty/components/notifications/impl/workers/CheckNotificationRelevanceWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lvu0/iobyxmoadg;", "notificationCache", "Ll42/iobyxmoadg;", "pushTokenProvider", "Low1/esjtqupxsv;", "isAuthUseCase", "Ltu0/iobyxmoadg;", "notificationsRepository", "Low1/draadjrbmk;", "fetchActivePushTokensUseCase", "Lir0/iobyxmoadg;", "deviceIdManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lvu0/iobyxmoadg;Ll42/iobyxmoadg;Low1/esjtqupxsv;Ltu0/iobyxmoadg;Low1/draadjrbmk;Lir0/iobyxmoadg;)V", "", "", "lqeggnwhkg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "", "dxjokdxxww", "()Z", "gxszxtbevo", "()Ljava/lang/String;", "nufgyqmvbu", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "iobyxmoadg", "ppxfxbqfkf", "Lvu0/iobyxmoadg;", "wkgbmnqykc", "Ll42/iobyxmoadg;", "eablkybsjg", "Low1/esjtqupxsv;", "Ltu0/iobyxmoadg;", "Low1/draadjrbmk;", "Lir0/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckNotificationRelevanceWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final esjtqupxsv isAuthUseCase;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final tu0.iobyxmoadg notificationsRepository;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk fetchActivePushTokensUseCase;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final ir0.iobyxmoadg deviceIdManager;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final vu0.iobyxmoadg notificationCache;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final l42.iobyxmoadg pushTokenProvider;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f94057iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f94059yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f94060zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f94059yggfygwlhe = obj;
            this.f94057iwizpuwonk |= Integer.MIN_VALUE;
            return CheckNotificationRelevanceWorker.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f94061jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f94063zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f94063zdlpuopuiu = obj;
            this.f94061jyumaefscl |= Integer.MIN_VALUE;
            return CheckNotificationRelevanceWorker.this.lqeggnwhkg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckNotificationRelevanceWorker(Context context, WorkerParameters workerParams, vu0.iobyxmoadg notificationCache, l42.iobyxmoadg pushTokenProvider, esjtqupxsv isAuthUseCase, tu0.iobyxmoadg notificationsRepository, draadjrbmk fetchActivePushTokensUseCase, ir0.iobyxmoadg deviceIdManager) {
        super(context, workerParams);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workerParams, "workerParams");
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(pushTokenProvider, "pushTokenProvider");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        zdlpuopuiu.btonecajqb(fetchActivePushTokensUseCase, "fetchActivePushTokensUseCase");
        zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        this.notificationCache = notificationCache;
        this.pushTokenProvider = pushTokenProvider;
        this.isAuthUseCase = isAuthUseCase;
        this.notificationsRepository = notificationsRepository;
        this.fetchActivePushTokensUseCase = fetchActivePushTokensUseCase;
        this.deviceIdManager = deviceIdManager;
    }

    private final boolean dxjokdxxww() {
        long jIobyxmoadg = this.notificationCache.iobyxmoadg();
        return jIobyxmoadg == 0 || System.currentTimeMillis() - jIobyxmoadg >= TimeUnit.HOURS.toMillis(1L);
    }

    private final String gxszxtbevo() {
        String strZoijcleaow = this.deviceIdManager.zoijcleaow();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f94061jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f94061jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f94063zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f94061jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                draadjrbmk draadjrbmkVar = this.fetchActivePushTokensUseCase;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.f94061jyumaefscl = 1;
                objZoijcleaow = draadjrbmkVar.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            return null;
        }
        return objWkgbmnqykc;
    }

    private final boolean nufgyqmvbu() {
        return this.notificationCache.zoijcleaow();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        CheckNotificationRelevanceWorker checkNotificationRelevanceWorker;
        CheckNotificationRelevanceWorker checkNotificationRelevanceWorker2;
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow;
        String str;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f94057iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f94057iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f94059yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f94057iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], doWork");
            if (!((Boolean) this.isAuthUseCase.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance user NOT authorized ");
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg.iobyxmoadg();
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "failure(...)");
                return iobyxmoadgVarIobyxmoadg;
            }
            if (!dxjokdxxww()) {
                uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance pause between checks is NOT over");
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = ppxfxbqfkf.iobyxmoadg.iobyxmoadg();
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg2, "failure(...)");
                return iobyxmoadgVarIobyxmoadg2;
            }
            iobyxmoadgVar.f94060zdlpuopuiu = this;
            iobyxmoadgVar.f94057iwizpuwonk = 1;
            objLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            checkNotificationRelevanceWorker = this;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    checkNotificationRelevanceWorker2 = (CheckNotificationRelevanceWorker) iobyxmoadgVar.f94060zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    checkNotificationRelevanceWorker2.notificationsRepository.iobyxmoadg((String) objLqeggnwhkg);
                    ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf);
                    return iobyxmoadgVarPpxfxbqfkf;
                }
                if (i14 == 3) {
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf2);
                    return iobyxmoadgVarPpxfxbqfkf2;
                }
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                if (((Boolean) objLqeggnwhkg).booleanValue()) {
                    iobyxmoadgVarZoijcleaow = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    str = "success(...)";
                } else {
                    iobyxmoadgVarZoijcleaow = ppxfxbqfkf.iobyxmoadg.zoijcleaow();
                    str = "retry(...)";
                }
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, str);
                return iobyxmoadgVarZoijcleaow;
            }
            checkNotificationRelevanceWorker = (CheckNotificationRelevanceWorker) iobyxmoadgVar.f94060zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        List list = (List) objLqeggnwhkg;
        String strGxszxtbevo = checkNotificationRelevanceWorker.gxszxtbevo();
        if (mj.kcexrzcfyt.zfvoamnweg(strGxszxtbevo)) {
            l42.iobyxmoadg iobyxmoadgVar2 = checkNotificationRelevanceWorker.pushTokenProvider;
            iobyxmoadgVar.f94060zdlpuopuiu = checkNotificationRelevanceWorker;
            iobyxmoadgVar.f94057iwizpuwonk = 2;
            objLqeggnwhkg = iobyxmoadgVar2.zoijcleaow(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            checkNotificationRelevanceWorker2 = checkNotificationRelevanceWorker;
            checkNotificationRelevanceWorker2.notificationsRepository.iobyxmoadg((String) objLqeggnwhkg);
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf3 = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf3);
            return iobyxmoadgVarPpxfxbqfkf3;
        }
        if (list == null) {
            uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance STOP because userActiveTokens is NULL");
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow2 = ppxfxbqfkf.iobyxmoadg.zoijcleaow();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarZoijcleaow2);
            return iobyxmoadgVarZoijcleaow2;
        }
        if (list.contains(strGxszxtbevo)) {
            uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance token is RELEVANCE");
            tu0.iobyxmoadg.gxszxtbevo(checkNotificationRelevanceWorker.notificationsRepository, false, 1, null);
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf4 = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf4);
            return iobyxmoadgVarPpxfxbqfkf4;
        }
        if (checkNotificationRelevanceWorker.nufgyqmvbu()) {
            uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance токен протух и бэк его удалил из списка пользователя, нужно делать рефрэш токена");
            tu0.iobyxmoadg iobyxmoadgVar3 = checkNotificationRelevanceWorker.notificationsRepository;
            iobyxmoadgVar.f94060zdlpuopuiu = null;
            iobyxmoadgVar.f94057iwizpuwonk = 3;
            if (iobyxmoadgVar3.eablkybsjg(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf5 = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf5);
            return iobyxmoadgVarPpxfxbqfkf5;
        }
        uu0.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance токен еще не был успешно отправлен на бэк, его нужно отправить");
        tu0.iobyxmoadg iobyxmoadgVar4 = checkNotificationRelevanceWorker.notificationsRepository;
        iobyxmoadgVar.f94060zdlpuopuiu = null;
        iobyxmoadgVar.f94057iwizpuwonk = 4;
        objLqeggnwhkg = iobyxmoadgVar4.ppxfxbqfkf(strGxszxtbevo, iobyxmoadgVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        if (((Boolean) objLqeggnwhkg).booleanValue()) {
            iobyxmoadgVarZoijcleaow = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            str = "success(...)";
        } else {
            iobyxmoadgVarZoijcleaow = ppxfxbqfkf.iobyxmoadg.zoijcleaow();
            str = "retry(...)";
        }
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, str);
        return iobyxmoadgVarZoijcleaow;
    }
}
