package z8;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.resource.bitmap.yggfygwlhe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn implements Handler.Callback {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final zoijcleaow f129278esjtqupxsv = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final wflxmlrfwp f129279cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final dxjokdxxww f129280iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.collection.iobyxmoadg f129281jyumaefscl = new androidx.collection.iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f129282yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile com.bumptech.glide.agtfadlqog f129283zdlpuopuiu;

    class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // z8.ojitshcjhn.zoijcleaow
        public com.bumptech.glide.agtfadlqog iobyxmoadg(com.bumptech.glide.zoijcleaow zoijcleaowVar, btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar, Context context) {
            return new com.bumptech.glide.agtfadlqog(zoijcleaowVar, btonecajqbVar, rgvfuqvkyqVar, context);
        }
    }

    public interface zoijcleaow {
        com.bumptech.glide.agtfadlqog iobyxmoadg(com.bumptech.glide.zoijcleaow zoijcleaowVar, btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar, Context context);
    }

    public ojitshcjhn(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar = zoijcleaowVar == null ? f129278esjtqupxsv : zoijcleaowVar;
        this.f129282yggfygwlhe = zoijcleaowVar;
        this.f129279cqumvgiudr = new wflxmlrfwp(zoijcleaowVar);
        this.f129280iwizpuwonk = zoijcleaow();
    }

    private com.bumptech.glide.agtfadlqog btonecajqb(Context context) {
        if (this.f129283zdlpuopuiu == null) {
            synchronized (this) {
                try {
                    if (this.f129283zdlpuopuiu == null) {
                        this.f129283zdlpuopuiu = this.f129282yggfygwlhe.iobyxmoadg(com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context.getApplicationContext()), new z8.iobyxmoadg(), new lqeggnwhkg(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f129283zdlpuopuiu;
    }

    private Fragment eablkybsjg(View view, androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f129281jyumaefscl.clear();
        wkgbmnqykc(oxmwwwfdhmVar.getSupportFragmentManager().igdgnonuha(), this.f129281jyumaefscl);
        View viewFindViewById = oxmwwwfdhmVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f129281jyumaefscl.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f129281jyumaefscl.clear();
        return fragment;
    }

    private static boolean gtknphoqwx(Context context) {
        Activity activityPpxfxbqfkf = ppxfxbqfkf(context);
        return activityPpxfxbqfkf == null || !activityPpxfxbqfkf.isFinishing();
    }

    private static void iobyxmoadg(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity ppxfxbqfkf(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return ppxfxbqfkf(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void wkgbmnqykc(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                wkgbmnqykc(fragment.getChildFragmentManager().igdgnonuha(), map);
            }
        }
    }

    private static dxjokdxxww zoijcleaow() {
        return (yggfygwlhe.f21129gxszxtbevo && yggfygwlhe.f21128eablkybsjg) ? new nufgyqmvbu() : new gxszxtbevo();
    }

    public com.bumptech.glide.agtfadlqog dxjokdxxww(androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVar) {
        if (g9.draadjrbmk.vdvldrhtss()) {
            return gxszxtbevo(oxmwwwfdhmVar.getApplicationContext());
        }
        iobyxmoadg(oxmwwwfdhmVar);
        this.f129280iwizpuwonk.iobyxmoadg(oxmwwwfdhmVar);
        boolean zGtknphoqwx = gtknphoqwx(oxmwwwfdhmVar);
        return this.f129279cqumvgiudr.zoijcleaow(oxmwwwfdhmVar, com.bumptech.glide.zoijcleaow.ppxfxbqfkf(oxmwwwfdhmVar.getApplicationContext()), oxmwwwfdhmVar.getLifecycle(), oxmwwwfdhmVar.getSupportFragmentManager(), zGtknphoqwx);
    }

    public com.bumptech.glide.agtfadlqog gxszxtbevo(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (g9.draadjrbmk.oxmwwwfdhm() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.oxmwwwfdhm) {
                return dxjokdxxww((androidx.fragment.app.oxmwwwfdhm) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return gxszxtbevo(contextWrapper.getBaseContext());
                }
            }
        }
        return btonecajqb(context);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public com.bumptech.glide.agtfadlqog lqeggnwhkg(View view) {
        if (g9.draadjrbmk.vdvldrhtss()) {
            return gxszxtbevo(view.getContext().getApplicationContext());
        }
        g9.gtknphoqwx.eablkybsjg(view);
        g9.gtknphoqwx.gxszxtbevo(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityPpxfxbqfkf = ppxfxbqfkf(view.getContext());
        if (activityPpxfxbqfkf != null && (activityPpxfxbqfkf instanceof androidx.fragment.app.oxmwwwfdhm)) {
            androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVar = (androidx.fragment.app.oxmwwwfdhm) activityPpxfxbqfkf;
            Fragment fragmentEablkybsjg = eablkybsjg(view, oxmwwwfdhmVar);
            return fragmentEablkybsjg != null ? nufgyqmvbu(fragmentEablkybsjg) : dxjokdxxww(oxmwwwfdhmVar);
        }
        return gxszxtbevo(view.getContext().getApplicationContext());
    }

    public com.bumptech.glide.agtfadlqog nufgyqmvbu(Fragment fragment) {
        g9.gtknphoqwx.gxszxtbevo(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (g9.draadjrbmk.vdvldrhtss()) {
            return gxszxtbevo(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f129280iwizpuwonk.iobyxmoadg(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f129279cqumvgiudr.zoijcleaow(context, com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }
}
