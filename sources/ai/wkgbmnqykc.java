package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dj.dxjokdxxww f2008iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final dj.agtfadlqog f2009ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final sh.yadqdtsiqt f2010zoijcleaow;

        public iobyxmoadg(dj.dxjokdxxww dxjokdxxwwVar, sh.yadqdtsiqt yadqdtsiqtVar, dj.agtfadlqog agtfadlqogVar) {
            this.f2008iobyxmoadg = dxjokdxxwwVar;
            this.f2010zoijcleaow = yadqdtsiqtVar;
            this.f2009ppxfxbqfkf = agtfadlqogVar;
        }

        public final sh.yadqdtsiqt iobyxmoadg() {
            return this.f2010zoijcleaow;
        }

        public final dj.agtfadlqog ppxfxbqfkf() {
            return this.f2009ppxfxbqfkf;
        }

        public final dj.dxjokdxxww zoijcleaow() {
            return this.f2008iobyxmoadg;
        }
    }

    private final List btonecajqb(Object obj, tg.draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = new ArrayList(1);
        gtknphoqwx(obj, arrayList, draadjrbmkVar);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, Object extractNullability) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extractNullability, "$this$extractNullability");
        return wkgbmnqykcVar.draadjrbmk(extractNullability, iobyxmoadgVar.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu eablkybsjg(czzsidtyhn czzsidtyhnVar, nufgyqmvbu[] nufgyqmvbuVarArr, int i13) {
        Map mapZoijcleaow;
        nufgyqmvbu nufgyqmvbuVar;
        if (czzsidtyhnVar == null || (mapZoijcleaow = czzsidtyhnVar.zoijcleaow()) == null || (nufgyqmvbuVar = (nufgyqmvbu) mapZoijcleaow.get(Integer.valueOf(i13))) == null) {
            return (i13 < 0 || i13 >= nufgyqmvbuVarArr.length) ? nufgyqmvbu.f1979eablkybsjg.iobyxmoadg() : nufgyqmvbuVarArr[i13];
        }
        return nufgyqmvbuVar;
    }

    private final gtknphoqwx esjtqupxsv(dj.dxjokdxxww dxjokdxxwwVar) {
        dj.ojitshcjhn ojitshcjhnVarPmvmpeiblj = pmvmpeiblj();
        if (ojitshcjhnVarPmvmpeiblj.zfvoamnweg(ojitshcjhnVarPmvmpeiblj.zdlpuopuiu(dxjokdxxwwVar))) {
            return gtknphoqwx.NULLABLE;
        }
        if (ojitshcjhnVarPmvmpeiblj.zfvoamnweg(ojitshcjhnVarPmvmpeiblj.igdgnonuha(dxjokdxxwwVar))) {
            return null;
        }
        return gtknphoqwx.NOT_NULL;
    }

    private final void gtknphoqwx(Object obj, List list, tg.draadjrbmk draadjrbmkVar) {
        list.add(obj);
        Iterable iterable = (Iterable) draadjrbmkVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                gtknphoqwx(it.next(), list, draadjrbmkVar);
            }
        }
    }

    private final sh.yadqdtsiqt gxszxtbevo(dj.dxjokdxxww dxjokdxxwwVar, sh.yadqdtsiqt yadqdtsiqtVar) {
        return wflxmlrfwp().wkgbmnqykc(yadqdtsiqtVar, agtfadlqog(dxjokdxxwwVar));
    }

    private final draadjrbmk lmojexxdyd(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        if (draadjrbmkVar == null) {
            return draadjrbmkVar2;
        }
        if (draadjrbmkVar2 == null) {
            return draadjrbmkVar;
        }
        if (draadjrbmkVar.wkgbmnqykc() && !draadjrbmkVar2.wkgbmnqykc()) {
            return draadjrbmkVar2;
        }
        if (draadjrbmkVar.wkgbmnqykc() || !draadjrbmkVar2.wkgbmnqykc()) {
            return (draadjrbmkVar.ppxfxbqfkf().compareTo(draadjrbmkVar2.ppxfxbqfkf()) >= 0 && draadjrbmkVar.ppxfxbqfkf().compareTo(draadjrbmkVar2.ppxfxbqfkf()) > 0) ? draadjrbmkVar : draadjrbmkVar2;
        }
        return draadjrbmkVar;
    }

    private final nufgyqmvbu lqeggnwhkg(dj.dxjokdxxww dxjokdxxwwVar) {
        gtknphoqwx gtknphoqwxVarEsjtqupxsv;
        gtknphoqwx gtknphoqwxVarEsjtqupxsv2 = esjtqupxsv(dxjokdxxwwVar);
        dxjokdxxww dxjokdxxwwVar2 = null;
        if (gtknphoqwxVarEsjtqupxsv2 == null) {
            dj.dxjokdxxww dxjokdxxwwVarJyumaefscl = jyumaefscl(dxjokdxxwwVar);
            gtknphoqwxVarEsjtqupxsv = dxjokdxxwwVarJyumaefscl != null ? esjtqupxsv(dxjokdxxwwVarJyumaefscl) : null;
        } else {
            gtknphoqwxVarEsjtqupxsv = gtknphoqwxVarEsjtqupxsv2;
        }
        dj.ojitshcjhn ojitshcjhnVarPmvmpeiblj = pmvmpeiblj();
        ih.ppxfxbqfkf ppxfxbqfkfVar = ih.ppxfxbqfkf.f44265iobyxmoadg;
        if (ppxfxbqfkfVar.draadjrbmk(cqumvgiudr(ojitshcjhnVarPmvmpeiblj.zdlpuopuiu(dxjokdxxwwVar)))) {
            dxjokdxxwwVar2 = dxjokdxxww.READ_ONLY;
        } else if (ppxfxbqfkfVar.gtknphoqwx(cqumvgiudr(ojitshcjhnVarPmvmpeiblj.igdgnonuha(dxjokdxxwwVar)))) {
            dxjokdxxwwVar2 = dxjokdxxww.MUTABLE;
        }
        return new nufgyqmvbu(gtknphoqwxVarEsjtqupxsv, dxjokdxxwwVar2, pmvmpeiblj().sflfametgt(dxjokdxxwwVar) || iozdgvuglv(dxjokdxxwwVar), gtknphoqwxVarEsjtqupxsv != gtknphoqwxVarEsjtqupxsv2);
    }

    private final nufgyqmvbu nufgyqmvbu(iobyxmoadg iobyxmoadgVar) {
        Iterable iterableWflxmlrfwp;
        draadjrbmk draadjrbmkVarOjitshcjhn;
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow;
        dj.wflxmlrfwp wflxmlrfwpVarCrxdokpmqz;
        if (iobyxmoadgVar.zoijcleaow() == null) {
            dj.ojitshcjhn ojitshcjhnVarPmvmpeiblj = pmvmpeiblj();
            dj.agtfadlqog agtfadlqogVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if ((agtfadlqogVarPpxfxbqfkf != null ? ojitshcjhnVarPmvmpeiblj.ulzqkzuiru(agtfadlqogVarPpxfxbqfkf) : null) == dj.kcexrzcfyt.IN) {
                return nufgyqmvbu.f1979eablkybsjg.iobyxmoadg();
            }
        }
        boolean z13 = false;
        boolean z14 = iobyxmoadgVar.ppxfxbqfkf() == null;
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
        if (dxjokdxxwwVarZoijcleaow2 == null || (iterableWflxmlrfwp = agtfadlqog(dxjokdxxwwVarZoijcleaow2)) == null) {
            iterableWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        dj.ojitshcjhn ojitshcjhnVarPmvmpeiblj2 = pmvmpeiblj();
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow3 = iobyxmoadgVar.zoijcleaow();
        dj.agtfadlqog agtfadlqogVarLmojexxdyd = (dxjokdxxwwVarZoijcleaow3 == null || (wflxmlrfwpVarCrxdokpmqz = ojitshcjhnVarPmvmpeiblj2.crxdokpmqz(dxjokdxxwwVarZoijcleaow3)) == null) ? null : ojitshcjhnVarPmvmpeiblj2.lmojexxdyd(wflxmlrfwpVarCrxdokpmqz);
        boolean z15 = vdvldrhtss() == sh.ppxfxbqfkf.TYPE_PARAMETER_BOUNDS;
        if (z14) {
            if (z15 || !yggfygwlhe() || (dxjokdxxwwVarZoijcleaow = iobyxmoadgVar.zoijcleaow()) == null || !zynmafqrjb(dxjokdxxwwVarZoijcleaow)) {
                iterableWflxmlrfwp = hg.jyumaefscl.grlcpdaxtj(rgvfuqvkyq(), iterableWflxmlrfwp);
            } else {
                Iterable iterableRgvfuqvkyq = rgvfuqvkyq();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableRgvfuqvkyq) {
                    if (!wflxmlrfwp().rgvfuqvkyq(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableWflxmlrfwp = hg.jyumaefscl.ixidwrxhsl(arrayList, iterableWflxmlrfwp);
            }
        }
        dxjokdxxww dxjokdxxwwVarLqeggnwhkg = wflxmlrfwp().lqeggnwhkg(iterableWflxmlrfwp);
        draadjrbmk draadjrbmkVarNufgyqmvbu = wflxmlrfwp().nufgyqmvbu(iterableWflxmlrfwp, new ai.iobyxmoadg(this, iobyxmoadgVar));
        if (draadjrbmkVarNufgyqmvbu != null) {
            gtknphoqwx gtknphoqwxVarPpxfxbqfkf = draadjrbmkVarNufgyqmvbu.ppxfxbqfkf();
            if (draadjrbmkVarNufgyqmvbu.ppxfxbqfkf() == gtknphoqwx.NOT_NULL && agtfadlqogVarLmojexxdyd != null) {
                z13 = true;
            }
            return new nufgyqmvbu(gtknphoqwxVarPpxfxbqfkf, dxjokdxxwwVarLqeggnwhkg, z13, draadjrbmkVarNufgyqmvbu.wkgbmnqykc());
        }
        sh.ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = (z14 || z15) ? vdvldrhtss() : sh.ppxfxbqfkf.TYPE_USE;
        sh.yadqdtsiqt yadqdtsiqtVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        sh.iwizpuwonk iwizpuwonkVarIobyxmoadg = yadqdtsiqtVarIobyxmoadg != null ? yadqdtsiqtVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarVdvldrhtss) : null;
        draadjrbmk draadjrbmkVarOjitshcjhn2 = agtfadlqogVarLmojexxdyd != null ? ojitshcjhn(agtfadlqogVarLmojexxdyd) : null;
        draadjrbmk draadjrbmkVarZdlpuopuiu = zdlpuopuiu(draadjrbmkVarOjitshcjhn2, iwizpuwonkVarIobyxmoadg);
        boolean z16 = (draadjrbmkVarOjitshcjhn2 != null ? draadjrbmkVarOjitshcjhn2.ppxfxbqfkf() : null) == gtknphoqwx.NOT_NULL || !(agtfadlqogVarLmojexxdyd == null || iwizpuwonkVarIobyxmoadg == null || !iwizpuwonkVarIobyxmoadg.ppxfxbqfkf());
        dj.agtfadlqog agtfadlqogVarPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf();
        if (agtfadlqogVarPpxfxbqfkf2 == null || (draadjrbmkVarOjitshcjhn = ojitshcjhn(agtfadlqogVarPpxfxbqfkf2)) == null) {
            draadjrbmkVarOjitshcjhn = null;
        } else if (draadjrbmkVarOjitshcjhn.ppxfxbqfkf() == gtknphoqwx.NULLABLE) {
            draadjrbmkVarOjitshcjhn = draadjrbmk.zoijcleaow(draadjrbmkVarOjitshcjhn, gtknphoqwx.FORCE_FLEXIBILITY, false, 2, null);
        }
        draadjrbmk draadjrbmkVarLmojexxdyd = lmojexxdyd(draadjrbmkVarOjitshcjhn, draadjrbmkVarZdlpuopuiu);
        gtknphoqwx gtknphoqwxVarPpxfxbqfkf2 = draadjrbmkVarLmojexxdyd != null ? draadjrbmkVarLmojexxdyd.ppxfxbqfkf() : null;
        if (draadjrbmkVarLmojexxdyd != null && draadjrbmkVarLmojexxdyd.wkgbmnqykc()) {
            z13 = true;
        }
        return new nufgyqmvbu(gtknphoqwxVarPpxfxbqfkf2, dxjokdxxwwVarLqeggnwhkg, z16, z13);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:30:0x005e->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:3: B:45:0x009c->B:70:?, LOOP_END, SYNTHETIC] */
    private final draadjrbmk ojitshcjhn(dj.agtfadlqog agtfadlqogVar) {
        List arrayList;
        Iterator it;
        gtknphoqwx gtknphoqwxVar;
        boolean z13;
        Iterator it2;
        Iterator it3;
        dj.dxjokdxxww dxjokdxxwwVarJyumaefscl;
        dj.ojitshcjhn ojitshcjhnVarPmvmpeiblj = pmvmpeiblj();
        draadjrbmk draadjrbmkVar = null;
        if (!yadqdtsiqt(agtfadlqogVar)) {
            return null;
        }
        List listCzzsidtyhn = ojitshcjhnVarPmvmpeiblj.czzsidtyhn(agtfadlqogVar);
        if (listCzzsidtyhn == null || !listCzzsidtyhn.isEmpty()) {
            Iterator it4 = listCzzsidtyhn.iterator();
            while (it4.hasNext()) {
                if (!ojitshcjhnVarPmvmpeiblj.zeieaojujs((dj.dxjokdxxww) it4.next())) {
                    if (listCzzsidtyhn != null && listCzzsidtyhn.isEmpty()) {
                        if (listCzzsidtyhn != null) {
                            it2 = listCzzsidtyhn.iterator();
                            while (it2.hasNext()) {
                                if (jyumaefscl((dj.dxjokdxxww) it2.next()) != null) {
                                    arrayList = new ArrayList();
                                    it3 = listCzzsidtyhn.iterator();
                                    while (it3.hasNext()) {
                                        dxjokdxxwwVarJyumaefscl = jyumaefscl((dj.dxjokdxxww) it3.next());
                                        if (dxjokdxxwwVarJyumaefscl != null) {
                                            arrayList.add(dxjokdxxwwVarJyumaefscl);
                                        }
                                    }
                                    if (arrayList != null) {
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                gtknphoqwxVar = gtknphoqwx.NULLABLE;
                                                break;
                                            }
                                            if (!ojitshcjhnVarPmvmpeiblj.dvvnrvtcbc((dj.dxjokdxxww) it.next())) {
                                                gtknphoqwxVar = gtknphoqwx.NOT_NULL;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                gtknphoqwxVar = gtknphoqwx.NULLABLE;
                                                break;
                                            }
                                            if (!ojitshcjhnVarPmvmpeiblj.dvvnrvtcbc((dj.dxjokdxxww) it.next())) {
                                                gtknphoqwxVar = gtknphoqwx.NOT_NULL;
                                                break;
                                            }
                                        }
                                    }
                                    if (arrayList != listCzzsidtyhn) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    draadjrbmkVar = new draadjrbmk(gtknphoqwxVar, z13);
                                    break;
                                }
                            }
                            break;
                            break;
                        }
                        it2 = listCzzsidtyhn.iterator();
                        while (it2.hasNext()) {
                            if (jyumaefscl((dj.dxjokdxxww) it2.next()) != null) {
                                arrayList = new ArrayList();
                                it3 = listCzzsidtyhn.iterator();
                                while (it3.hasNext()) {
                                    dxjokdxxwwVarJyumaefscl = jyumaefscl((dj.dxjokdxxww) it3.next());
                                    if (dxjokdxxwwVarJyumaefscl != null) {
                                        arrayList.add(dxjokdxxwwVarJyumaefscl);
                                    }
                                }
                                if (arrayList != null) {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            gtknphoqwxVar = gtknphoqwx.NULLABLE;
                                            break;
                                        }
                                        if (!ojitshcjhnVarPmvmpeiblj.dvvnrvtcbc((dj.dxjokdxxww) it.next())) {
                                            gtknphoqwxVar = gtknphoqwx.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            gtknphoqwxVar = gtknphoqwx.NULLABLE;
                                            break;
                                        }
                                        if (!ojitshcjhnVarPmvmpeiblj.dvvnrvtcbc((dj.dxjokdxxww) it.next())) {
                                            gtknphoqwxVar = gtknphoqwx.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != listCzzsidtyhn) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                draadjrbmkVar = new draadjrbmk(gtknphoqwxVar, z13);
                                break;
                            }
                        }
                        break;
                        break;
                    }
                    Iterator it5 = listCzzsidtyhn.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            if (listCzzsidtyhn != null && listCzzsidtyhn.isEmpty()) {
                                break;
                            }
                            it2 = listCzzsidtyhn.iterator();
                            while (it2.hasNext()) {
                                if (jyumaefscl((dj.dxjokdxxww) it2.next()) != null) {
                                    arrayList = new ArrayList();
                                    it3 = listCzzsidtyhn.iterator();
                                    while (it3.hasNext()) {
                                        dxjokdxxwwVarJyumaefscl = jyumaefscl((dj.dxjokdxxww) it3.next());
                                        if (dxjokdxxwwVarJyumaefscl != null) {
                                            arrayList.add(dxjokdxxwwVarJyumaefscl);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        if (esjtqupxsv((dj.dxjokdxxww) it5.next()) != null) {
                            arrayList = listCzzsidtyhn;
                        }
                        if (arrayList != null || !arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    gtknphoqwxVar = gtknphoqwx.NULLABLE;
                                    break;
                                }
                                if (!ojitshcjhnVarPmvmpeiblj.dvvnrvtcbc((dj.dxjokdxxww) it.next())) {
                                    gtknphoqwxVar = gtknphoqwx.NOT_NULL;
                                    break;
                                }
                            }
                        } else {
                            gtknphoqwxVar = gtknphoqwx.NULLABLE;
                            break;
                        }
                        if (arrayList != listCzzsidtyhn) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        draadjrbmkVar = new draadjrbmk(gtknphoqwxVar, z13);
                        break;
                    }
                }
            }
        }
        return draadjrbmkVar;
    }

    private final List wwaezpbzkn(dj.dxjokdxxww dxjokdxxwwVar) {
        return btonecajqb(new iobyxmoadg(dxjokdxxwwVar, gxszxtbevo(dxjokdxxwwVar, oxmwwwfdhm()), null), new ppxfxbqfkf(this, pmvmpeiblj()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable ylkuphrtab(wkgbmnqykc wkgbmnqykcVar, dj.ojitshcjhn ojitshcjhnVar, iobyxmoadg it) {
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow;
        dj.wflxmlrfwp wflxmlrfwpVarCrxdokpmqz;
        List listRibwqtqdhb;
        iobyxmoadg iobyxmoadgVar;
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if ((wkgbmnqykcVar.lereixgezr() && (dxjokdxxwwVarZoijcleaow2 = it.zoijcleaow()) != null && ojitshcjhnVar.pmvmpeiblj(dxjokdxxwwVarZoijcleaow2)) || (dxjokdxxwwVarZoijcleaow = it.zoijcleaow()) == null || (wflxmlrfwpVarCrxdokpmqz = ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVarZoijcleaow)) == null || (listRibwqtqdhb = ojitshcjhnVar.ribwqtqdhb(wflxmlrfwpVarCrxdokpmqz)) == null) {
            return null;
        }
        List listUwvvkdfqfp = ojitshcjhnVar.uwvvkdfqfp(it.zoijcleaow());
        Iterator it2 = listRibwqtqdhb.iterator();
        Iterator it3 = listUwvvkdfqfp.iterator();
        ArrayList arrayList = new ArrayList(Math.min(hg.jyumaefscl.cqumvgiudr(listRibwqtqdhb, 10), hg.jyumaefscl.cqumvgiudr(listUwvvkdfqfp, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            dj.draadjrbmk draadjrbmkVar = (dj.draadjrbmk) it3.next();
            dj.agtfadlqog agtfadlqogVar = (dj.agtfadlqog) next;
            if (ojitshcjhnVar.jhduphickx(draadjrbmkVar)) {
                iobyxmoadgVar = new iobyxmoadg(null, it.iobyxmoadg(), agtfadlqogVar);
            } else {
                dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn = ojitshcjhnVar.ojitshcjhn(draadjrbmkVar);
                iobyxmoadgVar = new iobyxmoadg(dxjokdxxwwVarOjitshcjhn, wkgbmnqykcVar.gxszxtbevo(dxjokdxxwwVarOjitshcjhn, it.iobyxmoadg()), agtfadlqogVar);
            }
            arrayList.add(iobyxmoadgVar);
        }
        return arrayList;
    }

    public abstract Iterable agtfadlqog(dj.dxjokdxxww dxjokdxxwwVar);

    public abstract boolean cdpycssgdh(dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2);

    public abstract ii.wkgbmnqykc cqumvgiudr(dj.dxjokdxxww dxjokdxxwwVar);

    public abstract boolean draadjrbmk(Object obj, dj.dxjokdxxww dxjokdxxwwVar);

    public abstract boolean iozdgvuglv(dj.dxjokdxxww dxjokdxxwwVar);

    public abstract boolean istkbnxepw();

    public boolean iwizpuwonk() {
        return false;
    }

    public abstract dj.dxjokdxxww jyumaefscl(dj.dxjokdxxww dxjokdxxwwVar);

    public abstract boolean kcexrzcfyt();

    public abstract boolean lereixgezr();

    public abstract sh.yadqdtsiqt oxmwwwfdhm();

    public abstract dj.ojitshcjhn pmvmpeiblj();

    public abstract Iterable rgvfuqvkyq();

    public abstract sh.ppxfxbqfkf vdvldrhtss();

    public abstract sh.zoijcleaow wflxmlrfwp();

    public final tg.draadjrbmk wkgbmnqykc(dj.dxjokdxxww dxjokdxxwwVar, Iterable overrides, czzsidtyhn czzsidtyhnVar, boolean z13) {
        int size;
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(overrides, "overrides");
        List listWwaezpbzkn = wwaezpbzkn(dxjokdxxwwVar);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(wwaezpbzkn((dj.dxjokdxxww) it.next()));
        }
        if (iwizpuwonk()) {
            size = 1;
        } else {
            if (istkbnxepw() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!cdpycssgdh(dxjokdxxwwVar, (dj.dxjokdxxww) it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listWwaezpbzkn.size();
        }
        nufgyqmvbu[] nufgyqmvbuVarArr = new nufgyqmvbu[size];
        int i13 = 0;
        while (i13 < size) {
            nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu((iobyxmoadg) listWwaezpbzkn.get(i13));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) hg.jyumaefscl.lrnfpwlwnk((List) it3.next(), i13);
                nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = (iobyxmoadgVar == null || (dxjokdxxwwVarZoijcleaow = iobyxmoadgVar.zoijcleaow()) == null) ? null : lqeggnwhkg(dxjokdxxwwVarZoijcleaow);
                if (nufgyqmvbuVarLqeggnwhkg != null) {
                    arrayList2.add(nufgyqmvbuVarLqeggnwhkg);
                }
            }
            nufgyqmvbuVarArr[i13] = yfnezrywwk.iobyxmoadg(nufgyqmvbuVarNufgyqmvbu, arrayList2, i13 == 0 && istkbnxepw(), i13 == 0 && kcexrzcfyt(), z13);
            i13++;
        }
        return new zoijcleaow(czzsidtyhnVar, nufgyqmvbuVarArr);
    }

    public abstract boolean yadqdtsiqt(dj.agtfadlqog agtfadlqogVar);

    public abstract boolean yggfygwlhe();

    protected abstract draadjrbmk zdlpuopuiu(draadjrbmk draadjrbmkVar, sh.iwizpuwonk iwizpuwonkVar);

    public abstract boolean zynmafqrjb(dj.dxjokdxxww dxjokdxxwwVar);
}
