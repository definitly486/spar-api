package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f21003iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f21004ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f21005wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final u1.eablkybsjg f21006zoijcleaow;

    public vdvldrhtss(Class cls, Class cls2, Class cls3, List list, u1.eablkybsjg eablkybsjgVar) {
        this.f21003iobyxmoadg = cls;
        this.f21006zoijcleaow = eablkybsjgVar;
        this.f21004ppxfxbqfkf = (List) g9.gtknphoqwx.wkgbmnqykc(list);
        this.f21005wkgbmnqykc = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private n8.ppxfxbqfkf zoijcleaow(com.bumptech.glide.load.data.eablkybsjg eablkybsjgVar, l8.lqeggnwhkg lqeggnwhkgVar, int i13, int i14, dxjokdxxww.iobyxmoadg iobyxmoadgVar, List list) throws GlideException {
        int size = this.f21004ppxfxbqfkf.size();
        n8.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = null;
        for (int i15 = 0; i15 < size; i15++) {
            try {
                ppxfxbqfkfVarIobyxmoadg = ((dxjokdxxww) this.f21004ppxfxbqfkf.get(i15)).iobyxmoadg(eablkybsjgVar, i13, i14, lqeggnwhkgVar, iobyxmoadgVar);
            } catch (GlideException e13) {
                list.add(e13);
            }
            if (ppxfxbqfkfVarIobyxmoadg != null) {
                break;
            }
        }
        if (ppxfxbqfkfVarIobyxmoadg != null) {
            return ppxfxbqfkfVarIobyxmoadg;
        }
        throw new GlideException(this.f21005wkgbmnqykc, new ArrayList(list));
    }

    public n8.ppxfxbqfkf iobyxmoadg(com.bumptech.glide.load.data.eablkybsjg eablkybsjgVar, l8.lqeggnwhkg lqeggnwhkgVar, int i13, int i14, dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        List list = (List) g9.gtknphoqwx.eablkybsjg((List) this.f21006zoijcleaow.zoijcleaow());
        try {
            return zoijcleaow(eablkybsjgVar, lqeggnwhkgVar, i13, i14, iobyxmoadgVar, list);
        } finally {
            this.f21006zoijcleaow.iobyxmoadg(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f21004ppxfxbqfkf.toArray()) + '}';
    }
}
