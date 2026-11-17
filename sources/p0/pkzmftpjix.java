package p0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f75269eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f75270gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f75271iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f75272ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f75273wkgbmnqykc = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private rgvfuqvkyq f75274zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public pkzmftpjix(String str) {
        this.f75271iobyxmoadg = str;
    }

    public final char iobyxmoadg(int i13) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f75274zoijcleaow;
        if (rgvfuqvkyqVar != null && i13 >= this.f75272ppxfxbqfkf) {
            int iEablkybsjg = rgvfuqvkyqVar.eablkybsjg();
            int i14 = this.f75272ppxfxbqfkf;
            return i13 < iEablkybsjg + i14 ? rgvfuqvkyqVar.wkgbmnqykc(i13 - i14) : this.f75271iobyxmoadg.charAt(i13 - ((iEablkybsjg - this.f75273wkgbmnqykc) + i14));
        }
        return this.f75271iobyxmoadg.charAt(i13);
    }

    public final void ppxfxbqfkf(int i13, int i14, String str) {
        if (!(i13 <= i14)) {
            q0.iobyxmoadg.iobyxmoadg("start index must be less than or equal to end index: " + i13 + " > " + i14);
        }
        if (!(i13 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("start must be non-negative, but was " + i13);
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f75274zoijcleaow;
        if (rgvfuqvkyqVar != null) {
            int i15 = this.f75272ppxfxbqfkf;
            int i16 = i13 - i15;
            int i17 = i14 - i15;
            if (i16 >= 0 && i17 <= rgvfuqvkyqVar.eablkybsjg()) {
                rgvfuqvkyqVar.lqeggnwhkg(i16, i17, str);
                return;
            }
            this.f75271iobyxmoadg = toString();
            this.f75274zoijcleaow = null;
            this.f75272ppxfxbqfkf = -1;
            this.f75273wkgbmnqykc = -1;
            ppxfxbqfkf(i13, i14, str);
            return;
        }
        int iMax = Math.max(KotlinVersion.MAX_COMPONENT_VALUE, str.length() + UserVerificationMethods.USER_VERIFY_PATTERN);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i13, 64);
        int iMin2 = Math.min(this.f75271iobyxmoadg.length() - i14, 64);
        int i18 = i13 - iMin;
        oxmwwwfdhm.iobyxmoadg(this.f75271iobyxmoadg, cArr, 0, i18, i13);
        int i19 = iMax - iMin2;
        int i23 = iMin2 + i14;
        oxmwwwfdhm.iobyxmoadg(this.f75271iobyxmoadg, cArr, i19, i14, i23);
        vdvldrhtss.zoijcleaow(str, cArr, iMin);
        this.f75274zoijcleaow = new rgvfuqvkyq(cArr, iMin + str.length(), i19);
        this.f75272ppxfxbqfkf = i18;
        this.f75273wkgbmnqykc = i23;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String toString() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f75274zoijcleaow;
        if (rgvfuqvkyqVar == null) {
            return this.f75271iobyxmoadg;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) this.f75271iobyxmoadg, 0, this.f75272ppxfxbqfkf);
        rgvfuqvkyqVar.iobyxmoadg(sb3);
        String str = this.f75271iobyxmoadg;
        sb3.append((CharSequence) str, this.f75273wkgbmnqykc, str.length());
        return sb3.toString();
    }

    public final int zoijcleaow() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f75274zoijcleaow;
        return rgvfuqvkyqVar == null ? this.f75271iobyxmoadg.length() : (this.f75271iobyxmoadg.length() - (this.f75273wkgbmnqykc - this.f75272ppxfxbqfkf)) + rgvfuqvkyqVar.eablkybsjg();
    }
}
