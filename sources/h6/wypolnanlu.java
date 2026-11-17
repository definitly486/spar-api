package h6;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class wypolnanlu extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f39660ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wypolnanlu(Context context) {
        super(9, 10);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f39660ppxfxbqfkf = context;
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        q6.istkbnxepw.ppxfxbqfkf(this.f39660ppxfxbqfkf, db3);
        q6.ojitshcjhn.ppxfxbqfkf(this.f39660ppxfxbqfkf, db3);
    }
}
