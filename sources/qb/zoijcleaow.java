package qb;

import android.content.Context;
import androidx.appcompat.app.yggfygwlhe;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.zoijcleaow f78382iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Integer f78383ppxfxbqfkf = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f78384zoijcleaow;

    public zoijcleaow(Context context, tc.zoijcleaow zoijcleaowVar, String str) {
        this.f78382iobyxmoadg = zoijcleaowVar;
        this.f78384zoijcleaow = str;
    }

    private void agtfadlqog(List list) throws AbtException {
        if (list.isEmpty()) {
            btonecajqb();
            return;
        }
        List listEablkybsjg = eablkybsjg();
        draadjrbmk(nufgyqmvbu(listEablkybsjg, list));
        zoijcleaow(lqeggnwhkg(list, listEablkybsjg));
    }

    private void draadjrbmk(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gtknphoqwx(((sb.iobyxmoadg.ppxfxbqfkf) it.next()).f105949zoijcleaow);
        }
    }

    private int dxjokdxxww() {
        Integer num = this.f78383ppxfxbqfkf;
        if (num != null) {
            return num.intValue();
        }
        yggfygwlhe.iobyxmoadg(this.f78382iobyxmoadg.get());
        throw null;
    }

    private void gtknphoqwx(String str) {
        yggfygwlhe.iobyxmoadg(this.f78382iobyxmoadg.get());
        throw null;
    }

    private List gxszxtbevo() {
        yggfygwlhe.iobyxmoadg(this.f78382iobyxmoadg.get());
        throw null;
    }

    private void iobyxmoadg(sb.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar) {
        yggfygwlhe.iobyxmoadg(this.f78382iobyxmoadg.get());
        throw null;
    }

    private ArrayList lqeggnwhkg(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            if (!wkgbmnqykc(list2, iobyxmoadgVar)) {
                arrayList.add(iobyxmoadgVar);
            }
        }
        return arrayList;
    }

    private ArrayList nufgyqmvbu(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            if (!wkgbmnqykc(list2, iobyxmoadgVar)) {
                arrayList.add(iobyxmoadgVar.gxszxtbevo(this.f78384zoijcleaow));
            }
        }
        return arrayList;
    }

    private void ojitshcjhn() throws AbtException {
        if (this.f78382iobyxmoadg.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private static List ppxfxbqfkf(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg.zoijcleaow((Map) it.next()));
        }
        return arrayList;
    }

    private boolean wkgbmnqykc(List list, iobyxmoadg iobyxmoadgVar) {
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strEablkybsjg = iobyxmoadgVar.eablkybsjg();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) it.next();
            if (iobyxmoadgVar2.ppxfxbqfkf().equals(strPpxfxbqfkf) && iobyxmoadgVar2.eablkybsjg().equals(strEablkybsjg)) {
                return true;
            }
        }
        return false;
    }

    private void zoijcleaow(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(gxszxtbevo());
        int iDxjokdxxww = dxjokdxxww();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            while (arrayDeque.size() >= iDxjokdxxww) {
                gtknphoqwx(((sb.iobyxmoadg.ppxfxbqfkf) arrayDeque.pollFirst()).f105949zoijcleaow);
            }
            sb.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(this.f78384zoijcleaow);
            iobyxmoadg(ppxfxbqfkfVarGxszxtbevo);
            arrayDeque.offer(ppxfxbqfkfVarGxszxtbevo);
        }
    }

    public void btonecajqb() throws AbtException {
        ojitshcjhn();
        draadjrbmk(gxszxtbevo());
    }

    public List eablkybsjg() throws AbtException {
        ojitshcjhn();
        List listGxszxtbevo = gxszxtbevo();
        ArrayList arrayList = new ArrayList();
        Iterator it = listGxszxtbevo.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg.iobyxmoadg((sb.iobyxmoadg.ppxfxbqfkf) it.next()));
        }
        return arrayList;
    }

    public void wflxmlrfwp(List list) throws AbtException {
        ojitshcjhn();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        agtfadlqog(ppxfxbqfkf(list));
    }
}
