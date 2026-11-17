package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final istkbnxepw f23931iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final istkbnxepw f23932zoijcleaow;

    private static final class ppxfxbqfkf extends istkbnxepw {
        private ppxfxbqfkf() {
            super();
        }

        static esjtqupxsv.wkgbmnqykc gxszxtbevo(Object obj, long j13) {
            return (esjtqupxsv.wkgbmnqykc) yfnezrywwk.istkbnxepw(obj, j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
        List eablkybsjg(Object obj, long j13) {
            esjtqupxsv.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(obj, j13);
            if (wkgbmnqykcVarGxszxtbevo.isModifiable()) {
                return wkgbmnqykcVarGxszxtbevo;
            }
            int size = wkgbmnqykcVarGxszxtbevo.size();
            esjtqupxsv.wkgbmnqykc wkgbmnqykcVarMutableCopyWithCapacity = wkgbmnqykcVarGxszxtbevo.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            yfnezrywwk.kegysxyocb(obj, j13, wkgbmnqykcVarMutableCopyWithCapacity);
            return wkgbmnqykcVarMutableCopyWithCapacity;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
        void ppxfxbqfkf(Object obj, long j13) {
            gxszxtbevo(obj, j13).makeImmutable();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
        void wkgbmnqykc(Object obj, Object obj2, long j13) {
            esjtqupxsv.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(obj, j13);
            esjtqupxsv.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = gxszxtbevo(obj2, j13);
            int size = wkgbmnqykcVarGxszxtbevo.size();
            int size2 = wkgbmnqykcVarGxszxtbevo2.size();
            if (size > 0 && size2 > 0) {
                if (!wkgbmnqykcVarGxszxtbevo.isModifiable()) {
                    wkgbmnqykcVarGxszxtbevo = wkgbmnqykcVarGxszxtbevo.mutableCopyWithCapacity(size2 + size);
                }
                wkgbmnqykcVarGxszxtbevo.addAll(wkgbmnqykcVarGxszxtbevo2);
            }
            if (size > 0) {
                wkgbmnqykcVarGxszxtbevo2 = wkgbmnqykcVarGxszxtbevo;
            }
            yfnezrywwk.kegysxyocb(obj, j13, wkgbmnqykcVarGxszxtbevo2);
        }
    }

    private static final class zoijcleaow extends istkbnxepw {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Class f23933ppxfxbqfkf = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private zoijcleaow() {
            super();
        }

        static List gxszxtbevo(Object obj, long j13) {
            return (List) yfnezrywwk.istkbnxepw(obj, j13);
        }

        private static List lqeggnwhkg(Object obj, long j13, int i13) {
            List list;
            List listMutableCopyWithCapacity;
            List listGxszxtbevo = gxszxtbevo(obj, j13);
            if (listGxszxtbevo.isEmpty()) {
                if (listGxszxtbevo instanceof zynmafqrjb) {
                    listMutableCopyWithCapacity = new pmvmpeiblj(i13);
                } else {
                    listMutableCopyWithCapacity = ((listGxszxtbevo instanceof ulzqkzuiru) && (listGxszxtbevo instanceof esjtqupxsv.wkgbmnqykc)) ? ((esjtqupxsv.wkgbmnqykc) listGxszxtbevo).mutableCopyWithCapacity(i13) : new ArrayList(i13);
                }
                yfnezrywwk.kegysxyocb(obj, j13, listMutableCopyWithCapacity);
                return listMutableCopyWithCapacity;
            }
            if (f23933ppxfxbqfkf.isAssignableFrom(listGxszxtbevo.getClass())) {
                ArrayList arrayList = new ArrayList(listGxszxtbevo.size() + i13);
                arrayList.addAll(listGxszxtbevo);
                yfnezrywwk.kegysxyocb(obj, j13, arrayList);
                list = arrayList;
            } else {
                if (!(listGxszxtbevo instanceof uwvvkdfqfp)) {
                    if (!(listGxszxtbevo instanceof ulzqkzuiru) || !(listGxszxtbevo instanceof esjtqupxsv.wkgbmnqykc)) {
                        return listGxszxtbevo;
                    }
                    esjtqupxsv.wkgbmnqykc wkgbmnqykcVar = (esjtqupxsv.wkgbmnqykc) listGxszxtbevo;
                    if (wkgbmnqykcVar.isModifiable()) {
                        return listGxszxtbevo;
                    }
                    esjtqupxsv.wkgbmnqykc wkgbmnqykcVarMutableCopyWithCapacity = wkgbmnqykcVar.mutableCopyWithCapacity(listGxszxtbevo.size() + i13);
                    yfnezrywwk.kegysxyocb(obj, j13, wkgbmnqykcVarMutableCopyWithCapacity);
                    return wkgbmnqykcVarMutableCopyWithCapacity;
                }
                pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj(listGxszxtbevo.size() + i13);
                pmvmpeibljVar.addAll((uwvvkdfqfp) listGxszxtbevo);
                yfnezrywwk.kegysxyocb(obj, j13, pmvmpeibljVar);
                list = pmvmpeibljVar;
            }
            return list;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
        List eablkybsjg(Object obj, long j13) {
            return lqeggnwhkg(obj, j13, 10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
        void ppxfxbqfkf(Object obj, long j13) {
            Object objUnmodifiableList;
            List list = (List) yfnezrywwk.istkbnxepw(obj, j13);
            if (list instanceof zynmafqrjb) {
                objUnmodifiableList = ((zynmafqrjb) list).getUnmodifiableView();
            } else {
                if (f23933ppxfxbqfkf.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof ulzqkzuiru) && (list instanceof esjtqupxsv.wkgbmnqykc)) {
                    esjtqupxsv.wkgbmnqykc wkgbmnqykcVar = (esjtqupxsv.wkgbmnqykc) list;
                    if (wkgbmnqykcVar.isModifiable()) {
                        wkgbmnqykcVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            yfnezrywwk.kegysxyocb(obj, j13, objUnmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.istkbnxepw
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
            yfnezrywwk.kegysxyocb(obj, j13, listGxszxtbevo);
        }
    }

    static {
        f23931iobyxmoadg = new zoijcleaow();
        f23932zoijcleaow = new ppxfxbqfkf();
    }

    static istkbnxepw iobyxmoadg() {
        return f23931iobyxmoadg;
    }

    static istkbnxepw zoijcleaow() {
        return f23932zoijcleaow;
    }

    abstract List eablkybsjg(Object obj, long j13);

    abstract void ppxfxbqfkf(Object obj, long j13);

    abstract void wkgbmnqykc(Object obj, Object obj2, long j13);

    private istkbnxepw() {
    }
}
