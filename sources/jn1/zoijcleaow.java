package jn1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scan.api.model.ScanScreenPayload;
import ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ScanScreenFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements hn1.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(ScanScreenPayload scanScreenPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ScanScreenFragment.INSTANCE.iobyxmoadg(scanScreenPayload);
    }

    @Override // hn1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final ScanScreenPayload arg) {
        zdlpuopuiu.btonecajqb(arg, "arg");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SCAN_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: jn1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.wkgbmnqykc(arg, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
