package xf;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo implements zf.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Fragment f122267jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f122268yggfygwlhe = new Object();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Object f122269zdlpuopuiu;

    public interface iobyxmoadg {
        vf.ppxfxbqfkf gxszxtbevo();
    }

    public gxszxtbevo(Fragment fragment) {
        this.f122267jyumaefscl = fragment;
    }

    private Object iobyxmoadg() {
        zf.wkgbmnqykc.zoijcleaow(this.f122267jyumaefscl.getHost(), "Hilt Fragments must be attached before creating the component.");
        zf.wkgbmnqykc.ppxfxbqfkf(this.f122267jyumaefscl.getHost() instanceof zf.zoijcleaow, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f122267jyumaefscl.getHost().getClass());
        eablkybsjg(this.f122267jyumaefscl);
        return ((iobyxmoadg) qf.iobyxmoadg.iobyxmoadg(this.f122267jyumaefscl.getHost(), iobyxmoadg.class)).gxszxtbevo().iobyxmoadg(this.f122267jyumaefscl).build();
    }

    public static ContextWrapper ppxfxbqfkf(LayoutInflater layoutInflater, Fragment fragment) {
        return new dxjokdxxww.iobyxmoadg(layoutInflater, fragment);
    }

    public static final Context wkgbmnqykc(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper zoijcleaow(Context context, Fragment fragment) {
        return new dxjokdxxww.iobyxmoadg(context, fragment);
    }

    protected void eablkybsjg(Fragment fragment) {
    }

    @Override // zf.zoijcleaow
    public Object ojitshcjhn() {
        if (this.f122269zdlpuopuiu == null) {
            synchronized (this.f122268yggfygwlhe) {
                try {
                    if (this.f122269zdlpuopuiu == null) {
                        this.f122269zdlpuopuiu = iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122269zdlpuopuiu;
    }
}
