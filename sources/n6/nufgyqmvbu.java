package n6;

import android.content.Context;
import g6.yggfygwlhe;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Object f69171eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final r6.zoijcleaow f69172iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f69173ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final LinkedHashSet f69174wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f69175zoijcleaow;

    protected nufgyqmvbu(Context context, r6.zoijcleaow taskExecutor) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        this.f69172iobyxmoadg = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
        this.f69175zoijcleaow = applicationContext;
        this.f69173ppxfxbqfkf = new Object();
        this.f69174wkgbmnqykc = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(List list, nufgyqmvbu nufgyqmvbuVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l6.iobyxmoadg) it.next()).iobyxmoadg(nufgyqmvbuVar.f69171eablkybsjg);
        }
    }

    public abstract void dxjokdxxww();

    public abstract Object eablkybsjg();

    public final void gxszxtbevo(l6.iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        synchronized (this.f69173ppxfxbqfkf) {
            try {
                if (this.f69174wkgbmnqykc.remove(listener) && this.f69174wkgbmnqykc.isEmpty()) {
                    dxjokdxxww();
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void lqeggnwhkg(Object obj) {
        synchronized (this.f69173ppxfxbqfkf) {
            Object obj2 = this.f69171eablkybsjg;
            if (obj2 == null || !zdlpuopuiu.eablkybsjg(obj2, obj)) {
                this.f69171eablkybsjg = obj;
                final List listM = jyumaefscl.m(this.f69174wkgbmnqykc);
                this.f69172iobyxmoadg.iobyxmoadg().execute(new Runnable() { // from class: n6.lqeggnwhkg
                    @Override // java.lang.Runnable
                    public final void run() {
                        nufgyqmvbu.zoijcleaow(listM, this);
                    }
                });
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        }
    }

    public abstract void nufgyqmvbu();

    public final void ppxfxbqfkf(l6.iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        synchronized (this.f69173ppxfxbqfkf) {
            try {
                if (this.f69174wkgbmnqykc.add(listener)) {
                    if (this.f69174wkgbmnqykc.size() == 1) {
                        this.f69171eablkybsjg = eablkybsjg();
                        yggfygwlhe.eablkybsjg().iobyxmoadg(dxjokdxxww.f69164iobyxmoadg, getClass().getSimpleName() + ": initial state = " + this.f69171eablkybsjg);
                        nufgyqmvbu();
                    }
                    listener.iobyxmoadg(this.f69171eablkybsjg);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final Context wkgbmnqykc() {
        return this.f69175zoijcleaow;
    }
}
