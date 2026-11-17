package com.yandex.runtime.image;

import android.content.Context;
import com.yandex.runtime.Runtime;

/* JADX INFO: loaded from: classes3.dex */
public class ResourceImageProvider {
    public static ImageProvider create(String str) {
        return create(str, true);
    }

    public static ImageProvider create(String str, boolean z13) {
        Context applicationContext = Runtime.getApplicationContext();
        return ImageProvider.fromResource(applicationContext, applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName()), z13);
    }
}
