package dk;

import fk.iwxlajgraz;
import fk.uawqvzlxes;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp {
    public static final gxszxtbevo btonecajqb(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return gxszxtbevoVar.zoijcleaow() ? gxszxtbevoVar : new iwxlajgraz(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static /* synthetic */ gxszxtbevo eablkybsjg(String str, gxszxtbevo[] gxszxtbevoVarArr, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            draadjrbmkVar = new tg.draadjrbmk() { // from class: dk.draadjrbmk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj2) {
                    return wflxmlrfwp.gxszxtbevo((iobyxmoadg) obj2);
                }
            };
        }
        return wkgbmnqykc(str, gxszxtbevoVarArr, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final gxszxtbevo lqeggnwhkg(String serialName, agtfadlqog kind, gxszxtbevo[] typeParameters, tg.draadjrbmk builder) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(typeParameters, "typeParameters");
        zdlpuopuiu.btonecajqb(builder, "builder");
        if (kcexrzcfyt.zfvoamnweg(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (zdlpuopuiu.eablkybsjg(kind, ojitshcjhn.iobyxmoadg.f29095iobyxmoadg)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(serialName);
        builder.invoke(iobyxmoadgVar);
        return new dxjokdxxww(serialName, kind, iobyxmoadgVar.gxszxtbevo().size(), hg.agtfadlqog.i(typeParameters), iobyxmoadgVar);
    }

    public static /* synthetic */ gxszxtbevo nufgyqmvbu(String str, agtfadlqog agtfadlqogVar, gxszxtbevo[] gxszxtbevoVarArr, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            draadjrbmkVar = new tg.draadjrbmk() { // from class: dk.gtknphoqwx
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj2) {
                    return wflxmlrfwp.dxjokdxxww((iobyxmoadg) obj2);
                }
            };
        }
        return lqeggnwhkg(str, agtfadlqogVar, gxszxtbevoVarArr, draadjrbmkVar);
    }

    public static final gxszxtbevo ppxfxbqfkf(String serialName, eablkybsjg kind) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(kind, "kind");
        if (kcexrzcfyt.zfvoamnweg(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return uawqvzlxes.iobyxmoadg(serialName, kind);
    }

    public static final gxszxtbevo wkgbmnqykc(String serialName, gxszxtbevo[] typeParameters, tg.draadjrbmk builderAction) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(typeParameters, "typeParameters");
        zdlpuopuiu.btonecajqb(builderAction, "builderAction");
        if (kcexrzcfyt.zfvoamnweg(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(serialName);
        builderAction.invoke(iobyxmoadgVar);
        return new dxjokdxxww(serialName, ojitshcjhn.iobyxmoadg.f29095iobyxmoadg, iobyxmoadgVar.gxszxtbevo().size(), hg.agtfadlqog.i(typeParameters), iobyxmoadgVar);
    }
}
