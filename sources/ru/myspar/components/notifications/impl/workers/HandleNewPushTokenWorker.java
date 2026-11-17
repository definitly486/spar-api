package ru.myspar.components.notifications.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.ppxfxbqfkf;
import aw.zoijcleaow;
import ca2.wkgbmnqykc;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/myspar/components/notifications/impl/workers/HandleNewPushTokenWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lca2/wkgbmnqykc;", "userSharedPreferences", "Lbw/iobyxmoadg;", "notificationCache", "Lzv/iobyxmoadg;", "notificationsRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lca2/wkgbmnqykc;Lbw/iobyxmoadg;Lzv/iobyxmoadg;)V", "", "eablkybsjg", "()Ljava/lang/String;", "", "gxszxtbevo", "()Z", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "ppxfxbqfkf", "Lca2/wkgbmnqykc;", "wkgbmnqykc", "Lbw/iobyxmoadg;", "Lzv/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandleNewPushTokenWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final zv.iobyxmoadg notificationsRepository;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final wkgbmnqykc userSharedPreferences;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final bw.iobyxmoadg notificationCache;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f86335jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f86337zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f86337zdlpuopuiu = obj;
            this.f86335jyumaefscl |= Integer.MIN_VALUE;
            return HandleNewPushTokenWorker.this.iobyxmoadg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleNewPushTokenWorker(Context context, WorkerParameters workerParams, wkgbmnqykc userSharedPreferences, bw.iobyxmoadg notificationCache, zv.iobyxmoadg notificationsRepository) {
        super(context, workerParams);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workerParams, "workerParams");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        this.userSharedPreferences = userSharedPreferences;
        this.notificationCache = notificationCache;
        this.notificationsRepository = notificationsRepository;
    }

    private final String eablkybsjg() {
        String strZoijcleaow = this.notificationCache.zoijcleaow();
        zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    private final boolean gxszxtbevo() {
        return this.userSharedPreferences.nufgyqmvbu();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow;
        String str;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f86335jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f86335jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f86337zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f86335jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            String strEablkybsjg = getInputData().eablkybsjg("HANDLE_TOKEN_WORKER_ARG_TOKEN");
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], doWork newToken = " + strEablkybsjg);
            if (strEablkybsjg == null || kcexrzcfyt.zfvoamnweg(strEablkybsjg) || zdlpuopuiu.eablkybsjg(eablkybsjg(), strEablkybsjg)) {
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg.iobyxmoadg();
                zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "failure(...)");
                return iobyxmoadgVarIobyxmoadg;
            }
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], doWork newToken != cachedToken");
            bw.iobyxmoadg iobyxmoadgVar2 = this.notificationCache;
            iobyxmoadgVar2.gxszxtbevo(false);
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], SAVE newValue isSentToServer=false");
            this.notificationsRepository.wkgbmnqykc(true);
            iobyxmoadgVar2.eablkybsjg(strEablkybsjg);
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], SAVE token to sharedPref \"" + iobyxmoadgVar2.zoijcleaow() + "\"");
            if (!gxszxtbevo()) {
                zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], user NOT authorized, new token NOT send to server");
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf);
                return iobyxmoadgVarPpxfxbqfkf;
            }
            zv.iobyxmoadg iobyxmoadgVar3 = this.notificationsRepository;
            iobyxmoadgVar.f86335jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(strEablkybsjg, iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        if (((Boolean) objPpxfxbqfkf).booleanValue()) {
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
