package ru.myspar.components.notifications.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ca2.ppxfxbqfkf;
import ca2.wkgbmnqykc;
import gg.kcexrzcfyt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006'"}, d2 = {"Lru/myspar/components/notifications/impl/workers/CheckNotificationRelevanceWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lca2/wkgbmnqykc;", "userSharedPreferences", "Lbw/iobyxmoadg;", "notificationCache", "Ll42/iobyxmoadg;", "pushTokenProvider", "Lca2/ppxfxbqfkf;", "userRepository", "Lzv/iobyxmoadg;", "notificationsRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lca2/wkgbmnqykc;Lbw/iobyxmoadg;Ll42/iobyxmoadg;Lca2/ppxfxbqfkf;Lzv/iobyxmoadg;)V", "", "", "lqeggnwhkg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "", "btonecajqb", "()Z", "gxszxtbevo", "()Ljava/lang/String;", "dxjokdxxww", "nufgyqmvbu", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "iobyxmoadg", "ppxfxbqfkf", "Lca2/wkgbmnqykc;", "wkgbmnqykc", "Lbw/iobyxmoadg;", "eablkybsjg", "Ll42/iobyxmoadg;", "Lca2/ppxfxbqfkf;", "Lzv/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckNotificationRelevanceWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final l42.iobyxmoadg pushTokenProvider;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf userRepository;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final zv.iobyxmoadg notificationsRepository;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final wkgbmnqykc userSharedPreferences;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final bw.iobyxmoadg notificationCache;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f86325iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f86327yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f86328zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f86327yggfygwlhe = obj;
            this.f86325iwizpuwonk |= Integer.MIN_VALUE;
            return CheckNotificationRelevanceWorker.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f86329jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f86331zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f86331zdlpuopuiu = obj;
            this.f86329jyumaefscl |= Integer.MIN_VALUE;
            return CheckNotificationRelevanceWorker.this.lqeggnwhkg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckNotificationRelevanceWorker(Context context, WorkerParameters workerParams, wkgbmnqykc userSharedPreferences, bw.iobyxmoadg notificationCache, l42.iobyxmoadg pushTokenProvider, ppxfxbqfkf userRepository, zv.iobyxmoadg notificationsRepository) {
        super(context, workerParams);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workerParams, "workerParams");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(pushTokenProvider, "pushTokenProvider");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        this.userSharedPreferences = userSharedPreferences;
        this.notificationCache = notificationCache;
        this.pushTokenProvider = pushTokenProvider;
        this.userRepository = userRepository;
        this.notificationsRepository = notificationsRepository;
    }

    private final boolean btonecajqb() {
        long jIobyxmoadg = this.notificationCache.iobyxmoadg();
        return jIobyxmoadg == 0 || System.currentTimeMillis() - jIobyxmoadg >= TimeUnit.HOURS.toMillis(1L);
    }

    private final boolean dxjokdxxww() {
        return this.notificationCache.ppxfxbqfkf();
    }

    private final String gxszxtbevo() {
        String strZoijcleaow = this.notificationCache.zoijcleaow();
        aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f86329jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f86329jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f86331zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f86329jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar = this.userRepository;
                zoijcleaowVar.f86329jyumaefscl = 1;
                objEablkybsjg = ppxfxbqfkfVar.eablkybsjg(zoijcleaowVar);
                if (objEablkybsjg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objEablkybsjg);
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
        return this.userSharedPreferences.nufgyqmvbu();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        CheckNotificationRelevanceWorker checkNotificationRelevanceWorker;
        CheckNotificationRelevanceWorker checkNotificationRelevanceWorker2;
        androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow;
        String str;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f86325iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f86325iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f86327yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f86325iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], doWork");
            if (!nufgyqmvbu()) {
                aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance user NOT authorized ");
                androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = androidx.work.ppxfxbqfkf.iobyxmoadg.iobyxmoadg();
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "failure(...)");
                return iobyxmoadgVarIobyxmoadg;
            }
            if (!btonecajqb()) {
                aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance pause between checks is NOT over");
                androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = androidx.work.ppxfxbqfkf.iobyxmoadg.iobyxmoadg();
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg2, "failure(...)");
                return iobyxmoadgVarIobyxmoadg2;
            }
            iobyxmoadgVar.f86328zdlpuopuiu = this;
            iobyxmoadgVar.f86325iwizpuwonk = 1;
            objLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            checkNotificationRelevanceWorker = this;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    checkNotificationRelevanceWorker2 = (CheckNotificationRelevanceWorker) iobyxmoadgVar.f86328zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    checkNotificationRelevanceWorker2.notificationsRepository.iobyxmoadg((String) objLqeggnwhkg);
                    androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf);
                    return iobyxmoadgVarPpxfxbqfkf;
                }
                if (i14 == 3) {
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf2);
                    return iobyxmoadgVarPpxfxbqfkf2;
                }
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                if (((Boolean) objLqeggnwhkg).booleanValue()) {
                    iobyxmoadgVarZoijcleaow = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                    str = "success(...)";
                } else {
                    iobyxmoadgVarZoijcleaow = androidx.work.ppxfxbqfkf.iobyxmoadg.zoijcleaow();
                    str = "retry(...)";
                }
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, str);
                return iobyxmoadgVarZoijcleaow;
            }
            checkNotificationRelevanceWorker = (CheckNotificationRelevanceWorker) iobyxmoadgVar.f86328zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        List list = (List) objLqeggnwhkg;
        String strGxszxtbevo = checkNotificationRelevanceWorker.gxszxtbevo();
        if (mj.kcexrzcfyt.zfvoamnweg(strGxszxtbevo)) {
            l42.iobyxmoadg iobyxmoadgVar2 = checkNotificationRelevanceWorker.pushTokenProvider;
            iobyxmoadgVar.f86328zdlpuopuiu = checkNotificationRelevanceWorker;
            iobyxmoadgVar.f86325iwizpuwonk = 2;
            objLqeggnwhkg = iobyxmoadgVar2.zoijcleaow(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            checkNotificationRelevanceWorker2 = checkNotificationRelevanceWorker;
            checkNotificationRelevanceWorker2.notificationsRepository.iobyxmoadg((String) objLqeggnwhkg);
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf3 = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf3);
            return iobyxmoadgVarPpxfxbqfkf3;
        }
        if (list == null) {
            aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance STOP because userActiveTokens is NULL");
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow2 = androidx.work.ppxfxbqfkf.iobyxmoadg.zoijcleaow();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarZoijcleaow2);
            return iobyxmoadgVarZoijcleaow2;
        }
        if (list.contains(strGxszxtbevo)) {
            aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance token is RELEVANCE");
            zv.iobyxmoadg.lqeggnwhkg(checkNotificationRelevanceWorker.notificationsRepository, false, 1, null);
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf4 = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf4);
            return iobyxmoadgVarPpxfxbqfkf4;
        }
        if (checkNotificationRelevanceWorker.dxjokdxxww()) {
            aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance токен протух и бэк его удалил из списка пользователя, нужно делать рефрэш токена");
            zv.iobyxmoadg iobyxmoadgVar3 = checkNotificationRelevanceWorker.notificationsRepository;
            iobyxmoadgVar.f86328zdlpuopuiu = null;
            iobyxmoadgVar.f86325iwizpuwonk = 3;
            if (iobyxmoadgVar3.eablkybsjg(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf5 = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf5);
            return iobyxmoadgVarPpxfxbqfkf5;
        }
        aw.zoijcleaow.iobyxmoadg("[CheckNotificationRelevanceWorker], checkTokenRelevance токен еще не был успешно отправлен на бэк, его нужно отправить");
        zv.iobyxmoadg iobyxmoadgVar4 = checkNotificationRelevanceWorker.notificationsRepository;
        iobyxmoadgVar.f86328zdlpuopuiu = null;
        iobyxmoadgVar.f86325iwizpuwonk = 4;
        objLqeggnwhkg = iobyxmoadgVar4.ppxfxbqfkf(strGxszxtbevo, iobyxmoadgVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        if (((Boolean) objLqeggnwhkg).booleanValue()) {
            iobyxmoadgVarZoijcleaow = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            str = "success(...)";
        } else {
            iobyxmoadgVarZoijcleaow = androidx.work.ppxfxbqfkf.iobyxmoadg.zoijcleaow();
            str = "retry(...)";
        }
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, str);
        return iobyxmoadgVarZoijcleaow;
    }
}
