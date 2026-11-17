package gk;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ah.wkgbmnqykc f37735iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f37736zoijcleaow;

    public nufgyqmvbu(ah.wkgbmnqykc baseClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        this.f37735iobyxmoadg = baseClass;
        this.f37736zoijcleaow = dk.wflxmlrfwp.nufgyqmvbu("JsonContentPolymorphicSerializer<" + baseClass.jyumaefscl() + '>', dk.wkgbmnqykc.zoijcleaow.f29103iobyxmoadg, new dk.gxszxtbevo[0], null, 8, null);
    }

    private final Void lqeggnwhkg(ah.wkgbmnqykc wkgbmnqykcVar, ah.wkgbmnqykc wkgbmnqykcVar2) {
        String strJyumaefscl = wkgbmnqykcVar.jyumaefscl();
        if (strJyumaefscl == null) {
            strJyumaefscl = String.valueOf(wkgbmnqykcVar);
        }
        throw new SerializationException("Class '" + strJyumaefscl + "' is not registered for polymorphic serialization " + ("in the scope of '" + wkgbmnqykcVar2.jyumaefscl() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    protected abstract bk.iobyxmoadg gxszxtbevo(btonecajqb btonecajqbVar);

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f37736zoijcleaow;
    }

    @Override // bk.agtfadlqog
    public final void wkgbmnqykc(ek.gxszxtbevo encoder, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        bk.agtfadlqog agtfadlqogVarEablkybsjg = encoder.iobyxmoadg().eablkybsjg(this.f37735iobyxmoadg, value);
        if (agtfadlqogVarEablkybsjg == null && (agtfadlqogVarEablkybsjg = bk.ojitshcjhn.ppxfxbqfkf(cllcsxoeiz.zoijcleaow(value.getClass()))) == null) {
            lqeggnwhkg(cllcsxoeiz.zoijcleaow(value.getClass()), this.f37735iobyxmoadg);
            throw new KotlinNothingValueException();
        }
        ((bk.zoijcleaow) agtfadlqogVarEablkybsjg).wkgbmnqykc(encoder, value);
    }

    @Override // bk.iobyxmoadg
    public final Object zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(decoder);
        btonecajqb btonecajqbVarLqeggnwhkg = dxjokdxxwwVarWkgbmnqykc.lqeggnwhkg();
        bk.iobyxmoadg iobyxmoadgVarGxszxtbevo = gxszxtbevo(btonecajqbVarLqeggnwhkg);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarGxszxtbevo, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return dxjokdxxwwVarWkgbmnqykc.wkgbmnqykc().wkgbmnqykc((bk.zoijcleaow) iobyxmoadgVarGxszxtbevo, btonecajqbVarLqeggnwhkg);
    }
}
