package k11;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1142iobyxmoadg f53460ppxfxbqfkf = new C1142iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f53461zoijcleaow;

    /* JADX INFO: renamed from: k11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1142iobyxmoadg {
        public /* synthetic */ C1142iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1142iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f53461zoijcleaow = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        Intent launchIntentForPackage = this.f53461zoijcleaow.getPackageManager().getLaunchIntentForPackage(this.f53461zoijcleaow.getPackageName());
        if (launchIntentForPackage == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        launchIntentForPackage.addFlags(32768);
        launchIntentForPackage.addFlags(268435456);
        launchIntentForPackage.putExtra("myspar_main_process_pid", Process.myPid());
        this.f53461zoijcleaow.startActivity(launchIntentForPackage);
        Runtime.getRuntime().exit(0);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
