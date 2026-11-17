package fh;

import bi.cqumvgiudr;
import hg.jyumaefscl;
import ii.ppxfxbqfkf;
import ii.zoijcleaow;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jh.xrmfcynszj;
import kotlin.jvm.internal.ylkuphrtab;
import kotlin.jvm.internal.zdlpuopuiu;
import sh.wwaezpbzkn;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f33812iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f33813ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f33814zoijcleaow;

    /* JADX INFO: renamed from: fh.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0746iobyxmoadg implements cqumvgiudr.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ylkuphrtab f33815iobyxmoadg;

        C0746iobyxmoadg(ylkuphrtab ylkuphrtabVar) {
            this.f33815iobyxmoadg = ylkuphrtabVar;
        }

        @Override // bi.cqumvgiudr.ppxfxbqfkf
        public void iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.ppxfxbqfkf
        public cqumvgiudr.iobyxmoadg zoijcleaow(zoijcleaow classId, xrmfcynszj source) {
            zdlpuopuiu.btonecajqb(classId, "classId");
            zdlpuopuiu.btonecajqb(source, "source");
            if (!zdlpuopuiu.eablkybsjg(classId, wwaezpbzkn.f106636iobyxmoadg.iobyxmoadg())) {
                return null;
            }
            this.f33815iobyxmoadg.f60038zdlpuopuiu = true;
            return null;
        }
    }

    static {
        List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(sh.ylkuphrtab.f106652iobyxmoadg, sh.ylkuphrtab.f106647draadjrbmk, sh.ylkuphrtab.f106663wflxmlrfwp, sh.ylkuphrtab.f106664wkgbmnqykc, sh.ylkuphrtab.f106651gxszxtbevo, sh.ylkuphrtab.f106648dxjokdxxww);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f44488wkgbmnqykc;
        Iterator it = listRgvfuqvkyq.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(iobyxmoadgVar.ppxfxbqfkf((ppxfxbqfkf) it.next()));
        }
        f33814zoijcleaow = linkedHashSet;
        zoijcleaow.iobyxmoadg iobyxmoadgVar2 = zoijcleaow.f44488wkgbmnqykc;
        ppxfxbqfkf REPEATABLE_ANNOTATION = sh.ylkuphrtab.f106646btonecajqb;
        zdlpuopuiu.dxjokdxxww(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f33813ppxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(REPEATABLE_ANNOTATION);
    }

    private iobyxmoadg() {
    }

    public final zoijcleaow iobyxmoadg() {
        return f33813ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf(cqumvgiudr klass) {
        zdlpuopuiu.btonecajqb(klass, "klass");
        ylkuphrtab ylkuphrtabVar = new ylkuphrtab();
        klass.eablkybsjg(new C0746iobyxmoadg(ylkuphrtabVar), null);
        return ylkuphrtabVar.f60038zdlpuopuiu;
    }

    public final Set zoijcleaow() {
        return f33814zoijcleaow;
    }
}
