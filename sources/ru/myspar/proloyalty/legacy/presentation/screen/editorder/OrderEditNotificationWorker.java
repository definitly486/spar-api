package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import android.app.Notification;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/editorder/OrderEditNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lw01/zoijcleaow;", "cancelEditOrderUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw01/zoijcleaow;)V", "Landroid/app/Notification;", "eablkybsjg", "()Landroid/app/Notification;", "gxszxtbevo", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "ppxfxbqfkf", "Landroid/content/Context;", "wkgbmnqykc", "Landroidx/work/WorkerParameters;", "Lw01/zoijcleaow;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrderEditNotificationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f96760lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final w01.zoijcleaow cancelEditOrderUseCase;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParams;

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f96764cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f96766jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96767yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96768zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f96766jyumaefscl = obj;
            this.f96764cqumvgiudr |= Integer.MIN_VALUE;
            return OrderEditNotificationWorker.this.iobyxmoadg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderEditNotificationWorker(Context context, WorkerParameters workerParams, w01.zoijcleaow cancelEditOrderUseCase) {
        super(context, workerParams);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerParams, "workerParams");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancelEditOrderUseCase, "cancelEditOrderUseCase");
        this.context = context;
        this.workerParams = workerParams;
        this.cancelEditOrderUseCase = cancelEditOrderUseCase;
    }

    private final Notification eablkybsjg() {
        Notification notificationZoijcleaow = new androidx.core.app.wflxmlrfwp.eablkybsjg(this.context, "EditOrderNotificationChannel").zdlpuopuiu(b31.gxszxtbevo.ic_spar_icon).btonecajqb(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_one_min_before_end_notification_title)).dxjokdxxww(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_one_min_before_end_notification_message)).jyumaefscl(new androidx.core.app.wflxmlrfwp.ppxfxbqfkf().nufgyqmvbu(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_one_min_before_end_notification_message))).oxmwwwfdhm(1).zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(notificationZoijcleaow, "build(...)");
        return notificationZoijcleaow;
    }

    private final Notification gxszxtbevo() {
        Notification notificationZoijcleaow = new androidx.core.app.wflxmlrfwp.eablkybsjg(this.context, "EditOrderNotificationChannel").zdlpuopuiu(b31.gxszxtbevo.ic_spar_icon).btonecajqb(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_end_notification_title)).dxjokdxxww(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_end_notification_message)).jyumaefscl(new androidx.core.app.wflxmlrfwp.ppxfxbqfkf().nufgyqmvbu(this.context.getString(vk0.lqeggnwhkg.proloyalty_order_edit_end_notification_message))).oxmwwwfdhm(1).zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(notificationZoijcleaow, "build(...)");
        return notificationZoijcleaow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        androidx.core.app.rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc;
        OrderEditNotificationWorker orderEditNotificationWorker;
        androidx.core.app.rgvfuqvkyq rgvfuqvkyqVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f96764cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f96764cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f96766jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f96764cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            boolean zPpxfxbqfkf = this.workerParams.wkgbmnqykc().ppxfxbqfkf("PARAM_IS_END", false);
            String strEablkybsjg = this.workerParams.wkgbmnqykc().eablkybsjg("PARAM_ORDER_ID");
            rgvfuqvkyqVarWkgbmnqykc = androidx.core.app.rgvfuqvkyq.wkgbmnqykc(this.context);
            if (zPpxfxbqfkf) {
                if (strEablkybsjg != null) {
                    try {
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        w01.zoijcleaow zoijcleaowVar2 = this.cancelEditOrderUseCase;
                        w01.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new w01.zoijcleaow.iobyxmoadg(strEablkybsjg);
                        zoijcleaowVar.f96768zdlpuopuiu = this;
                        zoijcleaowVar.f96767yggfygwlhe = rgvfuqvkyqVarWkgbmnqykc;
                        zoijcleaowVar.f96764cqumvgiudr = 1;
                        objZoijcleaow = zoijcleaowVar2.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        orderEditNotificationWorker = this;
                        rgvfuqvkyqVar = rgvfuqvkyqVarWkgbmnqykc;
                    } catch (Throwable th2) {
                        th = th2;
                        orderEditNotificationWorker = this;
                        rgvfuqvkyqVar = rgvfuqvkyqVarWkgbmnqykc;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                } else {
                    orderEditNotificationWorker = this;
                }
                rgvfuqvkyqVarWkgbmnqykc.zoijcleaow(12415813);
                rgvfuqvkyqVarWkgbmnqykc.lqeggnwhkg(12415812, orderEditNotificationWorker.gxszxtbevo());
            } else {
                rgvfuqvkyqVarWkgbmnqykc.lqeggnwhkg(12415813, eablkybsjg());
            }
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "success(...)");
            return iobyxmoadgVarPpxfxbqfkf;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rgvfuqvkyqVar = (androidx.core.app.rgvfuqvkyq) zoijcleaowVar.f96767yggfygwlhe;
        orderEditNotificationWorker = (OrderEditNotificationWorker) zoijcleaowVar.f96768zdlpuopuiu;
        try {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        } catch (Throwable th3) {
            th = th3;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        rgvfuqvkyqVarWkgbmnqykc = rgvfuqvkyqVar;
        kr0.wkgbmnqykc wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        rgvfuqvkyqVarWkgbmnqykc.zoijcleaow(12415813);
        rgvfuqvkyqVarWkgbmnqykc.lqeggnwhkg(12415812, orderEditNotificationWorker.gxszxtbevo());
        androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = androidx.work.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf2, "success(...)");
        return iobyxmoadgVarPpxfxbqfkf2;
    }
}
