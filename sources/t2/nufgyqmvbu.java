package t2;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.ntlheqmsrt;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {
    public static final ntlheqmsrt iobyxmoadg(crxdokpmqz.ppxfxbqfkf factory, ah.wkgbmnqykc modelClass, iobyxmoadg extras) {
        zdlpuopuiu.btonecajqb(factory, "factory");
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        zdlpuopuiu.btonecajqb(extras, "extras");
        try {
            try {
                return factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.create(sg.iobyxmoadg.zoijcleaow(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.create(sg.iobyxmoadg.zoijcleaow(modelClass), extras);
        }
    }
}
