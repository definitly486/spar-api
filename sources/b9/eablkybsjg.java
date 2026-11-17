package b9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l8.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15562iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f15563zoijcleaow = new HashMap();

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f15564iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final dxjokdxxww f15565ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Class f15566zoijcleaow;

        public iobyxmoadg(Class cls, Class cls2, dxjokdxxww dxjokdxxwwVar) {
            this.f15564iobyxmoadg = cls;
            this.f15566zoijcleaow = cls2;
            this.f15565ppxfxbqfkf = dxjokdxxwwVar;
        }

        public boolean iobyxmoadg(Class cls, Class cls2) {
            return this.f15564iobyxmoadg.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f15566zoijcleaow);
        }
    }

    private synchronized List ppxfxbqfkf(String str) {
        List arrayList;
        try {
            if (!this.f15562iobyxmoadg.contains(str)) {
                this.f15562iobyxmoadg.add(str);
            }
            arrayList = (List) this.f15563zoijcleaow.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f15563zoijcleaow.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void eablkybsjg(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f15562iobyxmoadg);
            this.f15562iobyxmoadg.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15562iobyxmoadg.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f15562iobyxmoadg.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void iobyxmoadg(String str, dxjokdxxww dxjokdxxwwVar, Class cls, Class cls2) {
        ppxfxbqfkf(str).add(new iobyxmoadg(cls, cls2, dxjokdxxwwVar));
    }

    public synchronized List wkgbmnqykc(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f15562iobyxmoadg.iterator();
        while (it.hasNext()) {
            List<iobyxmoadg> list = (List) this.f15563zoijcleaow.get((String) it.next());
            if (list != null) {
                for (iobyxmoadg iobyxmoadgVar : list) {
                    if (iobyxmoadgVar.iobyxmoadg(cls, cls2) && !arrayList.contains(iobyxmoadgVar.f15566zoijcleaow)) {
                        arrayList.add(iobyxmoadgVar.f15566zoijcleaow);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List zoijcleaow(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f15562iobyxmoadg.iterator();
        while (it.hasNext()) {
            List<iobyxmoadg> list = (List) this.f15563zoijcleaow.get((String) it.next());
            if (list != null) {
                for (iobyxmoadg iobyxmoadgVar : list) {
                    if (iobyxmoadgVar.iobyxmoadg(cls, cls2)) {
                        arrayList.add(iobyxmoadgVar.f15565ppxfxbqfkf);
                    }
                }
            }
        }
        return arrayList;
    }
}
