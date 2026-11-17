package q5;

import android.os.Bundle;
import androidx.lifecycle.agtfadlqog;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements agtfadlqog {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f77860yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dxjokdxxww f77861zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: q5.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1741zoijcleaow implements gxszxtbevo.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f77862iobyxmoadg;

        public C1741zoijcleaow(gxszxtbevo registry) {
            zdlpuopuiu.btonecajqb(registry, "registry");
            this.f77862iobyxmoadg = new LinkedHashSet();
            registry.ppxfxbqfkf("androidx.savedstate.Restarter", this);
        }

        @Override // q5.gxszxtbevo.zoijcleaow
        public Bundle iobyxmoadg() {
            vdvldrhtss[] vdvldrhtssVarArr;
            Map mapDxjokdxxww = tzroggbefp.dxjokdxxww();
            if (mapDxjokdxxww.isEmpty()) {
                vdvldrhtssVarArr = new vdvldrhtss[0];
            } else {
                ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
                for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                    arrayList.add(cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
                }
                vdvldrhtssVarArr = (vdvldrhtss[]) arrayList.toArray(new vdvldrhtss[0]);
            }
            Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
            btonecajqb.wkgbmnqykc(btonecajqb.iobyxmoadg(bundleZoijcleaow), "classes_to_restore", jyumaefscl.m(this.f77862iobyxmoadg));
            return bundleZoijcleaow;
        }

        public final void zoijcleaow(String className) {
            zdlpuopuiu.btonecajqb(className, "className");
            this.f77862iobyxmoadg.add(className);
        }
    }

    public zoijcleaow(dxjokdxxww owner) {
        zdlpuopuiu.btonecajqb(owner, "owner");
        this.f77861zdlpuopuiu = owner;
    }

    private final void iobyxmoadg(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, zoijcleaow.class.getClassLoader()).asSubclass(gxszxtbevo.iobyxmoadg.class);
            zdlpuopuiu.lqeggnwhkg(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    zdlpuopuiu.lqeggnwhkg(objNewInstance);
                    ((gxszxtbevo.iobyxmoadg) objNewInstance).iobyxmoadg(this.f77861zdlpuopuiu);
                } catch (Exception e13) {
                    throw new RuntimeException("Failed to instantiate " + str, e13);
                }
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e14);
            }
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException("Class " + str + " wasn't found", e15);
        }
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss source, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(event, "event");
        if (event != androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().wkgbmnqykc(this);
        Bundle bundleIobyxmoadg = this.f77861zdlpuopuiu.getSavedStateRegistry().iobyxmoadg("androidx.savedstate.Restarter");
        if (bundleIobyxmoadg == null) {
            return;
        }
        List listEablkybsjg = ppxfxbqfkf.eablkybsjg(ppxfxbqfkf.iobyxmoadg(bundleIobyxmoadg), "classes_to_restore");
        if (listEablkybsjg == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listEablkybsjg.iterator();
        while (it.hasNext()) {
            iobyxmoadg((String) it.next());
        }
    }
}
