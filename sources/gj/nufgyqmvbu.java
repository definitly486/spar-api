package gj;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gxszxtbevo[] f37564eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ii.gxszxtbevo f37565iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Collection f37566ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f37567wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final mj.rgvfuqvkyq f37568zoijcleaow;

    static final class iobyxmoadg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f37569zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(jh.lereixgezr lereixgezrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lereixgezrVar, "<this>");
            return null;
        }
    }

    static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f37570zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(jh.lereixgezr lereixgezrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lereixgezrVar, "<this>");
            return null;
        }
    }

    static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f37571zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(jh.lereixgezr lereixgezrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lereixgezrVar, "<this>");
            return null;
        }
    }

    private nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar, mj.rgvfuqvkyq rgvfuqvkyqVar, Collection collection, tg.draadjrbmk draadjrbmkVar, gxszxtbevo... gxszxtbevoVarArr) {
        this.f37565iobyxmoadg = gxszxtbevoVar;
        this.f37568zoijcleaow = rgvfuqvkyqVar;
        this.f37566ppxfxbqfkf = collection;
        this.f37567wkgbmnqykc = draadjrbmkVar;
        this.f37564eablkybsjg = gxszxtbevoVarArr;
    }

    public final lqeggnwhkg iobyxmoadg(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        for (gxszxtbevo gxszxtbevoVar : this.f37564eablkybsjg) {
            String strZoijcleaow = gxszxtbevoVar.zoijcleaow(functionDescriptor);
            if (strZoijcleaow != null) {
                return new lqeggnwhkg.zoijcleaow(strZoijcleaow);
            }
        }
        String str = (String) this.f37567wkgbmnqykc.invoke(functionDescriptor);
        return str != null ? new lqeggnwhkg.zoijcleaow(str) : lqeggnwhkg.ppxfxbqfkf.f37562zoijcleaow;
    }

    public final boolean zoijcleaow(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        if (this.f37565iobyxmoadg != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(functionDescriptor.getName(), this.f37565iobyxmoadg)) {
            return false;
        }
        if (this.f37568zoijcleaow != null) {
            String strZoijcleaow = functionDescriptor.getName().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            if (!this.f37568zoijcleaow.ojitshcjhn(strZoijcleaow)) {
                return false;
            }
        }
        Collection collection = this.f37566ppxfxbqfkf;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar, gxszxtbevo[] gxszxtbevoVarArr, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVar, gxszxtbevoVarArr, (i13 & 4) != 0 ? iobyxmoadg.f37569zdlpuopuiu : draadjrbmkVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(ii.gxszxtbevo name, gxszxtbevo[] checks, tg.draadjrbmk additionalChecks) {
        this(name, (mj.rgvfuqvkyq) null, (Collection) null, additionalChecks, (gxszxtbevo[]) Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checks, "checks");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ nufgyqmvbu(mj.rgvfuqvkyq rgvfuqvkyqVar, gxszxtbevo[] gxszxtbevoVarArr, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(rgvfuqvkyqVar, gxszxtbevoVarArr, (i13 & 4) != 0 ? zoijcleaow.f37571zdlpuopuiu : draadjrbmkVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(mj.rgvfuqvkyq regex, gxszxtbevo[] checks, tg.draadjrbmk additionalChecks) {
        this((ii.gxszxtbevo) null, regex, (Collection) null, additionalChecks, (gxszxtbevo[]) Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(regex, "regex");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checks, "checks");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ nufgyqmvbu(Collection collection, gxszxtbevo[] gxszxtbevoVarArr, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(collection, gxszxtbevoVarArr, (i13 & 4) != 0 ? ppxfxbqfkf.f37570zdlpuopuiu : draadjrbmkVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(Collection nameList, gxszxtbevo[] checks, tg.draadjrbmk additionalChecks) {
        this((ii.gxszxtbevo) null, (mj.rgvfuqvkyq) null, nameList, additionalChecks, (gxszxtbevo[]) Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameList, "nameList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checks, "checks");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalChecks, "additionalChecks");
    }
}
