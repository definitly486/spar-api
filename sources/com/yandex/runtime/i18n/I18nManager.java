package com.yandex.runtime.i18n;

/* JADX INFO: loaded from: classes3.dex */
public interface I18nManager {
    CanonicalUnit canonicalSpeed(double d13);

    I18nPrefs getPrefs();

    SystemOfMeasurement getSom();

    TimeFormat getTimeFormat();

    boolean isValid();

    String localizeCanonicalUnit(CanonicalUnit canonicalUnit);

    String localizeDataSize(long j13);

    String localizeDistance(int i13);

    String localizeDuration(int i13);

    String localizeSpeed(double d13);

    void setPrefs(I18nPrefs i18nPrefs);

    void setSom(SystemOfMeasurement systemOfMeasurement);

    void setTimeFormat(TimeFormat timeFormat);
}
