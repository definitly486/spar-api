package dh;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fyldjkxazc extends pmvmpeiblj implements ah.gtknphoqwx {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final zoijcleaow f28202iozdgvuglv = new zoijcleaow(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final Object f28203lmojexxdyd = new Object();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gg.gtknphoqwx f28204cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f28205istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ikoacuggdj f28206lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f28207pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final e.iobyxmoadg f28208yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f28209zynmafqrjb;

    public static abstract class iobyxmoadg extends pmvmpeiblj implements ah.lqeggnwhkg, ah.gtknphoqwx.iobyxmoadg {
        /* JADX INFO: renamed from: crxdokpmqz */
        public abstract fyldjkxazc iobyxmoadg();

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
            return iobyxmoadg().ntlheqmsrt();
        }

        public abstract jh.sopmlzcsov sopmlzcsov();

        @Override // dh.pmvmpeiblj
        public eh.nufgyqmvbu stevsuqkhv() {
            return null;
        }

        @Override // dh.pmvmpeiblj
        public ikoacuggdj wypolnanlu() {
            return iobyxmoadg().wypolnanlu();
        }
    }

    public static abstract class ppxfxbqfkf extends iobyxmoadg implements ah.gtknphoqwx.zoijcleaow {

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f28210zynmafqrjb = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ppxfxbqfkf.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final e.iobyxmoadg f28211lereixgezr = e.ppxfxbqfkf(new ipoelvxyzq(this));

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final gg.gtknphoqwx f28212pmvmpeiblj = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new grlcpdaxtj(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh.jlmebxxoox jhduphickx(ppxfxbqfkf ppxfxbqfkfVar) {
            jh.jlmebxxoox jlmebxxooxVarWkgbmnqykc = ppxfxbqfkfVar.iobyxmoadg().sopmlzcsov().wkgbmnqykc();
            if (jlmebxxooxVarWkgbmnqykc != null) {
                return jlmebxxooxVarWkgbmnqykc;
            }
            mh.jpowsppfya jpowsppfyaVarWkgbmnqykc = li.nufgyqmvbu.wkgbmnqykc(ppxfxbqfkfVar.iobyxmoadg().sopmlzcsov(), kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jpowsppfyaVarWkgbmnqykc, "createDefaultGetter(...)");
            return jpowsppfyaVarWkgbmnqykc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eh.nufgyqmvbu vipkmwdibw(ppxfxbqfkf ppxfxbqfkfVar) {
            return jrbgnlbqoe.zoijcleaow(ppxfxbqfkfVar, true);
        }

        @Override // dh.pmvmpeiblj
        public eh.nufgyqmvbu dsvhmnatus() {
            return (eh.nufgyqmvbu) this.f28212pmvmpeiblj.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), ((ppxfxbqfkf) obj).iobyxmoadg());
        }

        @Override // ah.ppxfxbqfkf
        public String getName() {
            return "<get-" + iobyxmoadg().getName() + '>';
        }

        public int hashCode() {
            return iobyxmoadg().hashCode();
        }

        @Override // dh.fyldjkxazc.iobyxmoadg
        /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public jh.jlmebxxoox sopmlzcsov() {
            Object objZoijcleaow = this.f28211lereixgezr.zoijcleaow(this, f28210zynmafqrjb[0]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (jh.jlmebxxoox) objZoijcleaow;
        }

        public String toString() {
            return "getter of " + iobyxmoadg();
        }
    }

    public static abstract class wkgbmnqykc extends iobyxmoadg implements ah.nufgyqmvbu.iobyxmoadg {

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f28213zynmafqrjb = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(wkgbmnqykc.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final e.iobyxmoadg f28214lereixgezr = e.ppxfxbqfkf(new mhtqkkgtqm(this));

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final gg.gtknphoqwx f28215pmvmpeiblj = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new ixidwrxhsl(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh.ribwqtqdhb jhduphickx(wkgbmnqykc wkgbmnqykcVar) {
            jh.ribwqtqdhb ribwqtqdhbVarNufgyqmvbu = wkgbmnqykcVar.iobyxmoadg().sopmlzcsov().nufgyqmvbu();
            if (ribwqtqdhbVarNufgyqmvbu != null) {
                return ribwqtqdhbVarNufgyqmvbu;
            }
            jh.crxdokpmqz crxdokpmqzVarSopmlzcsov = wkgbmnqykcVar.iobyxmoadg().sopmlzcsov();
            kh.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = kh.nufgyqmvbu.f55413nufgyqmvbu;
            mh.hkdspvbjdz hkdspvbjdzVarEablkybsjg = li.nufgyqmvbu.eablkybsjg(crxdokpmqzVarSopmlzcsov, iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.zoijcleaow());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(hkdspvbjdzVarEablkybsjg, "createDefaultSetter(...)");
            return hkdspvbjdzVarEablkybsjg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eh.nufgyqmvbu vipkmwdibw(wkgbmnqykc wkgbmnqykcVar) {
            return jrbgnlbqoe.zoijcleaow(wkgbmnqykcVar, false);
        }

        @Override // dh.pmvmpeiblj
        public eh.nufgyqmvbu dsvhmnatus() {
            return (eh.nufgyqmvbu) this.f28215pmvmpeiblj.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), ((wkgbmnqykc) obj).iobyxmoadg());
        }

        @Override // ah.ppxfxbqfkf
        public String getName() {
            return "<set-" + iobyxmoadg().getName() + '>';
        }

        public int hashCode() {
            return iobyxmoadg().hashCode();
        }

        @Override // dh.fyldjkxazc.iobyxmoadg
        /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
        public jh.ribwqtqdhb sopmlzcsov() {
            Object objZoijcleaow = this.f28214lereixgezr.zoijcleaow(this, f28213zynmafqrjb[0]);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
            return (jh.ribwqtqdhb) objZoijcleaow;
        }

        public String toString() {
            return "setter of " + iobyxmoadg();
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    private fyldjkxazc(ikoacuggdj ikoacuggdjVar, String str, String str2, jh.crxdokpmqz crxdokpmqzVar, Object obj) {
        this.f28206lereixgezr = ikoacuggdjVar;
        this.f28207pmvmpeiblj = str;
        this.f28209zynmafqrjb = str2;
        this.f28205istkbnxepw = obj;
        this.f28204cdpycssgdh = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new fiwbwshyhd(this));
        e.iobyxmoadg iobyxmoadgVarZoijcleaow = e.zoijcleaow(crxdokpmqzVar, new ageimvtcrz(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, "lazySoft(...)");
        this.f28208yadqdtsiqt = iobyxmoadgVarZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field crxdokpmqz(fyldjkxazc fyldjkxazcVar) {
        Class<?> enclosingClass;
        rgvfuqvkyq rgvfuqvkyqVarGxszxtbevo = j.f28254iobyxmoadg.gxszxtbevo(fyldjkxazcVar.sopmlzcsov());
        if (!(rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.ppxfxbqfkf)) {
            if (rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.iobyxmoadg) {
                return ((rgvfuqvkyq.iobyxmoadg) rgvfuqvkyqVarGxszxtbevo).zoijcleaow();
            }
            if ((rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.zoijcleaow) || (rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.wkgbmnqykc)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar = (rgvfuqvkyq.ppxfxbqfkf) rgvfuqvkyqVarGxszxtbevo;
        jh.crxdokpmqz crxdokpmqzVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        hi.wkgbmnqykc.iobyxmoadg iobyxmoadgVarWkgbmnqykc = hi.dxjokdxxww.wkgbmnqykc(hi.dxjokdxxww.f40413iobyxmoadg, ppxfxbqfkfVar.eablkybsjg(), ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar.lqeggnwhkg(), false, 8, null);
        if (iobyxmoadgVarWkgbmnqykc == null) {
            return null;
        }
        if (sh.ojitshcjhn.eablkybsjg(crxdokpmqzVarZoijcleaow) || hi.dxjokdxxww.gxszxtbevo(ppxfxbqfkfVar.eablkybsjg())) {
            enclosingClass = fyldjkxazcVar.wypolnanlu().zoijcleaow().getEnclosingClass();
        } else {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = crxdokpmqzVarZoijcleaow.zoijcleaow();
            enclosingClass = wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg ? n.vdvldrhtss((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow) : fyldjkxazcVar.wypolnanlu().zoijcleaow();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(iobyxmoadgVarWkgbmnqykc.eablkybsjg());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.crxdokpmqz sopmlzcsov(fyldjkxazc fyldjkxazcVar) {
        return fyldjkxazcVar.wypolnanlu().zynmafqrjb(fyldjkxazcVar.getName(), fyldjkxazcVar.f28209zynmafqrjb);
    }

    @Override // dh.pmvmpeiblj
    public eh.nufgyqmvbu dsvhmnatus() {
        return wkgbmnqykc().dsvhmnatus();
    }

    public boolean equals(Object obj) {
        fyldjkxazc fyldjkxazcVarWkgbmnqykc = n.wkgbmnqykc(obj);
        return fyldjkxazcVarWkgbmnqykc != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wypolnanlu(), fyldjkxazcVarWkgbmnqykc.wypolnanlu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getName(), fyldjkxazcVarWkgbmnqykc.getName()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28209zynmafqrjb, fyldjkxazcVarWkgbmnqykc.f28209zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28205istkbnxepw, fyldjkxazcVarWkgbmnqykc.f28205istkbnxepw);
    }

    @Override // ah.ppxfxbqfkf
    public String getName() {
        return this.f28207pmvmpeiblj;
    }

    public int hashCode() {
        return (((wypolnanlu().hashCode() * 31) + getName().hashCode()) * 31) + this.f28209zynmafqrjb.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object ikoacuggdj(Member member, Object obj, Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj3 = f28203lmojexxdyd;
            if ((obj == obj3 || obj2 == obj3) && sopmlzcsov().hkdspvbjdz() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objJhduphickx = ntlheqmsrt() ? jhduphickx() : obj;
            if (objJhduphickx == obj3) {
                objJhduphickx = null;
            }
            if (!ntlheqmsrt()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(ch.iobyxmoadg.iobyxmoadg(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objJhduphickx);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objJhduphickx == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cls, "get(...)");
                    objJhduphickx = n.lqeggnwhkg(cls);
                }
                return method.invoke(null, objJhduphickx);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cls2, "get(...)");
                obj = n.lqeggnwhkg(cls2);
            }
            return method2.invoke(null, objJhduphickx, obj);
        } catch (IllegalAccessException e13) {
            throw new IllegalPropertyDelegateAccessException(e13);
        }
    }

    @Override // ah.ppxfxbqfkf
    public boolean isSuspend() {
        return false;
    }

    public final Object jhduphickx() {
        return eh.ojitshcjhn.nufgyqmvbu(this.f28205istkbnxepw, sopmlzcsov());
    }

    /* JADX INFO: renamed from: jztzpxfvev */
    public abstract ppxfxbqfkf wkgbmnqykc();

    public final String metgxyhuhe() {
        return this.f28209zynmafqrjb;
    }

    @Override // dh.pmvmpeiblj
    public boolean ntlheqmsrt() {
        return this.f28205istkbnxepw != kotlin.jvm.internal.gxszxtbevo.NO_RECEIVER;
    }

    @Override // dh.pmvmpeiblj
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public jh.crxdokpmqz sopmlzcsov() {
        Object objInvoke = this.f28208yadqdtsiqt.invoke();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (jh.crxdokpmqz) objInvoke;
    }

    @Override // dh.pmvmpeiblj
    public eh.nufgyqmvbu stevsuqkhv() {
        return wkgbmnqykc().stevsuqkhv();
    }

    public String toString() {
        return i.f28226iobyxmoadg.gtknphoqwx(sopmlzcsov());
    }

    protected final Member vipkmwdibw() {
        if (!sopmlzcsov().zynmafqrjb()) {
            return null;
        }
        rgvfuqvkyq rgvfuqvkyqVarGxszxtbevo = j.f28254iobyxmoadg.gxszxtbevo(sopmlzcsov());
        if (rgvfuqvkyqVarGxszxtbevo instanceof rgvfuqvkyq.ppxfxbqfkf) {
            rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar = (rgvfuqvkyq.ppxfxbqfkf) rgvfuqvkyqVarGxszxtbevo;
            if (ppxfxbqfkfVar.gxszxtbevo().ylkuphrtab()) {
                gi.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarIstkbnxepw = ppxfxbqfkfVar.gxszxtbevo().istkbnxepw();
                if (!ppxfxbqfkfVarIstkbnxepw.istkbnxepw() || !ppxfxbqfkfVarIstkbnxepw.zynmafqrjb()) {
                    return null;
                }
                return wypolnanlu().pmvmpeiblj(ppxfxbqfkfVar.wkgbmnqykc().getString(ppxfxbqfkfVarIstkbnxepw.pmvmpeiblj()), ppxfxbqfkfVar.wkgbmnqykc().getString(ppxfxbqfkfVarIstkbnxepw.lereixgezr()));
            }
        }
        return xrmfcynszj();
    }

    @Override // dh.pmvmpeiblj
    public ikoacuggdj wypolnanlu() {
        return this.f28206lereixgezr;
    }

    public final Field xrmfcynszj() {
        return (Field) this.f28204cdpycssgdh.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fyldjkxazc(ikoacuggdj container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fyldjkxazc(ikoacuggdj container, jh.crxdokpmqz descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        String strZoijcleaow = descriptor.getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        this(container, strZoijcleaow, j.f28254iobyxmoadg.gxszxtbevo(descriptor).iobyxmoadg(), descriptor, kotlin.jvm.internal.gxszxtbevo.NO_RECEIVER);
    }
}
