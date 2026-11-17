package xf;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.agtfadlqog;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww implements zf.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final View f122258iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f122259jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f122260yggfygwlhe = new Object();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Object f122261zdlpuopuiu;

    public interface ppxfxbqfkf {
        vf.lqeggnwhkg metgxyhuhe();
    }

    public interface zoijcleaow {
        vf.eablkybsjg wkgbmnqykc();
    }

    public dxjokdxxww(View view, boolean z13) {
        this.f122258iwizpuwonk = view;
        this.f122259jyumaefscl = z13;
    }

    private Object iobyxmoadg() {
        zf.zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(false);
        return this.f122259jyumaefscl ? ((ppxfxbqfkf) qf.iobyxmoadg.iobyxmoadg(zoijcleaowVarZoijcleaow, ppxfxbqfkf.class)).metgxyhuhe().iobyxmoadg(this.f122258iwizpuwonk).build() : ((zoijcleaow) qf.iobyxmoadg.iobyxmoadg(zoijcleaowVarZoijcleaow, zoijcleaow.class)).wkgbmnqykc().iobyxmoadg(this.f122258iwizpuwonk).build();
    }

    private Context ppxfxbqfkf(Class cls, boolean z13) {
        Context contextWkgbmnqykc = wkgbmnqykc(this.f122258iwizpuwonk.getContext(), cls);
        if (contextWkgbmnqykc != uf.iobyxmoadg.iobyxmoadg(contextWkgbmnqykc.getApplicationContext())) {
            return contextWkgbmnqykc;
        }
        zf.wkgbmnqykc.ppxfxbqfkf(z13, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f122258iwizpuwonk.getClass());
        return null;
    }

    private static Context wkgbmnqykc(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private zf.zoijcleaow zoijcleaow(boolean z13) {
        if (this.f122259jyumaefscl) {
            Context contextPpxfxbqfkf = ppxfxbqfkf(iobyxmoadg.class, z13);
            if (contextPpxfxbqfkf instanceof iobyxmoadg) {
                return (zf.zoijcleaow) ((iobyxmoadg) contextPpxfxbqfkf).wkgbmnqykc();
            }
            if (z13) {
                return null;
            }
            Context contextPpxfxbqfkf2 = ppxfxbqfkf(zf.zoijcleaow.class, z13);
            zf.wkgbmnqykc.ppxfxbqfkf(!(contextPpxfxbqfkf2 instanceof zf.zoijcleaow), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f122258iwizpuwonk.getClass(), contextPpxfxbqfkf2.getClass().getName());
        } else {
            Object objPpxfxbqfkf = ppxfxbqfkf(zf.zoijcleaow.class, z13);
            if (objPpxfxbqfkf instanceof zf.zoijcleaow) {
                return (zf.zoijcleaow) objPpxfxbqfkf;
            }
            if (z13) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.f122258iwizpuwonk.getClass()));
    }

    @Override // zf.zoijcleaow
    public Object ojitshcjhn() {
        if (this.f122261zdlpuopuiu == null) {
            synchronized (this.f122260yggfygwlhe) {
                try {
                    if (this.f122261zdlpuopuiu == null) {
                        this.f122261zdlpuopuiu = iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122261zdlpuopuiu;
    }

    public static final class iobyxmoadg extends ContextWrapper {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Fragment f122262iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private LayoutInflater f122263ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final agtfadlqog f122264wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private LayoutInflater f122265zoijcleaow;

        /* JADX INFO: renamed from: xf.dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C3076iobyxmoadg implements agtfadlqog {
            C3076iobyxmoadg() {
            }

            @Override // androidx.lifecycle.agtfadlqog
            public void nufgyqmvbu(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
                if (iobyxmoadgVar == gtknphoqwx.iobyxmoadg.ON_DESTROY) {
                    iobyxmoadg.this.f122262iobyxmoadg = null;
                    iobyxmoadg.this.f122265zoijcleaow = null;
                    iobyxmoadg.this.f122263ppxfxbqfkf = null;
                }
            }
        }

        iobyxmoadg(Context context, Fragment fragment) {
            super((Context) zf.wkgbmnqykc.iobyxmoadg(context));
            C3076iobyxmoadg c3076iobyxmoadg = new C3076iobyxmoadg();
            this.f122264wkgbmnqykc = c3076iobyxmoadg;
            this.f122265zoijcleaow = null;
            Fragment fragment2 = (Fragment) zf.wkgbmnqykc.iobyxmoadg(fragment);
            this.f122262iobyxmoadg = fragment2;
            fragment2.getLifecycle().iobyxmoadg(c3076iobyxmoadg);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f122263ppxfxbqfkf == null) {
                if (this.f122265zoijcleaow == null) {
                    this.f122265zoijcleaow = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f122263ppxfxbqfkf = this.f122265zoijcleaow.cloneInContext(this);
            }
            return this.f122263ppxfxbqfkf;
        }

        Fragment wkgbmnqykc() {
            zf.wkgbmnqykc.zoijcleaow(this.f122262iobyxmoadg, "The fragment has already been destroyed.");
            return this.f122262iobyxmoadg;
        }

        iobyxmoadg(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) zf.wkgbmnqykc.iobyxmoadg(((LayoutInflater) zf.wkgbmnqykc.iobyxmoadg(layoutInflater)).getContext()));
            C3076iobyxmoadg c3076iobyxmoadg = new C3076iobyxmoadg();
            this.f122264wkgbmnqykc = c3076iobyxmoadg;
            this.f122265zoijcleaow = layoutInflater;
            Fragment fragment2 = (Fragment) zf.wkgbmnqykc.iobyxmoadg(fragment);
            this.f122262iobyxmoadg = fragment2;
            fragment2.getLifecycle().iobyxmoadg(c3076iobyxmoadg);
        }
    }
}
