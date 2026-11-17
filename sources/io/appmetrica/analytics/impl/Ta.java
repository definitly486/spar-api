package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class Ta implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ua f46554a;

    public Ta(Ua ua3) {
        this.f46554a = ua3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f46554a.f46608a.getContentResolver();
        Ua ua3 = this.f46554a;
        ua3.f46609b = contentResolver.query(uri, null, null, new String[]{ua3.f46608a.getPackageName()}, null);
        Cursor cursor = this.f46554a.f46609b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f46554a.f46609b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new Ag(string, this.f46554a.f46609b.getLong(1), this.f46554a.f46609b.getLong(2), EnumC4014zg.f48614d);
            }
        }
        return null;
    }
}
