package sh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iobyxmoadg f106668ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f106669wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f106670iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentHashMap f106671zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkf.values()) {
            String strWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
            if (linkedHashMap.get(strWkgbmnqykc) == null) {
                linkedHashMap.put(strWkgbmnqykc, ppxfxbqfkfVar);
            }
        }
        f106669wkgbmnqykc = linkedHashMap;
    }

    public zoijcleaow(cdpycssgdh javaTypeEnhancementState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f106670iobyxmoadg = javaTypeEnhancementState;
        this.f106671zoijcleaow = new ConcurrentHashMap();
    }

    private final boolean agtfadlqog(Object obj, ii.ppxfxbqfkf ppxfxbqfkfVar) {
        Iterable iterableWflxmlrfwp = wflxmlrfwp(obj);
        if ((iterableWflxmlrfwp instanceof Collection) && ((Collection) iterableWflxmlrfwp).isEmpty()) {
            return false;
        }
        Iterator it = iterableWflxmlrfwp.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gtknphoqwx(it.next()), ppxfxbqfkfVar)) {
                return true;
            }
        }
        return false;
    }

    private final Object btonecajqb(Object obj, ii.ppxfxbqfkf ppxfxbqfkfVar) {
        for (Object obj2 : wflxmlrfwp(obj)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gtknphoqwx(obj2), ppxfxbqfkfVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final ai.draadjrbmk dxjokdxxww(Object obj, tg.draadjrbmk draadjrbmkVar) {
        ai.draadjrbmk draadjrbmkVarVdvldrhtss;
        ai.draadjrbmk draadjrbmkVarVdvldrhtss2 = vdvldrhtss(obj, ((Boolean) draadjrbmkVar.invoke(obj)).booleanValue());
        if (draadjrbmkVarVdvldrhtss2 != null) {
            return draadjrbmkVarVdvldrhtss2;
        }
        Object objJyumaefscl = jyumaefscl(obj);
        if (objJyumaefscl == null) {
            return null;
        }
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = kcexrzcfyt(obj);
        if (dsvhmnatusVarKcexrzcfyt.lqeggnwhkg() || (draadjrbmkVarVdvldrhtss = vdvldrhtss(objJyumaefscl, ((Boolean) draadjrbmkVar.invoke(objJyumaefscl)).booleanValue())) == null) {
            return null;
        }
        return ai.draadjrbmk.zoijcleaow(draadjrbmkVarVdvldrhtss, null, dsvhmnatusVarKcexrzcfyt.nufgyqmvbu(), 1, null);
    }

    private final iwizpuwonk eablkybsjg(Object obj) {
        ai.draadjrbmk draadjrbmkVarDxjokdxxww;
        iwizpuwonk iwizpuwonkVarYggfygwlhe = yggfygwlhe(obj);
        if (iwizpuwonkVarYggfygwlhe != null) {
            return iwizpuwonkVarYggfygwlhe;
        }
        gg.vdvldrhtss vdvldrhtssVarIwizpuwonk = iwizpuwonk(obj);
        if (vdvldrhtssVarIwizpuwonk == null) {
            return null;
        }
        Object objIobyxmoadg = vdvldrhtssVarIwizpuwonk.iobyxmoadg();
        Set set = (Set) vdvldrhtssVarIwizpuwonk.wkgbmnqykc();
        dsvhmnatus dsvhmnatusVarZdlpuopuiu = zdlpuopuiu(obj);
        if (dsvhmnatusVarZdlpuopuiu == null) {
            dsvhmnatusVarZdlpuopuiu = kcexrzcfyt(objIobyxmoadg);
        }
        if (dsvhmnatusVarZdlpuopuiu.lqeggnwhkg() || (draadjrbmkVarDxjokdxxww = dxjokdxxww(objIobyxmoadg, sh.iobyxmoadg.f106540zdlpuopuiu)) == null) {
            return null;
        }
        return new iwizpuwonk(ai.draadjrbmk.zoijcleaow(draadjrbmkVarDxjokdxxww, null, dsvhmnatusVarZdlpuopuiu.nufgyqmvbu(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gxszxtbevo(Object extractNullability) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extractNullability, "$this$extractNullability");
        return false;
    }

    private final gg.vdvldrhtss iwizpuwonk(Object obj) {
        Object objBtonecajqb;
        Object next;
        if (this.f106670iobyxmoadg.wkgbmnqykc().gxszxtbevo() || (objBtonecajqb = btonecajqb(obj, pkzmftpjix.lqeggnwhkg())) == null) {
            return null;
        }
        Iterator it = wflxmlrfwp(obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (jyumaefscl(next) == null);
        if (next == null) {
            return null;
        }
        Iterable iterablePpxfxbqfkf = ppxfxbqfkf(objBtonecajqb, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterablePpxfxbqfkf.iterator();
        while (it2.hasNext()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) f106669wkgbmnqykc.get((String) it2.next());
            if (ppxfxbqfkfVar != null) {
                linkedHashSet.add(ppxfxbqfkfVar);
            }
        }
        return new gg.vdvldrhtss(next, zoijcleaow(linkedHashSet));
    }

    private final dsvhmnatus kcexrzcfyt(Object obj) {
        dsvhmnatus dsvhmnatusVarZdlpuopuiu = zdlpuopuiu(obj);
        return dsvhmnatusVarZdlpuopuiu != null ? dsvhmnatusVarZdlpuopuiu : this.f106670iobyxmoadg.wkgbmnqykc().ppxfxbqfkf();
    }

    private final dsvhmnatus oxmwwwfdhm(Object obj) {
        ii.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gtknphoqwx(obj);
        return (ppxfxbqfkfVarGtknphoqwx == null || !cqumvgiudr.zoijcleaow().containsKey(ppxfxbqfkfVarGtknphoqwx)) ? kcexrzcfyt(obj) : (dsvhmnatus) this.f106670iobyxmoadg.ppxfxbqfkf().invoke(ppxfxbqfkfVarGtknphoqwx);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = ai.gtknphoqwx.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ai.draadjrbmk vdvldrhtss(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            ii.ppxfxbqfkf r0 = r5.gtknphoqwx(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            sh.cdpycssgdh r2 = r5.f106670iobyxmoadg
            tg.draadjrbmk r2 = r2.ppxfxbqfkf()
            java.lang.Object r2 = r2.invoke(r0)
            sh.dsvhmnatus r2 = (sh.dsvhmnatus) r2
            boolean r3 = r2.lqeggnwhkg()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = sh.pkzmftpjix.wflxmlrfwp()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            ai.gtknphoqwx r6 = ai.gtknphoqwx.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = sh.pkzmftpjix.agtfadlqog()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            ai.gtknphoqwx r6 = ai.gtknphoqwx.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = sh.pkzmftpjix.zoijcleaow()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            ai.gtknphoqwx r6 = ai.gtknphoqwx.FORCE_FLEXIBILITY
            goto L8d
        L43:
            ii.ppxfxbqfkf r3 = sh.pkzmftpjix.ppxfxbqfkf()
            boolean r0 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.ppxfxbqfkf(r6, r4)
            java.lang.Object r6 = hg.jyumaefscl.iyctptxqzt(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            ai.gtknphoqwx r6 = ai.gtknphoqwx.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            ai.gtknphoqwx r6 = ai.gtknphoqwx.NULLABLE
            goto L8d
        L8b:
            ai.gtknphoqwx r6 = ai.gtknphoqwx.NOT_NULL
        L8d:
            ai.draadjrbmk r0 = new ai.draadjrbmk
            boolean r1 = r2.nufgyqmvbu()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.zoijcleaow.vdvldrhtss(java.lang.Object, boolean):ai.draadjrbmk");
    }

    private final iwizpuwonk yggfygwlhe(Object obj) {
        iwizpuwonk iwizpuwonkVar;
        if (this.f106670iobyxmoadg.zoijcleaow() || (iwizpuwonkVar = (iwizpuwonk) cqumvgiudr.iobyxmoadg().get(gtknphoqwx(obj))) == null) {
            return null;
        }
        dsvhmnatus dsvhmnatusVarOxmwwwfdhm = oxmwwwfdhm(obj);
        if (dsvhmnatusVarOxmwwwfdhm == dsvhmnatus.IGNORE) {
            dsvhmnatusVarOxmwwwfdhm = null;
        }
        if (dsvhmnatusVarOxmwwwfdhm == null) {
            return null;
        }
        return iwizpuwonk.zoijcleaow(iwizpuwonkVar, ai.draadjrbmk.zoijcleaow(iwizpuwonkVar.wkgbmnqykc(), null, dsvhmnatusVarOxmwwwfdhm.nufgyqmvbu(), 1, null), null, false, 6, null);
    }

    private final dsvhmnatus zdlpuopuiu(Object obj) {
        Iterable iterablePpxfxbqfkf;
        String str;
        dsvhmnatus dsvhmnatusVar = (dsvhmnatus) this.f106670iobyxmoadg.wkgbmnqykc().eablkybsjg().get(gtknphoqwx(obj));
        if (dsvhmnatusVar != null) {
            return dsvhmnatusVar;
        }
        Object objBtonecajqb = btonecajqb(obj, pkzmftpjix.rgvfuqvkyq());
        if (objBtonecajqb == null || (iterablePpxfxbqfkf = ppxfxbqfkf(objBtonecajqb, false)) == null || (str = (String) hg.jyumaefscl.iyctptxqzt(iterablePpxfxbqfkf)) == null) {
            return null;
        }
        dsvhmnatus dsvhmnatusVarWkgbmnqykc = this.f106670iobyxmoadg.wkgbmnqykc().wkgbmnqykc();
        if (dsvhmnatusVarWkgbmnqykc != null) {
            return dsvhmnatusVarWkgbmnqykc;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return dsvhmnatus.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return dsvhmnatus.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return dsvhmnatus.WARN;
        }
        return null;
    }

    private final Set zoijcleaow(Set set) {
        return set.contains(ppxfxbqfkf.TYPE_USE) ? ikoacuggdj.draadjrbmk(ikoacuggdj.gtknphoqwx(hg.agtfadlqog.u(ppxfxbqfkf.values()), ppxfxbqfkf.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    protected abstract Object draadjrbmk(Object obj);

    protected abstract ii.ppxfxbqfkf gtknphoqwx(Object obj);

    public final Object jyumaefscl(Object annotation) {
        Object objJyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        if (this.f106670iobyxmoadg.wkgbmnqykc().gxszxtbevo()) {
            return null;
        }
        if (hg.jyumaefscl.xrmfcynszj(pkzmftpjix.iobyxmoadg(), gtknphoqwx(annotation)) || agtfadlqog(annotation, pkzmftpjix.gxszxtbevo())) {
            return annotation;
        }
        if (!agtfadlqog(annotation, pkzmftpjix.nufgyqmvbu())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f106671zoijcleaow;
        Object objDraadjrbmk = draadjrbmk(annotation);
        Object obj = concurrentHashMap.get(objDraadjrbmk);
        if (obj != null) {
            return obj;
        }
        Iterator it = wflxmlrfwp(annotation).iterator();
        do {
            if (!it.hasNext()) {
                objJyumaefscl = null;
                break;
            }
            objJyumaefscl = jyumaefscl(it.next());
        } while (objJyumaefscl == null);
        if (objJyumaefscl == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objDraadjrbmk, objJyumaefscl);
        return objPutIfAbsent == null ? objJyumaefscl : objPutIfAbsent;
    }

    public final ai.dxjokdxxww lqeggnwhkg(Iterable annotations) {
        ai.dxjokdxxww dxjokdxxwwVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
        Iterator it = annotations.iterator();
        ai.dxjokdxxww dxjokdxxwwVar2 = null;
        while (it.hasNext()) {
            ii.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gtknphoqwx(it.next());
            if (hg.jyumaefscl.xrmfcynszj(pkzmftpjix.ojitshcjhn(), ppxfxbqfkfVarGtknphoqwx)) {
                dxjokdxxwwVar = ai.dxjokdxxww.READ_ONLY;
            } else if (hg.jyumaefscl.xrmfcynszj(pkzmftpjix.draadjrbmk(), ppxfxbqfkfVarGtknphoqwx)) {
                dxjokdxxwwVar = ai.dxjokdxxww.MUTABLE;
            } else {
                continue;
            }
            if (dxjokdxxwwVar2 != null && dxjokdxxwwVar2 != dxjokdxxwwVar) {
                return null;
            }
            dxjokdxxwwVar2 = dxjokdxxwwVar;
        }
        return dxjokdxxwwVar2;
    }

    public final ai.draadjrbmk nufgyqmvbu(Iterable annotations, tg.draadjrbmk forceWarning) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        ai.draadjrbmk draadjrbmkVar = null;
        while (it.hasNext()) {
            ai.draadjrbmk draadjrbmkVarDxjokdxxww = dxjokdxxww(it.next(), forceWarning);
            if (draadjrbmkVar != null) {
                if (draadjrbmkVarDxjokdxxww != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarDxjokdxxww, draadjrbmkVar) && (!draadjrbmkVarDxjokdxxww.wkgbmnqykc() || draadjrbmkVar.wkgbmnqykc())) {
                    if (draadjrbmkVarDxjokdxxww.wkgbmnqykc() || !draadjrbmkVar.wkgbmnqykc()) {
                        return null;
                    }
                }
            }
            draadjrbmkVar = draadjrbmkVarDxjokdxxww;
        }
        return draadjrbmkVar;
    }

    public abstract boolean ojitshcjhn();

    protected abstract Iterable ppxfxbqfkf(Object obj, boolean z13);

    public final boolean rgvfuqvkyq(Object annotation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        Object objBtonecajqb = btonecajqb(annotation, gh.ojitshcjhn.iobyxmoadg.f37353wwaezpbzkn);
        if (objBtonecajqb == null) {
            return false;
        }
        Iterable iterablePpxfxbqfkf = ppxfxbqfkf(objBtonecajqb, false);
        if ((iterablePpxfxbqfkf instanceof Collection) && ((Collection) iterablePpxfxbqfkf).isEmpty()) {
            return false;
        }
        Iterator it = iterablePpxfxbqfkf.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    protected abstract Iterable wflxmlrfwp(Object obj);

    public final yadqdtsiqt wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, Iterable annotations) {
        EnumMap enumMapZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
        if (this.f106670iobyxmoadg.zoijcleaow()) {
            return yadqdtsiqtVar;
        }
        ArrayList<iwizpuwonk> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            iwizpuwonk iwizpuwonkVarEablkybsjg = eablkybsjg(it.next());
            if (iwizpuwonkVarEablkybsjg != null) {
                arrayList.add(iwizpuwonkVarEablkybsjg);
            }
        }
        if (arrayList.isEmpty()) {
            return yadqdtsiqtVar;
        }
        EnumMap enumMap = new EnumMap(ppxfxbqfkf.class);
        for (iwizpuwonk iwizpuwonkVar : arrayList) {
            for (ppxfxbqfkf ppxfxbqfkfVar : iwizpuwonkVar.eablkybsjg()) {
                if (enumMap.containsKey(ppxfxbqfkfVar) && ojitshcjhn()) {
                    iwizpuwonk iwizpuwonkVar2 = (iwizpuwonk) enumMap.get(ppxfxbqfkfVar);
                    if (iwizpuwonkVar2 != null) {
                        ai.draadjrbmk draadjrbmkVarWkgbmnqykc = iwizpuwonkVar2.wkgbmnqykc();
                        ai.draadjrbmk draadjrbmkVarWkgbmnqykc2 = iwizpuwonkVar.wkgbmnqykc();
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarWkgbmnqykc2, draadjrbmkVarWkgbmnqykc) && (!draadjrbmkVarWkgbmnqykc2.wkgbmnqykc() || draadjrbmkVarWkgbmnqykc.wkgbmnqykc())) {
                            iwizpuwonkVar2 = (draadjrbmkVarWkgbmnqykc2.wkgbmnqykc() || !draadjrbmkVarWkgbmnqykc.wkgbmnqykc()) ? null : iwizpuwonkVar;
                        }
                        enumMap.put(ppxfxbqfkfVar, iwizpuwonkVar2);
                    }
                } else {
                    enumMap.put(ppxfxbqfkfVar, iwizpuwonkVar);
                }
            }
        }
        EnumMap enumMap2 = (yadqdtsiqtVar == null || (enumMapZoijcleaow = yadqdtsiqtVar.zoijcleaow()) == null) ? new EnumMap(ppxfxbqfkf.class) : new EnumMap(enumMapZoijcleaow);
        boolean z13 = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) entry.getKey();
            iwizpuwonk iwizpuwonkVar3 = (iwizpuwonk) entry.getValue();
            if (iwizpuwonkVar3 != null) {
                enumMap2.put(ppxfxbqfkfVar2, iwizpuwonkVar3);
                z13 = true;
            }
        }
        return !z13 ? yadqdtsiqtVar : new yadqdtsiqt(enumMap2);
    }
}
