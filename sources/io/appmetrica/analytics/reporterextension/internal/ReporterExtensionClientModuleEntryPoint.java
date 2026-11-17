package io.appmetrica.analytics.reporterextension.internal;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/reporterextension/internal/ReporterExtensionClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lgg/wwaezpbzkn;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "", "b", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "reporter-extension_release"}, k = 1, mv = {1, 6, 0})
public final class ReporterExtensionClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48918a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "reporter_extension";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ClientContext clientContext) {
        clientContext.getClientActivator().activate(clientContext.getContext());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(final ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientExecutorProvider().getDefaultExecutor().executeDelayed(new Runnable() { // from class: cg.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    ReporterExtensionClientModuleEntryPoint.a(clientContext);
                }
            }, this.f48918a, TimeUnit.SECONDS);
        }
    }
}
