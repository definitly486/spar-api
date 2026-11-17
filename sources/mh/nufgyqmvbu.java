package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jh.czzsidtyhn;
import jh.xrmfcynszj;
import jh.yfnezrywwk;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.ikoacuggdj;
import zi.mhtqkkgtqm;
import zi.opjhrmiecq;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends agtfadlqog implements yfnezrywwk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final mhtqkkgtqm f67127cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f67128esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final yi.agtfadlqog f67129istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f67130lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final yi.dxjokdxxww f67131pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final yi.dxjokdxxww f67132zynmafqrjb;

    class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ czzsidtyhn f67134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yi.agtfadlqog f67135zdlpuopuiu;

        iobyxmoadg(yi.agtfadlqog agtfadlqogVar, czzsidtyhn czzsidtyhnVar) {
            this.f67135zdlpuopuiu = agtfadlqogVar;
            this.f67134yggfygwlhe = czzsidtyhnVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public zeieaojujs invoke() {
            return new ppxfxbqfkf(nufgyqmvbu.this, this.f67135zdlpuopuiu, this.f67134yggfygwlhe);
        }
    }

    private class ppxfxbqfkf extends zi.rgvfuqvkyq {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f67136eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final czzsidtyhn f67137wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, yi.agtfadlqog agtfadlqogVar, czzsidtyhn czzsidtyhnVar) {
            super(agtfadlqogVar);
            if (agtfadlqogVar == null) {
                wwaezpbzkn(0);
            }
            this.f67136eablkybsjg = nufgyqmvbuVar;
            this.f67137wkgbmnqykc = czzsidtyhnVar;
        }

        private static /* synthetic */ void wwaezpbzkn(int i13) {
            String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? 2 : 3];
            switch (i13) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i13 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i13 == 2) {
                objArr[1] = "getParameters";
            } else if (i13 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i13 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i13 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i13 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i13) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // zi.rgvfuqvkyq
        protected List cqumvgiudr(List list) {
            if (list == null) {
                wwaezpbzkn(7);
            }
            List listWizcaqwiak = this.f67136eablkybsjg.wizcaqwiak(list);
            if (listWizcaqwiak == null) {
                wwaezpbzkn(8);
            }
            return listWizcaqwiak;
        }

        @Override // zi.zeieaojujs
        public boolean eablkybsjg() {
            return true;
        }

        @Override // zi.zeieaojujs
        public List getParameters() {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                wwaezpbzkn(2);
            }
            return listEmptyList;
        }

        @Override // zi.rgvfuqvkyq
        protected czzsidtyhn jyumaefscl() {
            czzsidtyhn czzsidtyhnVar = this.f67137wkgbmnqykc;
            if (czzsidtyhnVar == null) {
                wwaezpbzkn(5);
            }
            return czzsidtyhnVar;
        }

        @Override // zi.rgvfuqvkyq
        protected zi.kegysxyocb kcexrzcfyt() {
            return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16434cllcsxoeiz, new String[0]);
        }

        @Override // zi.rgvfuqvkyq
        protected void lereixgezr(zi.kegysxyocb kegysxyocbVar) {
            if (kegysxyocbVar == null) {
                wwaezpbzkn(6);
            }
            this.f67136eablkybsjg.ageimvtcrz(kegysxyocbVar);
        }

        @Override // zi.jyumaefscl
        protected boolean nufgyqmvbu(jh.nufgyqmvbu nufgyqmvbuVar) {
            if (nufgyqmvbuVar == null) {
                wwaezpbzkn(9);
            }
            return (nufgyqmvbuVar instanceof yfnezrywwk) && li.lqeggnwhkg.f62603iobyxmoadg.wflxmlrfwp(this.f67136eablkybsjg, (yfnezrywwk) nufgyqmvbuVar, true);
        }

        @Override // zi.rgvfuqvkyq
        protected Collection oxmwwwfdhm() {
            List listFyldjkxazc = this.f67136eablkybsjg.fyldjkxazc();
            if (listFyldjkxazc == null) {
                wwaezpbzkn(1);
            }
            return listFyldjkxazc;
        }

        public String toString() {
            return this.f67136eablkybsjg.getName().toString();
        }

        @Override // zi.zeieaojujs
        public gh.dxjokdxxww wflxmlrfwp() {
            gh.dxjokdxxww dxjokdxxwwVarWflxmlrfwp = pi.eablkybsjg.wflxmlrfwp(this.f67136eablkybsjg);
            if (dxjokdxxwwVarWflxmlrfwp == null) {
                wwaezpbzkn(4);
            }
            return dxjokdxxwwVarWflxmlrfwp;
        }

        @Override // zi.jyumaefscl, zi.zeieaojujs
        /* JADX INFO: renamed from: wkgbmnqykc */
        public jh.nufgyqmvbu ylkuphrtab() {
            nufgyqmvbu nufgyqmvbuVar = this.f67136eablkybsjg;
            if (nufgyqmvbuVar == null) {
                wwaezpbzkn(3);
            }
            return nufgyqmvbuVar;
        }
    }

    class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ii.gxszxtbevo f67139zdlpuopuiu;

        class iobyxmoadg implements tg.iobyxmoadg {
            iobyxmoadg() {
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public si.gtknphoqwx invoke() {
                return si.cqumvgiudr.wflxmlrfwp("Scope for type parameter " + zoijcleaow.this.f67139zdlpuopuiu.zoijcleaow(), nufgyqmvbu.this.getUpperBounds());
            }
        }

        zoijcleaow(ii.gxszxtbevo gxszxtbevoVar) {
            this.f67139zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ikoacuggdj invoke() {
            return zi.ntlheqmsrt.wflxmlrfwp(opjhrmiecq.f130109yggfygwlhe.btonecajqb(), nufgyqmvbu.this.btonecajqb(), Collections.emptyList(), false, new si.dxjokdxxww(new iobyxmoadg()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected nufgyqmvbu(yi.agtfadlqog agtfadlqogVar, jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, mhtqkkgtqm mhtqkkgtqmVar, boolean z13, int i13, xrmfcynszj xrmfcynszjVar, czzsidtyhn czzsidtyhnVar) {
        super(wflxmlrfwpVar, nufgyqmvbuVar, gxszxtbevoVar, xrmfcynszjVar);
        if (agtfadlqogVar == null) {
            metgxyhuhe(0);
        }
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(1);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(2);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(3);
        }
        if (mhtqkkgtqmVar == null) {
            metgxyhuhe(4);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(5);
        }
        if (czzsidtyhnVar == null) {
            metgxyhuhe(6);
        }
        this.f67127cqumvgiudr = mhtqkkgtqmVar;
        this.f67128esjtqupxsv = z13;
        this.f67130lereixgezr = i13;
        this.f67131pmvmpeiblj = agtfadlqogVar.wkgbmnqykc(new iobyxmoadg(agtfadlqogVar, czzsidtyhnVar));
        this.f67132zynmafqrjb = agtfadlqogVar.wkgbmnqykc(new zoijcleaow(gxszxtbevoVar));
        this.f67129istkbnxepw = agtfadlqogVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i14 = 2;
                break;
            case 12:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i13) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected abstract void ageimvtcrz(zi.kegysxyocb kegysxyocbVar);

    @Override // jh.yfnezrywwk, jh.nufgyqmvbu
    public final zeieaojujs btonecajqb() {
        zeieaojujs zeieaojujsVar = (zeieaojujs) this.f67131pmvmpeiblj.invoke();
        if (zeieaojujsVar == null) {
            metgxyhuhe(9);
        }
        return zeieaojujsVar;
    }

    @Override // jh.yfnezrywwk
    public boolean cqumvgiudr() {
        return this.f67128esjtqupxsv;
    }

    @Override // jh.yfnezrywwk
    public mhtqkkgtqm draadjrbmk() {
        mhtqkkgtqm mhtqkkgtqmVar = this.f67127cqumvgiudr;
        if (mhtqkkgtqmVar == null) {
            metgxyhuhe(7);
        }
        return mhtqkkgtqmVar;
    }

    @Override // jh.yfnezrywwk
    public boolean dsvhmnatus() {
        return false;
    }

    protected abstract List fyldjkxazc();

    @Override // jh.yfnezrywwk
    public int getIndex() {
        return this.f67130lereixgezr;
    }

    @Override // jh.yfnezrywwk
    public yi.agtfadlqog getStorageManager() {
        yi.agtfadlqog agtfadlqogVar = this.f67129istkbnxepw;
        if (agtfadlqogVar == null) {
            metgxyhuhe(14);
        }
        return agtfadlqogVar;
    }

    @Override // jh.yfnezrywwk
    public List getUpperBounds() {
        List listZoijcleaow = ((ppxfxbqfkf) btonecajqb()).zoijcleaow();
        if (listZoijcleaow == null) {
            metgxyhuhe(8);
        }
        return listZoijcleaow;
    }

    @Override // jh.nufgyqmvbu
    public ikoacuggdj ojitshcjhn() {
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) this.f67132zynmafqrjb.invoke();
        if (ikoacuggdjVar == null) {
            metgxyhuhe(10);
        }
        return ikoacuggdjVar;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.btonecajqb(this, obj);
    }

    protected List wizcaqwiak(List list) {
        if (list == null) {
            metgxyhuhe(12);
        }
        if (list == null) {
            metgxyhuhe(13);
        }
        return list;
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    public yfnezrywwk iobyxmoadg() {
        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) super.iobyxmoadg();
        if (yfnezrywwkVar == null) {
            metgxyhuhe(11);
        }
        return yfnezrywwkVar;
    }
}
