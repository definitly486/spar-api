package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends dm.wkgbmnqykc implements gm.wkgbmnqykc, Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gm.btonecajqb f20102cqumvgiudr = new iobyxmoadg();
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final rgvfuqvkyq f20103iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final vdvldrhtss f20104jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gxszxtbevo f20105yggfygwlhe;

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public kcexrzcfyt iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return kcexrzcfyt.cdpycssgdh(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20106iobyxmoadg;

        static {
            int[] iArr = new int[gm.iobyxmoadg.values().length];
            f20106iobyxmoadg = iArr;
            try {
                iArr[gm.iobyxmoadg.f37833ribwqtqdhb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20106iobyxmoadg[gm.iobyxmoadg.f37838vipkmwdibw.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private kcexrzcfyt(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, rgvfuqvkyq rgvfuqvkyqVar) {
        this.f20105yggfygwlhe = gxszxtbevoVar;
        this.f20104jyumaefscl = vdvldrhtssVar;
        this.f20103iwizpuwonk = rgvfuqvkyqVar;
    }

    public static kcexrzcfyt cdpycssgdh(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof kcexrzcfyt) {
            return (kcexrzcfyt) eablkybsjgVar;
        }
        try {
            rgvfuqvkyq rgvfuqvkyqVarVdvldrhtss = rgvfuqvkyq.vdvldrhtss(eablkybsjgVar);
            gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37833ribwqtqdhb;
            if (eablkybsjgVar.iobyxmoadg(iobyxmoadgVar)) {
                try {
                    return istkbnxepw(eablkybsjgVar.agtfadlqog(iobyxmoadgVar), eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37815cqumvgiudr), rgvfuqvkyqVarVdvldrhtss);
                } catch (DateTimeException unused) {
                }
            }
            return pkzmftpjix(gxszxtbevo.wwaezpbzkn(eablkybsjgVar), rgvfuqvkyqVarVdvldrhtss);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    public static kcexrzcfyt cllcsxoeiz(gxszxtbevo gxszxtbevoVar, rgvfuqvkyq rgvfuqvkyqVar, vdvldrhtss vdvldrhtssVar) {
        fm.ppxfxbqfkf.dxjokdxxww(gxszxtbevoVar, "localDateTime");
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        if (rgvfuqvkyqVar instanceof vdvldrhtss) {
            return new kcexrzcfyt(gxszxtbevoVar, (vdvldrhtss) rgvfuqvkyqVar, rgvfuqvkyqVar);
        }
        hm.gxszxtbevo gxszxtbevoVarZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        List listLqeggnwhkg = gxszxtbevoVarZdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
        if (listLqeggnwhkg.size() == 1) {
            vdvldrhtssVar = (vdvldrhtss) listLqeggnwhkg.get(0);
        } else if (listLqeggnwhkg.size() == 0) {
            hm.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = gxszxtbevoVarZdlpuopuiu.wkgbmnqykc(gxszxtbevoVar);
            gxszxtbevoVar = gxszxtbevoVar.sopmlzcsov(wkgbmnqykcVarWkgbmnqykc.nufgyqmvbu().lqeggnwhkg());
            vdvldrhtssVar = wkgbmnqykcVarWkgbmnqykc.draadjrbmk();
        } else if (vdvldrhtssVar == null || !listLqeggnwhkg.contains(vdvldrhtssVar)) {
            vdvldrhtssVar = (vdvldrhtss) fm.ppxfxbqfkf.dxjokdxxww(listLqeggnwhkg.get(0), "offset");
        }
        return new kcexrzcfyt(gxszxtbevoVar, vdvldrhtssVar, rgvfuqvkyqVar);
    }

    public static kcexrzcfyt hcddaimhww(wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(wkgbmnqykcVar, "instant");
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        return istkbnxepw(wkgbmnqykcVar.jyumaefscl(), wkgbmnqykcVar.cqumvgiudr(), rgvfuqvkyqVar);
    }

    private static kcexrzcfyt hkdspvbjdz(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(gxszxtbevoVar, "localDateTime");
        fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        if (!(rgvfuqvkyqVar instanceof vdvldrhtss) || vdvldrhtssVar.equals(rgvfuqvkyqVar)) {
            return new kcexrzcfyt(gxszxtbevoVar, vdvldrhtssVar, rgvfuqvkyqVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private static kcexrzcfyt istkbnxepw(long j13, int i13, rgvfuqvkyq rgvfuqvkyqVar) {
        vdvldrhtss vdvldrhtssVarIobyxmoadg = rgvfuqvkyqVar.zdlpuopuiu().iobyxmoadg(wkgbmnqykc.istkbnxepw(j13, i13));
        return new kcexrzcfyt(gxszxtbevo.stevsuqkhv(j13, i13, vdvldrhtssVarIobyxmoadg), vdvldrhtssVarIobyxmoadg, rgvfuqvkyqVar);
    }

    public static kcexrzcfyt jpowsppfya(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(gxszxtbevoVar, "localDateTime");
        fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        return istkbnxepw(gxszxtbevoVar.lereixgezr(vdvldrhtssVar), gxszxtbevoVar.ylkuphrtab(), rgvfuqvkyqVar);
    }

    private kcexrzcfyt kegysxyocb(gxszxtbevo gxszxtbevoVar) {
        return cllcsxoeiz(gxszxtbevoVar, this.f20103iwizpuwonk, this.f20104jyumaefscl);
    }

    public static kcexrzcfyt pkzmftpjix(gxszxtbevo gxszxtbevoVar, rgvfuqvkyq rgvfuqvkyqVar) {
        return cllcsxoeiz(gxszxtbevoVar, rgvfuqvkyqVar, null);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private kcexrzcfyt stevsuqkhv(gxszxtbevo gxszxtbevoVar) {
        return jpowsppfya(gxszxtbevoVar, this.f20104jyumaefscl, this.f20103iwizpuwonk);
    }

    private kcexrzcfyt tzroggbefp(vdvldrhtss vdvldrhtssVar) {
        return (vdvldrhtssVar.equals(this.f20104jyumaefscl) || !this.f20103iwizpuwonk.zdlpuopuiu().btonecajqb(this.f20105yggfygwlhe, vdvldrhtssVar)) ? this : new kcexrzcfyt(this.f20105yggfygwlhe, vdvldrhtssVar, this.f20103iwizpuwonk);
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 6, this);
    }

    public static kcexrzcfyt wwaezpbzkn() {
        return ylkuphrtab(cm.iobyxmoadg.nufgyqmvbu());
    }

    static kcexrzcfyt wypolnanlu(DataInput dataInput) {
        return hkdspvbjdz(gxszxtbevo.jlmebxxoox(dataInput), vdvldrhtss.jpowsppfya(dataInput), (rgvfuqvkyq) wflxmlrfwp.iobyxmoadg(dataInput));
    }

    public static kcexrzcfyt ylkuphrtab(cm.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "clock");
        return hcddaimhww(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg());
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i13 = zoijcleaow.f20106iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? this.f20105yggfygwlhe.agtfadlqog(nufgyqmvbuVar) : zdlpuopuiu().lmojexxdyd();
        }
        return cqumvgiudr();
    }

    @Override // dm.wkgbmnqykc, fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        return btonecajqbVar == gm.dxjokdxxww.zoijcleaow() ? lereixgezr() : super.btonecajqb(btonecajqbVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (kcexrzcfyt) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        int i13 = zoijcleaow.f20106iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? kegysxyocb(this.f20105yggfygwlhe.rgvfuqvkyq(nufgyqmvbuVar, j13)) : tzroggbefp(vdvldrhtss.pkzmftpjix(iobyxmoadgVar.agtfadlqog(j13)));
        }
        return istkbnxepw(j13, yadqdtsiqt(), this.f20103iwizpuwonk);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: dsvhmnatus, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar instanceof gm.zoijcleaow) {
            return gtknphoqwxVar.iobyxmoadg() ? kegysxyocb(this.f20105yggfygwlhe.wkgbmnqykc(j13, gtknphoqwxVar)) : stevsuqkhv(this.f20105yggfygwlhe.wkgbmnqykc(j13, gtknphoqwxVar));
        }
        return (kcexrzcfyt) gtknphoqwxVar.wkgbmnqykc(this, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return this.f20105yggfygwlhe.equals(kcexrzcfytVar.f20105yggfygwlhe) && this.f20104jyumaefscl.equals(kcexrzcfytVar.f20104jyumaefscl) && this.f20103iwizpuwonk.equals(kcexrzcfytVar.f20103iwizpuwonk);
    }

    public int hashCode() {
        return (this.f20105yggfygwlhe.hashCode() ^ this.f20104jyumaefscl.hashCode()) ^ Integer.rotateLeft(this.f20103iwizpuwonk.hashCode(), 3);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        return (nufgyqmvbuVar instanceof gm.iobyxmoadg) || (nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this));
    }

    public kcexrzcfyt jlmebxxoox(rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        return this.f20103iwizpuwonk.equals(rgvfuqvkyqVar) ? this : istkbnxepw(this.f20105yggfygwlhe.lereixgezr(this.f20104jyumaefscl), this.f20105yggfygwlhe.ylkuphrtab(), rgvfuqvkyqVar);
    }

    @Override // dm.wkgbmnqykc
    public rgvfuqvkyq jyumaefscl() {
        return this.f20103iwizpuwonk;
    }

    @Override // dm.wkgbmnqykc
    public String kcexrzcfyt(em.iobyxmoadg iobyxmoadgVar) {
        return super.kcexrzcfyt(iobyxmoadgVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lmojexxdyd, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return (nufgyqmvbuVar == gm.iobyxmoadg.f37833ribwqtqdhb || nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw) ? nufgyqmvbuVar.dxjokdxxww() : this.f20105yggfygwlhe.lqeggnwhkg(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.lqeggnwhkg(this);
    }

    @Override // dm.wkgbmnqykc
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public eablkybsjg lereixgezr() {
        return this.f20105yggfygwlhe.zynmafqrjb();
    }

    @Override // dm.wkgbmnqykc
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo pmvmpeiblj() {
        return this.f20105yggfygwlhe;
    }

    @Override // dm.wkgbmnqykc, fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return super.ojitshcjhn(nufgyqmvbuVar);
        }
        int i13 = zoijcleaow.f20106iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? this.f20105yggfygwlhe.ojitshcjhn(nufgyqmvbuVar) : zdlpuopuiu().lmojexxdyd();
        }
        throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
    }

    void ribwqtqdhb(DataOutput dataOutput) {
        this.f20105yggfygwlhe.okpsazkaxt(dataOutput);
        this.f20104jyumaefscl.dsvhmnatus(dataOutput);
        this.f20103iwizpuwonk.zynmafqrjb(dataOutput);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar instanceof eablkybsjg) {
            return kegysxyocb(gxszxtbevo.wypolnanlu((eablkybsjg) gxszxtbevoVar, this.f20105yggfygwlhe.istkbnxepw()));
        }
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            return kegysxyocb(gxszxtbevo.wypolnanlu(this.f20105yggfygwlhe.zynmafqrjb(), (lqeggnwhkg) gxszxtbevoVar));
        }
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            return kegysxyocb((gxszxtbevo) gxszxtbevoVar);
        }
        if (!(gxszxtbevoVar instanceof wkgbmnqykc)) {
            return gxszxtbevoVar instanceof vdvldrhtss ? tzroggbefp((vdvldrhtss) gxszxtbevoVar) : (kcexrzcfyt) gxszxtbevoVar.dxjokdxxww(this);
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
        return istkbnxepw(wkgbmnqykcVar.jyumaefscl(), wkgbmnqykcVar.cqumvgiudr(), this.f20103iwizpuwonk);
    }

    public String toString() {
        String str = this.f20105yggfygwlhe.toString() + this.f20104jyumaefscl.toString();
        if (this.f20104jyumaefscl == this.f20103iwizpuwonk) {
            return str;
        }
        return str + '[' + this.f20103iwizpuwonk.toString() + ']';
    }

    public btonecajqb ulzqkzuiru() {
        return btonecajqb.pmvmpeiblj(this.f20105yggfygwlhe, this.f20104jyumaefscl);
    }

    public int yadqdtsiqt() {
        return this.f20105yggfygwlhe.ylkuphrtab();
    }

    @Override // dm.wkgbmnqykc
    public vdvldrhtss zdlpuopuiu() {
        return this.f20104jyumaefscl;
    }

    @Override // dm.wkgbmnqykc
    public lqeggnwhkg zynmafqrjb() {
        return this.f20105yggfygwlhe.istkbnxepw();
    }
}
