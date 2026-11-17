package zynmafqrjb;

import android.util.Size;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class jyumaefscl {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final pkzmftpjix.iobyxmoadg f131638gxszxtbevo = new pkzmftpjix.iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final oxmwwwfdhm.ppxfxbqfkf f131639eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.camera.core.impl.agtfadlqog f131640iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final oxmwwwfdhm f131641ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jpowsppfya f131642wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.camera.core.impl.dxjokdxxww f131643zoijcleaow;

    public jyumaefscl(androidx.camera.core.impl.agtfadlqog agtfadlqogVar, Size size, lereixgezr.btonecajqb btonecajqbVar, boolean z13, Size size2, int i13) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131640iobyxmoadg = agtfadlqogVar;
        this.f131643zoijcleaow = androidx.camera.core.impl.dxjokdxxww.iobyxmoadg.btonecajqb(agtfadlqogVar).nufgyqmvbu();
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm();
        this.f131641ppxfxbqfkf = oxmwwwfdhmVar;
        Executor executorJhduphickx = agtfadlqogVar.jhduphickx(yadqdtsiqt.iobyxmoadg.ppxfxbqfkf());
        Objects.requireNonNull(executorJhduphickx);
        jpowsppfya jpowsppfyaVar = new jpowsppfya(executorJhduphickx, null);
        this.f131642wkgbmnqykc = jpowsppfyaVar;
        int iWflxmlrfwp = agtfadlqogVar.wflxmlrfwp();
        int iWkgbmnqykc = wkgbmnqykc();
        agtfadlqogVar.vipkmwdibw();
        oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = oxmwwwfdhm.ppxfxbqfkf.draadjrbmk(size, iWflxmlrfwp, iWkgbmnqykc, z13, null, size2, i13);
        this.f131639eablkybsjg = ppxfxbqfkfVarDraadjrbmk;
        jpowsppfyaVar.cqumvgiudr(oxmwwwfdhmVar.jyumaefscl(ppxfxbqfkfVarDraadjrbmk));
    }

    private int wkgbmnqykc() {
        Integer num = (Integer) this.f131640iobyxmoadg.lqeggnwhkg(androidx.camera.core.impl.agtfadlqog.f3729hkdspvbjdz, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f131640iobyxmoadg.lqeggnwhkg(androidx.camera.core.impl.ojitshcjhn.f3844nufgyqmvbu, null);
        if (num2 == null || num2.intValue() != 4101) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 4101;
    }

    public void eablkybsjg(androidx.camera.core.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131641ppxfxbqfkf.yggfygwlhe(iobyxmoadgVar);
    }

    public void iobyxmoadg() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131641ppxfxbqfkf.oxmwwwfdhm();
        this.f131642wkgbmnqykc.jyumaefscl();
    }

    public int ppxfxbqfkf() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return this.f131641ppxfxbqfkf.nufgyqmvbu();
    }

    public androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaow(Size size) {
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVarVdvldrhtss = androidx.camera.core.impl.jyumaefscl.zoijcleaow.vdvldrhtss(this.f131640iobyxmoadg, size);
        zoijcleaowVarVdvldrhtss.nufgyqmvbu(this.f131639eablkybsjg.btonecajqb());
        if (this.f131639eablkybsjg.lqeggnwhkg() != null) {
            zoijcleaowVarVdvldrhtss.jyumaefscl(this.f131639eablkybsjg.lqeggnwhkg());
        }
        return zoijcleaowVarVdvldrhtss;
    }
}
