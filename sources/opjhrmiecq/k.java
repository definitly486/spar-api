package opjhrmiecq;

import android.view.InputDevice;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    static final class iobyxmoadg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ igdgnonuha f73745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ f.nufgyqmvbu f73746zdlpuopuiu;

        iobyxmoadg(f.nufgyqmvbu nufgyqmvbuVar, igdgnonuha igdgnonuhaVar) {
            this.f73746zdlpuopuiu = nufgyqmvbuVar;
            this.f73745yggfygwlhe = igdgnonuhaVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((r.zoijcleaow) obj).gxszxtbevo());
        }

        public final Boolean iobyxmoadg(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zEablkybsjg = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg()) && keyEvent.getSource() != 257) {
                if (k.ppxfxbqfkf(keyEvent, 19)) {
                    zEablkybsjg = this.f73746zdlpuopuiu.eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.nufgyqmvbu());
                } else if (k.ppxfxbqfkf(keyEvent, 20)) {
                    zEablkybsjg = this.f73746zdlpuopuiu.eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.iobyxmoadg());
                } else if (k.ppxfxbqfkf(keyEvent, 21)) {
                    zEablkybsjg = this.f73746zdlpuopuiu.eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.wkgbmnqykc());
                } else if (k.ppxfxbqfkf(keyEvent, 22)) {
                    zEablkybsjg = this.f73746zdlpuopuiu.eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.lqeggnwhkg());
                } else if (k.ppxfxbqfkf(keyEvent, 23)) {
                    androidx.compose.ui.platform.m mVarDraadjrbmk = this.f73745yggfygwlhe.draadjrbmk();
                    if (mVarDraadjrbmk != null) {
                        mVarDraadjrbmk.iobyxmoadg();
                    }
                    zEablkybsjg = true;
                }
            }
            return Boolean.valueOf(zEablkybsjg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(KeyEvent keyEvent, int i13) {
        return r.gxszxtbevo.zoijcleaow(r.wkgbmnqykc.iobyxmoadg(keyEvent)) == i13;
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, igdgnonuha igdgnonuhaVar, f.nufgyqmvbu nufgyqmvbuVar) {
        return androidx.compose.ui.input.key.iobyxmoadg.zoijcleaow(wkgbmnqykcVar, new iobyxmoadg(nufgyqmvbuVar, igdgnonuhaVar));
    }
}
