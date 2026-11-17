package jrbgnlbqoe;

import grlcpdaxtj.gxszxtbevo;
import hg.btonecajqb;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends btonecajqb implements gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ixidwrxhsl.gxszxtbevo f52244iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f52245jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f52246yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private zoijcleaow f52247zdlpuopuiu;

    public ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        this.f52247zdlpuopuiu = zoijcleaowVar;
        this.f52246yggfygwlhe = zoijcleaowVar.draadjrbmk();
        this.f52245jyumaefscl = this.f52247zdlpuopuiu.ojitshcjhn();
        this.f52244iwizpuwonk = this.f52247zdlpuopuiu.agtfadlqog().nufgyqmvbu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f52244iwizpuwonk.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f52246yggfygwlhe = obj;
            this.f52245jyumaefscl = obj;
            this.f52244iwizpuwonk.put(obj, new iobyxmoadg());
            return true;
        }
        V v13 = this.f52244iwizpuwonk.get(this.f52245jyumaefscl);
        zdlpuopuiu.lqeggnwhkg(v13);
        this.f52244iwizpuwonk.put(this.f52245jyumaefscl, ((iobyxmoadg) v13).eablkybsjg(obj));
        this.f52244iwizpuwonk.put(obj, new iobyxmoadg(this.f52245jyumaefscl));
        this.f52245jyumaefscl = obj;
        return true;
    }

    @Override // grlcpdaxtj.gxszxtbevo.iobyxmoadg
    public gxszxtbevo build() {
        zoijcleaow zoijcleaowVar;
        ixidwrxhsl.wkgbmnqykc wkgbmnqykcVarEablkybsjg = this.f52244iwizpuwonk.eablkybsjg();
        if (wkgbmnqykcVarEablkybsjg == this.f52247zdlpuopuiu.agtfadlqog()) {
            fmlbqenlif.iobyxmoadg.iobyxmoadg(this.f52246yggfygwlhe == this.f52247zdlpuopuiu.draadjrbmk());
            fmlbqenlif.iobyxmoadg.iobyxmoadg(this.f52245jyumaefscl == this.f52247zdlpuopuiu.ojitshcjhn());
            zoijcleaowVar = this.f52247zdlpuopuiu;
        } else {
            zoijcleaowVar = new zoijcleaow(this.f52246yggfygwlhe, this.f52245jyumaefscl, wkgbmnqykcVarEablkybsjg);
        }
        this.f52247zdlpuopuiu = zoijcleaowVar;
        return zoijcleaowVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f52244iwizpuwonk.clear();
        fmlbqenlif.ppxfxbqfkf ppxfxbqfkfVar = fmlbqenlif.ppxfxbqfkf.f34414iobyxmoadg;
        this.f52246yggfygwlhe = ppxfxbqfkfVar;
        this.f52245jyumaefscl = ppxfxbqfkfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f52244iwizpuwonk.containsKey(obj);
    }

    public final ixidwrxhsl.gxszxtbevo dxjokdxxww() {
        return this.f52244iwizpuwonk;
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f52244iwizpuwonk.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new eablkybsjg(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f52244iwizpuwonk.remove(obj);
        if (iobyxmoadgVar == null) {
            return false;
        }
        if (iobyxmoadgVar.zoijcleaow()) {
            V v13 = this.f52244iwizpuwonk.get(iobyxmoadgVar.wkgbmnqykc());
            zdlpuopuiu.lqeggnwhkg(v13);
            this.f52244iwizpuwonk.put(iobyxmoadgVar.wkgbmnqykc(), ((iobyxmoadg) v13).eablkybsjg(iobyxmoadgVar.ppxfxbqfkf()));
        } else {
            this.f52246yggfygwlhe = iobyxmoadgVar.ppxfxbqfkf();
        }
        if (!iobyxmoadgVar.iobyxmoadg()) {
            this.f52245jyumaefscl = iobyxmoadgVar.wkgbmnqykc();
            return true;
        }
        V v14 = this.f52244iwizpuwonk.get(iobyxmoadgVar.ppxfxbqfkf());
        zdlpuopuiu.lqeggnwhkg(v14);
        this.f52244iwizpuwonk.put(iobyxmoadgVar.ppxfxbqfkf(), ((iobyxmoadg) v14).gxszxtbevo(iobyxmoadgVar.wkgbmnqykc()));
        return true;
    }

    public final Object wkgbmnqykc() {
        return this.f52246yggfygwlhe;
    }
}
