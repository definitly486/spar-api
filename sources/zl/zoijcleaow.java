package zl;

import java.util.Iterator;
import xl.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow extends nufgyqmvbu {
    public zoijcleaow() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public wflxmlrfwp set(int i13, wflxmlrfwp wflxmlrfwpVar) {
        return (wflxmlrfwp) super.set(i13, wflxmlrfwpVar);
    }

    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public zoijcleaow clone() {
        zoijcleaow zoijcleaowVar = new zoijcleaow(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            zoijcleaowVar.add(((wflxmlrfwp) it.next()).clone());
        }
        return zoijcleaowVar;
    }

    @Override // zl.nufgyqmvbu
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public wflxmlrfwp wkgbmnqykc(int i13) {
        return (wflxmlrfwp) super.wkgbmnqykc(i13);
    }

    @Override // zl.nufgyqmvbu
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public zoijcleaow draadjrbmk() {
        super.draadjrbmk();
        return this;
    }

    public zoijcleaow zdlpuopuiu(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((wflxmlrfwp) it.next()).p(str);
        }
        return this;
    }

    public zoijcleaow(int i13) {
        super(i13);
    }
}
