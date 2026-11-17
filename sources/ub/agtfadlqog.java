package ub;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog implements wkgbmnqykc, lc.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final tc.zoijcleaow f113114dxjokdxxww = new tc.zoijcleaow() { // from class: ub.btonecajqb
        @Override // tc.zoijcleaow
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Set f113115eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final kcexrzcfyt f113116gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f113117iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AtomicReference f113118lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final dxjokdxxww f113119nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f113120ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f113121wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f113122zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Executor f113123iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f113126zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f113124ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private dxjokdxxww f113125wkgbmnqykc = dxjokdxxww.f113131iobyxmoadg;

        zoijcleaow(Executor executor) {
            this.f113123iobyxmoadg = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar gxszxtbevo(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public agtfadlqog eablkybsjg() {
            return new agtfadlqog(this.f113123iobyxmoadg, this.f113126zoijcleaow, this.f113124ppxfxbqfkf, this.f113125wkgbmnqykc);
        }

        public zoijcleaow lqeggnwhkg(dxjokdxxww dxjokdxxwwVar) {
            this.f113125wkgbmnqykc = dxjokdxxwwVar;
            return this;
        }

        public zoijcleaow ppxfxbqfkf(final ComponentRegistrar componentRegistrar) {
            this.f113126zoijcleaow.add(new tc.zoijcleaow() { // from class: ub.ojitshcjhn
                @Override // tc.zoijcleaow
                public final Object get() {
                    return agtfadlqog.zoijcleaow.gxszxtbevo(componentRegistrar);
                }
            });
            return this;
        }

        public zoijcleaow wkgbmnqykc(Collection collection) {
            this.f113126zoijcleaow.addAll(collection);
            return this;
        }

        public zoijcleaow zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f113124ppxfxbqfkf.add(ppxfxbqfkfVar);
            return this;
        }
    }

    private void agtfadlqog(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f113121wkgbmnqykc.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((tc.zoijcleaow) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f113119nufgyqmvbu.iobyxmoadg(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e13) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e13);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : ((ppxfxbqfkf) it2.next()).btonecajqb().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f113115eablkybsjg.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f113115eablkybsjg.add(obj.toString());
                    }
                }
            }
            if (this.f113117iobyxmoadg.isEmpty()) {
                rgvfuqvkyq.iobyxmoadg(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f113117iobyxmoadg.keySet());
                arrayList2.addAll(list);
                rgvfuqvkyq.iobyxmoadg(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it3.next();
                this.f113117iobyxmoadg.put(ppxfxbqfkfVar, new zdlpuopuiu(new tc.zoijcleaow() { // from class: ub.gtknphoqwx
                    @Override // tc.zoijcleaow
                    public final Object get() {
                        return this.f113137iobyxmoadg.oxmwwwfdhm(ppxfxbqfkfVar);
                    }
                }));
            }
            arrayList.addAll(iwizpuwonk(list));
            arrayList.addAll(cqumvgiudr());
            jyumaefscl();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        yggfygwlhe();
    }

    private List cqumvgiudr() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f113117iobyxmoadg.entrySet()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) entry.getKey();
            if (!ppxfxbqfkfVar.rgvfuqvkyq()) {
                tc.zoijcleaow zoijcleaowVar = (tc.zoijcleaow) entry.getValue();
                for (pmvmpeiblj pmvmpeibljVar : ppxfxbqfkfVar.btonecajqb()) {
                    if (!map.containsKey(pmvmpeibljVar)) {
                        map.put(pmvmpeibljVar, new HashSet());
                    }
                    ((Set) map.get(pmvmpeibljVar)).add(zoijcleaowVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f113120ppxfxbqfkf.containsKey(entry2.getKey())) {
                final yggfygwlhe yggfygwlheVar = (yggfygwlhe) this.f113120ppxfxbqfkf.get(entry2.getKey());
                for (final tc.zoijcleaow zoijcleaowVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ub.wflxmlrfwp
                        @Override // java.lang.Runnable
                        public final void run() {
                            yggfygwlheVar.iobyxmoadg(zoijcleaowVar2);
                        }
                    });
                }
            } else {
                this.f113120ppxfxbqfkf.put((pmvmpeiblj) entry2.getKey(), yggfygwlhe.zoijcleaow((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private List iwizpuwonk(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar.rgvfuqvkyq()) {
                final tc.zoijcleaow zoijcleaowVar = (tc.zoijcleaow) this.f113117iobyxmoadg.get(ppxfxbqfkfVar);
                for (pmvmpeiblj pmvmpeibljVar : ppxfxbqfkfVar.btonecajqb()) {
                    if (this.f113122zoijcleaow.containsKey(pmvmpeibljVar)) {
                        final esjtqupxsv esjtqupxsvVar = (esjtqupxsv) ((tc.zoijcleaow) this.f113122zoijcleaow.get(pmvmpeibljVar));
                        arrayList.add(new Runnable() { // from class: ub.draadjrbmk
                            @Override // java.lang.Runnable
                            public final void run() {
                                esjtqupxsvVar.btonecajqb(zoijcleaowVar);
                            }
                        });
                    } else {
                        this.f113122zoijcleaow.put(pmvmpeibljVar, zoijcleaowVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private void jyumaefscl() {
        for (ppxfxbqfkf ppxfxbqfkfVar : this.f113117iobyxmoadg.keySet()) {
            for (vdvldrhtss vdvldrhtssVar : ppxfxbqfkfVar.lqeggnwhkg()) {
                if (vdvldrhtssVar.lqeggnwhkg() && !this.f113120ppxfxbqfkf.containsKey(vdvldrhtssVar.ppxfxbqfkf())) {
                    this.f113120ppxfxbqfkf.put(vdvldrhtssVar.ppxfxbqfkf(), yggfygwlhe.zoijcleaow(Collections.emptySet()));
                } else if (this.f113122zoijcleaow.containsKey(vdvldrhtssVar.ppxfxbqfkf())) {
                    continue;
                } else {
                    if (vdvldrhtssVar.gxszxtbevo()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", ppxfxbqfkfVar, vdvldrhtssVar.ppxfxbqfkf()));
                    }
                    if (!vdvldrhtssVar.lqeggnwhkg()) {
                        this.f113122zoijcleaow.put(vdvldrhtssVar.ppxfxbqfkf(), esjtqupxsv.eablkybsjg());
                    }
                }
            }
        }
    }

    private void ojitshcjhn(Map map, boolean z13) {
        for (Map.Entry entry : map.entrySet()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) entry.getKey();
            tc.zoijcleaow zoijcleaowVar = (tc.zoijcleaow) entry.getValue();
            if (ppxfxbqfkfVar.agtfadlqog() || (ppxfxbqfkfVar.ojitshcjhn() && z13)) {
                zoijcleaowVar.get();
            }
        }
        this.f113116gxszxtbevo.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object oxmwwwfdhm(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar.nufgyqmvbu().iobyxmoadg(new zynmafqrjb(ppxfxbqfkfVar, this));
    }

    private static List vdvldrhtss(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static zoijcleaow wflxmlrfwp(Executor executor) {
        return new zoijcleaow(executor);
    }

    private void yggfygwlhe() {
        Boolean bool = (Boolean) this.f113118lqeggnwhkg.get();
        if (bool != null) {
            ojitshcjhn(this.f113117iobyxmoadg, bool.booleanValue());
        }
    }

    @Override // ub.wkgbmnqykc
    public tc.iobyxmoadg eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        tc.zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(pmvmpeibljVar);
        if (zoijcleaowVarLqeggnwhkg == null) {
            return esjtqupxsv.eablkybsjg();
        }
        return zoijcleaowVarLqeggnwhkg instanceof esjtqupxsv ? (esjtqupxsv) zoijcleaowVarLqeggnwhkg : esjtqupxsv.dxjokdxxww(zoijcleaowVarLqeggnwhkg);
    }

    @Override // ub.wkgbmnqykc
    public synchronized tc.zoijcleaow lqeggnwhkg(pmvmpeiblj pmvmpeibljVar) {
        lereixgezr.ppxfxbqfkf(pmvmpeibljVar, "Null interface requested.");
        return (tc.zoijcleaow) this.f113122zoijcleaow.get(pmvmpeibljVar);
    }

    @Override // ub.wkgbmnqykc
    public synchronized tc.zoijcleaow ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) this.f113120ppxfxbqfkf.get(pmvmpeibljVar);
        if (yggfygwlheVar != null) {
            return yggfygwlheVar;
        }
        return f113114dxjokdxxww;
    }

    public void rgvfuqvkyq(boolean z13) {
        HashMap map;
        if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f113118lqeggnwhkg, null, Boolean.valueOf(z13))) {
            synchronized (this) {
                map = new HashMap(this.f113117iobyxmoadg);
            }
            ojitshcjhn(map, z13);
        }
    }

    private agtfadlqog(Executor executor, Iterable iterable, Collection collection, dxjokdxxww dxjokdxxwwVar) {
        this.f113117iobyxmoadg = new HashMap();
        this.f113122zoijcleaow = new HashMap();
        this.f113120ppxfxbqfkf = new HashMap();
        this.f113115eablkybsjg = new HashSet();
        this.f113118lqeggnwhkg = new AtomicReference();
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(executor);
        this.f113116gxszxtbevo = kcexrzcfytVar;
        this.f113119nufgyqmvbu = dxjokdxxwwVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ppxfxbqfkf.kcexrzcfyt(kcexrzcfytVar, kcexrzcfyt.class, qc.wkgbmnqykc.class, qc.ppxfxbqfkf.class));
        arrayList.add(ppxfxbqfkf.kcexrzcfyt(this, lc.iobyxmoadg.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar != null) {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
        this.f113121wkgbmnqykc = vdvldrhtss(iterable);
        agtfadlqog(arrayList);
    }
}
