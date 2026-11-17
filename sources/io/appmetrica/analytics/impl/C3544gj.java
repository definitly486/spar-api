package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3544gj implements InterfaceC3569hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47343b = "content://" + a() + "/clids";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47344c = "clid_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47345d = "clid_value";

    public C3544gj(Context context) {
        this.f47342a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3569hj, tg.iobyxmoadg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final N3 invoke() {
        Cursor cursorQuery;
        if (!PackageManagerUtils.hasContentProvider(this.f47342a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC3842sj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f47342a.getContentResolver().query(Uri.parse(this.f47343b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC3842sj.a("No Satellite content provider found", new Object[0]);
                    io.a(cursorQuery);
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f47344c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f47345d));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            AbstractC3842sj.a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                AbstractC3842sj.a("Clids from satellite: %s", linkedHashMap);
                N3 n13 = new N3(linkedHashMap, EnumC3657l8.f47649d);
                io.a(cursorQuery);
                return n13;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                } finally {
                    io.a(cursorQuery);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }
}
