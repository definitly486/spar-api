package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import gg.wwaezpbzkn;
import hg.agtfadlqog;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Iterator;
import java.util.Locale;
import mj.kcexrzcfyt;
import rg.zoijcleaow;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f48959d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f48960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iobyxmoadg f48961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4031j f48962c;

    public W(ClientContext clientContext, r rVar) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f48960a = clientContext;
        this.f48961b = rVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13, Uri uri) {
        C4031j c4031j;
        super.onChange(z13, uri);
        if (!kcexrzcfyt.stevsuqkhv(String.valueOf(uri), f48959d, false, 2, null) || (c4031j = this.f48962c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) agtfadlqog.pkzmftpjix(new String[]{"date_added"}, c4031j.f48995b);
            Cursor cursorQuery = this.f48960a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c4031j.f48996c)}, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c4031j.f48995b.iterator();
                        while (it.hasNext()) {
                            if (kcexrzcfyt.sopmlzcsov(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), "screenshot", false, 2, null)) {
                                this.f48961b.invoke();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        zoijcleaow.iobyxmoadg(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaow.iobyxmoadg(cursorQuery, null);
        } catch (Exception unused) {
        }
    }
}
