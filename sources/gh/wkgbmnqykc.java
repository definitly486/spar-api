package gh;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f37385iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f37386zoijcleaow;

    static {
        Set set = draadjrbmk.f37198esjtqupxsv;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(ojitshcjhn.ppxfxbqfkf((draadjrbmk) it.next()));
        }
        List listJrbgnlbqoe = jyumaefscl.jrbgnlbqoe(jyumaefscl.jrbgnlbqoe(jyumaefscl.jrbgnlbqoe(arrayList, ojitshcjhn.iobyxmoadg.f37324nufgyqmvbu.draadjrbmk()), ojitshcjhn.iobyxmoadg.f37277btonecajqb.draadjrbmk()), ojitshcjhn.iobyxmoadg.f37313kcexrzcfyt.draadjrbmk());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        Iterator it2 = listJrbgnlbqoe.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(iobyxmoadgVar.ppxfxbqfkf((ii.ppxfxbqfkf) it2.next()));
        }
        f37386zoijcleaow = linkedHashSet;
    }

    private wkgbmnqykc() {
    }

    public final Set iobyxmoadg() {
        return f37386zoijcleaow;
    }

    public final Set zoijcleaow() {
        return f37386zoijcleaow;
    }
}
