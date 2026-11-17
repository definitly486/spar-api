package h;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class sopmlzcsov {
    public static final Shader.TileMode iobyxmoadg(int i13) {
        i.iobyxmoadg iobyxmoadgVar = i.f38905iobyxmoadg;
        if (i.gxszxtbevo(i13, iobyxmoadgVar.iobyxmoadg())) {
            return Shader.TileMode.CLAMP;
        }
        if (i.gxszxtbevo(i13, iobyxmoadgVar.wkgbmnqykc())) {
            return Shader.TileMode.REPEAT;
        }
        if (i.gxszxtbevo(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return Shader.TileMode.MIRROR;
        }
        if (i.gxszxtbevo(i13, iobyxmoadgVar.zoijcleaow()) && Build.VERSION.SDK_INT >= 31) {
            return k.f38920iobyxmoadg.iobyxmoadg();
        }
        return Shader.TileMode.CLAMP;
    }
}
