package ixidwrxhsl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f49981zdlpuopuiu;

    public dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe[] yggfygwlheVarArr = new yggfygwlhe[8];
        for (int i13 = 0; i13 < 8; i13++) {
            yggfygwlheVarArr[i13] = new esjtqupxsv(this);
        }
        this.f49981zdlpuopuiu = new lqeggnwhkg(gxszxtbevoVar, yggfygwlheVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49981zdlpuopuiu.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f49981zdlpuopuiu.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f49981zdlpuopuiu.remove();
    }

    public final void zoijcleaow(Object obj, Object obj2) {
        this.f49981zdlpuopuiu.draadjrbmk(obj, obj2);
    }
}
