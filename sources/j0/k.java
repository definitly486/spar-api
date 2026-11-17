package j0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final k f50283iobyxmoadg = new k();

    private k() {
    }

    public final void iobyxmoadg(h.metgxyhuhe metgxyhuheVar, f fVar) {
        boolean z13 = fVar.dxjokdxxww() && !v0.jyumaefscl.lqeggnwhkg(fVar.draadjrbmk().gxszxtbevo(), v0.jyumaefscl.f114986iobyxmoadg.eablkybsjg());
        if (z13) {
            float fZynmafqrjb = (int) (fVar.zynmafqrjb() >> 32);
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow = g.nufgyqmvbu.zoijcleaow(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf(), g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits((int) (fVar.zynmafqrjb() & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits(fZynmafqrjb)) << 32)));
            metgxyhuheVar.jyumaefscl();
            h.metgxyhuhe.lqeggnwhkg(metgxyhuheVar, lqeggnwhkgVarZoijcleaow, 0, 2, null);
        }
        jrbgnlbqoe jrbgnlbqoeVarEsjtqupxsv = fVar.draadjrbmk().dxjokdxxww().esjtqupxsv();
        v0.gtknphoqwx gtknphoqwxVarKcexrzcfyt = jrbgnlbqoeVarEsjtqupxsv.kcexrzcfyt();
        if (gtknphoqwxVarKcexrzcfyt == null) {
            gtknphoqwxVarKcexrzcfyt = v0.gtknphoqwx.f114956zoijcleaow.ppxfxbqfkf();
        }
        v0.gtknphoqwx gtknphoqwxVar = gtknphoqwxVarKcexrzcfyt;
        h.c cVarOxmwwwfdhm = jrbgnlbqoeVarEsjtqupxsv.oxmwwwfdhm();
        if (cVarOxmwwwfdhm == null) {
            cVarOxmwwwfdhm = h.c.f38870wkgbmnqykc.iobyxmoadg();
        }
        h.c cVar = cVarOxmwwwfdhm;
        j.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = jrbgnlbqoeVarEsjtqupxsv.nufgyqmvbu();
        if (lqeggnwhkgVarNufgyqmvbu == null) {
            lqeggnwhkgVarNufgyqmvbu = j.btonecajqb.f50092iobyxmoadg;
        }
        j.lqeggnwhkg lqeggnwhkgVar = lqeggnwhkgVarNufgyqmvbu;
        try {
            h.jztzpxfvev jztzpxfvevVarGxszxtbevo = jrbgnlbqoeVarEsjtqupxsv.gxszxtbevo();
            if (jztzpxfvevVarGxszxtbevo != null) {
                fVar.iwizpuwonk().jpowsppfya(metgxyhuheVar, jztzpxfvevVarGxszxtbevo, (64 & 4) != 0 ? Float.NaN : jrbgnlbqoeVarEsjtqupxsv.zdlpuopuiu() != v0.rgvfuqvkyq.zoijcleaow.f115020zoijcleaow ? jrbgnlbqoeVarEsjtqupxsv.zdlpuopuiu().iobyxmoadg() : 1.0f, (64 & 8) != 0 ? null : cVar, (64 & 16) != 0 ? null : gtknphoqwxVar, (64 & 32) != 0 ? null : lqeggnwhkgVar, (64 & 64) != 0 ? j.gxszxtbevo.f50103lqeggnwhkg.iobyxmoadg() : 0);
            } else {
                fVar.iwizpuwonk().pkzmftpjix(metgxyhuheVar, (32 & 2) != 0 ? h.oipsdeybqn.f38945zoijcleaow.lqeggnwhkg() : jrbgnlbqoeVarEsjtqupxsv.zdlpuopuiu() != v0.rgvfuqvkyq.zoijcleaow.f115020zoijcleaow ? jrbgnlbqoeVarEsjtqupxsv.zdlpuopuiu().zoijcleaow() : h.oipsdeybqn.f38945zoijcleaow.iobyxmoadg(), (32 & 4) != 0 ? null : cVar, (32 & 8) != 0 ? null : gtknphoqwxVar, (32 & 16) == 0 ? lqeggnwhkgVar : null, (32 & 32) != 0 ? j.gxszxtbevo.f50103lqeggnwhkg.iobyxmoadg() : 0);
            }
        } finally {
            if (z13) {
                metgxyhuheVar.agtfadlqog();
            }
        }
    }
}
