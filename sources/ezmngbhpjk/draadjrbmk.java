package ezmngbhpjk;

import androidx.compose.runtime.istkbnxepw;
import androidx.compose.runtime.jrbgnlbqoe;
import androidx.compose.runtime.n1;
import androidx.compose.runtime.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends ixidwrxhsl.wkgbmnqykc implements jrbgnlbqoe {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final zoijcleaow f32421lereixgezr = new zoijcleaow(null);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final int f32422pmvmpeiblj = 8;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final draadjrbmk f32423zynmafqrjb;

    public static final class iobyxmoadg extends ixidwrxhsl.gxszxtbevo implements jrbgnlbqoe.iobyxmoadg {

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private draadjrbmk f32424lereixgezr;

        public iobyxmoadg(draadjrbmk draadjrbmkVar) {
            super(draadjrbmkVar);
            this.f32424lereixgezr = draadjrbmkVar;
        }

        @Override // ixidwrxhsl.gxszxtbevo, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof istkbnxepw) {
                return rgvfuqvkyq((istkbnxepw) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof n1) {
                return vdvldrhtss((n1) obj);
            }
            return false;
        }

        @Override // ixidwrxhsl.gxszxtbevo, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof istkbnxepw) {
                return oxmwwwfdhm((istkbnxepw) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof istkbnxepw) ? obj2 : kcexrzcfyt((istkbnxepw) obj, (n1) obj2);
        }

        public /* bridge */ n1 kcexrzcfyt(istkbnxepw istkbnxepwVar, n1 n1Var) {
            return (n1) super.getOrDefault(istkbnxepwVar, n1Var);
        }

        @Override // ixidwrxhsl.gxszxtbevo
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public draadjrbmk eablkybsjg() {
            draadjrbmk draadjrbmkVar;
            if (dxjokdxxww() == this.f32424lereixgezr.vdvldrhtss()) {
                draadjrbmkVar = this.f32424lereixgezr;
            } else {
                wflxmlrfwp(new fmlbqenlif.eablkybsjg());
                draadjrbmkVar = new draadjrbmk(dxjokdxxww(), size());
            }
            this.f32424lereixgezr = draadjrbmkVar;
            return draadjrbmkVar;
        }

        public /* bridge */ n1 oxmwwwfdhm(istkbnxepw istkbnxepwVar) {
            return (n1) super.get(istkbnxepwVar);
        }

        @Override // ixidwrxhsl.gxszxtbevo, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof istkbnxepw) {
                return zdlpuopuiu((istkbnxepw) obj);
            }
            return null;
        }

        public /* bridge */ boolean rgvfuqvkyq(istkbnxepw istkbnxepwVar) {
            return super.containsKey(istkbnxepwVar);
        }

        public /* bridge */ boolean vdvldrhtss(n1 n1Var) {
            return super.containsValue(n1Var);
        }

        public /* bridge */ n1 zdlpuopuiu(istkbnxepw istkbnxepwVar) {
            return (n1) super.remove(istkbnxepwVar);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg() {
            return draadjrbmk.f32423zynmafqrjb;
        }

        private zoijcleaow() {
        }
    }

    static {
        ixidwrxhsl.zdlpuopuiu zdlpuopuiuVarIobyxmoadg = ixidwrxhsl.zdlpuopuiu.f50009eablkybsjg.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarIobyxmoadg, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f32423zynmafqrjb = new draadjrbmk(zdlpuopuiuVarIobyxmoadg, 0);
    }

    public draadjrbmk(ixidwrxhsl.zdlpuopuiu zdlpuopuiuVar, int i13) {
        super(zdlpuopuiuVar, i13);
    }

    @Override // ixidwrxhsl.wkgbmnqykc, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof istkbnxepw) {
            return cqumvgiudr((istkbnxepw) obj);
        }
        return false;
    }

    @Override // hg.gxszxtbevo, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof n1) {
            return esjtqupxsv((n1) obj);
        }
        return false;
    }

    public /* bridge */ boolean cqumvgiudr(istkbnxepw istkbnxepwVar) {
        return super.containsKey(istkbnxepwVar);
    }

    public /* bridge */ boolean esjtqupxsv(n1 n1Var) {
        return super.containsValue(n1Var);
    }

    @Override // ixidwrxhsl.wkgbmnqykc, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof istkbnxepw) {
            return lereixgezr((istkbnxepw) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof istkbnxepw) ? obj2 : pmvmpeiblj((istkbnxepw) obj, (n1) obj2);
    }

    @Override // androidx.compose.runtime.wwaezpbzkn
    public Object iobyxmoadg(istkbnxepw istkbnxepwVar) {
        return ylkuphrtab.zoijcleaow(this, istkbnxepwVar);
    }

    @Override // androidx.compose.runtime.jrbgnlbqoe
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public iobyxmoadg nufgyqmvbu() {
        return new iobyxmoadg(this);
    }

    public /* bridge */ n1 lereixgezr(istkbnxepw istkbnxepwVar) {
        return (n1) super.get(istkbnxepwVar);
    }

    public /* bridge */ n1 pmvmpeiblj(istkbnxepw istkbnxepwVar, n1 n1Var) {
        return (n1) super.getOrDefault(istkbnxepwVar, n1Var);
    }

    @Override // androidx.compose.runtime.jrbgnlbqoe
    public jrbgnlbqoe yadqdtsiqt(istkbnxepw istkbnxepwVar, n1 n1Var) {
        ixidwrxhsl.zdlpuopuiu.zoijcleaow zoijcleaowVarWypolnanlu = vdvldrhtss().wypolnanlu(istkbnxepwVar.hashCode(), istkbnxepwVar, n1Var, 0);
        return zoijcleaowVarWypolnanlu == null ? this : new draadjrbmk(zoijcleaowVarWypolnanlu.iobyxmoadg(), size() + zoijcleaowVarWypolnanlu.zoijcleaow());
    }
}
