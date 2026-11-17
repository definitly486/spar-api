package mz0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f68195iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            try {
                iArr[ppxfxbqfkf.VIVINO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f68195iobyxmoadg = iArr;
        }
    }

    public static final List iobyxmoadg(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        ng.iobyxmoadg iobyxmoadgVarWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iobyxmoadgVarWkgbmnqykc) {
            if (((ppxfxbqfkf) obj) != ppxfxbqfkf.VIVINO) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar == null ? ppxfxbqfkf.POPULAR : ppxfxbqfkfVar;
    }

    public static final List wkgbmnqykc(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        for (ppxfxbqfkf ppxfxbqfkfVar2 : ppxfxbqfkf.wkgbmnqykc()) {
            if (iobyxmoadg.f68195iobyxmoadg[ppxfxbqfkfVar2.ordinal()] != 1) {
                listPpxfxbqfkf.add(ppxfxbqfkfVar2);
            } else if (ppxfxbqfkfVar == ppxfxbqfkf.VIVINO) {
                listPpxfxbqfkf.add(ppxfxbqfkfVar2);
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    public static final ppxfxbqfkf zoijcleaow(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, String str) {
        Object next;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        Iterator<E> it = ppxfxbqfkf.wkgbmnqykc().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).lqeggnwhkg(), str)) {
                return (ppxfxbqfkf) next;
            }
        }
        next = null;
        return (ppxfxbqfkf) next;
    }
}
