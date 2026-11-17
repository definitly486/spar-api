package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3637kd extends Ed {
    List<ModuleServicesDatabase> b();

    /* synthetic */ Map c();

    /* synthetic */ Map d();

    List<Consumer<Location>> e();

    ModuleLocationSourcesServiceController f();

    Toggle g();

    /* synthetic */ List h();
}
