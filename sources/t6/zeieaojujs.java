package t6;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zeieaojujs implements kc2.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f109914iobyxmoadg;

    public zeieaojujs(Context context) {
        if (context instanceof Application) {
            this.f109914iobyxmoadg = context;
        } else {
            this.f109914iobyxmoadg = context.getApplicationContext();
        }
    }

    @Override // kc2.iobyxmoadg
    public kc2.ppxfxbqfkf iobyxmoadg() {
        return new j1(this.f109914iobyxmoadg);
    }
}
