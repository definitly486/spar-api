package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static volatile zoijcleaow f21199cdpycssgdh;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static volatile boolean f21200yadqdtsiqt;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final o8.zoijcleaow f21201cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final z8.ojitshcjhn f21202esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final wkgbmnqykc f21204iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final p8.nufgyqmvbu f21205jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final z8.ppxfxbqfkf f21206lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final o8.wkgbmnqykc f21208yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.btonecajqb f21209zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final iobyxmoadg f21210zynmafqrjb;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final List f21207pmvmpeiblj = new ArrayList();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private nufgyqmvbu f21203istkbnxepw = nufgyqmvbu.NORMAL;

    public interface iobyxmoadg {
        c9.gxszxtbevo build();
    }

    zoijcleaow(Context context, com.bumptech.glide.load.engine.btonecajqb btonecajqbVar, p8.nufgyqmvbu nufgyqmvbuVar, o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar, z8.ojitshcjhn ojitshcjhnVar, z8.ppxfxbqfkf ppxfxbqfkfVar, int i13, iobyxmoadg iobyxmoadgVar, Map map, List list, List list2, a9.iobyxmoadg iobyxmoadgVar2, eablkybsjg eablkybsjgVar) {
        this.f21209zdlpuopuiu = btonecajqbVar;
        this.f21208yggfygwlhe = wkgbmnqykcVar;
        this.f21201cqumvgiudr = zoijcleaowVar;
        this.f21205jyumaefscl = nufgyqmvbuVar;
        this.f21202esjtqupxsv = ojitshcjhnVar;
        this.f21206lereixgezr = ppxfxbqfkfVar;
        this.f21210zynmafqrjb = iobyxmoadgVar;
        this.f21204iwizpuwonk = new wkgbmnqykc(context, zoijcleaowVar, draadjrbmk.wkgbmnqykc(this, list2, iobyxmoadgVar2), new d9.lqeggnwhkg(), iobyxmoadgVar, map, list, btonecajqbVar, eablkybsjgVar, i13);
    }

    private static void agtfadlqog(Context context, ppxfxbqfkf ppxfxbqfkfVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.ppxfxbqfkf()) {
            listEmptyList = new a9.wkgbmnqykc(applicationContext).zoijcleaow();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.wkgbmnqykc().isEmpty()) {
            Set setWkgbmnqykc = generatedAppGlideModule.wkgbmnqykc();
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                a9.zoijcleaow zoijcleaowVar = (a9.zoijcleaow) it.next();
                if (setWkgbmnqykc.contains(zoijcleaowVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + zoijcleaowVar);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((a9.zoijcleaow) it2.next()).getClass());
            }
        }
        ppxfxbqfkfVar.zoijcleaow(generatedAppGlideModule != null ? generatedAppGlideModule.eablkybsjg() : null);
        Iterator it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            ((a9.zoijcleaow) it3.next()).iobyxmoadg(applicationContext, ppxfxbqfkfVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.zoijcleaow(applicationContext, ppxfxbqfkfVar);
        }
        zoijcleaow zoijcleaowVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(zoijcleaowVarIobyxmoadg);
        f21199cdpycssgdh = zoijcleaowVarIobyxmoadg;
    }

    private static z8.ojitshcjhn draadjrbmk(Context context) {
        g9.gtknphoqwx.gxszxtbevo(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return ppxfxbqfkf(context).gtknphoqwx();
    }

    static void iobyxmoadg(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f21200yadqdtsiqt) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f21200yadqdtsiqt = true;
        try {
            wflxmlrfwp(context, generatedAppGlideModule);
        } finally {
            f21200yadqdtsiqt = false;
        }
    }

    public static zoijcleaow ppxfxbqfkf(Context context) {
        if (f21199cdpycssgdh == null) {
            GeneratedAppGlideModule generatedAppGlideModuleWkgbmnqykc = wkgbmnqykc(context.getApplicationContext());
            synchronized (zoijcleaow.class) {
                try {
                    if (f21199cdpycssgdh == null) {
                        iobyxmoadg(context, generatedAppGlideModuleWkgbmnqykc);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21199cdpycssgdh;
    }

    private static void vdvldrhtss(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    private static void wflxmlrfwp(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        agtfadlqog(context, new ppxfxbqfkf(), generatedAppGlideModule);
    }

    private static GeneratedAppGlideModule wkgbmnqykc(Context context) {
        try {
            int i13 = GeneratedAppGlideModuleImpl.f20586zoijcleaow;
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e13) {
            vdvldrhtss(e13);
            return null;
        } catch (InstantiationException e14) {
            vdvldrhtss(e14);
            return null;
        } catch (NoSuchMethodException e15) {
            vdvldrhtss(e15);
            return null;
        } catch (InvocationTargetException e16) {
            vdvldrhtss(e16);
            return null;
        }
    }

    public static agtfadlqog yggfygwlhe(View view) {
        return draadjrbmk(view.getContext()).lqeggnwhkg(view);
    }

    public static agtfadlqog zdlpuopuiu(Context context) {
        return draadjrbmk(context).gxszxtbevo(context);
    }

    public Registry btonecajqb() {
        return this.f21204iwizpuwonk.dxjokdxxww();
    }

    wkgbmnqykc dxjokdxxww() {
        return this.f21204iwizpuwonk;
    }

    public o8.zoijcleaow eablkybsjg() {
        return this.f21201cqumvgiudr;
    }

    public z8.ojitshcjhn gtknphoqwx() {
        return this.f21202esjtqupxsv;
    }

    public o8.wkgbmnqykc gxszxtbevo() {
        return this.f21208yggfygwlhe;
    }

    void kcexrzcfyt(agtfadlqog agtfadlqogVar) {
        synchronized (this.f21207pmvmpeiblj) {
            try {
                if (!this.f21207pmvmpeiblj.contains(agtfadlqogVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f21207pmvmpeiblj.remove(agtfadlqogVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    z8.ppxfxbqfkf lqeggnwhkg() {
        return this.f21206lereixgezr;
    }

    public Context nufgyqmvbu() {
        return this.f21204iwizpuwonk.getBaseContext();
    }

    void ojitshcjhn(agtfadlqog agtfadlqogVar) {
        synchronized (this.f21207pmvmpeiblj) {
            try {
                if (this.f21207pmvmpeiblj.contains(agtfadlqogVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f21207pmvmpeiblj.add(agtfadlqogVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        zoijcleaow();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        oxmwwwfdhm(i13);
    }

    public void oxmwwwfdhm(int i13) {
        g9.draadjrbmk.iobyxmoadg();
        synchronized (this.f21207pmvmpeiblj) {
            try {
                Iterator it = this.f21207pmvmpeiblj.iterator();
                while (it.hasNext()) {
                    ((agtfadlqog) it.next()).onTrimMemory(i13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f21205jyumaefscl.iobyxmoadg(i13);
        this.f21208yggfygwlhe.iobyxmoadg(i13);
        this.f21201cqumvgiudr.iobyxmoadg(i13);
    }

    boolean rgvfuqvkyq(d9.dxjokdxxww dxjokdxxwwVar) {
        synchronized (this.f21207pmvmpeiblj) {
            try {
                Iterator it = this.f21207pmvmpeiblj.iterator();
                while (it.hasNext()) {
                    if (((agtfadlqog) it.next()).lereixgezr(dxjokdxxwwVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void zoijcleaow() {
        g9.draadjrbmk.iobyxmoadg();
        this.f21205jyumaefscl.zoijcleaow();
        this.f21208yggfygwlhe.zoijcleaow();
        this.f21201cqumvgiudr.zoijcleaow();
    }
}
