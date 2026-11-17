package l7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61736iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f61737ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f61738zoijcleaow;

    public nufgyqmvbu(List list) {
        this.f61737ppxfxbqfkf = list;
        this.f61736iobyxmoadg = new ArrayList(list.size());
        this.f61738zoijcleaow = new ArrayList(list.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f61736iobyxmoadg.add(((q7.dxjokdxxww) list.get(i13)).zoijcleaow().eablkybsjg());
            this.f61738zoijcleaow.add(((q7.dxjokdxxww) list.get(i13)).ppxfxbqfkf().eablkybsjg());
        }
    }

    public List iobyxmoadg() {
        return this.f61736iobyxmoadg;
    }

    public List ppxfxbqfkf() {
        return this.f61738zoijcleaow;
    }

    public List zoijcleaow() {
        return this.f61737ppxfxbqfkf;
    }
}
