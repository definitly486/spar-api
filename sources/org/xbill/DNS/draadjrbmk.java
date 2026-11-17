package org.xbill.DNS;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final am.iobyxmoadg f74290eablkybsjg = am.zoijcleaow.dxjokdxxww(draadjrbmk.class);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f74293wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f74294zoijcleaow = -1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74292ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f74291iobyxmoadg = new iobyxmoadg(50000);

    private static class iobyxmoadg extends LinkedHashMap {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f74295zdlpuopuiu;

        iobyxmoadg(int i13) {
            super(16, 0.75f, true);
            this.f74295zdlpuopuiu = i13;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return this.f74295zdlpuopuiu >= 0 && size() > this.f74295zdlpuopuiu;
        }
    }

    private interface ppxfxbqfkf {
        int getType();

        int iobyxmoadg(int i13);

        boolean wkgbmnqykc();
    }

    private static class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74296iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74297jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        auzgnhcxok f74298yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74299zdlpuopuiu;

        public wkgbmnqykc(auzgnhcxok auzgnhcxokVar, int i13, k kVar, int i14, long j13) {
            this.f74298yggfygwlhe = auzgnhcxokVar;
            this.f74299zdlpuopuiu = i13;
            long jMin = kVar != null ? Math.min(kVar.ulzqkzuiru(), kVar.pmvmpeiblj()) : 0L;
            this.f74297jyumaefscl = i14;
            this.f74296iwizpuwonk = draadjrbmk.gtknphoqwx(jMin, j13);
        }

        @Override // org.xbill.DNS.draadjrbmk.ppxfxbqfkf
        public int getType() {
            return this.f74299zdlpuopuiu;
        }

        @Override // org.xbill.DNS.draadjrbmk.ppxfxbqfkf
        public final int iobyxmoadg(int i13) {
            return this.f74297jyumaefscl - i13;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            if (this.f74299zdlpuopuiu == 0) {
                sb3.append("NXDOMAIN ");
                sb3.append(this.f74298yggfygwlhe);
            } else {
                sb3.append("NXRRSET ");
                sb3.append(this.f74298yggfygwlhe);
                sb3.append(" ");
                sb3.append(x2.wkgbmnqykc(this.f74299zdlpuopuiu));
            }
            sb3.append(" cl = ");
            sb3.append(this.f74297jyumaefscl);
            return sb3.toString();
        }

        @Override // org.xbill.DNS.draadjrbmk.ppxfxbqfkf
        public final boolean wkgbmnqykc() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.f74296iwizpuwonk;
        }
    }

    private static class zoijcleaow extends b implements ppxfxbqfkf {
        private static final long serialVersionUID = 5971755205903597024L;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74300cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f74301esjtqupxsv;

        public zoijcleaow(b bVar, int i13, long j13) {
            super(bVar);
            this.f74300cqumvgiudr = i13;
            this.f74301esjtqupxsv = draadjrbmk.gtknphoqwx(bVar.kcexrzcfyt(), j13);
        }

        @Override // org.xbill.DNS.draadjrbmk.ppxfxbqfkf
        public final int iobyxmoadg(int i13) {
            return this.f74300cqumvgiudr - i13;
        }

        @Override // org.xbill.DNS.b
        public String toString() {
            return super.toString() + " cl = " + this.f74300cqumvgiudr;
        }

        @Override // org.xbill.DNS.draadjrbmk.ppxfxbqfkf
        public final boolean wkgbmnqykc() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.f74301esjtqupxsv;
        }
    }

    public draadjrbmk(int i13) {
        this.f74293wkgbmnqykc = i13;
    }

    private static void agtfadlqog(b bVar, Set set) {
        if (bVar.ojitshcjhn().kcexrzcfyt() == null) {
            return;
        }
        Iterator it = bVar.zdlpuopuiu().iterator();
        while (it.hasNext()) {
            auzgnhcxok auzgnhcxokVarKcexrzcfyt = ((e) it.next()).kcexrzcfyt();
            if (auzgnhcxokVarKcexrzcfyt != null) {
                set.add(auzgnhcxokVarKcexrzcfyt);
            }
        }
    }

    private int btonecajqb(int i13, boolean z13) {
        if (i13 == 1) {
            return z13 ? 4 : 3;
        }
        if (i13 == 2) {
            return z13 ? 4 : 3;
        }
        if (i13 == 3) {
            return 1;
        }
        throw new IllegalArgumentException("getCred: invalid section");
    }

    private synchronized ppxfxbqfkf dxjokdxxww(auzgnhcxok auzgnhcxokVar, int i13, int i14) {
        Object objNufgyqmvbu = nufgyqmvbu(auzgnhcxokVar);
        if (objNufgyqmvbu == null) {
            return null;
        }
        return ojitshcjhn(auzgnhcxokVar, objNufgyqmvbu, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gtknphoqwx(long j13, long j14) {
        if (j14 >= 0 && j14 < j13) {
            j13 = j14;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j13;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }

    private synchronized ppxfxbqfkf[] gxszxtbevo(Object obj) {
        if (!(obj instanceof List)) {
            return new ppxfxbqfkf[]{(ppxfxbqfkf) obj};
        }
        List list = (List) obj;
        return (ppxfxbqfkf[]) list.toArray(new ppxfxbqfkf[list.size()]);
    }

    private synchronized Object nufgyqmvbu(auzgnhcxok auzgnhcxokVar) {
        return this.f74291iobyxmoadg.get(auzgnhcxokVar);
    }

    private synchronized ppxfxbqfkf ojitshcjhn(auzgnhcxok auzgnhcxokVar, Object obj, int i13, int i14) {
        ppxfxbqfkf ppxfxbqfkfVar;
        try {
            if (i13 == 255) {
                throw new IllegalArgumentException("oneElement(ANY)");
            }
            if (!(obj instanceof List)) {
                ppxfxbqfkfVar = (ppxfxbqfkf) obj;
                if (ppxfxbqfkfVar.getType() != i13) {
                    ppxfxbqfkfVar = null;
                    break;
                }
            } else {
                Iterator it = ((List) obj).iterator();
                do {
                    if (!it.hasNext()) {
                        ppxfxbqfkfVar = null;
                        break;
                    }
                    ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
                } while (ppxfxbqfkfVar.getType() != i13);
            }
            if (ppxfxbqfkfVar == null) {
                return null;
            }
            if (ppxfxbqfkfVar.wkgbmnqykc()) {
                rgvfuqvkyq(auzgnhcxokVar, i13);
                return null;
            }
            if (ppxfxbqfkfVar.iobyxmoadg(i14) < 0) {
                return null;
            }
            return ppxfxbqfkfVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void rgvfuqvkyq(auzgnhcxok auzgnhcxokVar, int i13) {
        V v13 = this.f74291iobyxmoadg.get(auzgnhcxokVar);
        if (v13 == 0) {
            return;
        }
        if (v13 instanceof List) {
            List list = (List) v13;
            for (int i14 = 0; i14 < list.size(); i14++) {
                if (((ppxfxbqfkf) list.get(i14)).getType() == i13) {
                    list.remove(i14);
                    if (list.size() == 0) {
                        this.f74291iobyxmoadg.remove(auzgnhcxokVar);
                    }
                    return;
                }
            }
        } else if (((ppxfxbqfkf) v13).getType() == i13) {
            this.f74291iobyxmoadg.remove(auzgnhcxokVar);
        }
    }

    private synchronized void zoijcleaow(auzgnhcxok auzgnhcxokVar, ppxfxbqfkf ppxfxbqfkfVar) {
        V v13 = this.f74291iobyxmoadg.get(auzgnhcxokVar);
        if (v13 == 0) {
            this.f74291iobyxmoadg.put(auzgnhcxokVar, ppxfxbqfkfVar);
            return;
        }
        int type = ppxfxbqfkfVar.getType();
        if (v13 instanceof List) {
            List list = (List) v13;
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (((ppxfxbqfkf) list.get(i13)).getType() == type) {
                    list.set(i13, ppxfxbqfkfVar);
                    return;
                }
            }
            list.add(ppxfxbqfkfVar);
        } else {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) v13;
            if (ppxfxbqfkfVar2.getType() == type) {
                this.f74291iobyxmoadg.put(auzgnhcxokVar, ppxfxbqfkfVar);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(ppxfxbqfkfVar2);
                linkedList.add(ppxfxbqfkfVar);
                this.f74291iobyxmoadg.put(auzgnhcxokVar, linkedList);
            }
        }
    }

    protected synchronized z draadjrbmk(auzgnhcxok auzgnhcxokVar, int i13, int i14) {
        try {
            int iJyumaefscl = auzgnhcxokVar.jyumaefscl();
            int i15 = iJyumaefscl;
            while (i15 >= 1) {
                boolean z13 = i15 == 1;
                boolean z14 = i15 == iJyumaefscl;
                auzgnhcxok auzgnhcxokVar2 = z13 ? auzgnhcxok.f74233pmvmpeiblj : z14 ? auzgnhcxokVar : new auzgnhcxok(auzgnhcxokVar, iJyumaefscl - i15);
                Object obj = this.f74291iobyxmoadg.get(auzgnhcxokVar2);
                if (obj != null) {
                    if (z14 && i13 == 255) {
                        z zVar = new z(6);
                        int i16 = 0;
                        for (ppxfxbqfkf ppxfxbqfkfVar : gxszxtbevo(obj)) {
                            if (ppxfxbqfkfVar.wkgbmnqykc()) {
                                rgvfuqvkyq(auzgnhcxokVar2, ppxfxbqfkfVar.getType());
                            } else if ((ppxfxbqfkfVar instanceof zoijcleaow) && ppxfxbqfkfVar.iobyxmoadg(i14) >= 0) {
                                zVar.iobyxmoadg((zoijcleaow) ppxfxbqfkfVar);
                                i16++;
                            }
                        }
                        if (i16 > 0) {
                            return zVar;
                        }
                    } else if (z14) {
                        ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn = ojitshcjhn(auzgnhcxokVar2, obj, i13, i14);
                        if (ppxfxbqfkfVarOjitshcjhn instanceof zoijcleaow) {
                            z zVar2 = new z(6);
                            zVar2.iobyxmoadg((zoijcleaow) ppxfxbqfkfVarOjitshcjhn);
                            return zVar2;
                        }
                        if (ppxfxbqfkfVarOjitshcjhn != null) {
                            return new z(2);
                        }
                        ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn2 = ojitshcjhn(auzgnhcxokVar2, obj, 5, i14);
                        if (ppxfxbqfkfVarOjitshcjhn2 instanceof zoijcleaow) {
                            return new z(4, (zoijcleaow) ppxfxbqfkfVarOjitshcjhn2);
                        }
                    } else {
                        ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn3 = ojitshcjhn(auzgnhcxokVar2, obj, 39, i14);
                        if (ppxfxbqfkfVarOjitshcjhn3 instanceof zoijcleaow) {
                            return new z(5, (zoijcleaow) ppxfxbqfkfVarOjitshcjhn3);
                        }
                    }
                    ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn4 = ojitshcjhn(auzgnhcxokVar2, obj, 2, i14);
                    if (ppxfxbqfkfVarOjitshcjhn4 instanceof zoijcleaow) {
                        return new z(3, (zoijcleaow) ppxfxbqfkfVarOjitshcjhn4);
                    }
                    if (z14 && ojitshcjhn(auzgnhcxokVar2, obj, 0, i14) != null) {
                        return z.gtknphoqwx(1);
                    }
                }
                i15--;
            }
            return z.gtknphoqwx(0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void eablkybsjg(b bVar, int i13) {
        try {
            long jKcexrzcfyt = bVar.kcexrzcfyt();
            auzgnhcxok auzgnhcxokVarVdvldrhtss = bVar.vdvldrhtss();
            int type = bVar.getType();
            ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = dxjokdxxww(auzgnhcxokVarVdvldrhtss, type, 0);
            if (jKcexrzcfyt != 0) {
                if (ppxfxbqfkfVarDxjokdxxww != null && ppxfxbqfkfVarDxjokdxxww.iobyxmoadg(i13) <= 0) {
                    ppxfxbqfkfVarDxjokdxxww = null;
                }
                if (ppxfxbqfkfVarDxjokdxxww == null) {
                    zoijcleaow(auzgnhcxokVarVdvldrhtss, bVar instanceof zoijcleaow ? (zoijcleaow) bVar : new zoijcleaow(bVar, i13, this.f74292ppxfxbqfkf));
                }
            } else if (ppxfxbqfkfVarDxjokdxxww != null && ppxfxbqfkfVarDxjokdxxww.iobyxmoadg(i13) <= 0) {
                rgvfuqvkyq(auzgnhcxokVarVdvldrhtss, type);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void lqeggnwhkg() {
        this.f74291iobyxmoadg.clear();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public org.xbill.DNS.z ppxfxbqfkf(org.xbill.DNS.zfvoamnweg r19) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.draadjrbmk.ppxfxbqfkf(org.xbill.DNS.zfvoamnweg):org.xbill.DNS.z");
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        synchronized (this) {
            try {
                Iterator it = this.f74291iobyxmoadg.values().iterator();
                while (it.hasNext()) {
                    for (ppxfxbqfkf ppxfxbqfkfVar : gxszxtbevo(it.next())) {
                        sb3.append(ppxfxbqfkfVar);
                        sb3.append("\n");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb3.toString();
    }

    public z wflxmlrfwp(auzgnhcxok auzgnhcxokVar, int i13, int i14) {
        return draadjrbmk(auzgnhcxokVar, i13, i14);
    }

    public synchronized void wkgbmnqykc(auzgnhcxok auzgnhcxokVar, int i13, k kVar, int i14) {
        long jMin;
        if (kVar != null) {
            try {
                jMin = Math.min(kVar.ulzqkzuiru(), kVar.pmvmpeiblj());
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            jMin = 0;
        }
        ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = dxjokdxxww(auzgnhcxokVar, i13, 0);
        if (jMin != 0) {
            if (ppxfxbqfkfVarDxjokdxxww != null && ppxfxbqfkfVarDxjokdxxww.iobyxmoadg(i14) <= 0) {
                ppxfxbqfkfVarDxjokdxxww = null;
            }
            if (ppxfxbqfkfVarDxjokdxxww == null) {
                zoijcleaow(auzgnhcxokVar, new wkgbmnqykc(auzgnhcxokVar, i13, kVar, i14, this.f74294zoijcleaow));
            }
        } else if (ppxfxbqfkfVarDxjokdxxww != null && ppxfxbqfkfVarDxjokdxxww.iobyxmoadg(i14) <= 0) {
            rgvfuqvkyq(auzgnhcxokVar, i13);
        }
    }
}
