package b9;

import com.bumptech.glide.load.engine.dxjokdxxww;
import com.bumptech.glide.load.engine.vdvldrhtss;
import g9.btonecajqb;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import y8.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final vdvldrhtss f15573ppxfxbqfkf = new vdvldrhtss(Object.class, Object.class, Object.class, Collections.singletonList(new dxjokdxxww(Object.class, Object.class, Object.class, Collections.emptyList(), new lqeggnwhkg(), null)), null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.iobyxmoadg f15574iobyxmoadg = new androidx.collection.iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicReference f15575zoijcleaow = new AtomicReference();

    private btonecajqb zoijcleaow(Class cls, Class cls2, Class cls3) {
        btonecajqb btonecajqbVar = (btonecajqb) this.f15575zoijcleaow.getAndSet(null);
        if (btonecajqbVar == null) {
            btonecajqbVar = new btonecajqb();
        }
        btonecajqbVar.iobyxmoadg(cls, cls2, cls3);
        return btonecajqbVar;
    }

    public vdvldrhtss iobyxmoadg(Class cls, Class cls2, Class cls3) {
        vdvldrhtss vdvldrhtssVar;
        btonecajqb btonecajqbVarZoijcleaow = zoijcleaow(cls, cls2, cls3);
        synchronized (this.f15574iobyxmoadg) {
            vdvldrhtssVar = (vdvldrhtss) this.f15574iobyxmoadg.get(btonecajqbVarZoijcleaow);
        }
        this.f15575zoijcleaow.set(btonecajqbVarZoijcleaow);
        return vdvldrhtssVar;
    }

    public boolean ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
        return f15573ppxfxbqfkf.equals(vdvldrhtssVar);
    }

    public void wkgbmnqykc(Class cls, Class cls2, Class cls3, vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f15574iobyxmoadg) {
            androidx.collection.iobyxmoadg iobyxmoadgVar = this.f15574iobyxmoadg;
            btonecajqb btonecajqbVar = new btonecajqb(cls, cls2, cls3);
            if (vdvldrhtssVar == null) {
                vdvldrhtssVar = f15573ppxfxbqfkf;
            }
            iobyxmoadgVar.put(btonecajqbVar, vdvldrhtssVar);
        }
    }
}
