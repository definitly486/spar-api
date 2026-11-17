package h6;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f39662ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(Context mContext, int i13, int i14) {
        super(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mContext, "mContext");
        this.f39662ppxfxbqfkf = mContext;
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        if (this.f72063zoijcleaow >= 10) {
            db3.jhduphickx("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f39662ppxfxbqfkf.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
