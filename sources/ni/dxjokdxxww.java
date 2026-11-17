package ni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.lmojexxdyd;
import zi.ikoacuggdj;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f70090iobyxmoadg = new dxjokdxxww();

    private dxjokdxxww() {
    }

    public static /* synthetic */ lqeggnwhkg gxszxtbevo(dxjokdxxww dxjokdxxwwVar, Object obj, lmojexxdyd lmojexxdydVar, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            lmojexxdydVar = null;
        }
        return dxjokdxxwwVar.eablkybsjg(obj, lmojexxdydVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb wkgbmnqykc(gh.draadjrbmk draadjrbmkVar, lmojexxdyd it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ikoacuggdj ikoacuggdjVarDsvhmnatus = it.wflxmlrfwp().dsvhmnatus(draadjrbmkVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDsvhmnatus, "getPrimitiveArrayKotlinType(...)");
        return ikoacuggdjVarDsvhmnatus;
    }

    private final zoijcleaow zoijcleaow(List list, lmojexxdyd lmojexxdydVar, gh.draadjrbmk draadjrbmkVar) {
        List listM = hg.jyumaefscl.m(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(this, it.next(), null, 2, null);
            if (lqeggnwhkgVarGxszxtbevo != null) {
                arrayList.add(lqeggnwhkgVarGxszxtbevo);
            }
        }
        if (lmojexxdydVar == null) {
            return new zoijcleaow(arrayList, new nufgyqmvbu(draadjrbmkVar));
        }
        ikoacuggdj ikoacuggdjVarDsvhmnatus = lmojexxdydVar.wflxmlrfwp().dsvhmnatus(draadjrbmkVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDsvhmnatus, "getPrimitiveArrayKotlinType(...)");
        return new lereixgezr(arrayList, ikoacuggdjVarDsvhmnatus);
    }

    public final lqeggnwhkg eablkybsjg(Object obj, lmojexxdyd lmojexxdydVar) {
        if (obj instanceof Byte) {
            return new wkgbmnqykc(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new iwizpuwonk(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new agtfadlqog(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new zdlpuopuiu(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new eablkybsjg(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new wflxmlrfwp(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new btonecajqb(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new ppxfxbqfkf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new cqumvgiudr((String) obj);
        }
        if (obj instanceof byte[]) {
            return zoijcleaow(hg.agtfadlqog.c((byte[]) obj), lmojexxdydVar, gh.draadjrbmk.BYTE);
        }
        if (obj instanceof short[]) {
            return zoijcleaow(hg.agtfadlqog.j((short[]) obj), lmojexxdydVar, gh.draadjrbmk.SHORT);
        }
        if (obj instanceof int[]) {
            return zoijcleaow(hg.agtfadlqog.g((int[]) obj), lmojexxdydVar, gh.draadjrbmk.INT);
        }
        if (obj instanceof long[]) {
            return zoijcleaow(hg.agtfadlqog.h((long[]) obj), lmojexxdydVar, gh.draadjrbmk.LONG);
        }
        if (obj instanceof char[]) {
            return zoijcleaow(hg.agtfadlqog.d((char[]) obj), lmojexxdydVar, gh.draadjrbmk.CHAR);
        }
        if (obj instanceof float[]) {
            return zoijcleaow(hg.agtfadlqog.f((float[]) obj), lmojexxdydVar, gh.draadjrbmk.FLOAT);
        }
        if (obj instanceof double[]) {
            return zoijcleaow(hg.agtfadlqog.e((double[]) obj), lmojexxdydVar, gh.draadjrbmk.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return zoijcleaow(hg.agtfadlqog.k((boolean[]) obj), lmojexxdydVar, gh.draadjrbmk.BOOLEAN);
        }
        if (obj == null) {
            return new yggfygwlhe();
        }
        return null;
    }

    public final zoijcleaow ppxfxbqfkf(List value, kegysxyocb type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return new lereixgezr(value, type);
    }
}
