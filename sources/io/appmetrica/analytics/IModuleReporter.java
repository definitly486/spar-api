package io.appmetrica.analytics;

/* JADX INFO: loaded from: classes3.dex */
public interface IModuleReporter {
    void reportAdRevenue(AdRevenue adRevenue, boolean z13);

    void reportEvent(ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(String str, byte[] bArr);
}
