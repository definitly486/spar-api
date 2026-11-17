package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f21001iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f21002zoijcleaow = new HashMap();

    rgvfuqvkyq() {
    }

    private Map zoijcleaow(boolean z13) {
        return z13 ? this.f21002zoijcleaow : this.f21001iobyxmoadg;
    }

    gtknphoqwx iobyxmoadg(l8.eablkybsjg eablkybsjgVar, boolean z13) {
        return (gtknphoqwx) zoijcleaow(z13).get(eablkybsjgVar);
    }

    void ppxfxbqfkf(l8.eablkybsjg eablkybsjgVar, gtknphoqwx gtknphoqwxVar) {
        zoijcleaow(gtknphoqwxVar.rgvfuqvkyq()).put(eablkybsjgVar, gtknphoqwxVar);
    }

    void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, gtknphoqwx gtknphoqwxVar) {
        Map mapZoijcleaow = zoijcleaow(gtknphoqwxVar.rgvfuqvkyq());
        if (gtknphoqwxVar.equals(mapZoijcleaow.get(eablkybsjgVar))) {
            mapZoijcleaow.remove(eablkybsjgVar);
        }
    }
}
