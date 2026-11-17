package androidx.compose.material;

import hg.jyumaefscl;
import igdgnonuha.lrnfpwlwnk;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements lrnfpwlwnk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f5473iobyxmoadg;

    public eablkybsjg(Map map) {
        this.f5473iobyxmoadg = map;
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public float eablkybsjg(Object obj) {
        Float f13 = (Float) this.f5473iobyxmoadg.get(obj);
        if (f13 != null) {
            return f13.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eablkybsjg) {
            return zdlpuopuiu.eablkybsjg(this.f5473iobyxmoadg, ((eablkybsjg) obj).f5473iobyxmoadg);
        }
        return false;
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public int getSize() {
        return this.f5473iobyxmoadg.size();
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public float gxszxtbevo() {
        Float fFiwbwshyhd = jyumaefscl.fiwbwshyhd(this.f5473iobyxmoadg.values());
        if (fFiwbwshyhd != null) {
            return fFiwbwshyhd.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f5473iobyxmoadg.hashCode() * 31;
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public Object iobyxmoadg(float f13, boolean z13) {
        Object next;
        Iterator it = this.f5473iobyxmoadg.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f14 = z13 ? fFloatValue - f13 : f13 - fFloatValue;
                if (f14 < 0.0f) {
                    f14 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f15 = z13 ? fFloatValue2 - f13 : f13 - fFloatValue2;
                    if (f15 < 0.0f) {
                        f15 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f14, f15) > 0) {
                        next = next2;
                        f14 = f15;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public boolean ppxfxbqfkf(Object obj) {
        return this.f5473iobyxmoadg.containsKey(obj);
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f5473iobyxmoadg + ')';
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public float wkgbmnqykc() {
        Float fFyldjkxazc = jyumaefscl.fyldjkxazc(this.f5473iobyxmoadg.values());
        if (fFyldjkxazc != null) {
            return fFyldjkxazc.floatValue();
        }
        return Float.NaN;
    }

    @Override // igdgnonuha.lrnfpwlwnk
    public Object zoijcleaow(float f13) {
        Object next;
        Iterator it = this.f5473iobyxmoadg.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f13 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f13 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }
}
