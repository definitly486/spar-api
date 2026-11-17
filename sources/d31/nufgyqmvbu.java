package d31;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f26899eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f26900gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f26901iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.iobyxmoadg f26902ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final eablkybsjg.zoijcleaow f26903wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f26904zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(File imgFile, Context context, eablkybsjg.ppxfxbqfkf activityResultRegistry, final draadjrbmk onTakeSuccess, tg.iobyxmoadg onTakeFailure) {
        zdlpuopuiu.btonecajqb(imgFile, "imgFile");
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(activityResultRegistry, "activityResultRegistry");
        zdlpuopuiu.btonecajqb(onTakeSuccess, "onTakeSuccess");
        zdlpuopuiu.btonecajqb(onTakeFailure, "onTakeFailure");
        this.f26901iobyxmoadg = imgFile;
        this.f26904zoijcleaow = context;
        this.f26902ppxfxbqfkf = onTakeFailure;
        eablkybsjg.zoijcleaow zoijcleaowVarBtonecajqb = activityResultRegistry.btonecajqb("TakePictureLauncher", new gxszxtbevo.nufgyqmvbu(), new eablkybsjg.iobyxmoadg() { // from class: d31.lqeggnwhkg
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                nufgyqmvbu.ppxfxbqfkf(this.f26897iobyxmoadg, onTakeSuccess, (Boolean) obj);
            }
        });
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarBtonecajqb, "register(...)");
        this.f26903wkgbmnqykc = zoijcleaowVarBtonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar, Boolean bool) {
        if (!bool.booleanValue()) {
            nufgyqmvbuVar.f26902ppxfxbqfkf.invoke();
            return;
        }
        Uri uriNufgyqmvbu = FileProvider.nufgyqmvbu(nufgyqmvbuVar.f26904zoijcleaow, uw0.ppxfxbqfkf.f114521iobyxmoadg.jyumaefscl(), nufgyqmvbuVar.f26901iobyxmoadg);
        zdlpuopuiu.lqeggnwhkg(uriNufgyqmvbu);
        draadjrbmkVar.invoke(uriNufgyqmvbu);
    }

    public final void zoijcleaow() {
        try {
            this.f26903wkgbmnqykc.iobyxmoadg(FileProvider.nufgyqmvbu(this.f26904zoijcleaow, uw0.ppxfxbqfkf.f114521iobyxmoadg.jyumaefscl(), this.f26901iobyxmoadg));
        } catch (ActivityNotFoundException e13) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
            this.f26902ppxfxbqfkf.invoke();
        } catch (SecurityException e14) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e14, new CrashlyticsKey[0]);
            this.f26902ppxfxbqfkf.invoke();
        }
    }
}
