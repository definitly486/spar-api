package aj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.jpowsppfya;
import zi.ntlheqmsrt;
import zi.ulzqkzuiru;
import zi.yadqdtsiqt;
import zi.ylkuphrtab;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static final grlcpdaxtj iobyxmoadg(Collection types) {
        ikoacuggdj ikoacuggdjVarEslsurpljm;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (grlcpdaxtj) hg.jyumaefscl.rhgxfdycjh(types);
        }
        Collection<grlcpdaxtj> collection = types;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
        boolean z13 = false;
        boolean z14 = false;
        for (grlcpdaxtj grlcpdaxtjVar : collection) {
            z13 = z13 || ulzqkzuiru.iobyxmoadg(grlcpdaxtjVar);
            if (grlcpdaxtjVar instanceof ikoacuggdj) {
                ikoacuggdjVarEslsurpljm = (ikoacuggdj) grlcpdaxtjVar;
            } else {
                if (!(grlcpdaxtjVar instanceof ylkuphrtab)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (yadqdtsiqt.iobyxmoadg(grlcpdaxtjVar)) {
                    return grlcpdaxtjVar;
                }
                ikoacuggdjVarEslsurpljm = ((ylkuphrtab) grlcpdaxtjVar).eslsurpljm();
                z14 = true;
            }
            arrayList.add(ikoacuggdjVarEslsurpljm);
        }
        if (z13) {
            return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16467jrbgnlbqoe, types.toString());
        }
        if (!z14) {
            return lereixgezr.f2060iobyxmoadg.wkgbmnqykc(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(jpowsppfya.wkgbmnqykc((grlcpdaxtj) it.next()));
        }
        lereixgezr lereixgezrVar = lereixgezr.f2060iobyxmoadg;
        return ntlheqmsrt.eablkybsjg(lereixgezrVar.wkgbmnqykc(arrayList), lereixgezrVar.wkgbmnqykc(arrayList2));
    }
}
