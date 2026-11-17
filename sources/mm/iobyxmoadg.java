package mm;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lm.gxszxtbevo;
import lm.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Gson f67470iobyxmoadg;

    private iobyxmoadg(Gson gson) {
        this.f67470iobyxmoadg = gson;
    }

    public static iobyxmoadg gxszxtbevo() {
        return lqeggnwhkg(new Gson());
    }

    public static iobyxmoadg lqeggnwhkg(Gson gson) {
        if (gson != null) {
            return new iobyxmoadg(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public gxszxtbevo ppxfxbqfkf(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, zdlpuopuiu zdlpuopuiuVar) {
        return new zoijcleaow(this.f67470iobyxmoadg, this.f67470iobyxmoadg.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(type)));
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public gxszxtbevo wkgbmnqykc(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        return new ppxfxbqfkf(this.f67470iobyxmoadg, this.f67470iobyxmoadg.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(type)));
    }
}
