package bi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iozdgvuglv f16272iobyxmoadg = new iozdgvuglv();

    private iozdgvuglv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence gtknphoqwx(String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return f16272iobyxmoadg.ppxfxbqfkf(it);
    }

    private final String ppxfxbqfkf(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final String btonecajqb(String name, List parameters, String ret) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ret, "ret");
        return name + '(' + hg.jyumaefscl.iwxlajgraz(parameters, "", null, null, 0, null, yadqdtsiqt.f16343zdlpuopuiu, 30, null) + ')' + ppxfxbqfkf(ret);
    }

    public final String draadjrbmk(String internalName, String jvmDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(internalName, "internalName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public final String dxjokdxxww(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return "java/util/" + name;
    }

    public final Set eablkybsjg(String name, String... signatures) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signatures, "signatures");
        return wkgbmnqykc(nufgyqmvbu(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set gxszxtbevo(String name, String... signatures) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signatures, "signatures");
        return wkgbmnqykc(dxjokdxxww(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String lqeggnwhkg(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return "java/util/function/" + name;
    }

    public final String nufgyqmvbu(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return "java/lang/" + name;
    }

    public final Set wkgbmnqykc(String internalName, String... signatures) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(internalName, "internalName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final String[] zoijcleaow(String... signatures) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
