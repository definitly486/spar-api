package dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class sopmlzcsov extends ikoacuggdj implements ah.wkgbmnqykc, crxdokpmqz, b {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gg.gtknphoqwx f28334cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Class f28335iwizpuwonk;

    public final class iobyxmoadg extends ikoacuggdj.zoijcleaow {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f28336iwizpuwonk = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iobyxmoadg.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final e.iobyxmoadg f28337agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final gg.gtknphoqwx f28338btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final e.iobyxmoadg f28339draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final e.iobyxmoadg f28340dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final e.iobyxmoadg f28341eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final e.iobyxmoadg f28342gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final e.iobyxmoadg f28343gxszxtbevo;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private final e.iobyxmoadg f28345kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final e.iobyxmoadg f28346lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final e.iobyxmoadg f28347nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private final e.iobyxmoadg f28348ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private final e.iobyxmoadg f28349oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private final e.iobyxmoadg f28350rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private final e.iobyxmoadg f28351vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final e.iobyxmoadg f28352wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final e.iobyxmoadg f28353wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final e.iobyxmoadg f28354yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final e.iobyxmoadg f28355zdlpuopuiu;

        public iobyxmoadg() {
            super();
            this.f28353wkgbmnqykc = e.ppxfxbqfkf(new istkbnxepw(sopmlzcsov.this));
            this.f28341eablkybsjg = e.ppxfxbqfkf(new cllcsxoeiz(this));
            this.f28343gxszxtbevo = e.ppxfxbqfkf(new dsvhmnatus(sopmlzcsov.this, this));
            this.f28346lqeggnwhkg = e.ppxfxbqfkf(new wypolnanlu(sopmlzcsov.this));
            this.f28347nufgyqmvbu = e.ppxfxbqfkf(new stevsuqkhv(sopmlzcsov.this));
            this.f28340dxjokdxxww = e.ppxfxbqfkf(new kegysxyocb(this));
            this.f28338btonecajqb = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new tzroggbefp(this, sopmlzcsov.this));
            this.f28342gtknphoqwx = e.ppxfxbqfkf(new mbcevpiqjq(this, sopmlzcsov.this));
            this.f28339draadjrbmk = e.ppxfxbqfkf(new ntlheqmsrt(this, sopmlzcsov.this));
            this.f28352wflxmlrfwp = e.ppxfxbqfkf(new ulzqkzuiru(this));
            this.f28337agtfadlqog = e.ppxfxbqfkf(new cdpycssgdh(sopmlzcsov.this));
            this.f28348ojitshcjhn = e.ppxfxbqfkf(new yadqdtsiqt(sopmlzcsov.this));
            this.f28350rgvfuqvkyq = e.ppxfxbqfkf(new iozdgvuglv(sopmlzcsov.this));
            this.f28351vdvldrhtss = e.ppxfxbqfkf(new lmojexxdyd(sopmlzcsov.this));
            this.f28349oxmwwwfdhm = e.ppxfxbqfkf(new wwaezpbzkn(this));
            this.f28345kcexrzcfyt = e.ppxfxbqfkf(new ylkuphrtab(this));
            this.f28355zdlpuopuiu = e.ppxfxbqfkf(new pkzmftpjix(this));
            this.f28354yggfygwlhe = e.ppxfxbqfkf(new hcddaimhww(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List cdpycssgdh(iobyxmoadg iobyxmoadgVar) {
            return hg.jyumaefscl.ixidwrxhsl(iobyxmoadgVar.pkzmftpjix(), iobyxmoadgVar.hcddaimhww());
        }

        private final Collection cllcsxoeiz() {
            Object objZoijcleaow = this.f28351vdvldrhtss.zoijcleaow(this, f28336iwizpuwonk[12]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List cqumvgiudr(iobyxmoadg iobyxmoadgVar) {
            return hg.jyumaefscl.ixidwrxhsl(iobyxmoadgVar.wwaezpbzkn(), iobyxmoadgVar.ylkuphrtab());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List crxdokpmqz(iobyxmoadg iobyxmoadgVar, sopmlzcsov sopmlzcsovVar) {
            Collection<zi.kegysxyocb> collectionZoijcleaow = iobyxmoadgVar.jpowsppfya().btonecajqb().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionZoijcleaow.size());
            for (zi.kegysxyocb kegysxyocbVar : collectionZoijcleaow) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
                arrayList.add(new eslsurpljm(kegysxyocbVar, new jpowsppfya(kegysxyocbVar, iobyxmoadgVar, sopmlzcsovVar)));
            }
            if (!gh.dxjokdxxww.zeieaojujs(iobyxmoadgVar.jpowsppfya())) {
                if (arrayList.isEmpty()) {
                    zi.ikoacuggdj ikoacuggdjVarDxjokdxxww = pi.eablkybsjg.wflxmlrfwp(iobyxmoadgVar.jpowsppfya()).dxjokdxxww();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDxjokdxxww, "getAnyType(...)");
                    arrayList.add(new eslsurpljm(ikoacuggdjVarDxjokdxxww, hkdspvbjdz.f28222zdlpuopuiu));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jh.gxszxtbevo kind = li.dxjokdxxww.eablkybsjg(((eslsurpljm) it.next()).oxmwwwfdhm()).getKind();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kind, "getKind(...)");
                        if (kind == jh.gxszxtbevo.INTERFACE || kind == jh.gxszxtbevo.ANNOTATION_CLASS) {
                        }
                    }
                    zi.ikoacuggdj ikoacuggdjVarDxjokdxxww2 = pi.eablkybsjg.wflxmlrfwp(iobyxmoadgVar.jpowsppfya()).dxjokdxxww();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDxjokdxxww2, "getAnyType(...)");
                    arrayList.add(new eslsurpljm(ikoacuggdjVarDxjokdxxww2, hkdspvbjdz.f28222zdlpuopuiu));
                }
            }
            return jj.iobyxmoadg.ppxfxbqfkf(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List esjtqupxsv(iobyxmoadg iobyxmoadgVar) {
            return hg.jyumaefscl.ixidwrxhsl(iobyxmoadgVar.pkzmftpjix(), iobyxmoadgVar.hkdspvbjdz());
        }

        private final Collection hcddaimhww() {
            Object objZoijcleaow = this.f28348ojitshcjhn.zoijcleaow(this, f28336iwizpuwonk[10]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }

        private final Collection hkdspvbjdz() {
            Object objZoijcleaow = this.f28350rgvfuqvkyq.zoijcleaow(this, f28336iwizpuwonk[11]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection iozdgvuglv(sopmlzcsov sopmlzcsovVar) {
            return sopmlzcsovVar.ylkuphrtab(sopmlzcsovVar.vipkmwdibw(), ikoacuggdj.wkgbmnqykc.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List istkbnxepw(sopmlzcsov sopmlzcsovVar) {
            Collection collectionIozdgvuglv = sopmlzcsovVar.iozdgvuglv();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionIozdgvuglv, 10));
            Iterator it = collectionIozdgvuglv.iterator();
            while (it.hasNext()) {
                arrayList.add(new rlfsiqarku(sopmlzcsovVar, (jh.draadjrbmk) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type jlmebxxoox(zi.kegysxyocb kegysxyocbVar, iobyxmoadg iobyxmoadgVar, sopmlzcsov sopmlzcsovVar) {
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
            if (!(nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg)) {
                throw new c("Supertype not a class: " + nufgyqmvbuVarWkgbmnqykc);
            }
            Class clsVdvldrhtss = n.vdvldrhtss((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
            if (clsVdvldrhtss == null) {
                throw new c("Unsupported superclass of " + iobyxmoadgVar + ": " + nufgyqmvbuVarWkgbmnqykc);
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sopmlzcsovVar.zoijcleaow().getSuperclass(), clsVdvldrhtss)) {
                Type genericSuperclass = sopmlzcsovVar.zoijcleaow().getGenericSuperclass();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = sopmlzcsovVar.zoijcleaow().getInterfaces();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(interfaces, "getInterfaces(...)");
            int iRoivzttewh = hg.agtfadlqog.roivzttewh(interfaces, clsVdvldrhtss);
            if (iRoivzttewh >= 0) {
                Type type = sopmlzcsovVar.zoijcleaow().getGenericInterfaces()[iRoivzttewh];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(type);
                return type;
            }
            throw new c("No superclass of " + iobyxmoadgVar + " in Java reflection for " + nufgyqmvbuVarWkgbmnqykc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection kegysxyocb(sopmlzcsov sopmlzcsovVar) {
            return sopmlzcsovVar.ylkuphrtab(sopmlzcsovVar.vipkmwdibw(), ikoacuggdj.wkgbmnqykc.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List lereixgezr(iobyxmoadg iobyxmoadgVar) {
            return hg.jyumaefscl.ixidwrxhsl(iobyxmoadgVar.hcddaimhww(), iobyxmoadgVar.cllcsxoeiz());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh.eablkybsjg lmojexxdyd(sopmlzcsov sopmlzcsovVar) {
            ii.zoijcleaow zoijcleaowVarSopmlzcsov = sopmlzcsovVar.sopmlzcsov();
            oh.gtknphoqwx gtknphoqwxVarZoijcleaow = ((iobyxmoadg) sopmlzcsovVar.crxdokpmqz().getValue()).zoijcleaow();
            jh.eablkybsjg eablkybsjgVarZoijcleaow = (zoijcleaowVarSopmlzcsov.dxjokdxxww() && sopmlzcsovVar.zoijcleaow().isAnnotationPresent(Metadata.class)) ? gtknphoqwxVarZoijcleaow.iobyxmoadg().zoijcleaow(zoijcleaowVarSopmlzcsov) : jh.esjtqupxsv.zoijcleaow(gtknphoqwxVarZoijcleaow.zoijcleaow(), zoijcleaowVarSopmlzcsov);
            return eablkybsjgVarZoijcleaow == null ? sopmlzcsovVar.ntlheqmsrt(zoijcleaowVarSopmlzcsov, gtknphoqwxVarZoijcleaow) : eablkybsjgVarZoijcleaow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object mbcevpiqjq(iobyxmoadg iobyxmoadgVar, sopmlzcsov sopmlzcsovVar) throws IllegalAccessException {
            jh.eablkybsjg eablkybsjgVarJpowsppfya = iobyxmoadgVar.jpowsppfya();
            if (eablkybsjgVarJpowsppfya.getKind() != jh.gxszxtbevo.OBJECT) {
                return null;
            }
            Object obj = ((!eablkybsjgVarJpowsppfya.jlmebxxoox() || gh.eablkybsjg.iobyxmoadg(gh.wkgbmnqykc.f37385iobyxmoadg, eablkybsjgVarJpowsppfya)) ? sopmlzcsovVar.zoijcleaow().getDeclaredField("INSTANCE") : sopmlzcsovVar.zoijcleaow().getEnclosingClass().getDeclaredField(eablkybsjgVarJpowsppfya.getName().zoijcleaow())).get(null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ntlheqmsrt(sopmlzcsov sopmlzcsovVar) {
            if (sopmlzcsovVar.zoijcleaow().isAnonymousClass()) {
                return null;
            }
            ii.zoijcleaow zoijcleaowVarSopmlzcsov = sopmlzcsovVar.sopmlzcsov();
            if (zoijcleaowVarSopmlzcsov.dxjokdxxww()) {
                return null;
            }
            return zoijcleaowVarSopmlzcsov.iobyxmoadg().zoijcleaow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List pmvmpeiblj(iobyxmoadg iobyxmoadgVar) {
            return n.eablkybsjg(iobyxmoadgVar.jpowsppfya());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type ribwqtqdhb() {
            return Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String sopmlzcsov(sopmlzcsov sopmlzcsovVar, iobyxmoadg iobyxmoadgVar) {
            if (sopmlzcsovVar.zoijcleaow().isAnonymousClass()) {
                return null;
            }
            ii.zoijcleaow zoijcleaowVarSopmlzcsov = sopmlzcsovVar.sopmlzcsov();
            if (zoijcleaowVarSopmlzcsov.dxjokdxxww()) {
                return iobyxmoadgVar.zynmafqrjb(sopmlzcsovVar.zoijcleaow());
            }
            String strZoijcleaow = zoijcleaowVarSopmlzcsov.nufgyqmvbu().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            return strZoijcleaow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection stevsuqkhv(sopmlzcsov sopmlzcsovVar) {
            return sopmlzcsovVar.ylkuphrtab(sopmlzcsovVar.ribwqtqdhb(), ikoacuggdj.wkgbmnqykc.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List tzroggbefp(iobyxmoadg iobyxmoadgVar) {
            Collection collectionIobyxmoadg = si.agtfadlqog.iobyxmoadg.iobyxmoadg(iobyxmoadgVar.jpowsppfya().kegysxyocb(), null, null, 3, null);
            ArrayList<jh.wflxmlrfwp> arrayList = new ArrayList();
            for (Object obj : collectionIobyxmoadg) {
                if (!li.dxjokdxxww.zynmafqrjb((jh.wflxmlrfwp) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (jh.wflxmlrfwp wflxmlrfwpVar : arrayList) {
                jh.eablkybsjg eablkybsjgVar = wflxmlrfwpVar instanceof jh.eablkybsjg ? (jh.eablkybsjg) wflxmlrfwpVar : null;
                Class clsVdvldrhtss = eablkybsjgVar != null ? n.vdvldrhtss(eablkybsjgVar) : null;
                sopmlzcsov sopmlzcsovVar = clsVdvldrhtss != null ? new sopmlzcsov(clsVdvldrhtss) : null;
                if (sopmlzcsovVar != null) {
                    arrayList2.add(sopmlzcsovVar);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List ulzqkzuiru(iobyxmoadg iobyxmoadgVar) {
            Collection<jh.eablkybsjg> collectionEsjtqupxsv = iobyxmoadgVar.jpowsppfya().esjtqupxsv();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEsjtqupxsv, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (jh.eablkybsjg eablkybsjgVar : collectionEsjtqupxsv) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(eablkybsjgVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsVdvldrhtss = n.vdvldrhtss(eablkybsjgVar);
                sopmlzcsov sopmlzcsovVar = clsVdvldrhtss != null ? new sopmlzcsov(clsVdvldrhtss) : null;
                if (sopmlzcsovVar != null) {
                    arrayList.add(sopmlzcsovVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List vipkmwdibw(iobyxmoadg iobyxmoadgVar, sopmlzcsov sopmlzcsovVar) {
            List<jh.yfnezrywwk> listRgvfuqvkyq = iobyxmoadgVar.jpowsppfya().rgvfuqvkyq();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
            for (jh.yfnezrywwk yfnezrywwkVar : listRgvfuqvkyq) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
                arrayList.add(new a(sopmlzcsovVar, yfnezrywwkVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection yadqdtsiqt(sopmlzcsov sopmlzcsovVar) {
            return sopmlzcsovVar.ylkuphrtab(sopmlzcsovVar.ribwqtqdhb(), ikoacuggdj.wkgbmnqykc.DECLARED);
        }

        private final String zynmafqrjb(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(simpleName);
                return mj.kcexrzcfyt.c(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(simpleName);
                return mj.kcexrzcfyt.b(simpleName, '$', null, 2, null);
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(simpleName);
            return mj.kcexrzcfyt.c(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final String dsvhmnatus() {
            return (String) this.f28346lqeggnwhkg.zoijcleaow(this, f28336iwizpuwonk[3]);
        }

        public final jh.eablkybsjg jpowsppfya() {
            Object objZoijcleaow = this.f28353wkgbmnqykc.zoijcleaow(this, f28336iwizpuwonk[0]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (jh.eablkybsjg) objZoijcleaow;
        }

        public final Collection pkzmftpjix() {
            Object objZoijcleaow = this.f28337agtfadlqog.zoijcleaow(this, f28336iwizpuwonk[9]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }

        public final Collection wwaezpbzkn() {
            Object objZoijcleaow = this.f28349oxmwwwfdhm.zoijcleaow(this, f28336iwizpuwonk[13]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }

        public final String wypolnanlu() {
            return (String) this.f28343gxszxtbevo.zoijcleaow(this, f28336iwizpuwonk[2]);
        }

        public final Collection ylkuphrtab() {
            Object objZoijcleaow = this.f28345kcexrzcfyt.zoijcleaow(this, f28336iwizpuwonk[14]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (Collection) objZoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends si.gxszxtbevo {
        ppxfxbqfkf(mh.gtknphoqwx gtknphoqwxVar, yi.agtfadlqog agtfadlqogVar) {
            super(agtfadlqogVar, gtknphoqwxVar);
        }

        @Override // si.gxszxtbevo
        protected List btonecajqb() {
            return hg.jyumaefscl.wflxmlrfwp();
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.rgvfuqvkyq implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f28356zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(2);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(vi.hcddaimhww.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jh.crxdokpmqz invoke(vi.hcddaimhww p13, di.agtfadlqog p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return p13.yggfygwlhe(p14);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f28357iobyxmoadg;

        static {
            int[] iArr = new int[ci.iobyxmoadg.EnumC0363iobyxmoadg.values().length];
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f28357iobyxmoadg = iArr;
        }
    }

    public sopmlzcsov(Class jClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
        this.f28335iwizpuwonk = jClass;
        this.f28334cqumvgiudr = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new zynmafqrjb(this));
    }

    private final jh.eablkybsjg mbcevpiqjq(ii.zoijcleaow zoijcleaowVar, oh.gtknphoqwx gtknphoqwxVar) {
        mh.gtknphoqwx gtknphoqwxVar2 = new mh.gtknphoqwx(new mh.rgvfuqvkyq(gtknphoqwxVar.zoijcleaow(), zoijcleaowVar.gxszxtbevo()), zoijcleaowVar.nufgyqmvbu(), jh.cdpycssgdh.FINAL, jh.gxszxtbevo.CLASS, hg.jyumaefscl.eablkybsjg(gtknphoqwxVar.zoijcleaow().wflxmlrfwp().nufgyqmvbu().ojitshcjhn()), jh.xrmfcynszj.f51348iobyxmoadg, false, gtknphoqwxVar.iobyxmoadg().yggfygwlhe());
        gtknphoqwxVar2.ageimvtcrz(new ppxfxbqfkf(gtknphoqwxVar2, gtknphoqwxVar.iobyxmoadg().yggfygwlhe()), hg.ikoacuggdj.eablkybsjg(), null);
        return gtknphoqwxVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jh.eablkybsjg ntlheqmsrt(ii.zoijcleaow zoijcleaowVar, oh.gtknphoqwx gtknphoqwxVar) {
        ci.iobyxmoadg iobyxmoadgVarGxszxtbevo;
        if (zoijcleaow().isSynthetic()) {
            return mbcevpiqjq(zoijcleaowVar, gtknphoqwxVar);
        }
        oh.gxszxtbevo gxszxtbevoVarIobyxmoadg = oh.gxszxtbevo.f72850ppxfxbqfkf.iobyxmoadg(zoijcleaow());
        ci.iobyxmoadg.EnumC0363iobyxmoadg enumC0363iobyxmoadgPpxfxbqfkf = (gxszxtbevoVarIobyxmoadg == null || (iobyxmoadgVarGxszxtbevo = gxszxtbevoVarIobyxmoadg.gxszxtbevo()) == null) ? null : iobyxmoadgVarGxszxtbevo.ppxfxbqfkf();
        switch (enumC0363iobyxmoadgPpxfxbqfkf == null ? -1 : zoijcleaow.f28357iobyxmoadg[enumC0363iobyxmoadgPpxfxbqfkf.ordinal()]) {
            case -1:
            case 6:
                throw new c("Unresolved class: " + zoijcleaow() + " (kind = " + enumC0363iobyxmoadgPpxfxbqfkf + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return mbcevpiqjq(zoijcleaowVar, gtknphoqwxVar);
            case 5:
                throw new c("Unknown class: " + zoijcleaow() + " (kind = " + enumC0363iobyxmoadgPpxfxbqfkf + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ii.zoijcleaow sopmlzcsov() {
        return j.f28254iobyxmoadg.ppxfxbqfkf(zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iobyxmoadg ulzqkzuiru(sopmlzcsov sopmlzcsovVar) {
        return sopmlzcsovVar.new iobyxmoadg();
    }

    public final gg.gtknphoqwx crxdokpmqz() {
        return this.f28334cqumvgiudr;
    }

    public boolean equals(Object obj) {
        return (obj instanceof sopmlzcsov) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sg.iobyxmoadg.ppxfxbqfkf(this), sg.iobyxmoadg.ppxfxbqfkf((ah.wkgbmnqykc) obj));
    }

    @Override // ah.wkgbmnqykc
    public int hashCode() {
        return sg.iobyxmoadg.ppxfxbqfkf(this).hashCode();
    }

    @Override // dh.ikoacuggdj
    public Collection hcddaimhww(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        si.gtknphoqwx gtknphoqwxVarRibwqtqdhb = ribwqtqdhb();
        rh.wkgbmnqykc wkgbmnqykcVar = rh.wkgbmnqykc.FROM_REFLECTION;
        return hg.jyumaefscl.ixidwrxhsl(gtknphoqwxVarRibwqtqdhb.zoijcleaow(name, wkgbmnqykcVar), vipkmwdibw().zoijcleaow(name, wkgbmnqykcVar));
    }

    @Override // dh.ikoacuggdj
    public Collection iozdgvuglv() {
        jh.eablkybsjg eablkybsjgVarIobyxmoadg = iobyxmoadg();
        if (eablkybsjgVarIobyxmoadg.getKind() == jh.gxszxtbevo.INTERFACE || eablkybsjgVarIobyxmoadg.getKind() == jh.gxszxtbevo.OBJECT) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Collection collectionGtknphoqwx = eablkybsjgVarIobyxmoadg.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionGtknphoqwx, "getConstructors(...)");
        return collectionGtknphoqwx;
    }

    @Override // dh.crxdokpmqz
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public jh.eablkybsjg iobyxmoadg() {
        return ((iobyxmoadg) this.f28334cqumvgiudr.getValue()).jpowsppfya();
    }

    @Override // ah.wkgbmnqykc
    public String jyumaefscl() {
        return ((iobyxmoadg) this.f28334cqumvgiudr.getValue()).wypolnanlu();
    }

    @Override // ah.wkgbmnqykc
    public boolean kcexrzcfyt() {
        return iobyxmoadg().kcexrzcfyt();
    }

    @Override // dh.ikoacuggdj
    public Collection lmojexxdyd(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        si.gtknphoqwx gtknphoqwxVarRibwqtqdhb = ribwqtqdhb();
        rh.wkgbmnqykc wkgbmnqykcVar = rh.wkgbmnqykc.FROM_REFLECTION;
        return hg.jyumaefscl.ixidwrxhsl(gtknphoqwxVarRibwqtqdhb.wkgbmnqykc(name, wkgbmnqykcVar), vipkmwdibw().wkgbmnqykc(name, wkgbmnqykcVar));
    }

    public final si.gtknphoqwx ribwqtqdhb() {
        return iobyxmoadg().ojitshcjhn().agtfadlqog();
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("class ");
        ii.zoijcleaow zoijcleaowVarSopmlzcsov = sopmlzcsov();
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = zoijcleaowVarSopmlzcsov.gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
            str = "";
        } else {
            str = ppxfxbqfkfVarGxszxtbevo.zoijcleaow() + '.';
        }
        String strZoijcleaow = zoijcleaowVarSopmlzcsov.lqeggnwhkg().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        sb3.append(str + mj.kcexrzcfyt.pkzmftpjix(strZoijcleaow, '.', '$', false, 4, null));
        return sb3.toString();
    }

    public final si.gtknphoqwx vipkmwdibw() {
        si.gtknphoqwx gtknphoqwxVarUwvvkdfqfp = iobyxmoadg().uwvvkdfqfp();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarUwvvkdfqfp, "getStaticScope(...)");
        return gtknphoqwxVarUwvvkdfqfp;
    }

    @Override // dh.ikoacuggdj
    public jh.crxdokpmqz wwaezpbzkn(int i13) {
        Class<?> declaringClass;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow().getSimpleName(), "DefaultImpls") && (declaringClass = zoijcleaow().getDeclaringClass()) != null && declaringClass.isInterface()) {
            ah.wkgbmnqykc wkgbmnqykcVarEablkybsjg = sg.iobyxmoadg.eablkybsjg(declaringClass);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarEablkybsjg, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((sopmlzcsov) wkgbmnqykcVarEablkybsjg).wwaezpbzkn(i13);
        }
        jh.eablkybsjg eablkybsjgVarIobyxmoadg = iobyxmoadg();
        xi.wflxmlrfwp wflxmlrfwpVar = eablkybsjgVarIobyxmoadg instanceof xi.wflxmlrfwp ? (xi.wflxmlrfwp) eablkybsjgVarIobyxmoadg : null;
        if (wflxmlrfwpVar == null) {
            return null;
        }
        di.ppxfxbqfkf ppxfxbqfkfVarH = wflxmlrfwpVar.h();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo classLocalVariable = gi.iobyxmoadg.f37408btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(classLocalVariable, "classLocalVariable");
        di.agtfadlqog agtfadlqogVar = (di.agtfadlqog) fi.eablkybsjg.zoijcleaow(ppxfxbqfkfVarH, classLocalVariable, i13);
        if (agtfadlqogVar != null) {
            return (jh.crxdokpmqz) n.nufgyqmvbu(zoijcleaow(), agtfadlqogVar, wflxmlrfwpVar.g().lqeggnwhkg(), wflxmlrfwpVar.g().btonecajqb(), wflxmlrfwpVar.j(), wkgbmnqykc.f28356zdlpuopuiu);
        }
        return null;
    }

    @Override // ah.wkgbmnqykc
    public String yggfygwlhe() {
        return ((iobyxmoadg) this.f28334cqumvgiudr.getValue()).dsvhmnatus();
    }

    @Override // ah.wkgbmnqykc
    public boolean zdlpuopuiu(Object obj) {
        Integer numLqeggnwhkg = ph.gxszxtbevo.lqeggnwhkg(zoijcleaow());
        if (numLqeggnwhkg != null) {
            return kotlin.jvm.internal.mbcevpiqjq.gtknphoqwx(obj, numLqeggnwhkg.intValue());
        }
        Class clsGtknphoqwx = ph.gxszxtbevo.gtknphoqwx(zoijcleaow());
        if (clsGtknphoqwx == null) {
            clsGtknphoqwx = zoijcleaow();
        }
        return clsGtknphoqwx.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.nufgyqmvbu
    public Class zoijcleaow() {
        return this.f28335iwizpuwonk;
    }
}
