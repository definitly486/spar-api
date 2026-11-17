package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f20505iobyxmoadg = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f20508zoijcleaow = new androidx.collection.zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f20506ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Comparator f20507wkgbmnqykc = new iobyxmoadg();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(u1.ppxfxbqfkf ppxfxbqfkfVar, u1.ppxfxbqfkf ppxfxbqfkfVar2) {
            float fFloatValue = ((Float) ppxfxbqfkfVar.f112468zoijcleaow).floatValue();
            float fFloatValue2 = ((Float) ppxfxbqfkfVar2.f112468zoijcleaow).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void iobyxmoadg(String str, float f13) {
        if (this.f20505iobyxmoadg) {
            v7.nufgyqmvbu nufgyqmvbuVar = (v7.nufgyqmvbu) this.f20506ppxfxbqfkf.get(str);
            if (nufgyqmvbuVar == null) {
                nufgyqmvbuVar = new v7.nufgyqmvbu();
                this.f20506ppxfxbqfkf.put(str, nufgyqmvbuVar);
            }
            nufgyqmvbuVar.iobyxmoadg(f13);
            if (str.equals("__container")) {
                Iterator it = this.f20508zoijcleaow.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
                    throw null;
                }
            }
        }
    }

    void zoijcleaow(boolean z13) {
        this.f20505iobyxmoadg = z13;
    }
}
