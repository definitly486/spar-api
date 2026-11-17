package p0;

import j0.l;
import j0.m;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private tzroggbefp f75187iobyxmoadg = new tzroggbefp(j0.lqeggnwhkg.gxszxtbevo(), l.f50289zoijcleaow.iobyxmoadg(), (l) null, (kotlin.jvm.internal.gtknphoqwx) null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private wflxmlrfwp f75188zoijcleaow = new wflxmlrfwp(this.f75187iobyxmoadg.dxjokdxxww(), this.f75187iobyxmoadg.gtknphoqwx(), null);

    private final String gxszxtbevo(dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar instanceof iobyxmoadg) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CommitTextCommand(text.length=");
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) dxjokdxxwwVar;
            sb3.append(iobyxmoadgVar.ppxfxbqfkf().length());
            sb3.append(", newCursorPosition=");
            sb3.append(iobyxmoadgVar.zoijcleaow());
            sb3.append(')');
            return sb3.toString();
        }
        if (dxjokdxxwwVar instanceof dsvhmnatus) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("SetComposingTextCommand(text.length=");
            dsvhmnatus dsvhmnatusVar = (dsvhmnatus) dxjokdxxwwVar;
            sb4.append(dsvhmnatusVar.ppxfxbqfkf().length());
            sb4.append(", newCursorPosition=");
            sb4.append(dsvhmnatusVar.zoijcleaow());
            sb4.append(')');
            return sb4.toString();
        }
        if (dxjokdxxwwVar instanceof cllcsxoeiz) {
            return ((cllcsxoeiz) dxjokdxxwwVar).toString();
        }
        if (dxjokdxxwwVar instanceof lqeggnwhkg) {
            return ((lqeggnwhkg) dxjokdxxwwVar).toString();
        }
        if (dxjokdxxwwVar instanceof nufgyqmvbu) {
            return ((nufgyqmvbu) dxjokdxxwwVar).toString();
        }
        if (dxjokdxxwwVar instanceof wypolnanlu) {
            return ((wypolnanlu) dxjokdxxwwVar).toString();
        }
        if (dxjokdxxwwVar instanceof ojitshcjhn) {
            return ((ojitshcjhn) dxjokdxxwwVar).toString();
        }
        if (dxjokdxxwwVar instanceof gxszxtbevo) {
            return ((gxszxtbevo) dxjokdxxwwVar).toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Unknown EditCommand: ");
        String strJyumaefscl = kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(dxjokdxxwwVar.getClass()).jyumaefscl();
        if (strJyumaefscl == null) {
            strJyumaefscl = "{anonymous EditCommand}";
        }
        sb5.append(strJyumaefscl);
        return sb5.toString();
    }

    private final String ppxfxbqfkf(List list, final dxjokdxxww dxjokdxxwwVar) throws IOException {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Error while applying EditCommand batch to buffer (length=" + this.f75188zoijcleaow.nufgyqmvbu() + ", composition=" + this.f75188zoijcleaow.wkgbmnqykc() + ", selection=" + ((Object) l.vdvldrhtss(this.f75188zoijcleaow.dxjokdxxww())) + "):");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        sb3.append('\n');
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        hg.wwaezpbzkn.roivzttewh(list, sb3, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new tg.draadjrbmk() { // from class: p0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.wkgbmnqykc(dxjokdxxwwVar, this, (dxjokdxxww) obj);
            }
        });
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, draadjrbmk draadjrbmkVar, dxjokdxxww dxjokdxxwwVar2) {
        return (dxjokdxxwwVar == dxjokdxxwwVar2 ? " > " : "   ") + draadjrbmkVar.gxszxtbevo(dxjokdxxwwVar2);
    }

    public final void eablkybsjg(tzroggbefp tzroggbefpVar, vipkmwdibw vipkmwdibwVar) {
        boolean zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.btonecajqb(), this.f75188zoijcleaow.wkgbmnqykc());
        boolean z13 = true;
        boolean z14 = false;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75187iobyxmoadg.dxjokdxxww().btonecajqb(), tzroggbefpVar.dxjokdxxww().btonecajqb())) {
            this.f75188zoijcleaow = new wflxmlrfwp(tzroggbefpVar.dxjokdxxww(), tzroggbefpVar.gtknphoqwx(), null);
        } else if (l.lqeggnwhkg(this.f75187iobyxmoadg.gtknphoqwx(), tzroggbefpVar.gtknphoqwx())) {
            z13 = false;
        } else {
            this.f75188zoijcleaow.rgvfuqvkyq(l.draadjrbmk(tzroggbefpVar.gtknphoqwx()), l.gtknphoqwx(tzroggbefpVar.gtknphoqwx()));
            z14 = true;
            z13 = false;
        }
        if (tzroggbefpVar.btonecajqb() == null) {
            this.f75188zoijcleaow.iobyxmoadg();
        } else if (!l.nufgyqmvbu(tzroggbefpVar.btonecajqb().oxmwwwfdhm())) {
            this.f75188zoijcleaow.agtfadlqog(l.draadjrbmk(tzroggbefpVar.btonecajqb().oxmwwwfdhm()), l.gtknphoqwx(tzroggbefpVar.btonecajqb().oxmwwwfdhm()));
        }
        if (z13 || (!z14 && !zEablkybsjg)) {
            this.f75188zoijcleaow.iobyxmoadg();
            tzroggbefpVar = tzroggbefp.lqeggnwhkg(tzroggbefpVar, null, 0L, null, 3, null);
        }
        tzroggbefp tzroggbefpVar2 = this.f75187iobyxmoadg;
        this.f75187iobyxmoadg = tzroggbefpVar;
        if (vipkmwdibwVar != null) {
            vipkmwdibwVar.wkgbmnqykc(tzroggbefpVar2, tzroggbefpVar);
        }
    }

    public final tzroggbefp lqeggnwhkg() {
        return this.f75187iobyxmoadg;
    }

    public final tzroggbefp zoijcleaow(List list) {
        dxjokdxxww dxjokdxxwwVar;
        Exception e13;
        try {
            int size = list.size();
            int i13 = 0;
            dxjokdxxwwVar = null;
            while (i13 < size) {
                try {
                    dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) list.get(i13);
                    try {
                        dxjokdxxwwVar2.iobyxmoadg(this.f75188zoijcleaow);
                        i13++;
                        dxjokdxxwwVar = dxjokdxxwwVar2;
                    } catch (Exception e14) {
                        e13 = e14;
                        dxjokdxxwwVar = dxjokdxxwwVar2;
                        throw new RuntimeException(ppxfxbqfkf(list, dxjokdxxwwVar), e13);
                    }
                } catch (Exception e15) {
                    e13 = e15;
                }
            }
            j0.eablkybsjg eablkybsjgVarKcexrzcfyt = this.f75188zoijcleaow.kcexrzcfyt();
            long jDxjokdxxww = this.f75188zoijcleaow.dxjokdxxww();
            l lVarZoijcleaow = l.zoijcleaow(jDxjokdxxww);
            lVarZoijcleaow.oxmwwwfdhm();
            l lVar = l.wflxmlrfwp(this.f75187iobyxmoadg.gtknphoqwx()) ? null : lVarZoijcleaow;
            tzroggbefp tzroggbefpVar = new tzroggbefp(eablkybsjgVarKcexrzcfyt, lVar != null ? lVar.oxmwwwfdhm() : m.zoijcleaow(l.gtknphoqwx(jDxjokdxxww), l.draadjrbmk(jDxjokdxxww)), this.f75188zoijcleaow.wkgbmnqykc(), (kotlin.jvm.internal.gtknphoqwx) null);
            this.f75187iobyxmoadg = tzroggbefpVar;
            return tzroggbefpVar;
        } catch (Exception e16) {
            dxjokdxxwwVar = null;
            e13 = e16;
        }
    }
}
