package aj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.ipoelvxyzq;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.stevsuqkhv;
import zi.ylkuphrtab;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo extends zi.vdvldrhtss {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f2058iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.rgvfuqvkyq implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return cllcsxoeiz.zoijcleaow(gxszxtbevo.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final grlcpdaxtj invoke(dj.dxjokdxxww p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((gxszxtbevo) this.receiver).iobyxmoadg(p13);
        }
    }

    private final ikoacuggdj ppxfxbqfkf(ikoacuggdj ikoacuggdjVar) {
        kegysxyocb type;
        zeieaojujs zeieaojujsVarGrlcpdaxtj = ikoacuggdjVar.grlcpdaxtj();
        stevsuqkhv stevsuqkhvVarKcexrzcfyt = null;
        grlcpdaxtjVarJrbgnlbqoe = null;
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = null;
        if (!(zeieaojujsVarGrlcpdaxtj instanceof mi.ppxfxbqfkf)) {
            if (!(zeieaojujsVarGrlcpdaxtj instanceof stevsuqkhv) || !ikoacuggdjVar.mhtqkkgtqm()) {
                return ikoacuggdjVar;
            }
            stevsuqkhv stevsuqkhvVar = (stevsuqkhv) zeieaojujsVarGrlcpdaxtj;
            Collection collectionZoijcleaow = stevsuqkhvVar.zoijcleaow();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionZoijcleaow, 10));
            Iterator it = collectionZoijcleaow.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                arrayList.add(ej.wkgbmnqykc.zynmafqrjb((kegysxyocb) it.next()));
                z13 = true;
            }
            if (z13) {
                kegysxyocb kegysxyocbVarDraadjrbmk = stevsuqkhvVar.draadjrbmk();
                stevsuqkhvVarKcexrzcfyt = new stevsuqkhv(arrayList).kcexrzcfyt(kegysxyocbVarDraadjrbmk != null ? ej.wkgbmnqykc.zynmafqrjb(kegysxyocbVarDraadjrbmk) : null);
            }
            if (stevsuqkhvVarKcexrzcfyt != null) {
                stevsuqkhvVar = stevsuqkhvVarKcexrzcfyt;
            }
            return stevsuqkhvVar.btonecajqb();
        }
        mi.ppxfxbqfkf ppxfxbqfkfVar = (mi.ppxfxbqfkf) zeieaojujsVarGrlcpdaxtj;
        iwxlajgraz iwxlajgrazVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        if (iwxlajgrazVarPpxfxbqfkf.ppxfxbqfkf() != mhtqkkgtqm.IN_VARIANCE) {
            iwxlajgrazVarPpxfxbqfkf = null;
        }
        if (iwxlajgrazVarPpxfxbqfkf != null && (type = iwxlajgrazVarPpxfxbqfkf.getType()) != null) {
            grlcpdaxtjVarJrbgnlbqoe = type.jrbgnlbqoe();
        }
        grlcpdaxtj grlcpdaxtjVar = grlcpdaxtjVarJrbgnlbqoe;
        if (ppxfxbqfkfVar.lqeggnwhkg() == null) {
            iwxlajgraz iwxlajgrazVarPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf();
            Collection collectionZoijcleaow2 = ppxfxbqfkfVar.zoijcleaow();
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionZoijcleaow2, 10));
            Iterator it2 = collectionZoijcleaow2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((kegysxyocb) it2.next()).jrbgnlbqoe());
            }
            ppxfxbqfkfVar.dxjokdxxww(new agtfadlqog(iwxlajgrazVarPpxfxbqfkf2, arrayList2, null, 4, null));
        }
        dj.zoijcleaow zoijcleaowVar = dj.zoijcleaow.FOR_SUBTYPING;
        agtfadlqog agtfadlqogVarLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(agtfadlqogVarLqeggnwhkg);
        return new dxjokdxxww(zoijcleaowVar, agtfadlqogVarLqeggnwhkg, grlcpdaxtjVar, ikoacuggdjVar.ipoelvxyzq(), ikoacuggdjVar.mhtqkkgtqm(), false, 32, null);
    }

    @Override // zi.vdvldrhtss
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public grlcpdaxtj iobyxmoadg(dj.dxjokdxxww type) {
        grlcpdaxtj grlcpdaxtjVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        if (!(type instanceof kegysxyocb)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = ((kegysxyocb) type).jrbgnlbqoe();
        if (grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj) {
            grlcpdaxtjVarEablkybsjg = ppxfxbqfkf((ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe);
        } else {
            if (!(grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab)) {
                throw new NoWhenBranchMatchedException();
            }
            ylkuphrtab ylkuphrtabVar = (ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe;
            ikoacuggdj ikoacuggdjVarPpxfxbqfkf = ppxfxbqfkf(ylkuphrtabVar.eslsurpljm());
            ikoacuggdj ikoacuggdjVarPpxfxbqfkf2 = ppxfxbqfkf(ylkuphrtabVar.krqnebusok());
            grlcpdaxtjVarEablkybsjg = (ikoacuggdjVarPpxfxbqfkf == ylkuphrtabVar.eslsurpljm() && ikoacuggdjVarPpxfxbqfkf2 == ylkuphrtabVar.krqnebusok()) ? grlcpdaxtjVarJrbgnlbqoe : ntlheqmsrt.eablkybsjg(ikoacuggdjVarPpxfxbqfkf, ikoacuggdjVarPpxfxbqfkf2);
        }
        return ipoelvxyzq.ppxfxbqfkf(grlcpdaxtjVarEablkybsjg, grlcpdaxtjVarJrbgnlbqoe, new zoijcleaow(this));
    }
}
