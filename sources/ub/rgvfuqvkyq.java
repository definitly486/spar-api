package ub;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class rgvfuqvkyq {

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pmvmpeiblj f113164iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f113165zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return ppxfxbqfkfVar.f113164iobyxmoadg.equals(this.f113164iobyxmoadg) && ppxfxbqfkfVar.f113165zoijcleaow == this.f113165zoijcleaow;
        }

        public int hashCode() {
            return ((this.f113164iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f113165zoijcleaow).hashCode();
        }

        private ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar, boolean z13) {
            this.f113164iobyxmoadg = pmvmpeibljVar;
            this.f113165zoijcleaow = z13;
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ub.ppxfxbqfkf f113166iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Set f113168zoijcleaow = new HashSet();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Set f113167ppxfxbqfkf = new HashSet();

        zoijcleaow(ub.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f113166iobyxmoadg = ppxfxbqfkfVar;
        }

        boolean eablkybsjg() {
            return this.f113168zoijcleaow.isEmpty();
        }

        boolean gxszxtbevo() {
            return this.f113167ppxfxbqfkf.isEmpty();
        }

        void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f113168zoijcleaow.add(zoijcleaowVar);
        }

        void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
            this.f113167ppxfxbqfkf.remove(zoijcleaowVar);
        }

        ub.ppxfxbqfkf ppxfxbqfkf() {
            return this.f113166iobyxmoadg;
        }

        Set wkgbmnqykc() {
            return this.f113168zoijcleaow;
        }

        void zoijcleaow(zoijcleaow zoijcleaowVar) {
            this.f113167ppxfxbqfkf.add(zoijcleaowVar);
        }
    }

    static void iobyxmoadg(List list) {
        Set<zoijcleaow> setPpxfxbqfkf = ppxfxbqfkf(list);
        Set setZoijcleaow = zoijcleaow(setPpxfxbqfkf);
        int i13 = 0;
        while (!setZoijcleaow.isEmpty()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) setZoijcleaow.iterator().next();
            setZoijcleaow.remove(zoijcleaowVar);
            i13++;
            for (zoijcleaow zoijcleaowVar2 : zoijcleaowVar.wkgbmnqykc()) {
                zoijcleaowVar2.lqeggnwhkg(zoijcleaowVar);
                if (zoijcleaowVar2.gxszxtbevo()) {
                    setZoijcleaow.add(zoijcleaowVar2);
                }
            }
        }
        if (i13 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zoijcleaow zoijcleaowVar3 : setPpxfxbqfkf) {
            if (!zoijcleaowVar3.gxszxtbevo() && !zoijcleaowVar3.eablkybsjg()) {
                arrayList.add(zoijcleaowVar3.ppxfxbqfkf());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set ppxfxbqfkf(List list) {
        Set<zoijcleaow> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (zoijcleaow zoijcleaowVar : (Set) it2.next()) {
                        for (vdvldrhtss vdvldrhtssVar : zoijcleaowVar.ppxfxbqfkf().lqeggnwhkg()) {
                            if (vdvldrhtssVar.eablkybsjg() && (set = (Set) map.get(new ppxfxbqfkf(vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.lqeggnwhkg()))) != null) {
                                for (zoijcleaow zoijcleaowVar2 : set) {
                                    zoijcleaowVar.iobyxmoadg(zoijcleaowVar2);
                                    zoijcleaowVar2.zoijcleaow(zoijcleaowVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            ub.ppxfxbqfkf ppxfxbqfkfVar = (ub.ppxfxbqfkf) it.next();
            zoijcleaow zoijcleaowVar3 = new zoijcleaow(ppxfxbqfkfVar);
            for (pmvmpeiblj pmvmpeibljVar : ppxfxbqfkfVar.btonecajqb()) {
                ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(pmvmpeibljVar, !ppxfxbqfkfVar.rgvfuqvkyq());
                if (!map.containsKey(ppxfxbqfkfVar2)) {
                    map.put(ppxfxbqfkfVar2, new HashSet());
                }
                Set set2 = (Set) map.get(ppxfxbqfkfVar2);
                if (!set2.isEmpty() && !ppxfxbqfkfVar2.f113165zoijcleaow) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", pmvmpeibljVar));
                }
                set2.add(zoijcleaowVar3);
            }
        }
    }

    private static Set zoijcleaow(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) it.next();
            if (zoijcleaowVar.gxszxtbevo()) {
                hashSet.add(zoijcleaowVar);
            }
        }
        return hashSet;
    }
}
