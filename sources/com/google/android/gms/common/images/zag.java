package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i13) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i13;
    }

    protected abstract void zaa(Drawable drawable, boolean z13, boolean z14, boolean z15);

    final void zab(Context context, zam zamVar, boolean z13) {
        int i13 = this.zab;
        zaa(i13 != 0 ? context.getResources().getDrawable(i13) : null, z13, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z13) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
