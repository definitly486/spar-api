package ua;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class btonecajqb implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Context f113043iobyxmoadg;

    /* synthetic */ btonecajqb(dxjokdxxww dxjokdxxwwVar) {
    }

    @Override // ua.wflxmlrfwp
    public final draadjrbmk b() {
        Context context = this.f113043iobyxmoadg;
        if (context != null) {
            return new draadjrbmk(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public final btonecajqb iobyxmoadg(Context context) {
        context.getClass();
        this.f113043iobyxmoadg = context;
        return this;
    }
}
