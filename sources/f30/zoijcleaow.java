package f30;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import ft.ppxfxbqfkf;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f32718ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f32719zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final void iobyxmoadg(Intent intent) {
            zdlpuopuiu.btonecajqb(intent, "intent");
            int intExtra = intent.getIntExtra("myspar_main_process_pid", -1);
            if (intExtra != -1) {
                Process.killProcess(intExtra);
            }
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(Context context, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f32719zoijcleaow = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(zoijcleaow zoijcleaowVar, Intent intent) {
        zoijcleaowVar.f32719zoijcleaow.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        final Intent launchIntentForPackage = this.f32719zoijcleaow.getPackageManager().getLaunchIntentForPackage(this.f32719zoijcleaow.getPackageName());
        if (launchIntentForPackage == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        launchIntentForPackage.addFlags(32768);
        launchIntentForPackage.putExtra("myspar_main_process_pid", Process.myPid());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: f30.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                zoijcleaow.eablkybsjg(this.f32717zdlpuopuiu, launchIntentForPackage);
            }
        }, 300L);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
