package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class kegysxyocb implements r {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f6999iobyxmoadg;

    public kegysxyocb(Context context) {
        this.f6999iobyxmoadg = context;
    }

    @Override // androidx.compose.ui.platform.r
    public void iobyxmoadg(String str) {
        try {
            this.f6999iobyxmoadg.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e13) {
            throw new IllegalArgumentException("Can't open " + str + '.', e13);
        }
    }
}
