package z;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class stevsuqkhv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f127263iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f127264ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f127265zoijcleaow;

    public stevsuqkhv(pkzmftpjix pkzmftpjixVar, rgvfuqvkyq rgvfuqvkyqVar, List list) {
        this.f127263iobyxmoadg = pkzmftpjixVar;
        this.f127265zoijcleaow = rgvfuqvkyqVar;
        this.f127264ppxfxbqfkf = list;
    }

    private static final void eablkybsjg(stevsuqkhv stevsuqkhvVar, StringBuilder sb3, pkzmftpjix pkzmftpjixVar, int i13) {
        String strGxszxtbevo = stevsuqkhvVar.gxszxtbevo(pkzmftpjixVar);
        if (strGxszxtbevo.length() > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                sb3.append("..");
            }
            sb3.append(strGxszxtbevo);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            sb3.append('\n');
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            i13++;
        }
        List listWypolnanlu = pkzmftpjixVar.wypolnanlu();
        int size = listWypolnanlu.size();
        for (int i15 = 0; i15 < size; i15++) {
            eablkybsjg(stevsuqkhvVar, sb3, (pkzmftpjix) listWypolnanlu.get(i15), i13);
        }
    }

    private final String gxszxtbevo(pkzmftpjix pkzmftpjixVar) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(pkzmftpjixVar);
        StringBuilder sb4 = new StringBuilder();
        sb4.append('[');
        sb4.append(pkzmftpjixVar.xrmfcynszj());
        sb4.append(']');
        sb3.append(sb4.toString());
        if (!pkzmftpjixVar.gtknphoqwx()) {
            sb3.append("[!isPlaced]");
        }
        sb3.append("[measuredByParent=" + pkzmftpjixVar.oipsdeybqn() + ']');
        if (!zoijcleaow(pkzmftpjixVar)) {
            sb3.append("[INCONSISTENT]");
        }
        return sb3.toString();
    }

    private final boolean ppxfxbqfkf(pkzmftpjix pkzmftpjixVar) {
        if (!zoijcleaow(pkzmftpjixVar)) {
            return false;
        }
        List listWypolnanlu = pkzmftpjixVar.wypolnanlu();
        int size = listWypolnanlu.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!ppxfxbqfkf((pkzmftpjix) listWypolnanlu.get(i13))) {
                return false;
            }
        }
        return true;
    }

    private final String wkgbmnqykc() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Tree state:");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        sb3.append('\n');
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        eablkybsjg(this, sb3, this.f127263iobyxmoadg, 0);
        return sb3.toString();
    }

    private final boolean zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        Object obj;
        pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
        Object obj2 = null;
        pkzmftpjix.eablkybsjg eablkybsjgVarXrmfcynszj = pkzmftpjixVarAuzgnhcxok != null ? pkzmftpjixVarAuzgnhcxok.xrmfcynszj() : null;
        if (pkzmftpjixVar.gtknphoqwx() || (pkzmftpjixVar.iwxlajgraz() != Integer.MAX_VALUE && pkzmftpjixVarAuzgnhcxok != null && pkzmftpjixVarAuzgnhcxok.gtknphoqwx())) {
            if (pkzmftpjixVar.sflfametgt()) {
                List list = this.f127264ppxfxbqfkf;
                int size = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i13);
                    ulzqkzuiru.iobyxmoadg iobyxmoadgVar = (ulzqkzuiru.iobyxmoadg) obj;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), pkzmftpjixVar) && !iobyxmoadgVar.ppxfxbqfkf()) {
                        break;
                    }
                    i13++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (pkzmftpjixVar.istkbnxepw()) {
                return true;
            }
            if (pkzmftpjixVar.sflfametgt()) {
                return this.f127265zoijcleaow.eablkybsjg(pkzmftpjixVar) || pkzmftpjixVar.xrmfcynszj() == pkzmftpjix.eablkybsjg.LookaheadMeasuring || (pkzmftpjixVarAuzgnhcxok != null && pkzmftpjixVarAuzgnhcxok.sflfametgt()) || ((pkzmftpjixVarAuzgnhcxok != null && pkzmftpjixVarAuzgnhcxok.rlfsiqarku()) || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.Measuring);
            }
            if (pkzmftpjixVar.jztzpxfvev()) {
                if (!this.f127265zoijcleaow.eablkybsjg(pkzmftpjixVar) && pkzmftpjixVarAuzgnhcxok != null && !pkzmftpjixVarAuzgnhcxok.sflfametgt() && !pkzmftpjixVarAuzgnhcxok.jztzpxfvev() && eablkybsjgVarXrmfcynszj != pkzmftpjix.eablkybsjg.Measuring && eablkybsjgVarXrmfcynszj != pkzmftpjix.eablkybsjg.LayingOut) {
                    List list2 = this.f127264ppxfxbqfkf;
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ulzqkzuiru.iobyxmoadg) list2.get(i14)).iobyxmoadg(), pkzmftpjixVar)) {
                        }
                    }
                    if (pkzmftpjixVar.xrmfcynszj() != pkzmftpjix.eablkybsjg.Measuring) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.b(), Boolean.TRUE)) {
            if (pkzmftpjixVar.rlfsiqarku()) {
                List list3 = this.f127264ppxfxbqfkf;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    Object obj3 = list3.get(i15);
                    ulzqkzuiru.iobyxmoadg iobyxmoadgVar2 = (ulzqkzuiru.iobyxmoadg) obj3;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.iobyxmoadg(), pkzmftpjixVar) && iobyxmoadgVar2.ppxfxbqfkf()) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (pkzmftpjixVar.rlfsiqarku()) {
                return this.f127265zoijcleaow.gxszxtbevo(pkzmftpjixVar, true) || (pkzmftpjixVarAuzgnhcxok != null && pkzmftpjixVarAuzgnhcxok.rlfsiqarku()) || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LookaheadMeasuring || (pkzmftpjixVarAuzgnhcxok != null && pkzmftpjixVarAuzgnhcxok.sflfametgt() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.uwvvkdfqfp(), pkzmftpjixVar));
            }
            if (pkzmftpjixVar.metgxyhuhe()) {
                return this.f127265zoijcleaow.gxszxtbevo(pkzmftpjixVar, true) || pkzmftpjixVarAuzgnhcxok == null || pkzmftpjixVarAuzgnhcxok.rlfsiqarku() || pkzmftpjixVarAuzgnhcxok.metgxyhuhe() || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LookaheadMeasuring || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LookaheadLayingOut || (pkzmftpjixVarAuzgnhcxok.jztzpxfvev() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVar.uwvvkdfqfp(), pkzmftpjixVar));
            }
        }
        return true;
    }

    public final void iobyxmoadg() {
        if (ppxfxbqfkf(this.f127263iobyxmoadg)) {
            return;
        }
        System.out.println((Object) wkgbmnqykc());
        throw new IllegalStateException("Inconsistency found!");
    }
}
