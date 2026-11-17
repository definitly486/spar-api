package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC3842sj;
import io.appmetrica.analytics.impl.C3888uf;
import io.appmetrica.analytics.impl.C3913vf;
import io.appmetrica.analytics.impl.C4008za;
import io.appmetrica.analytics.impl.L3;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.W5;
import io.appmetrica.analytics.impl.X5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48648a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f48649b = new UriMatcher(-1);

    private void a(X5 x13, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = x13.f46759a.invoke(contentValues);
                if (objInvoke != null) {
                    x13.f46761c.b(applicationContext);
                    if (((Boolean) x13.f46760b.invoke(objInvoke)).booleanValue()) {
                        AbstractC3842sj.a("Successfully saved " + x13.f46762d, new Object[0]);
                    } else {
                        AbstractC3842sj.a("Did not save " + x13.f46762d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC3842sj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f48648a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f48648a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f48649b.match(uri);
                    if (iMatch == 1) {
                        a(new X5(new C3888uf(), new C3913vf(), C4008za.f48597d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC3842sj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new X5(new L3(), new M3(), C4008za.f48597d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = W5.f46702a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f48649b.addURI(str, "preloadinfo", 1);
        this.f48649b.addURI(str, "clids", 2);
        W5.f46702a = new CountDownLatch(1);
        W5.f46703b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC3842sj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC3842sj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
