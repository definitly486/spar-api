package q6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WorkDatabase f77942iobyxmoadg;

    public istkbnxepw(WorkDatabase workDatabase) {
        this.f77942iobyxmoadg = workDatabase;
    }

    public static void ppxfxbqfkf(Context context, u5.lqeggnwhkg lqeggnwhkgVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j13 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j14 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            lqeggnwhkgVar.oxmwwwfdhm();
            try {
                lqeggnwhkgVar.jhduphickx("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j13)});
                lqeggnwhkgVar.jhduphickx("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j14)});
                sharedPreferences.edit().clear().apply();
                lqeggnwhkgVar.vipkmwdibw();
            } finally {
                lqeggnwhkgVar.uwvvkdfqfp();
            }
        }
    }

    public void eablkybsjg(boolean z13) {
        this.f77942iobyxmoadg.kegysxyocb().iobyxmoadg(new p6.wkgbmnqykc("reschedule_needed", z13));
    }

    public long iobyxmoadg() {
        Long lZoijcleaow = this.f77942iobyxmoadg.kegysxyocb().zoijcleaow("last_force_stop_ms");
        if (lZoijcleaow != null) {
            return lZoijcleaow.longValue();
        }
        return 0L;
    }

    public void wkgbmnqykc(long j13) {
        this.f77942iobyxmoadg.kegysxyocb().iobyxmoadg(new p6.wkgbmnqykc("last_force_stop_ms", Long.valueOf(j13)));
    }

    public boolean zoijcleaow() {
        Long lZoijcleaow = this.f77942iobyxmoadg.kegysxyocb().zoijcleaow("reschedule_needed");
        return lZoijcleaow != null && lZoijcleaow.longValue() == 1;
    }
}
