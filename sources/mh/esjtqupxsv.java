package mh;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jh.bfopjjpdmp;
import jh.vipkmwdibw;
import jh.xrmfcynszj;
import jh.yfnezrywwk;
import zi.ageimvtcrz;
import zi.igdgnonuha;
import zi.ikoacuggdj;
import zi.mhtqkkgtqm;
import zi.wizcaqwiak;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public class esjtqupxsv extends lereixgezr {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private List f66969cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f66970esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private wizcaqwiak f66971iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final wizcaqwiak f66972jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private zeieaojujs f66973lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lereixgezr f66974yggfygwlhe;

    class iobyxmoadg implements tg.draadjrbmk {
        iobyxmoadg() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(yfnezrywwk yfnezrywwkVar) {
            return Boolean.valueOf(!yfnezrywwkVar.dsvhmnatus());
        }
    }

    class zoijcleaow implements tg.draadjrbmk {
        zoijcleaow() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ikoacuggdj invoke(ikoacuggdj ikoacuggdjVar) {
            return esjtqupxsv.this.ipoelvxyzq(ikoacuggdjVar);
        }
    }

    public esjtqupxsv(lereixgezr lereixgezrVar, wizcaqwiak wizcaqwiakVar) {
        this.f66974yggfygwlhe = lereixgezrVar;
        this.f66972jyumaefscl = wizcaqwiakVar;
    }

    private wizcaqwiak ageimvtcrz() {
        if (this.f66971iwizpuwonk == null) {
            if (this.f66972jyumaefscl.gtknphoqwx()) {
                this.f66971iwizpuwonk = this.f66972jyumaefscl;
            } else {
                List parameters = this.f66974yggfygwlhe.btonecajqb().getParameters();
                this.f66969cqumvgiudr = new ArrayList(parameters.size());
                this.f66971iwizpuwonk = zi.istkbnxepw.zoijcleaow(parameters, this.f66972jyumaefscl.btonecajqb(), this, this.f66969cqumvgiudr);
                this.f66970esjtqupxsv = hg.jyumaefscl.sflfametgt(this.f66969cqumvgiudr, new iobyxmoadg());
            }
        }
        return this.f66971iwizpuwonk;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void igdgnonuha(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 13 || i13 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 13 || i13 == 23) ? 3 : 2];
        if (i13 == 2) {
            objArr[0] = "typeArguments";
        } else if (i13 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i13 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 == 8) {
            objArr[0] = "typeArguments";
        } else if (i13 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i13 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case C4007z9.F /* 25 */:
                objArr[1] = "getKind";
                break;
            case C4007z9.G /* 26 */:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case C4007z9.I /* 29 */:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i13 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i13 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6 && i13 != 8 && i13 != 10 && i13 != 13 && i13 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ikoacuggdj ipoelvxyzq(ikoacuggdj ikoacuggdjVar) {
        return (ikoacuggdjVar == null || this.f66972jyumaefscl.gtknphoqwx()) ? ikoacuggdjVar : (ikoacuggdj) ageimvtcrz().rgvfuqvkyq(ikoacuggdjVar, mhtqkkgtqm.INVARIANT);
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx bfopjjpdmp(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar == null) {
            igdgnonuha(10);
        }
        si.gtknphoqwx gtknphoqwxVarMetgxyhuhe = metgxyhuhe(igdgnonuhaVar, pi.eablkybsjg.oxmwwwfdhm(li.dxjokdxxww.lqeggnwhkg(this)));
        if (gtknphoqwxVarMetgxyhuhe == null) {
            igdgnonuha(11);
        }
        return gtknphoqwxVarMetgxyhuhe;
    }

    @Override // jh.nufgyqmvbu
    public zeieaojujs btonecajqb() {
        zeieaojujs zeieaojujsVarBtonecajqb = this.f66974yggfygwlhe.btonecajqb();
        if (this.f66972jyumaefscl.gtknphoqwx()) {
            if (zeieaojujsVarBtonecajqb == null) {
                igdgnonuha(0);
            }
            return zeieaojujsVarBtonecajqb;
        }
        if (this.f66973lereixgezr == null) {
            wizcaqwiak wizcaqwiakVarAgeimvtcrz = ageimvtcrz();
            Collection collectionZoijcleaow = zeieaojujsVarBtonecajqb.zoijcleaow();
            ArrayList arrayList = new ArrayList(collectionZoijcleaow.size());
            Iterator it = collectionZoijcleaow.iterator();
            while (it.hasNext()) {
                arrayList.add(wizcaqwiakVarAgeimvtcrz.rgvfuqvkyq((zi.kegysxyocb) it.next(), mhtqkkgtqm.INVARIANT));
            }
            this.f66973lereixgezr = new zi.yggfygwlhe(this, this.f66969cqumvgiudr, arrayList, yi.gxszxtbevo.f125306eablkybsjg);
        }
        zeieaojujs zeieaojujsVar = this.f66973lereixgezr;
        if (zeieaojujsVar == null) {
            igdgnonuha(1);
        }
        return zeieaojujsVar;
    }

    @Override // jh.eablkybsjg
    public jh.wkgbmnqykc cdpycssgdh() {
        return this.f66974yggfygwlhe.cdpycssgdh();
    }

    @Override // jh.istkbnxepw
    public boolean czzsidtyhn() {
        return this.f66974yggfygwlhe.czzsidtyhn();
    }

    @Override // jh.eablkybsjg
    public Collection esjtqupxsv() {
        Collection collectionEsjtqupxsv = this.f66974yggfygwlhe.esjtqupxsv();
        if (collectionEsjtqupxsv == null) {
            igdgnonuha(31);
        }
        return collectionEsjtqupxsv;
    }

    @Override // jh.eablkybsjg
    public vipkmwdibw fiwbwshyhd() {
        throw new UnsupportedOperationException();
    }

    @Override // jh.rlfsiqarku
    /* JADX INFO: renamed from: fyldjkxazc, reason: merged with bridge method [inline-methods] */
    public jh.eablkybsjg ppxfxbqfkf(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            igdgnonuha(23);
        }
        return wizcaqwiakVar.gtknphoqwx() ? this : new esjtqupxsv(this, wizcaqwiak.nufgyqmvbu(wizcaqwiakVar.btonecajqb(), ageimvtcrz().btonecajqb()));
    }

    @Override // kh.iobyxmoadg
    public kh.nufgyqmvbu getAnnotations() {
        kh.nufgyqmvbu annotations = this.f66974yggfygwlhe.getAnnotations();
        if (annotations == null) {
            igdgnonuha(19);
        }
        return annotations;
    }

    @Override // jh.eablkybsjg
    public jh.gxszxtbevo getKind() {
        jh.gxszxtbevo kind = this.f66974yggfygwlhe.getKind();
        if (kind == null) {
            igdgnonuha(25);
        }
        return kind;
    }

    @Override // jh.ylkuphrtab
    public ii.gxszxtbevo getName() {
        ii.gxszxtbevo name = this.f66974yggfygwlhe.getName();
        if (name == null) {
            igdgnonuha(20);
        }
        return name;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe visibility = this.f66974yggfygwlhe.getVisibility();
        if (visibility == null) {
            igdgnonuha(27);
        }
        return visibility;
    }

    @Override // jh.eablkybsjg
    public Collection gtknphoqwx() {
        Collection<jh.wkgbmnqykc> collectionGtknphoqwx = this.f66974yggfygwlhe.gtknphoqwx();
        ArrayList arrayList = new ArrayList(collectionGtknphoqwx.size());
        for (jh.wkgbmnqykc wkgbmnqykcVar : collectionGtknphoqwx) {
            arrayList.add(((jh.wkgbmnqykc) wkgbmnqykcVar.yggfygwlhe().gtknphoqwx(wkgbmnqykcVar.iobyxmoadg()).kcexrzcfyt(wkgbmnqykcVar.vdvldrhtss()).eablkybsjg(wkgbmnqykcVar.getVisibility()).draadjrbmk(wkgbmnqykcVar.getKind()).ojitshcjhn(false).build()).ppxfxbqfkf(ageimvtcrz()));
        }
        return arrayList;
    }

    @Override // jh.eablkybsjg
    public boolean hszhottldk() {
        return this.f66974yggfygwlhe.hszhottldk();
    }

    @Override // jh.eablkybsjg
    public boolean ikoacuggdj() {
        return this.f66974yggfygwlhe.ikoacuggdj();
    }

    @Override // jh.istkbnxepw
    public boolean isExternal() {
        return this.f66974yggfygwlhe.isExternal();
    }

    @Override // jh.eablkybsjg
    public boolean isInline() {
        return this.f66974yggfygwlhe.isInline();
    }

    @Override // jh.eablkybsjg
    public boolean jlmebxxoox() {
        return this.f66974yggfygwlhe.jlmebxxoox();
    }

    @Override // jh.eablkybsjg
    public boolean kcexrzcfyt() {
        return this.f66974yggfygwlhe.kcexrzcfyt();
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx kegysxyocb() {
        si.gtknphoqwx gtknphoqwxVarKegysxyocb = this.f66974yggfygwlhe.kegysxyocb();
        if (gtknphoqwxVarKegysxyocb == null) {
            igdgnonuha(28);
        }
        return gtknphoqwxVarKegysxyocb;
    }

    @Override // jh.dxjokdxxww
    public boolean lereixgezr() {
        return this.f66974yggfygwlhe.lereixgezr();
    }

    @Override // jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj xrmfcynszjVar = xrmfcynszj.f51348iobyxmoadg;
        if (xrmfcynszjVar == null) {
            igdgnonuha(29);
        }
        return xrmfcynszjVar;
    }

    @Override // mh.lereixgezr
    public si.gtknphoqwx metgxyhuhe(igdgnonuha igdgnonuhaVar, aj.lqeggnwhkg lqeggnwhkgVar) {
        if (igdgnonuhaVar == null) {
            igdgnonuha(5);
        }
        if (lqeggnwhkgVar == null) {
            igdgnonuha(6);
        }
        si.gtknphoqwx gtknphoqwxVarMetgxyhuhe = this.f66974yggfygwlhe.metgxyhuhe(igdgnonuhaVar, lqeggnwhkgVar);
        if (!this.f66972jyumaefscl.gtknphoqwx()) {
            return new si.zdlpuopuiu(gtknphoqwxVarMetgxyhuhe, ageimvtcrz());
        }
        if (gtknphoqwxVarMetgxyhuhe == null) {
            igdgnonuha(7);
        }
        return gtknphoqwxVarMetgxyhuhe;
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx ntlheqmsrt() {
        si.gtknphoqwx gtknphoqwxVarUawqvzlxes = uawqvzlxes(pi.eablkybsjg.oxmwwwfdhm(li.dxjokdxxww.lqeggnwhkg(this.f66974yggfygwlhe)));
        if (gtknphoqwxVarUawqvzlxes == null) {
            igdgnonuha(12);
        }
        return gtknphoqwxVarUawqvzlxes;
    }

    @Override // jh.eablkybsjg, jh.nufgyqmvbu
    public ikoacuggdj ojitshcjhn() {
        ikoacuggdj ikoacuggdjVarWflxmlrfwp = zi.ntlheqmsrt.wflxmlrfwp(zi.cqumvgiudr.f130013iobyxmoadg.iobyxmoadg(getAnnotations(), null, null), btonecajqb(), ageimvtcrz.lqeggnwhkg(btonecajqb().getParameters()), false, ntlheqmsrt());
        if (ikoacuggdjVarWflxmlrfwp == null) {
            igdgnonuha(16);
        }
        return ikoacuggdjVarWflxmlrfwp;
    }

    @Override // jh.eablkybsjg, jh.dxjokdxxww
    public List rgvfuqvkyq() {
        ageimvtcrz();
        List list = this.f66970esjtqupxsv;
        if (list == null) {
            igdgnonuha(30);
        }
        return list;
    }

    @Override // jh.eablkybsjg
    public List sopmlzcsov() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            igdgnonuha(17);
        }
        return listEmptyList;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.eablkybsjg(this, obj);
    }

    @Override // jh.eablkybsjg
    public bfopjjpdmp tzroggbefp() {
        bfopjjpdmp bfopjjpdmpVarTzroggbefp = this.f66974yggfygwlhe.tzroggbefp();
        if (bfopjjpdmpVarTzroggbefp == null) {
            return null;
        }
        return bfopjjpdmpVarTzroggbefp.zoijcleaow(new zoijcleaow());
    }

    @Override // mh.lereixgezr
    public si.gtknphoqwx uawqvzlxes(aj.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            igdgnonuha(13);
        }
        si.gtknphoqwx gtknphoqwxVarUawqvzlxes = this.f66974yggfygwlhe.uawqvzlxes(lqeggnwhkgVar);
        if (!this.f66972jyumaefscl.gtknphoqwx()) {
            return new si.zdlpuopuiu(gtknphoqwxVarUawqvzlxes, ageimvtcrz());
        }
        if (gtknphoqwxVarUawqvzlxes == null) {
            igdgnonuha(14);
        }
        return gtknphoqwxVarUawqvzlxes;
    }

    @Override // jh.istkbnxepw
    public boolean ulzqkzuiru() {
        return this.f66974yggfygwlhe.ulzqkzuiru();
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx uwvvkdfqfp() {
        si.gtknphoqwx gtknphoqwxVarUwvvkdfqfp = this.f66974yggfygwlhe.uwvvkdfqfp();
        if (gtknphoqwxVarUwvvkdfqfp == null) {
            igdgnonuha(15);
        }
        return gtknphoqwxVarUwvvkdfqfp;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.cdpycssgdh vdvldrhtss() {
        jh.cdpycssgdh cdpycssgdhVarVdvldrhtss = this.f66974yggfygwlhe.vdvldrhtss();
        if (cdpycssgdhVarVdvldrhtss == null) {
            igdgnonuha(26);
        }
        return cdpycssgdhVarVdvldrhtss;
    }

    @Override // jh.eablkybsjg
    public jh.eablkybsjg yfnezrywwk() {
        return this.f66974yggfygwlhe.yfnezrywwk();
    }

    @Override // jh.eablkybsjg, jh.agtfadlqog, jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = this.f66974yggfygwlhe.zoijcleaow();
        if (wflxmlrfwpVarZoijcleaow == null) {
            igdgnonuha(22);
        }
        return wflxmlrfwpVarZoijcleaow;
    }

    @Override // jh.wflxmlrfwp
    public jh.eablkybsjg iobyxmoadg() {
        jh.eablkybsjg eablkybsjgVarIobyxmoadg = this.f66974yggfygwlhe.iobyxmoadg();
        if (eablkybsjgVarIobyxmoadg == null) {
            igdgnonuha(21);
        }
        return eablkybsjgVarIobyxmoadg;
    }
}
