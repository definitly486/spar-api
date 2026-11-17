package xf;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements zf.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final zf.zoijcleaow f122270iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected final Activity f122271jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f122272yggfygwlhe = new Object();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Object f122273zdlpuopuiu;

    /* JADX INFO: renamed from: xf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC3077iobyxmoadg {
        vf.iobyxmoadg iobyxmoadg();
    }

    public iobyxmoadg(Activity activity) {
        this.f122271jyumaefscl = activity;
        this.f122270iwizpuwonk = new zoijcleaow((androidx.activity.nufgyqmvbu) activity);
    }

    protected Object iobyxmoadg() {
        String str;
        if (this.f122271jyumaefscl.getApplication() instanceof zf.zoijcleaow) {
            return ((InterfaceC3077iobyxmoadg) qf.iobyxmoadg.iobyxmoadg(this.f122270iwizpuwonk, InterfaceC3077iobyxmoadg.class)).iobyxmoadg().iobyxmoadg(this.f122271jyumaefscl).build();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f122271jyumaefscl.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f122271jyumaefscl.getApplication().getClass();
        }
        sb3.append(str);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // zf.zoijcleaow
    public Object ojitshcjhn() {
        if (this.f122273zdlpuopuiu == null) {
            synchronized (this.f122272yggfygwlhe) {
                try {
                    if (this.f122273zdlpuopuiu == null) {
                        this.f122273zdlpuopuiu = iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122273zdlpuopuiu;
    }

    public final lqeggnwhkg zoijcleaow() {
        return ((zoijcleaow) this.f122270iwizpuwonk).ppxfxbqfkf();
    }
}
