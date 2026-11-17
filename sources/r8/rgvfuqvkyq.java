package r8;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f82096iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f82097zoijcleaow;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f82098iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: r8.rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C1832iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final List f82099iobyxmoadg;

            public C1832iobyxmoadg(List list) {
                this.f82099iobyxmoadg = list;
            }
        }

        iobyxmoadg() {
        }

        public void iobyxmoadg() {
            this.f82098iobyxmoadg.clear();
        }

        public void ppxfxbqfkf(Class cls, List list) {
            if (((C1832iobyxmoadg) this.f82098iobyxmoadg.put(cls, new C1832iobyxmoadg(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }

        public List zoijcleaow(Class cls) {
            C1832iobyxmoadg c1832iobyxmoadg = (C1832iobyxmoadg) this.f82098iobyxmoadg.get(cls);
            if (c1832iobyxmoadg == null) {
                return null;
            }
            return c1832iobyxmoadg.f82099iobyxmoadg;
        }
    }

    public rgvfuqvkyq(u1.eablkybsjg eablkybsjgVar) {
        this(new oxmwwwfdhm(eablkybsjgVar));
    }

    private synchronized List eablkybsjg(Class cls) {
        List listZoijcleaow;
        listZoijcleaow = this.f82097zoijcleaow.zoijcleaow(cls);
        if (listZoijcleaow == null) {
            listZoijcleaow = Collections.unmodifiableList(this.f82096iobyxmoadg.ppxfxbqfkf(cls));
            this.f82097zoijcleaow.ppxfxbqfkf(cls, listZoijcleaow);
        }
        return listZoijcleaow;
    }

    private void nufgyqmvbu(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ojitshcjhn) it.next()).eablkybsjg();
        }
    }

    private static Class zoijcleaow(Object obj) {
        return obj.getClass();
    }

    public synchronized void gxszxtbevo(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        this.f82096iobyxmoadg.dxjokdxxww(cls, cls2, ojitshcjhnVar);
        this.f82097zoijcleaow.iobyxmoadg();
    }

    public synchronized void iobyxmoadg(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        this.f82096iobyxmoadg.zoijcleaow(cls, cls2, ojitshcjhnVar);
        this.f82097zoijcleaow.iobyxmoadg();
    }

    public synchronized void lqeggnwhkg(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        nufgyqmvbu(this.f82096iobyxmoadg.gtknphoqwx(cls, cls2, ojitshcjhnVar));
        this.f82097zoijcleaow.iobyxmoadg();
    }

    public synchronized List ppxfxbqfkf(Class cls) {
        return this.f82096iobyxmoadg.lqeggnwhkg(cls);
    }

    public List wkgbmnqykc(Object obj) {
        List listEablkybsjg = eablkybsjg(zoijcleaow(obj));
        if (listEablkybsjg.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listEablkybsjg.size();
        List listEmptyList = Collections.emptyList();
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            agtfadlqog agtfadlqogVar = (agtfadlqog) listEablkybsjg.get(i13);
            if (agtfadlqogVar.iobyxmoadg(obj)) {
                if (z13) {
                    listEmptyList = new ArrayList(size - i13);
                    z13 = false;
                }
                listEmptyList.add(agtfadlqogVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listEablkybsjg);
        }
        return listEmptyList;
    }

    private rgvfuqvkyq(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f82097zoijcleaow = new iobyxmoadg();
        this.f82096iobyxmoadg = oxmwwwfdhmVar;
    }
}
