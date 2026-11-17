package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final esjtqupxsv f8636iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final esjtqupxsv f8637zoijcleaow;

    private static final class ppxfxbqfkf extends esjtqupxsv {
        private ppxfxbqfkf() {
            super();
        }

        static zdlpuopuiu.zoijcleaow gxszxtbevo(Object obj, long j13) {
            return (zdlpuopuiu.zoijcleaow) metgxyhuhe.pmvmpeiblj(obj, j13);
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        List eablkybsjg(Object obj, long j13) {
            zdlpuopuiu.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(obj, j13);
            if (zoijcleaowVarGxszxtbevo.isModifiable()) {
                return zoijcleaowVarGxszxtbevo;
            }
            int size = zoijcleaowVarGxszxtbevo.size();
            zdlpuopuiu.zoijcleaow zoijcleaowVarMutableCopyWithCapacity = zoijcleaowVarGxszxtbevo.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            metgxyhuhe.dsvhmnatus(obj, j13, zoijcleaowVarMutableCopyWithCapacity);
            return zoijcleaowVarMutableCopyWithCapacity;
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        void ppxfxbqfkf(Object obj, long j13) {
            gxszxtbevo(obj, j13).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        void wkgbmnqykc(Object obj, Object obj2, long j13) {
            zdlpuopuiu.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(obj, j13);
            zdlpuopuiu.zoijcleaow zoijcleaowVarGxszxtbevo2 = gxszxtbevo(obj2, j13);
            int size = zoijcleaowVarGxszxtbevo.size();
            int size2 = zoijcleaowVarGxszxtbevo2.size();
            if (size > 0 && size2 > 0) {
                if (!zoijcleaowVarGxszxtbevo.isModifiable()) {
                    zoijcleaowVarGxszxtbevo = zoijcleaowVarGxszxtbevo.mutableCopyWithCapacity(size2 + size);
                }
                zoijcleaowVarGxszxtbevo.addAll(zoijcleaowVarGxszxtbevo2);
            }
            if (size > 0) {
                zoijcleaowVarGxszxtbevo2 = zoijcleaowVarGxszxtbevo;
            }
            metgxyhuhe.dsvhmnatus(obj, j13, zoijcleaowVarGxszxtbevo2);
        }
    }

    private static final class zoijcleaow extends esjtqupxsv {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Class f8638ppxfxbqfkf = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private zoijcleaow() {
            super();
        }

        static List gxszxtbevo(Object obj, long j13) {
            return (List) metgxyhuhe.pmvmpeiblj(obj, j13);
        }

        private static List lqeggnwhkg(Object obj, long j13, int i13) {
            List list;
            List listGxszxtbevo = gxszxtbevo(obj, j13);
            if (listGxszxtbevo.isEmpty()) {
                List iwizpuwonkVar = listGxszxtbevo instanceof cqumvgiudr ? new iwizpuwonk(i13) : new ArrayList(i13);
                metgxyhuhe.dsvhmnatus(obj, j13, iwizpuwonkVar);
                return iwizpuwonkVar;
            }
            if (f8638ppxfxbqfkf.isAssignableFrom(listGxszxtbevo.getClass())) {
                ArrayList arrayList = new ArrayList(listGxszxtbevo.size() + i13);
                arrayList.addAll(listGxszxtbevo);
                metgxyhuhe.dsvhmnatus(obj, j13, arrayList);
                list = arrayList;
            } else {
                if (!(listGxszxtbevo instanceof xrmfcynszj)) {
                    return listGxszxtbevo;
                }
                iwizpuwonk iwizpuwonkVar2 = new iwizpuwonk(listGxszxtbevo.size() + i13);
                iwizpuwonkVar2.addAll((xrmfcynszj) listGxszxtbevo);
                metgxyhuhe.dsvhmnatus(obj, j13, iwizpuwonkVar2);
                list = iwizpuwonkVar2;
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        List eablkybsjg(Object obj, long j13) {
            return lqeggnwhkg(obj, j13, 10);
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        void ppxfxbqfkf(Object obj, long j13) {
            Object objUnmodifiableList;
            List list = (List) metgxyhuhe.pmvmpeiblj(obj, j13);
            if (list instanceof cqumvgiudr) {
                objUnmodifiableList = ((cqumvgiudr) list).getUnmodifiableView();
            } else if (f8638ppxfxbqfkf.isAssignableFrom(list.getClass())) {
                return;
            } else {
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            metgxyhuhe.dsvhmnatus(obj, j13, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.esjtqupxsv
        void wkgbmnqykc(Object obj, Object obj2, long j13) {
            List listGxszxtbevo = gxszxtbevo(obj2, j13);
            List listLqeggnwhkg = lqeggnwhkg(obj, j13, listGxszxtbevo.size());
            int size = listLqeggnwhkg.size();
            int size2 = listGxszxtbevo.size();
            if (size > 0 && size2 > 0) {
                listLqeggnwhkg.addAll(listGxszxtbevo);
            }
            if (size > 0) {
                listGxszxtbevo = listLqeggnwhkg;
            }
            metgxyhuhe.dsvhmnatus(obj, j13, listGxszxtbevo);
        }
    }

    static {
        f8636iobyxmoadg = new zoijcleaow();
        f8637zoijcleaow = new ppxfxbqfkf();
    }

    static esjtqupxsv iobyxmoadg() {
        return f8636iobyxmoadg;
    }

    static esjtqupxsv zoijcleaow() {
        return f8637zoijcleaow;
    }

    abstract List eablkybsjg(Object obj, long j13);

    abstract void ppxfxbqfkf(Object obj, long j13);

    abstract void wkgbmnqykc(Object obj, Object obj2, long j13);

    private esjtqupxsv() {
    }
}
