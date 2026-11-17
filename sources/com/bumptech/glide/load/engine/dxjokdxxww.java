package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f20836eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f20837iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y8.eablkybsjg f20838ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u1.eablkybsjg f20839wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f20840zoijcleaow;

    interface iobyxmoadg {
        n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar);
    }

    public dxjokdxxww(Class cls, Class cls2, Class cls3, List list, y8.eablkybsjg eablkybsjgVar, u1.eablkybsjg eablkybsjgVar2) {
        this.f20837iobyxmoadg = cls;
        this.f20840zoijcleaow = list;
        this.f20838ppxfxbqfkf = eablkybsjgVar;
        this.f20839wkgbmnqykc = eablkybsjgVar2;
        this.f20836eablkybsjg = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private n8.ppxfxbqfkf ppxfxbqfkf(com.bumptech.glide.load.data.eablkybsjg eablkybsjgVar, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar, List list) throws GlideException {
        int size = this.f20840zoijcleaow.size();
        n8.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = null;
        for (int i15 = 0; i15 < size; i15++) {
            l8.dxjokdxxww dxjokdxxwwVar = (l8.dxjokdxxww) this.f20840zoijcleaow.get(i15);
            try {
                if (dxjokdxxwwVar.iobyxmoadg(eablkybsjgVar.iobyxmoadg(), lqeggnwhkgVar)) {
                    ppxfxbqfkfVarZoijcleaow = dxjokdxxwwVar.zoijcleaow(eablkybsjgVar.iobyxmoadg(), i13, i14, lqeggnwhkgVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e13) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + dxjokdxxwwVar, e13);
                }
                list.add(e13);
            }
            if (ppxfxbqfkfVarZoijcleaow != null) {
                break;
            }
        }
        if (ppxfxbqfkfVarZoijcleaow != null) {
            return ppxfxbqfkfVarZoijcleaow;
        }
        throw new GlideException(this.f20836eablkybsjg, new ArrayList(list));
    }

    private n8.ppxfxbqfkf zoijcleaow(com.bumptech.glide.load.data.eablkybsjg eablkybsjgVar, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        List list = (List) g9.gtknphoqwx.eablkybsjg((List) this.f20839wkgbmnqykc.zoijcleaow());
        try {
            return ppxfxbqfkf(eablkybsjgVar, i13, i14, lqeggnwhkgVar, list);
        } finally {
            this.f20839wkgbmnqykc.iobyxmoadg(list);
        }
    }

    public n8.ppxfxbqfkf iobyxmoadg(com.bumptech.glide.load.data.eablkybsjg eablkybsjgVar, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
        return this.f20838ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(zoijcleaow(eablkybsjgVar, i13, i14, lqeggnwhkgVar)), lqeggnwhkgVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f20837iobyxmoadg + ", decoders=" + this.f20840zoijcleaow + ", transcoder=" + this.f20838ppxfxbqfkf + '}';
    }
}
