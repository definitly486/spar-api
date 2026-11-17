package okpsazkaxt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import gg.wwaezpbzkn;
import t.tzroggbefp;
import t.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f73061iobyxmoadg;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f73061iobyxmoadg = draadjrbmkVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objPpxfxbqfkf = zeieaojujs.iobyxmoadg.ppxfxbqfkf(ylkuphrtabVar, this.f73061iobyxmoadg, gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar) {
        return tzroggbefp.ppxfxbqfkf(wkgbmnqykcVar, btonecajqb.f73050iobyxmoadg, new iobyxmoadg(draadjrbmkVar));
    }
}
