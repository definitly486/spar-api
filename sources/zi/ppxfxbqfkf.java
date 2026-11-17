package zi;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f130113iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    private final boolean eablkybsjg(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if (lqeggnwhkg.f130056zoijcleaow) {
            if (!ojitshcjhnVarBtonecajqb.zoijcleaow(btonecajqbVar) && !ojitshcjhnVarBtonecajqb.esjtqupxsv(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar))) {
                lrnfpwlwnkVar.draadjrbmk(btonecajqbVar);
            }
            if (!ojitshcjhnVarBtonecajqb.zoijcleaow(btonecajqbVar2)) {
                lrnfpwlwnkVar.draadjrbmk(btonecajqbVar2);
            }
        }
        if (ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar2) || ojitshcjhnVarBtonecajqb.sflfametgt(btonecajqbVar) || ojitshcjhnVarBtonecajqb.wflxmlrfwp(btonecajqbVar)) {
            return true;
        }
        if ((btonecajqbVar instanceof dj.wkgbmnqykc) && ojitshcjhnVarBtonecajqb.tzroggbefp((dj.wkgbmnqykc) btonecajqbVar)) {
            return true;
        }
        ppxfxbqfkf ppxfxbqfkfVar = f130113iobyxmoadg;
        if (ppxfxbqfkfVar.iobyxmoadg(lrnfpwlwnkVar, btonecajqbVar, lrnfpwlwnk.ppxfxbqfkf.zoijcleaow.f130072iobyxmoadg)) {
            return true;
        }
        if (ojitshcjhnVarBtonecajqb.sflfametgt(btonecajqbVar2) || ppxfxbqfkfVar.iobyxmoadg(lrnfpwlwnkVar, btonecajqbVar2, lrnfpwlwnk.ppxfxbqfkf.wkgbmnqykc.f130071iobyxmoadg) || ojitshcjhnVarBtonecajqb.lxfrhoxuzk(btonecajqbVar)) {
            return false;
        }
        return ppxfxbqfkfVar.zoijcleaow(lrnfpwlwnkVar, btonecajqbVar, ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2));
    }

    private final boolean ppxfxbqfkf(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.wflxmlrfwp wflxmlrfwpVar) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if (ojitshcjhnVarBtonecajqb.rgvfuqvkyq(btonecajqbVar)) {
            return true;
        }
        if (ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar)) {
            return false;
        }
        if (lrnfpwlwnkVar.agtfadlqog() && ojitshcjhnVarBtonecajqb.vdvldrhtss(btonecajqbVar)) {
            return true;
        }
        return ojitshcjhnVarBtonecajqb.auzgnhcxok(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar), wflxmlrfwpVar);
    }

    public final boolean iobyxmoadg(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb type, lrnfpwlwnk.ppxfxbqfkf supertypesPolicy) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lrnfpwlwnkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supertypesPolicy, "supertypesPolicy");
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if ((ojitshcjhnVarBtonecajqb.lxfrhoxuzk(type) && !ojitshcjhnVarBtonecajqb.zfvoamnweg(type)) || ojitshcjhnVarBtonecajqb.sflfametgt(type)) {
            return true;
        }
        lrnfpwlwnkVar.gtknphoqwx();
        ArrayDeque arrayDequeNufgyqmvbu = lrnfpwlwnkVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDequeNufgyqmvbu);
        Set setDxjokdxxww = lrnfpwlwnkVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(setDxjokdxxww);
        arrayDequeNufgyqmvbu.push(type);
        while (!arrayDequeNufgyqmvbu.isEmpty()) {
            if (setDxjokdxxww.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + hg.jyumaefscl.iwxlajgraz(setDxjokdxxww, null, null, null, 0, null, null, 63, null)).toString());
            }
            dj.btonecajqb btonecajqbVar = (dj.btonecajqb) arrayDequeNufgyqmvbu.pop();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar);
            if (setDxjokdxxww.add(btonecajqbVar)) {
                lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar) ? lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg : supertypesPolicy;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg)) {
                    ppxfxbqfkfVar = null;
                }
                if (ppxfxbqfkfVar == null) {
                    continue;
                } else {
                    dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = lrnfpwlwnkVar.btonecajqb();
                    Iterator it = ojitshcjhnVarBtonecajqb2.yfnezrywwk(ojitshcjhnVarBtonecajqb2.iobyxmoadg(btonecajqbVar)).iterator();
                    while (it.hasNext()) {
                        dj.btonecajqb btonecajqbVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(lrnfpwlwnkVar, (dj.dxjokdxxww) it.next());
                        if ((ojitshcjhnVarBtonecajqb.lxfrhoxuzk(btonecajqbVarIobyxmoadg) && !ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVarIobyxmoadg)) || ojitshcjhnVarBtonecajqb.sflfametgt(btonecajqbVarIobyxmoadg)) {
                            lrnfpwlwnkVar.eablkybsjg();
                            return true;
                        }
                        arrayDequeNufgyqmvbu.add(btonecajqbVarIobyxmoadg);
                    }
                }
            }
        }
        lrnfpwlwnkVar.eablkybsjg();
        return false;
    }

    public final boolean wkgbmnqykc(lrnfpwlwnk state, dj.btonecajqb subType, dj.btonecajqb superType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return eablkybsjg(state, subType, superType);
    }

    public final boolean zoijcleaow(lrnfpwlwnk state, dj.btonecajqb start, dj.wflxmlrfwp end) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(start, "start");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(end, "end");
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = state.btonecajqb();
        if (f130113iobyxmoadg.ppxfxbqfkf(state, start, end)) {
            return true;
        }
        state.gtknphoqwx();
        ArrayDeque arrayDequeNufgyqmvbu = state.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDequeNufgyqmvbu);
        Set setDxjokdxxww = state.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(setDxjokdxxww);
        arrayDequeNufgyqmvbu.push(start);
        while (!arrayDequeNufgyqmvbu.isEmpty()) {
            if (setDxjokdxxww.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + hg.jyumaefscl.iwxlajgraz(setDxjokdxxww, null, null, null, 0, null, null, 63, null)).toString());
            }
            dj.btonecajqb btonecajqbVar = (dj.btonecajqb) arrayDequeNufgyqmvbu.pop();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar);
            if (setDxjokdxxww.add(btonecajqbVar)) {
                lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar) ? lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg : lrnfpwlwnk.ppxfxbqfkf.zoijcleaow.f130072iobyxmoadg;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg)) {
                    ppxfxbqfkfVar = null;
                }
                if (ppxfxbqfkfVar == null) {
                    continue;
                } else {
                    dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = state.btonecajqb();
                    Iterator it = ojitshcjhnVarBtonecajqb2.yfnezrywwk(ojitshcjhnVarBtonecajqb2.iobyxmoadg(btonecajqbVar)).iterator();
                    while (it.hasNext()) {
                        dj.btonecajqb btonecajqbVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(state, (dj.dxjokdxxww) it.next());
                        if (f130113iobyxmoadg.ppxfxbqfkf(state, btonecajqbVarIobyxmoadg, end)) {
                            state.eablkybsjg();
                            return true;
                        }
                        arrayDequeNufgyqmvbu.add(btonecajqbVarIobyxmoadg);
                    }
                }
            }
        }
        state.eablkybsjg();
        return false;
    }
}
