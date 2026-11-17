package io.appmetrica.analytics;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f45147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45148c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f45146a = str;
        this.f45147b = startupParamsItemStatus;
        this.f45148c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f45146a, startupParamsItem.f45146a) && this.f45147b == startupParamsItem.f45147b && Objects.equals(this.f45148c, startupParamsItem.f45148c);
    }

    public String getErrorDetails() {
        return this.f45148c;
    }

    public String getId() {
        return this.f45146a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f45147b;
    }

    public int hashCode() {
        return Objects.hash(this.f45146a, this.f45147b, this.f45148c);
    }

    public String toString() {
        return "StartupParamsItem{id='" + this.f45146a + "', status=" + this.f45147b + ", errorDetails='" + this.f45148c + "'}";
    }
}
