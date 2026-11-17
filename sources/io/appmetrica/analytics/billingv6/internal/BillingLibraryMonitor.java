package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lio/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "Lio/appmetrica/analytics/billingv6/impl/n;", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "Lgg/wwaezpbzkn;", "onSessionResumed", "()V", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "(Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;)V", "onUpdateFinished", "billing-v6_release"}, k = 1, mv = {1, 6, 0})
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f45217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f45218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f45219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f45220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f45221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BillingConfig f45222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45223h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f45216a = context;
        this.f45217b = executor;
        this.f45218c = executor2;
        this.f45219d = billingInfoSender;
        this.f45220e = billingInfoManager;
        this.f45221f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        try {
            if (zdlpuopuiu.eablkybsjg(this.f45222g, billingConfig)) {
                return;
            }
            this.f45222g = billingConfig;
            if (billingConfig != null && !this.f45223h) {
                this.f45223h = true;
                BillingClient billingClientBuild = BillingClient.newBuilder(this.f45216a).setListener(new l()).enablePendingPurchases().build();
                billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f45222g;
            if (billingConfig != null && !this.f45223h) {
                this.f45223h = true;
                BillingClient billingClientBuild = BillingClient.newBuilder(this.f45216a).setListener(new l()).enablePendingPurchases().build();
                billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f45223h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i13 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i13 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
