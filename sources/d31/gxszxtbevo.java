package d31;

import android.net.Uri;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg.zoijcleaow f26894iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f26893zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f26892ppxfxbqfkf = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(eablkybsjg.ppxfxbqfkf activityResultRegistry, final draadjrbmk onImageOpen, final tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(activityResultRegistry, "activityResultRegistry");
        zdlpuopuiu.btonecajqb(onImageOpen, "onImageOpen");
        eablkybsjg.zoijcleaow zoijcleaowVarBtonecajqb = activityResultRegistry.btonecajqb("PhotoPickerLauncher", new gxszxtbevo.eablkybsjg(), new eablkybsjg.iobyxmoadg() { // from class: d31.eablkybsjg
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                gxszxtbevo.ppxfxbqfkf(iobyxmoadgVar, onImageOpen, (Uri) obj);
            }
        });
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarBtonecajqb, "register(...)");
        this.f26894iobyxmoadg = zoijcleaowVarBtonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, Uri uri) {
        if (uri != null) {
            draadjrbmkVar.invoke(uri);
        } else if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final void zoijcleaow() {
        this.f26894iobyxmoadg.iobyxmoadg(eablkybsjg.gxszxtbevo.iobyxmoadg(gxszxtbevo.eablkybsjg.ppxfxbqfkf.f38656iobyxmoadg));
    }

    public /* synthetic */ gxszxtbevo(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(ppxfxbqfkfVar, draadjrbmkVar, (i13 & 4) != 0 ? null : iobyxmoadgVar);
    }
}
