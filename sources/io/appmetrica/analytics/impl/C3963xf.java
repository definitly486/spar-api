package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3963xf implements InterfaceC3569hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48429b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48430c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48431d = "additional_parameters";

    public C3963xf(Context context) {
        this.f48428a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3569hj, tg.iobyxmoadg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ef invoke() {
        Cursor cursorQuery;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f48428a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC3842sj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f48428a.getContentResolver().query(Uri.parse(this.f48429b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC3842sj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f48430c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f48431d));
                        if (string2 != null) {
                            try {
                                if (string2.length() == 0) {
                                    jSONObject = new JSONObject();
                                    jSONObject2 = jSONObject;
                                } else {
                                    jSONObject2 = new JSONObject(string2);
                                }
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject2 = jSONObject;
                        }
                        if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                            AbstractC3842sj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC3842sj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        Ef ef2 = new Ef(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC3657l8.f47649d);
                        io.a(cursorQuery);
                        return ef2;
                    }
                    AbstractC3842sj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        io.a(cursorQuery);
        return null;
    }
}
