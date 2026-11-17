package iq1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends BroadcastReceiver {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f49192ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f49193iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final WeakReference f49194zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(zoijcleaow smsRetrievedUtils, WeakReference weakRef) {
        zdlpuopuiu.btonecajqb(smsRetrievedUtils, "smsRetrievedUtils");
        zdlpuopuiu.btonecajqb(weakRef, "weakRef");
        this.f49193iobyxmoadg = smsRetrievedUtils;
        this.f49194zoijcleaow = weakRef;
    }

    private final void iobyxmoadg(String str) {
        try {
            Object obj = this.f49194zoijcleaow.get();
            iq1.iobyxmoadg iobyxmoadgVar = obj instanceof iq1.iobyxmoadg ? (iq1.iobyxmoadg) obj : null;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.dxjokdxxww(str);
            }
        } catch (Throwable th2) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
        }
    }

    private final void zoijcleaow(Intent intent) {
        try {
            Fragment fragment = (Fragment) this.f49194zoijcleaow.get();
            if (fragment != null) {
                fragment.startActivityForResult(intent, 2);
            }
        } catch (Throwable th2) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null && this.f49193iobyxmoadg.zoijcleaow(intent)) {
            Intent intentIobyxmoadg = this.f49193iobyxmoadg.iobyxmoadg(extras);
            if (intentIobyxmoadg != null) {
                zoijcleaow(intentIobyxmoadg);
            } else {
                iobyxmoadg(this.f49193iobyxmoadg.ppxfxbqfkf(intent));
            }
        }
    }
}
