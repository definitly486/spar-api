package zi;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn {
    public static final dj.dxjokdxxww iobyxmoadg(hszhottldk hszhottldkVar, dj.dxjokdxxww inlineClassType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hszhottldkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inlineClassType, "inlineClassType");
        return zoijcleaow(hszhottldkVar, inlineClassType, new HashSet());
    }

    private static final dj.dxjokdxxww zoijcleaow(hszhottldk hszhottldkVar, dj.dxjokdxxww dxjokdxxwwVar, HashSet hashSet) {
        dj.dxjokdxxww dxjokdxxwwVarZoijcleaow;
        dj.dxjokdxxww dxjokdxxwwVarStevsuqkhv;
        dj.wflxmlrfwp wflxmlrfwpVarCrxdokpmqz = hszhottldkVar.crxdokpmqz(dxjokdxxwwVar);
        if (!hashSet.add(wflxmlrfwpVarCrxdokpmqz)) {
            return null;
        }
        dj.agtfadlqog agtfadlqogVarLmojexxdyd = hszhottldkVar.lmojexxdyd(wflxmlrfwpVarCrxdokpmqz);
        if (agtfadlqogVarLmojexxdyd != null) {
            dj.dxjokdxxww dxjokdxxwwVarNufgyqmvbu = hszhottldkVar.nufgyqmvbu(agtfadlqogVarLmojexxdyd);
            dxjokdxxwwVarZoijcleaow = zoijcleaow(hszhottldkVar, dxjokdxxwwVarNufgyqmvbu, hashSet);
            if (dxjokdxxwwVarZoijcleaow == null) {
                return null;
            }
            boolean z13 = hszhottldkVar.draadjrbmk(hszhottldkVar.crxdokpmqz(dxjokdxxwwVarNufgyqmvbu)) || ((dxjokdxxwwVarNufgyqmvbu instanceof dj.btonecajqb) && hszhottldkVar.fiwbwshyhd((dj.btonecajqb) dxjokdxxwwVarNufgyqmvbu));
            if ((dxjokdxxwwVarZoijcleaow instanceof dj.btonecajqb) && hszhottldkVar.fiwbwshyhd((dj.btonecajqb) dxjokdxxwwVarZoijcleaow) && hszhottldkVar.dvvnrvtcbc(dxjokdxxwwVar) && z13) {
                dxjokdxxwwVarStevsuqkhv = hszhottldkVar.stevsuqkhv(dxjokdxxwwVarNufgyqmvbu);
            } else if (!hszhottldkVar.dvvnrvtcbc(dxjokdxxwwVarZoijcleaow) && hszhottldkVar.ntlheqmsrt(dxjokdxxwwVar)) {
                dxjokdxxwwVarStevsuqkhv = hszhottldkVar.stevsuqkhv(dxjokdxxwwVarZoijcleaow);
            }
            return dxjokdxxwwVarStevsuqkhv;
        }
        if (!hszhottldkVar.draadjrbmk(wflxmlrfwpVarCrxdokpmqz)) {
            return dxjokdxxwwVar;
        }
        dj.dxjokdxxww dxjokdxxwwVarCllcsxoeiz = hszhottldkVar.cllcsxoeiz(dxjokdxxwwVar);
        if (dxjokdxxwwVarCllcsxoeiz == null || (dxjokdxxwwVarZoijcleaow = zoijcleaow(hszhottldkVar, dxjokdxxwwVarCllcsxoeiz, hashSet)) == null) {
            return null;
        }
        if (hszhottldkVar.dvvnrvtcbc(dxjokdxxwwVar)) {
            if (hszhottldkVar.dvvnrvtcbc(dxjokdxxwwVarZoijcleaow)) {
                return dxjokdxxwwVar;
            }
            return ((dxjokdxxwwVarZoijcleaow instanceof dj.btonecajqb) && hszhottldkVar.fiwbwshyhd((dj.btonecajqb) dxjokdxxwwVarZoijcleaow)) ? dxjokdxxwwVar : hszhottldkVar.stevsuqkhv(dxjokdxxwwVarZoijcleaow);
        }
        return dxjokdxxwwVarZoijcleaow;
    }
}
