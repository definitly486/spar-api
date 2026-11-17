package io.appmetrica.analytics.screenshot.internal;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.C4025d;
import io.appmetrica.analytics.screenshot.impl.C4029h;
import io.appmetrica.analytics.screenshot.impl.C4032k;
import io.appmetrica.analytics.screenshot.impl.C4033l;
import io.appmetrica.analytics.screenshot.impl.C4041u;
import io.appmetrica.analytics.screenshot.impl.C4042v;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/impl/B;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lgg/wwaezpbzkn;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "onActivated", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "screenshot_release"}, k = 1, mv = {1, 6, 0})
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4032k f49021a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S f49024d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4029h f49022b = new C4029h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f49023c = new ServiceConfigUpdateListener<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<B> config) {
            C4032k c4032k;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.f49027a;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    B featuresConfig = config.getFeaturesConfig();
                    S s13 = null;
                    if (featuresConfig != null) {
                        boolean zB = featuresConfig.b();
                        D dA = featuresConfig.a();
                        c4032k = new C4032k(zB, dA != null ? new C4033l(dA) : null);
                    } else {
                        c4032k = null;
                    }
                    screenshotClientModuleEntryPoint.f49021a = c4032k;
                    if (screenshotClientModuleEntryPoint.f49024d != null) {
                        S s14 = screenshotClientModuleEntryPoint.f49024d;
                        if (s14 == null) {
                            zdlpuopuiu.pmvmpeiblj("screenshotCaptorsController");
                        } else {
                            s13 = s14;
                        }
                        s13.a(screenshotClientModuleEntryPoint.f49021a);
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "screenshot";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f49026f = new ServiceConfigExtensionConfiguration<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<B> getBundleConverter() {
            return this.f49028a.f49022b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<B> getServiceConfigUpdateListener() {
            return this.f49028a.f49023c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<B> getServiceConfigExtensionConfiguration() {
        return this.f49026f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            C4042v c4042v = new C4042v(clientContext);
            this.f49024d = new S(jyumaefscl.rgvfuqvkyq(new C4025d(clientContext, c4042v), new d0(clientContext, c4042v), new C4041u(clientContext, c4042v)));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                S s13 = this.f49024d;
                if (s13 != null) {
                    C4032k c4032k = this.f49021a;
                    Iterator it = s13.f48949a.iterator();
                    while (it.hasNext()) {
                        ((P) it.next()).a();
                    }
                    s13.a(c4032k);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
