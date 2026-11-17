package ik;

import androidx.appcompat.app.yggfygwlhe;
import bk.agtfadlqog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f44591eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f44592gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f44593iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f44594ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f44595wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Map f44596zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z13) {
        super(null);
        zdlpuopuiu.btonecajqb(class2ContextualFactory, "class2ContextualFactory");
        zdlpuopuiu.btonecajqb(polyBase2Serializers, "polyBase2Serializers");
        zdlpuopuiu.btonecajqb(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        zdlpuopuiu.btonecajqb(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        zdlpuopuiu.btonecajqb(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f44593iobyxmoadg = class2ContextualFactory;
        this.f44596zoijcleaow = polyBase2Serializers;
        this.f44594ppxfxbqfkf = polyBase2DefaultSerializerProvider;
        this.f44595wkgbmnqykc = polyBase2NamedSerializers;
        this.f44591eablkybsjg = polyBase2DefaultDeserializerProvider;
        this.f44592gxszxtbevo = z13;
    }

    @Override // ik.zoijcleaow
    public agtfadlqog eablkybsjg(ah.wkgbmnqykc baseClass, Object value) {
        zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        zdlpuopuiu.btonecajqb(value, "value");
        if (!baseClass.zdlpuopuiu(value)) {
            return null;
        }
        Map map = (Map) this.f44596zoijcleaow.get(baseClass);
        bk.zoijcleaow zoijcleaowVar = map != null ? (bk.zoijcleaow) map.get(cllcsxoeiz.zoijcleaow(value.getClass())) : null;
        if (zoijcleaowVar == null) {
            zoijcleaowVar = null;
        }
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        Object obj = this.f44594ppxfxbqfkf.get(baseClass);
        draadjrbmk draadjrbmkVar = mbcevpiqjq.gtknphoqwx(obj, 1) ? (draadjrbmk) obj : null;
        if (draadjrbmkVar != null) {
            return (agtfadlqog) draadjrbmkVar.invoke(value);
        }
        return null;
    }

    @Override // ik.zoijcleaow
    public void iobyxmoadg(wkgbmnqykc collector) {
        zdlpuopuiu.btonecajqb(collector, "collector");
        Iterator it = this.f44593iobyxmoadg.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            yggfygwlhe.iobyxmoadg(entry.getValue());
            throw new NoWhenBranchMatchedException();
        }
        for (Map.Entry entry2 : this.f44596zoijcleaow.entrySet()) {
            ah.wkgbmnqykc wkgbmnqykcVar = (ah.wkgbmnqykc) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                ah.wkgbmnqykc wkgbmnqykcVar2 = (ah.wkgbmnqykc) entry3.getKey();
                bk.zoijcleaow zoijcleaowVar = (bk.zoijcleaow) entry3.getValue();
                zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.ppxfxbqfkf(wkgbmnqykcVar, wkgbmnqykcVar2, zoijcleaowVar);
            }
        }
        for (Map.Entry entry4 : this.f44594ppxfxbqfkf.entrySet()) {
            ah.wkgbmnqykc wkgbmnqykcVar3 = (ah.wkgbmnqykc) entry4.getKey();
            draadjrbmk draadjrbmkVar = (draadjrbmk) entry4.getValue();
            zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            zdlpuopuiu.nufgyqmvbu(draadjrbmkVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.iobyxmoadg(wkgbmnqykcVar3, (draadjrbmk) mbcevpiqjq.eablkybsjg(draadjrbmkVar, 1));
        }
        for (Map.Entry entry5 : this.f44591eablkybsjg.entrySet()) {
            ah.wkgbmnqykc wkgbmnqykcVar4 = (ah.wkgbmnqykc) entry5.getKey();
            draadjrbmk draadjrbmkVar2 = (draadjrbmk) entry5.getValue();
            zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            zdlpuopuiu.nufgyqmvbu(draadjrbmkVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.zoijcleaow(wkgbmnqykcVar4, (draadjrbmk) mbcevpiqjq.eablkybsjg(draadjrbmkVar2, 1));
        }
    }

    @Override // ik.zoijcleaow
    public bk.iobyxmoadg wkgbmnqykc(ah.wkgbmnqykc baseClass, String str) {
        zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        Map map = (Map) this.f44595wkgbmnqykc.get(baseClass);
        bk.zoijcleaow zoijcleaowVar = map != null ? (bk.zoijcleaow) map.get(str) : null;
        if (zoijcleaowVar == null) {
            zoijcleaowVar = null;
        }
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        Object obj = this.f44591eablkybsjg.get(baseClass);
        draadjrbmk draadjrbmkVar = mbcevpiqjq.gtknphoqwx(obj, 1) ? (draadjrbmk) obj : null;
        if (draadjrbmkVar != null) {
            return (bk.iobyxmoadg) draadjrbmkVar.invoke(str);
        }
        return null;
    }

    @Override // ik.zoijcleaow
    public bk.zoijcleaow zoijcleaow(ah.wkgbmnqykc kClass, List typeArgumentsSerializers) {
        zdlpuopuiu.btonecajqb(kClass, "kClass");
        zdlpuopuiu.btonecajqb(typeArgumentsSerializers, "typeArgumentsSerializers");
        yggfygwlhe.iobyxmoadg(this.f44593iobyxmoadg.get(kClass));
        return null;
    }
}
