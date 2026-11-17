package ch;

import ah.gxszxtbevo;
import ah.lqeggnwhkg;
import dh.gtknphoqwx;
import dh.n;
import dh.rlfsiqarku;
import di.dxjokdxxww;
import gg.vdvldrhtss;
import hi.eablkybsjg;
import jh.jztzpxfvev;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.rgvfuqvkyq;
import kotlin.jvm.internal.zdlpuopuiu;
import vi.hcddaimhww;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    /* synthetic */ class iobyxmoadg extends rgvfuqvkyq implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f19847zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(2);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final gxszxtbevo getOwner() {
            return cllcsxoeiz.zoijcleaow(hcddaimhww.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jztzpxfvev invoke(hcddaimhww p13, dxjokdxxww p14) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            zdlpuopuiu.btonecajqb(p14, "p1");
            return p13.kcexrzcfyt(p14);
        }
    }

    public static final lqeggnwhkg iobyxmoadg(gg.dxjokdxxww dxjokdxxwwVar) {
        zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        Metadata metadata = (Metadata) dxjokdxxwwVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        vdvldrhtss vdvldrhtssVarBtonecajqb = hi.dxjokdxxww.btonecajqb(strArrD1, metadata.d2());
        hi.gxszxtbevo gxszxtbevoVar = (hi.gxszxtbevo) vdvldrhtssVarBtonecajqb.iobyxmoadg();
        dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) vdvldrhtssVarBtonecajqb.wkgbmnqykc();
        eablkybsjg eablkybsjgVar = new eablkybsjg(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = dxjokdxxwwVar.getClass();
        di.zdlpuopuiu zdlpuopuiuVarIyctptxqzt = dxjokdxxwwVar2.iyctptxqzt();
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarIyctptxqzt, "getTypeTable(...)");
        return new rlfsiqarku(gtknphoqwx.f28218iwizpuwonk, (jztzpxfvev) n.nufgyqmvbu(cls, dxjokdxxwwVar2, gxszxtbevoVar, new fi.lqeggnwhkg(zdlpuopuiuVarIyctptxqzt), eablkybsjgVar, iobyxmoadg.f19847zdlpuopuiu));
    }
}
