package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f48718d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f48720b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f48721c;

    public BaseReleaseLogger(String str, String str2) {
        this.f48721c = new c(new d(str), new a(), new b());
        this.f48719a = str2;
    }

    public static void init(Context context) {
        f48718d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f48720b) {
            c cVar = this.f48721c;
            String prefix = getPrefix();
            cVar.f48724b.getClass();
            for (String str2 : cVar.f48725c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f48723a.f48726a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f48718d + this.f48719a;
    }

    public void info(String str, Object... objArr) {
        if (this.f48720b) {
            c cVar = this.f48721c;
            String prefix = getPrefix();
            cVar.f48724b.getClass();
            for (String str2 : cVar.f48725c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f48723a.f48726a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z13) {
        this.f48720b = z13;
    }

    public void warning(String str, Object... objArr) {
        if (this.f48720b) {
            c cVar = this.f48721c;
            String prefix = getPrefix();
            cVar.f48724b.getClass();
            for (String str2 : cVar.f48725c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f48723a.f48726a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th2, String str, Object... objArr) {
        if (this.f48720b) {
            c cVar = this.f48721c;
            String prefix = getPrefix();
            cVar.f48724b.getClass();
            StringBuilder sb3 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb3.append(str);
            sb3.append("\n");
            sb3.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f48725c.a(a.a(prefix, sb3.toString(), objArr))) {
                String str3 = cVar.f48723a.f48726a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
