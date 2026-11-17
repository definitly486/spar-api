package y8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f124054iobyxmoadg = new ArrayList();

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Class f124055iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final eablkybsjg f124056ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Class f124057zoijcleaow;

        iobyxmoadg(Class cls, Class cls2, eablkybsjg eablkybsjgVar) {
            this.f124055iobyxmoadg = cls;
            this.f124057zoijcleaow = cls2;
            this.f124056ppxfxbqfkf = eablkybsjgVar;
        }

        public boolean iobyxmoadg(Class cls, Class cls2) {
            return this.f124055iobyxmoadg.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f124057zoijcleaow);
        }
    }

    public synchronized eablkybsjg iobyxmoadg(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return lqeggnwhkg.zoijcleaow();
        }
        for (iobyxmoadg iobyxmoadgVar : this.f124054iobyxmoadg) {
            if (iobyxmoadgVar.iobyxmoadg(cls, cls2)) {
                return iobyxmoadgVar.f124056ppxfxbqfkf;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized void ppxfxbqfkf(Class cls, Class cls2, eablkybsjg eablkybsjgVar) {
        this.f124054iobyxmoadg.add(new iobyxmoadg(cls, cls2, eablkybsjgVar));
    }

    public synchronized List zoijcleaow(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (iobyxmoadg iobyxmoadgVar : this.f124054iobyxmoadg) {
            if (iobyxmoadgVar.iobyxmoadg(cls, cls2) && !arrayList.contains(iobyxmoadgVar.f124057zoijcleaow)) {
                arrayList.add(iobyxmoadgVar.f124057zoijcleaow);
            }
        }
        return arrayList;
    }
}
