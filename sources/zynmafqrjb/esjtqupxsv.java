package zynmafqrjb;

import androidx.camera.core.ImageProcessingUtil;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class esjtqupxsv implements jpowsppfya.yggfygwlhe {
    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jpowsppfya.jyumaefscl apply(jpowsppfya.jyumaefscl jyumaefsclVar) {
        androidx.camera.core.vdvldrhtss vdvldrhtssVar = new androidx.camera.core.vdvldrhtss(androidx.camera.core.ojitshcjhn.iobyxmoadg(jyumaefsclVar.nufgyqmvbu().getWidth(), jyumaefsclVar.nufgyqmvbu().getHeight(), UserVerificationMethods.USER_VERIFY_HANDPRINT, 2));
        androidx.camera.core.agtfadlqog agtfadlqogVarEablkybsjg = ImageProcessingUtil.eablkybsjg(vdvldrhtssVar, (byte[]) jyumaefsclVar.ppxfxbqfkf());
        vdvldrhtssVar.wflxmlrfwp();
        Objects.requireNonNull(agtfadlqogVarEablkybsjg);
        cdpycssgdh.gxszxtbevo gxszxtbevoVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc();
        Objects.requireNonNull(gxszxtbevoVarWkgbmnqykc);
        return jpowsppfya.jyumaefscl.gtknphoqwx(agtfadlqogVarEablkybsjg, gxszxtbevoVarWkgbmnqykc, jyumaefsclVar.zoijcleaow(), jyumaefsclVar.gxszxtbevo(), jyumaefsclVar.lqeggnwhkg(), jyumaefsclVar.iobyxmoadg());
    }
}
