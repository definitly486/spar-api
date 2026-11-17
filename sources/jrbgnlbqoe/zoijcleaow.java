package jrbgnlbqoe;

import grlcpdaxtj.gxszxtbevo;
import hg.gtknphoqwx;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends gtknphoqwx implements gxszxtbevo {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f52251cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f52252esjtqupxsv = 8;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final zoijcleaow f52253lereixgezr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ixidwrxhsl.wkgbmnqykc f52254iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f52255jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f52256yggfygwlhe;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg() {
            return zoijcleaow.f52253lereixgezr;
        }

        private iobyxmoadg() {
        }
    }

    static {
        fmlbqenlif.ppxfxbqfkf ppxfxbqfkfVar = fmlbqenlif.ppxfxbqfkf.f34414iobyxmoadg;
        f52253lereixgezr = new zoijcleaow(ppxfxbqfkfVar, ppxfxbqfkfVar, ixidwrxhsl.wkgbmnqykc.f50003iwizpuwonk.iobyxmoadg());
    }

    public zoijcleaow(Object obj, Object obj2, ixidwrxhsl.wkgbmnqykc wkgbmnqykcVar) {
        this.f52256yggfygwlhe = obj;
        this.f52255jyumaefscl = obj2;
        this.f52254iwizpuwonk = wkgbmnqykcVar;
    }

    @Override // java.util.Collection, java.util.Set, grlcpdaxtj.gxszxtbevo
    public gxszxtbevo add(Object obj) {
        if (this.f52254iwizpuwonk.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new zoijcleaow(obj, obj, this.f52254iwizpuwonk.kcexrzcfyt(obj, new jrbgnlbqoe.iobyxmoadg()));
        }
        Object obj2 = this.f52255jyumaefscl;
        Object obj3 = this.f52254iwizpuwonk.get(obj2);
        zdlpuopuiu.lqeggnwhkg(obj3);
        return new zoijcleaow(this.f52256yggfygwlhe, obj, this.f52254iwizpuwonk.kcexrzcfyt(obj2, ((jrbgnlbqoe.iobyxmoadg) obj3).eablkybsjg(obj)).kcexrzcfyt(obj, new jrbgnlbqoe.iobyxmoadg(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, grlcpdaxtj.gxszxtbevo
    public gxszxtbevo addAll(Collection collection) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVarNufgyqmvbu = nufgyqmvbu();
        iobyxmoadgVarNufgyqmvbu.addAll(collection);
        return iobyxmoadgVarNufgyqmvbu.build();
    }

    public final ixidwrxhsl.wkgbmnqykc agtfadlqog() {
        return this.f52254iwizpuwonk;
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f52254iwizpuwonk.containsKey(obj);
    }

    public final Object draadjrbmk() {
        return this.f52256yggfygwlhe;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new wkgbmnqykc(this.f52256yggfygwlhe, this.f52254iwizpuwonk);
    }

    @Override // grlcpdaxtj.gxszxtbevo
    public gxszxtbevo.iobyxmoadg nufgyqmvbu() {
        return new ppxfxbqfkf(this);
    }

    public final Object ojitshcjhn() {
        return this.f52255jyumaefscl;
    }

    @Override // java.util.Collection, java.util.Set, grlcpdaxtj.gxszxtbevo
    public gxszxtbevo remove(Object obj) {
        jrbgnlbqoe.iobyxmoadg iobyxmoadgVar = (jrbgnlbqoe.iobyxmoadg) this.f52254iwizpuwonk.get(obj);
        if (iobyxmoadgVar == null) {
            return this;
        }
        ixidwrxhsl.wkgbmnqykc wkgbmnqykcVarZdlpuopuiu = this.f52254iwizpuwonk.zdlpuopuiu(obj);
        if (iobyxmoadgVar.zoijcleaow()) {
            Object obj2 = wkgbmnqykcVarZdlpuopuiu.get(iobyxmoadgVar.wkgbmnqykc());
            zdlpuopuiu.lqeggnwhkg(obj2);
            wkgbmnqykcVarZdlpuopuiu = wkgbmnqykcVarZdlpuopuiu.kcexrzcfyt(iobyxmoadgVar.wkgbmnqykc(), ((jrbgnlbqoe.iobyxmoadg) obj2).eablkybsjg(iobyxmoadgVar.ppxfxbqfkf()));
        }
        if (iobyxmoadgVar.iobyxmoadg()) {
            Object obj3 = wkgbmnqykcVarZdlpuopuiu.get(iobyxmoadgVar.ppxfxbqfkf());
            zdlpuopuiu.lqeggnwhkg(obj3);
            wkgbmnqykcVarZdlpuopuiu = wkgbmnqykcVarZdlpuopuiu.kcexrzcfyt(iobyxmoadgVar.ppxfxbqfkf(), ((jrbgnlbqoe.iobyxmoadg) obj3).gxszxtbevo(iobyxmoadgVar.wkgbmnqykc()));
        }
        return new zoijcleaow(!iobyxmoadgVar.zoijcleaow() ? iobyxmoadgVar.ppxfxbqfkf() : this.f52256yggfygwlhe, !iobyxmoadgVar.iobyxmoadg() ? iobyxmoadgVar.wkgbmnqykc() : this.f52255jyumaefscl, wkgbmnqykcVarZdlpuopuiu);
    }

    @Override // java.util.Collection, java.util.Set, grlcpdaxtj.gxszxtbevo
    public gxszxtbevo removeAll(Collection collection) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVarNufgyqmvbu = nufgyqmvbu();
        iobyxmoadgVarNufgyqmvbu.removeAll(collection);
        return iobyxmoadgVarNufgyqmvbu.build();
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f52254iwizpuwonk.size();
    }
}
