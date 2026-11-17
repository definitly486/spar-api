package ixidwrxhsl;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends hg.gxszxtbevo implements Map, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f50004jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f50005yggfygwlhe;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f50003iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f50001cqumvgiudr = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final wkgbmnqykc f50002esjtqupxsv = new wkgbmnqykc(zdlpuopuiu.f50009eablkybsjg.iobyxmoadg(), 0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg() {
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f50002esjtqupxsv;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return wkgbmnqykcVar;
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, int i13) {
        this.f50005yggfygwlhe = zdlpuopuiuVar;
        this.f50004jyumaefscl = i13;
    }

    private final grlcpdaxtj.wkgbmnqykc ojitshcjhn() {
        return new agtfadlqog(this);
    }

    /* JADX INFO: renamed from: agtfadlqog */
    public gxszxtbevo nufgyqmvbu() {
        return new gxszxtbevo(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f50005yggfygwlhe.gtknphoqwx(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f50005yggfygwlhe.ojitshcjhn(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // hg.gxszxtbevo
    public int gxszxtbevo() {
        return this.f50004jyumaefscl;
    }

    public wkgbmnqykc kcexrzcfyt(Object obj, Object obj2) {
        zdlpuopuiu.zoijcleaow zoijcleaowVarWypolnanlu = this.f50005yggfygwlhe.wypolnanlu(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return zoijcleaowVarWypolnanlu == null ? this : new wkgbmnqykc(zoijcleaowVarWypolnanlu.iobyxmoadg(), size() + zoijcleaowVarWypolnanlu.zoijcleaow());
    }

    @Override // hg.gxszxtbevo
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public grlcpdaxtj.zoijcleaow dxjokdxxww() {
        return new oxmwwwfdhm(this);
    }

    @Override // hg.gxszxtbevo
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public grlcpdaxtj.wkgbmnqykc eablkybsjg() {
        return new rgvfuqvkyq(this);
    }

    public final zdlpuopuiu vdvldrhtss() {
        return this.f50005yggfygwlhe;
    }

    @Override // hg.gxszxtbevo
    public final Set wkgbmnqykc() {
        return ojitshcjhn();
    }

    public wkgbmnqykc zdlpuopuiu(Object obj) {
        zdlpuopuiu zdlpuopuiuVarStevsuqkhv = this.f50005yggfygwlhe.stevsuqkhv(obj != null ? obj.hashCode() : 0, obj, 0);
        if (this.f50005yggfygwlhe == zdlpuopuiuVarStevsuqkhv) {
            return this;
        }
        return zdlpuopuiuVarStevsuqkhv == null ? f50003iwizpuwonk.iobyxmoadg() : new wkgbmnqykc(zdlpuopuiuVarStevsuqkhv, size() - 1);
    }
}
