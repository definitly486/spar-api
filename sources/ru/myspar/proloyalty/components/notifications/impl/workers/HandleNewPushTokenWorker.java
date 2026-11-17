package ru.myspar.proloyalty.components.notifications.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.ppxfxbqfkf;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ow1.esjtqupxsv;
import uu0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/components/notifications/impl/workers/HandleNewPushTokenWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lvu0/iobyxmoadg;", "notificationCache", "Ltu0/iobyxmoadg;", "notificationsRepository", "Low1/esjtqupxsv;", "isAuthUseCase", "Lir0/iobyxmoadg;", "deviceIdManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lvu0/iobyxmoadg;Ltu0/iobyxmoadg;Low1/esjtqupxsv;Lir0/iobyxmoadg;)V", "", "eablkybsjg", "()Ljava/lang/String;", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "ppxfxbqfkf", "Lvu0/iobyxmoadg;", "wkgbmnqykc", "Ltu0/iobyxmoadg;", "Low1/esjtqupxsv;", "gxszxtbevo", "Lir0/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandleNewPushTokenWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final esjtqupxsv isAuthUseCase;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final ir0.iobyxmoadg deviceIdManager;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final vu0.iobyxmoadg notificationCache;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final tu0.iobyxmoadg notificationsRepository;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f94068jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f94070zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f94070zdlpuopuiu = obj;
            this.f94068jyumaefscl |= Integer.MIN_VALUE;
            return HandleNewPushTokenWorker.this.iobyxmoadg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleNewPushTokenWorker(Context context, WorkerParameters workerParams, vu0.iobyxmoadg notificationCache, tu0.iobyxmoadg notificationsRepository, esjtqupxsv isAuthUseCase, ir0.iobyxmoadg deviceIdManager) {
        super(context, workerParams);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workerParams, "workerParams");
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        this.notificationCache = notificationCache;
        this.notificationsRepository = notificationsRepository;
        this.isAuthUseCase = isAuthUseCase;
        this.deviceIdManager = deviceIdManager;
    }

    private final String eablkybsjg() {
        String strZoijcleaow = this.deviceIdManager.zoijcleaow();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow;
        String str;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f94068jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f94068jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f94070zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f94068jyumaefscl;
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
            this.notificationCache.wkgbmnqykc(false);
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], SAVE newValue isSentToServer=false");
            this.notificationsRepository.wkgbmnqykc(true);
            this.deviceIdManager.eablkybsjg(strEablkybsjg);
            zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], SAVE token to sharedPref \"" + this.deviceIdManager.zoijcleaow() + "\"");
            if (!((Boolean) this.isAuthUseCase.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                zoijcleaow.iobyxmoadg("[HandleNewPushTokenWorker], user NOT authorized, new token NOT send to server");
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
                zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarPpxfxbqfkf);
                return iobyxmoadgVarPpxfxbqfkf;
            }
            tu0.iobyxmoadg iobyxmoadgVar2 = this.notificationsRepository;
            iobyxmoadgVar.f94068jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(strEablkybsjg, iobyxmoadgVar);
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
