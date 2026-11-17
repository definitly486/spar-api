package fk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uawqvzlxes {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Map f34240iobyxmoadg = yfnezrywwk.dxjokdxxww();

    public static final dk.gxszxtbevo iobyxmoadg(String serialName, dk.eablkybsjg kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        ppxfxbqfkf(serialName);
        return new roivzttewh(serialName, kind);
    }

    private static final void ppxfxbqfkf(String str) {
        for (bk.zoijcleaow zoijcleaowVar : f34240iobyxmoadg.values()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, zoijcleaowVar.iobyxmoadg().nufgyqmvbu())) {
                throw new IllegalArgumentException(mj.kcexrzcfyt.btonecajqb("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaowVar.getClass()).jyumaefscl() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final bk.zoijcleaow zoijcleaow(ah.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        return (bk.zoijcleaow) f34240iobyxmoadg.get(wkgbmnqykcVar);
    }
}
