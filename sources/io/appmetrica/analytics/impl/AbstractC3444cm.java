package io.appmetrica.analytics.impl;

import hg.ikoacuggdj;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3444cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f47037a = ikoacuggdj.dxjokdxxww("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f47038b = new SystemTimeProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y3 f47039c = new Y3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean a(C3521fm c3521fm, Collection collection, Map map, tg.iobyxmoadg iobyxmoadgVar) {
        boolean zA;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c3521fm.f47231d);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 155670667:
                    if (!str.equals("appmetrica_get_ad_url")) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c3521fm.f47236i);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 299713912:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c3521fm.f47229b);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 530949152:
                    if (!str.equals("appmetrica_clids")) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    Y3 y13 = f47039c;
                    V3 v13 = (V3) iobyxmoadgVar.invoke();
                    y13.getClass();
                    zA = Y3.a(map, c3521fm, v13);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 703740463:
                    if (!str.equals("appmetrica_report_ad_url")) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c3521fm.f47237j);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 1117383061:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        if (!c3521fm.f47250w) {
                            if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c3521fm.f47228a);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                default:
                    if (!c3521fm.f47250w) {
                        if (f47038b.currentTimeSeconds() <= c3521fm.f47242o + ((long) c3521fm.A.f45666a)) {
                            break;
                        }
                    }
                    return false;
            }
        }
        return true;
    }
}
