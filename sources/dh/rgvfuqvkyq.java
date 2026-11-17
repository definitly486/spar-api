package dh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq {

    public static final class iobyxmoadg extends rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Field f28304iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Field field) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(field, "field");
            this.f28304iobyxmoadg = field;
        }

        @Override // dh.rgvfuqvkyq
        public String iobyxmoadg() {
            StringBuilder sb3 = new StringBuilder();
            String name = this.f28304iobyxmoadg.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            sb3.append(sh.wwaezpbzkn.zoijcleaow(name));
            sb3.append("()");
            Class<?> type = this.f28304iobyxmoadg.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            sb3.append(ph.gxszxtbevo.gxszxtbevo(type));
            return sb3.toString();
        }

        public final Field zoijcleaow() {
            return this.f28304iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends rgvfuqvkyq {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final fi.lqeggnwhkg f28305eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String f28306gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jh.crxdokpmqz f28307iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final gi.iobyxmoadg.wkgbmnqykc f28308ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final fi.ppxfxbqfkf f28309wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final di.agtfadlqog f28310zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(jh.crxdokpmqz descriptor, di.agtfadlqog proto, gi.iobyxmoadg.wkgbmnqykc signature, fi.ppxfxbqfkf nameResolver, fi.lqeggnwhkg typeTable) {
            String str;
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
            this.f28307iobyxmoadg = descriptor;
            this.f28310zoijcleaow = proto;
            this.f28308ppxfxbqfkf = signature;
            this.f28309wkgbmnqykc = nameResolver;
            this.f28305eablkybsjg = typeTable;
            if (signature.hcddaimhww()) {
                str = nameResolver.getString(signature.yadqdtsiqt().pmvmpeiblj()) + nameResolver.getString(signature.yadqdtsiqt().lereixgezr());
            } else {
                hi.wkgbmnqykc.iobyxmoadg iobyxmoadgVarWkgbmnqykc = hi.dxjokdxxww.wkgbmnqykc(hi.dxjokdxxww.f40413iobyxmoadg, proto, nameResolver, typeTable, false, 8, null);
                if (iobyxmoadgVarWkgbmnqykc == null) {
                    throw new c("No field signature for property: " + descriptor);
                }
                String strZoijcleaow = iobyxmoadgVarWkgbmnqykc.zoijcleaow();
                str = sh.wwaezpbzkn.zoijcleaow(strZoijcleaow) + ppxfxbqfkf() + "()" + iobyxmoadgVarWkgbmnqykc.ppxfxbqfkf();
            }
            this.f28306gxszxtbevo = str;
        }

        private final String ppxfxbqfkf() {
            String string;
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = this.f28307iobyxmoadg.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28307iobyxmoadg.getVisibility(), jh.zdlpuopuiu.f51365wkgbmnqykc) && (wflxmlrfwpVarZoijcleaow instanceof xi.wflxmlrfwp)) {
                di.ppxfxbqfkf ppxfxbqfkfVarH = ((xi.wflxmlrfwp) wflxmlrfwpVarZoijcleaow).h();
                kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo classModuleName = gi.iobyxmoadg.f37410dxjokdxxww;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(classModuleName, "classModuleName");
                Integer num = (Integer) fi.eablkybsjg.iobyxmoadg(ppxfxbqfkfVarH, classModuleName);
                if (num == null || (string = this.f28309wkgbmnqykc.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + ii.lqeggnwhkg.zoijcleaow(string);
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28307iobyxmoadg.getVisibility(), jh.zdlpuopuiu.f51357iobyxmoadg) || !(wflxmlrfwpVarZoijcleaow instanceof jh.hkdspvbjdz)) {
                return "";
            }
            jh.crxdokpmqz crxdokpmqzVar = this.f28307iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(crxdokpmqzVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            xi.kcexrzcfyt kcexrzcfytVarPkzmftpjix = ((xi.cllcsxoeiz) crxdokpmqzVar).pkzmftpjix();
            if (!(kcexrzcfytVarPkzmftpjix instanceof bi.oxmwwwfdhm)) {
                return "";
            }
            bi.oxmwwwfdhm oxmwwwfdhmVar = (bi.oxmwwwfdhm) kcexrzcfytVarPkzmftpjix;
            if (oxmwwwfdhmVar.gxszxtbevo() == null) {
                return "";
            }
            return '$' + oxmwwwfdhmVar.nufgyqmvbu().zoijcleaow();
        }

        public final di.agtfadlqog eablkybsjg() {
            return this.f28310zoijcleaow;
        }

        public final gi.iobyxmoadg.wkgbmnqykc gxszxtbevo() {
            return this.f28308ppxfxbqfkf;
        }

        @Override // dh.rgvfuqvkyq
        public String iobyxmoadg() {
            return this.f28306gxszxtbevo;
        }

        public final fi.lqeggnwhkg lqeggnwhkg() {
            return this.f28305eablkybsjg;
        }

        public final fi.ppxfxbqfkf wkgbmnqykc() {
            return this.f28309wkgbmnqykc;
        }

        public final jh.crxdokpmqz zoijcleaow() {
            return this.f28307iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final agtfadlqog.eablkybsjg f28311iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final agtfadlqog.eablkybsjg f28312zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(agtfadlqog.eablkybsjg getterSignature, agtfadlqog.eablkybsjg eablkybsjgVar) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getterSignature, "getterSignature");
            this.f28311iobyxmoadg = getterSignature;
            this.f28312zoijcleaow = eablkybsjgVar;
        }

        @Override // dh.rgvfuqvkyq
        public String iobyxmoadg() {
            return this.f28311iobyxmoadg.iobyxmoadg();
        }

        public final agtfadlqog.eablkybsjg ppxfxbqfkf() {
            return this.f28312zoijcleaow;
        }

        public final agtfadlqog.eablkybsjg zoijcleaow() {
            return this.f28311iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f28313iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f28314zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Method getterMethod, Method method) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getterMethod, "getterMethod");
            this.f28313iobyxmoadg = getterMethod;
            this.f28314zoijcleaow = method;
        }

        @Override // dh.rgvfuqvkyq
        public String iobyxmoadg() {
            return l.wkgbmnqykc(this.f28313iobyxmoadg);
        }

        public final Method ppxfxbqfkf() {
            return this.f28314zoijcleaow;
        }

        public final Method zoijcleaow() {
            return this.f28313iobyxmoadg;
        }
    }

    public /* synthetic */ rgvfuqvkyq(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String iobyxmoadg();

    private rgvfuqvkyq() {
    }
}
