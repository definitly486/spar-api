package ua;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static draadjrbmk f113042iobyxmoadg;

    static synchronized draadjrbmk iobyxmoadg(Context context) {
        try {
            if (f113042iobyxmoadg == null) {
                btonecajqb btonecajqbVar = new btonecajqb(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                btonecajqbVar.iobyxmoadg(context);
                f113042iobyxmoadg = btonecajqbVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f113042iobyxmoadg;
    }
}
