package qb2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;

/* JADX INFO: loaded from: classes6.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f78474iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f78475zoijcleaow;

    public yadqdtsiqt(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f78474iobyxmoadg = context;
        this.f78475zoijcleaow = context.getPackageName();
    }

    public static final void iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, Context context, tg.draadjrbmk draadjrbmkVar, ServiceConnection serviceConnection) {
        Object ruStoreOutdatedException;
        if (lb2.ppxfxbqfkf.f62048iobyxmoadg.iobyxmoadg(context)) {
            Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listQueryIntentServices, "packageManager.queryIntentServices(intent, 0)");
            ComponentName componentNameIobyxmoadg = lb2.iobyxmoadg.iobyxmoadg(listQueryIntentServices);
            if (componentNameIobyxmoadg != null) {
                intent.setComponent(componentNameIobyxmoadg);
                context.bindService(intent, serviceConnection, 1);
                return;
            }
            ruStoreOutdatedException = new RuStoreOutdatedException();
        } else {
            ruStoreOutdatedException = new RuStoreNotInstalledException();
        }
        draadjrbmkVar.invoke(ruStoreOutdatedException);
    }
}
