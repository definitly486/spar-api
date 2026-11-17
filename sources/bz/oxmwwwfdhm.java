package bz;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.Callable;
import t6.p1;

/* JADX INFO: loaded from: classes2.dex */
class oxmwwwfdhm extends metgxyhuhe implements p1 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17546eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pc2.iobyxmoadg f17547gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private volatile String f17548lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private volatile String f17549nufgyqmvbu;

    oxmwwwfdhm(Context context, pc2.iobyxmoadg iobyxmoadgVar) {
        super(kc2.lqeggnwhkg.AgentAppInfo);
        this.f17546eablkybsjg = context;
        this.f17547gxszxtbevo = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String hcddaimhww() {
        try {
            return this.f17546eablkybsjg.getPackageManager().getPackageInfo(this.f17546eablkybsjg.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private String iozdgvuglv() {
        if (this.f17549nufgyqmvbu == null) {
            this.f17549nufgyqmvbu = (String) vdvldrhtss(new Callable() { // from class: bz.rgvfuqvkyq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17580iobyxmoadg.hcddaimhww();
                }
            });
        }
        return this.f17549nufgyqmvbu;
    }

    private String lmojexxdyd() {
        return Build.CPU_ABI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String wwaezpbzkn() {
        ApplicationInfo applicationInfo = this.f17546eablkybsjg.getApplicationInfo();
        int i13 = applicationInfo.labelRes;
        return i13 == 0 ? this.f17546eablkybsjg.getPackageManager().getApplicationLabel(applicationInfo).toString() : this.f17546eablkybsjg.getString(i13);
    }

    private String ylkuphrtab() {
        if (this.f17548lqeggnwhkg == null) {
            this.f17548lqeggnwhkg = (String) vdvldrhtss(new Callable() { // from class: bz.vdvldrhtss
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17655iobyxmoadg.wwaezpbzkn();
                }
            });
        }
        return this.f17548lqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        return ylkuphrtab() + " " + iozdgvuglv() + " " + lmojexxdyd();
    }

    @Override // t6.p1
    public pc2.iobyxmoadg zoijcleaow() {
        return this.f17547gxszxtbevo;
    }
}
