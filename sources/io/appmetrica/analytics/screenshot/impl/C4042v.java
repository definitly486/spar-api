package io.appmetrica.analytics.screenshot.impl;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4042v implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f49016a;

    public C4042v(ClientContext clientContext) {
        this.f49016a = clientContext;
    }

    public final void a(String str) {
        this.f49016a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
