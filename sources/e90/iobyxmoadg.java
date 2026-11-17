package e90;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements b90.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f30974iobyxmoadg;

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f30974iobyxmoadg = context;
    }

    private final SharedPreferences eablkybsjg() {
        return this.f30974iobyxmoadg.getSharedPreferences("echecks_preferences", 0);
    }

    @Override // b90.iobyxmoadg
    public void iobyxmoadg(LocalDateTime localDateTime) {
        eablkybsjg().edit().putString("nextShowEchecksTime", localDateTime != null ? localDateTime.toString() : null).apply();
    }

    @Override // b90.iobyxmoadg
    public LocalDateTime ppxfxbqfkf() {
        String string = eablkybsjg().getString("nextShowEchecksTime", null);
        if (string != null) {
            return LocalDateTime.parse(string);
        }
        return null;
    }

    @Override // b90.iobyxmoadg
    public int wkgbmnqykc() {
        return eablkybsjg().getInt("showEchecksCount", 0);
    }

    @Override // b90.iobyxmoadg
    public void zoijcleaow(int i13) {
        eablkybsjg().edit().putInt("showEchecksCount", i13).apply();
    }
}
