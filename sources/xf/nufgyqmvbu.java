package xf;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu implements zf.zoijcleaow {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f122277yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Service f122278zdlpuopuiu;

    public interface iobyxmoadg {
        vf.wkgbmnqykc iobyxmoadg();
    }

    public nufgyqmvbu(Service service) {
        this.f122278zdlpuopuiu = service;
    }

    private Object iobyxmoadg() {
        Application application = this.f122278zdlpuopuiu.getApplication();
        zf.wkgbmnqykc.ppxfxbqfkf(application instanceof zf.zoijcleaow, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((iobyxmoadg) qf.iobyxmoadg.iobyxmoadg(application, iobyxmoadg.class)).iobyxmoadg().iobyxmoadg(this.f122278zdlpuopuiu).build();
    }

    @Override // zf.zoijcleaow
    public Object ojitshcjhn() {
        if (this.f122277yggfygwlhe == null) {
            this.f122277yggfygwlhe = iobyxmoadg();
        }
        return this.f122277yggfygwlhe;
    }
}
