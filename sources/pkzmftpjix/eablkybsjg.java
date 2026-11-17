package pkzmftpjix;

import android.media.MediaCodec;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.jyumaefscl;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lereixgezr.metgxyhuhe;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f76883iobyxmoadg;

    public eablkybsjg() {
        this.f76883iobyxmoadg = androidx.camera.core.internal.compat.quirk.iobyxmoadg.zoijcleaow(SurfaceOrderQuirk.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int ppxfxbqfkf(jyumaefscl.gxszxtbevo gxszxtbevoVar, jyumaefscl.gxszxtbevo gxszxtbevoVar2) {
        return zoijcleaow(gxszxtbevoVar.gxszxtbevo()) - zoijcleaow(gxszxtbevoVar2.gxszxtbevo());
    }

    private int zoijcleaow(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.lqeggnwhkg() == MediaCodec.class) {
            return 2;
        }
        return deferrableSurface.lqeggnwhkg() == metgxyhuhe.class ? 0 : 1;
    }

    public void wkgbmnqykc(List list) {
        if (this.f76883iobyxmoadg) {
            Collections.sort(list, new Comparator() { // from class: pkzmftpjix.wkgbmnqykc
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f76885zdlpuopuiu.ppxfxbqfkf((jyumaefscl.gxszxtbevo) obj, (jyumaefscl.gxszxtbevo) obj2);
                }
            });
        }
    }
}
