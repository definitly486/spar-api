package q6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(WorkDatabase workDatabase, String str, int i13) {
        workDatabase.kegysxyocb().iobyxmoadg(new p6.wkgbmnqykc(str, Long.valueOf(i13)));
    }

    public static final void ppxfxbqfkf(Context context, u5.lqeggnwhkg sqLiteDatabase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i13 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i14 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.oxmwwwfdhm();
            try {
                sqLiteDatabase.jhduphickx("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i13)});
                sqLiteDatabase.jhduphickx("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i14)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.vipkmwdibw();
            } finally {
                sqLiteDatabase.uwvvkdfqfp();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wkgbmnqykc(WorkDatabase workDatabase, String str) {
        Long lZoijcleaow = workDatabase.kegysxyocb().zoijcleaow(str);
        int iLongValue = lZoijcleaow != null ? (int) lZoijcleaow.longValue() : 0;
        eablkybsjg(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }
}
