package dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class rlfsiqarku extends pmvmpeiblj implements kotlin.jvm.internal.ojitshcjhn, ah.lqeggnwhkg, draadjrbmk {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f28317iozdgvuglv = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(rlfsiqarku.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gg.gtknphoqwx f28318cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final e.iobyxmoadg f28319istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ikoacuggdj f28320lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f28321pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f28322yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Object f28323zynmafqrjb;

    /* synthetic */ rlfsiqarku(ikoacuggdj ikoacuggdjVar, String str, String str2, jh.lereixgezr lereixgezrVar, Object obj, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(ikoacuggdjVar, str, str2, lereixgezrVar, (i13 & 16) != 0 ? kotlin.jvm.internal.gxszxtbevo.NO_RECEIVER : obj);
    }

    private final jh.lereixgezr czzsidtyhn(jh.lereixgezr lereixgezrVar) {
        Object next;
        List listDxjokdxxww = lereixgezrVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        if (listDxjokdxxww == null || !listDxjokdxxww.isEmpty()) {
            Iterator it = listDxjokdxxww.iterator();
            while (it.hasNext()) {
                if (((jh.iyctptxqzt) it.next()).auzgnhcxok()) {
                    return null;
                }
            }
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = lereixgezrVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
        if (!li.gtknphoqwx.lqeggnwhkg(wflxmlrfwpVarZoijcleaow)) {
            return null;
        }
        Member memberZoijcleaow = dsvhmnatus().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(memberZoijcleaow);
        if (!Modifier.isStatic(memberZoijcleaow.getModifiers())) {
            return null;
        }
        Iterator it2 = pi.eablkybsjg.lereixgezr(lereixgezrVar, false).iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            List listDxjokdxxww2 = ((jh.zoijcleaow) next).dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
            if (listDxjokdxxww2 == null || !listDxjokdxxww2.isEmpty()) {
                Iterator it3 = listDxjokdxxww2.iterator();
                while (it3.hasNext()) {
                    if (((jh.iyctptxqzt) it3.next()).auzgnhcxok()) {
                        break loop0;
                    }
                }
            }
        }
        if (next instanceof jh.lereixgezr) {
            return (jh.lereixgezr) next;
        }
        return null;
    }

    private final eh.dxjokdxxww.nufgyqmvbu ikoacuggdj(Method method) {
        return ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.zoijcleaow(method) : new eh.dxjokdxxww.nufgyqmvbu.gxszxtbevo(method);
    }

    private final eh.dxjokdxxww.nufgyqmvbu jhduphickx(Method method) {
        return ntlheqmsrt() ? new eh.dxjokdxxww.nufgyqmvbu.iobyxmoadg(method, metgxyhuhe()) : new eh.dxjokdxxww.nufgyqmvbu.eablkybsjg(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    public static final eh.nufgyqmvbu jztzpxfvev(rlfsiqarku rlfsiqarkuVar) {
        GenericDeclaration genericDeclarationOxmwwwfdhm;
        eh.dxjokdxxww dxjokdxxwwVarOkpsazkaxt;
        j jVar = j.f28254iobyxmoadg;
        agtfadlqog agtfadlqogVarLqeggnwhkg = jVar.lqeggnwhkg(rlfsiqarkuVar.sopmlzcsov());
        if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.eablkybsjg) {
            jh.lereixgezr lereixgezrVarSopmlzcsov = rlfsiqarkuVar.sopmlzcsov();
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = lereixgezrVarSopmlzcsov.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
            if (li.gtknphoqwx.wkgbmnqykc(wflxmlrfwpVarZoijcleaow) && (lereixgezrVarSopmlzcsov instanceof jh.draadjrbmk) && ((jh.draadjrbmk) lereixgezrVarSopmlzcsov).vipkmwdibw()) {
                throw new c(rlfsiqarkuVar.sopmlzcsov().zoijcleaow() + " cannot have default arguments");
            }
            jh.lereixgezr lereixgezrVarCzzsidtyhn = rlfsiqarkuVar.czzsidtyhn(rlfsiqarkuVar.sopmlzcsov());
            if (lereixgezrVarCzzsidtyhn != null) {
                agtfadlqog agtfadlqogVarLqeggnwhkg2 = jVar.lqeggnwhkg(lereixgezrVarCzzsidtyhn);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(agtfadlqogVarLqeggnwhkg2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                agtfadlqog.eablkybsjg eablkybsjgVar = (agtfadlqog.eablkybsjg) agtfadlqogVarLqeggnwhkg2;
                genericDeclarationOxmwwwfdhm = rlfsiqarkuVar.wypolnanlu().iwizpuwonk(eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.zoijcleaow(), true);
            } else {
                ikoacuggdj ikoacuggdjVarWypolnanlu = rlfsiqarkuVar.wypolnanlu();
                agtfadlqog.eablkybsjg eablkybsjgVar2 = (agtfadlqog.eablkybsjg) agtfadlqogVarLqeggnwhkg;
                String strPpxfxbqfkf = eablkybsjgVar2.ppxfxbqfkf();
                String strZoijcleaow = eablkybsjgVar2.zoijcleaow();
                Member memberZoijcleaow = rlfsiqarkuVar.dsvhmnatus().zoijcleaow();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(memberZoijcleaow);
                genericDeclarationOxmwwwfdhm = ikoacuggdjVarWypolnanlu.iwizpuwonk(strPpxfxbqfkf, strZoijcleaow, !Modifier.isStatic(memberZoijcleaow.getModifiers()));
            }
        } else if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.wkgbmnqykc) {
            if (rlfsiqarkuVar.mbcevpiqjq()) {
                Class clsZoijcleaow = rlfsiqarkuVar.wypolnanlu().zoijcleaow();
                List parameters = rlfsiqarkuVar.getParameters();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((ah.btonecajqb) it.next()).getName();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(name);
                    arrayList.add(name);
                }
                return new eh.iobyxmoadg(clsZoijcleaow, arrayList, eh.iobyxmoadg.EnumC0664iobyxmoadg.CALL_BY_NAME, eh.iobyxmoadg.zoijcleaow.KOTLIN, null, 16, null);
            }
            genericDeclarationOxmwwwfdhm = rlfsiqarkuVar.wypolnanlu().oxmwwwfdhm(((agtfadlqog.wkgbmnqykc) agtfadlqogVarLqeggnwhkg).zoijcleaow());
        } else {
            if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.iobyxmoadg) {
                List listWkgbmnqykc = ((agtfadlqog.iobyxmoadg) agtfadlqogVarLqeggnwhkg).wkgbmnqykc();
                Class clsZoijcleaow2 = rlfsiqarkuVar.wypolnanlu().zoijcleaow();
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                Iterator it2 = listWkgbmnqykc.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new eh.iobyxmoadg(clsZoijcleaow2, arrayList2, eh.iobyxmoadg.EnumC0664iobyxmoadg.CALL_BY_NAME, eh.iobyxmoadg.zoijcleaow.JAVA, listWkgbmnqykc);
            }
            genericDeclarationOxmwwwfdhm = null;
        }
        if (genericDeclarationOxmwwwfdhm instanceof Constructor) {
            dxjokdxxwwVarOkpsazkaxt = rlfsiqarkuVar.vipkmwdibw((Constructor) genericDeclarationOxmwwwfdhm, rlfsiqarkuVar.sopmlzcsov(), true);
        } else if (!(genericDeclarationOxmwwwfdhm instanceof Method)) {
            dxjokdxxwwVarOkpsazkaxt = null;
        } else if (rlfsiqarkuVar.sopmlzcsov().getAnnotations().lqeggnwhkg(n.btonecajqb()) != null) {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = rlfsiqarkuVar.sopmlzcsov().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow2).jlmebxxoox()) {
                dxjokdxxwwVarOkpsazkaxt = rlfsiqarkuVar.okpsazkaxt((Method) genericDeclarationOxmwwwfdhm);
            } else {
                dxjokdxxwwVarOkpsazkaxt = rlfsiqarkuVar.ikoacuggdj((Method) genericDeclarationOxmwwwfdhm);
            }
        } else {
            dxjokdxxwwVarOkpsazkaxt = rlfsiqarkuVar.okpsazkaxt((Method) genericDeclarationOxmwwwfdhm);
        }
        if (dxjokdxxwwVarOkpsazkaxt != null) {
            return eh.ojitshcjhn.dxjokdxxww(dxjokdxxwwVarOkpsazkaxt, rlfsiqarkuVar.sopmlzcsov(), true);
        }
        return null;
    }

    private final Object metgxyhuhe() {
        return eh.ojitshcjhn.nufgyqmvbu(this.f28323zynmafqrjb, sopmlzcsov());
    }

    private final eh.dxjokdxxww.nufgyqmvbu okpsazkaxt(Method method) {
        if (ntlheqmsrt()) {
            return new eh.dxjokdxxww.nufgyqmvbu.ppxfxbqfkf(method, uwvvkdfqfp(method) ? this.f28323zynmafqrjb : metgxyhuhe());
        }
        return new eh.dxjokdxxww.nufgyqmvbu.lqeggnwhkg(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eh.nufgyqmvbu ribwqtqdhb(rlfsiqarku rlfsiqarkuVar) {
        Object objWkgbmnqykc;
        eh.dxjokdxxww dxjokdxxwwVarIkoacuggdj;
        agtfadlqog agtfadlqogVarLqeggnwhkg = j.f28254iobyxmoadg.lqeggnwhkg(rlfsiqarkuVar.sopmlzcsov());
        if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.wkgbmnqykc) {
            if (rlfsiqarkuVar.mbcevpiqjq()) {
                Class clsZoijcleaow = rlfsiqarkuVar.wypolnanlu().zoijcleaow();
                List parameters = rlfsiqarkuVar.getParameters();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((ah.btonecajqb) it.next()).getName();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(name);
                    arrayList.add(name);
                }
                return new eh.iobyxmoadg(clsZoijcleaow, arrayList, eh.iobyxmoadg.EnumC0664iobyxmoadg.POSITIONAL_CALL, eh.iobyxmoadg.zoijcleaow.KOTLIN, null, 16, null);
            }
            objWkgbmnqykc = rlfsiqarkuVar.wypolnanlu().rgvfuqvkyq(((agtfadlqog.wkgbmnqykc) agtfadlqogVarLqeggnwhkg).zoijcleaow());
        } else if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.eablkybsjg) {
            jh.lereixgezr lereixgezrVarSopmlzcsov = rlfsiqarkuVar.sopmlzcsov();
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = lereixgezrVarSopmlzcsov.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
            if (li.gtknphoqwx.wkgbmnqykc(wflxmlrfwpVarZoijcleaow) && (lereixgezrVarSopmlzcsov instanceof jh.draadjrbmk) && ((jh.draadjrbmk) lereixgezrVarSopmlzcsov).vipkmwdibw()) {
                jh.lereixgezr lereixgezrVarSopmlzcsov2 = rlfsiqarkuVar.sopmlzcsov();
                ikoacuggdj ikoacuggdjVarWypolnanlu = rlfsiqarkuVar.wypolnanlu();
                String strZoijcleaow = ((agtfadlqog.eablkybsjg) agtfadlqogVarLqeggnwhkg).zoijcleaow();
                List listDxjokdxxww = rlfsiqarkuVar.sopmlzcsov().dxjokdxxww();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                return new eh.agtfadlqog.zoijcleaow(lereixgezrVarSopmlzcsov2, ikoacuggdjVarWypolnanlu, strZoijcleaow, listDxjokdxxww);
            }
            agtfadlqog.eablkybsjg eablkybsjgVar = (agtfadlqog.eablkybsjg) agtfadlqogVarLqeggnwhkg;
            objWkgbmnqykc = rlfsiqarkuVar.wypolnanlu().pmvmpeiblj(eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.zoijcleaow());
        } else if (agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.ppxfxbqfkf) {
            objWkgbmnqykc = ((agtfadlqog.ppxfxbqfkf) agtfadlqogVarLqeggnwhkg).zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.zoijcleaow)) {
                if (!(agtfadlqogVarLqeggnwhkg instanceof agtfadlqog.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                List listWkgbmnqykc = ((agtfadlqog.iobyxmoadg) agtfadlqogVarLqeggnwhkg).wkgbmnqykc();
                Class clsZoijcleaow2 = rlfsiqarkuVar.wypolnanlu().zoijcleaow();
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                Iterator it2 = listWkgbmnqykc.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new eh.iobyxmoadg(clsZoijcleaow2, arrayList2, eh.iobyxmoadg.EnumC0664iobyxmoadg.POSITIONAL_CALL, eh.iobyxmoadg.zoijcleaow.JAVA, listWkgbmnqykc);
            }
            objWkgbmnqykc = ((agtfadlqog.zoijcleaow) agtfadlqogVarLqeggnwhkg).wkgbmnqykc();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objWkgbmnqykc instanceof Constructor) {
            dxjokdxxwwVarIkoacuggdj = rlfsiqarkuVar.vipkmwdibw((Constructor) objWkgbmnqykc, rlfsiqarkuVar.sopmlzcsov(), false);
        } else {
            if (!(objWkgbmnqykc instanceof Method)) {
                throw new c("Could not compute caller for function: " + rlfsiqarkuVar.sopmlzcsov() + " (member = " + objWkgbmnqykc + ')');
            }
            Method method = (Method) objWkgbmnqykc;
            if (Modifier.isStatic(method.getModifiers())) {
                dxjokdxxwwVarIkoacuggdj = rlfsiqarkuVar.sopmlzcsov().getAnnotations().lqeggnwhkg(n.btonecajqb()) != null ? rlfsiqarkuVar.ikoacuggdj(method) : rlfsiqarkuVar.okpsazkaxt(method);
            } else {
                dxjokdxxwwVarIkoacuggdj = rlfsiqarkuVar.jhduphickx(method);
            }
        }
        return eh.ojitshcjhn.btonecajqb(dxjokdxxwwVarIkoacuggdj, rlfsiqarkuVar.sopmlzcsov(), false, 2, null);
    }

    private final boolean uwvvkdfqfp(Method method) {
        zi.kegysxyocb type;
        jh.vipkmwdibw vipkmwdibwVarHcddaimhww = sopmlzcsov().hcddaimhww();
        if (vipkmwdibwVarHcddaimhww != null && (type = vipkmwdibwVarHcddaimhww.getType()) != null && li.gtknphoqwx.ppxfxbqfkf(type)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) hg.agtfadlqog.ydmasvzmpa(parameterTypes);
            if (cls != null && cls.isInterface()) {
                return true;
            }
        }
        return false;
    }

    private final eh.dxjokdxxww vipkmwdibw(Constructor constructor, jh.lereixgezr lereixgezrVar, boolean z13) {
        if (z13 || !qi.zoijcleaow.gxszxtbevo(lereixgezrVar)) {
            return ntlheqmsrt() ? new eh.dxjokdxxww.ppxfxbqfkf(constructor, metgxyhuhe()) : new eh.dxjokdxxww.eablkybsjg(constructor);
        }
        return ntlheqmsrt() ? new eh.dxjokdxxww.iobyxmoadg(constructor, metgxyhuhe()) : new eh.dxjokdxxww.zoijcleaow(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.lereixgezr xrmfcynszj(rlfsiqarku rlfsiqarkuVar, String str) {
        return rlfsiqarkuVar.wypolnanlu().esjtqupxsv(str, rlfsiqarkuVar.f28321pmvmpeiblj);
    }

    @Override // dh.pmvmpeiblj
    public eh.nufgyqmvbu dsvhmnatus() {
        return (eh.nufgyqmvbu) this.f28318cdpycssgdh.getValue();
    }

    @Override // tg.zdlpuopuiu
    public Object dxjokdxxww(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return draadjrbmk.iobyxmoadg.lqeggnwhkg(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean equals(Object obj) {
        rlfsiqarku rlfsiqarkuVarPpxfxbqfkf = n.ppxfxbqfkf(obj);
        return rlfsiqarkuVarPpxfxbqfkf != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wypolnanlu(), rlfsiqarkuVarPpxfxbqfkf.wypolnanlu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getName(), rlfsiqarkuVarPpxfxbqfkf.getName()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28321pmvmpeiblj, rlfsiqarkuVarPpxfxbqfkf.f28321pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28323zynmafqrjb, rlfsiqarkuVarPpxfxbqfkf.f28323zynmafqrjb);
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return eh.btonecajqb.iobyxmoadg(dsvhmnatus());
    }

    @Override // ah.ppxfxbqfkf
    public String getName() {
        String strZoijcleaow = sopmlzcsov().getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        return strZoijcleaow;
    }

    public int hashCode() {
        return (((wypolnanlu().hashCode() * 31) + getName().hashCode()) * 31) + this.f28321pmvmpeiblj.hashCode();
    }

    @Override // tg.iobyxmoadg
    public Object invoke() {
        return draadjrbmk.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // ah.lqeggnwhkg
    public boolean isExternal() {
        return sopmlzcsov().isExternal();
    }

    @Override // ah.lqeggnwhkg
    public boolean isInfix() {
        return sopmlzcsov().isInfix();
    }

    @Override // ah.lqeggnwhkg
    public boolean isInline() {
        return sopmlzcsov().isInline();
    }

    @Override // ah.lqeggnwhkg
    public boolean isOperator() {
        return sopmlzcsov().isOperator();
    }

    @Override // ah.ppxfxbqfkf
    public boolean isSuspend() {
        return sopmlzcsov().isSuspend();
    }

    @Override // dh.pmvmpeiblj
    public boolean ntlheqmsrt() {
        return this.f28323zynmafqrjb != kotlin.jvm.internal.gxszxtbevo.NO_RECEIVER;
    }

    @Override // dh.pmvmpeiblj
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public jh.lereixgezr sopmlzcsov() {
        Object objZoijcleaow = this.f28319istkbnxepw.zoijcleaow(this, f28317iozdgvuglv[0]);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
        return (jh.lereixgezr) objZoijcleaow;
    }

    @Override // dh.pmvmpeiblj
    public eh.nufgyqmvbu stevsuqkhv() {
        return (eh.nufgyqmvbu) this.f28322yadqdtsiqt.getValue();
    }

    public String toString() {
        return i.f28226iobyxmoadg.gxszxtbevo(sopmlzcsov());
    }

    @Override // dh.pmvmpeiblj
    public ikoacuggdj wypolnanlu() {
        return this.f28320lereixgezr;
    }

    @Override // tg.draadjrbmk
    public Object invoke(Object obj) {
        return draadjrbmk.iobyxmoadg.zoijcleaow(this, obj);
    }

    private rlfsiqarku(ikoacuggdj ikoacuggdjVar, String str, String str2, jh.lereixgezr lereixgezrVar, Object obj) {
        this.f28320lereixgezr = ikoacuggdjVar;
        this.f28321pmvmpeiblj = str2;
        this.f28323zynmafqrjb = obj;
        this.f28319istkbnxepw = e.zoijcleaow(lereixgezrVar, new jztzpxfvev(this, str));
        gg.ojitshcjhn ojitshcjhnVar = gg.ojitshcjhn.PUBLICATION;
        this.f28318cdpycssgdh = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new xrmfcynszj(this));
        this.f28322yadqdtsiqt = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new metgxyhuhe(this));
    }

    @Override // tg.rgvfuqvkyq
    public Object invoke(Object obj, Object obj2) {
        return draadjrbmk.iobyxmoadg.ppxfxbqfkf(this, obj, obj2);
    }

    @Override // tg.vdvldrhtss
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return draadjrbmk.iobyxmoadg.wkgbmnqykc(this, obj, obj2, obj3);
    }

    @Override // tg.oxmwwwfdhm
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return draadjrbmk.iobyxmoadg.eablkybsjg(this, obj, obj2, obj3, obj4);
    }

    @Override // tg.kcexrzcfyt
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return draadjrbmk.iobyxmoadg.gxszxtbevo(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rlfsiqarku(ikoacuggdj container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rlfsiqarku(ikoacuggdj container, jh.lereixgezr descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        String strZoijcleaow = descriptor.getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        this(container, strZoijcleaow, j.f28254iobyxmoadg.lqeggnwhkg(descriptor).iobyxmoadg(), descriptor, null, 16, null);
    }
}
