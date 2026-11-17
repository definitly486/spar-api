package dh;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class roivzttewh implements ah.btonecajqb {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f28324esjtqupxsv = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(roivzttewh.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(roivzttewh.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final e.iobyxmoadg f28325cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final e.iobyxmoadg f28326iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ah.btonecajqb.iobyxmoadg f28327jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f28328yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final pmvmpeiblj f28329zdlpuopuiu;

    private static final class iobyxmoadg implements Type {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f28330yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type[] f28331zdlpuopuiu;

        public iobyxmoadg(Type[] types) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
            this.f28331zdlpuopuiu = types;
            this.f28330yggfygwlhe = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof iobyxmoadg) && Arrays.equals(this.f28331zdlpuopuiu, ((iobyxmoadg) obj).f28331zdlpuopuiu);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return hg.agtfadlqog.wizcaqwiak(this.f28331zdlpuopuiu, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f28330yggfygwlhe;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public roivzttewh(pmvmpeiblj callable, int i13, ah.btonecajqb.iobyxmoadg kind, tg.iobyxmoadg computeDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callable, "callable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(computeDescriptor, "computeDescriptor");
        this.f28329zdlpuopuiu = callable;
        this.f28328yggfygwlhe = i13;
        this.f28327jyumaefscl = kind;
        this.f28326iwizpuwonk = e.ppxfxbqfkf(computeDescriptor);
        this.f28325cqumvgiudr = e.ppxfxbqfkf(new nuxfzjnpeb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List eablkybsjg(roivzttewh roivzttewhVar) {
        return n.eablkybsjg(roivzttewhVar.gtknphoqwx());
    }

    private final jh.ntlheqmsrt gtknphoqwx() {
        Object objZoijcleaow = this.f28326iwizpuwonk.zoijcleaow(this, f28324esjtqupxsv[0]);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
        return (jh.ntlheqmsrt) objZoijcleaow;
    }

    private final Type gxszxtbevo(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new iobyxmoadg(typeArr) : (Type) hg.agtfadlqog.ixidwrxhsl(typeArr);
        }
        throw new sg.zoijcleaow("Expected at least 1 type for compound type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type iobyxmoadg(roivzttewh roivzttewhVar) {
        List listA;
        jh.ntlheqmsrt ntlheqmsrtVarGtknphoqwx = roivzttewhVar.gtknphoqwx();
        if ((ntlheqmsrtVarGtknphoqwx instanceof jh.vipkmwdibw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n.dxjokdxxww(roivzttewhVar.f28329zdlpuopuiu.sopmlzcsov()), ntlheqmsrtVarGtknphoqwx) && roivzttewhVar.f28329zdlpuopuiu.sopmlzcsov().getKind() == jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE) {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = roivzttewhVar.f28329zdlpuopuiu.sopmlzcsov().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsVdvldrhtss = n.vdvldrhtss((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow);
            if (clsVdvldrhtss != null) {
                return clsVdvldrhtss;
            }
            throw new c("Cannot determine receiver Java type of inherited declaration: " + ntlheqmsrtVarGtknphoqwx);
        }
        eh.nufgyqmvbu nufgyqmvbuVarDsvhmnatus = roivzttewhVar.f28329zdlpuopuiu.dsvhmnatus();
        if (!(nufgyqmvbuVarDsvhmnatus instanceof eh.agtfadlqog)) {
            if (!(nufgyqmvbuVarDsvhmnatus instanceof eh.agtfadlqog.zoijcleaow)) {
                return (Type) nufgyqmvbuVarDsvhmnatus.iobyxmoadg().get(roivzttewhVar.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((eh.agtfadlqog.zoijcleaow) nufgyqmvbuVarDsvhmnatus).wkgbmnqykc().get(roivzttewhVar.getIndex())).toArray(new Class[0]);
            return roivzttewhVar.gxszxtbevo((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (roivzttewhVar.f28329zdlpuopuiu.ntlheqmsrt()) {
            eh.agtfadlqog agtfadlqogVar = (eh.agtfadlqog) nufgyqmvbuVarDsvhmnatus;
            zg.btonecajqb btonecajqbVarGxszxtbevo = agtfadlqogVar.gxszxtbevo(roivzttewhVar.getIndex() + 1);
            int iEablkybsjg = agtfadlqogVar.gxszxtbevo(0).eablkybsjg() + 1;
            listA = hg.jyumaefscl.a(agtfadlqogVar.iobyxmoadg(), new zg.btonecajqb(btonecajqbVarGxszxtbevo.wkgbmnqykc() - iEablkybsjg, btonecajqbVarGxszxtbevo.eablkybsjg() - iEablkybsjg));
        } else {
            eh.agtfadlqog agtfadlqogVar2 = (eh.agtfadlqog) nufgyqmvbuVarDsvhmnatus;
            listA = hg.jyumaefscl.a(agtfadlqogVar2.iobyxmoadg(), agtfadlqogVar2.gxszxtbevo(roivzttewhVar.getIndex()));
        }
        Type[] typeArr = (Type[]) listA.toArray(new Type[0]);
        return roivzttewhVar.gxszxtbevo((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    @Override // ah.btonecajqb
    public boolean btonecajqb() {
        jh.ntlheqmsrt ntlheqmsrtVarGtknphoqwx = gtknphoqwx();
        return (ntlheqmsrtVarGtknphoqwx instanceof jh.iyctptxqzt) && ((jh.iyctptxqzt) ntlheqmsrtVarGtknphoqwx).iyctptxqzt() != null;
    }

    @Override // ah.btonecajqb
    public boolean cqumvgiudr() {
        jh.ntlheqmsrt ntlheqmsrtVarGtknphoqwx = gtknphoqwx();
        jh.iyctptxqzt iyctptxqztVar = ntlheqmsrtVarGtknphoqwx instanceof jh.iyctptxqzt ? (jh.iyctptxqzt) ntlheqmsrtVarGtknphoqwx : null;
        if (iyctptxqztVar != null) {
            return pi.eablkybsjg.gxszxtbevo(iyctptxqztVar);
        }
        return false;
    }

    public final pmvmpeiblj dxjokdxxww() {
        return this.f28329zdlpuopuiu;
    }

    public boolean equals(Object obj) {
        if (obj instanceof roivzttewh) {
            roivzttewh roivzttewhVar = (roivzttewh) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28329zdlpuopuiu, roivzttewhVar.f28329zdlpuopuiu) && getIndex() == roivzttewhVar.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // ah.btonecajqb
    public int getIndex() {
        return this.f28328yggfygwlhe;
    }

    @Override // ah.btonecajqb
    public ah.btonecajqb.iobyxmoadg getKind() {
        return this.f28327jyumaefscl;
    }

    @Override // ah.btonecajqb
    public String getName() {
        jh.ntlheqmsrt ntlheqmsrtVarGtknphoqwx = gtknphoqwx();
        jh.iyctptxqzt iyctptxqztVar = ntlheqmsrtVarGtknphoqwx instanceof jh.iyctptxqzt ? (jh.iyctptxqzt) ntlheqmsrtVarGtknphoqwx : null;
        if (iyctptxqztVar == null || iyctptxqztVar.zoijcleaow().jztzpxfvev()) {
            return null;
        }
        ii.gxszxtbevo name = iyctptxqztVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        if (name.lqeggnwhkg()) {
            return null;
        }
        return name.zoijcleaow();
    }

    @Override // ah.btonecajqb
    public ah.ojitshcjhn getType() {
        zi.kegysxyocb type = gtknphoqwx().getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return new eslsurpljm(type, new tbqsvytpvh(this));
    }

    public int hashCode() {
        return (this.f28329zdlpuopuiu.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public String toString() {
        return i.f28226iobyxmoadg.btonecajqb(this);
    }
}
