package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final long f24510iobyxmoadg = TimeUnit.MINUTES.toMillis(3);

    public static final class iobyxmoadg {
        public static androidx.collection.iobyxmoadg iobyxmoadg(Bundle bundle) {
            androidx.collection.iobyxmoadg iobyxmoadgVar = new androidx.collection.iobyxmoadg();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        iobyxmoadgVar.put(str, str2);
                    }
                }
            }
            return iobyxmoadgVar;
        }
    }
}
