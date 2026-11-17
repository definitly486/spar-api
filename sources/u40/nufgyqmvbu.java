package u40;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f112651iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg.zoijcleaow f112652ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f112653zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f112650wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f112649eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(File imgFile, Context context, eablkybsjg.ppxfxbqfkf activityResultRegistry, final draadjrbmk onTakeSuccess, final tg.iobyxmoadg onTakeFailure) {
        zdlpuopuiu.btonecajqb(imgFile, "imgFile");
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(activityResultRegistry, "activityResultRegistry");
        zdlpuopuiu.btonecajqb(onTakeSuccess, "onTakeSuccess");
        zdlpuopuiu.btonecajqb(onTakeFailure, "onTakeFailure");
        this.f112651iobyxmoadg = imgFile;
        this.f112653zoijcleaow = context;
        eablkybsjg.zoijcleaow zoijcleaowVarBtonecajqb = activityResultRegistry.btonecajqb("TakePictureLauncher", new gxszxtbevo.nufgyqmvbu(), new eablkybsjg.iobyxmoadg() { // from class: u40.lqeggnwhkg
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                nufgyqmvbu.ppxfxbqfkf(this.f112646iobyxmoadg, onTakeSuccess, onTakeFailure, (Boolean) obj);
            }
        });
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarBtonecajqb, "register(...)");
        this.f112652ppxfxbqfkf = zoijcleaowVarBtonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, Boolean bool) {
        if (!bool.booleanValue()) {
            iobyxmoadgVar.invoke();
            return;
        }
        Uri uriNufgyqmvbu = FileProvider.nufgyqmvbu(nufgyqmvbuVar.f112653zoijcleaow, xx.iobyxmoadg.f123319iobyxmoadg.hcddaimhww(), nufgyqmvbuVar.f112651iobyxmoadg);
        zdlpuopuiu.lqeggnwhkg(uriNufgyqmvbu);
        draadjrbmkVar.invoke(uriNufgyqmvbu);
    }

    public final void zoijcleaow() {
        this.f112652ppxfxbqfkf.iobyxmoadg(FileProvider.nufgyqmvbu(this.f112653zoijcleaow, xx.iobyxmoadg.f123319iobyxmoadg.hcddaimhww(), this.f112651iobyxmoadg));
    }
}
