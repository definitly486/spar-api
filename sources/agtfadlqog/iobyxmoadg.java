package agtfadlqog;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final HashMap f1862cqumvgiudr = new HashMap();

    public Map.Entry btonecajqb(Object obj) {
        if (contains(obj)) {
            return ((zoijcleaow.ppxfxbqfkf) this.f1862cqumvgiudr.get(obj)).f1869iwizpuwonk;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.f1862cqumvgiudr.containsKey(obj);
    }

    @Override // agtfadlqog.zoijcleaow
    public Object dxjokdxxww(Object obj) {
        Object objDxjokdxxww = super.dxjokdxxww(obj);
        this.f1862cqumvgiudr.remove(obj);
        return objDxjokdxxww;
    }

    @Override // agtfadlqog.zoijcleaow
    public Object gxszxtbevo(Object obj, Object obj2) {
        zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaow(obj);
        if (ppxfxbqfkfVarZoijcleaow != null) {
            return ppxfxbqfkfVarZoijcleaow.f1871yggfygwlhe;
        }
        this.f1862cqumvgiudr.put(obj, eablkybsjg(obj, obj2));
        return null;
    }

    @Override // agtfadlqog.zoijcleaow
    protected zoijcleaow.ppxfxbqfkf zoijcleaow(Object obj) {
        return (zoijcleaow.ppxfxbqfkf) this.f1862cqumvgiudr.get(obj);
    }
}
