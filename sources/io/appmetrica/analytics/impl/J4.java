package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class J4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f46055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Location f46056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f46057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f46058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f46059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f46060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f46061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f46062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, String> f46063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f46064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f46065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f46066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f46067n;

    public J4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.f46054a = str;
        this.f46055b = bool;
        this.f46056c = location;
        this.f46057d = bool2;
        this.f46058e = num;
        this.f46059f = num2;
        this.f46060g = num3;
        this.f46061h = bool3;
        this.f46062i = bool4;
        this.f46063j = map;
        this.f46064k = num4;
        this.f46065l = bool5;
        this.f46066m = bool6;
        this.f46067n = bool7;
    }

    public final boolean a(J4 j13) {
        return equals(j13);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J4 mergeFrom(J4 j13) {
        return new J4((String) WrapUtils.getOrDefaultNullable(this.f46054a, j13.f46054a), (Boolean) WrapUtils.getOrDefaultNullable(this.f46055b, j13.f46055b), (Location) WrapUtils.getOrDefaultNullable(this.f46056c, j13.f46056c), (Boolean) WrapUtils.getOrDefaultNullable(this.f46057d, j13.f46057d), (Integer) WrapUtils.getOrDefaultNullable(this.f46058e, j13.f46058e), (Integer) WrapUtils.getOrDefaultNullable(this.f46059f, j13.f46059f), (Integer) WrapUtils.getOrDefaultNullable(this.f46060g, j13.f46060g), (Boolean) WrapUtils.getOrDefaultNullable(this.f46061h, j13.f46061h), (Boolean) WrapUtils.getOrDefaultNullable(this.f46062i, j13.f46062i), (Map) WrapUtils.getOrDefaultNullable(this.f46063j, j13.f46063j), (Integer) WrapUtils.getOrDefaultNullable(this.f46064k, j13.f46064k), (Boolean) WrapUtils.getOrDefaultNullable(this.f46065l, j13.f46065l), (Boolean) WrapUtils.getOrDefaultNullable(this.f46066m, j13.f46066m), (Boolean) WrapUtils.getOrDefaultNullable(this.f46067n, j13.f46067n));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((J4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J4.class != obj.getClass()) {
            return false;
        }
        J4 j13 = (J4) obj;
        return Objects.equals(this.f46054a, j13.f46054a) && Objects.equals(this.f46055b, j13.f46055b) && Objects.equals(this.f46056c, j13.f46056c) && Objects.equals(this.f46057d, j13.f46057d) && Objects.equals(this.f46058e, j13.f46058e) && Objects.equals(this.f46059f, j13.f46059f) && Objects.equals(this.f46060g, j13.f46060g) && Objects.equals(this.f46061h, j13.f46061h) && Objects.equals(this.f46062i, j13.f46062i) && Objects.equals(this.f46063j, j13.f46063j) && Objects.equals(this.f46064k, j13.f46064k) && Objects.equals(this.f46065l, j13.f46065l) && Objects.equals(this.f46066m, j13.f46066m) && Objects.equals(this.f46067n, j13.f46067n);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46067n) + ((Objects.hashCode(this.f46066m) + ((Objects.hashCode(this.f46065l) + ((Objects.hashCode(this.f46064k) + ((Objects.hashCode(this.f46063j) + ((Objects.hashCode(this.f46062i) + ((Objects.hashCode(this.f46061h) + ((Objects.hashCode(this.f46060g) + ((Objects.hashCode(this.f46059f) + ((Objects.hashCode(this.f46058e) + ((Objects.hashCode(this.f46057d) + ((Objects.hashCode(this.f46056c) + ((Objects.hashCode(this.f46055b) + (Objects.hashCode(this.f46054a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f46054a + "', locationTracking=" + this.f46055b + ", manualLocation=" + this.f46056c + ", firstActivationAsUpdate=" + this.f46057d + ", sessionTimeout=" + this.f46058e + ", maxReportsCount=" + this.f46059f + ", dispatchPeriod=" + this.f46060g + ", logEnabled=" + this.f46061h + ", dataSendingEnabled=" + this.f46062i + ", clidsFromClient=" + this.f46063j + ", maxReportsInDbCount=" + this.f46064k + ", nativeCrashesEnabled=" + this.f46065l + ", revenueAutoTrackingEnabled=" + this.f46066m + ", advIdentifiersTrackingEnabled=" + this.f46067n + '}';
    }

    public J4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled());
    }

    public J4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
