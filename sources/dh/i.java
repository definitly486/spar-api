package dh;

import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final i f28226iobyxmoadg = new i();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ki.agtfadlqog f28227zoijcleaow = ki.agtfadlqog.f55536nufgyqmvbu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f28228iobyxmoadg;

        static {
            int[] iArr = new int[ah.btonecajqb.iobyxmoadg.values().length];
            try {
                iArr[ah.btonecajqb.iobyxmoadg.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah.btonecajqb.iobyxmoadg.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ah.btonecajqb.iobyxmoadg.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28228iobyxmoadg = iArr;
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence dxjokdxxww(jh.iyctptxqzt iyctptxqztVar) {
        i iVar = f28226iobyxmoadg;
        zi.kegysxyocb type = iyctptxqztVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return iVar.draadjrbmk(type);
    }

    private final String eablkybsjg(jh.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar instanceof jh.crxdokpmqz) {
            return gtknphoqwx((jh.crxdokpmqz) iobyxmoadgVar);
        }
        if (iobyxmoadgVar instanceof jh.lereixgezr) {
            return gxszxtbevo((jh.lereixgezr) iobyxmoadgVar);
        }
        throw new IllegalStateException(("Illegal callable: " + iobyxmoadgVar).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lqeggnwhkg(jh.iyctptxqzt iyctptxqztVar) {
        i iVar = f28226iobyxmoadg;
        zi.kegysxyocb type = iyctptxqztVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return iVar.draadjrbmk(type);
    }

    private final void ppxfxbqfkf(StringBuilder sb3, jh.vipkmwdibw vipkmwdibwVar) {
        if (vipkmwdibwVar != null) {
            zi.kegysxyocb type = vipkmwdibwVar.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            sb3.append(draadjrbmk(type));
            sb3.append(".");
        }
    }

    private final void wkgbmnqykc(StringBuilder sb3, jh.iobyxmoadg iobyxmoadgVar) {
        jh.vipkmwdibw vipkmwdibwVarDxjokdxxww = n.dxjokdxxww(iobyxmoadgVar);
        jh.vipkmwdibw vipkmwdibwVarHkdspvbjdz = iobyxmoadgVar.hkdspvbjdz();
        ppxfxbqfkf(sb3, vipkmwdibwVarDxjokdxxww);
        boolean z13 = (vipkmwdibwVarDxjokdxxww == null || vipkmwdibwVarHkdspvbjdz == null) ? false : true;
        if (z13) {
            sb3.append("(");
        }
        ppxfxbqfkf(sb3, vipkmwdibwVarHkdspvbjdz);
        if (z13) {
            sb3.append(")");
        }
    }

    public final String btonecajqb(roivzttewh parameter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameter, "parameter");
        StringBuilder sb3 = new StringBuilder();
        int i13 = iobyxmoadg.f28228iobyxmoadg[parameter.getKind().ordinal()];
        if (i13 == 1) {
            sb3.append("extension receiver parameter");
        } else if (i13 == 2) {
            sb3.append("instance parameter");
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb3.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb3.append(" of ");
        sb3.append(f28226iobyxmoadg.eablkybsjg(parameter.dxjokdxxww().sopmlzcsov()));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String draadjrbmk(zi.kegysxyocb type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return f28227zoijcleaow.ntlheqmsrt(type);
    }

    public final String gtknphoqwx(jh.crxdokpmqz descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(descriptor.jpowsppfya() ? "var " : "val ");
        i iVar = f28226iobyxmoadg;
        iVar.wkgbmnqykc(sb3, descriptor);
        ki.agtfadlqog agtfadlqogVar = f28227zoijcleaow;
        ii.gxszxtbevo name = descriptor.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        sb3.append(agtfadlqogVar.mbcevpiqjq(name, true));
        sb3.append(": ");
        zi.kegysxyocb type = descriptor.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        sb3.append(iVar.draadjrbmk(type));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String gxszxtbevo(jh.lereixgezr descriptor) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("fun ");
        i iVar = f28226iobyxmoadg;
        iVar.wkgbmnqykc(sb3, descriptor);
        ki.agtfadlqog agtfadlqogVar = f28227zoijcleaow;
        ii.gxszxtbevo name = descriptor.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        sb3.append(agtfadlqogVar.mbcevpiqjq(name, true));
        List listDxjokdxxww = descriptor.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        hg.wwaezpbzkn.roivzttewh(listDxjokdxxww, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : g.f28216zdlpuopuiu);
        sb3.append(": ");
        zi.kegysxyocb returnType = descriptor.getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType);
        sb3.append(iVar.draadjrbmk(returnType));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String nufgyqmvbu(jh.lereixgezr invoke) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(invoke, "invoke");
        StringBuilder sb3 = new StringBuilder();
        i iVar = f28226iobyxmoadg;
        iVar.wkgbmnqykc(sb3, invoke);
        List listDxjokdxxww = invoke.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        hg.wwaezpbzkn.roivzttewh(listDxjokdxxww, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : h.f28220zdlpuopuiu);
        sb3.append(" -> ");
        zi.kegysxyocb returnType = invoke.getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType);
        sb3.append(iVar.draadjrbmk(returnType));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }
}
