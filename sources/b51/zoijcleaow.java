package b51;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a51.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kr0.zoijcleaow f15285iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg implements kr0.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kr0.zoijcleaow
        public void iobyxmoadg(String tag, String message) {
            zdlpuopuiu.btonecajqb(tag, "tag");
            zdlpuopuiu.btonecajqb(message, "message");
        }

        @Override // kr0.zoijcleaow
        public void ppxfxbqfkf(Throwable t13) {
            zdlpuopuiu.btonecajqb(t13, "t");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(zoijcleaow zoijcleaowVar, boolean z13, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaowVar.zoijcleaow(z13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a51.iobyxmoadg
    public void iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
    }

    @Override // a51.iobyxmoadg
    public kr0.zoijcleaow ppxfxbqfkf() {
        return this.f15285iobyxmoadg;
    }

    @Override // a51.iobyxmoadg
    public void zoijcleaow(final boolean z13, final rgvfuqvkyq content, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(content, "content");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-2041004520);
        if ((i13 & 48) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(content) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 17) == 16 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-2041004520, i14, -1, "ru.myspar.proloyalty.debugpanel.noop.DebugPanelNoopFeatureApiImpl.ModalDrawer (DebugPanelNoopFeatureApiImpl.kt:14)");
            }
            content.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i14 >> 3) & 14));
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: b51.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.eablkybsjg(this.f15284zdlpuopuiu, z13, content, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
