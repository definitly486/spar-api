package zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class opjhrmiecq extends gj.eablkybsjg implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f130109yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final opjhrmiecq f130108jyumaefscl = new opjhrmiecq(hg.jyumaefscl.wflxmlrfwp());

    public static final class iobyxmoadg extends gj.lereixgezr {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final opjhrmiecq btonecajqb() {
            return opjhrmiecq.f130108jyumaefscl;
        }

        public final opjhrmiecq dxjokdxxww(List attributes) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attributes, "attributes");
            return attributes.isEmpty() ? btonecajqb() : new opjhrmiecq(attributes, null);
        }

        @Override // gj.lereixgezr
        public int zoijcleaow(ConcurrentHashMap concurrentHashMap, String key, tg.draadjrbmk compute) {
            int iIntValue;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(concurrentHashMap, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ opjhrmiecq(List list, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(list);
    }

    public final opjhrmiecq btonecajqb(opjhrmiecq other) {
        oipsdeybqn oipsdeybqnVarPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f130109yggfygwlhe.lqeggnwhkg().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            oipsdeybqn oipsdeybqnVar = (oipsdeybqn) iobyxmoadg().get(iIntValue);
            oipsdeybqn oipsdeybqnVar2 = (oipsdeybqn) other.iobyxmoadg().get(iIntValue);
            if (oipsdeybqnVar == null) {
                oipsdeybqnVarPpxfxbqfkf = oipsdeybqnVar2 != null ? oipsdeybqnVar2.ppxfxbqfkf(oipsdeybqnVar) : null;
            } else {
                oipsdeybqnVarPpxfxbqfkf = oipsdeybqnVar.ppxfxbqfkf(oipsdeybqnVar2);
            }
            jj.iobyxmoadg.iobyxmoadg(arrayList, oipsdeybqnVarPpxfxbqfkf);
        }
        return f130109yggfygwlhe.dxjokdxxww(arrayList);
    }

    public final opjhrmiecq draadjrbmk(oipsdeybqn attribute) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        gj.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = iobyxmoadg();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ppxfxbqfkfVarIobyxmoadg) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((oipsdeybqn) obj, attribute)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == iobyxmoadg().iobyxmoadg() ? this : f130109yggfygwlhe.dxjokdxxww(arrayList);
    }

    public final boolean dxjokdxxww(oipsdeybqn attribute) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attribute, "attribute");
        return iobyxmoadg().get(f130109yggfygwlhe.wkgbmnqykc(attribute.zoijcleaow())) != null;
    }

    public final opjhrmiecq gtknphoqwx(oipsdeybqn attribute) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attribute, "attribute");
        if (dxjokdxxww(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new opjhrmiecq(attribute);
        }
        return f130109yggfygwlhe.dxjokdxxww(hg.jyumaefscl.jrbgnlbqoe(hg.jyumaefscl.m(this), attribute));
    }

    public final opjhrmiecq gxszxtbevo(opjhrmiecq other) {
        oipsdeybqn oipsdeybqnVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f130109yggfygwlhe.lqeggnwhkg().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            oipsdeybqn oipsdeybqnVar = (oipsdeybqn) iobyxmoadg().get(iIntValue);
            oipsdeybqn oipsdeybqnVar2 = (oipsdeybqn) other.iobyxmoadg().get(iIntValue);
            if (oipsdeybqnVar == null) {
                oipsdeybqnVarIobyxmoadg = oipsdeybqnVar2 != null ? oipsdeybqnVar2.iobyxmoadg(oipsdeybqnVar) : null;
            } else {
                oipsdeybqnVarIobyxmoadg = oipsdeybqnVar.iobyxmoadg(oipsdeybqnVar2);
            }
            jj.iobyxmoadg.iobyxmoadg(arrayList, oipsdeybqnVarIobyxmoadg);
        }
        return f130109yggfygwlhe.dxjokdxxww(arrayList);
    }

    @Override // gj.iobyxmoadg
    protected gj.lereixgezr zoijcleaow() {
        return f130109yggfygwlhe;
    }

    private opjhrmiecq(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oipsdeybqn oipsdeybqnVar = (oipsdeybqn) it.next();
            ppxfxbqfkf(oipsdeybqnVar.zoijcleaow(), oipsdeybqnVar);
        }
    }

    private opjhrmiecq(oipsdeybqn oipsdeybqnVar) {
        this(hg.jyumaefscl.eablkybsjg(oipsdeybqnVar));
    }
}
