package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.cdpycssgdh;
import istkbnxepw.istkbnxepw;
import istkbnxepw.yggfygwlhe;
import istkbnxepw.zdlpuopuiu;
import java.util.Set;
import kcexrzcfyt.crxdokpmqz;
import kcexrzcfyt.jhduphickx;
import lereixgezr.jyumaefscl;
import lereixgezr.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class Camera2Config {

    public static final class DefaultProvider implements jyumaefscl.zoijcleaow {
        @Override // lereixgezr.jyumaefscl.zoijcleaow
        public jyumaefscl getCameraXConfig() {
            return Camera2Config.ppxfxbqfkf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cdpycssgdh eablkybsjg(Context context) {
        return new jhduphickx(context);
    }

    public static jyumaefscl ppxfxbqfkf() {
        yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg() { // from class: vdvldrhtss.iobyxmoadg
            @Override // istkbnxepw.yggfygwlhe.iobyxmoadg
            public final yggfygwlhe iobyxmoadg(Context context, istkbnxepw istkbnxepwVar, rgvfuqvkyq rgvfuqvkyqVar, long j13) {
                return new kcexrzcfyt.jyumaefscl(context, istkbnxepwVar, rgvfuqvkyqVar, j13);
            }
        };
        zdlpuopuiu.iobyxmoadg iobyxmoadgVar2 = new zdlpuopuiu.iobyxmoadg() { // from class: vdvldrhtss.zoijcleaow
            @Override // istkbnxepw.zdlpuopuiu.iobyxmoadg
            public final zdlpuopuiu iobyxmoadg(Context context, Object obj, Set set) {
                return Camera2Config.wkgbmnqykc(context, obj, set);
            }
        };
        return new jyumaefscl.iobyxmoadg().ppxfxbqfkf(iobyxmoadgVar).wkgbmnqykc(iobyxmoadgVar2).lqeggnwhkg(new cdpycssgdh.ppxfxbqfkf() { // from class: vdvldrhtss.ppxfxbqfkf
            @Override // androidx.camera.core.impl.cdpycssgdh.ppxfxbqfkf
            public final cdpycssgdh iobyxmoadg(Context context) {
                return Camera2Config.eablkybsjg(context);
            }
        }).iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zdlpuopuiu wkgbmnqykc(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new crxdokpmqz(context, obj, set);
        } catch (CameraUnavailableException e13) {
            throw new InitializationException(e13);
        }
    }
}
