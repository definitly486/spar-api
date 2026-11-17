package ixidwrxhsl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends zoijcleaow implements Map.Entry, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object f49998iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dxjokdxxww f49999jyumaefscl;

    public ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f49999jyumaefscl = dxjokdxxwwVar;
        this.f49998iwizpuwonk = obj2;
    }

    @Override // ixidwrxhsl.zoijcleaow, java.util.Map.Entry
    public Object getValue() {
        return this.f49998iwizpuwonk;
    }

    public void iobyxmoadg(Object obj) {
        this.f49998iwizpuwonk = obj;
    }

    @Override // ixidwrxhsl.zoijcleaow, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        iobyxmoadg(obj);
        this.f49999jyumaefscl.zoijcleaow(getKey(), obj);
        return value;
    }
}
