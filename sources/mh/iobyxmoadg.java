package mh;

import java.util.Collections;
import java.util.List;
import jh.uwvvkdfqfp;
import jh.vipkmwdibw;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.ageimvtcrz;
import zi.igdgnonuha;
import zi.ikoacuggdj;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends lereixgezr {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final yi.dxjokdxxww f67019cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final yi.dxjokdxxww f67020iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected final yi.dxjokdxxww f67021jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ii.gxszxtbevo f67022yggfygwlhe;

    /* JADX INFO: renamed from: mh.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1386iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: mh.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C1387iobyxmoadg implements tg.draadjrbmk {
            C1387iobyxmoadg() {
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public ikoacuggdj invoke(aj.lqeggnwhkg lqeggnwhkgVar) {
                jh.nufgyqmvbu nufgyqmvbuVarGxszxtbevo = lqeggnwhkgVar.gxszxtbevo(iobyxmoadg.this);
                if (nufgyqmvbuVarGxszxtbevo == null) {
                    return (ikoacuggdj) iobyxmoadg.this.f67021jyumaefscl.invoke();
                }
                if (nufgyqmvbuVarGxszxtbevo instanceof uwvvkdfqfp) {
                    return zi.ntlheqmsrt.ppxfxbqfkf((uwvvkdfqfp) nufgyqmvbuVarGxszxtbevo, ageimvtcrz.lqeggnwhkg(nufgyqmvbuVarGxszxtbevo.btonecajqb().getParameters()));
                }
                return nufgyqmvbuVarGxszxtbevo instanceof lereixgezr ? ageimvtcrz.jyumaefscl(nufgyqmvbuVarGxszxtbevo.btonecajqb().iobyxmoadg(lqeggnwhkgVar), ((lereixgezr) nufgyqmvbuVarGxszxtbevo).uawqvzlxes(lqeggnwhkgVar), this) : nufgyqmvbuVarGxszxtbevo.ojitshcjhn();
            }
        }

        C1386iobyxmoadg() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ikoacuggdj invoke() {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            return ageimvtcrz.yggfygwlhe(iobyxmoadgVar, iobyxmoadgVar.ntlheqmsrt(), new C1387iobyxmoadg());
        }
    }

    class ppxfxbqfkf implements tg.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public vipkmwdibw invoke() {
            return new zdlpuopuiu(iobyxmoadg.this);
        }
    }

    class zoijcleaow implements tg.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public si.gtknphoqwx invoke() {
            return new si.lqeggnwhkg(iobyxmoadg.this.ntlheqmsrt());
        }
    }

    public iobyxmoadg(yi.agtfadlqog agtfadlqogVar, ii.gxszxtbevo gxszxtbevoVar) {
        if (agtfadlqogVar == null) {
            igdgnonuha(0);
        }
        if (gxszxtbevoVar == null) {
            igdgnonuha(1);
        }
        this.f67022yggfygwlhe = gxszxtbevoVar;
        this.f67021jyumaefscl = agtfadlqogVar.wkgbmnqykc(new C1386iobyxmoadg());
        this.f67020iwizpuwonk = agtfadlqogVar.wkgbmnqykc(new zoijcleaow());
        this.f67019cqumvgiudr = agtfadlqogVar.wkgbmnqykc(new ppxfxbqfkf());
    }

    private static /* synthetic */ void igdgnonuha(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i13 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i13 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i13 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i13 == 19) {
            objArr[1] = "substitute";
        } else if (i13 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 6 && i13 != 9 && i13 != 12 && i13 != 14 && i13 != 16 && i13 != 17 && i13 != 19 && i13 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx bfopjjpdmp(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar == null) {
            igdgnonuha(15);
        }
        si.gtknphoqwx gtknphoqwxVarMetgxyhuhe = metgxyhuhe(igdgnonuhaVar, pi.eablkybsjg.oxmwwwfdhm(li.dxjokdxxww.lqeggnwhkg(this)));
        if (gtknphoqwxVarMetgxyhuhe == null) {
            igdgnonuha(16);
        }
        return gtknphoqwxVarMetgxyhuhe;
    }

    @Override // jh.eablkybsjg
    public vipkmwdibw fiwbwshyhd() {
        vipkmwdibw vipkmwdibwVar = (vipkmwdibw) this.f67019cqumvgiudr.invoke();
        if (vipkmwdibwVar == null) {
            igdgnonuha(5);
        }
        return vipkmwdibwVar;
    }

    @Override // jh.ylkuphrtab
    public ii.gxszxtbevo getName() {
        ii.gxszxtbevo gxszxtbevoVar = this.f67022yggfygwlhe;
        if (gxszxtbevoVar == null) {
            igdgnonuha(2);
        }
        return gxszxtbevoVar;
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx kegysxyocb() {
        si.gtknphoqwx gtknphoqwxVar = (si.gtknphoqwx) this.f67020iwizpuwonk.invoke();
        if (gtknphoqwxVar == null) {
            igdgnonuha(4);
        }
        return gtknphoqwxVar;
    }

    @Override // mh.lereixgezr
    public si.gtknphoqwx metgxyhuhe(igdgnonuha igdgnonuhaVar, aj.lqeggnwhkg lqeggnwhkgVar) {
        if (igdgnonuhaVar == null) {
            igdgnonuha(10);
        }
        if (lqeggnwhkgVar == null) {
            igdgnonuha(11);
        }
        if (!igdgnonuhaVar.gxszxtbevo()) {
            return new si.zdlpuopuiu(uawqvzlxes(lqeggnwhkgVar), wizcaqwiak.lqeggnwhkg(igdgnonuhaVar));
        }
        si.gtknphoqwx gtknphoqwxVarUawqvzlxes = uawqvzlxes(lqeggnwhkgVar);
        if (gtknphoqwxVarUawqvzlxes == null) {
            igdgnonuha(12);
        }
        return gtknphoqwxVarUawqvzlxes;
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx ntlheqmsrt() {
        si.gtknphoqwx gtknphoqwxVarUawqvzlxes = uawqvzlxes(pi.eablkybsjg.oxmwwwfdhm(li.dxjokdxxww.lqeggnwhkg(this)));
        if (gtknphoqwxVarUawqvzlxes == null) {
            igdgnonuha(17);
        }
        return gtknphoqwxVarUawqvzlxes;
    }

    @Override // jh.eablkybsjg, jh.nufgyqmvbu
    public ikoacuggdj ojitshcjhn() {
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) this.f67021jyumaefscl.invoke();
        if (ikoacuggdjVar == null) {
            igdgnonuha(20);
        }
        return ikoacuggdjVar;
    }

    @Override // jh.eablkybsjg
    public List sopmlzcsov() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            igdgnonuha(6);
        }
        return listEmptyList;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.eablkybsjg(this, obj);
    }

    @Override // jh.rlfsiqarku
    /* JADX INFO: renamed from: wizcaqwiak */
    public jh.eablkybsjg ppxfxbqfkf(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            igdgnonuha(18);
        }
        return wizcaqwiakVar.gtknphoqwx() ? this : new esjtqupxsv(this, wizcaqwiakVar);
    }

    @Override // jh.wflxmlrfwp
    public jh.eablkybsjg iobyxmoadg() {
        return this;
    }
}
